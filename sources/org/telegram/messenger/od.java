package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18567a = 1;
    public final MessagesController f18568b;
    public final int f18569c;
    public final int d;
    public final long f18570e;
    public final long f18571f;
    public final int f18572g;
    public final int h;
    public final int f18573i;
    public final int f18574j;
    public final int f18575k;
    public final int f18576l;
    public final int f18577m;
    public final int f18578n;
    public final long f18579o;
    public final int f18580p;
    public final boolean f18581q;
    public final int f18582r;
    public final boolean f18583s;
    public final boolean f18584t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18568b = messagesController;
        this.f18569c = i10;
        this.d = i11;
        this.f18570e = j3;
        this.f18571f = j10;
        this.f18572g = i12;
        this.h = i13;
        this.f18573i = i14;
        this.f18574j = i15;
        this.f18575k = i16;
        this.f18576l = i17;
        this.f18577m = i18;
        this.f18578n = i19;
        this.f18579o = j11;
        this.f18580p = i20;
        this.f18581q = z10;
        this.f18582r = i21;
        this.f18583s = z11;
        this.f18584t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18567a) {
            case 0:
                boolean z10 = this.f18583s;
                boolean z11 = this.f18584t;
                int i10 = this.f18569c;
                int i11 = this.d;
                int i12 = this.f18572g;
                int i13 = this.h;
                int i14 = this.f18573i;
                int i15 = this.f18574j;
                int i16 = this.f18575k;
                int i17 = this.f18576l;
                int i18 = this.f18577m;
                int i19 = this.f18578n;
                int i20 = this.f18580p;
                int i21 = this.f18582r;
                this.f18568b.lambda$loadMessagesInternal$176(this.f18570e, this.f18571f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18579o, i20, this.f18581q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18583s;
                boolean z13 = this.f18584t;
                int i22 = this.f18569c;
                int i23 = this.d;
                int i24 = this.f18572g;
                int i25 = this.h;
                int i26 = this.f18573i;
                int i27 = this.f18574j;
                int i28 = this.f18575k;
                int i29 = this.f18576l;
                int i30 = this.f18577m;
                int i31 = this.f18578n;
                int i32 = this.f18580p;
                int i33 = this.f18582r;
                this.f18568b.lambda$loadMessagesInternal$181(i22, i23, this.f18570e, this.f18571f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18579o, i32, this.f18581q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18568b = messagesController;
        this.f18570e = j3;
        this.f18571f = j10;
        this.f18569c = i10;
        this.d = i11;
        this.f18572g = i12;
        this.h = i13;
        this.f18573i = i14;
        this.f18574j = i15;
        this.f18575k = i16;
        this.f18576l = i17;
        this.f18577m = i18;
        this.f18578n = i19;
        this.f18579o = j11;
        this.f18580p = i20;
        this.f18581q = z10;
        this.f18582r = i21;
        this.f18583s = z11;
        this.f18584t = z12;
    }
}
