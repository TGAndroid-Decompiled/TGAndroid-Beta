package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd implements RequestDelegate {
    public final int f19423a;
    public final MessagesController f19424b;
    public final int f19425c;
    public final int d;
    public final int e;
    public final int f19426f;
    public final int f19427g;
    public final long h;
    public final long f19428i;
    public final int f19429j;
    public final int f19430k;
    public final int f19431l;
    public final int f19432m;
    public final int f19433n;
    public final long f19434o;
    public final int f19435p;
    public final boolean f19436q;
    public final int f19437r;
    public final boolean f19438s;
    public final boolean f19439t;
    public final TLObject f19440u;

    public rd(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19423a = 1;
        this.f19424b = messagesController;
        this.f19425c = i10;
        this.d = i11;
        this.e = i12;
        this.f19426f = i13;
        this.f19427g = i14;
        this.h = j10;
        this.f19428i = j11;
        this.f19429j = i15;
        this.f19430k = i16;
        this.f19431l = i17;
        this.f19432m = i18;
        this.f19433n = i19;
        this.f19434o = j12;
        this.f19435p = i20;
        this.f19436q = z10;
        this.f19437r = i21;
        this.f19438s = z11;
        this.f19439t = z12;
        this.f19440u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19423a) {
            case 0:
                this.f19424b.lambda$loadMessagesInternal$177(this.h, this.f19425c, this.d, this.e, this.f19428i, this.f19426f, this.f19427g, this.f19429j, this.f19430k, this.f19431l, this.f19432m, this.f19433n, this.f19434o, this.f19435p, this.f19436q, this.f19437r, this.f19438s, this.f19439t, (TLRPC.TL_messages_getSavedHistory) this.f19440u, tLObject, tL_error);
                return;
            case 1:
                this.f19424b.lambda$loadMessagesInternal$179(this.f19425c, this.d, this.e, this.f19426f, this.f19427g, this.h, this.f19428i, this.f19429j, this.f19430k, this.f19431l, this.f19432m, this.f19433n, this.f19434o, this.f19435p, this.f19436q, this.f19437r, this.f19438s, this.f19439t, (TLRPC.TL_messages_getReplies) this.f19440u, tLObject, tL_error);
                return;
            default:
                this.f19424b.lambda$loadMessagesInternal$184(this.h, this.f19425c, this.d, this.e, this.f19428i, this.f19426f, this.f19427g, this.f19429j, this.f19430k, this.f19431l, this.f19432m, this.f19433n, this.f19434o, this.f19435p, this.f19436q, this.f19437r, this.f19438s, this.f19439t, (TLRPC.TL_messages_getHistory) this.f19440u, tLObject, tL_error);
                return;
        }
    }

    public rd(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19423a = i22;
        this.f19424b = messagesController;
        this.h = j10;
        this.f19425c = i10;
        this.d = i11;
        this.e = i12;
        this.f19428i = j11;
        this.f19426f = i13;
        this.f19427g = i14;
        this.f19429j = i15;
        this.f19430k = i16;
        this.f19431l = i17;
        this.f19432m = i18;
        this.f19433n = i19;
        this.f19434o = j12;
        this.f19435p = i20;
        this.f19436q = z10;
        this.f19437r = i21;
        this.f19438s = z11;
        this.f19439t = z12;
        this.f19440u = tLObject;
    }
}
