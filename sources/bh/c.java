package bh;

import ag.v0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import eg.c1;
import eg.s0;
import f2.p0;
import java.util.ArrayList;
import java.util.LinkedList;
import jh.b0;
import jh.e1;
import jh.r5;
import lh.m5;
import nh.c2;
import nh.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.d0;
import org.telegram.ui.m4;
import org.telegram.ui.o0;
import org.telegram.ui.web.w0;
import sf.h0;
import sf.l0;
public final class c implements TextWatcher {
    public final int f2648a;
    public final Object f2649b;

    public c(Object obj, int i10) {
        this.f2648a = i10;
        this.f2649b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        long j10;
        String str;
        float f9;
        long j11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        float f10;
        int h;
        e1 e1Var;
        boolean z16;
        switch (this.f2648a) {
            case 0:
                f fVar = (f) this.f2649b;
                int length = fVar.f2654a.getText().length();
                vd.a aVar = fVar.D;
                int i12 = fVar.f2663x;
                if (length > (i12 * 7) / 10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10, true);
                vd.a aVar2 = fVar.E;
                if (length > i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar2.a(z11, true);
                fVar.f2658f.l(Integer.toString(i12 - length), false);
                return;
            case 1:
                eh.f fVar2 = (eh.f) this.f2649b;
                fVar2.I();
                fVar2.Y = editable.toString();
                fVar2.Z.N(true);
                return;
            case 2:
                gg.l lVar = ((gg.m) this.f2649b).f7319c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    c1 c1Var = ((s0) lVar).f6124a;
                    c1Var.f5951r0 = trim;
                    c1Var.a0(false, false);
                    c1Var.a0(true, true);
                    return;
                }
                return;
            case 3:
                jh.q qVar = (jh.q) this.f2649b;
                jh.c cVar = qVar.f12645j0;
                TLRPC.TL_payments_starsRevenueStats h10 = b0.g(jh.q.d0(qVar)).h(qVar.f12633b, false);
                long j12 = 0;
                if (h10 == null) {
                    j10 = 0;
                } else {
                    j10 = h10.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                qVar.L = j12;
                boolean z17 = true;
                if (j12 > j10) {
                    qVar.L = j10;
                    qVar.J = true;
                    qVar.M.setText(Long.toString(j10));
                    jh.m mVar = qVar.M;
                    mVar.setSelection(mVar.getText().length());
                    qVar.J = false;
                }
                if (qVar.L != j10) {
                    z17 = false;
                }
                qVar.K = z17;
                AndroidUtilities.cancelRunOnUIThread(cVar);
                cVar.run();
                if (!qVar.J) {
                    qVar.K = false;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                d2 d2Var = (d2) this.f2649b;
                ImageView imageView = d2Var.f17525n;
                ig.f fVar3 = d2Var.d;
                if (!d2Var.f17526r) {
                    d2Var.d(false);
                    String obj = fVar3.getText().toString();
                    if (TextUtils.isEmpty(obj)) {
                        str = null;
                    } else {
                        str = obj;
                    }
                    Utilities.Callback2 callback2 = d2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    c2 c2Var = d2Var.f17524f;
                    if (c2Var != null) {
                        c2Var.F1(null);
                        d2Var.f17524f.G1(TextUtils.isEmpty(obj), true);
                    }
                    if (fVar3 != null) {
                        fVar3.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = fVar3.animate().translationX(0.0f);
                        jr jrVar = jr.h;
                        translationX.setInterpolator(jrVar).start();
                        if (imageView != null && d2Var.h != (!TextUtils.isEmpty(fVar3.getText()))) {
                            d2Var.h = !d2Var.h;
                            imageView.animate().cancel();
                            if (d2Var.h) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f12 = 0.7f;
                            if (d2Var.h) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f9);
                            if (d2Var.h) {
                                f12 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                            if (d2Var.h) {
                                f11 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new m5(this, 24)).setInterpolator(jrVar).setDuration(320L);
                            if (d2Var.h) {
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
            case 6:
                ed edVar = (ed) this.f2649b;
                if (edVar.f18076f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                edVar.F(z12);
                return;
            case 7:
                st stVar = (st) this.f2649b;
                i10 = stVar.lineCount;
                if (i10 != stVar.getLineCount()) {
                    z13 = stVar.isInitLineCount;
                    if (!z13 && stVar.getMeasuredWidth() > 0) {
                        i11 = stVar.lineCount;
                        stVar.onLineCountChanged(i11, stVar.getLineCount());
                    }
                    stVar.lineCount = stVar.getLineCount();
                    return;
                }
                return;
            case 8:
                ((eg.j) this.f2649b).run();
                return;
            case 9:
                ry ryVar = (ry) this.f2649b;
                ryVar.g(false);
                cq cqVar = ryVar.d;
                String obj2 = cqVar.getText().toString();
                ryVar.c(obj2, true);
                qy qyVar = ryVar.f32415r;
                if (qyVar != null) {
                    qyVar.F1(null);
                    qyVar.G1(TextUtils.isEmpty(obj2), true);
                }
                ryVar.f(!TextUtils.isEmpty(obj2));
                if (cqVar != null) {
                    cqVar.clearAnimation();
                    cqVar.animate().translationX(0.0f).setInterpolator(jr.h).start();
                }
                ryVar.d(false);
                return;
            case 10:
                x10 x10Var = (x10) this.f2649b;
                if (!x10Var.B.isEmpty() && editable.length() > 0 && x10Var.E >= 0) {
                    x10Var.E = -1;
                    x10Var.f();
                }
                vd.a aVar3 = x10Var.f34540a;
                if (!x10Var.f34545n && x10Var.f34546r.length() <= 0) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                aVar3.a(z14, true);
                return;
            case 11:
                nd0 nd0Var = (nd0) this.f2649b;
                if (nd0Var.f30966r.length() == 4 && SharedConfig.passcodeType == 0) {
                    nd0Var.k(false);
                    return;
                }
                return;
            case 12:
                um0 um0Var = (um0) this.f2649b;
                ImageView imageView2 = um0Var.f33272c;
                ig.f fVar4 = um0Var.f33273e;
                boolean z18 = false;
                if (fVar4.length() > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                float f13 = 0.0f;
                if (imageView2.getAlpha() != 0.0f) {
                    z18 = true;
                }
                if (z15 != z18) {
                    ViewPropertyAnimator animate2 = imageView2.animate();
                    float f14 = 1.0f;
                    if (z15) {
                        f13 = 1.0f;
                    }
                    ViewPropertyAnimator duration2 = animate2.alpha(f13).setDuration(150L);
                    if (z15) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX2 = duration2.scaleX(f10);
                    if (!z15) {
                        f14 = 0.1f;
                    }
                    scaleX2.scaleY(f14).start();
                }
                um0Var.a(fVar4.getText().toString());
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new xb0(this, 28));
                return;
            case 14:
                fy0 fy0Var = (fy0) this.f2649b;
                dy0 dy0Var = fy0Var.f28565c;
                if (dy0Var != null && dy0Var.getVisibility() == 0) {
                    fy0Var.e();
                    return;
                }
                return;
            case 15:
                e61 e61Var = (e61) this.f2649b;
                String obj3 = e61Var.F.getText().toString();
                f61 f61Var = e61Var.G;
                if (f61Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = f61Var.d.getAdapter().h();
                }
                f61Var.F(obj3);
                if (TextUtils.isEmpty(obj3) && (e1Var = f61Var.d) != null) {
                    p0 adapter = e1Var.getAdapter();
                    il0 il0Var = f61Var.f28331f;
                    if (adapter != il0Var) {
                        e1 e1Var2 = f61Var.d;
                        e1Var2.U1 = false;
                        e1Var2.V1 = 0;
                        e1Var2.setAdapter(il0Var);
                        e1 e1Var3 = f61Var.d;
                        e1Var3.U1 = true;
                        e1Var3.V1 = 0;
                        if (h == 0) {
                            f61Var.I(0);
                        }
                    }
                }
                f61Var.v.setVisibility(0);
                return;
            case 16:
                o0 o0Var = (o0) this.f2649b;
                ImageView imageView3 = o0Var.F;
                if (editable.length() > 0 && o0Var.P) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z16, true, true);
                String obj4 = editable.toString();
                m4 m4Var = o0Var.f40944x0;
                String lowerCase = obj4.toLowerCase();
                v0 v0Var = m4Var.R0;
                if (v0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(v0Var);
                    m4Var.R0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    m4Var.A.clear();
                    m4Var.B = lowerCase;
                    m4Var.f40404q0[0].f41514c.f39748y.clear();
                    m4Var.d0(false);
                    if (m4Var.f40404q0[0].f()) {
                        if (m4Var.f40404q0[0].getWebView() != null) {
                            w0 webView = m4Var.f40404q0[0].getWebView();
                            webView.E = new d0(m4Var, 9);
                            webView.findAllAsync("");
                            m4Var.h0();
                        }
                    } else {
                        m4Var.f40404q0[0].f41513b.f1();
                        m4Var.W(0);
                    }
                    m4Var.S0 = -1;
                    return;
                }
                int i13 = m4Var.S0 + 1;
                m4Var.S0 = i13;
                if (m4Var.f40404q0[0].f()) {
                    m4Var.d0(true);
                    if (m4Var.f40404q0[0].getWebView() != null) {
                        w0 webView2 = m4Var.f40404q0[0].getWebView();
                        webView2.E = new d0(m4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        m4Var.h0();
                        return;
                    }
                    return;
                }
                v0 v0Var2 = new v0(m4Var, lowerCase, i13, 22);
                m4Var.R0 = v0Var2;
                AndroidUtilities.runOnUIThread(v0Var2, 400L);
                return;
            case 17:
                ((qh.n) this.f2649b).Y();
                return;
            case 18:
                l0 l0Var = (l0) this.f2649b;
                l0Var.f47869x = false;
                h0 h0Var = l0Var.B;
                AndroidUtilities.cancelRunOnUIThread(h0Var);
                if (TextUtils.isEmpty(l0Var.f47864f.getText())) {
                    l0Var.f47870y = null;
                    l0Var.d.b();
                } else {
                    l0Var.f47869x = true;
                    AndroidUtilities.runOnUIThread(h0Var, 800L);
                }
                l0Var.f47862c.U2.N(true);
                l0Var.b0();
                return;
            default:
                sf.v0 v0Var3 = (sf.v0) this.f2649b;
                if (!v0Var3.d) {
                    v0Var3.A = false;
                    v0Var3.f47979y = editable.toString();
                    v0Var3.U(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f2648a) {
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
                nd0 nd0Var = (nd0) this.f2649b;
                LinkedList linkedList = nd0Var.J;
                LinkedList linkedList2 = nd0Var.I;
                Drawable drawable = nd0Var.f30960a;
                if (drawable instanceof yb0) {
                    yb0 yb0Var = (yb0) drawable;
                    yb0Var.D = null;
                    yb0Var.z();
                    float f9 = yb0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        yb0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        yb0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f9 >= 1.0f) {
                            nd0Var.b(yb0Var);
                            return;
                        }
                        linkedList2.offer(new r5(this, z10, yb0Var, 19));
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
        switch (this.f2648a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f2649b;
                Editable text = searchView.B.getText();
                searchView.f994k0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f993j0 && !searchView.f986c0 && isEmpty) {
                    searchView.G.setVisibility(8);
                    i13 = 0;
                }
                searchView.I.setVisibility(i13);
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
