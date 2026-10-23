package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd implements RequestDelegate {
    public final int f19311a = 1;
    public final MessagesController f19312b;
    public final int f19313c;
    public final int d;
    public final long e;
    public final long f19314f;
    public final int f19315g;
    public final int h;
    public final int f19316i;
    public final int f19317j;
    public final int f19318k;
    public final int f19319l;
    public final int f19320m;
    public final int f19321n;
    public final long f19322o;
    public final int f19323p;
    public final boolean f19324q;
    public final int f19325r;
    public final boolean f19326s;
    public final boolean f19327t;

    public qd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19312b = messagesController;
        this.f19313c = i10;
        this.d = i11;
        this.e = j10;
        this.f19314f = j11;
        this.f19315g = i12;
        this.h = i13;
        this.f19316i = i14;
        this.f19317j = i15;
        this.f19318k = i16;
        this.f19319l = i17;
        this.f19320m = i18;
        this.f19321n = i19;
        this.f19322o = j12;
        this.f19323p = i20;
        this.f19324q = z10;
        this.f19325r = i21;
        this.f19326s = z11;
        this.f19327t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19311a) {
            case 0:
                boolean z10 = this.f19326s;
                boolean z11 = this.f19327t;
                int i10 = this.f19313c;
                int i11 = this.d;
                int i12 = this.f19315g;
                int i13 = this.h;
                int i14 = this.f19316i;
                int i15 = this.f19317j;
                int i16 = this.f19318k;
                int i17 = this.f19319l;
                int i18 = this.f19320m;
                int i19 = this.f19321n;
                int i20 = this.f19323p;
                int i21 = this.f19325r;
                this.f19312b.lambda$loadMessagesInternal$175(this.e, this.f19314f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19322o, i20, this.f19324q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19326s;
                boolean z13 = this.f19327t;
                int i22 = this.f19313c;
                int i23 = this.d;
                int i24 = this.f19315g;
                int i25 = this.h;
                int i26 = this.f19316i;
                int i27 = this.f19317j;
                int i28 = this.f19318k;
                int i29 = this.f19319l;
                int i30 = this.f19320m;
                int i31 = this.f19321n;
                int i32 = this.f19323p;
                int i33 = this.f19325r;
                this.f19312b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19314f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19322o, i32, this.f19324q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public qd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19312b = messagesController;
        this.e = j10;
        this.f19314f = j11;
        this.f19313c = i10;
        this.d = i11;
        this.f19315g = i12;
        this.h = i13;
        this.f19316i = i14;
        this.f19317j = i15;
        this.f19318k = i16;
        this.f19319l = i17;
        this.f19320m = i18;
        this.f19321n = i19;
        this.f19322o = j12;
        this.f19323p = i20;
        this.f19324q = z10;
        this.f19325r = i21;
        this.f19326s = z11;
        this.f19327t = z12;
    }
}
