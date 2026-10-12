package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f18875a;
    public final MessagesController f18876b;
    public final int f18877c;
    public final int d;
    public final int f18878e;
    public final int f18879f;
    public final int f18880g;
    public final long h;
    public final long f18881i;
    public final int f18882j;
    public final int f18883k;
    public final int f18884l;
    public final int f18885m;
    public final int f18886n;
    public final long f18887o;
    public final int f18888p;
    public final boolean f18889q;
    public final int f18890r;
    public final boolean f18891s;
    public final boolean f18892t;
    public final TLObject f18893u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18875a = 1;
        this.f18876b = messagesController;
        this.f18877c = i10;
        this.d = i11;
        this.f18878e = i12;
        this.f18879f = i13;
        this.f18880g = i14;
        this.h = j3;
        this.f18881i = j10;
        this.f18882j = i15;
        this.f18883k = i16;
        this.f18884l = i17;
        this.f18885m = i18;
        this.f18886n = i19;
        this.f18887o = j11;
        this.f18888p = i20;
        this.f18889q = z10;
        this.f18890r = i21;
        this.f18891s = z11;
        this.f18892t = z12;
        this.f18893u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18875a) {
            case 0:
                this.f18876b.lambda$loadMessagesInternal$177(this.h, this.f18877c, this.d, this.f18878e, this.f18881i, this.f18879f, this.f18880g, this.f18882j, this.f18883k, this.f18884l, this.f18885m, this.f18886n, this.f18887o, this.f18888p, this.f18889q, this.f18890r, this.f18891s, this.f18892t, (TLRPC.TL_messages_getSavedHistory) this.f18893u, tLObject, tL_error);
                return;
            case 1:
                this.f18876b.lambda$loadMessagesInternal$179(this.f18877c, this.d, this.f18878e, this.f18879f, this.f18880g, this.h, this.f18881i, this.f18882j, this.f18883k, this.f18884l, this.f18885m, this.f18886n, this.f18887o, this.f18888p, this.f18889q, this.f18890r, this.f18891s, this.f18892t, (TLRPC.TL_messages_getReplies) this.f18893u, tLObject, tL_error);
                return;
            default:
                this.f18876b.lambda$loadMessagesInternal$184(this.h, this.f18877c, this.d, this.f18878e, this.f18881i, this.f18879f, this.f18880g, this.f18882j, this.f18883k, this.f18884l, this.f18885m, this.f18886n, this.f18887o, this.f18888p, this.f18889q, this.f18890r, this.f18891s, this.f18892t, (TLRPC.TL_messages_getHistory) this.f18893u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18875a = i22;
        this.f18876b = messagesController;
        this.h = j3;
        this.f18877c = i10;
        this.d = i11;
        this.f18878e = i12;
        this.f18881i = j10;
        this.f18879f = i13;
        this.f18880g = i14;
        this.f18882j = i15;
        this.f18883k = i16;
        this.f18884l = i17;
        this.f18885m = i18;
        this.f18886n = i19;
        this.f18887o = j11;
        this.f18888p = i20;
        this.f18889q = z10;
        this.f18890r = i21;
        this.f18891s = z11;
        this.f18892t = z12;
        this.f18893u = tLObject;
    }
}
