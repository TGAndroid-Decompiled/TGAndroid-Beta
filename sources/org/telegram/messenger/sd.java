package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f21227a;
    public final MessagesController f21228b;
    public final int f21229c;
    public final int d;
    public final int e;
    public final int f21230f;
    public final int f21231g;
    public final long h;
    public final long f21232i;
    public final int f21233j;
    public final int f21234k;
    public final int f21235l;
    public final int f21236m;
    public final int f21237n;
    public final long f21238o;
    public final int f21239p;
    public final boolean f21240q;
    public final int f21241r;
    public final boolean f21242s;
    public final boolean f21243t;
    public final TLObject f21244u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f21227a = 1;
        this.f21228b = messagesController;
        this.f21229c = i10;
        this.d = i11;
        this.e = i12;
        this.f21230f = i13;
        this.f21231g = i14;
        this.h = j10;
        this.f21232i = j11;
        this.f21233j = i15;
        this.f21234k = i16;
        this.f21235l = i17;
        this.f21236m = i18;
        this.f21237n = i19;
        this.f21238o = j12;
        this.f21239p = i20;
        this.f21240q = z10;
        this.f21241r = i21;
        this.f21242s = z11;
        this.f21243t = z12;
        this.f21244u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21227a) {
            case 0:
                this.f21228b.lambda$loadMessagesInternal$177(this.h, this.f21229c, this.d, this.e, this.f21232i, this.f21230f, this.f21231g, this.f21233j, this.f21234k, this.f21235l, this.f21236m, this.f21237n, this.f21238o, this.f21239p, this.f21240q, this.f21241r, this.f21242s, this.f21243t, (TLRPC.TL_messages_getSavedHistory) this.f21244u, tLObject, tL_error);
                return;
            case 1:
                this.f21228b.lambda$loadMessagesInternal$179(this.f21229c, this.d, this.e, this.f21230f, this.f21231g, this.h, this.f21232i, this.f21233j, this.f21234k, this.f21235l, this.f21236m, this.f21237n, this.f21238o, this.f21239p, this.f21240q, this.f21241r, this.f21242s, this.f21243t, (TLRPC.TL_messages_getReplies) this.f21244u, tLObject, tL_error);
                return;
            default:
                this.f21228b.lambda$loadMessagesInternal$184(this.h, this.f21229c, this.d, this.e, this.f21232i, this.f21230f, this.f21231g, this.f21233j, this.f21234k, this.f21235l, this.f21236m, this.f21237n, this.f21238o, this.f21239p, this.f21240q, this.f21241r, this.f21242s, this.f21243t, (TLRPC.TL_messages_getHistory) this.f21244u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f21227a = i22;
        this.f21228b = messagesController;
        this.h = j10;
        this.f21229c = i10;
        this.d = i11;
        this.e = i12;
        this.f21232i = j11;
        this.f21230f = i13;
        this.f21231g = i14;
        this.f21233j = i15;
        this.f21234k = i16;
        this.f21235l = i17;
        this.f21236m = i18;
        this.f21237n = i19;
        this.f21238o = j12;
        this.f21239p = i20;
        this.f21240q = z10;
        this.f21241r = i21;
        this.f21242s = z11;
        this.f21243t = z12;
        this.f21244u = tLObject;
    }
}
