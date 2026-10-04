package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f18677a = 1;
    public final MessagesController f18678b;
    public final int f18679c;
    public final int d;
    public final long f18680e;
    public final long f18681f;
    public final int f18682g;
    public final int h;
    public final int f18683i;
    public final int f18684j;
    public final int f18685k;
    public final int f18686l;
    public final int f18687m;
    public final int f18688n;
    public final long f18689o;
    public final int f18690p;
    public final boolean f18691q;
    public final int f18692r;
    public final boolean f18693s;
    public final boolean f18694t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18678b = messagesController;
        this.f18679c = i10;
        this.d = i11;
        this.f18680e = j3;
        this.f18681f = j10;
        this.f18682g = i12;
        this.h = i13;
        this.f18683i = i14;
        this.f18684j = i15;
        this.f18685k = i16;
        this.f18686l = i17;
        this.f18687m = i18;
        this.f18688n = i19;
        this.f18689o = j11;
        this.f18690p = i20;
        this.f18691q = z10;
        this.f18692r = i21;
        this.f18693s = z11;
        this.f18694t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18677a) {
            case 0:
                boolean z10 = this.f18693s;
                boolean z11 = this.f18694t;
                int i10 = this.f18679c;
                int i11 = this.d;
                int i12 = this.f18682g;
                int i13 = this.h;
                int i14 = this.f18683i;
                int i15 = this.f18684j;
                int i16 = this.f18685k;
                int i17 = this.f18686l;
                int i18 = this.f18687m;
                int i19 = this.f18688n;
                int i20 = this.f18690p;
                int i21 = this.f18692r;
                this.f18678b.lambda$loadMessagesInternal$176(this.f18680e, this.f18681f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18689o, i20, this.f18691q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18693s;
                boolean z13 = this.f18694t;
                int i22 = this.f18679c;
                int i23 = this.d;
                int i24 = this.f18682g;
                int i25 = this.h;
                int i26 = this.f18683i;
                int i27 = this.f18684j;
                int i28 = this.f18685k;
                int i29 = this.f18686l;
                int i30 = this.f18687m;
                int i31 = this.f18688n;
                int i32 = this.f18690p;
                int i33 = this.f18692r;
                this.f18678b.lambda$loadMessagesInternal$181(i22, i23, this.f18680e, this.f18681f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18689o, i32, this.f18691q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18678b = messagesController;
        this.f18680e = j3;
        this.f18681f = j10;
        this.f18679c = i10;
        this.d = i11;
        this.f18682g = i12;
        this.h = i13;
        this.f18683i = i14;
        this.f18684j = i15;
        this.f18685k = i16;
        this.f18686l = i17;
        this.f18687m = i18;
        this.f18688n = i19;
        this.f18689o = j11;
        this.f18690p = i20;
        this.f18691q = z10;
        this.f18692r = i21;
        this.f18693s = z11;
        this.f18694t = z12;
    }
}
