package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f19383a = 1;
    public final MessagesController f19384b;
    public final int f19385c;
    public final int d;
    public final long e;
    public final long f19386f;
    public final int f19387g;
    public final int h;
    public final int f19388i;
    public final int f19389j;
    public final int f19390k;
    public final int f19391l;
    public final int f19392m;
    public final int f19393n;
    public final long f19394o;
    public final int f19395p;
    public final boolean f19396q;
    public final int f19397r;
    public final boolean f19398s;
    public final boolean f19399t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19384b = messagesController;
        this.f19385c = i10;
        this.d = i11;
        this.e = j10;
        this.f19386f = j11;
        this.f19387g = i12;
        this.h = i13;
        this.f19388i = i14;
        this.f19389j = i15;
        this.f19390k = i16;
        this.f19391l = i17;
        this.f19392m = i18;
        this.f19393n = i19;
        this.f19394o = j12;
        this.f19395p = i20;
        this.f19396q = z10;
        this.f19397r = i21;
        this.f19398s = z11;
        this.f19399t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19383a) {
            case 0:
                boolean z10 = this.f19398s;
                boolean z11 = this.f19399t;
                int i10 = this.f19385c;
                int i11 = this.d;
                int i12 = this.f19387g;
                int i13 = this.h;
                int i14 = this.f19388i;
                int i15 = this.f19389j;
                int i16 = this.f19390k;
                int i17 = this.f19391l;
                int i18 = this.f19392m;
                int i19 = this.f19393n;
                int i20 = this.f19395p;
                int i21 = this.f19397r;
                this.f19384b.lambda$loadMessagesInternal$175(this.e, this.f19386f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19394o, i20, this.f19396q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19398s;
                boolean z13 = this.f19399t;
                int i22 = this.f19385c;
                int i23 = this.d;
                int i24 = this.f19387g;
                int i25 = this.h;
                int i26 = this.f19388i;
                int i27 = this.f19389j;
                int i28 = this.f19390k;
                int i29 = this.f19391l;
                int i30 = this.f19392m;
                int i31 = this.f19393n;
                int i32 = this.f19395p;
                int i33 = this.f19397r;
                this.f19384b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19386f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19394o, i32, this.f19396q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19384b = messagesController;
        this.e = j10;
        this.f19386f = j11;
        this.f19385c = i10;
        this.d = i11;
        this.f19387g = i12;
        this.h = i13;
        this.f19388i = i14;
        this.f19389j = i15;
        this.f19390k = i16;
        this.f19391l = i17;
        this.f19392m = i18;
        this.f19393n = i19;
        this.f19394o = j12;
        this.f19395p = i20;
        this.f19396q = z10;
        this.f19397r = i21;
        this.f19398s = z11;
        this.f19399t = z12;
    }
}
