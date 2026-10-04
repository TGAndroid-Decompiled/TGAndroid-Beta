package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements RequestDelegate {
    public final int f18667a = 1;
    public final MessagesController f18668b;
    public final int f18669c;
    public final int d;
    public final long f18670e;
    public final long f18671f;
    public final int f18672g;
    public final int h;
    public final int f18673i;
    public final int f18674j;
    public final int f18675k;
    public final int f18676l;
    public final int f18677m;
    public final int f18678n;
    public final long f18679o;
    public final int f18680p;
    public final boolean f18681q;
    public final int f18682r;
    public final boolean f18683s;
    public final boolean f18684t;

    public nd(MessagesController messagesController, int i10, int i11, long j3, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18668b = messagesController;
        this.f18669c = i10;
        this.d = i11;
        this.f18670e = j3;
        this.f18671f = j10;
        this.f18672g = i12;
        this.h = i13;
        this.f18673i = i14;
        this.f18674j = i15;
        this.f18675k = i16;
        this.f18676l = i17;
        this.f18677m = i18;
        this.f18678n = i19;
        this.f18679o = j11;
        this.f18680p = i20;
        this.f18681q = z10;
        this.f18682r = i21;
        this.f18683s = z11;
        this.f18684t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18667a) {
            case 0:
                boolean z10 = this.f18683s;
                boolean z11 = this.f18684t;
                int i10 = this.f18669c;
                int i11 = this.d;
                int i12 = this.f18672g;
                int i13 = this.h;
                int i14 = this.f18673i;
                int i15 = this.f18674j;
                int i16 = this.f18675k;
                int i17 = this.f18676l;
                int i18 = this.f18677m;
                int i19 = this.f18678n;
                int i20 = this.f18680p;
                int i21 = this.f18682r;
                this.f18668b.lambda$loadMessagesInternal$176(this.f18670e, this.f18671f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f18679o, i20, this.f18681q, i21, z10, z11, tLObject, tL_error);
                return;
            default:
                boolean z12 = this.f18683s;
                boolean z13 = this.f18684t;
                int i22 = this.f18669c;
                int i23 = this.d;
                int i24 = this.f18672g;
                int i25 = this.h;
                int i26 = this.f18673i;
                int i27 = this.f18674j;
                int i28 = this.f18675k;
                int i29 = this.f18676l;
                int i30 = this.f18677m;
                int i31 = this.f18678n;
                int i32 = this.f18680p;
                int i33 = this.f18682r;
                this.f18668b.lambda$loadMessagesInternal$181(i22, i23, this.f18670e, this.f18671f, i24, i25, i26, i27, i28, i29, i30, i31, this.f18679o, i32, this.f18681q, i33, z12, z13, tLObject, tL_error);
                return;
        }
    }

    public nd(MessagesController messagesController, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j11, int i20, boolean z10, int i21, boolean z11, boolean z12) {
        this.f18668b = messagesController;
        this.f18670e = j3;
        this.f18671f = j10;
        this.f18669c = i10;
        this.d = i11;
        this.f18672g = i12;
        this.h = i13;
        this.f18673i = i14;
        this.f18674j = i15;
        this.f18675k = i16;
        this.f18676l = i17;
        this.f18677m = i18;
        this.f18678n = i19;
        this.f18679o = j11;
        this.f18680p = i20;
        this.f18681q = z10;
        this.f18682r = i21;
        this.f18683s = z11;
        this.f18684t = z12;
    }
}
