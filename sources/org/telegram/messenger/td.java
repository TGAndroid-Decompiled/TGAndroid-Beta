package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class td implements RequestDelegate {
    public final int f21305a;
    public final MessagesController f21306b;
    public final int f21307c;
    public final int d;
    public final int e;
    public final int f21308f;
    public final int f21309g;
    public final long h;
    public final long f21310i;
    public final int f21311j;
    public final int f21312k;
    public final int f21313l;
    public final int f21314m;
    public final int f21315n;
    public final long f21316o;
    public final int f21317p;
    public final boolean f21318q;
    public final int f21319r;
    public final boolean f21320s;
    public final boolean f21321t;
    public final TLObject f21322u;

    public td(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f21305a = 1;
        this.f21306b = messagesController;
        this.f21307c = i10;
        this.d = i11;
        this.e = i12;
        this.f21308f = i13;
        this.f21309g = i14;
        this.h = j10;
        this.f21310i = j11;
        this.f21311j = i15;
        this.f21312k = i16;
        this.f21313l = i17;
        this.f21314m = i18;
        this.f21315n = i19;
        this.f21316o = j12;
        this.f21317p = i20;
        this.f21318q = z10;
        this.f21319r = i21;
        this.f21320s = z11;
        this.f21321t = z12;
        this.f21322u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21305a) {
            case 0:
                this.f21306b.lambda$loadMessagesInternal$177(this.h, this.f21307c, this.d, this.e, this.f21310i, this.f21308f, this.f21309g, this.f21311j, this.f21312k, this.f21313l, this.f21314m, this.f21315n, this.f21316o, this.f21317p, this.f21318q, this.f21319r, this.f21320s, this.f21321t, (TLRPC.TL_messages_getSavedHistory) this.f21322u, tLObject, tL_error);
                return;
            case 1:
                this.f21306b.lambda$loadMessagesInternal$179(this.f21307c, this.d, this.e, this.f21308f, this.f21309g, this.h, this.f21310i, this.f21311j, this.f21312k, this.f21313l, this.f21314m, this.f21315n, this.f21316o, this.f21317p, this.f21318q, this.f21319r, this.f21320s, this.f21321t, (TLRPC.TL_messages_getReplies) this.f21322u, tLObject, tL_error);
                return;
            default:
                this.f21306b.lambda$loadMessagesInternal$184(this.h, this.f21307c, this.d, this.e, this.f21310i, this.f21308f, this.f21309g, this.f21311j, this.f21312k, this.f21313l, this.f21314m, this.f21315n, this.f21316o, this.f21317p, this.f21318q, this.f21319r, this.f21320s, this.f21321t, (TLRPC.TL_messages_getHistory) this.f21322u, tLObject, tL_error);
                return;
        }
    }

    public td(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f21305a = i22;
        this.f21306b = messagesController;
        this.h = j10;
        this.f21307c = i10;
        this.d = i11;
        this.e = i12;
        this.f21310i = j11;
        this.f21308f = i13;
        this.f21309g = i14;
        this.f21311j = i15;
        this.f21312k = i16;
        this.f21313l = i17;
        this.f21314m = i18;
        this.f21315n = i19;
        this.f21316o = j12;
        this.f21317p = i20;
        this.f21318q = z10;
        this.f21319r = i21;
        this.f21320s = z11;
        this.f21321t = z12;
        this.f21322u = tLObject;
    }
}
