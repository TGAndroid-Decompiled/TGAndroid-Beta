package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f17160a = 1;
    public final MessagesController f17161b;
    public final int f17162c;
    public final int d;
    public final long e;
    public final long f17163f;
    public final int f17164g;
    public final int h;
    public final int f17165i;
    public final int f17166j;
    public final int f17167k;
    public final int f17168l;
    public final int f17169m;
    public final int f17170n;
    public final long f17171o;
    public final int f17172p;
    public final boolean f17173q;
    public final int f17174r;
    public final boolean f17175s;
    public final boolean f17176t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17161b = messagesController;
        this.f17162c = i10;
        this.d = i11;
        this.e = j3;
        this.f17163f = j10;
        this.f17164g = i12;
        this.h = i13;
        this.f17165i = i14;
        this.f17166j = i15;
        this.f17167k = i16;
        this.f17168l = i17;
        this.f17169m = i18;
        this.f17170n = i19;
        this.f17171o = j11;
        this.f17172p = i20;
        this.f17173q = z10;
        this.f17174r = i21;
        this.f17175s = z11;
        this.f17176t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17160a) {
            case 0:
                boolean z10 = this.f17175s;
                boolean z11 = this.f17176t;
                int i10 = this.f17162c;
                int i11 = this.d;
                int i12 = this.f17164g;
                int i13 = this.h;
                int i14 = this.f17165i;
                int i15 = this.f17166j;
                int i16 = this.f17167k;
                int i17 = this.f17168l;
                int i18 = this.f17169m;
                int i19 = this.f17170n;
                int i20 = this.f17172p;
                int i21 = this.f17174r;
                this.f17161b.lambda$loadMessagesInternal$176(this.e, this.f17163f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f17171o, i20, this.f17173q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f17175s;
                boolean z13 = this.f17176t;
                int i22 = this.f17162c;
                int i23 = this.d;
                int i24 = this.f17164g;
                int i25 = this.h;
                int i26 = this.f17165i;
                int i27 = this.f17166j;
                int i28 = this.f17167k;
                int i29 = this.f17168l;
                int i30 = this.f17169m;
                int i31 = this.f17170n;
                int i32 = this.f17172p;
                int i33 = this.f17174r;
                this.f17161b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f17163f, i24, i25, i26, i27, i28, i29, i30, i31, this.f17171o, i32, this.f17173q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f17161b = messagesController;
        this.e = j3;
        this.f17163f = j10;
        this.f17162c = i10;
        this.d = i11;
        this.f17164g = i12;
        this.h = i13;
        this.f17165i = i14;
        this.f17166j = i15;
        this.f17167k = i16;
        this.f17168l = i17;
        this.f17169m = i18;
        this.f17170n = i19;
        this.f17171o = j11;
        this.f17172p = i20;
        this.f17173q = z10;
        this.f17174r = i21;
        this.f17175s = z11;
        this.f17176t = z12;
    }
}
