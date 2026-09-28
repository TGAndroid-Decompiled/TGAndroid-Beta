package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17197a;
    public final MessagesController f17198b;
    public final int f17199c;
    public final int d;
    public final int e;
    public final int f17200f;
    public final int f17201g;
    public final long h;
    public final long f17202i;
    public final int f17203j;
    public final int f17204k;
    public final int f17205l;
    public final int f17206m;
    public final int f17207n;
    public final long f17208o;
    public final int f17209p;
    public final boolean f17210q;
    public final int f17211r;
    public final boolean f17212s;
    public final boolean f17213t;
    public final TLObject f17214u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17197a = 1;
        this.f17198b = messagesController;
        this.f17199c = i10;
        this.d = i11;
        this.e = i12;
        this.f17200f = i13;
        this.f17201g = i14;
        this.h = j3;
        this.f17202i = j10;
        this.f17203j = i15;
        this.f17204k = i16;
        this.f17205l = i17;
        this.f17206m = i18;
        this.f17207n = i19;
        this.f17208o = j11;
        this.f17209p = i20;
        this.f17210q = z10;
        this.f17211r = i21;
        this.f17212s = z11;
        this.f17213t = z12;
        this.f17214u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17197a) {
            case 0:
                this.f17198b.lambda$loadMessagesInternal$178(this.h, this.f17199c, this.d, this.e, this.f17202i, this.f17200f, this.f17201g, this.f17203j, this.f17204k, this.f17205l, this.f17206m, this.f17207n, this.f17208o, this.f17209p, this.f17210q, this.f17211r, this.f17212s, this.f17213t, (TLRPC.TL_messages_getSavedHistory) this.f17214u, tLObject, tL_error);
                return;
            case 1:
                this.f17198b.lambda$loadMessagesInternal$180(this.f17199c, this.d, this.e, this.f17200f, this.f17201g, this.h, this.f17202i, this.f17203j, this.f17204k, this.f17205l, this.f17206m, this.f17207n, this.f17208o, this.f17209p, this.f17210q, this.f17211r, this.f17212s, this.f17213t, (TLRPC.TL_messages_getReplies) this.f17214u, tLObject, tL_error);
                return;
            default:
                this.f17198b.lambda$loadMessagesInternal$185(this.h, this.f17199c, this.d, this.e, this.f17202i, this.f17200f, this.f17201g, this.f17203j, this.f17204k, this.f17205l, this.f17206m, this.f17207n, this.f17208o, this.f17209p, this.f17210q, this.f17211r, this.f17212s, this.f17213t, (TLRPC.TL_messages_getHistory) this.f17214u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17197a = i22;
        this.f17198b = messagesController;
        this.h = j3;
        this.f17199c = i10;
        this.d = i11;
        this.e = i12;
        this.f17202i = j10;
        this.f17200f = i13;
        this.f17201g = i14;
        this.f17203j = i15;
        this.f17204k = i16;
        this.f17205l = i17;
        this.f17206m = i18;
        this.f17207n = i19;
        this.f17208o = j11;
        this.f17209p = i20;
        this.f17210q = z10;
        this.f17211r = i21;
        this.f17212s = z11;
        this.f17213t = z12;
        this.f17214u = tLObject;
    }
}
