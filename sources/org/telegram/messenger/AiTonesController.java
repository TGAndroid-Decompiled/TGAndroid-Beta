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

    public AiTonesController(int i10) {
        this.currentAccount = i10;
    }

    public void lambda$request$0(TL_aicompose.Tones tones, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.requestedTime = System.currentTimeMillis();
        if (tones instanceof TL_aicompose.TL_tones) {
            MessagesController.getInstance(this.currentAccount).putUsers(tones.users, false);
            this.tones.clear();
            TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
            this.tones.addAll(tL_tones.tones);
            this.hash = tL_tones.hash;
            save();
            notifyUpdate();
        }
    }

    private void save() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.hash;
        tL_tones.tones.addAll(this.tones);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }

    public void add(TL_aicompose.AiComposeTone aiComposeTone) {
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            long j3 = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).f17409id;
            for (int i10 = 0; i10 < this.tones.size(); i10++) {
                if ((this.tones.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) this.tones.get(i10)).f17409id == j3) {
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
        for (int i10 = 0; i10 < this.tones.size(); i10++) {
            if ((this.tones.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) this.tones.get(i10)).f17409id == tL_aiComposeTone.f17409id) {
                this.tones.set(i10, tL_aiComposeTone);
                notifyUpdate();
                return;
            }
        }
    }

    public int getSavedTonesCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.tones.size(); i11++) {
            if (this.tones.get(i11) instanceof TL_aicompose.TL_aiComposeTone) {
                i10++;
            }
        }
        return i10;
    }

    public void invalidate() {
        this.requestedTime = 0L;
        if (this.open) {
            load();
        }
    }

    public boolean isLoading() {
        if (this.requestId >= 0) {
            return true;
        }
        return false;
    }

    public void load() {
        if (!this.loadedLocal) {
            this.loadedLocal = true;
            try {
                String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.hash = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        this.tones.clear();
                        this.tones.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
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
        if (this.requestId >= 0 || System.currentTimeMillis() - this.requestedTime < 1800000) {
            return;
        }
        TL_aicompose.getTones gettones = new TL_aicompose.getTones();
        gettones.hash = this.hash;
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(gettones, new Object(), new ue(this, 1));
    }

    public void unsave(TL_aicompose.AiComposeTone aiComposeTone) {
        remove(aiComposeTone);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        savetone.unsave = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savetone, null);
    }
}
