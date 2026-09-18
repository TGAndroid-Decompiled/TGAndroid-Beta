package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f17054a;
    public final MessagesController f17055b;
    public final int f17056c;
    public final int d;
    public final int e;
    public final int f17057f;
    public final int f17058g;
    public final long h;
    public final long f17059i;
    public final int f17060j;
    public final int f17061k;
    public final int f17062l;
    public final int f17063m;
    public final int f17064n;
    public final long f17065o;
    public final int f17066p;
    public final boolean f17067q;
    public final int f17068r;
    public final boolean f17069s;
    public final boolean f17070t;
    public final TLObject f17071u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17054a = 1;
        this.f17055b = messagesController;
        this.f17056c = i10;
        this.d = i11;
        this.e = i12;
        this.f17057f = i13;
        this.f17058g = i14;
        this.h = j3;
        this.f17059i = j10;
        this.f17060j = i15;
        this.f17061k = i16;
        this.f17062l = i17;
        this.f17063m = i18;
        this.f17064n = i19;
        this.f17065o = j11;
        this.f17066p = i20;
        this.f17067q = z10;
        this.f17068r = i21;
        this.f17069s = z11;
        this.f17070t = z12;
        this.f17071u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17054a) {
            case 0:
                this.f17055b.lambda$loadMessagesInternal$178(this.h, this.f17056c, this.d, this.e, this.f17059i, this.f17057f, this.f17058g, this.f17060j, this.f17061k, this.f17062l, this.f17063m, this.f17064n, this.f17065o, this.f17066p, this.f17067q, this.f17068r, this.f17069s, this.f17070t, (TLRPC.TL_messages_getSavedHistory) this.f17071u, tLObject, tL_error);
                return;
            case 1:
                this.f17055b.lambda$loadMessagesInternal$180(this.f17056c, this.d, this.e, this.f17057f, this.f17058g, this.h, this.f17059i, this.f17060j, this.f17061k, this.f17062l, this.f17063m, this.f17064n, this.f17065o, this.f17066p, this.f17067q, this.f17068r, this.f17069s, this.f17070t, (TLRPC.TL_messages_getReplies) this.f17071u, tLObject, tL_error);
                return;
            default:
                this.f17055b.lambda$loadMessagesInternal$185(this.h, this.f17056c, this.d, this.e, this.f17059i, this.f17057f, this.f17058g, this.f17060j, this.f17061k, this.f17062l, this.f17063m, this.f17064n, this.f17065o, this.f17066p, this.f17067q, this.f17068r, this.f17069s, this.f17070t, (TLRPC.TL_messages_getHistory) this.f17071u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17054a = i22;
        this.f17055b = messagesController;
        this.h = j3;
        this.f17056c = i10;
        this.d = i11;
        this.e = i12;
        this.f17059i = j10;
        this.f17057f = i13;
        this.f17058g = i14;
        this.f17060j = i15;
        this.f17061k = i16;
        this.f17062l = i17;
        this.f17063m = i18;
        this.f17064n = i19;
        this.f17065o = j11;
        this.f17066p = i20;
        this.f17067q = z10;
        this.f17068r = i21;
        this.f17069s = z11;
        this.f17070t = z12;
        this.f17071u = tLObject;
    }
}
