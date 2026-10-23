package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qd implements RequestDelegate {
    public final int f19381a = 1;
    public final MessagesController f19382b;
    public final int f19383c;
    public final int d;
    public final long e;
    public final long f19384f;
    public final int f19385g;
    public final int h;
    public final int f19386i;
    public final int f19387j;
    public final int f19388k;
    public final int f19389l;
    public final int f19390m;
    public final int f19391n;
    public final long f19392o;
    public final int f19393p;
    public final boolean f19394q;
    public final int f19395r;
    public final boolean f19396s;
    public final boolean f19397t;

    public qd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19382b = messagesController;
        this.f19383c = i10;
        this.d = i11;
        this.e = j10;
        this.f19384f = j11;
        this.f19385g = i12;
        this.h = i13;
        this.f19386i = i14;
        this.f19387j = i15;
        this.f19388k = i16;
        this.f19389l = i17;
        this.f19390m = i18;
        this.f19391n = i19;
        this.f19392o = j12;
        this.f19393p = i20;
        this.f19394q = z10;
        this.f19395r = i21;
        this.f19396s = z11;
        this.f19397t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19381a) {
            case 0:
                boolean z10 = this.f19396s;
                boolean z11 = this.f19397t;
                int i10 = this.f19383c;
                int i11 = this.d;
                int i12 = this.f19385g;
                int i13 = this.h;
                int i14 = this.f19386i;
                int i15 = this.f19387j;
                int i16 = this.f19388k;
                int i17 = this.f19389l;
                int i18 = this.f19390m;
                int i19 = this.f19391n;
                int i20 = this.f19393p;
                int i21 = this.f19395r;
                this.f19382b.lambda$loadMessagesInternal$175(this.e, this.f19384f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19392o, i20, this.f19394q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f19396s;
                boolean z13 = this.f19397t;
                int i22 = this.f19383c;
                int i23 = this.d;
                int i24 = this.f19385g;
                int i25 = this.h;
                int i26 = this.f19386i;
                int i27 = this.f19387j;
                int i28 = this.f19388k;
                int i29 = this.f19389l;
                int i30 = this.f19390m;
                int i31 = this.f19391n;
                int i32 = this.f19393p;
                int i33 = this.f19395r;
                this.f19382b.lambda$loadMessagesInternal$180(i22, i23, this.e, this.f19384f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19392o, i32, this.f19394q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public qd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f19382b = messagesController;
        this.e = j10;
        this.f19384f = j11;
        this.f19383c = i10;
        this.d = i11;
        this.f19385g = i12;
        this.h = i13;
        this.f19386i = i14;
        this.f19387j = i15;
        this.f19388k = i16;
        this.f19389l = i17;
        this.f19390m = i18;
        this.f19391n = i19;
        this.f19392o = j12;
        this.f19393p = i20;
        this.f19394q = z10;
        this.f19395r = i21;
        this.f19396s = z11;
        this.f19397t = z12;
    }
}
