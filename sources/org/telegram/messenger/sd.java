package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f19566a;
    public final MessagesController f19567b;
    public final int f19568c;
    public final int d;
    public final int e;
    public final int f19569f;
    public final int f19570g;
    public final long h;
    public final long f19571i;
    public final int f19572j;
    public final int f19573k;
    public final int f19574l;
    public final int f19575m;
    public final int f19576n;
    public final long f19577o;
    public final int f19578p;
    public final boolean f19579q;
    public final int f19580r;
    public final boolean f19581s;
    public final boolean f19582t;
    public final TLObject f19583u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19566a = 1;
        this.f19567b = messagesController;
        this.f19568c = i10;
        this.d = i11;
        this.e = i12;
        this.f19569f = i13;
        this.f19570g = i14;
        this.h = j10;
        this.f19571i = j11;
        this.f19572j = i15;
        this.f19573k = i16;
        this.f19574l = i17;
        this.f19575m = i18;
        this.f19576n = i19;
        this.f19577o = j12;
        this.f19578p = i20;
        this.f19579q = z10;
        this.f19580r = i21;
        this.f19581s = z11;
        this.f19582t = z12;
        this.f19583u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19566a) {
            case 0:
                this.f19567b.lambda$loadMessagesInternal$177(this.h, this.f19568c, this.d, this.e, this.f19571i, this.f19569f, this.f19570g, this.f19572j, this.f19573k, this.f19574l, this.f19575m, this.f19576n, this.f19577o, this.f19578p, this.f19579q, this.f19580r, this.f19581s, this.f19582t, (TLRPC.TL_messages_getSavedHistory) this.f19583u, tLObject, tL_error);
                return;
            case 1:
                this.f19567b.lambda$loadMessagesInternal$179(this.f19568c, this.d, this.e, this.f19569f, this.f19570g, this.h, this.f19571i, this.f19572j, this.f19573k, this.f19574l, this.f19575m, this.f19576n, this.f19577o, this.f19578p, this.f19579q, this.f19580r, this.f19581s, this.f19582t, (TLRPC.TL_messages_getReplies) this.f19583u, tLObject, tL_error);
                return;
            default:
                this.f19567b.lambda$loadMessagesInternal$184(this.h, this.f19568c, this.d, this.e, this.f19571i, this.f19569f, this.f19570g, this.f19572j, this.f19573k, this.f19574l, this.f19575m, this.f19576n, this.f19577o, this.f19578p, this.f19579q, this.f19580r, this.f19581s, this.f19582t, (TLRPC.TL_messages_getHistory) this.f19583u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19566a = i22;
        this.f19567b = messagesController;
        this.h = j10;
        this.f19568c = i10;
        this.d = i11;
        this.e = i12;
        this.f19571i = j11;
        this.f19569f = i13;
        this.f19570g = i14;
        this.f19572j = i15;
        this.f19573k = i16;
        this.f19574l = i17;
        this.f19575m = i18;
        this.f19576n = i19;
        this.f19577o = j12;
        this.f19578p = i20;
        this.f19579q = z10;
        this.f19580r = i21;
        this.f19581s = z11;
        this.f19582t = z12;
        this.f19583u = tLObject;
    }
}
