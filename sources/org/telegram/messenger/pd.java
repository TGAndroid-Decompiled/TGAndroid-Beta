package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f18835a;
    public final MessagesController f18836b;
    public final int f18837c;
    public final int d;
    public final int f18838e;
    public final int f18839f;
    public final int f18840g;
    public final long h;
    public final long f18841i;
    public final int f18842j;
    public final int f18843k;
    public final int f18844l;
    public final int f18845m;
    public final int f18846n;
    public final long f18847o;
    public final int f18848p;
    public final boolean f18849q;
    public final int f18850r;
    public final boolean f18851s;
    public final boolean f18852t;
    public final TLObject f18853u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18835a = 1;
        this.f18836b = messagesController;
        this.f18837c = i10;
        this.d = i11;
        this.f18838e = i12;
        this.f18839f = i13;
        this.f18840g = i14;
        this.h = j3;
        this.f18841i = j10;
        this.f18842j = i15;
        this.f18843k = i16;
        this.f18844l = i17;
        this.f18845m = i18;
        this.f18846n = i19;
        this.f18847o = j11;
        this.f18848p = i20;
        this.f18849q = z10;
        this.f18850r = i21;
        this.f18851s = z11;
        this.f18852t = z12;
        this.f18853u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18835a) {
            case 0:
                this.f18836b.lambda$loadMessagesInternal$177(this.h, this.f18837c, this.d, this.f18838e, this.f18841i, this.f18839f, this.f18840g, this.f18842j, this.f18843k, this.f18844l, this.f18845m, this.f18846n, this.f18847o, this.f18848p, this.f18849q, this.f18850r, this.f18851s, this.f18852t, (TLRPC.TL_messages_getSavedHistory) this.f18853u, tLObject, tL_error);
                return;
            case 1:
                this.f18836b.lambda$loadMessagesInternal$179(this.f18837c, this.d, this.f18838e, this.f18839f, this.f18840g, this.h, this.f18841i, this.f18842j, this.f18843k, this.f18844l, this.f18845m, this.f18846n, this.f18847o, this.f18848p, this.f18849q, this.f18850r, this.f18851s, this.f18852t, (TLRPC.TL_messages_getReplies) this.f18853u, tLObject, tL_error);
                return;
            default:
                this.f18836b.lambda$loadMessagesInternal$184(this.h, this.f18837c, this.d, this.f18838e, this.f18841i, this.f18839f, this.f18840g, this.f18842j, this.f18843k, this.f18844l, this.f18845m, this.f18846n, this.f18847o, this.f18848p, this.f18849q, this.f18850r, this.f18851s, this.f18852t, (TLRPC.TL_messages_getHistory) this.f18853u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18835a = i22;
        this.f18836b = messagesController;
        this.h = j3;
        this.f18837c = i10;
        this.d = i11;
        this.f18838e = i12;
        this.f18841i = j10;
        this.f18839f = i13;
        this.f18840g = i14;
        this.f18842j = i15;
        this.f18843k = i16;
        this.f18844l = i17;
        this.f18845m = i18;
        this.f18846n = i19;
        this.f18847o = j11;
        this.f18848p = i20;
        this.f18849q = z10;
        this.f18850r = i21;
        this.f18851s = z11;
        this.f18852t = z12;
        this.f18853u = tLObject;
    }
}
