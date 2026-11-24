package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class a82 extends a22 implements vlb, jm7, g94 {
    public final y72 E;
    public final r34 F;
    public final e22 G;
    public final fn0 n;
    public final FrameLayout r;
    public final fv s;
    public final l32 w;
    public final HashSet x;
    public final x72 y;

    public a82(i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        this.n = new fn0(0, this, d53.h, 380L, false);
        this.x = new HashSet();
        this.E = new y72(this, context);
        h22 h22Var = new h22(cmb.c6, ylbVar, context);
        h22Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        e22 e22Var = new e22(this.b, ylbVar, context);
        this.G = e22Var;
        e22Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        b7 b7Var = new b7(this, (byte) 10);
        l7 l7Var = e22Var.r;
        l7Var.addTextChangedListener(b7Var);
        l7Var.setHint(jb6.M0(2131752609, null));
        frameLayout.addView(h22Var, qoe.g());
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += gm.m;
        frameLayout.addView(e22Var, d);
        r34 r34Var = new r34(context, ylbVar);
        this.F = r34Var;
        r34Var.c();
        addView(r34Var, qoe.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        fv fvVar = new fv(this, context, ylbVar, (byte) 11);
        this.s = fvVar;
        fvVar.r1();
        setBlur3Capture(fvVar);
        this.d = fvVar;
        this.h = true;
        this.f = true;
        nm7.e().h(fvVar, nm7.m4, new mf2(this, (byte) 19));
        fvVar.setClipToPadding(false);
        getContext();
        l32 l32Var = new l32(this, gm.L(9.0f), fvVar, (byte) 4);
        this.w = l32Var;
        fvVar.setLayoutManager(l32Var);
        l32Var.P = false;
        fvVar.setHorizontalScrollBarEnabled(false);
        fvVar.setVerticalScrollBarEnabled(false);
        fvVar.setClipToPadding(false);
        addView(fvVar, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        x72 x72Var = new x72(this, context);
        this.y = x72Var;
        fvVar.setAdapter(x72Var);
        anb.l(fvVar, 21, cmb.z5, ylbVar);
        fvVar.setOnItemClickListener(new u(this, (byte) 10));
        fvVar.setOnScrollListener(new y(this, (byte) 23));
        FrameLayout.LayoutParams e = qoe.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += gm.m;
        addView(frameLayout, e);
        P();
    }

    public static int O(a82 a82Var) {
        return a82Var.getCurrentTop();
    }

    public int getCurrentTop() {
        fv fvVar = this.s;
        if (fvVar.getChildCount() != 0) {
            int i = 0;
            View childAt = fvVar.getChildAt(0);
            b59 b59Var = (b59) fvVar.G(childAt);
            if (b59Var != null) {
                int paddingTop = fvVar.getPaddingTop();
                if (b59Var.b() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i, int i2) {
        int i3;
        i22 i22Var = this.b;
        if (i22Var.o3.Q() > gm.L(20.0f)) {
            i3 = gm.L(8.0f);
            i22Var.r0 = false;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    i22Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            i22Var.r0 = true;
        }
        this.s.q1(0, i3 + gm.m, 0, this.e);
    }

    @Override
    public final void H(a22 a22Var) {
        this.w.g1(0, 0);
    }

    @Override
    public final void J() {
        this.s.z0(0);
    }

    public final void P() {
        boolean z;
        int i = 0;
        if (this.s.getAdapter().b() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        this.F.setVisibility(i);
        Q();
    }

    public final void Q() {
        View childAt;
        r34 r34Var = this.F;
        if (r34Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        r34Var.setTranslationY((childAt.getTop() + (r34Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.p5));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
    }

    @Override
    public int getCurrentItemTop() {
        int i;
        fv fvVar = this.s;
        if (fvVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = (childAt.getTop() - gm.m) - gm.L(8.0f);
        if (top > 0 && b59Var != null && b59Var.b() == 0) {
            i = top;
        } else {
            i = 0;
        }
        fn0 fn0Var = this.n;
        if (top >= 0 && b59Var != null && b59Var.b() == 0) {
            fn0Var.a(false, true);
        } else {
            fn0Var.a(true, true);
            top = i;
        }
        this.r.setTranslationY(top);
        return gm.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        int i = cmb.p5;
        arrayList.add(new cnb(this.s, 0, new Class[]{z72.class}, new String[]{"nameTextView"}, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Q();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(km0 km0Var) {
        e22 e22Var = this.G;
        if (e22Var != null) {
            e22Var.setupBlurredBackground(km0Var.c(e22Var, qqd.a(this.a), false));
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
    }
}
