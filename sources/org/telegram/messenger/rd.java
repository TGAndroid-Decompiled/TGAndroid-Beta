package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f19871a = 1;
    public final MessagesController f19872b;
    public final int f19873c;
    public final int d;
    public final long f19874e;
    public final long f19875f;
    public final int f19876g;
    public final int h;
    public final int f19877i;
    public final int f19878j;
    public final int f19879k;
    public final int f19880l;
    public final int f19881m;
    public final int f19882n;
    public final long f19883o;
    public final int f19884p;
    public final boolean f19885q;
    public final int f19886r;
    public final boolean f19887s;
    public final boolean f19888t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f19872b = messagesController;
        this.f19873c = i10;
        this.d = i11;
        this.f19874e = j10;
        this.f19875f = j11;
        this.f19876g = i12;
        this.h = i13;
        this.f19877i = i14;
        this.f19878j = i15;
        this.f19879k = i16;
        this.f19880l = i17;
        this.f19881m = i18;
        this.f19882n = i19;
        this.f19883o = j12;
        this.f19884p = i20;
        this.f19885q = z4;
        this.f19886r = i21;
        this.f19887s = z10;
        this.f19888t = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19871a) {
            case 0:
                boolean z4 = this.f19887s;
                boolean z10 = this.f19888t;
                int i10 = this.f19873c;
                int i11 = this.d;
                int i12 = this.f19876g;
                int i13 = this.h;
                int i14 = this.f19877i;
                int i15 = this.f19878j;
                int i16 = this.f19879k;
                int i17 = this.f19880l;
                int i18 = this.f19881m;
                int i19 = this.f19882n;
                int i20 = this.f19884p;
                int i21 = this.f19886r;
                this.f19872b.lambda$loadMessagesInternal$176(this.f19874e, this.f19875f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19883o, i20, this.f19885q, i21, z4, z10, tLObject, tL_error);
                return;
            default:
                boolean z11 = this.f19887s;
                boolean z12 = this.f19888t;
                int i22 = this.f19873c;
                int i23 = this.d;
                int i24 = this.f19876g;
                int i25 = this.h;
                int i26 = this.f19877i;
                int i27 = this.f19878j;
                int i28 = this.f19879k;
                int i29 = this.f19880l;
                int i30 = this.f19881m;
                int i31 = this.f19882n;
                int i32 = this.f19884p;
                int i33 = this.f19886r;
                this.f19872b.lambda$loadMessagesInternal$181(i22, i23, this.f19874e, this.f19875f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19883o, i32, this.f19885q, i33, z11, z12, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f19872b = messagesController;
        this.f19874e = j10;
        this.f19875f = j11;
        this.f19873c = i10;
        this.d = i11;
        this.f19876g = i12;
        this.h = i13;
        this.f19877i = i14;
        this.f19878j = i15;
        this.f19879k = i16;
        this.f19880l = i17;
        this.f19881m = i18;
        this.f19882n = i19;
        this.f19883o = j12;
        this.f19884p = i20;
        this.f19885q = z4;
        this.f19886r = i21;
        this.f19887s = z10;
        this.f19888t = z11;
    }
}
