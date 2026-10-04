package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18778a;
    public final MessagesController f18779b;
    public final int f18780c;
    public final int d;
    public final int f18781e;
    public final int f18782f;
    public final int f18783g;
    public final long h;
    public final long f18784i;
    public final int f18785j;
    public final int f18786k;
    public final int f18787l;
    public final int f18788m;
    public final int f18789n;
    public final long f18790o;
    public final int f18791p;
    public final boolean f18792q;
    public final int f18793r;
    public final boolean f18794s;
    public final boolean f18795t;
    public final TLObject f18796u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18778a = 1;
        this.f18779b = messagesController;
        this.f18780c = i10;
        this.d = i11;
        this.f18781e = i12;
        this.f18782f = i13;
        this.f18783g = i14;
        this.h = j3;
        this.f18784i = j10;
        this.f18785j = i15;
        this.f18786k = i16;
        this.f18787l = i17;
        this.f18788m = i18;
        this.f18789n = i19;
        this.f18790o = j11;
        this.f18791p = i20;
        this.f18792q = z10;
        this.f18793r = i21;
        this.f18794s = z11;
        this.f18795t = z12;
        this.f18796u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18778a) {
            case 0:
                this.f18779b.lambda$loadMessagesInternal$178(this.h, this.f18780c, this.d, this.f18781e, this.f18784i, this.f18782f, this.f18783g, this.f18785j, this.f18786k, this.f18787l, this.f18788m, this.f18789n, this.f18790o, this.f18791p, this.f18792q, this.f18793r, this.f18794s, this.f18795t, (TLRPC.TL_messages_getSavedHistory) this.f18796u, tLObject, tL_error);
                return;
            case 1:
                this.f18779b.lambda$loadMessagesInternal$180(this.f18780c, this.d, this.f18781e, this.f18782f, this.f18783g, this.h, this.f18784i, this.f18785j, this.f18786k, this.f18787l, this.f18788m, this.f18789n, this.f18790o, this.f18791p, this.f18792q, this.f18793r, this.f18794s, this.f18795t, (TLRPC.TL_messages_getReplies) this.f18796u, tLObject, tL_error);
                return;
            default:
                this.f18779b.lambda$loadMessagesInternal$185(this.h, this.f18780c, this.d, this.f18781e, this.f18784i, this.f18782f, this.f18783g, this.f18785j, this.f18786k, this.f18787l, this.f18788m, this.f18789n, this.f18790o, this.f18791p, this.f18792q, this.f18793r, this.f18794s, this.f18795t, (TLRPC.TL_messages_getHistory) this.f18796u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18778a = i22;
        this.f18779b = messagesController;
        this.h = j3;
        this.f18780c = i10;
        this.d = i11;
        this.f18781e = i12;
        this.f18784i = j10;
        this.f18782f = i13;
        this.f18783g = i14;
        this.f18785j = i15;
        this.f18786k = i16;
        this.f18787l = i17;
        this.f18788m = i18;
        this.f18789n = i19;
        this.f18790o = j11;
        this.f18791p = i20;
        this.f18792q = z10;
        this.f18793r = i21;
        this.f18794s = z11;
        this.f18795t = z12;
        this.f18796u = tLObject;
    }
}
