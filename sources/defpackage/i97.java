package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i97 implements RequestDelegate {
    public final byte a;
    public final uc7 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
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
    public final TLObject u;

    public i97(uc7 uc7Var, long j, int i, int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.h = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.i = j2;
        this.f = i4;
        this.g = i5;
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
        this.u = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        int i2;
        byte b = this.a;
        TLObject tLObject2 = this.u;
        int i3 = this.d;
        switch (b) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) tLObject2;
                uc7 uc7Var = this.b;
                int i4 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j = this.h;
                    uc7Var.p4(arrayList, j);
                    int size = messages_messages.messages.size();
                    int i5 = this.c;
                    if (size > i5) {
                        messages_messages.messages.remove(0);
                    }
                    int i6 = this.e;
                    if (i6 != 0 && !messages_messages.messages.isEmpty()) {
                        i3 = ((TLRPC.Message) c00.g(1, messages_messages.messages)).id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i6) {
                                    i3 = message.id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    }
                    uc7Var.U3(messages_messages, messages_messages.messages.size(), j, this.i, i5, i3, i6, false, i4, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    return;
                }
                hl.c3(new y36(uc7Var, i4, tL_messages_getSavedHistory, tL_error, (byte) 7));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) tLObject2;
                uc7 uc7Var2 = this.b;
                int i7 = this.j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i8 = this.c;
                    if (size3 > i8) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i9 = this.e;
                    int i10 = this.g;
                    if (!isEmpty) {
                        if (i9 != 0) {
                            int i11 = ((TLRPC.Message) c00.g(1, messages_messages2.messages)).id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i9) {
                                        i3 = message2.id;
                                    } else {
                                        size4--;
                                    }
                                } else {
                                    i3 = i11;
                                }
                            }
                        } else {
                            int i12 = this.f;
                            if (i12 != 0 && i10 == 2 && i3 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i13 = message3.id;
                                    if (i13 > i12 && !message3.out) {
                                        i2 = i3;
                                        i = i13;
                                        uc7Var2.U3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i8, i2, i9, false, i7, i, this.k, this.l, this.m, i10, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i = 0;
                    i2 = i3;
                    uc7Var2.U3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i8, i2, i9, false, i7, i, this.k, this.l, this.m, i10, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    return;
                }
                hl.c3(new y36(uc7Var2, i7, tL_messages_getReplies, tL_error, (byte) 6));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) tLObject2;
                uc7 uc7Var3 = this.b;
                int i14 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j2 = this.h;
                    uc7Var3.p4(arrayList2, j2);
                    int size6 = messages_messages3.messages.size();
                    int i15 = this.c;
                    if (size6 > i15) {
                        messages_messages3.messages.remove(0);
                    }
                    int i16 = this.e;
                    if (i16 != 0 && !messages_messages3.messages.isEmpty()) {
                        i3 = ((TLRPC.Message) c00.g(1, messages_messages3.messages)).id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i16) {
                                    i3 = message4.id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    }
                    uc7Var3.U3(messages_messages3, messages_messages3.messages.size(), j2, this.i, i15, i3, i16, false, i14, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    return;
                }
                hl.c3(new y36(uc7Var3, i14, tL_messages_getHistory, tL_error, (byte) 9));
                return;
        }
    }

    public i97(uc7 uc7Var, int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.a = (byte) 1;
        this.b = uc7Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = j;
        this.i = j2;
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
        this.u = tL_messages_getReplies;
    }
}
