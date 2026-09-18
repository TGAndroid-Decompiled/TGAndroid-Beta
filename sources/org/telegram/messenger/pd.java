package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd implements RequestDelegate {
    public final int f17217a;
    public final MessagesController f17218b;
    public final int f17219c;
    public final int d;
    public final int e;
    public final int f17220f;
    public final int f17221g;
    public final long h;
    public final long f17222i;
    public final int f17223j;
    public final int f17224k;
    public final int f17225l;
    public final int f17226m;
    public final int f17227n;
    public final long f17228o;
    public final int f17229p;
    public final boolean f17230q;
    public final int f17231r;
    public final boolean f17232s;
    public final boolean f17233t;
    public final TLObject f17234u;

    public pd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j3, long j10, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f17217a = 1;
        this.f17218b = messagesController;
        this.f17219c = i10;
        this.d = i11;
        this.e = i12;
        this.f17220f = i13;
        this.f17221g = i14;
        this.h = j3;
        this.f17222i = j10;
        this.f17223j = i15;
        this.f17224k = i16;
        this.f17225l = i17;
        this.f17226m = i18;
        this.f17227n = i19;
        this.f17228o = j11;
        this.f17229p = i20;
        this.f17230q = z10;
        this.f17231r = i21;
        this.f17232s = z11;
        this.f17233t = z12;
        this.f17234u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17217a) {
            case 0:
                this.f17218b.lambda$loadMessagesInternal$178(this.h, this.f17219c, this.d, this.e, this.f17222i, this.f17220f, this.f17221g, this.f17223j, this.f17224k, this.f17225l, this.f17226m, this.f17227n, this.f17228o, this.f17229p, this.f17230q, this.f17231r, this.f17232s, this.f17233t, (TLRPC.TL_messages_getSavedHistory) this.f17234u, tLObject, tL_error);
                return;
            case 1:
                this.f17218b.lambda$loadMessagesInternal$180(this.f17219c, this.d, this.e, this.f17220f, this.f17221g, this.h, this.f17222i, this.f17223j, this.f17224k, this.f17225l, this.f17226m, this.f17227n, this.f17228o, this.f17229p, this.f17230q, this.f17231r, this.f17232s, this.f17233t, (TLRPC.TL_messages_getReplies) this.f17234u, tLObject, tL_error);
                return;
            default:
                this.f17218b.lambda$loadMessagesInternal$185(this.h, this.f17219c, this.d, this.e, this.f17222i, this.f17220f, this.f17221g, this.f17223j, this.f17224k, this.f17225l, this.f17226m, this.f17227n, this.f17228o, this.f17229p, this.f17230q, this.f17231r, this.f17232s, this.f17233t, (TLRPC.TL_messages_getHistory) this.f17234u, tLObject, tL_error);
                return;
        }
    }

    public pd(MessagesController messagesController, long j3, int i10, int i11, int i12, long j10, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f17217a = i22;
        this.f17218b = messagesController;
        this.h = j3;
        this.f17219c = i10;
        this.d = i11;
        this.e = i12;
        this.f17222i = j10;
        this.f17220f = i13;
        this.f17221g = i14;
        this.f17223j = i15;
        this.f17224k = i16;
        this.f17225l = i17;
        this.f17226m = i18;
        this.f17227n = i19;
        this.f17228o = j11;
        this.f17229p = i20;
        this.f17230q = z10;
        this.f17231r = i21;
        this.f17232s = z11;
        this.f17233t = z12;
        this.f17234u = tLObject;
    }
}
