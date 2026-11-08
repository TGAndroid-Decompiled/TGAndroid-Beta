package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f21685a;
    public final qp f21686b;
    public final int f21687c;
    public final int d;
    public final int f21688e;
    public final int f21689f;
    public final int f21690g;
    public final long h;
    public final long f21691i;
    public final int f21692j;
    public final int f21693k;
    public final int f21694l;
    public final int f21695m;
    public final int f21696n;
    public final long f21697o;
    public final int f21698p;
    public final boolean f21699q;
    public final int f21700r;
    public final boolean f21701s;
    public final boolean f21702t;
    public final TLObject f21703u;

    public bl(qp qpVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f21685a = 1;
        this.f21686b = qpVar;
        this.f21687c = i7;
        this.d = i10;
        this.f21688e = i11;
        this.f21689f = i12;
        this.f21690g = i13;
        this.h = j3;
        this.f21691i = j10;
        this.f21692j = i14;
        this.f21693k = i15;
        this.f21694l = i16;
        this.f21695m = i17;
        this.f21696n = i18;
        this.f21697o = j11;
        this.f21698p = i19;
        this.f21699q = z9;
        this.f21700r = i20;
        this.f21701s = z10;
        this.f21702t = z11;
        this.f21703u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f21685a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f21703u;
                qp qpVar = this.f21686b;
                int i13 = this.f21689f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    qpVar.e4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f21687c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f21688e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) jg.g.i(1, messages_messages.messages)).f26977id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f26977id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    qpVar.K3(messages_messages, messages_messages.messages.size(), j3, this.f21691i, i14, i7, i15, false, i13, this.f21690g, this.f21692j, this.f21693k, this.f21694l, this.f21695m, false, this.f21696n, this.f21697o, this.f21698p, this.f21699q, this.f21700r, this.f21701s, this.f21702t, null);
                    return;
                }
                g0.h3(new dg(qpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 13));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f21703u;
                qp qpVar2 = this.f21686b;
                int i16 = this.f21692j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f21687c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f21688e;
                    int i20 = this.f21690g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) jg.g.i(1, messages_messages2.messages)).f26977id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f26977id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f21689f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f26977id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f21691i, i17, i11, i19, false, i16, i10, this.f21693k, this.f21694l, this.f21695m, i20, false, this.f21696n, this.f21697o, this.f21698p, this.f21699q, this.f21700r, this.f21701s, this.f21702t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f21691i, i17, i11, i19, false, i16, i10, this.f21693k, this.f21694l, this.f21695m, i20, false, this.f21696n, this.f21697o, this.f21698p, this.f21699q, this.f21700r, this.f21701s, this.f21702t, null);
                    return;
                }
                g0.h3(new dg(qpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 9));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f21703u;
                qp qpVar3 = this.f21686b;
                int i23 = this.f21689f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    qpVar3.e4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f21687c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f21688e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) jg.g.i(1, messages_messages3.messages)).f26977id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f26977id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    qpVar3.K3(messages_messages3, messages_messages3.messages.size(), j10, this.f21691i, i24, i12, i25, false, i23, this.f21690g, this.f21692j, this.f21693k, this.f21694l, this.f21695m, false, this.f21696n, this.f21697o, this.f21698p, this.f21699q, this.f21700r, this.f21701s, this.f21702t, null);
                    return;
                }
                g0.h3(new dg(qpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 11));
                return;
        }
    }

    public bl(qp qpVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11, TLObject tLObject, int i21) {
        this.f21685a = i21;
        this.f21686b = qpVar;
        this.h = j3;
        this.f21687c = i7;
        this.d = i10;
        this.f21688e = i11;
        this.f21691i = j10;
        this.f21689f = i12;
        this.f21690g = i13;
        this.f21692j = i14;
        this.f21693k = i15;
        this.f21694l = i16;
        this.f21695m = i17;
        this.f21696n = i18;
        this.f21697o = j11;
        this.f21698p = i19;
        this.f21699q = z9;
        this.f21700r = i20;
        this.f21701s = z10;
        this.f21702t = z11;
        this.f21703u = tLObject;
    }
}
