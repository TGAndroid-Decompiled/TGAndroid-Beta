package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f19869a = 1;
    public final MessagesController f19870b;
    public final int f19871c;
    public final int d;
    public final long f19872e;
    public final long f19873f;
    public final int f19874g;
    public final int h;
    public final int f19875i;
    public final int f19876j;
    public final int f19877k;
    public final int f19878l;
    public final int f19879m;
    public final int f19880n;
    public final long f19881o;
    public final int f19882p;
    public final boolean f19883q;
    public final int f19884r;
    public final boolean f19885s;
    public final boolean f19886t;

    public rd(MessagesController messagesController, int i10, int i11, long j10, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f19870b = messagesController;
        this.f19871c = i10;
        this.d = i11;
        this.f19872e = j10;
        this.f19873f = j11;
        this.f19874g = i12;
        this.h = i13;
        this.f19875i = i14;
        this.f19876j = i15;
        this.f19877k = i16;
        this.f19878l = i17;
        this.f19879m = i18;
        this.f19880n = i19;
        this.f19881o = j12;
        this.f19882p = i20;
        this.f19883q = z4;
        this.f19884r = i21;
        this.f19885s = z10;
        this.f19886t = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19869a) {
            case 0:
                boolean z4 = this.f19885s;
                boolean z10 = this.f19886t;
                int i10 = this.f19871c;
                int i11 = this.d;
                int i12 = this.f19874g;
                int i13 = this.h;
                int i14 = this.f19875i;
                int i15 = this.f19876j;
                int i16 = this.f19877k;
                int i17 = this.f19878l;
                int i18 = this.f19879m;
                int i19 = this.f19880n;
                int i20 = this.f19882p;
                int i21 = this.f19884r;
                this.f19870b.lambda$loadMessagesInternal$176(this.f19872e, this.f19873f, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, this.f19881o, i20, this.f19883q, i21, z4, z10, tLObject, tL_error);
                return;
            default:
                boolean z11 = this.f19885s;
                boolean z12 = this.f19886t;
                int i22 = this.f19871c;
                int i23 = this.d;
                int i24 = this.f19874g;
                int i25 = this.h;
                int i26 = this.f19875i;
                int i27 = this.f19876j;
                int i28 = this.f19877k;
                int i29 = this.f19878l;
                int i30 = this.f19879m;
                int i31 = this.f19880n;
                int i32 = this.f19882p;
                int i33 = this.f19884r;
                this.f19870b.lambda$loadMessagesInternal$181(i22, i23, this.f19872e, this.f19873f, i24, i25, i26, i27, i28, i29, i30, i31, this.f19881o, i32, this.f19883q, i33, z11, z12, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z4, int i21, boolean z10, boolean z11) {
        this.f19870b = messagesController;
        this.f19872e = j10;
        this.f19873f = j11;
        this.f19871c = i10;
        this.d = i11;
        this.f19874g = i12;
        this.h = i13;
        this.f19875i = i14;
        this.f19876j = i15;
        this.f19877k = i16;
        this.f19878l = i17;
        this.f19879m = i18;
        this.f19880n = i19;
        this.f19881o = j12;
        this.f19882p = i20;
        this.f19883q = z4;
        this.f19884r = i21;
        this.f19885s = z10;
        this.f19886t = z11;
    }
}
