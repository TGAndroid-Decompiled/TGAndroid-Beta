package jg;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d61;
import org.telegram.ui.mw;
public final class t implements Runnable {
    public final int f17653a;
    public final Object f17654b;
    public final int f17655c;
    public final int d;
    public final Object f17656e;
    public final Object f17657f;
    public final TLObject h;
    public final ArrayList f17658n;
    public final TLObject f17659r;

    public t(h0 h0Var, int i7, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.f17653a = i11;
        this.f17654b = h0Var;
        this.f17655c = i7;
        this.d = i10;
        this.f17656e = tL_error;
        this.f17657f = str;
        this.h = tLObject;
        this.f17659r = tLMethod;
        this.f17658n = arrayList;
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
        int i11 = this.f17653a;
        ArrayList arrayList = this.f17658n;
        int i12 = this.d;
        TLObject tLObject = this.f17659r;
        Object obj = this.f17657f;
        Object obj2 = this.f17656e;
        int i13 = this.f17655c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.f17654b;
        boolean z15 = true;
        int i14 = 0;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                z zVar = h0Var.f17473k0;
                ArrayList arrayList2 = h0Var.I;
                int i15 = h0Var.f17484t0;
                if (i13 == h0Var.U && (i12 <= 0 || i12 == h0Var.f17466e0)) {
                    h0Var.E0--;
                    if (tL_error == null) {
                        h0Var.f17463c0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ur.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        np.u1(i15).f4(messages_messages.users, false);
                        np.u1(i15).Z3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        h0Var.f17464d0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = np.u1(i15).U.get(gj.B0(message));
                            if (i17 == 0 || message.f28419id > i17) {
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
                            h0Var.f17470h0 = i12;
                            if (h0Var.f17469g0 != i12) {
                                h0Var.f17482s.clear();
                            }
                            if (h0Var.f17468f0 != i12) {
                                zVar.b();
                            }
                        }
                        zVar.f(h0Var.f17482s, h0Var.f17488w0);
                        mw mwVar = h0Var.V;
                        if (mwVar != null) {
                            if (h0Var.E0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            mwVar.d(z11, true);
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
                z zVar2 = h0Var2.f17473k0;
                ArrayList arrayList3 = h0Var2.J;
                ArrayList arrayList4 = h0Var2.I;
                int i18 = h0Var2.f17484t0;
                if (i13 == h0Var2.Q && (i12 <= 0 || i12 == h0Var2.f17466e0)) {
                    h0Var2.E0--;
                    if (tL_error2 == null) {
                        h0Var2.f17463c0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        ur.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        np.u1(i18).f4(messages_messages2.users, false);
                        np.u1(i18).Z3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        h0Var2.f17464d0 = messages_messages2.next_rate;
                        int i19 = 0;
                        while (i19 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = np.u1(i18).U.get(gj.B0(message2));
                            if (i20 == 0 || message2.f28419id > i20) {
                                gj gjVar = (gj) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = i14; i21 < arrayList4.size(); i21++) {
                                        gj gjVar2 = (gj) arrayList4.get(i21);
                                        if (gjVar2 == null || gjVar == null || gjVar.e1() != gjVar2.e1() || gj.B0(gjVar.f24177k) != gj.B0(gjVar2.f24177k)) {
                                        }
                                    }
                                }
                                arrayList3.add(gjVar);
                                long B0 = gj.B0(message2);
                                if (message2.out) {
                                    concurrentHashMap = np.u1(i18).Q;
                                } else {
                                    concurrentHashMap = np.u1(i18).P;
                                }
                                Integer num = (Integer) concurrentHashMap.get(Long.valueOf(B0));
                                if (num != null) {
                                    if (num.intValue() < message2.f28419id) {
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
                            h0Var2.f17470h0 = i12;
                            if (h0Var2.f17469g0 != i12) {
                                h0Var2.f17482s.clear();
                            }
                            if (h0Var2.f17468f0 != i12) {
                                zVar2.b();
                            }
                        }
                        zVar2.f(h0Var2.f17482s, h0Var2.f17488w0);
                        mw mwVar2 = h0Var2.V;
                        if (mwVar2 != null) {
                            if (h0Var2.E0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i10 = 1;
                            mwVar2.d(z13, true);
                            h0Var2.V.c();
                        } else {
                            i10 = 1;
                        }
                        h0Var2.H0 = i10;
                        h0Var2.I0 = i10;
                        i7 = 0;
                        h0Var2.d = false;
                        d61 d61Var = h0Var2.F0;
                        if (d61Var != null) {
                            Object[] objArr = new Object[i10];
                            objArr[0] = h0Var2.f17460a0;
                            ((TextView) d61Var.f46849b).setText(hd.a0(null, null, 2131745554, objArr));
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
                ArrayList arrayList5 = this.f17658n;
                arrayList5.set(i13, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).f28425id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    while (i14 < arrayList5.size()) {
                        if (arrayList5.get(i14) == null) {
                            arrayList5.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                    siVar.C1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    return;
                }
                return;
        }
    }

    public t(si siVar, TLObject tLObject, ArrayList arrayList, int i7, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.f17653a = 2;
        this.f17654b = siVar;
        this.h = tLObject;
        this.f17658n = arrayList;
        this.f17655c = i7;
        this.f17656e = hVar;
        this.f17657f = stickerSet;
        this.f17659r = tL_messages_allStickers;
        this.d = i10;
    }
}
