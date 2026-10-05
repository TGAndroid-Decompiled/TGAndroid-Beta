package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.di0;
public final class k8 implements RequestDelegate {
    public final int f1226a;
    public final int f1227b;
    public final long f1228c;
    public final Object d;
    public final Object f1229e;

    public k8(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f1226a = 4;
        this.f1227b = i10;
        this.d = dVar;
        this.f1229e = f3Var;
        this.f1228c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1226a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m8((l9) this.d, tLObject, this.f1227b, (String) this.f1229e, this.f1228c, 0));
                return;
            case 1:
                long j3 = this.f1228c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f1227b, (MessageObject) this.f1229e, j3, tLObject, tL_error);
                return;
            case 2:
                long j10 = this.f1228c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f1227b, (Utilities.Callback) this.f1229e, j10, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f1228c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f1227b, (TLRPC.TL_help_promoData) this.f1229e, j11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ei.q3(tLObject, this.f1227b, (ci.d) this.d, (org.telegram.ui.ActionBar.f3) this.f1229e, this.f1228c, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.q3((di0) this.d, tL_error, tLObject, this.f1228c, this.f1227b, (TLRPC.Chat) this.f1229e, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new m8((yh.p) this.d, (yh.o) this.f1229e, this.f1227b, tLObject, this.f1228c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.g7((ci.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.f1229e, this.f1227b, this.f1228c, 15));
                return;
        }
    }

    public k8(Object obj, int i10, Object obj2, long j3, int i11) {
        this.f1226a = i11;
        this.d = obj;
        this.f1227b = i10;
        this.f1229e = obj2;
        this.f1228c = j3;
    }

    public k8(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f1226a = i11;
        this.d = obj;
        this.f1229e = obj2;
        this.f1227b = i10;
        this.f1228c = j3;
    }

    public k8(di0 di0Var, long j3, int i10, TLRPC.Chat chat) {
        this.f1226a = 5;
        this.d = di0Var;
        this.f1228c = j3;
        this.f1227b = i10;
        this.f1229e = chat;
    }
}
