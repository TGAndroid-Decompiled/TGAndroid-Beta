package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.be;
import b8.mf;
import ci.s8;
import ci.v8;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class u4 extends FrameLayout implements cs {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final wo G;
    public final FrameLayout H;
    public int I;
    public f60 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public pi.q O;
    public boolean P;
    public int Q;
    public final c3 R;
    public final qe.a S;
    public int T;
    public int U;
    public final org.telegram.ui.ActionBar.d2 f1010a;
    public final int f1011b;
    public final long f1012c;
    public final v8 d;
    public final s8 f1013e;
    public final org.telegram.ui.ActionBar.e6 f1014f;
    public final q3 h;
    public final m61 f1015n;
    public final FrameLayout f1016r;
    public final SpannableStringBuilder f1017s;
    public final SpannableStringBuilder f1018w;
    public final gi.d f1019x;
    public int f1020y;

    public u4(org.telegram.ui.ActionBar.d2 r27, android.content.Context r28, int r29, long r30, org.telegram.ui.ActionBar.e6 r32, eh.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: ai.u4.<init>(org.telegram.ui.ActionBar.d2, android.content.Context, int, long, org.telegram.ui.ActionBar.e6, eh.c):void");
    }

    public static void j(org.telegram.ui.ActionBar.y0 y0Var, v8 v8Var, Runnable runnable, int i3) {
        y0Var.setOnClickListener(new h3(v8Var, i3, runnable, 0));
        y0Var.setOnLongClickListener(new i3(v8Var, i3, runnable));
    }

    public final void a() {
        v8 v8Var;
        o4 currentPage = getCurrentPage();
        if (currentPage != null && (v8Var = currentPage.f859e) != null && currentPage.d) {
            int i3 = v8Var.d;
            new m6(this.f1010a, this.f1012c, i3, new g3(this, i3, currentPage, 0)).show();
        }
    }

    public final boolean b() {
        s8 s8Var = this.f1013e;
        if (!s8Var.h() || s8Var.d().size() >= ((org.telegram.messenger.j0) hp.s1(this.f1011b).f23167x7.f24675t.f13798b).f23620c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j10 = this.f1012c;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.f1011b;
        if (i3 >= 0) {
            if (i3 != 0 && j10 != h10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.t3.w(5, hp.s1(i10).M0(Long.valueOf(-j10)));
    }

    public final boolean d() {
        if (this.f1012c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        int i12;
        int i13 = hs.G3;
        LinearLayout linearLayout = this.E;
        gi.d dVar = this.f1019x;
        long j10 = this.f1012c;
        int i14 = 8;
        if (i3 == i13) {
            if (((Long) objArr[0]).longValue() == j10) {
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
                this.f1020y = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                }
            }
        } else if (i3 == hs.H3) {
            if (((Long) objArr[0]).longValue() == j10) {
                f(true);
                o();
            }
        } else if (i3 == hs.f23292r) {
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
            this.f1020y = 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.f1013e.d();
            int i3 = 0;
            while (true) {
                if (i3 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i3)).collection_id == this.Q) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i3);
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i3 >= 0 && tL_starGiftCollection != null) {
                this.Q = 0;
                this.f1015n.d(tL_starGiftCollection.collection_id, i3 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        q3 q3Var = this.h;
        if (q3Var != null && this.f1015n != null) {
            q3Var.k(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        o4 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f1016r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.k5.z(this.f1020y, Math.max(org.telegram.messenger.g0.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.U, org.telegram.messenger.g0.L(this.f1020y));
        }
        return (int) (org.telegram.messenger.g0.L(this.f1020y) - translationY);
    }

    public v8 getCurrentList() {
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f859e;
        }
        return this.d;
    }

    public tj0 getCurrentListView() {
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f860f;
        }
        return null;
    }

    public o4 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (o4) currentView;
    }

    public int getGiftsCount() {
        int i3;
        v8 v8Var;
        int i10;
        o4 currentPage = getCurrentPage();
        v8 v8Var2 = this.d;
        if (currentPage != null && (v8Var = currentPage.f859e) != v8Var2) {
            if (v8Var != null && (i10 = v8Var.f6205n) > 0) {
                return i10;
            }
        } else if (v8Var2 != null && (i3 = v8Var2.f6205n) > 0) {
            return i3;
        }
        long j10 = this.f1012c;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i12 = this.f1011b;
        if (i11 >= 0) {
            TLRPC.UserFull b22 = hp.s1(i12).b2(j10);
            if (b22 == null) {
                return 0;
            }
            return b22.stargifts_count;
        }
        TLRPC.ChatFull N0 = hp.s1(i12).N0(-j10);
        if (N0 == null) {
            return 0;
        }
        return N0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        v8 v8Var = this.d;
        if (v8Var != null && !v8Var.f6203l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i3 = 0;
            for (int i10 = 0; i3 < 3 && i10 < v8Var.f6203l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) v8Var.f6203l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f27007id))) {
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f27007id));
                    i3++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        q3 q3Var = this.h;
        float f10 = 0.0f;
        if (q3Var.getViewPages() != null) {
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    f10 = (((o4) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        m61 m61Var = this.f1015n;
        if (m61Var != null) {
            return m61Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, u10 u10Var) {
        View view;
        int i3;
        b60 b60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        org.telegram.ui.ActionBar.e6 e6Var = this.f1014f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        if (str != null) {
            s1Var.S = bd.M0(2131750223, null);
        } else {
            s1Var.S = bd.M0(2131750103, null);
            s1Var.U = bd.M0(2131750104, null);
        }
        u3 u3Var = new u3(this, context, e6Var);
        u3Var.f31433s0 = true;
        u3Var.setOnEditorActionListener(new v3(u3Var, u10Var, s1VarArr, view, 0));
        li.b0(this.f1011b).M(org.telegram.messenger.g0.G0(), true);
        u3Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(u3Var, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        org.telegram.ui.ActionBar.r6.m(u3Var, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        u3Var.setHintText(bd.M0(2131750105, null));
        u3Var.setFocusable(true);
        u3Var.setInputType(147457);
        org.telegram.ui.ActionBar.r6.G(u3Var, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, e6Var);
        u3Var.setImeOptions(6);
        u3Var.setBackgroundDrawable(null);
        u3Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        u3Var.addTextChangedListener(new w3(0, u3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        u3Var.setText(str);
        linearLayout.addView(u3Var, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        s1Var.f28523a = org.telegram.messenger.g0.L(292.0f);
        if (str != null) {
            i3 = 2131751336;
        } else {
            i3 = 2131751753;
        }
        alertDialog$Builder.k(bd.M0(i3, null), new n(1, u3Var, u10Var));
        alertDialog$Builder.h(bd.M0(2131752589, null), new a3.j(2));
        s1VarArr[0] = s1Var;
        f60 f60Var = this.J;
        if (f60Var != null && (b60Var = f60Var.f33737m) != null) {
            b60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Z2(W, this.f1010a.getClassGuid());
        s1VarArr[0].setOnDismissListener(new o(this, u3Var, W, 1));
        s1VarArr[0].setOnShowListener(new p(u3Var, 1));
        s1VarArr[0].show();
        org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
        s1Var2.f28548k0 = false;
        s1Var2.d(-1);
        u3Var.setSelection(u3Var.getText().length());
    }

    public final void i() {
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i3) {
        v8 v8Var;
        if (i3 == 0) {
            return false;
        }
        int i10 = i3 - 1;
        if (i10 >= 0) {
            s8 s8Var = this.f1013e;
            if (i10 < s8Var.d().size()) {
                if (i10 >= 0 && i10 < s8Var.d().size()) {
                    v8Var = s8Var.e(((TL_stars.TL_starGiftCollection) s8Var.d().get(i10)).collection_id);
                } else {
                    v8Var = null;
                }
                if (v8Var != null) {
                    return v8Var.f6203l.isEmpty();
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
        fb fbVar;
        q3 q3Var = this.h;
        if (q3Var != null) {
            if (q3Var.getCurrentPosition() == q3Var.getNextPosition()) {
                if (k(q3Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(q3Var.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = q3Var.getCurrentPositionAlpha() * f10;
                if (k(q3Var.getNextPosition())) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (q3Var.getNextPositionAlpha() * f11) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f1016r;
            float z11 = org.telegram.messenger.k5.z(this.f1020y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z11;
            int i3 = 0;
            if (this.U > org.telegram.messenger.g0.L(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            qe.a aVar = this.S;
            aVar.a(z10, true);
            float f12 = aVar.f53840e;
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z11, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z11, f12);
            float f13 = (1.0f - nextPositionAlpha) * f12;
            this.H.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f12) - org.telegram.messenger.g0.L(200.0f));
            frameLayout.setTranslationY(T1 - this.T);
            frameLayout.setAlpha(f13);
            if (f13 <= 0.0f) {
                i3 = 4;
            }
            frameLayout.setVisibility(i3);
            if (this.f1013e.h() && q3Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.f1018w;
            } else {
                spannableStringBuilder = this.f1017s;
            }
            this.f1019x.i(spannableStringBuilder, true, true);
            ac acVar = ac.f31784w;
            if (acVar != null && (fbVar = acVar.f31788e) != null) {
                fbVar.updatePosition();
            }
        }
    }

    public final void m() {
        gi.d dVar = this.f1019x;
        dVar.updateColors();
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.e6 e6Var = this.f1014f;
        int f12 = ((vp0) this).W.f1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        if (dVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != f12) {
                org.telegram.ui.ActionBar.k6.C1(f12, dVar.getBackground());
                dVar.invalidate();
            }
        } else {
            dVar.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(19.0f), f12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    o4 o4Var = (o4) view;
                    org.telegram.ui.ActionBar.e6 e6Var2 = o4Var.f858c;
                    if (o4Var.f862r != null) {
                        o4Var.f864w.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var2));
                        o4Var.f865x.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var2));
                    } else {
                        o4Var.F.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var2));
                        o4Var.G.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var2));
                        o4Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, e6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof o4) {
                o4 o4Var = (o4) view;
                h4 h4Var = o4Var.f860f;
                int paddingTop = h4Var.getPaddingTop();
                o4Var.g();
                int paddingTop2 = paddingTop - h4Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(h4Var, new o3(o4Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10;
        View[] viewPages;
        if (this.f1013e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        q3 q3Var = this.h;
        if (q3Var.getViewPages() != null) {
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    ((o4) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.f1011b;
        hs.f(i3).c(this, hs.G3);
        hs.f(i3).c(this, hs.H3);
        hs.f(i3).c(this, hs.f23292r);
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        v8 v8Var = this.d;
        if (v8Var != null) {
            v8Var.f6206o = true;
            v8Var.a();
        }
        s8 s8Var = this.f1013e;
        if (s8Var != null) {
            s8Var.f5972j = true;
            s8Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        o4 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i3 = this.f1011b;
        hs.f(i3).n(this, hs.G3);
        hs.f(i3).n(this, hs.H3);
        hs.f(i3).n(this, hs.f23292r);
        v8 v8Var = this.d;
        if (v8Var != null) {
            v8Var.f6206o = false;
        }
        s8 s8Var = this.f1013e;
        if (s8Var != null) {
            s8Var.f5972j = false;
        }
    }

    public final void p() {
        float f10;
        View[] viewPages;
        float f11;
        m61 m61Var = this.f1015n;
        if (m61Var == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.L, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        m61Var.setTranslationY(min);
        m61Var.setScaleX(T1);
        m61Var.setScaleY(T1);
        q3 q3Var = this.h;
        if (q3Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    if (((o4) view).I) {
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
        m61Var.setAlpha(be.a(f10, 0.0f, 1.0f) * l10);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i3) {
        if (this.T != i3) {
            this.T = i3;
            l();
        }
    }

    public void setGlassEngine(pi.q qVar) {
        View[] viewPages;
        this.O = qVar;
        q3 q3Var = this.h;
        qVar.c(q3Var);
        for (View view : q3Var.getViewPages()) {
            if (view instanceof o4) {
                qVar.b(((o4) view).f860f);
            }
        }
    }

    public void setPaddingTop(int i3) {
        if (this.L != i3) {
            this.L = i3;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z10) {
        o4 currentPage = getCurrentPage();
        if (currentPage != null) {
            o4.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            q(g());
            this.f1015n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.g0.h3(new p3(profileActivity, 0));
                }
            }
            if (!z10) {
                c3 c3Var = this.R;
                org.telegram.messenger.g0.r(c3Var);
                org.telegram.messenger.g0.h3(c3Var);
            }
        }
    }

    public void setVisibleHeight(int i3) {
        View[] viewPages;
        this.U = i3;
        l();
        q3 q3Var = this.h;
        if (q3Var != null) {
            for (View view : q3Var.getViewPages()) {
                if (view instanceof o4) {
                    ((o4) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
