package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f18275a = 1;
    public final MessagesController f18276b;
    public final int f18277c;
    public final int d;
    public final long e;
    public final long f18278f;
    public final int f18279g;
    public final int h;
    public final int f18280i;
    public final int f18281j;
    public final int f18282k;
    public final int f18283l;
    public final int f18284m;
    public final int f18285n;
    public final long f18286o;
    public final int f18287p;
    public final boolean f18288q;
    public final int f18289r;
    public final boolean f18290s;
    public final boolean f18291t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f18276b = messagesController;
        this.f18277c = i10;
        this.d = i11;
        this.e = j10;
        this.f18278f = j11;
        this.f18279g = i12;
        this.h = i13;
        this.f18280i = i14;
        this.f18281j = i15;
        this.f18282k = i16;
        this.f18283l = i17;
        this.f18284m = i18;
        this.f18285n = i19;
        this.f18286o = j12;
        this.f18287p = i20;
        this.f18288q = z4;
        this.f18289r = i21;
        this.f18290s = z10;
        this.f18291t = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18275a) {
            case 0:
                boolean z4 = this.f18290s;
                boolean z10 = this.f18291t;
                int i10 = this.f18277c;
                int i11 = this.d;
                int i12 = this.f18279g;
                int i13 = this.h;
                int i14 = this.f18280i;
                int i15 = this.f18281j;
                int i16 = this.f18282k;
                int i17 = this.f18283l;
                int i18 = this.f18284m;
                int i19 = this.f18285n;
                int i20 = this.f18287p;
                int i21 = this.f18289r;
                this.f18276b.lambda$loadMessagesInternal$176(this.e, this.f18278f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18286o, i20, this.f18288q, i21, z4, z10, tLObject, tL_error);
                return;
            default:
                boolean z11 = this.f18290s;
                boolean z12 = this.f18291t;
                int i22 = this.f18277c;
                int i23 = this.d;
                int i24 = this.f18279g;
                int i25 = this.h;
                int i26 = this.f18280i;
                int i27 = this.f18281j;
                int i28 = this.f18282k;
                int i29 = this.f18283l;
                int i30 = this.f18284m;
                int i31 = this.f18285n;
                int i32 = this.f18287p;
                int i33 = this.f18289r;
                this.f18276b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f18278f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18286o, i32, this.f18288q, i33, z11, z12, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f18276b = messagesController;
        this.e = j10;
        this.f18278f = j11;
        this.f18277c = i10;
        this.d = i11;
        this.f18279g = i12;
        this.h = i13;
        this.f18280i = i14;
        this.f18281j = i15;
        this.f18282k = i16;
        this.f18283l = i17;
        this.f18284m = i18;
        this.f18285n = i19;
        this.f18286o = j12;
        this.f18287p = i20;
        this.f18288q = z4;
        this.f18289r = i21;
        this.f18290s = z10;
        this.f18291t = z11;
    }
}
