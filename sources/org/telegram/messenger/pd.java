package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f17273a;
    public final MessagesController f17274b;
    public final int f17275c;
    public final int d;
    public final int e;
    public final int f17276f;
    public final int f17277g;
    public final long h;
    public final long f17278i;
    public final int f17279j;
    public final int f17280k;
    public final int f17281l;
    public final int f17282m;
    public final int f17283n;
    public final long f17284o;
    public final int f17285p;
    public final boolean f17286q;
    public final int f17287r;
    public final boolean f17288s;
    public final boolean f17289t;
    public final TLObject f17290u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17273a = 1;
        this.f17274b = messagesController;
        this.f17275c = i10;
        this.d = i11;
        this.e = i12;
        this.f17276f = i13;
        this.f17277g = i14;
        this.h = j3;
        this.f17278i = j10;
        this.f17279j = i15;
        this.f17280k = i16;
        this.f17281l = i17;
        this.f17282m = i18;
        this.f17283n = i19;
        this.f17284o = j11;
        this.f17285p = i20;
        this.f17286q = z10;
        this.f17287r = i21;
        this.f17288s = z11;
        this.f17289t = z12;
        this.f17290u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17273a) {
            case 0:
                this.f17274b.lambda$loadMessagesInternal$178(this.h, this.f17275c, this.d, this.e, this.f17278i, this.f17276f, this.f17277g, this.f17279j, this.f17280k, this.f17281l, this.f17282m, this.f17283n, this.f17284o, this.f17285p, this.f17286q, this.f17287r, this.f17288s, this.f17289t, (TLRPC.TL_messages_getSavedHistory) this.f17290u, tLObject, tL_error);
                return;
            case 1:
                this.f17274b.lambda$loadMessagesInternal$180(this.f17275c, this.d, this.e, this.f17276f, this.f17277g, this.h, this.f17278i, this.f17279j, this.f17280k, this.f17281l, this.f17282m, this.f17283n, this.f17284o, this.f17285p, this.f17286q, this.f17287r, this.f17288s, this.f17289t, (TLRPC.TL_messages_getReplies) this.f17290u, tLObject, tL_error);
                return;
            default:
                this.f17274b.lambda$loadMessagesInternal$185(this.h, this.f17275c, this.d, this.e, this.f17278i, this.f17276f, this.f17277g, this.f17279j, this.f17280k, this.f17281l, this.f17282m, this.f17283n, this.f17284o, this.f17285p, this.f17286q, this.f17287r, this.f17288s, this.f17289t, (TLRPC.TL_messages_getHistory) this.f17290u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17273a = i22;
        this.f17274b = messagesController;
        this.h = j3;
        this.f17275c = i10;
        this.d = i11;
        this.e = i12;
        this.f17278i = j10;
        this.f17276f = i13;
        this.f17277g = i14;
        this.f17279j = i15;
        this.f17280k = i16;
        this.f17281l = i17;
        this.f17282m = i18;
        this.f17283n = i19;
        this.f17284o = j11;
        this.f17285p = i20;
        this.f17286q = z10;
        this.f17287r = i21;
        this.f17288s = z11;
        this.f17289t = z12;
        this.f17290u = tLObject;
    }
}
