package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class md implements RequestDelegate {
    public final int f18963a = 1;
    public final MessagesController f18964b;
    public final int f18965c;
    public final int d;
    public final long e;
    public final long f18966f;
    public final int f18967g;
    public final int h;
    public final int f18968i;
    public final int f18969j;
    public final int f18970k;
    public final int f18971l;
    public final int f18972m;
    public final int f18973n;
    public final long f18974o;
    public final int f18975p;
    public final boolean f18976q;
    public final int f18977r;
    public final boolean f18978s;
    public final boolean f18979t;

    public md(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18964b = messagesController;
        this.f18965c = i10;
        this.d = i11;
        this.e = j10;
        this.f18966f = j11;
        this.f18967g = i12;
        this.h = i13;
        this.f18968i = i14;
        this.f18969j = i15;
        this.f18970k = i16;
        this.f18971l = i17;
        this.f18972m = i18;
        this.f18973n = i19;
        this.f18974o = j12;
        this.f18975p = i20;
        this.f18976q = z10;
        this.f18977r = i21;
        this.f18978s = z11;
        this.f18979t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18963a) {
            case 0:
                boolean z10 = this.f18978s;
                boolean z11 = this.f18979t;
                int i10 = this.f18965c;
                int i11 = this.d;
                int i12 = this.f18967g;
                int i13 = this.h;
                int i14 = this.f18968i;
                int i15 = this.f18969j;
                int i16 = this.f18970k;
                int i17 = this.f18971l;
                int i18 = this.f18972m;
                int i19 = this.f18973n;
                int i20 = this.f18975p;
                int i21 = this.f18977r;
                this.f18964b.lambda$loadMessagesInternal$175(this.e, this.f18966f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18974o, i20, this.f18976q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18978s;
                boolean z13 = this.f18979t;
                int i22 = this.f18965c;
                int i23 = this.d;
                int i24 = this.f18967g;
                int i25 = this.h;
                int i26 = this.f18968i;
                int i27 = this.f18969j;
                int i28 = this.f18970k;
                int i29 = this.f18971l;
                int i30 = this.f18972m;
                int i31 = this.f18973n;
                int i32 = this.f18975p;
                int i33 = this.f18977r;
                this.f18964b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f18966f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18974o, i32, this.f18976q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public md(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18964b = messagesController;
        this.e = j10;
        this.f18966f = j11;
        this.f18965c = i10;
        this.d = i11;
        this.f18967g = i12;
        this.h = i13;
        this.f18968i = i14;
        this.f18969j = i15;
        this.f18970k = i16;
        this.f18971l = i17;
        this.f18972m = i18;
        this.f18973n = i19;
        this.f18974o = j12;
        this.f18975p = i20;
        this.f18976q = z10;
        this.f18977r = i21;
        this.f18978s = z11;
        this.f18979t = z12;
    }
}
