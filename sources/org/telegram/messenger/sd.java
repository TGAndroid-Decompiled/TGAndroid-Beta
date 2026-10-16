package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f18094a;
    public final MessagesController f18095b;
    public final int f18096c;
    public final int d;
    public final int e;
    public final int f18097f;
    public final int f18098g;
    public final long h;
    public final long f18099i;
    public final int f18100j;
    public final int f18101k;
    public final int f18102l;
    public final int f18103m;
    public final int f18104n;
    public final long f18105o;
    public final int f18106p;
    public final boolean f18107q;
    public final int f18108r;
    public final boolean f18109s;
    public final boolean f18110t;
    public final TLObject f18111u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18094a = 1;
        this.f18095b = messagesController;
        this.f18096c = i10;
        this.d = i11;
        this.e = i12;
        this.f18097f = i13;
        this.f18098g = i14;
        this.h = j10;
        this.f18099i = j11;
        this.f18100j = i15;
        this.f18101k = i16;
        this.f18102l = i17;
        this.f18103m = i18;
        this.f18104n = i19;
        this.f18105o = j12;
        this.f18106p = i20;
        this.f18107q = z10;
        this.f18108r = i21;
        this.f18109s = z11;
        this.f18110t = z12;
        this.f18111u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18094a) {
            case 0:
                this.f18095b.lambda$loadMessagesInternal$177(this.h, this.f18096c, this.d, this.e, this.f18099i, this.f18097f, this.f18098g, this.f18100j, this.f18101k, this.f18102l, this.f18103m, this.f18104n, this.f18105o, this.f18106p, this.f18107q, this.f18108r, this.f18109s, this.f18110t, (TLRPC.TL_messages_getSavedHistory) this.f18111u, tLObject, tL_error);
                return;
            case 1:
                this.f18095b.lambda$loadMessagesInternal$179(this.f18096c, this.d, this.e, this.f18097f, this.f18098g, this.h, this.f18099i, this.f18100j, this.f18101k, this.f18102l, this.f18103m, this.f18104n, this.f18105o, this.f18106p, this.f18107q, this.f18108r, this.f18109s, this.f18110t, (TLRPC.TL_messages_getReplies) this.f18111u, tLObject, tL_error);
                return;
            default:
                this.f18095b.lambda$loadMessagesInternal$184(this.h, this.f18096c, this.d, this.e, this.f18099i, this.f18097f, this.f18098g, this.f18100j, this.f18101k, this.f18102l, this.f18103m, this.f18104n, this.f18105o, this.f18106p, this.f18107q, this.f18108r, this.f18109s, this.f18110t, (TLRPC.TL_messages_getHistory) this.f18111u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18094a = i22;
        this.f18095b = messagesController;
        this.h = j10;
        this.f18096c = i10;
        this.d = i11;
        this.e = i12;
        this.f18099i = j11;
        this.f18097f = i13;
        this.f18098g = i14;
        this.f18100j = i15;
        this.f18101k = i16;
        this.f18102l = i17;
        this.f18103m = i18;
        this.f18104n = i19;
        this.f18105o = j12;
        this.f18106p = i20;
        this.f18107q = z10;
        this.f18108r = i21;
        this.f18109s = z11;
        this.f18110t = z12;
        this.f18111u = tLObject;
    }
}
