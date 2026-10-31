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
public final class gw {
    public final int f15766a;
    public boolean f15767b;
    public boolean d;
    public boolean e;
    public boolean f15769f;
    public int f15770g;
    public int h;
    public boolean f15773k;
    public boolean f15774l;
    public boolean f15775m;
    public boolean f15777o;
    public final ArrayList f15768c = new ArrayList();
    public final ArrayList f15771i = new ArrayList();
    public final ArrayList f15772j = new ArrayList();
    public final ew f15776n = new ew(this, 4);
    public final a0.h f15778p = new a0.h();

    public gw(int i10) {
        this.f15766a = i10;
        this.f15767b = vp.r1(i10).f7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            fw fwVar = (fw) arrayList.get(i10);
            if (fwVar.f15625b) {
                arrayList2.add(Long.valueOf(fwVar.f15624a));
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
        bundle.putLong("user_id", d20.i(Q.getCurrentAccount()).e());
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
            fw fwVar = (fw) arrayList.get(i10);
            if (fwVar.f15625b) {
                fwVar.f15625b = false;
                arrayList3.add(fwVar);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            fw fwVar2 = (fw) arrayList.get(i11);
            int indexOf = arrayList2.indexOf(Long.valueOf(fwVar2.f15624a));
            if (indexOf >= 0) {
                fwVar2.f15631k = indexOf;
                fwVar2.f15625b = true;
                arrayList4.add(fwVar2);
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        Collections.sort(arrayList, new bk(17));
        Collections.sort(arrayList4, new bk(18));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.f15768c.clear();
        this.f15771i.clear();
        this.e = false;
        this.f15770g = 0;
        this.h = 0;
        this.f15769f = false;
        this.f15774l = true;
        boolean z10 = this.f15777o;
        int i10 = this.f15766a;
        if (!z10) {
            this.f15777o = true;
            hs a02 = hs.a0(i10);
            a02.f15938a.c(new hr(this, a02));
        }
        this.f15767b = true;
        vp.r1(i10).f7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.f15770g = 0;
        this.f15772j.clear();
        this.f15771i.clear();
        this.f15768c.clear();
        l();
    }

    public final int c() {
        if (this.f15769f) {
            return this.f15772j.size();
        }
        if (this.e) {
            return this.f15770g - this.h;
        }
        return this.f15768c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e = d20.i(this.f15766a).e();
        ArrayList arrayList = this.f15772j;
        if (arrayList.size() == 1 && ((fw) arrayList.get(0)).f15624a == e) {
            return false;
        }
        return true;
    }

    public final void f(long j10, q20 q20Var) {
        fw fwVar;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15772j;
            if (i10 < arrayList.size()) {
                fwVar = (fw) arrayList.get(i10);
                if (fwVar.f15624a == j10) {
                    break;
                }
                i10++;
            } else {
                fwVar = null;
                break;
            }
        }
        if (fwVar != null && fwVar.e > 0 && fwVar.f15629i) {
            if (q20Var != null) {
                q20Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.f15778p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
        if (arrayList2 != null) {
            if (q20Var != null) {
                arrayList2.add(q20Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (q20Var != null) {
            arrayList3.add(q20Var);
        }
        hVar.k(arrayList3, j10);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i11 = this.f15766a;
        tL_messages_getSavedHistory.peer = vp.r1(i11).i1(j10);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getSavedHistory, new s4(this, j10, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        fw fwVar;
        long j10;
        this.f15775m = z10;
        if (!this.d && !this.f15769f && !(z11 = this.f15773k)) {
            boolean z12 = this.f15774l;
            int i10 = this.f15766a;
            if (!z12) {
                ew ewVar = new ew(this, 0);
                if (!z11) {
                    this.f15773k = true;
                    long e = d20.i(i10).e();
                    hs a02 = hs.a0(i10);
                    a02.f15938a.c(new wm(this, a02, e, ewVar, 19));
                }
            } else if (!z10) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.f15771i;
                if (arrayList.isEmpty()) {
                    fwVar = null;
                } else {
                    fwVar = (fw) i0.a.g(1, arrayList);
                }
                if (fwVar != null) {
                    tL_messages_getSavedDialogs.offset_id = fwVar.f15626c;
                    tL_messages_getSavedDialogs.offset_date = fwVar.c();
                    tL_messages_getSavedDialogs.offset_peer = vp.r1(i10).i1(fwVar.f15624a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.f15772j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    fw fwVar2 = (fw) arrayList2.get(i11);
                    long j11 = tL_messages_getSavedDialogs.hash;
                    if (fwVar2.f15625b) {
                        j10 = 1;
                    } else {
                        j10 = 0;
                    }
                    long p5 = ui.p(j11, j10);
                    tL_messages_getSavedDialogs.hash = p5;
                    long p9 = ui.p(p5, Math.abs(fwVar2.f15624a));
                    tL_messages_getSavedDialogs.hash = p9;
                    long p10 = ui.p(p9, fwVar2.f15626c);
                    tL_messages_getSavedDialogs.hash = p10;
                    tL_messages_getSavedDialogs.hash = ui.p(p10, fwVar2.c());
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
            boolean o11 = o(this.f15771i, arrayList2);
            boolean o12 = o(this.f15768c, arrayList2);
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
            ArrayList arrayList = this.f15772j;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (((fw) arrayList.get(i11)).f15624a == j10) {
                arrayList.remove(i11);
                i12++;
                i11--;
            }
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15771i;
            if (i13 >= arrayList2.size()) {
                break;
            }
            if (((fw) arrayList2.get(i13)).f15624a == j10) {
                arrayList2.remove(i13);
                i14++;
                i13--;
            }
            i13++;
        }
        while (true) {
            ArrayList arrayList3 = this.f15768c;
            if (i10 < arrayList3.size()) {
                if (((fw) arrayList3.get(i10)).f15624a == j10) {
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
        ew ewVar = this.f15776n;
        i0.r(ewVar);
        i0.h3(ewVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f15772j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            arrayList = this.f15768c;
            if (i10 >= arrayList.size()) {
                break;
            }
            fw fwVar = (fw) arrayList.get(i10);
            if (fwVar.f15625b && !hashSet.contains(Long.valueOf(fwVar.f15624a)) && !fwVar.d()) {
                arrayList3.add(fwVar);
                hashSet.add(Long.valueOf(fwVar.f15624a));
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList2 = this.f15771i;
            if (i11 >= arrayList2.size()) {
                break;
            }
            fw fwVar2 = (fw) arrayList2.get(i11);
            if (fwVar2.f15625b && !hashSet.contains(Long.valueOf(fwVar2.f15624a)) && !fwVar2.d()) {
                arrayList3.add(fwVar2);
                hashSet.add(Long.valueOf(fwVar2.f15624a));
            }
            i11++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            fw fwVar3 = (fw) arrayList2.get(i12);
            if (!hashSet.contains(Long.valueOf(fwVar3.f15624a)) && !fwVar3.d()) {
                arrayList4.add(fwVar3);
                hashSet.add(Long.valueOf(fwVar3.f15624a));
            }
        }
        if (!this.f15769f) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                fw fwVar4 = (fw) arrayList.get(i13);
                if (!hashSet.contains(Long.valueOf(fwVar4.f15624a)) && !fwVar4.d()) {
                    arrayList4.add(fwVar4);
                    hashSet.add(Long.valueOf(fwVar4.f15624a));
                }
            }
        }
        Collections.sort(arrayList4, new bk(19));
        arrayList3.addAll(arrayList4);
        int i14 = this.f15766a;
        zs.f(i14).k(zs.f19617g3, new Object[0]);
        if (!e() && vp.r1(i14).f18872p6) {
            vp.r1(i14).K4(false);
        }
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        int i10;
        ArrayList d = d(this.f15772j);
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
        int i11 = this.f15766a;
        if (d20.i(i11).q()) {
            i10 = vp.r1(i11).f18864o6;
        } else {
            i10 = vp.r1(i11).f18855n6;
        }
        if (arrayList2.size() <= i10 && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o10 = o(this.f15771i, arrayList2);
            boolean o11 = o(this.f15768c, arrayList2);
            if (o10 || o11) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o10 = o(this.f15771i, arrayList);
        boolean o11 = o(this.f15768c, arrayList);
        if (!o10 && !o11) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            int i11 = this.f15766a;
            if (i10 < size) {
                long longValue = ((Long) arrayList.get(i10)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = vp.r1(i11).i1(longValue);
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
        int i14 = this.f15766a;
        long e = d20.i(i14).e();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i15);
            long R1 = jj.R1(e, message);
            if (R1 == e || (message.f19814id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(R1);
                if (message2 == null || message2.f19814id < message.f19814id) {
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
                arrayList2 = this.f15768c;
                if (i17 < arrayList2.size()) {
                    fw fwVar = (fw) arrayList2.get(i17);
                    hVar = hVar2;
                    if (fwVar.f15624a == j10) {
                        int i18 = fwVar.f15626c;
                        int i19 = message3.f19814id;
                        if (i18 < i19 || (i19 < 0 && message3.date > fwVar.c())) {
                            if (fwVar.f15626c < message3.f19814id) {
                                int i20 = 0;
                                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                    if (((TLRPC.Message) arrayList.get(i21)).f19814id > fwVar.f15626c) {
                                        i20++;
                                    }
                                }
                                fwVar.e += i20;
                            }
                            jj jjVar = new jj(i14, message3, false, false);
                            fwVar.d = jjVar;
                            fwVar.f15626c = jjVar.f1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i12 = Math.max(num2.intValue(), fwVar.e);
                        } else {
                            i12 = fwVar.e;
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
                fw a2 = fw.a(i14, message3);
                if (num2 != null) {
                    a2.e = num2.intValue();
                }
                arrayList2.add(a2);
                z12 = true;
            }
            int i22 = 0;
            while (true) {
                arrayList3 = this.f15771i;
                if (i22 < arrayList3.size()) {
                    fw fwVar2 = (fw) arrayList3.get(i22);
                    if (fwVar2.f15624a == j10) {
                        int i23 = fwVar2.f15626c;
                        int i24 = message3.f19814id;
                        if (i23 >= i24 && (i24 >= 0 || message3.date <= fwVar2.c())) {
                            i10 = 0;
                        } else {
                            if (fwVar2.f15626c < message3.f19814id) {
                                int i25 = 0;
                                for (int i26 = 0; i26 < arrayList.size(); i26++) {
                                    if (((TLRPC.Message) arrayList.get(i26)).f19814id > fwVar2.f15626c) {
                                        i25++;
                                    }
                                }
                                fwVar2.e += i25;
                            }
                            i10 = 0;
                            jj jjVar2 = new jj(i14, message3, false, false);
                            fwVar2.d = jjVar2;
                            fwVar2.f15626c = jjVar2.f1();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), fwVar2.e);
                        } else {
                            i11 = fwVar2.e;
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
                fw a10 = fw.a(i14, message3);
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
            ArrayList arrayList = this.f15772j;
            if (i11 >= arrayList.size()) {
                break;
            }
            fw fwVar = (fw) arrayList.get(i11);
            if (fwVar.f15624a == j10) {
                if (fwVar.e != i10 || (!fwVar.f15629i && z10)) {
                    fwVar.e = i10;
                    fwVar.f15629i = true;
                    return true;
                }
            } else {
                i11++;
            }
        }
        return false;
    }
}
