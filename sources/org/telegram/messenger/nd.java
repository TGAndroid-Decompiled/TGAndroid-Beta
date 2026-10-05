package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f18672a = 1;
    public final MessagesController f18673b;
    public final int f18674c;
    public final int d;
    public final long f18675e;
    public final long f18676f;
    public final int f18677g;
    public final int h;
    public final int f18678i;
    public final int f18679j;
    public final int f18680k;
    public final int f18681l;
    public final int f18682m;
    public final int f18683n;
    public final long f18684o;
    public final int f18685p;
    public final boolean f18686q;
    public final int f18687r;
    public final boolean f18688s;
    public final boolean f18689t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18673b = messagesController;
        this.f18674c = i10;
        this.d = i11;
        this.f18675e = j3;
        this.f18676f = j10;
        this.f18677g = i12;
        this.h = i13;
        this.f18678i = i14;
        this.f18679j = i15;
        this.f18680k = i16;
        this.f18681l = i17;
        this.f18682m = i18;
        this.f18683n = i19;
        this.f18684o = j11;
        this.f18685p = i20;
        this.f18686q = z10;
        this.f18687r = i21;
        this.f18688s = z11;
        this.f18689t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18672a) {
            case 0:
                boolean z10 = this.f18688s;
                boolean z11 = this.f18689t;
                int i10 = this.f18674c;
                int i11 = this.d;
                int i12 = this.f18677g;
                int i13 = this.h;
                int i14 = this.f18678i;
                int i15 = this.f18679j;
                int i16 = this.f18680k;
                int i17 = this.f18681l;
                int i18 = this.f18682m;
                int i19 = this.f18683n;
                int i20 = this.f18685p;
                int i21 = this.f18687r;
                this.f18673b.lambda$loadMessagesInternal$176(this.f18675e, this.f18676f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18684o, i20, this.f18686q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18688s;
                boolean z13 = this.f18689t;
                int i22 = this.f18674c;
                int i23 = this.d;
                int i24 = this.f18677g;
                int i25 = this.h;
                int i26 = this.f18678i;
                int i27 = this.f18679j;
                int i28 = this.f18680k;
                int i29 = this.f18681l;
                int i30 = this.f18682m;
                int i31 = this.f18683n;
                int i32 = this.f18685p;
                int i33 = this.f18687r;
                this.f18673b.lambda$loadMessagesInternal$181(i22, i23, this.f18675e, this.f18676f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18684o, i32, this.f18686q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18673b = messagesController;
        this.f18675e = j3;
        this.f18676f = j10;
        this.f18674c = i10;
        this.d = i11;
        this.f18677g = i12;
        this.h = i13;
        this.f18678i = i14;
        this.f18679j = i15;
        this.f18680k = i16;
        this.f18681l = i17;
        this.f18682m = i18;
        this.f18683n = i19;
        this.f18684o = j11;
        this.f18685p = i20;
        this.f18686q = z10;
        this.f18687r = i21;
        this.f18688s = z11;
        this.f18689t = z12;
    }
}
