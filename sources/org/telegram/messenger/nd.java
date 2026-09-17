package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f18517a = 1;
    public final MessagesController f18518b;
    public final int f18519c;
    public final int d;
    public final long f18520e;
    public final long f18521f;
    public final int f18522g;
    public final int h;
    public final int f18523i;
    public final int f18524j;
    public final int f18525k;
    public final int f18526l;
    public final int f18527m;
    public final int f18528n;
    public final long f18529o;
    public final int f18530p;
    public final boolean f18531q;
    public final int f18532r;
    public final boolean f18533s;
    public final boolean f18534t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18518b = messagesController;
        this.f18519c = i10;
        this.d = i11;
        this.f18520e = j3;
        this.f18521f = j10;
        this.f18522g = i12;
        this.h = i13;
        this.f18523i = i14;
        this.f18524j = i15;
        this.f18525k = i16;
        this.f18526l = i17;
        this.f18527m = i18;
        this.f18528n = i19;
        this.f18529o = j11;
        this.f18530p = i20;
        this.f18531q = z10;
        this.f18532r = i21;
        this.f18533s = z11;
        this.f18534t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18517a) {
            case 0:
                boolean z10 = this.f18533s;
                boolean z11 = this.f18534t;
                int i10 = this.f18519c;
                int i11 = this.d;
                int i12 = this.f18522g;
                int i13 = this.h;
                int i14 = this.f18523i;
                int i15 = this.f18524j;
                int i16 = this.f18525k;
                int i17 = this.f18526l;
                int i18 = this.f18527m;
                int i19 = this.f18528n;
                int i20 = this.f18530p;
                int i21 = this.f18532r;
                this.f18518b.lambda$loadMessagesInternal$176(this.f18520e, this.f18521f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18529o, i20, this.f18531q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18533s;
                boolean z13 = this.f18534t;
                int i22 = this.f18519c;
                int i23 = this.d;
                int i24 = this.f18522g;
                int i25 = this.h;
                int i26 = this.f18523i;
                int i27 = this.f18524j;
                int i28 = this.f18525k;
                int i29 = this.f18526l;
                int i30 = this.f18527m;
                int i31 = this.f18528n;
                int i32 = this.f18530p;
                int i33 = this.f18532r;
                this.f18518b.lambda$loadMessagesInternal$181(i22, i23, this.f18520e, this.f18521f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18529o, i32, this.f18531q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18518b = messagesController;
        this.f18520e = j3;
        this.f18521f = j10;
        this.f18519c = i10;
        this.d = i11;
        this.f18522g = i12;
        this.h = i13;
        this.f18523i = i14;
        this.f18524j = i15;
        this.f18525k = i16;
        this.f18526l = i17;
        this.f18527m = i18;
        this.f18528n = i19;
        this.f18529o = j11;
        this.f18530p = i20;
        this.f18531q = z10;
        this.f18532r = i21;
        this.f18533s = z11;
        this.f18534t = z12;
    }
}
