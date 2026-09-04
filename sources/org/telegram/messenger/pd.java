package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f18686a;
    public final MessagesController f18687b;
    public final int f18688c;
    public final int d;
    public final int f18689e;
    public final int f18690f;
    public final int f18691g;
    public final long h;
    public final long f18692i;
    public final int f18693j;
    public final int f18694k;
    public final int f18695l;
    public final int f18696m;
    public final int f18697n;
    public final long f18698o;
    public final int f18699p;
    public final boolean f18700q;
    public final int f18701r;
    public final boolean f18702s;
    public final boolean f18703t;
    public final TLObject f18704u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18686a = 1;
        this.f18687b = messagesController;
        this.f18688c = i10;
        this.d = i11;
        this.f18689e = i12;
        this.f18690f = i13;
        this.f18691g = i14;
        this.h = j3;
        this.f18692i = j10;
        this.f18693j = i15;
        this.f18694k = i16;
        this.f18695l = i17;
        this.f18696m = i18;
        this.f18697n = i19;
        this.f18698o = j11;
        this.f18699p = i20;
        this.f18700q = z10;
        this.f18701r = i21;
        this.f18702s = z11;
        this.f18703t = z12;
        this.f18704u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18686a) {
            case 0:
                this.f18687b.lambda$loadMessagesInternal$178(this.h, this.f18688c, this.d, this.f18689e, this.f18692i, this.f18690f, this.f18691g, this.f18693j, this.f18694k, this.f18695l, this.f18696m, this.f18697n, this.f18698o, this.f18699p, this.f18700q, this.f18701r, this.f18702s, this.f18703t, (TLRPC.TL_messages_getSavedHistory) this.f18704u, tLObject, tL_error);
                return;
            case 1:
                this.f18687b.lambda$loadMessagesInternal$180(this.f18688c, this.d, this.f18689e, this.f18690f, this.f18691g, this.h, this.f18692i, this.f18693j, this.f18694k, this.f18695l, this.f18696m, this.f18697n, this.f18698o, this.f18699p, this.f18700q, this.f18701r, this.f18702s, this.f18703t, (TLRPC.TL_messages_getReplies) this.f18704u, tLObject, tL_error);
                return;
            default:
                this.f18687b.lambda$loadMessagesInternal$185(this.h, this.f18688c, this.d, this.f18689e, this.f18692i, this.f18690f, this.f18691g, this.f18693j, this.f18694k, this.f18695l, this.f18696m, this.f18697n, this.f18698o, this.f18699p, this.f18700q, this.f18701r, this.f18702s, this.f18703t, (TLRPC.TL_messages_getHistory) this.f18704u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18686a = i22;
        this.f18687b = messagesController;
        this.h = j3;
        this.f18688c = i10;
        this.d = i11;
        this.f18689e = i12;
        this.f18692i = j10;
        this.f18690f = i13;
        this.f18691g = i14;
        this.f18693j = i15;
        this.f18694k = i16;
        this.f18695l = i17;
        this.f18696m = i18;
        this.f18697n = i19;
        this.f18698o = j11;
        this.f18699p = i20;
        this.f18700q = z10;
        this.f18701r = i21;
        this.f18702s = z11;
        this.f18703t = z12;
        this.f18704u = tLObject;
    }
}
