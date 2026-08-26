package org.telegram.messenger;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

public final class AiTonesController {
    public final int currentAccount;
    public long hash;
    private boolean loadedLocal;
    public boolean open;
    public final ArrayList<TL_aicompose.AiComposeTone> tones = new ArrayList<>();
    private int requestId = -1;
    private long requestedTime = 0;

    public AiTonesController(int i) {
        this.currentAccount = i;
    }

    public void lambda$request$0(TL_aicompose.Tones tones, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.requestedTime = System.currentTimeMillis();
        if (!(tones instanceof TL_aicompose.TL_tones)) {
            boolean z = tones instanceof TL_aicompose.TL_tonesNotModified;
            return;
        }
        MessagesController.getInstance(this.currentAccount).putUsers(tones.users, false);
        this.tones.clear();
        TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
        this.tones.addAll(tL_tones.tones);
        this.hash = tL_tones.hash;
        save();
        notifyUpdate();
    }

    private void save() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.hash;
        tL_tones.tones.addAll(this.tones);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        AiTonesController$$ExternalSyntheticOutline0.m(this.currentAccount).putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }

    public void add(TL_aicompose.AiComposeTone aiComposeTone) {
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            long j = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id;
            for (int i = 0; i < this.tones.size(); i++) {
                if ((this.tones.get(i) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) this.tones.get(i)).id == j) {
                    return;
                }
            }
        }
        this.tones.add(0, aiComposeTone);
        save();
        notifyUpdate();
    }

    public void cancel() {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
    }

    public void edit(TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        for (int i = 0; i < this.tones.size(); i++) {
            if ((this.tones.get(i) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) this.tones.get(i)).id == tL_aiComposeTone.id) {
                this.tones.set(i, tL_aiComposeTone);
                notifyUpdate();
                return;
            }
        }
    }

    public int getSavedTonesCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.tones.size(); i2++) {
            if (this.tones.get(i2) instanceof TL_aicompose.TL_aiComposeTone) {
                i++;
            }
        }
        return i;
    }

    public void invalidate() {
        this.requestedTime = 0L;
        if (this.open) {
            load();
        }
    }

    public boolean isLoading() {
        return this.requestId >= 0;
    }

    public void load() {
        if (!this.loadedLocal) {
            this.loadedLocal = true;
            try {
                String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones tonesTLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (tonesTLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.hash = ((TL_aicompose.TL_tones) tonesTLdeserialize).hash;
                        this.tones.clear();
                        this.tones.addAll(((TL_aicompose.TL_tones) tonesTLdeserialize).tones);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        request();
    }

    public void notifyUpdate() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadedAiComposeTones, this);
    }

    public void remove(TL_aicompose.AiComposeTone aiComposeTone) {
        this.tones.remove(aiComposeTone);
        save();
        notifyUpdate();
    }

    public void request() {
        if (this.requestId < 0 && System.currentTimeMillis() - this.requestedTime >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.hash;
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(gettones, new AiTonesController$$ExternalSyntheticLambda0(), new AiTonesController$$ExternalSyntheticLambda1(this, 0));
        }
    }

    public void unsave(TL_aicompose.AiComposeTone aiComposeTone) {
        remove(aiComposeTone);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        savetone.unsave = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savetone, null);
    }
}
