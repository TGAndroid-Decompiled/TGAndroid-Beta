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
import org.telegram.ui.hi0;
public final class j8 implements RequestDelegate {
    public final int f1057a;
    public final int f1058b;
    public final long f1059c;
    public final Object d;
    public final Object e;

    public j8(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f1057a = 4;
        this.f1058b = i10;
        this.d = dVar;
        this.e = f3Var;
        this.f1059c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1057a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l8((l9) this.d, tLObject, this.f1058b, (String) this.e, this.f1059c, 0));
                return;
            case 1:
                long j3 = this.f1059c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f1058b, (MessageObject) this.e, j3, tLObject, tL_error);
                return;
            case 2:
                long j10 = this.f1059c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f1058b, (Utilities.Callback) this.e, j10, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f1059c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f1058b, (TLRPC.TL_help_promoData) this.e, j11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ei.p3(tLObject, this.f1058b, (ci.d) this.d, (org.telegram.ui.ActionBar.f3) this.e, this.f1059c, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.p3((hi0) this.d, tL_error, tLObject, this.f1059c, this.f1058b, (TLRPC.Chat) this.e, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new l8((yh.o) this.d, (yh.n) this.e, this.f1058b, tLObject, this.f1059c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.j7((ci.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.e, this.f1058b, this.f1059c, 14));
                return;
        }
    }

    public j8(Object obj, int i10, Object obj2, long j3, int i11) {
        this.f1057a = i11;
        this.d = obj;
        this.f1058b = i10;
        this.e = obj2;
        this.f1059c = j3;
    }

    public j8(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f1057a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1058b = i10;
        this.f1059c = j3;
    }

    public j8(hi0 hi0Var, long j3, int i10, TLRPC.Chat chat) {
        this.f1057a = 5;
        this.d = hi0Var;
        this.f1059c = j3;
        this.f1058b = i10;
        this.e = chat;
    }
}
