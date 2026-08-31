package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f19975a;
    public final MessagesController f19976b;
    public final int f19977c;
    public final int d;
    public final int f19978e;
    public final int f19979f;
    public final int f19980g;
    public final long h;
    public final long f19981i;
    public final int f19982j;
    public final int f19983k;
    public final int f19984l;
    public final int f19985m;
    public final int f19986n;
    public final long f19987o;
    public final int f19988p;
    public final boolean f19989q;
    public final int f19990r;
    public final boolean f19991s;
    public final boolean f19992t;
    public final TLObject f19993u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19975a = 1;
        this.f19976b = messagesController;
        this.f19977c = i10;
        this.d = i11;
        this.f19978e = i12;
        this.f19979f = i13;
        this.f19980g = i14;
        this.h = j10;
        this.f19981i = j11;
        this.f19982j = i15;
        this.f19983k = i16;
        this.f19984l = i17;
        this.f19985m = i18;
        this.f19986n = i19;
        this.f19987o = j12;
        this.f19988p = i20;
        this.f19989q = z4;
        this.f19990r = i21;
        this.f19991s = z10;
        this.f19992t = z11;
        this.f19993u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19975a) {
            case 0:
                this.f19976b.lambda$loadMessagesInternal$178(this.h, this.f19977c, this.d, this.f19978e, this.f19981i, this.f19979f, this.f19980g, this.f19982j, this.f19983k, this.f19984l, this.f19985m, this.f19986n, this.f19987o, this.f19988p, this.f19989q, this.f19990r, this.f19991s, this.f19992t, (TLRPC.TL_messages_getSavedHistory) this.f19993u, tLObject, tL_error);
                return;
            case 1:
                this.f19976b.lambda$loadMessagesInternal$180(this.f19977c, this.d, this.f19978e, this.f19979f, this.f19980g, this.h, this.f19981i, this.f19982j, this.f19983k, this.f19984l, this.f19985m, this.f19986n, this.f19987o, this.f19988p, this.f19989q, this.f19990r, this.f19991s, this.f19992t, (TLRPC.TL_messages_getReplies) this.f19993u, tLObject, tL_error);
                return;
            default:
                this.f19976b.lambda$loadMessagesInternal$185(this.h, this.f19977c, this.d, this.f19978e, this.f19981i, this.f19979f, this.f19980g, this.f19982j, this.f19983k, this.f19984l, this.f19985m, this.f19986n, this.f19987o, this.f19988p, this.f19989q, this.f19990r, this.f19991s, this.f19992t, (TLRPC.TL_messages_getHistory) this.f19993u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLObject tLObject, int i22) {
        this.f19975a = i22;
        this.f19976b = messagesController;
        this.h = j10;
        this.f19977c = i10;
        this.d = i11;
        this.f19978e = i12;
        this.f19981i = j11;
        this.f19979f = i13;
        this.f19980g = i14;
        this.f19982j = i15;
        this.f19983k = i16;
        this.f19984l = i17;
        this.f19985m = i18;
        this.f19986n = i19;
        this.f19987o = j12;
        this.f19988p = i20;
        this.f19989q = z4;
        this.f19990r = i21;
        this.f19991s = z10;
        this.f19992t = z11;
        this.f19993u = tLObject;
    }
}
