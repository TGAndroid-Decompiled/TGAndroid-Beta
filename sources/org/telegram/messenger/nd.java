package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f19078a;
    public final MessagesController f19079b;
    public final int f19080c;
    public final int d;
    public final int e;
    public final int f19081f;
    public final int f19082g;
    public final long h;
    public final long f19083i;
    public final int f19084j;
    public final int f19085k;
    public final int f19086l;
    public final int f19087m;
    public final int f19088n;
    public final long f19089o;
    public final int f19090p;
    public final boolean f19091q;
    public final int f19092r;
    public final boolean f19093s;
    public final boolean f19094t;
    public final TLObject f19095u;

    public nd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19078a = 1;
        this.f19079b = messagesController;
        this.f19080c = i10;
        this.d = i11;
        this.e = i12;
        this.f19081f = i13;
        this.f19082g = i14;
        this.h = j10;
        this.f19083i = j11;
        this.f19084j = i15;
        this.f19085k = i16;
        this.f19086l = i17;
        this.f19087m = i18;
        this.f19088n = i19;
        this.f19089o = j12;
        this.f19090p = i20;
        this.f19091q = z10;
        this.f19092r = i21;
        this.f19093s = z11;
        this.f19094t = z12;
        this.f19095u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19078a) {
            case 0:
                this.f19079b.lambda$loadMessagesInternal$177(this.h, this.f19080c, this.d, this.e, this.f19083i, this.f19081f, this.f19082g, this.f19084j, this.f19085k, this.f19086l, this.f19087m, this.f19088n, this.f19089o, this.f19090p, this.f19091q, this.f19092r, this.f19093s, this.f19094t, (TLRPC.TL_messages_getSavedHistory) this.f19095u, tLObject, tL_error);
                return;
            case 1:
                this.f19079b.lambda$loadMessagesInternal$179(this.f19080c, this.d, this.e, this.f19081f, this.f19082g, this.h, this.f19083i, this.f19084j, this.f19085k, this.f19086l, this.f19087m, this.f19088n, this.f19089o, this.f19090p, this.f19091q, this.f19092r, this.f19093s, this.f19094t, (TLRPC.TL_messages_getReplies) this.f19095u, tLObject, tL_error);
                return;
            default:
                this.f19079b.lambda$loadMessagesInternal$184(this.h, this.f19080c, this.d, this.e, this.f19083i, this.f19081f, this.f19082g, this.f19084j, this.f19085k, this.f19086l, this.f19087m, this.f19088n, this.f19089o, this.f19090p, this.f19091q, this.f19092r, this.f19093s, this.f19094t, (TLRPC.TL_messages_getHistory) this.f19095u, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19078a = i22;
        this.f19079b = messagesController;
        this.h = j10;
        this.f19080c = i10;
        this.d = i11;
        this.e = i12;
        this.f19083i = j11;
        this.f19081f = i13;
        this.f19082g = i14;
        this.f19084j = i15;
        this.f19085k = i16;
        this.f19086l = i17;
        this.f19087m = i18;
        this.f19088n = i19;
        this.f19089o = j12;
        this.f19090p = i20;
        this.f19091q = z10;
        this.f19092r = i21;
        this.f19093s = z11;
        this.f19094t = z12;
        this.f19095u = tLObject;
    }
}
