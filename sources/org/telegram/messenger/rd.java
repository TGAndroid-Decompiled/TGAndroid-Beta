package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f18301a = 1;
    public final MessagesController f18302b;
    public final int f18303c;
    public final int d;
    public final long e;
    public final long f18304f;
    public final int f18305g;
    public final int h;
    public final int f18306i;
    public final int f18307j;
    public final int f18308k;
    public final int f18309l;
    public final int f18310m;
    public final int f18311n;
    public final long f18312o;
    public final int f18313p;
    public final boolean f18314q;
    public final int f18315r;
    public final boolean f18316s;
    public final boolean f18317t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f18302b = messagesController;
        this.f18303c = i10;
        this.d = i11;
        this.e = j10;
        this.f18304f = j11;
        this.f18305g = i12;
        this.h = i13;
        this.f18306i = i14;
        this.f18307j = i15;
        this.f18308k = i16;
        this.f18309l = i17;
        this.f18310m = i18;
        this.f18311n = i19;
        this.f18312o = j12;
        this.f18313p = i20;
        this.f18314q = z4;
        this.f18315r = i21;
        this.f18316s = z10;
        this.f18317t = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18301a) {
            case 0:
                boolean z4 = this.f18316s;
                boolean z10 = this.f18317t;
                int i10 = this.f18303c;
                int i11 = this.d;
                int i12 = this.f18305g;
                int i13 = this.h;
                int i14 = this.f18306i;
                int i15 = this.f18307j;
                int i16 = this.f18308k;
                int i17 = this.f18309l;
                int i18 = this.f18310m;
                int i19 = this.f18311n;
                int i20 = this.f18313p;
                int i21 = this.f18315r;
                this.f18302b.lambda$loadMessagesInternal$176(this.e, this.f18304f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18312o, i20, this.f18314q, i21, z4, z10, tLObject, tL_error);
                return;
            default:
                boolean z11 = this.f18316s;
                boolean z12 = this.f18317t;
                int i22 = this.f18303c;
                int i23 = this.d;
                int i24 = this.f18305g;
                int i25 = this.h;
                int i26 = this.f18306i;
                int i27 = this.f18307j;
                int i28 = this.f18308k;
                int i29 = this.f18309l;
                int i30 = this.f18310m;
                int i31 = this.f18311n;
                int i32 = this.f18313p;
                int i33 = this.f18315r;
                this.f18302b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f18304f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18312o, i32, this.f18314q, i33, z11, z12, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f18302b = messagesController;
        this.e = j10;
        this.f18304f = j11;
        this.f18303c = i10;
        this.d = i11;
        this.f18305g = i12;
        this.h = i13;
        this.f18306i = i14;
        this.f18307j = i15;
        this.f18308k = i16;
        this.f18309l = i17;
        this.f18310m = i18;
        this.f18311n = i19;
        this.f18312o = j12;
        this.f18313p = i20;
        this.f18314q = z4;
        this.f18315r = i21;
        this.f18316s = z10;
        this.f18317t = z11;
    }
}
