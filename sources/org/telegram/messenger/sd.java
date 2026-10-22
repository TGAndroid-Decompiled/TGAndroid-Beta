package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sd implements RequestDelegate {
    public final int f19497a;
    public final MessagesController f19498b;
    public final int f19499c;
    public final int d;
    public final int e;
    public final int f19500f;
    public final int f19501g;
    public final long h;
    public final long f19502i;
    public final int f19503j;
    public final int f19504k;
    public final int f19505l;
    public final int f19506m;
    public final int f19507n;
    public final long f19508o;
    public final int f19509p;
    public final boolean f19510q;
    public final int f19511r;
    public final boolean f19512s;
    public final boolean f19513t;
    public final TLObject f19514u;

    public sd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19497a = 1;
        this.f19498b = messagesController;
        this.f19499c = i10;
        this.d = i11;
        this.e = i12;
        this.f19500f = i13;
        this.f19501g = i14;
        this.h = j10;
        this.f19502i = j11;
        this.f19503j = i15;
        this.f19504k = i16;
        this.f19505l = i17;
        this.f19506m = i18;
        this.f19507n = i19;
        this.f19508o = j12;
        this.f19509p = i20;
        this.f19510q = z10;
        this.f19511r = i21;
        this.f19512s = z11;
        this.f19513t = z12;
        this.f19514u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19497a) {
            case 0:
                this.f19498b.lambda$loadMessagesInternal$177(this.h, this.f19499c, this.d, this.e, this.f19502i, this.f19500f, this.f19501g, this.f19503j, this.f19504k, this.f19505l, this.f19506m, this.f19507n, this.f19508o, this.f19509p, this.f19510q, this.f19511r, this.f19512s, this.f19513t, (TLRPC.TL_messages_getSavedHistory) this.f19514u, tLObject, tL_error);
                return;
            case 1:
                this.f19498b.lambda$loadMessagesInternal$179(this.f19499c, this.d, this.e, this.f19500f, this.f19501g, this.h, this.f19502i, this.f19503j, this.f19504k, this.f19505l, this.f19506m, this.f19507n, this.f19508o, this.f19509p, this.f19510q, this.f19511r, this.f19512s, this.f19513t, (TLRPC.TL_messages_getReplies) this.f19514u, tLObject, tL_error);
                return;
            default:
                this.f19498b.lambda$loadMessagesInternal$184(this.h, this.f19499c, this.d, this.e, this.f19502i, this.f19500f, this.f19501g, this.f19503j, this.f19504k, this.f19505l, this.f19506m, this.f19507n, this.f19508o, this.f19509p, this.f19510q, this.f19511r, this.f19512s, this.f19513t, (TLRPC.TL_messages_getHistory) this.f19514u, tLObject, tL_error);
                return;
        }
    }

    public sd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19497a = i22;
        this.f19498b = messagesController;
        this.h = j10;
        this.f19499c = i10;
        this.d = i11;
        this.e = i12;
        this.f19502i = j11;
        this.f19500f = i13;
        this.f19501g = i14;
        this.f19503j = i15;
        this.f19504k = i16;
        this.f19505l = i17;
        this.f19506m = i18;
        this.f19507n = i19;
        this.f19508o = j12;
        this.f19509p = i20;
        this.f19510q = z10;
        this.f19511r = i21;
        this.f19512s = z11;
        this.f19513t = z12;
        this.f19514u = tLObject;
    }
}
