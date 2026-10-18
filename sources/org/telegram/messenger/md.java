package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class md implements RequestDelegate {
    public final int f18969a = 1;
    public final MessagesController f18970b;
    public final int f18971c;
    public final int d;
    public final long e;
    public final long f18972f;
    public final int f18973g;
    public final int h;
    public final int f18974i;
    public final int f18975j;
    public final int f18976k;
    public final int f18977l;
    public final int f18978m;
    public final int f18979n;
    public final long f18980o;
    public final int f18981p;
    public final boolean f18982q;
    public final int f18983r;
    public final boolean f18984s;
    public final boolean f18985t;

    public md(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18970b = messagesController;
        this.f18971c = i10;
        this.d = i11;
        this.e = j10;
        this.f18972f = j11;
        this.f18973g = i12;
        this.h = i13;
        this.f18974i = i14;
        this.f18975j = i15;
        this.f18976k = i16;
        this.f18977l = i17;
        this.f18978m = i18;
        this.f18979n = i19;
        this.f18980o = j12;
        this.f18981p = i20;
        this.f18982q = z10;
        this.f18983r = i21;
        this.f18984s = z11;
        this.f18985t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18969a) {
            case 0:
                boolean z10 = this.f18984s;
                boolean z11 = this.f18985t;
                int i10 = this.f18971c;
                int i11 = this.d;
                int i12 = this.f18973g;
                int i13 = this.h;
                int i14 = this.f18974i;
                int i15 = this.f18975j;
                int i16 = this.f18976k;
                int i17 = this.f18977l;
                int i18 = this.f18978m;
                int i19 = this.f18979n;
                int i20 = this.f18981p;
                int i21 = this.f18983r;
                this.f18970b.lambda$loadMessagesInternal$175(this.e, this.f18972f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18980o, i20, this.f18982q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18984s;
                boolean z13 = this.f18985t;
                int i22 = this.f18971c;
                int i23 = this.d;
                int i24 = this.f18973g;
                int i25 = this.h;
                int i26 = this.f18974i;
                int i27 = this.f18975j;
                int i28 = this.f18976k;
                int i29 = this.f18977l;
                int i30 = this.f18978m;
                int i31 = this.f18979n;
                int i32 = this.f18981p;
                int i33 = this.f18983r;
                this.f18970b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f18972f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18980o, i32, this.f18982q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public md(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18970b = messagesController;
        this.e = j10;
        this.f18972f = j11;
        this.f18971c = i10;
        this.d = i11;
        this.f18973g = i12;
        this.h = i13;
        this.f18974i = i14;
        this.f18975j = i15;
        this.f18976k = i16;
        this.f18977l = i17;
        this.f18978m = i18;
        this.f18979n = i19;
        this.f18980o = j12;
        this.f18981p = i20;
        this.f18982q = z10;
        this.f18983r = i21;
        this.f18984s = z11;
        this.f18985t = z12;
    }
}
