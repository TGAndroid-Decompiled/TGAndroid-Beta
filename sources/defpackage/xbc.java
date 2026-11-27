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
public abstract class xbc extends nx0 {
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
    public final td4 L1;
    public final boolean M1;
    public TextView l1;
    public final FrameLayout m1;
    public final gw9 n1;
    public c79 o1;
    public c79 p1;
    public final Drawable q1;
    public final View r1;
    public AnimatorSet s1;
    public final z2b t1;
    public final tk4 u1;
    public final wbc v1;
    public final RectF w1;
    public int x1;
    public float y1;
    public int z1;

    static {
        new qm("colorProgress", (byte) 19);
    }

    public xbc(int i, vnb vnbVar, Context context) {
        super(1, vnbVar, context, false);
        this.w1 = new RectF();
        this.A1 = true;
        this.B1 = true;
        this.C1 = aob.zj;
        this.D1 = aob.i6;
        int i2 = aob.d6;
        this.E1 = i2;
        this.F1 = i2;
        this.G1 = aob.G6;
        int i3 = aob.y6;
        this.H1 = i3;
        this.I1 = i3;
        int i4 = aob.Q5;
        this.J1 = i4;
        this.K1 = i4;
        this.M1 = true;
        this.J0 = vnbVar;
        L0();
        this.q0 = (byte) 75;
        this.a = i;
        this.q1 = c00.e(context, 2131232744);
        vbc E0 = E0(context);
        this.b = E0;
        E0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        wbc wbcVar = new wbc(this, context, vnbVar);
        this.v1 = wbcVar;
        wbcVar.y = true;
        wbcVar.updateColors();
        wbcVar.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        frameLayout.addView(wbcVar, tre.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        tk4 tk4Var = new tk4(context, null);
        this.u1 = tk4Var;
        tk4Var.setViewType(6);
        tk4Var.x = false;
        tk4Var.setUseHeaderOffset(true);
        z2b z2bVar = new z2b(context, tk4Var, 1, null);
        this.t1 = z2bVar;
        z2bVar.addView(tk4Var, 0, tre.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = ob6.M0(2131747898, null);
        tpa tpaVar = z2bVar.d;
        tpaVar.setText(M0);
        String M02 = ob6.M0(2131745535, null);
        p66 p66Var = z2bVar.e;
        p66Var.setText(M02);
        z2bVar.setVisibility(8);
        z2bVar.setAnimateLayoutChange(true);
        z2bVar.e(true, false);
        int i6 = this.G1;
        int i7 = this.H1;
        int i8 = this.E1;
        tpaVar.setTag(Integer.valueOf(i6));
        vnb vnbVar2 = z2bVar.n;
        yob.X(tpaVar, i6, vnbVar2);
        p66Var.setTag(Integer.valueOf(i7));
        yob.X(p66Var, i7, vnbVar2);
        z2bVar.H = i8;
        this.b.addView(z2bVar, tre.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        gw9 gw9Var = new gw9(this, context, vnbVar, (byte) 6);
        this.n1 = gw9Var;
        gw9Var.setOverScrollMode(2);
        gw9Var.setTag(13);
        gw9Var.setPadding(0, 0, 0, hl.L(48.0f));
        gw9Var.setClipToPadding(false);
        gw9Var.setHideIfEmpty(false);
        yob.l(gw9Var, 20, this.D1, vnbVar);
        getContext();
        td4 td4Var = new td4(hl.L(8.0f), 0, gw9Var);
        this.L1 = td4Var;
        td4Var.P = false;
        gw9Var.setLayoutManager(td4Var);
        gw9Var.setHorizontalScrollBarEnabled(false);
        gw9Var.setVerticalScrollBarEnabled(false);
        this.b.addView(gw9Var, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        gw9Var.setOnScrollListener(new qhb(this, (byte) 6));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 51);
        layoutParams.topMargin = hl.L(58.0f);
        View view = new View(context);
        this.r1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, tre.e(-1, 58, 51));
        I0(0.0f);
        gw9Var.setEmptyView(z2bVar);
        gw9Var.X1 = true;
        gw9Var.Y1 = false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    public vbc E0(Context context) {
        return new vbc(this, context);
    }

    public abstract void F0(MotionEvent motionEvent, m7 m7Var);

    public final void G0(boolean z) {
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
        this.s1.addListener(new i1a((byte) 14, this, z));
        this.s1.start();
    }

    public abstract void H0(String str);

    public final void I0(float f) {
        int i;
        this.y1 = f;
        this.z1 = hl.R0(f, 1.0f, aob.v0(this.E1, this.J0), aob.v0(this.F1, this.J0));
        this.q1.setColorFilter(new PorterDuffColorFilter(this.z1, PorterDuff.Mode.MULTIPLY));
        K(this.z1);
        int i2 = this.z1;
        this.H0 = i2;
        gw9 gw9Var = this.n1;
        gw9Var.setGlowColor(i2);
        int R0 = hl.R0(f, 1.0f, aob.w0(null, this.I1, false), aob.w0(null, this.H1, false));
        int R02 = hl.R0(f, 1.0f, aob.w0(null, this.K1, false), aob.w0(null, this.J1, false));
        int childCount = gw9Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = gw9Var.getChildAt(i3);
            if (childAt instanceof tb5) {
                ((tb5) childAt).a(R0, R0);
            } else if (childAt instanceof zb5) {
                zb5 zb5Var = (zb5) childAt;
                if (this.r1.getTag() != null) {
                    i = this.J1;
                } else {
                    i = this.K1;
                }
                zb5Var.f(i, R02);
            }
        }
        this.b.invalidate();
        gw9Var.invalidate();
        this.c.invalidate();
    }

    public void J0(int i) {
        this.n1.setTopGlowOffset(i);
        float f = i;
        this.m1.setTranslationY(f);
        this.t1.setTranslationY(f);
        this.b.invalidate();
    }

    public final void K0(int i) {
        if (!isShowing()) {
            return;
        }
        this.n1.getViewTreeObserver().addOnPreDrawListener(new hha(this, i, (byte) 1));
    }

    public void M0() {
        int i;
        int i2;
        gw9 gw9Var = this.n1;
        if (gw9Var.getChildCount() > 0) {
            f89 L = gw9Var.L(0);
            if (L != null) {
                i = L.a.getTop() - hl.L(8.0f);
            } else {
                i = 0;
            }
            if (i > 0 && L != null && L.b() == 0) {
                i2 = i;
            } else {
                i2 = 0;
            }
            if (i >= 0 && L != null && L.b() == 0) {
                G0(false);
            } else {
                G0(true);
                i = i2;
            }
            if (this.x1 != i) {
                this.x1 = i;
                J0(i);
            }
        }
    }

    @Override
    public void dismiss() {
        hl.t1(this.v1.L);
        super.dismiss();
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        int i;
        if (this.l1 == null) {
            TextView textView = new TextView(getContext());
            this.l1 = textView;
            yob.X(textView, aob.j5, this.J0);
            this.l1.setTextSize(1, 20.0f);
            this.l1.setTypeface(hl.o());
            this.l1.setLines(1);
            this.l1.setMaxLines(1);
            this.l1.setSingleLine(true);
            TextView textView2 = this.l1;
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView2.setGravity(i | 16);
            this.l1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView3 = this.l1;
            FrameLayout.LayoutParams d = tre.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.m1;
            frameLayout.addView(textView3, d);
            ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).topMargin = hl.L(30.0f);
            frameLayout.getLayoutParams().height = hl.L(94.0f);
        }
        this.l1.setText(charSequence);
    }

    public void L0() {
    }
}
