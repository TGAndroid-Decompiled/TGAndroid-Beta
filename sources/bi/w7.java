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
import org.telegram.ui.ki0;
public final class w7 implements RequestDelegate {
    public final int f3914a;
    public final int f3915b;
    public final long f3916c;
    public final Object d;
    public final Object e;

    public w7(int i10, di.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j10) {
        this.f3914a = 4;
        this.f3915b = i10;
        this.d = dVar;
        this.e = e3Var;
        this.f3916c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3914a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y7((x8) this.d, tLObject, this.f3915b, (String) this.e, this.f3916c, 0));
                return;
            case 1:
                long j10 = this.f3916c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f3915b, (MessageObject) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                long j11 = this.f3916c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f3915b, (Utilities.Callback) this.e, j11, tLObject, tL_error);
                return;
            case 3:
                long j12 = this.f3916c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$166(this.f3915b, (TLRPC.TL_help_promoData) this.e, j12, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new fi.p3(tLObject, this.f3915b, (di.d) this.d, (org.telegram.ui.ActionBar.e3) this.e, this.f3916c, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new fi.p3((ki0) this.d, tL_error, tLObject, this.f3916c, this.f3915b, (TLRPC.Chat) this.e, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new y7((zh.p) this.d, (zh.o) this.e, this.f3915b, tLObject, this.f3916c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.k7((di.d) this.d, (org.telegram.ui.ActionBar.e3[]) this.e, this.f3915b, this.f3916c, 18));
                return;
        }
    }

    public w7(Object obj, int i10, Object obj2, long j10, int i11) {
        this.f3914a = i11;
        this.d = obj;
        this.f3915b = i10;
        this.e = obj2;
        this.f3916c = j10;
    }

    public w7(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f3914a = i11;
        this.d = obj;
        this.e = obj2;
        this.f3915b = i10;
        this.f3916c = j10;
    }

    public w7(ki0 ki0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f3914a = 5;
        this.d = ki0Var;
        this.f3916c = j10;
        this.f3915b = i10;
        this.e = chat;
    }
}
