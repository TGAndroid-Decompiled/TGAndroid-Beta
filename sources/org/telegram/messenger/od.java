package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f18629a;
    public final MessagesController f18630b;
    public final int f18631c;
    public final int d;
    public final int f18632e;
    public final int f18633f;
    public final int f18634g;
    public final long h;
    public final long f18635i;
    public final int f18636j;
    public final int f18637k;
    public final int f18638l;
    public final int f18639m;
    public final int f18640n;
    public final long f18641o;
    public final int f18642p;
    public final boolean f18643q;
    public final int f18644r;
    public final boolean f18645s;
    public final boolean f18646t;
    public final TLObject f18647u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18629a = 1;
        this.f18630b = messagesController;
        this.f18631c = i10;
        this.d = i11;
        this.f18632e = i12;
        this.f18633f = i13;
        this.f18634g = i14;
        this.h = j3;
        this.f18635i = j10;
        this.f18636j = i15;
        this.f18637k = i16;
        this.f18638l = i17;
        this.f18639m = i18;
        this.f18640n = i19;
        this.f18641o = j11;
        this.f18642p = i20;
        this.f18643q = z10;
        this.f18644r = i21;
        this.f18645s = z11;
        this.f18646t = z12;
        this.f18647u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18629a) {
            case 0:
                this.f18630b.lambda$loadMessagesInternal$178(this.h, this.f18631c, this.d, this.f18632e, this.f18635i, this.f18633f, this.f18634g, this.f18636j, this.f18637k, this.f18638l, this.f18639m, this.f18640n, this.f18641o, this.f18642p, this.f18643q, this.f18644r, this.f18645s, this.f18646t, (TLRPC.TL_messages_getSavedHistory) this.f18647u, tLObject, tL_error);
                return;
            case 1:
                this.f18630b.lambda$loadMessagesInternal$180(this.f18631c, this.d, this.f18632e, this.f18633f, this.f18634g, this.h, this.f18635i, this.f18636j, this.f18637k, this.f18638l, this.f18639m, this.f18640n, this.f18641o, this.f18642p, this.f18643q, this.f18644r, this.f18645s, this.f18646t, (TLRPC.TL_messages_getReplies) this.f18647u, tLObject, tL_error);
                return;
            default:
                this.f18630b.lambda$loadMessagesInternal$185(this.h, this.f18631c, this.d, this.f18632e, this.f18635i, this.f18633f, this.f18634g, this.f18636j, this.f18637k, this.f18638l, this.f18639m, this.f18640n, this.f18641o, this.f18642p, this.f18643q, this.f18644r, this.f18645s, this.f18646t, (TLRPC.TL_messages_getHistory) this.f18647u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18629a = i22;
        this.f18630b = messagesController;
        this.h = j3;
        this.f18631c = i10;
        this.d = i11;
        this.f18632e = i12;
        this.f18635i = j10;
        this.f18633f = i13;
        this.f18634g = i14;
        this.f18636j = i15;
        this.f18637k = i16;
        this.f18638l = i17;
        this.f18639m = i18;
        this.f18640n = i19;
        this.f18641o = j11;
        this.f18642p = i20;
        this.f18643q = z10;
        this.f18644r = i21;
        this.f18645s = z11;
        this.f18646t = z12;
        this.f18647u = tLObject;
    }
}
