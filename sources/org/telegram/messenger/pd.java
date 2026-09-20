package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f17258a;
    public final MessagesController f17259b;
    public final int f17260c;
    public final int d;
    public final int e;
    public final int f17261f;
    public final int f17262g;
    public final long h;
    public final long f17263i;
    public final int f17264j;
    public final int f17265k;
    public final int f17266l;
    public final int f17267m;
    public final int f17268n;
    public final long f17269o;
    public final int f17270p;
    public final boolean f17271q;
    public final int f17272r;
    public final boolean f17273s;
    public final boolean f17274t;
    public final TLObject f17275u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17258a = 1;
        this.f17259b = messagesController;
        this.f17260c = i10;
        this.d = i11;
        this.e = i12;
        this.f17261f = i13;
        this.f17262g = i14;
        this.h = j3;
        this.f17263i = j10;
        this.f17264j = i15;
        this.f17265k = i16;
        this.f17266l = i17;
        this.f17267m = i18;
        this.f17268n = i19;
        this.f17269o = j11;
        this.f17270p = i20;
        this.f17271q = z10;
        this.f17272r = i21;
        this.f17273s = z11;
        this.f17274t = z12;
        this.f17275u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17258a) {
            case 0:
                this.f17259b.lambda$loadMessagesInternal$178(this.h, this.f17260c, this.d, this.e, this.f17263i, this.f17261f, this.f17262g, this.f17264j, this.f17265k, this.f17266l, this.f17267m, this.f17268n, this.f17269o, this.f17270p, this.f17271q, this.f17272r, this.f17273s, this.f17274t, (TLRPC.TL_messages_getSavedHistory) this.f17275u, tLObject, tL_error);
                return;
            case 1:
                this.f17259b.lambda$loadMessagesInternal$180(this.f17260c, this.d, this.e, this.f17261f, this.f17262g, this.h, this.f17263i, this.f17264j, this.f17265k, this.f17266l, this.f17267m, this.f17268n, this.f17269o, this.f17270p, this.f17271q, this.f17272r, this.f17273s, this.f17274t, (TLRPC.TL_messages_getReplies) this.f17275u, tLObject, tL_error);
                return;
            default:
                this.f17259b.lambda$loadMessagesInternal$185(this.h, this.f17260c, this.d, this.e, this.f17263i, this.f17261f, this.f17262g, this.f17264j, this.f17265k, this.f17266l, this.f17267m, this.f17268n, this.f17269o, this.f17270p, this.f17271q, this.f17272r, this.f17273s, this.f17274t, (TLRPC.TL_messages_getHistory) this.f17275u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17258a = i22;
        this.f17259b = messagesController;
        this.h = j3;
        this.f17260c = i10;
        this.d = i11;
        this.e = i12;
        this.f17263i = j10;
        this.f17261f = i13;
        this.f17262g = i14;
        this.f17264j = i15;
        this.f17265k = i16;
        this.f17266l = i17;
        this.f17267m = i18;
        this.f17268n = i19;
        this.f17269o = j11;
        this.f17270p = i20;
        this.f17271q = z10;
        this.f17272r = i21;
        this.f17273s = z11;
        this.f17274t = z12;
        this.f17275u = tLObject;
    }
}
