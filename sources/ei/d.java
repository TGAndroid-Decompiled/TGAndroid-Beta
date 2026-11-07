package ei;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.j6;
import di.q6;
import di.u5;
import java.util.ArrayList;
import java.util.regex.Pattern;
import li.y1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.uv;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.e61;
import org.telegram.ui.ea;
import org.telegram.ui.eo;
import org.telegram.ui.fo;
import org.telegram.ui.go;
import org.telegram.ui.ia;
import org.telegram.ui.l4;
import org.telegram.ui.la;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import v4.d1;
import v4.v;
public final class d extends v {
    public final int d;
    public final Object f10813e;

    public d(Object obj, int i7) {
        this.d = i7;
        this.f10813e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                d1Var.f56951a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, d1Var);
                View view = d1Var.f56951a;
                view.setPressed(false);
                view.setTag(2131296419, null);
                return;
            case 2:
                super.a(recyclerView, d1Var);
                d1Var.f56951a.setPressed(false);
                return;
            case 3:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f56951a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                return;
            case 4:
                super.a(recyclerView, d1Var);
                View view3 = d1Var.f56951a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 5:
                super.a(recyclerView, d1Var);
                d1Var.f56951a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, d1Var);
                d1Var.f56951a.setPressed(false);
                return;
            case 7:
                q41 q41Var = (q41) this.f10813e;
                super.a(recyclerView, d1Var);
                View view4 = d1Var.f56951a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof y1) {
                    y1 y1Var = (y1) view4.getBackground();
                    if (y1Var.f18994c) {
                        y1Var.f18994c = false;
                        y1Var.invalidateSelf();
                    }
                }
                if (q41Var.D1()) {
                    q41Var.I1(d1Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(xq.h).start();
                    return;
                }
                return;
            case 8:
            default:
                super.a(recyclerView, d1Var);
                return;
            case 9:
                super.a(recyclerView, d1Var);
                d1Var.f56951a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, d1 d1Var) {
        uv s5;
        switch (this.d) {
            case 0:
                n nVar = (n) this.f10813e;
                if (nVar.W.G.E1 && nVar.f10837w.L(d1Var.b())) {
                    nVar.f10833f.setItemAnimator(nVar.f10834n);
                    return v.l(15, 0);
                }
                return v.l(0, 0);
            case 1:
                if (d1Var.f56955f == 4 && ((ia) d1Var.f56951a).G) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 2:
                if (d1Var.f56955f == 1 && ((ia) d1Var.f56951a).G) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 3:
                if (d1Var.f56955f != 0) {
                    return 0;
                }
                return v.l(3, 0);
            case 4:
                if (d1Var.f56955f != 5) {
                    return v.l(0, 0);
                }
                return v.l(3, 0);
            case 5:
                int b10 = d1Var.b();
                dl0 dl0Var = (dl0) this.f10813e;
                if (b10 >= dl0Var.f33035w && d1Var.b() < dl0Var.f33036x) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 6:
                int l10 = v.l(0, 0);
                xs0 xs0Var = ((is0) this.f10813e).f34777y;
                if (xs0Var.E1 && recyclerView.getAdapter() != xs0Var.U && (s5 = s(d1Var)) != null && s5.f25895b) {
                    return v.l(3, 0);
                }
                return l10;
            case 7:
                q41 q41Var = (q41) this.f10813e;
                if (q41Var.j3 && q41Var.f37160f3.H(d1Var.b()) >= 0) {
                    int i7 = 15;
                    if (q41Var.f37159e3.f56920o == 0) {
                        if (!q41Var.f37163i3) {
                            i7 = 12;
                        }
                    } else if (!q41Var.f37163i3) {
                        i7 = 3;
                    }
                    return v.l(i7, 0);
                }
                return v.l(0, 0);
            case 8:
                if (((org.telegram.ui.Components.n) ((u61) this.f10813e).D).r(d1Var.b())) {
                    return v.l(12, 0);
                }
                return v.l(0, 0);
            default:
                if (d1Var.f56955f == 5 && r(d1Var.b())) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((n) this.f10813e).W.G.E1;
            case 5:
                return ((dl0) this.f10813e).I.i();
            case 7:
                q41 q41Var = (q41) this.f10813e;
                if (q41Var.j3 && q41Var.f37165l3) {
                    return true;
                }
                return false;
            case 9:
                return true;
            default:
                return super.k();
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, d1 d1Var, float f10, float f11, int i7, boolean z9) {
        switch (this.d) {
            case 7:
                q41 q41Var = (q41) this.f10813e;
                if (i7 != 2 || z9 || !q41Var.D1()) {
                    super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                    if (i7 == 2 && z9) {
                        q41Var.H1(d1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                ((u61) this.f10813e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, d1 d1Var, d1 d1Var2) {
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = 0;
        Object obj = this.f10813e;
        switch (i12) {
            case 0:
                i iVar = ((n) obj).f10837w;
                if (!iVar.L(d1Var.b()) || !iVar.L(d1Var2.b())) {
                    return false;
                }
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                ArrayList arrayList2 = iVar.f10825n;
                q6 q6Var = iVar.f10823e;
                if (q6Var == null || b10 < 0 || b10 >= q6Var.f9643i.size() || b11 < 0 || b11 >= iVar.f10823e.f9643i.size()) {
                    return true;
                }
                if (iVar.f10823e instanceof j6) {
                    arrayList = new ArrayList();
                    for (int i14 = 0; i14 < iVar.f10823e.f9643i.size(); i14++) {
                        arrayList.add(Integer.valueOf(((ij) iVar.f10823e.f9643i.get(i14)).f1()));
                    }
                } else {
                    arrayList = new ArrayList(iVar.f10823e.f9642g);
                }
                if (!iVar.f10826r) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    iVar.f10826r = true;
                }
                ij ijVar = (ij) iVar.f10823e.f9643i.get(b10);
                ij ijVar2 = (ij) iVar.f10823e.f9643i.get(b11);
                arrayList.remove(Integer.valueOf(ijVar.f1()));
                arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.f1()));
                iVar.f10823e.C(arrayList, false);
                iVar.j(b10, b11);
                return true;
            case 1:
                if (d1Var.f56955f == d1Var2.f56955f) {
                    View view = d1Var2.f56951a;
                    if (!(view instanceof ia) || ((ia) view).G) {
                        ea eaVar = ((la) obj).f47483c;
                        int b12 = d1Var.b();
                        int b13 = d1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        la laVar = eaVar.f45247c;
                        ArrayList arrayList3 = laVar.f47489w;
                        if (i15 >= arrayList3.size() || i16 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            laVar.d = true;
                        }
                        arrayList3.add(i16, (TLRPC.TL_username) arrayList3.remove(i15));
                        eaVar.j(b12, b13);
                        int size = arrayList3.size();
                        int i17 = size + 3;
                        if (b12 != i17 && b13 != i17) {
                            return true;
                        }
                        eaVar.h(b13, 3);
                        if (b13 == i17) {
                            i17 = size + 2;
                        }
                        eaVar.h(i17, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (d1Var.f56955f == d1Var2.f56955f) {
                    View view2 = d1Var2.f56951a;
                    if (!(view2 instanceof ia) || ((ia) view2).G) {
                        eo eoVar = ((fo) obj).f45679e3;
                        int b14 = d1Var.b();
                        int b15 = d1Var2.b();
                        int i18 = b14 - 1;
                        int i19 = b15 - 1;
                        fo foVar = eoVar.f45390c;
                        go goVar = foVar.f45682h3;
                        ArrayList arrayList4 = goVar.N;
                        if (i18 >= goVar.N.size() || i19 >= arrayList4.size()) {
                            return true;
                        }
                        if (b14 != b15) {
                            foVar.f45680f3 = true;
                        }
                        arrayList4.set(i18, (TLRPC.TL_username) arrayList4.get(i19));
                        arrayList4.set(i19, (TLRPC.TL_username) arrayList4.get(i18));
                        eoVar.j(b14, b15);
                        int size2 = arrayList4.size();
                        if (b14 != size2 && b15 != size2) {
                            return true;
                        }
                        eoVar.h(b14, 3);
                        eoVar.h(b15, 3);
                        return true;
                    }
                }
                return false;
            case 3:
                int b16 = d1Var.b();
                int b17 = d1Var2.b();
                b8 b8Var = (b8) obj;
                if (b8Var.f32075l2) {
                    if (b16 <= 0 || b17 <= 0) {
                        return false;
                    }
                    b8Var.f32077m2.c(b16 - 1, b17 - 1);
                } else {
                    b8Var.f32077m2.c(b16, b17);
                }
                b8Var.f32078n2.clear();
                b8Var.f32078n2.addAll(b8Var.f32077m2.f23741c);
                b8Var.f32083q1.j(b16, b17);
                return true;
            case 4:
                if (d1Var.f56955f != d1Var2.f56955f) {
                    return false;
                }
                l4 l4Var = ((bn) obj).f32237r;
                int b18 = d1Var.b();
                int b19 = d1Var2.b();
                bn bnVar = (bn) l4Var.f47405e;
                int i20 = bnVar.f32241t0;
                sh.d dVar = bnVar.f32228m1;
                int i21 = b18 - i20;
                int i22 = b19 - i20;
                if (i21 < 0 || i22 < 0 || i21 >= (i7 = bnVar.M) || i22 >= i7) {
                    return true;
                }
                sh.c b20 = dVar.b(i21);
                SparseArray sparseArray = dVar.f55202a;
                sparseArray.put(i21, dVar.b(i22));
                sparseArray.put(i22, b20);
                CharSequence[] charSequenceArr = bnVar.K;
                CharSequence charSequence = charSequenceArr[i21];
                charSequenceArr[i21] = charSequenceArr[i22];
                charSequenceArr[i22] = charSequence;
                boolean[] zArr = bnVar.L;
                boolean z9 = zArr[i21];
                zArr[i21] = zArr[i22];
                zArr[i22] = z9;
                l4Var.j(b18, b19);
                return true;
            case 5:
                int b21 = d1Var2.b();
                dl0 dl0Var = (dl0) obj;
                ArrayList arrayList5 = dl0Var.f33030e;
                if (b21 >= dl0Var.f33035w && d1Var2.b() < dl0Var.f33036x) {
                    int b22 = d1Var.b();
                    int b23 = d1Var2.b();
                    int i23 = dl0Var.f33035w;
                    int i24 = b22 - i23;
                    int i25 = b23 - i23;
                    arrayList5.indexOf(Integer.valueOf(i24));
                    arrayList5.get(b22 - dl0Var.f33035w);
                    ij ijVar3 = (ij) arrayList5.get(i24);
                    ij ijVar4 = (ij) arrayList5.get(i25);
                    arrayList5.set(i24, ijVar4);
                    arrayList5.set(i25, ijVar3);
                    z5 q10 = z5.q(dl0Var.d);
                    ArrayList arrayList6 = q10.G;
                    int indexOf = arrayList6.indexOf(ijVar3);
                    int indexOf2 = arrayList6.indexOf(ijVar4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, ijVar4);
                        arrayList6.set(indexOf2, ijVar3);
                    }
                    q10.y();
                    dl0Var.f33029c.j(b22, b23);
                }
                return false;
            case 6:
                is0 is0Var = (is0) obj;
                ArrayList arrayList7 = is0Var.f34771f;
                xs0 xs0Var = is0Var.f34777y;
                if (xs0Var.E1 && recyclerView.getAdapter() != xs0Var.U) {
                    uv s5 = s(d1Var);
                    uv s9 = s(d1Var2);
                    if (s5 != null && s9 != null && s5.f25895b && s9.f25895b) {
                        int b24 = d1Var.b();
                        int b25 = d1Var2.b();
                        arrayList7.remove(b24);
                        arrayList7.add(b25, s5);
                        is0Var.j(b24, b25);
                        is0Var.h = true;
                        return true;
                    }
                }
                return false;
            case 7:
                q41 q41Var = (q41) obj;
                l41 l41Var = q41Var.f37160f3;
                if (l41Var.H(d1Var.b()) < 0 || l41Var.H(d1Var.b()) != l41Var.H(d1Var2.b())) {
                    return false;
                }
                int b26 = d1Var.b();
                int b27 = d1Var2.b();
                ArrayList arrayList8 = l41Var.D;
                if (l41Var.M != null) {
                    int H = l41Var.H(b26);
                    int H2 = l41Var.H(b27);
                    if (H >= 0 && H == H2) {
                        boolean J = l41Var.J(b26);
                        boolean J2 = l41Var.J(b27);
                        arrayList8.add(b27, (x31) arrayList8.remove(b26));
                        l41Var.j(b26, b27);
                        if (l41Var.J(b27) != J) {
                            l41Var.h(b27, 3);
                        }
                        if (l41Var.J(b26) != J2) {
                            l41Var.h(b26, 3);
                        }
                        if (l41Var.L && (i10 = l41Var.K) != H) {
                            l41Var.F(i10);
                        }
                        l41Var.L = true;
                        l41Var.K = H;
                    }
                }
                q41Var.K1();
                return true;
            case 8:
                int b28 = d1Var.b();
                int b29 = d1Var2.b();
                u61 u61Var = (u61) obj;
                ArrayList arrayList9 = u61Var.h;
                if (!((org.telegram.ui.Components.n) u61Var.D).r(b28) || !((org.telegram.ui.Components.n) u61Var.D).r(b29)) {
                    return false;
                }
                Pattern pattern = Utilities.f21330a;
                Object obj2 = arrayList9.get(b28);
                arrayList9.set(b28, arrayList9.get(b29));
                arrayList9.set(b29, obj2);
                u61Var.f38537y.j(b28, b29);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i13 < size3) {
                    Object obj3 = arrayList9.get(i13);
                    i13++;
                    arrayList10.add(Integer.valueOf(((r61) obj3).f37511a));
                }
                m61 m61Var = ((v61) ((org.telegram.ui.Components.n) u61Var.D).f36142a).L;
                if (m61Var == null) {
                    return true;
                }
                m61Var.a(arrayList10);
                return true;
            default:
                if (d1Var.f56955f != d1Var2.f56955f || !r(d1Var.b()) || !r(d1Var2.b())) {
                    return false;
                }
                nr0 nr0Var = ((pr0) obj).f48914b;
                int b30 = d1Var.b();
                int b31 = d1Var2.b();
                pr0 pr0Var = nr0Var.d;
                int i26 = pr0Var.f48930n0;
                int i27 = b30 - i26;
                int i28 = b31 - i26;
                if (i27 < 0 || i28 < 0 || i27 >= (i11 = pr0Var.D) || i28 >= i11) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = pr0Var.f48941w;
                CharSequence charSequence2 = charSequenceArr2[i27];
                charSequenceArr2[i27] = charSequenceArr2[i28];
                charSequenceArr2[i28] = charSequence2;
                int[] iArr = pr0Var.f48934r;
                if (iArr != null) {
                    int i29 = iArr[i27];
                    iArr[i27] = iArr[i28];
                    iArr[i28] = i29;
                }
                boolean[] zArr2 = pr0Var.f48943x;
                boolean z10 = zArr2[i27];
                zArr2[i27] = zArr2[i28];
                zArr2[i28] = z10;
                nr0Var.j(b30, b31);
                return true;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i7, int i10, int i11) {
        switch (this.d) {
            case 1:
            case 7:
                return;
            default:
                super.o(recyclerView, d1Var, d1Var2, i7, i10, i11);
                return;
        }
    }

    @Override
    public void p(d1 d1Var, int i7) {
        ArrayList arrayList;
        boolean z9;
        rr0 rr0Var;
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f10813e;
        switch (i10) {
            case 0:
                n nVar = (n) obj;
                f fVar = nVar.f10833f;
                if (d1Var != null) {
                    fVar.d1(false);
                }
                if (i7 == 0) {
                    i iVar = nVar.f10837w;
                    ArrayList arrayList2 = iVar.f10825n;
                    q6 q6Var = iVar.f10823e;
                    if (q6Var != null && iVar.f10826r) {
                        if (q6Var instanceof j6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < iVar.f10823e.f9643i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((ij) iVar.f10823e.f9643i.get(i11)).f1()));
                            }
                        } else {
                            arrayList = q6Var.f9642g;
                        }
                        if (arrayList2.size() != arrayList.size()) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z9) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (arrayList2.get(i12) != arrayList.get(i12)) {
                                        z9 = true;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (z9) {
                            iVar.f10823e.C(arrayList, true);
                        }
                        iVar.f10826r = false;
                    }
                    fVar.setItemAnimator(null);
                    return;
                }
                fVar.I0(false);
                if (d1Var != null) {
                    d1Var.f56951a.setPressed(true);
                    return;
                }
                return;
            case 1:
                la laVar = (la) obj;
                if (i7 == 0) {
                    la.d0(laVar);
                } else {
                    laVar.f47482b.I0(false);
                    d1Var.f56951a.setPressed(true);
                }
                if (d1Var != null) {
                    View view = d1Var.f56951a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            case 2:
                fo foVar = (fo) obj;
                go goVar = foVar.f45682h3;
                if (i7 == 0) {
                    goVar.L = false;
                    if (foVar.f45680f3) {
                        TLRPC.Chat chat = goVar.X;
                        ArrayList arrayList3 = goVar.N;
                        ArrayList arrayList4 = goVar.M;
                        if (chat != null) {
                            foVar.f45680f3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = goVar.X;
                            tL_inputChannel.channel_id = chat2.f26953id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                                if (((TLRPC.TL_username) arrayList4.get(i13)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList4.get(i13)).username);
                                }
                            }
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                if (((TLRPC.TL_username) arrayList3.get(i14)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList3.get(i14)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList5;
                            goVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u5(16));
                            goVar.X.usernames.clear();
                            goVar.X.usernames.addAll(arrayList4);
                            goVar.X.usernames.addAll(arrayList3);
                            goVar.getMessagesController().Q3(goVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                goVar.L = true;
                foVar.I0(false);
                d1Var.f56951a.setPressed(true);
                return;
            case 3:
                n7 n7Var = ((b8) obj).f32079o1;
                if (d1Var != null) {
                    n7Var.d1(false);
                }
                if (i7 != 0) {
                    n7Var.I0(false);
                    if (d1Var != null) {
                        d1Var.f56951a.setPressed(true);
                    }
                }
                if (d1Var != null) {
                    View view2 = d1Var.f56951a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    return;
                }
                return;
            case 4:
                bn bnVar = (bn) obj;
                e61 e61Var = bnVar.f32239s;
                if (i7 != 0) {
                    e61Var.setItemAnimator(bnVar.f32244w);
                    e61Var.I0(false);
                    d1Var.f56951a.setPressed(true);
                    r6.i(k6.f27922h5, d1Var.f56951a, bnVar.f38968a);
                    return;
                }
                return;
            case 5:
                if (i7 != 0) {
                    ((dl0) obj).f33028b.I0(false);
                    d1Var.f56951a.setPressed(true);
                    return;
                }
                return;
            case 6:
                is0 is0Var = (is0) obj;
                ir0 ir0Var = is0Var.f34772n;
                if (d1Var != null && (rr0Var = is0Var.f34774s) != null) {
                    rr0Var.d1(false);
                }
                if (i7 == 0) {
                    g0.r(ir0Var);
                    g0.i3(ir0Var, 300L);
                    return;
                }
                return;
            case 7:
                q41 q41Var = (q41) obj;
                if (d1Var != null) {
                    q41Var.d1(false);
                }
                if (i7 == 0) {
                    l41 l41Var = q41Var.f37160f3;
                    if (l41Var.L) {
                        l41Var.F(l41Var.K);
                    }
                    if (q41Var.f37164k3 != null) {
                        q41Var.G1();
                        q41Var.f37164k3 = null;
                        return;
                    }
                    return;
                }
                q41Var.I0(false);
                if (d1Var != null) {
                    View view3 = d1Var.f56951a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof y1) {
                        y1 y1Var = (y1) view3.getBackground();
                        if (!y1Var.f18994c) {
                            y1Var.f18994c = true;
                            y1Var.invalidateSelf();
                        }
                    }
                    if (i7 == 2) {
                        q41Var.f37164k3 = d1Var;
                        q41Var.J1(d1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
            default:
                return;
            case 9:
                if (i7 != 0) {
                    ((pr0) obj).f48916c.I0(false);
                    d1Var.f56951a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(d1 d1Var) {
        int i7 = this.d;
    }

    public boolean r(int i7) {
        pr0 pr0Var = (pr0) this.f10813e;
        if (!pr0Var.I || i7 - pr0Var.f48930n0 >= pr0Var.f48945y) {
            return true;
        }
        return false;
    }

    public uv s(d1 d1Var) {
        int b10;
        is0 is0Var = (is0) this.f10813e;
        if (d1Var == null || (b10 = d1Var.b()) < 0 || b10 >= is0Var.f34771f.size()) {
            return null;
        }
        return (uv) is0Var.f34771f.get(b10);
    }

    private final void A(d1 d1Var) {
    }

    private final void B(d1 d1Var) {
    }

    private final void C(d1 d1Var) {
    }

    private final void D(d1 d1Var) {
    }

    private final void E(d1 d1Var) {
    }

    private final void v(d1 d1Var) {
    }

    private final void w(d1 d1Var) {
    }

    private final void x(d1 d1Var) {
    }

    private final void y(d1 d1Var) {
    }

    private final void z(d1 d1Var) {
    }

    private final void t(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i7, int i10, int i11) {
    }

    private final void u(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i7, int i10, int i11) {
    }
}
