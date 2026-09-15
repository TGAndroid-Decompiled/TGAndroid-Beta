package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f17045a;
    public final MessagesController f17046b;
    public final int f17047c;
    public final int d;
    public final int e;
    public final int f17048f;
    public final int f17049g;
    public final long h;
    public final long f17050i;
    public final int f17051j;
    public final int f17052k;
    public final int f17053l;
    public final int f17054m;
    public final int f17055n;
    public final long f17056o;
    public final int f17057p;
    public final boolean f17058q;
    public final int f17059r;
    public final boolean f17060s;
    public final boolean f17061t;
    public final TLObject f17062u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17045a = 1;
        this.f17046b = messagesController;
        this.f17047c = i10;
        this.d = i11;
        this.e = i12;
        this.f17048f = i13;
        this.f17049g = i14;
        this.h = j3;
        this.f17050i = j10;
        this.f17051j = i15;
        this.f17052k = i16;
        this.f17053l = i17;
        this.f17054m = i18;
        this.f17055n = i19;
        this.f17056o = j11;
        this.f17057p = i20;
        this.f17058q = z10;
        this.f17059r = i21;
        this.f17060s = z11;
        this.f17061t = z12;
        this.f17062u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17045a) {
            case 0:
                this.f17046b.lambda$loadMessagesInternal$178(this.h, this.f17047c, this.d, this.e, this.f17050i, this.f17048f, this.f17049g, this.f17051j, this.f17052k, this.f17053l, this.f17054m, this.f17055n, this.f17056o, this.f17057p, this.f17058q, this.f17059r, this.f17060s, this.f17061t, (TLRPC.TL_messages_getSavedHistory) this.f17062u, tLObject, tL_error);
                return;
            case 1:
                this.f17046b.lambda$loadMessagesInternal$180(this.f17047c, this.d, this.e, this.f17048f, this.f17049g, this.h, this.f17050i, this.f17051j, this.f17052k, this.f17053l, this.f17054m, this.f17055n, this.f17056o, this.f17057p, this.f17058q, this.f17059r, this.f17060s, this.f17061t, (TLRPC.TL_messages_getReplies) this.f17062u, tLObject, tL_error);
                return;
            default:
                this.f17046b.lambda$loadMessagesInternal$185(this.h, this.f17047c, this.d, this.e, this.f17050i, this.f17048f, this.f17049g, this.f17051j, this.f17052k, this.f17053l, this.f17054m, this.f17055n, this.f17056o, this.f17057p, this.f17058q, this.f17059r, this.f17060s, this.f17061t, (TLRPC.TL_messages_getHistory) this.f17062u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17045a = i22;
        this.f17046b = messagesController;
        this.h = j3;
        this.f17047c = i10;
        this.d = i11;
        this.e = i12;
        this.f17050i = j10;
        this.f17048f = i13;
        this.f17049g = i14;
        this.f17051j = i15;
        this.f17052k = i16;
        this.f17053l = i17;
        this.f17054m = i18;
        this.f17055n = i19;
        this.f17056o = j11;
        this.f17057p = i20;
        this.f17058q = z10;
        this.f17059r = i21;
        this.f17060s = z11;
        this.f17061t = z12;
        this.f17062u = tLObject;
    }
}
