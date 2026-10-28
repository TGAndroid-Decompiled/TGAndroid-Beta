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
import org.telegram.ui.th0;
public final class d0 implements RequestDelegate {
    public final int f4476a;
    public final int f4477b;
    public final long f4478c;
    public final Object d;
    public final Object e;

    public d0(Object obj, int i10, Object obj2, long j10, int i11) {
        this.f4476a = i11;
        this.d = obj;
        this.f4477b = i10;
        this.e = obj2;
        this.f4478c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4476a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0((m0) this.d, (l0) this.e, this.f4477b, tLObject, this.f4478c, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new da((fi.d) this.d, (org.telegram.ui.ActionBar.k3[]) this.e, this.f4477b, this.f4478c, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new h0((Object) ((di.h7) this.d), tLObject, this.f4477b, (Object) ((String) this.e), this.f4478c, 2));
                return;
            case 3:
                long j10 = this.f4478c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f4477b, (MessageObject) this.e, j10, tLObject, tL_error);
                return;
            case 4:
                long j11 = this.f4478c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f4477b, (Utilities.Callback) this.e, j11, tLObject, tL_error);
                return;
            case 5:
                long j12 = this.f4478c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$166(this.f4477b, (TLRPC.TL_help_promoData) this.e, j12, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new a9((th0) this.d, tL_error, tLObject, this.f4478c, this.f4477b, (TLRPC.Chat) this.e));
                return;
        }
    }

    public d0(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f4476a = i11;
        this.d = obj;
        this.e = obj2;
        this.f4477b = i10;
        this.f4478c = j10;
    }

    public d0(th0 th0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f4476a = 6;
        this.d = th0Var;
        this.f4478c = j10;
        this.f4477b = i10;
        this.e = chat;
    }
}
