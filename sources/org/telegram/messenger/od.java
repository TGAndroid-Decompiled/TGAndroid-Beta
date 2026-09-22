package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17175a = 1;
    public final MessagesController f17176b;
    public final int f17177c;
    public final int d;
    public final long e;
    public final long f17178f;
    public final int f17179g;
    public final int h;
    public final int f17180i;
    public final int f17181j;
    public final int f17182k;
    public final int f17183l;
    public final int f17184m;
    public final int f17185n;
    public final long f17186o;
    public final int f17187p;
    public final boolean f17188q;
    public final int f17189r;
    public final boolean f17190s;
    public final boolean f17191t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17176b = messagesController;
        this.f17177c = i10;
        this.d = i11;
        this.e = j3;
        this.f17178f = j10;
        this.f17179g = i12;
        this.h = i13;
        this.f17180i = i14;
        this.f17181j = i15;
        this.f17182k = i16;
        this.f17183l = i17;
        this.f17184m = i18;
        this.f17185n = i19;
        this.f17186o = j11;
        this.f17187p = i20;
        this.f17188q = z10;
        this.f17189r = i21;
        this.f17190s = z11;
        this.f17191t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17175a) {
            case 0:
                boolean z10 = this.f17190s;
                boolean z11 = this.f17191t;
                int i10 = this.f17177c;
                int i11 = this.d;
                int i12 = this.f17179g;
                int i13 = this.h;
                int i14 = this.f17180i;
                int i15 = this.f17181j;
                int i16 = this.f17182k;
                int i17 = this.f17183l;
                int i18 = this.f17184m;
                int i19 = this.f17185n;
                int i20 = this.f17187p;
                int i21 = this.f17189r;
                this.f17176b.lambda$loadMessagesInternal$176(this.e, this.f17178f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17186o, i20, this.f17188q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17190s;
                boolean z13 = this.f17191t;
                int i22 = this.f17177c;
                int i23 = this.d;
                int i24 = this.f17179g;
                int i25 = this.h;
                int i26 = this.f17180i;
                int i27 = this.f17181j;
                int i28 = this.f17182k;
                int i29 = this.f17183l;
                int i30 = this.f17184m;
                int i31 = this.f17185n;
                int i32 = this.f17187p;
                int i33 = this.f17189r;
                this.f17176b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17178f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17186o, i32, this.f17188q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17176b = messagesController;
        this.e = j3;
        this.f17178f = j10;
        this.f17177c = i10;
        this.d = i11;
        this.f17179g = i12;
        this.h = i13;
        this.f17180i = i14;
        this.f17181j = i15;
        this.f17182k = i16;
        this.f17183l = i17;
        this.f17184m = i18;
        this.f17185n = i19;
        this.f17186o = j11;
        this.f17187p = i20;
        this.f17188q = z10;
        this.f17189r = i21;
        this.f17190s = z11;
        this.f17191t = z12;
    }
}
