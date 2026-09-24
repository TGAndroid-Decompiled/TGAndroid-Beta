package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17178a;
    public final MessagesController f17179b;
    public final int f17180c;
    public final int d;
    public final int e;
    public final int f17181f;
    public final int f17182g;
    public final long h;
    public final long f17183i;
    public final int f17184j;
    public final int f17185k;
    public final int f17186l;
    public final int f17187m;
    public final int f17188n;
    public final long f17189o;
    public final int f17190p;
    public final boolean f17191q;
    public final int f17192r;
    public final boolean f17193s;
    public final boolean f17194t;
    public final TLObject f17195u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17178a = 1;
        this.f17179b = messagesController;
        this.f17180c = i10;
        this.d = i11;
        this.e = i12;
        this.f17181f = i13;
        this.f17182g = i14;
        this.h = j3;
        this.f17183i = j10;
        this.f17184j = i15;
        this.f17185k = i16;
        this.f17186l = i17;
        this.f17187m = i18;
        this.f17188n = i19;
        this.f17189o = j11;
        this.f17190p = i20;
        this.f17191q = z10;
        this.f17192r = i21;
        this.f17193s = z11;
        this.f17194t = z12;
        this.f17195u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17178a) {
            case 0:
                this.f17179b.lambda$loadMessagesInternal$178(this.h, this.f17180c, this.d, this.e, this.f17183i, this.f17181f, this.f17182g, this.f17184j, this.f17185k, this.f17186l, this.f17187m, this.f17188n, this.f17189o, this.f17190p, this.f17191q, this.f17192r, this.f17193s, this.f17194t, (TLRPC.TL_messages_getSavedHistory) this.f17195u, tLObject, tL_error);
                return;
            case 1:
                this.f17179b.lambda$loadMessagesInternal$180(this.f17180c, this.d, this.e, this.f17181f, this.f17182g, this.h, this.f17183i, this.f17184j, this.f17185k, this.f17186l, this.f17187m, this.f17188n, this.f17189o, this.f17190p, this.f17191q, this.f17192r, this.f17193s, this.f17194t, (TLRPC.TL_messages_getReplies) this.f17195u, tLObject, tL_error);
                return;
            default:
                this.f17179b.lambda$loadMessagesInternal$185(this.h, this.f17180c, this.d, this.e, this.f17183i, this.f17181f, this.f17182g, this.f17184j, this.f17185k, this.f17186l, this.f17187m, this.f17188n, this.f17189o, this.f17190p, this.f17191q, this.f17192r, this.f17193s, this.f17194t, (TLRPC.TL_messages_getHistory) this.f17195u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17178a = i22;
        this.f17179b = messagesController;
        this.h = j3;
        this.f17180c = i10;
        this.d = i11;
        this.e = i12;
        this.f17183i = j10;
        this.f17181f = i13;
        this.f17182g = i14;
        this.f17184j = i15;
        this.f17185k = i16;
        this.f17186l = i17;
        this.f17187m = i18;
        this.f17188n = i19;
        this.f17189o = j11;
        this.f17190p = i20;
        this.f17191q = z10;
        this.f17192r = i21;
        this.f17193s = z11;
        this.f17194t = z12;
        this.f17195u = tLObject;
    }
}
