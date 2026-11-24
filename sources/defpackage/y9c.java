package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public abstract class y9c extends my0 {
    public boolean A1;
    public boolean B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public final wd4 L1;
    public final boolean M1;
    public TextView l1;
    public final FrameLayout m1;
    public final pu9 n1;
    public q59 o1;
    public q59 p1;
    public final Drawable q1;
    public final View r1;
    public AnimatorSet s1;
    public final a1b t1;
    public final tk4 u1;
    public final x9c v1;
    public final RectF w1;
    public int x1;
    public float y1;
    public int z1;

    static {
        new pn("colorProgress", (byte) 19);
    }

    public y9c(int i, ylb ylbVar, Context context) {
        super(1, ylbVar, context, false);
        this.w1 = new RectF();
        this.A1 = true;
        this.B1 = true;
        this.C1 = cmb.yj;
        this.D1 = cmb.h6;
        int i2 = cmb.c6;
        this.E1 = i2;
        this.F1 = i2;
        this.G1 = cmb.F6;
        int i3 = cmb.x6;
        this.H1 = i3;
        this.I1 = i3;
        int i4 = cmb.P5;
        this.J1 = i4;
        this.K1 = i4;
        this.M1 = true;
        this.J0 = ylbVar;
        K0();
        this.q0 = (byte) 75;
        this.a = i;
        this.q1 = b10.d(context, 2131232745);
        w9c D0 = D0(context);
        this.b = D0;
        D0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        x9c x9cVar = new x9c(this, context, ylbVar);
        this.v1 = x9cVar;
        x9cVar.y = true;
        x9cVar.updateColors();
        x9cVar.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        frameLayout.addView(x9cVar, qoe.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        tk4 tk4Var = new tk4(context, null);
        this.u1 = tk4Var;
        tk4Var.setViewType(6);
        tk4Var.x = false;
        tk4Var.setUseHeaderOffset(true);
        a1b a1bVar = new a1b(context, tk4Var, 1, null);
        this.t1 = a1bVar;
        a1bVar.addView(tk4Var, 0, qoe.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = jb6.M0(2131747901, null);
        xna xnaVar = a1bVar.d;
        xnaVar.setText(M0);
        String M02 = jb6.M0(2131745541, null);
        l66 l66Var = a1bVar.e;
        l66Var.setText(M02);
        a1bVar.setVisibility(8);
        a1bVar.setAnimateLayoutChange(true);
        a1bVar.e(true, false);
        int i6 = this.G1;
        int i7 = this.H1;
        int i8 = this.E1;
        xnaVar.setTag(Integer.valueOf(i6));
        ylb ylbVar2 = a1bVar.n;
        anb.X(xnaVar, i6, ylbVar2);
        l66Var.setTag(Integer.valueOf(i7));
        anb.X(l66Var, i7, ylbVar2);
        a1bVar.H = i8;
        this.b.addView(a1bVar, qoe.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        pu9 pu9Var = new pu9(this, context, ylbVar, (byte) 6);
        this.n1 = pu9Var;
        pu9Var.setOverScrollMode(2);
        pu9Var.setTag(13);
        pu9Var.setPadding(0, 0, 0, gm.L(48.0f));
        pu9Var.setClipToPadding(false);
        pu9Var.setHideIfEmpty(false);
        anb.l(pu9Var, 20, this.D1, ylbVar);
        getContext();
        wd4 wd4Var = new wd4(gm.L(8.0f), 0, pu9Var);
        this.L1 = wd4Var;
        wd4Var.P = false;
        pu9Var.setLayoutManager(wd4Var);
        pu9Var.setHorizontalScrollBarEnabled(false);
        pu9Var.setVerticalScrollBarEnabled(false);
        this.b.addView(pu9Var, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        pu9Var.setOnScrollListener(new k2b(this, (byte) 7));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1(), 51);
        layoutParams.topMargin = gm.L(58.0f);
        View view = new View(context);
        this.r1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, qoe.e(-1, 58, 51));
        H0(0.0f);
        pu9Var.setEmptyView(a1bVar);
        pu9Var.X1 = true;
        pu9Var.Y1 = false;
    }

    @Override
    public final boolean C() {
        return false;
    }

    public w9c D0(Context context) {
        return new w9c(this, context);
    }

    public abstract void E0(MotionEvent motionEvent, l7 l7Var);

    public final void F0(boolean z) {
        Integer num;
        float f;
        View view = this.r1;
        Object tag = view.getTag();
        if (z) {
            if (tag != null) {
                num = null;
            } else {
                return;
            }
        } else if (tag == null) {
            num = 1;
        } else {
            return;
        }
        view.setTag(num);
        if (z) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.s1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s1 = animatorSet2;
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f));
        this.s1.setDuration(150L);
        this.s1.addListener(new sw9((byte) 15, this, z));
        this.s1.start();
    }

    public abstract void G0(String str);

    public final void H0(float f) {
        int i;
        this.y1 = f;
        this.z1 = gm.R0(f, 1.0f, cmb.v0(this.E1, this.J0), cmb.v0(this.F1, this.J0));
        this.q1.setColorFilter(new PorterDuffColorFilter(this.z1, PorterDuff.Mode.MULTIPLY));
        K(this.z1);
        int i2 = this.z1;
        this.H0 = i2;
        pu9 pu9Var = this.n1;
        pu9Var.setGlowColor(i2);
        int R0 = gm.R0(f, 1.0f, cmb.w0(null, this.I1, false), cmb.w0(null, this.H1, false));
        int R02 = gm.R0(f, 1.0f, cmb.w0(null, this.K1, false), cmb.w0(null, this.J1, false));
        int childCount = pu9Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = pu9Var.getChildAt(i3);
            if (childAt instanceof qb5) {
                ((qb5) childAt).a(R0, R0);
            } else if (childAt instanceof wb5) {
                wb5 wb5Var = (wb5) childAt;
                if (this.r1.getTag() != null) {
                    i = this.J1;
                } else {
                    i = this.K1;
                }
                wb5Var.f(i, R02);
            }
        }
        this.b.invalidate();
        pu9Var.invalidate();
        this.c.invalidate();
    }

    public void I0(int i) {
        this.n1.setTopGlowOffset(i);
        float f = i;
        this.m1.setTranslationY(f);
        this.t1.setTranslationY(f);
        this.b.invalidate();
    }

    public final void J0(int i) {
        if (!isShowing()) {
            return;
        }
        this.n1.getViewTreeObserver().addOnPreDrawListener(new qfa(this, i, (byte) 1));
    }

    public void L0() {
        int i;
        int i2;
        pu9 pu9Var = this.n1;
        if (pu9Var.getChildCount() > 0) {
            u69 K = pu9Var.K(0);
            if (K != null) {
                i = K.a.getTop() - gm.L(8.0f);
            } else {
                i = 0;
            }
            if (i > 0 && K != null && K.b() == 0) {
                i2 = i;
            } else {
                i2 = 0;
            }
            if (i >= 0 && K != null && K.b() == 0) {
                F0(false);
            } else {
                F0(true);
                i = i2;
            }
            if (this.x1 != i) {
                this.x1 = i;
                I0(i);
            }
        }
    }

    @Override
    public void dismiss() {
        gm.t1(this.v1.K);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i;
        if (this.l1 == null) {
            TextView textView = new TextView(getContext());
            this.l1 = textView;
            anb.X(textView, cmb.i5, this.J0);
            this.l1.setTextSize(1, 20.0f);
            this.l1.setTypeface(gm.o());
            this.l1.setLines(1);
            this.l1.setMaxLines(1);
            this.l1.setSingleLine(true);
            TextView textView2 = this.l1;
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView2.setGravity(i | 16);
            this.l1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.l1;
            FrameLayout.LayoutParams d = qoe.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.m1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).topMargin = gm.L(30.0f);
            frameLayout.getLayoutParams().height = gm.L(94.0f);
        }
        this.l1.setText(charSequence);
    }

    public void K0() {
    }
}
