package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17187a;
    public final MessagesController f17188b;
    public final int f17189c;
    public final int d;
    public final int e;
    public final int f17190f;
    public final int f17191g;
    public final long h;
    public final long f17192i;
    public final int f17193j;
    public final int f17194k;
    public final int f17195l;
    public final int f17196m;
    public final int f17197n;
    public final long f17198o;
    public final int f17199p;
    public final boolean f17200q;
    public final int f17201r;
    public final boolean f17202s;
    public final boolean f17203t;
    public final TLObject f17204u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17187a = 1;
        this.f17188b = messagesController;
        this.f17189c = i10;
        this.d = i11;
        this.e = i12;
        this.f17190f = i13;
        this.f17191g = i14;
        this.h = j3;
        this.f17192i = j10;
        this.f17193j = i15;
        this.f17194k = i16;
        this.f17195l = i17;
        this.f17196m = i18;
        this.f17197n = i19;
        this.f17198o = j11;
        this.f17199p = i20;
        this.f17200q = z10;
        this.f17201r = i21;
        this.f17202s = z11;
        this.f17203t = z12;
        this.f17204u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17187a) {
            case 0:
                this.f17188b.lambda$loadMessagesInternal$178(this.h, this.f17189c, this.d, this.e, this.f17192i, this.f17190f, this.f17191g, this.f17193j, this.f17194k, this.f17195l, this.f17196m, this.f17197n, this.f17198o, this.f17199p, this.f17200q, this.f17201r, this.f17202s, this.f17203t, (TLRPC.TL_messages_getSavedHistory) this.f17204u, tLObject, tL_error);
                return;
            case 1:
                this.f17188b.lambda$loadMessagesInternal$180(this.f17189c, this.d, this.e, this.f17190f, this.f17191g, this.h, this.f17192i, this.f17193j, this.f17194k, this.f17195l, this.f17196m, this.f17197n, this.f17198o, this.f17199p, this.f17200q, this.f17201r, this.f17202s, this.f17203t, (TLRPC.TL_messages_getReplies) this.f17204u, tLObject, tL_error);
                return;
            default:
                this.f17188b.lambda$loadMessagesInternal$185(this.h, this.f17189c, this.d, this.e, this.f17192i, this.f17190f, this.f17191g, this.f17193j, this.f17194k, this.f17195l, this.f17196m, this.f17197n, this.f17198o, this.f17199p, this.f17200q, this.f17201r, this.f17202s, this.f17203t, (TLRPC.TL_messages_getHistory) this.f17204u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17187a = i22;
        this.f17188b = messagesController;
        this.h = j3;
        this.f17189c = i10;
        this.d = i11;
        this.e = i12;
        this.f17192i = j10;
        this.f17190f = i13;
        this.f17191g = i14;
        this.f17193j = i15;
        this.f17194k = i16;
        this.f17195l = i17;
        this.f17196m = i18;
        this.f17197n = i19;
        this.f17198o = j11;
        this.f17199p = i20;
        this.f17200q = z10;
        this.f17201r = i21;
        this.f17202s = z11;
        this.f17203t = z12;
        this.f17204u = tLObject;
    }
}
