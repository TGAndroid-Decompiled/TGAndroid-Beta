package ah;

import ai.p0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.d5;
import di.b1;
import di.e0;
import di.r0;
import di.t;
import di.u0;
import hi.c2;
import hi.d2;
import hi.m8;
import hi.p6;
import hi.u6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.c1;
import kg.f0;
import kg.h0;
import kg.m0;
import kg.s0;
import kg.u1;
import kg.v1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n0;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yw0;
import v4.i0;
public final class j implements TextWatcher {
    public final int f1076a;
    public final Object f1077b;

    public j(Object obj, int i7) {
        this.f1076a = i7;
        this.f1077b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        y10 y10Var;
        long j3;
        ?? r32;
        cg.a j10;
        String obj;
        int indexOf;
        ?? r33;
        cg.a j11;
        String obj2;
        int indexOf2;
        String str;
        float f10;
        float f11;
        boolean z10;
        y10 y10Var2;
        boolean z11;
        boolean z12;
        float f12;
        int b10;
        b1 b1Var;
        float f13 = 0.0f;
        String str2 = "";
        long j12 = 0;
        cg.a aVar = null;
        boolean z13 = true;
        ?? r52 = 0;
        boolean z14 = false;
        r5 = false;
        r5 = false;
        boolean z15 = false;
        switch (this.f1076a) {
            case 0:
                o oVar = (o) this.f1077b;
                if (!oVar.h && (y10Var = oVar.f1098n) != null && editable != null) {
                    y10Var.a(editable.toString());
                    return;
                }
                return;
            case 1:
                p0 p0Var = (p0) this.f1077b;
                if (!p0Var.L) {
                    int i7 = p0Var.f1405r;
                    if (i7 == 1) {
                        p0Var.N = p0Var.M.length();
                        p0Var.I = editable.length();
                        p0Var.O = (editable.length() <= 0 || Character.isWhitespace(editable.charAt(editable.length() - 1))) ? false : false;
                        return;
                    } else if (i7 == 3 && TextUtils.isEmpty(editable)) {
                        p0Var.k();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                d5 d5Var = (d5) this.f1077b;
                if (editable != null) {
                    str2 = editable.toString();
                }
                int indexOf3 = str2.indexOf(46);
                if (!d5Var.f3556x1 && indexOf3 >= 0 && (str2.length() - indexOf3) - 1 > 2) {
                    editable.delete(indexOf3 + 3, str2.length());
                    return;
                }
                r52 = (str2.isEmpty() || ".".equals(str2)) ? 1 : 1;
                if (r52 == 0) {
                    aVar = cg.a.i(str2, cg.b.f5306b);
                }
                if (r52 == 0 && aVar == null) {
                    editable.delete(str2.length() - 1, str2.length());
                    return;
                }
                if (r52 == 0) {
                    j12 = aVar.f5304b;
                }
                d5Var.J0(j12);
                return;
            case 3:
                t tVar = (t) this.f1077b;
                di.c cVar = tVar.f9795t0;
                TLRPC.TL_payments_starsRevenueStats h = e0.g(t.s0(tVar)).h(tVar.f9771b, false);
                if (h == null) {
                    j3 = 0;
                } else {
                    j3 = h.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                tVar.Z = j12;
                if (j12 > j3) {
                    tVar.Z = j3;
                    tVar.X = true;
                    tVar.f9770a0.setText(Long.toString(j3));
                    di.q qVar = tVar.f9770a0;
                    qVar.setSelection(qVar.getText().length());
                    tVar.X = false;
                }
                if (tVar.Z != j3) {
                    z13 = false;
                }
                tVar.Y = z13;
                g0.r(cVar);
                cVar.run();
                if (!tVar.X) {
                    tVar.Y = false;
                    return;
                }
                return;
            case 4:
                r0 r0Var = (r0) this.f1077b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    r32 = false;
                } else {
                    r32 = true;
                }
                if (r32 == false && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                if (r32 == false) {
                    j10 = cg.a.i(editable.toString(), r0Var.C1.f5303a);
                } else {
                    j10 = cg.a.j(0L, r0Var.C1.f5303a);
                }
                r0Var.N0(j10, false, false, true);
                r0Var.f9643q1.c(r0Var.f9644r1.isFocused(), !TextUtils.isEmpty(r0Var.f9644r1.getText()));
                return;
            case 5:
                u0 u0Var = (u0) this.f1077b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    r33 = false;
                } else {
                    r33 = true;
                }
                if (r33 == false && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                if (r33 == false) {
                    j11 = cg.a.i(editable.toString(), u0Var.f9879z1.f5303a);
                } else {
                    j11 = cg.a.j(0L, u0Var.f9879z1.f5303a);
                }
                u0Var.K0(j11, false, false, true);
                u0Var.f9867m1.c(u0Var.n1.isFocused(), !TextUtils.isEmpty(u0Var.n1.getText()));
                return;
            case 6:
                d2 d2Var = (d2) this.f1077b;
                ImageView imageView = d2Var.f14482r;
                i iVar = d2Var.f14479e;
                if (!d2Var.f14483s) {
                    d2Var.d(false);
                    String obj3 = iVar.getText().toString();
                    if (TextUtils.isEmpty(obj3)) {
                        str = null;
                    } else {
                        str = obj3;
                    }
                    r10 r10Var = d2Var.f14485x;
                    if (r10Var != null) {
                        r10Var.a(str, -1);
                    }
                    c2 c2Var = d2Var.h;
                    if (c2Var != null) {
                        c2Var.I1(null);
                        d2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        nr nrVar = nr.h;
                        translationX.setInterpolator(nrVar).start();
                        if (imageView != null && d2Var.f14481n != (!TextUtils.isEmpty(iVar.getText()))) {
                            d2Var.f14481n = !d2Var.f14481n;
                            imageView.animate().cancel();
                            if (d2Var.f14481n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f14 = 0.7f;
                            if (d2Var.f14481n) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f10);
                            if (d2Var.f14481n) {
                                f14 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
                            if (d2Var.f14481n) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new hi.l(this, 7)).setInterpolator(nrVar).setDuration(320L);
                            if (d2Var.f14481n) {
                                j12 = 240;
                            }
                            duration.setStartDelay(j12).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                u6 u6Var = (u6) this.f1077b;
                String obj4 = editable.toString();
                u6Var.f15559n2 = obj4;
                if (!u6Var.V1) {
                    String str3 = u6Var.f15564s2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str3, obj4)) {
                        u6Var.g1();
                        String str4 = u6Var.f15559n2;
                        if (str4 != null && str4.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u6Var.f15563r2 = z10;
                    }
                    String str5 = u6Var.D2;
                    String str6 = u6Var.f15559n2;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    if (!TextUtils.equals(str5, str2)) {
                        u6Var.f1();
                        String str7 = u6Var.f15559n2;
                        if (str7 != null && str7.length() > 3 && !TextUtils.isEmpty(((n0) np.u1(u6Var.f30173a).A7.K.f15508b).f25711c)) {
                            z15 = true;
                        }
                        u6Var.f15570y2 = z15;
                    }
                    p6 p6Var = u6Var.f15566u2;
                    g0.r(p6Var);
                    g0.h3(p6Var, 400L);
                    p6 p6Var2 = u6Var.F2;
                    g0.r(p6Var2);
                    g0.h3(p6Var2, 400L);
                }
                u6Var.f15557l2.O(true);
                return;
            case 8:
                m8 m8Var = (m8) this.f1077b;
                if (!m8Var.f15035n && (y10Var2 = m8Var.f15036r) != null && editable != null) {
                    y10Var2.a(editable.toString());
                    return;
                }
                return;
            case 9:
                ji.o oVar2 = (ji.o) this.f1077b;
                oVar2.f18010n = editable.toString();
                ji.e eVar = oVar2.K;
                if (eVar != null) {
                    eVar.invalidate();
                    return;
                }
                return;
            case 10:
                h0 h0Var = (h0) this.f1077b;
                b1 b1Var2 = h0Var.f18365s;
                vy vyVar = h0Var.F;
                kg.e0 e0Var = h0Var.f18368y;
                String obj5 = editable.toString();
                if (!obj5.isEmpty()) {
                    if (vyVar != null) {
                        vyVar.setText(hd.N0(2131747974, null));
                    }
                } else if (b1Var2.getAdapter() != e0Var) {
                    int P = h0.P(h0Var);
                    vyVar.c();
                    b1Var2.setAdapter(e0Var);
                    e0Var.f();
                    if (P > 0) {
                        h0Var.f18366w.h1(0, -P);
                    }
                }
                f0 f0Var = h0Var.E;
                if (f0Var != null) {
                    h0 h0Var2 = f0Var.f18348f;
                    b1 b1Var3 = h0Var2.f18365s;
                    ArrayList arrayList = f0Var.d;
                    arrayList.clear();
                    f0Var.f18347e = obj5;
                    String M3 = g0.M3(obj5);
                    if (M3.startsWith("/")) {
                        M3 = M3.substring(1);
                    }
                    ArrayList arrayList2 = v1.f(k10.f24968t0).f18545b;
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        u1 u1Var = (u1) arrayList2.get(i10);
                        if (!v1.g(u1Var.f18534b)) {
                            String M32 = g0.M3(u1Var.f18534b);
                            if (M32.startsWith(M3) || i5.c.B(" ", M3, M32)) {
                                arrayList.add(u1Var);
                            }
                        }
                    }
                    i0 adapter = b1Var3.getAdapter();
                    f0 f0Var2 = h0Var2.E;
                    if (adapter != f0Var2) {
                        b1Var3.setAdapter(f0Var2);
                    }
                    f0Var.f();
                    return;
                }
                return;
            case 11:
                s0 s0Var = (s0) this.f1077b;
                s0Var.f18507y = false;
                m0 m0Var = s0Var.G;
                g0.r(m0Var);
                if (TextUtils.isEmpty(s0Var.f18501f.getText())) {
                    s0Var.E = null;
                    s0Var.d.b();
                } else {
                    s0Var.f18507y = true;
                    g0.h3(m0Var, 800L);
                }
                s0Var.f18499c.f35789g3.O(true);
                s0Var.g0();
                return;
            case 12:
                c1 c1Var = (c1) this.f1077b;
                if (!c1Var.f18306c) {
                    c1Var.E = false;
                    c1Var.f18314y = editable.toString();
                    c1Var.Z(true);
                    return;
                }
                return;
            case 13:
                ((li.p) this.f1077b).d0();
                return;
            case 14:
            case 15:
            case 16:
                return;
            case 17:
                yc ycVar = (yc) this.f1077b;
                ycVar.F((ycVar.f15151f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : false);
                return;
            case 18:
                ej ejVar = (ej) this.f1077b;
                vi viVar = ejVar.f34821g0;
                TextUtils.isEmpty(ejVar.E);
                ejVar.E = editable.toString().trim();
                vi viVar2 = ejVar.f34816b0;
                g0.r(viVar2);
                if (!TextUtils.isEmpty(ejVar.E)) {
                    String str8 = ejVar.E;
                    if (str8 != null && str8.length() >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ejVar.f34815a0 = z11;
                    if (!TextUtils.equals(ejVar.W, ejVar.E)) {
                        ejVar.M.clear();
                        ejVar.f34817c0 = 0;
                        ejVar.f34818d0 = false;
                    }
                    g0.h3(viVar2, 1500L);
                }
                g0.r(viVar);
                if (!TextUtils.isEmpty(ejVar.E)) {
                    String str9 = ejVar.E;
                    ejVar.f34828n0 = (str9 == null || str9.length() < 3 || TextUtils.isEmpty(((n0) np.u1(ejVar.f37519b.H3).A7.K.f15508b).f25711c)) ? false : false;
                    if (!TextUtils.equals(ejVar.f34820f0, ejVar.E)) {
                        ejVar.N.clear();
                        ejVar.f34822h0 = false;
                    }
                    g0.h3(viVar, 1500L);
                }
                ejVar.U();
                return;
            case 19:
                String obj6 = editable.toString();
                if (!obj6.isEmpty()) {
                    vy vyVar2 = ((vj) this.f1077b).H;
                    if (vyVar2 != null) {
                        vyVar2.setText(hd.N0(2131747974, null));
                    }
                } else {
                    i0 adapter2 = ((vj) this.f1077b).f40849s.getAdapter();
                    vj vjVar = (vj) this.f1077b;
                    if (adapter2 != vjVar.F) {
                        int P2 = vj.P(vjVar);
                        ((vj) this.f1077b).H.setText(hd.N0(2131748030, null));
                        ((vj) this.f1077b).H.c();
                        vj vjVar2 = (vj) this.f1077b;
                        vjVar2.f40849s.setAdapter(vjVar2.F);
                        ((vj) this.f1077b).F.f();
                        if (P2 > 0) {
                            ((vj) this.f1077b).f40850w.h1(0, -P2);
                        }
                    }
                }
                rj rjVar = ((vj) this.f1077b).G;
                if (rjVar != null) {
                    if (rjVar.f39251f != null) {
                        Utilities.f22812g.a(rjVar.f39251f);
                        rjVar.f39251f = null;
                    }
                    int i11 = rjVar.h + 1;
                    rjVar.h = i11;
                    ?? r42 = Utilities.f22812g;
                    qj qjVar = new qj(rjVar, obj6, i11, 0);
                    rjVar.f39251f = qjVar;
                    r42.d(qjVar, 300L);
                    return;
                }
                return;
            case 20:
                ot otVar = (ot) this.f1077b;
                if (otVar.X1 != otVar.getLineCount()) {
                    if (!otVar.Y1 && otVar.getMeasuredWidth() > 0) {
                        otVar.G(otVar.X1, otVar.getLineCount());
                    }
                    otVar.X1 = otVar.getLineCount();
                    return;
                }
                return;
            case 21:
                ((ai.i) this.f1077b).run();
                return;
            case 22:
                gy gyVar = (gy) this.f1077b;
                gyVar.g(false);
                iq iqVar = gyVar.d;
                String obj7 = iqVar.getText().toString();
                gyVar.c(obj7, true);
                fy fyVar = gyVar.f35718r;
                if (fyVar != null) {
                    fyVar.I1(null);
                    fyVar.J1(TextUtils.isEmpty(obj7), true);
                }
                gyVar.f(!TextUtils.isEmpty(obj7));
                if (iqVar != null) {
                    iqVar.clearAnimation();
                    iqVar.animate().translationX(0.0f).setInterpolator(nr.h).start();
                }
                gyVar.d(false);
                return;
            case 23:
                e10 e10Var = (e10) this.f1077b;
                if (!e10Var.G.isEmpty() && editable.length() > 0 && e10Var.J >= 0) {
                    e10Var.J = -1;
                    e10Var.e();
                }
                e10Var.f34636a.a((e10Var.f34641n || e10Var.f34642r.length() > 0) ? true : true, true);
                return;
            case 24:
                qc0 qc0Var = (qc0) this.f1077b;
                if (qc0Var.f38886r.length() == 4 && cz.f23436r == 0) {
                    qc0Var.n(false);
                    return;
                }
                return;
            case 25:
                tl0 tl0Var = (tl0) this.f1077b;
                ImageView imageView2 = tl0Var.f39939b;
                i iVar2 = tl0Var.d;
                if (iVar2.length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (imageView2.getAlpha() == 0.0f) {
                    z13 = false;
                }
                if (z12 != z13) {
                    ViewPropertyAnimator animate2 = imageView2.animate();
                    if (z12) {
                        f13 = 1.0f;
                    }
                    ViewPropertyAnimator duration2 = animate2.alpha(f13).setDuration(150L);
                    float f15 = 0.1f;
                    if (z12) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX2 = duration2.scaleX(f12);
                    if (z12) {
                        f15 = 1.0f;
                    }
                    scaleX2.scaleY(f15).start();
                }
                tl0Var.a(iVar2.getText().toString());
                return;
            case 26:
                ax0 ax0Var = (ax0) this.f1077b;
                yw0 yw0Var = ax0Var.f33656c;
                if (yw0Var != null && yw0Var.getVisibility() == 0) {
                    ax0Var.e();
                    return;
                }
                return;
            case 27:
                py0 py0Var = (py0) this.f1077b;
                o6 o6Var = py0Var.f38683n;
                if (!py0Var.f38688y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        o6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        o6Var.setText("");
                    }
                    y10 y10Var3 = py0Var.f38687x;
                    if (y10Var3 != null) {
                        y10Var3.a(trim);
                    }
                    gj gjVar = py0Var.f38684r;
                    if (gjVar != null) {
                        gjVar.M1 = true;
                        py0Var.d.y3(gjVar, null, false, false, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                g11 g11Var = (g11) this.f1077b;
                g11Var.M = editable.toString().trim().toLowerCase();
                if (g11Var.M.startsWith("@")) {
                    g11Var.M = g11Var.M.substring(1);
                }
                g11Var.l(true);
                g11Var.n();
                return;
            default:
                q51 q51Var = (q51) this.f1077b;
                String obj8 = q51Var.K.getText().toString();
                r51 r51Var = q51Var.L;
                if (r51Var.f39081o1.getAdapter() == null) {
                    b10 = 0;
                } else {
                    b10 = r51Var.f39081o1.getAdapter().b();
                }
                r51Var.M0(obj8);
                if (TextUtils.isEmpty(obj8) && (b1Var = r51Var.f39081o1) != null) {
                    i0 adapter3 = b1Var.getAdapter();
                    dk0 dk0Var = r51Var.f39083q1;
                    if (adapter3 != dk0Var) {
                        b1 b1Var4 = r51Var.f39081o1;
                        b1Var4.X1 = false;
                        b1Var4.Y1 = 0;
                        b1Var4.setAdapter(dk0Var);
                        b1 b1Var5 = r51Var.f39081o1;
                        b1Var5.X1 = true;
                        b1Var5.Y1 = 0;
                        if (b10 == 0) {
                            r51Var.P0(0);
                        }
                    }
                }
                r51Var.f39088v1.setVisibility(0);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.f1076a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return;
            case 24:
                qc0 qc0Var = (qc0) this.f1077b;
                LinkedList linkedList = qc0Var.W;
                LinkedList linkedList2 = qc0Var.V;
                Drawable drawable = qc0Var.f38871a;
                if (drawable instanceof cb0) {
                    cb0 cb0Var = (cb0) drawable;
                    cb0Var.D = null;
                    cb0Var.y();
                    float f10 = cb0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        cb0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        cb0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            qc0Var.b(cb0Var);
                            return;
                        }
                        linkedList2.offer(new di.p6(this, z10, cb0Var, 23));
                        linkedList.offer(Boolean.valueOf(z10));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < linkedList2.size(); i13++) {
                            Runnable runnable = (Runnable) linkedList2.get(i13);
                            if (((Boolean) linkedList.get(i13)).booleanValue() != z10) {
                                arrayList.add(runnable);
                                arrayList2.add(Integer.valueOf(i13));
                            }
                        }
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            linkedList2.remove((Runnable) obj);
                        }
                        int size2 = arrayList2.size();
                        while (i12 < size2) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            int intValue = ((Integer) obj2).intValue();
                            if (intValue < linkedList.size()) {
                                linkedList.remove(intValue);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f1076a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return;
            case 14:
                SearchView searchView = (SearchView) this.f1077b;
                Editable text = searchView.G.getText();
                searchView.f1924p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.f1923o0 && !searchView.f1917h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                    i12 = 0;
                }
                searchView.N.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
            case 15:
                q0 q0Var = (q0) this.f1077b;
                org.telegram.ui.ActionBar.m0 m0Var = q0Var.I;
                if (m0Var != null) {
                    m0Var.l(q0Var.f29907e);
                }
                q0Var.k();
                if (!q0Var.f29912h0.isEmpty() && !TextUtils.isEmpty(q0Var.f29907e.getText()) && q0Var.f29913i0 >= 0) {
                    q0Var.f29913i0 = -1;
                    q0Var.E();
                    return;
                }
                return;
            case 16:
                z4 z4Var = (z4) this.f1077b;
                z4Var.m();
                org.telegram.ui.ActionBar.m0 j3 = z4.j(z4Var);
                if (j3 != null) {
                    j3.l(z4Var.f30346s);
                    return;
                }
                return;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void A(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void K(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void L(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void M(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void N(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void O(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void P(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void R(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void S(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void T(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void U(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void V(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void W(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void X(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Z(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void a0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
