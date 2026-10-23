package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f19492a;
    public final MessagesController f19493b;
    public final int f19494c;
    public final int d;
    public final int e;
    public final int f19495f;
    public final int f19496g;
    public final long h;
    public final long f19497i;
    public final int f19498j;
    public final int f19499k;
    public final int f19500l;
    public final int f19501m;
    public final int f19502n;
    public final long f19503o;
    public final int f19504p;
    public final boolean f19505q;
    public final int f19506r;
    public final boolean f19507s;
    public final boolean f19508t;
    public final TLObject f19509u;

    public rd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19492a = 1;
        this.f19493b = messagesController;
        this.f19494c = i10;
        this.d = i11;
        this.e = i12;
        this.f19495f = i13;
        this.f19496g = i14;
        this.h = j10;
        this.f19497i = j11;
        this.f19498j = i15;
        this.f19499k = i16;
        this.f19500l = i17;
        this.f19501m = i18;
        this.f19502n = i19;
        this.f19503o = j12;
        this.f19504p = i20;
        this.f19505q = z10;
        this.f19506r = i21;
        this.f19507s = z11;
        this.f19508t = z12;
        this.f19509u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19492a) {
            case 0:
                this.f19493b.lambda$loadMessagesInternal$177(this.h, this.f19494c, this.d, this.e, this.f19497i, this.f19495f, this.f19496g, this.f19498j, this.f19499k, this.f19500l, this.f19501m, this.f19502n, this.f19503o, this.f19504p, this.f19505q, this.f19506r, this.f19507s, this.f19508t, (TLRPC.TL_messages_getSavedHistory) this.f19509u, tLObject, tL_error);
                return;
            case 1:
                this.f19493b.lambda$loadMessagesInternal$179(this.f19494c, this.d, this.e, this.f19495f, this.f19496g, this.h, this.f19497i, this.f19498j, this.f19499k, this.f19500l, this.f19501m, this.f19502n, this.f19503o, this.f19504p, this.f19505q, this.f19506r, this.f19507s, this.f19508t, (TLRPC.TL_messages_getReplies) this.f19509u, tLObject, tL_error);
                return;
            default:
                this.f19493b.lambda$loadMessagesInternal$184(this.h, this.f19494c, this.d, this.e, this.f19497i, this.f19495f, this.f19496g, this.f19498j, this.f19499k, this.f19500l, this.f19501m, this.f19502n, this.f19503o, this.f19504p, this.f19505q, this.f19506r, this.f19507s, this.f19508t, (TLRPC.TL_messages_getHistory) this.f19509u, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19492a = i22;
        this.f19493b = messagesController;
        this.h = j10;
        this.f19494c = i10;
        this.d = i11;
        this.e = i12;
        this.f19497i = j11;
        this.f19495f = i13;
        this.f19496g = i14;
        this.f19498j = i15;
        this.f19499k = i16;
        this.f19500l = i17;
        this.f19501m = i18;
        this.f19502n = i19;
        this.f19503o = j12;
        this.f19504p = i20;
        this.f19505q = z10;
        this.f19506r = i21;
        this.f19507s = z11;
        this.f19508t = z12;
        this.f19509u = tLObject;
    }
}
