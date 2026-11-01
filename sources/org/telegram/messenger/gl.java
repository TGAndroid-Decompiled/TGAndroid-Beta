package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements RequestDelegate {
    public final int f15926a;
    public final wp f15927b;
    public final int f15928c;
    public final int d;
    public final int e;
    public final int f15929f;
    public final int f15930g;
    public final long h;
    public final long f15931i;
    public final int f15932j;
    public final int f15933k;
    public final int f15934l;
    public final int f15935m;
    public final int f15936n;
    public final long f15937o;
    public final int f15938p;
    public final boolean f15939q;
    public final int f15940r;
    public final boolean f15941s;
    public final boolean f15942t;
    public final TLObject f15943u;

    public gl(wp wpVar, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f15926a = 1;
        this.f15927b = wpVar;
        this.f15928c = i10;
        this.d = i11;
        this.e = i12;
        this.f15929f = i13;
        this.f15930g = i14;
        this.h = j10;
        this.f15931i = j11;
        this.f15932j = i15;
        this.f15933k = i16;
        this.f15934l = i17;
        this.f15935m = i18;
        this.f15936n = i19;
        this.f15937o = j12;
        this.f15938p = i20;
        this.f15939q = z10;
        this.f15940r = i21;
        this.f15941s = z11;
        this.f15942t = z12;
        this.f15943u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f15926a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f15943u;
                wp wpVar = this.f15927b;
                int i14 = this.f15929f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j10 = this.h;
                    wpVar.b4(arrayList, j10);
                    int size = messages_messages.messages.size();
                    int i15 = this.f15928c;
                    if (size > i15) {
                        messages_messages.messages.remove(0);
                    }
                    int i16 = this.e;
                    if (i16 != 0 && !messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.Message) i0.a.g(1, messages_messages.messages)).f19815id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i16) {
                                    i10 = message.f19815id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i10 = this.d;
                    }
                    wpVar.H3(messages_messages, messages_messages.messages.size(), j10, this.f15931i, i15, i10, i16, false, i14, this.f15930g, this.f15932j, this.f15933k, this.f15934l, this.f15935m, false, this.f15936n, this.f15937o, this.f15938p, this.f15939q, this.f15940r, this.f15941s, this.f15942t, null);
                    return;
                }
                i0.g3(new dg(wpVar, i14, (TLObject) tL_messages_getSavedHistory, tL_error, 11));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f15943u;
                wp wpVar2 = this.f15927b;
                int i17 = this.f15932j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i18 = this.f15928c;
                    if (size3 > i18) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i19 = this.d;
                    int i20 = this.e;
                    int i21 = this.f15930g;
                    if (!isEmpty) {
                        if (i20 != 0) {
                            i19 = ((TLRPC.Message) i0.a.g(1, messages_messages2.messages)).f19815id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i20) {
                                        i19 = message2.f19815id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i22 = this.f15929f;
                            if (i22 != 0 && i21 == 2 && i19 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i23 = message3.f19815id;
                                    if (i23 > i22 && !message3.out) {
                                        i12 = i19;
                                        i11 = i23;
                                        wpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.h, this.f15931i, i18, i12, i20, false, i17, i11, this.f15933k, this.f15934l, this.f15935m, i21, false, this.f15936n, this.f15937o, this.f15938p, this.f15939q, this.f15940r, this.f15941s, this.f15942t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i11 = 0;
                    i12 = i19;
                    wpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.h, this.f15931i, i18, i12, i20, false, i17, i11, this.f15933k, this.f15934l, this.f15935m, i21, false, this.f15936n, this.f15937o, this.f15938p, this.f15939q, this.f15940r, this.f15941s, this.f15942t, null);
                    return;
                }
                i0.g3(new dg(wpVar2, i17, (TLObject) tL_messages_getReplies, tL_error, 13));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f15943u;
                wp wpVar3 = this.f15927b;
                int i24 = this.f15929f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j11 = this.h;
                    wpVar3.b4(arrayList2, j11);
                    int size6 = messages_messages3.messages.size();
                    int i25 = this.f15928c;
                    if (size6 > i25) {
                        messages_messages3.messages.remove(0);
                    }
                    int i26 = this.e;
                    if (i26 != 0 && !messages_messages3.messages.isEmpty()) {
                        i13 = ((TLRPC.Message) i0.a.g(1, messages_messages3.messages)).f19815id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i26) {
                                    i13 = message4.f19815id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i13 = this.d;
                    }
                    wpVar3.H3(messages_messages3, messages_messages3.messages.size(), j11, this.f15931i, i25, i13, i26, false, i24, this.f15930g, this.f15932j, this.f15933k, this.f15934l, this.f15935m, false, this.f15936n, this.f15937o, this.f15938p, this.f15939q, this.f15940r, this.f15941s, this.f15942t, null);
                    return;
                }
                i0.g3(new dg(wpVar3, i24, (TLObject) tL_messages_getHistory, tL_error, 10));
                return;
        }
    }

    public gl(wp wpVar, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f15926a = i22;
        this.f15927b = wpVar;
        this.h = j10;
        this.f15928c = i10;
        this.d = i11;
        this.e = i12;
        this.f15931i = j11;
        this.f15929f = i13;
        this.f15930g = i14;
        this.f15932j = i15;
        this.f15933k = i16;
        this.f15934l = i17;
        this.f15935m = i18;
        this.f15936n = i19;
        this.f15937o = j12;
        this.f15938p = i20;
        this.f15939q = z10;
        this.f15940r = i21;
        this.f15941s = z11;
        this.f15942t = z12;
        this.f15943u = tLObject;
    }
}
