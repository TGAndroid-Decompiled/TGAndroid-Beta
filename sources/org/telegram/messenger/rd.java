package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f18289a = 1;
    public final MessagesController f18290b;
    public final int f18291c;
    public final int d;
    public final long e;
    public final long f18292f;
    public final int f18293g;
    public final int h;
    public final int f18294i;
    public final int f18295j;
    public final int f18296k;
    public final int f18297l;
    public final int f18298m;
    public final int f18299n;
    public final long f18300o;
    public final int f18301p;
    public final boolean f18302q;
    public final int f18303r;
    public final boolean f18304s;
    public final boolean f18305t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18290b = messagesController;
        this.f18291c = i10;
        this.d = i11;
        this.e = j10;
        this.f18292f = j11;
        this.f18293g = i12;
        this.h = i13;
        this.f18294i = i14;
        this.f18295j = i15;
        this.f18296k = i16;
        this.f18297l = i17;
        this.f18298m = i18;
        this.f18299n = i19;
        this.f18300o = j12;
        this.f18301p = i20;
        this.f18302q = z10;
        this.f18303r = i21;
        this.f18304s = z11;
        this.f18305t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18289a) {
            case 0:
                boolean z10 = this.f18304s;
                boolean z11 = this.f18305t;
                int i10 = this.f18291c;
                int i11 = this.d;
                int i12 = this.f18293g;
                int i13 = this.h;
                int i14 = this.f18294i;
                int i15 = this.f18295j;
                int i16 = this.f18296k;
                int i17 = this.f18297l;
                int i18 = this.f18298m;
                int i19 = this.f18299n;
                int i20 = this.f18301p;
                int i21 = this.f18303r;
                this.f18290b.lambda$loadMessagesInternal$175(this.e, this.f18292f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18300o, i20, this.f18302q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18304s;
                boolean z13 = this.f18305t;
                int i22 = this.f18291c;
                int i23 = this.d;
                int i24 = this.f18293g;
                int i25 = this.h;
                int i26 = this.f18294i;
                int i27 = this.f18295j;
                int i28 = this.f18296k;
                int i29 = this.f18297l;
                int i30 = this.f18298m;
                int i31 = this.f18299n;
                int i32 = this.f18301p;
                int i33 = this.f18303r;
                this.f18290b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f18292f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18300o, i32, this.f18302q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18290b = messagesController;
        this.e = j10;
        this.f18292f = j11;
        this.f18291c = i10;
        this.d = i11;
        this.f18293g = i12;
        this.h = i13;
        this.f18294i = i14;
        this.f18295j = i15;
        this.f18296k = i16;
        this.f18297l = i17;
        this.f18298m = i18;
        this.f18299n = i19;
        this.f18300o = j12;
        this.f18301p = i20;
        this.f18302q = z10;
        this.f18303r = i21;
        this.f18304s = z11;
        this.f18305t = z12;
    }
}
