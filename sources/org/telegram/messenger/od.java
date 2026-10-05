package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18779a;
    public final MessagesController f18780b;
    public final int f18781c;
    public final int d;
    public final int f18782e;
    public final int f18783f;
    public final int f18784g;
    public final long h;
    public final long f18785i;
    public final int f18786j;
    public final int f18787k;
    public final int f18788l;
    public final int f18789m;
    public final int f18790n;
    public final long f18791o;
    public final int f18792p;
    public final boolean f18793q;
    public final int f18794r;
    public final boolean f18795s;
    public final boolean f18796t;
    public final TLObject f18797u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18779a = 1;
        this.f18780b = messagesController;
        this.f18781c = i10;
        this.d = i11;
        this.f18782e = i12;
        this.f18783f = i13;
        this.f18784g = i14;
        this.h = j3;
        this.f18785i = j10;
        this.f18786j = i15;
        this.f18787k = i16;
        this.f18788l = i17;
        this.f18789m = i18;
        this.f18790n = i19;
        this.f18791o = j11;
        this.f18792p = i20;
        this.f18793q = z10;
        this.f18794r = i21;
        this.f18795s = z11;
        this.f18796t = z12;
        this.f18797u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18779a) {
            case 0:
                this.f18780b.lambda$loadMessagesInternal$178(this.h, this.f18781c, this.d, this.f18782e, this.f18785i, this.f18783f, this.f18784g, this.f18786j, this.f18787k, this.f18788l, this.f18789m, this.f18790n, this.f18791o, this.f18792p, this.f18793q, this.f18794r, this.f18795s, this.f18796t, (TLRPC.TL_messages_getSavedHistory) this.f18797u, tLObject, tL_error);
                return;
            case 1:
                this.f18780b.lambda$loadMessagesInternal$180(this.f18781c, this.d, this.f18782e, this.f18783f, this.f18784g, this.h, this.f18785i, this.f18786j, this.f18787k, this.f18788l, this.f18789m, this.f18790n, this.f18791o, this.f18792p, this.f18793q, this.f18794r, this.f18795s, this.f18796t, (TLRPC.TL_messages_getReplies) this.f18797u, tLObject, tL_error);
                return;
            default:
                this.f18780b.lambda$loadMessagesInternal$185(this.h, this.f18781c, this.d, this.f18782e, this.f18785i, this.f18783f, this.f18784g, this.f18786j, this.f18787k, this.f18788l, this.f18789m, this.f18790n, this.f18791o, this.f18792p, this.f18793q, this.f18794r, this.f18795s, this.f18796t, (TLRPC.TL_messages_getHistory) this.f18797u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18779a = i22;
        this.f18780b = messagesController;
        this.h = j3;
        this.f18781c = i10;
        this.d = i11;
        this.f18782e = i12;
        this.f18785i = j10;
        this.f18783f = i13;
        this.f18784g = i14;
        this.f18786j = i15;
        this.f18787k = i16;
        this.f18788l = i17;
        this.f18789m = i18;
        this.f18790n = i19;
        this.f18791o = j11;
        this.f18792p = i20;
        this.f18793q = z10;
        this.f18794r = i21;
        this.f18795s = z11;
        this.f18796t = z12;
        this.f18797u = tLObject;
    }
}
