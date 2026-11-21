package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements RequestDelegate {
    public final int f27732a;
    public final mp f27733b;
    public final int f27734c;
    public final int d;
    public final int f27735e;
    public final int f27736f;
    public final int f27737g;
    public final long h;
    public final long f27738i;
    public final int f27739j;
    public final int f27740k;
    public final int f27741l;
    public final int f27742m;
    public final int f27743n;
    public final long f27744o;
    public final int f27745p;
    public final boolean f27746q;
    public final int f27747r;
    public final boolean f27748s;
    public final boolean f27749t;
    public final TLObject f27750u;

    public wk(mp mpVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f27732a = 1;
        this.f27733b = mpVar;
        this.f27734c = i7;
        this.d = i10;
        this.f27735e = i11;
        this.f27736f = i12;
        this.f27737g = i13;
        this.h = j3;
        this.f27738i = j10;
        this.f27739j = i14;
        this.f27740k = i15;
        this.f27741l = i16;
        this.f27742m = i17;
        this.f27743n = i18;
        this.f27744o = j11;
        this.f27745p = i19;
        this.f27746q = z10;
        this.f27747r = i20;
        this.f27748s = z11;
        this.f27749t = z12;
        this.f27750u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f27732a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f27750u;
                mp mpVar = this.f27733b;
                int i13 = this.f27736f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    mpVar.m4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f27734c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f27735e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) i5.c.h(1, messages_messages.messages)).f28452id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f28452id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    mpVar.R3(messages_messages, messages_messages.messages.size(), j3, this.f27738i, i14, i7, i15, false, i13, this.f27737g, this.f27739j, this.f27740k, this.f27741l, this.f27742m, false, this.f27743n, this.f27744o, this.f27745p, this.f27746q, this.f27747r, this.f27748s, this.f27749t, null);
                    return;
                }
                g0.g3(new dg(mpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 9));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f27750u;
                mp mpVar2 = this.f27733b;
                int i16 = this.f27739j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f27734c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f27735e;
                    int i20 = this.f27737g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28452id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f28452id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f27736f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f28452id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27738i, i17, i11, i19, false, i16, i10, this.f27740k, this.f27741l, this.f27742m, i20, false, this.f27743n, this.f27744o, this.f27745p, this.f27746q, this.f27747r, this.f27748s, this.f27749t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27738i, i17, i11, i19, false, i16, i10, this.f27740k, this.f27741l, this.f27742m, i20, false, this.f27743n, this.f27744o, this.f27745p, this.f27746q, this.f27747r, this.f27748s, this.f27749t, null);
                    return;
                }
                g0.g3(new dg(mpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 12));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f27750u;
                mp mpVar3 = this.f27733b;
                int i23 = this.f27736f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    mpVar3.m4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f27734c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f27735e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) i5.c.h(1, messages_messages3.messages)).f28452id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f28452id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    mpVar3.R3(messages_messages3, messages_messages3.messages.size(), j10, this.f27738i, i24, i12, i25, false, i23, this.f27737g, this.f27739j, this.f27740k, this.f27741l, this.f27742m, false, this.f27743n, this.f27744o, this.f27745p, this.f27746q, this.f27747r, this.f27748s, this.f27749t, null);
                    return;
                }
                g0.g3(new dg(mpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 8));
                return;
        }
    }

    public wk(mp mpVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.f27732a = i21;
        this.f27733b = mpVar;
        this.h = j3;
        this.f27734c = i7;
        this.d = i10;
        this.f27735e = i11;
        this.f27738i = j10;
        this.f27736f = i12;
        this.f27737g = i13;
        this.f27739j = i14;
        this.f27740k = i15;
        this.f27741l = i16;
        this.f27742m = i17;
        this.f27743n = i18;
        this.f27744o = j11;
        this.f27745p = i19;
        this.f27746q = z10;
        this.f27747r = i20;
        this.f27748s = z11;
        this.f27749t = z12;
        this.f27750u = tLObject;
    }
}
