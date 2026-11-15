package jg;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jw;
import org.telegram.ui.z51;
public final class t implements Runnable {
    public final int f17276a;
    public final Object f17277b;
    public final int f17278c;
    public final int d;
    public final Object f17279e;
    public final Object f17280f;
    public final TLObject h;
    public final ArrayList f17281n;
    public final TLObject f17282r;

    public t(h0 h0Var, int i7, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.f17276a = i11;
        this.f17277b = h0Var;
        this.f17278c = i7;
        this.d = i10;
        this.f17279e = tL_error;
        this.f17280f = str;
        this.h = tLObject;
        this.f17282r = tLMethod;
        this.f17281n = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        int i10;
        boolean z13;
        ConcurrentHashMap concurrentHashMap;
        boolean z14;
        int i11 = this.f17276a;
        ArrayList arrayList = this.f17281n;
        int i12 = this.d;
        TLObject tLObject = this.f17282r;
        Object obj = this.f17280f;
        Object obj2 = this.f17279e;
        int i13 = this.f17278c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.f17277b;
        boolean z15 = true;
        int i14 = 0;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                z zVar = h0Var.f17096k0;
                ArrayList arrayList2 = h0Var.I;
                int i15 = h0Var.f17107t0;
                if (i13 == h0Var.U && (i12 <= 0 || i12 == h0Var.f17089e0)) {
                    h0Var.E0--;
                    if (tL_error == null) {
                        h0Var.f17086c0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        vr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        np.s1(i15).Y3(messages_messages.users, false);
                        np.s1(i15).S3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        h0Var.f17087d0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = np.s1(i15).U.get(gj.B0(message));
                            if (i17 == 0 || message.f28072id > i17) {
                                arrayList2.add((gj) arrayList.get(i16));
                            }
                        }
                        h0Var.O = true;
                        if (messages_messages.messages.size() != 20) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h0Var.Y = z10;
                        if (i12 > 0) {
                            h0Var.f17093h0 = i12;
                            if (h0Var.f17092g0 != i12) {
                                h0Var.f17105s.clear();
                            }
                            if (h0Var.f17091f0 != i12) {
                                zVar.b();
                            }
                        }
                        zVar.f(h0Var.f17105s, h0Var.f17111w0);
                        jw jwVar = h0Var.V;
                        if (jwVar != null) {
                            if (h0Var.E0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            jwVar.d(z11, true);
                            h0Var.V.c();
                        }
                        h0Var.f();
                    }
                }
                h0Var.R = 0;
                return;
            case 1:
                h0 h0Var2 = (h0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                z zVar2 = h0Var2.f17096k0;
                ArrayList arrayList3 = h0Var2.J;
                ArrayList arrayList4 = h0Var2.I;
                int i18 = h0Var2.f17107t0;
                if (i13 == h0Var2.Q && (i12 <= 0 || i12 == h0Var2.f17089e0)) {
                    h0Var2.E0--;
                    if (tL_error2 == null) {
                        h0Var2.f17086c0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        vr.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        np.s1(i18).Y3(messages_messages2.users, false);
                        np.s1(i18).S3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        h0Var2.f17087d0 = messages_messages2.next_rate;
                        int i19 = 0;
                        while (i19 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = np.s1(i18).U.get(gj.B0(message2));
                            if (i20 == 0 || message2.f28072id > i20) {
                                gj gjVar = (gj) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = i14; i21 < arrayList4.size(); i21++) {
                                        gj gjVar2 = (gj) arrayList4.get(i21);
                                        if (gjVar2 == null || gjVar == null || gjVar.e1() != gjVar2.e1() || gj.B0(gjVar.f23817k) != gj.B0(gjVar2.f23817k)) {
                                        }
                                    }
                                }
                                arrayList3.add(gjVar);
                                long B0 = gj.B0(message2);
                                if (message2.out) {
                                    concurrentHashMap = np.s1(i18).Q;
                                } else {
                                    concurrentHashMap = np.s1(i18).P;
                                }
                                Integer num = (Integer) concurrentHashMap.get(Long.valueOf(B0));
                                if (num != null) {
                                    if (num.intValue() < message2.f28072id) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    message2.unread = z14;
                                }
                            }
                            i19++;
                            z15 = true;
                            i14 = 0;
                        }
                        h0Var2.O = z15;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h0Var2.X = z12;
                        if (i12 > 0) {
                            h0Var2.f17093h0 = i12;
                            if (h0Var2.f17092g0 != i12) {
                                h0Var2.f17105s.clear();
                            }
                            if (h0Var2.f17091f0 != i12) {
                                zVar2.b();
                            }
                        }
                        zVar2.f(h0Var2.f17105s, h0Var2.f17111w0);
                        jw jwVar2 = h0Var2.V;
                        if (jwVar2 != null) {
                            if (h0Var2.E0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i10 = 1;
                            jwVar2.d(z13, true);
                            h0Var2.V.c();
                        } else {
                            i10 = 1;
                        }
                        h0Var2.H0 = i10;
                        h0Var2.I0 = i10;
                        i7 = 0;
                        h0Var2.d = false;
                        z51 z51Var = h0Var2.F0;
                        if (z51Var != null) {
                            Object[] objArr = new Object[i10];
                            objArr[0] = h0Var2.f17083a0;
                            ((TextView) z51Var.f53882b).setText(hd.a0(null, null, 2131745750, objArr));
                        }
                        h0Var2.f();
                        h0Var2.P = i7;
                        return;
                    }
                }
                i7 = 0;
                h0Var2.P = i7;
                return;
            default:
                si siVar = (si) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                siVar.getClass();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList5 = this.f17281n;
                arrayList5.set(i13, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).f28078id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    while (i14 < arrayList5.size()) {
                        if (arrayList5.get(i14) == null) {
                            arrayList5.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                    siVar.z1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    return;
                }
                return;
        }
    }

    public t(si siVar, TLObject tLObject, ArrayList arrayList, int i7, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.f17276a = 2;
        this.f17277b = siVar;
        this.h = tLObject;
        this.f17281n = arrayList;
        this.f17278c = i7;
        this.f17279e = hVar;
        this.f17280f = stickerSet;
        this.f17282r = tL_messages_allStickers;
        this.d = i10;
    }
}
