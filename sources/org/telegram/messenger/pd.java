package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f18876a;
    public final MessagesController f18877b;
    public final int f18878c;
    public final int d;
    public final int f18879e;
    public final int f18880f;
    public final int f18881g;
    public final long h;
    public final long f18882i;
    public final int f18883j;
    public final int f18884k;
    public final int f18885l;
    public final int f18886m;
    public final int f18887n;
    public final long f18888o;
    public final int f18889p;
    public final boolean f18890q;
    public final int f18891r;
    public final boolean f18892s;
    public final boolean f18893t;
    public final TLObject f18894u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18876a = 1;
        this.f18877b = messagesController;
        this.f18878c = i10;
        this.d = i11;
        this.f18879e = i12;
        this.f18880f = i13;
        this.f18881g = i14;
        this.h = j3;
        this.f18882i = j10;
        this.f18883j = i15;
        this.f18884k = i16;
        this.f18885l = i17;
        this.f18886m = i18;
        this.f18887n = i19;
        this.f18888o = j11;
        this.f18889p = i20;
        this.f18890q = z10;
        this.f18891r = i21;
        this.f18892s = z11;
        this.f18893t = z12;
        this.f18894u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18876a) {
            case 0:
                this.f18877b.lambda$loadMessagesInternal$177(this.h, this.f18878c, this.d, this.f18879e, this.f18882i, this.f18880f, this.f18881g, this.f18883j, this.f18884k, this.f18885l, this.f18886m, this.f18887n, this.f18888o, this.f18889p, this.f18890q, this.f18891r, this.f18892s, this.f18893t, (TLRPC.TL_messages_getSavedHistory) this.f18894u, tLObject, tL_error);
                return;
            case 1:
                this.f18877b.lambda$loadMessagesInternal$179(this.f18878c, this.d, this.f18879e, this.f18880f, this.f18881g, this.h, this.f18882i, this.f18883j, this.f18884k, this.f18885l, this.f18886m, this.f18887n, this.f18888o, this.f18889p, this.f18890q, this.f18891r, this.f18892s, this.f18893t, (TLRPC.TL_messages_getReplies) this.f18894u, tLObject, tL_error);
                return;
            default:
                this.f18877b.lambda$loadMessagesInternal$184(this.h, this.f18878c, this.d, this.f18879e, this.f18882i, this.f18880f, this.f18881g, this.f18883j, this.f18884k, this.f18885l, this.f18886m, this.f18887n, this.f18888o, this.f18889p, this.f18890q, this.f18891r, this.f18892s, this.f18893t, (TLRPC.TL_messages_getHistory) this.f18894u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18876a = i22;
        this.f18877b = messagesController;
        this.h = j3;
        this.f18878c = i10;
        this.d = i11;
        this.f18879e = i12;
        this.f18882i = j10;
        this.f18880f = i13;
        this.f18881g = i14;
        this.f18883j = i15;
        this.f18884k = i16;
        this.f18885l = i17;
        this.f18886m = i18;
        this.f18887n = i19;
        this.f18888o = j11;
        this.f18889p = i20;
        this.f18890q = z10;
        this.f18891r = i21;
        this.f18892s = z11;
        this.f18893t = z12;
        this.f18894u = tLObject;
    }
}
