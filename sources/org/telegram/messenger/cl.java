package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cl implements RequestDelegate {
    public final int f21846a;
    public final qp f21847b;
    public final int f21848c;
    public final int d;
    public final int f21849e;
    public final int f21850f;
    public final int f21851g;
    public final long h;
    public final long f21852i;
    public final int f21853j;
    public final int f21854k;
    public final int f21855l;
    public final int f21856m;
    public final int f21857n;
    public final long f21858o;
    public final int f21859p;
    public final boolean f21860q;
    public final int f21861r;
    public final boolean f21862s;
    public final boolean f21863t;
    public final TLObject f21864u;

    public cl(qp qpVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f21846a = 1;
        this.f21847b = qpVar;
        this.f21848c = i7;
        this.d = i10;
        this.f21849e = i11;
        this.f21850f = i12;
        this.f21851g = i13;
        this.h = j3;
        this.f21852i = j10;
        this.f21853j = i14;
        this.f21854k = i15;
        this.f21855l = i16;
        this.f21856m = i17;
        this.f21857n = i18;
        this.f21858o = j11;
        this.f21859p = i19;
        this.f21860q = z9;
        this.f21861r = i20;
        this.f21862s = z10;
        this.f21863t = z11;
        this.f21864u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f21846a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f21864u;
                qp qpVar = this.f21847b;
                int i13 = this.f21850f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    qpVar.e4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f21848c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f21849e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) jg.g.i(1, messages_messages.messages)).f26974id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f26974id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    qpVar.K3(messages_messages, messages_messages.messages.size(), j3, this.f21852i, i14, i7, i15, false, i13, this.f21851g, this.f21853j, this.f21854k, this.f21855l, this.f21856m, false, this.f21857n, this.f21858o, this.f21859p, this.f21860q, this.f21861r, this.f21862s, this.f21863t, null);
                    return;
                }
                g0.h3(new dg(qpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 13));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f21864u;
                qp qpVar2 = this.f21847b;
                int i16 = this.f21853j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f21848c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f21849e;
                    int i20 = this.f21851g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) jg.g.i(1, messages_messages2.messages)).f26974id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f26974id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f21850f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f26974id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f21852i, i17, i11, i19, false, i16, i10, this.f21854k, this.f21855l, this.f21856m, i20, false, this.f21857n, this.f21858o, this.f21859p, this.f21860q, this.f21861r, this.f21862s, this.f21863t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f21852i, i17, i11, i19, false, i16, i10, this.f21854k, this.f21855l, this.f21856m, i20, false, this.f21857n, this.f21858o, this.f21859p, this.f21860q, this.f21861r, this.f21862s, this.f21863t, null);
                    return;
                }
                g0.h3(new dg(qpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 9));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f21864u;
                qp qpVar3 = this.f21847b;
                int i23 = this.f21850f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    qpVar3.e4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f21848c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f21849e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) jg.g.i(1, messages_messages3.messages)).f26974id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f26974id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    qpVar3.K3(messages_messages3, messages_messages3.messages.size(), j10, this.f21852i, i24, i12, i25, false, i23, this.f21851g, this.f21853j, this.f21854k, this.f21855l, this.f21856m, false, this.f21857n, this.f21858o, this.f21859p, this.f21860q, this.f21861r, this.f21862s, this.f21863t, null);
                    return;
                }
                g0.h3(new dg(qpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 11));
                return;
        }
    }

    public cl(qp qpVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11, TLObject tLObject, int i21) {
        this.f21846a = i21;
        this.f21847b = qpVar;
        this.h = j3;
        this.f21848c = i7;
        this.d = i10;
        this.f21849e = i11;
        this.f21852i = j10;
        this.f21850f = i12;
        this.f21851g = i13;
        this.f21853j = i14;
        this.f21854k = i15;
        this.f21855l = i16;
        this.f21856m = i17;
        this.f21857n = i18;
        this.f21858o = j11;
        this.f21859p = i19;
        this.f21860q = z9;
        this.f21861r = i20;
        this.f21862s = z10;
        this.f21863t = z11;
        this.f21864u = tLObject;
    }
}
