package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements RequestDelegate {
    public final int f27868a;
    public final np f27869b;
    public final int f27870c;
    public final int d;
    public final int f27871e;
    public final int f27872f;
    public final int f27873g;
    public final long h;
    public final long f27874i;
    public final int f27875j;
    public final int f27876k;
    public final int f27877l;
    public final int f27878m;
    public final int f27879n;
    public final long f27880o;
    public final int f27881p;
    public final boolean f27882q;
    public final int f27883r;
    public final boolean f27884s;
    public final boolean f27885t;
    public final TLObject f27886u;

    public xk(np npVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f27868a = 1;
        this.f27869b = npVar;
        this.f27870c = i7;
        this.d = i10;
        this.f27871e = i11;
        this.f27872f = i12;
        this.f27873g = i13;
        this.h = j3;
        this.f27874i = j10;
        this.f27875j = i14;
        this.f27876k = i15;
        this.f27877l = i16;
        this.f27878m = i17;
        this.f27879n = i18;
        this.f27880o = j11;
        this.f27881p = i19;
        this.f27882q = z10;
        this.f27883r = i20;
        this.f27884s = z11;
        this.f27885t = z12;
        this.f27886u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f27868a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f27886u;
                np npVar = this.f27869b;
                int i13 = this.f27872f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    npVar.m4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f27870c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f27871e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) i5.c.h(1, messages_messages.messages)).f28419id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f28419id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    npVar.R3(messages_messages, messages_messages.messages.size(), j3, this.f27874i, i14, i7, i15, false, i13, this.f27873g, this.f27875j, this.f27876k, this.f27877l, this.f27878m, false, this.f27879n, this.f27880o, this.f27881p, this.f27882q, this.f27883r, this.f27884s, this.f27885t, null);
                    return;
                }
                g0.g3(new eg(npVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 9));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f27886u;
                np npVar2 = this.f27869b;
                int i16 = this.f27875j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f27870c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f27871e;
                    int i20 = this.f27873g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28419id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f28419id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f27872f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f28419id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        npVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27874i, i17, i11, i19, false, i16, i10, this.f27876k, this.f27877l, this.f27878m, i20, false, this.f27879n, this.f27880o, this.f27881p, this.f27882q, this.f27883r, this.f27884s, this.f27885t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    npVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27874i, i17, i11, i19, false, i16, i10, this.f27876k, this.f27877l, this.f27878m, i20, false, this.f27879n, this.f27880o, this.f27881p, this.f27882q, this.f27883r, this.f27884s, this.f27885t, null);
                    return;
                }
                g0.g3(new eg(npVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 12));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f27886u;
                np npVar3 = this.f27869b;
                int i23 = this.f27872f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    npVar3.m4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f27870c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f27871e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) i5.c.h(1, messages_messages3.messages)).f28419id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f28419id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    npVar3.R3(messages_messages3, messages_messages3.messages.size(), j10, this.f27874i, i24, i12, i25, false, i23, this.f27873g, this.f27875j, this.f27876k, this.f27877l, this.f27878m, false, this.f27879n, this.f27880o, this.f27881p, this.f27882q, this.f27883r, this.f27884s, this.f27885t, null);
                    return;
                }
                g0.g3(new eg(npVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 8));
                return;
        }
    }

    public xk(np npVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.f27868a = i21;
        this.f27869b = npVar;
        this.h = j3;
        this.f27870c = i7;
        this.d = i10;
        this.f27871e = i11;
        this.f27874i = j10;
        this.f27872f = i12;
        this.f27873g = i13;
        this.f27875j = i14;
        this.f27876k = i15;
        this.f27877l = i16;
        this.f27878m = i17;
        this.f27879n = i18;
        this.f27880o = j11;
        this.f27881p = i19;
        this.f27882q = z10;
        this.f27883r = i20;
        this.f27884s = z11;
        this.f27885t = z12;
        this.f27886u = tLObject;
    }
}
