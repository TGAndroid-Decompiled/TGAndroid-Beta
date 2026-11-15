package gi;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.c6;
import fi.k6;
import fi.m5;
import java.util.ArrayList;
import java.util.regex.Pattern;
import oi.w1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.sv;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.b61;
import org.telegram.ui.ea;
import org.telegram.ui.fo;
import org.telegram.ui.go;
import org.telegram.ui.ho;
import org.telegram.ui.ia;
import org.telegram.ui.l4;
import org.telegram.ui.la;
import org.telegram.ui.lr0;
import org.telegram.ui.nr0;
import v4.e1;
import v4.v;
public final class c extends v {
    public final int d;
    public final Object f13320e;

    public c(Object obj, int i7) {
        this.d = i7;
        this.f13320e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, e1 e1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, e1Var);
                e1Var.f58535a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, e1Var);
                View view = e1Var.f58535a;
                view.setPressed(false);
                view.setTag(2131296419, null);
                return;
            case 2:
                super.a(recyclerView, e1Var);
                e1Var.f58535a.setPressed(false);
                return;
            case 3:
                super.a(recyclerView, e1Var);
                View view2 = e1Var.f58535a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                return;
            case 4:
                super.a(recyclerView, e1Var);
                View view3 = e1Var.f58535a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 5:
                super.a(recyclerView, e1Var);
                e1Var.f58535a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, e1Var);
                e1Var.f58535a.setPressed(false);
                return;
            case 7:
                u41 u41Var = (u41) this.f13320e;
                super.a(recyclerView, e1Var);
                View view4 = e1Var.f58535a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof w1) {
                    w1 w1Var = (w1) view4.getBackground();
                    if (w1Var.f22091c) {
                        w1Var.f22091c = false;
                        w1Var.invalidateSelf();
                    }
                }
                if (u41Var.D1()) {
                    u41Var.I1(e1Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(er.h).start();
                    return;
                }
                return;
            case 8:
            default:
                super.a(recyclerView, e1Var);
                return;
            case 9:
                super.a(recyclerView, e1Var);
                e1Var.f58535a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, e1 e1Var) {
        sv s5;
        switch (this.d) {
            case 0:
                m mVar = (m) this.f13320e;
                if (mVar.f13337a0.H.F1 && mVar.f13345w.L(e1Var.b())) {
                    mVar.f13341f.setItemAnimator(mVar.f13342n);
                    return v.l(15, 0);
                }
                return v.l(0, 0);
            case 1:
                if (e1Var.f58539f == 4 && ((ia) e1Var.f58535a).H) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 2:
                if (e1Var.f58539f == 1 && ((ia) e1Var.f58535a).H) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 3:
                if (e1Var.f58539f != 0) {
                    return 0;
                }
                return v.l(3, 0);
            case 4:
                if (e1Var.f58539f != 5) {
                    return v.l(0, 0);
                }
                return v.l(3, 0);
            case 5:
                int b10 = e1Var.b();
                il0 il0Var = (il0) this.f13320e;
                if (b10 >= il0Var.f35659w && e1Var.b() < il0Var.f35660x) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 6:
                int l10 = v.l(0, 0);
                ys0 ys0Var = ((js0) this.f13320e).f36179y;
                if (ys0Var.F1 && recyclerView.getAdapter() != ys0Var.V && (s5 = s(e1Var)) != null && s5.f26570b) {
                    return v.l(3, 0);
                }
                return l10;
            case 7:
                u41 u41Var = (u41) this.f13320e;
                if (u41Var.f39898k3 && u41Var.f39895g3.H(e1Var.b()) >= 0) {
                    int i7 = 15;
                    if (u41Var.f39894f3.f58489o == 0) {
                        if (!u41Var.j3) {
                            i7 = 12;
                        }
                    } else if (!u41Var.j3) {
                        i7 = 3;
                    }
                    return v.l(i7, 0);
                }
                return v.l(0, 0);
            case 8:
                if (((cf) ((v61) this.f13320e).E).l(e1Var.b())) {
                    return v.l(12, 0);
                }
                return v.l(0, 0);
            default:
                if (e1Var.f58539f == 5 && r(e1Var.b())) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((m) this.f13320e).f13337a0.H.F1;
            case 5:
                return ((il0) this.f13320e).J.g0();
            case 7:
                u41 u41Var = (u41) this.f13320e;
                if (u41Var.f39898k3 && u41Var.f39900m3) {
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
    public void m(Canvas canvas, RecyclerView recyclerView, e1 e1Var, float f10, float f11, int i7, boolean z10) {
        switch (this.d) {
            case 7:
                u41 u41Var = (u41) this.f13320e;
                if (i7 != 2 || z10 || !u41Var.D1()) {
                    super.m(canvas, recyclerView, e1Var, f10, f11, i7, z10);
                    if (i7 == 2 && z10) {
                        u41Var.H1(e1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                super.m(canvas, recyclerView, e1Var, f10, f11, i7, z10);
                ((v61) this.f13320e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, e1Var, f10, f11, i7, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, e1 e1Var, e1 e1Var2) {
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = 0;
        Object obj = this.f13320e;
        switch (i12) {
            case 0:
                h hVar = ((m) obj).f13345w;
                if (!hVar.L(e1Var.b()) || !hVar.L(e1Var2.b())) {
                    return false;
                }
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                ArrayList arrayList2 = hVar.f13332n;
                k6 k6Var = hVar.f13330e;
                if (k6Var == null || b10 < 0 || b10 >= k6Var.f11944i.size() || b11 < 0 || b11 >= hVar.f13330e.f11944i.size()) {
                    return true;
                }
                if (hVar.f13330e instanceof c6) {
                    arrayList = new ArrayList();
                    for (int i14 = 0; i14 < hVar.f13330e.f11944i.size(); i14++) {
                        arrayList.add(Integer.valueOf(((gj) hVar.f13330e.f11944i.get(i14)).e1()));
                    }
                } else {
                    arrayList = new ArrayList(hVar.f13330e.f11943g);
                }
                if (!hVar.f13333r) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    hVar.f13333r = true;
                }
                gj gjVar = (gj) hVar.f13330e.f11944i.get(b10);
                gj gjVar2 = (gj) hVar.f13330e.f11944i.get(b11);
                arrayList.remove(Integer.valueOf(gjVar.e1()));
                arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(gjVar.e1()));
                hVar.f13330e.C(arrayList, false);
                hVar.j(b10, b11);
                return true;
            case 1:
                if (e1Var.f58539f == e1Var2.f58539f) {
                    View view = e1Var2.f58535a;
                    if (!(view instanceof ia) || ((ia) view).H) {
                        ea eaVar = ((la) obj).f48912c;
                        int b12 = e1Var.b();
                        int b13 = e1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        la laVar = eaVar.f46657c;
                        ArrayList arrayList3 = laVar.f48918w;
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
                if (e1Var.f58539f == e1Var2.f58539f) {
                    View view2 = e1Var2.f58535a;
                    if (!(view2 instanceof ia) || ((ia) view2).H) {
                        fo foVar = ((go) obj).f47494f3;
                        int b14 = e1Var.b();
                        int b15 = e1Var2.b();
                        int i18 = b14 - 1;
                        int i19 = b15 - 1;
                        go goVar = foVar.f47173c;
                        ho hoVar = goVar.f47497i3;
                        ArrayList arrayList4 = hoVar.O;
                        if (i18 >= hoVar.O.size() || i19 >= arrayList4.size()) {
                            return true;
                        }
                        if (b14 != b15) {
                            goVar.f47495g3 = true;
                        }
                        arrayList4.set(i18, (TLRPC.TL_username) arrayList4.get(i19));
                        arrayList4.set(i19, (TLRPC.TL_username) arrayList4.get(i18));
                        foVar.j(b14, b15);
                        int size2 = arrayList4.size();
                        if (b14 != size2 && b15 != size2) {
                            return true;
                        }
                        foVar.h(b14, 3);
                        foVar.h(b15, 3);
                        return true;
                    }
                }
                return false;
            case 3:
                int b16 = e1Var.b();
                int b17 = e1Var2.b();
                y7 y7Var = (y7) obj;
                if (y7Var.f41911p2) {
                    if (b16 <= 0 || b17 <= 0) {
                        return false;
                    }
                    y7Var.f41913q2.c(b16 - 1, b17 - 1);
                } else {
                    y7Var.f41913q2.c(b16, b17);
                }
                y7Var.f41915r2.clear();
                y7Var.f41915r2.addAll(y7Var.f41913q2.f24202c);
                y7Var.f41920u1.j(b16, b17);
                return true;
            case 4:
                if (e1Var.f58539f != e1Var2.f58539f) {
                    return false;
                }
                l4 l4Var = ((jn) obj).f36104r;
                int b18 = e1Var.b();
                int b19 = e1Var2.b();
                jn jnVar = (jn) l4Var.f48827e;
                int i20 = jnVar.f36110u0;
                sh.d dVar = jnVar.n1;
                int i21 = b18 - i20;
                int i22 = b19 - i20;
                if (i21 < 0 || i22 < 0 || i21 >= (i7 = jnVar.N) || i22 >= i7) {
                    return true;
                }
                sh.c b20 = dVar.b(i21);
                SparseArray sparseArray = dVar.f56858a;
                sparseArray.put(i21, dVar.b(i22));
                sparseArray.put(i22, b20);
                CharSequence[] charSequenceArr = jnVar.L;
                CharSequence charSequence = charSequenceArr[i21];
                charSequenceArr[i21] = charSequenceArr[i22];
                charSequenceArr[i22] = charSequence;
                boolean[] zArr = jnVar.M;
                boolean z10 = zArr[i21];
                zArr[i21] = zArr[i22];
                zArr[i22] = z10;
                l4Var.j(b18, b19);
                return true;
            case 5:
                int b21 = e1Var2.b();
                il0 il0Var = (il0) obj;
                ArrayList arrayList5 = il0Var.f35654e;
                if (b21 >= il0Var.f35659w && e1Var2.b() < il0Var.f35660x) {
                    int b22 = e1Var.b();
                    int b23 = e1Var2.b();
                    int i23 = il0Var.f35659w;
                    int i24 = b22 - i23;
                    int i25 = b23 - i23;
                    arrayList5.indexOf(Integer.valueOf(i24));
                    arrayList5.get(b22 - il0Var.f35659w);
                    gj gjVar3 = (gj) arrayList5.get(i24);
                    gj gjVar4 = (gj) arrayList5.get(i25);
                    arrayList5.set(i24, gjVar4);
                    arrayList5.set(i25, gjVar3);
                    z5 q10 = z5.q(il0Var.d);
                    ArrayList arrayList6 = q10.H;
                    int indexOf = arrayList6.indexOf(gjVar3);
                    int indexOf2 = arrayList6.indexOf(gjVar4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, gjVar4);
                        arrayList6.set(indexOf2, gjVar3);
                    }
                    q10.y();
                    il0Var.f35653c.j(b22, b23);
                }
                return false;
            case 6:
                js0 js0Var = (js0) obj;
                ArrayList arrayList7 = js0Var.f36173f;
                ys0 ys0Var = js0Var.f36179y;
                if (ys0Var.F1 && recyclerView.getAdapter() != ys0Var.V) {
                    sv s5 = s(e1Var);
                    sv s9 = s(e1Var2);
                    if (s5 != null && s9 != null && s5.f26570b && s9.f26570b) {
                        int b24 = e1Var.b();
                        int b25 = e1Var2.b();
                        arrayList7.remove(b24);
                        arrayList7.add(b25, s5);
                        js0Var.j(b24, b25);
                        js0Var.h = true;
                        return true;
                    }
                }
                return false;
            case 7:
                u41 u41Var = (u41) obj;
                p41 p41Var = u41Var.f39895g3;
                if (p41Var.H(e1Var.b()) < 0 || p41Var.H(e1Var.b()) != p41Var.H(e1Var2.b())) {
                    return false;
                }
                int b26 = e1Var.b();
                int b27 = e1Var2.b();
                ArrayList arrayList8 = p41Var.E;
                if (p41Var.N != null) {
                    int H = p41Var.H(b26);
                    int H2 = p41Var.H(b27);
                    if (H >= 0 && H == H2) {
                        boolean J = p41Var.J(b26);
                        boolean J2 = p41Var.J(b27);
                        arrayList8.add(b27, (b41) arrayList8.remove(b26));
                        p41Var.j(b26, b27);
                        if (p41Var.J(b27) != J) {
                            p41Var.h(b27, 3);
                        }
                        if (p41Var.J(b26) != J2) {
                            p41Var.h(b26, 3);
                        }
                        if (p41Var.M && (i10 = p41Var.L) != H) {
                            p41Var.F(i10);
                        }
                        p41Var.M = true;
                        p41Var.L = H;
                    }
                }
                u41Var.K1();
                return true;
            case 8:
                int b28 = e1Var.b();
                int b29 = e1Var2.b();
                v61 v61Var = (v61) obj;
                ArrayList arrayList9 = v61Var.h;
                if (!((cf) v61Var.E).l(b28) || !((cf) v61Var.E).l(b29)) {
                    return false;
                }
                Pattern pattern = Utilities.f22413a;
                Object obj2 = arrayList9.get(b28);
                arrayList9.set(b28, arrayList9.get(b29));
                arrayList9.set(b29, obj2);
                v61Var.f40319y.j(b28, b29);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i13 < size3) {
                    Object obj3 = arrayList9.get(i13);
                    i13++;
                    arrayList10.add(Integer.valueOf(((s61) obj3).f39188a));
                }
                n61 n61Var = ((w61) ((cf) v61Var.E).f33543a).M;
                if (n61Var == null) {
                    return true;
                }
                n61Var.a(arrayList10);
                return true;
            default:
                if (e1Var.f58539f != e1Var2.f58539f || !r(e1Var.b()) || !r(e1Var2.b())) {
                    return false;
                }
                lr0 lr0Var = ((nr0) obj).f49616b;
                int b30 = e1Var.b();
                int b31 = e1Var2.b();
                nr0 nr0Var = lr0Var.d;
                int i26 = nr0Var.f49633o0;
                int i27 = b30 - i26;
                int i28 = b31 - i26;
                if (i27 < 0 || i28 < 0 || i27 >= (i11 = nr0Var.E) || i28 >= i11) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = nr0Var.f49643w;
                CharSequence charSequence2 = charSequenceArr2[i27];
                charSequenceArr2[i27] = charSequenceArr2[i28];
                charSequenceArr2[i28] = charSequence2;
                int[] iArr = nr0Var.f49636r;
                if (iArr != null) {
                    int i29 = iArr[i27];
                    iArr[i27] = iArr[i28];
                    iArr[i28] = i29;
                }
                boolean[] zArr2 = nr0Var.f49645x;
                boolean z11 = zArr2[i27];
                zArr2[i27] = zArr2[i28];
                zArr2[i28] = z11;
                lr0Var.j(b30, b31);
                return true;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i7, int i10, int i11) {
        switch (this.d) {
            case 1:
            case 7:
                return;
            default:
                super.o(recyclerView, e1Var, e1Var2, i7, i10, i11);
                return;
        }
    }

    @Override
    public void p(e1 e1Var, int i7) {
        ArrayList arrayList;
        boolean z10;
        sr0 sr0Var;
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f13320e;
        switch (i10) {
            case 0:
                m mVar = (m) obj;
                e eVar = mVar.f13341f;
                if (e1Var != null) {
                    eVar.d1(false);
                }
                if (i7 == 0) {
                    h hVar = mVar.f13345w;
                    ArrayList arrayList2 = hVar.f13332n;
                    k6 k6Var = hVar.f13330e;
                    if (k6Var != null && hVar.f13333r) {
                        if (k6Var instanceof c6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < hVar.f13330e.f11944i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((gj) hVar.f13330e.f11944i.get(i11)).e1()));
                            }
                        } else {
                            arrayList = k6Var.f11943g;
                        }
                        if (arrayList2.size() != arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (arrayList2.get(i12) != arrayList.get(i12)) {
                                        z10 = true;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            hVar.f13330e.C(arrayList, true);
                        }
                        hVar.f13333r = false;
                    }
                    eVar.setItemAnimator(null);
                    return;
                }
                eVar.I0(false);
                if (e1Var != null) {
                    e1Var.f58535a.setPressed(true);
                    return;
                }
                return;
            case 1:
                la laVar = (la) obj;
                if (i7 == 0) {
                    la.d0(laVar);
                } else {
                    laVar.f48911b.I0(false);
                    e1Var.f58535a.setPressed(true);
                }
                if (e1Var != null) {
                    View view = e1Var.f58535a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            case 2:
                go goVar = (go) obj;
                ho hoVar = goVar.f47497i3;
                if (i7 == 0) {
                    hoVar.M = false;
                    if (goVar.f47495g3) {
                        TLRPC.Chat chat = hoVar.Y;
                        ArrayList arrayList3 = hoVar.O;
                        ArrayList arrayList4 = hoVar.N;
                        if (chat != null) {
                            goVar.f47495g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = hoVar.Y;
                            tL_inputChannel.channel_id = chat2.f28051id;
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
                            hoVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new m5(16));
                            hoVar.Y.usernames.clear();
                            hoVar.Y.usernames.addAll(arrayList4);
                            hoVar.Y.usernames.addAll(arrayList3);
                            hoVar.getMessagesController().Q3(hoVar.Y, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                hoVar.M = true;
                goVar.I0(false);
                e1Var.f58535a.setPressed(true);
                return;
            case 3:
                k7 k7Var = ((y7) obj).f41916s1;
                if (e1Var != null) {
                    k7Var.d1(false);
                }
                if (i7 != 0) {
                    k7Var.I0(false);
                    if (e1Var != null) {
                        e1Var.f58535a.setPressed(true);
                    }
                }
                if (e1Var != null) {
                    View view2 = e1Var.f58535a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    return;
                }
                return;
            case 4:
                jn jnVar = (jn) obj;
                b61 b61Var = jnVar.f36107s;
                if (i7 != 0) {
                    b61Var.setItemAnimator(jnVar.f36112w);
                    b61Var.I0(false);
                    e1Var.f58535a.setPressed(true);
                    q6.h(j6.f28922h5, e1Var.f58535a, jnVar.f33606a);
                    return;
                }
                return;
            case 5:
                if (i7 != 0) {
                    ((il0) obj).f35652b.I0(false);
                    e1Var.f58535a.setPressed(true);
                    return;
                }
                return;
            case 6:
                js0 js0Var = (js0) obj;
                ro0 ro0Var = js0Var.f36174n;
                if (e1Var != null && (sr0Var = js0Var.f36176s) != null) {
                    sr0Var.d1(false);
                }
                if (i7 == 0) {
                    g0.r(ro0Var);
                    g0.i3(ro0Var, 300L);
                    return;
                }
                return;
            case 7:
                u41 u41Var = (u41) obj;
                if (e1Var != null) {
                    u41Var.d1(false);
                }
                if (i7 == 0) {
                    p41 p41Var = u41Var.f39895g3;
                    if (p41Var.M) {
                        p41Var.F(p41Var.L);
                    }
                    if (u41Var.f39899l3 != null) {
                        u41Var.G1();
                        u41Var.f39899l3 = null;
                        return;
                    }
                    return;
                }
                u41Var.I0(false);
                if (e1Var != null) {
                    View view3 = e1Var.f58535a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof w1) {
                        w1 w1Var = (w1) view3.getBackground();
                        if (!w1Var.f22091c) {
                            w1Var.f22091c = true;
                            w1Var.invalidateSelf();
                        }
                    }
                    if (i7 == 2) {
                        u41Var.f39899l3 = e1Var;
                        u41Var.J1(e1Var);
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
                    ((nr0) obj).f49618c.I0(false);
                    e1Var.f58535a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(e1 e1Var) {
        int i7 = this.d;
    }

    public boolean r(int i7) {
        nr0 nr0Var = (nr0) this.f13320e;
        if (!nr0Var.J || i7 - nr0Var.f49633o0 >= nr0Var.f49647y) {
            return true;
        }
        return false;
    }

    public sv s(e1 e1Var) {
        int b10;
        js0 js0Var = (js0) this.f13320e;
        if (e1Var == null || (b10 = e1Var.b()) < 0 || b10 >= js0Var.f36173f.size()) {
            return null;
        }
        return (sv) js0Var.f36173f.get(b10);
    }

    private final void A(e1 e1Var) {
    }

    private final void B(e1 e1Var) {
    }

    private final void C(e1 e1Var) {
    }

    private final void D(e1 e1Var) {
    }

    private final void E(e1 e1Var) {
    }

    private final void v(e1 e1Var) {
    }

    private final void w(e1 e1Var) {
    }

    private final void x(e1 e1Var) {
    }

    private final void y(e1 e1Var) {
    }

    private final void z(e1 e1Var) {
    }

    private final void t(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i7, int i10, int i11) {
    }

    private final void u(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i7, int i10, int i11) {
    }
}
