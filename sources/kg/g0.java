package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.i8;
import c8.ma;
import hi.t6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ty;
public final class g0 extends ki implements c6, fs, te.b {
    public final e0 E;
    public final ty F;
    public final oi G;
    public final te.a f18320n;
    public final FrameLayout f18321r;
    public final di.b1 f18322s;
    public final c0 f18323w;
    public final HashSet f18324x;
    public final d0 f18325y;

    public g0(Context context, i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        this.f18320n = new te.a(0, this, lr.h, 380L, false);
        this.f18324x = new HashSet();
        this.E = new e0(this, context);
        ri riVar = new ri(n6.f29396d6, context, i6Var);
        riVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18321r = frameLayout;
        oi oiVar = new oi(context, i6Var, this.f36766b);
        this.G = oiVar;
        oiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 10);
        ah.i iVar = oiVar.f33845r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(gd.M0(2131752645, null));
        frameLayout.addView(riVar, ma.g());
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24115m;
        frameLayout.addView(oiVar, d);
        ty tyVar = new ty(context, i6Var);
        this.F = tyVar;
        tyVar.c();
        addView(tyVar, ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, i6Var, 4);
        this.f18322s = b1Var;
        b1Var.r1();
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f36769f = true;
        ks.e().h(b1Var, ks.f25145k4, new t6(this, 8));
        b1Var.setClipToPadding(false);
        getContext();
        c0 c0Var = new c0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 0);
        this.f18323w = c0Var;
        b1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d0 d0Var = new d0(this, context);
        this.f18325y = d0Var;
        b1Var.setAdapter(d0Var);
        u6.l(b1Var, 21, n6.A5, i6Var);
        b1Var.setOnItemClickListener(new i8(this, 15));
        b1Var.setOnScrollListener(new bi.q1(this, 19));
        FrameLayout.LayoutParams e10 = ma.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f24115m;
        addView(frameLayout, e10);
        Q();
    }

    public static int P(g0 g0Var) {
        return g0Var.getCurrentTop();
    }

    public int getCurrentTop() {
        di.b1 b1Var = this.f18322s;
        if (b1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = b1Var.getChildAt(0);
            kj0 kj0Var = (kj0) b1Var.G(childAt);
            if (kj0Var != null) {
                int paddingTop = b1Var.getPaddingTop();
                if (kj0Var.b() == 0 && childAt.getTop() >= 0) {
                    i7 = childAt.getTop();
                }
                return paddingTop - i7;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i7, int i10) {
        int i11;
        si siVar = this.f36766b;
        if (siVar.f39705p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            siVar.f30223r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24121q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    siVar.f30223r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            siVar.f30223r0 = true;
        }
        this.f18322s.q1(0, i11 + org.telegram.messenger.g0.f24115m, 0, this.f36768e);
    }

    @Override
    public final void I(ki kiVar) {
        this.f18323w.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f18322s.y0(0);
    }

    public final void Q() {
        boolean z10;
        int i7 = 0;
        if (this.f18322s.getAdapter().b() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i7 = 8;
        }
        this.F.setVisibility(i7);
        R();
    }

    public final void R() {
        View childAt;
        ty tyVar = this.F;
        if (tyVar.getVisibility() != 0 || (childAt = this.f18322s.getChildAt(0)) == null) {
            return;
        }
        tyVar.setTranslationY((childAt.getTop() + (tyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.U7));
        hashSet.add(Integer.valueOf(n6.T7));
        hashSet.add(Integer.valueOf(n6.S7));
        hashSet.add(Integer.valueOf(n6.R7));
        hashSet.add(Integer.valueOf(n6.Q7));
        hashSet.add(Integer.valueOf(n6.P7));
        hashSet.add(Integer.valueOf(n6.O7));
        hashSet.add(Integer.valueOf(n6.J7));
        hashSet.add(Integer.valueOf(n6.f29635q5));
        hashSet.add(Integer.valueOf(n6.f29397d7));
        hashSet.add(Integer.valueOf(n6.f29488i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.b1 b1Var = this.f18322s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f24115m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && kj0Var != null && kj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f18320n;
        if (top >= 0 && kj0Var != null && kj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f18321r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f18322s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<w6> getThemeDescriptions() {
        ArrayList<w6> arrayList = new ArrayList<>();
        arrayList.add(new w6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (v6) null, n6.f29379c7));
        arrayList.add(new w6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (v6) null, n6.f29470h6));
        int i7 = n6.f29635q5;
        arrayList.add(new w6(this.f18322s, 0, new Class[]{f0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (v6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30192b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        oi oiVar = this.G;
        if (oiVar != null) {
            oiVar.setupBlurredBackground(cVar.c(oiVar, c8.i0.a(this.f36765a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void D(float f10, int i7) {
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
    }
}
