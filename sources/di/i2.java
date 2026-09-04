package di;

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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.zt;
public final class i2 implements TextWatcher {
    public final int f7364a;
    public final Object f7365b;

    public i2(Object obj, int i10) {
        this.f7364a = i10;
        this.f7365b = obj;
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
        bi.o0 o0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        switch (this.f7364a) {
            case 0:
                l2 l2Var = (l2) this.f7365b;
                ImageView imageView = l2Var.f7515n;
                h2 h2Var = l2Var.d;
                if (!l2Var.f7516r) {
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
                    k2 k2Var = l2Var.f7514f;
                    if (k2Var != null) {
                        k2Var.E1(null);
                        l2Var.f7514f.F1(TextUtils.isEmpty(obj), true);
                    }
                    if (h2Var != null) {
                        h2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = h2Var.animate().translationX(0.0f);
                        pr prVar = pr.h;
                        translationX.setInterpolator(prVar).start();
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
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new bi.oa(this, 19)).setInterpolator(prVar).setDuration(320L);
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
                ((gi.p) this.f7365b).Y();
                return;
            case 2:
                ig.u0 u0Var = (ig.u0) this.f7365b;
                u0Var.f12236x = false;
                ig.m0 m0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                if (TextUtils.isEmpty(u0Var.f12231f.getText())) {
                    u0Var.f12237y = null;
                    u0Var.d.b();
                } else {
                    u0Var.f12236x = true;
                    AndroidUtilities.runOnUIThread(m0Var, 800L);
                }
                u0Var.f12229c.Y2.N(true);
                u0Var.b0();
                return;
            case 3:
                ig.e1 e1Var = (ig.e1) this.f7365b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.f12051y = editable.toString();
                    e1Var.U(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                org.telegram.ui.Components.ld ldVar = (org.telegram.ui.Components.ld) this.f7365b;
                if (ldVar.f7593f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ldVar.F(z10);
                return;
            case 6:
                zt ztVar = (zt) this.f7365b;
                i10 = ztVar.lineCount;
                if (i10 != ztVar.getLineCount()) {
                    z11 = ztVar.isInitLineCount;
                    if (!z11 && ztVar.getMeasuredWidth() > 0) {
                        i11 = ztVar.lineCount;
                        ztVar.onLineCountChanged(i11, ztVar.getLineCount());
                    }
                    ztVar.lineCount = ztVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((u1) this.f7365b).run();
                return;
            case 8:
                xy xyVar = (xy) this.f7365b;
                xyVar.g(false);
                hq hqVar = xyVar.d;
                String obj2 = hqVar.getText().toString();
                xyVar.c(obj2, true);
                wy wyVar = xyVar.f32778r;
                if (wyVar != null) {
                    wyVar.E1(null);
                    wyVar.F1(TextUtils.isEmpty(obj2), true);
                }
                xyVar.f(!TextUtils.isEmpty(obj2));
                if (hqVar != null) {
                    hqVar.clearAnimation();
                    hqVar.animate().translationX(0.0f).setInterpolator(pr.h).start();
                }
                xyVar.d(false);
                return;
            case 9:
                b20 b20Var = (b20) this.f7365b;
                if (!b20Var.F.isEmpty() && editable.length() > 0 && b20Var.I >= 0) {
                    b20Var.I = -1;
                    b20Var.f();
                }
                le.b bVar = b20Var.f24516a;
                if (!b20Var.f24521n && b20Var.f24522r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 10:
                sd0 sd0Var = (sd0) this.f7365b;
                if (sd0Var.f30261r.length() == 4 && SharedConfig.passcodeType == 0) {
                    sd0Var.k(false);
                    return;
                }
                return;
            case 11:
                wm0 wm0Var = (wm0) this.f7365b;
                ImageView imageView2 = wm0Var.f32294c;
                h2 h2Var2 = wm0Var.f32295e;
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
                wm0Var.a(h2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new cc0(this, 28));
                return;
            case 13:
                my0 my0Var = (my0) this.f7365b;
                ky0 ky0Var = my0Var.f28559c;
                if (ky0Var != null && ky0Var.getVisibility() == 0) {
                    my0Var.e();
                    return;
                }
                return;
            case 14:
                n61 n61Var = (n61) this.f7365b;
                String obj3 = n61Var.J.getText().toString();
                o61 o61Var = n61Var.K;
                if (o61Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = o61Var.d.getAdapter().h();
                }
                o61Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (o0Var = o61Var.d) != null) {
                    s4.h0 adapter = o0Var.getAdapter();
                    kl0 kl0Var = o61Var.f28978f;
                    if (adapter != kl0Var) {
                        bi.o0 o0Var2 = o61Var.d;
                        o0Var2.Y1 = false;
                        o0Var2.Z1 = 0;
                        o0Var2.setAdapter(kl0Var);
                        bi.o0 o0Var3 = o61Var.d;
                        o0Var3.Y1 = true;
                        o0Var3.Z1 = 0;
                        if (h == 0) {
                            o61Var.J(0);
                        }
                    }
                }
                o61Var.v.setVisibility(0);
                return;
            case 15:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this.f7365b;
                ImageView imageView3 = k0Var.J;
                if (editable.length() > 0 && k0Var.T) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z14, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.i4 i4Var = k0Var.B0;
                String lowerCase = obj4.toLowerCase();
                ah.p pVar = i4Var.V0;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    i4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    i4Var.E.clear();
                    i4Var.F = lowerCase;
                    i4Var.f37232u0[0].f38552c.f36557y.clear();
                    i4Var.d0(false);
                    if (i4Var.f37232u0[0].f()) {
                        if (i4Var.f37232u0[0].getWebView() != null) {
                            org.telegram.ui.web.z0 webView = i4Var.f37232u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(i4Var, 9);
                            webView.findAllAsync("");
                            i4Var.h0();
                        }
                    } else {
                        i4Var.f37232u0[0].f38551b.e1();
                        i4Var.W(0);
                    }
                    i4Var.W0 = -1;
                    return;
                }
                int i12 = i4Var.W0 + 1;
                i4Var.W0 = i12;
                if (i4Var.f37232u0[0].f()) {
                    i4Var.d0(true);
                    if (i4Var.f37232u0[0].getWebView() != null) {
                        org.telegram.ui.web.z0 webView2 = i4Var.f37232u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(i4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        i4Var.h0();
                        return;
                    }
                    return;
                }
                ah.p pVar2 = new ah.p(i4Var, lowerCase, i12, 23);
                i4Var.V0 = pVar2;
                AndroidUtilities.runOnUIThread(pVar2, 400L);
                return;
            case 16:
                rh.c cVar = (rh.c) this.f7365b;
                int length = cVar.f45603a.getText().length();
                le.b bVar2 = cVar.H;
                int i13 = cVar.f45612x;
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
                cVar.f45607f.l(Integer.toString(i13 - length), false);
                return;
            case 17:
                uh.f fVar = (uh.f) this.f7365b;
                fVar.J();
                fVar.f47249c0 = editable.toString();
                fVar.f47250d0.N(true);
                return;
            case 18:
                wg.k kVar = ((wg.l) this.f7365b).f48534c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    ug.b0 b0Var = ((ug.v) kVar).f47216a;
                    b0Var.f47088v0 = trim;
                    b0Var.a0(false, false);
                    b0Var.a0(true, true);
                    return;
                }
                return;
            default:
                zh.g gVar = (zh.g) this.f7365b;
                zh.b bVar4 = gVar.f51919n0;
                TLRPC.TL_payments_starsRevenueStats h10 = zh.o.g(zh.g.d0(gVar)).h(gVar.f51903b, false);
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
                    gi.o oVar = gVar.Q;
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
        switch (this.f7364a) {
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
                sd0 sd0Var = (sd0) this.f7365b;
                LinkedList linkedList = sd0Var.N;
                LinkedList linkedList2 = sd0Var.M;
                Drawable drawable = sd0Var.f30255a;
                if (drawable instanceof dc0) {
                    dc0 dc0Var = (dc0) drawable;
                    dc0Var.D = null;
                    dc0Var.z();
                    float f7 = dc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        dc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        dc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            sd0Var.b(dc0Var);
                            return;
                        }
                        linkedList2.offer(new y0(this, z10, dc0Var, 21));
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
        switch (this.f7364a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f7365b;
                Editable text = searchView.F.getText();
                searchView.f999o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f998n0 && !searchView.f992g0 && isEmpty) {
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
