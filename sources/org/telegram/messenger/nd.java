package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class nd implements RequestDelegate {

    public final int f21065a = 1;

    public final MessagesController f21066b;

    public final int f21067c;
    public final int d;

    public final long f21068e;

    public final long f21069f;

    public final int f21070g;
    public final int h;

    public final int f21071i;

    public final int f21072j;

    public final int f21073k;

    public final int f21074l;

    public final int f21075m;

    public final int f21076n;

    public final long f21077o;

    public final int f21078p;

    public final boolean f21079q;

    public final int f21080r;

    public final boolean f21081s;

    public final boolean f21082t;

    public nd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21066b = messagesController;
        this.f21067c = i10;
        this.d = i11;
        this.f21068e = j10;
        this.f21069f = j11;
        this.f21070g = i12;
        this.h = i13;
        this.f21071i = i14;
        this.f21072j = i15;
        this.f21073k = i16;
        this.f21074l = i17;
        this.f21075m = i18;
        this.f21076n = i19;
        this.f21077o = j12;
        this.f21078p = i20;
        this.f21079q = z10;
        this.f21080r = i21;
        this.f21081s = z11;
        this.f21082t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21065a) {
            case 0:
                boolean z10 = this.f21081s;
                boolean z11 = this.f21082t;
                int i10 = this.f21067c;
                int i11 = this.d;
                int i12 = this.f21070g;
                int i13 = this.h;
                int i14 = this.f21071i;
                int i15 = this.f21072j;
                int i16 = this.f21073k;
                int i17 = this.f21074l;
                int i18 = this.f21075m;
                int i19 = this.f21076n;
                int i20 = this.f21078p;
                int i21 = this.f21080r;
                this.f21066b.lambda$loadMessagesInternal$176(this.f21068e, this.f21069f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f21077o, i20, this.f21079q, i21, z10, z11, tLObject, tL_error);
                break;
            default:
                boolean z12 = this.f21081s;
                boolean z13 = this.f21082t;
                int i22 = this.f21067c;
                int i23 = this.d;
                int i24 = this.f21070g;
                int i25 = this.h;
                int i26 = this.f21071i;
                int i27 = this.f21072j;
                int i28 = this.f21073k;
                int i29 = this.f21074l;
                int i30 = this.f21075m;
                int i31 = this.f21076n;
                int i32 = this.f21078p;
                int i33 = this.f21080r;
                this.f21066b.lambda$loadMessagesInternal$181(i22, i23, this.f21068e, this.f21069f, i24, i25, i26, i27, i28, i29, i30, i31, this.f21077o, i32, this.f21079q, i33, z12, z13, tLObject, tL_error);
                break;
        }
    }

    public nd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21066b = messagesController;
        this.f21068e = j10;
        this.f21069f = j11;
        this.f21067c = i10;
        this.d = i11;
        this.f21070g = i12;
        this.h = i13;
        this.f21071i = i14;
        this.f21072j = i15;
        this.f21073k = i16;
        this.f21074l = i17;
        this.f21075m = i18;
        this.f21076n = i19;
        this.f21077o = j12;
        this.f21078p = i20;
        this.f21079q = z10;
        this.f21080r = i21;
        this.f21081s = z11;
        this.f21082t = z12;
    }
}
