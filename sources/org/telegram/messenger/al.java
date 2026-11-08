package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al implements RequestDelegate {
    public final int f21463a = 1;
    public final qp f21464b;
    public final int f21465c;
    public final int d;
    public final long f21466e;
    public final long f21467f;
    public final int f21468g;
    public final int h;
    public final int f21469i;
    public final int f21470j;
    public final int f21471k;
    public final int f21472l;
    public final int f21473m;
    public final int f21474n;
    public final long f21475o;
    public final int f21476p;
    public final boolean f21477q;
    public final int f21478r;
    public final boolean f21479s;
    public final boolean f21480t;

    public al(qp qpVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11) {
        this.f21464b = qpVar;
        this.f21465c = i7;
        this.d = i10;
        this.f21466e = j3;
        this.f21467f = j10;
        this.f21468g = i11;
        this.h = i12;
        this.f21469i = i13;
        this.f21470j = i14;
        this.f21471k = i15;
        this.f21472l = i16;
        this.f21473m = i17;
        this.f21474n = i18;
        this.f21475o = j11;
        this.f21476p = i19;
        this.f21477q = z9;
        this.f21478r = i20;
        this.f21479s = z10;
        this.f21480t = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f21463a) {
            case 0:
                qp qpVar = this.f21464b;
                qpVar.getClass();
                long j3 = this.f21466e;
                long j10 = this.f21467f;
                int i10 = this.f21465c;
                int i11 = this.d;
                int i12 = this.f21468g;
                int i13 = this.h;
                int i14 = this.f21469i;
                int i15 = this.f21470j;
                int i16 = this.f21471k;
                int i17 = this.f21472l;
                int i18 = this.f21473m;
                int i19 = this.f21474n;
                long j11 = this.f21475o;
                int i20 = this.f21476p;
                boolean z9 = this.f21477q;
                int i21 = this.f21478r;
                boolean z10 = this.f21479s;
                boolean z11 = this.f21480t;
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
                qp qpVar2 = this.f21464b;
                qpVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) jg.g.i(1, messages_messages2.messages)).f26977id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f26977id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f21465c;
                        }
                        qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.f21466e, this.f21467f, this.f21468g, i7, i22, false, this.h, this.f21469i, this.f21470j, this.f21471k, this.f21472l, this.f21473m, false, this.f21474n, this.f21475o, this.f21476p, this.f21477q, this.f21478r, this.f21479s, this.f21480t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public al(qp qpVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11) {
        this.f21464b = qpVar;
        this.f21466e = j3;
        this.f21467f = j10;
        this.f21465c = i7;
        this.d = i10;
        this.f21468g = i11;
        this.h = i12;
        this.f21469i = i13;
        this.f21470j = i14;
        this.f21471k = i15;
        this.f21472l = i16;
        this.f21473m = i17;
        this.f21474n = i18;
        this.f21475o = j11;
        this.f21476p = i19;
        this.f21477q = z9;
        this.f21478r = i20;
        this.f21479s = z10;
        this.f21480t = z11;
    }
}
