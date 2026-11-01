package org.telegram.messenger;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s71;
public final class cg implements Runnable {
    public final int f15143a;
    public final int f15144b;
    public final int f15145c;
    public final TLObject d;
    public final ArrayList e;
    public final Object f15146f;
    public final Object h;
    public final Object f15147n;
    public final TLObject f15148r;

    public cg(vi viVar, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.f15143a = 0;
        this.f15146f = viVar;
        this.d = tLObject;
        this.e = arrayList;
        this.f15144b = i10;
        this.h = hVar;
        this.f15147n = stickerSet;
        this.f15148r = tL_messages_allStickers;
        this.f15145c = i11;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        ConcurrentHashMap concurrentHashMap;
        boolean z14;
        int i12 = this.f15143a;
        ArrayList arrayList = this.e;
        int i13 = this.f15145c;
        TLObject tLObject = this.f15148r;
        TLObject tLObject2 = this.d;
        Object obj = this.f15147n;
        Object obj2 = this.h;
        int i14 = this.f15144b;
        Object obj3 = this.f15146f;
        boolean z15 = true;
        int i15 = 0;
        switch (i12) {
            case 0:
                vi viVar = (vi) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                viVar.getClass();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList2 = this.e;
                arrayList2.set(i14, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).f19821id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        if (arrayList2.get(i16) == null) {
                            arrayList2.remove(i16);
                            i16--;
                        }
                        i16++;
                    }
                    viVar.z1(this.f15145c, arrayList2, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    return;
                }
                return;
            case 1:
                zf.z zVar = (zf.z) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                zf.t tVar = zVar.f55711j0;
                ArrayList arrayList3 = zVar.H;
                int i17 = zVar.f55722s0;
                if (i14 == zVar.T && (i13 <= 0 || i13 == zVar.f55704d0)) {
                    zVar.D0--;
                    if (tL_error == null) {
                        zVar.f55701b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        is.a0(i17).m1(messages_messages.users, messages_messages.chats, true, true);
                        wp.r1(i17).V3(messages_messages.users, false);
                        wp.r1(i17).P3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList3.clear();
                        }
                        zVar.f55703c0 = messages_messages.next_rate;
                        for (int i18 = 0; i18 < messages_messages.messages.size(); i18++) {
                            TLRPC.Message message = messages_messages.messages.get(i18);
                            int i19 = wp.r1(i17).T.get(kj.B0(message));
                            if (i19 == 0 || message.f19815id > i19) {
                                arrayList3.add((kj) arrayList.get(i18));
                            }
                        }
                        zVar.N = true;
                        if (messages_messages.messages.size() != 20) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zVar.X = z10;
                        if (i13 > 0) {
                            zVar.f55708g0 = i13;
                            if (zVar.f55707f0 != i13) {
                                zVar.f55721s.clear();
                            }
                            if (zVar.f55705e0 != i13) {
                                tVar.b();
                            }
                        }
                        tVar.f(zVar.f55721s, zVar.f55725v0);
                        org.telegram.ui.lx lxVar = zVar.U;
                        if (lxVar != null) {
                            if (zVar.D0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            lxVar.d(z11, true);
                            zVar.U.c();
                        }
                        zVar.f();
                    }
                }
                zVar.Q = 0;
                return;
            default:
                zf.z zVar2 = (zf.z) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                zf.t tVar2 = zVar2.f55711j0;
                ArrayList arrayList4 = zVar2.I;
                ArrayList arrayList5 = zVar2.H;
                int i20 = zVar2.f55722s0;
                if (i14 == zVar2.P && (i13 <= 0 || i13 == zVar2.f55704d0)) {
                    zVar2.D0--;
                    if (tL_error2 == null) {
                        zVar2.f55701b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        is.a0(i20).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        wp.r1(i20).V3(messages_messages2.users, false);
                        wp.r1(i20).P3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList4.clear();
                        }
                        zVar2.f55703c0 = messages_messages2.next_rate;
                        int i21 = 0;
                        while (i21 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i21);
                            int i22 = wp.r1(i20).T.get(kj.B0(message2));
                            if (i22 == 0 || message2.f19815id > i22) {
                                kj kjVar = (kj) arrayList.get(i21);
                                if (!arrayList5.isEmpty()) {
                                    for (int i23 = i15; i23 < arrayList5.size(); i23++) {
                                        kj kjVar2 = (kj) arrayList5.get(i23);
                                        if (kjVar2 == null || kjVar == null || kjVar.f1() != kjVar2.f1() || kj.B0(kjVar.f16690k) != kj.B0(kjVar2.f16690k)) {
                                        }
                                    }
                                }
                                arrayList4.add(kjVar);
                                long B0 = kj.B0(message2);
                                if (message2.out) {
                                    concurrentHashMap = wp.r1(i20).P;
                                } else {
                                    concurrentHashMap = wp.r1(i20).O;
                                }
                                Integer num = (Integer) concurrentHashMap.get(Long.valueOf(B0));
                                if (num != null) {
                                    if (num.intValue() < message2.f19815id) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    message2.unread = z14;
                                }
                            }
                            i21++;
                            z15 = true;
                            i15 = 0;
                        }
                        zVar2.N = z15;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zVar2.W = z12;
                        if (i13 > 0) {
                            zVar2.f55708g0 = i13;
                            if (zVar2.f55707f0 != i13) {
                                zVar2.f55721s.clear();
                            }
                            if (zVar2.f55705e0 != i13) {
                                tVar2.b();
                            }
                        }
                        tVar2.f(zVar2.f55721s, zVar2.f55725v0);
                        org.telegram.ui.lx lxVar2 = zVar2.U;
                        if (lxVar2 != null) {
                            if (zVar2.D0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i11 = 1;
                            lxVar2.d(z13, true);
                            zVar2.U.c();
                        } else {
                            i11 = 1;
                        }
                        zVar2.G0 = i11;
                        zVar2.H0 = i11;
                        i10 = 0;
                        zVar2.d = false;
                        s71 s71Var = zVar2.E0;
                        if (s71Var != null) {
                            Object[] objArr = new Object[i11];
                            objArr[0] = zVar2.Z;
                            ((TextView) s71Var.f41280b).setText(dd.a0(null, null, 2131745767, objArr));
                        }
                        zVar2.f();
                        zVar2.O = i10;
                        return;
                    }
                }
                i10 = 0;
                zVar2.O = i10;
                return;
        }
    }

    public cg(zf.z zVar, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.f15143a = i12;
        this.f15146f = zVar;
        this.f15144b = i10;
        this.f15145c = i11;
        this.h = tL_error;
        this.f15147n = str;
        this.d = tLObject;
        this.f15148r = tLMethod;
        this.e = arrayList;
    }
}
