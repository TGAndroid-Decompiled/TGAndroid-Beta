package bi;

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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zy0;
public final class u2 implements TextWatcher {
    public final int f3710a;
    public final Object f3711b;

    public u2(Object obj, int i10) {
        this.f3710a = i10;
        this.f3711b = obj;
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
        y1 y1Var;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        switch (this.f3710a) {
            case 0:
                x2 x2Var = (x2) this.f3711b;
                ImageView imageView = x2Var.f3872n;
                t2 t2Var = x2Var.d;
                if (!x2Var.f3873r) {
                    x2Var.d(false);
                    String obj = t2Var.getText().toString();
                    if (TextUtils.isEmpty(obj)) {
                        str = null;
                    } else {
                        str = obj;
                    }
                    Utilities.Callback2 callback2 = x2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    w2 w2Var = x2Var.f3871f;
                    if (w2Var != null) {
                        w2Var.E1(null);
                        x2Var.f3871f.F1(TextUtils.isEmpty(obj), true);
                    }
                    if (t2Var != null) {
                        t2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = t2Var.animate().translationX(0.0f);
                        wr wrVar = wr.h;
                        translationX.setInterpolator(wrVar).start();
                        if (imageView != null && x2Var.h != (!TextUtils.isEmpty(t2Var.getText()))) {
                            x2Var.h = !x2Var.h;
                            imageView.animate().cancel();
                            if (x2Var.h) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f12 = 0.7f;
                            if (x2Var.h) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f7);
                            if (x2Var.h) {
                                f12 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                            if (x2Var.h) {
                                f11 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new a3.d(this, 19)).setInterpolator(wrVar).setDuration(320L);
                            if (x2Var.h) {
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
                ((ei.p) this.f3711b).Y();
                return;
            case 2:
                gg.y0 y0Var = (gg.y0) this.f3711b;
                y0Var.f9098x = false;
                gg.r0 r0Var = y0Var.F;
                AndroidUtilities.cancelRunOnUIThread(r0Var);
                if (TextUtils.isEmpty(y0Var.f9093f.getText())) {
                    y0Var.f9099y = null;
                    y0Var.d.b();
                } else {
                    y0Var.f9098x = true;
                    AndroidUtilities.runOnUIThread(r0Var, 800L);
                }
                y0Var.f9092c.Y2.N(true);
                y0Var.b0();
                return;
            case 3:
                gg.k1 k1Var = (gg.k1) this.f3711b;
                if (!k1Var.d) {
                    k1Var.E = false;
                    k1Var.f8935y = editable.toString();
                    k1Var.U(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) this.f3711b;
                if (jdVar.f3268f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jdVar.F(z10);
                return;
            case 6:
                fu fuVar = (fu) this.f3711b;
                i10 = fuVar.lineCount;
                if (i10 != fuVar.getLineCount()) {
                    z11 = fuVar.isInitLineCount;
                    if (!z11 && fuVar.getMeasuredWidth() > 0) {
                        i11 = fuVar.lineCount;
                        fuVar.onLineCountChanged(i11, fuVar.getLineCount());
                    }
                    fuVar.lineCount = fuVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((e2) this.f3711b).run();
                return;
            case 8:
                ez ezVar = (ez) this.f3711b;
                ezVar.g(false);
                oq oqVar = ezVar.d;
                String obj2 = oqVar.getText().toString();
                ezVar.c(obj2, true);
                dz dzVar = ezVar.f22784r;
                if (dzVar != null) {
                    dzVar.E1(null);
                    dzVar.F1(TextUtils.isEmpty(obj2), true);
                }
                ezVar.f(!TextUtils.isEmpty(obj2));
                if (oqVar != null) {
                    oqVar.clearAnimation();
                    oqVar.animate().translationX(0.0f).setInterpolator(wr.h).start();
                }
                ezVar.d(false);
                return;
            case 9:
                k20 k20Var = (k20) this.f3711b;
                if (!k20Var.F.isEmpty() && editable.length() > 0 && k20Var.I >= 0) {
                    k20Var.I = -1;
                    k20Var.f();
                }
                le.b bVar = k20Var.f24567a;
                if (!k20Var.f24571n && k20Var.f24572r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 10:
                be0 be0Var = (be0) this.f3711b;
                if (be0Var.f21813r.length() == 4 && SharedConfig.passcodeType == 0) {
                    be0Var.k(false);
                    return;
                }
                return;
            case 11:
                gn0 gn0Var = (gn0) this.f3711b;
                ImageView imageView2 = gn0Var.f23390c;
                t2 t2Var2 = gn0Var.e;
                boolean z17 = false;
                if (t2Var2.length() > 0) {
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
                gn0Var.a(t2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new kc0(this, 28));
                return;
            case 13:
                zy0 zy0Var = (zy0) this.f3711b;
                xy0 xy0Var = zy0Var.f29832c;
                if (xy0Var != null && xy0Var.getVisibility() == 0) {
                    zy0Var.e();
                    return;
                }
                return;
            case 14:
                a71 a71Var = (a71) this.f3711b;
                String obj3 = a71Var.J.getText().toString();
                b71 b71Var = a71Var.K;
                if (b71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = b71Var.d.getAdapter().h();
                }
                b71Var.F(obj3);
                if (TextUtils.isEmpty(obj3) && (y1Var = b71Var.d) != null) {
                    s4.h0 adapter = y1Var.getAdapter();
                    ul0 ul0Var = b71Var.f21746f;
                    if (adapter != ul0Var) {
                        y1 y1Var2 = b71Var.d;
                        y1Var2.Y1 = false;
                        y1Var2.Z1 = 0;
                        y1Var2.setAdapter(ul0Var);
                        y1 y1Var3 = b71Var.d;
                        y1Var3.Y1 = true;
                        y1Var3.Z1 = 0;
                        if (h == 0) {
                            b71Var.J(0);
                        }
                    }
                }
                b71Var.v.setVisibility(0);
                return;
            case 15:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f3711b;
                ImageView imageView3 = l0Var.J;
                if (editable.length() > 0 && l0Var.T) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z14, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.j4 j4Var = l0Var.B0;
                String lowerCase = obj4.toLowerCase();
                g3 g3Var = j4Var.V0;
                if (g3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    j4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    j4Var.E.clear();
                    j4Var.F = lowerCase;
                    j4Var.f33920u0[0].f35103c.f33267y.clear();
                    j4Var.d0(false);
                    if (j4Var.f33920u0[0].f()) {
                        if (j4Var.f33920u0[0].getWebView() != null) {
                            org.telegram.ui.web.y0 webView = j4Var.f33920u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(j4Var, 9);
                            webView.findAllAsync("");
                            j4Var.h0();
                        }
                    } else {
                        j4Var.f33920u0[0].f35102b.e1();
                        j4Var.W(0);
                    }
                    j4Var.W0 = -1;
                    return;
                }
                int i12 = j4Var.W0 + 1;
                j4Var.W0 = i12;
                if (j4Var.f33920u0[0].f()) {
                    j4Var.d0(true);
                    if (j4Var.f33920u0[0].getWebView() != null) {
                        org.telegram.ui.web.y0 webView2 = j4Var.f33920u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(j4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        j4Var.h0();
                        return;
                    }
                    return;
                }
                g3 g3Var2 = new g3(j4Var, lowerCase, i12, 20);
                j4Var.V0 = g3Var2;
                AndroidUtilities.runOnUIThread(g3Var2, 400L);
                return;
            case 16:
                ph.c cVar = (ph.c) this.f3711b;
                int length = cVar.f40395a.getText().length();
                le.b bVar2 = cVar.H;
                int i13 = cVar.f40403x;
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
                cVar.f40398f.l(Integer.toString(i13 - length), false);
                return;
            case 17:
                sh.f fVar = (sh.f) this.f3711b;
                fVar.J();
                fVar.f42046c0 = editable.toString();
                fVar.f42047d0.N(true);
                return;
            case 18:
                ug.k kVar = ((ug.l) this.f3711b).f42702c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    sg.a0 a0Var = ((sg.u) kVar).f42009a;
                    a0Var.f41866v0 = trim;
                    a0Var.a0(false, false);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            default:
                xh.h hVar = (xh.h) this.f3711b;
                xh.b bVar4 = hVar.f45493n0;
                TLRPC.TL_payments_starsRevenueStats h10 = xh.p.g(xh.h.d0(hVar)).h(hVar.f45478b, false);
                long j11 = 0;
                if (h10 == null) {
                    j10 = 0;
                } else {
                    j10 = h10.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j11 = Long.parseLong(editable.toString());
                }
                hVar.P = j11;
                boolean z18 = true;
                if (j11 > j10) {
                    hVar.P = j10;
                    hVar.N = true;
                    hVar.Q.setText(Long.toString(j10));
                    ei.o oVar = hVar.Q;
                    oVar.setSelection(oVar.getText().length());
                    hVar.N = false;
                }
                if (hVar.P != j10) {
                    z18 = false;
                }
                hVar.O = z18;
                AndroidUtilities.cancelRunOnUIThread(bVar4);
                bVar4.run();
                if (!hVar.N) {
                    hVar.O = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f3710a) {
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
                be0 be0Var = (be0) this.f3711b;
                LinkedList linkedList = be0Var.N;
                LinkedList linkedList2 = be0Var.M;
                Drawable drawable = be0Var.f21808a;
                if (drawable instanceof lc0) {
                    lc0 lc0Var = (lc0) drawable;
                    lc0Var.D = null;
                    lc0Var.z();
                    float f7 = lc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        lc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        lc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            be0Var.b(lc0Var);
                            return;
                        }
                        linkedList2.offer(new c1(this, z10, lc0Var, 21));
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
        switch (this.f3710a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f3711b;
                Editable text = searchView.F.getText();
                searchView.f700o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f699n0 && !searchView.f693g0 && isEmpty) {
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
