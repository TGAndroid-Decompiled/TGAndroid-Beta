package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f16933a = 1;
    public final MessagesController f16934b;
    public final int f16935c;
    public final int d;
    public final long e;
    public final long f16936f;
    public final int f16937g;
    public final int h;
    public final int f16938i;
    public final int f16939j;
    public final int f16940k;
    public final int f16941l;
    public final int f16942m;
    public final int f16943n;
    public final long f16944o;
    public final int f16945p;
    public final boolean f16946q;
    public final int f16947r;
    public final boolean f16948s;
    public final boolean f16949t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16934b = messagesController;
        this.f16935c = i10;
        this.d = i11;
        this.e = j3;
        this.f16936f = j10;
        this.f16937g = i12;
        this.h = i13;
        this.f16938i = i14;
        this.f16939j = i15;
        this.f16940k = i16;
        this.f16941l = i17;
        this.f16942m = i18;
        this.f16943n = i19;
        this.f16944o = j11;
        this.f16945p = i20;
        this.f16946q = z10;
        this.f16947r = i21;
        this.f16948s = z11;
        this.f16949t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16933a) {
            case 0:
                boolean z10 = this.f16948s;
                boolean z11 = this.f16949t;
                int i10 = this.f16935c;
                int i11 = this.d;
                int i12 = this.f16937g;
                int i13 = this.h;
                int i14 = this.f16938i;
                int i15 = this.f16939j;
                int i16 = this.f16940k;
                int i17 = this.f16941l;
                int i18 = this.f16942m;
                int i19 = this.f16943n;
                int i20 = this.f16945p;
                int i21 = this.f16947r;
                this.f16934b.lambda$loadMessagesInternal$176(this.e, this.f16936f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f16944o, i20, this.f16946q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f16948s;
                boolean z13 = this.f16949t;
                int i22 = this.f16935c;
                int i23 = this.d;
                int i24 = this.f16937g;
                int i25 = this.h;
                int i26 = this.f16938i;
                int i27 = this.f16939j;
                int i28 = this.f16940k;
                int i29 = this.f16941l;
                int i30 = this.f16942m;
                int i31 = this.f16943n;
                int i32 = this.f16945p;
                int i33 = this.f16947r;
                this.f16934b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f16936f, i24, i25, i26, i27, i28, i29, i30, i31, this.f16944o, i32, this.f16946q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16934b = messagesController;
        this.e = j3;
        this.f16936f = j10;
        this.f16935c = i10;
        this.d = i11;
        this.f16937g = i12;
        this.h = i13;
        this.f16938i = i14;
        this.f16939j = i15;
        this.f16940k = i16;
        this.f16941l = i17;
        this.f16942m = i18;
        this.f16943n = i19;
        this.f16944o = j11;
        this.f16945p = i20;
        this.f16946q = z10;
        this.f16947r = i21;
        this.f16948s = z11;
        this.f16949t = z12;
    }
}
