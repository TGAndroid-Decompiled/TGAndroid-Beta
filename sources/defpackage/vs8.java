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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class vs8 extends FrameLayout implements jm7 {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final jh2 G;
    public final FrameLayout H;
    public int I;
    public bu5 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public sy4 O;
    public boolean P;
    public int Q;
    public final ur8 R;
    public final fn0 S;
    public int T;
    public int U;
    public final d a;
    public final int b;
    public final long c;
    public final ava d;
    public final yua e;
    public final ylb f;
    public final ur0 h;
    public final vgc n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final b61 x;
    public byte y;

    public vs8(org.telegram.ui.ActionBar.d r31, android.content.Context r32, int r33, long r34, defpackage.ylb r36, defpackage.km0 r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs8.<init>(org.telegram.ui.ActionBar.d, android.content.Context, int, long, ylb, km0):void");
    }

    public static void j(a8 a8Var, final ava avaVar, final Runnable runnable, final int i) {
        a8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i2;
                ava avaVar2 = ava.this;
                avaVar2.getClass();
                short s = i;
                if ((s & 15) != 0) {
                    i2 = 15;
                } else if ((s & 768) != 0) {
                    i2 = 768;
                } else {
                    i2 = 0;
                }
                int i3 = avaVar2.g & i2;
                int flag = TLObject.setFlag(i3, s, !TLObject.hasFlag(i3, s));
                if (flag == 0) {
                    flag = i2 & (~s);
                }
                int i4 = avaVar2.g;
                int i5 = ((~i2) & i4) | flag;
                if (i4 != i5) {
                    avaVar2.g = i5;
                    avaVar2.k(true);
                }
                runnable.run();
            }
        });
        a8Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                ava.this.g(i, true);
                runnable.run();
                return true;
            }
        });
    }

    public final void a() {
        ava avaVar;
        rs8 currentPage = getCurrentPage();
        if (currentPage != null && (avaVar = currentPage.e) != null && currentPage.d) {
            int i = avaVar.d;
            new p0a(this.a, this.c, i, new h71(this, i, currentPage, (byte) 3)).show();
        }
    }

    public final boolean b() {
        yua yuaVar = this.e;
        if (yuaVar.h() && yuaVar.d().size() < oc7.r1(this.b).l4.x.f()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        long j = this.c;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.b;
        if (i >= 0) {
            if (i != 0 && j != z8c.h(i2).e()) {
                return false;
            }
            return true;
        }
        return sd2.w(5, oc7.r1(i2).L0(Long.valueOf(-j)));
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
        int i5 = nm7.I3;
        LinearLayout linearLayout = this.E;
        b61 b61Var = this.x;
        long j = this.c;
        int i6 = 8;
        if (i == i5) {
            if (((Long) objArr[0]).longValue() == j) {
                if (d()) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                b61Var.setVisibility(i4);
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
        } else if (i == nm7.J3) {
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
            b61Var.setVisibility(i3);
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
        ur0 ur0Var = this.h;
        if (ur0Var != null && this.n != null) {
            ur0Var.m(z);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        rs8 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.r;
        float translationY = frameLayout.getTranslationY() - kt6.y(this.y, Math.max(gm.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < gm.L(240.0f)) {
            translationY += Math.min(gm.L(240.0f) - this.U, gm.L(this.y));
        }
        return (int) (gm.L(this.y) - translationY);
    }

    public ava getCurrentList() {
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public r59 getCurrentListView() {
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public rs8 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (rs8) currentView;
    }

    public int getGiftsCount() {
        int i;
        ava avaVar;
        int i2;
        rs8 currentPage = getCurrentPage();
        ava avaVar2 = this.d;
        if (currentPage != null && (avaVar = currentPage.e) != avaVar2) {
            if (avaVar != null && (i2 = avaVar.n) > 0) {
                return i2;
            }
        } else if (avaVar2 != null && (i = avaVar2.n) > 0) {
            return i;
        }
        long j = this.c;
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i4 = this.b;
        if (i3 >= 0) {
            TLRPC.UserFull X1 = oc7.r1(i4).X1(j);
            if (X1 == null) {
                return 0;
            }
            return X1.stargifts_count;
        }
        TLRPC.ChatFull M0 = oc7.r1(i4).M0(-j);
        if (M0 == null) {
            return 0;
        }
        return M0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j = 0;
        ava avaVar = this.d;
        if (avaVar != null && !avaVar.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < avaVar.l.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) avaVar.l.get(i2)).gift.getDocument();
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
        ur0 ur0Var = this.h;
        float f = 0.0f;
        if (ur0Var.getViewPages() != null) {
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    f = (((rs8) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f;
                }
            }
        }
        return f;
    }

    public float getTabsVisibility() {
        vgc vgcVar = this.n;
        if (vgcVar != null) {
            return vgcVar.getAlpha();
        }
        return 0.0f;
    }

    public final void h(qac qacVar, String str) {
        View view;
        int i;
        wt5 wt5Var;
        Context context = getContext();
        Activity W = gm.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        he[] heVarArr = new he[1];
        ylb ylbVar = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        he heVar = alertDialog$Builder.a;
        if (str != null) {
            heVar.S = jb6.M0(2131750148, null);
        } else {
            heVar.S = jb6.M0(2131750028, null);
            heVar.U = jb6.M0(2131750029, null);
        }
        fs8 fs8Var = new fs8(this, context, ylbVar);
        fs8Var.s0 = true;
        fs8Var.setOnEditorActionListener(new hw0(fs8Var, qacVar, heVarArr, view, (byte) 1));
        hs6.d0(this.b).O(gm.F0(), true);
        fs8Var.setTextSize(1, 18.0f);
        anb.X(fs8Var, cmb.i5, ylbVar);
        anb.l(fs8Var, 34, cmb.Ni, ylbVar);
        fs8Var.setHintText(jb6.M0(2131750030, null));
        fs8Var.setFocusable(true);
        fs8Var.setInputType(147457);
        anb.F(fs8Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        fs8Var.setImeOptions(6);
        fs8Var.setBackgroundDrawable(null);
        fs8Var.setPadding(0, gm.L(6.0f), 0, gm.L(6.0f));
        fs8Var.addTextChangedListener(new ef6(fs8Var, (byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        fs8Var.setText(str);
        linearLayout.addView(fs8Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        heVar.a = gm.L(292.0f);
        if (str != null) {
            i = 2131751272;
        } else {
            i = 2131751690;
        }
        alertDialog$Builder.j(jb6.M0(i, null), new xr8(fs8Var, qacVar, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new i98((byte) 7));
        heVarArr[0] = heVar;
        bu5 bu5Var = this.J;
        if (bu5Var != null && (wt5Var = bu5Var.m) != null) {
            wt5Var.setSoftInputMode(48);
        }
        gm.U2(W, this.a.getClassGuid());
        heVarArr[0].setOnDismissListener(new ah(this, fs8Var, W, (byte) 6));
        heVarArr[0].setOnShowListener(new jh(fs8Var, (byte) 5));
        heVarArr[0].show();
        he heVar2 = heVarArr[0];
        heVar2.k0 = false;
        heVar2.c(-1);
        fs8Var.setSelection(fs8Var.getText().length());
    }

    public final void i() {
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i) {
        ava avaVar;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            yua yuaVar = this.e;
            if (i2 < yuaVar.d().size()) {
                if (i2 >= 0 && i2 < yuaVar.d().size()) {
                    avaVar = yuaVar.e(((TL_stars.TL_starGiftCollection) yuaVar.d().get(i2)).collection_id);
                } else {
                    avaVar = null;
                }
                if (avaVar != null) {
                    return avaVar.l.isEmpty();
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
        y21 y21Var;
        ur0 ur0Var = this.h;
        if (ur0Var != null) {
            if (ur0Var.getCurrentPosition() == ur0Var.getNextPosition()) {
                if (k(ur0Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(ur0Var.getCurrentPosition())) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float currentPositionAlpha = ur0Var.getCurrentPositionAlpha() * f;
                if (k(ur0Var.getNextPosition())) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                nextPositionAlpha = (ur0Var.getNextPositionAlpha() * f2) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.r;
            float y = kt6.y(this.y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((gm.L(68.0f) + 2) * nextPositionAlpha) + y;
            int i = 0;
            if (this.U > gm.L(184.0f)) {
                z = true;
            } else {
                z = false;
            }
            fn0 fn0Var = this.S;
            fn0Var.a(z, true);
            float f3 = fn0Var.e;
            float R1 = gm.R1(gm.L(60.0f) + y, (gm.L(16.0f) * nextPositionAlpha) + y, f3);
            float f4 = (1.0f - nextPositionAlpha) * f3;
            this.H.setTranslationY(gm.R1(gm.L(60.0f) + L, L, f3) - gm.L(200.0f));
            frameLayout.setTranslationY(R1 - this.T);
            frameLayout.setAlpha(f4);
            if (f4 <= 0.0f) {
                i = 4;
            }
            frameLayout.setVisibility(i);
            if (this.e.h() && ur0Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.w;
            } else {
                spannableStringBuilder = this.s;
            }
            this.x.i(spannableStringBuilder, true, true);
            u31 u31Var = u31.x;
            if (u31Var != null && (y21Var = u31Var.e) != null) {
                y21Var.updatePosition();
            }
        }
    }

    public final void m() {
        b61 b61Var = this.x;
        b61Var.updateColors();
        int i = cmb.Ei;
        ylb ylbVar = this.f;
        int c1 = ((lea) this).W.c1(cmb.v0(i, ylbVar));
        if (b61Var.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) b61Var.getBackground()).getPaint().getColor() != c1) {
                cmb.A1(c1, b61Var.getBackground());
                b61Var.invalidate();
            }
        } else {
            b61Var.setBackground(cmb.b0(gm.L(19.0f), c1));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    rs8 rs8Var = (rs8) view;
                    ylb ylbVar2 = rs8Var.c;
                    if (rs8Var.r != null) {
                        rs8Var.w.setTextColor(cmb.v0(cmb.F6, ylbVar2));
                        rs8Var.x.setTextColor(cmb.v0(cmb.Ei, ylbVar2));
                    } else {
                        rs8Var.F.setTextColor(cmb.v0(cmb.F6, ylbVar2));
                        rs8Var.G.setTextColor(cmb.v0(cmb.x6, ylbVar2));
                        rs8Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(cmb.v0(cmb.i5, ylbVar));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof rs8) {
                rs8 rs8Var = (rs8) view;
                va vaVar = rs8Var.f;
                int paddingTop = vaVar.getPaddingTop();
                rs8Var.g();
                int paddingTop2 = paddingTop - vaVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    gm.J(vaVar, new bs8(rs8Var, paddingTop2, (byte) 0));
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
        ur0 ur0Var = this.h;
        if (ur0Var.getViewPages() != null) {
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    ((rs8) view).setHasTabs(z);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.b;
        nm7.f(i).b(this, nm7.I3);
        nm7.f(i).b(this, nm7.J3);
        nm7.f(i).b(this, 2);
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        ava avaVar = this.d;
        if (avaVar != null) {
            avaVar.o = true;
            avaVar.a();
        }
        yua yuaVar = this.e;
        if (yuaVar != null) {
            yuaVar.j = true;
            yuaVar.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        rs8 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i = this.b;
        nm7.f(i).n(this, nm7.I3);
        nm7.f(i).n(this, nm7.J3);
        nm7.f(i).n(this, 2);
        ava avaVar = this.d;
        if (avaVar != null) {
            avaVar.o = false;
        }
        yua yuaVar = this.e;
        if (yuaVar != null) {
            yuaVar.j = false;
        }
    }

    public final void p() {
        float f;
        View[] viewPages;
        float f2;
        vgc vgcVar = this.n;
        if (vgcVar == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - gm.L(42.0f));
        float l = Utilities.l(gm.x1(min - this.L, -gm.L(42.0f), 0.0f));
        float R1 = gm.R1(0.9f, 1.0f, l);
        vgcVar.setTranslationY(min);
        vgcVar.setScaleX(R1);
        vgcVar.setScaleY(R1);
        ur0 ur0Var = this.h;
        if (ur0Var.getViewPages() != null) {
            f = 0.0f;
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    if (((rs8) view).I) {
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
        vgcVar.setAlpha(pqe.a(f, 0.0f, 1.0f) * l);
    }

    public abstract void q(boolean z);

    public void setButtonOffset(int i) {
        if (this.T != i) {
            this.T = i;
            l();
        }
    }

    public void setGlassEngine(sy4 sy4Var) {
        View[] viewPages;
        this.O = sy4Var;
        ur0 ur0Var = this.h;
        sy4Var.c(ur0Var);
        for (View view : ur0Var.getViewPages()) {
            if (view instanceof rs8) {
                sy4Var.b(((rs8) view).f);
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
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            rs8.a(currentPage, z);
        }
    }

    public void setReorderingCollections(boolean z) {
        if (this.P != z) {
            this.P = z;
            q(g());
            this.n.setReordering(z);
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.n3(false);
                    gm.c3(new v56(profileActivity, (byte) 29));
                }
            }
            if (!z) {
                ur8 ur8Var = this.R;
                gm.r(ur8Var);
                gm.c3(ur8Var);
            }
        }
    }

    public void setVisibleHeight(int i) {
        View[] viewPages;
        this.U = i;
        l();
        ur0 ur0Var = this.h;
        if (ur0Var != null) {
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    ((rs8) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
