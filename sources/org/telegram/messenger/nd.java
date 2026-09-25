package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f17099a = 1;
    public final MessagesController f17100b;
    public final int f17101c;
    public final int d;
    public final long e;
    public final long f17102f;
    public final int f17103g;
    public final int h;
    public final int f17104i;
    public final int f17105j;
    public final int f17106k;
    public final int f17107l;
    public final int f17108m;
    public final int f17109n;
    public final long f17110o;
    public final int f17111p;
    public final boolean f17112q;
    public final int f17113r;
    public final boolean f17114s;
    public final boolean f17115t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17100b = messagesController;
        this.f17101c = i10;
        this.d = i11;
        this.e = j3;
        this.f17102f = j10;
        this.f17103g = i12;
        this.h = i13;
        this.f17104i = i14;
        this.f17105j = i15;
        this.f17106k = i16;
        this.f17107l = i17;
        this.f17108m = i18;
        this.f17109n = i19;
        this.f17110o = j11;
        this.f17111p = i20;
        this.f17112q = z10;
        this.f17113r = i21;
        this.f17114s = z11;
        this.f17115t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17099a) {
            case 0:
                boolean z10 = this.f17114s;
                boolean z11 = this.f17115t;
                int i10 = this.f17101c;
                int i11 = this.d;
                int i12 = this.f17103g;
                int i13 = this.h;
                int i14 = this.f17104i;
                int i15 = this.f17105j;
                int i16 = this.f17106k;
                int i17 = this.f17107l;
                int i18 = this.f17108m;
                int i19 = this.f17109n;
                int i20 = this.f17111p;
                int i21 = this.f17113r;
                this.f17100b.lambda$loadMessagesInternal$176(this.e, this.f17102f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17110o, i20, this.f17112q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17114s;
                boolean z13 = this.f17115t;
                int i22 = this.f17101c;
                int i23 = this.d;
                int i24 = this.f17103g;
                int i25 = this.h;
                int i26 = this.f17104i;
                int i27 = this.f17105j;
                int i28 = this.f17106k;
                int i29 = this.f17107l;
                int i30 = this.f17108m;
                int i31 = this.f17109n;
                int i32 = this.f17111p;
                int i33 = this.f17113r;
                this.f17100b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17102f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17110o, i32, this.f17112q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17100b = messagesController;
        this.e = j3;
        this.f17102f = j10;
        this.f17101c = i10;
        this.d = i11;
        this.f17103g = i12;
        this.h = i13;
        this.f17104i = i14;
        this.f17105j = i15;
        this.f17106k = i16;
        this.f17107l = i17;
        this.f17108m = i18;
        this.f17109n = i19;
        this.f17110o = j11;
        this.f17111p = i20;
        this.f17112q = z10;
        this.f17113r = i21;
        this.f17114s = z11;
        this.f17115t = z12;
    }
}
