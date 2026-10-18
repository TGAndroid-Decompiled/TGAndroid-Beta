package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f19045a = 1;
    public final MessagesController f19046b;
    public final int f19047c;
    public final int d;
    public final long e;
    public final long f19048f;
    public final int f19049g;
    public final int h;
    public final int f19050i;
    public final int f19051j;
    public final int f19052k;
    public final int f19053l;
    public final int f19054m;
    public final int f19055n;
    public final long f19056o;
    public final int f19057p;
    public final boolean f19058q;
    public final int f19059r;
    public final boolean f19060s;
    public final boolean f19061t;

    public nd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19046b = messagesController;
        this.f19047c = i10;
        this.d = i11;
        this.e = j10;
        this.f19048f = j11;
        this.f19049g = i12;
        this.h = i13;
        this.f19050i = i14;
        this.f19051j = i15;
        this.f19052k = i16;
        this.f19053l = i17;
        this.f19054m = i18;
        this.f19055n = i19;
        this.f19056o = j12;
        this.f19057p = i20;
        this.f19058q = z10;
        this.f19059r = i21;
        this.f19060s = z11;
        this.f19061t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19045a) {
            case 0:
                boolean z10 = this.f19060s;
                boolean z11 = this.f19061t;
                int i10 = this.f19047c;
                int i11 = this.d;
                int i12 = this.f19049g;
                int i13 = this.h;
                int i14 = this.f19050i;
                int i15 = this.f19051j;
                int i16 = this.f19052k;
                int i17 = this.f19053l;
                int i18 = this.f19054m;
                int i19 = this.f19055n;
                int i20 = this.f19057p;
                int i21 = this.f19059r;
                this.f19046b.lambda$loadMessagesInternal$175(this.e, this.f19048f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19056o, i20, this.f19058q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19060s;
                boolean z13 = this.f19061t;
                int i22 = this.f19047c;
                int i23 = this.d;
                int i24 = this.f19049g;
                int i25 = this.h;
                int i26 = this.f19050i;
                int i27 = this.f19051j;
                int i28 = this.f19052k;
                int i29 = this.f19053l;
                int i30 = this.f19054m;
                int i31 = this.f19055n;
                int i32 = this.f19057p;
                int i33 = this.f19059r;
                this.f19046b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19048f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19056o, i32, this.f19058q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19046b = messagesController;
        this.e = j10;
        this.f19048f = j11;
        this.f19047c = i10;
        this.d = i11;
        this.f19049g = i12;
        this.h = i13;
        this.f19050i = i14;
        this.f19051j = i15;
        this.f19052k = i16;
        this.f19053l = i17;
        this.f19054m = i18;
        this.f19055n = i19;
        this.f19056o = j12;
        this.f19057p = i20;
        this.f19058q = z10;
        this.f19059r = i21;
        this.f19060s = z11;
        this.f19061t = z12;
    }
}
