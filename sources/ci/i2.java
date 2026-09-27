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
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zy;
import org.telegram.ui.Components.zy0;
public final class i2 implements TextWatcher {
    public final int f4773a;
    public final Object f4774b;

    public i2(Object obj, int i10) {
        this.f4773a = i10;
        this.f4774b = obj;
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
        switch (this.f4773a) {
            case 0:
                l2 l2Var = (l2) this.f4774b;
                ImageView imageView = l2Var.f5090n;
                h2 h2Var = l2Var.d;
                if (!l2Var.f5091r) {
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
                    k2 k2Var = l2Var.f5089f;
                    if (k2Var != null) {
                        k2Var.G1(null);
                        l2Var.f5089f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (h2Var != null) {
                        h2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = h2Var.animate().translationX(0.0f);
                        sr srVar = sr.h;
                        translationX.setInterpolator(srVar).start();
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
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new androidx.fragment.app.a0(this, 13)).setInterpolator(srVar).setDuration(320L);
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
                ((fi.p) this.f4774b).Y();
                return;
            case 2:
                hg.u0 u0Var = (hg.u0) this.f4774b;
                u0Var.f10428x = false;
                hg.n0 n0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(u0Var.f10423f.getText())) {
                    u0Var.f10429y = null;
                    u0Var.d.b();
                } else {
                    u0Var.f10428x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                u0Var.f10422c.Y2.N(true);
                u0Var.b0();
                return;
            case 3:
                hg.e1 e1Var = (hg.e1) this.f4774b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.f10263y = editable.toString();
                    e1Var.U(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                ld ldVar = (ld) this.f4774b;
                if (ldVar.f5122f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ldVar.F(z10);
                return;
            case 6:
                du duVar = (du) this.f4774b;
                i10 = duVar.lineCount;
                if (i10 != duVar.getLineCount()) {
                    z11 = duVar.isInitLineCount;
                    if (!z11 && duVar.getMeasuredWidth() > 0) {
                        i11 = duVar.lineCount;
                        duVar.onLineCountChanged(i11, duVar.getLineCount());
                    }
                    duVar.lineCount = duVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((u1) this.f4774b).run();
                return;
            case 8:
                zy zyVar = (zy) this.f4774b;
                zyVar.g(false);
                kq kqVar = zyVar.d;
                String obj2 = kqVar.getText().toString();
                zyVar.c(obj2, true);
                yy yyVar = zyVar.f30995r;
                if (yyVar != null) {
                    yyVar.G1(null);
                    yyVar.H1(TextUtils.isEmpty(obj2), true);
                }
                zyVar.f(!TextUtils.isEmpty(obj2));
                if (kqVar != null) {
                    kqVar.clearAnimation();
                    kqVar.animate().translationX(0.0f).setInterpolator(sr.h).start();
                }
                zyVar.d(false);
                return;
            case 9:
                e20 e20Var = (e20) this.f4774b;
                if (!e20Var.F.isEmpty() && editable.length() > 0 && e20Var.I >= 0) {
                    e20Var.I = -1;
                    e20Var.f();
                }
                le.c cVar = e20Var.f23845a;
                if (!e20Var.f23849n && e20Var.f23850r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                cVar.a(z12, true);
                return;
            case 10:
                ce0 ce0Var = (ce0) this.f4774b;
                if (ce0Var.f23308r.length() == 4 && SharedConfig.passcodeType == 0) {
                    ce0Var.k(false);
                    return;
                }
                return;
            case 11:
                ln0 ln0Var = (ln0) this.f4774b;
                ImageView imageView2 = ln0Var.f26094c;
                h2 h2Var2 = ln0Var.e;
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
                ln0Var.a(h2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new jc0(this, 29));
                return;
            case 13:
                zy0 zy0Var = (zy0) this.f4774b;
                xy0 xy0Var = zy0Var.f31004c;
                if (xy0Var != null && xy0Var.getVisibility() == 0) {
                    zy0Var.e();
                    return;
                }
                return;
            case 14:
                d71 d71Var = (d71) this.f4774b;
                String obj3 = d71Var.J.getText().toString();
                e71 e71Var = d71Var.K;
                if (e71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = e71Var.d.getAdapter().h();
                }
                e71Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (w0Var = e71Var.d) != null) {
                    s4.h0 adapter = w0Var.getAdapter();
                    xl0 xl0Var = e71Var.f23962f;
                    if (adapter != xl0Var) {
                        ai.w0 w0Var2 = e71Var.d;
                        w0Var2.Y1 = false;
                        w0Var2.Z1 = 0;
                        w0Var2.setAdapter(xl0Var);
                        ai.w0 w0Var3 = e71Var.d;
                        w0Var3.Y1 = true;
                        w0Var3.Z1 = 0;
                        if (h == 0) {
                            e71Var.J(0);
                        }
                    }
                }
                e71Var.v.setVisibility(0);
                return;
            case 15:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f4774b;
                ImageView imageView3 = m0Var.J;
                if (editable.length() > 0 && m0Var.T) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z14, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.j4 j4Var = m0Var.B0;
                String lowerCase = obj4.toLowerCase();
                ai.s1 s1Var = j4Var.V0;
                if (s1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    j4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    j4Var.E.clear();
                    j4Var.F = lowerCase;
                    j4Var.f34627u0[0].f35796c.f34130y.clear();
                    j4Var.d0(false);
                    if (j4Var.f34627u0[0].f()) {
                        if (j4Var.f34627u0[0].getWebView() != null) {
                            org.telegram.ui.web.z0 webView = j4Var.f34627u0[0].getWebView();
                            webView.I = new org.telegram.ui.c0(j4Var, 9);
                            webView.findAllAsync("");
                            j4Var.h0();
                        }
                    } else {
                        j4Var.f34627u0[0].f35795b.g1();
                        j4Var.W(0);
                    }
                    j4Var.W0 = -1;
                    return;
                }
                int i12 = j4Var.W0 + 1;
                j4Var.W0 = i12;
                if (j4Var.f34627u0[0].f()) {
                    j4Var.d0(true);
                    if (j4Var.f34627u0[0].getWebView() != null) {
                        org.telegram.ui.web.z0 webView2 = j4Var.f34627u0[0].getWebView();
                        webView2.I = new org.telegram.ui.c0(j4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        j4Var.h0();
                        return;
                    }
                    return;
                }
                ai.s1 s1Var2 = new ai.s1(j4Var, lowerCase, i12, 22);
                j4Var.V0 = s1Var2;
                AndroidUtilities.runOnUIThread(s1Var2, 400L);
                return;
            case 16:
                qh.c cVar2 = (qh.c) this.f4774b;
                int length = cVar2.f42067a.getText().length();
                le.c cVar3 = cVar2.H;
                int i13 = cVar2.f42075x;
                if (length > (i13 * 7) / 10) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                cVar3.a(z15, true);
                le.c cVar4 = cVar2.I;
                if (length > i13) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                cVar4.a(z16, true);
                cVar2.f42070f.l(Integer.toString(i13 - length), false);
                return;
            case 17:
                th.f fVar = (th.f) this.f4774b;
                fVar.J();
                fVar.f43591c0 = editable.toString();
                fVar.f43592d0.N(true);
                return;
            case 18:
                vg.k kVar = ((vg.l) this.f4774b).f44661c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    tg.a0 a0Var = ((tg.u) kVar).f43538a;
                    a0Var.f43416v0 = trim;
                    a0Var.a0(false, false);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            default:
                yh.g gVar = (yh.g) this.f4774b;
                yh.b bVar = gVar.f47460n0;
                TLRPC.TL_payments_starsRevenueStats h10 = yh.o.g(yh.g.d0(gVar)).h(gVar.f47445b, false);
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
                AndroidUtilities.cancelRunOnUIThread(bVar);
                bVar.run();
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
        switch (this.f4773a) {
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
                ce0 ce0Var = (ce0) this.f4774b;
                LinkedList linkedList = ce0Var.N;
                LinkedList linkedList2 = ce0Var.M;
                Drawable drawable = ce0Var.f23303a;
                if (drawable instanceof nc0) {
                    nc0 nc0Var = (nc0) drawable;
                    nc0Var.D = null;
                    nc0Var.z();
                    float f7 = nc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        nc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        nc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            ce0Var.b(nc0Var);
                            return;
                        }
                        linkedList2.offer(new y0(this, z10, nc0Var, 22));
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
        switch (this.f4773a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f4774b;
                Editable text = searchView.F.getText();
                searchView.f2009o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2008n0 && !searchView.f2002g0 && isEmpty) {
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
