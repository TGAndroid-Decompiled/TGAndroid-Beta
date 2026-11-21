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
public final class pv {
    public final int f26321a;
    public boolean f26322b;
    public boolean d;
    public boolean f26324e;
    public boolean f26325f;
    public int f26326g;
    public int h;
    public boolean f26329k;
    public boolean f26330l;
    public boolean f26331m;
    public boolean f26333o;
    public final ArrayList f26323c = new ArrayList();
    public final ArrayList f26327i = new ArrayList();
    public final ArrayList f26328j = new ArrayList();
    public final nv f26332n = new nv(this, 4);
    public final a0.h f26334p = new a0.h();

    public pv(int i7) {
        this.f26321a = i7;
        this.f26322b = mp.u1(i7).h7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ov ovVar = (ov) arrayList.get(i7);
            if (ovVar.f26133b) {
                arrayList2.add(Long.valueOf(ovVar.f26132a));
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
        bundle.putLong("user_id", j10.i(Q.getCurrentAccount()).e());
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
            ov ovVar = (ov) arrayList.get(i7);
            if (ovVar.f26133b) {
                ovVar.f26133b = false;
                arrayList3.add(ovVar);
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            ov ovVar2 = (ov) arrayList.get(i10);
            int indexOf = arrayList2.indexOf(Long.valueOf(ovVar2.f26132a));
            if (indexOf >= 0) {
                ovVar2.f26140k = indexOf;
                ovVar2.f26133b = true;
                arrayList4.add(ovVar2);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new dl(14));
        Collections.sort(arrayList4, new dl(15));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.f26323c.clear();
        this.f26327i.clear();
        this.f26324e = false;
        this.f26326g = 0;
        this.h = 0;
        this.f26325f = false;
        this.f26330l = true;
        boolean z10 = this.f26333o;
        int i7 = this.f26321a;
        if (!z10) {
            this.f26333o = true;
            tr a02 = tr.a0(i7);
            a02.f27080a.c(new rq(this, a02));
        }
        this.f26322b = true;
        mp.u1(i7).h7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.f26326g = 0;
        this.f26328j.clear();
        this.f26327i.clear();
        this.f26323c.clear();
        l();
    }

    public final int c() {
        if (this.f26325f) {
            return this.f26328j.size();
        }
        if (this.f26324e) {
            return this.f26326g - this.h;
        }
        return this.f26323c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e10 = j10.i(this.f26321a).e();
        ArrayList arrayList = this.f26328j;
        if (arrayList.size() == 1 && ((ov) arrayList.get(0)).f26132a == e10) {
            return false;
        }
        return true;
    }

    public final void f(long j3, x10 x10Var) {
        ov ovVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f26328j;
            if (i7 < arrayList.size()) {
                ovVar = (ov) arrayList.get(i7);
                if (ovVar.f26132a == j3) {
                    break;
                }
                i7++;
            } else {
                ovVar = null;
                break;
            }
        }
        if (ovVar != null && ovVar.f26135e > 0 && ovVar.f26138i) {
            if (x10Var != null) {
                x10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.f26334p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j3);
        if (arrayList2 != null) {
            if (x10Var != null) {
                arrayList2.add(x10Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (x10Var != null) {
            arrayList3.add(x10Var);
        }
        hVar.k(arrayList3, j3);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i10 = this.f26321a;
        tL_messages_getSavedHistory.peer = mp.u1(i10).l1(j3);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedHistory, new x4(this, j3, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        ov ovVar;
        long j3;
        this.f26331m = z10;
        if (!this.d && !this.f26325f && !(z11 = this.f26329k)) {
            boolean z12 = this.f26330l;
            int i7 = this.f26321a;
            if (!z12) {
                nv nvVar = new nv(this, 0);
                if (!z11) {
                    this.f26329k = true;
                    long e10 = j10.i(i7).e();
                    tr a02 = tr.a0(i7);
                    a02.f27080a.c(new fm(this, a02, e10, nvVar, 18));
                }
            } else if (!z10) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.f26327i;
                if (arrayList.isEmpty()) {
                    ovVar = null;
                } else {
                    ovVar = (ov) i5.c.h(1, arrayList);
                }
                if (ovVar != null) {
                    tL_messages_getSavedDialogs.offset_id = ovVar.f26134c;
                    tL_messages_getSavedDialogs.offset_date = ovVar.c();
                    tL_messages_getSavedDialogs.offset_peer = mp.u1(i7).l1(ovVar.f26132a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.f26328j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ov ovVar2 = (ov) arrayList2.get(i10);
                    long j10 = tL_messages_getSavedDialogs.hash;
                    if (ovVar2.f26133b) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    long r10 = ri.r(j10, j3);
                    tL_messages_getSavedDialogs.hash = r10;
                    long r11 = ri.r(r10, Math.abs(ovVar2.f26132a));
                    tL_messages_getSavedDialogs.hash = r11;
                    long r12 = ri.r(r11, ovVar2.f26134c);
                    tL_messages_getSavedDialogs.hash = r12;
                    tL_messages_getSavedDialogs.hash = ri.r(r12, ovVar2.c());
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
            boolean o10 = o(this.f26327i, arrayList2);
            boolean o11 = o(this.f26323c, arrayList2);
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
            ArrayList arrayList = this.f26328j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((ov) arrayList.get(i10)).f26132a == j3) {
                arrayList.remove(i10);
                i11++;
                i10--;
            }
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26327i;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((ov) arrayList2.get(i12)).f26132a == j3) {
                arrayList2.remove(i12);
                i13++;
                i12--;
            }
            i12++;
        }
        while (true) {
            ArrayList arrayList3 = this.f26323c;
            if (i7 < arrayList3.size()) {
                if (((ov) arrayList3.get(i7)).f26132a == j3) {
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
        nv nvVar = this.f26332n;
        g0.r(nvVar);
        g0.h3(nvVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f26328j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            arrayList = this.f26323c;
            if (i7 >= arrayList.size()) {
                break;
            }
            ov ovVar = (ov) arrayList.get(i7);
            if (ovVar.f26133b && !hashSet.contains(Long.valueOf(ovVar.f26132a)) && !ovVar.d()) {
                arrayList3.add(ovVar);
                hashSet.add(Long.valueOf(ovVar.f26132a));
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList2 = this.f26327i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ov ovVar2 = (ov) arrayList2.get(i10);
            if (ovVar2.f26133b && !hashSet.contains(Long.valueOf(ovVar2.f26132a)) && !ovVar2.d()) {
                arrayList3.add(ovVar2);
                hashSet.add(Long.valueOf(ovVar2.f26132a));
            }
            i10++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ov ovVar3 = (ov) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(ovVar3.f26132a)) && !ovVar3.d()) {
                arrayList4.add(ovVar3);
                hashSet.add(Long.valueOf(ovVar3.f26132a));
            }
        }
        if (!this.f26325f) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ov ovVar4 = (ov) arrayList.get(i12);
                if (!hashSet.contains(Long.valueOf(ovVar4.f26132a)) && !ovVar4.d()) {
                    arrayList4.add(ovVar4);
                    hashSet.add(Long.valueOf(ovVar4.f26132a));
                }
            }
        }
        Collections.sort(arrayList4, new dl(16));
        arrayList3.addAll(arrayList4);
        int i13 = this.f26321a;
        ks.f(i13).k(ks.f25159i3, new Object[0]);
        if (!e() && mp.u1(i13).f25779r6) {
            mp.u1(i13).Z4(false);
        }
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        int i7;
        ArrayList d = d(this.f26328j);
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
        int i10 = this.f26321a;
        if (j10.i(i10).q()) {
            i7 = mp.u1(i10).f25769q6;
        } else {
            i7 = mp.u1(i10).f25760p6;
        }
        if (arrayList2.size() <= i7 && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o4 = o(this.f26327i, arrayList2);
            boolean o10 = o(this.f26323c, arrayList2);
            if (o4 || o10) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o4 = o(this.f26327i, arrayList);
        boolean o10 = o(this.f26323c, arrayList);
        if (!o4 && !o10) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            int i10 = this.f26321a;
            if (i7 < size) {
                long longValue = ((Long) arrayList.get(i7)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = mp.u1(i10).l1(longValue);
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
        int i13 = this.f26321a;
        long e10 = j10.i(i13).e();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i14);
            long Q1 = fj.Q1(e10, message);
            if (Q1 == e10 || (message.f28452id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(Q1);
                if (message2 == null || message2.f28452id < message.f28452id) {
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
                arrayList2 = this.f26323c;
                if (i16 < arrayList2.size()) {
                    ov ovVar = (ov) arrayList2.get(i16);
                    hVar = hVar2;
                    if (ovVar.f26132a == j3) {
                        int i17 = ovVar.f26134c;
                        int i18 = message3.f28452id;
                        if (i17 < i18 || (i18 < 0 && message3.date > ovVar.c())) {
                            if (ovVar.f26134c < message3.f28452id) {
                                int i19 = 0;
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    if (((TLRPC.Message) arrayList.get(i20)).f28452id > ovVar.f26134c) {
                                        i19++;
                                    }
                                }
                                ovVar.f26135e += i19;
                            }
                            fj fjVar = new fj(i13, message3, false, false);
                            ovVar.d = fjVar;
                            ovVar.f26134c = fjVar.e1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), ovVar.f26135e);
                        } else {
                            i11 = ovVar.f26135e;
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
                ov a10 = ov.a(i13, message3);
                if (num2 != null) {
                    a10.f26135e = num2.intValue();
                }
                arrayList2.add(a10);
                z12 = true;
            }
            int i21 = 0;
            while (true) {
                arrayList3 = this.f26327i;
                if (i21 < arrayList3.size()) {
                    ov ovVar2 = (ov) arrayList3.get(i21);
                    if (ovVar2.f26132a == j3) {
                        int i22 = ovVar2.f26134c;
                        int i23 = message3.f28452id;
                        if (i22 >= i23 && (i23 >= 0 || message3.date <= ovVar2.c())) {
                            i7 = 0;
                        } else {
                            if (ovVar2.f26134c < message3.f28452id) {
                                int i24 = 0;
                                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                                    if (((TLRPC.Message) arrayList.get(i25)).f28452id > ovVar2.f26134c) {
                                        i24++;
                                    }
                                }
                                ovVar2.f26135e += i24;
                            }
                            i7 = 0;
                            fj fjVar2 = new fj(i13, message3, false, false);
                            ovVar2.d = fjVar2;
                            ovVar2.f26134c = fjVar2.e1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i10 = Math.max(num2.intValue(), ovVar2.f26135e);
                        } else {
                            i10 = ovVar2.f26135e;
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
                ov a11 = ov.a(i13, message3);
                if (num2 != null) {
                    a11.f26135e = num2.intValue();
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
            ArrayList arrayList = this.f26328j;
            if (i10 >= arrayList.size()) {
                break;
            }
            ov ovVar = (ov) arrayList.get(i10);
            if (ovVar.f26132a == j3) {
                if (ovVar.f26135e != i7 || (!ovVar.f26138i && z10)) {
                    ovVar.f26135e = i7;
                    ovVar.f26138i = true;
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }
}
