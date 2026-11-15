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
public final class tv {
    public final int f26735a;
    public boolean f26736b;
    public boolean d;
    public boolean f26738e;
    public boolean f26739f;
    public int f26740g;
    public int h;
    public boolean f26743k;
    public boolean f26744l;
    public boolean f26745m;
    public boolean f26747o;
    public final ArrayList f26737c = new ArrayList();
    public final ArrayList f26741i = new ArrayList();
    public final ArrayList f26742j = new ArrayList();
    public final rv f26746n = new rv(this, 4);
    public final a0.h f26748p = new a0.h();

    public tv(int i7) {
        this.f26735a = i7;
        this.f26736b = np.s1(i7).f25283f7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            sv svVar = (sv) arrayList.get(i7);
            if (svVar.f26579b) {
                arrayList2.add(Long.valueOf(svVar.f26578a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", m10.i(Q.getCurrentAccount()).e());
        Q.presentFragment(new org.telegram.ui.an(bundle));
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
            sv svVar = (sv) arrayList.get(i7);
            if (svVar.f26579b) {
                svVar.f26579b = false;
                arrayList3.add(svVar);
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            sv svVar2 = (sv) arrayList.get(i10);
            int indexOf = arrayList2.indexOf(Long.valueOf(svVar2.f26578a));
            if (indexOf >= 0) {
                svVar2.f26586k = indexOf;
                svVar2.f26579b = true;
                arrayList4.add(svVar2);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new gl(14));
        Collections.sort(arrayList4, new gl(15));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.f26737c.clear();
        this.f26741i.clear();
        this.f26738e = false;
        this.f26740g = 0;
        this.h = 0;
        this.f26739f = false;
        this.f26744l = true;
        boolean z10 = this.f26747o;
        int i7 = this.f26735a;
        if (!z10) {
            this.f26747o = true;
            vr a02 = vr.a0(i7);
            a02.f27219a.c(new pq(this, a02));
        }
        this.f26736b = true;
        np.s1(i7).f25283f7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.f26740g = 0;
        this.f26742j.clear();
        this.f26741i.clear();
        this.f26737c.clear();
        l();
    }

    public final int c() {
        if (this.f26739f) {
            return this.f26742j.size();
        }
        if (this.f26738e) {
            return this.f26740g - this.h;
        }
        return this.f26737c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e10 = m10.i(this.f26735a).e();
        ArrayList arrayList = this.f26742j;
        if (arrayList.size() == 1 && ((sv) arrayList.get(0)).f26578a == e10) {
            return false;
        }
        return true;
    }

    public final void f(long j3, z10 z10Var) {
        sv svVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f26742j;
            if (i7 < arrayList.size()) {
                svVar = (sv) arrayList.get(i7);
                if (svVar.f26578a == j3) {
                    break;
                }
                i7++;
            } else {
                svVar = null;
                break;
            }
        }
        if (svVar != null && svVar.f26581e > 0 && svVar.f26584i) {
            if (z10Var != null) {
                z10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.f26748p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j3);
        if (arrayList2 != null) {
            if (z10Var != null) {
                arrayList2.add(z10Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (z10Var != null) {
            arrayList3.add(z10Var);
        }
        hVar.k(arrayList3, j3);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i10 = this.f26735a;
        tL_messages_getSavedHistory.peer = np.s1(i10).j1(j3);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedHistory, new v4(this, j3, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        sv svVar;
        long j3;
        this.f26745m = z10;
        if (!this.d && !this.f26739f && !(z11 = this.f26743k)) {
            boolean z12 = this.f26744l;
            int i7 = this.f26735a;
            if (!z12) {
                rv rvVar = new rv(this, 0);
                if (!z11) {
                    this.f26743k = true;
                    long e10 = m10.i(i7).e();
                    vr a02 = vr.a0(i7);
                    a02.f27219a.c(new gm(this, a02, e10, rvVar, 18));
                }
            } else if (!z10) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.f26741i;
                if (arrayList.isEmpty()) {
                    svVar = null;
                } else {
                    svVar = (sv) i5.c.h(1, arrayList);
                }
                if (svVar != null) {
                    tL_messages_getSavedDialogs.offset_id = svVar.f26580c;
                    tL_messages_getSavedDialogs.offset_date = svVar.c();
                    tL_messages_getSavedDialogs.offset_peer = np.s1(i7).j1(svVar.f26578a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.f26742j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    sv svVar2 = (sv) arrayList2.get(i10);
                    long j10 = tL_messages_getSavedDialogs.hash;
                    if (svVar2.f26579b) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    long p10 = si.p(j10, j3);
                    tL_messages_getSavedDialogs.hash = p10;
                    long p11 = si.p(p10, Math.abs(svVar2.f26578a));
                    tL_messages_getSavedDialogs.hash = p11;
                    long p12 = si.p(p11, svVar2.f26580c);
                    tL_messages_getSavedDialogs.hash = p12;
                    tL_messages_getSavedDialogs.hash = si.p(p12, svVar2.c());
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getSavedDialogs, new r4(8, this, arrayList2));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z10 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o4 = m5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
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
                    arrayList2.add(Long.valueOf(m5.o(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean o10 = o(this.f26741i, arrayList2);
            boolean o11 = o(this.f26737c, arrayList2);
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
            ArrayList arrayList = this.f26742j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((sv) arrayList.get(i10)).f26578a == j3) {
                arrayList.remove(i10);
                i11++;
                i10--;
            }
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26741i;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((sv) arrayList2.get(i12)).f26578a == j3) {
                arrayList2.remove(i12);
                i13++;
                i12--;
            }
            i12++;
        }
        while (true) {
            ArrayList arrayList3 = this.f26737c;
            if (i7 < arrayList3.size()) {
                if (((sv) arrayList3.get(i7)).f26578a == j3) {
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
        rv rvVar = this.f26746n;
        g0.r(rvVar);
        g0.i3(rvVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f26742j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            arrayList = this.f26737c;
            if (i7 >= arrayList.size()) {
                break;
            }
            sv svVar = (sv) arrayList.get(i7);
            if (svVar.f26579b && !hashSet.contains(Long.valueOf(svVar.f26578a)) && !svVar.d()) {
                arrayList3.add(svVar);
                hashSet.add(Long.valueOf(svVar.f26578a));
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList2 = this.f26741i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            sv svVar2 = (sv) arrayList2.get(i10);
            if (svVar2.f26579b && !hashSet.contains(Long.valueOf(svVar2.f26578a)) && !svVar2.d()) {
                arrayList3.add(svVar2);
                hashSet.add(Long.valueOf(svVar2.f26578a));
            }
            i10++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            sv svVar3 = (sv) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(svVar3.f26578a)) && !svVar3.d()) {
                arrayList4.add(svVar3);
                hashSet.add(Long.valueOf(svVar3.f26578a));
            }
        }
        if (!this.f26739f) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                sv svVar4 = (sv) arrayList.get(i12);
                if (!hashSet.contains(Long.valueOf(svVar4.f26578a)) && !svVar4.d()) {
                    arrayList4.add(svVar4);
                    hashSet.add(Long.valueOf(svVar4.f26578a));
                }
            }
        }
        Collections.sort(arrayList4, new gl(16));
        arrayList3.addAll(arrayList4);
        int i13 = this.f26735a;
        ns.f(i13).k(ns.f25502g3, new Object[0]);
        if (!e() && np.s1(i13).f25366p6) {
            np.s1(i13).O4(false);
        }
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        int i7;
        ArrayList d = d(this.f26742j);
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
        int i10 = this.f26735a;
        if (m10.i(i10).q()) {
            i7 = np.s1(i10).f25357o6;
        } else {
            i7 = np.s1(i10).f25349n6;
        }
        if (arrayList2.size() <= i7 && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o4 = o(this.f26741i, arrayList2);
            boolean o10 = o(this.f26737c, arrayList2);
            if (o4 || o10) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o4 = o(this.f26741i, arrayList);
        boolean o10 = o(this.f26737c, arrayList);
        if (!o4 && !o10) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            int i10 = this.f26735a;
            if (i7 < size) {
                long longValue = ((Long) arrayList.get(i7)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = np.s1(i10).j1(longValue);
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
        int i13 = this.f26735a;
        long e10 = m10.i(i13).e();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i14);
            long Q1 = gj.Q1(e10, message);
            if (Q1 == e10 || (message.f28072id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(Q1);
                if (message2 == null || message2.f28072id < message.f28072id) {
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
                arrayList2 = this.f26737c;
                if (i16 < arrayList2.size()) {
                    sv svVar = (sv) arrayList2.get(i16);
                    hVar = hVar2;
                    if (svVar.f26578a == j3) {
                        int i17 = svVar.f26580c;
                        int i18 = message3.f28072id;
                        if (i17 < i18 || (i18 < 0 && message3.date > svVar.c())) {
                            if (svVar.f26580c < message3.f28072id) {
                                int i19 = 0;
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    if (((TLRPC.Message) arrayList.get(i20)).f28072id > svVar.f26580c) {
                                        i19++;
                                    }
                                }
                                svVar.f26581e += i19;
                            }
                            gj gjVar = new gj(i13, message3, false, false);
                            svVar.d = gjVar;
                            svVar.f26580c = gjVar.e1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), svVar.f26581e);
                        } else {
                            i11 = svVar.f26581e;
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
                sv a10 = sv.a(i13, message3);
                if (num2 != null) {
                    a10.f26581e = num2.intValue();
                }
                arrayList2.add(a10);
                z12 = true;
            }
            int i21 = 0;
            while (true) {
                arrayList3 = this.f26741i;
                if (i21 < arrayList3.size()) {
                    sv svVar2 = (sv) arrayList3.get(i21);
                    if (svVar2.f26578a == j3) {
                        int i22 = svVar2.f26580c;
                        int i23 = message3.f28072id;
                        if (i22 >= i23 && (i23 >= 0 || message3.date <= svVar2.c())) {
                            i7 = 0;
                        } else {
                            if (svVar2.f26580c < message3.f28072id) {
                                int i24 = 0;
                                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                                    if (((TLRPC.Message) arrayList.get(i25)).f28072id > svVar2.f26580c) {
                                        i24++;
                                    }
                                }
                                svVar2.f26581e += i24;
                            }
                            i7 = 0;
                            gj gjVar2 = new gj(i13, message3, false, false);
                            svVar2.d = gjVar2;
                            svVar2.f26580c = gjVar2.e1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i10 = Math.max(num2.intValue(), svVar2.f26581e);
                        } else {
                            i10 = svVar2.f26581e;
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
                sv a11 = sv.a(i13, message3);
                if (num2 != null) {
                    a11.f26581e = num2.intValue();
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
            ArrayList arrayList = this.f26742j;
            if (i10 >= arrayList.size()) {
                break;
            }
            sv svVar = (sv) arrayList.get(i10);
            if (svVar.f26578a == j3) {
                if (svVar.f26581e != i7 || (!svVar.f26584i && z10)) {
                    svVar.f26581e = i7;
                    svVar.f26584i = true;
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }
}
