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
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class u implements TextWatcher {
    public final int f2235a;
    public final Object f2236b;

    public u(Object obj, int i10) {
        this.f2235a = i10;
        this.f2236b = obj;
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
        switch (this.f2235a) {
            case 0:
                x xVar = (x) this.f2236b;
                d dVar = xVar.f2414n0;
                TLRPC.TL_payments_starsRevenueStats h10 = k0.g(x.d0(xVar)).h(xVar.f2399b, false);
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
                ei.h2 h2Var = (ei.h2) this.f2236b;
                ImageView imageView = h2Var.f9148n;
                ei.e2 e2Var = h2Var.d;
                if (!h2Var.f9149r) {
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
                    ei.g2 g2Var = h2Var.f9147f;
                    if (g2Var != null) {
                        g2Var.G1(null);
                        h2Var.f9147f.H1(TextUtils.isEmpty(obj), true);
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
                ((hi.o) this.f2236b).Y();
                return;
            case 3:
                ig.t0 t0Var = (ig.t0) this.f2236b;
                t0Var.f13038x = false;
                ig.n0 n0Var = t0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(t0Var.f13033f.getText())) {
                    t0Var.f13039y = null;
                    t0Var.d.b();
                } else {
                    t0Var.f13038x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                t0Var.f13032c.W2.N(true);
                t0Var.b0();
                return;
            case 4:
                ig.d1 d1Var = (ig.d1) this.f2236b;
                if (!d1Var.d) {
                    d1Var.E = false;
                    d1Var.f12861y = editable.toString();
                    d1Var.U(true);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.kd kdVar = (org.telegram.ui.Components.kd) this.f2236b;
                if (kdVar.f9399f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kdVar.F(z10);
                return;
            case 7:
                iu iuVar = (iu) this.f2236b;
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
                ((ei.s1) this.f2236b).run();
                return;
            case 9:
                gz gzVar = (gz) this.f2236b;
                gzVar.g(false);
                sq sqVar = gzVar.d;
                String obj2 = sqVar.getText().toString();
                gzVar.c(obj2, true);
                fz fzVar = gzVar.f26696r;
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
                k20 k20Var = (k20) this.f2236b;
                if (!k20Var.F.isEmpty() && editable.length() > 0 && k20Var.I >= 0) {
                    k20Var.I = -1;
                    k20Var.f();
                }
                ne.b bVar = k20Var.f27724a;
                if (!k20Var.f27728n && k20Var.f27729r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 11:
                me0 me0Var = (me0) this.f2236b;
                if (me0Var.f28507r.length() == 4 && SharedConfig.passcodeType == 0) {
                    me0Var.n(false);
                    return;
                }
                return;
            case 12:
                vn0 vn0Var = (vn0) this.f2236b;
                ImageView imageView2 = vn0Var.f31321c;
                ei.e2 e2Var2 = vn0Var.e;
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
                vn0Var.a(e2Var2.getText().toString());
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new rc0(this, 28));
                return;
            case 14:
                iz0 iz0Var = (iz0) this.f2236b;
                gz0 gz0Var = iz0Var.f27360c;
                if (gz0Var != null && gz0Var.getVisibility() == 0) {
                    iz0Var.e();
                    return;
                }
                return;
            case 15:
                k71 k71Var = (k71) this.f2236b;
                String obj3 = k71Var.J.getText().toString();
                l71 l71Var = k71Var.K;
                if (l71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = l71Var.d.getAdapter().h();
                }
                l71Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (u1Var = l71Var.d) != null) {
                    s4.g0 adapter = u1Var.getAdapter();
                    im0 im0Var = l71Var.f28093f;
                    if (adapter != im0Var) {
                        u1 u1Var2 = l71Var.d;
                        u1Var2.W1 = false;
                        u1Var2.X1 = 0;
                        u1Var2.setAdapter(im0Var);
                        u1 u1Var3 = l71Var.d;
                        u1Var3.W1 = true;
                        u1Var3.X1 = 0;
                        if (h == 0) {
                            l71Var.K(0);
                        }
                    }
                }
                l71Var.v.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Wallet.i9) this.f2236b).w0();
                return;
            case 17:
                final org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.f2236b;
                ArrayList arrayList = r9Var.f34821s;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = r9Var.J;
                String str3 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    r9Var.J = null;
                }
                boolean z20 = false;
                if (r9Var.f34824y != 0) {
                    r9Var.getConnectionsManager().cancelRequest(r9Var.f34824y, true);
                    r9Var.f34824y = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str2 = trim;
                } else {
                    str2 = null;
                }
                r9Var.f34822w = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str3 = lowerCase;
                    }
                }
                r9Var.f34823x = str3;
                final int i13 = r9Var.I + 1;
                r9Var.I = i13;
                if (!TextUtils.isEmpty(trim) && r9Var.f34822w == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                r9Var.K = z14;
                r9Var.v.g(null, true, false, false, false, 0L, false, 0, i13);
                ei.d dVar2 = r9Var.V;
                if (dVar2 != null) {
                    if (r9Var.f34822w != null) {
                        z20 = true;
                    }
                    dVar2.setEnabled(z20);
                }
                if (!TextUtils.isEmpty(trim) && r9Var.f34822w == null && r9Var.f34823x == null) {
                    r9Var.e0(trim);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    r9.a0(r9Var, trim, i13);
                                    return;
                                default:
                                    r9 r9Var2 = r9Var;
                                    r9Var2.J = null;
                                    hg.a2 a2Var = r9Var2.v;
                                    int i14 = i13;
                                    a2Var.h(trim, true, false, false, false, false, 0L, false, 0, i14, 0L, new j(r9Var2, i14, 5));
                                    return;
                            }
                        }
                    };
                    r9Var.J = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    r9Var.f32359a.W2.N(true);
                    final String str4 = r9Var.f34823x;
                    if (str4 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        r9.a0(r9Var, str4, i13);
                                        return;
                                    default:
                                        r9 r9Var2 = r9Var;
                                        r9Var2.J = null;
                                        hg.a2 a2Var = r9Var2.v;
                                        int i14 = i13;
                                        a2Var.h(str4, true, false, false, false, false, 0L, false, 0, i14, 0L, new j(r9Var2, i14, 5));
                                        return;
                                }
                            }
                        };
                        r9Var.J = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                r9Var.k0(true);
                return;
            case 18:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) this.f2236b;
                if (haVar.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && haVar.b()) {
                    haVar.setError(false);
                }
                haVar.e();
                haVar.d();
                if (haVar.f34306a.hasFocus()) {
                    haVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = haVar.f34309f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.n0 n0Var2 = (org.telegram.ui.n0) this.f2236b;
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
                    l4Var.f38782u0[0].f39757c.f38171y.clear();
                    l4Var.d0(false);
                    if (l4Var.f38782u0[0].f()) {
                        if (l4Var.f38782u0[0].getWebView() != null) {
                            org.telegram.ui.web.x0 webView = l4Var.f38782u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(l4Var, 9);
                            webView.findAllAsync("");
                            l4Var.h0();
                        }
                    } else {
                        l4Var.f38782u0[0].f39756b.f1();
                        l4Var.W(0);
                    }
                    l4Var.W0 = -1;
                    return;
                }
                int i14 = l4Var.W0 + 1;
                l4Var.W0 = i14;
                if (l4Var.f38782u0[0].f()) {
                    l4Var.d0(true);
                    if (l4Var.f38782u0[0].getWebView() != null) {
                        org.telegram.ui.web.x0 webView2 = l4Var.f38782u0[0].getWebView();
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
                rh.c cVar = (rh.c) this.f2236b;
                int length = cVar.f45745a.getText().length();
                ne.b bVar2 = cVar.H;
                int i15 = cVar.f45753x;
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
                cVar.f45748f.l(Integer.toString(i15 - length), false);
                return;
            case 21:
                uh.f fVar = (uh.f) this.f2236b;
                fVar.K();
                fVar.f47845c0 = editable.toString();
                fVar.f47846d0.N(true);
                return;
            default:
                wg.k kVar = ((wg.l) this.f2236b).f48986c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    ug.z zVar = ((ug.t) kVar).f47766a;
                    zVar.f47826v0 = trim2;
                    zVar.b0(false, false);
                    zVar.b0(true, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f2235a) {
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
                me0 me0Var = (me0) this.f2236b;
                LinkedList linkedList = me0Var.V;
                LinkedList linkedList2 = me0Var.U;
                Drawable drawable = me0Var.f28494a;
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
                            me0Var.b(wc0Var);
                            return;
                        }
                        linkedList2.offer(new y7(this, z10, wc0Var, 24));
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
        switch (this.f2235a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                SearchView searchView = (SearchView) this.f2236b;
                Editable text = searchView.F.getText();
                searchView.f2777o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2776n0 && !searchView.f2770g0 && isEmpty) {
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
