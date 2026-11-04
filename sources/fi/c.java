package fi;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ei.k6;
import ei.r6;
import ei.u5;
import java.util.ArrayList;
import java.util.regex.Pattern;
import mi.z1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.mv;
import org.telegram.messenger.z5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l7;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ao;
import org.telegram.ui.bo;
import org.telegram.ui.da;
import org.telegram.ui.dr0;
import org.telegram.ui.fr0;
import org.telegram.ui.ha;
import org.telegram.ui.ka;
import org.telegram.ui.n4;
import org.telegram.ui.u51;
import org.telegram.ui.zn;
import u4.d1;
import u4.v;
public final class c extends v {
    public final int d;
    public final Object f11599e;

    public c(Object obj, int i3) {
        this.d = i3;
        this.f11599e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                d1Var.f55540a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, d1Var);
                View view = d1Var.f55540a;
                view.setPressed(false);
                view.setTag(2131296419, null);
                return;
            case 2:
                super.a(recyclerView, d1Var);
                d1Var.f55540a.setPressed(false);
                return;
            case 3:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f55540a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                return;
            case 4:
                super.a(recyclerView, d1Var);
                View view3 = d1Var.f55540a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 5:
                super.a(recyclerView, d1Var);
                d1Var.f55540a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, d1Var);
                d1Var.f55540a.setPressed(false);
                return;
            case 7:
                l41 l41Var = (l41) this.f11599e;
                super.a(recyclerView, d1Var);
                View view4 = d1Var.f55540a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof z1) {
                    z1 z1Var = (z1) view4.getBackground();
                    if (z1Var.f20084c) {
                        z1Var.f20084c = false;
                        z1Var.invalidateSelf();
                    }
                }
                if (l41Var.D1()) {
                    l41Var.I1(d1Var);
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
                d1Var.f55540a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, d1 d1Var) {
        mv s6;
        switch (this.d) {
            case 0:
                m mVar = (m) this.f11599e;
                if (mVar.f11616a0.H.F1 && mVar.f11624w.L(d1Var.b())) {
                    mVar.f11620f.setItemAnimator(mVar.f11621n);
                    return v.l(15, 0);
                }
                return v.l(0, 0);
            case 1:
                if (d1Var.f55544f == 4 && ((ha) d1Var.f55540a).H) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 2:
                if (d1Var.f55544f == 1 && ((ha) d1Var.f55540a).H) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 3:
                if (d1Var.f55544f != 0) {
                    return 0;
                }
                return v.l(3, 0);
            case 4:
                if (d1Var.f55544f != 5) {
                    return v.l(0, 0);
                }
                return v.l(3, 0);
            case 5:
                int b10 = d1Var.b();
                hl0 hl0Var = (hl0) this.f11599e;
                if (b10 >= hl0Var.f34450w && d1Var.b() < hl0Var.f34451x) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
            case 6:
                int l10 = v.l(0, 0);
                ws0 ws0Var = ((hs0) this.f11599e).f34499y;
                if (ws0Var.F1 && recyclerView.getAdapter() != ws0Var.V && (s6 = s(d1Var)) != null && s6.f24265b) {
                    return v.l(3, 0);
                }
                return l10;
            case 7:
                l41 l41Var = (l41) this.f11599e;
                if (l41Var.f35597k3 && l41Var.f35594g3.H(d1Var.b()) >= 0) {
                    int i3 = 15;
                    if (l41Var.f35593f3.f55509o == 0) {
                        if (!l41Var.f35596j3) {
                            i3 = 12;
                        }
                    } else if (!l41Var.f35596j3) {
                        i3 = 3;
                    }
                    return v.l(i3, 0);
                }
                return v.l(0, 0);
            case 8:
                if (((y00) ((m61) this.f11599e).E).i(d1Var.b())) {
                    return v.l(12, 0);
                }
                return v.l(0, 0);
            default:
                if (d1Var.f55544f == 5 && r(d1Var.b())) {
                    return v.l(3, 0);
                }
                return v.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((m) this.f11599e).f11616a0.H.F1;
            case 5:
                return ((hl0) this.f11599e).J.I();
            case 7:
                l41 l41Var = (l41) this.f11599e;
                if (l41Var.f35597k3 && l41Var.f35599m3) {
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
    public void m(Canvas canvas, RecyclerView recyclerView, d1 d1Var, float f10, float f11, int i3, boolean z10) {
        switch (this.d) {
            case 7:
                l41 l41Var = (l41) this.f11599e;
                if (i3 != 2 || z10 || !l41Var.D1()) {
                    super.m(canvas, recyclerView, d1Var, f10, f11, i3, z10);
                    if (i3 == 2 && z10) {
                        l41Var.H1(d1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                super.m(canvas, recyclerView, d1Var, f10, f11, i3, z10);
                ((m61) this.f11599e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, d1Var, f10, f11, i3, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, d1 d1Var, d1 d1Var2) {
        ArrayList arrayList;
        int i3;
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = 0;
        Object obj = this.f11599e;
        switch (i12) {
            case 0:
                h hVar = ((m) obj).f11624w;
                if (!hVar.L(d1Var.b()) || !hVar.L(d1Var2.b())) {
                    return false;
                }
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                ArrayList arrayList2 = hVar.f11611n;
                r6 r6Var = hVar.f11609e;
                if (r6Var == null || b10 < 0 || b10 >= r6Var.f10876i.size() || b11 < 0 || b11 >= hVar.f11609e.f10876i.size()) {
                    return true;
                }
                if (hVar.f11609e instanceof k6) {
                    arrayList = new ArrayList();
                    for (int i14 = 0; i14 < hVar.f11609e.f10876i.size(); i14++) {
                        arrayList.add(Integer.valueOf(((zi) hVar.f11609e.f10876i.get(i14)).f1()));
                    }
                } else {
                    arrayList = new ArrayList(hVar.f11609e.f10875g);
                }
                if (!hVar.f11612r) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    hVar.f11612r = true;
                }
                zi ziVar = (zi) hVar.f11609e.f10876i.get(b10);
                zi ziVar2 = (zi) hVar.f11609e.f10876i.get(b11);
                arrayList.remove(Integer.valueOf(ziVar.f1()));
                arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ziVar.f1()));
                hVar.f11609e.C(arrayList, false);
                hVar.j(b10, b11);
                return true;
            case 1:
                if (d1Var.f55544f == d1Var2.f55544f) {
                    View view = d1Var2.f55540a;
                    if (!(view instanceof ha) || ((ha) view).H) {
                        da daVar = ((ka) obj).f46840c;
                        int b12 = d1Var.b();
                        int b13 = d1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        ka kaVar = daVar.f44609c;
                        ArrayList arrayList3 = kaVar.f46846w;
                        if (i15 >= arrayList3.size() || i16 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            kaVar.d = true;
                        }
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i16));
                        arrayList3.set(i16, (TLRPC.TL_username) arrayList3.get(i15));
                        daVar.j(b12, b13);
                        int size = arrayList3.size() + 3;
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        daVar.h(b12, 3);
                        daVar.h(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (d1Var.f55544f == d1Var2.f55544f) {
                    View view2 = d1Var2.f55540a;
                    if (!(view2 instanceof ha) || ((ha) view2).H) {
                        zn znVar = ((ao) obj).f43815f3;
                        int b14 = d1Var.b();
                        int b15 = d1Var2.b();
                        int i17 = b14 - 1;
                        int i18 = b15 - 1;
                        ao aoVar = znVar.f52716c;
                        bo boVar = aoVar.i3;
                        ArrayList arrayList4 = boVar.O;
                        if (i17 >= boVar.O.size() || i18 >= arrayList4.size()) {
                            return true;
                        }
                        if (b14 != b15) {
                            aoVar.f43816g3 = true;
                        }
                        arrayList4.set(i17, (TLRPC.TL_username) arrayList4.get(i18));
                        arrayList4.set(i18, (TLRPC.TL_username) arrayList4.get(i17));
                        znVar.j(b14, b15);
                        int size2 = arrayList4.size();
                        if (b14 != size2 && b15 != size2) {
                            return true;
                        }
                        znVar.h(b14, 3);
                        znVar.h(b15, 3);
                        return true;
                    }
                }
                return false;
            case 3:
                int b16 = d1Var.b();
                int b17 = d1Var2.b();
                z7 z7Var = (z7) obj;
                if (z7Var.f40953m2) {
                    if (b16 <= 0 || b17 <= 0) {
                        return false;
                    }
                    z7Var.f40955n2.c(b16 - 1, b17 - 1);
                } else {
                    z7Var.f40955n2.c(b16, b17);
                }
                z7Var.f40957o2.clear();
                z7Var.f40957o2.addAll(z7Var.f40955n2.f21866c);
                z7Var.f40962r1.j(b16, b17);
                return true;
            case 4:
                if (d1Var.f55544f != d1Var2.f55544f) {
                    return false;
                }
                n4 n4Var = ((an) obj).f31936r;
                int b18 = d1Var.b();
                int b19 = d1Var2.b();
                an anVar = (an) n4Var.f47865e;
                int i19 = anVar.f31942u0;
                th.d dVar = anVar.f31929n1;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                if (i20 < 0 || i21 < 0 || i20 >= (i3 = anVar.N) || i21 >= i3) {
                    return true;
                }
                th.c b20 = dVar.b(i20);
                SparseArray sparseArray = dVar.f55399a;
                sparseArray.put(i20, dVar.b(i21));
                sparseArray.put(i21, b20);
                CharSequence[] charSequenceArr = anVar.L;
                CharSequence charSequence = charSequenceArr[i20];
                charSequenceArr[i20] = charSequenceArr[i21];
                charSequenceArr[i21] = charSequence;
                boolean[] zArr = anVar.M;
                boolean z10 = zArr[i20];
                zArr[i20] = zArr[i21];
                zArr[i21] = z10;
                n4Var.j(b18, b19);
                return true;
            case 5:
                int b21 = d1Var2.b();
                hl0 hl0Var = (hl0) obj;
                ArrayList arrayList5 = hl0Var.f34445e;
                if (b21 >= hl0Var.f34450w && d1Var2.b() < hl0Var.f34451x) {
                    int b22 = d1Var.b();
                    int b23 = d1Var2.b();
                    int i22 = hl0Var.f34450w;
                    int i23 = b22 - i22;
                    int i24 = b23 - i22;
                    arrayList5.indexOf(Integer.valueOf(i23));
                    arrayList5.get(b22 - hl0Var.f34450w);
                    zi ziVar3 = (zi) arrayList5.get(i23);
                    zi ziVar4 = (zi) arrayList5.get(i24);
                    arrayList5.set(i23, ziVar4);
                    arrayList5.set(i24, ziVar3);
                    z5 q10 = z5.q(hl0Var.d);
                    ArrayList arrayList6 = q10.H;
                    int indexOf = arrayList6.indexOf(ziVar3);
                    int indexOf2 = arrayList6.indexOf(ziVar4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, ziVar4);
                        arrayList6.set(indexOf2, ziVar3);
                    }
                    q10.y();
                    hl0Var.f34444c.j(b22, b23);
                }
                return false;
            case 6:
                hs0 hs0Var = (hs0) obj;
                ArrayList arrayList7 = hs0Var.f34493f;
                ws0 ws0Var = hs0Var.f34499y;
                if (ws0Var.F1 && recyclerView.getAdapter() != ws0Var.V) {
                    mv s6 = s(d1Var);
                    mv s10 = s(d1Var2);
                    if (s6 != null && s10 != null && s6.f24265b && s10.f24265b) {
                        int b24 = d1Var.b();
                        int b25 = d1Var2.b();
                        arrayList7.remove(b24);
                        arrayList7.add(b25, s6);
                        hs0Var.j(b24, b25);
                        hs0Var.h = true;
                        return true;
                    }
                }
                return false;
            case 7:
                l41 l41Var = (l41) obj;
                f41 f41Var = l41Var.f35594g3;
                if (f41Var.H(d1Var.b()) < 0 || f41Var.H(d1Var.b()) != f41Var.H(d1Var2.b())) {
                    return false;
                }
                int b26 = d1Var.b();
                int b27 = d1Var2.b();
                ArrayList arrayList8 = f41Var.E;
                if (f41Var.N != null) {
                    int H = f41Var.H(b26);
                    int H2 = f41Var.H(b27);
                    if (H >= 0 && H == H2) {
                        boolean J = f41Var.J(b26);
                        boolean J2 = f41Var.J(b27);
                        arrayList8.add(b27, (r31) arrayList8.remove(b26));
                        f41Var.j(b26, b27);
                        if (f41Var.J(b27) != J) {
                            f41Var.h(b27, 3);
                        }
                        if (f41Var.J(b26) != J2) {
                            f41Var.h(b26, 3);
                        }
                        if (f41Var.M && (i10 = f41Var.L) != H) {
                            f41Var.F(i10);
                        }
                        f41Var.M = true;
                        f41Var.L = H;
                    }
                }
                l41Var.K1();
                return true;
            case 8:
                int b28 = d1Var.b();
                int b29 = d1Var2.b();
                m61 m61Var = (m61) obj;
                ArrayList arrayList9 = m61Var.h;
                if (!((y00) m61Var.E).i(b28) || !((y00) m61Var.E).i(b29)) {
                    return false;
                }
                Pattern pattern = Utilities.f21384a;
                Object obj2 = arrayList9.get(b28);
                arrayList9.set(b28, arrayList9.get(b29));
                arrayList9.set(b29, obj2);
                m61Var.f36054y.j(b28, b29);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i13 < size3) {
                    Object obj3 = arrayList9.get(i13);
                    i13++;
                    arrayList10.add(Integer.valueOf(((j61) obj3).f34971a));
                }
                f61 f61Var = ((n61) ((y00) m61Var.E).f40562a).M;
                if (f61Var == null) {
                    return true;
                }
                f61Var.a(arrayList10);
                return true;
            default:
                if (d1Var.f55544f != d1Var2.f55544f || !r(d1Var.b()) || !r(d1Var2.b())) {
                    return false;
                }
                dr0 dr0Var = ((fr0) obj).f45329b;
                int b30 = d1Var.b();
                int b31 = d1Var2.b();
                fr0 fr0Var = dr0Var.d;
                int i25 = fr0Var.f45346o0;
                int i26 = b30 - i25;
                int i27 = b31 - i25;
                if (i26 < 0 || i27 < 0 || i26 >= (i11 = fr0Var.E) || i27 >= i11) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = fr0Var.f45356w;
                CharSequence charSequence2 = charSequenceArr2[i26];
                charSequenceArr2[i26] = charSequenceArr2[i27];
                charSequenceArr2[i27] = charSequence2;
                int[] iArr = fr0Var.f45349r;
                if (iArr != null) {
                    int i28 = iArr[i26];
                    iArr[i26] = iArr[i27];
                    iArr[i27] = i28;
                }
                boolean[] zArr2 = fr0Var.f45358x;
                boolean z11 = zArr2[i26];
                zArr2[i26] = zArr2[i27];
                zArr2[i27] = z11;
                dr0Var.j(b30, b31);
                return true;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i3, int i10, int i11) {
        switch (this.d) {
            case 7:
                return;
            default:
                super.o(recyclerView, d1Var, d1Var2, i3, i10, i11);
                return;
        }
    }

    @Override
    public void p(d1 d1Var, int i3) {
        ArrayList arrayList;
        boolean z10;
        qr0 qr0Var;
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f11599e;
        switch (i10) {
            case 0:
                m mVar = (m) obj;
                e eVar = mVar.f11620f;
                if (d1Var != null) {
                    eVar.d1(false);
                }
                if (i3 == 0) {
                    h hVar = mVar.f11624w;
                    ArrayList arrayList2 = hVar.f11611n;
                    r6 r6Var = hVar.f11609e;
                    if (r6Var != null && hVar.f11612r) {
                        if (r6Var instanceof k6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < hVar.f11609e.f10876i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((zi) hVar.f11609e.f10876i.get(i11)).f1()));
                            }
                        } else {
                            arrayList = r6Var.f10875g;
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
                            hVar.f11609e.C(arrayList, true);
                        }
                        hVar.f11612r = false;
                    }
                    eVar.setItemAnimator(null);
                    return;
                }
                eVar.I0(false);
                if (d1Var != null) {
                    d1Var.f55540a.setPressed(true);
                    return;
                }
                return;
            case 1:
                ka kaVar = (ka) obj;
                if (i3 == 0) {
                    ka.d0(kaVar);
                } else {
                    kaVar.f46839b.I0(false);
                    d1Var.f55540a.setPressed(true);
                }
                if (d1Var != null) {
                    View view = d1Var.f55540a;
                    if (i3 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            case 2:
                ao aoVar = (ao) obj;
                bo boVar = aoVar.i3;
                if (i3 == 0) {
                    boVar.M = false;
                    if (aoVar.f43816g3) {
                        TLRPC.Chat chat = boVar.Y;
                        ArrayList arrayList3 = boVar.O;
                        ArrayList arrayList4 = boVar.N;
                        if (chat != null) {
                            aoVar.f43816g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = boVar.Y;
                            tL_inputChannel.channel_id = chat2.f27001id;
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
                            boVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u5(16));
                            boVar.Y.usernames.clear();
                            boVar.Y.usernames.addAll(arrayList4);
                            boVar.Y.usernames.addAll(arrayList3);
                            boVar.getMessagesController().Q3(boVar.Y, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                boVar.M = true;
                aoVar.I0(false);
                d1Var.f55540a.setPressed(true);
                return;
            case 3:
                l7 l7Var = ((z7) obj).f40958p1;
                if (d1Var != null) {
                    l7Var.d1(false);
                }
                if (i3 != 0) {
                    l7Var.I0(false);
                    if (d1Var != null) {
                        d1Var.f55540a.setPressed(true);
                    }
                }
                if (d1Var != null) {
                    View view2 = d1Var.f55540a;
                    if (i3 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    return;
                }
                return;
            case 4:
                an anVar = (an) obj;
                u51 u51Var = anVar.f31939s;
                if (i3 != 0) {
                    u51Var.setItemAnimator(anVar.f31944w);
                    u51Var.I0(false);
                    d1Var.f55540a.setPressed(true);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, d1Var.f55540a, anVar.f38415a);
                    return;
                }
                return;
            case 5:
                if (i3 != 0) {
                    ((hl0) obj).f34443b.I0(false);
                    d1Var.f55540a.setPressed(true);
                    return;
                }
                return;
            case 6:
                hs0 hs0Var = (hs0) obj;
                sp0 sp0Var = hs0Var.f34494n;
                if (d1Var != null && (qr0Var = hs0Var.f34496s) != null) {
                    qr0Var.d1(false);
                }
                if (i3 == 0) {
                    g0.r(sp0Var);
                    g0.i3(sp0Var, 300L);
                    return;
                }
                return;
            case 7:
                l41 l41Var = (l41) obj;
                if (d1Var != null) {
                    l41Var.d1(false);
                }
                if (i3 == 0) {
                    f41 f41Var = l41Var.f35594g3;
                    if (f41Var.M) {
                        f41Var.F(f41Var.L);
                    }
                    if (l41Var.f35598l3 != null) {
                        l41Var.G1();
                        l41Var.f35598l3 = null;
                        return;
                    }
                    return;
                }
                l41Var.I0(false);
                if (d1Var != null) {
                    View view3 = d1Var.f55540a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof z1) {
                        z1 z1Var = (z1) view3.getBackground();
                        if (!z1Var.f20084c) {
                            z1Var.f20084c = true;
                            z1Var.invalidateSelf();
                        }
                    }
                    if (i3 == 2) {
                        l41Var.f35598l3 = d1Var;
                        l41Var.J1(d1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
            default:
                return;
            case 9:
                if (i3 != 0) {
                    ((fr0) obj).f45331c.I0(false);
                    d1Var.f55540a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(d1 d1Var) {
        int i3 = this.d;
    }

    public boolean r(int i3) {
        fr0 fr0Var = (fr0) this.f11599e;
        if (!fr0Var.J || i3 - fr0Var.f45346o0 >= fr0Var.f45360y) {
            return true;
        }
        return false;
    }

    public mv s(d1 d1Var) {
        int b10;
        hs0 hs0Var = (hs0) this.f11599e;
        if (d1Var == null || (b10 = d1Var.b()) < 0 || b10 >= hs0Var.f34493f.size()) {
            return null;
        }
        return (mv) hs0Var.f34493f.get(b10);
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

    private final void t(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i3, int i10, int i11) {
    }
}
