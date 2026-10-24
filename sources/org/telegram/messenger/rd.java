package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f19453a = 1;
    public final MessagesController f19454b;
    public final int f19455c;
    public final int d;
    public final long e;
    public final long f19456f;
    public final int f19457g;
    public final int h;
    public final int f19458i;
    public final int f19459j;
    public final int f19460k;
    public final int f19461l;
    public final int f19462m;
    public final int f19463n;
    public final long f19464o;
    public final int f19465p;
    public final boolean f19466q;
    public final int f19467r;
    public final boolean f19468s;
    public final boolean f19469t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19454b = messagesController;
        this.f19455c = i10;
        this.d = i11;
        this.e = j10;
        this.f19456f = j11;
        this.f19457g = i12;
        this.h = i13;
        this.f19458i = i14;
        this.f19459j = i15;
        this.f19460k = i16;
        this.f19461l = i17;
        this.f19462m = i18;
        this.f19463n = i19;
        this.f19464o = j12;
        this.f19465p = i20;
        this.f19466q = z10;
        this.f19467r = i21;
        this.f19468s = z11;
        this.f19469t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19453a) {
            case 0:
                boolean z10 = this.f19468s;
                boolean z11 = this.f19469t;
                int i10 = this.f19455c;
                int i11 = this.d;
                int i12 = this.f19457g;
                int i13 = this.h;
                int i14 = this.f19458i;
                int i15 = this.f19459j;
                int i16 = this.f19460k;
                int i17 = this.f19461l;
                int i18 = this.f19462m;
                int i19 = this.f19463n;
                int i20 = this.f19465p;
                int i21 = this.f19467r;
                this.f19454b.lambda$loadMessagesInternal$175(this.e, this.f19456f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19464o, i20, this.f19466q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19468s;
                boolean z13 = this.f19469t;
                int i22 = this.f19455c;
                int i23 = this.d;
                int i24 = this.f19457g;
                int i25 = this.h;
                int i26 = this.f19458i;
                int i27 = this.f19459j;
                int i28 = this.f19460k;
                int i29 = this.f19461l;
                int i30 = this.f19462m;
                int i31 = this.f19463n;
                int i32 = this.f19465p;
                int i33 = this.f19467r;
                this.f19454b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19456f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19464o, i32, this.f19466q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19454b = messagesController;
        this.e = j10;
        this.f19456f = j11;
        this.f19455c = i10;
        this.d = i11;
        this.f19457g = i12;
        this.h = i13;
        this.f19458i = i14;
        this.f19459j = i15;
        this.f19460k = i16;
        this.f19461l = i17;
        this.f19462m = i18;
        this.f19463n = i19;
        this.f19464o = j12;
        this.f19465p = i20;
        this.f19466q = z10;
        this.f19467r = i21;
        this.f19468s = z11;
        this.f19469t = z12;
    }
}
