package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f19139a = 1;
    public final MessagesController f19140b;
    public final int f19141c;
    public final int d;
    public final long e;
    public final long f19142f;
    public final int f19143g;
    public final int h;
    public final int f19144i;
    public final int f19145j;
    public final int f19146k;
    public final int f19147l;
    public final int f19148m;
    public final int f19149n;
    public final long f19150o;
    public final int f19151p;
    public final boolean f19152q;
    public final int f19153r;
    public final boolean f19154s;
    public final boolean f19155t;

    public od(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19140b = messagesController;
        this.f19141c = i10;
        this.d = i11;
        this.e = j10;
        this.f19142f = j11;
        this.f19143g = i12;
        this.h = i13;
        this.f19144i = i14;
        this.f19145j = i15;
        this.f19146k = i16;
        this.f19147l = i17;
        this.f19148m = i18;
        this.f19149n = i19;
        this.f19150o = j12;
        this.f19151p = i20;
        this.f19152q = z10;
        this.f19153r = i21;
        this.f19154s = z11;
        this.f19155t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19139a) {
            case 0:
                boolean z10 = this.f19154s;
                boolean z11 = this.f19155t;
                int i10 = this.f19141c;
                int i11 = this.d;
                int i12 = this.f19143g;
                int i13 = this.h;
                int i14 = this.f19144i;
                int i15 = this.f19145j;
                int i16 = this.f19146k;
                int i17 = this.f19147l;
                int i18 = this.f19148m;
                int i19 = this.f19149n;
                int i20 = this.f19151p;
                int i21 = this.f19153r;
                this.f19140b.lambda$loadMessagesInternal$175(this.e, this.f19142f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19150o, i20, this.f19152q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19154s;
                boolean z13 = this.f19155t;
                int i22 = this.f19141c;
                int i23 = this.d;
                int i24 = this.f19143g;
                int i25 = this.h;
                int i26 = this.f19144i;
                int i27 = this.f19145j;
                int i28 = this.f19146k;
                int i29 = this.f19147l;
                int i30 = this.f19148m;
                int i31 = this.f19149n;
                int i32 = this.f19151p;
                int i33 = this.f19153r;
                this.f19140b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19142f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19150o, i32, this.f19152q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19140b = messagesController;
        this.e = j10;
        this.f19142f = j11;
        this.f19141c = i10;
        this.d = i11;
        this.f19143g = i12;
        this.h = i13;
        this.f19144i = i14;
        this.f19145j = i15;
        this.f19146k = i16;
        this.f19147l = i17;
        this.f19148m = i18;
        this.f19149n = i19;
        this.f19150o = j12;
        this.f19151p = i20;
        this.f19152q = z10;
        this.f19153r = i21;
        this.f19154s = z11;
        this.f19155t = z12;
    }
}
