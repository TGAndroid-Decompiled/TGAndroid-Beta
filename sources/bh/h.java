package bh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import ci.a1;
import ci.i0;
import ci.j1;
import ci.s;
import ci.v;
import ci.v6;
import ci.x0;
import ei.z5;
import gi.c2;
import gi.d2;
import gi.q1;
import gi.q8;
import gi.t6;
import gi.x6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import k2.p1;
import lg.b1;
import lg.e0;
import lg.f0;
import lg.h0;
import lg.l0;
import lg.r0;
import lg.t1;
import lg.u1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n0;
import org.telegram.messenger.n10;
import org.telegram.messenger.p5;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.k4;
import org.telegram.ui.Wallet.m9;
import org.telegram.ui.Wallet.w9;
public final class h implements TextWatcher {
    public final int f3316a;
    public final Object f3317b;

    public h(Object obj, int i3) {
        this.f3316a = i3;
        this.f3317b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        u10 u10Var;
        long j10;
        Object[] objArr;
        dg.a i3;
        String obj;
        int indexOf;
        Object[] objArr2;
        dg.a i10;
        String obj2;
        int indexOf2;
        String str;
        float f10;
        float f11;
        long j11;
        boolean z10;
        u10 u10Var2;
        boolean z11;
        boolean z12;
        float f12;
        float f13;
        int b10;
        j1 j1Var;
        String str2;
        boolean z13;
        boolean z14;
        String str3 = "";
        float f14 = 0.0f;
        String str4 = null;
        boolean z15 = true;
        boolean z16 = false;
        boolean z17 = false;
        z16 = false;
        z16 = false;
        switch (this.f3316a) {
            case 0:
                m mVar = (m) this.f3317b;
                if (!mVar.h && (u10Var = mVar.f3338n) != null && editable != null) {
                    u10Var.a(editable.toString());
                    return;
                }
                return;
            case 1:
                long j12 = 0;
                v vVar = (v) this.f3317b;
                ci.d dVar = vVar.f6156t0;
                TLRPC.TL_payments_starsRevenueStats h = i0.g(v.r0(vVar)).h(vVar.f6132b, false);
                if (h == null) {
                    j10 = 0;
                } else {
                    j10 = h.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                vVar.Z = j12;
                if (j12 > j10) {
                    vVar.Z = j10;
                    vVar.X = true;
                    vVar.f6131a0.setText(Long.toString(j10));
                    s sVar = vVar.f6131a0;
                    sVar.setSelection(sVar.getText().length());
                    vVar.X = false;
                }
                if (vVar.Z != j10) {
                    z15 = false;
                }
                vVar.Y = z15;
                g0.r(dVar);
                dVar.run();
                if (!vVar.X) {
                    vVar.Y = false;
                    return;
                }
                return;
            case 2:
                x0 x0Var = (x0) this.f3317b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    objArr = null;
                } else {
                    objArr = 1;
                }
                if (objArr == null && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                if (objArr == null) {
                    i3 = dg.a.h(editable.toString(), x0Var.f6324z1.f8923a);
                } else {
                    i3 = dg.a.i(0L, x0Var.f6324z1.f8923a);
                }
                x0Var.M0(i3, false, false, true);
                x0Var.f6312n1.c(x0Var.f6313o1.isFocused(), !TextUtils.isEmpty(x0Var.f6313o1.getText()));
                return;
            case 3:
                a1 a1Var = (a1) this.f3317b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    objArr2 = null;
                } else {
                    objArr2 = 1;
                }
                if (objArr2 == null && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                if (objArr2 == null) {
                    i10 = dg.a.h(editable.toString(), a1Var.f4802w1.f8923a);
                } else {
                    i10 = dg.a.i(0L, a1Var.f4802w1.f8923a);
                }
                a1Var.J0(i10, false, false, true);
                a1Var.f4791j1.c(a1Var.k1.isFocused(), !TextUtils.isEmpty(a1Var.k1.getText()));
                return;
            case 4:
                d2 d2Var = (d2) this.f3317b;
                ImageView imageView = d2Var.f12554r;
                g gVar = d2Var.f12551e;
                if (!d2Var.f12555s) {
                    d2Var.d(false);
                    String obj3 = gVar.getText().toString();
                    if (TextUtils.isEmpty(obj3)) {
                        str = null;
                    } else {
                        str = obj3;
                    }
                    n10 n10Var = d2Var.f12557x;
                    if (n10Var != null) {
                        n10Var.a(str, -1);
                    }
                    c2 c2Var = d2Var.h;
                    if (c2Var != null) {
                        c2Var.I1(null);
                        d2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (gVar != null) {
                        gVar.animate().cancel();
                        ViewPropertyAnimator translationX = gVar.animate().translationX(0.0f);
                        xq xqVar = xq.h;
                        translationX.setInterpolator(xqVar).start();
                        if (imageView != null && d2Var.f12553n != (!TextUtils.isEmpty(gVar.getText()))) {
                            d2Var.f12553n = !d2Var.f12553n;
                            imageView.animate().cancel();
                            if (d2Var.f12553n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f15 = 0.7f;
                            if (d2Var.f12553n) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f10);
                            if (d2Var.f12553n) {
                                f15 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
                            if (d2Var.f12553n) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new z5(this, 24)).setInterpolator(xqVar).setDuration(320L);
                            if (d2Var.f12553n) {
                                j11 = 240;
                            } else {
                                j11 = 0;
                            }
                            duration.setStartDelay(j11).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                x6 x6Var = (x6) this.f3317b;
                String obj4 = editable.toString();
                x6Var.f13853k2 = obj4;
                if (!x6Var.S1) {
                    String str5 = x6Var.f13858p2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str5, obj4)) {
                        x6Var.f1();
                        String str6 = x6Var.f13853k2;
                        if (str6 != null && str6.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x6Var.f13857o2 = z10;
                    }
                    String str7 = x6Var.A2;
                    String str8 = x6Var.f13853k2;
                    if (str8 != null) {
                        str3 = str8;
                    }
                    if (!TextUtils.equals(str7, str3)) {
                        x6Var.e1();
                        String str9 = x6Var.f13853k2;
                        if (str9 != null && str9.length() > 3 && !TextUtils.isEmpty(((n0) hp.s1(x6Var.f28583a).f23167x7.F.f13798b).f24297c)) {
                            z16 = true;
                        }
                        x6Var.f13864v2 = z16;
                    }
                    t6 t6Var = x6Var.f13860r2;
                    g0.r(t6Var);
                    g0.i3(t6Var, 400L);
                    t6 t6Var2 = x6Var.C2;
                    g0.r(t6Var2);
                    g0.i3(t6Var2, 400L);
                }
                x6Var.f13851i2.O(true);
                return;
            case 6:
                q8 q8Var = (q8) this.f3317b;
                if (!q8Var.f13444n && (u10Var2 = q8Var.f13445r) != null && editable != null) {
                    u10Var2.a(editable.toString());
                    return;
                }
                return;
            case 7:
                ((ji.n) this.f3317b).d0();
                return;
            case 8:
                h0 h0Var = (h0) this.f3317b;
                j1 j1Var2 = h0Var.f18322s;
                gy gyVar = h0Var.F;
                e0 e0Var = h0Var.f18325y;
                String obj5 = editable.toString();
                if (!obj5.isEmpty()) {
                    if (gyVar != null) {
                        gyVar.setText(bd.M0(2131748175, null));
                    }
                } else if (j1Var2.getAdapter() != e0Var) {
                    int O = h0.O(h0Var);
                    gyVar.c();
                    j1Var2.setAdapter(e0Var);
                    e0Var.f();
                    if (O > 0) {
                        h0Var.f18323w.h1(0, -O);
                    }
                }
                f0 f0Var = h0Var.E;
                if (f0Var != null) {
                    h0 h0Var2 = f0Var.f18297f;
                    j1 j1Var3 = h0Var2.f18322s;
                    ArrayList arrayList = f0Var.d;
                    arrayList.clear();
                    f0Var.f18296e = obj5;
                    String O3 = g0.O3(obj5);
                    if (O3.startsWith("/")) {
                        O3 = O3.substring(1);
                    }
                    ArrayList arrayList2 = u1.f(h10.f22829t0).f18485b;
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        t1 t1Var = (t1) arrayList2.get(i11);
                        if (!u1.g(t1Var.f18474b)) {
                            String O32 = g0.O3(t1Var.f18474b);
                            if (O32.startsWith(O3) || p1.z(" ", O3, O32)) {
                                arrayList.add(t1Var);
                            }
                        }
                    }
                    u4.h0 adapter = j1Var3.getAdapter();
                    f0 f0Var2 = h0Var2.E;
                    if (adapter != f0Var2) {
                        j1Var3.setAdapter(f0Var2);
                    }
                    f0Var.f();
                    return;
                }
                return;
            case 9:
                r0 r0Var = (r0) this.f3317b;
                r0Var.f18448y = false;
                l0 l0Var = r0Var.G;
                g0.r(l0Var);
                if (TextUtils.isEmpty(r0Var.f18442f.getText())) {
                    r0Var.E = null;
                    r0Var.d.b();
                } else {
                    r0Var.f18448y = true;
                    g0.i3(l0Var, 800L);
                }
                r0Var.f18440c.f35594g3.O(true);
                r0Var.g0();
                return;
            case 10:
                b1 b1Var = (b1) this.f3317b;
                if (!b1Var.f18240c) {
                    b1Var.E = false;
                    b1Var.f18248y = editable.toString();
                    b1Var.Z(true);
                    return;
                }
                return;
            case 11:
            case 12:
            case 13:
                return;
            case 14:
                sc scVar = (sc) this.f3317b;
                scVar.F((scVar.f13144f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : false);
                return;
            case 15:
                ni niVar = (ni) this.f3317b;
                ci ciVar = niVar.f36550g0;
                TextUtils.isEmpty(niVar.E);
                niVar.E = editable.toString().trim();
                ci ciVar2 = niVar.f36545b0;
                g0.r(ciVar2);
                if (!TextUtils.isEmpty(niVar.E)) {
                    String str10 = niVar.E;
                    if (str10 != null && str10.length() >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    niVar.f36544a0 = z11;
                    if (!TextUtils.equals(niVar.W, niVar.E)) {
                        niVar.M.clear();
                        niVar.f36546c0 = 0;
                        niVar.f36547d0 = false;
                    }
                    g0.i3(ciVar2, 1500L);
                }
                g0.r(ciVar);
                if (!TextUtils.isEmpty(niVar.E)) {
                    String str11 = niVar.E;
                    niVar.f36557n0 = (str11 == null || str11.length() < 3 || TextUtils.isEmpty(((n0) hp.s1(niVar.f38416b.E3).f23167x7.F.f13798b).f24297c)) ? false : false;
                    if (!TextUtils.equals(niVar.f36549f0, niVar.E)) {
                        niVar.N.clear();
                        niVar.f36551h0 = false;
                    }
                    g0.i3(ciVar, 1500L);
                }
                niVar.T();
                return;
            case 16:
                String obj6 = editable.toString();
                if (!obj6.isEmpty()) {
                    gy gyVar2 = ((ej) this.f3317b).H;
                    if (gyVar2 != null) {
                        gyVar2.setText(bd.M0(2131748175, null));
                    }
                } else {
                    u4.h0 adapter2 = ((ej) this.f3317b).f33406s.getAdapter();
                    ej ejVar = (ej) this.f3317b;
                    if (adapter2 != ejVar.F) {
                        int O2 = ej.O(ejVar);
                        ((ej) this.f3317b).H.setText(bd.M0(2131748231, null));
                        ((ej) this.f3317b).H.c();
                        ej ejVar2 = (ej) this.f3317b;
                        ejVar2.f33406s.setAdapter(ejVar2.F);
                        ((ej) this.f3317b).F.f();
                        if (O2 > 0) {
                            ((ej) this.f3317b).f33407w.h1(0, -O2);
                        }
                    }
                }
                aj ajVar = ((ej) this.f3317b).G;
                if (ajVar != null) {
                    if (ajVar.f31856f != null) {
                        Utilities.f21389g.a(ajVar.f31856f);
                        ajVar.f31856f = null;
                    }
                    int i12 = ajVar.h + 1;
                    ajVar.h = i12;
                    p5 p5Var = Utilities.f21389g;
                    zi ziVar = new zi(ajVar, obj6, i12, 0);
                    ajVar.f31856f = ziVar;
                    p5Var.e(ziVar, 300L);
                    return;
                }
                return;
            case 17:
                xs xsVar = (xs) this.f3317b;
                if (xsVar.S1 != xsVar.getLineCount()) {
                    if (!xsVar.T1 && xsVar.getMeasuredWidth() > 0) {
                        xsVar.F(xsVar.S1, xsVar.getLineCount());
                    }
                    xsVar.S1 = xsVar.getLineCount();
                    return;
                }
                return;
            case 18:
                ((q1) this.f3317b).run();
                return;
            case 19:
                rx rxVar = (rx) this.f3317b;
                rxVar.g(false);
                rp rpVar = rxVar.d;
                String obj7 = rpVar.getText().toString();
                rxVar.c(obj7, true);
                qx qxVar = rxVar.f37831r;
                if (qxVar != null) {
                    qxVar.I1(null);
                    qxVar.J1(TextUtils.isEmpty(obj7), true);
                }
                rxVar.f(!TextUtils.isEmpty(obj7));
                if (rpVar != null) {
                    rpVar.clearAnimation();
                    rpVar.animate().translationX(0.0f).setInterpolator(xq.h).start();
                }
                rxVar.d(false);
                return;
            case 20:
                n00 n00Var = (n00) this.f3317b;
                if (!n00Var.G.isEmpty() && editable.length() > 0 && n00Var.J >= 0) {
                    n00Var.J = -1;
                    n00Var.e();
                }
                n00Var.f36296a.a((n00Var.f36301n || n00Var.f36302r.length() > 0) ? true : true, true);
                return;
            case 21:
                zb0 zb0Var = (zb0) this.f3317b;
                if (zb0Var.f41013r.length() == 4 && az.f21658r == 0) {
                    zb0Var.n(false);
                    return;
                }
                return;
            case 22:
                il0 il0Var = (il0) this.f3317b;
                ImageView imageView2 = il0Var.f34739b;
                g gVar2 = il0Var.d;
                if (gVar2.length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (imageView2.getAlpha() == 0.0f) {
                    z15 = false;
                }
                if (z12 != z15) {
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
                il0Var.a(gVar2.getText().toString());
                return;
            case 23:
                ow0 ow0Var = (ow0) this.f3317b;
                mw0 mw0Var = ow0Var.f36962c;
                if (mw0Var != null && mw0Var.getVisibility() == 0) {
                    ow0Var.e();
                    return;
                }
                return;
            case 24:
                dy0 dy0Var = (dy0) this.f3317b;
                h6 h6Var = dy0Var.f33213n;
                if (!dy0Var.f33218y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        h6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        h6Var.setText("");
                    }
                    u10 u10Var3 = dy0Var.f33217x;
                    if (u10Var3 != null) {
                        u10Var3.a(trim);
                    }
                    org.telegram.messenger.zi ziVar2 = dy0Var.f33214r;
                    if (ziVar2 != null) {
                        ziVar2.K1 = true;
                        dy0Var.d.u3(ziVar2, null, false, false, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                n01 n01Var = (n01) this.f3317b;
                String lowerCase = editable.toString().trim().toLowerCase();
                n01Var.M = lowerCase;
                if (lowerCase.startsWith("@")) {
                    n01Var.M = n01Var.M.substring(1);
                }
                n01Var.b();
                n01Var.N.clear();
                if (!n01Var.d && !n01Var.f36312c && !TextUtils.isEmpty(n01Var.M)) {
                    j50 j50Var = new j50(26, n01Var, n01Var.M);
                    n01Var.P = j50Var;
                    g0.i3(j50Var, 350L);
                }
                n01Var.g();
                return;
            case 26:
                u41 u41Var = (u41) this.f3317b;
                String obj8 = u41Var.K.getText().toString();
                v41 v41Var = u41Var.L;
                if (v41Var.f38994l1.getAdapter() == null) {
                    b10 = 0;
                } else {
                    b10 = v41Var.f38994l1.getAdapter().b();
                }
                v41Var.L0(obj8);
                if (TextUtils.isEmpty(obj8) && (j1Var = v41Var.f38994l1) != null) {
                    u4.h0 adapter3 = j1Var.getAdapter();
                    sj0 sj0Var = v41Var.f38995n1;
                    if (adapter3 != sj0Var) {
                        j1 j1Var4 = v41Var.f38994l1;
                        j1Var4.X1 = false;
                        j1Var4.Y1 = 0;
                        j1Var4.setAdapter(sj0Var);
                        j1 j1Var5 = v41Var.f38994l1;
                        j1Var5.X1 = true;
                        j1Var5.Y1 = 0;
                        if (b10 == 0) {
                            v41Var.O0(0);
                        }
                    }
                }
                v41Var.f39000s1.setVisibility(0);
                return;
            case 27:
                return;
            case 28:
                ((m9) this.f3317b).C0();
                return;
            default:
                final w9 w9Var = (w9) this.f3317b;
                ArrayList arrayList3 = w9Var.f43367w;
                arrayList3.clear();
                final String trim2 = editable.toString().trim();
                Runnable runnable = w9Var.L;
                if (runnable != null) {
                    g0.r(runnable);
                    w9Var.L = null;
                }
                if (w9Var.F != 0) {
                    w9Var.getConnectionsManager().cancelRequest(w9Var.F, true);
                    w9Var.F = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim2)) {
                    str2 = trim2;
                } else {
                    str2 = null;
                }
                w9Var.f43369y = str2;
                if (str2 == null && trim2 != null && trim2.length() <= 126) {
                    String lowerCase2 = trim2.toLowerCase(Locale.ROOT);
                    if (lowerCase2.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str4 = lowerCase2;
                    }
                }
                w9Var.E = str4;
                final int i13 = w9Var.K + 1;
                w9Var.K = i13;
                if (!TextUtils.isEmpty(trim2) && w9Var.f43369y == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                w9Var.M = z13;
                w9Var.f43368x.g(null, true, false, false, false, 0L, false, 0, i13);
                gi.d dVar2 = w9Var.f43357a0;
                if (dVar2 != null) {
                    if (w9Var.f43369y != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    dVar2.setEnabled(z14);
                }
                if (!TextUtils.isEmpty(trim2) && w9Var.f43369y == null && w9Var.E == null) {
                    w9Var.j0(trim2);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    w9.f0(w9Var, trim2, i13);
                                    return;
                                default:
                                    w9 w9Var2 = w9Var;
                                    w9Var2.L = null;
                                    kg.v1 v1Var = w9Var2.f43368x;
                                    int i14 = i13;
                                    v1Var.h(trim2, true, false, false, false, false, 0L, false, 0, i14, 0L, new f2(w9Var2, i14, 4));
                                    return;
                            }
                        }
                    };
                    w9Var.L = runnable2;
                    g0.i3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    w9Var.f34298a.f35594g3.O(true);
                    final String str12 = w9Var.E;
                    if (str12 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        w9.f0(w9Var, str12, i13);
                                        return;
                                    default:
                                        w9 w9Var2 = w9Var;
                                        w9Var2.L = null;
                                        kg.v1 v1Var = w9Var2.f43368x;
                                        int i14 = i13;
                                        v1Var.h(str12, true, false, false, false, false, 0L, false, 0, i14, 0L, new f2(w9Var2, i14, 4));
                                        return;
                                }
                            }
                        };
                        w9Var.L = runnable3;
                        g0.i3(runnable3, 300L);
                    }
                }
                w9Var.p0(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        boolean z10;
        switch (this.f3316a) {
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
                zb0 zb0Var = (zb0) this.f3317b;
                LinkedList linkedList = zb0Var.W;
                LinkedList linkedList2 = zb0Var.V;
                Drawable drawable = zb0Var.f40998a;
                if (drawable instanceof la0) {
                    la0 la0Var = (la0) drawable;
                    la0Var.D = null;
                    la0Var.y();
                    float f10 = la0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        la0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        la0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            zb0Var.b(la0Var);
                            return;
                        }
                        linkedList2.offer(new v6(this, z10, la0Var, 23));
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
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f3316a) {
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
                SearchView searchView = (SearchView) this.f3317b;
                Editable text = searchView.G.getText();
                searchView.f1385p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.f1384o0 && !searchView.f1378h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                    i12 = 0;
                }
                searchView.N.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
            case 12:
                q0 q0Var = (q0) this.f3317b;
                m0 m0Var = q0Var.I;
                if (m0Var != null) {
                    m0Var.l(q0Var.f28445e);
                }
                q0Var.j();
                if (!q0Var.f28450h0.isEmpty() && !TextUtils.isEmpty(q0Var.f28445e.getText()) && q0Var.f28451i0 >= 0) {
                    q0Var.f28451i0 = -1;
                    q0Var.D();
                    return;
                }
                return;
            case 13:
                y4 y4Var = (y4) this.f3317b;
                y4Var.h();
                m0 f10 = y4.f(y4Var);
                if (f10 != null) {
                    f10.l(y4Var.f28874s);
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
                ((k4) this.f3317b).a(charSequence.toString());
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

    private final void A(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void K(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void L(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void M(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void N(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void O(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void P(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void Q(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void R(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void S(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void T(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void U(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void V(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void W(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void X(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void Y(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void Z(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void a0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
