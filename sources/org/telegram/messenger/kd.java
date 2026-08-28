package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kd implements RequestDelegate {
    public final int f20785a;
    public final MessagesController f20786b;
    public final int f20787c;
    public final int d;
    public final int f20788e;
    public final int f20789f;
    public final int f20790g;
    public final long h;
    public final long f20791i;
    public final int f20792j;
    public final int f20793k;
    public final int f20794l;
    public final int f20795m;
    public final int f20796n;
    public final long f20797o;
    public final int f20798p;
    public final boolean f20799q;
    public final int f20800r;
    public final boolean f20801s;
    public final boolean f20802t;
    public final TLObject f20803u;

    public kd(MessagesController messagesController, int i9, int i10, int i11, int i12, int i13, long j10, long j11, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f20785a = 1;
        this.f20786b = messagesController;
        this.f20787c = i9;
        this.d = i10;
        this.f20788e = i11;
        this.f20789f = i12;
        this.f20790g = i13;
        this.h = j10;
        this.f20791i = j11;
        this.f20792j = i14;
        this.f20793k = i15;
        this.f20794l = i16;
        this.f20795m = i17;
        this.f20796n = i18;
        this.f20797o = j12;
        this.f20798p = i19;
        this.f20799q = z10;
        this.f20800r = i20;
        this.f20801s = z11;
        this.f20802t = z12;
        this.f20803u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20785a) {
            case 0:
                this.f20786b.lambda$loadMessagesInternal$178(this.h, this.f20787c, this.d, this.f20788e, this.f20791i, this.f20789f, this.f20790g, this.f20792j, this.f20793k, this.f20794l, this.f20795m, this.f20796n, this.f20797o, this.f20798p, this.f20799q, this.f20800r, this.f20801s, this.f20802t, (TLRPC.TL_messages_getSavedHistory) this.f20803u, tLObject, tL_error);
                return;
            case 1:
                this.f20786b.lambda$loadMessagesInternal$180(this.f20787c, this.d, this.f20788e, this.f20789f, this.f20790g, this.h, this.f20791i, this.f20792j, this.f20793k, this.f20794l, this.f20795m, this.f20796n, this.f20797o, this.f20798p, this.f20799q, this.f20800r, this.f20801s, this.f20802t, (TLRPC.TL_messages_getReplies) this.f20803u, tLObject, tL_error);
                return;
            default:
                this.f20786b.lambda$loadMessagesInternal$185(this.h, this.f20787c, this.d, this.f20788e, this.f20791i, this.f20789f, this.f20790g, this.f20792j, this.f20793k, this.f20794l, this.f20795m, this.f20796n, this.f20797o, this.f20798p, this.f20799q, this.f20800r, this.f20801s, this.f20802t, (TLRPC.TL_messages_getHistory) this.f20803u, tLObject, tL_error);
                return;
        }
    }

    public kd(MessagesController messagesController, long j10, int i9, int i10, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.f20785a = i21;
        this.f20786b = messagesController;
        this.h = j10;
        this.f20787c = i9;
        this.d = i10;
        this.f20788e = i11;
        this.f20791i = j11;
        this.f20789f = i12;
        this.f20790g = i13;
        this.f20792j = i14;
        this.f20793k = i15;
        this.f20794l = i16;
        this.f20795m = i17;
        this.f20796n = i18;
        this.f20797o = j12;
        this.f20798p = i19;
        this.f20799q = z10;
        this.f20800r = i20;
        this.f20801s = z11;
        this.f20802t = z12;
        this.f20803u = tLObject;
    }
}
