package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f17084a = 1;
    public final MessagesController f17085b;
    public final int f17086c;
    public final int d;
    public final long e;
    public final long f17087f;
    public final int f17088g;
    public final int h;
    public final int f17089i;
    public final int f17090j;
    public final int f17091k;
    public final int f17092l;
    public final int f17093m;
    public final int f17094n;
    public final long f17095o;
    public final int f17096p;
    public final boolean f17097q;
    public final int f17098r;
    public final boolean f17099s;
    public final boolean f17100t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17085b = messagesController;
        this.f17086c = i10;
        this.d = i11;
        this.e = j3;
        this.f17087f = j10;
        this.f17088g = i12;
        this.h = i13;
        this.f17089i = i14;
        this.f17090j = i15;
        this.f17091k = i16;
        this.f17092l = i17;
        this.f17093m = i18;
        this.f17094n = i19;
        this.f17095o = j11;
        this.f17096p = i20;
        this.f17097q = z10;
        this.f17098r = i21;
        this.f17099s = z11;
        this.f17100t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17084a) {
            case 0:
                boolean z10 = this.f17099s;
                boolean z11 = this.f17100t;
                int i10 = this.f17086c;
                int i11 = this.d;
                int i12 = this.f17088g;
                int i13 = this.h;
                int i14 = this.f17089i;
                int i15 = this.f17090j;
                int i16 = this.f17091k;
                int i17 = this.f17092l;
                int i18 = this.f17093m;
                int i19 = this.f17094n;
                int i20 = this.f17096p;
                int i21 = this.f17098r;
                this.f17085b.lambda$loadMessagesInternal$176(this.e, this.f17087f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17095o, i20, this.f17097q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17099s;
                boolean z13 = this.f17100t;
                int i22 = this.f17086c;
                int i23 = this.d;
                int i24 = this.f17088g;
                int i25 = this.h;
                int i26 = this.f17089i;
                int i27 = this.f17090j;
                int i28 = this.f17091k;
                int i29 = this.f17092l;
                int i30 = this.f17093m;
                int i31 = this.f17094n;
                int i32 = this.f17096p;
                int i33 = this.f17098r;
                this.f17085b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17087f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17095o, i32, this.f17097q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17085b = messagesController;
        this.e = j3;
        this.f17087f = j10;
        this.f17086c = i10;
        this.d = i11;
        this.f17088g = i12;
        this.h = i13;
        this.f17089i = i14;
        this.f17090j = i15;
        this.f17091k = i16;
        this.f17092l = i17;
        this.f17093m = i18;
        this.f17094n = i19;
        this.f17095o = j11;
        this.f17096p = i20;
        this.f17097q = z10;
        this.f17098r = i21;
        this.f17099s = z11;
        this.f17100t = z12;
    }
}
