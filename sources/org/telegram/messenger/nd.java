package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f17105a = 1;
    public final MessagesController f17106b;
    public final int f17107c;
    public final int d;
    public final long e;
    public final long f17108f;
    public final int f17109g;
    public final int h;
    public final int f17110i;
    public final int f17111j;
    public final int f17112k;
    public final int f17113l;
    public final int f17114m;
    public final int f17115n;
    public final long f17116o;
    public final int f17117p;
    public final boolean f17118q;
    public final int f17119r;
    public final boolean f17120s;
    public final boolean f17121t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17106b = messagesController;
        this.f17107c = i10;
        this.d = i11;
        this.e = j3;
        this.f17108f = j10;
        this.f17109g = i12;
        this.h = i13;
        this.f17110i = i14;
        this.f17111j = i15;
        this.f17112k = i16;
        this.f17113l = i17;
        this.f17114m = i18;
        this.f17115n = i19;
        this.f17116o = j11;
        this.f17117p = i20;
        this.f17118q = z10;
        this.f17119r = i21;
        this.f17120s = z11;
        this.f17121t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17105a) {
            case 0:
                boolean z10 = this.f17120s;
                boolean z11 = this.f17121t;
                int i10 = this.f17107c;
                int i11 = this.d;
                int i12 = this.f17109g;
                int i13 = this.h;
                int i14 = this.f17110i;
                int i15 = this.f17111j;
                int i16 = this.f17112k;
                int i17 = this.f17113l;
                int i18 = this.f17114m;
                int i19 = this.f17115n;
                int i20 = this.f17117p;
                int i21 = this.f17119r;
                this.f17106b.lambda$loadMessagesInternal$176(this.e, this.f17108f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17116o, i20, this.f17118q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17120s;
                boolean z13 = this.f17121t;
                int i22 = this.f17107c;
                int i23 = this.d;
                int i24 = this.f17109g;
                int i25 = this.h;
                int i26 = this.f17110i;
                int i27 = this.f17111j;
                int i28 = this.f17112k;
                int i29 = this.f17113l;
                int i30 = this.f17114m;
                int i31 = this.f17115n;
                int i32 = this.f17117p;
                int i33 = this.f17119r;
                this.f17106b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17108f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17116o, i32, this.f17118q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17106b = messagesController;
        this.e = j3;
        this.f17108f = j10;
        this.f17107c = i10;
        this.d = i11;
        this.f17109g = i12;
        this.h = i13;
        this.f17110i = i14;
        this.f17111j = i15;
        this.f17112k = i16;
        this.f17113l = i17;
        this.f17114m = i18;
        this.f17115n = i19;
        this.f17116o = j11;
        this.f17117p = i20;
        this.f17118q = z10;
        this.f17119r = i21;
        this.f17120s = z11;
        this.f17121t = z12;
    }
}
