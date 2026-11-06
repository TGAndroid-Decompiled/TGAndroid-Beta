package ah;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.e1;
import bi.h1;
import bi.n0;
import bi.q1;
import bi.u7;
import bi.v;
import bi.z;
import di.s7;
import fi.d2;
import fi.e2;
import fi.p8;
import fi.s6;
import fi.w6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import kg.a1;
import kg.d0;
import kg.e0;
import kg.k0;
import kg.q0;
import kg.s1;
import kg.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.p5;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.sx;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.Wallet.n9;
import org.telegram.ui.Wallet.x9;
public final class j implements TextWatcher {
    public final int f1079a;
    public final Object f1080b;

    public j(Object obj, int i7) {
        this.f1079a = i7;
        this.f1080b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        c20 c20Var;
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
        long j10;
        boolean z9;
        c20 c20Var2;
        boolean z10;
        boolean z11;
        float f12;
        float f13;
        int b10;
        q1 q1Var;
        String str2;
        boolean z12;
        boolean z13;
        String str3 = "";
        float f14 = 0.0f;
        String str4 = null;
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = false;
        z15 = false;
        z15 = false;
        switch (this.f1079a) {
            case 0:
                o oVar = (o) this.f1080b;
                if (!oVar.h && (c20Var = oVar.f1101n) != null && editable != null) {
                    c20Var.a(editable.toString());
                    return;
                }
                return;
            case 1:
                long j11 = 0;
                z zVar = (z) this.f1080b;
                bi.d dVar = zVar.f5133s0;
                TLRPC.TL_payments_starsRevenueStats h = n0.g(z.r0(zVar)).h(zVar.f5110b, false);
                if (h == null) {
                    j3 = 0;
                } else {
                    j3 = h.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j11 = Long.parseLong(editable.toString());
                }
                zVar.Y = j11;
                if (j11 > j3) {
                    zVar.Y = j3;
                    zVar.W = true;
                    zVar.Z.setText(Long.toString(j3));
                    v vVar = zVar.Z;
                    vVar.setSelection(vVar.getText().length());
                    zVar.W = false;
                }
                if (zVar.Y != j3) {
                    z14 = false;
                }
                zVar.X = z14;
                g0.r(dVar);
                dVar.run();
                if (!zVar.W) {
                    zVar.X = false;
                    return;
                }
                return;
            case 2:
                e1 e1Var = (e1) this.f1080b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    objArr = null;
                } else {
                    objArr = 1;
                }
                if (objArr == null && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                if (objArr == null) {
                    i7 = cg.a.h(editable.toString(), e1Var.f3748y1.f6160a);
                } else {
                    i7 = cg.a.i(0L, e1Var.f3748y1.f6160a);
                }
                e1Var.M0(i7, false, false, true);
                e1Var.f3737m1.c(e1Var.n1.isFocused(), !TextUtils.isEmpty(e1Var.n1.getText()));
                return;
            case 3:
                h1 h1Var = (h1) this.f1080b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    objArr2 = null;
                } else {
                    objArr2 = 1;
                }
                if (objArr2 == null && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                if (objArr2 == null) {
                    i10 = cg.a.h(editable.toString(), h1Var.f3984v1.f6160a);
                } else {
                    i10 = cg.a.i(0L, h1Var.f3984v1.f6160a);
                }
                h1Var.J0(i10, false, false, true);
                h1Var.f3973i1.c(h1Var.f3974j1.isFocused(), !TextUtils.isEmpty(h1Var.f3974j1.getText()));
                return;
            case 4:
                e2 e2Var = (e2) this.f1080b;
                ImageView imageView = e2Var.f11861r;
                i iVar = e2Var.f11858e;
                if (!e2Var.f11862s) {
                    e2Var.d(false);
                    String obj3 = iVar.getText().toString();
                    if (TextUtils.isEmpty(obj3)) {
                        str = null;
                    } else {
                        str = obj3;
                    }
                    v10 v10Var = e2Var.f11864x;
                    if (v10Var != null) {
                        v10Var.a(str, -1);
                    }
                    d2 d2Var = e2Var.h;
                    if (d2Var != null) {
                        d2Var.I1(null);
                        e2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        xq xqVar = xq.h;
                        translationX.setInterpolator(xqVar).start();
                        if (imageView != null && e2Var.f11860n != (!TextUtils.isEmpty(iVar.getText()))) {
                            e2Var.f11860n = !e2Var.f11860n;
                            imageView.animate().cancel();
                            if (e2Var.f11860n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f15 = 0.7f;
                            if (e2Var.f11860n) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f10);
                            if (e2Var.f11860n) {
                                f15 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
                            if (e2Var.f11860n) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new s7(this, 20)).setInterpolator(xqVar).setDuration(320L);
                            if (e2Var.f11860n) {
                                j10 = 240;
                            } else {
                                j10 = 0;
                            }
                            duration.setStartDelay(j10).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                w6 w6Var = (w6) this.f1080b;
                String obj4 = editable.toString();
                w6Var.f13041j2 = obj4;
                if (!w6Var.R1) {
                    String str5 = w6Var.f13046o2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str5, obj4)) {
                        w6Var.f1();
                        String str6 = w6Var.f13041j2;
                        if (str6 != null && str6.length() > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        w6Var.f13045n2 = z9;
                    }
                    String str7 = w6Var.f13057z2;
                    String str8 = w6Var.f13041j2;
                    if (str8 != null) {
                        str3 = str8;
                    }
                    if (!TextUtils.equals(str7, str3)) {
                        w6Var.e1();
                        String str9 = w6Var.f13041j2;
                        if (str9 != null && str9.length() > 3 && !TextUtils.isEmpty(((org.telegram.messenger.n0) qp.s1(w6Var.f28612a).f24927x7.F.f13555b).f24105c)) {
                            z15 = true;
                        }
                        w6Var.f13052u2 = z15;
                    }
                    s6 s6Var = w6Var.f13048q2;
                    g0.r(s6Var);
                    g0.i3(s6Var, 400L);
                    s6 s6Var2 = w6Var.B2;
                    g0.r(s6Var2);
                    g0.i3(s6Var2, 400L);
                }
                w6Var.f13039h2.O(true);
                return;
            case 6:
                p8 p8Var = (p8) this.f1080b;
                if (!p8Var.f12616n && (c20Var2 = p8Var.f12617r) != null && editable != null) {
                    c20Var2.a(editable.toString());
                    return;
                }
                return;
            case 7:
                ((ii.p) this.f1080b).d0();
                return;
            case 8:
                kg.g0 g0Var = (kg.g0) this.f1080b;
                q1 q1Var2 = g0Var.f17383s;
                iy iyVar = g0Var.E;
                d0 d0Var = g0Var.f17386y;
                String obj5 = editable.toString();
                if (!obj5.isEmpty()) {
                    if (iyVar != null) {
                        iyVar.setText(hd.M0(2131748166, null));
                    }
                } else if (q1Var2.getAdapter() != d0Var) {
                    int O = kg.g0.O(g0Var);
                    iyVar.c();
                    q1Var2.setAdapter(d0Var);
                    d0Var.f();
                    if (O > 0) {
                        g0Var.f17384w.h1(0, -O);
                    }
                }
                e0 e0Var = g0Var.D;
                if (e0Var != null) {
                    kg.g0 g0Var2 = e0Var.f17354f;
                    q1 q1Var3 = g0Var2.f17383s;
                    ArrayList arrayList = e0Var.d;
                    arrayList.clear();
                    e0Var.f17353e = obj5;
                    String O3 = g0.O3(obj5);
                    if (O3.startsWith("/")) {
                        O3 = O3.substring(1);
                    }
                    ArrayList arrayList2 = t1.f(p10.f24459s0).f17545b;
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        s1 s1Var = (s1) arrayList2.get(i11);
                        if (!t1.g(s1Var.f17530b)) {
                            String O32 = g0.O3(s1Var.f17530b);
                            if (O32.startsWith(O3) || jg.g.A(" ", O3, O32)) {
                                arrayList.add(s1Var);
                            }
                        }
                    }
                    v4.g0 adapter = q1Var3.getAdapter();
                    e0 e0Var2 = g0Var2.D;
                    if (adapter != e0Var2) {
                        q1Var3.setAdapter(e0Var2);
                    }
                    e0Var.f();
                    return;
                }
                return;
            case 9:
                q0 q0Var = (q0) this.f1080b;
                q0Var.f17507y = false;
                k0 k0Var = q0Var.F;
                g0.r(k0Var);
                if (TextUtils.isEmpty(q0Var.f17501f.getText())) {
                    q0Var.D = null;
                    q0Var.d.b();
                } else {
                    q0Var.f17507y = true;
                    g0.i3(k0Var, 800L);
                }
                q0Var.f17499c.f36781f3.O(true);
                q0Var.g0();
                return;
            case 10:
                a1 a1Var = (a1) this.f1080b;
                if (!a1Var.f17300c) {
                    a1Var.D = false;
                    a1Var.f17308y = editable.toString();
                    a1Var.Z(true);
                    return;
                }
                return;
            case 11:
            case 12:
            case 13:
                return;
            case 14:
                uc ucVar = (uc) this.f1080b;
                ucVar.F((ucVar.f12365f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : false);
                return;
            case 15:
                ni niVar = (ni) this.f1080b;
                ei eiVar = niVar.f36300f0;
                TextUtils.isEmpty(niVar.D);
                niVar.D = editable.toString().trim();
                ei eiVar2 = niVar.f36295a0;
                g0.r(eiVar2);
                if (!TextUtils.isEmpty(niVar.D)) {
                    String str10 = niVar.D;
                    if (str10 != null && str10.length() >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    niVar.W = z10;
                    if (!TextUtils.equals(niVar.V, niVar.D)) {
                        niVar.L.clear();
                        niVar.f36296b0 = 0;
                        niVar.f36297c0 = false;
                    }
                    g0.i3(eiVar2, 1500L);
                }
                g0.r(eiVar);
                if (!TextUtils.isEmpty(niVar.D)) {
                    String str11 = niVar.D;
                    niVar.m0 = (str11 == null || str11.length() < 3 || TextUtils.isEmpty(((org.telegram.messenger.n0) qp.s1(niVar.f38948b.D3).f24927x7.F.f13555b).f24105c)) ? false : false;
                    if (!TextUtils.equals(niVar.f36299e0, niVar.D)) {
                        niVar.M.clear();
                        niVar.f36301g0 = false;
                    }
                    g0.i3(eiVar, 1500L);
                }
                niVar.T();
                return;
            case 16:
                String obj6 = editable.toString();
                if (!obj6.isEmpty()) {
                    iy iyVar2 = ((fj) this.f1080b).G;
                    if (iyVar2 != null) {
                        iyVar2.setText(hd.M0(2131748166, null));
                    }
                } else {
                    v4.g0 adapter2 = ((fj) this.f1080b).f33544s.getAdapter();
                    fj fjVar = (fj) this.f1080b;
                    if (adapter2 != fjVar.E) {
                        int O2 = fj.O(fjVar);
                        ((fj) this.f1080b).G.setText(hd.M0(2131748222, null));
                        ((fj) this.f1080b).G.c();
                        fj fjVar2 = (fj) this.f1080b;
                        fjVar2.f33544s.setAdapter(fjVar2.E);
                        ((fj) this.f1080b).E.f();
                        if (O2 > 0) {
                            ((fj) this.f1080b).f33545w.h1(0, -O2);
                        }
                    }
                }
                bj bjVar = ((fj) this.f1080b).F;
                if (bjVar != null) {
                    if (bjVar.f32155f != null) {
                        Utilities.f21335g.a(bjVar.f32155f);
                        bjVar.f32155f = null;
                    }
                    int i12 = bjVar.h + 1;
                    bjVar.h = i12;
                    p5 p5Var = Utilities.f21335g;
                    aj ajVar = new aj(bjVar, obj6, i12, 0);
                    bjVar.f32155f = ajVar;
                    p5Var.d(ajVar, 300L);
                    return;
                }
                return;
            case 17:
                ys ysVar = (ys) this.f1080b;
                if (ysVar.R1 != ysVar.getLineCount()) {
                    if (!ysVar.S1 && ysVar.getMeasuredWidth() > 0) {
                        ysVar.F(ysVar.R1, ysVar.getLineCount());
                    }
                    ysVar.R1 = ysVar.getLineCount();
                    return;
                }
                return;
            case 18:
                ((fi.q1) this.f1080b).run();
                return;
            case 19:
                tx txVar = (tx) this.f1080b;
                txVar.g(false);
                rp rpVar = txVar.d;
                String obj7 = rpVar.getText().toString();
                txVar.c(obj7, true);
                sx sxVar = txVar.f38425r;
                if (sxVar != null) {
                    sxVar.I1(null);
                    sxVar.J1(TextUtils.isEmpty(obj7), true);
                }
                txVar.f(!TextUtils.isEmpty(obj7));
                if (rpVar != null) {
                    rpVar.clearAnimation();
                    rpVar.animate().translationX(0.0f).setInterpolator(xq.h).start();
                }
                txVar.d(false);
                return;
            case 20:
                r00 r00Var = (r00) this.f1080b;
                if (!r00Var.F.isEmpty() && editable.length() > 0 && r00Var.I >= 0) {
                    r00Var.I = -1;
                    r00Var.e();
                }
                r00Var.f37441a.a((r00Var.f37446n || r00Var.f37447r.length() > 0) ? true : true, true);
                return;
            case 21:
                ec0 ec0Var = (ec0) this.f1080b;
                if (ec0Var.f33208r.length() == 4 && iz.f23403r == 0) {
                    ec0Var.n(false);
                    return;
                }
                return;
            case 22:
                el0 el0Var = (el0) this.f1080b;
                ImageView imageView2 = el0Var.f33278b;
                i iVar2 = el0Var.d;
                if (iVar2.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (imageView2.getAlpha() == 0.0f) {
                    z14 = false;
                }
                if (z11 != z14) {
                    ViewPropertyAnimator animate2 = imageView2.animate();
                    if (z11) {
                        f14 = 1.0f;
                    }
                    ViewPropertyAnimator duration2 = animate2.alpha(f14).setDuration(150L);
                    if (z11) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX2 = duration2.scaleX(f12);
                    if (z11) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.1f;
                    }
                    scaleX2.scaleY(f13).start();
                }
                el0Var.a(iVar2.getText().toString());
                return;
            case 23:
                ow0 ow0Var = (ow0) this.f1080b;
                mw0 mw0Var = ow0Var.f36671c;
                if (mw0Var != null && mw0Var.getVisibility() == 0) {
                    ow0Var.e();
                    return;
                }
                return;
            case 24:
                dy0 dy0Var = (dy0) this.f1080b;
                j6 j6Var = dy0Var.f33065n;
                if (!dy0Var.f33070y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        j6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        j6Var.setText("");
                    }
                    c20 c20Var3 = dy0Var.f33069x;
                    if (c20Var3 != null) {
                        c20Var3.a(trim);
                    }
                    ij ijVar = dy0Var.f33066r;
                    if (ijVar != null) {
                        ijVar.K1 = true;
                        dy0Var.d.v3(ijVar, null, false, false, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                r01 r01Var = (r01) this.f1080b;
                String lowerCase = editable.toString().trim().toLowerCase();
                r01Var.L = lowerCase;
                if (lowerCase.startsWith("@")) {
                    r01Var.L = r01Var.L.substring(1);
                }
                r01Var.c();
                r01Var.M.clear();
                if (!r01Var.d && !r01Var.f37457c && !TextUtils.isEmpty(r01Var.L)) {
                    v80 v80Var = new v80(21, r01Var, r01Var.L);
                    r01Var.O = v80Var;
                    g0.i3(v80Var, 350L);
                }
                r01Var.i();
                return;
            case 26:
                z41 z41Var = (z41) this.f1080b;
                String obj8 = z41Var.J.getText().toString();
                a51 a51Var = z41Var.K;
                if (a51Var.f31685k1.getAdapter() == null) {
                    b10 = 0;
                } else {
                    b10 = a51Var.f31685k1.getAdapter().b();
                }
                a51Var.L0(obj8);
                if (TextUtils.isEmpty(obj8) && (q1Var = a51Var.f31685k1) != null) {
                    v4.g0 adapter3 = q1Var.getAdapter();
                    oj0 oj0Var = a51Var.f31686m1;
                    if (adapter3 != oj0Var) {
                        q1 q1Var4 = a51Var.f31685k1;
                        q1Var4.W1 = false;
                        q1Var4.X1 = 0;
                        q1Var4.setAdapter(oj0Var);
                        q1 q1Var5 = a51Var.f31685k1;
                        q1Var5.W1 = true;
                        q1Var5.X1 = 0;
                        if (b10 == 0) {
                            a51Var.O0(0);
                        }
                    }
                }
                a51Var.f31690r1.setVisibility(0);
                return;
            case 27:
                return;
            case 28:
                ((n9) this.f1080b).C0();
                return;
            default:
                final x9 x9Var = (x9) this.f1080b;
                ArrayList arrayList3 = x9Var.f43346w;
                arrayList3.clear();
                final String trim2 = editable.toString().trim();
                Runnable runnable = x9Var.K;
                if (runnable != null) {
                    g0.r(runnable);
                    x9Var.K = null;
                }
                if (x9Var.E != 0) {
                    x9Var.getConnectionsManager().cancelRequest(x9Var.E, true);
                    x9Var.E = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim2)) {
                    str2 = trim2;
                } else {
                    str2 = null;
                }
                x9Var.f43348y = str2;
                if (str2 == null && trim2 != null && trim2.length() <= 126) {
                    String lowerCase2 = trim2.toLowerCase(Locale.ROOT);
                    if (lowerCase2.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str4 = lowerCase2;
                    }
                }
                x9Var.D = str4;
                final int i13 = x9Var.J + 1;
                x9Var.J = i13;
                if (!TextUtils.isEmpty(trim2) && x9Var.f43348y == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                x9Var.L = z12;
                x9Var.f43347x.g(null, true, false, false, false, 0L, false, 0, i13);
                fi.d dVar2 = x9Var.Z;
                if (dVar2 != null) {
                    if (x9Var.f43348y != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    dVar2.setEnabled(z13);
                }
                if (!TextUtils.isEmpty(trim2) && x9Var.f43348y == null && x9Var.D == null) {
                    x9Var.j0(trim2);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    x9.f0(x9Var, trim2, i13);
                                    return;
                                default:
                                    x9 x9Var2 = x9Var;
                                    x9Var2.K = null;
                                    jg.z1 z1Var = x9Var2.f43347x;
                                    int i14 = i13;
                                    z1Var.h(trim2, true, false, false, false, false, 0L, false, 0, i14, 0L, new h2(x9Var2, i14, 4));
                                    return;
                            }
                        }
                    };
                    x9Var.K = runnable2;
                    g0.i3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    x9Var.f35844a.f36781f3.O(true);
                    final String str12 = x9Var.D;
                    if (str12 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        x9.f0(x9Var, str12, i13);
                                        return;
                                    default:
                                        x9 x9Var2 = x9Var;
                                        x9Var2.K = null;
                                        jg.z1 z1Var = x9Var2.f43347x;
                                        int i14 = i13;
                                        z1Var.h(str12, true, false, false, false, false, 0L, false, 0, i14, 0L, new h2(x9Var2, i14, 4));
                                        return;
                                }
                            }
                        };
                        x9Var.K = runnable3;
                        g0.i3(runnable3, 300L);
                    }
                }
                x9Var.p0(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9;
        switch (this.f1079a) {
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
                return;
            case 21:
                ec0 ec0Var = (ec0) this.f1080b;
                LinkedList linkedList = ec0Var.V;
                LinkedList linkedList2 = ec0Var.U;
                Drawable drawable = ec0Var.f33194a;
                if (drawable instanceof qa0) {
                    qa0 qa0Var = (qa0) drawable;
                    qa0Var.D = null;
                    qa0Var.y();
                    float f10 = qa0Var.h;
                    int i12 = 0;
                    boolean z10 = true;
                    if (i10 == 0 && i11 == 1) {
                        qa0Var.w(true);
                        z9 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        qa0Var.x();
                        z9 = false;
                    } else {
                        z9 = false;
                        z10 = false;
                    }
                    if (z10) {
                        if (f10 >= 1.0f) {
                            ec0Var.b(qa0Var);
                            return;
                        }
                        linkedList2.offer(new u7(this, z9, qa0Var, 23));
                        linkedList.offer(Boolean.valueOf(z9));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < linkedList2.size(); i13++) {
                            Runnable runnable = (Runnable) linkedList2.get(i13);
                            if (((Boolean) linkedList.get(i13)).booleanValue() != z9) {
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

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f1079a) {
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
                return;
            case 11:
                SearchView searchView = (SearchView) this.f1080b;
                Editable text = searchView.F.getText();
                searchView.f1962o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.f1961n0 && !searchView.f1955g0 && isEmpty) {
                    searchView.K.setVisibility(8);
                    i12 = 0;
                }
                searchView.M.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
            case 12:
                r0 r0Var = (r0) this.f1080b;
                org.telegram.ui.ActionBar.n0 n0Var = r0Var.H;
                if (n0Var != null) {
                    n0Var.l(r0Var.f28425e);
                }
                r0Var.j();
                if (!r0Var.f28429g0.isEmpty() && !TextUtils.isEmpty(r0Var.f28425e.getText()) && r0Var.f28430h0 >= 0) {
                    r0Var.f28430h0 = -1;
                    r0Var.D();
                    return;
                }
                return;
            case 13:
                y4 y4Var = (y4) this.f1080b;
                y4Var.h();
                org.telegram.ui.ActionBar.n0 f10 = y4.f(y4Var);
                if (f10 != null) {
                    f10.l(y4Var.f28801s);
                    return;
                }
                return;
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
            case 24:
            case 25:
            case 26:
                return;
            case 27:
                ((m4) this.f1080b).a(charSequence.toString());
                return;
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
