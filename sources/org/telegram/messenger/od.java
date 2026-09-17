package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f16946a = 1;
    public final MessagesController f16947b;
    public final int f16948c;
    public final int d;
    public final long e;
    public final long f16949f;
    public final int f16950g;
    public final int h;
    public final int f16951i;
    public final int f16952j;
    public final int f16953k;
    public final int f16954l;
    public final int f16955m;
    public final int f16956n;
    public final long f16957o;
    public final int f16958p;
    public final boolean f16959q;
    public final int f16960r;
    public final boolean f16961s;
    public final boolean f16962t;

    public od(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16947b = messagesController;
        this.f16948c = i10;
        this.d = i11;
        this.e = j3;
        this.f16949f = j10;
        this.f16950g = i12;
        this.h = i13;
        this.f16951i = i14;
        this.f16952j = i15;
        this.f16953k = i16;
        this.f16954l = i17;
        this.f16955m = i18;
        this.f16956n = i19;
        this.f16957o = j11;
        this.f16958p = i20;
        this.f16959q = z10;
        this.f16960r = i21;
        this.f16961s = z11;
        this.f16962t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16946a) {
            case 0:
                boolean z10 = this.f16961s;
                boolean z11 = this.f16962t;
                int i10 = this.f16948c;
                int i11 = this.d;
                int i12 = this.f16950g;
                int i13 = this.h;
                int i14 = this.f16951i;
                int i15 = this.f16952j;
                int i16 = this.f16953k;
                int i17 = this.f16954l;
                int i18 = this.f16955m;
                int i19 = this.f16956n;
                int i20 = this.f16958p;
                int i21 = this.f16960r;
                this.f16947b.lambda$loadMessagesInternal$176(this.e, this.f16949f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f16957o, i20, this.f16959q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f16961s;
                boolean z13 = this.f16962t;
                int i22 = this.f16948c;
                int i23 = this.d;
                int i24 = this.f16950g;
                int i25 = this.h;
                int i26 = this.f16951i;
                int i27 = this.f16952j;
                int i28 = this.f16953k;
                int i29 = this.f16954l;
                int i30 = this.f16955m;
                int i31 = this.f16956n;
                int i32 = this.f16958p;
                int i33 = this.f16960r;
                this.f16947b.lambda$loadMessagesInternal$181(i22, i23, this.e, this.f16949f, i24, i25, i26, i27, i28, i29, i30, i31, this.f16957o, i32, this.f16959q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f16947b = messagesController;
        this.e = j3;
        this.f16949f = j10;
        this.f16948c = i10;
        this.d = i11;
        this.f16950g = i12;
        this.h = i13;
        this.f16951i = i14;
        this.f16952j = i15;
        this.f16953k = i16;
        this.f16954l = i17;
        this.f16955m = i18;
        this.f16956n = i19;
        this.f16957o = j11;
        this.f16958p = i20;
        this.f16959q = z10;
        this.f16960r = i21;
        this.f16961s = z11;
        this.f16962t = z12;
    }
}
