package gh;

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
public final class v implements RequestDelegate {
    public final int f8992a;
    public final int f8993b;
    public final long f8994c;
    public final Object d;
    public final Object f8995e;

    public v(int i9, kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.f8992a = 6;
        this.f8993b = i9;
        this.d = dVar;
        this.f8995e = f3Var;
        this.f8994c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8992a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fh.c0((c0) this.d, (b0) this.f8995e, this.f8993b, tLObject, this.f8994c, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c9((kh.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.f8995e, this.f8993b, this.f8994c, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fh.c0((ih.v6) this.d, tLObject, this.f8993b, (String) this.f8995e, this.f8994c, 3));
                return;
            case 3:
                long j10 = this.f8994c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f8993b, (MessageObject) this.f8995e, j10, tLObject, tL_error);
                return;
            case 4:
                long j11 = this.f8994c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f8993b, (Utilities.Callback) this.f8995e, j11, tLObject, tL_error);
                return;
            case 5:
                long j12 = this.f8994c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f8993b, (TLRPC.TL_help_promoData) this.f8995e, j12, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new w6(tLObject, this.f8993b, (kh.d) this.d, (org.telegram.ui.ActionBar.f3) this.f8995e, this.f8994c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w6((ph0) this.d, tL_error, tLObject, this.f8994c, this.f8993b, (TLRPC.Chat) this.f8995e));
                return;
        }
    }

    public v(Object obj, int i9, Object obj2, long j10, int i10) {
        this.f8992a = i10;
        this.d = obj;
        this.f8993b = i9;
        this.f8995e = obj2;
        this.f8994c = j10;
    }

    public v(Object obj, Object obj2, int i9, long j10, int i10) {
        this.f8992a = i10;
        this.d = obj;
        this.f8995e = obj2;
        this.f8993b = i9;
        this.f8994c = j10;
    }

    public v(ph0 ph0Var, long j10, int i9, TLRPC.Chat chat) {
        this.f8992a = 7;
        this.d = ph0Var;
        this.f8994c = j10;
        this.f8993b = i9;
        this.f8995e = chat;
    }
}
