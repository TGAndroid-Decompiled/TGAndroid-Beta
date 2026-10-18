package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f19151a;
    public final MessagesController f19152b;
    public final int f19153c;
    public final int d;
    public final int e;
    public final int f19154f;
    public final int f19155g;
    public final long h;
    public final long f19156i;
    public final int f19157j;
    public final int f19158k;
    public final int f19159l;
    public final int f19160m;
    public final int f19161n;
    public final long f19162o;
    public final int f19163p;
    public final boolean f19164q;
    public final int f19165r;
    public final boolean f19166s;
    public final boolean f19167t;
    public final TLObject f19168u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19151a = 1;
        this.f19152b = messagesController;
        this.f19153c = i10;
        this.d = i11;
        this.e = i12;
        this.f19154f = i13;
        this.f19155g = i14;
        this.h = j10;
        this.f19156i = j11;
        this.f19157j = i15;
        this.f19158k = i16;
        this.f19159l = i17;
        this.f19160m = i18;
        this.f19161n = i19;
        this.f19162o = j12;
        this.f19163p = i20;
        this.f19164q = z10;
        this.f19165r = i21;
        this.f19166s = z11;
        this.f19167t = z12;
        this.f19168u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19151a) {
            case 0:
                this.f19152b.lambda$loadMessagesInternal$177(this.h, this.f19153c, this.d, this.e, this.f19156i, this.f19154f, this.f19155g, this.f19157j, this.f19158k, this.f19159l, this.f19160m, this.f19161n, this.f19162o, this.f19163p, this.f19164q, this.f19165r, this.f19166s, this.f19167t, (TLRPC.TL_messages_getSavedHistory) this.f19168u, tLObject, tL_error);
                return;
            case 1:
                this.f19152b.lambda$loadMessagesInternal$179(this.f19153c, this.d, this.e, this.f19154f, this.f19155g, this.h, this.f19156i, this.f19157j, this.f19158k, this.f19159l, this.f19160m, this.f19161n, this.f19162o, this.f19163p, this.f19164q, this.f19165r, this.f19166s, this.f19167t, (TLRPC.TL_messages_getReplies) this.f19168u, tLObject, tL_error);
                return;
            default:
                this.f19152b.lambda$loadMessagesInternal$184(this.h, this.f19153c, this.d, this.e, this.f19156i, this.f19154f, this.f19155g, this.f19157j, this.f19158k, this.f19159l, this.f19160m, this.f19161n, this.f19162o, this.f19163p, this.f19164q, this.f19165r, this.f19166s, this.f19167t, (TLRPC.TL_messages_getHistory) this.f19168u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19151a = i22;
        this.f19152b = messagesController;
        this.h = j10;
        this.f19153c = i10;
        this.d = i11;
        this.e = i12;
        this.f19156i = j11;
        this.f19154f = i13;
        this.f19155g = i14;
        this.f19157j = i15;
        this.f19158k = i16;
        this.f19159l = i17;
        this.f19160m = i18;
        this.f19161n = i19;
        this.f19162o = j12;
        this.f19163p = i20;
        this.f19164q = z10;
        this.f19165r = i21;
        this.f19166s = z11;
        this.f19167t = z12;
        this.f19168u = tLObject;
    }
}
