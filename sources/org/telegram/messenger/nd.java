package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f18490a = 1;
    public final MessagesController f18491b;
    public final int f18492c;
    public final int d;
    public final long f18493e;
    public final long f18494f;
    public final int f18495g;
    public final int h;
    public final int f18496i;
    public final int f18497j;
    public final int f18498k;
    public final int f18499l;
    public final int f18500m;
    public final int f18501n;
    public final long f18502o;
    public final int f18503p;
    public final boolean f18504q;
    public final int f18505r;
    public final boolean f18506s;
    public final boolean f18507t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18491b = messagesController;
        this.f18492c = i10;
        this.d = i11;
        this.f18493e = j3;
        this.f18494f = j10;
        this.f18495g = i12;
        this.h = i13;
        this.f18496i = i14;
        this.f18497j = i15;
        this.f18498k = i16;
        this.f18499l = i17;
        this.f18500m = i18;
        this.f18501n = i19;
        this.f18502o = j11;
        this.f18503p = i20;
        this.f18504q = z10;
        this.f18505r = i21;
        this.f18506s = z11;
        this.f18507t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18490a) {
            case 0:
                boolean z10 = this.f18506s;
                boolean z11 = this.f18507t;
                int i10 = this.f18492c;
                int i11 = this.d;
                int i12 = this.f18495g;
                int i13 = this.h;
                int i14 = this.f18496i;
                int i15 = this.f18497j;
                int i16 = this.f18498k;
                int i17 = this.f18499l;
                int i18 = this.f18500m;
                int i19 = this.f18501n;
                int i20 = this.f18503p;
                int i21 = this.f18505r;
                this.f18491b.lambda$loadMessagesInternal$176(this.f18493e, this.f18494f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18502o, i20, this.f18504q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18506s;
                boolean z13 = this.f18507t;
                int i22 = this.f18492c;
                int i23 = this.d;
                int i24 = this.f18495g;
                int i25 = this.h;
                int i26 = this.f18496i;
                int i27 = this.f18497j;
                int i28 = this.f18498k;
                int i29 = this.f18499l;
                int i30 = this.f18500m;
                int i31 = this.f18501n;
                int i32 = this.f18503p;
                int i33 = this.f18505r;
                this.f18491b.lambda$loadMessagesInternal$181(i22, i23, this.f18493e, this.f18494f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18502o, i32, this.f18504q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18491b = messagesController;
        this.f18493e = j3;
        this.f18494f = j10;
        this.f18492c = i10;
        this.d = i11;
        this.f18495g = i12;
        this.h = i13;
        this.f18496i = i14;
        this.f18497j = i15;
        this.f18498k = i16;
        this.f18499l = i17;
        this.f18500m = i18;
        this.f18501n = i19;
        this.f18502o = j11;
        this.f18503p = i20;
        this.f18504q = z10;
        this.f18505r = i21;
        this.f18506s = z11;
        this.f18507t = z12;
    }
}
