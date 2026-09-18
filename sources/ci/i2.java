package ci;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.xy;
public final class i2 implements TextWatcher {
    public final int f4781a;
    public final Object f4782b;

    public i2(Object obj, int i10) {
        this.f4781a = i10;
        this.f4782b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        float f7;
        long j3;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        float f10;
        int h;
        ai.w0 w0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        switch (this.f4781a) {
            case 0:
                l2 l2Var = (l2) this.f4782b;
                ImageView imageView = l2Var.f4922n;
                h2 h2Var = l2Var.d;
                if (!l2Var.f4923r) {
                    l2Var.d(false);
                    String obj = h2Var.getText().toString();
                    if (TextUtils.isEmpty(obj)) {
                        str = null;
                    } else {
                        str = obj;
                    }
                    Utilities.Callback2 callback2 = l2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    k2 k2Var = l2Var.f4921f;
                    if (k2Var != null) {
                        k2Var.G1(null);
                        l2Var.f4921f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (h2Var != null) {
                        h2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = h2Var.animate().translationX(0.0f);
                        qr qrVar = qr.h;
                        translationX.setInterpolator(qrVar).start();
                        if (imageView != null && l2Var.h != (!TextUtils.isEmpty(h2Var.getText()))) {
                            l2Var.h = !l2Var.h;
                            imageView.animate().cancel();
                            if (l2Var.h) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f12 = 0.7f;
                            if (l2Var.h) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f7);
                            if (l2Var.h) {
                                f12 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                            if (l2Var.h) {
                                f11 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new androidx.fragment.app.a0(this, 13)).setInterpolator(qrVar).setDuration(320L);
                            if (l2Var.h) {
                                j3 = 240;
                            } else {
                                j3 = 0;
                            }
                            duration.setStartDelay(j3).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((fi.p) this.f4782b).Y();
                return;
            case 2:
                hg.u0 u0Var = (hg.u0) this.f4782b;
                u0Var.f10440x = false;
                hg.n0 n0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(u0Var.f10435f.getText())) {
                    u0Var.f10441y = null;
                    u0Var.d.b();
                } else {
                    u0Var.f10440x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                u0Var.f10434c.Y2.N(true);
                u0Var.b0();
                return;
            case 3:
                hg.e1 e1Var = (hg.e1) this.f4782b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.f10275y = editable.toString();
                    e1Var.U(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) this.f4782b;
                if (jdVar.f4995f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jdVar.F(z10);
                return;
            case 6:
                bu buVar = (bu) this.f4782b;
                i10 = buVar.lineCount;
                if (i10 != buVar.getLineCount()) {
                    z11 = buVar.isInitLineCount;
                    if (!z11 && buVar.getMeasuredWidth() > 0) {
                        i11 = buVar.lineCount;
                        buVar.onLineCountChanged(i11, buVar.getLineCount());
                    }
                    buVar.lineCount = buVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((u1) this.f4782b).run();
                return;
            case 8:
                xy xyVar = (xy) this.f4782b;
                xyVar.g(false);
                iq iqVar = xyVar.d;
                String obj2 = iqVar.getText().toString();
                xyVar.c(obj2, true);
                wy wyVar = xyVar.f30032r;
                if (wyVar != null) {
                    wyVar.G1(null);
                    wyVar.H1(TextUtils.isEmpty(obj2), true);
                }
                xyVar.f(!TextUtils.isEmpty(obj2));
                if (iqVar != null) {
                    iqVar.clearAnimation();
                    iqVar.animate().translationX(0.0f).setInterpolator(qr.h).start();
                }
                xyVar.d(false);
                return;
            case 9:
                b20 b20Var = (b20) this.f4782b;
                if (!b20Var.F.isEmpty() && editable.length() > 0 && b20Var.I >= 0) {
                    b20Var.I = -1;
                    b20Var.f();
                }
                le.b bVar = b20Var.f22541a;
                if (!b20Var.f22545n && b20Var.f22546r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 10:
                sd0 sd0Var = (sd0) this.f4782b;
                if (sd0Var.f27844r.length() == 4 && SharedConfig.passcodeType == 0) {
                    sd0Var.k(false);
                    return;
                }
                return;
            case 11:
                xm0 xm0Var = (xm0) this.f4782b;
                ImageView imageView2 = xm0Var.f29948c;
                h2 h2Var2 = xm0Var.e;
                boolean z17 = false;
                if (h2Var2.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float f13 = 0.0f;
                if (imageView2.getAlpha() != 0.0f) {
                    z17 = true;
                }
                if (z13 != z17) {
                    ViewPropertyAnimator animate2 = imageView2.animate();
                    float f14 = 1.0f;
                    if (z13) {
                        f13 = 1.0f;
                    }
                    ViewPropertyAnimator duration2 = animate2.alpha(f13).setDuration(150L);
                    if (z13) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX2 = duration2.scaleX(f10);
                    if (!z13) {
                        f14 = 0.1f;
                    }
                    scaleX2.scaleY(f14).start();
                }
                xm0Var.a(h2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bc0(this, 28));
                return;
            case 13:
                oy0 oy0Var = (oy0) this.f4782b;
                my0 my0Var = oy0Var.f26889c;
                if (my0Var != null && my0Var.getVisibility() == 0) {
                    oy0Var.e();
                    return;
                }
                return;
            case 14:
                o61 o61Var = (o61) this.f4782b;
                String obj3 = o61Var.J.getText().toString();
                p61 p61Var = o61Var.K;
                if (p61Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = p61Var.d.getAdapter().h();
                }
                p61Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (w0Var = p61Var.d) != null) {
                    s4.h0 adapter = w0Var.getAdapter();
                    ll0 ll0Var = p61Var.f26943f;
                    if (adapter != ll0Var) {
                        ai.w0 w0Var2 = p61Var.d;
                        w0Var2.Y1 = false;
                        w0Var2.Z1 = 0;
                        w0Var2.setAdapter(ll0Var);
                        ai.w0 w0Var3 = p61Var.d;
                        w0Var3.Y1 = true;
                        w0Var3.Z1 = 0;
                        if (h == 0) {
                            p61Var.J(0);
                        }
                    }
                }
                p61Var.v.setVisibility(0);
                return;
            case 15:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this.f4782b;
                ImageView imageView3 = k0Var.J;
                if (editable.length() > 0 && k0Var.T) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z14, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.h4 h4Var = k0Var.B0;
                String lowerCase = obj4.toLowerCase();
                ai.s1 s1Var = h4Var.V0;
                if (s1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    h4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    h4Var.E.clear();
                    h4Var.F = lowerCase;
                    h4Var.f34173u0[0].f35436c.f33548y.clear();
                    h4Var.d0(false);
                    if (h4Var.f34173u0[0].f()) {
                        if (h4Var.f34173u0[0].getWebView() != null) {
                            org.telegram.ui.web.z0 webView = h4Var.f34173u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(h4Var, 9);
                            webView.findAllAsync("");
                            h4Var.h0();
                        }
                    } else {
                        h4Var.f34173u0[0].f35435b.g1();
                        h4Var.W(0);
                    }
                    h4Var.W0 = -1;
                    return;
                }
                int i12 = h4Var.W0 + 1;
                h4Var.W0 = i12;
                if (h4Var.f34173u0[0].f()) {
                    h4Var.d0(true);
                    if (h4Var.f34173u0[0].getWebView() != null) {
                        org.telegram.ui.web.z0 webView2 = h4Var.f34173u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(h4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        h4Var.h0();
                        return;
                    }
                    return;
                }
                ai.s1 s1Var2 = new ai.s1(h4Var, lowerCase, i12, 22);
                h4Var.V0 = s1Var2;
                AndroidUtilities.runOnUIThread(s1Var2, 400L);
                return;
            case 16:
                qh.c cVar = (qh.c) this.f4782b;
                int length = cVar.f41779a.getText().length();
                le.b bVar2 = cVar.H;
                int i13 = cVar.f41787x;
                if (length > (i13 * 7) / 10) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar2.a(z15, true);
                le.b bVar3 = cVar.I;
                if (length > i13) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar3.a(z16, true);
                cVar.f41782f.l(Integer.toString(i13 - length), false);
                return;
            case 17:
                th.f fVar = (th.f) this.f4782b;
                fVar.J();
                fVar.f43289c0 = editable.toString();
                fVar.f43290d0.N(true);
                return;
            case 18:
                vg.k kVar = ((vg.l) this.f4782b).f44362c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    tg.b0 b0Var = ((tg.v) kVar).f43257a;
                    b0Var.f43135v0 = trim;
                    b0Var.a0(false, false);
                    b0Var.a0(true, true);
                    return;
                }
                return;
            default:
                yh.g gVar = (yh.g) this.f4782b;
                yh.b bVar4 = gVar.f47220n0;
                TLRPC.TL_payments_starsRevenueStats h10 = yh.o.g(yh.g.d0(gVar)).h(gVar.f47205b, false);
                long j11 = 0;
                if (h10 == null) {
                    j10 = 0;
                } else {
                    j10 = h10.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j11 = Long.parseLong(editable.toString());
                }
                gVar.P = j11;
                boolean z18 = true;
                if (j11 > j10) {
                    gVar.P = j10;
                    gVar.N = true;
                    gVar.Q.setText(Long.toString(j10));
                    fi.o oVar = gVar.Q;
                    oVar.setSelection(oVar.getText().length());
                    gVar.N = false;
                }
                if (gVar.P != j10) {
                    z18 = false;
                }
                gVar.O = z18;
                AndroidUtilities.cancelRunOnUIThread(bVar4);
                bVar4.run();
                if (!gVar.N) {
                    gVar.O = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f4781a) {
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
                return;
            case 10:
                sd0 sd0Var = (sd0) this.f4782b;
                LinkedList linkedList = sd0Var.N;
                LinkedList linkedList2 = sd0Var.M;
                Drawable drawable = sd0Var.f27839a;
                if (drawable instanceof cc0) {
                    cc0 cc0Var = (cc0) drawable;
                    cc0Var.D = null;
                    cc0Var.z();
                    float f7 = cc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        cc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        cc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            sd0Var.b(cc0Var);
                            return;
                        }
                        linkedList2.offer(new y0(this, z10, cc0Var, 21));
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

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f4781a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f4782b;
                Editable text = searchView.F.getText();
                searchView.f2015o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2014n0 && !searchView.f2008g0 && isEmpty) {
                    searchView.K.setVisibility(8);
                    i13 = 0;
                }
                searchView.M.setVisibility(i13);
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

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
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
