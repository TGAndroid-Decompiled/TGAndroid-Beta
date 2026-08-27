package ch;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import cg.d1;
import cg.j;
import cg.s0;
import eg.l;
import eg.m;
import f2.q0;
import hh.c0;
import hh.f1;
import hh.o;
import hh.r;
import hh.t5;
import java.util.ArrayList;
import java.util.LinkedList;
import lh.d2;
import lh.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.d0;
import org.telegram.ui.m4;
import org.telegram.ui.o0;
import org.telegram.ui.web.w0;
import qf.i0;
import qf.m0;

public final class e implements TextWatcher {

    public final int f2909a;

    public final Object f2910b;

    public e(Object obj, int i10) {
        this.f2909a = i10;
        this.f2910b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f1 f1Var;
        switch (this.f2909a) {
            case 0:
                h hVar = (h) this.f2910b;
                hVar.J();
                hVar.Y = editable.toString();
                hVar.Z.N(true);
                break;
            case 1:
                l lVar = ((m) this.f2910b).f5426c;
                if (lVar != null) {
                    String strTrim = editable.toString().trim();
                    d1 d1Var = ((s0) lVar).f2816a;
                    d1Var.f2650r0 = strTrim;
                    d1Var.a0(false, false);
                    d1Var.a0(true, true);
                }
                break;
            case 2:
                r rVar = (r) this.f2910b;
                hh.c cVar = rVar.f9963j0;
                TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = c0.g(((n2) rVar).currentAccount).h(rVar.f9951b, false);
                long j10 = tL_payments_starsRevenueStatsH == null ? 0L : tL_payments_starsRevenueStatsH.status.available_balance.amount;
                long j11 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                rVar.L = j11;
                if (j11 > j10) {
                    rVar.L = j10;
                    rVar.J = true;
                    rVar.M.setText(Long.toString(j10));
                    o oVar = rVar.M;
                    oVar.setSelection(oVar.getText().length());
                    rVar.J = false;
                }
                rVar.K = rVar.L == j10;
                AndroidUtilities.cancelRunOnUIThread(cVar);
                cVar.run();
                if (!rVar.J) {
                    rVar.K = false;
                    break;
                }
                break;
            case 3:
                e2 e2Var = (e2) this.f2910b;
                ImageView imageView = e2Var.f15924n;
                gg.g gVar = e2Var.d;
                if (!e2Var.f15925r) {
                    e2Var.d(false);
                    String string = gVar.getText().toString();
                    String str = TextUtils.isEmpty(string) ? null : string;
                    Utilities.Callback2 callback2 = e2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    d2 d2Var = e2Var.f15923f;
                    if (d2Var != null) {
                        d2Var.F1(null);
                        e2Var.f15923f.G1(TextUtils.isEmpty(string), true);
                    }
                    if (gVar != null) {
                        gVar.animate().cancel();
                        ViewPropertyAnimator viewPropertyAnimatorTranslationX = gVar.animate().translationX(0.0f);
                        er erVar = er.h;
                        viewPropertyAnimatorTranslationX.setInterpolator(erVar).start();
                        if (imageView != null && e2Var.h != (!TextUtils.isEmpty(gVar.getText()))) {
                            e2Var.h = !e2Var.h;
                            imageView.animate().cancel();
                            if (e2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(e2Var.h ? 1.0f : 0.7f).scaleY(e2Var.h ? 1.0f : 0.7f).alpha(e2Var.h ? 1.0f : 0.0f).withEndAction(new kh.c(this, 10)).setInterpolator(erVar).setDuration(320L).setStartDelay(e2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 4:
                break;
            case 5:
                ((oh.o) this.f2910b).Y();
                break;
            case 6:
                xc xcVar = (xc) this.f2910b;
                xcVar.F((xcVar.f16338f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 7:
                lt ltVar = (lt) this.f2910b;
                if (ltVar.lineCount != ltVar.getLineCount()) {
                    if (!ltVar.isInitLineCount && ltVar.getMeasuredWidth() > 0) {
                        ltVar.onLineCountChanged(ltVar.lineCount, ltVar.getLineCount());
                    }
                    ltVar.lineCount = ltVar.getLineCount();
                }
                break;
            case 8:
                ((j) this.f2910b).run();
                break;
            case 9:
                ky kyVar = (ky) this.f2910b;
                kyVar.g(false);
                wp wpVar = kyVar.d;
                String string2 = wpVar.getText().toString();
                kyVar.c(string2, true);
                jy jyVar = kyVar.f30218r;
                if (jyVar != null) {
                    jyVar.F1(null);
                    jyVar.G1(TextUtils.isEmpty(string2), true);
                }
                kyVar.f(!TextUtils.isEmpty(string2));
                if (wpVar != null) {
                    wpVar.clearAnimation();
                    wpVar.animate().translationX(0.0f).setInterpolator(er.h).start();
                }
                kyVar.d(false);
                break;
            case 10:
                p10 p10Var = (p10) this.f2910b;
                if (!p10Var.B.isEmpty() && editable.length() > 0 && p10Var.E >= 0) {
                    p10Var.E = -1;
                    p10Var.f();
                }
                p10Var.f31462a.a(p10Var.f31467n || p10Var.f31468r.length() > 0, true);
                break;
            case 11:
                dd0 dd0Var = (dd0) this.f2910b;
                if (dd0Var.f27723r.length() == 4 && SharedConfig.passcodeType == 0) {
                    dd0Var.k(false);
                    break;
                }
                break;
            case 12:
                km0 km0Var = (km0) this.f2910b;
                ImageView imageView2 = km0Var.f30148c;
                gg.g gVar2 = km0Var.f30149e;
                boolean z10 = gVar2.length() > 0;
                if (z10 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
                }
                km0Var.a(gVar2.getText().toString());
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new mb0(this, 28));
                break;
            case 14:
                wx0 wx0Var = (wx0) this.f2910b;
                ux0 ux0Var = wx0Var.f34365c;
                if (ux0Var != null && ux0Var.getVisibility() == 0) {
                    wx0Var.e();
                    break;
                }
                break;
            case 15:
                t51 t51Var = (t51) this.f2910b;
                String string3 = t51Var.F.getText().toString();
                u51 u51Var = t51Var.G;
                int iH = u51Var.d.getAdapter() == null ? 0 : u51Var.d.getAdapter().h();
                u51Var.G(string3);
                if (TextUtils.isEmpty(string3) && (f1Var = u51Var.d) != null) {
                    q0 adapter = f1Var.getAdapter();
                    yk0 yk0Var = u51Var.f32980f;
                    if (adapter != yk0Var) {
                        f1 f1Var2 = u51Var.d;
                        f1Var2.U1 = false;
                        f1Var2.V1 = 0;
                        f1Var2.setAdapter(yk0Var);
                        f1 f1Var3 = u51Var.d;
                        f1Var3.U1 = true;
                        f1Var3.V1 = 0;
                        if (iH == 0) {
                            u51Var.J(0);
                        }
                    }
                }
                u51Var.v.setVisibility(0);
                break;
            case 16:
                o0 o0Var = (o0) this.f2910b;
                AndroidUtilities.updateViewShow(o0Var.F, editable.length() > 0 && o0Var.P, true, true);
                String string4 = editable.toString();
                m4 m4Var = o0Var.f40965x0;
                String lowerCase = string4.toLowerCase();
                d5.i iVar = m4Var.R0;
                if (iVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    m4Var.R0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i10 = m4Var.S0 + 1;
                    m4Var.S0 = i10;
                    if (!m4Var.f40347q0[0].f()) {
                        d5.i iVar2 = new d5.i(m4Var, lowerCase, i10, 22);
                        m4Var.R0 = iVar2;
                        AndroidUtilities.runOnUIThread(iVar2, 400L);
                    } else {
                        m4Var.d0(true);
                        if (m4Var.f40347q0[0].getWebView() != null) {
                            w0 webView = m4Var.f40347q0[0].getWebView();
                            webView.E = new d0(m4Var, 9);
                            webView.findAllAsync(lowerCase);
                            m4Var.h0();
                        }
                    }
                } else {
                    m4Var.A.clear();
                    m4Var.B = lowerCase;
                    m4Var.f40347q0[0].f41497c.f39597y.clear();
                    m4Var.d0(false);
                    if (!m4Var.f40347q0[0].f()) {
                        m4Var.f40347q0[0].f41496b.f1();
                        m4Var.W(0);
                    } else if (m4Var.f40347q0[0].getWebView() != null) {
                        w0 webView2 = m4Var.f40347q0[0].getWebView();
                        webView2.E = new d0(m4Var, 9);
                        webView2.findAllAsync("");
                        m4Var.h0();
                    }
                    m4Var.S0 = -1;
                }
                break;
            case 17:
                m0 m0Var = (m0) this.f2910b;
                m0Var.f46379x = false;
                i0 i0Var = m0Var.B;
                AndroidUtilities.cancelRunOnUIThread(i0Var);
                if (TextUtils.isEmpty(m0Var.f46374f.getText())) {
                    m0Var.f46380y = null;
                    m0Var.d.b();
                } else {
                    m0Var.f46379x = true;
                    AndroidUtilities.runOnUIThread(i0Var, 800L);
                }
                m0Var.f46372c.U2.N(true);
                m0Var.b0();
                break;
            case 18:
                qf.w0 w0Var = (qf.w0) this.f2910b;
                if (!w0Var.d) {
                    w0Var.A = false;
                    w0Var.f46480y = editable.toString();
                    w0Var.U(true);
                }
                break;
            default:
                zg.c cVar2 = (zg.c) this.f2910b;
                int length = cVar2.f50804a.getText().length();
                ud.a aVar = cVar2.D;
                int i11 = cVar2.f50813x;
                aVar.a(length > (i11 * 7) / 10, true);
                cVar2.E.a(length > i11, true);
                cVar2.f50808f.l(Integer.toString(i11 - length), false);
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f2909a) {
            case 11:
                dd0 dd0Var = (dd0) this.f2910b;
                LinkedList linkedList = dd0Var.J;
                LinkedList linkedList2 = dd0Var.I;
                Drawable drawable = dd0Var.f27717a;
                if (drawable instanceof nb0) {
                    nb0 nb0Var = (nb0) drawable;
                    nb0Var.D = null;
                    nb0Var.z();
                    float f10 = nb0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        nb0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        nb0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            dd0Var.b(nb0Var);
                        } else {
                            linkedList2.offer(new t5(this, z10, nb0Var, 19));
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
                                int iIntValue = ((Integer) obj2).intValue();
                                if (iIntValue < linkedList.size()) {
                                    linkedList.remove(iIntValue);
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f2909a) {
            case 4:
                SearchView searchView = (SearchView) this.f2910b;
                Editable text = searchView.B.getText();
                searchView.f1008k0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.u(!zIsEmpty);
                int i13 = 8;
                if (searchView.f1007j0 && !searchView.f1000c0 && zIsEmpty) {
                    searchView.G.setVisibility(8);
                    i13 = 0;
                }
                searchView.I.setVisibility(i13);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
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
