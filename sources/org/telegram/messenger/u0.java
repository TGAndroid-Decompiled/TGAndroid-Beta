package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gi0;
public final class u0 implements RequestDelegate {
    public final int f16445a;
    public final int f16446b;
    public final long f16447c;
    public final Object d;
    public final Object e;

    public u0(int i10, bi.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j3) {
        this.f16445a = 3;
        this.f16446b = i10;
        this.d = dVar;
        this.e = h3Var;
        this.f16447c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16445a) {
            case 0:
                long j3 = this.f16447c;
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.f16446b, (MessageObject) this.e, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f16447c;
                ((MediaDataController) this.d).lambda$loadStickers$101(this.f16446b, (Utilities.Callback) this.e, j10, tLObject, tL_error);
                return;
            case 2:
                long j11 = this.f16447c;
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.f16446b, (TLRPC.TL_help_promoData) this.e, j11, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new di.s3(tLObject, this.f16446b, (bi.d) this.d, (org.telegram.ui.ActionBar.h3) this.e, this.f16447c, tL_error));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new di.s3((gi0) this.d, tL_error, tLObject, this.f16447c, this.f16446b, (TLRPC.Chat) this.e, 4));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new k0((xh.p) this.d, (xh.o) this.e, this.f16446b, tLObject, this.f16447c, 10));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new p7((bi.d) this.d, (org.telegram.ui.ActionBar.h3[]) this.e, this.f16446b, this.f16447c, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k0((zh.i5) this.d, tLObject, this.f16446b, (String) this.e, this.f16447c, 12));
                return;
        }
    }

    public u0(Object obj, int i10, Object obj2, long j3, int i11) {
        this.f16445a = i11;
        this.d = obj;
        this.f16446b = i10;
        this.e = obj2;
        this.f16447c = j3;
    }

    public u0(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f16445a = i11;
        this.d = obj;
        this.e = obj2;
        this.f16446b = i10;
        this.f16447c = j3;
    }

    public u0(gi0 gi0Var, long j3, int i10, TLRPC.Chat chat) {
        this.f16445a = 4;
        this.d = gi0Var;
        this.f16447c = j3;
        this.f16446b = i10;
        this.e = chat;
    }
}
