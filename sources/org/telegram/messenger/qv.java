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
public final class qv {
    public final int f26502a;
    public boolean f26503b;
    public boolean d;
    public boolean f26505e;
    public boolean f26506f;
    public int f26507g;
    public int h;
    public boolean f26510k;
    public boolean f26511l;
    public boolean f26512m;
    public boolean f26514o;
    public final ArrayList f26504c = new ArrayList();
    public final ArrayList f26508i = new ArrayList();
    public final ArrayList f26509j = new ArrayList();
    public final ov f26513n = new ov(this, 4);
    public final a0.h f26515p = new a0.h();

    public qv(int i7) {
        this.f26502a = i7;
        this.f26503b = np.u1(i7).h7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            pv pvVar = (pv) arrayList.get(i7);
            if (pvVar.f26351b) {
                arrayList2.add(Long.valueOf(pvVar.f26350a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", k10.i(Q.getCurrentAccount()).e());
        Q.presentFragment(new org.telegram.ui.bn(bundle));
    }

    public static boolean k(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (Objects.equals(arrayList.get(i7), arrayList2.get(i7))) {
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
        int i7 = 0;
        while (i7 < arrayList.size()) {
            pv pvVar = (pv) arrayList.get(i7);
            if (pvVar.f26351b) {
                pvVar.f26351b = false;
                arrayList3.add(pvVar);
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            pv pvVar2 = (pv) arrayList.get(i10);
            int indexOf = arrayList2.indexOf(Long.valueOf(pvVar2.f26350a));
            if (indexOf >= 0) {
                pvVar2.f26358k = indexOf;
                pvVar2.f26351b = true;
                arrayList4.add(pvVar2);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new el(14));
        Collections.sort(arrayList4, new el(15));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.f26504c.clear();
        this.f26508i.clear();
        this.f26505e = false;
        this.f26507g = 0;
        this.h = 0;
        this.f26506f = false;
        this.f26511l = true;
        boolean z10 = this.f26514o;
        int i7 = this.f26502a;
        if (!z10) {
            this.f26514o = true;
            ur a02 = ur.a0(i7);
            a02.f27250a.c(new sq(this, a02));
        }
        this.f26503b = true;
        np.u1(i7).h7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.f26507g = 0;
        this.f26509j.clear();
        this.f26508i.clear();
        this.f26504c.clear();
        l();
    }

    public final int c() {
        if (this.f26506f) {
            return this.f26509j.size();
        }
        if (this.f26505e) {
            return this.f26507g - this.h;
        }
        return this.f26504c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e10 = k10.i(this.f26502a).e();
        ArrayList arrayList = this.f26509j;
        if (arrayList.size() == 1 && ((pv) arrayList.get(0)).f26350a == e10) {
            return false;
        }
        return true;
    }

    public final void f(long j3, y10 y10Var) {
        pv pvVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f26509j;
            if (i7 < arrayList.size()) {
                pvVar = (pv) arrayList.get(i7);
                if (pvVar.f26350a == j3) {
                    break;
                }
                i7++;
            } else {
                pvVar = null;
                break;
            }
        }
        if (pvVar != null && pvVar.f26353e > 0 && pvVar.f26356i) {
            if (y10Var != null) {
                y10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.f26515p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j3);
        if (arrayList2 != null) {
            if (y10Var != null) {
                arrayList2.add(y10Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (y10Var != null) {
            arrayList3.add(y10Var);
        }
        hVar.k(arrayList3, j3);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i10 = this.f26502a;
        tL_messages_getSavedHistory.peer = np.u1(i10).l1(j3);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedHistory, new x4(this, j3, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        pv pvVar;
        long j3;
        this.f26512m = z10;
        if (!this.d && !this.f26506f && !(z11 = this.f26510k)) {
            boolean z12 = this.f26511l;
            int i7 = this.f26502a;
            if (!z12) {
                ov ovVar = new ov(this, 0);
                if (!z11) {
                    this.f26510k = true;
                    long e10 = k10.i(i7).e();
                    ur a02 = ur.a0(i7);
                    a02.f27250a.c(new gm(this, a02, e10, ovVar, 18));
                }
            } else if (!z10) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.f26508i;
                if (arrayList.isEmpty()) {
                    pvVar = null;
                } else {
                    pvVar = (pv) i5.c.h(1, arrayList);
                }
                if (pvVar != null) {
                    tL_messages_getSavedDialogs.offset_id = pvVar.f26352c;
                    tL_messages_getSavedDialogs.offset_date = pvVar.c();
                    tL_messages_getSavedDialogs.offset_peer = np.u1(i7).l1(pvVar.f26350a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.f26509j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    pv pvVar2 = (pv) arrayList2.get(i10);
                    long j10 = tL_messages_getSavedDialogs.hash;
                    if (pvVar2.f26351b) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    long r10 = si.r(j10, j3);
                    tL_messages_getSavedDialogs.hash = r10;
                    long r11 = si.r(r10, Math.abs(pvVar2.f26350a));
                    tL_messages_getSavedDialogs.hash = r11;
                    long r12 = si.r(r11, pvVar2.f26352c);
                    tL_messages_getSavedDialogs.hash = r12;
                    tL_messages_getSavedDialogs.hash = si.r(r12, pvVar2.c());
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getSavedDialogs, new t4(8, this, arrayList2));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z10 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o4 = n5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(o4));
                z10 = n(arrayList, tL_updateSavedDialogPinned.pinned, false);
            }
        } else if (update instanceof TL_update.TL_updatePinnedSavedDialogs) {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList arrayList2 = new ArrayList(tL_updatePinnedSavedDialogs.order.size());
            for (int i7 = 0; i7 < tL_updatePinnedSavedDialogs.order.size(); i7++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i7);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(n5.o(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean o10 = o(this.f26508i, arrayList2);
            boolean o11 = o(this.f26504c, arrayList2);
            if (o10 || o11) {
                z10 = true;
            }
        }
        if (z10) {
            l();
        }
    }

    public final int j(long j3) {
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f26509j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((pv) arrayList.get(i10)).f26350a == j3) {
                arrayList.remove(i10);
                i11++;
                i10--;
            }
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26508i;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((pv) arrayList2.get(i12)).f26350a == j3) {
                arrayList2.remove(i12);
                i13++;
                i12--;
            }
            i12++;
        }
        while (true) {
            ArrayList arrayList3 = this.f26504c;
            if (i7 < arrayList3.size()) {
                if (((pv) arrayList3.get(i7)).f26350a == j3) {
                    arrayList3.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                return Math.max(i11, i13);
            }
        }
    }

    public final void l() {
        m();
        ov ovVar = this.f26513n;
        g0.r(ovVar);
        g0.h3(ovVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f26509j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            arrayList = this.f26504c;
            if (i7 >= arrayList.size()) {
                break;
            }
            pv pvVar = (pv) arrayList.get(i7);
            if (pvVar.f26351b && !hashSet.contains(Long.valueOf(pvVar.f26350a)) && !pvVar.d()) {
                arrayList3.add(pvVar);
                hashSet.add(Long.valueOf(pvVar.f26350a));
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList2 = this.f26508i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            pv pvVar2 = (pv) arrayList2.get(i10);
            if (pvVar2.f26351b && !hashSet.contains(Long.valueOf(pvVar2.f26350a)) && !pvVar2.d()) {
                arrayList3.add(pvVar2);
                hashSet.add(Long.valueOf(pvVar2.f26350a));
            }
            i10++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            pv pvVar3 = (pv) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(pvVar3.f26350a)) && !pvVar3.d()) {
                arrayList4.add(pvVar3);
                hashSet.add(Long.valueOf(pvVar3.f26350a));
            }
        }
        if (!this.f26506f) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                pv pvVar4 = (pv) arrayList.get(i12);
                if (!hashSet.contains(Long.valueOf(pvVar4.f26350a)) && !pvVar4.d()) {
                    arrayList4.add(pvVar4);
                    hashSet.add(Long.valueOf(pvVar4.f26350a));
                }
            }
        }
        Collections.sort(arrayList4, new el(16));
        arrayList3.addAll(arrayList4);
        int i13 = this.f26502a;
        ls.f(i13).k(ls.f25325i3, new Object[0]);
        if (!e() && np.u1(i13).f25950r6) {
            np.u1(i13).Z4(false);
        }
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        int i7;
        ArrayList d = d(this.f26509j);
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
        int i10 = this.f26502a;
        if (k10.i(i10).q()) {
            i7 = np.u1(i10).f25940q6;
        } else {
            i7 = np.u1(i10).f25931p6;
        }
        if (arrayList2.size() <= i7 && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o4 = o(this.f26508i, arrayList2);
            boolean o10 = o(this.f26504c, arrayList2);
            if (o4 || o10) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o4 = o(this.f26508i, arrayList);
        boolean o10 = o(this.f26504c, arrayList);
        if (!o4 && !o10) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            int i10 = this.f26502a;
            if (i7 < size) {
                long longValue = ((Long) arrayList.get(i7)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = np.u1(i10).l1(longValue);
                tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                i7++;
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
        int i7;
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
        int i13 = this.f26502a;
        long e10 = k10.i(i13).e();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i14);
            long Q1 = gj.Q1(e10, message);
            if (Q1 == e10 || (message.f28455id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(Q1);
                if (message2 == null || message2.f28455id < message.f28455id) {
                    hVar2.k(message, Q1);
                }
                Integer num = (Integer) hVar3.f(Q1);
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                hVar3.k(Integer.valueOf(intValue + 1), Q1);
            }
        }
        int i15 = 0;
        boolean z12 = false;
        while (i15 < hVar2.m()) {
            long j3 = hVar2.j(i15);
            TLRPC.Message message3 = (TLRPC.Message) hVar2.n(i15);
            Integer num2 = (Integer) hVar3.f(j3);
            int i16 = i12;
            while (true) {
                arrayList2 = this.f26504c;
                if (i16 < arrayList2.size()) {
                    pv pvVar = (pv) arrayList2.get(i16);
                    hVar = hVar2;
                    if (pvVar.f26350a == j3) {
                        int i17 = pvVar.f26352c;
                        int i18 = message3.f28455id;
                        if (i17 < i18 || (i18 < 0 && message3.date > pvVar.c())) {
                            if (pvVar.f26352c < message3.f28455id) {
                                int i19 = 0;
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    if (((TLRPC.Message) arrayList.get(i20)).f28455id > pvVar.f26352c) {
                                        i19++;
                                    }
                                }
                                pvVar.f26353e += i19;
                            }
                            gj gjVar = new gj(i13, message3, false, false);
                            pvVar.d = gjVar;
                            pvVar.f26352c = gjVar.e1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), pvVar.f26353e);
                        } else {
                            i11 = pvVar.f26353e;
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
                pv a10 = pv.a(i13, message3);
                if (num2 != null) {
                    a10.f26353e = num2.intValue();
                }
                arrayList2.add(a10);
                z12 = true;
            }
            int i21 = 0;
            while (true) {
                arrayList3 = this.f26508i;
                if (i21 < arrayList3.size()) {
                    pv pvVar2 = (pv) arrayList3.get(i21);
                    if (pvVar2.f26350a == j3) {
                        int i22 = pvVar2.f26352c;
                        int i23 = message3.f28455id;
                        if (i22 >= i23 && (i23 >= 0 || message3.date <= pvVar2.c())) {
                            i7 = 0;
                        } else {
                            if (pvVar2.f26352c < message3.f28455id) {
                                int i24 = 0;
                                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                                    if (((TLRPC.Message) arrayList.get(i25)).f28455id > pvVar2.f26352c) {
                                        i24++;
                                    }
                                }
                                pvVar2.f26353e += i24;
                            }
                            i7 = 0;
                            gj gjVar2 = new gj(i13, message3, false, false);
                            pvVar2.d = gjVar2;
                            pvVar2.f26352c = gjVar2.e1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i10 = Math.max(num2.intValue(), pvVar2.f26353e);
                        } else {
                            i10 = pvVar2.f26353e;
                        }
                        num2 = Integer.valueOf(i10);
                        z11 = true;
                    } else {
                        i21++;
                    }
                } else {
                    i7 = 0;
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                pv a11 = pv.a(i13, message3);
                if (num2 != null) {
                    a11.f26353e = num2.intValue();
                }
                arrayList3.add(a11);
                z12 = true;
            }
            i15++;
            i12 = i7;
            hVar2 = hVar;
        }
        return z12;
    }

    public final boolean r(int i7, long j3, boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26509j;
            if (i10 >= arrayList.size()) {
                break;
            }
            pv pvVar = (pv) arrayList.get(i10);
            if (pvVar.f26350a == j3) {
                if (pvVar.f26353e != i7 || (!pvVar.f26356i && z10)) {
                    pvVar.f26353e = i7;
                    pvVar.f26356i = true;
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }
}
