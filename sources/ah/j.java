package ah;

import ai.n0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.b5;
import di.b1;
import di.e0;
import di.p6;
import di.r0;
import di.t;
import di.u0;
import hi.d2;
import hi.e2;
import hi.n8;
import hi.q6;
import hi.v6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.d0;
import kg.d1;
import kg.t0;
import kg.v1;
import kg.w1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ww0;
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
        x10 x10Var;
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
        x10 x10Var2;
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
                if (!oVar.h && (x10Var = oVar.f1098n) != null && editable != null) {
                    x10Var.a(editable.toString());
                    return;
                }
                return;
            case 1:
                n0 n0Var = (n0) this.f1077b;
                if (!n0Var.L) {
                    int i7 = n0Var.f1377r;
                    if (i7 == 1) {
                        n0Var.N = n0Var.M.length();
                        n0Var.I = editable.length();
                        n0Var.O = (editable.length() <= 0 || Character.isWhitespace(editable.charAt(editable.length() - 1))) ? false : false;
                        return;
                    } else if (i7 == 3 && TextUtils.isEmpty(editable)) {
                        n0Var.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                b5 b5Var = (b5) this.f1077b;
                if (editable != null) {
                    str2 = editable.toString();
                }
                int indexOf3 = str2.indexOf(46);
                if (!b5Var.f3466x1 && indexOf3 >= 0 && (str2.length() - indexOf3) - 1 > 2) {
                    editable.delete(indexOf3 + 3, str2.length());
                    return;
                }
                r52 = (str2.isEmpty() || ".".equals(str2)) ? 1 : 1;
                if (r52 == 0) {
                    aVar = cg.a.i(str2, cg.b.f5277b);
                }
                if (r52 == 0 && aVar == null) {
                    editable.delete(str2.length() - 1, str2.length());
                    return;
                }
                if (r52 == 0) {
                    j12 = aVar.f5275b;
                }
                b5Var.J0(j12);
                return;
            case 3:
                t tVar = (t) this.f1077b;
                di.c cVar = tVar.f9776t0;
                TLRPC.TL_payments_starsRevenueStats h = e0.g(t.s0(tVar)).h(tVar.f9752b, false);
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
                    tVar.f9751a0.setText(Long.toString(j3));
                    di.q qVar = tVar.f9751a0;
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
                    j10 = cg.a.i(editable.toString(), r0Var.C1.f5274a);
                } else {
                    j10 = cg.a.j(0L, r0Var.C1.f5274a);
                }
                r0Var.N0(j10, false, false, true);
                r0Var.f9612q1.c(r0Var.f9613r1.isFocused(), !TextUtils.isEmpty(r0Var.f9613r1.getText()));
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
                    j11 = cg.a.i(editable.toString(), u0Var.f9844z1.f5274a);
                } else {
                    j11 = cg.a.j(0L, u0Var.f9844z1.f5274a);
                }
                u0Var.K0(j11, false, false, true);
                u0Var.f9832m1.c(u0Var.n1.isFocused(), !TextUtils.isEmpty(u0Var.n1.getText()));
                return;
            case 6:
                e2 e2Var = (e2) this.f1077b;
                ImageView imageView = e2Var.f14531r;
                i iVar = e2Var.f14528e;
                if (!e2Var.f14532s) {
                    e2Var.d(false);
                    String obj3 = iVar.getText().toString();
                    if (TextUtils.isEmpty(obj3)) {
                        str = null;
                    } else {
                        str = obj3;
                    }
                    q10 q10Var = e2Var.f14534x;
                    if (q10Var != null) {
                        q10Var.a(str, -1);
                    }
                    d2 d2Var = e2Var.h;
                    if (d2Var != null) {
                        d2Var.I1(null);
                        e2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        lr lrVar = lr.h;
                        translationX.setInterpolator(lrVar).start();
                        if (imageView != null && e2Var.f14530n != (!TextUtils.isEmpty(iVar.getText()))) {
                            e2Var.f14530n = !e2Var.f14530n;
                            imageView.animate().cancel();
                            if (e2Var.f14530n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f14 = 0.7f;
                            if (e2Var.f14530n) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f10);
                            if (e2Var.f14530n) {
                                f14 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
                            if (e2Var.f14530n) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new hi.k(this, 7)).setInterpolator(lrVar).setDuration(320L);
                            if (e2Var.f14530n) {
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
                v6 v6Var = (v6) this.f1077b;
                String obj4 = editable.toString();
                v6Var.f15592n2 = obj4;
                if (!v6Var.V1) {
                    String str3 = v6Var.f15597s2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str3, obj4)) {
                        v6Var.g1();
                        String str4 = v6Var.f15592n2;
                        if (str4 != null && str4.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v6Var.f15596r2 = z10;
                    }
                    String str5 = v6Var.D2;
                    String str6 = v6Var.f15592n2;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    if (!TextUtils.equals(str5, str2)) {
                        v6Var.f1();
                        String str7 = v6Var.f15592n2;
                        if (str7 != null && str7.length() > 3 && !TextUtils.isEmpty(((org.telegram.messenger.n0) mp.u1(v6Var.f30189a).A7.K.f15539b).f25873c)) {
                            z15 = true;
                        }
                        v6Var.f15603y2 = z15;
                    }
                    q6 q6Var = v6Var.f15599u2;
                    g0.r(q6Var);
                    g0.h3(q6Var, 400L);
                    q6 q6Var2 = v6Var.F2;
                    g0.r(q6Var2);
                    g0.h3(q6Var2, 400L);
                }
                v6Var.f15590l2.O(true);
                return;
            case 8:
                n8 n8Var = (n8) this.f1077b;
                if (!n8Var.f15113n && (x10Var2 = n8Var.f15114r) != null && editable != null) {
                    x10Var2.a(editable.toString());
                    return;
                }
                return;
            case 9:
                ji.m mVar = (ji.m) this.f1077b;
                mVar.f17979n = editable.toString();
                ji.e eVar = mVar.K;
                if (eVar != null) {
                    eVar.invalidate();
                    return;
                }
                return;
            case 10:
                kg.g0 g0Var = (kg.g0) this.f1077b;
                b1 b1Var2 = g0Var.f18322s;
                ty tyVar = g0Var.F;
                d0 d0Var = g0Var.f18325y;
                String obj5 = editable.toString();
                if (!obj5.isEmpty()) {
                    if (tyVar != null) {
                        tyVar.setText(gd.M0(2131747975, null));
                    }
                } else if (b1Var2.getAdapter() != d0Var) {
                    int P = kg.g0.P(g0Var);
                    tyVar.c();
                    b1Var2.setAdapter(d0Var);
                    d0Var.f();
                    if (P > 0) {
                        g0Var.f18323w.h1(0, -P);
                    }
                }
                kg.e0 e0Var = g0Var.E;
                if (e0Var != null) {
                    kg.g0 g0Var2 = e0Var.f18303f;
                    b1 b1Var3 = g0Var2.f18322s;
                    ArrayList arrayList = e0Var.d;
                    arrayList.clear();
                    e0Var.f18302e = obj5;
                    String M3 = g0.M3(obj5);
                    if (M3.startsWith("/")) {
                        M3 = M3.substring(1);
                    }
                    ArrayList arrayList2 = w1.f(j10.f24773t0).f18523b;
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        v1 v1Var = (v1) arrayList2.get(i10);
                        if (!w1.g(v1Var.f18510b)) {
                            String M32 = g0.M3(v1Var.f18510b);
                            if (M32.startsWith(M3) || i5.c.B(" ", M3, M32)) {
                                arrayList.add(v1Var);
                            }
                        }
                    }
                    i0 adapter = b1Var3.getAdapter();
                    kg.e0 e0Var2 = g0Var2.E;
                    if (adapter != e0Var2) {
                        b1Var3.setAdapter(e0Var2);
                    }
                    e0Var.f();
                    return;
                }
                return;
            case 11:
                t0 t0Var = (t0) this.f1077b;
                t0Var.f18487y = false;
                kg.n0 n0Var2 = t0Var.G;
                g0.r(n0Var2);
                if (TextUtils.isEmpty(t0Var.f18481f.getText())) {
                    t0Var.E = null;
                    t0Var.d.b();
                } else {
                    t0Var.f18487y = true;
                    g0.h3(n0Var2, 800L);
                }
                t0Var.f18479c.f34607g3.O(true);
                t0Var.g0();
                return;
            case 12:
                d1 d1Var = (d1) this.f1077b;
                if (!d1Var.f18281c) {
                    d1Var.E = false;
                    d1Var.f18289y = editable.toString();
                    d1Var.Z(true);
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
                ycVar.F((ycVar.f15051f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : false);
                return;
            case 18:
                cj cjVar = (cj) this.f1077b;
                ti tiVar = cjVar.f34022g0;
                TextUtils.isEmpty(cjVar.E);
                cjVar.E = editable.toString().trim();
                ti tiVar2 = cjVar.f34017b0;
                g0.r(tiVar2);
                if (!TextUtils.isEmpty(cjVar.E)) {
                    String str8 = cjVar.E;
                    if (str8 != null && str8.length() >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cjVar.f34016a0 = z11;
                    if (!TextUtils.equals(cjVar.W, cjVar.E)) {
                        cjVar.M.clear();
                        cjVar.f34018c0 = 0;
                        cjVar.f34019d0 = false;
                    }
                    g0.h3(tiVar2, 1500L);
                }
                g0.r(tiVar);
                if (!TextUtils.isEmpty(cjVar.E)) {
                    String str9 = cjVar.E;
                    cjVar.f34029n0 = (str9 == null || str9.length() < 3 || TextUtils.isEmpty(((org.telegram.messenger.n0) mp.u1(cjVar.f36766b.H3).A7.K.f15539b).f25873c)) ? false : false;
                    if (!TextUtils.equals(cjVar.f34021f0, cjVar.E)) {
                        cjVar.N.clear();
                        cjVar.f34023h0 = false;
                    }
                    g0.h3(tiVar, 1500L);
                }
                cjVar.U();
                return;
            case 19:
                String obj6 = editable.toString();
                if (!obj6.isEmpty()) {
                    ty tyVar2 = ((tj) this.f1077b).H;
                    if (tyVar2 != null) {
                        tyVar2.setText(gd.M0(2131747975, null));
                    }
                } else {
                    i0 adapter2 = ((tj) this.f1077b).f40022s.getAdapter();
                    tj tjVar = (tj) this.f1077b;
                    if (adapter2 != tjVar.F) {
                        int P2 = tj.P(tjVar);
                        ((tj) this.f1077b).H.setText(gd.M0(2131748031, null));
                        ((tj) this.f1077b).H.c();
                        tj tjVar2 = (tj) this.f1077b;
                        tjVar2.f40022s.setAdapter(tjVar2.F);
                        ((tj) this.f1077b).F.f();
                        if (P2 > 0) {
                            ((tj) this.f1077b).f40023w.h1(0, -P2);
                        }
                    }
                }
                pj pjVar = ((tj) this.f1077b).G;
                if (pjVar != null) {
                    if (pjVar.f38458f != null) {
                        Utilities.f22784g.a(pjVar.f38458f);
                        pjVar.f38458f = null;
                    }
                    int i11 = pjVar.h + 1;
                    pjVar.h = i11;
                    ?? r42 = Utilities.f22784g;
                    oj ojVar = new oj(pjVar, obj6, i11, 0);
                    pjVar.f38458f = ojVar;
                    r42.d(ojVar, 300L);
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
                ((ai.n) this.f1077b).run();
                return;
            case 22:
                ey eyVar = (ey) this.f1077b;
                eyVar.g(false);
                gq gqVar = eyVar.d;
                String obj7 = gqVar.getText().toString();
                eyVar.c(obj7, true);
                dy dyVar = eyVar.f34841r;
                if (dyVar != null) {
                    dyVar.I1(null);
                    dyVar.J1(TextUtils.isEmpty(obj7), true);
                }
                eyVar.f(!TextUtils.isEmpty(obj7));
                if (gqVar != null) {
                    gqVar.clearAnimation();
                    gqVar.animate().translationX(0.0f).setInterpolator(lr.h).start();
                }
                eyVar.d(false);
                return;
            case 23:
                c10 c10Var = (c10) this.f1077b;
                if (!c10Var.G.isEmpty() && editable.length() > 0 && c10Var.J >= 0) {
                    c10Var.J = -1;
                    c10Var.e();
                }
                c10Var.f33839a.a((c10Var.f33844n || c10Var.f33845r.length() > 0) ? true : true, true);
                return;
            case 24:
                pc0 pc0Var = (pc0) this.f1077b;
                if (pc0Var.f38375r.length() == 4 && bz.f23194r == 0) {
                    pc0Var.n(false);
                    return;
                }
                return;
            case 25:
                rl0 rl0Var = (rl0) this.f1077b;
                ImageView imageView2 = rl0Var.f39173b;
                i iVar2 = rl0Var.d;
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
                rl0Var.a(iVar2.getText().toString());
                return;
            case 26:
                yw0 yw0Var = (yw0) this.f1077b;
                ww0 ww0Var = yw0Var.f42647c;
                if (ww0Var != null && ww0Var.getVisibility() == 0) {
                    yw0Var.e();
                    return;
                }
                return;
            case 27:
                ny0 ny0Var = (ny0) this.f1077b;
                n6 n6Var = ny0Var.f37880n;
                if (!ny0Var.f37885y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        n6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        n6Var.setText("");
                    }
                    x10 x10Var3 = ny0Var.f37884x;
                    if (x10Var3 != null) {
                        x10Var3.a(trim);
                    }
                    fj fjVar = ny0Var.f37881r;
                    if (fjVar != null) {
                        fjVar.M1 = true;
                        ny0Var.d.y3(fjVar, null, false, false, false, false);
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
                n51 n51Var = (n51) this.f1077b;
                String obj8 = n51Var.K.getText().toString();
                o51 o51Var = n51Var.L;
                if (o51Var.f37984o1.getAdapter() == null) {
                    b10 = 0;
                } else {
                    b10 = o51Var.f37984o1.getAdapter().b();
                }
                o51Var.M0(obj8);
                if (TextUtils.isEmpty(obj8) && (b1Var = o51Var.f37984o1) != null) {
                    i0 adapter3 = b1Var.getAdapter();
                    bk0 bk0Var = o51Var.f37986q1;
                    if (adapter3 != bk0Var) {
                        b1 b1Var4 = o51Var.f37984o1;
                        b1Var4.X1 = false;
                        b1Var4.Y1 = 0;
                        b1Var4.setAdapter(bk0Var);
                        b1 b1Var5 = o51Var.f37984o1;
                        b1Var5.X1 = true;
                        b1Var5.Y1 = 0;
                        if (b10 == 0) {
                            o51Var.P0(0);
                        }
                    }
                }
                o51Var.f37991v1.setVisibility(0);
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
                pc0 pc0Var = (pc0) this.f1077b;
                LinkedList linkedList = pc0Var.W;
                LinkedList linkedList2 = pc0Var.V;
                Drawable drawable = pc0Var.f38360a;
                if (drawable instanceof bb0) {
                    bb0 bb0Var = (bb0) drawable;
                    bb0Var.D = null;
                    bb0Var.y();
                    float f10 = bb0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        bb0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        bb0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            pc0Var.b(bb0Var);
                            return;
                        }
                        linkedList2.offer(new p6(this, z10, bb0Var, 23));
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
                searchView.f1904p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.f1903o0 && !searchView.f1897h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                    i12 = 0;
                }
                searchView.N.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
            case 15:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f1077b;
                org.telegram.ui.ActionBar.n0 n0Var = r0Var.I;
                if (n0Var != null) {
                    n0Var.l(r0Var.f29923e);
                }
                r0Var.k();
                if (!r0Var.f29928h0.isEmpty() && !TextUtils.isEmpty(r0Var.f29923e.getText()) && r0Var.f29929i0 >= 0) {
                    r0Var.f29929i0 = -1;
                    r0Var.E();
                    return;
                }
                return;
            case 16:
                a5 a5Var = (a5) this.f1077b;
                a5Var.m();
                org.telegram.ui.ActionBar.n0 j3 = a5.j(a5Var);
                if (j3 != null) {
                    j3.l(a5Var.f28784s);
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
