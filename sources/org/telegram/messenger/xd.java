package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xd implements RequestDelegate {
    public final int f16969a;
    public final MessagesController f16970b;
    public final int f16971c;
    public final int d;
    public final int e;
    public final int f16972f;
    public final int f16973g;
    public final long h;
    public final long f16974i;
    public final int f16975j;
    public final int f16976k;
    public final int f16977l;
    public final int f16978m;
    public final int f16979n;
    public final long f16980o;
    public final int f16981p;
    public final boolean f16982q;
    public final int f16983r;
    public final boolean f16984s;
    public final boolean f16985t;
    public final TLObject f16986u;

    public xd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f16969a = 1;
        this.f16970b = messagesController;
        this.f16971c = i10;
        this.d = i11;
        this.e = i12;
        this.f16972f = i13;
        this.f16973g = i14;
        this.h = j3;
        this.f16974i = j10;
        this.f16975j = i15;
        this.f16976k = i16;
        this.f16977l = i17;
        this.f16978m = i18;
        this.f16979n = i19;
        this.f16980o = j11;
        this.f16981p = i20;
        this.f16982q = z10;
        this.f16983r = i21;
        this.f16984s = z11;
        this.f16985t = z12;
        this.f16986u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16969a) {
            case 0:
                this.f16970b.lambda$loadMessagesInternal$178(this.h, this.f16971c, this.d, this.e, this.f16974i, this.f16972f, this.f16973g, this.f16975j, this.f16976k, this.f16977l, this.f16978m, this.f16979n, this.f16980o, this.f16981p, this.f16982q, this.f16983r, this.f16984s, this.f16985t, (TLRPC.TL_messages_getSavedHistory) this.f16986u, tLObject, tL_error);
                return;
            case 1:
                this.f16970b.lambda$loadMessagesInternal$180(this.f16971c, this.d, this.e, this.f16972f, this.f16973g, this.h, this.f16974i, this.f16975j, this.f16976k, this.f16977l, this.f16978m, this.f16979n, this.f16980o, this.f16981p, this.f16982q, this.f16983r, this.f16984s, this.f16985t, (TLRPC.TL_messages_getReplies) this.f16986u, tLObject, tL_error);
                return;
            default:
                this.f16970b.lambda$loadMessagesInternal$185(this.h, this.f16971c, this.d, this.e, this.f16974i, this.f16972f, this.f16973g, this.f16975j, this.f16976k, this.f16977l, this.f16978m, this.f16979n, this.f16980o, this.f16981p, this.f16982q, this.f16983r, this.f16984s, this.f16985t, (TLRPC.TL_messages_getHistory) this.f16986u, tLObject, tL_error);
                return;
        }
    }

    public xd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f16969a = i22;
        this.f16970b = messagesController;
        this.h = j3;
        this.f16971c = i10;
        this.d = i11;
        this.e = i12;
        this.f16974i = j10;
        this.f16972f = i13;
        this.f16973g = i14;
        this.f16975j = i15;
        this.f16976k = i16;
        this.f16977l = i17;
        this.f16978m = i18;
        this.f16979n = i19;
        this.f16980o = j11;
        this.f16981p = i20;
        this.f16982q = z10;
        this.f16983r = i21;
        this.f16984s = z11;
        this.f16985t = z12;
        this.f16986u = tLObject;
    }
}
