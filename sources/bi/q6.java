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
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class q6 extends FrameLayout implements fs {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final mp G;
    public final FrameLayout H;
    public int I;
    public y60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public ri.q O;
    public boolean P;
    public int Q;
    public final c5 R;
    public final te.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.h2 f4003a;
    public final int f4004b;
    public final long f4005c;
    public final di.o8 d;
    public final di.m8 f4006e;
    public final org.telegram.ui.ActionBar.i6 f4007f;
    public final n5 h;
    public final f71 f4008n;
    public final FrameLayout f4009r;
    public final SpannableStringBuilder f4010s;
    public final SpannableStringBuilder f4011w;
    public final hi.d f4012x;
    public int f4013y;

    public q6(org.telegram.ui.ActionBar.h2 r27, android.content.Context r28, int r29, long r30, org.telegram.ui.ActionBar.i6 r32, dh.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q6.<init>(org.telegram.ui.ActionBar.h2, android.content.Context, int, long, org.telegram.ui.ActionBar.i6, dh.c):void");
    }

    public static void j(org.telegram.ui.ActionBar.z0 z0Var, di.o8 o8Var, Runnable runnable, int i7) {
        z0Var.setOnClickListener(new f5(o8Var, i7, runnable, 0));
        z0Var.setOnLongClickListener(new g5(o8Var, i7, runnable));
    }

    public final void a() {
        di.o8 o8Var;
        k6 currentPage = getCurrentPage();
        if (currentPage != null && (o8Var = currentPage.f3816e) != null && currentPage.d) {
            int i7 = o8Var.d;
            new l8(this.f4003a, this.f4005c, i7, new e5(this, i7, currentPage, 0)).show();
        }
    }

    public final boolean b() {
        di.m8 m8Var = this.f4006e;
        if (!m8Var.h() || m8Var.d().size() >= ((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.f4004b).A7.f26175y.f15539b).f24767c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j3 = this.f4005c;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f4004b;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != j10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.v3.w(5, org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        if (this.f4005c >= 0 || this.d.h == null) {
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
        hi.d dVar = this.f4012x;
        long j3 = this.f4005c;
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
                this.f4013y = 60;
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
        } else if (i7 == ks.f25179r) {
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
            this.f4013y = 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.f4006e.d();
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
                this.f4008n.e(tL_starGiftCollection.collection_id, i7 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        n5 n5Var = this.h;
        if (n5Var != null && this.f4008n != null) {
            n5Var.j(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        k6 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f4009r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.f3.z(this.f4013y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.f4013y));
        }
        return (int) (org.telegram.messenger.g0.L(this.f4013y) - translationY);
    }

    public di.o8 getCurrentList() {
        k6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3816e;
        }
        return this.d;
    }

    public ck0 getCurrentListView() {
        k6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3817f;
        }
        return null;
    }

    public k6 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (k6) currentView;
    }

    public int getGiftsCount() {
        int i7;
        di.o8 o8Var;
        int i10;
        k6 currentPage = getCurrentPage();
        di.o8 o8Var2 = this.d;
        if (currentPage != null && (o8Var = currentPage.f3816e) != o8Var2) {
            if (o8Var != null && (i10 = o8Var.f9472n) > 0) {
                return i10;
            }
        } else if (o8Var2 != null && (i7 = o8Var2.f9472n) > 0) {
            return i7;
        }
        long j3 = this.f4005c;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.f4004b;
        if (i11 >= 0) {
            TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i12).d2(j3);
            if (d2 == null) {
                return 0;
            }
            return d2.stargifts_count;
        }
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i12).P0(-j3);
        if (P0 == null) {
            return 0;
        }
        return P0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        di.o8 o8Var = this.d;
        if (o8Var != null && !o8Var.f9470l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < o8Var.f9470l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) o8Var.f9470l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f28411id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f28411id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        n5 n5Var = this.h;
        float f10 = 0.0f;
        if (n5Var.getViewPages() != null) {
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    f10 = (((k6) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        f71 f71Var = this.f4008n;
        if (f71Var != null) {
            return f71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, x10 x10Var) {
        View view;
        int i7;
        r60 r60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        org.telegram.ui.ActionBar.i6 i6Var = this.f4007f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        if (str != null) {
            u1Var.S = gd.M0(2131750199, null);
        } else {
            u1Var.S = gd.M0(2131750079, null);
            u1Var.U = gd.M0(2131750080, null);
        }
        r5 r5Var = new r5(this, context, i6Var);
        r5Var.f32936s0 = true;
        r5Var.setOnEditorActionListener(new s5(r5Var, x10Var, u1VarArr, view, 0));
        ri.d0(this.f4004b).O(org.telegram.messenger.g0.G0(), true);
        r5Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(r5Var, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
        org.telegram.ui.ActionBar.u6.l(r5Var, 34, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        r5Var.setHintText(gd.M0(2131750081, null));
        r5Var.setFocusable(true);
        r5Var.setInputType(147457);
        org.telegram.ui.ActionBar.u6.F(r5Var, org.telegram.ui.ActionBar.n6.f29525k6, org.telegram.ui.ActionBar.n6.f29543l6, org.telegram.ui.ActionBar.n6.f29617p7, i6Var);
        r5Var.setImeOptions(6);
        r5Var.setBackgroundDrawable(null);
        r5Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        r5Var.addTextChangedListener(new t5(0, r5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        r5Var.setText(str);
        linearLayout.addView(r5Var, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.f30026a = org.telegram.messenger.g0.L(292.0f);
        if (str != null) {
            i7 = 2131751324;
        } else {
            i7 = 2131751742;
        }
        alertDialog$Builder.k(gd.M0(i7, null), new ab.g(3, r5Var, x10Var));
        alertDialog$Builder.h(gd.M0(2131752578, null), new a3.l(21));
        u1VarArr[0] = u1Var;
        y60 y60Var = this.J;
        if (y60Var != null && (r60Var = y60Var.f42364m) != null) {
            r60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Y2(W, this.f4003a.getClassGuid());
        u1VarArr[0].setOnDismissListener(new k(this, r5Var, W, 1));
        u1VarArr[0].setOnShowListener(new l(r5Var, 1));
        u1VarArr[0].show();
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.f30051k0 = false;
        u1Var2.d(-1);
        r5Var.setSelection(r5Var.getText().length());
    }

    public final void i() {
        k6 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i7) {
        di.o8 o8Var;
        if (i7 == 0) {
            return false;
        }
        int i10 = i7 - 1;
        if (i10 >= 0) {
            di.m8 m8Var = this.f4006e;
            if (i10 < m8Var.d().size()) {
                if (i10 >= 0 && i10 < m8Var.d().size()) {
                    o8Var = m8Var.e(((TL_stars.TL_starGiftCollection) m8Var.d().get(i10)).collection_id);
                } else {
                    o8Var = null;
                }
                if (o8Var != null) {
                    return o8Var.f9470l.isEmpty();
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
        n5 n5Var = this.h;
        if (n5Var != null) {
            if (n5Var.getCurrentPosition() == n5Var.getNextPosition()) {
                if (k(n5Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(n5Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = n5Var.getCurrentPositionAlpha() * f10;
                if (k(n5Var.getNextPosition())) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (n5Var.getNextPositionAlpha() * f11) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f4009r;
            float z11 = org.telegram.messenger.f3.z(this.f4013y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z11;
            int i7 = 0;
            if (this.U > org.telegram.messenger.g0.L(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            te.a aVar = this.S;
            aVar.a(z10, true);
            float f12 = aVar.f57657e;
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z11, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z11, f12);
            float f13 = (1.0f - nextPositionAlpha) * f12;
            this.H.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f12) - org.telegram.messenger.g0.L(200.0f));
            frameLayout.setTranslationY(T1 - this.T);
            frameLayout.setAlpha(f13);
            if (f13 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            if (this.f4006e.h() && n5Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.f4011w;
            } else {
                spannableStringBuilder = this.f4010s;
            }
            this.f4012x.i(spannableStringBuilder, true, true);
            gc gcVar = gc.f35453w;
            if (gcVar != null && (lbVar = gcVar.f35457e) != null) {
                lbVar.updatePosition();
            }
        }
    }

    public final void m() {
        hi.d dVar = this.f4012x;
        dVar.updateColors();
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f4007f;
        int h12 = ((eq0) this).W.h1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        if (dVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != h12) {
                org.telegram.ui.ActionBar.n6.C1(h12, dVar.getBackground());
                dVar.invalidate();
            }
        } else {
            dVar.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(19.0f), h12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    k6 k6Var = (k6) view;
                    org.telegram.ui.ActionBar.i6 i6Var2 = k6Var.f3815c;
                    if (k6Var.f3819r != null) {
                        k6Var.f3821w.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        k6Var.f3822x.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var2));
                    } else {
                        k6Var.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        k6Var.G.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, i6Var2));
                        k6Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29504j5, i6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof k6) {
                k6 k6Var = (k6) view;
                d6 d6Var = k6Var.f3817f;
                int paddingTop = d6Var.getPaddingTop();
                k6Var.g();
                int paddingTop2 = paddingTop - d6Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(d6Var, new l5(k6Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10;
        View[] viewPages;
        if (this.f4006e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        n5 n5Var = this.h;
        if (n5Var.getViewPages() != null) {
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    ((k6) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f4004b;
        ks.f(i7).c(this, ks.I3);
        ks.f(i7).c(this, ks.J3);
        ks.f(i7).c(this, ks.f25179r);
        k6 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        di.o8 o8Var = this.d;
        if (o8Var != null) {
            o8Var.f9473o = true;
            o8Var.a();
        }
        di.m8 m8Var = this.f4006e;
        if (m8Var != null) {
            m8Var.f9329j = true;
            m8Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        k6 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.f4004b;
        ks.f(i7).n(this, ks.I3);
        ks.f(i7).n(this, ks.J3);
        ks.f(i7).n(this, ks.f25179r);
        di.o8 o8Var = this.d;
        if (o8Var != null) {
            o8Var.f9473o = false;
        }
        di.m8 m8Var = this.f4006e;
        if (m8Var != null) {
            m8Var.f9329j = false;
        }
    }

    public final void p() {
        float f10;
        View[] viewPages;
        float f11;
        f71 f71Var = this.f4008n;
        if (f71Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        f71Var.setTranslationY(min);
        f71Var.setScaleX(T1);
        f71Var.setScaleY(T1);
        n5 n5Var = this.h;
        if (n5Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    if (((k6) view).I) {
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
        f71Var.setAlpha(l9.a(f10, 0.0f, 1.0f) * l10);
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
        n5 n5Var = this.h;
        qVar.c(n5Var);
        for (View view : n5Var.getViewPages()) {
            if (view instanceof k6) {
                qVar.b(((k6) view).f3817f);
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
        k6 currentPage = getCurrentPage();
        if (currentPage != null) {
            k6.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            q(g());
            this.f4008n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new m5(profileActivity, 0));
                }
            }
            if (!z10) {
                c5 c5Var = this.R;
                org.telegram.messenger.g0.r(c5Var);
                org.telegram.messenger.g0.g3(c5Var);
            }
        }
    }

    public void setVisibleHeight(int i7) {
        View[] viewPages;
        this.U = i7;
        l();
        n5 n5Var = this.h;
        if (n5Var != null) {
            for (View view : n5Var.getViewPages()) {
                if (view instanceof k6) {
                    ((k6) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
