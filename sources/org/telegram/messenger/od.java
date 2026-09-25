package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17193a;
    public final MessagesController f17194b;
    public final int f17195c;
    public final int d;
    public final int e;
    public final int f17196f;
    public final int f17197g;
    public final long h;
    public final long f17198i;
    public final int f17199j;
    public final int f17200k;
    public final int f17201l;
    public final int f17202m;
    public final int f17203n;
    public final long f17204o;
    public final int f17205p;
    public final boolean f17206q;
    public final int f17207r;
    public final boolean f17208s;
    public final boolean f17209t;
    public final TLObject f17210u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17193a = 1;
        this.f17194b = messagesController;
        this.f17195c = i10;
        this.d = i11;
        this.e = i12;
        this.f17196f = i13;
        this.f17197g = i14;
        this.h = j3;
        this.f17198i = j10;
        this.f17199j = i15;
        this.f17200k = i16;
        this.f17201l = i17;
        this.f17202m = i18;
        this.f17203n = i19;
        this.f17204o = j11;
        this.f17205p = i20;
        this.f17206q = z10;
        this.f17207r = i21;
        this.f17208s = z11;
        this.f17209t = z12;
        this.f17210u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17193a) {
            case 0:
                this.f17194b.lambda$loadMessagesInternal$178(this.h, this.f17195c, this.d, this.e, this.f17198i, this.f17196f, this.f17197g, this.f17199j, this.f17200k, this.f17201l, this.f17202m, this.f17203n, this.f17204o, this.f17205p, this.f17206q, this.f17207r, this.f17208s, this.f17209t, (TLRPC.TL_messages_getSavedHistory) this.f17210u, tLObject, tL_error);
                return;
            case 1:
                this.f17194b.lambda$loadMessagesInternal$180(this.f17195c, this.d, this.e, this.f17196f, this.f17197g, this.h, this.f17198i, this.f17199j, this.f17200k, this.f17201l, this.f17202m, this.f17203n, this.f17204o, this.f17205p, this.f17206q, this.f17207r, this.f17208s, this.f17209t, (TLRPC.TL_messages_getReplies) this.f17210u, tLObject, tL_error);
                return;
            default:
                this.f17194b.lambda$loadMessagesInternal$185(this.h, this.f17195c, this.d, this.e, this.f17198i, this.f17196f, this.f17197g, this.f17199j, this.f17200k, this.f17201l, this.f17202m, this.f17203n, this.f17204o, this.f17205p, this.f17206q, this.f17207r, this.f17208s, this.f17209t, (TLRPC.TL_messages_getHistory) this.f17210u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17193a = i22;
        this.f17194b = messagesController;
        this.h = j3;
        this.f17195c = i10;
        this.d = i11;
        this.e = i12;
        this.f17198i = j10;
        this.f17196f = i13;
        this.f17197g = i14;
        this.f17199j = i15;
        this.f17200k = i16;
        this.f17201l = i17;
        this.f17202m = i18;
        this.f17203n = i19;
        this.f17204o = j11;
        this.f17205p = i20;
        this.f17206q = z10;
        this.f17207r = i21;
        this.f17208s = z11;
        this.f17209t = z12;
        this.f17210u = tLObject;
    }
}
