package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f18388a;
    public final MessagesController f18389b;
    public final int f18390c;
    public final int d;
    public final int e;
    public final int f18391f;
    public final int f18392g;
    public final long h;
    public final long f18393i;
    public final int f18394j;
    public final int f18395k;
    public final int f18396l;
    public final int f18397m;
    public final int f18398n;
    public final long f18399o;
    public final int f18400p;
    public final boolean f18401q;
    public final int f18402r;
    public final boolean f18403s;
    public final boolean f18404t;
    public final TLObject f18405u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18388a = 1;
        this.f18389b = messagesController;
        this.f18390c = i10;
        this.d = i11;
        this.e = i12;
        this.f18391f = i13;
        this.f18392g = i14;
        this.h = j10;
        this.f18393i = j11;
        this.f18394j = i15;
        this.f18395k = i16;
        this.f18396l = i17;
        this.f18397m = i18;
        this.f18398n = i19;
        this.f18399o = j12;
        this.f18400p = i20;
        this.f18401q = z10;
        this.f18402r = i21;
        this.f18403s = z11;
        this.f18404t = z12;
        this.f18405u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18388a) {
            case 0:
                this.f18389b.lambda$loadMessagesInternal$177(this.h, this.f18390c, this.d, this.e, this.f18393i, this.f18391f, this.f18392g, this.f18394j, this.f18395k, this.f18396l, this.f18397m, this.f18398n, this.f18399o, this.f18400p, this.f18401q, this.f18402r, this.f18403s, this.f18404t, (TLRPC.TL_messages_getSavedHistory) this.f18405u, tLObject, tL_error);
                return;
            case 1:
                this.f18389b.lambda$loadMessagesInternal$179(this.f18390c, this.d, this.e, this.f18391f, this.f18392g, this.h, this.f18393i, this.f18394j, this.f18395k, this.f18396l, this.f18397m, this.f18398n, this.f18399o, this.f18400p, this.f18401q, this.f18402r, this.f18403s, this.f18404t, (TLRPC.TL_messages_getReplies) this.f18405u, tLObject, tL_error);
                return;
            default:
                this.f18389b.lambda$loadMessagesInternal$184(this.h, this.f18390c, this.d, this.e, this.f18393i, this.f18391f, this.f18392g, this.f18394j, this.f18395k, this.f18396l, this.f18397m, this.f18398n, this.f18399o, this.f18400p, this.f18401q, this.f18402r, this.f18403s, this.f18404t, (TLRPC.TL_messages_getHistory) this.f18405u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18388a = i22;
        this.f18389b = messagesController;
        this.h = j10;
        this.f18390c = i10;
        this.d = i11;
        this.e = i12;
        this.f18393i = j11;
        this.f18391f = i13;
        this.f18392g = i14;
        this.f18394j = i15;
        this.f18395k = i16;
        this.f18396l = i17;
        this.f18397m = i18;
        this.f18398n = i19;
        this.f18399o = j12;
        this.f18400p = i20;
        this.f18401q = z10;
        this.f18402r = i21;
        this.f18403s = z11;
        this.f18404t = z12;
        this.f18405u = tLObject;
    }
}
