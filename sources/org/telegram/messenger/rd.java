package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f18769a = 1;
    public final MessagesController f18770b;
    public final int f18771c;
    public final int d;
    public final long f18772e;
    public final long f18773f;
    public final int f18774g;
    public final int h;
    public final int f18775i;
    public final int f18776j;
    public final int f18777k;
    public final int f18778l;
    public final int f18779m;
    public final int f18780n;
    public final long f18781o;
    public final int f18782p;
    public final boolean f18783q;
    public final int f18784r;
    public final boolean f18785s;
    public final boolean f18786t;

    public rd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18770b = messagesController;
        this.f18771c = i10;
        this.d = i11;
        this.f18772e = j3;
        this.f18773f = j10;
        this.f18774g = i12;
        this.h = i13;
        this.f18775i = i14;
        this.f18776j = i15;
        this.f18777k = i16;
        this.f18778l = i17;
        this.f18779m = i18;
        this.f18780n = i19;
        this.f18781o = j11;
        this.f18782p = i20;
        this.f18783q = z10;
        this.f18784r = i21;
        this.f18785s = z11;
        this.f18786t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18769a) {
            case 0:
                boolean z10 = this.f18785s;
                boolean z11 = this.f18786t;
                int i10 = this.f18771c;
                int i11 = this.d;
                int i12 = this.f18774g;
                int i13 = this.h;
                int i14 = this.f18775i;
                int i15 = this.f18776j;
                int i16 = this.f18777k;
                int i17 = this.f18778l;
                int i18 = this.f18779m;
                int i19 = this.f18780n;
                int i20 = this.f18782p;
                int i21 = this.f18784r;
                this.f18770b.lambda$loadMessagesInternal$175(this.f18772e, this.f18773f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18781o, i20, this.f18783q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18785s;
                boolean z13 = this.f18786t;
                int i22 = this.f18771c;
                int i23 = this.d;
                int i24 = this.f18774g;
                int i25 = this.h;
                int i26 = this.f18775i;
                int i27 = this.f18776j;
                int i28 = this.f18777k;
                int i29 = this.f18778l;
                int i30 = this.f18779m;
                int i31 = this.f18780n;
                int i32 = this.f18782p;
                int i33 = this.f18784r;
                this.f18770b.lambda$loadMessagesInternal$180(i22, i23, this.f18772e, this.f18773f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18781o, i32, this.f18783q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18770b = messagesController;
        this.f18772e = j3;
        this.f18773f = j10;
        this.f18771c = i10;
        this.d = i11;
        this.f18774g = i12;
        this.h = i13;
        this.f18775i = i14;
        this.f18776j = i15;
        this.f18777k = i16;
        this.f18778l = i17;
        this.f18779m = i18;
        this.f18780n = i19;
        this.f18781o = j11;
        this.f18782p = i20;
        this.f18783q = z10;
        this.f18784r = i21;
        this.f18785s = z11;
        this.f18786t = z12;
    }
}
