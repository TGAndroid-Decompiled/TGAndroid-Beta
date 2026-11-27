package defpackage;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s10 extends iu5 {
    public final byte e;
    public final Object f;

    public s10(Object obj, byte b) {
        this.e = b;
        this.f = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, f89 f89Var) {
        switch (this.e) {
            case 0:
                super.a(recyclerView, f89Var);
                View view = f89Var.a;
                view.setPressed(false);
                view.setTag(2131296421, null);
                return;
            case 1:
                super.a(recyclerView, f89Var);
                f89Var.a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, f89Var);
                View view2 = f89Var.a;
                view2.setPressed(false);
                view2.setTag(2131296421, null);
                return;
            case 3:
                super.a(recyclerView, f89Var);
                View view3 = f89Var.a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 4:
                super.a(recyclerView, f89Var);
                f89Var.a.setPressed(false);
                return;
            case 5:
                super.a(recyclerView, f89Var);
                f89Var.a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, f89Var);
                f89Var.a.setPressed(false);
                return;
            case 7:
                super.a(recyclerView, f89Var);
                f89Var.a.setPressed(false);
                return;
            case 8:
                q9c q9cVar = (q9c) this.f;
                super.a(recyclerView, f89Var);
                View view4 = f89Var.a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof vg9) {
                    vg9 vg9Var = (vg9) view4.getBackground();
                    if (vg9Var.c) {
                        vg9Var.c = false;
                        vg9Var.invalidateSelf();
                    }
                }
                if (q9cVar.E1()) {
                    q9cVar.J1(f89Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(k43.h).start();
                    return;
                }
                return;
            default:
                super.a(recyclerView, f89Var);
                return;
        }
    }

    @Override
    public final int f(RecyclerView recyclerView, f89 f89Var) {
        mt9 v;
        byte b = this.e;
        int i = 15;
        Object obj = this.f;
        switch (b) {
            case 0:
                if (f89Var.f != 0) {
                    return 0;
                }
                return iu5.m(3, 0);
            case 1:
                gr0 gr0Var = (gr0) obj;
                if (gr0Var.a0.H.F1 && gr0Var.w.L(f89Var.b())) {
                    gr0Var.f.setItemAnimator(gr0Var.n);
                    return iu5.m(15, 0);
                }
                return iu5.m(0, 0);
            case 2:
                if (f89Var.f == 4 && ((re1) f89Var.a).H) {
                    return iu5.m(3, 0);
                }
                return iu5.m(0, 0);
            case 3:
                if (f89Var.f != 5) {
                    return iu5.m(0, 0);
                }
                return iu5.m(3, 0);
            case 4:
                if (f89Var.f == 1 && ((re1) f89Var.a).H) {
                    return iu5.m(3, 0);
                }
                return iu5.m(0, 0);
            case 5:
                if (f89Var.f == 5 && u(f89Var.b())) {
                    return iu5.m(3, 0);
                }
                return iu5.m(0, 0);
            case 6:
                aw9 aw9Var = (aw9) obj;
                if (f89Var.b() >= aw9Var.w && f89Var.b() < aw9Var.x) {
                    return iu5.m(3, 0);
                }
                return iu5.m(0, 0);
            case 7:
                int m = iu5.m(0, 0);
                eja ejaVar = ((pia) obj).y;
                if (ejaVar.F1 && recyclerView.getAdapter() != ejaVar.V && (v = v(f89Var)) != null && v.b) {
                    return iu5.m(3, 0);
                }
                return m;
            case 8:
                q9c q9cVar = (q9c) obj;
                if (q9cVar.k3 && q9cVar.g3.H(f89Var.b()) >= 0) {
                    boolean z = q9cVar.f3.o;
                    boolean z2 = q9cVar.j3;
                    if (!z) {
                        if (!z2) {
                            i = 12;
                        }
                    } else if (!z2) {
                        i = 3;
                    }
                    return iu5.m(i, 0);
                }
                return iu5.m(0, 0);
            default:
                if (((uic) obj).E.A(f89Var.b())) {
                    return iu5.m(12, 0);
                }
                return iu5.m(0, 0);
        }
    }

    @Override
    public final boolean l() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 1:
                return ((gr0) obj).a0.H.F1;
            case 5:
                return true;
            case 6:
                return ((aw9) obj).J.u();
            case 8:
                q9c q9cVar = (q9c) obj;
                if (q9cVar.k3 && q9cVar.m3) {
                    return true;
                }
                return false;
            default:
                return super.l();
        }
    }

    @Override
    public final void n(Canvas canvas, RecyclerView recyclerView, f89 f89Var, float f, float f2, int i, boolean z) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 8:
                q9c q9cVar = (q9c) obj;
                if (i != 2 || z || !q9cVar.E1()) {
                    super.n(canvas, recyclerView, f89Var, f, f2, i, z);
                    if (i == 2 && z) {
                        q9cVar.I1(f89Var);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                super.n(canvas, recyclerView, f89Var, f, f2, i, z);
                ((uic) obj).invalidate();
                return;
            default:
                super.n(canvas, recyclerView, f89Var, f, f2, i, z);
                return;
        }
    }

    @Override
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        byte b = this.e;
        Object obj = this.f;
        int i4 = 0;
        switch (b) {
            case 0:
                int b2 = f89Var.b();
                int b3 = f89Var2.b();
                j20 j20Var = (j20) obj;
                if (j20Var.o2) {
                    if (b2 <= 0 || b3 <= 0) {
                        return false;
                    }
                    j20Var.p2.c(b2 - 1, b3 - 1);
                } else {
                    j20Var.p2.c(b2, b3);
                }
                j20Var.q2.clear();
                j20Var.q2.addAll(j20Var.p2.c);
                j20Var.t1.j(b2, b3);
                return true;
            case 1:
                br0 br0Var = ((gr0) obj).w;
                if (!br0Var.L(f89Var.b()) || !br0Var.L(f89Var2.b())) {
                    return false;
                }
                int b4 = f89Var.b();
                int b5 = f89Var2.b();
                ArrayList arrayList2 = br0Var.n;
                o5b o5bVar = br0Var.e;
                if (o5bVar == null || b4 < 0 || b4 >= o5bVar.i.size() || b5 < 0 || b5 >= br0Var.e.i.size()) {
                    return true;
                }
                if (ik8.A(br0Var.e)) {
                    arrayList = new ArrayList();
                    for (int i5 = 0; i5 < br0Var.e.i.size(); i5++) {
                        arrayList.add(Integer.valueOf(((r47) br0Var.e.i.get(i5)).e1()));
                    }
                } else {
                    arrayList = new ArrayList(br0Var.e.g);
                }
                if (!br0Var.r) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    br0Var.r = true;
                }
                r47 r47Var = (r47) br0Var.e.i.get(b4);
                r47 r47Var2 = (r47) br0Var.e.i.get(b5);
                arrayList.remove(Integer.valueOf(r47Var.e1()));
                arrayList.add(Utilities.j(b5, arrayList.size(), 0), Integer.valueOf(r47Var.e1()));
                br0Var.e.C(arrayList, false);
                br0Var.j(b4, b5);
                return true;
            case 2:
                if (f89Var.f == f89Var2.f) {
                    View view = f89Var2.a;
                    if (!(view instanceof re1) || ((re1) view).H) {
                        oe1 oe1Var = ((ve1) obj).c;
                        int b6 = f89Var.b();
                        int b7 = f89Var2.b();
                        int i6 = b6 - 4;
                        int i7 = b7 - 4;
                        ve1 ve1Var = oe1Var.c;
                        ArrayList arrayList3 = ve1Var.w;
                        if (i6 >= arrayList3.size() || i7 >= arrayList3.size()) {
                            return true;
                        }
                        if (b6 != b7) {
                            ve1Var.d = true;
                        }
                        arrayList3.add(i7, (TLRPC.TL_username) arrayList3.remove(i6));
                        oe1Var.j(b6, b7);
                        int size = arrayList3.size();
                        int i8 = size + 3;
                        if (b6 != i8 && b7 != i8) {
                            return true;
                        }
                        oe1Var.h(b7, 3);
                        if (b7 == i8) {
                            i8 = size + 2;
                        }
                        oe1Var.h(i8, 3);
                        return true;
                    }
                }
                return false;
            case 3:
                if (f89Var.f != f89Var2.f) {
                    return false;
                }
                t20 t20Var = ((a72) obj).r;
                int b8 = f89Var.b();
                int b9 = f89Var2.b();
                a72 a72Var = (a72) t20Var.e;
                int i9 = a72Var.u0;
                ih8 ih8Var = a72Var.n1;
                int i10 = b8 - i9;
                int i11 = b9 - i9;
                if (i10 < 0 || i11 < 0 || i10 >= (i = a72Var.N) || i11 >= i) {
                    return true;
                }
                zg8 b10 = ih8Var.b(i10);
                SparseArray sparseArray = ih8Var.a;
                sparseArray.put(i10, ih8Var.b(i11));
                sparseArray.put(i11, b10);
                CharSequence[] charSequenceArr = a72Var.L;
                CharSequence charSequence = charSequenceArr[i10];
                charSequenceArr[i10] = charSequenceArr[i11];
                charSequenceArr[i11] = charSequence;
                boolean[] zArr = a72Var.M;
                boolean z = zArr[i10];
                zArr[i10] = zArr[i11];
                zArr[i11] = z;
                t20Var.j(b8, b9);
                return true;
            case 4:
                if (f89Var.f == f89Var2.f) {
                    View view2 = f89Var2.a;
                    if (!(view2 instanceof re1) || ((re1) view2).H) {
                        t92 t92Var = ((u92) obj).f3;
                        int b11 = f89Var.b();
                        int b12 = f89Var2.b();
                        int i12 = b11 - 1;
                        int i13 = b12 - 1;
                        u92 u92Var = t92Var.c;
                        v92 v92Var = u92Var.i3;
                        ArrayList arrayList4 = v92Var.O;
                        if (i12 >= v92Var.O.size() || i13 >= arrayList4.size()) {
                            return true;
                        }
                        if (b11 != b12) {
                            u92Var.g3 = true;
                        }
                        arrayList4.set(i12, (TLRPC.TL_username) arrayList4.get(i13));
                        arrayList4.set(i13, (TLRPC.TL_username) arrayList4.get(i12));
                        t92Var.j(b11, b12);
                        int size2 = arrayList4.size();
                        if (b11 != size2 && b12 != size2) {
                            return true;
                        }
                        t92Var.h(b11, 3);
                        t92Var.h(b12, 3);
                        return true;
                    }
                }
                return false;
            case 5:
                if (f89Var.f != f89Var2.f || !u(f89Var.b()) || !u(f89Var2.b())) {
                    return false;
                }
                uh8 uh8Var = ((wh8) obj).b;
                int b13 = f89Var.b();
                int b14 = f89Var2.b();
                wh8 wh8Var = uh8Var.d;
                int i14 = wh8Var.o0;
                int i15 = b13 - i14;
                int i16 = b14 - i14;
                if (i15 < 0 || i16 < 0 || i15 >= (i2 = wh8Var.E) || i16 >= i2) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = wh8Var.w;
                CharSequence charSequence2 = charSequenceArr2[i15];
                charSequenceArr2[i15] = charSequenceArr2[i16];
                charSequenceArr2[i16] = charSequence2;
                int[] iArr = wh8Var.r;
                if (iArr != null) {
                    int i17 = iArr[i15];
                    iArr[i15] = iArr[i16];
                    iArr[i16] = i17;
                }
                boolean[] zArr2 = wh8Var.x;
                boolean z2 = zArr2[i15];
                zArr2[i15] = zArr2[i16];
                zArr2[i16] = z2;
                uh8Var.j(b13, b14);
                return true;
            case 6:
                int b15 = f89Var2.b();
                aw9 aw9Var = (aw9) obj;
                ArrayList arrayList5 = aw9Var.e;
                if (b15 >= aw9Var.w && f89Var2.b() < aw9Var.x) {
                    int b16 = f89Var.b();
                    int b17 = f89Var2.b();
                    int i18 = aw9Var.w;
                    int i19 = b16 - i18;
                    int i20 = b17 - i18;
                    arrayList5.indexOf(Integer.valueOf(i19));
                    arrayList5.get(b16 - aw9Var.w);
                    r47 r47Var3 = (r47) arrayList5.get(i19);
                    r47 r47Var4 = (r47) arrayList5.get(i20);
                    arrayList5.set(i19, r47Var4);
                    arrayList5.set(i20, r47Var3);
                    lq3 q = lq3.q(aw9Var.d);
                    ArrayList arrayList6 = q.H;
                    int indexOf = arrayList6.indexOf(r47Var3);
                    int indexOf2 = arrayList6.indexOf(r47Var4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, r47Var4);
                        arrayList6.set(indexOf2, r47Var3);
                    }
                    q.y();
                    aw9Var.c.j(b16, b17);
                }
                return false;
            case 7:
                pia piaVar = (pia) obj;
                ArrayList arrayList7 = piaVar.f;
                eja ejaVar = piaVar.y;
                if (ejaVar.F1 && recyclerView.getAdapter() != ejaVar.V) {
                    mt9 v = v(f89Var);
                    mt9 v2 = v(f89Var2);
                    if (v != null && v2 != null && v.b && v2.b) {
                        int b18 = f89Var.b();
                        int b19 = f89Var2.b();
                        arrayList7.remove(b18);
                        arrayList7.add(b19, v);
                        piaVar.j(b18, b19);
                        piaVar.h = true;
                        return true;
                    }
                }
                return false;
            case 8:
                q9c q9cVar = (q9c) obj;
                l9c l9cVar = q9cVar.g3;
                if (l9cVar.H(f89Var.b()) < 0 || l9cVar.H(f89Var.b()) != l9cVar.H(f89Var2.b())) {
                    return false;
                }
                int b20 = f89Var.b();
                int b21 = f89Var2.b();
                ArrayList arrayList8 = l9cVar.E;
                if (l9cVar.N != null) {
                    int H = l9cVar.H(b20);
                    int H2 = l9cVar.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = l9cVar.J(b20);
                        boolean J2 = l9cVar.J(b21);
                        arrayList8.add(b21, (b8c) arrayList8.remove(b20));
                        l9cVar.j(b20, b21);
                        if (l9cVar.J(b21) != J) {
                            l9cVar.h(b21, 3);
                        }
                        if (l9cVar.J(b20) != J2) {
                            l9cVar.h(b20, 3);
                        }
                        if (l9cVar.M && (i3 = l9cVar.L) != H) {
                            l9cVar.F(i3);
                        }
                        l9cVar.M = true;
                        l9cVar.L = H;
                    }
                }
                q9cVar.L1();
                return true;
            default:
                int b22 = f89Var.b();
                int b23 = f89Var2.b();
                uic uicVar = (uic) obj;
                ArrayList arrayList9 = uicVar.h;
                if (!uicVar.E.A(b22) || !uicVar.E.A(b23)) {
                    return false;
                }
                Pattern pattern = Utilities.a;
                Object obj2 = arrayList9.get(b22);
                arrayList9.set(b22, arrayList9.get(b23));
                arrayList9.set(b23, obj2);
                uicVar.y.j(b22, b23);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i4 < size3) {
                    Object obj3 = arrayList9.get(i4);
                    i4++;
                    arrayList10.add(Integer.valueOf(((ric) obj3).a));
                }
                uicVar.E.L(arrayList10);
                return true;
        }
    }

    @Override
    public final void p(RecyclerView recyclerView, f89 f89Var, f89 f89Var2, int i, int i2, int i3) {
        switch (this.e) {
            case 2:
            case 8:
                return;
            default:
                super.p(recyclerView, f89Var, f89Var2, i, i2, i3);
                return;
        }
    }

    @Override
    public final void q(f89 f89Var, int i) {
        boolean z;
        jga jgaVar;
        byte b = this.e;
        Boolean bool = null;
        Object obj = this.f;
        switch (b) {
            case 0:
                q10 q10Var = ((j20) obj).r1;
                if (f89Var != null) {
                    q10Var.f1(false);
                }
                if (i != 0) {
                    q10Var.K0(false);
                    if (f89Var != null) {
                        f89Var.a.setPressed(true);
                    }
                }
                if (f89Var != null) {
                    View view = f89Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296421, bool);
                    return;
                }
                return;
            case 1:
                gr0 gr0Var = (gr0) obj;
                yq0 yq0Var = gr0Var.f;
                if (f89Var != null) {
                    yq0Var.f1(false);
                }
                if (i == 0) {
                    br0 br0Var = gr0Var.w;
                    ArrayList arrayList = br0Var.n;
                    if (br0Var.e != null && br0Var.r) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < br0Var.e.i.size(); i2++) {
                            arrayList2.add(Integer.valueOf(((r47) br0Var.e.i.get(i2)).e1()));
                        }
                        if (arrayList.size() != arrayList2.size()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < arrayList.size()) {
                                    if (arrayList.get(i3) != arrayList2.get(i3)) {
                                        z = true;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (z) {
                            br0Var.e.C(arrayList2, true);
                        }
                        br0Var.r = false;
                    }
                    yq0Var.setItemAnimator(null);
                    return;
                }
                yq0Var.K0(false);
                if (f89Var != null) {
                    f89Var.a.setPressed(true);
                    return;
                }
                return;
            case 2:
                ve1 ve1Var = (ve1) obj;
                if (i == 0) {
                    ve1Var.k0();
                } else {
                    ve1Var.b.K0(false);
                    f89Var.a.setPressed(true);
                }
                if (f89Var != null) {
                    View view2 = f89Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296421, bool);
                    return;
                }
                return;
            case 3:
                a72 a72Var = (a72) obj;
                qob qobVar = a72Var.s;
                if (i != 0) {
                    qobVar.setItemAnimator(a72Var.w);
                    qobVar.K0(false);
                    f89Var.a.setPressed(true);
                    yob.h(aob.h5, a72Var.a, f89Var.a);
                    return;
                }
                return;
            case 4:
                u92 u92Var = (u92) obj;
                v92 v92Var = u92Var.i3;
                if (i == 0) {
                    v92Var.M = false;
                    if (u92Var.g3) {
                        TLRPC.Chat chat = v92Var.Y;
                        ArrayList arrayList3 = v92Var.O;
                        ArrayList arrayList4 = v92Var.N;
                        if (chat != null) {
                            u92Var.g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = v92Var.Y;
                            tL_inputChannel.channel_id = chat2.id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                                if (((TLRPC.TL_username) arrayList4.get(i4)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList4.get(i4)).username);
                                }
                            }
                            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                if (((TLRPC.TL_username) arrayList3.get(i5)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList3.get(i5)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList5;
                            v92Var.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new xe2((byte) 0));
                            v92Var.Y.usernames.clear();
                            v92Var.Y.usernames.addAll(arrayList4);
                            v92Var.Y.usernames.addAll(arrayList3);
                            v92Var.getMessagesController().a4(v92Var.Y, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                v92Var.M = true;
                u92Var.K0(false);
                f89Var.a.setPressed(true);
                return;
            case 5:
                if (i != 0) {
                    ((wh8) obj).c.K0(false);
                    f89Var.a.setPressed(true);
                    return;
                }
                return;
            case 6:
                if (i != 0) {
                    ((aw9) obj).b.K0(false);
                    f89Var.a.setPressed(true);
                    return;
                }
                return;
            case 7:
                pia piaVar = (pia) obj;
                ux9 ux9Var = piaVar.n;
                if (f89Var != null && (jgaVar = piaVar.s) != null) {
                    jgaVar.f1(false);
                }
                if (i == 0) {
                    hl.r(ux9Var);
                    hl.d3(ux9Var, 300L);
                    return;
                }
                return;
            case 8:
                q9c q9cVar = (q9c) obj;
                if (f89Var != null) {
                    q9cVar.f1(false);
                }
                if (i == 0) {
                    l9c l9cVar = q9cVar.g3;
                    if (l9cVar.M) {
                        l9cVar.F(l9cVar.L);
                    }
                    if (q9cVar.l3 != null) {
                        q9cVar.H1();
                        q9cVar.l3 = null;
                        return;
                    }
                    return;
                }
                q9cVar.K0(false);
                if (f89Var != null) {
                    View view3 = f89Var.a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof vg9) {
                        vg9 vg9Var = (vg9) view3.getBackground();
                        if (!vg9Var.c) {
                            vg9Var.c = true;
                            vg9Var.invalidateSelf();
                        }
                    }
                    if (i == 2) {
                        q9cVar.l3 = f89Var;
                        q9cVar.K1(f89Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void r(f89 f89Var) {
        byte b = this.e;
    }

    public final boolean u(int i) {
        wh8 wh8Var = (wh8) this.f;
        if (!wh8Var.J || i - wh8Var.o0 >= wh8Var.y) {
            return true;
        }
        return false;
    }

    public final mt9 v(f89 f89Var) {
        int b;
        ArrayList arrayList = ((pia) this.f).f;
        if (f89Var != null && (b = f89Var.b()) >= 0 && b < arrayList.size()) {
            return (mt9) arrayList.get(b);
        }
        return null;
    }

    private final void A(f89 f89Var) {
    }

    private final void B(f89 f89Var) {
    }

    private final void C(f89 f89Var) {
    }

    private final void D(f89 f89Var) {
    }

    private final void E(f89 f89Var) {
    }

    private final void F(f89 f89Var) {
    }

    private final void G(f89 f89Var) {
    }

    private final void H(f89 f89Var) {
    }

    private final void y(f89 f89Var) {
    }

    private final void z(f89 f89Var) {
    }

    private final void w(RecyclerView recyclerView, f89 f89Var, f89 f89Var2, int i, int i2, int i3) {
    }

    private final void x(RecyclerView recyclerView, f89 f89Var, f89 f89Var2, int i, int i2, int i3) {
    }
}
