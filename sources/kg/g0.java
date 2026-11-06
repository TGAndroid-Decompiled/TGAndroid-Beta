package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zh;
public final class g0 extends vh implements a6, ls, te.b {
    public final e0 D;
    public final iy E;
    public final zh F;
    public final te.a f17381n;
    public final FrameLayout f17382r;
    public final bi.q1 f17383s;
    public final c0 f17384w;
    public final HashSet f17385x;
    public final d0 f17386y;

    public g0(Context context, f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        this.f17381n = new te.a(0, this, xq.h, 380L, false);
        this.f17385x = new HashSet();
        this.D = new e0(this, context);
        ci ciVar = new ci(k6.f27849d6, context, f6Var);
        ciVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17382r = frameLayout;
        zh zhVar = new zh(context, f6Var, this.f38969b);
        this.F = zhVar;
        zhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 8);
        ah.i iVar = zhVar.f37441r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(hd.M0(2131752656, null));
        frameLayout.addView(ciVar, ha.g());
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f22538m;
        frameLayout.addView(zhVar, d);
        iy iyVar = new iy(context, f6Var);
        this.E = iyVar;
        iyVar.c();
        addView(iyVar, ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, f6Var, 5);
        this.f17383s = q1Var;
        q1Var.r1();
        setBlur3Capture(q1Var);
        this.d = q1Var;
        this.h = true;
        this.f38972f = true;
        qs.e().h(q1Var, qs.f25009i4, new ii.c(this, 4));
        q1Var.setClipToPadding(false);
        getContext();
        c0 c0Var = new c0(this, org.telegram.messenger.g0.L(9.0f), q1Var, 0);
        this.f17384w = c0Var;
        q1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setClipToPadding(false);
        addView(q1Var, ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d0 d0Var = new d0(this, context);
        this.f17386y = d0Var;
        q1Var.setAdapter(d0Var);
        r6.m(q1Var, 21, k6.A5, f6Var);
        q1Var.setOnItemClickListener(new ai.k(this, 15));
        q1Var.setOnScrollListener(new ai.b(this, 21));
        FrameLayout.LayoutParams e10 = ha.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f22538m;
        addView(frameLayout, e10);
        P();
    }

    public static int O(g0 g0Var) {
        return g0Var.getCurrentTop();
    }

    public int getCurrentTop() {
        bi.q1 q1Var = this.f17383s;
        if (q1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = q1Var.getChildAt(0);
            xi0 xi0Var = (xi0) q1Var.G(childAt);
            if (xi0Var != null) {
                int paddingTop = q1Var.getPaddingTop();
                if (xi0Var.b() == 0 && childAt.getTop() >= 0) {
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
        di diVar = this.f38969b;
        if (diVar.f32959l3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            diVar.f28641q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22544q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    diVar.f28641q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            diVar.f28641q0 = true;
        }
        this.f17383s.q1(0, i11 + org.telegram.messenger.g0.f22538m, 0, this.f38971e);
    }

    @Override
    public final void H(vh vhVar) {
        this.f17384w.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f17383s.y0(0);
    }

    public final void P() {
        boolean z9;
        int i7 = 0;
        if (this.f17383s.getAdapter().b() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            i7 = 8;
        }
        this.E.setVisibility(i7);
        Q();
    }

    public final void Q() {
        View childAt;
        iy iyVar = this.E;
        if (iyVar.getVisibility() != 0 || (childAt = this.f17383s.getChildAt(0)) == null) {
            return;
        }
        iyVar.setTranslationY((childAt.getTop() + (iyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.U7));
        hashSet.add(Integer.valueOf(k6.T7));
        hashSet.add(Integer.valueOf(k6.S7));
        hashSet.add(Integer.valueOf(k6.R7));
        hashSet.add(Integer.valueOf(k6.Q7));
        hashSet.add(Integer.valueOf(k6.P7));
        hashSet.add(Integer.valueOf(k6.O7));
        hashSet.add(Integer.valueOf(k6.J7));
        hashSet.add(Integer.valueOf(k6.f28088q5));
        hashSet.add(Integer.valueOf(k6.f27850d7));
        hashSet.add(Integer.valueOf(k6.f27941i6));
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        bi.q1 q1Var = this.f17383s;
        if (q1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f22538m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f17381n;
        if (top >= 0 && xi0Var != null && xi0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f17382r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f17383s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<t6> getThemeDescriptions() {
        ArrayList<t6> arrayList = new ArrayList<>();
        arrayList.add(new t6(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27832c7));
        arrayList.add(new t6(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27923h6));
        int i7 = k6.f28088q5;
        arrayList.add(new t6(this.f17383s, 0, new Class[]{f0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (s6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Q();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38969b.f28616b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        zh zhVar = this.F;
        if (zhVar != null) {
            zhVar.setupBlurredBackground(cVar.c(zhVar, c8.g0.a(this.f38968a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void F(float f10, int i7) {
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
    }
}
