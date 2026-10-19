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
import org.telegram.ui.ph0;
public final class c0 implements RequestDelegate {
    public final int f1054a;
    public final int f1055b;
    public final long f1056c;
    public final Object d;
    public final Object e;

    public c0(int i10, ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.f1054a = 6;
        this.f1055b = i10;
        this.d = dVar;
        this.e = f3Var;
        this.f1056c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1054a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0((k0) this.d, (j0) this.e, this.f1055b, tLObject, this.f1056c, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xb((ei.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.e, this.f1055b, this.f1056c, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new g0((Object) ((ci.i7) this.d), tLObject, this.f1055b, (Object) ((String) this.e), this.f1056c, 2));
                return;
            case 3:
                long j10 = this.f1056c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f1055b, (MessageObject) this.e, j10, tLObject, tL_error);
                return;
            case 4:
                long j11 = this.f1056c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f1055b, (Utilities.Callback) this.e, j11, tLObject, tL_error);
                return;
            case 5:
                long j12 = this.f1056c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$166(this.f1055b, (TLRPC.TL_help_promoData) this.e, j12, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new e9(tLObject, this.f1055b, (ei.d) this.d, (org.telegram.ui.ActionBar.f3) this.e, this.f1056c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e9((ph0) this.d, tL_error, tLObject, this.f1056c, this.f1055b, (TLRPC.Chat) this.e));
                return;
        }
    }

    public c0(Object obj, int i10, Object obj2, long j10, int i11) {
        this.f1054a = i11;
        this.d = obj;
        this.f1055b = i10;
        this.e = obj2;
        this.f1056c = j10;
    }

    public c0(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f1054a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1055b = i10;
        this.f1056c = j10;
    }

    public c0(ph0 ph0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f1054a = 7;
        this.d = ph0Var;
        this.f1056c = j10;
        this.f1055b = i10;
        this.e = chat;
    }
}
