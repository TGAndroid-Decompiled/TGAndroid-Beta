package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f19244a;
    public final MessagesController f19245b;
    public final int f19246c;
    public final int d;
    public final int e;
    public final int f19247f;
    public final int f19248g;
    public final long h;
    public final long f19249i;
    public final int f19250j;
    public final int f19251k;
    public final int f19252l;
    public final int f19253m;
    public final int f19254n;
    public final long f19255o;
    public final int f19256p;
    public final boolean f19257q;
    public final int f19258r;
    public final boolean f19259s;
    public final boolean f19260t;
    public final TLObject f19261u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19244a = 1;
        this.f19245b = messagesController;
        this.f19246c = i10;
        this.d = i11;
        this.e = i12;
        this.f19247f = i13;
        this.f19248g = i14;
        this.h = j10;
        this.f19249i = j11;
        this.f19250j = i15;
        this.f19251k = i16;
        this.f19252l = i17;
        this.f19253m = i18;
        this.f19254n = i19;
        this.f19255o = j12;
        this.f19256p = i20;
        this.f19257q = z10;
        this.f19258r = i21;
        this.f19259s = z11;
        this.f19260t = z12;
        this.f19261u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19244a) {
            case 0:
                this.f19245b.lambda$loadMessagesInternal$177(this.h, this.f19246c, this.d, this.e, this.f19249i, this.f19247f, this.f19248g, this.f19250j, this.f19251k, this.f19252l, this.f19253m, this.f19254n, this.f19255o, this.f19256p, this.f19257q, this.f19258r, this.f19259s, this.f19260t, (TLRPC.TL_messages_getSavedHistory) this.f19261u, tLObject, tL_error);
                return;
            case 1:
                this.f19245b.lambda$loadMessagesInternal$179(this.f19246c, this.d, this.e, this.f19247f, this.f19248g, this.h, this.f19249i, this.f19250j, this.f19251k, this.f19252l, this.f19253m, this.f19254n, this.f19255o, this.f19256p, this.f19257q, this.f19258r, this.f19259s, this.f19260t, (TLRPC.TL_messages_getReplies) this.f19261u, tLObject, tL_error);
                return;
            default:
                this.f19245b.lambda$loadMessagesInternal$184(this.h, this.f19246c, this.d, this.e, this.f19249i, this.f19247f, this.f19248g, this.f19250j, this.f19251k, this.f19252l, this.f19253m, this.f19254n, this.f19255o, this.f19256p, this.f19257q, this.f19258r, this.f19259s, this.f19260t, (TLRPC.TL_messages_getHistory) this.f19261u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19244a = i22;
        this.f19245b = messagesController;
        this.h = j10;
        this.f19246c = i10;
        this.d = i11;
        this.e = i12;
        this.f19249i = j11;
        this.f19247f = i13;
        this.f19248g = i14;
        this.f19250j = i15;
        this.f19251k = i16;
        this.f19252l = i17;
        this.f19253m = i18;
        this.f19254n = i19;
        this.f19255o = j12;
        this.f19256p = i20;
        this.f19257q = z10;
        this.f19258r = i21;
        this.f19259s = z11;
        this.f19260t = z12;
        this.f19261u = tLObject;
    }
}
