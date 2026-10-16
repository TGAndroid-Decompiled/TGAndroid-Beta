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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class h2 implements TextWatcher {
    public final int f6992a;
    public final Object f6993b;

    public h2(Object obj, int i10) {
        this.f6992a = i10;
        this.f6993b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        float f7;
        long j10;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        float f10;
        int h;
        bi.o0 o0Var;
        String str2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j11;
        switch (this.f6992a) {
            case 0:
                k2 k2Var = (k2) this.f6993b;
                ImageView imageView = k2Var.f7162n;
                g2 g2Var = k2Var.d;
                if (!k2Var.f7163r) {
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
                    j2 j2Var = k2Var.f7161f;
                    if (j2Var != null) {
                        j2Var.G1(null);
                        k2Var.f7161f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (g2Var != null) {
                        g2Var.animate().cancel();
                        float f11 = 0.0f;
                        ViewPropertyAnimator translationX = g2Var.animate().translationX(0.0f);
                        es esVar = es.h;
                        translationX.setInterpolator(esVar).start();
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
                            ViewPropertyAnimator duration = scaleY.alpha(f11).withEndAction(new bi.la(this, 22)).setInterpolator(esVar).setDuration(320L);
                            if (k2Var.h) {
                                j10 = 240;
                            } else {
                                j10 = 0;
                            }
                            duration.setStartDelay(j10).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((gi.p) this.f6993b).Y();
                return;
            case 2:
                ig.u0 u0Var = (ig.u0) this.f6993b;
                u0Var.f11659x = false;
                ig.m0 m0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                if (TextUtils.isEmpty(u0Var.f11654f.getText())) {
                    u0Var.f11660y = null;
                    u0Var.d.b();
                } else {
                    u0Var.f11659x = true;
                    AndroidUtilities.runOnUIThread(m0Var, 800L);
                }
                u0Var.f11653c.W2.N(true);
                u0Var.b0();
                return;
            case 3:
                ig.e1 e1Var = (ig.e1) this.f6993b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.f11492y = editable.toString();
                    e1Var.U(true);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                md mdVar = (md) this.f6993b;
                if (mdVar.f7385f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mdVar.F(z10);
                return;
            case 6:
                nu nuVar = (nu) this.f6993b;
                i10 = nuVar.lineCount;
                if (i10 != nuVar.getLineCount()) {
                    z11 = nuVar.isInitLineCount;
                    if (!z11 && nuVar.getMeasuredWidth() > 0) {
                        i11 = nuVar.lineCount;
                        nuVar.onLineCountChanged(i11, nuVar.getLineCount());
                    }
                    nuVar.lineCount = nuVar.getLineCount();
                    return;
                }
                return;
            case 7:
                ((t1) this.f6993b).run();
                return;
            case 8:
                iz izVar = (iz) this.f6993b;
                izVar.g(false);
                vq vqVar = izVar.d;
                String obj2 = vqVar.getText().toString();
                izVar.c(obj2, true);
                hz hzVar = izVar.f25825r;
                if (hzVar != null) {
                    hzVar.G1(null);
                    hzVar.H1(TextUtils.isEmpty(obj2), true);
                }
                izVar.f(!TextUtils.isEmpty(obj2));
                if (vqVar != null) {
                    vqVar.clearAnimation();
                    vqVar.animate().translationX(0.0f).setInterpolator(es.h).start();
                }
                izVar.d(false);
                return;
            case 9:
                o20 o20Var = (o20) this.f6993b;
                if (!o20Var.F.isEmpty() && editable.length() > 0 && o20Var.I >= 0) {
                    o20Var.I = -1;
                    o20Var.f();
                }
                ne.b bVar = o20Var.f27505a;
                if (!o20Var.f27509n && o20Var.f27510r.length() <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                bVar.a(z12, true);
                return;
            case 10:
                re0 re0Var = (re0) this.f6993b;
                if (re0Var.f28510r.length() == 4 && SharedConfig.passcodeType == 0) {
                    re0Var.m(false);
                    return;
                }
                return;
            case 11:
                yn0 yn0Var = (yn0) this.f6993b;
                ImageView imageView2 = yn0Var.f31338c;
                g2 g2Var2 = yn0Var.e;
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
                yn0Var.a(g2Var2.getText().toString());
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new yc0(this, 29));
                return;
            case 13:
                lz0 lz0Var = (lz0) this.f6993b;
                jz0 jz0Var = lz0Var.f26851c;
                if (jz0Var != null && jz0Var.getVisibility() == 0) {
                    lz0Var.e();
                    return;
                }
                return;
            case 14:
                q71 q71Var = (q71) this.f6993b;
                String obj3 = q71Var.J.getText().toString();
                r71 r71Var = q71Var.K;
                if (r71Var.d.getAdapter() == null) {
                    h = 0;
                } else {
                    h = r71Var.d.getAdapter().h();
                }
                r71Var.H(obj3);
                if (TextUtils.isEmpty(obj3) && (o0Var = r71Var.d) != null) {
                    s4.g0 adapter = o0Var.getAdapter();
                    lm0 lm0Var = r71Var.f28460f;
                    if (adapter != lm0Var) {
                        bi.o0 o0Var2 = r71Var.d;
                        o0Var2.W1 = false;
                        o0Var2.X1 = 0;
                        o0Var2.setAdapter(lm0Var);
                        bi.o0 o0Var3 = r71Var.d;
                        o0Var3.W1 = true;
                        o0Var3.X1 = 0;
                        if (h == 0) {
                            r71Var.K(0);
                        }
                    }
                }
                r71Var.v.setVisibility(0);
                return;
            case 15:
                ((org.telegram.ui.Wallet.j8) this.f6993b).w0();
                return;
            case 16:
                final org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) this.f6993b;
                ArrayList arrayList = s8Var.f33438s;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = s8Var.J;
                String str3 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    s8Var.J = null;
                }
                boolean z19 = false;
                if (s8Var.f33441y != 0) {
                    s8Var.getConnectionsManager().cancelRequest(s8Var.f33441y, true);
                    s8Var.f33441y = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim)) {
                    str2 = trim;
                } else {
                    str2 = null;
                }
                s8Var.f33439w = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str3 = lowerCase;
                    }
                }
                s8Var.f33440x = str3;
                final int i12 = s8Var.I + 1;
                s8Var.I = i12;
                if (!TextUtils.isEmpty(trim) && s8Var.f33439w == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                s8Var.K = z14;
                s8Var.v.g(null, true, false, false, false, 0L, false, 0, i12);
                d dVar = s8Var.V;
                if (dVar != null) {
                    if (s8Var.f33439w != null) {
                        z19 = true;
                    }
                    dVar.setEnabled(z19);
                }
                if (!TextUtils.isEmpty(trim) && s8Var.f33439w == null && s8Var.f33440x == null) {
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
                                    hg.a2 a2Var = s8Var2.v;
                                    int i13 = i12;
                                    a2Var.h(trim, true, false, false, false, false, 0L, false, 0, i13, 0L, new i(s8Var2, i13, 4));
                                    return;
                            }
                        }
                    };
                    s8Var.J = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    s8Var.f24003a.W2.N(true);
                    final String str4 = s8Var.f33440x;
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
                                        hg.a2 a2Var = s8Var2.v;
                                        int i13 = i12;
                                        a2Var.h(str4, true, false, false, false, false, 0L, false, 0, i13, 0L, new i(s8Var2, i13, 4));
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
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.f6993b;
                if (h9Var.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && h9Var.b()) {
                    h9Var.setError(false);
                }
                h9Var.e();
                h9Var.d();
                if (h9Var.f32990a.hasFocus()) {
                    h9Var.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = h9Var.f32993f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.m0 m0Var2 = (org.telegram.ui.m0) this.f6993b;
                ImageView imageView3 = m0Var2.J;
                if (editable.length() > 0 && m0Var2.T) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AndroidUtilities.updateViewShow(imageView3, z15, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.k4 k4Var = m0Var2.B0;
                String lowerCase2 = obj4.toLowerCase();
                ah.o oVar = k4Var.V0;
                if (oVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(oVar);
                    k4Var.V0 = null;
                }
                if (TextUtils.isEmpty(lowerCase2)) {
                    k4Var.E.clear();
                    k4Var.F = lowerCase2;
                    k4Var.f37278u0[0].f38530c.f36716y.clear();
                    k4Var.d0(false);
                    if (k4Var.f37278u0[0].f()) {
                        if (k4Var.f37278u0[0].getWebView() != null) {
                            org.telegram.ui.web.z0 webView = k4Var.f37278u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(k4Var, 9);
                            webView.findAllAsync("");
                            k4Var.h0();
                        }
                    } else {
                        k4Var.f37278u0[0].f38529b.f1();
                        k4Var.W(0);
                    }
                    k4Var.W0 = -1;
                    return;
                }
                int i13 = k4Var.W0 + 1;
                k4Var.W0 = i13;
                if (k4Var.f37278u0[0].f()) {
                    k4Var.d0(true);
                    if (k4Var.f37278u0[0].getWebView() != null) {
                        org.telegram.ui.web.z0 webView2 = k4Var.f37278u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(k4Var, 9);
                        webView2.findAllAsync(lowerCase2);
                        k4Var.h0();
                        return;
                    }
                    return;
                }
                ah.o oVar2 = new ah.o(k4Var, lowerCase2, i13, 23);
                k4Var.V0 = oVar2;
                AndroidUtilities.runOnUIThread(oVar2, 400L);
                return;
            case 19:
                rh.c cVar = (rh.c) this.f6993b;
                int length = cVar.f44411a.getText().length();
                ne.b bVar2 = cVar.H;
                int i14 = cVar.f44419x;
                if (length > (i14 * 7) / 10) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar2.a(z16, true);
                ne.b bVar3 = cVar.I;
                if (length > i14) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                bVar3.a(z17, true);
                cVar.f44414f.l(Integer.toString(i14 - length), false);
                return;
            case 20:
                uh.f fVar = (uh.f) this.f6993b;
                fVar.K();
                fVar.f46447c0 = editable.toString();
                fVar.f46448d0.N(true);
                return;
            case 21:
                wg.k kVar = ((wg.l) this.f6993b).f47590c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    ug.a0 a0Var = ((ug.u) kVar).f46394a;
                    a0Var.f46273v0 = trim2;
                    a0Var.b0(false, false);
                    a0Var.b0(true, true);
                    return;
                }
                return;
            default:
                zh.g gVar = (zh.g) this.f6993b;
                zh.b bVar4 = gVar.f50559n0;
                TLRPC.TL_payments_starsRevenueStats h10 = zh.p.g(zh.g.d0(gVar)).h(gVar.f50544b, false);
                long j12 = 0;
                if (h10 == null) {
                    j11 = 0;
                } else {
                    j11 = h10.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j12 = Long.parseLong(editable.toString());
                }
                gVar.P = j12;
                int i15 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
                boolean z20 = true;
                if (i15 > 0) {
                    gVar.P = j11;
                    gVar.N = true;
                    gVar.Q.setText(Long.toString(j11));
                    gi.o oVar3 = gVar.Q;
                    oVar3.setSelection(oVar3.getText().length());
                    gVar.N = false;
                }
                if (gVar.P != j11) {
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
        switch (this.f6992a) {
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
                re0 re0Var = (re0) this.f6993b;
                LinkedList linkedList = re0Var.R;
                LinkedList linkedList2 = re0Var.Q;
                Drawable drawable = re0Var.f28501a;
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
                            re0Var.b(cd0Var);
                            return;
                        }
                        linkedList2.offer(new x0(this, z10, cd0Var, 21));
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
        switch (this.f6992a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                SearchView searchView = (SearchView) this.f6993b;
                Editable text = searchView.F.getText();
                searchView.f1162o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.f1161n0 && !searchView.f1155g0 && isEmpty) {
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
