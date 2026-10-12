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
import org.telegram.ui.ii0;
public final class l8 implements RequestDelegate {
    public final int f1343a;
    public final int f1344b;
    public final long f1345c;
    public final Object d;
    public final Object f1346e;

    public l8(int i10, ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j3) {
        this.f1343a = 4;
        this.f1344b = i10;
        this.d = dVar;
        this.f1346e = e3Var;
        this.f1345c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1343a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n8((m9) this.d, tLObject, this.f1344b, (String) this.f1346e, this.f1345c, 0));
                return;
            case 1:
                long j3 = this.f1345c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f1344b, (MessageObject) this.f1346e, j3, tLObject, tL_error);
                return;
            case 2:
                long j10 = this.f1345c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f1344b, (Utilities.Callback) this.f1346e, j10, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f1345c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$166(this.f1344b, (TLRPC.TL_help_promoData) this.f1346e, j11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ei.p3(tLObject, this.f1344b, (ci.d) this.d, (org.telegram.ui.ActionBar.e3) this.f1346e, this.f1345c, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.p3((ii0) this.d, tL_error, tLObject, this.f1345c, this.f1344b, (TLRPC.Chat) this.f1346e, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n8((yh.o) this.d, (yh.n) this.f1346e, this.f1344b, tLObject, this.f1345c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.k7((ci.d) this.d, (org.telegram.ui.ActionBar.e3[]) this.f1346e, this.f1344b, this.f1345c, 18));
                return;
        }
    }

    public l8(Object obj, int i10, Object obj2, long j3, int i11) {
        this.f1343a = i11;
        this.d = obj;
        this.f1344b = i10;
        this.f1346e = obj2;
        this.f1345c = j3;
    }

    public l8(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f1343a = i11;
        this.d = obj;
        this.f1346e = obj2;
        this.f1344b = i10;
        this.f1345c = j3;
    }

    public l8(ii0 ii0Var, long j3, int i10, TLRPC.Chat chat) {
        this.f1343a = 5;
        this.d = ii0Var;
        this.f1345c = j3;
        this.f1344b = i10;
        this.f1346e = chat;
    }
}
