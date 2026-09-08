package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18594a = 1;
    public final MessagesController f18595b;
    public final int f18596c;
    public final int d;
    public final long f18597e;
    public final long f18598f;
    public final int f18599g;
    public final int h;
    public final int f18600i;
    public final int f18601j;
    public final int f18602k;
    public final int f18603l;
    public final int f18604m;
    public final int f18605n;
    public final long f18606o;
    public final int f18607p;
    public final boolean f18608q;
    public final int f18609r;
    public final boolean f18610s;
    public final boolean f18611t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18595b = messagesController;
        this.f18596c = i10;
        this.d = i11;
        this.f18597e = j3;
        this.f18598f = j10;
        this.f18599g = i12;
        this.h = i13;
        this.f18600i = i14;
        this.f18601j = i15;
        this.f18602k = i16;
        this.f18603l = i17;
        this.f18604m = i18;
        this.f18605n = i19;
        this.f18606o = j11;
        this.f18607p = i20;
        this.f18608q = z10;
        this.f18609r = i21;
        this.f18610s = z11;
        this.f18611t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18594a) {
            case 0:
                boolean z10 = this.f18610s;
                boolean z11 = this.f18611t;
                int i10 = this.f18596c;
                int i11 = this.d;
                int i12 = this.f18599g;
                int i13 = this.h;
                int i14 = this.f18600i;
                int i15 = this.f18601j;
                int i16 = this.f18602k;
                int i17 = this.f18603l;
                int i18 = this.f18604m;
                int i19 = this.f18605n;
                int i20 = this.f18607p;
                int i21 = this.f18609r;
                this.f18595b.lambda$loadMessagesInternal$176(this.f18597e, this.f18598f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18606o, i20, this.f18608q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18610s;
                boolean z13 = this.f18611t;
                int i22 = this.f18596c;
                int i23 = this.d;
                int i24 = this.f18599g;
                int i25 = this.h;
                int i26 = this.f18600i;
                int i27 = this.f18601j;
                int i28 = this.f18602k;
                int i29 = this.f18603l;
                int i30 = this.f18604m;
                int i31 = this.f18605n;
                int i32 = this.f18607p;
                int i33 = this.f18609r;
                this.f18595b.lambda$loadMessagesInternal$181(i22, i23, this.f18597e, this.f18598f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18606o, i32, this.f18608q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18595b = messagesController;
        this.f18597e = j3;
        this.f18598f = j10;
        this.f18596c = i10;
        this.d = i11;
        this.f18599g = i12;
        this.h = i13;
        this.f18600i = i14;
        this.f18601j = i15;
        this.f18602k = i16;
        this.f18603l = i17;
        this.f18604m = i18;
        this.f18605n = i19;
        this.f18606o = j11;
        this.f18607p = i20;
        this.f18608q = z10;
        this.f18609r = i21;
        this.f18610s = z11;
        this.f18611t = z12;
    }
}
