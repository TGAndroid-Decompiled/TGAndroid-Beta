package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.n8;
import c8.na;
import hi.c7;
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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ti;
public final class h0 extends li implements c6, fs, te.b {
    public final f0 E;
    public final sy F;
    public final pi G;
    public final te.a f18420n;
    public final FrameLayout f18421r;
    public final di.b1 f18422s;
    public final d0 f18423w;
    public final HashSet f18424x;
    public final e0 f18425y;

    public h0(Context context, i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
        this.f18420n = new te.a(0, this, kr.h, 380L, false);
        this.f18424x = new HashSet();
        this.E = new f0(this, context);
        si siVar = new si(n6.f29451d6, context, i6Var);
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18421r = frameLayout;
        pi piVar = new pi(context, i6Var, this.f37135b);
        this.G = piVar;
        piVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 10);
        ah.i iVar = piVar.f33883r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(gd.N0(2131752644, null));
        frameLayout.addView(siVar, na.g());
        FrameLayout.LayoutParams d = na.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24220m;
        frameLayout.addView(piVar, d);
        sy syVar = new sy(context, i6Var);
        this.F = syVar;
        syVar.c();
        addView(syVar, na.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, i6Var, 4);
        this.f18422s = b1Var;
        b1Var.r1();
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f37138f = true;
        ks.e().h(b1Var, ks.f25247l4, new c7(this, 8));
        b1Var.setClipToPadding(false);
        getContext();
        d0 d0Var = new d0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 0);
        this.f18423w = d0Var;
        b1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e0 e0Var = new e0(this, context);
        this.f18425y = e0Var;
        b1Var.setAdapter(e0Var);
        u6.l(b1Var, 21, n6.A5, i6Var);
        b1Var.setOnItemClickListener(new n8(this, 15));
        b1Var.setOnScrollListener(new bi.v1(this, 19));
        FrameLayout.LayoutParams e10 = na.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f24220m;
        addView(frameLayout, e10);
        Q();
    }

    public static int P(h0 h0Var) {
        return h0Var.getCurrentTop();
    }

    public int getCurrentTop() {
        di.b1 b1Var = this.f18422s;
        if (b1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = b1Var.getChildAt(0);
            mj0 mj0Var = (mj0) b1Var.G(childAt);
            if (mj0Var != null) {
                int paddingTop = b1Var.getPaddingTop();
                if (mj0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ti tiVar = this.f37135b;
        if (tiVar.f40002p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            tiVar.f30257r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    tiVar.f30257r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            tiVar.f30257r0 = true;
        }
        this.f18422s.q1(0, i11 + org.telegram.messenger.g0.f24220m, 0, this.f37137e);
    }

    @Override
    public final void H(li liVar) {
        this.f18423w.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f18422s.y0(0);
    }

    public final void Q() {
        boolean z10;
        int i7 = 0;
        if (this.f18422s.getAdapter().b() == 2) {
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
        sy syVar = this.F;
        if (syVar.getVisibility() != 0 || (childAt = this.f18422s.getChildAt(0)) == null) {
            return;
        }
        syVar.setTranslationY((childAt.getTop() + (syVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
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
        hashSet.add(Integer.valueOf(n6.f29690q5));
        hashSet.add(Integer.valueOf(n6.f29452d7));
        hashSet.add(Integer.valueOf(n6.f29543i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.b1 b1Var = this.f18422s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f18420n;
        if (top >= 0 && mj0Var != null && mj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f18421r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f18422s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<w6> getThemeDescriptions() {
        ArrayList<w6> arrayList = new ArrayList<>();
        arrayList.add(new w6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (v6) null, n6.f29434c7));
        arrayList.add(new w6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (v6) null, n6.f29525h6));
        int i7 = n6.f29690q5;
        arrayList.add(new w6(this.f18422s, 0, new Class[]{g0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (v6) null, i7));
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
        this.f37135b.f30226b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        pi piVar = this.G;
        if (piVar != null) {
            piVar.setupBlurredBackground(cVar.c(piVar, c8.j0.a(this.f37134a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void G(float f10, int i7) {
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
    }
}
