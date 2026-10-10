package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f18839a;
    public final MessagesController f18840b;
    public final int f18841c;
    public final int d;
    public final int f18842e;
    public final int f18843f;
    public final int f18844g;
    public final long h;
    public final long f18845i;
    public final int f18846j;
    public final int f18847k;
    public final int f18848l;
    public final int f18849m;
    public final int f18850n;
    public final long f18851o;
    public final int f18852p;
    public final boolean f18853q;
    public final int f18854r;
    public final boolean f18855s;
    public final boolean f18856t;
    public final TLObject f18857u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18839a = 1;
        this.f18840b = messagesController;
        this.f18841c = i10;
        this.d = i11;
        this.f18842e = i12;
        this.f18843f = i13;
        this.f18844g = i14;
        this.h = j3;
        this.f18845i = j10;
        this.f18846j = i15;
        this.f18847k = i16;
        this.f18848l = i17;
        this.f18849m = i18;
        this.f18850n = i19;
        this.f18851o = j11;
        this.f18852p = i20;
        this.f18853q = z10;
        this.f18854r = i21;
        this.f18855s = z11;
        this.f18856t = z12;
        this.f18857u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18839a) {
            case 0:
                this.f18840b.lambda$loadMessagesInternal$177(this.h, this.f18841c, this.d, this.f18842e, this.f18845i, this.f18843f, this.f18844g, this.f18846j, this.f18847k, this.f18848l, this.f18849m, this.f18850n, this.f18851o, this.f18852p, this.f18853q, this.f18854r, this.f18855s, this.f18856t, (TLRPC.TL_messages_getSavedHistory) this.f18857u, tLObject, tL_error);
                return;
            case 1:
                this.f18840b.lambda$loadMessagesInternal$179(this.f18841c, this.d, this.f18842e, this.f18843f, this.f18844g, this.h, this.f18845i, this.f18846j, this.f18847k, this.f18848l, this.f18849m, this.f18850n, this.f18851o, this.f18852p, this.f18853q, this.f18854r, this.f18855s, this.f18856t, (TLRPC.TL_messages_getReplies) this.f18857u, tLObject, tL_error);
                return;
            default:
                this.f18840b.lambda$loadMessagesInternal$184(this.h, this.f18841c, this.d, this.f18842e, this.f18845i, this.f18843f, this.f18844g, this.f18846j, this.f18847k, this.f18848l, this.f18849m, this.f18850n, this.f18851o, this.f18852p, this.f18853q, this.f18854r, this.f18855s, this.f18856t, (TLRPC.TL_messages_getHistory) this.f18857u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18839a = i22;
        this.f18840b = messagesController;
        this.h = j3;
        this.f18841c = i10;
        this.d = i11;
        this.f18842e = i12;
        this.f18845i = j10;
        this.f18843f = i13;
        this.f18844g = i14;
        this.f18846j = i15;
        this.f18847k = i16;
        this.f18848l = i17;
        this.f18849m = i18;
        this.f18850n = i19;
        this.f18851o = j11;
        this.f18852p = i20;
        this.f18853q = z10;
        this.f18854r = i21;
        this.f18855s = z11;
        this.f18856t = z12;
        this.f18857u = tLObject;
    }
}
