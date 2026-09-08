package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f18713a;
    public final MessagesController f18714b;
    public final int f18715c;
    public final int d;
    public final int f18716e;
    public final int f18717f;
    public final int f18718g;
    public final long h;
    public final long f18719i;
    public final int f18720j;
    public final int f18721k;
    public final int f18722l;
    public final int f18723m;
    public final int f18724n;
    public final long f18725o;
    public final int f18726p;
    public final boolean f18727q;
    public final int f18728r;
    public final boolean f18729s;
    public final boolean f18730t;
    public final TLObject f18731u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18713a = 1;
        this.f18714b = messagesController;
        this.f18715c = i10;
        this.d = i11;
        this.f18716e = i12;
        this.f18717f = i13;
        this.f18718g = i14;
        this.h = j3;
        this.f18719i = j10;
        this.f18720j = i15;
        this.f18721k = i16;
        this.f18722l = i17;
        this.f18723m = i18;
        this.f18724n = i19;
        this.f18725o = j11;
        this.f18726p = i20;
        this.f18727q = z10;
        this.f18728r = i21;
        this.f18729s = z11;
        this.f18730t = z12;
        this.f18731u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18713a) {
            case 0:
                this.f18714b.lambda$loadMessagesInternal$178(this.h, this.f18715c, this.d, this.f18716e, this.f18719i, this.f18717f, this.f18718g, this.f18720j, this.f18721k, this.f18722l, this.f18723m, this.f18724n, this.f18725o, this.f18726p, this.f18727q, this.f18728r, this.f18729s, this.f18730t, (TLRPC.TL_messages_getSavedHistory) this.f18731u, tLObject, tL_error);
                return;
            case 1:
                this.f18714b.lambda$loadMessagesInternal$180(this.f18715c, this.d, this.f18716e, this.f18717f, this.f18718g, this.h, this.f18719i, this.f18720j, this.f18721k, this.f18722l, this.f18723m, this.f18724n, this.f18725o, this.f18726p, this.f18727q, this.f18728r, this.f18729s, this.f18730t, (TLRPC.TL_messages_getReplies) this.f18731u, tLObject, tL_error);
                return;
            default:
                this.f18714b.lambda$loadMessagesInternal$185(this.h, this.f18715c, this.d, this.f18716e, this.f18719i, this.f18717f, this.f18718g, this.f18720j, this.f18721k, this.f18722l, this.f18723m, this.f18724n, this.f18725o, this.f18726p, this.f18727q, this.f18728r, this.f18729s, this.f18730t, (TLRPC.TL_messages_getHistory) this.f18731u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18713a = i22;
        this.f18714b = messagesController;
        this.h = j3;
        this.f18715c = i10;
        this.d = i11;
        this.f18716e = i12;
        this.f18719i = j10;
        this.f18717f = i13;
        this.f18718g = i14;
        this.f18720j = i15;
        this.f18721k = i16;
        this.f18722l = i17;
        this.f18723m = i18;
        this.f18724n = i19;
        this.f18725o = j11;
        this.f18726p = i20;
        this.f18727q = z10;
        this.f18728r = i21;
        this.f18729s = z11;
        this.f18730t = z12;
        this.f18731u = tLObject;
    }
}
