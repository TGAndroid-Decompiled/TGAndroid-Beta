package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f21135a = 1;
    public final MessagesController f21136b;
    public final int f21137c;
    public final int d;
    public final long e;
    public final long f21138f;
    public final int f21139g;
    public final int h;
    public final int f21140i;
    public final int f21141j;
    public final int f21142k;
    public final int f21143l;
    public final int f21144m;
    public final int f21145n;
    public final long f21146o;
    public final int f21147p;
    public final boolean f21148q;
    public final int f21149r;
    public final boolean f21150s;
    public final boolean f21151t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21136b = messagesController;
        this.f21137c = i10;
        this.d = i11;
        this.e = j10;
        this.f21138f = j11;
        this.f21139g = i12;
        this.h = i13;
        this.f21140i = i14;
        this.f21141j = i15;
        this.f21142k = i16;
        this.f21143l = i17;
        this.f21144m = i18;
        this.f21145n = i19;
        this.f21146o = j12;
        this.f21147p = i20;
        this.f21148q = z10;
        this.f21149r = i21;
        this.f21150s = z11;
        this.f21151t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21135a) {
            case 0:
                boolean z10 = this.f21150s;
                boolean z11 = this.f21151t;
                int i10 = this.f21137c;
                int i11 = this.d;
                int i12 = this.f21139g;
                int i13 = this.h;
                int i14 = this.f21140i;
                int i15 = this.f21141j;
                int i16 = this.f21142k;
                int i17 = this.f21143l;
                int i18 = this.f21144m;
                int i19 = this.f21145n;
                int i20 = this.f21147p;
                int i21 = this.f21149r;
                this.f21136b.lambda$loadMessagesInternal$175(this.e, this.f21138f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f21146o, i20, this.f21148q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f21150s;
                boolean z13 = this.f21151t;
                int i22 = this.f21137c;
                int i23 = this.d;
                int i24 = this.f21139g;
                int i25 = this.h;
                int i26 = this.f21140i;
                int i27 = this.f21141j;
                int i28 = this.f21142k;
                int i29 = this.f21143l;
                int i30 = this.f21144m;
                int i31 = this.f21145n;
                int i32 = this.f21147p;
                int i33 = this.f21149r;
                this.f21136b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f21138f, i24, i25, i26, i27, i28, i29, i30, i31, this.f21146o, i32, this.f21148q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21136b = messagesController;
        this.e = j10;
        this.f21138f = j11;
        this.f21137c = i10;
        this.d = i11;
        this.f21139g = i12;
        this.h = i13;
        this.f21140i = i14;
        this.f21141j = i15;
        this.f21142k = i16;
        this.f21143l = i17;
        this.f21144m = i18;
        this.f21145n = i19;
        this.f21146o = j12;
        this.f21147p = i20;
        this.f21148q = z10;
        this.f21149r = i21;
        this.f21150s = z11;
        this.f21151t = z12;
    }
}
