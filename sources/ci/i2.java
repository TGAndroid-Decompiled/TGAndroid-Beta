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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yy;
public final class i2 implements TextWatcher {
    public final int f4771a;
    public final Object f4772b;

    public i2(Object obj, int i10) {
        this.f4771a = i10;
        this.f4772b = obj;
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
        switch (this.f4771a) {
            case 0:
                l2 l2Var = (l2) this.f4772b;
                ImageView imageView = l2Var.f4951n;
                h2 h2Var = l2Var.d;
                if (!l2Var.f4952r) {
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
                    k2 k2Var = l2Var.f4950f;
                    if (k2Var != null) {
                        k2Var.F1(null);
                        l2Var.f4950f.G1(TextUtils.isEmpty(obj), true);
                    }
                    if (h2Var != null) {
                        h2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = h2Var.animate().translationX(0.0f);
                        rr rrVar = rr.h;
                        translationX.setInterpolator(rrVar).start();
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
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new androidx.fragment.app.a0(this, 13)).setInterpolator(rrVar).setDuration(320L);
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
                ((fi.p) this.f4772b).Y();
                return;
            case 2:
                hg.v0 v0Var = (hg.v0) this.f4772b;
                v0Var.f10431x = false;
                hg.o0 o0Var = v0Var.F;
                AndroidUtilities.cancelRunOnUIThread(o0Var);
                if (TextUtils.isEmpty(v0Var.f10426f.getText())) {
                    v0Var.f10432y = null;
                    v0Var.d.b();
                } else {
                    v0Var.f10431x = true;
                    AndroidUtilities.runOnUIThread(o0Var, 800L);
                }
                v0Var.f10425c.Y2.N(true);
                v0Var.b0();
                return;
            case 3:
                hg.f1 f1Var = (hg.f1) this.f4772b;
                if (!f1Var.d) {
                    f1Var.E = false;
                    f1Var.f10266y = editable.toString();
                    f1Var.U(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                md mdVar = (md) this.f4772b;
                if (mdVar.f5121f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mdVar.F(z10);
                return;
            case 6:
                cu cuVar = (cu) this.f4772b;
                i10 = cuVar.lineCount;
                if (i10 != cuVar.getLineCount()) {
                    z11 = cuVar.isInitLineCount;
                    if (!z11 && cuVar.getMeasuredWidth() > 0) {
                        i11 = cuVar.lineCount;
                        cuVar.onLineCountChanged(i11, cuVar.getLineCount());
                    }
                    cuVar.lineCount = cuVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((u1) this.f4772b).run();
                return;
            case 8:
                yy yyVar = (yy) this.f4772b;
                yyVar.g(false);
                jq jqVar = yyVar.d;
                String obj2 = jqVar.getText().toString();
                yyVar.c(obj2, true);
                xy xyVar = yyVar.f30717r;
                if (xyVar != null) {
                    xyVar.F1(null);
                    xyVar.G1(TextUtils.isEmpty(obj2), true);
                }
                yyVar.f(!TextUtils.isEmpty(obj2));
                if (jqVar != null) {
                    jqVar.clearAnimation();
                    jqVar.animate().translationX(0.0f).setInterpolator(rr.h).start();
                }
                yyVar.d(false);
                return;
            case 9:
                c20 c20Var = (c20) this.f4772b;
                if (!c20Var.F.isEmpty() && editable.length() > 0 && c20Var.I >= 0) {
                    c20Var.I = -1;
                    c20Var.f();
                }
                le.c cVar = c20Var.f23126a;
                if (!c20Var.f23130n && c20Var.f23131r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                cVar.a(z12, true);
                return;
            case 10:
                ce0 ce0Var = (ce0) this.f4772b;
                if (ce0Var.f23315r.length() == 4 && SharedConfig.passcodeType == 0) {
                    ce0Var.k(false);
                    return;
                }
                return;
            case 11:
                jn0 jn0Var = (jn0) this.f4772b;
                ImageView imageView2 = jn0Var.f25450c;
                h2 h2Var2 = jn0Var.e;
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
                jn0Var.a(h2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ic0(this, 29));
                return;
            case 13:
                xy0 xy0Var = (xy0) this.f4772b;
                vy0 vy0Var = xy0Var.f30422c;
                if (vy0Var != null && vy0Var.getVisibility() == 0) {
                    xy0Var.e();
                    return;
                }
                return;
            case 14:
                a71 a71Var = (a71) this.f4772b;
                String obj3 = a71Var.J.getText().toString();
                b71 b71Var = a71Var.K;
                if (b71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = b71Var.d.getAdapter().h();
                }
                b71Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (w0Var = b71Var.d) != null) {
                    s4.h0 adapter = w0Var.getAdapter();
                    vl0 vl0Var = b71Var.f22907f;
                    if (adapter != vl0Var) {
                        ai.w0 w0Var2 = b71Var.d;
                        w0Var2.Y1 = false;
                        w0Var2.Z1 = 0;
                        w0Var2.setAdapter(vl0Var);
                        ai.w0 w0Var3 = b71Var.d;
                        w0Var3.Y1 = true;
                        w0Var3.Z1 = 0;
                        if (h == 0) {
                            b71Var.J(0);
                        }
                    }
                }
                b71Var.v.setVisibility(0);
                return;
            case 15:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f4772b;
                ImageView imageView3 = l0Var.J;
                if (editable.length() > 0 && l0Var.T) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z14, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.i4 i4Var = l0Var.B0;
                String lowerCase = obj4.toLowerCase();
                ai.s1 s1Var = i4Var.V0;
                if (s1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    i4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    i4Var.E.clear();
                    i4Var.F = lowerCase;
                    i4Var.f34394u0[0].f35448c.f33803y.clear();
                    i4Var.d0(false);
                    if (i4Var.f34394u0[0].f()) {
                        if (i4Var.f34394u0[0].getWebView() != null) {
                            org.telegram.ui.web.y0 webView = i4Var.f34394u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(i4Var, 9);
                            webView.findAllAsync("");
                            i4Var.h0();
                        }
                    } else {
                        i4Var.f34394u0[0].f35447b.f1();
                        i4Var.W(0);
                    }
                    i4Var.W0 = -1;
                    return;
                }
                int i12 = i4Var.W0 + 1;
                i4Var.W0 = i12;
                if (i4Var.f34394u0[0].f()) {
                    i4Var.d0(true);
                    if (i4Var.f34394u0[0].getWebView() != null) {
                        org.telegram.ui.web.y0 webView2 = i4Var.f34394u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(i4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        i4Var.h0();
                        return;
                    }
                    return;
                }
                ai.s1 s1Var2 = new ai.s1(i4Var, lowerCase, i12, 22);
                i4Var.V0 = s1Var2;
                AndroidUtilities.runOnUIThread(s1Var2, 400L);
                return;
            case 16:
                qh.c cVar2 = (qh.c) this.f4772b;
                int length = cVar2.f42023a.getText().length();
                le.c cVar3 = cVar2.H;
                int i13 = cVar2.f42031x;
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
                cVar2.f42026f.l(Integer.toString(i13 - length), false);
                return;
            case 17:
                th.f fVar = (th.f) this.f4772b;
                fVar.J();
                fVar.f43531c0 = editable.toString();
                fVar.f43532d0.N(true);
                return;
            case 18:
                vg.k kVar = ((vg.l) this.f4772b).f44601c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    tg.a0 a0Var = ((tg.u) kVar).f43478a;
                    a0Var.f43357v0 = trim;
                    a0Var.a0(false, false);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            default:
                yh.g gVar = (yh.g) this.f4772b;
                yh.b bVar = gVar.f47399n0;
                TLRPC.TL_payments_starsRevenueStats h10 = yh.o.g(yh.g.d0(gVar)).h(gVar.f47384b, false);
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
        switch (this.f4771a) {
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
                ce0 ce0Var = (ce0) this.f4772b;
                LinkedList linkedList = ce0Var.N;
                LinkedList linkedList2 = ce0Var.M;
                Drawable drawable = ce0Var.f23310a;
                if (drawable instanceof mc0) {
                    mc0 mc0Var = (mc0) drawable;
                    mc0Var.D = null;
                    mc0Var.z();
                    float f7 = mc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        mc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        mc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            ce0Var.b(mc0Var);
                            return;
                        }
                        linkedList2.offer(new y0(this, z10, mc0Var, 22));
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
        switch (this.f4771a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f4772b;
                Editable text = searchView.F.getText();
                searchView.f2007o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2006n0 && !searchView.f2000g0 && isEmpty) {
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
