package defpackage;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r10 extends fs5 {
    public final byte e;
    public final Object f;

    public r10(Object obj, byte b) {
        this.e = b;
        this.f = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        switch (this.e) {
            case 0:
                super.a(recyclerView, s49Var);
                View view = s49Var.a;
                view.setPressed(false);
                view.setTag(2131296421, null);
                return;
            case 1:
                super.a(recyclerView, s49Var);
                s49Var.a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, s49Var);
                View view2 = s49Var.a;
                view2.setPressed(false);
                view2.setTag(2131296421, null);
                return;
            case 3:
                super.a(recyclerView, s49Var);
                View view3 = s49Var.a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 4:
                super.a(recyclerView, s49Var);
                s49Var.a.setPressed(false);
                return;
            case 5:
                super.a(recyclerView, s49Var);
                s49Var.a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, s49Var);
                s49Var.a.setPressed(false);
                return;
            case 7:
                super.a(recyclerView, s49Var);
                s49Var.a.setPressed(false);
                return;
            case 8:
                q5c q5cVar = (q5c) this.f;
                super.a(recyclerView, s49Var);
                View view4 = s49Var.a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof ed9) {
                    ed9 ed9Var = (ed9) view4.getBackground();
                    if (ed9Var.c) {
                        ed9Var.c = false;
                        ed9Var.invalidateSelf();
                    }
                }
                if (q5cVar.D1()) {
                    q5cVar.I1(s49Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(s33.h).start();
                    return;
                }
                return;
            default:
                super.a(recyclerView, s49Var);
                return;
        }
    }

    @Override
    public final int f(RecyclerView recyclerView, s49 s49Var) {
        up9 v;
        byte b = this.e;
        int i = 15;
        Object obj = this.f;
        switch (b) {
            case 0:
                if (s49Var.f != 0) {
                    return 0;
                }
                return fs5.m(3, 0);
            case 1:
                gr0 gr0Var = (gr0) obj;
                if (gr0Var.a0.H.F1 && gr0Var.w.L(s49Var.b())) {
                    gr0Var.f.setItemAnimator(gr0Var.n);
                    return fs5.m(15, 0);
                }
                return fs5.m(0, 0);
            case 2:
                if (s49Var.f == 4 && ((ie1) s49Var.a).H) {
                    return fs5.m(3, 0);
                }
                return fs5.m(0, 0);
            case 3:
                if (s49Var.f != 5) {
                    return fs5.m(0, 0);
                }
                return fs5.m(3, 0);
            case 4:
                if (s49Var.f == 1 && ((ie1) s49Var.a).H) {
                    return fs5.m(3, 0);
                }
                return fs5.m(0, 0);
            case 5:
                if (s49Var.f == 5 && u(s49Var.b())) {
                    return fs5.m(3, 0);
                }
                return fs5.m(0, 0);
            case 6:
                hs9 hs9Var = (hs9) obj;
                if (s49Var.b() >= hs9Var.w && s49Var.b() < hs9Var.x) {
                    return fs5.m(3, 0);
                }
                return fs5.m(0, 0);
            case 7:
                int m = fs5.m(0, 0);
                nfa nfaVar = ((yea) obj).y;
                if (nfaVar.F1 && recyclerView.getAdapter() != nfaVar.V && (v = v(s49Var)) != null && v.b) {
                    return fs5.m(3, 0);
                }
                return m;
            case 8:
                q5c q5cVar = (q5c) obj;
                if (q5cVar.k3 && q5cVar.g3.H(s49Var.b()) >= 0) {
                    boolean z = q5cVar.f3.o;
                    boolean z2 = q5cVar.j3;
                    if (!z) {
                        if (!z2) {
                            i = 12;
                        }
                    } else if (!z2) {
                        i = 3;
                    }
                    return fs5.m(i, 0);
                }
                return fs5.m(0, 0);
            default:
                if (((vec) obj).E.B(s49Var.b())) {
                    return fs5.m(12, 0);
                }
                return fs5.m(0, 0);
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
                return ((hs9) obj).J.t();
            case 8:
                q5c q5cVar = (q5c) obj;
                if (q5cVar.k3 && q5cVar.m3) {
                    return true;
                }
                return false;
            default:
                return super.l();
        }
    }

    @Override
    public final void n(Canvas canvas, RecyclerView recyclerView, s49 s49Var, float f, float f2, int i, boolean z) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 8:
                q5c q5cVar = (q5c) obj;
                if (i != 2 || z || !q5cVar.D1()) {
                    super.n(canvas, recyclerView, s49Var, f, f2, i, z);
                    if (i == 2 && z) {
                        q5cVar.H1(s49Var);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                super.n(canvas, recyclerView, s49Var, f, f2, i, z);
                ((vec) obj).invalidate();
                return;
            default:
                super.n(canvas, recyclerView, s49Var, f, f2, i, z);
                return;
        }
    }

    @Override
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        byte b = this.e;
        Object obj = this.f;
        int i4 = 0;
        switch (b) {
            case 0:
                int b2 = s49Var.b();
                int b3 = s49Var2.b();
                i20 i20Var = (i20) obj;
                if (i20Var.o2) {
                    if (b2 <= 0 || b3 <= 0) {
                        return false;
                    }
                    i20Var.p2.c(b2 - 1, b3 - 1);
                } else {
                    i20Var.p2.c(b2, b3);
                }
                i20Var.q2.clear();
                i20Var.q2.addAll(i20Var.p2.c);
                i20Var.t1.j(b2, b3);
                return true;
            case 1:
                br0 br0Var = ((gr0) obj).w;
                if (!br0Var.L(s49Var.b()) || !br0Var.L(s49Var2.b())) {
                    return false;
                }
                int b4 = s49Var.b();
                int b5 = s49Var2.b();
                ArrayList arrayList2 = br0Var.n;
                s1b s1bVar = br0Var.e;
                if (s1bVar == null || b4 < 0 || b4 >= s1bVar.i.size() || b5 < 0 || b5 >= br0Var.e.i.size()) {
                    return true;
                }
                if (ug8.A(br0Var.e)) {
                    arrayList = new ArrayList();
                    for (int i5 = 0; i5 < br0Var.e.i.size(); i5++) {
                        arrayList.add(Integer.valueOf(((k27) br0Var.e.i.get(i5)).e1()));
                    }
                } else {
                    arrayList = new ArrayList(br0Var.e.g);
                }
                if (!br0Var.r) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    br0Var.r = true;
                }
                k27 k27Var = (k27) br0Var.e.i.get(b4);
                k27 k27Var2 = (k27) br0Var.e.i.get(b5);
                arrayList.remove(Integer.valueOf(k27Var.e1()));
                arrayList.add(Utilities.j(b5, arrayList.size(), 0), Integer.valueOf(k27Var.e1()));
                br0Var.e.C(arrayList, false);
                br0Var.j(b4, b5);
                return true;
            case 2:
                if (s49Var.f == s49Var2.f) {
                    View view = s49Var2.a;
                    if (!(view instanceof ie1) || ((ie1) view).H) {
                        fe1 fe1Var = ((me1) obj).c;
                        int b6 = s49Var.b();
                        int b7 = s49Var2.b();
                        int i6 = b6 - 4;
                        int i7 = b7 - 4;
                        me1 me1Var = fe1Var.c;
                        ArrayList arrayList3 = me1Var.w;
                        if (i6 >= arrayList3.size() || i7 >= arrayList3.size()) {
                            return true;
                        }
                        if (b6 != b7) {
                            me1Var.d = true;
                        }
                        arrayList3.add(i7, (TLRPC.TL_username) arrayList3.remove(i6));
                        fe1Var.j(b6, b7);
                        int size = arrayList3.size();
                        int i8 = size + 3;
                        if (b6 != i8 && b7 != i8) {
                            return true;
                        }
                        fe1Var.h(b7, 3);
                        if (b7 == i8) {
                            i8 = size + 2;
                        }
                        fe1Var.h(i8, 3);
                        return true;
                    }
                }
                return false;
            case 3:
                if (s49Var.f != s49Var2.f) {
                    return false;
                }
                s20 s20Var = ((k62) obj).r;
                int b8 = s49Var.b();
                int b9 = s49Var2.b();
                k62 k62Var = (k62) s20Var.e;
                int i9 = k62Var.u0;
                ud8 ud8Var = k62Var.n1;
                int i10 = b8 - i9;
                int i11 = b9 - i9;
                if (i10 < 0 || i11 < 0 || i10 >= (i = k62Var.N) || i11 >= i) {
                    return true;
                }
                ld8 b10 = ud8Var.b(i10);
                SparseArray sparseArray = ud8Var.a;
                sparseArray.put(i10, ud8Var.b(i11));
                sparseArray.put(i11, b10);
                CharSequence[] charSequenceArr = k62Var.L;
                CharSequence charSequence = charSequenceArr[i10];
                charSequenceArr[i10] = charSequenceArr[i11];
                charSequenceArr[i11] = charSequence;
                boolean[] zArr = k62Var.M;
                boolean z = zArr[i10];
                zArr[i10] = zArr[i11];
                zArr[i11] = z;
                s20Var.j(b8, b9);
                return true;
            case 4:
                if (s49Var.f == s49Var2.f) {
                    View view2 = s49Var2.a;
                    if (!(view2 instanceof ie1) || ((ie1) view2).H) {
                        d92 d92Var = ((e92) obj).f3;
                        int b11 = s49Var.b();
                        int b12 = s49Var2.b();
                        int i12 = b11 - 1;
                        int i13 = b12 - 1;
                        e92 e92Var = d92Var.c;
                        f92 f92Var = e92Var.i3;
                        ArrayList arrayList4 = f92Var.O;
                        if (i12 >= f92Var.O.size() || i13 >= arrayList4.size()) {
                            return true;
                        }
                        if (b11 != b12) {
                            e92Var.g3 = true;
                        }
                        arrayList4.set(i12, (TLRPC.TL_username) arrayList4.get(i13));
                        arrayList4.set(i13, (TLRPC.TL_username) arrayList4.get(i12));
                        d92Var.j(b11, b12);
                        int size2 = arrayList4.size();
                        if (b11 != size2 && b12 != size2) {
                            return true;
                        }
                        d92Var.h(b11, 3);
                        d92Var.h(b12, 3);
                        return true;
                    }
                }
                return false;
            case 5:
                if (s49Var.f != s49Var2.f || !u(s49Var.b()) || !u(s49Var2.b())) {
                    return false;
                }
                ge8 ge8Var = ((ie8) obj).b;
                int b13 = s49Var.b();
                int b14 = s49Var2.b();
                ie8 ie8Var = ge8Var.d;
                int i14 = ie8Var.o0;
                int i15 = b13 - i14;
                int i16 = b14 - i14;
                if (i15 < 0 || i16 < 0 || i15 >= (i2 = ie8Var.E) || i16 >= i2) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = ie8Var.w;
                CharSequence charSequence2 = charSequenceArr2[i15];
                charSequenceArr2[i15] = charSequenceArr2[i16];
                charSequenceArr2[i16] = charSequence2;
                int[] iArr = ie8Var.r;
                if (iArr != null) {
                    int i17 = iArr[i15];
                    iArr[i15] = iArr[i16];
                    iArr[i16] = i17;
                }
                boolean[] zArr2 = ie8Var.x;
                boolean z2 = zArr2[i15];
                zArr2[i15] = zArr2[i16];
                zArr2[i16] = z2;
                ge8Var.j(b13, b14);
                return true;
            case 6:
                int b15 = s49Var2.b();
                hs9 hs9Var = (hs9) obj;
                ArrayList arrayList5 = hs9Var.e;
                if (b15 >= hs9Var.w && s49Var2.b() < hs9Var.x) {
                    int b16 = s49Var.b();
                    int b17 = s49Var2.b();
                    int i18 = hs9Var.w;
                    int i19 = b16 - i18;
                    int i20 = b17 - i18;
                    arrayList5.indexOf(Integer.valueOf(i19));
                    arrayList5.get(b16 - hs9Var.w);
                    k27 k27Var3 = (k27) arrayList5.get(i19);
                    k27 k27Var4 = (k27) arrayList5.get(i20);
                    arrayList5.set(i19, k27Var4);
                    arrayList5.set(i20, k27Var3);
                    up3 q = up3.q(hs9Var.d);
                    ArrayList arrayList6 = q.H;
                    int indexOf = arrayList6.indexOf(k27Var3);
                    int indexOf2 = arrayList6.indexOf(k27Var4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, k27Var4);
                        arrayList6.set(indexOf2, k27Var3);
                    }
                    q.y();
                    hs9Var.c.j(b16, b17);
                }
                return false;
            case 7:
                yea yeaVar = (yea) obj;
                ArrayList arrayList7 = yeaVar.f;
                nfa nfaVar = yeaVar.y;
                if (nfaVar.F1 && recyclerView.getAdapter() != nfaVar.V) {
                    up9 v = v(s49Var);
                    up9 v2 = v(s49Var2);
                    if (v != null && v2 != null && v.b && v2.b) {
                        int b18 = s49Var.b();
                        int b19 = s49Var2.b();
                        arrayList7.remove(b18);
                        arrayList7.add(b19, v);
                        yeaVar.j(b18, b19);
                        yeaVar.h = true;
                        return true;
                    }
                }
                return false;
            case 8:
                q5c q5cVar = (q5c) obj;
                l5c l5cVar = q5cVar.g3;
                if (l5cVar.H(s49Var.b()) < 0 || l5cVar.H(s49Var.b()) != l5cVar.H(s49Var2.b())) {
                    return false;
                }
                int b20 = s49Var.b();
                int b21 = s49Var2.b();
                ArrayList arrayList8 = l5cVar.E;
                if (l5cVar.N != null) {
                    int H = l5cVar.H(b20);
                    int H2 = l5cVar.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = l5cVar.J(b20);
                        boolean J2 = l5cVar.J(b21);
                        arrayList8.add(b21, (c4c) arrayList8.remove(b20));
                        l5cVar.j(b20, b21);
                        if (l5cVar.J(b21) != J) {
                            l5cVar.h(b21, 3);
                        }
                        if (l5cVar.J(b20) != J2) {
                            l5cVar.h(b20, 3);
                        }
                        if (l5cVar.M && (i3 = l5cVar.L) != H) {
                            l5cVar.F(i3);
                        }
                        l5cVar.M = true;
                        l5cVar.L = H;
                    }
                }
                q5cVar.K1();
                return true;
            default:
                int b22 = s49Var.b();
                int b23 = s49Var2.b();
                vec vecVar = (vec) obj;
                ArrayList arrayList9 = vecVar.h;
                if (!vecVar.E.B(b22) || !vecVar.E.B(b23)) {
                    return false;
                }
                Pattern pattern = Utilities.a;
                Object obj2 = arrayList9.get(b22);
                arrayList9.set(b22, arrayList9.get(b23));
                arrayList9.set(b23, obj2);
                vecVar.y.j(b22, b23);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i4 < size3) {
                    Object obj3 = arrayList9.get(i4);
                    i4++;
                    arrayList10.add(Integer.valueOf(((sec) obj3).a));
                }
                vecVar.E.N(arrayList10);
                return true;
        }
    }

    @Override
    public final void p(RecyclerView recyclerView, s49 s49Var, s49 s49Var2, int i, int i2, int i3) {
        switch (this.e) {
            case 2:
            case 8:
                return;
            default:
                super.p(recyclerView, s49Var, s49Var2, i, i2, i3);
                return;
        }
    }

    @Override
    public final void q(s49 s49Var, int i) {
        boolean z;
        sca scaVar;
        byte b = this.e;
        Boolean bool = null;
        Object obj = this.f;
        switch (b) {
            case 0:
                p10 p10Var = ((i20) obj).r1;
                if (s49Var != null) {
                    p10Var.e1(false);
                }
                if (i != 0) {
                    p10Var.J0(false);
                    if (s49Var != null) {
                        s49Var.a.setPressed(true);
                    }
                }
                if (s49Var != null) {
                    View view = s49Var.a;
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
                if (s49Var != null) {
                    yq0Var.e1(false);
                }
                if (i == 0) {
                    br0 br0Var = gr0Var.w;
                    ArrayList arrayList = br0Var.n;
                    if (br0Var.e != null && br0Var.r) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < br0Var.e.i.size(); i2++) {
                            arrayList2.add(Integer.valueOf(((k27) br0Var.e.i.get(i2)).e1()));
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
                yq0Var.J0(false);
                if (s49Var != null) {
                    s49Var.a.setPressed(true);
                    return;
                }
                return;
            case 2:
                me1 me1Var = (me1) obj;
                if (i == 0) {
                    me1Var.k0();
                } else {
                    me1Var.b.J0(false);
                    s49Var.a.setPressed(true);
                }
                if (s49Var != null) {
                    View view2 = s49Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296421, bool);
                    return;
                }
                return;
            case 3:
                k62 k62Var = (k62) obj;
                rkb rkbVar = k62Var.s;
                if (i != 0) {
                    rkbVar.setItemAnimator(k62Var.w);
                    rkbVar.J0(false);
                    s49Var.a.setPressed(true);
                    zkb.h(bkb.g5, k62Var.a, s49Var.a);
                    return;
                }
                return;
            case 4:
                e92 e92Var = (e92) obj;
                f92 f92Var = e92Var.i3;
                if (i == 0) {
                    f92Var.M = false;
                    if (e92Var.g3) {
                        TLRPC.Chat chat = f92Var.Y;
                        ArrayList arrayList3 = f92Var.O;
                        ArrayList arrayList4 = f92Var.N;
                        if (chat != null) {
                            e92Var.g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = f92Var.Y;
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
                            f92Var.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new ce2((byte) 0));
                            f92Var.Y.usernames.clear();
                            f92Var.Y.usernames.addAll(arrayList4);
                            f92Var.Y.usernames.addAll(arrayList3);
                            f92Var.getMessagesController().S3(f92Var.Y, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                f92Var.M = true;
                e92Var.J0(false);
                s49Var.a.setPressed(true);
                return;
            case 5:
                if (i != 0) {
                    ((ie8) obj).c.J0(false);
                    s49Var.a.setPressed(true);
                    return;
                }
                return;
            case 6:
                if (i != 0) {
                    ((hs9) obj).b.J0(false);
                    s49Var.a.setPressed(true);
                    return;
                }
                return;
            case 7:
                yea yeaVar = (yea) obj;
                z6a z6aVar = yeaVar.n;
                if (s49Var != null && (scaVar = yeaVar.s) != null) {
                    scaVar.e1(false);
                }
                if (i == 0) {
                    gl.r(z6aVar);
                    gl.e3(z6aVar, 300L);
                    return;
                }
                return;
            case 8:
                q5c q5cVar = (q5c) obj;
                if (s49Var != null) {
                    q5cVar.e1(false);
                }
                if (i == 0) {
                    l5c l5cVar = q5cVar.g3;
                    if (l5cVar.M) {
                        l5cVar.F(l5cVar.L);
                    }
                    if (q5cVar.l3 != null) {
                        q5cVar.G1();
                        q5cVar.l3 = null;
                        return;
                    }
                    return;
                }
                q5cVar.J0(false);
                if (s49Var != null) {
                    View view3 = s49Var.a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof ed9) {
                        ed9 ed9Var = (ed9) view3.getBackground();
                        if (!ed9Var.c) {
                            ed9Var.c = true;
                            ed9Var.invalidateSelf();
                        }
                    }
                    if (i == 2) {
                        q5cVar.l3 = s49Var;
                        q5cVar.J1(s49Var);
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
    public final void r(s49 s49Var) {
        byte b = this.e;
    }

    public final boolean u(int i) {
        ie8 ie8Var = (ie8) this.f;
        if (!ie8Var.J || i - ie8Var.o0 >= ie8Var.y) {
            return true;
        }
        return false;
    }

    public final up9 v(s49 s49Var) {
        int b;
        ArrayList arrayList = ((yea) this.f).f;
        if (s49Var != null && (b = s49Var.b()) >= 0 && b < arrayList.size()) {
            return (up9) arrayList.get(b);
        }
        return null;
    }

    private final void A(s49 s49Var) {
    }

    private final void B(s49 s49Var) {
    }

    private final void C(s49 s49Var) {
    }

    private final void D(s49 s49Var) {
    }

    private final void E(s49 s49Var) {
    }

    private final void F(s49 s49Var) {
    }

    private final void G(s49 s49Var) {
    }

    private final void H(s49 s49Var) {
    }

    private final void y(s49 s49Var) {
    }

    private final void z(s49 s49Var) {
    }

    private final void w(RecyclerView recyclerView, s49 s49Var, s49 s49Var2, int i, int i2, int i3) {
    }

    private final void x(RecyclerView recyclerView, s49 s49Var, s49 s49Var2, int i, int i2, int i3) {
    }
}
