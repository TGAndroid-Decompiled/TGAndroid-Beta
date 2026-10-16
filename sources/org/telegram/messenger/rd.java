package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f17991a = 1;
    public final MessagesController f17992b;
    public final int f17993c;
    public final int d;
    public final long e;
    public final long f17994f;
    public final int f17995g;
    public final int h;
    public final int f17996i;
    public final int f17997j;
    public final int f17998k;
    public final int f17999l;
    public final int f18000m;
    public final int f18001n;
    public final long f18002o;
    public final int f18003p;
    public final boolean f18004q;
    public final int f18005r;
    public final boolean f18006s;
    public final boolean f18007t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17992b = messagesController;
        this.f17993c = i10;
        this.d = i11;
        this.e = j10;
        this.f17994f = j11;
        this.f17995g = i12;
        this.h = i13;
        this.f17996i = i14;
        this.f17997j = i15;
        this.f17998k = i16;
        this.f17999l = i17;
        this.f18000m = i18;
        this.f18001n = i19;
        this.f18002o = j12;
        this.f18003p = i20;
        this.f18004q = z10;
        this.f18005r = i21;
        this.f18006s = z11;
        this.f18007t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17991a) {
            case 0:
                boolean z10 = this.f18006s;
                boolean z11 = this.f18007t;
                int i10 = this.f17993c;
                int i11 = this.d;
                int i12 = this.f17995g;
                int i13 = this.h;
                int i14 = this.f17996i;
                int i15 = this.f17997j;
                int i16 = this.f17998k;
                int i17 = this.f17999l;
                int i18 = this.f18000m;
                int i19 = this.f18001n;
                int i20 = this.f18003p;
                int i21 = this.f18005r;
                this.f17992b.lambda$loadMessagesInternal$175(this.e, this.f17994f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18002o, i20, this.f18004q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18006s;
                boolean z13 = this.f18007t;
                int i22 = this.f17993c;
                int i23 = this.d;
                int i24 = this.f17995g;
                int i25 = this.h;
                int i26 = this.f17996i;
                int i27 = this.f17997j;
                int i28 = this.f17998k;
                int i29 = this.f17999l;
                int i30 = this.f18000m;
                int i31 = this.f18001n;
                int i32 = this.f18003p;
                int i33 = this.f18005r;
                this.f17992b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f17994f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18002o, i32, this.f18004q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17992b = messagesController;
        this.e = j10;
        this.f17994f = j11;
        this.f17993c = i10;
        this.d = i11;
        this.f17995g = i12;
        this.h = i13;
        this.f17996i = i14;
        this.f17997j = i15;
        this.f17998k = i16;
        this.f17999l = i17;
        this.f18000m = i18;
        this.f18001n = i19;
        this.f18002o = j12;
        this.f18003p = i20;
        this.f18004q = z10;
        this.f18005r = i21;
        this.f18006s = z11;
        this.f18007t = z12;
    }
}
