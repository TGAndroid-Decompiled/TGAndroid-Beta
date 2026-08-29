package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f21435a;
    public final MessagesController f21436b;
    public final int f21437c;
    public final int d;
    public final int f21438e;
    public final int f21439f;
    public final int f21440g;
    public final long h;
    public final long f21441i;
    public final int f21442j;
    public final int f21443k;
    public final int f21444l;
    public final int f21445m;
    public final int f21446n;
    public final long f21447o;
    public final int f21448p;
    public final boolean f21449q;
    public final int f21450r;
    public final boolean f21451s;
    public final boolean f21452t;
    public final TLObject f21453u;

    public rd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f21435a = 1;
        this.f21436b = messagesController;
        this.f21437c = i10;
        this.d = i11;
        this.f21438e = i12;
        this.f21439f = i13;
        this.f21440g = i14;
        this.h = j10;
        this.f21441i = j11;
        this.f21442j = i15;
        this.f21443k = i16;
        this.f21444l = i17;
        this.f21445m = i18;
        this.f21446n = i19;
        this.f21447o = j12;
        this.f21448p = i20;
        this.f21449q = z10;
        this.f21450r = i21;
        this.f21451s = z11;
        this.f21452t = z12;
        this.f21453u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21435a) {
            case 0:
                this.f21436b.lambda$loadMessagesInternal$178(this.h, this.f21437c, this.d, this.f21438e, this.f21441i, this.f21439f, this.f21440g, this.f21442j, this.f21443k, this.f21444l, this.f21445m, this.f21446n, this.f21447o, this.f21448p, this.f21449q, this.f21450r, this.f21451s, this.f21452t, (TLRPC.TL_messages_getSavedHistory) this.f21453u, tLObject, tL_error);
                return;
            case 1:
                this.f21436b.lambda$loadMessagesInternal$180(this.f21437c, this.d, this.f21438e, this.f21439f, this.f21440g, this.h, this.f21441i, this.f21442j, this.f21443k, this.f21444l, this.f21445m, this.f21446n, this.f21447o, this.f21448p, this.f21449q, this.f21450r, this.f21451s, this.f21452t, (TLRPC.TL_messages_getReplies) this.f21453u, tLObject, tL_error);
                return;
            default:
                this.f21436b.lambda$loadMessagesInternal$185(this.h, this.f21437c, this.d, this.f21438e, this.f21441i, this.f21439f, this.f21440g, this.f21442j, this.f21443k, this.f21444l, this.f21445m, this.f21446n, this.f21447o, this.f21448p, this.f21449q, this.f21450r, this.f21451s, this.f21452t, (TLRPC.TL_messages_getHistory) this.f21453u, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f21435a = i22;
        this.f21436b = messagesController;
        this.h = j10;
        this.f21437c = i10;
        this.d = i11;
        this.f21438e = i12;
        this.f21441i = j11;
        this.f21439f = i13;
        this.f21440g = i14;
        this.f21442j = i15;
        this.f21443k = i16;
        this.f21444l = i17;
        this.f21445m = i18;
        this.f21446n = i19;
        this.f21447o = j12;
        this.f21448p = i20;
        this.f21449q = z10;
        this.f21450r = i21;
        this.f21451s = z11;
        this.f21452t = z12;
        this.f21453u = tLObject;
    }
}
