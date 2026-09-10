package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd implements RequestDelegate {
    public final int f16866a = 1;
    public final MessagesController f16867b;
    public final int f16868c;
    public final int d;
    public final long e;
    public final long f16869f;
    public final int f16870g;
    public final int h;
    public final int f16871i;
    public final int f16872j;
    public final int f16873k;
    public final int f16874l;
    public final int f16875m;
    public final int f16876n;
    public final long f16877o;
    public final int f16878p;
    public final boolean f16879q;
    public final int f16880r;
    public final boolean f16881s;
    public final boolean f16882t;

    public wd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16867b = messagesController;
        this.f16868c = i10;
        this.d = i11;
        this.e = j3;
        this.f16869f = j10;
        this.f16870g = i12;
        this.h = i13;
        this.f16871i = i14;
        this.f16872j = i15;
        this.f16873k = i16;
        this.f16874l = i17;
        this.f16875m = i18;
        this.f16876n = i19;
        this.f16877o = j11;
        this.f16878p = i20;
        this.f16879q = z10;
        this.f16880r = i21;
        this.f16881s = z11;
        this.f16882t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16866a) {
            case 0:
                boolean z10 = this.f16881s;
                boolean z11 = this.f16882t;
                int i10 = this.f16868c;
                int i11 = this.d;
                int i12 = this.f16870g;
                int i13 = this.h;
                int i14 = this.f16871i;
                int i15 = this.f16872j;
                int i16 = this.f16873k;
                int i17 = this.f16874l;
                int i18 = this.f16875m;
                int i19 = this.f16876n;
                int i20 = this.f16878p;
                int i21 = this.f16880r;
                this.f16867b.lambda$loadMessagesInternal$176(this.e, this.f16869f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f16877o, i20, this.f16879q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f16881s;
                boolean z13 = this.f16882t;
                int i22 = this.f16868c;
                int i23 = this.d;
                int i24 = this.f16870g;
                int i25 = this.h;
                int i26 = this.f16871i;
                int i27 = this.f16872j;
                int i28 = this.f16873k;
                int i29 = this.f16874l;
                int i30 = this.f16875m;
                int i31 = this.f16876n;
                int i32 = this.f16878p;
                int i33 = this.f16880r;
                this.f16867b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f16869f, i24, i25, i26, i27, i28, i29, i30, i31, this.f16877o, i32, this.f16879q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public wd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16867b = messagesController;
        this.e = j3;
        this.f16869f = j10;
        this.f16868c = i10;
        this.d = i11;
        this.f16870g = i12;
        this.h = i13;
        this.f16871i = i14;
        this.f16872j = i15;
        this.f16873k = i16;
        this.f16874l = i17;
        this.f16875m = i18;
        this.f16876n = i19;
        this.f16877o = j11;
        this.f16878p = i20;
        this.f16879q = z10;
        this.f16880r = i21;
        this.f16881s = z11;
        this.f16882t = z12;
    }
}
