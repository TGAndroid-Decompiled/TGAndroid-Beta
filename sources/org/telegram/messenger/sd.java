package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f21206a = 1;
    public final MessagesController f21207b;
    public final int f21208c;
    public final int d;
    public final long e;
    public final long f21209f;
    public final int f21210g;
    public final int h;
    public final int f21211i;
    public final int f21212j;
    public final int f21213k;
    public final int f21214l;
    public final int f21215m;
    public final int f21216n;
    public final long f21217o;
    public final int f21218p;
    public final boolean f21219q;
    public final int f21220r;
    public final boolean f21221s;
    public final boolean f21222t;

    public sd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21207b = messagesController;
        this.f21208c = i10;
        this.d = i11;
        this.e = j10;
        this.f21209f = j11;
        this.f21210g = i12;
        this.h = i13;
        this.f21211i = i14;
        this.f21212j = i15;
        this.f21213k = i16;
        this.f21214l = i17;
        this.f21215m = i18;
        this.f21216n = i19;
        this.f21217o = j12;
        this.f21218p = i20;
        this.f21219q = z10;
        this.f21220r = i21;
        this.f21221s = z11;
        this.f21222t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21206a) {
            case 0:
                boolean z10 = this.f21221s;
                boolean z11 = this.f21222t;
                int i10 = this.f21208c;
                int i11 = this.d;
                int i12 = this.f21210g;
                int i13 = this.h;
                int i14 = this.f21211i;
                int i15 = this.f21212j;
                int i16 = this.f21213k;
                int i17 = this.f21214l;
                int i18 = this.f21215m;
                int i19 = this.f21216n;
                int i20 = this.f21218p;
                int i21 = this.f21220r;
                this.f21207b.lambda$loadMessagesInternal$175(this.e, this.f21209f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f21217o, i20, this.f21219q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f21221s;
                boolean z13 = this.f21222t;
                int i22 = this.f21208c;
                int i23 = this.d;
                int i24 = this.f21210g;
                int i25 = this.h;
                int i26 = this.f21211i;
                int i27 = this.f21212j;
                int i28 = this.f21213k;
                int i29 = this.f21214l;
                int i30 = this.f21215m;
                int i31 = this.f21216n;
                int i32 = this.f21218p;
                int i33 = this.f21220r;
                this.f21207b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f21209f, i24, i25, i26, i27, i28, i29, i30, i31, this.f21217o, i32, this.f21219q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21207b = messagesController;
        this.e = j10;
        this.f21209f = j11;
        this.f21208c = i10;
        this.d = i11;
        this.f21210g = i12;
        this.h = i13;
        this.f21211i = i14;
        this.f21212j = i15;
        this.f21213k = i16;
        this.f21214l = i17;
        this.f21215m = i18;
        this.f21216n = i19;
        this.f21217o = j12;
        this.f21218p = i20;
        this.f21219q = z10;
        this.f21220r = i21;
        this.f21221s = z11;
        this.f21222t = z12;
    }
}
