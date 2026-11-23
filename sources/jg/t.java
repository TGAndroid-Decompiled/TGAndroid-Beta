package jg;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b61;
import org.telegram.ui.lw;
public final class t implements Runnable {
    public final int f17755a;
    public final Object f17756b;
    public final int f17757c;
    public final int d;
    public final Object f17758e;
    public final Object f17759f;
    public final TLObject h;
    public final ArrayList f17760n;
    public final TLObject f17761r;

    public t(h0 h0Var, int i7, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.f17755a = i11;
        this.f17756b = h0Var;
        this.f17757c = i7;
        this.d = i10;
        this.f17758e = tL_error;
        this.f17759f = str;
        this.h = tLObject;
        this.f17761r = tLMethod;
        this.f17760n = arrayList;
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
        int i11 = this.f17755a;
        ArrayList arrayList = this.f17760n;
        int i12 = this.d;
        TLObject tLObject = this.f17761r;
        Object obj = this.f17759f;
        Object obj2 = this.f17758e;
        int i13 = this.f17757c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.f17756b;
        boolean z15 = true;
        int i14 = 0;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                z zVar = h0Var.f17575k0;
                ArrayList arrayList2 = h0Var.I;
                int i15 = h0Var.f17586t0;
                if (i13 == h0Var.U && (i12 <= 0 || i12 == h0Var.f17568e0)) {
                    h0Var.E0--;
                    if (tL_error == null) {
                        h0Var.f17565c0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        tr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        mp.u1(i15).f4(messages_messages.users, false);
                        mp.u1(i15).Z3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        h0Var.f17566d0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = mp.u1(i15).U.get(fj.B0(message));
                            if (i17 == 0 || message.f28513id > i17) {
                                arrayList2.add((fj) arrayList.get(i16));
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
                            h0Var.f17572h0 = i12;
                            if (h0Var.f17571g0 != i12) {
                                h0Var.f17584s.clear();
                            }
                            if (h0Var.f17570f0 != i12) {
                                zVar.b();
                            }
                        }
                        zVar.f(h0Var.f17584s, h0Var.f17590w0);
                        lw lwVar = h0Var.V;
                        if (lwVar != null) {
                            if (h0Var.E0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            lwVar.d(z11, true);
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
                z zVar2 = h0Var2.f17575k0;
                ArrayList arrayList3 = h0Var2.J;
                ArrayList arrayList4 = h0Var2.I;
                int i18 = h0Var2.f17586t0;
                if (i13 == h0Var2.Q && (i12 <= 0 || i12 == h0Var2.f17568e0)) {
                    h0Var2.E0--;
                    if (tL_error2 == null) {
                        h0Var2.f17565c0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        tr.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        mp.u1(i18).f4(messages_messages2.users, false);
                        mp.u1(i18).Z3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        h0Var2.f17566d0 = messages_messages2.next_rate;
                        int i19 = 0;
                        while (i19 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = mp.u1(i18).U.get(fj.B0(message2));
                            if (i20 == 0 || message2.f28513id > i20) {
                                fj fjVar = (fj) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = i14; i21 < arrayList4.size(); i21++) {
                                        fj fjVar2 = (fj) arrayList4.get(i21);
                                        if (fjVar2 == null || fjVar == null || fjVar.e1() != fjVar2.e1() || fj.B0(fjVar.f24073k) != fj.B0(fjVar2.f24073k)) {
                                        }
                                    }
                                }
                                arrayList3.add(fjVar);
                                long B0 = fj.B0(message2);
                                if (message2.out) {
                                    concurrentHashMap = mp.u1(i18).Q;
                                } else {
                                    concurrentHashMap = mp.u1(i18).P;
                                }
                                Integer num = (Integer) concurrentHashMap.get(Long.valueOf(B0));
                                if (num != null) {
                                    if (num.intValue() < message2.f28513id) {
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
                            h0Var2.f17572h0 = i12;
                            if (h0Var2.f17571g0 != i12) {
                                h0Var2.f17584s.clear();
                            }
                            if (h0Var2.f17570f0 != i12) {
                                zVar2.b();
                            }
                        }
                        zVar2.f(h0Var2.f17584s, h0Var2.f17590w0);
                        lw lwVar2 = h0Var2.V;
                        if (lwVar2 != null) {
                            if (h0Var2.E0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i10 = 1;
                            lwVar2.d(z13, true);
                            h0Var2.V.c();
                        } else {
                            i10 = 1;
                        }
                        h0Var2.H0 = i10;
                        h0Var2.I0 = i10;
                        i7 = 0;
                        h0Var2.d = false;
                        b61 b61Var = h0Var2.F0;
                        if (b61Var != null) {
                            Object[] objArr = new Object[i10];
                            objArr[0] = h0Var2.f17562a0;
                            ((TextView) b61Var.f45965b).setText(gd.a0(null, null, 2131745554, objArr));
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
                ri riVar = (ri) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                riVar.getClass();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList5 = this.f17760n;
                arrayList5.set(i13, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).f28519id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    while (i14 < arrayList5.size()) {
                        if (arrayList5.get(i14) == null) {
                            arrayList5.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                    riVar.C1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    return;
                }
                return;
        }
    }

    public t(ri riVar, TLObject tLObject, ArrayList arrayList, int i7, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.f17755a = 2;
        this.f17756b = riVar;
        this.h = tLObject;
        this.f17760n = arrayList;
        this.f17757c = i7;
        this.f17758e = hVar;
        this.f17759f = stickerSet;
        this.f17761r = tL_messages_allStickers;
        this.d = i10;
    }
}
