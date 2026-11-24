package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class vp9 {
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
    public final tp9 n = new tp9(this, (byte) 4);
    public final vf6 p = new vf6();

    public vp9(int i) {
        this.a = i;
        this.b = na7.q1(i).X3.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            up9 up9Var = (up9) arrayList.get(i);
            if (up9Var.b) {
                arrayList2.add(Long.valueOf(up9Var.a));
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
            up9 up9Var = (up9) arrayList.get(i);
            if (up9Var.b) {
                up9Var.b = false;
                arrayList3.add(up9Var);
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            up9 up9Var2 = (up9) arrayList.get(i2);
            int indexOf = arrayList2.indexOf(Long.valueOf(up9Var2.a));
            if (indexOf >= 0) {
                up9Var2.k = indexOf;
                up9Var2.b = true;
                arrayList4.add(up9Var2);
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        Collections.sort(arrayList, new fx7((byte) 13));
        Collections.sort(arrayList4, new fx7((byte) 14));
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
            ad7 Y = ad7.Y(i);
            Y.a.c(new tj9(this, Y, (byte) 10));
        }
        this.b = true;
        na7.q1(i).X3.edit().remove("savedMessagesUnsupported").apply();
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
        long e = y6c.h(this.a).e();
        ArrayList arrayList = this.j;
        if (arrayList.size() == 1 && ((up9) arrayList.get(0)).a == e) {
            return false;
        }
        return true;
    }

    public final void f(long j, p8c p8cVar) {
        up9 up9Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i < arrayList.size()) {
                up9Var = (up9) arrayList.get(i);
                if (up9Var.a == j) {
                    break;
                }
                i++;
            } else {
                up9Var = null;
                break;
            }
        }
        if (up9Var != null && up9Var.e > 0 && up9Var.i) {
            if (p8cVar != null) {
                p8cVar.a(Boolean.TRUE);
                return;
            }
            return;
        }
        vf6 vf6Var = this.p;
        ArrayList arrayList2 = (ArrayList) vf6Var.f(j);
        if (arrayList2 != null) {
            if (p8cVar != null) {
                arrayList2.add(p8cVar);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (p8cVar != null) {
            arrayList3.add(p8cVar);
        }
        vf6Var.k(arrayList3, j);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i2 = this.a;
        tL_messages_getSavedHistory.peer = na7.q1(i2).h1(j);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getSavedHistory, new eu2(this, j, (byte) 3));
    }

    public final void g(boolean z) {
        boolean z2;
        up9 up9Var;
        long j;
        this.m = z;
        if (!this.d && !this.f && !(z2 = this.k)) {
            boolean z3 = this.l;
            int i = this.a;
            if (!z3) {
                tp9 tp9Var = new tp9(this, (byte) 0);
                if (!z2) {
                    this.k = true;
                    long e = y6c.h(i).e();
                    ad7 Y = ad7.Y(i);
                    Y.a.c(new mx8(this, Y, e, tp9Var, (byte) 2));
                }
            } else if (!z) {
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.i;
                if (arrayList.isEmpty()) {
                    up9Var = null;
                } else {
                    up9Var = (up9) b00.f(1, arrayList);
                }
                if (up9Var != null) {
                    tL_messages_getSavedDialogs.offset_id = up9Var.c;
                    tL_messages_getSavedDialogs.offset_date = up9Var.c();
                    tL_messages_getSavedDialogs.offset_peer = na7.q1(i).h1(up9Var.a);
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
                    up9 up9Var2 = (up9) arrayList2.get(i2);
                    long j2 = tL_messages_getSavedDialogs.hash;
                    if (up9Var2.b) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    long r = hq6.r(j2, j);
                    tL_messages_getSavedDialogs.hash = r;
                    long r2 = hq6.r(r, Math.abs(up9Var2.a));
                    tL_messages_getSavedDialogs.hash = r2;
                    long r3 = hq6.r(r2, up9Var2.c);
                    tL_messages_getSavedDialogs.hash = r3;
                    tL_messages_getSavedDialogs.hash = hq6.r(r3, up9Var2.c());
                }
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_getSavedDialogs, new hj7(this, arrayList2, (byte) 19));
            }
        }
    }

    public final void h(TLRPC.Update update) {
        boolean z = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long n = cf3.n(((TLRPC.TL_dialogPeer) dialogPeer).peer);
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
                    arrayList2.add(Long.valueOf(cf3.n(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
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
            if (((up9) arrayList.get(i2)).a == j) {
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
            if (((up9) arrayList2.get(i4)).a == j) {
                arrayList2.remove(i4);
                i5++;
                i4--;
            }
            i4++;
        }
        while (true) {
            ArrayList arrayList3 = this.c;
            if (i < arrayList3.size()) {
                if (((up9) arrayList3.get(i)).a == j) {
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
        tp9 tp9Var = this.n;
        gl.r(tp9Var);
        gl.d3(tp9Var, 450L);
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
            up9 up9Var = (up9) arrayList.get(i);
            if (up9Var.b && !hashSet.contains(Long.valueOf(up9Var.a)) && !up9Var.d()) {
                arrayList3.add(up9Var);
                hashSet.add(Long.valueOf(up9Var.a));
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                break;
            }
            up9 up9Var2 = (up9) arrayList2.get(i2);
            if (up9Var2.b && !hashSet.contains(Long.valueOf(up9Var2.a)) && !up9Var2.d()) {
                arrayList3.add(up9Var2);
                hashSet.add(Long.valueOf(up9Var2.a));
            }
            i2++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            up9 up9Var3 = (up9) arrayList2.get(i3);
            if (!hashSet.contains(Long.valueOf(up9Var3.a)) && !up9Var3.d()) {
                arrayList4.add(up9Var3);
                hashSet.add(Long.valueOf(up9Var3.a));
            }
        }
        if (!this.f) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                up9 up9Var4 = (up9) arrayList.get(i4);
                if (!hashSet.contains(Long.valueOf(up9Var4.a)) && !up9Var4.d()) {
                    arrayList4.add(up9Var4);
                    hashSet.add(Long.valueOf(up9Var4.a));
                }
            }
        }
        Collections.sort(arrayList4, new fx7((byte) 15));
        arrayList3.addAll(arrayList4);
        int i5 = this.a;
        kk7.f(i5).k(kk7.h3, new Object[0]);
        if (!e() && na7.q1(i5).P3) {
            na7.q1(i5).T4(false);
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
        if (y6c.h(i).p()) {
            f = na7.q1(i).k4.i2.f();
        } else {
            f = na7.q1(i).k4.h2.f();
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
                tL_inputDialogPeer.peer = na7.q1(i2).h1(longValue);
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
        vf6 vf6Var;
        boolean z;
        ArrayList arrayList3;
        int i;
        boolean z2;
        int intValue;
        int i2 = 0;
        if (arrayList == null) {
            return false;
        }
        vf6 vf6Var2 = new vf6();
        vf6 vf6Var3 = new vf6();
        int i3 = this.a;
        long e = y6c.h(i3).e();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i4);
            long Q1 = k27.Q1(e, message);
            if (Q1 == e || (message.id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) vf6Var2.f(Q1);
                if (message2 == null || message2.id < message.id) {
                    vf6Var2.k(message, Q1);
                }
                Integer num = (Integer) vf6Var3.f(Q1);
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                vf6Var3.k(Integer.valueOf(intValue + 1), Q1);
            }
        }
        int i5 = 0;
        boolean z3 = false;
        while (i5 < vf6Var2.m()) {
            long j = vf6Var2.j(i5);
            TLRPC.Message message3 = (TLRPC.Message) vf6Var2.n(i5);
            Integer num2 = (Integer) vf6Var3.f(j);
            int i6 = i2;
            while (true) {
                arrayList2 = this.c;
                if (i6 < arrayList2.size()) {
                    up9 up9Var = (up9) arrayList2.get(i6);
                    vf6Var = vf6Var2;
                    if (up9Var.a == j) {
                        int i7 = up9Var.c;
                        int i8 = message3.id;
                        if (i7 < i8 || (i8 < 0 && message3.date > up9Var.c())) {
                            if (up9Var.c < message3.id) {
                                int i9 = 0;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    if (((TLRPC.Message) arrayList.get(i10)).id > up9Var.c) {
                                        i9++;
                                    }
                                }
                                up9Var.e += i9;
                            }
                            k27 k27Var = new k27(i3, message3, false, false);
                            up9Var.d = k27Var;
                            up9Var.c = k27Var.e1();
                            z3 = true;
                        }
                        int i11 = up9Var.e;
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), i11);
                        }
                        num2 = Integer.valueOf(i11);
                        z = true;
                    } else {
                        i6++;
                        vf6Var2 = vf6Var;
                    }
                } else {
                    vf6Var = vf6Var2;
                    z = false;
                    break;
                }
            }
            if (!z) {
                up9 a = up9.a(i3, message3);
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
                    up9 up9Var2 = (up9) arrayList3.get(i12);
                    if (up9Var2.a == j) {
                        int i13 = up9Var2.c;
                        int i14 = message3.id;
                        if (i13 >= i14 && (i14 >= 0 || message3.date <= up9Var2.c())) {
                            i = 0;
                        } else {
                            if (up9Var2.c < message3.id) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    if (((TLRPC.Message) arrayList.get(i16)).id > up9Var2.c) {
                                        i15++;
                                    }
                                }
                                up9Var2.e += i15;
                            }
                            i = 0;
                            k27 k27Var2 = new k27(i3, message3, false, false);
                            up9Var2.d = k27Var2;
                            up9Var2.c = k27Var2.e1();
                            z3 = true;
                        }
                        int i17 = up9Var2.e;
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
                up9 a2 = up9.a(i3, message3);
                if (num2 != null) {
                    a2.e = num2.intValue();
                }
                arrayList3.add(a2);
                z3 = true;
            }
            i5++;
            i2 = i;
            vf6Var2 = vf6Var;
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
            up9 up9Var = (up9) arrayList.get(i2);
            if (up9Var.a == j) {
                if (up9Var.e != i || (!up9Var.i && z)) {
                    up9Var.e = i;
                    up9Var.i = true;
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }
}
