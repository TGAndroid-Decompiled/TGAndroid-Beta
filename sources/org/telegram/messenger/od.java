package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f16942a;
    public final MessagesController f16943b;
    public final int f16944c;
    public final int d;
    public final int e;
    public final int f16945f;
    public final int f16946g;
    public final long h;
    public final long f16947i;
    public final int f16948j;
    public final int f16949k;
    public final int f16950l;
    public final int f16951m;
    public final int f16952n;
    public final long f16953o;
    public final int f16954p;
    public final boolean f16955q;
    public final int f16956r;
    public final boolean f16957s;
    public final boolean f16958t;
    public final TLObject f16959u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f16942a = 1;
        this.f16943b = messagesController;
        this.f16944c = i10;
        this.d = i11;
        this.e = i12;
        this.f16945f = i13;
        this.f16946g = i14;
        this.h = j3;
        this.f16947i = j10;
        this.f16948j = i15;
        this.f16949k = i16;
        this.f16950l = i17;
        this.f16951m = i18;
        this.f16952n = i19;
        this.f16953o = j11;
        this.f16954p = i20;
        this.f16955q = z10;
        this.f16956r = i21;
        this.f16957s = z11;
        this.f16958t = z12;
        this.f16959u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16942a) {
            case 0:
                this.f16943b.lambda$loadMessagesInternal$178(this.h, this.f16944c, this.d, this.e, this.f16947i, this.f16945f, this.f16946g, this.f16948j, this.f16949k, this.f16950l, this.f16951m, this.f16952n, this.f16953o, this.f16954p, this.f16955q, this.f16956r, this.f16957s, this.f16958t, (TLRPC.TL_messages_getSavedHistory) this.f16959u, tLObject, tL_error);
                return;
            case 1:
                this.f16943b.lambda$loadMessagesInternal$180(this.f16944c, this.d, this.e, this.f16945f, this.f16946g, this.h, this.f16947i, this.f16948j, this.f16949k, this.f16950l, this.f16951m, this.f16952n, this.f16953o, this.f16954p, this.f16955q, this.f16956r, this.f16957s, this.f16958t, (TLRPC.TL_messages_getReplies) this.f16959u, tLObject, tL_error);
                return;
            default:
                this.f16943b.lambda$loadMessagesInternal$185(this.h, this.f16944c, this.d, this.e, this.f16947i, this.f16945f, this.f16946g, this.f16948j, this.f16949k, this.f16950l, this.f16951m, this.f16952n, this.f16953o, this.f16954p, this.f16955q, this.f16956r, this.f16957s, this.f16958t, (TLRPC.TL_messages_getHistory) this.f16959u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f16942a = i22;
        this.f16943b = messagesController;
        this.h = j3;
        this.f16944c = i10;
        this.d = i11;
        this.e = i12;
        this.f16947i = j10;
        this.f16945f = i13;
        this.f16946g = i14;
        this.f16948j = i15;
        this.f16949k = i16;
        this.f16950l = i17;
        this.f16951m = i18;
        this.f16952n = i19;
        this.f16953o = j11;
        this.f16954p = i20;
        this.f16955q = z10;
        this.f16956r = i21;
        this.f16957s = z11;
        this.f16958t = z12;
        this.f16959u = tLObject;
    }
}
