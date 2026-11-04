package kg;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ew;
import org.telegram.ui.s51;
public final class s implements Runnable {
    public final int f17172a;
    public final Object f17173b;
    public final int f17174c;
    public final int d;
    public final Object f17175e;
    public final Object f17176f;
    public final TLObject h;
    public final ArrayList f17177n;
    public final TLObject f17178r;

    public s(e0 e0Var, int i3, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.f17172a = i11;
        this.f17173b = e0Var;
        this.f17174c = i3;
        this.d = i10;
        this.f17175e = tL_error;
        this.f17176f = str;
        this.h = tLObject;
        this.f17178r = tLMethod;
        this.f17177n = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i3;
        boolean z12;
        int i10;
        boolean z13;
        ConcurrentHashMap concurrentHashMap;
        boolean z14;
        int i11 = this.f17172a;
        ArrayList arrayList = this.f17177n;
        int i12 = this.d;
        TLObject tLObject = this.f17178r;
        Object obj = this.f17176f;
        Object obj2 = this.f17175e;
        int i13 = this.f17174c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.f17173b;
        boolean z15 = true;
        int i14 = 0;
        switch (i11) {
            case 0:
                e0 e0Var = (e0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                w wVar = e0Var.f16969k0;
                ArrayList arrayList2 = e0Var.I;
                int i15 = e0Var.f16980t0;
                if (i13 == e0Var.U && (i12 <= 0 || i12 == e0Var.f16962e0)) {
                    e0Var.E0--;
                    if (tL_error == null) {
                        e0Var.f16959c0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        qr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        hp.s1(i15).Y3(messages_messages.users, false);
                        hp.s1(i15).S3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        e0Var.f16960d0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = hp.s1(i15).U.get(zi.B0(message));
                            if (i17 == 0 || message.f27022id > i17) {
                                arrayList2.add((zi) arrayList.get(i16));
                            }
                        }
                        e0Var.O = true;
                        if (messages_messages.messages.size() != 20) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e0Var.Y = z10;
                        if (i12 > 0) {
                            e0Var.f16966h0 = i12;
                            if (e0Var.f16965g0 != i12) {
                                e0Var.f16978s.clear();
                            }
                            if (e0Var.f16964f0 != i12) {
                                wVar.b();
                            }
                        }
                        wVar.f(e0Var.f16978s, e0Var.f16984w0);
                        ew ewVar = e0Var.V;
                        if (ewVar != null) {
                            if (e0Var.E0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ewVar.d(z11, true);
                            e0Var.V.c();
                        }
                        e0Var.f();
                    }
                }
                e0Var.R = 0;
                return;
            case 1:
                e0 e0Var2 = (e0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                w wVar2 = e0Var2.f16969k0;
                ArrayList arrayList3 = e0Var2.J;
                ArrayList arrayList4 = e0Var2.I;
                int i18 = e0Var2.f16980t0;
                if (i13 == e0Var2.Q && (i12 <= 0 || i12 == e0Var2.f16962e0)) {
                    e0Var2.E0--;
                    if (tL_error2 == null) {
                        e0Var2.f16959c0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        qr.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        hp.s1(i18).Y3(messages_messages2.users, false);
                        hp.s1(i18).S3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        e0Var2.f16960d0 = messages_messages2.next_rate;
                        int i19 = 0;
                        while (i19 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = hp.s1(i18).U.get(zi.B0(message2));
                            if (i20 == 0 || message2.f27022id > i20) {
                                zi ziVar = (zi) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = i14; i21 < arrayList4.size(); i21++) {
                                        zi ziVar2 = (zi) arrayList4.get(i21);
                                        if (ziVar2 == null || ziVar == null || ziVar.f1() != ziVar2.f1() || zi.B0(ziVar.f26868k) != zi.B0(ziVar2.f26868k)) {
                                        }
                                    }
                                }
                                arrayList3.add(ziVar);
                                long B0 = zi.B0(message2);
                                if (message2.out) {
                                    concurrentHashMap = hp.s1(i18).Q;
                                } else {
                                    concurrentHashMap = hp.s1(i18).P;
                                }
                                Integer num = (Integer) concurrentHashMap.get(Long.valueOf(B0));
                                if (num != null) {
                                    if (num.intValue() < message2.f27022id) {
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
                        e0Var2.O = z15;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        e0Var2.X = z12;
                        if (i12 > 0) {
                            e0Var2.f16966h0 = i12;
                            if (e0Var2.f16965g0 != i12) {
                                e0Var2.f16978s.clear();
                            }
                            if (e0Var2.f16964f0 != i12) {
                                wVar2.b();
                            }
                        }
                        wVar2.f(e0Var2.f16978s, e0Var2.f16984w0);
                        ew ewVar2 = e0Var2.V;
                        if (ewVar2 != null) {
                            if (e0Var2.E0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i10 = 1;
                            ewVar2.d(z13, true);
                            e0Var2.V.c();
                        } else {
                            i10 = 1;
                        }
                        e0Var2.H0 = i10;
                        e0Var2.I0 = i10;
                        i3 = 0;
                        e0Var2.d = false;
                        s51 s51Var = e0Var2.F0;
                        if (s51Var != null) {
                            Object[] objArr = new Object[i10];
                            objArr[0] = e0Var2.f16956a0;
                            ((TextView) s51Var.f49370b).setText(bd.a0(null, null, 2131745760, objArr));
                        }
                        e0Var2.f();
                        e0Var2.P = i3;
                        return;
                    }
                }
                i3 = 0;
                e0Var2.P = i3;
                return;
            default:
                li liVar = (li) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                liVar.getClass();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList5 = this.f17177n;
                arrayList5.set(i13, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).f27028id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    while (i14 < arrayList5.size()) {
                        if (arrayList5.get(i14) == null) {
                            arrayList5.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                    liVar.z1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    return;
                }
                return;
        }
    }

    public s(li liVar, TLObject tLObject, ArrayList arrayList, int i3, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.f17172a = 2;
        this.f17173b = liVar;
        this.h = tLObject;
        this.f17177n = arrayList;
        this.f17174c = i3;
        this.f17175e = hVar;
        this.f17176f = stickerSet;
        this.f17178r = tL_messages_allStickers;
        this.d = i10;
    }
}
