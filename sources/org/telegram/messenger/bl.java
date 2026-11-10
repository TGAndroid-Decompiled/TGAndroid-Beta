package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f21690a;
    public final qp f21691b;
    public final int f21692c;
    public final int d;
    public final int f21693e;
    public final int f21694f;
    public final int f21695g;
    public final long h;
    public final long f21696i;
    public final int f21697j;
    public final int f21698k;
    public final int f21699l;
    public final int f21700m;
    public final int f21701n;
    public final long f21702o;
    public final int f21703p;
    public final boolean f21704q;
    public final int f21705r;
    public final boolean f21706s;
    public final boolean f21707t;
    public final TLObject f21708u;

    public bl(qp qpVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f21690a = 1;
        this.f21691b = qpVar;
        this.f21692c = i7;
        this.d = i10;
        this.f21693e = i11;
        this.f21694f = i12;
        this.f21695g = i13;
        this.h = j3;
        this.f21696i = j10;
        this.f21697j = i14;
        this.f21698k = i15;
        this.f21699l = i16;
        this.f21700m = i17;
        this.f21701n = i18;
        this.f21702o = j11;
        this.f21703p = i19;
        this.f21704q = z9;
        this.f21705r = i20;
        this.f21706s = z10;
        this.f21707t = z11;
        this.f21708u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f21690a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f21708u;
                qp qpVar = this.f21691b;
                int i13 = this.f21694f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    qpVar.e4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f21692c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f21693e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) jg.g.i(1, messages_messages.messages)).f26981id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f26981id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    qpVar.K3(messages_messages, messages_messages.messages.size(), j3, this.f21696i, i14, i7, i15, false, i13, this.f21695g, this.f21697j, this.f21698k, this.f21699l, this.f21700m, false, this.f21701n, this.f21702o, this.f21703p, this.f21704q, this.f21705r, this.f21706s, this.f21707t, null);
                    return;
                }
                g0.h3(new dg(qpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 13));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f21708u;
                qp qpVar2 = this.f21691b;
                int i16 = this.f21697j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f21692c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f21693e;
                    int i20 = this.f21695g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) jg.g.i(1, messages_messages2.messages)).f26981id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f26981id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f21694f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f26981id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f21696i, i17, i11, i19, false, i16, i10, this.f21698k, this.f21699l, this.f21700m, i20, false, this.f21701n, this.f21702o, this.f21703p, this.f21704q, this.f21705r, this.f21706s, this.f21707t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    qpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f21696i, i17, i11, i19, false, i16, i10, this.f21698k, this.f21699l, this.f21700m, i20, false, this.f21701n, this.f21702o, this.f21703p, this.f21704q, this.f21705r, this.f21706s, this.f21707t, null);
                    return;
                }
                g0.h3(new dg(qpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 9));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f21708u;
                qp qpVar3 = this.f21691b;
                int i23 = this.f21694f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    qpVar3.e4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f21692c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f21693e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) jg.g.i(1, messages_messages3.messages)).f26981id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f26981id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    qpVar3.K3(messages_messages3, messages_messages3.messages.size(), j10, this.f21696i, i24, i12, i25, false, i23, this.f21695g, this.f21697j, this.f21698k, this.f21699l, this.f21700m, false, this.f21701n, this.f21702o, this.f21703p, this.f21704q, this.f21705r, this.f21706s, this.f21707t, null);
                    return;
                }
                g0.h3(new dg(qpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 11));
                return;
        }
    }

    public bl(qp qpVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z9, int i20, boolean z10, boolean z11, TLObject tLObject, int i21) {
        this.f21690a = i21;
        this.f21691b = qpVar;
        this.h = j3;
        this.f21692c = i7;
        this.d = i10;
        this.f21693e = i11;
        this.f21696i = j10;
        this.f21694f = i12;
        this.f21695g = i13;
        this.f21697j = i14;
        this.f21698k = i15;
        this.f21699l = i16;
        this.f21700m = i17;
        this.f21701n = i18;
        this.f21702o = j11;
        this.f21703p = i19;
        this.f21704q = z9;
        this.f21705r = i20;
        this.f21706s = z10;
        this.f21707t = z11;
        this.f21708u = tLObject;
    }
}
