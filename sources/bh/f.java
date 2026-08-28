package bh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bg.h1;
import bg.w0;
import dg.l;
import dg.m;
import f2.r0;
import gh.c0;
import gh.f1;
import gh.o;
import gh.r;
import gh.u5;
import java.util.ArrayList;
import java.util.LinkedList;
import kh.f2;
import kh.g2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.l4;
import org.telegram.ui.n0;
import org.telegram.ui.web.v0;
import pf.i0;
import pf.m0;
public final class f implements TextWatcher {
    public final int f2024a;
    public final Object f2025b;

    public f(Object obj, int i9) {
        this.f2024a = i9;
        this.f2025b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j10;
        String str;
        float f10;
        long j11;
        boolean z10;
        int i9;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        float f11;
        int h;
        f1 f1Var;
        boolean z14;
        boolean z15;
        boolean z16;
        switch (this.f2024a) {
            case 0:
                j jVar = (j) this.f2025b;
                jVar.I();
                jVar.Y = editable.toString();
                jVar.Z.N(true);
                return;
            case 1:
                l lVar = ((m) this.f2025b).f4535c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    h1 h1Var = ((w0) lVar).f1985a;
                    h1Var.f1824r0 = trim;
                    h1Var.Z(false, false);
                    h1Var.Z(true, true);
                    return;
                }
                return;
            case 2:
                r rVar = (r) this.f2025b;
                gh.c cVar = rVar.f8781j0;
                TLRPC.TL_payments_starsRevenueStats h10 = c0.g(r.c0(rVar)).h(rVar.f8769b, false);
                long j12 = 0;
                if (h10 == null) {
                    j10 = 0;
                } else {
                    j10 = h10.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                rVar.L = j12;
                boolean z17 = true;
                if (j12 > j10) {
                    rVar.L = j10;
                    rVar.J = true;
                    rVar.M.setText(Long.toString(j10));
                    o oVar = rVar.M;
                    oVar.setSelection(oVar.getText().length());
                    rVar.J = false;
                }
                if (rVar.L != j10) {
                    z17 = false;
                }
                rVar.K = z17;
                AndroidUtilities.cancelRunOnUIThread(cVar);
                cVar.run();
                if (!rVar.J) {
                    rVar.K = false;
                    return;
                }
                return;
            case 3:
                g2 g2Var = (g2) this.f2025b;
                ImageView imageView = g2Var.f15261n;
                fg.g gVar = g2Var.d;
                if (!g2Var.f15262r) {
                    g2Var.d(false);
                    String obj = gVar.getText().toString();
                    if (TextUtils.isEmpty(obj)) {
                        str = null;
                    } else {
                        str = obj;
                    }
                    Utilities.Callback2 callback2 = g2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    f2 f2Var = g2Var.f15260f;
                    if (f2Var != null) {
                        f2Var.F1(null);
                        g2Var.f15260f.G1(TextUtils.isEmpty(obj), true);
                    }
                    if (gVar != null) {
                        gVar.animate().cancel();
                        float f12 = 0.0f;
                        ViewPropertyAnimator translationX = gVar.animate().translationX(0.0f);
                        gr grVar = gr.h;
                        translationX.setInterpolator(grVar).start();
                        if (imageView != null && g2Var.h != (!TextUtils.isEmpty(gVar.getText()))) {
                            g2Var.h = !g2Var.h;
                            imageView.animate().cancel();
                            if (g2Var.h) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f13 = 0.7f;
                            if (g2Var.h) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f10);
                            if (g2Var.h) {
                                f13 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
                            if (g2Var.h) {
                                f12 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f12).withEndAction(new kh.f1(this, 3)).setInterpolator(grVar).setDuration(320L);
                            if (g2Var.h) {
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
            case 4:
                return;
            case 5:
                ((nh.o) this.f2025b).X();
                return;
            case 6:
                ad adVar = (ad) this.f2025b;
                if (adVar.f15632f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                adVar.F(z10);
                return;
            case 7:
                mt mtVar = (mt) this.f2025b;
                i9 = mtVar.lineCount;
                if (i9 != mtVar.getLineCount()) {
                    z11 = mtVar.isInitLineCount;
                    if (!z11 && mtVar.getMeasuredWidth() > 0) {
                        i10 = mtVar.lineCount;
                        mtVar.onLineCountChanged(i10, mtVar.getLineCount());
                    }
                    mtVar.lineCount = mtVar.getLineCount();
                    return;
                }
                return;
            case 8:
                ((bg.m) this.f2025b).run();
                return;
            case 9:
                jy jyVar = (jy) this.f2025b;
                jyVar.g(false);
                yp ypVar = jyVar.d;
                String obj2 = ypVar.getText().toString();
                jyVar.c(obj2, true);
                iy iyVar = jyVar.f29882r;
                if (iyVar != null) {
                    iyVar.F1(null);
                    iyVar.G1(TextUtils.isEmpty(obj2), true);
                }
                jyVar.f(!TextUtils.isEmpty(obj2));
                if (ypVar != null) {
                    ypVar.clearAnimation();
                    ypVar.animate().translationX(0.0f).setInterpolator(gr.h).start();
                }
                jyVar.d(false);
                return;
            case 10:
                m10 m10Var = (m10) this.f2025b;
                if (!m10Var.B.isEmpty() && editable.length() > 0 && m10Var.E >= 0) {
                    m10Var.E = -1;
                    m10Var.f();
                }
                td.a aVar = m10Var.f30658a;
                if (!m10Var.f30663n && m10Var.f30664r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                aVar.a(z12, true);
                return;
            case 11:
                yc0 yc0Var = (yc0) this.f2025b;
                if (yc0Var.f34946r.length() == 4 && SharedConfig.passcodeType == 0) {
                    yc0Var.k(false);
                    return;
                }
                return;
            case 12:
                hm0 hm0Var = (hm0) this.f2025b;
                ImageView imageView2 = hm0Var.f29131c;
                fg.g gVar2 = hm0Var.f29132e;
                boolean z18 = false;
                if (gVar2.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float f14 = 0.0f;
                if (imageView2.getAlpha() != 0.0f) {
                    z18 = true;
                }
                if (z13 != z18) {
                    ViewPropertyAnimator animate2 = imageView2.animate();
                    float f15 = 1.0f;
                    if (z13) {
                        f14 = 1.0f;
                    }
                    ViewPropertyAnimator duration2 = animate2.alpha(f14).setDuration(150L);
                    if (z13) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX2 = duration2.scaleX(f11);
                    if (!z13) {
                        f15 = 0.1f;
                    }
                    scaleX2.scaleY(f15).start();
                }
                hm0Var.a(gVar2.getText().toString());
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ib0(this, 28));
                return;
            case 14:
                ux0 ux0Var = (ux0) this.f2025b;
                sx0 sx0Var = ux0Var.f33160c;
                if (sx0Var != null && sx0Var.getVisibility() == 0) {
                    ux0Var.e();
                    return;
                }
                return;
            case 15:
                r51 r51Var = (r51) this.f2025b;
                String obj3 = r51Var.F.getText().toString();
                s51 s51Var = r51Var.G;
                if (s51Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = s51Var.d.getAdapter().h();
                }
                s51Var.F(obj3);
                if (TextUtils.isEmpty(obj3) && (f1Var = s51Var.d) != null) {
                    r0 adapter = f1Var.getAdapter();
                    vk0 vk0Var = s51Var.f32372f;
                    if (adapter != vk0Var) {
                        f1 f1Var2 = s51Var.d;
                        f1Var2.U1 = false;
                        f1Var2.V1 = 0;
                        f1Var2.setAdapter(vk0Var);
                        f1 f1Var3 = s51Var.d;
                        f1Var3.U1 = true;
                        f1Var3.V1 = 0;
                        if (h == 0) {
                            s51Var.I(0);
                        }
                    }
                }
                s51Var.v.setVisibility(0);
                return;
            case 16:
                n0 n0Var = (n0) this.f2025b;
                ImageView imageView3 = n0Var.F;
                if (editable.length() > 0 && n0Var.P) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z14, true, true);
                String obj4 = editable.toString();
                l4 l4Var = n0Var.f40563x0;
                String lowerCase = obj4.toLowerCase();
                d5.i iVar = l4Var.R0;
                if (iVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    l4Var.R0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    l4Var.A.clear();
                    l4Var.B = lowerCase;
                    l4Var.f40026q0[0].f41321c.f39367y.clear();
                    l4Var.d0(false);
                    if (l4Var.f40026q0[0].f()) {
                        if (l4Var.f40026q0[0].getWebView() != null) {
                            v0 webView = l4Var.f40026q0[0].getWebView();
                            webView.E = new org.telegram.ui.c0(l4Var, 9);
                            webView.findAllAsync("");
                            l4Var.h0();
                        }
                    } else {
                        l4Var.f40026q0[0].f41320b.f1();
                        l4Var.W(0);
                    }
                    l4Var.S0 = -1;
                    return;
                }
                int i11 = l4Var.S0 + 1;
                l4Var.S0 = i11;
                if (l4Var.f40026q0[0].f()) {
                    l4Var.d0(true);
                    if (l4Var.f40026q0[0].getWebView() != null) {
                        v0 webView2 = l4Var.f40026q0[0].getWebView();
                        webView2.E = new org.telegram.ui.c0(l4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        l4Var.h0();
                        return;
                    }
                    return;
                }
                d5.i iVar2 = new d5.i(l4Var, lowerCase, i11, 23);
                l4Var.R0 = iVar2;
                AndroidUtilities.runOnUIThread(iVar2, 400L);
                return;
            case 17:
                m0 m0Var = (m0) this.f2025b;
                m0Var.f45709x = false;
                i0 i0Var = m0Var.B;
                AndroidUtilities.cancelRunOnUIThread(i0Var);
                if (TextUtils.isEmpty(m0Var.f45704f.getText())) {
                    m0Var.f45710y = null;
                    m0Var.d.b();
                } else {
                    m0Var.f45709x = true;
                    AndroidUtilities.runOnUIThread(i0Var, 800L);
                }
                m0Var.f45702c.U2.N(true);
                m0Var.a0();
                return;
            case 18:
                pf.w0 w0Var = (pf.w0) this.f2025b;
                if (!w0Var.d) {
                    w0Var.A = false;
                    w0Var.f45812y = editable.toString();
                    w0Var.T(true);
                    return;
                }
                return;
            default:
                yg.c cVar2 = (yg.c) this.f2025b;
                int length = cVar2.f50208a.getText().length();
                td.a aVar2 = cVar2.D;
                int i12 = cVar2.f50217x;
                if (length > (i12 * 7) / 10) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                aVar2.a(z15, true);
                td.a aVar3 = cVar2.E;
                if (length > i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                aVar3.a(z16, true);
                cVar2.f50212f.l(Integer.toString(i12 - length), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        boolean z10;
        switch (this.f2024a) {
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
                yc0 yc0Var = (yc0) this.f2025b;
                LinkedList linkedList = yc0Var.J;
                LinkedList linkedList2 = yc0Var.I;
                Drawable drawable = yc0Var.f34940a;
                if (drawable instanceof jb0) {
                    jb0 jb0Var = (jb0) drawable;
                    jb0Var.D = null;
                    jb0Var.z();
                    float f10 = jb0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        jb0Var.x(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        jb0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            yc0Var.b(jb0Var);
                            return;
                        }
                        linkedList2.offer(new u5(this, z10, jb0Var, 19));
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
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.f2024a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f2025b;
                Editable text = searchView.B.getText();
                searchView.f502k0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.f501j0 && !searchView.f494c0 && isEmpty) {
                    searchView.G.setVisibility(8);
                    i12 = 0;
                }
                searchView.I.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
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
            default:
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void A(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void K(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void L(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void M(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
