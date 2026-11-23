package ah;

import ai.l0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.g5;
import di.b1;
import di.e0;
import di.p6;
import di.r0;
import di.t;
import di.u0;
import hi.e7;
import hi.h9;
import hi.k2;
import hi.l2;
import hi.w;
import hi.z6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.c1;
import kg.f0;
import kg.h0;
import kg.m0;
import kg.s0;
import kg.v1;
import kg.w1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n0;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.za0;
import org.telegram.ui.Components.zw0;
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
        w10 w10Var;
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
        w10 w10Var2;
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
                if (!oVar.h && (w10Var = oVar.f1098n) != null && editable != null) {
                    w10Var.a(editable.toString());
                    return;
                }
                return;
            case 1:
                l0 l0Var = (l0) this.f1077b;
                if (!l0Var.L) {
                    int i7 = l0Var.f1350r;
                    if (i7 == 1) {
                        l0Var.N = l0Var.M.length();
                        l0Var.I = editable.length();
                        l0Var.O = (editable.length() <= 0 || Character.isWhitespace(editable.charAt(editable.length() - 1))) ? false : false;
                        return;
                    } else if (i7 == 3 && TextUtils.isEmpty(editable)) {
                        l0Var.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                g5 g5Var = (g5) this.f1077b;
                if (editable != null) {
                    str2 = editable.toString();
                }
                int indexOf3 = str2.indexOf(46);
                if (!g5Var.f3617x1 && indexOf3 >= 0 && (str2.length() - indexOf3) - 1 > 2) {
                    editable.delete(indexOf3 + 3, str2.length());
                    return;
                }
                r52 = (str2.isEmpty() || ".".equals(str2)) ? 1 : 1;
                if (r52 == 0) {
                    aVar = cg.a.i(str2, cg.b.f5269b);
                }
                if (r52 == 0 && aVar == null) {
                    editable.delete(str2.length() - 1, str2.length());
                    return;
                }
                if (r52 == 0) {
                    j12 = aVar.f5267b;
                }
                g5Var.J0(j12);
                return;
            case 3:
                t tVar = (t) this.f1077b;
                di.c cVar = tVar.f9756t0;
                TLRPC.TL_payments_starsRevenueStats h = e0.g(t.s0(tVar)).h(tVar.f9732b, false);
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
                    tVar.f9731a0.setText(Long.toString(j3));
                    di.q qVar = tVar.f9731a0;
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
                    j10 = cg.a.i(editable.toString(), r0Var.C1.f5266a);
                } else {
                    j10 = cg.a.j(0L, r0Var.C1.f5266a);
                }
                r0Var.N0(j10, false, false, true);
                r0Var.f9604q1.c(r0Var.f9605r1.isFocused(), !TextUtils.isEmpty(r0Var.f9605r1.getText()));
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
                    j11 = cg.a.i(editable.toString(), u0Var.f9840z1.f5266a);
                } else {
                    j11 = cg.a.j(0L, u0Var.f9840z1.f5266a);
                }
                u0Var.K0(j11, false, false, true);
                u0Var.f9828m1.c(u0Var.n1.isFocused(), !TextUtils.isEmpty(u0Var.n1.getText()));
                return;
            case 6:
                l2 l2Var = (l2) this.f1077b;
                ImageView imageView = l2Var.f14828r;
                i iVar = l2Var.f14825e;
                if (!l2Var.f14829s) {
                    l2Var.d(false);
                    String obj3 = iVar.getText().toString();
                    if (TextUtils.isEmpty(obj3)) {
                        str = null;
                    } else {
                        str = obj3;
                    }
                    p10 p10Var = l2Var.f14831x;
                    if (p10Var != null) {
                        p10Var.a(str, -1);
                    }
                    k2 k2Var = l2Var.h;
                    if (k2Var != null) {
                        k2Var.I1(null);
                        l2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        kr krVar = kr.h;
                        translationX.setInterpolator(krVar).start();
                        if (imageView != null && l2Var.f14827n != (!TextUtils.isEmpty(iVar.getText()))) {
                            l2Var.f14827n = !l2Var.f14827n;
                            imageView.animate().cancel();
                            if (l2Var.f14827n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f14 = 0.7f;
                            if (l2Var.f14827n) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f10);
                            if (l2Var.f14827n) {
                                f14 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
                            if (l2Var.f14827n) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new w(this, 8)).setInterpolator(krVar).setDuration(320L);
                            if (l2Var.f14827n) {
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
                e7 e7Var = (e7) this.f1077b;
                String obj4 = editable.toString();
                e7Var.f14387n2 = obj4;
                if (!e7Var.V1) {
                    String str3 = e7Var.f14392s2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str3, obj4)) {
                        e7Var.g1();
                        String str4 = e7Var.f14387n2;
                        if (str4 != null && str4.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e7Var.f14391r2 = z10;
                    }
                    String str5 = e7Var.D2;
                    String str6 = e7Var.f14387n2;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    if (!TextUtils.equals(str5, str2)) {
                        e7Var.f1();
                        String str7 = e7Var.f14387n2;
                        if (str7 != null && str7.length() > 3 && !TextUtils.isEmpty(((n0) mp.u1(e7Var.f30223a).A7.K.f15482b).f25966c)) {
                            z15 = true;
                        }
                        e7Var.f14398y2 = z15;
                    }
                    z6 z6Var = e7Var.f14394u2;
                    g0.r(z6Var);
                    g0.h3(z6Var, 400L);
                    z6 z6Var2 = e7Var.F2;
                    g0.r(z6Var2);
                    g0.h3(z6Var2, 400L);
                }
                e7Var.f14385l2.O(true);
                return;
            case 8:
                h9 h9Var = (h9) this.f1077b;
                if (!h9Var.f14601n && (w10Var2 = h9Var.f14602r) != null && editable != null) {
                    w10Var2.a(editable.toString());
                    return;
                }
                return;
            case 9:
                ji.n nVar = (ji.n) this.f1077b;
                nVar.f18075n = editable.toString();
                ji.e eVar = nVar.K;
                if (eVar != null) {
                    eVar.invalidate();
                    return;
                }
                return;
            case 10:
                h0 h0Var = (h0) this.f1077b;
                b1 b1Var2 = h0Var.f18422s;
                sy syVar = h0Var.F;
                kg.e0 e0Var = h0Var.f18425y;
                String obj5 = editable.toString();
                if (!obj5.isEmpty()) {
                    if (syVar != null) {
                        syVar.setText(gd.N0(2131747974, null));
                    }
                } else if (b1Var2.getAdapter() != e0Var) {
                    int P = h0.P(h0Var);
                    syVar.c();
                    b1Var2.setAdapter(e0Var);
                    e0Var.f();
                    if (P > 0) {
                        h0Var.f18423w.h1(0, -P);
                    }
                }
                f0 f0Var = h0Var.E;
                if (f0Var != null) {
                    h0 h0Var2 = f0Var.f18410f;
                    b1 b1Var3 = h0Var2.f18422s;
                    ArrayList arrayList = f0Var.d;
                    arrayList.clear();
                    f0Var.f18409e = obj5;
                    String M3 = g0.M3(obj5);
                    if (M3.startsWith("/")) {
                        M3 = M3.substring(1);
                    }
                    ArrayList arrayList2 = w1.f(i10.f24637t0).f18615b;
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        v1 v1Var = (v1) arrayList2.get(i10);
                        if (!w1.g(v1Var.f18602b)) {
                            String M32 = g0.M3(v1Var.f18602b);
                            if (M32.startsWith(M3) || i5.c.B(" ", M3, M32)) {
                                arrayList.add(v1Var);
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
                s0Var.f18564y = false;
                m0 m0Var = s0Var.G;
                g0.r(m0Var);
                if (TextUtils.isEmpty(s0Var.f18558f.getText())) {
                    s0Var.E = null;
                    s0Var.d.b();
                } else {
                    s0Var.f18564y = true;
                    g0.h3(m0Var, 800L);
                }
                s0Var.f18556c.f35323g3.O(true);
                s0Var.g0();
                return;
            case 12:
                c1 c1Var = (c1) this.f1077b;
                if (!c1Var.f18368c) {
                    c1Var.E = false;
                    c1Var.f18376y = editable.toString();
                    c1Var.Z(true);
                    return;
                }
                return;
            case 13:
                ((li.o) this.f1077b).d0();
                return;
            case 14:
            case 15:
            case 16:
                return;
            case 17:
                yc ycVar = (yc) this.f1077b;
                ycVar.F((ycVar.f14936f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : false);
                return;
            case 18:
                dj djVar = (dj) this.f1077b;
                ui uiVar = djVar.f34357g0;
                TextUtils.isEmpty(djVar.E);
                djVar.E = editable.toString().trim();
                ui uiVar2 = djVar.f34352b0;
                g0.r(uiVar2);
                if (!TextUtils.isEmpty(djVar.E)) {
                    String str8 = djVar.E;
                    if (str8 != null && str8.length() >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    djVar.f34351a0 = z11;
                    if (!TextUtils.equals(djVar.W, djVar.E)) {
                        djVar.M.clear();
                        djVar.f34353c0 = 0;
                        djVar.f34354d0 = false;
                    }
                    g0.h3(uiVar2, 1500L);
                }
                g0.r(uiVar);
                if (!TextUtils.isEmpty(djVar.E)) {
                    String str9 = djVar.E;
                    djVar.f34364n0 = (str9 == null || str9.length() < 3 || TextUtils.isEmpty(((n0) mp.u1(djVar.f37135b.H3).A7.K.f15482b).f25966c)) ? false : false;
                    if (!TextUtils.equals(djVar.f34356f0, djVar.E)) {
                        djVar.N.clear();
                        djVar.f34358h0 = false;
                    }
                    g0.h3(uiVar, 1500L);
                }
                djVar.U();
                return;
            case 19:
                String obj6 = editable.toString();
                if (!obj6.isEmpty()) {
                    sy syVar2 = ((uj) this.f1077b).H;
                    if (syVar2 != null) {
                        syVar2.setText(gd.N0(2131747974, null));
                    }
                } else {
                    i0 adapter2 = ((uj) this.f1077b).f40390s.getAdapter();
                    uj ujVar = (uj) this.f1077b;
                    if (adapter2 != ujVar.F) {
                        int P2 = uj.P(ujVar);
                        ((uj) this.f1077b).H.setText(gd.N0(2131748030, null));
                        ((uj) this.f1077b).H.c();
                        uj ujVar2 = (uj) this.f1077b;
                        ujVar2.f40390s.setAdapter(ujVar2.F);
                        ((uj) this.f1077b).F.f();
                        if (P2 > 0) {
                            ((uj) this.f1077b).f40391w.h1(0, -P2);
                        }
                    }
                }
                qj qjVar = ((uj) this.f1077b).G;
                if (qjVar != null) {
                    if (qjVar.f38897f != null) {
                        Utilities.f22879g.a(qjVar.f38897f);
                        qjVar.f38897f = null;
                    }
                    int i11 = qjVar.h + 1;
                    qjVar.h = i11;
                    ?? r42 = Utilities.f22879g;
                    pj pjVar = new pj(qjVar, obj6, i11, 0);
                    qjVar.f38897f = pjVar;
                    r42.d(pjVar, 300L);
                    return;
                }
                return;
            case 20:
                mt mtVar = (mt) this.f1077b;
                if (mtVar.X1 != mtVar.getLineCount()) {
                    if (!mtVar.Y1 && mtVar.getMeasuredWidth() > 0) {
                        mtVar.G(mtVar.X1, mtVar.getLineCount());
                    }
                    mtVar.X1 = mtVar.getLineCount();
                    return;
                }
                return;
            case 21:
                ((ai.e) this.f1077b).run();
                return;
            case 22:
                dy dyVar = (dy) this.f1077b;
                dyVar.g(false);
                fq fqVar = dyVar.d;
                String obj7 = fqVar.getText().toString();
                dyVar.c(obj7, true);
                cy cyVar = dyVar.f34486r;
                if (cyVar != null) {
                    cyVar.I1(null);
                    cyVar.J1(TextUtils.isEmpty(obj7), true);
                }
                dyVar.f(!TextUtils.isEmpty(obj7));
                if (fqVar != null) {
                    fqVar.clearAnimation();
                    fqVar.animate().translationX(0.0f).setInterpolator(kr.h).start();
                }
                dyVar.d(false);
                return;
            case 23:
                c10 c10Var = (c10) this.f1077b;
                if (!c10Var.G.isEmpty() && editable.length() > 0 && c10Var.J >= 0) {
                    c10Var.J = -1;
                    c10Var.e();
                }
                c10Var.f33877a.a((c10Var.f33882n || c10Var.f33883r.length() > 0) ? true : true, true);
                return;
            case 24:
                oc0 oc0Var = (oc0) this.f1077b;
                if (oc0Var.f38122r.length() == 4 && bz.f23316r == 0) {
                    oc0Var.n(false);
                    return;
                }
                return;
            case 25:
                tl0 tl0Var = (tl0) this.f1077b;
                ImageView imageView2 = tl0Var.f40075b;
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
                zw0 zw0Var = (zw0) this.f1077b;
                xw0 xw0Var = zw0Var.f43058c;
                if (xw0Var != null && xw0Var.getVisibility() == 0) {
                    zw0Var.e();
                    return;
                }
                return;
            case 27:
                oy0 oy0Var = (oy0) this.f1077b;
                n6 n6Var = oy0Var.f38283n;
                if (!oy0Var.f38288y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        n6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        n6Var.setText("");
                    }
                    w10 w10Var3 = oy0Var.f38287x;
                    if (w10Var3 != null) {
                        w10Var3.a(trim);
                    }
                    fj fjVar = oy0Var.f38284r;
                    if (fjVar != null) {
                        fjVar.M1 = true;
                        oy0Var.d.y3(fjVar, null, false, false, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                f11 f11Var = (f11) this.f1077b;
                f11Var.M = editable.toString().trim().toLowerCase();
                if (f11Var.M.startsWith("@")) {
                    f11Var.M = f11Var.M.substring(1);
                }
                f11Var.l(true);
                f11Var.n();
                return;
            default:
                p51 p51Var = (p51) this.f1077b;
                String obj8 = p51Var.K.getText().toString();
                q51 q51Var = p51Var.L;
                if (q51Var.f38698o1.getAdapter() == null) {
                    b10 = 0;
                } else {
                    b10 = q51Var.f38698o1.getAdapter().b();
                }
                q51Var.M0(obj8);
                if (TextUtils.isEmpty(obj8) && (b1Var = q51Var.f38698o1) != null) {
                    i0 adapter3 = b1Var.getAdapter();
                    dk0 dk0Var = q51Var.f38700q1;
                    if (adapter3 != dk0Var) {
                        b1 b1Var4 = q51Var.f38698o1;
                        b1Var4.X1 = false;
                        b1Var4.Y1 = 0;
                        b1Var4.setAdapter(dk0Var);
                        b1 b1Var5 = q51Var.f38698o1;
                        b1Var5.X1 = true;
                        b1Var5.Y1 = 0;
                        if (b10 == 0) {
                            q51Var.P0(0);
                        }
                    }
                }
                q51Var.f38705v1.setVisibility(0);
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
                oc0 oc0Var = (oc0) this.f1077b;
                LinkedList linkedList = oc0Var.W;
                LinkedList linkedList2 = oc0Var.V;
                Drawable drawable = oc0Var.f38107a;
                if (drawable instanceof za0) {
                    za0 za0Var = (za0) drawable;
                    za0Var.D = null;
                    za0Var.y();
                    float f10 = za0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        za0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        za0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            oc0Var.b(za0Var);
                            return;
                        }
                        linkedList2.offer(new p6(this, z10, za0Var, 23));
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
                searchView.f1876p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.f1875o0 && !searchView.f1869h0 && isEmpty) {
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
                    m0Var.l(q0Var.f29964e);
                }
                q0Var.k();
                if (!q0Var.f29969h0.isEmpty() && !TextUtils.isEmpty(q0Var.f29964e.getText()) && q0Var.f29970i0 >= 0) {
                    q0Var.f29970i0 = -1;
                    q0Var.E();
                    return;
                }
                return;
            case 16:
                z4 z4Var = (z4) this.f1077b;
                z4Var.m();
                org.telegram.ui.ActionBar.m0 j3 = z4.j(z4Var);
                if (j3 != null) {
                    j3.l(z4Var.f30403s);
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
