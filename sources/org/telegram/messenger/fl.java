package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements RequestDelegate {
    public final int f15585a;
    public final vp f15586b;
    public final int f15587c;
    public final int d;
    public final int e;
    public final int f15588f;
    public final int f15589g;
    public final long h;
    public final long f15590i;
    public final int f15591j;
    public final int f15592k;
    public final int f15593l;
    public final int f15594m;
    public final int f15595n;
    public final long f15596o;
    public final int f15597p;
    public final boolean f15598q;
    public final int f15599r;
    public final boolean f15600s;
    public final boolean f15601t;
    public final TLObject f15602u;

    public fl(vp vpVar, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f15585a = 1;
        this.f15586b = vpVar;
        this.f15587c = i10;
        this.d = i11;
        this.e = i12;
        this.f15588f = i13;
        this.f15589g = i14;
        this.h = j10;
        this.f15590i = j11;
        this.f15591j = i15;
        this.f15592k = i16;
        this.f15593l = i17;
        this.f15594m = i18;
        this.f15595n = i19;
        this.f15596o = j12;
        this.f15597p = i20;
        this.f15598q = z10;
        this.f15599r = i21;
        this.f15600s = z11;
        this.f15601t = z12;
        this.f15602u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f15585a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f15602u;
                vp vpVar = this.f15586b;
                int i14 = this.f15588f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j10 = this.h;
                    vpVar.b4(arrayList, j10);
                    int size = messages_messages.messages.size();
                    int i15 = this.f15587c;
                    if (size > i15) {
                        messages_messages.messages.remove(0);
                    }
                    int i16 = this.e;
                    if (i16 != 0 && !messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.Message) i0.a.g(1, messages_messages.messages)).f19814id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i16) {
                                    i10 = message.f19814id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    } else {
                        i10 = this.d;
                    }
                    vpVar.H3(messages_messages, messages_messages.messages.size(), j10, this.f15590i, i15, i10, i16, false, i14, this.f15589g, this.f15591j, this.f15592k, this.f15593l, this.f15594m, false, this.f15595n, this.f15596o, this.f15597p, this.f15598q, this.f15599r, this.f15600s, this.f15601t, null);
                    return;
                }
                i0.g3(new cg(vpVar, i14, (TLObject) tL_messages_getSavedHistory, tL_error, 11));
                return;
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f15602u;
                vp vpVar2 = this.f15586b;
                int i17 = this.f15591j;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i18 = this.f15587c;
                    if (size3 > i18) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i19 = this.d;
                    int i20 = this.e;
                    int i21 = this.f15589g;
                    if (!isEmpty) {
                        if (i20 != 0) {
                            i19 = ((TLRPC.Message) i0.a.g(1, messages_messages2.messages)).f19814id;
                            int size4 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size4 >= 0) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    if (message2.date > i20) {
                                        i19 = message2.f19814id;
                                    } else {
                                        size4--;
                                    }
                                }
                            }
                        } else {
                            int i22 = this.f15588f;
                            if (i22 != 0 && i21 == 2 && i19 > 0) {
                                for (int size5 = messages_messages2.messages.size() - 1; size5 >= 0; size5--) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    int i23 = message3.f19814id;
                                    if (i23 > i22 && !message3.out) {
                                        i12 = i19;
                                        i11 = i23;
                                        vpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.h, this.f15590i, i18, i12, i20, false, i17, i11, this.f15592k, this.f15593l, this.f15594m, i21, false, this.f15595n, this.f15596o, this.f15597p, this.f15598q, this.f15599r, this.f15600s, this.f15601t, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    i11 = 0;
                    i12 = i19;
                    vpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.h, this.f15590i, i18, i12, i20, false, i17, i11, this.f15592k, this.f15593l, this.f15594m, i21, false, this.f15595n, this.f15596o, this.f15597p, this.f15598q, this.f15599r, this.f15600s, this.f15601t, null);
                    return;
                }
                i0.g3(new cg(vpVar2, i17, (TLObject) tL_messages_getReplies, tL_error, 13));
                return;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f15602u;
                vp vpVar3 = this.f15586b;
                int i24 = this.f15588f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j11 = this.h;
                    vpVar3.b4(arrayList2, j11);
                    int size6 = messages_messages3.messages.size();
                    int i25 = this.f15587c;
                    if (size6 > i25) {
                        messages_messages3.messages.remove(0);
                    }
                    int i26 = this.e;
                    if (i26 != 0 && !messages_messages3.messages.isEmpty()) {
                        i13 = ((TLRPC.Message) i0.a.g(1, messages_messages3.messages)).f19814id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i26) {
                                    i13 = message4.f19814id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    } else {
                        i13 = this.d;
                    }
                    vpVar3.H3(messages_messages3, messages_messages3.messages.size(), j11, this.f15590i, i25, i13, i26, false, i24, this.f15589g, this.f15591j, this.f15592k, this.f15593l, this.f15594m, false, this.f15595n, this.f15596o, this.f15597p, this.f15598q, this.f15599r, this.f15600s, this.f15601t, null);
                    return;
                }
                i0.g3(new cg(vpVar3, i24, (TLObject) tL_messages_getHistory, tL_error, 10));
                return;
        }
    }

    public fl(vp vpVar, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f15585a = i22;
        this.f15586b = vpVar;
        this.h = j10;
        this.f15587c = i10;
        this.d = i11;
        this.e = i12;
        this.f15590i = j11;
        this.f15588f = i13;
        this.f15589g = i14;
        this.f15591j = i15;
        this.f15592k = i16;
        this.f15593l = i17;
        this.f15594m = i18;
        this.f15595n = i19;
        this.f15596o = j12;
        this.f15597p = i20;
        this.f15598q = z10;
        this.f15599r = i21;
        this.f15600s = z11;
        this.f15601t = z12;
        this.f15602u = tLObject;
    }
}
