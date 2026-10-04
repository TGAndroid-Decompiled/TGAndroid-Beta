package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18777a;
    public final MessagesController f18778b;
    public final int f18779c;
    public final int d;
    public final int f18780e;
    public final int f18781f;
    public final int f18782g;
    public final long h;
    public final long f18783i;
    public final int f18784j;
    public final int f18785k;
    public final int f18786l;
    public final int f18787m;
    public final int f18788n;
    public final long f18789o;
    public final int f18790p;
    public final boolean f18791q;
    public final int f18792r;
    public final boolean f18793s;
    public final boolean f18794t;
    public final TLObject f18795u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18777a = 1;
        this.f18778b = messagesController;
        this.f18779c = i10;
        this.d = i11;
        this.f18780e = i12;
        this.f18781f = i13;
        this.f18782g = i14;
        this.h = j3;
        this.f18783i = j10;
        this.f18784j = i15;
        this.f18785k = i16;
        this.f18786l = i17;
        this.f18787m = i18;
        this.f18788n = i19;
        this.f18789o = j11;
        this.f18790p = i20;
        this.f18791q = z10;
        this.f18792r = i21;
        this.f18793s = z11;
        this.f18794t = z12;
        this.f18795u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18777a) {
            case 0:
                this.f18778b.lambda$loadMessagesInternal$178(this.h, this.f18779c, this.d, this.f18780e, this.f18783i, this.f18781f, this.f18782g, this.f18784j, this.f18785k, this.f18786l, this.f18787m, this.f18788n, this.f18789o, this.f18790p, this.f18791q, this.f18792r, this.f18793s, this.f18794t, (TLRPC.TL_messages_getSavedHistory) this.f18795u, tLObject, tL_error);
                return;
            case 1:
                this.f18778b.lambda$loadMessagesInternal$180(this.f18779c, this.d, this.f18780e, this.f18781f, this.f18782g, this.h, this.f18783i, this.f18784j, this.f18785k, this.f18786l, this.f18787m, this.f18788n, this.f18789o, this.f18790p, this.f18791q, this.f18792r, this.f18793s, this.f18794t, (TLRPC.TL_messages_getReplies) this.f18795u, tLObject, tL_error);
                return;
            default:
                this.f18778b.lambda$loadMessagesInternal$185(this.h, this.f18779c, this.d, this.f18780e, this.f18783i, this.f18781f, this.f18782g, this.f18784j, this.f18785k, this.f18786l, this.f18787m, this.f18788n, this.f18789o, this.f18790p, this.f18791q, this.f18792r, this.f18793s, this.f18794t, (TLRPC.TL_messages_getHistory) this.f18795u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18777a = i22;
        this.f18778b = messagesController;
        this.h = j3;
        this.f18779c = i10;
        this.d = i11;
        this.f18780e = i12;
        this.f18783i = j10;
        this.f18781f = i13;
        this.f18782g = i14;
        this.f18784j = i15;
        this.f18785k = i16;
        this.f18786l = i17;
        this.f18787m = i18;
        this.f18788n = i19;
        this.f18789o = j11;
        this.f18790p = i20;
        this.f18791q = z10;
        this.f18792r = i21;
        this.f18793s = z11;
        this.f18794t = z12;
        this.f18795u = tLObject;
    }
}
