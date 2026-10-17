package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f19074a;
    public final MessagesController f19075b;
    public final int f19076c;
    public final int d;
    public final int e;
    public final int f19077f;
    public final int f19078g;
    public final long h;
    public final long f19079i;
    public final int f19080j;
    public final int f19081k;
    public final int f19082l;
    public final int f19083m;
    public final int f19084n;
    public final long f19085o;
    public final int f19086p;
    public final boolean f19087q;
    public final int f19088r;
    public final boolean f19089s;
    public final boolean f19090t;
    public final TLObject f19091u;

    public nd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19074a = 1;
        this.f19075b = messagesController;
        this.f19076c = i10;
        this.d = i11;
        this.e = i12;
        this.f19077f = i13;
        this.f19078g = i14;
        this.h = j10;
        this.f19079i = j11;
        this.f19080j = i15;
        this.f19081k = i16;
        this.f19082l = i17;
        this.f19083m = i18;
        this.f19084n = i19;
        this.f19085o = j12;
        this.f19086p = i20;
        this.f19087q = z10;
        this.f19088r = i21;
        this.f19089s = z11;
        this.f19090t = z12;
        this.f19091u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19074a) {
            case 0:
                this.f19075b.lambda$loadMessagesInternal$177(this.h, this.f19076c, this.d, this.e, this.f19079i, this.f19077f, this.f19078g, this.f19080j, this.f19081k, this.f19082l, this.f19083m, this.f19084n, this.f19085o, this.f19086p, this.f19087q, this.f19088r, this.f19089s, this.f19090t, (TLRPC.TL_messages_getSavedHistory) this.f19091u, tLObject, tL_error);
                return;
            case 1:
                this.f19075b.lambda$loadMessagesInternal$179(this.f19076c, this.d, this.e, this.f19077f, this.f19078g, this.h, this.f19079i, this.f19080j, this.f19081k, this.f19082l, this.f19083m, this.f19084n, this.f19085o, this.f19086p, this.f19087q, this.f19088r, this.f19089s, this.f19090t, (TLRPC.TL_messages_getReplies) this.f19091u, tLObject, tL_error);
                return;
            default:
                this.f19075b.lambda$loadMessagesInternal$184(this.h, this.f19076c, this.d, this.e, this.f19079i, this.f19077f, this.f19078g, this.f19080j, this.f19081k, this.f19082l, this.f19083m, this.f19084n, this.f19085o, this.f19086p, this.f19087q, this.f19088r, this.f19089s, this.f19090t, (TLRPC.TL_messages_getHistory) this.f19091u, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19074a = i22;
        this.f19075b = messagesController;
        this.h = j10;
        this.f19076c = i10;
        this.d = i11;
        this.e = i12;
        this.f19079i = j11;
        this.f19077f = i13;
        this.f19078g = i14;
        this.f19080j = i15;
        this.f19081k = i16;
        this.f19082l = i17;
        this.f19083m = i18;
        this.f19084n = i19;
        this.f19085o = j12;
        this.f19086p = i20;
        this.f19087q = z10;
        this.f19088r = i21;
        this.f19089s = z11;
        this.f19090t = z12;
        this.f19091u = tLObject;
    }
}
