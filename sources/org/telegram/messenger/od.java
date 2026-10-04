package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18774a;
    public final MessagesController f18775b;
    public final int f18776c;
    public final int d;
    public final int f18777e;
    public final int f18778f;
    public final int f18779g;
    public final long h;
    public final long f18780i;
    public final int f18781j;
    public final int f18782k;
    public final int f18783l;
    public final int f18784m;
    public final int f18785n;
    public final long f18786o;
    public final int f18787p;
    public final boolean f18788q;
    public final int f18789r;
    public final boolean f18790s;
    public final boolean f18791t;
    public final TLObject f18792u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18774a = 1;
        this.f18775b = messagesController;
        this.f18776c = i10;
        this.d = i11;
        this.f18777e = i12;
        this.f18778f = i13;
        this.f18779g = i14;
        this.h = j3;
        this.f18780i = j10;
        this.f18781j = i15;
        this.f18782k = i16;
        this.f18783l = i17;
        this.f18784m = i18;
        this.f18785n = i19;
        this.f18786o = j11;
        this.f18787p = i20;
        this.f18788q = z10;
        this.f18789r = i21;
        this.f18790s = z11;
        this.f18791t = z12;
        this.f18792u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18774a) {
            case 0:
                this.f18775b.lambda$loadMessagesInternal$178(this.h, this.f18776c, this.d, this.f18777e, this.f18780i, this.f18778f, this.f18779g, this.f18781j, this.f18782k, this.f18783l, this.f18784m, this.f18785n, this.f18786o, this.f18787p, this.f18788q, this.f18789r, this.f18790s, this.f18791t, (TLRPC.TL_messages_getSavedHistory) this.f18792u, tLObject, tL_error);
                return;
            case 1:
                this.f18775b.lambda$loadMessagesInternal$180(this.f18776c, this.d, this.f18777e, this.f18778f, this.f18779g, this.h, this.f18780i, this.f18781j, this.f18782k, this.f18783l, this.f18784m, this.f18785n, this.f18786o, this.f18787p, this.f18788q, this.f18789r, this.f18790s, this.f18791t, (TLRPC.TL_messages_getReplies) this.f18792u, tLObject, tL_error);
                return;
            default:
                this.f18775b.lambda$loadMessagesInternal$185(this.h, this.f18776c, this.d, this.f18777e, this.f18780i, this.f18778f, this.f18779g, this.f18781j, this.f18782k, this.f18783l, this.f18784m, this.f18785n, this.f18786o, this.f18787p, this.f18788q, this.f18789r, this.f18790s, this.f18791t, (TLRPC.TL_messages_getHistory) this.f18792u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18774a = i22;
        this.f18775b = messagesController;
        this.h = j3;
        this.f18776c = i10;
        this.d = i11;
        this.f18777e = i12;
        this.f18780i = j10;
        this.f18778f = i13;
        this.f18779g = i14;
        this.f18781j = i15;
        this.f18782k = i16;
        this.f18783l = i17;
        this.f18784m = i18;
        this.f18785n = i19;
        this.f18786o = j11;
        this.f18787p = i20;
        this.f18788q = z10;
        this.f18789r = i21;
        this.f18790s = z11;
        this.f18791t = z12;
        this.f18792u = tLObject;
    }
}
