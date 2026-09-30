package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f17122a = 1;
    public final MessagesController f17123b;
    public final int f17124c;
    public final int d;
    public final long e;
    public final long f17125f;
    public final int f17126g;
    public final int h;
    public final int f17127i;
    public final int f17128j;
    public final int f17129k;
    public final int f17130l;
    public final int f17131m;
    public final int f17132n;
    public final long f17133o;
    public final int f17134p;
    public final boolean f17135q;
    public final int f17136r;
    public final boolean f17137s;
    public final boolean f17138t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17123b = messagesController;
        this.f17124c = i10;
        this.d = i11;
        this.e = j3;
        this.f17125f = j10;
        this.f17126g = i12;
        this.h = i13;
        this.f17127i = i14;
        this.f17128j = i15;
        this.f17129k = i16;
        this.f17130l = i17;
        this.f17131m = i18;
        this.f17132n = i19;
        this.f17133o = j11;
        this.f17134p = i20;
        this.f17135q = z10;
        this.f17136r = i21;
        this.f17137s = z11;
        this.f17138t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17122a) {
            case 0:
                boolean z10 = this.f17137s;
                boolean z11 = this.f17138t;
                int i10 = this.f17124c;
                int i11 = this.d;
                int i12 = this.f17126g;
                int i13 = this.h;
                int i14 = this.f17127i;
                int i15 = this.f17128j;
                int i16 = this.f17129k;
                int i17 = this.f17130l;
                int i18 = this.f17131m;
                int i19 = this.f17132n;
                int i20 = this.f17134p;
                int i21 = this.f17136r;
                this.f17123b.lambda$loadMessagesInternal$176(this.e, this.f17125f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17133o, i20, this.f17135q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17137s;
                boolean z13 = this.f17138t;
                int i22 = this.f17124c;
                int i23 = this.d;
                int i24 = this.f17126g;
                int i25 = this.h;
                int i26 = this.f17127i;
                int i27 = this.f17128j;
                int i28 = this.f17129k;
                int i29 = this.f17130l;
                int i30 = this.f17131m;
                int i31 = this.f17132n;
                int i32 = this.f17134p;
                int i33 = this.f17136r;
                this.f17123b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17125f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17133o, i32, this.f17135q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17123b = messagesController;
        this.e = j3;
        this.f17125f = j10;
        this.f17124c = i10;
        this.d = i11;
        this.f17126g = i12;
        this.h = i13;
        this.f17127i = i14;
        this.f17128j = i15;
        this.f17129k = i16;
        this.f17130l = i17;
        this.f17131m = i18;
        this.f17132n = i19;
        this.f17133o = j11;
        this.f17134p = i20;
        this.f17135q = z10;
        this.f17136r = i21;
        this.f17137s = z11;
        this.f17138t = z12;
    }
}
