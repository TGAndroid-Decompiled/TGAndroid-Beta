package eh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import f2.p0;
import hg.b1;
import hg.r0;
import java.util.ArrayList;
import java.util.LinkedList;
import mh.a0;
import mh.d1;
import mh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.c0;
import org.telegram.ui.l4;
import org.telegram.ui.m0;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.x0;
import qh.r1;
import qh.s1;
import vf.h0;
import vf.l0;
import vf.v0;
public final class c implements TextWatcher {
    public final int f5617a;
    public final Object f5618b;

    public c(Object obj, int i10) {
        this.f5617a = i10;
        this.f5618b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        boolean z10;
        long j10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        float f10;
        int h;
        d1 d1Var;
        boolean z15;
        String str;
        float f11;
        long j11;
        switch (this.f5617a) {
            case 0:
                f fVar = (f) this.f5618b;
                int length = fVar.f5623a.getText().length();
                xd.a aVar = fVar.E;
                int i12 = fVar.f5632x;
                if (length > (i12 * 7) / 10) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                aVar.a(z4, true);
                xd.a aVar2 = fVar.F;
                if (length > i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar2.a(z10, true);
                fVar.f5627f.l(Integer.toString(i12 - length), false);
                return;
            case 1:
                hh.f fVar2 = (hh.f) this.f5618b;
                fVar2.I();
                fVar2.Z = editable.toString();
                fVar2.f7699a0.N(true);
                return;
            case 2:
                jg.l lVar = ((jg.m) this.f5618b).f10049c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    b1 b1Var = ((r0) lVar).f7593a;
                    b1Var.f7419s0 = trim;
                    b1Var.a0(false, false);
                    b1Var.a0(true, true);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                mh.p pVar = (mh.p) this.f5618b;
                mh.c cVar = pVar.f14567k0;
                TLRPC.TL_payments_starsRevenueStats h9 = a0.g(mh.p.d0(pVar)).h(pVar.f14554b, false);
                long j12 = 0;
                if (h9 == null) {
                    j10 = 0;
                } else {
                    j10 = h9.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                pVar.M = j12;
                boolean z16 = true;
                if (j12 > j10) {
                    pVar.M = j10;
                    pVar.K = true;
                    pVar.N.setText(Long.toString(j10));
                    mh.m mVar = pVar.N;
                    mVar.setSelection(mVar.getText().length());
                    pVar.K = false;
                }
                if (pVar.M != j10) {
                    z16 = false;
                }
                pVar.L = z16;
                AndroidUtilities.cancelRunOnUIThread(cVar);
                cVar.run();
                if (!pVar.K) {
                    pVar.L = false;
                    return;
                }
                return;
            case 5:
                bd bdVar = (bd) this.f5618b;
                if (bdVar.f45517f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bdVar.F(z11);
                return;
            case 6:
                xt xtVar = (xt) this.f5618b;
                i10 = xtVar.lineCount;
                if (i10 != xtVar.getLineCount()) {
                    z12 = xtVar.isInitLineCount;
                    if (!z12 && xtVar.getMeasuredWidth() > 0) {
                        i11 = xtVar.lineCount;
                        xtVar.onLineCountChanged(i11, xtVar.getLineCount());
                    }
                    xtVar.lineCount = xtVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((hg.j) this.f5618b).run();
                return;
            case 8:
                yy yyVar = (yy) this.f5618b;
                yyVar.g(false);
                iq iqVar = yyVar.d;
                String obj = iqVar.getText().toString();
                yyVar.c(obj, true);
                xy xyVar = yyVar.f33646r;
                if (xyVar != null) {
                    xyVar.F1(null);
                    xyVar.G1(TextUtils.isEmpty(obj), true);
                }
                yyVar.f(!TextUtils.isEmpty(obj));
                if (iqVar != null) {
                    iqVar.clearAnimation();
                    iqVar.animate().translationX(0.0f).setInterpolator(pr.h).start();
                }
                yyVar.d(false);
                return;
            case 9:
                d20 d20Var = (d20) this.f5618b;
                if (!d20Var.C.isEmpty() && editable.length() > 0 && d20Var.F >= 0) {
                    d20Var.F = -1;
                    d20Var.f();
                }
                xd.a aVar3 = d20Var.f26166a;
                if (!d20Var.f26171n && d20Var.f26172r.length() <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                aVar3.a(z13, true);
                return;
            case 10:
                xd0 xd0Var = (xd0) this.f5618b;
                if (xd0Var.f33048r.length() == 4 && SharedConfig.passcodeType == 0) {
                    xd0Var.k(false);
                    return;
                }
                return;
            case 11:
                fn0 fn0Var = (fn0) this.f5618b;
                ImageView imageView = fn0Var.f26965c;
                lg.f fVar3 = fn0Var.f26966e;
                boolean z17 = false;
                if (fVar3.length() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                float f12 = 0.0f;
                if (imageView.getAlpha() != 0.0f) {
                    z17 = true;
                }
                if (z14 != z17) {
                    ViewPropertyAnimator animate = imageView.animate();
                    float f13 = 1.0f;
                    if (z14) {
                        f12 = 1.0f;
                    }
                    ViewPropertyAnimator duration = animate.alpha(f12).setDuration(150L);
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = duration.scaleX(f10);
                    if (!z14) {
                        f13 = 0.1f;
                    }
                    scaleX.scaleY(f13).start();
                }
                fn0Var.a(fVar3.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ec0(this, 28));
                return;
            case 13:
                ry0 ry0Var = (ry0) this.f5618b;
                py0 py0Var = ry0Var.f30900c;
                if (py0Var != null && py0Var.getVisibility() == 0) {
                    ry0Var.e();
                    return;
                }
                return;
            case 14:
                r61 r61Var = (r61) this.f5618b;
                String obj2 = r61Var.G.getText().toString();
                s61 s61Var = r61Var.H;
                if (s61Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = s61Var.d.getAdapter().h();
                }
                s61Var.F(obj2);
                if (TextUtils.isEmpty(obj2) && (d1Var = s61Var.d) != null) {
                    p0 adapter = d1Var.getAdapter();
                    sl0 sl0Var = s61Var.f30990f;
                    if (adapter != sl0Var) {
                        d1 d1Var2 = s61Var.d;
                        d1Var2.V1 = false;
                        d1Var2.W1 = 0;
                        d1Var2.setAdapter(sl0Var);
                        d1 d1Var3 = s61Var.d;
                        d1Var3.V1 = true;
                        d1Var3.W1 = 0;
                        if (h == 0) {
                            s61Var.I(0);
                        }
                    }
                }
                s61Var.v.setVisibility(0);
                return;
            case 15:
                m0 m0Var = (m0) this.f5618b;
                ImageView imageView2 = m0Var.G;
                if (editable.length() > 0 && m0Var.Q) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AndroidUtilities.updateViewShow(imageView2, z15, true, true);
                String obj3 = editable.toString();
                l4 l4Var = m0Var.f38927y0;
                String lowerCase = obj3.toLowerCase();
                bh.a aVar4 = l4Var.S0;
                if (aVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(aVar4);
                    l4Var.S0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    l4Var.B.clear();
                    l4Var.C = lowerCase;
                    l4Var.f38619r0[0].f39905c.f38016y.clear();
                    l4Var.d0(false);
                    if (l4Var.f38619r0[0].f()) {
                        if (l4Var.f38619r0[0].getWebView() != null) {
                            x0 webView = l4Var.f38619r0[0].getWebView();
                            webView.F = new c0(l4Var, 9);
                            webView.findAllAsync("");
                            l4Var.h0();
                        }
                    } else {
                        l4Var.f38619r0[0].f39904b.f1();
                        l4Var.W(0);
                    }
                    l4Var.T0 = -1;
                    return;
                }
                int i13 = l4Var.T0 + 1;
                l4Var.T0 = i13;
                if (l4Var.f38619r0[0].f()) {
                    l4Var.d0(true);
                    if (l4Var.f38619r0[0].getWebView() != null) {
                        x0 webView2 = l4Var.f38619r0[0].getWebView();
                        webView2.F = new c0(l4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        l4Var.h0();
                        return;
                    }
                    return;
                }
                bh.a aVar5 = new bh.a(l4Var, lowerCase, i13, 20);
                l4Var.S0 = aVar5;
                AndroidUtilities.runOnUIThread(aVar5, 400L);
                return;
            case 16:
                s1 s1Var = (s1) this.f5618b;
                ImageView imageView3 = s1Var.f46032n;
                lg.f fVar4 = s1Var.d;
                if (!s1Var.f46033r) {
                    s1Var.d(false);
                    String obj4 = fVar4.getText().toString();
                    if (TextUtils.isEmpty(obj4)) {
                        str = null;
                    } else {
                        str = obj4;
                    }
                    Utilities.Callback2 callback2 = s1Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    r1 r1Var = s1Var.f46031f;
                    if (r1Var != null) {
                        r1Var.F1(null);
                        s1Var.f46031f.G1(TextUtils.isEmpty(obj4), true);
                    }
                    if (fVar4 != null) {
                        fVar4.animate().cancel();
                        float f14 = 0.0f;
                        ViewPropertyAnimator translationX = fVar4.animate().translationX(0.0f);
                        pr prVar = pr.h;
                        translationX.setInterpolator(prVar).start();
                        if (imageView3 != null && s1Var.h != (!TextUtils.isEmpty(fVar4.getText()))) {
                            s1Var.h = !s1Var.h;
                            imageView3.animate().cancel();
                            if (s1Var.h) {
                                imageView3.setVisibility(0);
                            }
                            ViewPropertyAnimator animate2 = imageView3.animate();
                            float f15 = 0.7f;
                            if (s1Var.h) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX2 = animate2.scaleX(f11);
                            if (s1Var.h) {
                                f15 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX2.scaleY(f15);
                            if (s1Var.h) {
                                f14 = 1.0f;
                            }
                            ViewPropertyAnimator duration2 = scaleY.alpha(f14).withEndAction(new s0(this, 16)).setInterpolator(prVar).setDuration(320L);
                            if (s1Var.h) {
                                j11 = 240;
                            } else {
                                j11 = 0;
                            }
                            duration2.setStartDelay(j11).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((th.n) this.f5618b).Y();
                return;
            case 18:
                l0 l0Var = (l0) this.f5618b;
                l0Var.f49118x = false;
                h0 h0Var = l0Var.C;
                AndroidUtilities.cancelRunOnUIThread(h0Var);
                if (TextUtils.isEmpty(l0Var.f49113f.getText())) {
                    l0Var.f49119y = null;
                    l0Var.d.b();
                } else {
                    l0Var.f49118x = true;
                    AndroidUtilities.runOnUIThread(h0Var, 800L);
                }
                l0Var.f49111c.V2.N(true);
                l0Var.b0();
                return;
            default:
                v0 v0Var = (v0) this.f5618b;
                if (!v0Var.d) {
                    v0Var.B = false;
                    v0Var.f49228y = editable.toString();
                    v0Var.U(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4;
        switch (this.f5617a) {
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
                xd0 xd0Var = (xd0) this.f5618b;
                LinkedList linkedList = xd0Var.K;
                LinkedList linkedList2 = xd0Var.J;
                Drawable drawable = xd0Var.f33042a;
                if (drawable instanceof fc0) {
                    fc0 fc0Var = (fc0) drawable;
                    fc0Var.D = null;
                    fc0Var.z();
                    float f10 = fc0Var.h;
                    int i13 = 0;
                    boolean z10 = true;
                    if (i11 == 0 && i12 == 1) {
                        fc0Var.x(true);
                        z4 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        fc0Var.y();
                        z4 = false;
                    } else {
                        z4 = false;
                        z10 = false;
                    }
                    if (z10) {
                        if (f10 >= 1.0f) {
                            xd0Var.b(fc0Var);
                            return;
                        }
                        linkedList2.offer(new r5(this, z4, fc0Var, 17));
                        linkedList.offer(Boolean.valueOf(z4));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i14 = 0; i14 < linkedList2.size(); i14++) {
                            Runnable runnable = (Runnable) linkedList2.get(i14);
                            if (((Boolean) linkedList.get(i14)).booleanValue() != z4) {
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
        switch (this.f5617a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                SearchView searchView = (SearchView) this.f5618b;
                Editable text = searchView.C.getText();
                searchView.f470l0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f469k0 && !searchView.f462d0 && isEmpty) {
                    searchView.H.setVisibility(8);
                    i13 = 0;
                }
                searchView.J.setVisibility(i13);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
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
