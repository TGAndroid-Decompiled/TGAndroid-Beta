package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class od implements RequestDelegate {

    public final int f21159a;

    public final MessagesController f21160b;

    public final int f21161c;
    public final int d;

    public final int f21162e;

    public final int f21163f;

    public final int f21164g;
    public final long h;

    public final long f21165i;

    public final int f21166j;

    public final int f21167k;

    public final int f21168l;

    public final int f21169m;

    public final int f21170n;

    public final long f21171o;

    public final int f21172p;

    public final boolean f21173q;

    public final int f21174r;

    public final boolean f21175s;

    public final boolean f21176t;

    public final TLObject f21177u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f21159a = 1;
        this.f21160b = messagesController;
        this.f21161c = i10;
        this.d = i11;
        this.f21162e = i12;
        this.f21163f = i13;
        this.f21164g = i14;
        this.h = j10;
        this.f21165i = j11;
        this.f21166j = i15;
        this.f21167k = i16;
        this.f21168l = i17;
        this.f21169m = i18;
        this.f21170n = i19;
        this.f21171o = j12;
        this.f21172p = i20;
        this.f21173q = z10;
        this.f21174r = i21;
        this.f21175s = z11;
        this.f21176t = z12;
        this.f21177u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21159a) {
            case 0:
                this.f21160b.lambda$loadMessagesInternal$178(this.h, this.f21161c, this.d, this.f21162e, this.f21165i, this.f21163f, this.f21164g, this.f21166j, this.f21167k, this.f21168l, this.f21169m, this.f21170n, this.f21171o, this.f21172p, this.f21173q, this.f21174r, this.f21175s, this.f21176t, (TLRPC.TL_messages_getSavedHistory) this.f21177u, tLObject, tL_error);
                break;
            case 1:
                this.f21160b.lambda$loadMessagesInternal$180(this.f21161c, this.d, this.f21162e, this.f21163f, this.f21164g, this.h, this.f21165i, this.f21166j, this.f21167k, this.f21168l, this.f21169m, this.f21170n, this.f21171o, this.f21172p, this.f21173q, this.f21174r, this.f21175s, this.f21176t, (TLRPC.TL_messages_getReplies) this.f21177u, tLObject, tL_error);
                break;
            default:
                this.f21160b.lambda$loadMessagesInternal$185(this.h, this.f21161c, this.d, this.f21162e, this.f21165i, this.f21163f, this.f21164g, this.f21166j, this.f21167k, this.f21168l, this.f21169m, this.f21170n, this.f21171o, this.f21172p, this.f21173q, this.f21174r, this.f21175s, this.f21176t, (TLRPC.TL_messages_getHistory) this.f21177u, tLObject, tL_error);
                break;
        }
    }

    public od(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f21159a = i22;
        this.f21160b = messagesController;
        this.h = j10;
        this.f21161c = i10;
        this.d = i11;
        this.f21162e = i12;
        this.f21165i = j11;
        this.f21163f = i13;
        this.f21164g = i14;
        this.f21166j = i15;
        this.f21167k = i16;
        this.f21168l = i17;
        this.f21169m = i18;
        this.f21170n = i19;
        this.f21171o = j12;
        this.f21172p = i20;
        this.f21173q = z10;
        this.f21174r = i21;
        this.f21175s = z11;
        this.f21176t = z12;
        this.f21177u = tLObject;
    }
}
