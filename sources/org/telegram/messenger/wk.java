package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements RequestDelegate {
    public final int f27708a = 1;
    public final np f27709b;
    public final int f27710c;
    public final int d;
    public final long f27711e;
    public final long f27712f;
    public final int f27713g;
    public final int h;
    public final int f27714i;
    public final int f27715j;
    public final int f27716k;
    public final int f27717l;
    public final int f27718m;
    public final int f27719n;
    public final long f27720o;
    public final int f27721p;
    public final boolean f27722q;
    public final int f27723r;
    public final boolean f27724s;
    public final boolean f27725t;

    public wk(np npVar, int i7, int i10, long j3, long j10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27709b = npVar;
        this.f27710c = i7;
        this.d = i10;
        this.f27711e = j3;
        this.f27712f = j10;
        this.f27713g = i11;
        this.h = i12;
        this.f27714i = i13;
        this.f27715j = i14;
        this.f27716k = i15;
        this.f27717l = i16;
        this.f27718m = i17;
        this.f27719n = i18;
        this.f27720o = j11;
        this.f27721p = i19;
        this.f27722q = z10;
        this.f27723r = i20;
        this.f27724s = z11;
        this.f27725t = z12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27708a) {
            case 0:
                np npVar = this.f27709b;
                npVar.getClass();
                long j3 = this.f27711e;
                long j10 = this.f27712f;
                int i10 = this.f27710c;
                int i11 = this.d;
                int i12 = this.f27713g;
                int i13 = this.h;
                int i14 = this.f27714i;
                int i15 = this.f27715j;
                int i16 = this.f27716k;
                int i17 = this.f27717l;
                int i18 = this.f27718m;
                int i19 = this.f27719n;
                long j11 = this.f27720o;
                int i20 = this.f27721p;
                boolean z10 = this.f27722q;
                int i21 = this.f27723r;
                boolean z11 = this.f27724s;
                boolean z12 = this.f27725t;
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
                np npVar2 = this.f27709b;
                npVar2.getClass();
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i22 = this.d;
                        if (i22 != 0 && !messages_messages2.messages.isEmpty()) {
                            i7 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28419id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i22) {
                                        i7 = message.f28419id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i7 = this.f27710c;
                        }
                        npVar2.R3(messages_messages2, messages_messages2.messages.size(), this.f27711e, this.f27712f, this.f27713g, i7, i22, false, this.h, this.f27714i, this.f27715j, this.f27716k, this.f27717l, this.f27718m, false, this.f27719n, this.f27720o, this.f27721p, this.f27722q, this.f27723r, this.f27724s, this.f27725t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wk(np npVar, long j3, long j10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12) {
        this.f27709b = npVar;
        this.f27711e = j3;
        this.f27712f = j10;
        this.f27710c = i7;
        this.d = i10;
        this.f27713g = i11;
        this.h = i12;
        this.f27714i = i13;
        this.f27715j = i14;
        this.f27716k = i15;
        this.f27717l = i16;
        this.f27718m = i17;
        this.f27719n = i18;
        this.f27720o = j11;
        this.f27721p = i19;
        this.f27722q = z10;
        this.f27723r = i20;
        this.f27724s = z11;
        this.f27725t = z12;
    }
}
