package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class nt9 {
    public final int a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean o;
    public final ArrayList c = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final lt9 n = new lt9(this, (byte) 4);
    public final zh6 p = new zh6();

    public nt9(int i) {
        this.a = i;
        this.b = uc7.s1(i).X3.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            mt9 mt9Var = (mt9) arrayList.get(i);
            if (mt9Var.b) {
                arrayList2.add(Long.valueOf(mt9Var.a));
            }
        }
        return arrayList2;
    }

    public static boolean j(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (Objects.equals(arrayList.get(i), arrayList2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean n(ArrayList arrayList, ArrayList arrayList2) {
        if (j(arrayList2, d(arrayList))) {
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (i < arrayList.size()) {
            mt9 mt9Var = (mt9) arrayList.get(i);
            if (mt9Var.b) {
                mt9Var.b = false;
                arrayList3.add(mt9Var);
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            mt9 mt9Var2 = (mt9) arrayList.get(i2);
            int indexOf = arrayList2.indexOf(Long.valueOf(mt9Var2.a));
            if (indexOf >= 0) {
                mt9Var2.k = indexOf;
                mt9Var2.b = true;
                arrayList4.add(mt9Var2);
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        Collections.sort(arrayList, new qq7((byte) 16));
        Collections.sort(arrayList4, new qq7((byte) 17));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.c.clear();
        this.i.clear();
        this.e = false;
        this.g = 0;
        this.h = 0;
        this.f = false;
        this.l = true;
        boolean z = this.o;
        int i = this.a;
        if (!z) {
            this.o = true;
            jf7 Y = jf7.Y(i);
            Y.a.c(new en9(this, Y, (byte) 9));
        }
        this.b = true;
        uc7.s1(i).X3.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.g = 0;
        this.j.clear();
        this.i.clear();
        this.c.clear();
        k();
    }

    public final int c() {
        if (this.f) {
            return this.j.size();
        }
        if (this.e) {
            return this.g - this.h;
        }
        return this.c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e = yac.h(this.a).e();
        ArrayList arrayList = this.j;
        if (arrayList.size() == 1 && ((mt9) arrayList.get(0)).a == e) {
            return false;
        }
        return true;
    }

    public final void f(long j, pcc pccVar) {
        mt9 mt9Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i < arrayList.size()) {
                mt9Var = (mt9) arrayList.get(i);
                if (mt9Var.a == j) {
                    break;
                }
                i++;
            } else {
                mt9Var = null;
                break;
            }
        }
        if (mt9Var != null && mt9Var.e > 0 && mt9Var.i) {
            if (pccVar != null) {
                pccVar.a(Boolean.TRUE);
                return;
            }
            return;
        }
        zh6 zh6Var = this.p;
        ArrayList arrayList2 = (ArrayList) zh6Var.f(j);
        if (arrayList2 != null) {
            if (pccVar != null) {
                arrayList2.add(pccVar);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (pccVar != null) {
            arrayList3.add(pccVar);
        }
        zh6Var.k(j, arrayList3);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i2 = this.a;
        tL_messages_getSavedHistory.peer = uc7.s1(i2).j1(j);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getSavedHistory, new yu2(this, j, (byte) 3));
    }

    public final void g(boolean z) {
        boolean z2;
        mt9 mt9Var;
        long j;
        this.m = z;
        if (!this.d && !this.f && !(z2 = this.k)) {
            boolean z3 = this.l;
            int i = this.a;
            if (!z3) {
                lt9 lt9Var = new lt9(this, (byte) 3);
                if (!z2) {
                    this.k = true;
                    long e = yac.h(i).e();
                    jf7 Y = jf7.Y(i);
                    Y.a.c(new y09(this, Y, e, lt9Var, (byte) 2));
                }
            } else if (!z) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.i;
                if (arrayList.isEmpty()) {
                    mt9Var = null;
                } else {
                    mt9Var = (mt9) c00.g(1, arrayList);
                }
                if (mt9Var != null) {
                    tL_messages_getSavedDialogs.offset_id = mt9Var.c;
                    tL_messages_getSavedDialogs.offset_date = mt9Var.c();
                    tL_messages_getSavedDialogs.offset_peer = uc7.s1(i).j1(mt9Var.a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    mt9 mt9Var2 = (mt9) arrayList2.get(i2);
                    long j2 = tL_messages_getSavedDialogs.hash;
                    if (mt9Var2.b) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    long r = ls6.r(j2, j);
                    tL_messages_getSavedDialogs.hash = r;
                    long r2 = ls6.r(r, Math.abs(mt9Var2.a));
                    tL_messages_getSavedDialogs.hash = r2;
                    long r3 = ls6.r(r2, mt9Var2.c);
                    tL_messages_getSavedDialogs.hash = r3;
                    tL_messages_getSavedDialogs.hash = ls6.r(r3, mt9Var2.c());
                }
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_getSavedDialogs, new ol7(this, arrayList2, (byte) 20));
            }
        }
    }

    public final void h(TLRPC.Update update) {
        boolean z = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long n = wf3.n(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(n));
                z = m(arrayList, tL_updateSavedDialogPinned.pinned, false);
            }
        } else if (update instanceof TL_update.TL_updatePinnedSavedDialogs) {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList arrayList2 = new ArrayList(tL_updatePinnedSavedDialogs.order.size());
            for (int i = 0; i < tL_updatePinnedSavedDialogs.order.size(); i++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(wf3.n(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean n2 = n(this.i, arrayList2);
            boolean n3 = n(this.c, arrayList2);
            if (n2 || n3) {
                z = true;
            }
        }
        if (z) {
            k();
        }
    }

    public final int i(long j) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (((mt9) arrayList.get(i2)).a == j) {
                arrayList.remove(i2);
                i3++;
                i2--;
            }
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i4 >= arrayList2.size()) {
                break;
            }
            if (((mt9) arrayList2.get(i4)).a == j) {
                arrayList2.remove(i4);
                i5++;
                i4--;
            }
            i4++;
        }
        while (true) {
            ArrayList arrayList3 = this.c;
            if (i < arrayList3.size()) {
                if (((mt9) arrayList3.get(i)).a == j) {
                    arrayList3.remove(i);
                    i--;
                }
                i++;
            } else {
                return Math.max(i3, i5);
            }
        }
    }

    public final void k() {
        l();
        lt9 lt9Var = this.n;
        hl.r(lt9Var);
        hl.d3(lt9Var, 450L);
    }

    public final void l() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= arrayList.size()) {
                break;
            }
            mt9 mt9Var = (mt9) arrayList.get(i);
            if (mt9Var.b && !hashSet.contains(Long.valueOf(mt9Var.a)) && !mt9Var.d()) {
                arrayList3.add(mt9Var);
                hashSet.add(Long.valueOf(mt9Var.a));
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                break;
            }
            mt9 mt9Var2 = (mt9) arrayList2.get(i2);
            if (mt9Var2.b && !hashSet.contains(Long.valueOf(mt9Var2.a)) && !mt9Var2.d()) {
                arrayList3.add(mt9Var2);
                hashSet.add(Long.valueOf(mt9Var2.a));
            }
            i2++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            mt9 mt9Var3 = (mt9) arrayList2.get(i3);
            if (!hashSet.contains(Long.valueOf(mt9Var3.a)) && !mt9Var3.d()) {
                arrayList4.add(mt9Var3);
                hashSet.add(Long.valueOf(mt9Var3.a));
            }
        }
        if (!this.f) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                mt9 mt9Var4 = (mt9) arrayList.get(i4);
                if (!hashSet.contains(Long.valueOf(mt9Var4.a)) && !mt9Var4.d()) {
                    arrayList4.add(mt9Var4);
                    hashSet.add(Long.valueOf(mt9Var4.a));
                }
            }
        }
        Collections.sort(arrayList4, new qq7((byte) 18));
        arrayList3.addAll(arrayList4);
        int i5 = this.a;
        jn7.f(i5).k(jn7.i3, new Object[0]);
        if (!e() && uc7.s1(i5).P3) {
            uc7.s1(i5).b5(false);
        }
    }

    public final boolean m(ArrayList arrayList, boolean z, boolean z2) {
        int f;
        ArrayList d = d(this.j);
        ArrayList arrayList2 = new ArrayList(d);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l = (Long) arrayList.get(size);
            l.getClass();
            if (z) {
                if (!arrayList2.contains(l)) {
                    arrayList2.add(0, l);
                }
            } else {
                arrayList2.remove(l);
            }
        }
        int i = this.a;
        if (yac.h(i).p()) {
            f = uc7.s1(i).k4.q2.f();
        } else {
            f = uc7.s1(i).k4.p2.f();
        }
        if (arrayList2.size() <= f && !j(d, arrayList2)) {
            if (z2) {
                o(arrayList2);
                return true;
            }
            boolean n = n(this.i, arrayList2);
            boolean n2 = n(this.c, arrayList2);
            if (n || n2) {
                return true;
            }
        }
        return false;
    }

    public final void o(ArrayList arrayList) {
        boolean n = n(this.i, arrayList);
        boolean n2 = n(this.c, arrayList);
        if (!n && !n2) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i = 0;
        while (true) {
            int size = arrayList.size();
            int i2 = this.a;
            if (i < size) {
                long longValue = ((Long) arrayList.get(i)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = uc7.s1(i2).j1(longValue);
                tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                i++;
            } else {
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
                k();
                return;
            }
        }
    }

    public final boolean p(ArrayList arrayList) {
        ArrayList arrayList2;
        zh6 zh6Var;
        boolean z;
        ArrayList arrayList3;
        int i;
        boolean z2;
        int intValue;
        int i2 = 0;
        if (arrayList == null) {
            return false;
        }
        zh6 zh6Var2 = new zh6();
        zh6 zh6Var3 = new zh6();
        int i3 = this.a;
        long e = yac.h(i3).e();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i4);
            long Q1 = r47.Q1(e, message);
            if (Q1 == e || (message.id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) zh6Var2.f(Q1);
                if (message2 == null || message2.id < message.id) {
                    zh6Var2.k(Q1, message);
                }
                Integer num = (Integer) zh6Var3.f(Q1);
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                zh6Var3.k(Q1, Integer.valueOf(intValue + 1));
            }
        }
        int i5 = 0;
        boolean z3 = false;
        while (i5 < zh6Var2.m()) {
            long j = zh6Var2.j(i5);
            TLRPC.Message message3 = (TLRPC.Message) zh6Var2.n(i5);
            Integer num2 = (Integer) zh6Var3.f(j);
            int i6 = i2;
            while (true) {
                arrayList2 = this.c;
                if (i6 < arrayList2.size()) {
                    mt9 mt9Var = (mt9) arrayList2.get(i6);
                    zh6Var = zh6Var2;
                    if (mt9Var.a == j) {
                        int i7 = mt9Var.c;
                        int i8 = message3.id;
                        if (i7 < i8 || (i8 < 0 && message3.date > mt9Var.c())) {
                            if (mt9Var.c < message3.id) {
                                int i9 = 0;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    if (((TLRPC.Message) arrayList.get(i10)).id > mt9Var.c) {
                                        i9++;
                                    }
                                }
                                mt9Var.e += i9;
                            }
                            r47 r47Var = new r47(i3, message3, false, false);
                            mt9Var.d = r47Var;
                            mt9Var.c = r47Var.e1();
                            z3 = true;
                        }
                        int i11 = mt9Var.e;
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), i11);
                        }
                        num2 = Integer.valueOf(i11);
                        z = true;
                    } else {
                        i6++;
                        zh6Var2 = zh6Var;
                    }
                } else {
                    zh6Var = zh6Var2;
                    z = false;
                    break;
                }
            }
            if (!z) {
                mt9 a = mt9.a(i3, message3);
                if (num2 != null) {
                    a.e = num2.intValue();
                }
                arrayList2.add(a);
                z3 = true;
            }
            int i12 = 0;
            while (true) {
                arrayList3 = this.i;
                if (i12 < arrayList3.size()) {
                    mt9 mt9Var2 = (mt9) arrayList3.get(i12);
                    if (mt9Var2.a == j) {
                        int i13 = mt9Var2.c;
                        int i14 = message3.id;
                        if (i13 >= i14 && (i14 >= 0 || message3.date <= mt9Var2.c())) {
                            i = 0;
                        } else {
                            if (mt9Var2.c < message3.id) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    if (((TLRPC.Message) arrayList.get(i16)).id > mt9Var2.c) {
                                        i15++;
                                    }
                                }
                                mt9Var2.e += i15;
                            }
                            i = 0;
                            r47 r47Var2 = new r47(i3, message3, false, false);
                            mt9Var2.d = r47Var2;
                            mt9Var2.c = r47Var2.e1();
                            z3 = true;
                        }
                        int i17 = mt9Var2.e;
                        if (num2 != null) {
                            i17 = Math.max(num2.intValue(), i17);
                        }
                        num2 = Integer.valueOf(i17);
                        z2 = true;
                    } else {
                        i12++;
                    }
                } else {
                    i = 0;
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                mt9 a2 = mt9.a(i3, message3);
                if (num2 != null) {
                    a2.e = num2.intValue();
                }
                arrayList3.add(a2);
                z3 = true;
            }
            i5++;
            i2 = i;
            zh6Var2 = zh6Var;
        }
        return z3;
    }

    public final boolean q(int i, long j, boolean z) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i2 >= arrayList.size()) {
                break;
            }
            mt9 mt9Var = (mt9) arrayList.get(i2);
            if (mt9Var.a == j) {
                if (mt9Var.e != i || (!mt9Var.i && z)) {
                    mt9Var.e = i;
                    mt9Var.i = true;
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }
}
