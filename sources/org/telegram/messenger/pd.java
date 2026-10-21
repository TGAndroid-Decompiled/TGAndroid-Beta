package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f19241a;
    public final MessagesController f19242b;
    public final int f19243c;
    public final int d;
    public final int e;
    public final int f19244f;
    public final int f19245g;
    public final long h;
    public final long f19246i;
    public final int f19247j;
    public final int f19248k;
    public final int f19249l;
    public final int f19250m;
    public final int f19251n;
    public final long f19252o;
    public final int f19253p;
    public final boolean f19254q;
    public final int f19255r;
    public final boolean f19256s;
    public final boolean f19257t;
    public final TLObject f19258u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19241a = 1;
        this.f19242b = messagesController;
        this.f19243c = i10;
        this.d = i11;
        this.e = i12;
        this.f19244f = i13;
        this.f19245g = i14;
        this.h = j10;
        this.f19246i = j11;
        this.f19247j = i15;
        this.f19248k = i16;
        this.f19249l = i17;
        this.f19250m = i18;
        this.f19251n = i19;
        this.f19252o = j12;
        this.f19253p = i20;
        this.f19254q = z10;
        this.f19255r = i21;
        this.f19256s = z11;
        this.f19257t = z12;
        this.f19258u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19241a) {
            case 0:
                this.f19242b.lambda$loadMessagesInternal$177(this.h, this.f19243c, this.d, this.e, this.f19246i, this.f19244f, this.f19245g, this.f19247j, this.f19248k, this.f19249l, this.f19250m, this.f19251n, this.f19252o, this.f19253p, this.f19254q, this.f19255r, this.f19256s, this.f19257t, (TLRPC.TL_messages_getSavedHistory) this.f19258u, tLObject, tL_error);
                return;
            case 1:
                this.f19242b.lambda$loadMessagesInternal$179(this.f19243c, this.d, this.e, this.f19244f, this.f19245g, this.h, this.f19246i, this.f19247j, this.f19248k, this.f19249l, this.f19250m, this.f19251n, this.f19252o, this.f19253p, this.f19254q, this.f19255r, this.f19256s, this.f19257t, (TLRPC.TL_messages_getReplies) this.f19258u, tLObject, tL_error);
                return;
            default:
                this.f19242b.lambda$loadMessagesInternal$184(this.h, this.f19243c, this.d, this.e, this.f19246i, this.f19244f, this.f19245g, this.f19247j, this.f19248k, this.f19249l, this.f19250m, this.f19251n, this.f19252o, this.f19253p, this.f19254q, this.f19255r, this.f19256s, this.f19257t, (TLRPC.TL_messages_getHistory) this.f19258u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19241a = i22;
        this.f19242b = messagesController;
        this.h = j10;
        this.f19243c = i10;
        this.d = i11;
        this.e = i12;
        this.f19246i = j11;
        this.f19244f = i13;
        this.f19245g = i14;
        this.f19247j = i15;
        this.f19248k = i16;
        this.f19249l = i17;
        this.f19250m = i18;
        this.f19251n = i19;
        this.f19252o = j12;
        this.f19253p = i20;
        this.f19254q = z10;
        this.f19255r = i21;
        this.f19256s = z11;
        this.f19257t = z12;
        this.f19258u = tLObject;
    }
}
