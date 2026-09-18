package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17113a = 1;
    public final MessagesController f17114b;
    public final int f17115c;
    public final int d;
    public final long e;
    public final long f17116f;
    public final int f17117g;
    public final int h;
    public final int f17118i;
    public final int f17119j;
    public final int f17120k;
    public final int f17121l;
    public final int f17122m;
    public final int f17123n;
    public final long f17124o;
    public final int f17125p;
    public final boolean f17126q;
    public final int f17127r;
    public final boolean f17128s;
    public final boolean f17129t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17114b = messagesController;
        this.f17115c = i10;
        this.d = i11;
        this.e = j3;
        this.f17116f = j10;
        this.f17117g = i12;
        this.h = i13;
        this.f17118i = i14;
        this.f17119j = i15;
        this.f17120k = i16;
        this.f17121l = i17;
        this.f17122m = i18;
        this.f17123n = i19;
        this.f17124o = j11;
        this.f17125p = i20;
        this.f17126q = z10;
        this.f17127r = i21;
        this.f17128s = z11;
        this.f17129t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17113a) {
            case 0:
                boolean z10 = this.f17128s;
                boolean z11 = this.f17129t;
                int i10 = this.f17115c;
                int i11 = this.d;
                int i12 = this.f17117g;
                int i13 = this.h;
                int i14 = this.f17118i;
                int i15 = this.f17119j;
                int i16 = this.f17120k;
                int i17 = this.f17121l;
                int i18 = this.f17122m;
                int i19 = this.f17123n;
                int i20 = this.f17125p;
                int i21 = this.f17127r;
                this.f17114b.lambda$loadMessagesInternal$176(this.e, this.f17116f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17124o, i20, this.f17126q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17128s;
                boolean z13 = this.f17129t;
                int i22 = this.f17115c;
                int i23 = this.d;
                int i24 = this.f17117g;
                int i25 = this.h;
                int i26 = this.f17118i;
                int i27 = this.f17119j;
                int i28 = this.f17120k;
                int i29 = this.f17121l;
                int i30 = this.f17122m;
                int i31 = this.f17123n;
                int i32 = this.f17125p;
                int i33 = this.f17127r;
                this.f17114b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17116f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17124o, i32, this.f17126q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17114b = messagesController;
        this.e = j3;
        this.f17116f = j10;
        this.f17115c = i10;
        this.d = i11;
        this.f17117g = i12;
        this.h = i13;
        this.f17118i = i14;
        this.f17119j = i15;
        this.f17120k = i16;
        this.f17121l = i17;
        this.f17122m = i18;
        this.f17123n = i19;
        this.f17124o = j11;
        this.f17125p = i20;
        this.f17126q = z10;
        this.f17127r = i21;
        this.f17128s = z11;
        this.f17129t = z12;
    }
}
