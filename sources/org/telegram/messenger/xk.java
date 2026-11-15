package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements RequestDelegate {
    public final int f27523a = 1;
    public final np f27524b;
    public final int f27525c;
    public final int d;
    public final long f27526e;
    public final long f27527f;
    public final int f27528g;
    public final int h;
    public final int f27529i;
    public final int f27530j;
    public final int f27531k;
    public final int f27532l;
    public final int f27533m;
    public final int f27534n;
    public final long f27535o;
    public final int f27536p;
    public final boolean f27537q;
    public final int f27538r;
    public final boolean f27539s;
    public final boolean f27540t;

    public xk(np npVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27524b = npVar;
        this.f27525c = i7;
        this.d = i10;
        this.f27526e = j3;
        this.f27527f = j10;
        this.f27528g = i11;
        this.h = i12;
        this.f27529i = i13;
        this.f27530j = i14;
        this.f27531k = i15;
        this.f27532l = i16;
        this.f27533m = i17;
        this.f27534n = i18;
        this.f27535o = j11;
        this.f27536p = i19;
        this.f27537q = z10;
        this.f27538r = i20;
        this.f27539s = z11;
        this.f27540t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27523a) {
            case 0:
                np npVar = this.f27524b;
                npVar.getClass();
                long j3 = this.f27526e;
                long j10 = this.f27527f;
                int i10 = this.f27525c;
                int i11 = this.d;
                int i12 = this.f27528g;
                int i13 = this.h;
                int i14 = this.f27529i;
                int i15 = this.f27530j;
                int i16 = this.f27531k;
                int i17 = this.f27532l;
                int i18 = this.f27533m;
                int i19 = this.f27534n;
                long j11 = this.f27535o;
                int i20 = this.f27536p;
                boolean z10 = this.f27537q;
                int i21 = this.f27538r;
                boolean z11 = this.f27539s;
                boolean z12 = this.f27540t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        npVar.K3(messages_messages, messages_messages.messages.size(), j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z10, i21, z11, z12, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    npVar.K3(new TLRPC.TL_messages_messages(), 0, j3, j10, i10, i11, i12, false, i13, i14, i15, i16, i17, i18, false, i19, j11, i20, z10, i21, z11, z12, null);
                    return;
                } else {
                    return;
                }
            default:
                np npVar2 = this.f27524b;
                npVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28072id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f28072id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f27525c;
                        }
                        npVar2.K3(messages_messages2, messages_messages2.messages.size(), this.f27526e, this.f27527f, this.f27528g, i7, i22, false, this.h, this.f27529i, this.f27530j, this.f27531k, this.f27532l, this.f27533m, false, this.f27534n, this.f27535o, this.f27536p, this.f27537q, this.f27538r, this.f27539s, this.f27540t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xk(np npVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27524b = npVar;
        this.f27526e = j3;
        this.f27527f = j10;
        this.f27525c = i7;
        this.d = i10;
        this.f27528g = i11;
        this.h = i12;
        this.f27529i = i13;
        this.f27530j = i14;
        this.f27531k = i15;
        this.f27532l = i16;
        this.f27533m = i17;
        this.f27534n = i18;
        this.f27535o = j11;
        this.f27536p = i19;
        this.f27537q = z10;
        this.f27538r = i20;
        this.f27539s = z11;
        this.f27540t = z12;
    }
}
