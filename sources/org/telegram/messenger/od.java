package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18731a = 1;
    public final MessagesController f18732b;
    public final int f18733c;
    public final int d;
    public final long f18734e;
    public final long f18735f;
    public final int f18736g;
    public final int h;
    public final int f18737i;
    public final int f18738j;
    public final int f18739k;
    public final int f18740l;
    public final int f18741m;
    public final int f18742n;
    public final long f18743o;
    public final int f18744p;
    public final boolean f18745q;
    public final int f18746r;
    public final boolean f18747s;
    public final boolean f18748t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18732b = messagesController;
        this.f18733c = i10;
        this.d = i11;
        this.f18734e = j3;
        this.f18735f = j10;
        this.f18736g = i12;
        this.h = i13;
        this.f18737i = i14;
        this.f18738j = i15;
        this.f18739k = i16;
        this.f18740l = i17;
        this.f18741m = i18;
        this.f18742n = i19;
        this.f18743o = j11;
        this.f18744p = i20;
        this.f18745q = z10;
        this.f18746r = i21;
        this.f18747s = z11;
        this.f18748t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18731a) {
            case 0:
                boolean z10 = this.f18747s;
                boolean z11 = this.f18748t;
                int i10 = this.f18733c;
                int i11 = this.d;
                int i12 = this.f18736g;
                int i13 = this.h;
                int i14 = this.f18737i;
                int i15 = this.f18738j;
                int i16 = this.f18739k;
                int i17 = this.f18740l;
                int i18 = this.f18741m;
                int i19 = this.f18742n;
                int i20 = this.f18744p;
                int i21 = this.f18746r;
                this.f18732b.lambda$loadMessagesInternal$175(this.f18734e, this.f18735f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18743o, i20, this.f18745q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18747s;
                boolean z13 = this.f18748t;
                int i22 = this.f18733c;
                int i23 = this.d;
                int i24 = this.f18736g;
                int i25 = this.h;
                int i26 = this.f18737i;
                int i27 = this.f18738j;
                int i28 = this.f18739k;
                int i29 = this.f18740l;
                int i30 = this.f18741m;
                int i31 = this.f18742n;
                int i32 = this.f18744p;
                int i33 = this.f18746r;
                this.f18732b.lambda$loadMessagesInternal$180(i22, i23, this.f18734e, this.f18735f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18743o, i32, this.f18745q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18732b = messagesController;
        this.f18734e = j3;
        this.f18735f = j10;
        this.f18733c = i10;
        this.d = i11;
        this.f18736g = i12;
        this.h = i13;
        this.f18737i = i14;
        this.f18738j = i15;
        this.f18739k = i16;
        this.f18740l = i17;
        this.f18741m = i18;
        this.f18742n = i19;
        this.f18743o = j11;
        this.f18744p = i20;
        this.f18745q = z10;
        this.f18746r = i21;
        this.f18747s = z11;
        this.f18748t = z12;
    }
}
