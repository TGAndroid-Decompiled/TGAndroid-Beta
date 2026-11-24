package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d67 implements RequestDelegate {
    public final byte a = 1;
    public final na7 b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final long o;
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final boolean t;

    public d67(na7 na7Var, int i, int i2, long j, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3) {
        this.b = na7Var;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = j3;
        this.p = i11;
        this.q = z;
        this.r = i12;
        this.s = z2;
        this.t = z3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                long j = this.e;
                long j2 = this.f;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.g;
                int i5 = this.h;
                int i6 = this.i;
                int i7 = this.j;
                int i8 = this.k;
                int i9 = this.l;
                int i10 = this.m;
                int i11 = this.n;
                long j3 = this.o;
                int i12 = this.p;
                boolean z = this.q;
                int i13 = this.r;
                boolean z2 = this.s;
                boolean z3 = this.t;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages instanceof TLRPC.TL_messages_messagesNotModified)) {
                        na7Var.N3(messages_messages, messages_messages.messages.size(), j, j2, i2, i3, i4, false, i5, i6, i7, i8, i9, i10, false, i11, j3, i12, z, i13, z2, z3, null);
                        return;
                    }
                    return;
                } else if (tL_error != null && "SHORTCUT_INVALID".equals(tL_error.text)) {
                    na7Var.N3(new TLRPC.TL_messages_messages(), 0, j, j2, i2, i3, i4, false, i5, i6, i7, i8, i9, i10, false, i11, j3, i12, z, i13, z2, z3, null);
                    return;
                } else {
                    return;
                }
            default:
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    if (!(messages_messages2 instanceof TLRPC.TL_messages_messagesNotModified)) {
                        int i14 = this.d;
                        if (i14 != 0 && !messages_messages2.messages.isEmpty()) {
                            i = ((TLRPC.Message) b00.f(1, messages_messages2.messages)).id;
                            int size = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    TLRPC.Message message = messages_messages2.messages.get(size);
                                    if (message.date > i14) {
                                        i = message.id;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        } else {
                            i = this.c;
                        }
                        this.b.N3(messages_messages2, messages_messages2.messages.size(), this.e, this.f, this.g, i, i14, false, this.h, this.i, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public d67(na7 na7Var, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3) {
        this.b = na7Var;
        this.e = j;
        this.f = j2;
        this.c = i;
        this.d = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = j3;
        this.p = i11;
        this.q = z;
        this.r = i12;
        this.s = z2;
        this.t = z3;
    }
}
