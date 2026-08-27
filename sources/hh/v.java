package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rh0;

public final class v implements RequestDelegate {

    public final int f10184a;

    public final int f10185b;

    public final long f10186c;
    public final Object d;

    public final Object f10187e;

    public v(int i10, lh.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j10) {
        this.f10184a = 6;
        this.f10185b = i10;
        this.d = dVar;
        this.f10187e = e3Var;
        this.f10186c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10184a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gh.a0((c0) this.d, (b0) this.f10187e, this.f10185b, tLObject, this.f10186c, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new b9((lh.d) this.d, (org.telegram.ui.ActionBar.e3[]) this.f10187e, this.f10185b, this.f10186c, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gh.a0((jh.s6) this.d, tLObject, this.f10185b, (String) this.f10187e, this.f10186c, 3));
                break;
            case 3:
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f10185b, (MessageObject) this.f10187e, this.f10186c, tLObject, tL_error);
                break;
            case 4:
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f10185b, (Utilities.Callback) this.f10187e, this.f10186c, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f10185b, (TLRPC.TL_help_promoData) this.f10187e, this.f10186c, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new v6(tLObject, this.f10185b, (lh.d) this.d, (org.telegram.ui.ActionBar.e3) this.f10187e, this.f10186c, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new v6((rh0) this.d, tL_error, tLObject, this.f10186c, this.f10185b, (TLRPC.Chat) this.f10187e));
                break;
        }
    }

    public v(Object obj, int i10, Object obj2, long j10, int i11) {
        this.f10184a = i11;
        this.d = obj;
        this.f10185b = i10;
        this.f10187e = obj2;
        this.f10186c = j10;
    }

    public v(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f10184a = i11;
        this.d = obj;
        this.f10187e = obj2;
        this.f10185b = i10;
        this.f10186c = j10;
    }

    public v(rh0 rh0Var, long j10, int i10, TLRPC.Chat chat) {
        this.f10184a = 7;
        this.d = rh0Var;
        this.f10186c = j10;
        this.f10185b = i10;
        this.f10187e = chat;
    }
}
