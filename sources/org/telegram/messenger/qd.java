package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd implements RequestDelegate {
    public final int f21343a = 1;
    public final MessagesController f21344b;
    public final int f21345c;
    public final int d;
    public final long f21346e;
    public final long f21347f;
    public final int f21348g;
    public final int h;
    public final int f21349i;
    public final int f21350j;
    public final int f21351k;
    public final int f21352l;
    public final int f21353m;
    public final int f21354n;
    public final long f21355o;
    public final int f21356p;
    public final boolean f21357q;
    public final int f21358r;
    public final boolean f21359s;
    public final boolean f21360t;

    public qd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21344b = messagesController;
        this.f21345c = i10;
        this.d = i11;
        this.f21346e = j10;
        this.f21347f = j11;
        this.f21348g = i12;
        this.h = i13;
        this.f21349i = i14;
        this.f21350j = i15;
        this.f21351k = i16;
        this.f21352l = i17;
        this.f21353m = i18;
        this.f21354n = i19;
        this.f21355o = j12;
        this.f21356p = i20;
        this.f21357q = z10;
        this.f21358r = i21;
        this.f21359s = z11;
        this.f21360t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21343a) {
            case 0:
                boolean z10 = this.f21359s;
                boolean z11 = this.f21360t;
                int i10 = this.f21345c;
                int i11 = this.d;
                int i12 = this.f21348g;
                int i13 = this.h;
                int i14 = this.f21349i;
                int i15 = this.f21350j;
                int i16 = this.f21351k;
                int i17 = this.f21352l;
                int i18 = this.f21353m;
                int i19 = this.f21354n;
                int i20 = this.f21356p;
                int i21 = this.f21358r;
                this.f21344b.lambda$loadMessagesInternal$176(this.f21346e, this.f21347f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f21355o, i20, this.f21357q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f21359s;
                boolean z13 = this.f21360t;
                int i22 = this.f21345c;
                int i23 = this.d;
                int i24 = this.f21348g;
                int i25 = this.h;
                int i26 = this.f21349i;
                int i27 = this.f21350j;
                int i28 = this.f21351k;
                int i29 = this.f21352l;
                int i30 = this.f21353m;
                int i31 = this.f21354n;
                int i32 = this.f21356p;
                int i33 = this.f21358r;
                this.f21344b.lambda$loadMessagesInternal$181(i22, i23, this.f21346e, this.f21347f, i24, i25, i26, i27, i28, i29, i30, i31, this.f21355o, i32, this.f21357q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public qd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f21344b = messagesController;
        this.f21346e = j10;
        this.f21347f = j11;
        this.f21345c = i10;
        this.d = i11;
        this.f21348g = i12;
        this.h = i13;
        this.f21349i = i14;
        this.f21350j = i15;
        this.f21351k = i16;
        this.f21352l = i17;
        this.f21353m = i18;
        this.f21354n = i19;
        this.f21355o = j12;
        this.f21356p = i20;
        this.f21357q = z10;
        this.f21358r = i21;
        this.f21359s = z11;
        this.f21360t = z12;
    }
}
