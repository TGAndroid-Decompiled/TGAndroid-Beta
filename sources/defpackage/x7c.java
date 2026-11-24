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
public abstract class x7c extends fx0 {
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
    public final wb4 L1;
    public final boolean M1;
    public TextView l1;
    public final FrameLayout m1;
    public final ns9 n1;
    public n39 o1;
    public n39 p1;
    public final Drawable q1;
    public final View r1;
    public AnimatorSet s1;
    public final zya t1;
    public final pi4 u1;
    public final w7c v1;
    public final RectF w1;
    public int x1;
    public float y1;
    public int z1;

    static {
        new pm("colorProgress", (byte) 19);
    }

    public x7c(int i, wjb wjbVar, Context context) {
        super(1, wjbVar, context, false);
        this.w1 = new RectF();
        this.A1 = true;
        this.B1 = true;
        this.C1 = bkb.yj;
        this.D1 = bkb.h6;
        int i2 = bkb.c6;
        this.E1 = i2;
        this.F1 = i2;
        this.G1 = bkb.F6;
        int i3 = bkb.x6;
        this.H1 = i3;
        this.I1 = i3;
        int i4 = bkb.P5;
        this.J1 = i4;
        this.K1 = i4;
        this.M1 = true;
        this.J0 = wjbVar;
        K0();
        this.q0 = (byte) 75;
        this.a = i;
        this.q1 = b00.d(context, 2131232733);
        v7c D0 = D0(context);
        this.b = D0;
        D0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        w7c w7cVar = new w7c(this, context, wjbVar);
        this.v1 = w7cVar;
        w7cVar.y = true;
        w7cVar.updateColors();
        w7cVar.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        frameLayout.addView(w7cVar, nme.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        pi4 pi4Var = new pi4(context, null);
        this.u1 = pi4Var;
        pi4Var.setViewType(6);
        pi4Var.x = false;
        pi4Var.setUseHeaderOffset(true);
        zya zyaVar = new zya(context, pi4Var, 1, null);
        this.t1 = zyaVar;
        zyaVar.addView(pi4Var, 0, nme.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = k96.M0(2131747975, null);
        wla wlaVar = zyaVar.d;
        wlaVar.setText(M0);
        String M02 = k96.M0(2131745615, null);
        l46 l46Var = zyaVar.e;
        l46Var.setText(M02);
        zyaVar.setVisibility(8);
        zyaVar.setAnimateLayoutChange(true);
        zyaVar.e(true, false);
        int i6 = this.G1;
        int i7 = this.H1;
        int i8 = this.E1;
        wlaVar.setTag(Integer.valueOf(i6));
        wjb wjbVar2 = zyaVar.n;
        zkb.X(wlaVar, i6, wjbVar2);
        l46Var.setTag(Integer.valueOf(i7));
        zkb.X(l46Var, i7, wjbVar2);
        zyaVar.H = i8;
        this.b.addView(zyaVar, nme.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        ns9 ns9Var = new ns9(this, context, wjbVar, (byte) 6);
        this.n1 = ns9Var;
        ns9Var.setOverScrollMode(2);
        ns9Var.setTag(13);
        ns9Var.setPadding(0, 0, 0, gl.L(48.0f));
        ns9Var.setClipToPadding(false);
        ns9Var.setHideIfEmpty(false);
        zkb.l(ns9Var, 20, this.D1, wjbVar);
        getContext();
        wb4 wb4Var = new wb4(gl.L(8.0f), 0, ns9Var);
        this.L1 = wb4Var;
        wb4Var.P = false;
        ns9Var.setLayoutManager(wb4Var);
        ns9Var.setHorizontalScrollBarEnabled(false);
        ns9Var.setVerticalScrollBarEnabled(false);
        this.b.addView(ns9Var, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ns9Var.setOnScrollListener(new vdb(this, (byte) 6));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1(), 51);
        layoutParams.topMargin = gl.L(58.0f);
        View view = new View(context);
        this.r1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, nme.e(-1, 58, 51));
        H0(0.0f);
        ns9Var.setEmptyView(zyaVar);
        ns9Var.X1 = true;
        ns9Var.Y1 = false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    public v7c D0(Context context) {
        return new v7c(this, context);
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
        this.s1.addListener(new pu9((byte) 15, this, z));
        this.s1.start();
    }

    public abstract void G0(String str);

    public final void H0(float f) {
        int i;
        this.y1 = f;
        this.z1 = gl.R0(f, 1.0f, bkb.v0(this.E1, this.J0), bkb.v0(this.F1, this.J0));
        this.q1.setColorFilter(new PorterDuffColorFilter(this.z1, PorterDuff.Mode.MULTIPLY));
        L(this.z1);
        int i2 = this.z1;
        this.H0 = i2;
        ns9 ns9Var = this.n1;
        ns9Var.setGlowColor(i2);
        int R0 = gl.R0(f, 1.0f, bkb.w0(null, this.I1, false), bkb.w0(null, this.H1, false));
        int R02 = gl.R0(f, 1.0f, bkb.w0(null, this.K1, false), bkb.w0(null, this.J1, false));
        int childCount = ns9Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = ns9Var.getChildAt(i3);
            if (childAt instanceof s95) {
                ((s95) childAt).a(R0, R0);
            } else if (childAt instanceof y95) {
                y95 y95Var = (y95) childAt;
                if (this.r1.getTag() != null) {
                    i = this.J1;
                } else {
                    i = this.K1;
                }
                y95Var.f(i, R02);
            }
        }
        this.b.invalidate();
        ns9Var.invalidate();
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
        this.n1.getViewTreeObserver().addOnPreDrawListener(new qda(this, i, (byte) 1));
    }

    public void L0() {
        int i;
        int i2;
        ns9 ns9Var = this.n1;
        if (ns9Var.getChildCount() > 0) {
            s49 K = ns9Var.K(0);
            if (K != null) {
                i = K.a.getTop() - gl.L(8.0f);
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
        gl.t1(this.v1.K);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i;
        if (this.l1 == null) {
            TextView textView = new TextView(getContext());
            this.l1 = textView;
            zkb.X(textView, bkb.i5, this.J0);
            this.l1.setTextSize(1, 20.0f);
            this.l1.setTypeface(gl.o());
            this.l1.setLines(1);
            this.l1.setMaxLines(1);
            this.l1.setSingleLine(true);
            TextView textView2 = this.l1;
            if (k96.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView2.setGravity(i | 16);
            this.l1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.l1;
            FrameLayout.LayoutParams d = nme.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.m1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).topMargin = gl.L(30.0f);
            frameLayout.getLayoutParams().height = gl.L(94.0f);
        }
        this.l1.setText(charSequence);
    }

    public void K0() {
    }
}
