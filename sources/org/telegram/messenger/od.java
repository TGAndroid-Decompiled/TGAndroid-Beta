package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f19142a = 1;
    public final MessagesController f19143b;
    public final int f19144c;
    public final int d;
    public final long e;
    public final long f19145f;
    public final int f19146g;
    public final int h;
    public final int f19147i;
    public final int f19148j;
    public final int f19149k;
    public final int f19150l;
    public final int f19151m;
    public final int f19152n;
    public final long f19153o;
    public final int f19154p;
    public final boolean f19155q;
    public final int f19156r;
    public final boolean f19157s;
    public final boolean f19158t;

    public od(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19143b = messagesController;
        this.f19144c = i10;
        this.d = i11;
        this.e = j10;
        this.f19145f = j11;
        this.f19146g = i12;
        this.h = i13;
        this.f19147i = i14;
        this.f19148j = i15;
        this.f19149k = i16;
        this.f19150l = i17;
        this.f19151m = i18;
        this.f19152n = i19;
        this.f19153o = j12;
        this.f19154p = i20;
        this.f19155q = z10;
        this.f19156r = i21;
        this.f19157s = z11;
        this.f19158t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19142a) {
            case 0:
                boolean z10 = this.f19157s;
                boolean z11 = this.f19158t;
                int i10 = this.f19144c;
                int i11 = this.d;
                int i12 = this.f19146g;
                int i13 = this.h;
                int i14 = this.f19147i;
                int i15 = this.f19148j;
                int i16 = this.f19149k;
                int i17 = this.f19150l;
                int i18 = this.f19151m;
                int i19 = this.f19152n;
                int i20 = this.f19154p;
                int i21 = this.f19156r;
                this.f19143b.lambda$loadMessagesInternal$175(this.e, this.f19145f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19153o, i20, this.f19155q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19157s;
                boolean z13 = this.f19158t;
                int i22 = this.f19144c;
                int i23 = this.d;
                int i24 = this.f19146g;
                int i25 = this.h;
                int i26 = this.f19147i;
                int i27 = this.f19148j;
                int i28 = this.f19149k;
                int i29 = this.f19150l;
                int i30 = this.f19151m;
                int i31 = this.f19152n;
                int i32 = this.f19154p;
                int i33 = this.f19156r;
                this.f19143b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19145f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19153o, i32, this.f19155q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19143b = messagesController;
        this.e = j10;
        this.f19145f = j11;
        this.f19144c = i10;
        this.d = i11;
        this.f19146g = i12;
        this.h = i13;
        this.f19147i = i14;
        this.f19148j = i15;
        this.f19149k = i16;
        this.f19150l = i17;
        this.f19151m = i18;
        this.f19152n = i19;
        this.f19153o = j12;
        this.f19154p = i20;
        this.f19155q = z10;
        this.f19156r = i21;
        this.f19157s = z11;
        this.f19158t = z12;
    }
}
