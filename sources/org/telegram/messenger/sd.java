package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f18369a;
    public final MessagesController f18370b;
    public final int f18371c;
    public final int d;
    public final int e;
    public final int f18372f;
    public final int f18373g;
    public final long h;
    public final long f18374i;
    public final int f18375j;
    public final int f18376k;
    public final int f18377l;
    public final int f18378m;
    public final int f18379n;
    public final long f18380o;
    public final int f18381p;
    public final boolean f18382q;
    public final int f18383r;
    public final boolean f18384s;
    public final boolean f18385t;
    public final TLObject f18386u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18369a = 1;
        this.f18370b = messagesController;
        this.f18371c = i10;
        this.d = i11;
        this.e = i12;
        this.f18372f = i13;
        this.f18373g = i14;
        this.h = j10;
        this.f18374i = j11;
        this.f18375j = i15;
        this.f18376k = i16;
        this.f18377l = i17;
        this.f18378m = i18;
        this.f18379n = i19;
        this.f18380o = j12;
        this.f18381p = i20;
        this.f18382q = z4;
        this.f18383r = i21;
        this.f18384s = z10;
        this.f18385t = z11;
        this.f18386u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18369a) {
            case 0:
                this.f18370b.lambda$loadMessagesInternal$178(this.h, this.f18371c, this.d, this.e, this.f18374i, this.f18372f, this.f18373g, this.f18375j, this.f18376k, this.f18377l, this.f18378m, this.f18379n, this.f18380o, this.f18381p, this.f18382q, this.f18383r, this.f18384s, this.f18385t, (TLRPC.TL_messages_getSavedHistory) this.f18386u, tLObject, tL_error);
                return;
            case 1:
                this.f18370b.lambda$loadMessagesInternal$180(this.f18371c, this.d, this.e, this.f18372f, this.f18373g, this.h, this.f18374i, this.f18375j, this.f18376k, this.f18377l, this.f18378m, this.f18379n, this.f18380o, this.f18381p, this.f18382q, this.f18383r, this.f18384s, this.f18385t, (TLRPC.TL_messages_getReplies) this.f18386u, tLObject, tL_error);
                return;
            default:
                this.f18370b.lambda$loadMessagesInternal$185(this.h, this.f18371c, this.d, this.e, this.f18374i, this.f18372f, this.f18373g, this.f18375j, this.f18376k, this.f18377l, this.f18378m, this.f18379n, this.f18380o, this.f18381p, this.f18382q, this.f18383r, this.f18384s, this.f18385t, (TLRPC.TL_messages_getHistory) this.f18386u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11, TLObject tLObject, int i22) {
        this.f18369a = i22;
        this.f18370b = messagesController;
        this.h = j10;
        this.f18371c = i10;
        this.d = i11;
        this.e = i12;
        this.f18374i = j11;
        this.f18372f = i13;
        this.f18373g = i14;
        this.f18375j = i15;
        this.f18376k = i16;
        this.f18377l = i17;
        this.f18378m = i18;
        this.f18379n = i19;
        this.f18380o = j12;
        this.f18381p = i20;
        this.f18382q = z4;
        this.f18383r = i21;
        this.f18384s = z10;
        this.f18385t = z11;
        this.f18386u = tLObject;
    }
}
