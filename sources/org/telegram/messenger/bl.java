package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f21651a = 1;
    public final qp f21652b;
    public final int f21653c;
    public final int d;
    public final long f21654e;
    public final long f21655f;
    public final int f21656g;
    public final int h;
    public final int f21657i;
    public final int f21658j;
    public final int f21659k;
    public final int f21660l;
    public final int f21661m;
    public final int f21662n;
    public final long f21663o;
    public final int f21664p;
    public final boolean f21665q;
    public final int f21666r;
    public final boolean f21667s;
    public final boolean f21668t;

    public bl(qp qpVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11) {
        this.f21652b = qpVar;
        this.f21653c = i7;
        this.d = i10;
        this.f21654e = j3;
        this.f21655f = j10;
        this.f21656g = i11;
        this.h = i12;
        this.f21657i = i13;
        this.f21658j = i14;
        this.f21659k = i15;
        this.f21660l = i16;
        this.f21661m = i17;
        this.f21662n = i18;
        this.f21663o = j11;
        this.f21664p = i19;
        this.f21665q = z9;
        this.f21666r = i20;
        this.f21667s = z10;
        this.f21668t = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f21651a) {
            case 0:
                qp qpVar = this.f21652b;
                qpVar.getClass();
                long j3 = this.f21654e;
                long j10 = this.f21655f;
                int i10 = this.f21653c;
                int i11 = this.d;
                int i12 = this.f21656g;
                int i13 = this.h;
                int i14 = this.f21657i;
                int i15 = this.f21658j;
                int i16 = this.f21659k;
                int i17 = this.f21660l;
                int i18 = this.f21661m;
                int i19 = this.f21662n;
                long j11 = this.f21663o;
                int i20 = this.f21664p;
                boolean z9 = this.f21665q;
                int i21 = this.f21666r;
                boolean z10 = this.f21667s;
                boolean z11 = this.f21668t;
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
                qp qpVar2 = this.f21652b;
                qpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) jg.g.i(1, messages_messages2.messages)).f26974id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f26974id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f21653c;
                        }
                        qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.f21654e, this.f21655f, this.f21656g, i7, i22, false, this.h, this.f21657i, this.f21658j, this.f21659k, this.f21660l, this.f21661m, false, this.f21662n, this.f21663o, this.f21664p, this.f21665q, this.f21666r, this.f21667s, this.f21668t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bl(qp qpVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11) {
        this.f21652b = qpVar;
        this.f21654e = j3;
        this.f21655f = j10;
        this.f21653c = i7;
        this.d = i10;
        this.f21656g = i11;
        this.h = i12;
        this.f21657i = i13;
        this.f21658j = i14;
        this.f21659k = i15;
        this.f21660l = i16;
        this.f21661m = i17;
        this.f21662n = i18;
        this.f21663o = j11;
        this.f21664p = i19;
        this.f21665q = z9;
        this.f21666r = i20;
        this.f21667s = z10;
        this.f21668t = z11;
    }
}
