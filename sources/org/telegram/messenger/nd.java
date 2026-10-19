package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f19075a;
    public final MessagesController f19076b;
    public final int f19077c;
    public final int d;
    public final int e;
    public final int f19078f;
    public final int f19079g;
    public final long h;
    public final long f19080i;
    public final int f19081j;
    public final int f19082k;
    public final int f19083l;
    public final int f19084m;
    public final int f19085n;
    public final long f19086o;
    public final int f19087p;
    public final boolean f19088q;
    public final int f19089r;
    public final boolean f19090s;
    public final boolean f19091t;
    public final TLObject f19092u;

    public nd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19075a = 1;
        this.f19076b = messagesController;
        this.f19077c = i10;
        this.d = i11;
        this.e = i12;
        this.f19078f = i13;
        this.f19079g = i14;
        this.h = j10;
        this.f19080i = j11;
        this.f19081j = i15;
        this.f19082k = i16;
        this.f19083l = i17;
        this.f19084m = i18;
        this.f19085n = i19;
        this.f19086o = j12;
        this.f19087p = i20;
        this.f19088q = z10;
        this.f19089r = i21;
        this.f19090s = z11;
        this.f19091t = z12;
        this.f19092u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19075a) {
            case 0:
                this.f19076b.lambda$loadMessagesInternal$177(this.h, this.f19077c, this.d, this.e, this.f19080i, this.f19078f, this.f19079g, this.f19081j, this.f19082k, this.f19083l, this.f19084m, this.f19085n, this.f19086o, this.f19087p, this.f19088q, this.f19089r, this.f19090s, this.f19091t, (TLRPC.TL_messages_getSavedHistory) this.f19092u, tLObject, tL_error);
                return;
            case 1:
                this.f19076b.lambda$loadMessagesInternal$179(this.f19077c, this.d, this.e, this.f19078f, this.f19079g, this.h, this.f19080i, this.f19081j, this.f19082k, this.f19083l, this.f19084m, this.f19085n, this.f19086o, this.f19087p, this.f19088q, this.f19089r, this.f19090s, this.f19091t, (TLRPC.TL_messages_getReplies) this.f19092u, tLObject, tL_error);
                return;
            default:
                this.f19076b.lambda$loadMessagesInternal$184(this.h, this.f19077c, this.d, this.e, this.f19080i, this.f19078f, this.f19079g, this.f19081j, this.f19082k, this.f19083l, this.f19084m, this.f19085n, this.f19086o, this.f19087p, this.f19088q, this.f19089r, this.f19090s, this.f19091t, (TLRPC.TL_messages_getHistory) this.f19092u, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19075a = i22;
        this.f19076b = messagesController;
        this.h = j10;
        this.f19077c = i10;
        this.d = i11;
        this.e = i12;
        this.f19080i = j11;
        this.f19078f = i13;
        this.f19079g = i14;
        this.f19081j = i15;
        this.f19082k = i16;
        this.f19083l = i17;
        this.f19084m = i18;
        this.f19085n = i19;
        this.f19086o = j12;
        this.f19087p = i20;
        this.f19088q = z10;
        this.f19089r = i21;
        this.f19090s = z11;
        this.f19091t = z12;
        this.f19092u = tLObject;
    }
}
