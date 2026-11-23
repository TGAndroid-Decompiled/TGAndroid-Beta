package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements RequestDelegate {
    public final int f27798a;
    public final mp f27799b;
    public final int f27800c;
    public final int d;
    public final int f27801e;
    public final int f27802f;
    public final int f27803g;
    public final long h;
    public final long f27804i;
    public final int f27805j;
    public final int f27806k;
    public final int f27807l;
    public final int f27808m;
    public final int f27809n;
    public final long f27810o;
    public final int f27811p;
    public final boolean f27812q;
    public final int f27813r;
    public final boolean f27814s;
    public final boolean f27815t;
    public final TLObject f27816u;

    public wk(mp mpVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f27798a = 1;
        this.f27799b = mpVar;
        this.f27800c = i7;
        this.d = i10;
        this.f27801e = i11;
        this.f27802f = i12;
        this.f27803g = i13;
        this.h = j3;
        this.f27804i = j10;
        this.f27805j = i14;
        this.f27806k = i15;
        this.f27807l = i16;
        this.f27808m = i17;
        this.f27809n = i18;
        this.f27810o = j11;
        this.f27811p = i19;
        this.f27812q = z10;
        this.f27813r = i20;
        this.f27814s = z11;
        this.f27815t = z12;
        this.f27816u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f27798a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f27816u;
                mp mpVar = this.f27799b;
                int i13 = this.f27802f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    mpVar.m4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.f27800c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f27801e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.Message) i5.c.h(1, messages_messages.messages)).f28513id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.f28513id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i7 = this.d;
                    }
                    mpVar.R3(messages_messages, messages_messages.messages.size(), j3, this.f27804i, i14, i7, i15, false, i13, this.f27803g, this.f27805j, this.f27806k, this.f27807l, this.f27808m, false, this.f27809n, this.f27810o, this.f27811p, this.f27812q, this.f27813r, this.f27814s, this.f27815t, null);
                    return;
                }
                g0.g3(new dg(mpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 9));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f27816u;
                mp mpVar2 = this.f27799b;
                int i16 = this.f27805j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f27800c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f27801e;
                    int i20 = this.f27803g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).f28513id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f28513id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f27802f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f28513id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27804i, i17, i11, i19, false, i16, i10, this.f27806k, this.f27807l, this.f27808m, i20, false, this.f27809n, this.f27810o, this.f27811p, this.f27812q, this.f27813r, this.f27814s, this.f27815t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    mpVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.f27804i, i17, i11, i19, false, i16, i10, this.f27806k, this.f27807l, this.f27808m, i20, false, this.f27809n, this.f27810o, this.f27811p, this.f27812q, this.f27813r, this.f27814s, this.f27815t, null);
                    return;
                }
                g0.g3(new dg(mpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 12));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f27816u;
                mp mpVar3 = this.f27799b;
                int i23 = this.f27802f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    mpVar3.m4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f27800c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f27801e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) i5.c.h(1, messages_messages3.messages)).f28513id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f28513id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    mpVar3.R3(messages_messages3, messages_messages3.messages.size(), j10, this.f27804i, i24, i12, i25, false, i23, this.f27803g, this.f27805j, this.f27806k, this.f27807l, this.f27808m, false, this.f27809n, this.f27810o, this.f27811p, this.f27812q, this.f27813r, this.f27814s, this.f27815t, null);
                    return;
                }
                g0.g3(new dg(mpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 8));
                return;
        }
    }

    public wk(mp mpVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.f27798a = i21;
        this.f27799b = mpVar;
        this.h = j3;
        this.f27800c = i7;
        this.d = i10;
        this.f27801e = i11;
        this.f27804i = j10;
        this.f27802f = i12;
        this.f27803g = i13;
        this.f27805j = i14;
        this.f27806k = i15;
        this.f27807l = i16;
        this.f27808m = i17;
        this.f27809n = i18;
        this.f27810o = j11;
        this.f27811p = i19;
        this.f27812q = z10;
        this.f27813r = i20;
        this.f27814s = z11;
        this.f27815t = z12;
        this.f27816u = tLObject;
    }
}
