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
public final class vv {
    public final int f26211a;
    public boolean f26212b;
    public boolean d;
    public boolean f26214e;
    public boolean f26215f;
    public int f26216g;
    public int h;
    public boolean f26219k;
    public boolean f26220l;
    public boolean f26221m;
    public boolean f26223o;
    public final ArrayList f26213c = new ArrayList();
    public final ArrayList f26217i = new ArrayList();
    public final ArrayList f26218j = new ArrayList();
    public final tv f26222n = new tv(this, 4);
    public final a0.h f26224p = new a0.h();

    public vv(int i7) {
        this.f26211a = i7;
        this.f26212b = qp.s1(i7).f24774e7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            uv uvVar = (uv) arrayList.get(i7);
            if (uvVar.f25897b) {
                arrayList2.add(Long.valueOf(uvVar.f25896a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", p10.i(Q.getCurrentAccount()).e());
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
            uv uvVar = (uv) arrayList.get(i7);
            if (uvVar.f25897b) {
                uvVar.f25897b = false;
                arrayList3.add(uvVar);
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            uv uvVar2 = (uv) arrayList.get(i10);
            int indexOf = arrayList2.indexOf(Long.valueOf(uvVar2.f25896a));
            if (indexOf >= 0) {
                uvVar2.f25904k = indexOf;
                uvVar2.f25897b = true;
                arrayList4.add(uvVar2);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new jl(15));
        Collections.sort(arrayList4, new jl(16));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.f26213c.clear();
        this.f26217i.clear();
        this.f26214e = false;
        this.f26216g = 0;
        this.h = 0;
        this.f26215f = false;
        this.f26220l = true;
        boolean z9 = this.f26223o;
        int i7 = this.f26211a;
        if (!z9) {
            this.f26223o = true;
            yr a02 = yr.a0(i7);
            a02.f26719a.c(new zq(this, a02));
        }
        this.f26212b = true;
        qp.s1(i7).f24774e7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.f26216g = 0;
        this.f26218j.clear();
        this.f26217i.clear();
        this.f26213c.clear();
        l();
    }

    public final int c() {
        if (this.f26215f) {
            return this.f26218j.size();
        }
        if (this.f26214e) {
            return this.f26216g - this.h;
        }
        return this.f26213c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e10 = p10.i(this.f26211a).e();
        ArrayList arrayList = this.f26218j;
        if (arrayList.size() == 1 && ((uv) arrayList.get(0)).f25896a == e10) {
            return false;
        }
        return true;
    }

    public final void f(long j3, c20 c20Var) {
        uv uvVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f26218j;
            if (i7 < arrayList.size()) {
                uvVar = (uv) arrayList.get(i7);
                if (uvVar.f25896a == j3) {
                    break;
                }
                i7++;
            } else {
                uvVar = null;
                break;
            }
        }
        if (uvVar != null && uvVar.f25899e > 0 && uvVar.f25902i) {
            if (c20Var != null) {
                c20Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.f26224p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j3);
        if (arrayList2 != null) {
            if (c20Var != null) {
                arrayList2.add(c20Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (c20Var != null) {
            arrayList3.add(c20Var);
        }
        hVar.k(arrayList3, j3);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i10 = this.f26211a;
        tL_messages_getSavedHistory.peer = qp.s1(i10).j1(j3);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedHistory, new v4(this, j3, 2));
    }

    public final void g(boolean z9) {
        boolean z10;
        uv uvVar;
        long j3;
        this.f26221m = z9;
        if (!this.d && !this.f26215f && !(z10 = this.f26219k)) {
            boolean z11 = this.f26220l;
            int i7 = this.f26211a;
            if (!z11) {
                tv tvVar = new tv(this, 0);
                if (!z10) {
                    this.f26219k = true;
                    long e10 = p10.i(i7).e();
                    yr a02 = yr.a0(i7);
                    a02.f26719a.c(new jm(this, a02, e10, tvVar, 18));
                }
            } else if (!z9) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.f26217i;
                if (arrayList.isEmpty()) {
                    uvVar = null;
                } else {
                    uvVar = (uv) jg.g.i(1, arrayList);
                }
                if (uvVar != null) {
                    tL_messages_getSavedDialogs.offset_id = uvVar.f25898c;
                    tL_messages_getSavedDialogs.offset_date = uvVar.c();
                    tL_messages_getSavedDialogs.offset_peer = qp.s1(i7).j1(uvVar.f25896a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.f26218j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    uv uvVar2 = (uv) arrayList2.get(i10);
                    long j10 = tL_messages_getSavedDialogs.hash;
                    if (uvVar2.f25897b) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    long p10 = ui.p(j10, j3);
                    tL_messages_getSavedDialogs.hash = p10;
                    long p11 = ui.p(p10, Math.abs(uvVar2.f25896a));
                    tL_messages_getSavedDialogs.hash = p11;
                    long p12 = ui.p(p11, uvVar2.f25898c);
                    tL_messages_getSavedDialogs.hash = p12;
                    tL_messages_getSavedDialogs.hash = ui.p(p12, uvVar2.c());
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getSavedDialogs, new r4(8, this, arrayList2));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z9 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o4 = m5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(o4));
                z9 = n(arrayList, tL_updateSavedDialogPinned.pinned, false);
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
            boolean o10 = o(this.f26217i, arrayList2);
            boolean o11 = o(this.f26213c, arrayList2);
            if (o10 || o11) {
                z9 = true;
            }
        }
        if (z9) {
            l();
        }
    }

    public final int j(long j3) {
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f26218j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((uv) arrayList.get(i10)).f25896a == j3) {
                arrayList.remove(i10);
                i11++;
                i10--;
            }
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f26217i;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((uv) arrayList2.get(i12)).f25896a == j3) {
                arrayList2.remove(i12);
                i13++;
                i12--;
            }
            i12++;
        }
        while (true) {
            ArrayList arrayList3 = this.f26213c;
            if (i7 < arrayList3.size()) {
                if (((uv) arrayList3.get(i7)).f25896a == j3) {
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
        tv tvVar = this.f26222n;
        g0.r(tvVar);
        g0.i3(tvVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f26218j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            arrayList = this.f26213c;
            if (i7 >= arrayList.size()) {
                break;
            }
            uv uvVar = (uv) arrayList.get(i7);
            if (uvVar.f25897b && !hashSet.contains(Long.valueOf(uvVar.f25896a)) && !uvVar.d()) {
                arrayList3.add(uvVar);
                hashSet.add(Long.valueOf(uvVar.f25896a));
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList2 = this.f26217i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            uv uvVar2 = (uv) arrayList2.get(i10);
            if (uvVar2.f25897b && !hashSet.contains(Long.valueOf(uvVar2.f25896a)) && !uvVar2.d()) {
                arrayList3.add(uvVar2);
                hashSet.add(Long.valueOf(uvVar2.f25896a));
            }
            i10++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            uv uvVar3 = (uv) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(uvVar3.f25896a)) && !uvVar3.d()) {
                arrayList4.add(uvVar3);
                hashSet.add(Long.valueOf(uvVar3.f25896a));
            }
        }
        if (!this.f26215f) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                uv uvVar4 = (uv) arrayList.get(i12);
                if (!hashSet.contains(Long.valueOf(uvVar4.f25896a)) && !uvVar4.d()) {
                    arrayList4.add(uvVar4);
                    hashSet.add(Long.valueOf(uvVar4.f25896a));
                }
            }
        }
        Collections.sort(arrayList4, new jl(17));
        arrayList3.addAll(arrayList4);
        int i13 = this.f26211a;
        qs.f(i13).k(qs.f25005g3, new Object[0]);
        if (!e() && qp.s1(i13).f24858o6) {
            qp.s1(i13).N4(false);
        }
    }

    public final boolean n(ArrayList arrayList, boolean z9, boolean z10) {
        int i7;
        ArrayList d = d(this.f26218j);
        ArrayList arrayList2 = new ArrayList(d);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l10 = (Long) arrayList.get(size);
            l10.getClass();
            if (z9 && !arrayList2.contains(l10)) {
                arrayList2.add(0, l10);
            } else if (!z9) {
                arrayList2.remove(l10);
            }
        }
        int i10 = this.f26211a;
        if (p10.i(i10).q()) {
            i7 = qp.s1(i10).f24850n6;
        } else {
            i7 = qp.s1(i10).f24841m6;
        }
        if (arrayList2.size() <= i7 && !k(d, arrayList2)) {
            if (z10) {
                p(arrayList2);
                return true;
            }
            boolean o4 = o(this.f26217i, arrayList2);
            boolean o10 = o(this.f26213c, arrayList2);
            if (o4 || o10) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o4 = o(this.f26217i, arrayList);
        boolean o10 = o(this.f26213c, arrayList);
        if (!o4 && !o10) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            int i10 = this.f26211a;
            if (i7 < size) {
                long longValue = ((Long) arrayList.get(i7)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = qp.s1(i10).j1(longValue);
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
        boolean z9;
        ArrayList arrayList3;
        int i7;
        boolean z10;
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
        int i13 = this.f26211a;
        long e10 = p10.i(i13).e();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i14);
            long R1 = ij.R1(e10, message);
            if (R1 == e10 || (message.f26977id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(R1);
                if (message2 == null || message2.f26977id < message.f26977id) {
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
        boolean z11 = false;
        while (i15 < hVar2.m()) {
            long j3 = hVar2.j(i15);
            TLRPC.Message message3 = (TLRPC.Message) hVar2.n(i15);
            Integer num2 = (Integer) hVar3.f(j3);
            int i16 = i12;
            while (true) {
                arrayList2 = this.f26213c;
                if (i16 < arrayList2.size()) {
                    uv uvVar = (uv) arrayList2.get(i16);
                    hVar = hVar2;
                    if (uvVar.f25896a == j3) {
                        int i17 = uvVar.f25898c;
                        int i18 = message3.f26977id;
                        if (i17 < i18 || (i18 < 0 && message3.date > uvVar.c())) {
                            if (uvVar.f25898c < message3.f26977id) {
                                int i19 = 0;
                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                    if (((TLRPC.Message) arrayList.get(i20)).f26977id > uvVar.f25898c) {
                                        i19++;
                                    }
                                }
                                uvVar.f25899e += i19;
                            }
                            ij ijVar = new ij(i13, message3, false, false);
                            uvVar.d = ijVar;
                            uvVar.f25898c = ijVar.f1();
                            z11 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), uvVar.f25899e);
                        } else {
                            i11 = uvVar.f25899e;
                        }
                        num2 = Integer.valueOf(i11);
                        z9 = true;
                    } else {
                        i16++;
                        hVar2 = hVar;
                    }
                } else {
                    hVar = hVar2;
                    z9 = false;
                    break;
                }
            }
            if (!z9) {
                uv a10 = uv.a(i13, message3);
                if (num2 != null) {
                    a10.f25899e = num2.intValue();
                }
                arrayList2.add(a10);
                z11 = true;
            }
            int i21 = 0;
            while (true) {
                arrayList3 = this.f26217i;
                if (i21 < arrayList3.size()) {
                    uv uvVar2 = (uv) arrayList3.get(i21);
                    if (uvVar2.f25896a == j3) {
                        int i22 = uvVar2.f25898c;
                        int i23 = message3.f26977id;
                        if (i22 >= i23 && (i23 >= 0 || message3.date <= uvVar2.c())) {
                            i7 = 0;
                        } else {
                            if (uvVar2.f25898c < message3.f26977id) {
                                int i24 = 0;
                                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                                    if (((TLRPC.Message) arrayList.get(i25)).f26977id > uvVar2.f25898c) {
                                        i24++;
                                    }
                                }
                                uvVar2.f25899e += i24;
                            }
                            i7 = 0;
                            ij ijVar2 = new ij(i13, message3, false, false);
                            uvVar2.d = ijVar2;
                            uvVar2.f25898c = ijVar2.f1();
                            z11 = true;
                        }
                        if (num2 != null) {
                            i10 = Math.max(num2.intValue(), uvVar2.f25899e);
                        } else {
                            i10 = uvVar2.f25899e;
                        }
                        num2 = Integer.valueOf(i10);
                        z10 = true;
                    } else {
                        i21++;
                    }
                } else {
                    i7 = 0;
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                uv a11 = uv.a(i13, message3);
                if (num2 != null) {
                    a11.f25899e = num2.intValue();
                }
                arrayList3.add(a11);
                z11 = true;
            }
            i15++;
            i12 = i7;
            hVar2 = hVar;
        }
        return z11;
    }

    public final boolean r(int i7, long j3, boolean z9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26218j;
            if (i10 >= arrayList.size()) {
                break;
            }
            uv uvVar = (uv) arrayList.get(i10);
            if (uvVar.f25896a == j3) {
                if (uvVar.f25899e != i7 || (!uvVar.f25902i && z9)) {
                    uvVar.f25899e = i7;
                    uvVar.f25902i = true;
                    return true;
                }
            } else {
                i10++;
            }
        }
        return false;
    }
}
