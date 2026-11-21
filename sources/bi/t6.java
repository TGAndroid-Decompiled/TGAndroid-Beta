package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.l9;
import c8.ma;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.t60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class t6 extends FrameLayout implements fs {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final op G;
    public final FrameLayout H;
    public int I;
    public a70 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public ri.q O;
    public boolean P;
    public int Q;
    public final f5 R;
    public final te.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.g2 f4114a;
    public final int f4115b;
    public final long f4116c;
    public final di.p8 d;
    public final di.n8 f4117e;
    public final org.telegram.ui.ActionBar.h6 f4118f;
    public final q5 h;
    public final i71 f4119n;
    public final FrameLayout f4120r;
    public final SpannableStringBuilder f4121s;
    public final SpannableStringBuilder f4122w;
    public final hi.e f4123x;
    public int f4124y;

    public t6(org.telegram.ui.ActionBar.g2 r27, android.content.Context r28, int r29, long r30, org.telegram.ui.ActionBar.h6 r32, dh.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: bi.t6.<init>(org.telegram.ui.ActionBar.g2, android.content.Context, int, long, org.telegram.ui.ActionBar.h6, dh.c):void");
    }

    public static void j(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, Runnable runnable, int i7) {
        y0Var.setOnClickListener(new i5(p8Var, i7, runnable, 0));
        y0Var.setOnLongClickListener(new j5(p8Var, i7, runnable));
    }

    public final void a() {
        di.p8 p8Var;
        n6 currentPage = getCurrentPage();
        if (currentPage != null && (p8Var = currentPage.f3947e) != null && currentPage.d) {
            int i7 = p8Var.d;
            new o8(this.f4114a, this.f4116c, i7, new h5(this, i7, currentPage, 0)).show();
        }
    }

    public final boolean b() {
        di.n8 n8Var = this.f4117e;
        if (!n8Var.h() || n8Var.d().size() >= ((org.telegram.messenger.j0) mp.u1(this.f4115b).A7.f26201y.f15505b).f24792c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j3 = this.f4116c;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f4115b;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != j10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.v3.w(5, mp.u1(i10).O0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        if (this.f4116c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        int i13 = ks.I3;
        LinearLayout linearLayout = this.E;
        hi.e eVar = this.f4123x;
        long j3 = this.f4116c;
        int i14 = 8;
        if (i7 == i13) {
            if (((Long) objArr[0]).longValue() == j3) {
                if (d()) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                eVar.setVisibility(i12);
                if (d()) {
                    i14 = 0;
                }
                linearLayout.setVisibility(i14);
                this.f4124y = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                }
            }
        } else if (i7 == ks.J3) {
            if (((Long) objArr[0]).longValue() == j3) {
                f(true);
                o();
            }
        } else if (i7 == ks.f25205r) {
            if (d()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            eVar.setVisibility(i11);
            if (d()) {
                i14 = 0;
            }
            linearLayout.setVisibility(i14);
            this.f4124y = 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.f4117e.d();
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
                this.f4119n.e(tL_starGiftCollection.collection_id, i7 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        q5 q5Var = this.h;
        if (q5Var != null && this.f4119n != null) {
            q5Var.j(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        n6 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f4120r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.f3.z(this.f4124y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.f4124y));
        }
        return (int) (org.telegram.messenger.g0.L(this.f4124y) - translationY);
    }

    public di.p8 getCurrentList() {
        n6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3947e;
        }
        return this.d;
    }

    public ek0 getCurrentListView() {
        n6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3948f;
        }
        return null;
    }

    public n6 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (n6) currentView;
    }

    public int getGiftsCount() {
        int i7;
        di.p8 p8Var;
        int i10;
        n6 currentPage = getCurrentPage();
        di.p8 p8Var2 = this.d;
        if (currentPage != null && (p8Var = currentPage.f3947e) != p8Var2) {
            if (p8Var != null && (i10 = p8Var.f9551n) > 0) {
                return i10;
            }
        } else if (p8Var2 != null && (i7 = p8Var2.f9551n) > 0) {
            return i7;
        }
        long j3 = this.f4116c;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.f4115b;
        if (i11 >= 0) {
            TLRPC.UserFull d2 = mp.u1(i12).d2(j3);
            if (d2 == null) {
                return 0;
            }
            return d2.stargifts_count;
        }
        TLRPC.ChatFull P0 = mp.u1(i12).P0(-j3);
        if (P0 == null) {
            return 0;
        }
        return P0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        di.p8 p8Var = this.d;
        if (p8Var != null && !p8Var.f9549l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < p8Var.f9549l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) p8Var.f9549l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f28437id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f28437id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        q5 q5Var = this.h;
        float f10 = 0.0f;
        if (q5Var.getViewPages() != null) {
            for (View view : q5Var.getViewPages()) {
                if (view instanceof n6) {
                    f10 = (((n6) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        i71 i71Var = this.f4119n;
        if (i71Var != null) {
            return i71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, x10 x10Var) {
        View view;
        int i7;
        t60 t60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        org.telegram.ui.ActionBar.h6 h6Var = this.f4118f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
        if (str != null) {
            t1Var.S = gd.N0(2131750198, null);
        } else {
            t1Var.S = gd.N0(2131750078, null);
            t1Var.U = gd.N0(2131750079, null);
        }
        u5 u5Var = new u5(this, context, h6Var);
        u5Var.f32969s0 = true;
        u5Var.setOnEditorActionListener(new v5(u5Var, x10Var, t1VarArr, view, 0));
        ri.d0(this.f4115b).O(org.telegram.messenger.g0.G0(), true);
        u5Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.U(u5Var, org.telegram.ui.ActionBar.m6.f29486j5, h6Var);
        org.telegram.ui.ActionBar.t6.l(u5Var, 34, org.telegram.ui.ActionBar.m6.Oi, h6Var);
        u5Var.setHintText(gd.N0(2131750080, null));
        u5Var.setFocusable(true);
        u5Var.setInputType(147457);
        org.telegram.ui.ActionBar.t6.F(u5Var, org.telegram.ui.ActionBar.m6.f29507k6, org.telegram.ui.ActionBar.m6.f29525l6, org.telegram.ui.ActionBar.m6.f29599p7, h6Var);
        u5Var.setImeOptions(6);
        u5Var.setBackgroundDrawable(null);
        u5Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        u5Var.addTextChangedListener(new w5(0, u5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        u5Var.setText(str);
        linearLayout.addView(u5Var, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.f30007a = org.telegram.messenger.g0.L(292.0f);
        if (str != null) {
            i7 = 2131751323;
        } else {
            i7 = 2131751741;
        }
        alertDialog$Builder.k(gd.N0(i7, null), new ab.g(3, u5Var, x10Var));
        alertDialog$Builder.h(gd.N0(2131752577, null), new a3.l(21));
        t1VarArr[0] = t1Var;
        a70 a70Var = this.J;
        if (a70Var != null && (t60Var = a70Var.f33373m) != null) {
            t60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Y2(W, this.f4114a.getClassGuid());
        t1VarArr[0].setOnDismissListener(new k(this, u5Var, W, 1));
        t1VarArr[0].setOnShowListener(new l(u5Var, 1));
        t1VarArr[0].show();
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.f30032k0 = false;
        t1Var2.d(-1);
        u5Var.setSelection(u5Var.getText().length());
    }

    public final void i() {
        n6 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i7) {
        di.p8 p8Var;
        if (i7 == 0) {
            return false;
        }
        int i10 = i7 - 1;
        if (i10 >= 0) {
            di.n8 n8Var = this.f4117e;
            if (i10 < n8Var.d().size()) {
                if (i10 >= 0 && i10 < n8Var.d().size()) {
                    p8Var = n8Var.e(((TL_stars.TL_starGiftCollection) n8Var.d().get(i10)).collection_id);
                } else {
                    p8Var = null;
                }
                if (p8Var != null) {
                    return p8Var.f9549l.isEmpty();
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
        lb lbVar;
        q5 q5Var = this.h;
        if (q5Var != null) {
            if (q5Var.getCurrentPosition() == q5Var.getNextPosition()) {
                if (k(q5Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(q5Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = q5Var.getCurrentPositionAlpha() * f10;
                if (k(q5Var.getNextPosition())) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (q5Var.getNextPositionAlpha() * f11) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f4120r;
            float z11 = org.telegram.messenger.f3.z(this.f4124y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z11;
            int i7 = 0;
            if (this.U > org.telegram.messenger.g0.L(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            te.a aVar = this.S;
            aVar.a(z10, true);
            float f12 = aVar.f57696e;
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z11, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z11, f12);
            float f13 = (1.0f - nextPositionAlpha) * f12;
            this.H.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f12) - org.telegram.messenger.g0.L(200.0f));
            frameLayout.setTranslationY(T1 - this.T);
            frameLayout.setAlpha(f13);
            if (f13 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            if (this.f4117e.h() && q5Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.f4122w;
            } else {
                spannableStringBuilder = this.f4121s;
            }
            this.f4123x.i(spannableStringBuilder, true, true);
            gc gcVar = gc.f35500w;
            if (gcVar != null && (lbVar = gcVar.f35504e) != null) {
                lbVar.updatePosition();
            }
        }
    }

    public final void m() {
        hi.e eVar = this.f4123x;
        eVar.updateColors();
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.h6 h6Var = this.f4118f;
        int h12 = ((gq0) this).W.h1(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        if (eVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) eVar.getBackground()).getPaint().getColor() != h12) {
                org.telegram.ui.ActionBar.m6.C1(h12, eVar.getBackground());
                eVar.invalidate();
            }
        } else {
            eVar.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(19.0f), h12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    n6 n6Var = (n6) view;
                    org.telegram.ui.ActionBar.h6 h6Var2 = n6Var.f3946c;
                    if (n6Var.f3950r != null) {
                        n6Var.f3952w.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var2));
                        n6Var.f3953x.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var2));
                    } else {
                        n6Var.F.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var2));
                        n6Var.G.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29770y6, h6Var2));
                        n6Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29486j5, h6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof n6) {
                n6 n6Var = (n6) view;
                g6 g6Var = n6Var.f3948f;
                int paddingTop = g6Var.getPaddingTop();
                n6Var.g();
                int paddingTop2 = paddingTop - g6Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(g6Var, new o5(n6Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10;
        View[] viewPages;
        if (this.f4117e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        q5 q5Var = this.h;
        if (q5Var.getViewPages() != null) {
            for (View view : q5Var.getViewPages()) {
                if (view instanceof n6) {
                    ((n6) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f4115b;
        ks.f(i7).c(this, ks.I3);
        ks.f(i7).c(this, ks.J3);
        ks.f(i7).c(this, ks.f25205r);
        n6 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        di.p8 p8Var = this.d;
        if (p8Var != null) {
            p8Var.f9552o = true;
            p8Var.a();
        }
        di.n8 n8Var = this.f4117e;
        if (n8Var != null) {
            n8Var.f9410j = true;
            n8Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        n6 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.f4115b;
        ks.f(i7).n(this, ks.I3);
        ks.f(i7).n(this, ks.J3);
        ks.f(i7).n(this, ks.f25205r);
        di.p8 p8Var = this.d;
        if (p8Var != null) {
            p8Var.f9552o = false;
        }
        di.n8 n8Var = this.f4117e;
        if (n8Var != null) {
            n8Var.f9410j = false;
        }
    }

    public final void p() {
        float f10;
        View[] viewPages;
        float f11;
        i71 i71Var = this.f4119n;
        if (i71Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        i71Var.setTranslationY(min);
        i71Var.setScaleX(T1);
        i71Var.setScaleY(T1);
        q5 q5Var = this.h;
        if (q5Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : q5Var.getViewPages()) {
                if (view instanceof n6) {
                    if (((n6) view).I) {
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
        i71Var.setAlpha(l9.a(f10, 0.0f, 1.0f) * l10);
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
        q5 q5Var = this.h;
        qVar.c(q5Var);
        for (View view : q5Var.getViewPages()) {
            if (view instanceof n6) {
                qVar.b(((n6) view).f3948f);
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
        n6 currentPage = getCurrentPage();
        if (currentPage != null) {
            n6.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            q(g());
            this.f4119n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new p5(profileActivity, 0));
                }
            }
            if (!z10) {
                f5 f5Var = this.R;
                org.telegram.messenger.g0.r(f5Var);
                org.telegram.messenger.g0.g3(f5Var);
            }
        }
    }

    public void setVisibleHeight(int i7) {
        View[] viewPages;
        this.U = i7;
        l();
        q5 q5Var = this.h;
        if (q5Var != null) {
            for (View view : q5Var.getViewPages()) {
                if (view instanceof n6) {
                    ((n6) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
