package jg;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d61;
import org.telegram.ui.jw;
public final class u implements Runnable {
    public final int f16937a;
    public final Object f16938b;
    public final int f16939c;
    public final int d;
    public final Object f16940e;
    public final Object f16941f;
    public final TLObject h;
    public final ArrayList f16942n;
    public final TLObject f16943r;

    public u(h0 h0Var, int i7, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.f16937a = i11;
        this.f16938b = h0Var;
        this.f16939c = i7;
        this.d = i10;
        this.f16940e = tL_error;
        this.f16941f = str;
        this.h = tLObject;
        this.f16943r = tLMethod;
        this.f16942n = arrayList;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        int i10;
        boolean z12;
        ConcurrentHashMap concurrentHashMap;
        boolean z13;
        int i11 = this.f16937a;
        ArrayList arrayList = this.f16942n;
        int i12 = this.d;
        TLObject tLObject = this.f16943r;
        Object obj = this.f16941f;
        Object obj2 = this.f16940e;
        int i13 = this.f16939c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.f16938b;
        boolean z14 = true;
        int i14 = 0;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                z zVar = h0Var.f16749j0;
                ArrayList arrayList2 = h0Var.H;
                int i15 = h0Var.f16760s0;
                if (i13 == h0Var.T && (i12 <= 0 || i12 == h0Var.f16741d0)) {
                    h0Var.D0--;
                    if (tL_error == null) {
                        h0Var.f16738b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        yr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        qp.s1(i15).Y3(messages_messages.users, false);
                        qp.s1(i15).S3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        h0Var.f16740c0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = qp.s1(i15).T.get(ij.B0(message));
                            if (i17 == 0 || message.f26977id > i17) {
                                arrayList2.add((ij) arrayList.get(i16));
                            }
                        }
                        h0Var.N = true;
                        if (messages_messages.messages.size() != 20) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        h0Var.X = z9;
                        if (i12 > 0) {
                            h0Var.f16746g0 = i12;
                            if (h0Var.f16745f0 != i12) {
                                h0Var.f16759s.clear();
                            }
                            if (h0Var.f16743e0 != i12) {
                                zVar.b();
                            }
                        }
                        zVar.f(h0Var.f16759s, h0Var.f16763v0);
                        jw jwVar = h0Var.U;
                        if (jwVar != null) {
                            if (h0Var.D0 > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jwVar.d(z10, true);
                            h0Var.U.c();
                        }
                        h0Var.f();
                    }
                }
                h0Var.Q = 0;
                return;
            case 1:
                h0 h0Var2 = (h0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                z zVar2 = h0Var2.f16749j0;
                ArrayList arrayList3 = h0Var2.I;
                ArrayList arrayList4 = h0Var2.H;
                int i18 = h0Var2.f16760s0;
                if (i13 == h0Var2.P && (i12 <= 0 || i12 == h0Var2.f16741d0)) {
                    h0Var2.D0--;
                    if (tL_error2 == null) {
                        h0Var2.f16738b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        yr.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        qp.s1(i18).Y3(messages_messages2.users, false);
                        qp.s1(i18).S3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        h0Var2.f16740c0 = messages_messages2.next_rate;
                        int i19 = 0;
                        while (i19 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = qp.s1(i18).T.get(ij.B0(message2));
                            if (i20 == 0 || message2.f26977id > i20) {
                                ij ijVar = (ij) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = i14; i21 < arrayList4.size(); i21++) {
                                        ij ijVar2 = (ij) arrayList4.get(i21);
                                        if (ijVar2 == null || ijVar == null || ijVar.e1() != ijVar2.e1() || ij.B0(ijVar.f23262k) != ij.B0(ijVar2.f23262k)) {
                                        }
                                    }
                                }
                                arrayList3.add(ijVar);
                                long B0 = ij.B0(message2);
                                if (message2.out) {
                                    concurrentHashMap = qp.s1(i18).P;
                                } else {
                                    concurrentHashMap = qp.s1(i18).O;
                                }
                                Integer num = (Integer) concurrentHashMap.get(Long.valueOf(B0));
                                if (num != null) {
                                    if (num.intValue() < message2.f26977id) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    message2.unread = z13;
                                }
                            }
                            i19++;
                            z14 = true;
                            i14 = 0;
                        }
                        h0Var2.N = z14;
                        if (messages_messages2.messages.size() != 20) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        h0Var2.W = z11;
                        if (i12 > 0) {
                            h0Var2.f16746g0 = i12;
                            if (h0Var2.f16745f0 != i12) {
                                h0Var2.f16759s.clear();
                            }
                            if (h0Var2.f16743e0 != i12) {
                                zVar2.b();
                            }
                        }
                        zVar2.f(h0Var2.f16759s, h0Var2.f16763v0);
                        jw jwVar2 = h0Var2.U;
                        if (jwVar2 != null) {
                            if (h0Var2.D0 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            i10 = 1;
                            jwVar2.d(z12, true);
                            h0Var2.U.c();
                        } else {
                            i10 = 1;
                        }
                        h0Var2.G0 = i10;
                        h0Var2.H0 = i10;
                        i7 = 0;
                        h0Var2.d = false;
                        d61 d61Var = h0Var2.E0;
                        if (d61Var != null) {
                            Object[] objArr = new Object[i10];
                            objArr[0] = h0Var2.Z;
                            ((TextView) d61Var.f44867b).setText(id.a0(null, null, 2131745750, objArr));
                        }
                        h0Var2.f();
                        h0Var2.O = i7;
                        return;
                    }
                }
                i7 = 0;
                h0Var2.O = i7;
                return;
            default:
                ui uiVar = (ui) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                uiVar.getClass();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList5 = this.f16942n;
                arrayList5.set(i13, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).f26983id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    while (i14 < arrayList5.size()) {
                        if (arrayList5.get(i14) == null) {
                            arrayList5.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                    uiVar.z1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    return;
                }
                return;
        }
    }

    public u(ui uiVar, TLObject tLObject, ArrayList arrayList, int i7, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.f16937a = 2;
        this.f16938b = uiVar;
        this.h = tLObject;
        this.f16942n = arrayList;
        this.f16939c = i7;
        this.f16940e = hVar;
        this.f16941f = stickerSet;
        this.f16943r = tL_messages_allStickers;
        this.d = i10;
    }
}
