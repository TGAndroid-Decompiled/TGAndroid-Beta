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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.wg1;
public final class u implements TextWatcher {
    public final int f5501a;
    public final Object f5502b;

    public u(Object obj, int i10) {
        this.f5501a = i10;
        this.f5502b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j10;
        String str;
        float f7;
        long j11;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        float f10;
        int h;
        r1 r1Var;
        String str2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        switch (this.f5501a) {
            case 0:
                y yVar = (y) this.f5502b;
                d dVar = yVar.f5738s0;
                TLRPC.TL_payments_starsRevenueStats h10 = m0.g(y.n0(yVar)).h(yVar.f5716b, false);
                long j12 = 0;
                if (h10 == null) {
                    j10 = 0;
                } else {
                    j10 = h10.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                yVar.Y = j12;
                int i12 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
                boolean z18 = true;
                if (i12 > 0) {
                    yVar.Y = j10;
                    yVar.W = true;
                    yVar.Z.setText(Long.toString(j10));
                    t tVar = yVar.Z;
                    tVar.setSelection(tVar.getText().length());
                    yVar.W = false;
                }
                if (yVar.Y != j10) {
                    z18 = false;
                }
                yVar.X = z18;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                dVar.run();
                if (!yVar.W) {
                    yVar.X = false;
                    return;
                }
                return;
            case 1:
                fi.f2 f2Var = (fi.f2) this.f5502b;
                ImageView imageView = f2Var.f10856r;
                fi.c2 c2Var = f2Var.e;
                if (!f2Var.f10857s) {
                    f2Var.d(false);
                    String obj = c2Var.getText().toString();
                    if (TextUtils.isEmpty(obj)) {
                        str = null;
                    } else {
                        str = obj;
                    }
                    Utilities.Callback2 callback2 = f2Var.f10858w;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    fi.e2 e2Var = f2Var.h;
                    if (e2Var != null) {
                        e2Var.L1(null);
                        f2Var.h.M1(TextUtils.isEmpty(obj), true);
                    }
                    if (c2Var != null) {
                        c2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = c2Var.animate().translationX(0.0f);
                        ds dsVar = ds.h;
                        translationX.setInterpolator(dsVar).start();
                        if (imageView != null && f2Var.f10855n != (!TextUtils.isEmpty(c2Var.getText()))) {
                            f2Var.f10855n = !f2Var.f10855n;
                            imageView.animate().cancel();
                            if (f2Var.f10855n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f12 = 0.7f;
                            if (f2Var.f10855n) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f7);
                            if (f2Var.f10855n) {
                                f12 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                            if (f2Var.f10855n) {
                                f11 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new di.s8(this, 17)).setInterpolator(dsVar).setDuration(320L);
                            if (f2Var.f10855n) {
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
            case 2:
                ((ii.o) this.f5502b).Z();
                return;
            case 3:
                jg.t0 t0Var = (jg.t0) this.f5502b;
                t0Var.f15855x = false;
                jg.m0 m0Var = t0Var.F;
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                if (TextUtils.isEmpty(t0Var.f15850f.getText())) {
                    t0Var.f15856y = null;
                    t0Var.d.b();
                } else {
                    t0Var.f15855x = true;
                    AndroidUtilities.runOnUIThread(m0Var, 800L);
                }
                t0Var.f15849c.f32152g3.O(true);
                t0Var.c0();
                return;
            case 4:
                jg.d1 d1Var = (jg.d1) this.f5502b;
                if (!d1Var.f15668c) {
                    d1Var.f15675y = false;
                    d1Var.f15674x = editable.toString();
                    d1Var.V(true);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) this.f5502b;
                if (jdVar.f11199f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jdVar.F(z10);
                return;
            case 7:
                ju juVar = (ju) this.f5502b;
                i10 = juVar.lineCount;
                if (i10 != juVar.getLineCount()) {
                    z11 = juVar.isInitLineCount;
                    if (!z11 && juVar.getMeasuredWidth() > 0) {
                        i11 = juVar.lineCount;
                        juVar.onLineCountChanged(i11, juVar.getLineCount());
                    }
                    juVar.lineCount = juVar.getLineCount();
                    return;
                }
                return;
            case 8:
                ((fi.r1) this.f5502b).run();
                return;
            case 9:
                fz fzVar = (fz) this.f5502b;
                fzVar.g(false);
                uq uqVar = fzVar.d;
                String obj2 = uqVar.getText().toString();
                fzVar.c(obj2, true);
                ez ezVar = fzVar.f28341r;
                if (ezVar != null) {
                    ezVar.L1(null);
                    ezVar.M1(TextUtils.isEmpty(obj2), true);
                }
                fzVar.f(!TextUtils.isEmpty(obj2));
                if (uqVar != null) {
                    uqVar.clearAnimation();
                    uqVar.animate().translationX(0.0f).setInterpolator(ds.h).start();
                }
                fzVar.d(false);
                return;
            case 10:
                m20 m20Var = (m20) this.f5502b;
                if (!m20Var.F.isEmpty() && editable.length() > 0 && m20Var.I >= 0) {
                    m20Var.I = -1;
                    m20Var.e();
                }
                oe.b bVar = m20Var.f30362a;
                if (!m20Var.f30366n && m20Var.f30367r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 11:
                le0 le0Var = (le0) this.f5502b;
                if (le0Var.f30198r.length() == 4 && SharedConfig.passcodeType == 0) {
                    le0Var.n(false);
                    return;
                }
                return;
            case 12:
                do0 do0Var = (do0) this.f5502b;
                ImageView imageView2 = do0Var.f27573b;
                fi.c2 c2Var2 = do0Var.d;
                boolean z19 = false;
                if (c2Var2.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float f13 = 0.0f;
                if (imageView2.getAlpha() != 0.0f) {
                    z19 = true;
                }
                if (z13 != z19) {
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
                do0Var.a(c2Var2.getText().toString());
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new mp0(this, 2));
                return;
            case 14:
                tz0 tz0Var = (tz0) this.f5502b;
                rz0 rz0Var = tz0Var.f33176c;
                if (rz0Var != null && rz0Var.getVisibility() == 0) {
                    tz0Var.e();
                    return;
                }
                return;
            case 15:
                a81 a81Var = (a81) this.f5502b;
                String obj3 = a81Var.J.getText().toString();
                b81 b81Var = a81Var.K;
                if (b81Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = b81Var.d.getAdapter().h();
                }
                b81Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (r1Var = b81Var.d) != null) {
                    s4.h0 adapter = r1Var.getAdapter();
                    lm0 lm0Var = b81Var.f26780f;
                    if (adapter != lm0Var) {
                        r1 r1Var2 = b81Var.d;
                        r1Var2.W1 = false;
                        r1Var2.X1 = 0;
                        r1Var2.setAdapter(lm0Var);
                        r1 r1Var3 = b81Var.d;
                        r1Var3.W1 = true;
                        r1Var3.X1 = 0;
                        if (h == 0) {
                            b81Var.J(0);
                        }
                    }
                }
                b81Var.v.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Wallet.i9) this.f5502b).y0();
                return;
            case 17:
                final org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.f5502b;
                ArrayList arrayList = r9Var.v;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = r9Var.K;
                String str3 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    r9Var.K = null;
                }
                boolean z20 = false;
                if (r9Var.E != 0) {
                    r9Var.getConnectionsManager().cancelRequest(r9Var.E, true);
                    r9Var.E = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str2 = trim;
                } else {
                    str2 = null;
                }
                r9Var.f37205x = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str3 = lowerCase;
                    }
                }
                r9Var.f37206y = str3;
                final int i13 = r9Var.J + 1;
                r9Var.J = i13;
                if (!TextUtils.isEmpty(trim) && r9Var.f37205x == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                r9Var.L = z14;
                r9Var.f37204w.g(null, true, false, false, false, 0L, false, 0, i13);
                fi.d dVar2 = r9Var.Z;
                if (dVar2 != null) {
                    if (r9Var.f37205x != null) {
                        z20 = true;
                    }
                    dVar2.setEnabled(z20);
                }
                if (!TextUtils.isEmpty(trim) && r9Var.f37205x == null && r9Var.f37206y == null) {
                    r9Var.f0(trim);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    r9.b0(r9Var, trim, i13);
                                    return;
                                default:
                                    r9 r9Var2 = r9Var;
                                    r9Var2.K = null;
                                    ig.a2 a2Var = r9Var2.f37204w;
                                    int i14 = i13;
                                    a2Var.h(trim, true, false, false, false, false, 0L, false, 0, i14, 0L, new wg1(r9Var2, i14, 6));
                                    return;
                            }
                        }
                    };
                    r9Var.K = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    r9Var.f30419a.f32152g3.O(true);
                    final String str4 = r9Var.f37206y;
                    if (str4 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        r9.b0(r9Var, str4, i13);
                                        return;
                                    default:
                                        r9 r9Var2 = r9Var;
                                        r9Var2.K = null;
                                        ig.a2 a2Var = r9Var2.f37204w;
                                        int i14 = i13;
                                        a2Var.h(str4, true, false, false, false, false, 0L, false, 0, i14, 0L, new wg1(r9Var2, i14, 6));
                                        return;
                                }
                            }
                        };
                        r9Var.K = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                r9Var.l0(true);
                return;
            case 18:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) this.f5502b;
                if (haVar.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && haVar.b()) {
                    haVar.setError(false);
                }
                haVar.e();
                haVar.d();
                if (haVar.f36651a.hasFocus()) {
                    haVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = haVar.f36654f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f5502b;
                ImageView imageView3 = l0Var.J;
                if (editable.length() > 0 && l0Var.T) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z15, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.j4 j4Var = l0Var.B0;
                String lowerCase2 = obj4.toLowerCase();
                ai.h0 h0Var = j4Var.W0;
                if (h0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    j4Var.W0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    j4Var.E.clear();
                    j4Var.F = lowerCase2;
                    j4Var.f40449u0[0].f41444c.f39889y.clear();
                    j4Var.d0(false);
                    if (j4Var.f40449u0[0].f()) {
                        if (j4Var.f40449u0[0].getWebView() != null) {
                            org.telegram.ui.web.x0 webView = j4Var.f40449u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(j4Var, 9);
                            webView.findAllAsync("");
                            j4Var.h0();
                        }
                    } else {
                        j4Var.f40449u0[0].f41443b.g1();
                        j4Var.W(0);
                    }
                    j4Var.X0 = -1;
                    return;
                }
                int i14 = j4Var.X0 + 1;
                j4Var.X0 = i14;
                if (j4Var.f40449u0[0].f()) {
                    j4Var.d0(true);
                    if (j4Var.f40449u0[0].getWebView() != null) {
                        org.telegram.ui.web.x0 webView2 = j4Var.f40449u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(j4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        j4Var.h0();
                        return;
                    }
                    return;
                }
                ai.h0 h0Var2 = new ai.h0(j4Var, lowerCase2, i14, 27);
                j4Var.W0 = h0Var2;
                AndroidUtilities.runOnUIThread(h0Var2, 400L);
                return;
            case 20:
                sh.c cVar = (sh.c) this.f5502b;
                int length = cVar.f48618a.getText().length();
                oe.b bVar2 = cVar.H;
                int i15 = cVar.f48626x;
                if (length > (i15 * 7) / 10) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar2.a(z16, true);
                oe.b bVar3 = cVar.I;
                if (length > i15) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                bVar3.a(z17, true);
                cVar.f48621f.l(Integer.toString(i15 - length), false);
                return;
            case 21:
                vh.f fVar = (vh.f) this.f5502b;
                fVar.J();
                fVar.f50315c0 = editable.toString();
                fVar.f50316d0.O(true);
                return;
            default:
                xg.k kVar = ((xg.l) this.f5502b).f51791c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    vg.a0 a0Var = ((vg.u) kVar).f50262a;
                    a0Var.f50138v0 = trim2;
                    a0Var.a0(false, false);
                    a0Var.a0(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f5501a) {
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
                le0 le0Var = (le0) this.f5502b;
                LinkedList linkedList = le0Var.V;
                LinkedList linkedList2 = le0Var.U;
                Drawable drawable = le0Var.f30185a;
                if (drawable instanceof uc0) {
                    uc0 uc0Var = (uc0) drawable;
                    uc0Var.D = null;
                    uc0Var.y();
                    float f7 = uc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        uc0Var.w(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        uc0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            le0Var.b(uc0Var);
                            return;
                        }
                        linkedList2.offer(new u7(this, z10, uc0Var, 23));
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
            case 19:
            case 20:
            case 21:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f5501a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                SearchView searchView = (SearchView) this.f5502b;
                Editable text = searchView.F.getText();
                searchView.f2230o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2229n0 && !searchView.f2223g0 && isEmpty) {
                    searchView.K.setVisibility(8);
                    i13 = 0;
                }
                searchView.M.setVisibility(i13);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
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
            case 19:
            case 20:
            case 21:
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

    private final void N(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void O(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void P(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void Q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void R(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void S(int i10, int i11, int i12, CharSequence charSequence) {
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
