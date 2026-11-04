package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sk implements RequestDelegate {
    public final int f25358a;
    public final hp f25359b;
    public final int f25360c;
    public final int d;
    public final int f25361e;
    public final int f25362f;
    public final int f25363g;
    public final long h;
    public final long f25364i;
    public final int f25365j;
    public final int f25366k;
    public final int f25367l;
    public final int f25368m;
    public final int f25369n;
    public final long f25370o;
    public final int f25371p;
    public final boolean f25372q;
    public final int f25373r;
    public final boolean f25374s;
    public final boolean f25375t;
    public final TLObject f25376u;

    public sk(hp hpVar, int i3, int i10, int i11, int i12, int i13, long j10, long j11, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f25358a = 1;
        this.f25359b = hpVar;
        this.f25360c = i3;
        this.d = i10;
        this.f25361e = i11;
        this.f25362f = i12;
        this.f25363g = i13;
        this.h = j10;
        this.f25364i = j11;
        this.f25365j = i14;
        this.f25366k = i15;
        this.f25367l = i16;
        this.f25368m = i17;
        this.f25369n = i18;
        this.f25370o = j12;
        this.f25371p = i19;
        this.f25372q = z10;
        this.f25373r = i20;
        this.f25374s = z11;
        this.f25375t = z12;
        this.f25376u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        int i10;
        int i11;
        int i12;
        switch (this.f25358a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f25376u;
                hp hpVar = this.f25359b;
                int i13 = this.f25362f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j10 = this.h;
                    hpVar.e4(arrayList, j10);
                    int size = messages_messages.messages.size();
                    int i14 = this.f25360c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.f25361e;
                    if (i15 != 0 && !messages_messages.messages.isEmpty()) {
                        i3 = ((TLRPC.Message) k2.p1.h(1, messages_messages.messages)).f27022id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i3 = message.f27022id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i3 = this.d;
                    }
                    hpVar.K3(messages_messages, messages_messages.messages.size(), j10, this.f25364i, i14, i3, i15, false, i13, this.f25363g, this.f25365j, this.f25366k, this.f25367l, this.f25368m, false, this.f25369n, this.f25370o, this.f25371p, this.f25372q, this.f25373r, this.f25374s, this.f25375t, null);
                    return;
                }
                g0.h3(new vf(hpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 13));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f25376u;
                hp hpVar2 = this.f25359b;
                int i16 = this.f25365j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.f25360c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.f25361e;
                    int i20 = this.f25363g;
                    if (!isEmpty) {
                        if (i19 != 0) {
                            i18 = ((TLRPC.Message) k2.p1.h(1, messages_messages2.messages)).f27022id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i19) {
                                        i18 = message2.f27022id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i21 = this.f25362f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i22 = message3.f27022id;
                                    if (i22 > i21 && !message3.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        hpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f25364i, i17, i11, i19, false, i16, i10, this.f25366k, this.f25367l, this.f25368m, i20, false, this.f25369n, this.f25370o, this.f25371p, this.f25372q, this.f25373r, this.f25374s, this.f25375t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    hpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.f25364i, i17, i11, i19, false, i16, i10, this.f25366k, this.f25367l, this.f25368m, i20, false, this.f25369n, this.f25370o, this.f25371p, this.f25372q, this.f25373r, this.f25374s, this.f25375t, null);
                    return;
                }
                g0.h3(new vf(hpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 9));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f25376u;
                hp hpVar3 = this.f25359b;
                int i23 = this.f25362f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j11 = this.h;
                    hpVar3.e4(arrayList2, j11);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.f25360c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.f25361e;
                    if (i25 != 0 && !messages_messages3.messages.isEmpty()) {
                        i12 = ((TLRPC.Message) k2.p1.h(1, messages_messages3.messages)).f27022id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.f27022id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i12 = this.d;
                    }
                    hpVar3.K3(messages_messages3, messages_messages3.messages.size(), j11, this.f25364i, i24, i12, i25, false, i23, this.f25363g, this.f25365j, this.f25366k, this.f25367l, this.f25368m, false, this.f25369n, this.f25370o, this.f25371p, this.f25372q, this.f25373r, this.f25374s, this.f25375t, null);
                    return;
                }
                g0.h3(new vf(hpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 11));
                return;
        }
    }

    public sk(hp hpVar, long j10, int i3, int i10, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.f25358a = i21;
        this.f25359b = hpVar;
        this.h = j10;
        this.f25360c = i3;
        this.d = i10;
        this.f25361e = i11;
        this.f25364i = j11;
        this.f25362f = i12;
        this.f25363g = i13;
        this.f25365j = i14;
        this.f25366k = i15;
        this.f25367l = i16;
        this.f25368m = i17;
        this.f25369n = i18;
        this.f25370o = j12;
        this.f25371p = i19;
        this.f25372q = z10;
        this.f25373r = i20;
        this.f25374s = z11;
        this.f25375t = z12;
        this.f25376u = tLObject;
    }
}
