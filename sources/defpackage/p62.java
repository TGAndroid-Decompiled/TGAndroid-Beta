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
public final class p62 extends p02 implements tjb, gk7, x74 {
    public final n62 E;
    public final g24 F;
    public final t02 G;
    public final fm0 n;
    public final FrameLayout r;
    public final fu s;
    public final z12 w;
    public final HashSet x;
    public final m62 y;

    public p62(x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        this.n = new fm0(0, this, s33.h, 380L, false);
        this.x = new HashSet();
        this.E = new n62(this, context);
        w02 w02Var = new w02(bkb.c6, wjbVar, context);
        w02Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        t02 t02Var = new t02(this.b, wjbVar, context);
        this.G = t02Var;
        t02Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        b7 b7Var = new b7(this, (byte) 9);
        l7 l7Var = t02Var.r;
        l7Var.addTextChangedListener(b7Var);
        l7Var.setHint(k96.M0(2131752644, null));
        frameLayout.addView(w02Var, nme.g());
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += gl.m;
        frameLayout.addView(t02Var, d);
        g24 g24Var = new g24(context, wjbVar);
        this.F = g24Var;
        g24Var.c();
        addView(g24Var, nme.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        fu fuVar = new fu(this, context, wjbVar, (byte) 11);
        this.s = fuVar;
        fuVar.r1();
        setBlur3Capture(fuVar);
        this.d = fuVar;
        this.h = true;
        this.f = true;
        kk7.e().h(fuVar, kk7.k4, new be2(this, (byte) 19));
        fuVar.setClipToPadding(false);
        getContext();
        z12 z12Var = new z12(this, gl.L(9.0f), fuVar, (byte) 4);
        this.w = z12Var;
        fuVar.setLayoutManager(z12Var);
        z12Var.P = false;
        fuVar.setHorizontalScrollBarEnabled(false);
        fuVar.setVerticalScrollBarEnabled(false);
        fuVar.setClipToPadding(false);
        addView(fuVar, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        m62 m62Var = new m62(this, context);
        this.y = m62Var;
        fuVar.setAdapter(m62Var);
        zkb.l(fuVar, 21, bkb.z5, wjbVar);
        fuVar.setOnItemClickListener(new u(this, (byte) 9));
        fuVar.setOnScrollListener(new y(this, (byte) 22));
        FrameLayout.LayoutParams e = nme.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += gl.m;
        addView(frameLayout, e);
        Q();
    }

    public static int P(p62 p62Var) {
        return p62Var.getCurrentTop();
    }

    public int getCurrentTop() {
        fu fuVar = this.s;
        if (fuVar.getChildCount() != 0) {
            int i = 0;
            View childAt = fuVar.getChildAt(0);
            y29 y29Var = (y29) fuVar.G(childAt);
            if (y29Var != null) {
                int paddingTop = fuVar.getPaddingTop();
                if (y29Var.b() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void C(int i, int i2) {
        int i3;
        x02 x02Var = this.b;
        if (x02Var.o3.Q() > gl.L(20.0f)) {
            i3 = gl.L(8.0f);
            x02Var.r0 = false;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    x02Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            x02Var.r0 = true;
        }
        this.s.q1(0, i3 + gl.m, 0, this.e);
    }

    @Override
    public final void I(p02 p02Var) {
        this.w.g1(0, 0);
    }

    @Override
    public final void K() {
        this.s.z0(0);
    }

    public final void Q() {
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
        R();
    }

    public final void R() {
        View childAt;
        g24 g24Var = this.F;
        if (g24Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        g24Var.setTranslationY((childAt.getTop() + (g24Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.p5));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
    }

    @Override
    public int getCurrentItemTop() {
        int i;
        fu fuVar = this.s;
        if (fuVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = fuVar.getChildAt(0);
        y29 y29Var = (y29) fuVar.G(childAt);
        int top = (childAt.getTop() - gl.m) - gl.L(8.0f);
        if (top > 0 && y29Var != null && y29Var.b() == 0) {
            i = top;
        } else {
            i = 0;
        }
        fm0 fm0Var = this.n;
        if (top >= 0 && y29Var != null && y29Var.b() == 0) {
            fm0Var.a(false, true);
        } else {
            fm0Var.a(true, true);
            top = i;
        }
        this.r.setTranslationY(top);
        return gl.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return gl.L(4.0f) + getListTopPadding();
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
    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        int i = bkb.p5;
        arrayList.add(new blb(this.s, 0, new Class[]{o62.class}, new String[]{"nameTextView"}, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(kl0 kl0Var) {
        t02 t02Var = this.G;
        if (t02Var != null) {
            t02Var.setupBlurredBackground(kl0Var.c(t02Var, nod.a(this.a), false));
        }
    }

    @Override
    public final void q() {
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void F(float f, int i) {
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
    }
}
