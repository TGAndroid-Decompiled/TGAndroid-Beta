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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.od;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Wallet.WalletEngine2;
public final class h2 implements TextWatcher {
    public final int f5155a;
    public final Object f5156b;

    public h2(Object obj, int i10) {
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
        String str2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j10;
        switch (this.f5155a) {
            case 0:
                k2 k2Var = (k2) this.f5156b;
                ImageView imageView = k2Var.f5311n;
                g2 g2Var = k2Var.d;
                if (!k2Var.f5312r) {
                    k2Var.d(false);
                    String obj = g2Var.getText().toString();
                    if (TextUtils.isEmpty(obj)) {
                        str = null;
                    } else {
                        str = obj;
                    }
                    Utilities.Callback2 callback2 = k2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    j2 j2Var = k2Var.f5310f;
                    if (j2Var != null) {
                        j2Var.G1(null);
                        k2Var.f5310f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (g2Var != null) {
                        g2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = g2Var.animate().translationX(0.0f);
                        hs hsVar = hs.h;
                        translationX.setInterpolator(hsVar).start();
                        if (imageView != null && k2Var.h != (!TextUtils.isEmpty(g2Var.getText()))) {
                            k2Var.h = !k2Var.h;
                            imageView.animate().cancel();
                            if (k2Var.h) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f12 = 0.7f;
                            if (k2Var.h) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f7);
                            if (k2Var.h) {
                                f12 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                            if (k2Var.h) {
                                f11 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new androidx.fragment.app.a0(this, 13)).setInterpolator(hsVar).setDuration(320L);
                            if (k2Var.h) {
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
                ((fi.p) this.f5156b).Y();
                return;
            case 2:
                hg.u0 u0Var = (hg.u0) this.f5156b;
                u0Var.f11408x = false;
                hg.n0 n0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(u0Var.f11403f.getText())) {
                    u0Var.f11409y = null;
                    u0Var.d.b();
                } else {
                    u0Var.f11408x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                u0Var.f11401c.W2.N(true);
                u0Var.b0();
                return;
            case 3:
                hg.e1 e1Var = (hg.e1) this.f5156b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.f11215y = editable.toString();
                    e1Var.U(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                od odVar = (od) this.f5156b;
                if (odVar.f5555f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                odVar.F(z10);
                return;
            case 6:
                ru ruVar = (ru) this.f5156b;
                i10 = ruVar.lineCount;
                if (i10 != ruVar.getLineCount()) {
                    z11 = ruVar.isInitLineCount;
                    if (!z11 && ruVar.getMeasuredWidth() > 0) {
                        i11 = ruVar.lineCount;
                        ruVar.onLineCountChanged(i11, ruVar.getLineCount());
                    }
                    ruVar.lineCount = ruVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((t1) this.f5156b).run();
                return;
            case 8:
                mz mzVar = (mz) this.f5156b;
                mzVar.g(false);
                yq yqVar = mzVar.d;
                String obj2 = yqVar.getText().toString();
                mzVar.c(obj2, true);
                lz lzVar = mzVar.f28978r;
                if (lzVar != null) {
                    lzVar.G1(null);
                    lzVar.H1(TextUtils.isEmpty(obj2), true);
                }
                mzVar.f(!TextUtils.isEmpty(obj2));
                if (yqVar != null) {
                    yqVar.clearAnimation();
                    yqVar.animate().translationX(0.0f).setInterpolator(hs.h).start();
                }
                mzVar.d(false);
                return;
            case 9:
                s20 s20Var = (s20) this.f5156b;
                if (!s20Var.F.isEmpty() && editable.length() > 0 && s20Var.I >= 0) {
                    s20Var.I = -1;
                    s20Var.f();
                }
                me.b bVar = s20Var.f30608a;
                if (!s20Var.f30613n && s20Var.f30614r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 10:
                te0 te0Var = (te0) this.f5156b;
                if (te0Var.f31168r.length() == 4 && SharedConfig.passcodeType == 0) {
                    te0Var.m(false);
                    return;
                }
                return;
            case 11:
                co0 co0Var = (co0) this.f5156b;
                ImageView imageView2 = co0Var.f25450c;
                g2 g2Var2 = co0Var.f25451e;
                boolean z18 = false;
                if (g2Var2.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float f13 = 0.0f;
                if (imageView2.getAlpha() != 0.0f) {
                    z18 = true;
                }
                if (z13 != z18) {
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
                co0Var.a(g2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bd0(this, 28));
                return;
            case 13:
                oz0 oz0Var = (oz0) this.f5156b;
                mz0 mz0Var = oz0Var.f29605c;
                if (mz0Var != null && mz0Var.getVisibility() == 0) {
                    oz0Var.e();
                    return;
                }
                return;
            case 14:
                s71 s71Var = (s71) this.f5156b;
                String obj3 = s71Var.J.getText().toString();
                t71 t71Var = s71Var.K;
                if (t71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = t71Var.d.getAdapter().h();
                }
                t71Var.H(obj3);
                if (TextUtils.isEmpty(obj3) && (w0Var = t71Var.d) != null) {
                    s4.i0 adapter = w0Var.getAdapter();
                    pm0 pm0Var = t71Var.f31078f;
                    if (adapter != pm0Var) {
                        ai.w0 w0Var2 = t71Var.d;
                        w0Var2.W1 = false;
                        w0Var2.X1 = 0;
                        w0Var2.setAdapter(pm0Var);
                        ai.w0 w0Var3 = t71Var.d;
                        w0Var3.W1 = true;
                        w0Var3.X1 = 0;
                        if (h == 0) {
                            t71Var.K(0);
                        }
                    }
                }
                t71Var.v.setVisibility(0);
                return;
            case 15:
                ((org.telegram.ui.Wallet.j8) this.f5156b).w0();
                return;
            case 16:
                final org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) this.f5156b;
                ArrayList arrayList = s8Var.f35494s;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = s8Var.J;
                String str3 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    s8Var.J = null;
                }
                boolean z19 = false;
                if (s8Var.f35497y != 0) {
                    s8Var.getConnectionsManager().cancelRequest(s8Var.f35497y, true);
                    s8Var.f35497y = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str2 = trim;
                } else {
                    str2 = null;
                }
                s8Var.f35495w = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str3 = lowerCase;
                    }
                }
                s8Var.f35496x = str3;
                final int i12 = s8Var.I + 1;
                s8Var.I = i12;
                if (!TextUtils.isEmpty(trim) && s8Var.f35495w == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                s8Var.K = z14;
                s8Var.v.g(null, true, false, false, false, 0L, false, 0, i12);
                d dVar = s8Var.V;
                if (dVar != null) {
                    if (s8Var.f35495w != null) {
                        z19 = true;
                    }
                    dVar.setEnabled(z19);
                }
                if (!TextUtils.isEmpty(trim) && s8Var.f35495w == null && s8Var.f35496x == null) {
                    s8Var.d0(trim);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    s8.Y(s8Var, trim, i12);
                                    return;
                                default:
                                    s8 s8Var2 = s8Var;
                                    s8Var2.J = null;
                                    gg.b2 b2Var = s8Var2.v;
                                    int i13 = i12;
                                    b2Var.h(trim, true, false, false, false, false, 0L, false, 0, i13, 0L, new r(s8Var2, i13, 3));
                                    return;
                            }
                        }
                    };
                    s8Var.J = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    s8Var.f26290a.W2.N(true);
                    final String str4 = s8Var.f35496x;
                    if (str4 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r4) {
                                    case 0:
                                        s8.Y(s8Var, str4, i12);
                                        return;
                                    default:
                                        s8 s8Var2 = s8Var;
                                        s8Var2.J = null;
                                        gg.b2 b2Var = s8Var2.v;
                                        int i13 = i12;
                                        b2Var.h(str4, true, false, false, false, false, 0L, false, 0, i13, 0L, new r(s8Var2, i13, 3));
                                        return;
                                }
                            }
                        };
                        s8Var.J = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                s8Var.i0(true);
                return;
            case 17:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.f5156b;
                if (h9Var.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && h9Var.b()) {
                    h9Var.setError(false);
                }
                h9Var.e();
                h9Var.d();
                if (h9Var.f35005a.hasFocus()) {
                    h9Var.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = h9Var.f35009f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f5156b;
                ImageView imageView3 = l0Var.J;
                if (editable.length() > 0 && l0Var.T) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z15, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.i4 i4Var = l0Var.B0;
                String lowerCase2 = obj4.toLowerCase();
                ai.s1 s1Var = i4Var.V0;
                if (s1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    i4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    i4Var.E.clear();
                    i4Var.F = lowerCase2;
                    i4Var.f38515u0[0].f39753c.f37774y.clear();
                    i4Var.d0(false);
                    if (i4Var.f38515u0[0].f()) {
                        if (i4Var.f38515u0[0].getWebView() != null) {
                            org.telegram.ui.web.y0 webView = i4Var.f38515u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(i4Var, 9);
                            webView.findAllAsync("");
                            i4Var.h0();
                        }
                    } else {
                        i4Var.f38515u0[0].f39752b.f1();
                        i4Var.W(0);
                    }
                    i4Var.W0 = -1;
                    return;
                }
                int i13 = i4Var.W0 + 1;
                i4Var.W0 = i13;
                if (i4Var.f38515u0[0].f()) {
                    i4Var.d0(true);
                    if (i4Var.f38515u0[0].getWebView() != null) {
                        org.telegram.ui.web.y0 webView2 = i4Var.f38515u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(i4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        i4Var.h0();
                        return;
                    }
                    return;
                }
                ai.s1 s1Var2 = new ai.s1(i4Var, lowerCase2, i13, 22);
                i4Var.V0 = s1Var2;
                AndroidUtilities.runOnUIThread(s1Var2, 400L);
                return;
            case 19:
                qh.c cVar = (qh.c) this.f5156b;
                int length = cVar.f46663a.getText().length();
                me.b bVar2 = cVar.H;
                int i14 = cVar.f46672x;
                if (length > (i14 * 7) / 10) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar2.a(z16, true);
                me.b bVar3 = cVar.I;
                if (length > i14) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                bVar3.a(z17, true);
                cVar.f46667f.l(Integer.toString(i14 - length), false);
                return;
            case 20:
                th.f fVar = (th.f) this.f5156b;
                fVar.K();
                fVar.f48468c0 = editable.toString();
                fVar.f48469d0.N(true);
                return;
            case 21:
                vg.k kVar = ((vg.l) this.f5156b).f49602c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    tg.a0 a0Var = ((tg.u) kVar).f48414a;
                    a0Var.f48286v0 = trim2;
                    a0Var.b0(false, false);
                    a0Var.b0(true, true);
                    return;
                }
                return;
            default:
                yh.g gVar = (yh.g) this.f5156b;
                yh.b bVar4 = gVar.f52568n0;
                TLRPC.TL_payments_starsRevenueStats h10 = yh.o.g(yh.g.d0(gVar)).h(gVar.f52552b, false);
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
                int i15 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                boolean z20 = true;
                if (i15 > 0) {
                    gVar.P = j10;
                    gVar.N = true;
                    gVar.Q.setText(Long.toString(j10));
                    fi.o oVar = gVar.Q;
                    oVar.setSelection(oVar.getText().length());
                    gVar.N = false;
                }
                if (gVar.P != j10) {
                    z20 = false;
                }
                gVar.O = z20;
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
                te0 te0Var = (te0) this.f5156b;
                LinkedList linkedList = te0Var.R;
                LinkedList linkedList2 = te0Var.Q;
                Drawable drawable = te0Var.f31158a;
                if (drawable instanceof cd0) {
                    cd0 cd0Var = (cd0) drawable;
                    cd0Var.D = null;
                    cd0Var.z();
                    float f7 = cd0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        cd0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        cd0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            te0Var.b(cd0Var);
                            return;
                        }
                        linkedList2.offer(new x0(this, z10, cd0Var, 22));
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
            case 19:
            case 20:
            case 21:
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
                searchView.f2262o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f2261n0 && !searchView.f2255g0 && isEmpty) {
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
