package ah;

import ai.m0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import di.c1;
import di.e0;
import di.m6;
import di.s0;
import di.t;
import di.v0;
import hi.c2;
import hi.d2;
import hi.e1;
import hi.n8;
import hi.r6;
import hi.v6;
import java.util.ArrayList;
import java.util.LinkedList;
import kg.a1;
import kg.d0;
import kg.k0;
import kg.q0;
import kg.u1;
import kg.v1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.n0;
import org.telegram.messenger.np;
import org.telegram.messenger.p5;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Wallet.l4;
import v4.h0;
public final class j implements TextWatcher {
    public final int f1077a;
    public final Object f1078b;

    public j(Object obj, int i7) {
        this.f1077a = i7;
        this.f1078b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        z10 z10Var;
        long j3;
        Object[] objArr;
        cg.a i7;
        String obj;
        int indexOf;
        Object[] objArr2;
        cg.a i10;
        String obj2;
        int indexOf2;
        String str;
        float f10;
        float f11;
        boolean z10;
        z10 z10Var2;
        boolean z11;
        boolean z12;
        float f12;
        float f13;
        int b10;
        c1 c1Var;
        String str2 = "";
        float f14 = 0.0f;
        long j10 = 0;
        boolean z13 = true;
        boolean z14 = false;
        boolean z15 = false;
        z14 = false;
        z14 = false;
        switch (this.f1077a) {
            case 0:
                o oVar = (o) this.f1078b;
                if (!oVar.h && (z10Var = oVar.f1099n) != null && editable != null) {
                    z10Var.a(editable.toString());
                    return;
                }
                return;
            case 1:
                m0 m0Var = (m0) this.f1078b;
                if (!m0Var.L) {
                    int i11 = m0Var.f1378r;
                    if (i11 == 1) {
                        m0Var.N = m0Var.M.length();
                        m0Var.I = editable.length();
                        m0Var.O = (editable.length() <= 0 || Character.isWhitespace(editable.charAt(editable.length() - 1))) ? false : false;
                        return;
                    } else if (i11 == 3 && TextUtils.isEmpty(editable)) {
                        m0Var.i();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                t tVar = (t) this.f1078b;
                di.c cVar = tVar.f9437t0;
                TLRPC.TL_payments_starsRevenueStats h = e0.g(t.r0(tVar)).h(tVar.f9413b, false);
                if (h == null) {
                    j3 = 0;
                } else {
                    j3 = h.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j10 = Long.parseLong(editable.toString());
                }
                tVar.Z = j10;
                if (j10 > j3) {
                    tVar.Z = j3;
                    tVar.X = true;
                    tVar.f9412a0.setText(Long.toString(j3));
                    di.q qVar = tVar.f9412a0;
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
            case 3:
                s0 s0Var = (s0) this.f1078b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    objArr = null;
                } else {
                    objArr = 1;
                }
                if (objArr == null && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                if (objArr == null) {
                    i7 = cg.a.h(editable.toString(), s0Var.C1.f4985a);
                } else {
                    i7 = cg.a.i(0L, s0Var.C1.f4985a);
                }
                s0Var.M0(i7, false, false, true);
                s0Var.f9367q1.c(s0Var.f9368r1.isFocused(), !TextUtils.isEmpty(s0Var.f9368r1.getText()));
                return;
            case 4:
                v0 v0Var = (v0) this.f1078b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    objArr2 = null;
                } else {
                    objArr2 = 1;
                }
                if (objArr2 == null && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                if (objArr2 == null) {
                    i10 = cg.a.h(editable.toString(), v0Var.f9565z1.f4985a);
                } else {
                    i10 = cg.a.i(0L, v0Var.f9565z1.f4985a);
                }
                v0Var.J0(i10, false, false, true);
                v0Var.f9553m1.c(v0Var.n1.isFocused(), !TextUtils.isEmpty(v0Var.n1.getText()));
                return;
            case 5:
                d2 d2Var = (d2) this.f1078b;
                ImageView imageView = d2Var.f14094r;
                i iVar = d2Var.f14091e;
                if (!d2Var.f14095s) {
                    d2Var.d(false);
                    String obj3 = iVar.getText().toString();
                    if (TextUtils.isEmpty(obj3)) {
                        str = null;
                    } else {
                        str = obj3;
                    }
                    s10 s10Var = d2Var.f14097x;
                    if (s10Var != null) {
                        s10Var.a(str, -1);
                    }
                    c2 c2Var = d2Var.h;
                    if (c2Var != null) {
                        c2Var.I1(null);
                        d2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        er erVar = er.h;
                        translationX.setInterpolator(erVar).start();
                        if (imageView != null && d2Var.f14093n != (!TextUtils.isEmpty(iVar.getText()))) {
                            d2Var.f14093n = !d2Var.f14093n;
                            imageView.animate().cancel();
                            if (d2Var.f14093n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f15 = 0.7f;
                            if (d2Var.f14093n) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f10);
                            if (d2Var.f14093n) {
                                f15 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
                            if (d2Var.f14093n) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new e1(this, 3)).setInterpolator(erVar).setDuration(320L);
                            if (d2Var.f14093n) {
                                j10 = 240;
                            }
                            duration.setStartDelay(j10).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                v6 v6Var = (v6) this.f1078b;
                String obj4 = editable.toString();
                v6Var.f15232n2 = obj4;
                if (!v6Var.V1) {
                    String str3 = v6Var.f15237s2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str3, obj4)) {
                        v6Var.f1();
                        String str4 = v6Var.f15232n2;
                        if (str4 != null && str4.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v6Var.f15236r2 = z10;
                    }
                    String str5 = v6Var.D2;
                    String str6 = v6Var.f15232n2;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    if (!TextUtils.equals(str5, str2)) {
                        v6Var.e1();
                        String str7 = v6Var.f15232n2;
                        if (str7 != null && str7.length() > 3 && !TextUtils.isEmpty(((n0) np.s1(v6Var.f29679a).f25448y7.F.f15881b).f25130c)) {
                            z14 = true;
                        }
                        v6Var.f15243y2 = z14;
                    }
                    r6 r6Var = v6Var.f15239u2;
                    g0.r(r6Var);
                    g0.i3(r6Var, 400L);
                    r6 r6Var2 = v6Var.F2;
                    g0.r(r6Var2);
                    g0.i3(r6Var2, 400L);
                }
                v6Var.f15230l2.O(true);
                return;
            case 7:
                n8 n8Var = (n8) this.f1078b;
                if (!n8Var.f14773n && (z10Var2 = n8Var.f14774r) != null && editable != null) {
                    z10Var2.a(editable.toString());
                    return;
                }
                return;
            case 8:
                ji.m mVar = (ji.m) this.f1078b;
                mVar.f17586n = editable.toString();
                ji.e eVar = mVar.K;
                if (eVar != null) {
                    eVar.invalidate();
                    return;
                }
                return;
            case 9:
                kg.g0 g0Var = (kg.g0) this.f1078b;
                c1 c1Var2 = g0Var.f17945s;
                ny nyVar = g0Var.F;
                d0 d0Var = g0Var.f17948y;
                String obj5 = editable.toString();
                if (!obj5.isEmpty()) {
                    if (nyVar != null) {
                        nyVar.setText(hd.M0(2131748167, null));
                    }
                } else if (c1Var2.getAdapter() != d0Var) {
                    int P = kg.g0.P(g0Var);
                    nyVar.c();
                    c1Var2.setAdapter(d0Var);
                    d0Var.f();
                    if (P > 0) {
                        g0Var.f17946w.h1(0, -P);
                    }
                }
                kg.e0 e0Var = g0Var.E;
                if (e0Var != null) {
                    kg.g0 g0Var2 = e0Var.f17916f;
                    c1 c1Var3 = g0Var2.f17945s;
                    ArrayList arrayList = e0Var.d;
                    arrayList.clear();
                    e0Var.f17915e = obj5;
                    String N3 = g0.N3(obj5);
                    if (N3.startsWith("/")) {
                        N3 = N3.substring(1);
                    }
                    ArrayList arrayList2 = v1.f(m10.f24934t0).f18124b;
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        u1 u1Var = (u1) arrayList2.get(i12);
                        if (!v1.g(u1Var.f18114b)) {
                            String N32 = g0.N3(u1Var.f18114b);
                            if (N32.startsWith(N3) || i5.c.A(" ", N3, N32)) {
                                arrayList.add(u1Var);
                            }
                        }
                    }
                    h0 adapter = c1Var3.getAdapter();
                    kg.e0 e0Var2 = g0Var2.E;
                    if (adapter != e0Var2) {
                        c1Var3.setAdapter(e0Var2);
                    }
                    e0Var.f();
                    return;
                }
                return;
            case 10:
                q0 q0Var = (q0) this.f1078b;
                q0Var.f18069y = false;
                k0 k0Var = q0Var.G;
                g0.r(k0Var);
                if (TextUtils.isEmpty(q0Var.f18063f.getText())) {
                    q0Var.E = null;
                    q0Var.d.b();
                } else {
                    q0Var.f18069y = true;
                    g0.i3(k0Var, 800L);
                }
                q0Var.f18061c.f39895g3.O(true);
                q0Var.g0();
                return;
            case 11:
                a1 a1Var = (a1) this.f1078b;
                if (!a1Var.f17862c) {
                    a1Var.E = false;
                    a1Var.f17870y = editable.toString();
                    a1Var.Z(true);
                    return;
                }
                return;
            case 12:
                ((li.n) this.f1078b).d0();
                return;
            case 13:
            case 14:
            case 15:
                return;
            case 16:
                pc pcVar = (pc) this.f1078b;
                pcVar.F((pcVar.f14623f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : false);
                return;
            case 17:
                vi viVar = (vi) this.f1078b;
                li liVar = viVar.f40430g0;
                TextUtils.isEmpty(viVar.E);
                viVar.E = editable.toString().trim();
                li liVar2 = viVar.f40425b0;
                g0.r(liVar2);
                if (!TextUtils.isEmpty(viVar.E)) {
                    String str8 = viVar.E;
                    if (str8 != null && str8.length() >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    viVar.f40424a0 = z11;
                    if (!TextUtils.equals(viVar.W, viVar.E)) {
                        viVar.M.clear();
                        viVar.f40426c0 = 0;
                        viVar.f40427d0 = false;
                    }
                    g0.i3(liVar2, 1500L);
                }
                g0.r(liVar);
                if (!TextUtils.isEmpty(viVar.E)) {
                    String str9 = viVar.E;
                    viVar.f40437n0 = (str9 == null || str9.length() < 3 || TextUtils.isEmpty(((n0) np.s1(viVar.f33607b.H3).f25448y7.F.f15881b).f25130c)) ? false : false;
                    if (!TextUtils.equals(viVar.f40429f0, viVar.E)) {
                        viVar.N.clear();
                        viVar.f40431h0 = false;
                    }
                    g0.i3(liVar, 1500L);
                }
                viVar.U();
                return;
            case 18:
                String obj6 = editable.toString();
                if (!obj6.isEmpty()) {
                    ny nyVar2 = ((mj) this.f1078b).H;
                    if (nyVar2 != null) {
                        nyVar2.setText(hd.M0(2131748167, null));
                    }
                } else {
                    h0 adapter2 = ((mj) this.f1078b).f37305s.getAdapter();
                    mj mjVar = (mj) this.f1078b;
                    if (adapter2 != mjVar.F) {
                        int P2 = mj.P(mjVar);
                        ((mj) this.f1078b).H.setText(hd.M0(2131748223, null));
                        ((mj) this.f1078b).H.c();
                        mj mjVar2 = (mj) this.f1078b;
                        mjVar2.f37305s.setAdapter(mjVar2.F);
                        ((mj) this.f1078b).F.f();
                        if (P2 > 0) {
                            ((mj) this.f1078b).f37306w.h1(0, -P2);
                        }
                    }
                }
                ij ijVar = ((mj) this.f1078b).G;
                if (ijVar != null) {
                    if (ijVar.f35638f != null) {
                        Utilities.f22418g.a(ijVar.f35638f);
                        ijVar.f35638f = null;
                    }
                    int i13 = ijVar.h + 1;
                    ijVar.h = i13;
                    p5 p5Var = Utilities.f22418g;
                    hj hjVar = new hj(ijVar, obj6, i13, 0);
                    ijVar.f35638f = hjVar;
                    p5Var.d(hjVar, 300L);
                    return;
                }
                return;
            case 19:
                ft ftVar = (ft) this.f1078b;
                if (ftVar.X1 != ftVar.getLineCount()) {
                    if (!ftVar.Y1 && ftVar.getMeasuredWidth() > 0) {
                        ftVar.G(ftVar.X1, ftVar.getLineCount());
                    }
                    ftVar.X1 = ftVar.getLineCount();
                    return;
                }
                return;
            case 20:
                ((ai.j) this.f1078b).run();
                return;
            case 21:
                yx yxVar = (yx) this.f1078b;
                yxVar.g(false);
                zp zpVar = yxVar.d;
                String obj7 = zpVar.getText().toString();
                yxVar.c(obj7, true);
                xx xxVar = yxVar.f42179r;
                if (xxVar != null) {
                    xxVar.I1(null);
                    xxVar.J1(TextUtils.isEmpty(obj7), true);
                }
                yxVar.f(!TextUtils.isEmpty(obj7));
                if (zpVar != null) {
                    zpVar.clearAnimation();
                    zpVar.animate().translationX(0.0f).setInterpolator(er.h).start();
                }
                yxVar.d(false);
                return;
            case 22:
                v00 v00Var = (v00) this.f1078b;
                if (!v00Var.G.isEmpty() && editable.length() > 0 && v00Var.J >= 0) {
                    v00Var.J = -1;
                    v00Var.e();
                }
                v00Var.f40196a.a((v00Var.f40201n || v00Var.f40202r.length() > 0) ? true : true, true);
                return;
            case 23:
                fc0 fc0Var = (fc0) this.f1078b;
                if (fc0Var.f34575r.length() == 4 && gz.f23975r == 0) {
                    fc0Var.n(false);
                    return;
                }
                return;
            case 24:
                jl0 jl0Var = (jl0) this.f1078b;
                ImageView imageView2 = jl0Var.f36038b;
                i iVar2 = jl0Var.d;
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
                        f14 = 1.0f;
                    }
                    ViewPropertyAnimator duration2 = animate2.alpha(f14).setDuration(150L);
                    if (z12) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX2 = duration2.scaleX(f12);
                    if (z12) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.1f;
                    }
                    scaleX2.scaleY(f13).start();
                }
                jl0Var.a(iVar2.getText().toString());
                return;
            case 25:
                rw0 rw0Var = (rw0) this.f1078b;
                pw0 pw0Var = rw0Var.f39076c;
                if (pw0Var != null && pw0Var.getVisibility() == 0) {
                    rw0Var.e();
                    return;
                }
                return;
            case 26:
                gy0 gy0Var = (gy0) this.f1078b;
                h6 h6Var = gy0Var.f35097n;
                if (!gy0Var.f35102y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        h6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        h6Var.setText("");
                    }
                    z10 z10Var3 = gy0Var.f35101x;
                    if (z10Var3 != null) {
                        z10Var3.a(trim);
                    }
                    gj gjVar = gy0Var.f35098r;
                    if (gjVar != null) {
                        gjVar.M1 = true;
                        gy0Var.d.x3(gjVar, null, false, false, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                v01 v01Var = (v01) this.f1078b;
                String lowerCase = editable.toString().trim().toLowerCase();
                v01Var.M = lowerCase;
                if (lowerCase.startsWith("@")) {
                    v01Var.M = v01Var.M.substring(1);
                }
                v01Var.c();
                v01Var.N.clear();
                if (!v01Var.d && !v01Var.f40212c && !TextUtils.isEmpty(v01Var.M)) {
                    hh0 hh0Var = new hh0(15, v01Var, v01Var.M);
                    v01Var.P = hh0Var;
                    g0.i3(hh0Var, 350L);
                }
                v01Var.h();
                return;
            case 28:
                d51 d51Var = (d51) this.f1078b;
                String obj8 = d51Var.K.getText().toString();
                e51 e51Var = d51Var.L;
                if (e51Var.f34204o1.getAdapter() == null) {
                    b10 = 0;
                } else {
                    b10 = e51Var.f34204o1.getAdapter().b();
                }
                e51Var.L0(obj8);
                if (TextUtils.isEmpty(obj8) && (c1Var = e51Var.f34204o1) != null) {
                    h0 adapter3 = c1Var.getAdapter();
                    tj0 tj0Var = e51Var.f34206q1;
                    if (adapter3 != tj0Var) {
                        c1 c1Var4 = e51Var.f34204o1;
                        c1Var4.X1 = false;
                        c1Var4.Y1 = 0;
                        c1Var4.setAdapter(tj0Var);
                        c1 c1Var5 = e51Var.f34204o1;
                        c1Var5.X1 = true;
                        c1Var5.Y1 = 0;
                        if (b10 == 0) {
                            e51Var.O0(0);
                        }
                    }
                }
                e51Var.f34211v1.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.f1077a) {
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
                return;
            case 23:
                fc0 fc0Var = (fc0) this.f1078b;
                LinkedList linkedList = fc0Var.W;
                LinkedList linkedList2 = fc0Var.V;
                Drawable drawable = fc0Var.f34560a;
                if (drawable instanceof ra0) {
                    ra0 ra0Var = (ra0) drawable;
                    ra0Var.D = null;
                    ra0Var.y();
                    float f10 = ra0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        ra0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        ra0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            fc0Var.b(ra0Var);
                            return;
                        }
                        linkedList2.offer(new m6(this, z10, ra0Var, 23));
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
            case 24:
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
        switch (this.f1077a) {
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
                return;
            case 13:
                SearchView searchView = (SearchView) this.f1078b;
                Editable text = searchView.G.getText();
                searchView.f1906p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.f1905o0 && !searchView.f1899h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                    i12 = 0;
                }
                searchView.N.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
            case 14:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1078b;
                org.telegram.ui.ActionBar.m0 m0Var = q0Var.I;
                if (m0Var != null) {
                    m0Var.l(q0Var.f29502e);
                }
                q0Var.k();
                if (!q0Var.f29507h0.isEmpty() && !TextUtils.isEmpty(q0Var.f29502e.getText()) && q0Var.f29508i0 >= 0) {
                    q0Var.f29508i0 = -1;
                    q0Var.E();
                    return;
                }
                return;
            case 15:
                w4 w4Var = (w4) this.f1078b;
                w4Var.k();
                org.telegram.ui.ActionBar.m0 i13 = w4.i(w4Var);
                if (i13 != null) {
                    i13.l(w4Var.f29830s);
                    return;
                }
                return;
            case 16:
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
                return;
            default:
                ((l4) this.f1078b).a(charSequence.toString());
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
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
