package org.telegram.messenger;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
public final class nv {
    public final int f24434a;
    public boolean f24435b;
    public boolean d;
    public boolean f24437e;
    public boolean f24438f;
    public int f24439g;
    public int h;
    public boolean f24442k;
    public boolean f24443l;
    public boolean f24444m;
    public boolean f24446o;
    public final ArrayList f24436c = new ArrayList();
    public final ArrayList f24440i = new ArrayList();
    public final ArrayList f24441j = new ArrayList();
    public final lv f24445n = new lv(this, 4);
    public final a0.h f24447p = new a0.h();

    public nv(int i3) {
        this.f24434a = i3;
        this.f24435b = hp.s1(i3).f22999e7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mv mvVar = (mv) arrayList.get(i3);
            if (mvVar.f24265b) {
                arrayList2.add(Long.valueOf(mvVar.f24264a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", h10.i(Q.getCurrentAccount()).e());
        Q.presentFragment(new org.telegram.ui.wm(bundle));
    }

    public static boolean k(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (Objects.equals(arrayList.get(i3), arrayList2.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean o(ArrayList arrayList, ArrayList arrayList2) {
        if (k(arrayList2, d(arrayList))) {
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            mv mvVar = (mv) arrayList.get(i3);
            if (mvVar.f24265b) {
                mvVar.f24265b = false;
                arrayList3.add(mvVar);
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            mv mvVar2 = (mv) arrayList.get(i10);
            int indexOf = arrayList2.indexOf(Long.valueOf(mvVar2.f24264a));
            if (indexOf >= 0) {
                mvVar2.f24272k = indexOf;
                mvVar2.f24265b = true;
                arrayList4.add(mvVar2);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new tq(5));
        Collections.sort(arrayList4, new tq(6));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.f24436c.clear();
        this.f24440i.clear();
        this.f24437e = false;
        this.f24439g = 0;
        this.h = 0;
        this.f24438f = false;
        this.f24443l = true;
        boolean z10 = this.f24446o;
        int i3 = this.f24434a;
        if (!z10) {
            this.f24446o = true;
            qr a02 = qr.a0(i3);
            a02.f24934a.c(new pq(this, a02));
        }
        this.f24435b = true;
        hp.s1(i3).f22999e7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.f24439g = 0;
        this.f24441j.clear();
        this.f24440i.clear();
        this.f24436c.clear();
        l();
    }

    public final int c() {
        if (this.f24438f) {
            return this.f24441j.size();
        }
        if (this.f24437e) {
            return this.f24439g - this.h;
        }
        return this.f24436c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e10 = h10.i(this.f24434a).e();
        ArrayList arrayList = this.f24441j;
        if (arrayList.size() == 1 && ((mv) arrayList.get(0)).f24264a == e10) {
            return false;
        }
        return true;
    }

    public final void f(long j10, u10 u10Var) {
        mv mvVar;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f24441j;
            if (i3 < arrayList.size()) {
                mvVar = (mv) arrayList.get(i3);
                if (mvVar.f24264a == j10) {
                    break;
                }
                i3++;
            } else {
                mvVar = null;
                break;
            }
        }
        if (mvVar != null && mvVar.f24267e > 0 && mvVar.f24270i) {
            if (u10Var != null) {
                u10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.f24447p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
        if (arrayList2 != null) {
            if (u10Var != null) {
                arrayList2.add(u10Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (u10Var != null) {
            arrayList3.add(u10Var);
        }
        hVar.k(arrayList3, j10);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i10 = this.f24434a;
        tL_messages_getSavedHistory.peer = hp.s1(i10).j1(j10);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedHistory, new p4(this, j10, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        mv mvVar;
        long j10;
        this.f24444m = z10;
        if (!this.d && !this.f24438f && !(z11 = this.f24442k)) {
            boolean z12 = this.f24443l;
            int i3 = this.f24434a;
            if (!z12) {
                lv lvVar = new lv(this, 0);
                if (!z11) {
                    this.f24442k = true;
                    long e10 = h10.i(i3).e();
                    qr a02 = qr.a0(i3);
                    a02.f24934a.c(new zl(this, a02, e10, lvVar, 18));
                }
            } else if (!z10) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.f24440i;
                if (arrayList.isEmpty()) {
                    mvVar = null;
                } else {
                    mvVar = (mv) k2.p1.h(1, arrayList);
                }
                if (mvVar != null) {
                    tL_messages_getSavedDialogs.offset_id = mvVar.f24266c;
                    tL_messages_getSavedDialogs.offset_date = mvVar.c();
                    tL_messages_getSavedDialogs.offset_peer = hp.s1(i3).j1(mvVar.f24264a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.f24441j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    mv mvVar2 = (mv) arrayList2.get(i10);
                    long j11 = tL_messages_getSavedDialogs.hash;
                    if (mvVar2.f24265b) {
                        j10 = 1;
                    } else {
                        j10 = 0;
                    }
                    long p10 = li.p(j11, j10);
                    tL_messages_getSavedDialogs.hash = p10;
                    long p11 = li.p(p10, Math.abs(mvVar2.f24264a));
                    tL_messages_getSavedDialogs.hash = p11;
                    long p12 = li.p(p11, mvVar2.f24266c);
                    tL_messages_getSavedDialogs.hash = p12;
                    tL_messages_getSavedDialogs.hash = li.p(p12, mvVar2.c());
                }
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getSavedDialogs, new s4(8, this, arrayList2));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z10 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o10 = m5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(o10));
                z10 = n(arrayList, tL_updateSavedDialogPinned.pinned, false);
            }
        } else if (update instanceof TL_update.TL_updatePinnedSavedDialogs) {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList arrayList2 = new ArrayList(tL_updatePinnedSavedDialogs.order.size());
            for (int i3 = 0; i3 < tL_updatePinnedSavedDialogs.order.size(); i3++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i3);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(m5.o(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean o11 = o(this.f24440i, arrayList2);
            boolean o12 = o(this.f24436c, arrayList2);
            if (o11 || o12) {
                z10 = true;
            }
        }
        if (z10) {
            l();
        }
    }

    public final int j(long j10) {
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f24441j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((mv) arrayList.get(i10)).f24264a == j10) {
                arrayList.remove(i10);
                i11++;
                i10--;
            }
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f24440i;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((mv) arrayList2.get(i12)).f24264a == j10) {
                arrayList2.remove(i12);
                i13++;
                i12--;
            }
            i12++;
        }
        while (true) {
            ArrayList arrayList3 = this.f24436c;
            if (i3 < arrayList3.size()) {
                if (((mv) arrayList3.get(i3)).f24264a == j10) {
                    arrayList3.remove(i3);
                    i3--;
                }
                i3++;
            } else {
                return Math.max(i11, i13);
            }
        }
    }

    public final void l() {
        m();
        lv lvVar = this.f24445n;
        g0.r(lvVar);
        g0.i3(lvVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f24441j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            arrayList = this.f24436c;
            if (i3 >= arrayList.size()) {
                break;
            }
            mv mvVar = (mv) arrayList.get(i3);
            if (mvVar.f24265b && !hashSet.contains(Long.valueOf(mvVar.f24264a)) && !mvVar.d()) {
                arrayList3.add(mvVar);
                hashSet.add(Long.valueOf(mvVar.f24264a));
            }
            i3++;
        }
        int i10 = 0;
        while (true) {
            arrayList2 = this.f24440i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            mv mvVar2 = (mv) arrayList2.get(i10);
            if (mvVar2.f24265b && !hashSet.contains(Long.valueOf(mvVar2.f24264a)) && !mvVar2.d()) {
                arrayList3.add(mvVar2);
                hashSet.add(Long.valueOf(mvVar2.f24264a));
            }
            i10++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            mv mvVar3 = (mv) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(mvVar3.f24264a)) && !mvVar3.d()) {
                arrayList4.add(mvVar3);
                hashSet.add(Long.valueOf(mvVar3.f24264a));
            }
        }
        if (!this.f24438f) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                mv mvVar4 = (mv) arrayList.get(i12);
                if (!hashSet.contains(Long.valueOf(mvVar4.f24264a)) && !mvVar4.d()) {
                    arrayList4.add(mvVar4);
                    hashSet.add(Long.valueOf(mvVar4.f24264a));
                }
            }
        }
        Collections.sort(arrayList4, new tq(7));
        arrayList3.addAll(arrayList4);
        int i13 = this.f24434a;
        hs.f(i13).k(hs.f23234g3, new Object[0]);
        if (!e() && hp.s1(i13).f23083o6) {
            hp.s1(i13).N4(false);
        }
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        int i3;
        ArrayList d = d(this.f24441j);
        ArrayList arrayList2 = new ArrayList(d);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l10 = (Long) arrayList.get(size);
            l10.getClass();
            if (z10 && !arrayList2.contains(l10)) {
                arrayList2.add(0, l10);
            } else if (!z10) {
                arrayList2.remove(l10);
            }
        }
        int i10 = this.f24434a;
        if (h10.i(i10).q()) {
            i3 = hp.s1(i10).f23074n6;
        } else {
            i3 = hp.s1(i10).f23065m6;
        }
        if (arrayList2.size() <= i3 && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o10 = o(this.f24440i, arrayList2);
            boolean o11 = o(this.f24436c, arrayList2);
            if (o10 || o11) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o10 = o(this.f24440i, arrayList);
        boolean o11 = o(this.f24436c, arrayList);
        if (!o10 && !o11) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i3 = 0;
        while (true) {
            int size = arrayList.size();
            int i10 = this.f24434a;
            if (i3 < size) {
                long longValue = ((Long) arrayList.get(i3)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = hp.s1(i10).j1(longValue);
                tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                i3++;
            } else {
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
                l();
                return;
            }
        }
    }

    public final boolean q(ArrayList arrayList) {
        ArrayList arrayList2;
        a0.h hVar;
        boolean z10;
        ArrayList arrayList3;
        int i3;
        boolean z11;
        int i10;
        int i11;
        int intValue;
        int i12 = 0;
        if (arrayList == null) {
            return false;
        }
        a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        new HashSet();
        int i13 = this.f24434a;
        long e10 = h10.i(i13).e();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i14);
            long R1 = zi.R1(e10, message);
            if (R1 == e10 || (message.f27022id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(R1);
                if (message2 == null || message2.f27022id < message.f27022id) {
                    hVar2.k(message, R1);
                }
                Integer num = (Integer) hVar3.f(R1);
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                hVar3.k(Integer.valueOf(intValue + 1), R1);
            }
        }
        int i15 = 0;
        boolean z12 = false;
        while (i15 < hVar2.m()) {
            long j10 = hVar2.j(i15);
            TLRPC.Message message3 = (TLRPC.Message) hVar2.n(i15);
            Integer num2 = (Integer) hVar3.f(j10);
            int i16 = i12;
            while (true) {
                arrayList2 = this.f24436c;
                if (i16 < arrayList2.size()) {
                    mv mvVar = (mv) arrayList2.get(i16);
                    hVar = hVar2;
                    if (mvVar.f24264a == j10) {
                        int i17 = mvVar.f24266c;
                        int i18 = message3.f27022id;
                        if (i17 < i18 || (i18 < 0 && message3.date > mvVar.c())) {
                            if (mvVar.f24266c < message3.f27022id) {
                                int i19 = 0;
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    if (((TLRPC.Message) arrayList.get(i20)).f27022id > mvVar.f24266c) {
                                        i19++;
                                    }
                                }
                                mvVar.f24267e += i19;
                            }
                            zi ziVar = new zi(i13, message3, false, false);
                            mvVar.d = ziVar;
                            mvVar.f24266c = ziVar.f1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), mvVar.f24267e);
                        } else {
                            i11 = mvVar.f24267e;
                        }
                        num2 = Integer.valueOf(i11);
                        z10 = true;
                    } else {
                        i16++;
                        hVar2 = hVar;
                    }
                } else {
                    hVar = hVar2;
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                mv a10 = mv.a(i13, message3);
                if (num2 != null) {
                    a10.f24267e = num2.intValue();
                }
                arrayList2.add(a10);
                z12 = true;
            }
            int i21 = 0;
            while (true) {
                arrayList3 = this.f24440i;
                if (i21 < arrayList3.size()) {
                    mv mvVar2 = (mv) arrayList3.get(i21);
                    if (mvVar2.f24264a == j10) {
                        int i22 = mvVar2.f24266c;
                        int i23 = message3.f27022id;
                        if (i22 >= i23 && (i23 >= 0 || message3.date <= mvVar2.c())) {
                            i3 = 0;
                        } else {
                            if (mvVar2.f24266c < message3.f27022id) {
                                int i24 = 0;
                                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                                    if (((TLRPC.Message) arrayList.get(i25)).f27022id > mvVar2.f24266c) {
                                        i24++;
                                    }
                                }
                                mvVar2.f24267e += i24;
                            }
                            i3 = 0;
                            zi ziVar2 = new zi(i13, message3, false, false);
                            mvVar2.d = ziVar2;
                            mvVar2.f24266c = ziVar2.f1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i10 = Math.max(num2.intValue(), mvVar2.f24267e);
                        } else {
                            i10 = mvVar2.f24267e;
                        }
                        num2 = Integer.valueOf(i10);
                        z11 = true;
                    } else {
                        i21++;
                    }
                } else {
                    i3 = 0;
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                mv a11 = mv.a(i13, message3);
                if (num2 != null) {
                    a11.f24267e = num2.intValue();
                }
                arrayList3.add(a11);
                z12 = true;
            }
            i15++;
            i12 = i3;
            hVar2 = hVar;
        }
        return z12;
    }

    public final boolean r(int i3, long j10, boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24441j;
            if (i10 >= arrayList.size()) {
                break;
            }
            mv mvVar = (mv) arrayList.get(i10);
            if (mvVar.f24264a == j10) {
                if (mvVar.f24267e != i3 || (!mvVar.f24270i && z10)) {
                    mvVar.f24267e = i3;
                    mvVar.f24270i = true;
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }
}
