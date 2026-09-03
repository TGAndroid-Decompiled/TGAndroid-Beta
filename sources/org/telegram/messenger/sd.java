package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f19977a;
    public final MessagesController f19978b;
    public final int f19979c;
    public final int d;
    public final int f19980e;
    public final int f19981f;
    public final int f19982g;
    public final long h;
    public final long f19983i;
    public final int f19984j;
    public final int f19985k;
    public final int f19986l;
    public final int f19987m;
    public final int f19988n;
    public final long f19989o;
    public final int f19990p;
    public final boolean f19991q;
    public final int f19992r;
    public final boolean f19993s;
    public final boolean f19994t;
    public final TLObject f19995u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19977a = 1;
        this.f19978b = messagesController;
        this.f19979c = i10;
        this.d = i11;
        this.f19980e = i12;
        this.f19981f = i13;
        this.f19982g = i14;
        this.h = j10;
        this.f19983i = j11;
        this.f19984j = i15;
        this.f19985k = i16;
        this.f19986l = i17;
        this.f19987m = i18;
        this.f19988n = i19;
        this.f19989o = j12;
        this.f19990p = i20;
        this.f19991q = z4;
        this.f19992r = i21;
        this.f19993s = z10;
        this.f19994t = z11;
        this.f19995u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19977a) {
            case 0:
                this.f19978b.lambda$loadMessagesInternal$178(this.h, this.f19979c, this.d, this.f19980e, this.f19983i, this.f19981f, this.f19982g, this.f19984j, this.f19985k, this.f19986l, this.f19987m, this.f19988n, this.f19989o, this.f19990p, this.f19991q, this.f19992r, this.f19993s, this.f19994t, (TLRPC.TL_messages_getSavedHistory) this.f19995u, tLObject, tL_error);
                return;
            case 1:
                this.f19978b.lambda$loadMessagesInternal$180(this.f19979c, this.d, this.f19980e, this.f19981f, this.f19982g, this.h, this.f19983i, this.f19984j, this.f19985k, this.f19986l, this.f19987m, this.f19988n, this.f19989o, this.f19990p, this.f19991q, this.f19992r, this.f19993s, this.f19994t, (TLRPC.TL_messages_getReplies) this.f19995u, tLObject, tL_error);
                return;
            default:
                this.f19978b.lambda$loadMessagesInternal$185(this.h, this.f19979c, this.d, this.f19980e, this.f19983i, this.f19981f, this.f19982g, this.f19984j, this.f19985k, this.f19986l, this.f19987m, this.f19988n, this.f19989o, this.f19990p, this.f19991q, this.f19992r, this.f19993s, this.f19994t, (TLRPC.TL_messages_getHistory) this.f19995u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLObject tLObject, int i22) {
        this.f19977a = i22;
        this.f19978b = messagesController;
        this.h = j10;
        this.f19979c = i10;
        this.d = i11;
        this.f19980e = i12;
        this.f19983i = j11;
        this.f19981f = i13;
        this.f19982g = i14;
        this.f19984j = i15;
        this.f19985k = i16;
        this.f19986l = i17;
        this.f19987m = i18;
        this.f19988n = i19;
        this.f19989o = j12;
        this.f19990p = i20;
        this.f19991q = z4;
        this.f19992r = i21;
        this.f19993s = z10;
        this.f19994t = z11;
        this.f19995u = tLObject;
    }
}
