package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xh0;
public final class t implements RequestDelegate {
    public final int f14773a;
    public final int f14774b;
    public final long f14775c;
    public final Object d;
    public final Object f14776e;

    public t(int i10, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j10) {
        this.f14773a = 6;
        this.f14774b = i10;
        this.d = dVar;
        this.f14776e = h3Var;
        this.f14775c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14773a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lh.x((a0) this.d, (z) this.f14776e, this.f14774b, tLObject, this.f14775c, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new y8((qh.d) this.d, (org.telegram.ui.ActionBar.h3[]) this.f14776e, this.f14774b, this.f14775c, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new lh.x((oh.t6) this.d, tLObject, this.f14774b, (String) this.f14776e, this.f14775c, 3));
                return;
            case 3:
                long j10 = this.f14775c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f14774b, (MessageObject) this.f14776e, j10, tLObject, tL_error);
                return;
            case 4:
                long j11 = this.f14775c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f14774b, (Utilities.Callback) this.f14776e, j11, tLObject, tL_error);
                return;
            case 5:
                long j12 = this.f14775c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f14774b, (TLRPC.TL_help_promoData) this.f14776e, j12, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new u6(tLObject, this.f14774b, (qh.d) this.d, (org.telegram.ui.ActionBar.h3) this.f14776e, this.f14775c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u6((xh0) this.d, tL_error, tLObject, this.f14775c, this.f14774b, (TLRPC.Chat) this.f14776e));
                return;
        }
    }

    public t(Object obj, int i10, Object obj2, long j10, int i11) {
        this.f14773a = i11;
        this.d = obj;
        this.f14774b = i10;
        this.f14776e = obj2;
        this.f14775c = j10;
    }

    public t(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f14773a = i11;
        this.d = obj;
        this.f14776e = obj2;
        this.f14774b = i10;
        this.f14775c = j10;
    }

    public t(xh0 xh0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f14773a = 7;
        this.d = xh0Var;
        this.f14775c = j10;
        this.f14774b = i10;
        this.f14776e = chat;
    }
}
