package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f16840a = 1;
    public final MessagesController f16841b;
    public final int f16842c;
    public final int d;
    public final long e;
    public final long f16843f;
    public final int f16844g;
    public final int h;
    public final int f16845i;
    public final int f16846j;
    public final int f16847k;
    public final int f16848l;
    public final int f16849m;
    public final int f16850n;
    public final long f16851o;
    public final int f16852p;
    public final boolean f16853q;
    public final int f16854r;
    public final boolean f16855s;
    public final boolean f16856t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16841b = messagesController;
        this.f16842c = i10;
        this.d = i11;
        this.e = j3;
        this.f16843f = j10;
        this.f16844g = i12;
        this.h = i13;
        this.f16845i = i14;
        this.f16846j = i15;
        this.f16847k = i16;
        this.f16848l = i17;
        this.f16849m = i18;
        this.f16850n = i19;
        this.f16851o = j11;
        this.f16852p = i20;
        this.f16853q = z10;
        this.f16854r = i21;
        this.f16855s = z11;
        this.f16856t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16840a) {
            case 0:
                boolean z10 = this.f16855s;
                boolean z11 = this.f16856t;
                int i10 = this.f16842c;
                int i11 = this.d;
                int i12 = this.f16844g;
                int i13 = this.h;
                int i14 = this.f16845i;
                int i15 = this.f16846j;
                int i16 = this.f16847k;
                int i17 = this.f16848l;
                int i18 = this.f16849m;
                int i19 = this.f16850n;
                int i20 = this.f16852p;
                int i21 = this.f16854r;
                this.f16841b.lambda$loadMessagesInternal$176(this.e, this.f16843f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f16851o, i20, this.f16853q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f16855s;
                boolean z13 = this.f16856t;
                int i22 = this.f16842c;
                int i23 = this.d;
                int i24 = this.f16844g;
                int i25 = this.h;
                int i26 = this.f16845i;
                int i27 = this.f16846j;
                int i28 = this.f16847k;
                int i29 = this.f16848l;
                int i30 = this.f16849m;
                int i31 = this.f16850n;
                int i32 = this.f16852p;
                int i33 = this.f16854r;
                this.f16841b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f16843f, i24, i25, i26, i27, i28, i29, i30, i31, this.f16851o, i32, this.f16853q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16841b = messagesController;
        this.e = j3;
        this.f16843f = j10;
        this.f16842c = i10;
        this.d = i11;
        this.f16844g = i12;
        this.h = i13;
        this.f16845i = i14;
        this.f16846j = i15;
        this.f16847k = i16;
        this.f16848l = i17;
        this.f16849m = i18;
        this.f16850n = i19;
        this.f16851o = j11;
        this.f16852p = i20;
        this.f16853q = z10;
        this.f16854r = i21;
        this.f16855s = z11;
        this.f16856t = z12;
    }
}
