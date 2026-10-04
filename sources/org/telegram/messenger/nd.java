package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f18676a = 1;
    public final MessagesController f18677b;
    public final int f18678c;
    public final int d;
    public final long f18679e;
    public final long f18680f;
    public final int f18681g;
    public final int h;
    public final int f18682i;
    public final int f18683j;
    public final int f18684k;
    public final int f18685l;
    public final int f18686m;
    public final int f18687n;
    public final long f18688o;
    public final int f18689p;
    public final boolean f18690q;
    public final int f18691r;
    public final boolean f18692s;
    public final boolean f18693t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18677b = messagesController;
        this.f18678c = i10;
        this.d = i11;
        this.f18679e = j3;
        this.f18680f = j10;
        this.f18681g = i12;
        this.h = i13;
        this.f18682i = i14;
        this.f18683j = i15;
        this.f18684k = i16;
        this.f18685l = i17;
        this.f18686m = i18;
        this.f18687n = i19;
        this.f18688o = j11;
        this.f18689p = i20;
        this.f18690q = z10;
        this.f18691r = i21;
        this.f18692s = z11;
        this.f18693t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18676a) {
            case 0:
                boolean z10 = this.f18692s;
                boolean z11 = this.f18693t;
                int i10 = this.f18678c;
                int i11 = this.d;
                int i12 = this.f18681g;
                int i13 = this.h;
                int i14 = this.f18682i;
                int i15 = this.f18683j;
                int i16 = this.f18684k;
                int i17 = this.f18685l;
                int i18 = this.f18686m;
                int i19 = this.f18687n;
                int i20 = this.f18689p;
                int i21 = this.f18691r;
                this.f18677b.lambda$loadMessagesInternal$176(this.f18679e, this.f18680f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18688o, i20, this.f18690q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18692s;
                boolean z13 = this.f18693t;
                int i22 = this.f18678c;
                int i23 = this.d;
                int i24 = this.f18681g;
                int i25 = this.h;
                int i26 = this.f18682i;
                int i27 = this.f18683j;
                int i28 = this.f18684k;
                int i29 = this.f18685l;
                int i30 = this.f18686m;
                int i31 = this.f18687n;
                int i32 = this.f18689p;
                int i33 = this.f18691r;
                this.f18677b.lambda$loadMessagesInternal$181(i22, i23, this.f18679e, this.f18680f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18688o, i32, this.f18690q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18677b = messagesController;
        this.f18679e = j3;
        this.f18680f = j10;
        this.f18678c = i10;
        this.d = i11;
        this.f18681g = i12;
        this.h = i13;
        this.f18682i = i14;
        this.f18683j = i15;
        this.f18684k = i16;
        this.f18685l = i17;
        this.f18686m = i18;
        this.f18687n = i19;
        this.f18688o = j11;
        this.f18689p = i20;
        this.f18690q = z10;
        this.f18691r = i21;
        this.f18692s = z11;
        this.f18693t = z12;
    }
}
