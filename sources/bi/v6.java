package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.m9;
import c8.na;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class v6 extends FrameLayout implements fs {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final lp G;
    public final FrameLayout H;
    public int I;
    public x60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public ri.q O;
    public boolean P;
    public int Q;
    public final h5 R;
    public final te.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.g2 f4148a;
    public final int f4149b;
    public final long f4150c;
    public final di.p8 d;
    public final di.n8 f4151e;
    public final org.telegram.ui.ActionBar.i6 f4152f;
    public final s5 h;
    public final j71 f4153n;
    public final FrameLayout f4154r;
    public final SpannableStringBuilder f4155s;
    public final SpannableStringBuilder f4156w;
    public final hi.e f4157x;
    public int f4158y;

    public v6(org.telegram.ui.ActionBar.g2 r27, android.content.Context r28, int r29, long r30, org.telegram.ui.ActionBar.i6 r32, dh.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: bi.v6.<init>(org.telegram.ui.ActionBar.g2, android.content.Context, int, long, org.telegram.ui.ActionBar.i6, dh.c):void");
    }

    public static void j(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, Runnable runnable, int i7) {
        y0Var.setOnClickListener(new k5(p8Var, i7, runnable, 0));
        y0Var.setOnLongClickListener(new l5(p8Var, i7, runnable));
    }

    public final void a() {
        di.p8 p8Var;
        p6 currentPage = getCurrentPage();
        if (currentPage != null && (p8Var = currentPage.f3969e) != null && currentPage.d) {
            int i7 = p8Var.d;
            new q8(this.f4148a, this.f4150c, i7, new j5(this, i7, currentPage, 0)).show();
        }
    }

    public final boolean b() {
        di.n8 n8Var = this.f4151e;
        if (!n8Var.h() || n8Var.d().size() >= ((org.telegram.messenger.j0) mp.u1(this.f4149b).A7.f26268y.f15482b).f24899c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j3 = this.f4150c;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f4149b;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != i10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.v3.w(5, mp.u1(i10).O0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        if (this.f4150c >= 0 || this.d.h == null) {
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
        hi.e eVar = this.f4157x;
        long j3 = this.f4150c;
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
                this.f4158y = 60;
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
        } else if (i7 == ks.f25276r) {
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
            this.f4158y = 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.f4151e.d();
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
                this.f4153n.e(tL_starGiftCollection.collection_id, i7 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        s5 s5Var = this.h;
        if (s5Var != null && this.f4153n != null) {
            s5Var.l(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        p6 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f4154r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.f3.z(this.f4158y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.f4158y));
        }
        return (int) (org.telegram.messenger.g0.L(this.f4158y) - translationY);
    }

    public di.p8 getCurrentList() {
        p6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3969e;
        }
        return this.d;
    }

    public ek0 getCurrentListView() {
        p6 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f3970f;
        }
        return null;
    }

    public p6 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (p6) currentView;
    }

    public int getGiftsCount() {
        int i7;
        di.p8 p8Var;
        int i10;
        p6 currentPage = getCurrentPage();
        di.p8 p8Var2 = this.d;
        if (currentPage != null && (p8Var = currentPage.f3969e) != p8Var2) {
            if (p8Var != null && (i10 = p8Var.f9515n) > 0) {
                return i10;
            }
        } else if (p8Var2 != null && (i7 = p8Var2.f9515n) > 0) {
            return i7;
        }
        long j3 = this.f4150c;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.f4149b;
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
        if (p8Var != null && !p8Var.f9513l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < p8Var.f9513l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) p8Var.f9513l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f28498id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f28498id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        s5 s5Var = this.h;
        float f10 = 0.0f;
        if (s5Var.getViewPages() != null) {
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    f10 = (((p6) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        j71 j71Var = this.f4153n;
        if (j71Var != null) {
            return j71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, w10 w10Var) {
        View view;
        int i7;
        q60 q60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        org.telegram.ui.ActionBar.i6 i6Var = this.f4152f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        if (str != null) {
            t1Var.S = gd.N0(2131750198, null);
        } else {
            t1Var.S = gd.N0(2131750078, null);
            t1Var.U = gd.N0(2131750079, null);
        }
        w5 w5Var = new w5(this, context, i6Var);
        w5Var.f33036s0 = true;
        w5Var.setOnEditorActionListener(new x5(w5Var, w10Var, t1VarArr, view, 0));
        ri.d0(this.f4149b).O(org.telegram.messenger.g0.G0(), true);
        w5Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(w5Var, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        org.telegram.ui.ActionBar.u6.l(w5Var, 34, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        w5Var.setHintText(gd.N0(2131750080, null));
        w5Var.setFocusable(true);
        w5Var.setInputType(147457);
        org.telegram.ui.ActionBar.u6.F(w5Var, org.telegram.ui.ActionBar.n6.f29580k6, org.telegram.ui.ActionBar.n6.f29598l6, org.telegram.ui.ActionBar.n6.f29672p7, i6Var);
        w5Var.setImeOptions(6);
        w5Var.setBackgroundDrawable(null);
        w5Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        w5Var.addTextChangedListener(new y5(0, w5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        w5Var.setText(str);
        linearLayout.addView(w5Var, na.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.f30068a = org.telegram.messenger.g0.L(292.0f);
        if (str != null) {
            i7 = 2131751323;
        } else {
            i7 = 2131751741;
        }
        alertDialog$Builder.k(gd.N0(i7, null), new ab.g(3, w5Var, w10Var));
        alertDialog$Builder.h(gd.N0(2131752577, null), new a3.l(21));
        t1VarArr[0] = t1Var;
        x60 x60Var = this.J;
        if (x60Var != null && (q60Var = x60Var.f41881m) != null) {
            q60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Y2(W, this.f4148a.getClassGuid());
        t1VarArr[0].setOnDismissListener(new k(this, w5Var, W, 1));
        t1VarArr[0].setOnShowListener(new l(w5Var, 1));
        t1VarArr[0].show();
        org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
        t1Var2.f30093k0 = false;
        t1Var2.d(-1);
        w5Var.setSelection(w5Var.getText().length());
    }

    public final void i() {
        p6 currentPage = getCurrentPage();
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
            di.n8 n8Var = this.f4151e;
            if (i10 < n8Var.d().size()) {
                if (i10 >= 0 && i10 < n8Var.d().size()) {
                    p8Var = n8Var.e(((TL_stars.TL_starGiftCollection) n8Var.d().get(i10)).collection_id);
                } else {
                    p8Var = null;
                }
                if (p8Var != null) {
                    return p8Var.f9513l.isEmpty();
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
        kb kbVar;
        s5 s5Var = this.h;
        if (s5Var != null) {
            if (s5Var.getCurrentPosition() == s5Var.getNextPosition()) {
                if (k(s5Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(s5Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = s5Var.getCurrentPositionAlpha() * f10;
                if (k(s5Var.getNextPosition())) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (s5Var.getNextPositionAlpha() * f11) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f4154r;
            float z11 = org.telegram.messenger.f3.z(this.f4158y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z11;
            int i7 = 0;
            if (this.U > org.telegram.messenger.g0.L(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            te.a aVar = this.S;
            aVar.a(z10, true);
            float f12 = aVar.f57779e;
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z11, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z11, f12);
            float f13 = (1.0f - nextPositionAlpha) * f12;
            this.H.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f12) - org.telegram.messenger.g0.L(200.0f));
            frameLayout.setTranslationY(T1 - this.T);
            frameLayout.setAlpha(f13);
            if (f13 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            if (this.f4151e.h() && s5Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.f4156w;
            } else {
                spannableStringBuilder = this.f4155s;
            }
            this.f4157x.i(spannableStringBuilder, true, true);
            fc fcVar = fc.f35083w;
            if (fcVar != null && (kbVar = fcVar.f35087e) != null) {
                kbVar.updatePosition();
            }
        }
    }

    public final void m() {
        hi.e eVar = this.f4157x;
        eVar.updateColors();
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f4152f;
        int h12 = ((fq0) this).W.h1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        if (eVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) eVar.getBackground()).getPaint().getColor() != h12) {
                org.telegram.ui.ActionBar.n6.C1(h12, eVar.getBackground());
                eVar.invalidate();
            }
        } else {
            eVar.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(19.0f), h12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    p6 p6Var = (p6) view;
                    org.telegram.ui.ActionBar.i6 i6Var2 = p6Var.f3968c;
                    if (p6Var.f3972r != null) {
                        p6Var.f3974w.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        p6Var.f3975x.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var2));
                    } else {
                        p6Var.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var2));
                        p6Var.G.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29843y6, i6Var2));
                        p6Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29559j5, i6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof p6) {
                p6 p6Var = (p6) view;
                i6 i6Var = p6Var.f3970f;
                int paddingTop = i6Var.getPaddingTop();
                p6Var.g();
                int paddingTop2 = paddingTop - i6Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(i6Var, new q5(p6Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10;
        View[] viewPages;
        if (this.f4151e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        s5 s5Var = this.h;
        if (s5Var.getViewPages() != null) {
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    ((p6) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f4149b;
        ks.f(i7).c(this, ks.I3);
        ks.f(i7).c(this, ks.J3);
        ks.f(i7).c(this, ks.f25276r);
        p6 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        di.p8 p8Var = this.d;
        if (p8Var != null) {
            p8Var.f9516o = true;
            p8Var.a();
        }
        di.n8 n8Var = this.f4151e;
        if (n8Var != null) {
            n8Var.f9374j = true;
            n8Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        p6 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.f4149b;
        ks.f(i7).n(this, ks.I3);
        ks.f(i7).n(this, ks.J3);
        ks.f(i7).n(this, ks.f25276r);
        di.p8 p8Var = this.d;
        if (p8Var != null) {
            p8Var.f9516o = false;
        }
        di.n8 n8Var = this.f4151e;
        if (n8Var != null) {
            n8Var.f9374j = false;
        }
    }

    public final void p() {
        float f10;
        View[] viewPages;
        float f11;
        j71 j71Var = this.f4153n;
        if (j71Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        j71Var.setTranslationY(min);
        j71Var.setScaleX(T1);
        j71Var.setScaleY(T1);
        s5 s5Var = this.h;
        if (s5Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    if (((p6) view).I) {
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
        j71Var.setAlpha(m9.a(f10, 0.0f, 1.0f) * l10);
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
        s5 s5Var = this.h;
        qVar.c(s5Var);
        for (View view : s5Var.getViewPages()) {
            if (view instanceof p6) {
                qVar.b(((p6) view).f3970f);
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
        p6 currentPage = getCurrentPage();
        if (currentPage != null) {
            p6.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            q(g());
            this.f4153n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new r5(profileActivity, 0));
                }
            }
            if (!z10) {
                h5 h5Var = this.R;
                org.telegram.messenger.g0.r(h5Var);
                org.telegram.messenger.g0.g3(h5Var);
            }
        }
    }

    public void setVisibleHeight(int i7) {
        View[] viewPages;
        this.U = i7;
        l();
        s5 s5Var = this.h;
        if (s5Var != null) {
            for (View view : s5Var.getViewPages()) {
                if (view instanceof p6) {
                    ((p6) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
