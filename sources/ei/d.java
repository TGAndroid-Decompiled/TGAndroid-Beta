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
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w31;
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
                d1Var.f56952a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, d1Var);
                View view = d1Var.f56952a;
                view.setPressed(false);
                view.setTag(2131296419, null);
                return;
            case 2:
                super.a(recyclerView, d1Var);
                d1Var.f56952a.setPressed(false);
                return;
            case 3:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f56952a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                return;
            case 4:
                super.a(recyclerView, d1Var);
                View view3 = d1Var.f56952a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 5:
                super.a(recyclerView, d1Var);
                d1Var.f56952a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, d1Var);
                d1Var.f56952a.setPressed(false);
                return;
            case 7:
                p41 p41Var = (p41) this.f10813e;
                super.a(recyclerView, d1Var);
                View view4 = d1Var.f56952a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof y1) {
                    y1 y1Var = (y1) view4.getBackground();
                    if (y1Var.f18994c) {
                        y1Var.f18994c = false;
                        y1Var.invalidateSelf();
                    }
                }
                if (p41Var.D1()) {
                    p41Var.I1(d1Var);
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
                d1Var.f56952a.setPressed(false);
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
                if (d1Var.f56956f == 4 && ((ia) d1Var.f56952a).G) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 2:
                if (d1Var.f56956f == 1 && ((ia) d1Var.f56952a).G) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 3:
                if (d1Var.f56956f != 0) {
                    return 0;
                }
                return v.l(3, 0);
            case 4:
                if (d1Var.f56956f != 5) {
                    return v.l(0, 0);
                }
                return v.l(3, 0);
            case 5:
                int b10 = d1Var.b();
                dl0 dl0Var = (dl0) this.f10813e;
                if (b10 >= dl0Var.f33006w && d1Var.b() < dl0Var.f33007x) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 6:
                int l10 = v.l(0, 0);
                xs0 xs0Var = ((is0) this.f10813e).f34747y;
                if (xs0Var.E1 && recyclerView.getAdapter() != xs0Var.U && (s5 = s(d1Var)) != null && s5.f25887b) {
                    return v.l(3, 0);
                }
                return l10;
            case 7:
                p41 p41Var = (p41) this.f10813e;
                if (p41Var.j3 && p41Var.f36781f3.H(d1Var.b()) >= 0) {
                    int i7 = 15;
                    if (p41Var.f36780e3.f56921o == 0) {
                        if (!p41Var.f36784i3) {
                            i7 = 12;
                        }
                    } else if (!p41Var.f36784i3) {
                        i7 = 3;
                    }
                    return v.l(i7, 0);
                }
                return v.l(0, 0);
            case 8:
                if (((org.telegram.ui.Components.n) ((t61) this.f10813e).D).r(d1Var.b())) {
                    return v.l(12, 0);
                }
                return v.l(0, 0);
            default:
                if (d1Var.f56956f == 5 && r(d1Var.b())) {
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
                p41 p41Var = (p41) this.f10813e;
                if (p41Var.j3 && p41Var.f36786l3) {
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
                p41 p41Var = (p41) this.f10813e;
                if (i7 != 2 || z9 || !p41Var.D1()) {
                    super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                    if (i7 == 2 && z9) {
                        p41Var.H1(d1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                ((t61) this.f10813e).invalidate();
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
                if (d1Var.f56956f == d1Var2.f56956f) {
                    View view = d1Var2.f56952a;
                    if (!(view instanceof ia) || ((ia) view).G) {
                        ea eaVar = ((la) obj).f47484c;
                        int b12 = d1Var.b();
                        int b13 = d1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        la laVar = eaVar.f45248c;
                        ArrayList arrayList3 = laVar.f47490w;
                        if (i15 >= arrayList3.size() || i16 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            laVar.d = true;
                        }
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i16));
                        arrayList3.set(i16, (TLRPC.TL_username) arrayList3.get(i15));
                        eaVar.j(b12, b13);
                        int size = arrayList3.size() + 3;
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        eaVar.h(b12, 3);
                        eaVar.h(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (d1Var.f56956f == d1Var2.f56956f) {
                    View view2 = d1Var2.f56952a;
                    if (!(view2 instanceof ia) || ((ia) view2).G) {
                        eo eoVar = ((fo) obj).f45680e3;
                        int b14 = d1Var.b();
                        int b15 = d1Var2.b();
                        int i17 = b14 - 1;
                        int i18 = b15 - 1;
                        fo foVar = eoVar.f45391c;
                        go goVar = foVar.f45683h3;
                        ArrayList arrayList4 = goVar.N;
                        if (i17 >= goVar.N.size() || i18 >= arrayList4.size()) {
                            return true;
                        }
                        if (b14 != b15) {
                            foVar.f45681f3 = true;
                        }
                        arrayList4.set(i17, (TLRPC.TL_username) arrayList4.get(i18));
                        arrayList4.set(i18, (TLRPC.TL_username) arrayList4.get(i17));
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
                if (b8Var.f32041l2) {
                    if (b16 <= 0 || b17 <= 0) {
                        return false;
                    }
                    b8Var.f32043m2.c(b16 - 1, b17 - 1);
                } else {
                    b8Var.f32043m2.c(b16, b17);
                }
                b8Var.f32044n2.clear();
                b8Var.f32044n2.addAll(b8Var.f32043m2.f23734c);
                b8Var.f32049q1.j(b16, b17);
                return true;
            case 4:
                if (d1Var.f56956f != d1Var2.f56956f) {
                    return false;
                }
                l4 l4Var = ((bn) obj).f32203r;
                int b18 = d1Var.b();
                int b19 = d1Var2.b();
                bn bnVar = (bn) l4Var.f47406e;
                int i19 = bnVar.f32207t0;
                sh.d dVar = bnVar.f32194m1;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                if (i20 < 0 || i21 < 0 || i20 >= (i7 = bnVar.M) || i21 >= i7) {
                    return true;
                }
                sh.c b20 = dVar.b(i20);
                SparseArray sparseArray = dVar.f55203a;
                sparseArray.put(i20, dVar.b(i21));
                sparseArray.put(i21, b20);
                CharSequence[] charSequenceArr = bnVar.K;
                CharSequence charSequence = charSequenceArr[i20];
                charSequenceArr[i20] = charSequenceArr[i21];
                charSequenceArr[i21] = charSequence;
                boolean[] zArr = bnVar.L;
                boolean z9 = zArr[i20];
                zArr[i20] = zArr[i21];
                zArr[i21] = z9;
                l4Var.j(b18, b19);
                return true;
            case 5:
                int b21 = d1Var2.b();
                dl0 dl0Var = (dl0) obj;
                ArrayList arrayList5 = dl0Var.f33001e;
                if (b21 >= dl0Var.f33006w && d1Var2.b() < dl0Var.f33007x) {
                    int b22 = d1Var.b();
                    int b23 = d1Var2.b();
                    int i22 = dl0Var.f33006w;
                    int i23 = b22 - i22;
                    int i24 = b23 - i22;
                    arrayList5.indexOf(Integer.valueOf(i23));
                    arrayList5.get(b22 - dl0Var.f33006w);
                    ij ijVar3 = (ij) arrayList5.get(i23);
                    ij ijVar4 = (ij) arrayList5.get(i24);
                    arrayList5.set(i23, ijVar4);
                    arrayList5.set(i24, ijVar3);
                    z5 q10 = z5.q(dl0Var.d);
                    ArrayList arrayList6 = q10.G;
                    int indexOf = arrayList6.indexOf(ijVar3);
                    int indexOf2 = arrayList6.indexOf(ijVar4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, ijVar4);
                        arrayList6.set(indexOf2, ijVar3);
                    }
                    q10.y();
                    dl0Var.f33000c.j(b22, b23);
                }
                return false;
            case 6:
                is0 is0Var = (is0) obj;
                ArrayList arrayList7 = is0Var.f34741f;
                xs0 xs0Var = is0Var.f34747y;
                if (xs0Var.E1 && recyclerView.getAdapter() != xs0Var.U) {
                    uv s5 = s(d1Var);
                    uv s9 = s(d1Var2);
                    if (s5 != null && s9 != null && s5.f25887b && s9.f25887b) {
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
                p41 p41Var = (p41) obj;
                k41 k41Var = p41Var.f36781f3;
                if (k41Var.H(d1Var.b()) < 0 || k41Var.H(d1Var.b()) != k41Var.H(d1Var2.b())) {
                    return false;
                }
                int b26 = d1Var.b();
                int b27 = d1Var2.b();
                ArrayList arrayList8 = k41Var.D;
                if (k41Var.M != null) {
                    int H = k41Var.H(b26);
                    int H2 = k41Var.H(b27);
                    if (H >= 0 && H == H2) {
                        boolean J = k41Var.J(b26);
                        boolean J2 = k41Var.J(b27);
                        arrayList8.add(b27, (w31) arrayList8.remove(b26));
                        k41Var.j(b26, b27);
                        if (k41Var.J(b27) != J) {
                            k41Var.h(b27, 3);
                        }
                        if (k41Var.J(b26) != J2) {
                            k41Var.h(b26, 3);
                        }
                        if (k41Var.L && (i10 = k41Var.K) != H) {
                            k41Var.F(i10);
                        }
                        k41Var.L = true;
                        k41Var.K = H;
                    }
                }
                p41Var.K1();
                return true;
            case 8:
                int b28 = d1Var.b();
                int b29 = d1Var2.b();
                t61 t61Var = (t61) obj;
                ArrayList arrayList9 = t61Var.h;
                if (!((org.telegram.ui.Components.n) t61Var.D).r(b28) || !((org.telegram.ui.Components.n) t61Var.D).r(b29)) {
                    return false;
                }
                Pattern pattern = Utilities.f21330a;
                Object obj2 = arrayList9.get(b28);
                arrayList9.set(b28, arrayList9.get(b29));
                arrayList9.set(b29, obj2);
                t61Var.f38269y.j(b28, b29);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i13 < size3) {
                    Object obj3 = arrayList9.get(i13);
                    i13++;
                    arrayList10.add(Integer.valueOf(((q61) obj3).f37165a));
                }
                l61 l61Var = ((u61) ((org.telegram.ui.Components.n) t61Var.D).f36104a).L;
                if (l61Var == null) {
                    return true;
                }
                l61Var.a(arrayList10);
                return true;
            default:
                if (d1Var.f56956f != d1Var2.f56956f || !r(d1Var.b()) || !r(d1Var2.b())) {
                    return false;
                }
                nr0 nr0Var = ((pr0) obj).f48915b;
                int b30 = d1Var.b();
                int b31 = d1Var2.b();
                pr0 pr0Var = nr0Var.d;
                int i25 = pr0Var.f48931n0;
                int i26 = b30 - i25;
                int i27 = b31 - i25;
                if (i26 < 0 || i27 < 0 || i26 >= (i11 = pr0Var.D) || i27 >= i11) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = pr0Var.f48942w;
                CharSequence charSequence2 = charSequenceArr2[i26];
                charSequenceArr2[i26] = charSequenceArr2[i27];
                charSequenceArr2[i27] = charSequence2;
                int[] iArr = pr0Var.f48935r;
                if (iArr != null) {
                    int i28 = iArr[i26];
                    iArr[i26] = iArr[i27];
                    iArr[i27] = i28;
                }
                boolean[] zArr2 = pr0Var.f48944x;
                boolean z10 = zArr2[i26];
                zArr2[i26] = zArr2[i27];
                zArr2[i27] = z10;
                nr0Var.j(b30, b31);
                return true;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i7, int i10, int i11) {
        switch (this.d) {
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
                    d1Var.f56952a.setPressed(true);
                    return;
                }
                return;
            case 1:
                la laVar = (la) obj;
                if (i7 == 0) {
                    la.d0(laVar);
                } else {
                    laVar.f47483b.I0(false);
                    d1Var.f56952a.setPressed(true);
                }
                if (d1Var != null) {
                    View view = d1Var.f56952a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            case 2:
                fo foVar = (fo) obj;
                go goVar = foVar.f45683h3;
                if (i7 == 0) {
                    goVar.L = false;
                    if (foVar.f45681f3) {
                        TLRPC.Chat chat = goVar.X;
                        ArrayList arrayList3 = goVar.N;
                        ArrayList arrayList4 = goVar.M;
                        if (chat != null) {
                            foVar.f45681f3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = goVar.X;
                            tL_inputChannel.channel_id = chat2.f26952id;
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
                d1Var.f56952a.setPressed(true);
                return;
            case 3:
                n7 n7Var = ((b8) obj).f32045o1;
                if (d1Var != null) {
                    n7Var.d1(false);
                }
                if (i7 != 0) {
                    n7Var.I0(false);
                    if (d1Var != null) {
                        d1Var.f56952a.setPressed(true);
                    }
                }
                if (d1Var != null) {
                    View view2 = d1Var.f56952a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    return;
                }
                return;
            case 4:
                bn bnVar = (bn) obj;
                e61 e61Var = bnVar.f32205s;
                if (i7 != 0) {
                    e61Var.setItemAnimator(bnVar.f32210w);
                    e61Var.I0(false);
                    d1Var.f56952a.setPressed(true);
                    r6.i(k6.f27921h5, d1Var.f56952a, bnVar.f38947a);
                    return;
                }
                return;
            case 5:
                if (i7 != 0) {
                    ((dl0) obj).f32999b.I0(false);
                    d1Var.f56952a.setPressed(true);
                    return;
                }
                return;
            case 6:
                is0 is0Var = (is0) obj;
                ir0 ir0Var = is0Var.f34742n;
                if (d1Var != null && (rr0Var = is0Var.f34744s) != null) {
                    rr0Var.d1(false);
                }
                if (i7 == 0) {
                    g0.r(ir0Var);
                    g0.i3(ir0Var, 300L);
                    return;
                }
                return;
            case 7:
                p41 p41Var = (p41) obj;
                if (d1Var != null) {
                    p41Var.d1(false);
                }
                if (i7 == 0) {
                    k41 k41Var = p41Var.f36781f3;
                    if (k41Var.L) {
                        k41Var.F(k41Var.K);
                    }
                    if (p41Var.f36785k3 != null) {
                        p41Var.G1();
                        p41Var.f36785k3 = null;
                        return;
                    }
                    return;
                }
                p41Var.I0(false);
                if (d1Var != null) {
                    View view3 = d1Var.f56952a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof y1) {
                        y1 y1Var = (y1) view3.getBackground();
                        if (!y1Var.f18994c) {
                            y1Var.f18994c = true;
                            y1Var.invalidateSelf();
                        }
                    }
                    if (i7 == 2) {
                        p41Var.f36785k3 = d1Var;
                        p41Var.J1(d1Var);
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
                    ((pr0) obj).f48917c.I0(false);
                    d1Var.f56952a.setPressed(true);
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
        if (!pr0Var.I || i7 - pr0Var.f48931n0 >= pr0Var.f48946y) {
            return true;
        }
        return false;
    }

    public uv s(d1 d1Var) {
        int b10;
        is0 is0Var = (is0) this.f10813e;
        if (d1Var == null || (b10 = d1Var.b()) < 0 || b10 >= is0Var.f34741f.size()) {
            return null;
        }
        return (uv) is0Var.f34741f.get(b10);
    }

    private final void A(d1 d1Var) {
    }

    private final void B(d1 d1Var) {
    }

    private final void C(d1 d1Var) {
    }

    private final void D(d1 d1Var) {
    }

    private final void u(d1 d1Var) {
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
}
