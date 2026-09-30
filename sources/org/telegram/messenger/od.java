package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17214a;
    public final MessagesController f17215b;
    public final int f17216c;
    public final int d;
    public final int e;
    public final int f17217f;
    public final int f17218g;
    public final long h;
    public final long f17219i;
    public final int f17220j;
    public final int f17221k;
    public final int f17222l;
    public final int f17223m;
    public final int f17224n;
    public final long f17225o;
    public final int f17226p;
    public final boolean f17227q;
    public final int f17228r;
    public final boolean f17229s;
    public final boolean f17230t;
    public final TLObject f17231u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17214a = 1;
        this.f17215b = messagesController;
        this.f17216c = i10;
        this.d = i11;
        this.e = i12;
        this.f17217f = i13;
        this.f17218g = i14;
        this.h = j3;
        this.f17219i = j10;
        this.f17220j = i15;
        this.f17221k = i16;
        this.f17222l = i17;
        this.f17223m = i18;
        this.f17224n = i19;
        this.f17225o = j11;
        this.f17226p = i20;
        this.f17227q = z10;
        this.f17228r = i21;
        this.f17229s = z11;
        this.f17230t = z12;
        this.f17231u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17214a) {
            case 0:
                this.f17215b.lambda$loadMessagesInternal$178(this.h, this.f17216c, this.d, this.e, this.f17219i, this.f17217f, this.f17218g, this.f17220j, this.f17221k, this.f17222l, this.f17223m, this.f17224n, this.f17225o, this.f17226p, this.f17227q, this.f17228r, this.f17229s, this.f17230t, (TLRPC.TL_messages_getSavedHistory) this.f17231u, tLObject, tL_error);
                return;
            case 1:
                this.f17215b.lambda$loadMessagesInternal$180(this.f17216c, this.d, this.e, this.f17217f, this.f17218g, this.h, this.f17219i, this.f17220j, this.f17221k, this.f17222l, this.f17223m, this.f17224n, this.f17225o, this.f17226p, this.f17227q, this.f17228r, this.f17229s, this.f17230t, (TLRPC.TL_messages_getReplies) this.f17231u, tLObject, tL_error);
                return;
            default:
                this.f17215b.lambda$loadMessagesInternal$185(this.h, this.f17216c, this.d, this.e, this.f17219i, this.f17217f, this.f17218g, this.f17220j, this.f17221k, this.f17222l, this.f17223m, this.f17224n, this.f17225o, this.f17226p, this.f17227q, this.f17228r, this.f17229s, this.f17230t, (TLRPC.TL_messages_getHistory) this.f17231u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17214a = i22;
        this.f17215b = messagesController;
        this.h = j3;
        this.f17216c = i10;
        this.d = i11;
        this.e = i12;
        this.f17219i = j10;
        this.f17217f = i13;
        this.f17218g = i14;
        this.f17220j = i15;
        this.f17221k = i16;
        this.f17222l = i17;
        this.f17223m = i18;
        this.f17224n = i19;
        this.f17225o = j11;
        this.f17226p = i20;
        this.f17227q = z10;
        this.f17228r = i21;
        this.f17229s = z11;
        this.f17230t = z12;
        this.f17231u = tLObject;
    }
}
