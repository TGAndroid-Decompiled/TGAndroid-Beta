package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f20693a = 1;
    public final MessagesController f20694b;
    public final int f20695c;
    public final int d;
    public final long f20696e;
    public final long f20697f;
    public final int f20698g;
    public final int h;
    public final int f20699i;
    public final int f20700j;
    public final int f20701k;
    public final int f20702l;
    public final int f20703m;
    public final int f20704n;
    public final long f20705o;
    public final int f20706p;
    public final boolean f20707q;
    public final int f20708r;
    public final boolean f20709s;
    public final boolean f20710t;

    public jd(MessagesController messagesController, int i9, int i10, long j10, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f20694b = messagesController;
        this.f20695c = i9;
        this.d = i10;
        this.f20696e = j10;
        this.f20697f = j11;
        this.f20698g = i11;
        this.h = i12;
        this.f20699i = i13;
        this.f20700j = i14;
        this.f20701k = i15;
        this.f20702l = i16;
        this.f20703m = i17;
        this.f20704n = i18;
        this.f20705o = j12;
        this.f20706p = i19;
        this.f20707q = z10;
        this.f20708r = i20;
        this.f20709s = z11;
        this.f20710t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20693a) {
            case 0:
                boolean z10 = this.f20709s;
                boolean z11 = this.f20710t;
                int i9 = this.f20695c;
                int i10 = this.d;
                int i11 = this.f20698g;
                int i12 = this.h;
                int i13 = this.f20699i;
                int i14 = this.f20700j;
                int i15 = this.f20701k;
                int i16 = this.f20702l;
                int i17 = this.f20703m;
                int i18 = this.f20704n;
                int i19 = this.f20706p;
                int i20 = this.f20708r;
                this.f20694b.lambda$loadMessagesInternal$176(this.f20696e, this.f20697f, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, this.f20705o, i19, this.f20707q, i20, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f20709s;
                boolean z13 = this.f20710t;
                int i21 = this.f20695c;
                int i22 = this.d;
                int i23 = this.f20698g;
                int i24 = this.h;
                int i25 = this.f20699i;
                int i26 = this.f20700j;
                int i27 = this.f20701k;
                int i28 = this.f20702l;
                int i29 = this.f20703m;
                int i30 = this.f20704n;
                int i31 = this.f20706p;
                int i32 = this.f20708r;
                this.f20694b.lambda$loadMessagesInternal$181(i21, i22, this.f20696e, this.f20697f, i23, i24, i25, i26, i27, i28, i29, i30, this.f20705o, i31, this.f20707q, i32, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public jd(MessagesController messagesController, long j10, long j11, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f20694b = messagesController;
        this.f20696e = j10;
        this.f20697f = j11;
        this.f20695c = i9;
        this.d = i10;
        this.f20698g = i11;
        this.h = i12;
        this.f20699i = i13;
        this.f20700j = i14;
        this.f20701k = i15;
        this.f20702l = i16;
        this.f20703m = i17;
        this.f20704n = i18;
        this.f20705o = j12;
        this.f20706p = i19;
        this.f20707q = z10;
        this.f20708r = i20;
        this.f20709s = z11;
        this.f20710t = z12;
    }
}
