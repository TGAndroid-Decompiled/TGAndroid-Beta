package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.i9;
import c8.ja;
import di.k8;
import di.m8;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class i4 extends FrameLayout implements is {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final fp G;
    public final FrameLayout H;
    public int I;
    public m60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public ri.q O;
    public boolean P;
    public int Q;
    public final t2 R;
    public final te.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.e2 f3607a;
    public final int f3608b;
    public final long f3609c;
    public final m8 d;
    public final k8 f3610e;
    public final org.telegram.ui.ActionBar.e6 f3611f;
    public final f3 h;
    public final v61 f3612n;
    public final FrameLayout f3613r;
    public final SpannableStringBuilder f3614s;
    public final SpannableStringBuilder f3615w;
    public final hi.d f3616x;
    public int f3617y;

    public i4(org.telegram.ui.ActionBar.e2 r27, android.content.Context r28, int r29, long r30, org.telegram.ui.ActionBar.e6 r32, dh.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i4.<init>(org.telegram.ui.ActionBar.e2, android.content.Context, int, long, org.telegram.ui.ActionBar.e6, dh.c):void");
    }

    public static void j(org.telegram.ui.ActionBar.z0 z0Var, m8 m8Var, Runnable runnable, int i7) {
        z0Var.setOnClickListener(new x2(m8Var, i7, runnable, 0));
        z0Var.setOnLongClickListener(new y2(m8Var, i7, runnable));
    }

    public final void a() {
        m8 m8Var;
        c4 currentPage = getCurrentPage();
        if (currentPage != null && (m8Var = currentPage.f3412e) != null && currentPage.d) {
            int i7 = m8Var.d;
            new e6(this.f3607a, this.f3609c, i7, new w2(this, i7, currentPage, 0)).show();
        }
    }

    public final boolean b() {
        k8 k8Var = this.f3610e;
        if (!k8Var.h() || k8Var.d().size() >= ((org.telegram.messenger.j0) np.s1(this.f3608b).f25448y7.f25866t.f15881b).f24493c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j3 = this.f3609c;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f3608b;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != m10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.t3.w(5, np.s1(i10).M0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        if (this.f3609c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        int i13 = ns.G3;
        LinearLayout linearLayout = this.E;
        hi.d dVar = this.f3616x;
        long j3 = this.f3609c;
        int i14 = 8;
        if (i7 == i13) {
            if (((Long) objArr[0]).longValue() == j3) {
                if (d()) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                dVar.setVisibility(i12);
                if (d()) {
                    i14 = 0;
                }
                linearLayout.setVisibility(i14);
                this.f3617y = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                }
            }
        } else if (i7 == ns.H3) {
            if (((Long) objArr[0]).longValue() == j3) {
                f(true);
                o();
            }
        } else if (i7 == ns.f25559r) {
            if (d()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            dVar.setVisibility(i11);
            if (d()) {
                i14 = 0;
            }
            linearLayout.setVisibility(i14);
            this.f3617y = 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.f3610e.d();
            int i7 = 0;
            while (true) {
                if (i7 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i7)).collection_id == this.Q) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i7);
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i7 >= 0 && tL_starGiftCollection != null) {
                this.Q = 0;
                this.f3612n.d(tL_starGiftCollection.collection_id, i7 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        f3 f3Var = this.h;
        if (f3Var != null && this.f3612n != null) {
            f3Var.k(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        c4 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f3613r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.k5.z(this.f3617y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.f3617y));
        }
        return (int) (org.telegram.messenger.g0.L(this.f3617y) - translationY);
    }

    public m8 getCurrentList() {
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3412e;
        }
        return this.d;
    }

    public uj0 getCurrentListView() {
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3413f;
        }
        return null;
    }

    public c4 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (c4) currentView;
    }

    public int getGiftsCount() {
        int i7;
        m8 m8Var;
        int i10;
        c4 currentPage = getCurrentPage();
        m8 m8Var2 = this.d;
        if (currentPage != null && (m8Var = currentPage.f3412e) != m8Var2) {
            if (m8Var != null && (i10 = m8Var.f9053n) > 0) {
                return i10;
            }
        } else if (m8Var2 != null && (i7 = m8Var2.f9053n) > 0) {
            return i7;
        }
        long j3 = this.f3609c;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.f3608b;
        if (i11 >= 0) {
            TLRPC.UserFull b22 = np.s1(i12).b2(j3);
            if (b22 == null) {
                return 0;
            }
            return b22.stargifts_count;
        }
        TLRPC.ChatFull N0 = np.s1(i12).N0(-j3);
        if (N0 == null) {
            return 0;
        }
        return N0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        m8 m8Var = this.d;
        if (m8Var != null && !m8Var.f9051l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < m8Var.f9051l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) m8Var.f9051l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f28057id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f28057id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        f3 f3Var = this.h;
        float f10 = 0.0f;
        if (f3Var.getViewPages() != null) {
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    f10 = (((c4) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        v61 v61Var = this.f3612n;
        if (v61Var != null) {
            return v61Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, z10 z10Var) {
        View view;
        int i7;
        i60 i60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        org.telegram.ui.ActionBar.e6 e6Var = this.f3611f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        if (str != null) {
            t1Var.S = hd.M0(2131750215, null);
        } else {
            t1Var.S = hd.M0(2131750095, null);
            t1Var.U = hd.M0(2131750096, null);
        }
        j3 j3Var = new j3(this, context, e6Var);
        j3Var.f32539s0 = true;
        j3Var.setOnEditorActionListener(new k3(j3Var, z10Var, t1VarArr, view, 0));
        si.b0(this.f3608b).M(org.telegram.messenger.g0.G0(), true);
        j3Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(j3Var, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        org.telegram.ui.ActionBar.q6.l(j3Var, 34, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        j3Var.setHintText(hd.M0(2131750097, null));
        j3Var.setFocusable(true);
        j3Var.setInputType(147457);
        org.telegram.ui.ActionBar.q6.F(j3Var, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, e6Var);
        j3Var.setImeOptions(6);
        j3Var.setBackgroundDrawable(null);
        j3Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        j3Var.addTextChangedListener(new l3(0, j3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j3Var.setText(str);
        linearLayout.addView(j3Var, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.f29614a = org.telegram.messenger.g0.L(292.0f);
        if (str != null) {
            i7 = 2131751335;
        } else {
            i7 = 2131751753;
        }
        alertDialog$Builder.k(hd.M0(i7, null), new ab.g(4, j3Var, z10Var));
        alertDialog$Builder.h(hd.M0(2131752589, null), new a3.l(20));
        t1VarArr[0] = t1Var;
        m60 m60Var = this.J;
        if (m60Var != null && (i60Var = m60Var.f37101m) != null) {
            i60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Z2(W, this.f3607a.getClassGuid());
        t1VarArr[0].setOnDismissListener(new k(this, j3Var, W, 1));
        t1VarArr[0].setOnShowListener(new l(j3Var, 1));
        t1VarArr[0].show();
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.f29639k0 = false;
        t1Var2.d(-1);
        j3Var.setSelection(j3Var.getText().length());
    }

    public final void i() {
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i7) {
        m8 m8Var;
        if (i7 == 0) {
            return false;
        }
        int i10 = i7 - 1;
        if (i10 >= 0) {
            k8 k8Var = this.f3610e;
            if (i10 < k8Var.d().size()) {
                if (i10 >= 0 && i10 < k8Var.d().size()) {
                    m8Var = k8Var.e(((TL_stars.TL_starGiftCollection) k8Var.d().get(i10)).collection_id);
                } else {
                    m8Var = null;
                }
                if (m8Var != null) {
                    return m8Var.f9051l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f10;
        float f11;
        float nextPositionAlpha;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        cb cbVar;
        f3 f3Var = this.h;
        if (f3Var != null) {
            if (f3Var.getCurrentPosition() == f3Var.getNextPosition()) {
                if (k(f3Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(f3Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = f3Var.getCurrentPositionAlpha() * f10;
                if (k(f3Var.getNextPosition())) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (f3Var.getNextPositionAlpha() * f11) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f3613r;
            float z11 = org.telegram.messenger.k5.z(this.f3617y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z11;
            int i7 = 0;
            if (this.U > org.telegram.messenger.g0.L(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            te.a aVar = this.S;
            aVar.a(z10, true);
            float f12 = aVar.f57081e;
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z11, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z11, f12);
            float f13 = (1.0f - nextPositionAlpha) * f12;
            this.H.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f12) - org.telegram.messenger.g0.L(200.0f));
            frameLayout.setTranslationY(T1 - this.T);
            frameLayout.setAlpha(f13);
            if (f13 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            if (this.f3610e.h() && f3Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.f3615w;
            } else {
                spannableStringBuilder = this.f3614s;
            }
            this.f3616x.i(spannableStringBuilder, true, true);
            xb xbVar = xb.f41635w;
            if (xbVar != null && (cbVar = xbVar.f41639e) != null) {
                cbVar.updatePosition();
            }
        }
    }

    public final void m() {
        hi.d dVar = this.f3616x;
        dVar.updateColors();
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.e6 e6Var = this.f3611f;
        int h12 = ((wp0) this).W.h1(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        if (dVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != h12) {
                org.telegram.ui.ActionBar.j6.C1(h12, dVar.getBackground());
                dVar.invalidate();
            }
        } else {
            dVar.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(19.0f), h12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    c4 c4Var = (c4) view;
                    org.telegram.ui.ActionBar.e6 e6Var2 = c4Var.f3411c;
                    if (c4Var.f3415r != null) {
                        c4Var.f3417w.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var2));
                        c4Var.f3418x.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var2));
                    } else {
                        c4Var.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var2));
                        c4Var.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, e6Var2));
                        c4Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, e6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof c4) {
                c4 c4Var = (c4) view;
                v3 v3Var = c4Var.f3413f;
                int paddingTop = v3Var.getPaddingTop();
                c4Var.g();
                int paddingTop2 = paddingTop - v3Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(v3Var, new d3(c4Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10;
        View[] viewPages;
        if (this.f3610e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        f3 f3Var = this.h;
        if (f3Var.getViewPages() != null) {
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    ((c4) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f3608b;
        ns.f(i7).c(this, ns.G3);
        ns.f(i7).c(this, ns.H3);
        ns.f(i7).c(this, ns.f25559r);
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        m8 m8Var = this.d;
        if (m8Var != null) {
            m8Var.f9054o = true;
            m8Var.a();
        }
        k8 k8Var = this.f3610e;
        if (k8Var != null) {
            k8Var.f8927j = true;
            k8Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        c4 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.f3608b;
        ns.f(i7).n(this, ns.G3);
        ns.f(i7).n(this, ns.H3);
        ns.f(i7).n(this, ns.f25559r);
        m8 m8Var = this.d;
        if (m8Var != null) {
            m8Var.f9054o = false;
        }
        k8 k8Var = this.f3610e;
        if (k8Var != null) {
            k8Var.f8927j = false;
        }
    }

    public final void p() {
        float f10;
        View[] viewPages;
        float f11;
        v61 v61Var = this.f3612n;
        if (v61Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        v61Var.setTranslationY(min);
        v61Var.setScaleX(T1);
        v61Var.setScaleY(T1);
        f3 f3Var = this.h;
        if (f3Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    if (((c4) view).I) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    f10 += f11;
                }
            }
        } else {
            f10 = 0.0f;
        }
        v61Var.setAlpha(i9.a(f10, 0.0f, 1.0f) * l10);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i7) {
        if (this.T != i7) {
            this.T = i7;
            l();
        }
    }

    public void setGlassEngine(ri.q qVar) {
        View[] viewPages;
        this.O = qVar;
        f3 f3Var = this.h;
        qVar.c(f3Var);
        for (View view : f3Var.getViewPages()) {
            if (view instanceof c4) {
                qVar.b(((c4) view).f3413f);
            }
        }
    }

    public void setPaddingTop(int i7) {
        if (this.L != i7) {
            this.L = i7;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z10) {
        c4 currentPage = getCurrentPage();
        if (currentPage != null) {
            c4.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            q(g());
            this.f3612n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.W4(false);
                    org.telegram.messenger.g0.h3(new e3(profileActivity, 0));
                }
            }
            if (!z10) {
                t2 t2Var = this.R;
                org.telegram.messenger.g0.r(t2Var);
                org.telegram.messenger.g0.h3(t2Var);
            }
        }
    }

    public void setVisibleHeight(int i7) {
        View[] viewPages;
        this.U = i7;
        l();
        f3 f3Var = this.h;
        if (f3Var != null) {
            for (View view : f3Var.getViewPages()) {
                if (view instanceof c4) {
                    ((c4) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
