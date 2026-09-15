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
import org.telegram.ui.fi0;
public final class j8 implements RequestDelegate {
    public final int f1052a;
    public final int f1053b;
    public final long f1054c;
    public final Object d;
    public final Object e;

    public j8(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f1052a = 4;
        this.f1053b = i10;
        this.d = dVar;
        this.e = f3Var;
        this.f1054c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1052a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l8((l9) this.d, tLObject, this.f1053b, (String) this.e, this.f1054c, 0));
                return;
            case 1:
                long j3 = this.f1054c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f1053b, (MessageObject) this.e, j3, tLObject, tL_error);
                return;
            case 2:
                long j10 = this.f1054c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f1053b, (Utilities.Callback) this.e, j10, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f1054c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f1053b, (TLRPC.TL_help_promoData) this.e, j11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ei.p3(tLObject, this.f1053b, (ci.d) this.d, (org.telegram.ui.ActionBar.f3) this.e, this.f1054c, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.p3((fi0) this.d, tL_error, tLObject, this.f1054c, this.f1053b, (TLRPC.Chat) this.e, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new l8((yh.o) this.d, (yh.n) this.e, this.f1053b, tLObject, this.f1054c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.j7((ci.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.e, this.f1053b, this.f1054c, 14));
                return;
        }
    }

    public j8(Object obj, int i10, Object obj2, long j3, int i11) {
        this.f1052a = i11;
        this.d = obj;
        this.f1053b = i10;
        this.e = obj2;
        this.f1054c = j3;
    }

    public j8(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f1052a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1053b = i10;
        this.f1054c = j3;
    }

    public j8(fi0 fi0Var, long j3, int i10, TLRPC.Chat chat) {
        this.f1052a = 5;
        this.d = fi0Var;
        this.f1054c = j3;
        this.f1053b = i10;
        this.e = chat;
    }
}
