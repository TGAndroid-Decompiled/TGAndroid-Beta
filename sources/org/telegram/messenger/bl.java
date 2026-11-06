package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f21650a = 1;
    public final qp f21651b;
    public final int f21652c;
    public final int d;
    public final long f21653e;
    public final long f21654f;
    public final int f21655g;
    public final int h;
    public final int f21656i;
    public final int f21657j;
    public final int f21658k;
    public final int f21659l;
    public final int f21660m;
    public final int f21661n;
    public final long f21662o;
    public final int f21663p;
    public final boolean f21664q;
    public final int f21665r;
    public final boolean f21666s;
    public final boolean f21667t;

    public bl(qp qpVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11) {
        this.f21651b = qpVar;
        this.f21652c = i7;
        this.d = i10;
        this.f21653e = j3;
        this.f21654f = j10;
        this.f21655g = i11;
        this.h = i12;
        this.f21656i = i13;
        this.f21657j = i14;
        this.f21658k = i15;
        this.f21659l = i16;
        this.f21660m = i17;
        this.f21661n = i18;
        this.f21662o = j11;
        this.f21663p = i19;
        this.f21664q = z9;
        this.f21665r = i20;
        this.f21666s = z10;
        this.f21667t = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f21650a) {
            case 0:
                qp qpVar = this.f21651b;
                qpVar.getClass();
                long j3 = this.f21653e;
                long j10 = this.f21654f;
                int i10 = this.f21652c;
                int i11 = this.d;
                int i12 = this.f21655g;
                int i13 = this.h;
                int i14 = this.f21656i;
                int i15 = this.f21657j;
                int i16 = this.f21658k;
                int i17 = this.f21659l;
                int i18 = this.f21660m;
                int i19 = this.f21661n;
                long j11 = this.f21662o;
                int i20 = this.f21663p;
                boolean z9 = this.f21664q;
                int i21 = this.f21665r;
                boolean z10 = this.f21666s;
                boolean z11 = this.f21667t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        qpVar.K3(messages_messages, messages_messages.messages.size(), j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z9, i21, z10, z11, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    qpVar.K3(new TLRPC.TL_messages_messages(), 0, j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z9, i21, z10, z11, null);
                    return;
                } else {
                    return;
                }
            default:
                qp qpVar2 = this.f21651b;
                qpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) jg.g.i(1, messages_messages2.messages)).f26973id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f26973id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f21652c;
                        }
                        qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.f21653e, this.f21654f, this.f21655g, i7, i22, false, this.h, this.f21656i, this.f21657j, this.f21658k, this.f21659l, this.f21660m, false, this.f21661n, this.f21662o, this.f21663p, this.f21664q, this.f21665r, this.f21666s, this.f21667t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bl(qp qpVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11) {
        this.f21651b = qpVar;
        this.f21653e = j3;
        this.f21654f = j10;
        this.f21652c = i7;
        this.d = i10;
        this.f21655g = i11;
        this.h = i12;
        this.f21656i = i13;
        this.f21657j = i14;
        this.f21658k = i15;
        this.f21659l = i16;
        this.f21660m = i17;
        this.f21661n = i18;
        this.f21662o = j11;
        this.f21663p = i19;
        this.f21664q = z9;
        this.f21665r = i20;
        this.f21666s = z10;
        this.f21667t = z11;
    }
}
