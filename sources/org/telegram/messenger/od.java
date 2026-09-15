package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f16937a = 1;
    public final MessagesController f16938b;
    public final int f16939c;
    public final int d;
    public final long e;
    public final long f16940f;
    public final int f16941g;
    public final int h;
    public final int f16942i;
    public final int f16943j;
    public final int f16944k;
    public final int f16945l;
    public final int f16946m;
    public final int f16947n;
    public final long f16948o;
    public final int f16949p;
    public final boolean f16950q;
    public final int f16951r;
    public final boolean f16952s;
    public final boolean f16953t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16938b = messagesController;
        this.f16939c = i10;
        this.d = i11;
        this.e = j3;
        this.f16940f = j10;
        this.f16941g = i12;
        this.h = i13;
        this.f16942i = i14;
        this.f16943j = i15;
        this.f16944k = i16;
        this.f16945l = i17;
        this.f16946m = i18;
        this.f16947n = i19;
        this.f16948o = j11;
        this.f16949p = i20;
        this.f16950q = z10;
        this.f16951r = i21;
        this.f16952s = z11;
        this.f16953t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16937a) {
            case 0:
                boolean z10 = this.f16952s;
                boolean z11 = this.f16953t;
                int i10 = this.f16939c;
                int i11 = this.d;
                int i12 = this.f16941g;
                int i13 = this.h;
                int i14 = this.f16942i;
                int i15 = this.f16943j;
                int i16 = this.f16944k;
                int i17 = this.f16945l;
                int i18 = this.f16946m;
                int i19 = this.f16947n;
                int i20 = this.f16949p;
                int i21 = this.f16951r;
                this.f16938b.lambda$loadMessagesInternal$176(this.e, this.f16940f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f16948o, i20, this.f16950q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f16952s;
                boolean z13 = this.f16953t;
                int i22 = this.f16939c;
                int i23 = this.d;
                int i24 = this.f16941g;
                int i25 = this.h;
                int i26 = this.f16942i;
                int i27 = this.f16943j;
                int i28 = this.f16944k;
                int i29 = this.f16945l;
                int i30 = this.f16946m;
                int i31 = this.f16947n;
                int i32 = this.f16949p;
                int i33 = this.f16951r;
                this.f16938b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f16940f, i24, i25, i26, i27, i28, i29, i30, i31, this.f16948o, i32, this.f16950q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16938b = messagesController;
        this.e = j3;
        this.f16940f = j10;
        this.f16939c = i10;
        this.d = i11;
        this.f16941g = i12;
        this.h = i13;
        this.f16942i = i14;
        this.f16943j = i15;
        this.f16944k = i16;
        this.f16945l = i17;
        this.f16946m = i18;
        this.f16947n = i19;
        this.f16948o = j11;
        this.f16949p = i20;
        this.f16950q = z10;
        this.f16951r = i21;
        this.f16952s = z11;
        this.f16953t = z12;
    }
}
