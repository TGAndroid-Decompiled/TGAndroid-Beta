package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oh0;
public final class u implements RequestDelegate {
    public final int f12870a;
    public final int f12871b;
    public final long f12872c;
    public final Object d;
    public final Object f12873e;

    public u(int i10, nh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.f12870a = 6;
        this.f12871b = i10;
        this.d = dVar;
        this.f12873e = f3Var;
        this.f12872c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12870a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ih.y((b0) this.d, (a0) this.f12873e, this.f12871b, tLObject, this.f12872c, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new x8((nh.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.f12873e, this.f12871b, this.f12872c, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ih.y((lh.s6) this.d, tLObject, this.f12871b, (String) this.f12873e, this.f12872c, 3));
                return;
            case 3:
                long j10 = this.f12872c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f12871b, (MessageObject) this.f12873e, j10, tLObject, tL_error);
                return;
            case 4:
                long j11 = this.f12872c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f12871b, (Utilities.Callback) this.f12873e, j11, tLObject, tL_error);
                return;
            case 5:
                long j12 = this.f12872c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f12871b, (TLRPC.TL_help_promoData) this.f12873e, j12, tLObject, tL_error);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new t6(tLObject, this.f12871b, (nh.d) this.d, (org.telegram.ui.ActionBar.f3) this.f12873e, this.f12872c, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t6((oh0) this.d, tL_error, tLObject, this.f12872c, this.f12871b, (TLRPC.Chat) this.f12873e));
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, long j10, int i11) {
        this.f12870a = i11;
        this.d = obj;
        this.f12871b = i10;
        this.f12873e = obj2;
        this.f12872c = j10;
    }

    public u(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f12870a = i11;
        this.d = obj;
        this.f12873e = obj2;
        this.f12871b = i10;
        this.f12872c = j10;
    }

    public u(oh0 oh0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f12870a = 7;
        this.d = oh0Var;
        this.f12872c = j10;
        this.f12871b = i10;
        this.f12873e = chat;
    }
}
