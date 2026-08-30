package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wh0;
public final class u implements RequestDelegate {
    public final int f13175a;
    public final int f13176b;
    public final long f13177c;
    public final Object d;
    public final Object e;

    public u(int i10, ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, long j10) {
        this.f13175a = 6;
        this.f13176b = i10;
        this.d = dVar;
        this.e = g3Var;
        this.f13177c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13175a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh.x((b0) this.d, (a0) this.e, this.f13176b, tLObject, this.f13177c, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new y8((ph.d) this.d, (org.telegram.ui.ActionBar.g3[]) this.e, this.f13176b, this.f13177c, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kh.x((nh.t6) this.d, tLObject, this.f13176b, (String) this.e, this.f13177c, 3));
                return;
            case 3:
                long j10 = this.f13177c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f13176b, (MessageObject) this.e, j10, tLObject, tL_error);
                return;
            case 4:
                long j11 = this.f13177c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f13176b, (Utilities.Callback) this.e, j11, tLObject, tL_error);
                return;
            case 5:
                long j12 = this.f13177c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f13176b, (TLRPC.TL_help_promoData) this.e, j12, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new u6(tLObject, this.f13176b, (ph.d) this.d, (org.telegram.ui.ActionBar.g3) this.e, this.f13177c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u6((wh0) this.d, tL_error, tLObject, this.f13177c, this.f13176b, (TLRPC.Chat) this.e));
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, long j10, int i11) {
        this.f13175a = i11;
        this.d = obj;
        this.f13176b = i10;
        this.e = obj2;
        this.f13177c = j10;
    }

    public u(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f13175a = i11;
        this.d = obj;
        this.e = obj2;
        this.f13176b = i10;
        this.f13177c = j10;
    }

    public u(wh0 wh0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f13175a = 7;
        this.d = wh0Var;
        this.f13177c = j10;
        this.f13176b = i10;
        this.e = chat;
    }
}
