package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
public final class fm4 {
    public final Rect A = new Rect();
    public final Point B = new Point();
    public final int[] C = new int[2];
    public final Region D = new Region();
    public final int E;
    public boolean F;
    public boolean G;
    public final Size H;
    public Size I;
    public Size J;
    public MenuItem.OnMenuItemClickListener K;
    public final g6 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final hm4 Q;
    public final Context a;
    public final View b;
    public final PopupWindow c;
    public final int d;
    public final int e;
    public final RelativeLayout f;
    public final qmb g;
    public final dm4 h;
    public final FrameLayout i;
    public final View j;
    public final am4 k;
    public final TextView l;
    public final Drawable m;
    public final Drawable n;
    public final AnimatedVectorDrawable o;
    public final AnimatedVectorDrawable p;
    public final em4 q;
    public final cm4 r;
    public final Interpolator s;
    public final Interpolator t;
    public final Interpolator u;
    public final AnimatorSet v;
    public final AnimatorSet w;
    public final AnimatorSet x;
    public final AnimationSet y;
    public final AnimationSet z;

    public fm4(hm4 hm4Var, Context context, View view) {
        byte b;
        float f;
        int i;
        int i2;
        int v0;
        int i3;
        this.Q = hm4Var;
        new o04(this, (byte) 5);
        this.F = true;
        this.L = new g6(this, (byte) 6);
        this.P = -4;
        this.b = view;
        this.a = context;
        ylb ylbVar = hm4Var.n;
        int i4 = hm4Var.i;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = gm.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.setElevation(gm.L(1.0f));
        relativeLayout.setFocusable(true);
        relativeLayout.setFocusableInTouchMode(true);
        km0 km0Var = hm4Var.o;
        if (km0Var != null) {
            im0 c = km0Var.c(relativeLayout, null, true);
            nm0 nm0Var = new nm0(ylbVar);
            f = 1.0f;
            b = 6;
            nm0Var.e = new w00((byte) 17);
            nm0Var.f(687865855, 687865855);
            nm0Var.e(352321535, 352321535);
            float N = gm.N(0.6666667f);
            float N2 = gm.N(0.6666667f);
            nm0Var.f = N;
            nm0Var.h = N2;
            c.p(nm0Var);
            c.r(gm.L(12.0f));
            relativeLayout.setBackground(c);
        } else {
            b = 6;
            f = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = gm.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i4 == 0) {
                i = cmb.g5;
            } else {
                if (i4 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i4 == 1) {
                    i = cmb.c6;
                }
                i = -1;
            }
            if (i >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout.setBackground(gradientDrawable);
            if (i >= 0) {
                anb.x(relativeLayout, gradientDrawable, i, ylbVar, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout.setClipToOutline(true);
        this.f = relativeLayout;
        f7 f7Var = new f7(relativeLayout.getContext(), (byte) 4);
        PopupWindow popupWindow = new PopupWindow(f7Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        f7Var.addView(relativeLayout);
        this.c = popupWindow;
        this.d = gm.L(16.0f);
        this.e = gm.L(8.0f);
        this.E = gm.L(48.0f);
        int L3 = gm.L(8.0f);
        this.r = new cm4();
        this.s = AnimationUtils.loadInterpolator(context, 17563661);
        this.t = AnimationUtils.loadInterpolator(context, 17563662);
        this.u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231216).mutate();
        this.m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231214).mutate();
        this.n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231215).mutate();
        this.o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231217).mutate();
        this.p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        am4 am4Var = new am4(this, context);
        this.k = am4Var;
        am4Var.setLayoutParams(new ViewGroup.LayoutParams(gm.L(56.0f), gm.L(48.0f)));
        am4Var.setPaddingRelative(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(12.0f));
        am4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        am4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.l = textView;
        td4.v(16.0f, 2131753721, 1, textView, null);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.j = view2;
        if (i4 == 0) {
            int i5 = cmb.i5;
            int v02 = cmb.v0(i5, ylbVar);
            int i6 = cmb.h6;
            i2 = L3;
            fg0 f0 = cmb.f0(cmb.v0(i6, ylbVar), 1, -1);
            wmb M = anb.M(i6);
            am4Var.setBackground(f0);
            anb.j(am4Var, f0, null, M, ylbVar);
            fg0 f02 = cmb.f0(cmb.v0(i6, ylbVar), 2, -1);
            wmb M2 = anb.M(i6);
            frameLayout.setBackground(f02);
            anb.j(frameLayout, f02, null, M2, ylbVar);
            anb.i(view2, anb.K(0.4f, i5), ylbVar);
            v0 = v02;
        } else {
            i2 = L3;
            if (i4 == 2) {
                am4Var.setBackground(cmb.f0(553648127, 1, -1));
                frameLayout.setBackground(cmb.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v0 = -328966;
            } else {
                v0 = cmb.v0(cmb.F6, ylbVar);
                int i7 = cmb.h6;
                fg0 f03 = cmb.f0(cmb.v0(i7, ylbVar), 1, -1);
                wmb M3 = anb.M(i7);
                am4Var.setBackground(f03);
                anb.j(am4Var, f03, null, M3, ylbVar);
                fg0 f04 = cmb.f0(cmb.v0(i7, ylbVar), 2, -1);
                wmb M4 = anb.M(i7);
                frameLayout.setBackground(f04);
                anb.j(frameLayout, f04, null, M4, ylbVar);
                anb.h(cmb.c7, ylbVar, view2);
            }
        }
        mutate2.setTint(v0);
        mutate.setTint(v0);
        animatedVectorDrawable.setTint(v0);
        animatedVectorDrawable2.setTint(v0);
        textView.setTextColor(v0);
        if (i4 != 2) {
            if (i4 == 0) {
                i3 = cmb.i5;
            } else {
                i3 = cmb.F6;
            }
            anb.X(textView, i3, ylbVar);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            anb.x(am4Var, mutate2, i3, ylbVar, mode);
            anb.x(am4Var, mutate, i3, ylbVar, mode);
            anb.x(am4Var, animatedVectorDrawable, i3, ylbVar, mode);
            anb.x(am4Var, animatedVectorDrawable2, i3, ylbVar, mode);
        }
        am4Var.setOnClickListener(new vl4(this, (byte) 2));
        frameLayout.addView(am4Var, qoe.e(-2, -2, 19));
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, qoe.a(-1.0f, f / gm.p, 55));
        am4Var.measure(0, 0);
        this.H = new Size(am4Var.getMeasuredWidth(), am4Var.getMeasuredHeight());
        this.g = new qmb(b, context, this);
        this.q = new em4(this, context, i2);
        final dm4 dm4Var = new dm4(this);
        dm4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dm4Var.setDivider(null);
        dm4Var.setDividerHeight(0);
        zl4 zl4Var = new zl4(this, context);
        dm4Var.setPadding(0, gm.L(4.0f), 0, gm.L(2.0f));
        dm4Var.setClipToPadding(false);
        dm4Var.setAdapter((ListAdapter) zl4Var);
        dm4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i8, long j) {
                MenuItem menuItem = (MenuItem) dm4Var.getAdapter().getItem(i8);
                fm4 fm4Var = fm4.this;
                hm4 hm4Var2 = fm4Var.Q;
                if (hm4Var2.j != null && hm4.r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i9 = -fm4Var.P;
                    fm4Var.P = i9;
                    gm.A3(i9, view3, null);
                    xx0.E.a();
                    hm4Var2.j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = fm4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = dm4Var;
        le leVar = new le(this, (byte) 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.y = animationSet;
        animationSet.setAnimationListener(leVar);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.z = animationSet2;
        animationSet2.setAnimationListener(leVar);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.w = hm4.a(relativeLayout, 150, new bm4(this, (byte) 0));
        this.x = hm4.a(relativeLayout, 0, new bm4(this, (byte) 1));
    }

    public static void l(View view, int i, int i2) {
        view.setMinimumWidth(i);
        view.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void m(View view, Size size) {
        l(view, size.getWidth(), size.getHeight());
    }

    public final int a(int i) {
        int i2;
        int max = Math.max(2, i);
        dm4 dm4Var = this.h;
        int min = Math.min(4, Math.min(max, dm4Var.getCount()));
        int count = dm4Var.getCount();
        int i3 = this.E;
        if (min < count) {
            i2 = (int) (i3 * 0.5f);
        } else {
            i2 = 0;
        }
        return this.H.getHeight() + (min * i3) + i2;
    }

    public final void b() {
        this.f.clearAnimation();
        this.g.animate().cancel();
        this.h.animate().cancel();
        this.o.stop();
        this.p.stop();
    }

    public final int c() {
        int i = this.O;
        if (i < 150) {
            return 200;
        }
        if (i > 300) {
            return 300;
        }
        return 250;
    }

    public final boolean d() {
        boolean z;
        boolean z2;
        AnimationSet animationSet = this.y;
        if (animationSet.hasStarted() && !animationSet.hasEnded()) {
            z = true;
        } else {
            z = false;
        }
        AnimationSet animationSet2 = this.z;
        if (animationSet2.hasStarted() && !animationSet2.hasEnded()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (!this.F && !this.G) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean z = this.N;
        Interpolator interpolator = this.t;
        dm4 dm4Var = this.h;
        qmb qmbVar = this.g;
        cm4 cm4Var = this.r;
        Interpolator interpolator2 = this.s;
        FrameLayout frameLayout = this.i;
        RelativeLayout relativeLayout = this.f;
        am4 am4Var = this.k;
        if (z) {
            AnimatedVectorDrawable animatedVectorDrawable = this.p;
            am4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x = relativeLayout.getX();
            xl4 xl4Var = new xl4(this, width, width2, x, relativeLayout.getWidth() + x, (byte) 3);
            xl4 xl4Var2 = new xl4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), (byte) 0);
            float x2 = frameLayout.getX();
            yl4 yl4Var = new yl4(this, x2, (width2 + x2) - am4Var.getWidth(), width2, (byte) 0);
            xl4Var.setInterpolator(interpolator2);
            xl4Var.setDuration(c());
            xl4Var2.setInterpolator(cm4Var);
            xl4Var2.setDuration(c());
            yl4Var.setInterpolator(interpolator2);
            yl4Var.setDuration(c());
            AnimationSet animationSet = this.z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(xl4Var);
            animationSet.addAnimation(xl4Var2);
            animationSet.addAnimation(yl4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            qmbVar.animate().alpha(1.0f).withLayer().setInterpolator(this.u).setDuration(100L).start();
            dm4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.o;
        am4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y = relativeLayout.getY();
        float x3 = relativeLayout.getX();
        xl4 xl4Var3 = new xl4(this, width3, width4, x3, x3 + relativeLayout.getWidth(), (byte) 1);
        xl4 xl4Var4 = new xl4(this, height, height2, y, (byte) 2);
        float x4 = frameLayout.getX();
        yl4 yl4Var2 = new yl4(this, x4, am4Var.getWidth() + (x4 - width3), width4, (byte) 1);
        xl4Var3.setInterpolator(cm4Var);
        xl4Var3.setDuration(c());
        xl4Var4.setInterpolator(interpolator2);
        xl4Var4.setDuration(c());
        yl4Var2.setInterpolator(interpolator2);
        yl4Var2.setDuration(c());
        AnimationSet animationSet2 = this.y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(xl4Var3);
        animationSet2.addAnimation(xl4Var4);
        animationSet2.addAnimation(yl4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        qmbVar.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = dm4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        dm4Var.setAlpha(1.0f);
    }

    public final void g() {
        if (this.M) {
            RelativeLayout relativeLayout = this.f;
            this.g.setY(relativeLayout.getHeight() - this.J.getHeight());
            int height = relativeLayout.getHeight();
            FrameLayout frameLayout = this.i;
            frameLayout.setY(height - frameLayout.getHeight());
            this.h.setY(relativeLayout.getHeight() - this.I.getHeight());
        }
    }

    public final void h() {
        RelativeLayout relativeLayout = this.f;
        relativeLayout.removeAllViews();
        if (this.I != null) {
            relativeLayout.addView(this.h);
        }
        relativeLayout.addView(this.g);
        if (this.I != null) {
            relativeLayout.addView(this.i);
        }
        k();
        j();
    }

    public final void i(Rect rect) {
        View view = this.b;
        Rect rect2 = this.A;
        view.getWindowVisibleDisplayFrame(rect2);
        int centerX = rect.centerX();
        PopupWindow popupWindow = this.c;
        int min = Math.min(centerX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
        int i = rect.top;
        int i2 = rect2.top;
        int i3 = i - i2;
        int i4 = rect2.bottom;
        int i5 = rect.bottom;
        int i6 = i4 - i5;
        int i7 = this.e;
        int i8 = i7 << 1;
        int i9 = this.E;
        int i10 = i9 + i8;
        if (this.I != null) {
            int a = a(2) + i8;
            int i11 = (rect2.bottom - rect.top) + i10;
            int i12 = (rect.bottom - rect2.top) + i10;
            if (i3 >= a) {
                o(i3 - i8);
                i5 = rect.top - popupWindow.getHeight();
                this.M = true;
            } else if (i3 >= i10 && i11 >= a) {
                o(i11 - i8);
                i5 = rect.top - i10;
                this.M = false;
            } else if (i6 >= a) {
                o(i6 - i8);
                i5 = rect.bottom;
                this.M = false;
            } else if (i6 >= i10 && rect2.height() >= a) {
                o(i12 - i8);
                i5 = (rect.bottom + i10) - popupWindow.getHeight();
                this.M = true;
            } else {
                o(rect2.height() - i8);
                i5 = rect2.top;
                this.M = false;
            }
        } else if (i3 >= i10) {
            i5 = i - i10;
        } else if (i6 < i10) {
            if (i6 >= i9) {
                i5 -= i7;
            } else {
                i5 = Math.max(i2, i - i10);
            }
        }
        View rootView = view.getRootView();
        int[] iArr = this.C;
        rootView.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.B.set(Math.max(0, min - (i13 - iArr[0])), Math.max(0, i5 - (i14 - iArr[1])));
    }

    public final void j() {
        int width;
        int height;
        if (this.N) {
            width = this.I.getWidth();
            height = this.I.getHeight();
        } else {
            width = this.J.getWidth();
            height = this.J.getHeight();
        }
        RelativeLayout relativeLayout = this.f;
        this.D.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), ((int) relativeLayout.getX()) + width, ((int) relativeLayout.getY()) + height);
    }

    public final void k() {
        FrameLayout frameLayout = this.i;
        frameLayout.setEnabled(true);
        dm4 dm4Var = this.h;
        dm4Var.awakenScrollBars();
        boolean z = this.N;
        PopupWindow popupWindow = this.c;
        am4 am4Var = this.k;
        int i = this.d;
        Size size = this.H;
        int i2 = this.e;
        RelativeLayout relativeLayout = this.f;
        qmb qmbVar = this.g;
        if (z) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            qmbVar.setAlpha(0.0f);
            qmbVar.setVisibility(4);
            dm4Var.setAlpha(1.0f);
            dm4Var.setVisibility(0);
            am4Var.setImageDrawable(this.m);
            frameLayout.setContentDescription(jb6.M0(2131754838, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i);
            qmbVar.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            dm4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i2);
                qmbVar.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                dm4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i2);
            qmbVar.setY(0.0f);
            frameLayout.setY(0.0f);
            dm4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        qmbVar.setAlpha(1.0f);
        qmbVar.setVisibility(0);
        dm4Var.setAlpha(0.0f);
        dm4Var.setVisibility(4);
        am4Var.setImageDrawable(this.n);
        frameLayout.setContentDescription(jb6.M0(2131754838, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i);
            qmbVar.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            dm4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i2) - size3.getHeight());
                qmbVar.setY(0.0f);
                frameLayout.setY(0.0f);
                dm4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i2);
            qmbVar.setY(0.0f);
            frameLayout.setY(0.0f);
            dm4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i);
        relativeLayout.setY(i2);
        qmbVar.setX(0.0f);
        qmbVar.setY(0.0f);
    }

    public final void n() {
        boolean z = this.N;
        am4 am4Var = this.k;
        FrameLayout frameLayout = this.i;
        if (z) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new vl4(this, (byte) 0));
            am4Var.setClickable(false);
            am4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        am4Var.setClickable(true);
        am4Var.setOnClickListener(new vl4(this, (byte) 1));
    }

    public final void o(int i) {
        if (this.I != null) {
            int a = a((i - this.H.getHeight()) / this.E);
            if (this.I.getHeight() != a) {
                this.I = new Size(this.I.getWidth(), a);
            }
            m(this.h, this.I);
            boolean z = this.N;
            RelativeLayout relativeLayout = this.f;
            if (z) {
                m(relativeLayout, this.I);
                if (this.M) {
                    float height = this.I.getHeight() - a;
                    relativeLayout.setY(relativeLayout.getY() + height);
                    FrameLayout frameLayout = this.i;
                    frameLayout.setY(frameLayout.getY() - height);
                }
            } else {
                m(relativeLayout, this.J);
            }
            p();
        }
    }

    public final void p() {
        int i;
        Size size = this.J;
        int i2 = 0;
        if (size != null) {
            i2 = Math.max(0, size.getWidth());
            i = Math.max(0, this.J.getHeight());
        } else {
            i = 0;
        }
        Size size2 = this.I;
        if (size2 != null) {
            i2 = Math.max(i2, size2.getWidth());
            i = Math.max(i, this.I.getHeight());
        }
        int i3 = i2 + (this.d << 1);
        PopupWindow popupWindow = this.c;
        popupWindow.setWidth(i3);
        popupWindow.setHeight(i + (this.e << 1));
        Size size3 = this.J;
        if (size3 != null && this.I != null) {
            int width = size3.getWidth() - this.I.getWidth();
            int height = this.I.getHeight() - this.J.getHeight();
            this.O = (int) (Math.sqrt((height * height) + (width * width)) / this.f.getContext().getResources().getDisplayMetrics().density);
        }
    }
}
