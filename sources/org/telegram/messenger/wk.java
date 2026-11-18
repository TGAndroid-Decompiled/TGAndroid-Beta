package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements RequestDelegate {
    public final int f27704a;
    public final mp f27705b;
    public final int f27706c;
    public final int d;
    public final int f27707e;
    public final int f27708f;
    public final int f27709g;
    public final long h;
    public final long f27710i;
    public final int f27711j;
    public final int f27712k;
    public final int f27713l;
    public final int f27714m;
    public final int f27715n;
    public final long f27716o;
    public final int f27717p;
    public final boolean f27718q;
    public final int f27719r;
    public final boolean f27720s;
    public final boolean f27721t;
    public final TLObject f27722u;

    public wk(mp mpVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f27704a = 1;
        this.f27705b = mpVar;
        this.f27706c = i7;
        this.d = i10;
        this.f27707e = i11;
        this.f27708f = i12;
        this.f27709g = i13;
        this.h = j3;
        this.f27710i = j10;
        this.f27711j = i14;
        this.f27712k = i15;
        this.f27713l = i16;
        this.f27714m = i17;
        this.f27715n = i18;
        this.f27716o = j11;
        this.f27717p = i19;
        this.f27718q = z10;
        this.f27719r = i20;
        this.f27720s = z11;
        this.f27721t = z12;
        this.f27722u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f27704a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f27722u;
                mp mpVar = this.f27705b;
                int i13 = this.f27708f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    mpVar.m4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f27706c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f27707e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) i5.c.h(1, messages_messages.messages)).f28424id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f28424id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    mpVar.R3(messages_messages, messages_messages.messages.size(), j3, this.f27710i, i14, i7, i15, false, i13, this.f27709g, this.f27711j, this.f27712k, this.f27713l, this.f27714m, false, this.f27715n, this.f27716o, this.f27717p, this.f27718q, this.f27719r, this.f27720s, this.f27721t, null);
                    return;
                }
                g0.g3(new dg(mpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 9));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f27722u;
                mp mpVar2 = this.f27705b;
                int i16 = this.f27711j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f27706c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f27707e;
                    int i20 = this.f27709g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28424id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f28424id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f27708f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f28424id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27710i, i17, i11, i19, false, i16, i10, this.f27712k, this.f27713l, this.f27714m, i20, false, this.f27715n, this.f27716o, this.f27717p, this.f27718q, this.f27719r, this.f27720s, this.f27721t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27710i, i17, i11, i19, false, i16, i10, this.f27712k, this.f27713l, this.f27714m, i20, false, this.f27715n, this.f27716o, this.f27717p, this.f27718q, this.f27719r, this.f27720s, this.f27721t, null);
                    return;
                }
                g0.g3(new dg(mpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 12));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f27722u;
                mp mpVar3 = this.f27705b;
                int i23 = this.f27708f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    mpVar3.m4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f27706c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f27707e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) i5.c.h(1, messages_messages3.messages)).f28424id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f28424id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    mpVar3.R3(messages_messages3, messages_messages3.messages.size(), j10, this.f27710i, i24, i12, i25, false, i23, this.f27709g, this.f27711j, this.f27712k, this.f27713l, this.f27714m, false, this.f27715n, this.f27716o, this.f27717p, this.f27718q, this.f27719r, this.f27720s, this.f27721t, null);
                    return;
                }
                g0.g3(new dg(mpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 8));
                return;
        }
    }

    public wk(mp mpVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.f27704a = i21;
        this.f27705b = mpVar;
        this.h = j3;
        this.f27706c = i7;
        this.d = i10;
        this.f27707e = i11;
        this.f27710i = j10;
        this.f27708f = i12;
        this.f27709g = i13;
        this.f27711j = i14;
        this.f27712k = i15;
        this.f27713l = i16;
        this.f27714m = i17;
        this.f27715n = i18;
        this.f27716o = j11;
        this.f27717p = i19;
        this.f27718q = z10;
        this.f27719r = i20;
        this.f27720s = z11;
        this.f27721t = z12;
        this.f27722u = tLObject;
    }
}
