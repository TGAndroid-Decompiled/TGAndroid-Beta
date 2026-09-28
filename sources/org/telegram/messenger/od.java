package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17198a;
    public final MessagesController f17199b;
    public final int f17200c;
    public final int d;
    public final int e;
    public final int f17201f;
    public final int f17202g;
    public final long h;
    public final long f17203i;
    public final int f17204j;
    public final int f17205k;
    public final int f17206l;
    public final int f17207m;
    public final int f17208n;
    public final long f17209o;
    public final int f17210p;
    public final boolean f17211q;
    public final int f17212r;
    public final boolean f17213s;
    public final boolean f17214t;
    public final TLObject f17215u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17198a = 1;
        this.f17199b = messagesController;
        this.f17200c = i10;
        this.d = i11;
        this.e = i12;
        this.f17201f = i13;
        this.f17202g = i14;
        this.h = j3;
        this.f17203i = j10;
        this.f17204j = i15;
        this.f17205k = i16;
        this.f17206l = i17;
        this.f17207m = i18;
        this.f17208n = i19;
        this.f17209o = j11;
        this.f17210p = i20;
        this.f17211q = z10;
        this.f17212r = i21;
        this.f17213s = z11;
        this.f17214t = z12;
        this.f17215u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17198a) {
            case 0:
                this.f17199b.lambda$loadMessagesInternal$178(this.h, this.f17200c, this.d, this.e, this.f17203i, this.f17201f, this.f17202g, this.f17204j, this.f17205k, this.f17206l, this.f17207m, this.f17208n, this.f17209o, this.f17210p, this.f17211q, this.f17212r, this.f17213s, this.f17214t, (TLRPC.TL_messages_getSavedHistory) this.f17215u, tLObject, tL_error);
                return;
            case 1:
                this.f17199b.lambda$loadMessagesInternal$180(this.f17200c, this.d, this.e, this.f17201f, this.f17202g, this.h, this.f17203i, this.f17204j, this.f17205k, this.f17206l, this.f17207m, this.f17208n, this.f17209o, this.f17210p, this.f17211q, this.f17212r, this.f17213s, this.f17214t, (TLRPC.TL_messages_getReplies) this.f17215u, tLObject, tL_error);
                return;
            default:
                this.f17199b.lambda$loadMessagesInternal$185(this.h, this.f17200c, this.d, this.e, this.f17203i, this.f17201f, this.f17202g, this.f17204j, this.f17205k, this.f17206l, this.f17207m, this.f17208n, this.f17209o, this.f17210p, this.f17211q, this.f17212r, this.f17213s, this.f17214t, (TLRPC.TL_messages_getHistory) this.f17215u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17198a = i22;
        this.f17199b = messagesController;
        this.h = j3;
        this.f17200c = i10;
        this.d = i11;
        this.e = i12;
        this.f17203i = j10;
        this.f17201f = i13;
        this.f17202g = i14;
        this.f17204j = i15;
        this.f17205k = i16;
        this.f17206l = i17;
        this.f17207m = i18;
        this.f17208n = i19;
        this.f17209o = j11;
        this.f17210p = i20;
        this.f17211q = z10;
        this.f17212r = i21;
        this.f17213s = z11;
        this.f17214t = z12;
        this.f17215u = tLObject;
    }
}
