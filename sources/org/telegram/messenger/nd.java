package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f19048a = 1;
    public final MessagesController f19049b;
    public final int f19050c;
    public final int d;
    public final long e;
    public final long f19051f;
    public final int f19052g;
    public final int h;
    public final int f19053i;
    public final int f19054j;
    public final int f19055k;
    public final int f19056l;
    public final int f19057m;
    public final int f19058n;
    public final long f19059o;
    public final int f19060p;
    public final boolean f19061q;
    public final int f19062r;
    public final boolean f19063s;
    public final boolean f19064t;

    public nd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19049b = messagesController;
        this.f19050c = i10;
        this.d = i11;
        this.e = j10;
        this.f19051f = j11;
        this.f19052g = i12;
        this.h = i13;
        this.f19053i = i14;
        this.f19054j = i15;
        this.f19055k = i16;
        this.f19056l = i17;
        this.f19057m = i18;
        this.f19058n = i19;
        this.f19059o = j12;
        this.f19060p = i20;
        this.f19061q = z10;
        this.f19062r = i21;
        this.f19063s = z11;
        this.f19064t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19048a) {
            case 0:
                boolean z10 = this.f19063s;
                boolean z11 = this.f19064t;
                int i10 = this.f19050c;
                int i11 = this.d;
                int i12 = this.f19052g;
                int i13 = this.h;
                int i14 = this.f19053i;
                int i15 = this.f19054j;
                int i16 = this.f19055k;
                int i17 = this.f19056l;
                int i18 = this.f19057m;
                int i19 = this.f19058n;
                int i20 = this.f19060p;
                int i21 = this.f19062r;
                this.f19049b.lambda$loadMessagesInternal$175(this.e, this.f19051f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19059o, i20, this.f19061q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19063s;
                boolean z13 = this.f19064t;
                int i22 = this.f19050c;
                int i23 = this.d;
                int i24 = this.f19052g;
                int i25 = this.h;
                int i26 = this.f19053i;
                int i27 = this.f19054j;
                int i28 = this.f19055k;
                int i29 = this.f19056l;
                int i30 = this.f19057m;
                int i31 = this.f19058n;
                int i32 = this.f19060p;
                int i33 = this.f19062r;
                this.f19049b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19051f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19059o, i32, this.f19061q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19049b = messagesController;
        this.e = j10;
        this.f19051f = j11;
        this.f19050c = i10;
        this.d = i11;
        this.f19052g = i12;
        this.h = i13;
        this.f19053i = i14;
        this.f19054j = i15;
        this.f19055k = i16;
        this.f19056l = i17;
        this.f19057m = i18;
        this.f19058n = i19;
        this.f19059o = j12;
        this.f19060p = i20;
        this.f19061q = z10;
        this.f19062r = i21;
        this.f19063s = z11;
        this.f19064t = z12;
    }
}
