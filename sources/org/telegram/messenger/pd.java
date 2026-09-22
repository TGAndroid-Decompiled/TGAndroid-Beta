package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f17037a;
    public final MessagesController f17038b;
    public final int f17039c;
    public final int d;
    public final int e;
    public final int f17040f;
    public final int f17041g;
    public final long h;
    public final long f17042i;
    public final int f17043j;
    public final int f17044k;
    public final int f17045l;
    public final int f17046m;
    public final int f17047n;
    public final long f17048o;
    public final int f17049p;
    public final boolean f17050q;
    public final int f17051r;
    public final boolean f17052s;
    public final boolean f17053t;
    public final TLObject f17054u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17037a = 1;
        this.f17038b = messagesController;
        this.f17039c = i10;
        this.d = i11;
        this.e = i12;
        this.f17040f = i13;
        this.f17041g = i14;
        this.h = j3;
        this.f17042i = j10;
        this.f17043j = i15;
        this.f17044k = i16;
        this.f17045l = i17;
        this.f17046m = i18;
        this.f17047n = i19;
        this.f17048o = j11;
        this.f17049p = i20;
        this.f17050q = z10;
        this.f17051r = i21;
        this.f17052s = z11;
        this.f17053t = z12;
        this.f17054u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17037a) {
            case 0:
                this.f17038b.lambda$loadMessagesInternal$178(this.h, this.f17039c, this.d, this.e, this.f17042i, this.f17040f, this.f17041g, this.f17043j, this.f17044k, this.f17045l, this.f17046m, this.f17047n, this.f17048o, this.f17049p, this.f17050q, this.f17051r, this.f17052s, this.f17053t, (TLRPC.TL_messages_getSavedHistory) this.f17054u, tLObject, tL_error);
                return;
            case 1:
                this.f17038b.lambda$loadMessagesInternal$180(this.f17039c, this.d, this.e, this.f17040f, this.f17041g, this.h, this.f17042i, this.f17043j, this.f17044k, this.f17045l, this.f17046m, this.f17047n, this.f17048o, this.f17049p, this.f17050q, this.f17051r, this.f17052s, this.f17053t, (TLRPC.TL_messages_getReplies) this.f17054u, tLObject, tL_error);
                return;
            default:
                this.f17038b.lambda$loadMessagesInternal$185(this.h, this.f17039c, this.d, this.e, this.f17042i, this.f17040f, this.f17041g, this.f17043j, this.f17044k, this.f17045l, this.f17046m, this.f17047n, this.f17048o, this.f17049p, this.f17050q, this.f17051r, this.f17052s, this.f17053t, (TLRPC.TL_messages_getHistory) this.f17054u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17037a = i22;
        this.f17038b = messagesController;
        this.h = j3;
        this.f17039c = i10;
        this.d = i11;
        this.e = i12;
        this.f17042i = j10;
        this.f17040f = i13;
        this.f17041g = i14;
        this.f17043j = i15;
        this.f17044k = i16;
        this.f17045l = i17;
        this.f17046m = i18;
        this.f17047n = i19;
        this.f17048o = j11;
        this.f17049p = i20;
        this.f17050q = z10;
        this.f17051r = i21;
        this.f17052s = z11;
        this.f17053t = z12;
        this.f17054u = tLObject;
    }
}
