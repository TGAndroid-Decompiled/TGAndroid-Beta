package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

public final class AiTonesController {
    public final int currentAccount;
    public long hash;
    public final ArrayList<TL_aicompose.AiComposeTone> tones = new ArrayList<>();
    private int requestId = -1;
    private long requestedTime = 0;

    private void save() {
    }

    public AiTonesController(int i) {
        this.currentAccount = i;
    }

    public void request() {
        if (this.requestId < 0 && System.currentTimeMillis() - this.requestedTime >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.hash;
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(gettones, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
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
            return;
        }
        boolean z = tones instanceof TL_aicompose.TL_tonesNotModified;
    }

    public void cancel() {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
    }

    public boolean isLoading() {
        return this.requestId >= 0;
    }

    public void notifyUpdate() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadedAiComposeTones, this);
    }

    public void load() {
        request();
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

    public void remove(TL_aicompose.AiComposeTone aiComposeTone) {
        this.tones.remove(aiComposeTone);
        notifyUpdate();
    }

    public void unsave(TL_aicompose.AiComposeTone aiComposeTone) {
        remove(aiComposeTone);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        savetone.unsave = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savetone, null);
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
        this.tones.add(aiComposeTone);
        notifyUpdate();
    }
}
