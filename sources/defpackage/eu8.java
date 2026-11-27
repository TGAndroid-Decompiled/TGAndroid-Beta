package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class eu8 extends FrameLayout implements fn7 {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final og2 G;
    public final FrameLayout H;
    public int I;
    public fu5 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public vy4 O;
    public boolean P;
    public int Q;
    public final ft8 R;
    public final fm0 S;
    public int T;
    public int U;
    public final e a;
    public final int b;
    public final long c;
    public final axa d;
    public final zwa e;
    public final vnb f;
    public final uq0 h;
    public final uic n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final c51 x;
    public byte y;

    public eu8(org.telegram.ui.ActionBar.e r31, android.content.Context r32, int r33, long r34, defpackage.vnb r36, defpackage.ll0 r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu8.<init>(org.telegram.ui.ActionBar.e, android.content.Context, int, long, vnb, ll0):void");
    }

    public static void j(b8 b8Var, final axa axaVar, final Runnable runnable, final int i) {
        b8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i2;
                axa axaVar2 = axa.this;
                axaVar2.getClass();
                short s = i;
                if ((s & 15) != 0) {
                    i2 = 15;
                } else if ((s & 768) != 0) {
                    i2 = 768;
                } else {
                    i2 = 0;
                }
                int i3 = axaVar2.g & i2;
                int flag = TLObject.setFlag(i3, s, !TLObject.hasFlag(i3, s));
                if (flag == 0) {
                    flag = i2 & (~s);
                }
                int i4 = axaVar2.g;
                int i5 = ((~i2) & i4) | flag;
                if (i4 != i5) {
                    axaVar2.g = i5;
                    axaVar2.k(true);
                }
                runnable.run();
            }
        });
        b8Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                axa.this.g(i, true);
                runnable.run();
                return true;
            }
        });
    }

    public final void a() {
        axa axaVar;
        au8 currentPage = getCurrentPage();
        if (currentPage != null && (axaVar = currentPage.e) != null && currentPage.d) {
            int i = axaVar.d;
            new h2a(this.a, this.c, i, new i61(this, i, currentPage, (byte) 3)).show();
        }
    }

    public final boolean b() {
        zwa zwaVar = this.e;
        if (zwaVar.h() && zwaVar.d().size() < uc7.s1(this.b).l4.z.f()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        long j = this.c;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.b;
        if (i >= 0) {
            if (i != 0 && j != yac.h(i2).e()) {
                return false;
            }
            return true;
        }
        return xc2.w(5, uc7.s1(i2).M0(Long.valueOf(-j)));
    }

    public final boolean d() {
        if (this.c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        int i5 = jn7.I3;
        LinearLayout linearLayout = this.E;
        c51 c51Var = this.x;
        long j = this.c;
        int i6 = 8;
        if (i == i5) {
            if (((Long) objArr[0]).longValue() == j) {
                if (d()) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                c51Var.setVisibility(i4);
                if (d()) {
                    i6 = 0;
                }
                linearLayout.setVisibility(i6);
                this.y = (byte) 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                }
            }
        } else if (i == jn7.J3) {
            if (((Long) objArr[0]).longValue() == j) {
                f(true);
                o();
            }
        } else if (i == 2) {
            if (d()) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            c51Var.setVisibility(i3);
            if (d()) {
                i6 = 0;
            }
            linearLayout.setVisibility(i6);
            this.y = (byte) 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.e.d();
            int i = 0;
            while (true) {
                if (i < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i)).collection_id == this.Q) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i);
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i >= 0 && tL_starGiftCollection != null) {
                this.Q = 0;
                this.n.e(tL_starGiftCollection.collection_id, i + 1);
            }
        }
    }

    public final void f(boolean z) {
        uq0 uq0Var = this.h;
        if (uq0Var != null && this.n != null) {
            uq0Var.m(z);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        au8 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.r;
        float translationY = frameLayout.getTranslationY() - qu6.x(this.y, Math.max(hl.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < hl.L(240.0f)) {
            translationY += Math.min(hl.L(240.0f) - this.U, hl.L(this.y));
        }
        return (int) (hl.L(this.y) - translationY);
    }

    public axa getCurrentList() {
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public d79 getCurrentListView() {
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public au8 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (au8) currentView;
    }

    public int getGiftsCount() {
        int i;
        axa axaVar;
        int i2;
        au8 currentPage = getCurrentPage();
        axa axaVar2 = this.d;
        if (currentPage != null && (axaVar = currentPage.e) != axaVar2) {
            if (axaVar != null && (i2 = axaVar.n) > 0) {
                return i2;
            }
        } else if (axaVar2 != null && (i = axaVar2.n) > 0) {
            return i;
        }
        long j = this.c;
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i4 = this.b;
        if (i3 >= 0) {
            TLRPC.UserFull Y1 = uc7.s1(i4).Y1(j);
            if (Y1 == null) {
                return 0;
            }
            return Y1.stargifts_count;
        }
        TLRPC.ChatFull N0 = uc7.s1(i4).N0(-j);
        if (N0 == null) {
            return 0;
        }
        return N0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j = 0;
        axa axaVar = this.d;
        if (axaVar != null && !axaVar.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < axaVar.l.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) axaVar.l.get(i2)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j = Objects.hash(Long.valueOf(j), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return j;
    }

    public float getTabsHeight() {
        View[] viewPages;
        uq0 uq0Var = this.h;
        float f = 0.0f;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    f = (((au8) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f;
                }
            }
        }
        return f;
    }

    public float getTabsVisibility() {
        uic uicVar = this.n;
        if (uicVar != null) {
            return uicVar.getAlpha();
        }
        return 0.0f;
    }

    public final void h(pcc pccVar, String str) {
        View view;
        int i;
        zt5 zt5Var;
        Context context = getContext();
        Activity W = hl.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        id[] idVarArr = new id[1];
        vnb vnbVar = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        id idVar = alertDialog$Builder.a;
        if (str != null) {
            idVar.S = ob6.M0(2131750174, null);
        } else {
            idVar.S = ob6.M0(2131750054, null);
            idVar.U = ob6.M0(2131750055, null);
        }
        pt8 pt8Var = new pt8(this, context, vnbVar);
        pt8Var.s0 = true;
        pt8Var.setOnEditorActionListener(new iv0(pt8Var, pccVar, idVarArr, view, (byte) 1));
        ls6.d0(this.b).O(hl.F0(), true);
        pt8Var.setTextSize(1, 18.0f);
        yob.X(pt8Var, aob.j5, vnbVar);
        yob.l(pt8Var, 34, aob.Oi, vnbVar);
        pt8Var.setHintText(ob6.M0(2131750056, null));
        pt8Var.setFocusable(true);
        pt8Var.setInputType(147457);
        yob.F(pt8Var, aob.k6, aob.l6, aob.p7, vnbVar);
        pt8Var.setImeOptions(6);
        pt8Var.setBackgroundDrawable(null);
        pt8Var.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        pt8Var.addTextChangedListener(new wx1(pt8Var, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        pt8Var.setText(str);
        linearLayout.addView(pt8Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        idVar.a = hl.L(292.0f);
        if (str != null) {
            i = 2131751300;
        } else {
            i = 2131751718;
        }
        alertDialog$Builder.j(ob6.M0(i, null), new m88(pt8Var, pccVar, (byte) 14));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new ku7((byte) 27));
        idVarArr[0] = idVar;
        fu5 fu5Var = this.J;
        if (fu5Var != null && (zt5Var = fu5Var.m) != null) {
            zt5Var.setSoftInputMode(48);
        }
        hl.U2(W, this.a.getClassGuid());
        idVarArr[0].setOnDismissListener(new cf(this, pt8Var, W, (byte) 7));
        idVarArr[0].setOnShowListener(new ig(pt8Var, (byte) 5));
        idVarArr[0].show();
        id idVar2 = idVarArr[0];
        idVar2.k0 = false;
        idVar2.c(-1);
        pt8Var.setSelection(pt8Var.getText().length());
    }

    public final void i() {
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i) {
        axa axaVar;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            zwa zwaVar = this.e;
            if (i2 < zwaVar.d().size()) {
                if (i2 >= 0 && i2 < zwaVar.d().size()) {
                    axaVar = zwaVar.e(((TL_stars.TL_starGiftCollection) zwaVar.d().get(i2)).collection_id);
                } else {
                    axaVar = null;
                }
                if (axaVar != null) {
                    return axaVar.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f;
        float f2;
        float nextPositionAlpha;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        z11 z11Var;
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            if (uq0Var.getCurrentPosition() == uq0Var.getNextPosition()) {
                if (k(uq0Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(uq0Var.getCurrentPosition())) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float currentPositionAlpha = uq0Var.getCurrentPositionAlpha() * f;
                if (k(uq0Var.getNextPosition())) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                nextPositionAlpha = (uq0Var.getNextPositionAlpha() * f2) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.r;
            float x = qu6.x(this.y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((hl.L(68.0f) + 2) * nextPositionAlpha) + x;
            int i = 0;
            if (this.U > hl.L(184.0f)) {
                z = true;
            } else {
                z = false;
            }
            fm0 fm0Var = this.S;
            fm0Var.a(z, true);
            float f3 = fm0Var.e;
            float R1 = hl.R1(hl.L(60.0f) + x, (hl.L(16.0f) * nextPositionAlpha) + x, f3);
            float f4 = (1.0f - nextPositionAlpha) * f3;
            this.H.setTranslationY(hl.R1(hl.L(60.0f) + L, L, f3) - hl.L(200.0f));
            frameLayout.setTranslationY(R1 - this.T);
            frameLayout.setAlpha(f4);
            if (f4 <= 0.0f) {
                i = 4;
            }
            frameLayout.setVisibility(i);
            if (this.e.h() && uq0Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.w;
            } else {
                spannableStringBuilder = this.s;
            }
            this.x.i(spannableStringBuilder, true, true);
            v21 v21Var = v21.x;
            if (v21Var != null && (z11Var = v21Var.e) != null) {
                z11Var.updatePosition();
            }
        }
    }

    public final void m() {
        c51 c51Var = this.x;
        c51Var.updateColors();
        int i = aob.Fi;
        vnb vnbVar = this.f;
        int c1 = ((cga) this).W.c1(aob.v0(i, vnbVar));
        if (c51Var.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) c51Var.getBackground()).getPaint().getColor() != c1) {
                aob.A1(c1, c51Var.getBackground());
                c51Var.invalidate();
            }
        } else {
            c51Var.setBackground(aob.b0(hl.L(19.0f), c1));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    au8 au8Var = (au8) view;
                    vnb vnbVar2 = au8Var.c;
                    if (au8Var.r != null) {
                        au8Var.w.setTextColor(aob.v0(aob.G6, vnbVar2));
                        au8Var.x.setTextColor(aob.v0(aob.Fi, vnbVar2));
                    } else {
                        au8Var.F.setTextColor(aob.v0(aob.G6, vnbVar2));
                        au8Var.G.setTextColor(aob.v0(aob.y6, vnbVar2));
                        au8Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(aob.v0(aob.j5, vnbVar));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof au8) {
                au8 au8Var = (au8) view;
                wa waVar = au8Var.f;
                int paddingTop = waVar.getPaddingTop();
                au8Var.g();
                int paddingTop2 = paddingTop - waVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    hl.J(waVar, new lt8(au8Var, paddingTop2, (byte) 0));
                }
            }
        }
    }

    public final void o() {
        boolean z;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z = false;
        } else {
            z = true;
        }
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    ((au8) view).setHasTabs(z);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.b;
        jn7.f(i).b(this, jn7.I3);
        jn7.f(i).b(this, jn7.J3);
        jn7.f(i).b(this, 2);
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        axa axaVar = this.d;
        if (axaVar != null) {
            axaVar.o = true;
            axaVar.a();
        }
        zwa zwaVar = this.e;
        if (zwaVar != null) {
            zwaVar.j = true;
            zwaVar.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        au8 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i = this.b;
        jn7.f(i).n(this, jn7.I3);
        jn7.f(i).n(this, jn7.J3);
        jn7.f(i).n(this, 2);
        axa axaVar = this.d;
        if (axaVar != null) {
            axaVar.o = false;
        }
        zwa zwaVar = this.e;
        if (zwaVar != null) {
            zwaVar.j = false;
        }
    }

    public final void p() {
        float f;
        View[] viewPages;
        float f2;
        uic uicVar = this.n;
        if (uicVar == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - hl.L(42.0f));
        float l = Utilities.l(hl.x1(min - this.L, -hl.L(42.0f), 0.0f));
        float R1 = hl.R1(0.9f, 1.0f, l);
        uicVar.setTranslationY(min);
        uicVar.setScaleX(R1);
        uicVar.setScaleY(R1);
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            f = 0.0f;
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    if (((au8) view).I) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    f += f2;
                }
            }
        } else {
            f = 0.0f;
        }
        uicVar.setAlpha(ete.a(f, 0.0f, 1.0f) * l);
    }

    public abstract void q(boolean z);

    public void setButtonOffset(int i) {
        if (this.T != i) {
            this.T = i;
            l();
        }
    }

    public void setGlassEngine(vy4 vy4Var) {
        View[] viewPages;
        this.O = vy4Var;
        uq0 uq0Var = this.h;
        vy4Var.c(uq0Var);
        for (View view : uq0Var.getViewPages()) {
            if (view instanceof au8) {
                vy4Var.b(((au8) view).f);
            }
        }
    }

    public void setPaddingTop(int i) {
        if (this.L != i) {
            this.L = i;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z) {
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            au8.a(currentPage, z);
        }
    }

    public void setReorderingCollections(boolean z) {
        if (this.P != z) {
            this.P = z;
            q(g());
            this.n.setReordering(z);
            if (z) {
                e S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.k3(false);
                    hl.c3(new y56(profileActivity, (byte) 28));
                }
            }
            if (!z) {
                ft8 ft8Var = this.R;
                hl.r(ft8Var);
                hl.c3(ft8Var);
            }
        }
    }

    public void setVisibleHeight(int i) {
        View[] viewPages;
        this.U = i;
        l();
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    ((au8) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
