package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f17106a = 1;
    public final MessagesController f17107b;
    public final int f17108c;
    public final int d;
    public final long e;
    public final long f17109f;
    public final int f17110g;
    public final int h;
    public final int f17111i;
    public final int f17112j;
    public final int f17113k;
    public final int f17114l;
    public final int f17115m;
    public final int f17116n;
    public final long f17117o;
    public final int f17118p;
    public final boolean f17119q;
    public final int f17120r;
    public final boolean f17121s;
    public final boolean f17122t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17107b = messagesController;
        this.f17108c = i10;
        this.d = i11;
        this.e = j3;
        this.f17109f = j10;
        this.f17110g = i12;
        this.h = i13;
        this.f17111i = i14;
        this.f17112j = i15;
        this.f17113k = i16;
        this.f17114l = i17;
        this.f17115m = i18;
        this.f17116n = i19;
        this.f17117o = j11;
        this.f17118p = i20;
        this.f17119q = z10;
        this.f17120r = i21;
        this.f17121s = z11;
        this.f17122t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17106a) {
            case 0:
                boolean z10 = this.f17121s;
                boolean z11 = this.f17122t;
                int i10 = this.f17108c;
                int i11 = this.d;
                int i12 = this.f17110g;
                int i13 = this.h;
                int i14 = this.f17111i;
                int i15 = this.f17112j;
                int i16 = this.f17113k;
                int i17 = this.f17114l;
                int i18 = this.f17115m;
                int i19 = this.f17116n;
                int i20 = this.f17118p;
                int i21 = this.f17120r;
                this.f17107b.lambda$loadMessagesInternal$176(this.e, this.f17109f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17117o, i20, this.f17119q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17121s;
                boolean z13 = this.f17122t;
                int i22 = this.f17108c;
                int i23 = this.d;
                int i24 = this.f17110g;
                int i25 = this.h;
                int i26 = this.f17111i;
                int i27 = this.f17112j;
                int i28 = this.f17113k;
                int i29 = this.f17114l;
                int i30 = this.f17115m;
                int i31 = this.f17116n;
                int i32 = this.f17118p;
                int i33 = this.f17120r;
                this.f17107b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17109f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17117o, i32, this.f17119q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17107b = messagesController;
        this.e = j3;
        this.f17109f = j10;
        this.f17108c = i10;
        this.d = i11;
        this.f17110g = i12;
        this.h = i13;
        this.f17111i = i14;
        this.f17112j = i15;
        this.f17113k = i16;
        this.f17114l = i17;
        this.f17115m = i18;
        this.f17116n = i19;
        this.f17117o = j11;
        this.f17118p = i20;
        this.f17119q = z10;
        this.f17120r = i21;
        this.f17121s = z11;
        this.f17122t = z12;
    }
}
