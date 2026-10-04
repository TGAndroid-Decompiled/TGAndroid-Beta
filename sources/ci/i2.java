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
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zy;
public final class i2 implements TextWatcher {
    public final int f5155a;
    public final Object f5156b;

    public i2(Object obj, int i10) {
        this.f5155a = i10;
        this.f5156b = obj;
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
        switch (this.f5155a) {
            case 0:
                l2 l2Var = (l2) this.f5156b;
                ImageView imageView = l2Var.f5484n;
                h2 h2Var = l2Var.d;
                if (!l2Var.f5485r) {
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
                    k2 k2Var = l2Var.f5483f;
                    if (k2Var != null) {
                        k2Var.H1(null);
                        l2Var.f5483f.I1(TextUtils.isEmpty(obj), true);
                    }
                    if (h2Var != null) {
                        h2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = h2Var.animate().translationX(0.0f);
                        tr trVar = tr.h;
                        translationX.setInterpolator(trVar).start();
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
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new androidx.fragment.app.a0(this, 13)).setInterpolator(trVar).setDuration(320L);
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
                ((fi.p) this.f5156b).X();
                return;
            case 2:
                hg.u0 u0Var = (hg.u0) this.f5156b;
                u0Var.f11357x = false;
                hg.n0 n0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(u0Var.f11352f.getText())) {
                    u0Var.f11358y = null;
                    u0Var.d.b();
                } else {
                    u0Var.f11357x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                u0Var.f11350c.f25245f3.N(true);
                u0Var.b0();
                return;
            case 3:
                hg.e1 e1Var = (hg.e1) this.f5156b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.f11174y = editable.toString();
                    e1Var.S(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                md mdVar = (md) this.f5156b;
                if (mdVar.f5517f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mdVar.F(z10);
                return;
            case 6:
                eu euVar = (eu) this.f5156b;
                i10 = euVar.lineCount;
                if (i10 != euVar.getLineCount()) {
                    z11 = euVar.isInitLineCount;
                    if (!z11 && euVar.getMeasuredWidth() > 0) {
                        i11 = euVar.lineCount;
                        euVar.onLineCountChanged(i11, euVar.getLineCount());
                    }
                    euVar.lineCount = euVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((u1) this.f5156b).run();
                return;
            case 8:
                az azVar = (az) this.f5156b;
                azVar.g(false);
                lq lqVar = azVar.d;
                String obj2 = lqVar.getText().toString();
                azVar.c(obj2, true);
                zy zyVar = azVar.f24718r;
                if (zyVar != null) {
                    zyVar.H1(null);
                    zyVar.I1(TextUtils.isEmpty(obj2), true);
                }
                azVar.f(!TextUtils.isEmpty(obj2));
                if (lqVar != null) {
                    lqVar.clearAnimation();
                    lqVar.animate().translationX(0.0f).setInterpolator(tr.h).start();
                }
                azVar.d(false);
                return;
            case 9:
                f20 f20Var = (f20) this.f5156b;
                if (!f20Var.F.isEmpty() && editable.length() > 0 && f20Var.I >= 0) {
                    f20Var.I = -1;
                    f20Var.f();
                }
                le.b bVar = f20Var.f26241a;
                if (!f20Var.f26246n && f20Var.f26247r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 10:
                ee0 ee0Var = (ee0) this.f5156b;
                if (ee0Var.f26058r.length() == 4 && SharedConfig.passcodeType == 0) {
                    ee0Var.k(false);
                    return;
                }
                return;
            case 11:
                pn0 pn0Var = (pn0) this.f5156b;
                ImageView imageView2 = pn0Var.f29671c;
                h2 h2Var2 = pn0Var.f29672e;
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
                pn0Var.a(h2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new lc0(this, 29));
                return;
            case 13:
                iz0 iz0Var = (iz0) this.f5156b;
                gz0 gz0Var = iz0Var.f27529c;
                if (gz0Var != null && gz0Var.getVisibility() == 0) {
                    iz0Var.e();
                    return;
                }
                return;
            case 14:
                m71 m71Var = (m71) this.f5156b;
                String obj3 = m71Var.J.getText().toString();
                n71 n71Var = m71Var.K;
                if (n71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = n71Var.d.getAdapter().h();
                }
                n71Var.E(obj3);
                if (TextUtils.isEmpty(obj3) && (w0Var = n71Var.d) != null) {
                    s4.h0 adapter = w0Var.getAdapter();
                    yl0 yl0Var = n71Var.f28891f;
                    if (adapter != yl0Var) {
                        ai.w0 w0Var2 = n71Var.d;
                        w0Var2.Y1 = false;
                        w0Var2.Z1 = 0;
                        w0Var2.setAdapter(yl0Var);
                        ai.w0 w0Var3 = n71Var.d;
                        w0Var3.Y1 = true;
                        w0Var3.Z1 = 0;
                        if (h == 0) {
                            n71Var.H(0);
                        }
                    }
                }
                n71Var.v.setVisibility(0);
                return;
            case 15:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f5156b;
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
                    i4Var.f37275u0[0].f38395c.f36494y.clear();
                    i4Var.d0(false);
                    if (i4Var.f37275u0[0].f()) {
                        if (i4Var.f37275u0[0].getWebView() != null) {
                            org.telegram.ui.web.z0 webView = i4Var.f37275u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(i4Var, 9);
                            webView.findAllAsync("");
                            i4Var.h0();
                        }
                    } else {
                        i4Var.f37275u0[0].f38394b.h1();
                        i4Var.W(0);
                    }
                    i4Var.W0 = -1;
                    return;
                }
                int i12 = i4Var.W0 + 1;
                i4Var.W0 = i12;
                if (i4Var.f37275u0[0].f()) {
                    i4Var.d0(true);
                    if (i4Var.f37275u0[0].getWebView() != null) {
                        org.telegram.ui.web.z0 webView2 = i4Var.f37275u0[0].getWebView();
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
                qh.c cVar = (qh.c) this.f5156b;
                int length = cVar.f45445a.getText().length();
                le.b bVar2 = cVar.H;
                int i13 = cVar.f45454x;
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
                cVar.f45449f.l(Integer.toString(i13 - length), false);
                return;
            case 17:
                th.f fVar = (th.f) this.f5156b;
                fVar.H();
                fVar.f47154c0 = editable.toString();
                fVar.f47155d0.N(true);
                return;
            case 18:
                vg.k kVar = ((vg.l) this.f5156b).f48305c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    tg.a0 a0Var = ((tg.u) kVar).f47100a;
                    a0Var.f46971v0 = trim;
                    a0Var.Z(false, false);
                    a0Var.Z(true, true);
                    return;
                }
                return;
            default:
                yh.g gVar = (yh.g) this.f5156b;
                yh.b bVar4 = gVar.f51316n0;
                TLRPC.TL_payments_starsRevenueStats h10 = yh.o.g(yh.g.d0(gVar)).h(gVar.f51300b, false);
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
        switch (this.f5155a) {
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
                ee0 ee0Var = (ee0) this.f5156b;
                LinkedList linkedList = ee0Var.N;
                LinkedList linkedList2 = ee0Var.M;
                Drawable drawable = ee0Var.f26052a;
                if (drawable instanceof pc0) {
                    pc0 pc0Var = (pc0) drawable;
                    pc0Var.D = null;
                    pc0Var.z();
                    float f7 = pc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        pc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        pc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            ee0Var.b(pc0Var);
                            return;
                        }
                        linkedList2.offer(new y0(this, z10, pc0Var, 22));
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
        switch (this.f5155a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f5156b;
                Editable text = searchView.F.getText();
                searchView.f2183o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2182n0 && !searchView.f2176g0 && isEmpty) {
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
