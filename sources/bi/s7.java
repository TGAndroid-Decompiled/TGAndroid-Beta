package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gi0;
public final class s7 implements RequestDelegate {
    public final int f3701a;
    public final int f3702b;
    public final long f3703c;
    public final Object d;
    public final Object f3704e;

    public s7(int i10, di.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f3701a = 4;
        this.f3702b = i10;
        this.d = dVar;
        this.f3704e = f3Var;
        this.f3703c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3701a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u7((u8) this.d, tLObject, this.f3702b, (String) this.f3704e, this.f3703c, 0));
                return;
            case 1:
                long j3 = this.f3703c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f3702b, (MessageObject) this.f3704e, j3, tLObject, tL_error);
                return;
            case 2:
                long j10 = this.f3703c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f3702b, (Utilities.Callback) this.f3704e, j10, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f3703c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f3702b, (TLRPC.TL_help_promoData) this.f3704e, j11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new fi.p3(tLObject, this.f3702b, (di.d) this.d, (org.telegram.ui.ActionBar.f3) this.f3704e, this.f3703c, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new fi.p3((gi0) this.d, tL_error, tLObject, this.f3703c, this.f3702b, (TLRPC.Chat) this.f3704e, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new u7((zh.o) this.d, (zh.n) this.f3704e, this.f3702b, tLObject, this.f3703c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.j7((di.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.f3704e, this.f3702b, this.f3703c, 14));
                return;
        }
    }

    public s7(Object obj, int i10, Object obj2, long j3, int i11) {
        this.f3701a = i11;
        this.d = obj;
        this.f3702b = i10;
        this.f3704e = obj2;
        this.f3703c = j3;
    }

    public s7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f3701a = i11;
        this.d = obj;
        this.f3704e = obj2;
        this.f3702b = i10;
        this.f3703c = j3;
    }

    public s7(gi0 gi0Var, long j3, int i10, TLRPC.Chat chat) {
        this.f3701a = 5;
        this.d = gi0Var;
        this.f3703c = j3;
        this.f3702b = i10;
        this.f3704e = chat;
    }
}
