package dh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import f2.o0;
import gg.b1;
import gg.r0;
import java.util.ArrayList;
import java.util.LinkedList;
import lh.b0;
import lh.e1;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wy;
import org.telegram.ui.c0;
import org.telegram.ui.l4;
import org.telegram.ui.m0;
import org.telegram.ui.web.w0;
import ph.r1;
import ph.s1;
import uf.g0;
import uf.k0;
import uf.u0;
public final class c implements TextWatcher {
    public final int f4885a;
    public final Object f4886b;

    public c(Object obj, int i10) {
        this.f4885a = i10;
        this.f4886b = obj;
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
        e1 e1Var;
        boolean z15;
        String str;
        float f11;
        long j11;
        switch (this.f4885a) {
            case 0:
                f fVar = (f) this.f4886b;
                int length = fVar.f4891a.getText().length();
                xd.a aVar = fVar.E;
                int i12 = fVar.f4899x;
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
                fVar.f4894f.l(Integer.toString(i12 - length), false);
                return;
            case 1:
                gh.f fVar2 = (gh.f) this.f4886b;
                fVar2.I();
                fVar2.Z = editable.toString();
                fVar2.f6839a0.N(true);
                return;
            case 2:
                ig.l lVar = ((ig.m) this.f4886b).f7528c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    b1 b1Var = ((r0) lVar).f6740a;
                    b1Var.f6580s0 = trim;
                    b1Var.a0(false, false);
                    b1Var.a0(true, true);
                    return;
                }
                return;
            case 3:
                lh.q qVar = (lh.q) this.f4886b;
                lh.d dVar = qVar.f12959k0;
                TLRPC.TL_payments_starsRevenueStats h9 = b0.g(lh.q.d0(qVar)).h(qVar.f12947b, false);
                long j12 = 0;
                if (h9 == null) {
                    j10 = 0;
                } else {
                    j10 = h9.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                qVar.M = j12;
                boolean z16 = true;
                if (j12 > j10) {
                    qVar.M = j10;
                    qVar.K = true;
                    qVar.N.setText(Long.toString(j10));
                    lh.n nVar = qVar.N;
                    nVar.setSelection(nVar.getText().length());
                    qVar.K = false;
                }
                if (qVar.M != j10) {
                    z16 = false;
                }
                qVar.L = z16;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                dVar.run();
                if (!qVar.K) {
                    qVar.L = false;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                bd bdVar = (bd) this.f4886b;
                if (bdVar.f41809f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bdVar.F(z11);
                return;
            case 6:
                vt vtVar = (vt) this.f4886b;
                i10 = vtVar.lineCount;
                if (i10 != vtVar.getLineCount()) {
                    z12 = vtVar.isInitLineCount;
                    if (!z12 && vtVar.getMeasuredWidth() > 0) {
                        i11 = vtVar.lineCount;
                        vtVar.onLineCountChanged(i11, vtVar.getLineCount());
                    }
                    vtVar.lineCount = vtVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((gg.j) this.f4886b).run();
                return;
            case 8:
                wy wyVar = (wy) this.f4886b;
                wyVar.g(false);
                gq gqVar = wyVar.d;
                String obj = gqVar.getText().toString();
                wyVar.c(obj, true);
                vy vyVar = wyVar.f30441r;
                if (vyVar != null) {
                    vyVar.F1(null);
                    vyVar.G1(TextUtils.isEmpty(obj), true);
                }
                wyVar.f(!TextUtils.isEmpty(obj));
                if (gqVar != null) {
                    gqVar.clearAnimation();
                    gqVar.animate().translationX(0.0f).setInterpolator(nr.h).start();
                }
                wyVar.d(false);
                return;
            case 9:
                c20 c20Var = (c20) this.f4886b;
                if (!c20Var.C.isEmpty() && editable.length() > 0 && c20Var.F >= 0) {
                    c20Var.F = -1;
                    c20Var.f();
                }
                xd.a aVar3 = c20Var.f23810a;
                if (!c20Var.f23814n && c20Var.f23815r.length() <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                aVar3.a(z13, true);
                return;
            case 10:
                vd0 vd0Var = (vd0) this.f4886b;
                if (vd0Var.f29438r.length() == 4 && SharedConfig.passcodeType == 0) {
                    vd0Var.k(false);
                    return;
                }
                return;
            case 11:
                en0 en0Var = (en0) this.f4886b;
                ImageView imageView = en0Var.f24618c;
                kg.f fVar3 = en0Var.e;
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
                en0Var.a(fVar3.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new cc0(this, 28));
                return;
            case 13:
                qy0 qy0Var = (qy0) this.f4886b;
                oy0 oy0Var = qy0Var.f28306c;
                if (oy0Var != null && oy0Var.getVisibility() == 0) {
                    qy0Var.e();
                    return;
                }
                return;
            case 14:
                p61 p61Var = (p61) this.f4886b;
                String obj2 = p61Var.G.getText().toString();
                q61 q61Var = p61Var.H;
                if (q61Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = q61Var.d.getAdapter().h();
                }
                q61Var.F(obj2);
                if (TextUtils.isEmpty(obj2) && (e1Var = q61Var.d) != null) {
                    o0 adapter = e1Var.getAdapter();
                    rl0 rl0Var = q61Var.f28068f;
                    if (adapter != rl0Var) {
                        e1 e1Var2 = q61Var.d;
                        e1Var2.V1 = false;
                        e1Var2.W1 = 0;
                        e1Var2.setAdapter(rl0Var);
                        e1 e1Var3 = q61Var.d;
                        e1Var3.V1 = true;
                        e1Var3.W1 = 0;
                        if (h == 0) {
                            q61Var.I(0);
                        }
                    }
                }
                q61Var.v.setVisibility(0);
                return;
            case 15:
                m0 m0Var = (m0) this.f4886b;
                ImageView imageView2 = m0Var.G;
                if (editable.length() > 0 && m0Var.Q) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AndroidUtilities.updateViewShow(imageView2, z15, true, true);
                String obj3 = editable.toString();
                l4 l4Var = m0Var.f36159y0;
                String lowerCase = obj3.toLowerCase();
                ah.a aVar4 = l4Var.S0;
                if (aVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(aVar4);
                    l4Var.S0 = null;
                }
                if (TextUtils.isEmpty(lowerCase)) {
                    l4Var.B.clear();
                    l4Var.C = lowerCase;
                    l4Var.f35945r0[0].f37160c.f35230y.clear();
                    l4Var.d0(false);
                    if (l4Var.f35945r0[0].f()) {
                        if (l4Var.f35945r0[0].getWebView() != null) {
                            w0 webView = l4Var.f35945r0[0].getWebView();
                            webView.F = new c0(l4Var, 9);
                            webView.findAllAsync("");
                            l4Var.h0();
                        }
                    } else {
                        l4Var.f35945r0[0].f37159b.f1();
                        l4Var.W(0);
                    }
                    l4Var.T0 = -1;
                    return;
                }
                int i13 = l4Var.T0 + 1;
                l4Var.T0 = i13;
                if (l4Var.f35945r0[0].f()) {
                    l4Var.d0(true);
                    if (l4Var.f35945r0[0].getWebView() != null) {
                        w0 webView2 = l4Var.f35945r0[0].getWebView();
                        webView2.F = new c0(l4Var, 9);
                        webView2.findAllAsync(lowerCase);
                        l4Var.h0();
                        return;
                    }
                    return;
                }
                ah.a aVar5 = new ah.a(l4Var, lowerCase, i13, 20);
                l4Var.S0 = aVar5;
                AndroidUtilities.runOnUIThread(aVar5, 400L);
                return;
            case 16:
                s1 s1Var = (s1) this.f4886b;
                ImageView imageView3 = s1Var.f42300n;
                kg.f fVar4 = s1Var.d;
                if (!s1Var.f42301r) {
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
                    r1 r1Var = s1Var.f42299f;
                    if (r1Var != null) {
                        r1Var.F1(null);
                        s1Var.f42299f.G1(TextUtils.isEmpty(obj4), true);
                    }
                    if (fVar4 != null) {
                        fVar4.animate().cancel();
                        float f14 = 0.0f;
                        ViewPropertyAnimator translationX = fVar4.animate().translationX(0.0f);
                        nr nrVar = nr.h;
                        translationX.setInterpolator(nrVar).start();
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
                            ViewPropertyAnimator duration2 = scaleY.alpha(f14).withEndAction(new org.telegram.ui.web.o0(this, 15)).setInterpolator(nrVar).setDuration(320L);
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
                ((sh.n) this.f4886b).Y();
                return;
            case 18:
                k0 k0Var = (k0) this.f4886b;
                k0Var.f45358x = false;
                g0 g0Var = k0Var.C;
                AndroidUtilities.cancelRunOnUIThread(g0Var);
                if (TextUtils.isEmpty(k0Var.f45353f.getText())) {
                    k0Var.f45359y = null;
                    k0Var.d.b();
                } else {
                    k0Var.f45358x = true;
                    AndroidUtilities.runOnUIThread(g0Var, 800L);
                }
                k0Var.f45352c.V2.N(true);
                k0Var.b0();
                return;
            default:
                u0 u0Var = (u0) this.f4886b;
                if (!u0Var.d) {
                    u0Var.B = false;
                    u0Var.f45454y = editable.toString();
                    u0Var.U(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4;
        switch (this.f4885a) {
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
                vd0 vd0Var = (vd0) this.f4886b;
                LinkedList linkedList = vd0Var.K;
                LinkedList linkedList2 = vd0Var.J;
                Drawable drawable = vd0Var.f29433a;
                if (drawable instanceof dc0) {
                    dc0 dc0Var = (dc0) drawable;
                    dc0Var.D = null;
                    dc0Var.z();
                    float f10 = dc0Var.h;
                    int i13 = 0;
                    boolean z10 = true;
                    if (i11 == 0 && i12 == 1) {
                        dc0Var.x(true);
                        z4 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        dc0Var.y();
                        z4 = false;
                    } else {
                        z4 = false;
                        z10 = false;
                    }
                    if (z10) {
                        if (f10 >= 1.0f) {
                            vd0Var.b(dc0Var);
                            return;
                        }
                        linkedList2.offer(new r5(this, z4, dc0Var, 17));
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
        switch (this.f4885a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f4886b;
                Editable text = searchView.C.getText();
                searchView.f425l0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f424k0 && !searchView.f417d0 && isEmpty) {
                    searchView.H.setVisibility(8);
                    i13 = 0;
                }
                searchView.J.setVisibility(i13);
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
