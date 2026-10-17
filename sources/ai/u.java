package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class u implements TextWatcher {
    public final int f2234a;
    public final Object f2235b;

    public u(Object obj, int i10) {
        this.f2234a = i10;
        this.f2235b = obj;
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
        u1 u1Var;
        String str2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        switch (this.f2234a) {
            case 0:
                x xVar = (x) this.f2235b;
                d dVar = xVar.f2407n0;
                TLRPC.TL_payments_starsRevenueStats h10 = k0.g(x.d0(xVar)).h(xVar.f2392b, false);
                long j12 = 0;
                if (h10 == null) {
                    j10 = 0;
                } else {
                    j10 = h10.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                xVar.P = j12;
                int i12 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
                boolean z18 = true;
                if (i12 > 0) {
                    xVar.P = j10;
                    xVar.N = true;
                    xVar.Q.setText(Long.toString(j10));
                    t tVar = xVar.Q;
                    tVar.setSelection(tVar.getText().length());
                    xVar.N = false;
                }
                if (xVar.P != j10) {
                    z18 = false;
                }
                xVar.O = z18;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                dVar.run();
                if (!xVar.N) {
                    xVar.O = false;
                    return;
                }
                return;
            case 1:
                ei.h2 h2Var = (ei.h2) this.f2235b;
                ImageView imageView = h2Var.f9150n;
                ei.e2 e2Var = h2Var.d;
                if (!h2Var.f9151r) {
                    h2Var.d(false);
                    String obj = e2Var.getText().toString();
                    if (TextUtils.isEmpty(obj)) {
                        str = null;
                    } else {
                        str = obj;
                    }
                    Utilities.Callback2 callback2 = h2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    ei.g2 g2Var = h2Var.f9149f;
                    if (g2Var != null) {
                        g2Var.G1(null);
                        h2Var.f9149f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (e2Var != null) {
                        e2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = e2Var.animate().translationX(0.0f);
                        bs bsVar = bs.h;
                        translationX.setInterpolator(bsVar).start();
                        if (imageView != null && h2Var.h != (!TextUtils.isEmpty(e2Var.getText()))) {
                            h2Var.h = !h2Var.h;
                            imageView.animate().cancel();
                            if (h2Var.h) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f12 = 0.7f;
                            if (h2Var.h) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f7);
                            if (h2Var.h) {
                                f12 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                            if (h2Var.h) {
                                f11 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new com.google.firebase.messaging.s(this, 13)).setInterpolator(bsVar).setDuration(320L);
                            if (h2Var.h) {
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
                ((hi.o) this.f2235b).Y();
                return;
            case 3:
                ig.r0 r0Var = (ig.r0) this.f2235b;
                r0Var.f13018x = false;
                ig.n0 n0Var = r0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(r0Var.f13013f.getText())) {
                    r0Var.f13019y = null;
                    r0Var.d.b();
                } else {
                    r0Var.f13018x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                r0Var.f13012c.W2.N(true);
                r0Var.b0();
                return;
            case 4:
                ig.b1 b1Var = (ig.b1) this.f2235b;
                if (!b1Var.d) {
                    b1Var.E = false;
                    b1Var.f12842y = editable.toString();
                    b1Var.U(true);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.kd kdVar = (org.telegram.ui.Components.kd) this.f2235b;
                if (kdVar.f9401f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kdVar.F(z10);
                return;
            case 7:
                iu iuVar = (iu) this.f2235b;
                i10 = iuVar.lineCount;
                if (i10 != iuVar.getLineCount()) {
                    z11 = iuVar.isInitLineCount;
                    if (!z11 && iuVar.getMeasuredWidth() > 0) {
                        i11 = iuVar.lineCount;
                        iuVar.onLineCountChanged(i11, iuVar.getLineCount());
                    }
                    iuVar.lineCount = iuVar.getLineCount();
                    return;
                }
                return;
            case 8:
                ((e2) this.f2235b).run();
                return;
            case 9:
                gz gzVar = (gz) this.f2235b;
                gzVar.g(false);
                sq sqVar = gzVar.d;
                String obj2 = sqVar.getText().toString();
                gzVar.c(obj2, true);
                fz fzVar = gzVar.f26698r;
                if (fzVar != null) {
                    fzVar.G1(null);
                    fzVar.H1(TextUtils.isEmpty(obj2), true);
                }
                gzVar.f(!TextUtils.isEmpty(obj2));
                if (sqVar != null) {
                    sqVar.clearAnimation();
                    sqVar.animate().translationX(0.0f).setInterpolator(bs.h).start();
                }
                gzVar.d(false);
                return;
            case 10:
                k20 k20Var = (k20) this.f2235b;
                if (!k20Var.F.isEmpty() && editable.length() > 0 && k20Var.I >= 0) {
                    k20Var.I = -1;
                    k20Var.f();
                }
                ne.b bVar = k20Var.f27707a;
                if (!k20Var.f27711n && k20Var.f27712r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 11:
                le0 le0Var = (le0) this.f2235b;
                if (le0Var.f28217r.length() == 4 && SharedConfig.passcodeType == 0) {
                    le0Var.m(false);
                    return;
                }
                return;
            case 12:
                un0 un0Var = (un0) this.f2235b;
                ImageView imageView2 = un0Var.f31055c;
                ei.e2 e2Var2 = un0Var.e;
                boolean z19 = false;
                if (e2Var2.length() > 0) {
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
                un0Var.a(e2Var2.getText().toString());
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new rc0(this, 28));
                return;
            case 14:
                gz0 gz0Var = (gz0) this.f2235b;
                ez0 ez0Var = gz0Var.f26707c;
                if (ez0Var != null && ez0Var.getVisibility() == 0) {
                    gz0Var.e();
                    return;
                }
                return;
            case 15:
                i71 i71Var = (i71) this.f2235b;
                String obj3 = i71Var.J.getText().toString();
                j71 j71Var = i71Var.K;
                if (j71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = j71Var.d.getAdapter().h();
                }
                j71Var.H(obj3);
                if (TextUtils.isEmpty(obj3) && (u1Var = j71Var.d) != null) {
                    s4.g0 adapter = u1Var.getAdapter();
                    hm0 hm0Var = j71Var.f27431f;
                    if (adapter != hm0Var) {
                        u1 u1Var2 = j71Var.d;
                        u1Var2.W1 = false;
                        u1Var2.X1 = 0;
                        u1Var2.setAdapter(hm0Var);
                        u1 u1Var3 = j71Var.d;
                        u1Var3.W1 = true;
                        u1Var3.X1 = 0;
                        if (h == 0) {
                            j71Var.K(0);
                        }
                    }
                }
                j71Var.v.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Wallet.l9) this.f2235b).w0();
                return;
            case 17:
                final org.telegram.ui.Wallet.t9 t9Var = (org.telegram.ui.Wallet.t9) this.f2235b;
                ArrayList arrayList = t9Var.f34912s;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = t9Var.J;
                String str3 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    t9Var.J = null;
                }
                boolean z20 = false;
                if (t9Var.f34915y != 0) {
                    t9Var.getConnectionsManager().cancelRequest(t9Var.f34915y, true);
                    t9Var.f34915y = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str2 = trim;
                } else {
                    str2 = null;
                }
                t9Var.f34913w = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str3 = lowerCase;
                    }
                }
                t9Var.f34914x = str3;
                final int i13 = t9Var.I + 1;
                t9Var.I = i13;
                if (!TextUtils.isEmpty(trim) && t9Var.f34913w == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                t9Var.K = z14;
                t9Var.v.g(null, true, false, false, false, 0L, false, 0, i13);
                ei.d dVar2 = t9Var.V;
                if (dVar2 != null) {
                    if (t9Var.f34913w != null) {
                        z20 = true;
                    }
                    dVar2.setEnabled(z20);
                }
                if (!TextUtils.isEmpty(trim) && t9Var.f34913w == null && t9Var.f34914x == null) {
                    t9Var.d0(trim);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    t9.Y(t9Var, trim, i13);
                                    return;
                                default:
                                    t9 t9Var2 = t9Var;
                                    t9Var2.J = null;
                                    hg.a2 a2Var = t9Var2.v;
                                    int i14 = i13;
                                    a2Var.h(trim, true, false, false, false, false, 0L, false, 0, i14, 0L, new j(t9Var2, i14, 4));
                                    return;
                            }
                        }
                    };
                    t9Var.J = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    t9Var.f31190a.W2.N(true);
                    final String str4 = t9Var.f34914x;
                    if (str4 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        t9.Y(t9Var, str4, i13);
                                        return;
                                    default:
                                        t9 t9Var2 = t9Var;
                                        t9Var2.J = null;
                                        hg.a2 a2Var = t9Var2.v;
                                        int i14 = i13;
                                        a2Var.h(str4, true, false, false, false, false, 0L, false, 0, i14, 0L, new j(t9Var2, i14, 4));
                                        return;
                                }
                            }
                        };
                        t9Var.J = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                t9Var.i0(true);
                return;
            case 18:
                org.telegram.ui.Wallet.ia iaVar = (org.telegram.ui.Wallet.ia) this.f2235b;
                if (iaVar.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && iaVar.b()) {
                    iaVar.setError(false);
                }
                iaVar.e();
                iaVar.d();
                if (iaVar.f34330a.hasFocus()) {
                    iaVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = iaVar.f34333f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.n0 n0Var2 = (org.telegram.ui.n0) this.f2235b;
                ImageView imageView3 = n0Var2.J;
                if (editable.length() > 0 && n0Var2.T) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z15, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.l4 l4Var = n0Var2.B0;
                String lowerCase2 = obj4.toLowerCase();
                ah.o oVar = l4Var.V0;
                if (oVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(oVar);
                    l4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    l4Var.E.clear();
                    l4Var.F = lowerCase2;
                    l4Var.f38779u0[0].f39634c.f38037y.clear();
                    l4Var.d0(false);
                    if (l4Var.f38779u0[0].f()) {
                        if (l4Var.f38779u0[0].getWebView() != null) {
                            org.telegram.ui.web.x0 webView = l4Var.f38779u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(l4Var, 9);
                            webView.findAllAsync("");
                            l4Var.h0();
                        }
                    } else {
                        l4Var.f38779u0[0].f39633b.f1();
                        l4Var.W(0);
                    }
                    l4Var.W0 = -1;
                    return;
                }
                int i14 = l4Var.W0 + 1;
                l4Var.W0 = i14;
                if (l4Var.f38779u0[0].f()) {
                    l4Var.d0(true);
                    if (l4Var.f38779u0[0].getWebView() != null) {
                        org.telegram.ui.web.x0 webView2 = l4Var.f38779u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(l4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        l4Var.h0();
                        return;
                    }
                    return;
                }
                ah.o oVar2 = new ah.o(l4Var, lowerCase2, i14, 27);
                l4Var.V0 = oVar2;
                AndroidUtilities.runOnUIThread(oVar2, 400L);
                return;
            case 20:
                rh.c cVar = (rh.c) this.f2235b;
                int length = cVar.f45760a.getText().length();
                ne.b bVar2 = cVar.H;
                int i15 = cVar.f45768x;
                if (length > (i15 * 7) / 10) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar2.a(z16, true);
                ne.b bVar3 = cVar.I;
                if (length > i15) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                bVar3.a(z17, true);
                cVar.f45763f.l(Integer.toString(i15 - length), false);
                return;
            case 21:
                uh.f fVar = (uh.f) this.f2235b;
                fVar.K();
                fVar.f47857c0 = editable.toString();
                fVar.f47858d0.N(true);
                return;
            default:
                wg.k kVar = ((wg.l) this.f2235b).f48999c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    ug.y yVar = ((ug.s) kVar).f47775a;
                    yVar.f47835v0 = trim2;
                    yVar.b0(false, false);
                    yVar.b0(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f2234a) {
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
                le0 le0Var = (le0) this.f2235b;
                LinkedList linkedList = le0Var.V;
                LinkedList linkedList2 = le0Var.U;
                Drawable drawable = le0Var.f28204a;
                if (drawable instanceof wc0) {
                    wc0 wc0Var = (wc0) drawable;
                    wc0Var.D = null;
                    wc0Var.y();
                    float f7 = wc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        wc0Var.w(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        wc0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            le0Var.b(wc0Var);
                            return;
                        }
                        linkedList2.offer(new x7(this, z10, wc0Var, 24));
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
        switch (this.f2234a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                SearchView searchView = (SearchView) this.f2235b;
                Editable text = searchView.F.getText();
                searchView.f2780o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2779n0 && !searchView.f2773g0 && isEmpty) {
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
