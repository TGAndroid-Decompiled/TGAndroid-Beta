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
public final class hw {
    public final int f16115a;
    public boolean f16116b;
    public boolean d;
    public boolean e;
    public boolean f16118f;
    public int f16119g;
    public int h;
    public boolean f16122k;
    public boolean f16123l;
    public boolean f16124m;
    public boolean f16126o;
    public final ArrayList f16117c = new ArrayList();
    public final ArrayList f16120i = new ArrayList();
    public final ArrayList f16121j = new ArrayList();
    public final fw f16125n = new fw(this, 4);
    public final a0.h f16127p = new a0.h();

    public hw(int i10) {
        this.f16115a = i10;
        this.f16116b = wp.r1(i10).f7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            gw gwVar = (gw) arrayList.get(i10);
            if (gwVar.f15966b) {
                arrayList2.add(Long.valueOf(gwVar.f15965a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", e20.i(Q.getCurrentAccount()).e());
        Q.presentFragment(new org.telegram.ui.un(bundle));
    }

    public static boolean k(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (Objects.equals(arrayList.get(i10), arrayList2.get(i10))) {
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
        int i10 = 0;
        while (i10 < arrayList.size()) {
            gw gwVar = (gw) arrayList.get(i10);
            if (gwVar.f15966b) {
                gwVar.f15966b = false;
                arrayList3.add(gwVar);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            gw gwVar2 = (gw) arrayList.get(i11);
            int indexOf = arrayList2.indexOf(Long.valueOf(gwVar2.f15965a));
            if (indexOf >= 0) {
                gwVar2.f15972k = indexOf;
                gwVar2.f15966b = true;
                arrayList4.add(gwVar2);
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        Collections.sort(arrayList, new ck(17));
        Collections.sort(arrayList4, new ck(18));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.f16117c.clear();
        this.f16120i.clear();
        this.e = false;
        this.f16119g = 0;
        this.h = 0;
        this.f16118f = false;
        this.f16123l = true;
        boolean z10 = this.f16126o;
        int i10 = this.f16115a;
        if (!z10) {
            this.f16126o = true;
            is a02 = is.a0(i10);
            a02.f16331a.c(new ir(this, a02));
        }
        this.f16116b = true;
        wp.r1(i10).f7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.f16119g = 0;
        this.f16121j.clear();
        this.f16120i.clear();
        this.f16117c.clear();
        l();
    }

    public final int c() {
        if (this.f16118f) {
            return this.f16121j.size();
        }
        if (this.e) {
            return this.f16119g - this.h;
        }
        return this.f16117c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e = e20.i(this.f16115a).e();
        ArrayList arrayList = this.f16121j;
        if (arrayList.size() == 1 && ((gw) arrayList.get(0)).f15965a == e) {
            return false;
        }
        return true;
    }

    public final void f(long j10, r20 r20Var) {
        gw gwVar;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16121j;
            if (i10 < arrayList.size()) {
                gwVar = (gw) arrayList.get(i10);
                if (gwVar.f15965a == j10) {
                    break;
                }
                i10++;
            } else {
                gwVar = null;
                break;
            }
        }
        if (gwVar != null && gwVar.e > 0 && gwVar.f15970i) {
            if (r20Var != null) {
                r20Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.f16127p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
        if (arrayList2 != null) {
            if (r20Var != null) {
                arrayList2.add(r20Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (r20Var != null) {
            arrayList3.add(r20Var);
        }
        hVar.k(arrayList3, j10);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i11 = this.f16115a;
        tL_messages_getSavedHistory.peer = wp.r1(i11).i1(j10);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getSavedHistory, new s4(this, j10, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        gw gwVar;
        long j10;
        this.f16124m = z10;
        if (!this.d && !this.f16118f && !(z11 = this.f16122k)) {
            boolean z12 = this.f16123l;
            int i10 = this.f16115a;
            if (!z12) {
                fw fwVar = new fw(this, 0);
                if (!z11) {
                    this.f16122k = true;
                    long e = e20.i(i10).e();
                    is a02 = is.a0(i10);
                    a02.f16331a.c(new xm(this, a02, e, fwVar, 19));
                }
            } else if (!z10) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.f16120i;
                if (arrayList.isEmpty()) {
                    gwVar = null;
                } else {
                    gwVar = (gw) i0.a.g(1, arrayList);
                }
                if (gwVar != null) {
                    tL_messages_getSavedDialogs.offset_id = gwVar.f15967c;
                    tL_messages_getSavedDialogs.offset_date = gwVar.c();
                    tL_messages_getSavedDialogs.offset_peer = wp.r1(i10).i1(gwVar.f15965a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.f16121j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    gw gwVar2 = (gw) arrayList2.get(i11);
                    long j11 = tL_messages_getSavedDialogs.hash;
                    if (gwVar2.f15966b) {
                        j10 = 1;
                    } else {
                        j10 = 0;
                    }
                    long p5 = vi.p(j11, j10);
                    tL_messages_getSavedDialogs.hash = p5;
                    long p9 = vi.p(p5, Math.abs(gwVar2.f15965a));
                    tL_messages_getSavedDialogs.hash = p9;
                    long p10 = vi.p(p9, gwVar2.f15967c);
                    tL_messages_getSavedDialogs.hash = p10;
                    tL_messages_getSavedDialogs.hash = vi.p(p10, gwVar2.c());
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedDialogs, new v4(8, this, arrayList2));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z10 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o10 = o5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(o10));
                z10 = n(arrayList, tL_updateSavedDialogPinned.pinned, false);
            }
        } else if (update instanceof TL_update.TL_updatePinnedSavedDialogs) {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList arrayList2 = new ArrayList(tL_updatePinnedSavedDialogs.order.size());
            for (int i10 = 0; i10 < tL_updatePinnedSavedDialogs.order.size(); i10++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i10);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(o5.o(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean o11 = o(this.f16120i, arrayList2);
            boolean o12 = o(this.f16117c, arrayList2);
            if (o11 || o12) {
                z10 = true;
            }
        }
        if (z10) {
            l();
        }
    }

    public final int j(long j10) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f16121j;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (((gw) arrayList.get(i11)).f15965a == j10) {
                arrayList.remove(i11);
                i12++;
                i11--;
            }
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.f16120i;
            if (i13 >= arrayList2.size()) {
                break;
            }
            if (((gw) arrayList2.get(i13)).f15965a == j10) {
                arrayList2.remove(i13);
                i14++;
                i13--;
            }
            i13++;
        }
        while (true) {
            ArrayList arrayList3 = this.f16117c;
            if (i10 < arrayList3.size()) {
                if (((gw) arrayList3.get(i10)).f15965a == j10) {
                    arrayList3.remove(i10);
                    i10--;
                }
                i10++;
            } else {
                return Math.max(i12, i14);
            }
        }
    }

    public final void l() {
        m();
        fw fwVar = this.f16125n;
        i0.r(fwVar);
        i0.h3(fwVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f16121j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            arrayList = this.f16117c;
            if (i10 >= arrayList.size()) {
                break;
            }
            gw gwVar = (gw) arrayList.get(i10);
            if (gwVar.f15966b && !hashSet.contains(Long.valueOf(gwVar.f15965a)) && !gwVar.d()) {
                arrayList3.add(gwVar);
                hashSet.add(Long.valueOf(gwVar.f15965a));
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList2 = this.f16120i;
            if (i11 >= arrayList2.size()) {
                break;
            }
            gw gwVar2 = (gw) arrayList2.get(i11);
            if (gwVar2.f15966b && !hashSet.contains(Long.valueOf(gwVar2.f15965a)) && !gwVar2.d()) {
                arrayList3.add(gwVar2);
                hashSet.add(Long.valueOf(gwVar2.f15965a));
            }
            i11++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            gw gwVar3 = (gw) arrayList2.get(i12);
            if (!hashSet.contains(Long.valueOf(gwVar3.f15965a)) && !gwVar3.d()) {
                arrayList4.add(gwVar3);
                hashSet.add(Long.valueOf(gwVar3.f15965a));
            }
        }
        if (!this.f16118f) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                gw gwVar4 = (gw) arrayList.get(i13);
                if (!hashSet.contains(Long.valueOf(gwVar4.f15965a)) && !gwVar4.d()) {
                    arrayList4.add(gwVar4);
                    hashSet.add(Long.valueOf(gwVar4.f15965a));
                }
            }
        }
        Collections.sort(arrayList4, new ck(19));
        arrayList3.addAll(arrayList4);
        int i14 = this.f16115a;
        at.f(i14).k(at.f14713g3, new Object[0]);
        if (!e() && wp.r1(i14).f19215p6) {
            wp.r1(i14).K4(false);
        }
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        int i10;
        ArrayList d = d(this.f16121j);
        ArrayList arrayList2 = new ArrayList(d);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l4 = (Long) arrayList.get(size);
            l4.getClass();
            if (z10 && !arrayList2.contains(l4)) {
                arrayList2.add(0, l4);
            } else if (!z10) {
                arrayList2.remove(l4);
            }
        }
        int i11 = this.f16115a;
        if (e20.i(i11).q()) {
            i10 = wp.r1(i11).f19207o6;
        } else {
            i10 = wp.r1(i11).f19198n6;
        }
        if (arrayList2.size() <= i10 && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o10 = o(this.f16120i, arrayList2);
            boolean o11 = o(this.f16117c, arrayList2);
            if (o10 || o11) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o10 = o(this.f16120i, arrayList);
        boolean o11 = o(this.f16117c, arrayList);
        if (!o10 && !o11) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            int i11 = this.f16115a;
            if (i10 < size) {
                long longValue = ((Long) arrayList.get(i10)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = wp.r1(i11).i1(longValue);
                tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                i10++;
            } else {
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
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
        int i10;
        boolean z11;
        int i11;
        int i12;
        int intValue;
        int i13 = 0;
        if (arrayList == null) {
            return false;
        }
        a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        new HashSet();
        int i14 = this.f16115a;
        long e = e20.i(i14).e();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i15);
            long R1 = kj.R1(e, message);
            if (R1 == e || (message.f19815id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(R1);
                if (message2 == null || message2.f19815id < message.f19815id) {
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
        int i16 = 0;
        boolean z12 = false;
        while (i16 < hVar2.m()) {
            long j10 = hVar2.j(i16);
            TLRPC.Message message3 = (TLRPC.Message) hVar2.n(i16);
            Integer num2 = (Integer) hVar3.f(j10);
            int i17 = i13;
            while (true) {
                arrayList2 = this.f16117c;
                if (i17 < arrayList2.size()) {
                    gw gwVar = (gw) arrayList2.get(i17);
                    hVar = hVar2;
                    if (gwVar.f15965a == j10) {
                        int i18 = gwVar.f15967c;
                        int i19 = message3.f19815id;
                        if (i18 < i19 || (i19 < 0 && message3.date > gwVar.c())) {
                            if (gwVar.f15967c < message3.f19815id) {
                                int i20 = 0;
                                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                    if (((TLRPC.Message) arrayList.get(i21)).f19815id > gwVar.f15967c) {
                                        i20++;
                                    }
                                }
                                gwVar.e += i20;
                            }
                            kj kjVar = new kj(i14, message3, false, false);
                            gwVar.d = kjVar;
                            gwVar.f15967c = kjVar.f1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i12 = Math.max(num2.intValue(), gwVar.e);
                        } else {
                            i12 = gwVar.e;
                        }
                        num2 = Integer.valueOf(i12);
                        z10 = true;
                    } else {
                        i17++;
                        hVar2 = hVar;
                    }
                } else {
                    hVar = hVar2;
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                gw a2 = gw.a(i14, message3);
                if (num2 != null) {
                    a2.e = num2.intValue();
                }
                arrayList2.add(a2);
                z12 = true;
            }
            int i22 = 0;
            while (true) {
                arrayList3 = this.f16120i;
                if (i22 < arrayList3.size()) {
                    gw gwVar2 = (gw) arrayList3.get(i22);
                    if (gwVar2.f15965a == j10) {
                        int i23 = gwVar2.f15967c;
                        int i24 = message3.f19815id;
                        if (i23 >= i24 && (i24 >= 0 || message3.date <= gwVar2.c())) {
                            i10 = 0;
                        } else {
                            if (gwVar2.f15967c < message3.f19815id) {
                                int i25 = 0;
                                for (int i26 = 0; i26 < arrayList.size(); i26++) {
                                    if (((TLRPC.Message) arrayList.get(i26)).f19815id > gwVar2.f15967c) {
                                        i25++;
                                    }
                                }
                                gwVar2.e += i25;
                            }
                            i10 = 0;
                            kj kjVar2 = new kj(i14, message3, false, false);
                            gwVar2.d = kjVar2;
                            gwVar2.f15967c = kjVar2.f1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), gwVar2.e);
                        } else {
                            i11 = gwVar2.e;
                        }
                        num2 = Integer.valueOf(i11);
                        z11 = true;
                    } else {
                        i22++;
                    }
                } else {
                    i10 = 0;
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                gw a10 = gw.a(i14, message3);
                if (num2 != null) {
                    a10.e = num2.intValue();
                }
                arrayList3.add(a10);
                z12 = true;
            }
            i16++;
            i13 = i10;
            hVar2 = hVar;
        }
        return z12;
    }

    public final boolean r(int i10, long j10, boolean z10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f16121j;
            if (i11 >= arrayList.size()) {
                break;
            }
            gw gwVar = (gw) arrayList.get(i11);
            if (gwVar.f15965a == j10) {
                if (gwVar.e != i10 || (!gwVar.f15970i && z10)) {
                    gwVar.e = i10;
                    gwVar.f15970i = true;
                    return true;
                }
            } else {
                i11++;
            }
        }
        return false;
    }
}
