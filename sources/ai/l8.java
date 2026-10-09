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
public final class l8 implements RequestDelegate {
    public final int f1345a;
    public final int f1346b;
    public final long f1347c;
    public final Object d;
    public final Object f1348e;

    public l8(int i10, ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j3) {
        this.f1345a = 4;
        this.f1346b = i10;
        this.d = dVar;
        this.f1348e = f3Var;
        this.f1347c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1345a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n8((m9) this.d, tLObject, this.f1346b, (String) this.f1348e, this.f1347c, 0));
                return;
            case 1:
                long j3 = this.f1347c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f1346b, (MessageObject) this.f1348e, j3, tLObject, tL_error);
                return;
            case 2:
                long j10 = this.f1347c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f1346b, (Utilities.Callback) this.f1348e, j10, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f1347c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$166(this.f1346b, (TLRPC.TL_help_promoData) this.f1348e, j11, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ei.p3(tLObject, this.f1346b, (ci.d) this.d, (org.telegram.ui.ActionBar.f3) this.f1348e, this.f1347c, tL_error));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ei.p3((hi0) this.d, tL_error, tLObject, this.f1347c, this.f1346b, (TLRPC.Chat) this.f1348e, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n8((yh.o) this.d, (yh.n) this.f1348e, this.f1346b, tLObject, this.f1347c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.h7((ci.d) this.d, (org.telegram.ui.ActionBar.f3[]) this.f1348e, this.f1346b, this.f1347c, 18));
                return;
        }
    }

    public l8(Object obj, int i10, Object obj2, long j3, int i11) {
        this.f1345a = i11;
        this.d = obj;
        this.f1346b = i10;
        this.f1348e = obj2;
        this.f1347c = j3;
    }

    public l8(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f1345a = i11;
        this.d = obj;
        this.f1348e = obj2;
        this.f1346b = i10;
        this.f1347c = j3;
    }

    public l8(hi0 hi0Var, long j3, int i10, TLRPC.Chat chat) {
        this.f1345a = 5;
        this.d = hi0Var;
        this.f1347c = j3;
        this.f1346b = i10;
        this.f1348e = chat;
    }
}
