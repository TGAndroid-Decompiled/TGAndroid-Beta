package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f17093a = 1;
    public final MessagesController f17094b;
    public final int f17095c;
    public final int d;
    public final long e;
    public final long f17096f;
    public final int f17097g;
    public final int h;
    public final int f17098i;
    public final int f17099j;
    public final int f17100k;
    public final int f17101l;
    public final int f17102m;
    public final int f17103n;
    public final long f17104o;
    public final int f17105p;
    public final boolean f17106q;
    public final int f17107r;
    public final boolean f17108s;
    public final boolean f17109t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17094b = messagesController;
        this.f17095c = i10;
        this.d = i11;
        this.e = j3;
        this.f17096f = j10;
        this.f17097g = i12;
        this.h = i13;
        this.f17098i = i14;
        this.f17099j = i15;
        this.f17100k = i16;
        this.f17101l = i17;
        this.f17102m = i18;
        this.f17103n = i19;
        this.f17104o = j11;
        this.f17105p = i20;
        this.f17106q = z10;
        this.f17107r = i21;
        this.f17108s = z11;
        this.f17109t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17093a) {
            case 0:
                boolean z10 = this.f17108s;
                boolean z11 = this.f17109t;
                int i10 = this.f17095c;
                int i11 = this.d;
                int i12 = this.f17097g;
                int i13 = this.h;
                int i14 = this.f17098i;
                int i15 = this.f17099j;
                int i16 = this.f17100k;
                int i17 = this.f17101l;
                int i18 = this.f17102m;
                int i19 = this.f17103n;
                int i20 = this.f17105p;
                int i21 = this.f17107r;
                this.f17094b.lambda$loadMessagesInternal$176(this.e, this.f17096f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17104o, i20, this.f17106q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17108s;
                boolean z13 = this.f17109t;
                int i22 = this.f17095c;
                int i23 = this.d;
                int i24 = this.f17097g;
                int i25 = this.h;
                int i26 = this.f17098i;
                int i27 = this.f17099j;
                int i28 = this.f17100k;
                int i29 = this.f17101l;
                int i30 = this.f17102m;
                int i31 = this.f17103n;
                int i32 = this.f17105p;
                int i33 = this.f17107r;
                this.f17094b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17096f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17104o, i32, this.f17106q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17094b = messagesController;
        this.e = j3;
        this.f17096f = j10;
        this.f17095c = i10;
        this.d = i11;
        this.f17097g = i12;
        this.h = i13;
        this.f17098i = i14;
        this.f17099j = i15;
        this.f17100k = i16;
        this.f17101l = i17;
        this.f17102m = i18;
        this.f17103n = i19;
        this.f17104o = j11;
        this.f17105p = i20;
        this.f17106q = z10;
        this.f17107r = i21;
        this.f17108s = z11;
        this.f17109t = z12;
    }
}
