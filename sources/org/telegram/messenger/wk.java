package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements RequestDelegate {
    public final int f27744a = 1;
    public final np f27745b;
    public final int f27746c;
    public final int d;
    public final long f27747e;
    public final long f27748f;
    public final int f27749g;
    public final int h;
    public final int f27750i;
    public final int f27751j;
    public final int f27752k;
    public final int f27753l;
    public final int f27754m;
    public final int f27755n;
    public final long f27756o;
    public final int f27757p;
    public final boolean f27758q;
    public final int f27759r;
    public final boolean f27760s;
    public final boolean f27761t;

    public wk(np npVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27745b = npVar;
        this.f27746c = i7;
        this.d = i10;
        this.f27747e = j3;
        this.f27748f = j10;
        this.f27749g = i11;
        this.h = i12;
        this.f27750i = i13;
        this.f27751j = i14;
        this.f27752k = i15;
        this.f27753l = i16;
        this.f27754m = i17;
        this.f27755n = i18;
        this.f27756o = j11;
        this.f27757p = i19;
        this.f27758q = z10;
        this.f27759r = i20;
        this.f27760s = z11;
        this.f27761t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27744a) {
            case 0:
                np npVar = this.f27745b;
                npVar.getClass();
                long j3 = this.f27747e;
                long j10 = this.f27748f;
                int i10 = this.f27746c;
                int i11 = this.d;
                int i12 = this.f27749g;
                int i13 = this.h;
                int i14 = this.f27750i;
                int i15 = this.f27751j;
                int i16 = this.f27752k;
                int i17 = this.f27753l;
                int i18 = this.f27754m;
                int i19 = this.f27755n;
                long j11 = this.f27756o;
                int i20 = this.f27757p;
                boolean z10 = this.f27758q;
                int i21 = this.f27759r;
                boolean z11 = this.f27760s;
                boolean z12 = this.f27761t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        npVar.R3(messages_messages, messages_messages.messages.size(), j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z10, i21, z11, z12, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    npVar.R3(new TLRPC.TL_messages_messages(), 0, j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z10, i21, z11, z12, null);
                    return;
                } else {
                    return;
                }
            default:
                np npVar2 = this.f27745b;
                npVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28455id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f28455id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f27746c;
                        }
                        npVar2.R3(messages_messages2, messages_messages2.messages.size(), this.f27747e, this.f27748f, this.f27749g, i7, i22, false, this.h, this.f27750i, this.f27751j, this.f27752k, this.f27753l, this.f27754m, false, this.f27755n, this.f27756o, this.f27757p, this.f27758q, this.f27759r, this.f27760s, this.f27761t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wk(np npVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27745b = npVar;
        this.f27747e = j3;
        this.f27748f = j10;
        this.f27746c = i7;
        this.d = i10;
        this.f27749g = i11;
        this.h = i12;
        this.f27750i = i13;
        this.f27751j = i14;
        this.f27752k = i15;
        this.f27753l = i16;
        this.f27754m = i17;
        this.f27755n = i18;
        this.f27756o = j11;
        this.f27757p = i19;
        this.f27758q = z10;
        this.f27759r = i20;
        this.f27760s = z11;
        this.f27761t = z12;
    }
}
