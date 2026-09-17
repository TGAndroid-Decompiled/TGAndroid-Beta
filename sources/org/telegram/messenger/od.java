package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18602a;
    public final MessagesController f18603b;
    public final int f18604c;
    public final int d;
    public final int f18605e;
    public final int f18606f;
    public final int f18607g;
    public final long h;
    public final long f18608i;
    public final int f18609j;
    public final int f18610k;
    public final int f18611l;
    public final int f18612m;
    public final int f18613n;
    public final long f18614o;
    public final int f18615p;
    public final boolean f18616q;
    public final int f18617r;
    public final boolean f18618s;
    public final boolean f18619t;
    public final TLObject f18620u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18602a = 1;
        this.f18603b = messagesController;
        this.f18604c = i10;
        this.d = i11;
        this.f18605e = i12;
        this.f18606f = i13;
        this.f18607g = i14;
        this.h = j3;
        this.f18608i = j10;
        this.f18609j = i15;
        this.f18610k = i16;
        this.f18611l = i17;
        this.f18612m = i18;
        this.f18613n = i19;
        this.f18614o = j11;
        this.f18615p = i20;
        this.f18616q = z10;
        this.f18617r = i21;
        this.f18618s = z11;
        this.f18619t = z12;
        this.f18620u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18602a) {
            case 0:
                this.f18603b.lambda$loadMessagesInternal$178(this.h, this.f18604c, this.d, this.f18605e, this.f18608i, this.f18606f, this.f18607g, this.f18609j, this.f18610k, this.f18611l, this.f18612m, this.f18613n, this.f18614o, this.f18615p, this.f18616q, this.f18617r, this.f18618s, this.f18619t, (TLRPC.TL_messages_getSavedHistory) this.f18620u, tLObject, tL_error);
                return;
            case 1:
                this.f18603b.lambda$loadMessagesInternal$180(this.f18604c, this.d, this.f18605e, this.f18606f, this.f18607g, this.h, this.f18608i, this.f18609j, this.f18610k, this.f18611l, this.f18612m, this.f18613n, this.f18614o, this.f18615p, this.f18616q, this.f18617r, this.f18618s, this.f18619t, (TLRPC.TL_messages_getReplies) this.f18620u, tLObject, tL_error);
                return;
            default:
                this.f18603b.lambda$loadMessagesInternal$185(this.h, this.f18604c, this.d, this.f18605e, this.f18608i, this.f18606f, this.f18607g, this.f18609j, this.f18610k, this.f18611l, this.f18612m, this.f18613n, this.f18614o, this.f18615p, this.f18616q, this.f18617r, this.f18618s, this.f18619t, (TLRPC.TL_messages_getHistory) this.f18620u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18602a = i22;
        this.f18603b = messagesController;
        this.h = j3;
        this.f18604c = i10;
        this.d = i11;
        this.f18605e = i12;
        this.f18608i = j10;
        this.f18606f = i13;
        this.f18607g = i14;
        this.f18609j = i15;
        this.f18610k = i16;
        this.f18611l = i17;
        this.f18612m = i18;
        this.f18613n = i19;
        this.f18614o = j11;
        this.f18615p = i20;
        this.f18616q = z10;
        this.f18617r = i21;
        this.f18618s = z11;
        this.f18619t = z12;
        this.f18620u = tLObject;
    }
}
