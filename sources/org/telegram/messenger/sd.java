package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f18389a;
    public final MessagesController f18390b;
    public final int f18391c;
    public final int d;
    public final int e;
    public final int f18392f;
    public final int f18393g;
    public final long h;
    public final long f18394i;
    public final int f18395j;
    public final int f18396k;
    public final int f18397l;
    public final int f18398m;
    public final int f18399n;
    public final long f18400o;
    public final int f18401p;
    public final boolean f18402q;
    public final int f18403r;
    public final boolean f18404s;
    public final boolean f18405t;
    public final TLObject f18406u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18389a = 1;
        this.f18390b = messagesController;
        this.f18391c = i10;
        this.d = i11;
        this.e = i12;
        this.f18392f = i13;
        this.f18393g = i14;
        this.h = j10;
        this.f18394i = j11;
        this.f18395j = i15;
        this.f18396k = i16;
        this.f18397l = i17;
        this.f18398m = i18;
        this.f18399n = i19;
        this.f18400o = j12;
        this.f18401p = i20;
        this.f18402q = z4;
        this.f18403r = i21;
        this.f18404s = z10;
        this.f18405t = z11;
        this.f18406u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18389a) {
            case 0:
                this.f18390b.lambda$loadMessagesInternal$178(this.h, this.f18391c, this.d, this.e, this.f18394i, this.f18392f, this.f18393g, this.f18395j, this.f18396k, this.f18397l, this.f18398m, this.f18399n, this.f18400o, this.f18401p, this.f18402q, this.f18403r, this.f18404s, this.f18405t, (TLRPC.TL_messages_getSavedHistory) this.f18406u, tLObject, tL_error);
                return;
            case 1:
                this.f18390b.lambda$loadMessagesInternal$180(this.f18391c, this.d, this.e, this.f18392f, this.f18393g, this.h, this.f18394i, this.f18395j, this.f18396k, this.f18397l, this.f18398m, this.f18399n, this.f18400o, this.f18401p, this.f18402q, this.f18403r, this.f18404s, this.f18405t, (TLRPC.TL_messages_getReplies) this.f18406u, tLObject, tL_error);
                return;
            default:
                this.f18390b.lambda$loadMessagesInternal$185(this.h, this.f18391c, this.d, this.e, this.f18394i, this.f18392f, this.f18393g, this.f18395j, this.f18396k, this.f18397l, this.f18398m, this.f18399n, this.f18400o, this.f18401p, this.f18402q, this.f18403r, this.f18404s, this.f18405t, (TLRPC.TL_messages_getHistory) this.f18406u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLObject tLObject, int i22) {
        this.f18389a = i22;
        this.f18390b = messagesController;
        this.h = j10;
        this.f18391c = i10;
        this.d = i11;
        this.e = i12;
        this.f18394i = j11;
        this.f18392f = i13;
        this.f18393g = i14;
        this.f18395j = i15;
        this.f18396k = i16;
        this.f18397l = i17;
        this.f18398m = i18;
        this.f18399n = i19;
        this.f18400o = j12;
        this.f18401p = i20;
        this.f18402q = z4;
        this.f18403r = i21;
        this.f18404s = z10;
        this.f18405t = z11;
        this.f18406u = tLObject;
    }
}
