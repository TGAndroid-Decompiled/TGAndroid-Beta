package ag;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.r5;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.Wallet.ra;
import org.telegram.ui.h4;
import org.telegram.ui.zd;
public final class a1 implements TextWatcher {
    public final int f458a;
    public final Object f459b;

    public a1(Object obj, int i10) {
        this.f458a = i10;
        this.f459b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        int b10;
        b1 b1Var;
        String str;
        boolean z14;
        boolean z15;
        boolean z16;
        q20 q20Var;
        long j10;
        Object[] objArr;
        sf.a i10;
        String obj;
        int indexOf;
        float f10 = 0.0f;
        long j11 = 0;
        String str2 = null;
        boolean z17 = true;
        boolean z18 = false;
        switch (this.f458a) {
            case 0:
                h1 h1Var = (h1) this.f459b;
                b1 b1Var2 = h1Var.f542s;
                xy xyVar = h1Var.E;
                e1 e1Var = h1Var.f545y;
                String obj2 = editable.toString();
                if (!obj2.isEmpty()) {
                    if (xyVar != null) {
                        xyVar.setText(cd.L0(2131748183, null));
                    }
                } else if (b1Var2.getAdapter() != e1Var) {
                    int N = h1.N(h1Var);
                    xyVar.c();
                    b1Var2.setAdapter(e1Var);
                    e1Var.f();
                    if (N > 0) {
                        h1Var.f543w.h1(0, -N);
                    }
                }
                f1 f1Var = h1Var.D;
                if (f1Var != null) {
                    h1 h1Var2 = f1Var.f514f;
                    b1 b1Var3 = h1Var2.f542s;
                    ArrayList arrayList = f1Var.d;
                    arrayList.clear();
                    f1Var.e = obj2;
                    String N3 = org.telegram.messenger.i0.N3(obj2);
                    if (N3.startsWith("/")) {
                        N3 = N3.substring(1);
                    }
                    ArrayList arrayList2 = i3.f(d20.f15147s0).f567b;
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        h3 h3Var = (h3) arrayList2.get(i11);
                        if (!i3.g(h3Var.f552b)) {
                            String N32 = org.telegram.messenger.i0.N3(h3Var.f552b);
                            if (N32.startsWith(N3) || sc.e.y(" ", N3, N32)) {
                                arrayList.add(h3Var);
                            }
                        }
                    }
                    s4.g0 adapter = b1Var3.getAdapter();
                    f1 f1Var2 = h1Var2.D;
                    if (adapter != f1Var2) {
                        b1Var3.setAdapter(f1Var2);
                    }
                    f1Var.f();
                    return;
                }
                return;
            case 1:
                t1 t1Var = (t1) this.f459b;
                t1Var.f736y = false;
                l1 l1Var = t1Var.F;
                org.telegram.messenger.i0.r(l1Var);
                if (TextUtils.isEmpty(t1Var.f730f.getText())) {
                    t1Var.D = null;
                    t1Var.d.b();
                } else {
                    t1Var.f736y = true;
                    org.telegram.messenger.i0.h3(l1Var, 800L);
                }
                t1Var.f729c.f30819f3.O(true);
                t1Var.f0();
                return;
            case 2:
                f2 f2Var = (f2) this.f459b;
                if (!f2Var.f517c) {
                    f2Var.D = false;
                    f2Var.f524y = editable.toString();
                    f2Var.Y(true);
                    return;
                }
                return;
            case 3:
                ih.d dVar = (ih.d) this.f459b;
                int length = dVar.f8523a.getText().length();
                fe.b bVar = dVar.H;
                int i12 = dVar.f8532y;
                if (length > (i12 * 7) / 10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.a(z10, true);
                fe.b bVar2 = dVar.I;
                if (length > i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.a(z11, true);
                dVar.f8526f.l(Integer.toString(i12 - length), false);
                return;
            case 4:
                lh.g gVar = (lh.g) this.f459b;
                gVar.X0();
                gVar.U1 = editable.toString();
                gVar.V1.O(true);
                return;
            case 5:
                return;
            case 6:
                og.l lVar = ((og.m) this.f459b).f14209c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    mg.w0 w0Var = ((mg.m0) lVar).f13187a;
                    w0Var.f13277n2 = trim;
                    w0Var.k1(false, false);
                    w0Var.k1(true, true);
                    return;
                }
                return;
            case 7:
            case 8:
                return;
            case 9:
                nc ncVar = (nc) this.f459b;
                ncVar.F((ncVar.f51340f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : false);
                return;
            case 10:
                mi miVar = (mi) this.f459b;
                ci ciVar = miVar.f28480f0;
                TextUtils.isEmpty(miVar.D);
                miVar.D = editable.toString().trim();
                ci ciVar2 = miVar.f28475a0;
                org.telegram.messenger.i0.r(ciVar2);
                if (!TextUtils.isEmpty(miVar.D)) {
                    String str3 = miVar.D;
                    if (str3 != null && str3.length() >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    miVar.W = z12;
                    if (!TextUtils.equals(miVar.V, miVar.D)) {
                        miVar.L.clear();
                        miVar.f28476b0 = 0;
                        miVar.f28477c0 = false;
                    }
                    org.telegram.messenger.i0.h3(ciVar2, 1500L);
                }
                org.telegram.messenger.i0.r(ciVar);
                if (!TextUtils.isEmpty(miVar.D)) {
                    String str4 = miVar.D;
                    miVar.m0 = (str4 == null || str4.length() < 3 || TextUtils.isEmpty(((org.telegram.messenger.q0) vp.r1(miVar.f30947b.D3).f18957y7.F.f13480b).f17539c)) ? false : false;
                    if (!TextUtils.equals(miVar.f28479e0, miVar.D)) {
                        miVar.M.clear();
                        miVar.f28481g0 = false;
                    }
                    org.telegram.messenger.i0.h3(ciVar, 1500L);
                }
                miVar.S();
                return;
            case 11:
                String obj3 = editable.toString();
                if (!obj3.isEmpty()) {
                    xy xyVar2 = ((ej) this.f459b).G;
                    if (xyVar2 != null) {
                        xyVar2.setText(cd.L0(2131748183, null));
                    }
                } else {
                    s4.g0 adapter2 = ((ej) this.f459b).f25814s.getAdapter();
                    ej ejVar = (ej) this.f459b;
                    if (adapter2 != ejVar.E) {
                        int N2 = ej.N(ejVar);
                        ((ej) this.f459b).G.setText(cd.L0(2131748240, null));
                        ((ej) this.f459b).G.c();
                        ej ejVar2 = (ej) this.f459b;
                        ejVar2.f25814s.setAdapter(ejVar2.E);
                        ((ej) this.f459b).E.f();
                        if (N2 > 0) {
                            ((ej) this.f459b).f25815w.h1(0, -N2);
                        }
                    }
                }
                aj ajVar = ((ej) this.f459b).F;
                if (ajVar != null) {
                    if (ajVar.f24419f != null) {
                        Utilities.f14522g.a(ajVar.f24419f);
                        ajVar.f24419f = null;
                    }
                    int i13 = ajVar.h + 1;
                    ajVar.h = i13;
                    r5 r5Var = Utilities.f14522g;
                    zi ziVar = new zi(ajVar, obj3, i13, 0);
                    ajVar.f24419f = ziVar;
                    r5Var.d(ziVar, 300L);
                    return;
                }
                return;
            case 12:
                mt mtVar = (mt) this.f459b;
                if (mtVar.R1 != mtVar.getLineCount()) {
                    if (!mtVar.S1 && mtVar.getMeasuredWidth() > 0) {
                        mtVar.F(mtVar.R1, mtVar.getLineCount());
                    }
                    mtVar.R1 = mtVar.getLineCount();
                    return;
                }
                return;
            case 13:
                ((n0) this.f459b).run();
                return;
            case 14:
                iy iyVar = (iy) this.f459b;
                iyVar.g(false);
                yp ypVar = iyVar.d;
                String obj4 = ypVar.getText().toString();
                iyVar.c(obj4, true);
                hy hyVar = iyVar.f27127r;
                if (hyVar != null) {
                    hyVar.I1(null);
                    hyVar.J1(TextUtils.isEmpty(obj4), true);
                }
                iyVar.f(!TextUtils.isEmpty(obj4));
                if (ypVar != null) {
                    ypVar.clearAnimation();
                    ypVar.animate().translationX(0.0f).setInterpolator(gr.h).start();
                }
                iyVar.d(false);
                return;
            case 15:
                h10 h10Var = (h10) this.f459b;
                if (!h10Var.F.isEmpty() && editable.length() > 0 && h10Var.I >= 0) {
                    h10Var.I = -1;
                    h10Var.e();
                }
                h10Var.f26583a.a((h10Var.f26587n || h10Var.f26588r.length() > 0) ? true : true, true);
                return;
            case 16:
                zc0 zc0Var = (zc0) this.f459b;
                if (zc0Var.f33019r.length() == 4 && tz.f18177r == 0) {
                    zc0Var.n(false);
                    return;
                }
                return;
            case 17:
                hm0 hm0Var = (hm0) this.f459b;
                ImageView imageView = hm0Var.f26781b;
                org.telegram.ui.ActionBar.n0 n0Var = hm0Var.d;
                if (n0Var.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (imageView.getAlpha() == 0.0f) {
                    z17 = false;
                }
                if (z13 != z17) {
                    ViewPropertyAnimator animate = imageView.animate();
                    float f11 = 1.0f;
                    if (z13) {
                        f10 = 1.0f;
                    }
                    ViewPropertyAnimator duration = animate.alpha(f10).setDuration(150L);
                    if (z13) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = duration.scaleX(f7);
                    if (!z13) {
                        f11 = 0.1f;
                    }
                    scaleX.scaleY(f11).start();
                }
                hm0Var.a(n0Var.getText().toString());
                return;
            case 18:
                sx0 sx0Var = (sx0) this.f459b;
                qx0 qx0Var = sx0Var.f30372c;
                if (qx0Var != null && qx0Var.getVisibility() == 0) {
                    sx0Var.e();
                    return;
                }
                return;
            case 19:
                iz0 iz0Var = (iz0) this.f459b;
                f6 f6Var = iz0Var.f27152n;
                if (!iz0Var.f27157y) {
                    String trim2 = editable.toString().trim();
                    if (trim2.length() > 16) {
                        f6Var.setText("-" + (trim2.length() - 16));
                        trim2 = trim2.substring(0, 16);
                    } else {
                        f6Var.setText("");
                    }
                    q20 q20Var2 = iz0Var.f27156x;
                    if (q20Var2 != null) {
                        q20Var2.a(trim2);
                    }
                    jj jjVar = iz0Var.f27153r;
                    if (jjVar != null) {
                        jjVar.K1 = true;
                        iz0Var.d.s3(jjVar, null, false, false, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                t11 t11Var = (t11) this.f459b;
                t11Var.K = editable.toString().trim().toLowerCase();
                if (t11Var.K.startsWith("@")) {
                    t11Var.K = t11Var.K.substring(1);
                }
                t11Var.f();
                return;
            case 21:
                d61 d61Var = (d61) this.f459b;
                String obj5 = d61Var.J.getText().toString();
                e61 e61Var = d61Var.K;
                if (e61Var.f25719k1.getAdapter() == null) {
                    b10 = 0;
                } else {
                    b10 = e61Var.f25719k1.getAdapter().b();
                }
                e61Var.L0(obj5);
                if (TextUtils.isEmpty(obj5) && (b1Var = e61Var.f25719k1) != null) {
                    s4.g0 adapter3 = b1Var.getAdapter();
                    sk0 sk0Var = e61Var.f25720m1;
                    if (adapter3 != sk0Var) {
                        b1 b1Var4 = e61Var.f25719k1;
                        b1Var4.W1 = false;
                        b1Var4.X1 = 0;
                        b1Var4.setAdapter(sk0Var);
                        b1 b1Var5 = e61Var.f25719k1;
                        b1Var5.W1 = true;
                        b1Var5.X1 = 0;
                        if (b10 == 0) {
                            e61Var.O0(0);
                        }
                    }
                }
                e61Var.f25725r1.setVisibility(0);
                return;
            case 22:
                return;
            case 23:
                ((r9) this.f459b).B0();
                return;
            case 24:
                final ba baVar = (ba) this.f459b;
                ArrayList arrayList3 = baVar.f34287w;
                arrayList3.clear();
                final String trim3 = editable.toString().trim();
                Runnable runnable = baVar.K;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                    baVar.K = null;
                }
                if (baVar.E != 0) {
                    baVar.getConnectionsManager().cancelRequest(baVar.E, true);
                    baVar.E = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim3)) {
                    str = trim3;
                } else {
                    str = null;
                }
                baVar.f34289y = str;
                if (str == null && trim3 != null && trim3.length() <= 126) {
                    String lowerCase = trim3.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                baVar.D = str2;
                final int i14 = baVar.J + 1;
                baVar.J = i14;
                if (!TextUtils.isEmpty(trim3) && baVar.f34289y == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                baVar.L = z14;
                baVar.f34288x.g(null, true, false, false, false, 0L, false, 0, i14);
                vh.d dVar2 = baVar.Z;
                if (dVar2 != null) {
                    if (baVar.f34289y != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    dVar2.setEnabled(z15);
                }
                if (!TextUtils.isEmpty(trim3) && baVar.f34289y == null && baVar.D == null) {
                    baVar.i0(trim3);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    ba.e0(baVar, trim3, i14);
                                    return;
                                default:
                                    ba baVar2 = baVar;
                                    baVar2.K = null;
                                    zf.m1 m1Var = baVar2.f34288x;
                                    int i15 = i14;
                                    m1Var.h(trim3, true, false, false, false, false, 0L, false, 0, i15, 0L, new qq(baVar2, i15, 29));
                                    return;
                            }
                        }
                    };
                    baVar.K = runnable2;
                    org.telegram.messenger.i0.h3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    baVar.f29837a.f30819f3.O(true);
                    final String str5 = baVar.D;
                    if (str5 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        ba.e0(baVar, str5, i14);
                                        return;
                                    default:
                                        ba baVar2 = baVar;
                                        baVar2.K = null;
                                        zf.m1 m1Var = baVar2.f34288x;
                                        int i15 = i14;
                                        m1Var.h(str5, true, false, false, false, false, 0L, false, 0, i15, 0L, new qq(baVar2, i15, 29));
                                        return;
                                }
                            }
                        };
                        baVar.K = runnable3;
                        org.telegram.messenger.i0.h3(runnable3, 300L);
                    }
                }
                baVar.o0(true);
                return;
            case 25:
                ra raVar = (ra) this.f459b;
                if (raVar.f35161w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && raVar.b()) {
                    raVar.setError(false);
                }
                raVar.e();
                raVar.d();
                if (raVar.f35154a.hasFocus()) {
                    raVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = raVar.f35157f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f459b;
                ImageView imageView2 = m0Var.J;
                if (editable.length() > 0 && m0Var.T) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                org.telegram.messenger.i0.U3(imageView2, z16, true);
                String obj6 = editable.toString();
                h4 h4Var = m0Var.B0;
                String lowerCase2 = obj6.toLowerCase();
                o0 o0Var = h4Var.W0;
                if (o0Var != null) {
                    org.telegram.messenger.i0.r(o0Var);
                    h4Var.W0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    h4Var.E.clear();
                    h4Var.F = lowerCase2;
                    h4Var.f37746u0[0].f39039c.D.clear();
                    h4Var.b0(false);
                    if (h4Var.f37746u0[0].f()) {
                        if (h4Var.f37746u0[0].getWebView() != null) {
                            org.telegram.ui.web.v0 webView = h4Var.f37746u0[0].getWebView();
                            webView.I = new org.telegram.ui.y(h4Var, 9);
                            webView.findAllAsync("");
                            h4Var.f0();
                        }
                    } else {
                        h4Var.f37746u0[0].f39038b.g1();
                        h4Var.U(0);
                    }
                    h4Var.X0 = -1;
                    return;
                }
                int i15 = h4Var.X0 + 1;
                h4Var.X0 = i15;
                if (h4Var.f37746u0[0].f()) {
                    h4Var.b0(true);
                    if (h4Var.f37746u0[0].getWebView() != null) {
                        org.telegram.ui.web.v0 webView2 = h4Var.f37746u0[0].getWebView();
                        webView2.I = new org.telegram.ui.y(h4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        h4Var.f0();
                        return;
                    }
                    return;
                }
                o0 o0Var2 = new o0(h4Var, lowerCase2, i15, 13);
                h4Var.W0 = o0Var2;
                org.telegram.messenger.i0.h3(o0Var2, 400L);
                return;
            case 27:
                qg.h hVar = (qg.h) this.f459b;
                if (!hVar.h && (q20Var = hVar.f45546n) != null && editable != null) {
                    q20Var.a(editable.toString());
                    return;
                }
                return;
            case 28:
                rh.i iVar = (rh.i) this.f459b;
                rh.b bVar3 = iVar.f47057s0;
                TLRPC.TL_payments_starsRevenueStats h = rh.r.g(rh.i.q0(iVar)).h(iVar.f47035b, false);
                if (h == null) {
                    j10 = 0;
                } else {
                    j10 = h.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j11 = Long.parseLong(editable.toString());
                }
                iVar.Y = j11;
                if (j11 > j10) {
                    iVar.Y = j10;
                    iVar.W = true;
                    iVar.Z.setText(Long.toString(j10));
                    zd zdVar = iVar.Z;
                    zdVar.setSelection(zdVar.getText().length());
                    iVar.W = false;
                }
                if (iVar.Y != j10) {
                    z17 = false;
                }
                iVar.X = z17;
                org.telegram.messenger.i0.r(bVar3);
                bVar3.run();
                if (!iVar.W) {
                    iVar.X = false;
                    return;
                }
                return;
            default:
                rh.e0 e0Var = (rh.e0) this.f459b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    objArr = null;
                } else {
                    objArr = 1;
                }
                if (objArr == null && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                if (objArr == null) {
                    i10 = sf.a.h(editable.toString(), e0Var.f46787y1.f48254a);
                } else {
                    i10 = sf.a.i(0L, e0Var.f46787y1.f48254a);
                }
                e0Var.M0(i10, false, false, true);
                e0Var.f46775m1.c(e0Var.f46776n1.isFocused(), !TextUtils.isEmpty(e0Var.f46776n1.getText()));
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f458a) {
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
                return;
            case 16:
                zc0 zc0Var = (zc0) this.f459b;
                LinkedList linkedList = zc0Var.V;
                LinkedList linkedList2 = zc0Var.U;
                Drawable drawable = zc0Var.f33006a;
                if (drawable instanceof jb0) {
                    jb0 jb0Var = (jb0) drawable;
                    jb0Var.D = null;
                    jb0Var.y();
                    float f7 = jb0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        jb0Var.w(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        jb0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            zc0Var.b(jb0Var);
                            return;
                        }
                        linkedList2.offer(new j0(this, z10, jb0Var, 20));
                        linkedList.offer(Boolean.valueOf(z10));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i14 = 0; i14 < linkedList2.size(); i14++) {
                            Runnable runnable = (Runnable) linkedList2.get(i14);
                            if (((Boolean) linkedList.get(i14)).booleanValue() != z10) {
                                arrayList.add(runnable);
                                arrayList2.add(Integer.valueOf(i14));
                            }
                        }
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = arrayList.get(i15);
                            i15++;
                            linkedList2.remove((Runnable) obj);
                        }
                        int size2 = arrayList2.size();
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
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

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f458a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                SearchView searchView = (SearchView) this.f459b;
                Editable text = searchView.F.getText();
                searchView.f1062o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f1061n0 && !searchView.f1055g0 && isEmpty) {
                    searchView.K.setVisibility(8);
                    i13 = 0;
                }
                searchView.M.setVisibility(i13);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
            case 6:
                return;
            case 7:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f459b;
                org.telegram.ui.ActionBar.p0 p0Var = t0Var.H;
                if (p0Var != null) {
                    p0Var.l(t0Var.e);
                }
                t0Var.j();
                if (!t0Var.f20834g0.isEmpty() && !TextUtils.isEmpty(t0Var.e.getText()) && t0Var.f20835h0 >= 0) {
                    t0Var.f20835h0 = -1;
                    t0Var.D();
                    return;
                }
                return;
            case 8:
                i5 i5Var = (i5) this.f459b;
                i5Var.h();
                org.telegram.ui.ActionBar.p0 f7 = i5.f(i5Var);
                if (f7 != null) {
                    f7.l(i5Var.f20428s);
                    return;
                }
                return;
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
                return;
            case 22:
                ((m4) this.f459b).a(charSequence.toString());
                return;
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

    private final void d(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void B(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void C(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void D(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void E(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void F(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void G(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void I(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void J(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void K(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void L(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void M(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void N(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void O(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void P(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void Q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void R(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void S(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void T(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void U(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void V(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void W(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void X(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void Y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void Z(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void a0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
