package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f18840a;
    public final MessagesController f18841b;
    public final int f18842c;
    public final int d;
    public final int f18843e;
    public final int f18844f;
    public final int f18845g;
    public final long h;
    public final long f18846i;
    public final int f18847j;
    public final int f18848k;
    public final int f18849l;
    public final int f18850m;
    public final int f18851n;
    public final long f18852o;
    public final int f18853p;
    public final boolean f18854q;
    public final int f18855r;
    public final boolean f18856s;
    public final boolean f18857t;
    public final TLObject f18858u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f18840a = 1;
        this.f18841b = messagesController;
        this.f18842c = i10;
        this.d = i11;
        this.f18843e = i12;
        this.f18844f = i13;
        this.f18845g = i14;
        this.h = j3;
        this.f18846i = j10;
        this.f18847j = i15;
        this.f18848k = i16;
        this.f18849l = i17;
        this.f18850m = i18;
        this.f18851n = i19;
        this.f18852o = j11;
        this.f18853p = i20;
        this.f18854q = z10;
        this.f18855r = i21;
        this.f18856s = z11;
        this.f18857t = z12;
        this.f18858u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18840a) {
            case 0:
                this.f18841b.lambda$loadMessagesInternal$177(this.h, this.f18842c, this.d, this.f18843e, this.f18846i, this.f18844f, this.f18845g, this.f18847j, this.f18848k, this.f18849l, this.f18850m, this.f18851n, this.f18852o, this.f18853p, this.f18854q, this.f18855r, this.f18856s, this.f18857t, (TLRPC.TL_messages_getSavedHistory) this.f18858u, tLObject, tL_error);
                return;
            case 1:
                this.f18841b.lambda$loadMessagesInternal$179(this.f18842c, this.d, this.f18843e, this.f18844f, this.f18845g, this.h, this.f18846i, this.f18847j, this.f18848k, this.f18849l, this.f18850m, this.f18851n, this.f18852o, this.f18853p, this.f18854q, this.f18855r, this.f18856s, this.f18857t, (TLRPC.TL_messages_getReplies) this.f18858u, tLObject, tL_error);
                return;
            default:
                this.f18841b.lambda$loadMessagesInternal$184(this.h, this.f18842c, this.d, this.f18843e, this.f18846i, this.f18844f, this.f18845g, this.f18847j, this.f18848k, this.f18849l, this.f18850m, this.f18851n, this.f18852o, this.f18853p, this.f18854q, this.f18855r, this.f18856s, this.f18857t, (TLRPC.TL_messages_getHistory) this.f18858u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f18840a = i22;
        this.f18841b = messagesController;
        this.h = j3;
        this.f18842c = i10;
        this.d = i11;
        this.f18843e = i12;
        this.f18846i = j10;
        this.f18844f = i13;
        this.f18845g = i14;
        this.f18847j = i15;
        this.f18848k = i16;
        this.f18849l = i17;
        this.f18850m = i18;
        this.f18851n = i19;
        this.f18852o = j11;
        this.f18853p = i20;
        this.f18854q = z10;
        this.f18855r = i21;
        this.f18856s = z11;
        this.f18857t = z12;
        this.f18858u = tLObject;
    }
}
