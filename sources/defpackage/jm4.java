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
public final class jm4 {
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
    public final h6 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final lm4 Q;
    public final Context a;
    public final View b;
    public final PopupWindow c;
    public final int d;
    public final int e;
    public final RelativeLayout f;
    public final oob g;
    public final hm4 h;
    public final FrameLayout i;
    public final View j;
    public final em4 k;
    public final TextView l;
    public final Drawable m;
    public final Drawable n;
    public final AnimatedVectorDrawable o;
    public final AnimatedVectorDrawable p;
    public final im4 q;
    public final gm4 r;
    public final Interpolator s;
    public final Interpolator t;
    public final Interpolator u;
    public final AnimatorSet v;
    public final AnimatorSet w;
    public final AnimatorSet x;
    public final AnimationSet y;
    public final AnimationSet z;

    public jm4(lm4 lm4Var, Context context, View view) {
        byte b;
        float f;
        int i;
        int i2;
        int v0;
        int i3;
        this.Q = lm4Var;
        new zz3(this, (byte) 5);
        this.F = true;
        this.L = new h6(this, (byte) 6);
        this.P = -4;
        this.b = view;
        this.a = context;
        vnb vnbVar = lm4Var.n;
        int i4 = lm4Var.i;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = hl.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.setElevation(hl.L(1.0f));
        relativeLayout.setFocusable(true);
        relativeLayout.setFocusableInTouchMode(true);
        ll0 ll0Var = lm4Var.o;
        if (ll0Var != null) {
            jl0 c = ll0Var.c(relativeLayout, null, true);
            ol0 ol0Var = new ol0(vnbVar);
            f = 1.0f;
            b = 6;
            ol0Var.e = new xz((byte) 18);
            ol0Var.f(687865855, 687865855);
            ol0Var.e(352321535, 352321535);
            float N = hl.N(0.6666667f);
            float N2 = hl.N(0.6666667f);
            ol0Var.f = N;
            ol0Var.h = N2;
            c.p(ol0Var);
            c.r(hl.L(12.0f));
            relativeLayout.setBackground(c);
        } else {
            b = 6;
            f = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = hl.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i4 == 0) {
                i = aob.h5;
            } else {
                if (i4 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i4 == 1) {
                    i = aob.d6;
                }
                i = -1;
            }
            if (i >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout.setBackground(gradientDrawable);
            if (i >= 0) {
                yob.x(relativeLayout, gradientDrawable, i, vnbVar, PorterDuff.Mode.SRC_IN);
            }
        }
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout.setClipToOutline(true);
        this.f = relativeLayout;
        g7 g7Var = new g7(relativeLayout.getContext(), (byte) 4);
        PopupWindow popupWindow = new PopupWindow(g7Var);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        g7Var.addView(relativeLayout);
        this.c = popupWindow;
        this.d = hl.L(16.0f);
        this.e = hl.L(8.0f);
        this.E = hl.L(48.0f);
        int L3 = hl.L(8.0f);
        this.r = new gm4();
        this.s = AnimationUtils.loadInterpolator(context, 17563661);
        this.t = AnimationUtils.loadInterpolator(context, 17563662);
        this.u = AnimationUtils.loadInterpolator(context, 17563663);
        Drawable mutate = context.getDrawable(2131231215).mutate();
        this.m = mutate;
        mutate.setAutoMirrored(true);
        Drawable mutate2 = context.getDrawable(2131231213).mutate();
        this.n = mutate2;
        mutate2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(2131231214).mutate();
        this.o = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(2131231216).mutate();
        this.p = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        em4 em4Var = new em4(this, context);
        this.k = em4Var;
        em4Var.setLayoutParams(new ViewGroup.LayoutParams(hl.L(56.0f), hl.L(48.0f)));
        em4Var.setPaddingRelative(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
        em4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        em4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.l = textView;
        qd4.u(16.0f, 2131753749, 1, textView, null);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.j = view2;
        if (i4 == 0) {
            int i5 = aob.j5;
            int v02 = aob.v0(i5, vnbVar);
            int i6 = aob.i6;
            i2 = L3;
            hf0 f0 = aob.f0(aob.v0(i6, vnbVar), 1, -1);
            uob M = yob.M(i6);
            em4Var.setBackground(f0);
            yob.j(em4Var, f0, null, M, vnbVar);
            hf0 f02 = aob.f0(aob.v0(i6, vnbVar), 2, -1);
            uob M2 = yob.M(i6);
            frameLayout.setBackground(f02);
            yob.j(frameLayout, f02, null, M2, vnbVar);
            yob.i(view2, yob.K(0.4f, i5), vnbVar);
            v0 = v02;
        } else {
            i2 = L3;
            if (i4 == 2) {
                em4Var.setBackground(aob.f0(553648127, 1, -1));
                frameLayout.setBackground(aob.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v0 = -328966;
            } else {
                v0 = aob.v0(aob.G6, vnbVar);
                int i7 = aob.i6;
                hf0 f03 = aob.f0(aob.v0(i7, vnbVar), 1, -1);
                uob M3 = yob.M(i7);
                em4Var.setBackground(f03);
                yob.j(em4Var, f03, null, M3, vnbVar);
                hf0 f04 = aob.f0(aob.v0(i7, vnbVar), 2, -1);
                uob M4 = yob.M(i7);
                frameLayout.setBackground(f04);
                yob.j(frameLayout, f04, null, M4, vnbVar);
                yob.h(aob.d7, vnbVar, view2);
            }
        }
        mutate2.setTint(v0);
        mutate.setTint(v0);
        animatedVectorDrawable.setTint(v0);
        animatedVectorDrawable2.setTint(v0);
        textView.setTextColor(v0);
        if (i4 != 2) {
            if (i4 == 0) {
                i3 = aob.j5;
            } else {
                i3 = aob.G6;
            }
            yob.X(textView, i3, vnbVar);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            yob.x(em4Var, mutate2, i3, vnbVar, mode);
            yob.x(em4Var, mutate, i3, vnbVar, mode);
            yob.x(em4Var, animatedVectorDrawable, i3, vnbVar, mode);
            yob.x(em4Var, animatedVectorDrawable2, i3, vnbVar, mode);
        }
        em4Var.setOnClickListener(new zl4(this, (byte) 2));
        frameLayout.addView(em4Var, tre.e(-2, -2, 19));
        frameLayout.addView(textView, tre.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, tre.a(-1.0f, f / hl.p, 55));
        em4Var.measure(0, 0);
        this.H = new Size(em4Var.getMeasuredWidth(), em4Var.getMeasuredHeight());
        this.g = new oob(b, context, this);
        this.q = new im4(this, context, i2);
        final hm4 hm4Var = new hm4(this);
        hm4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        hm4Var.setDivider(null);
        hm4Var.setDividerHeight(0);
        dm4 dm4Var = new dm4(this, context);
        hm4Var.setPadding(0, hl.L(4.0f), 0, hl.L(2.0f));
        hm4Var.setClipToPadding(false);
        hm4Var.setAdapter((ListAdapter) dm4Var);
        hm4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i8, long j) {
                MenuItem menuItem = (MenuItem) hm4Var.getAdapter().getItem(i8);
                jm4 jm4Var = jm4.this;
                lm4 lm4Var2 = jm4Var.Q;
                if (lm4Var2.j != null && lm4.r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i9 = -jm4Var.P;
                    jm4Var.P = i9;
                    hl.A3(i9, view3, null);
                    yw0.APP_ERROR.a();
                    lm4Var2.j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = jm4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = hm4Var;
        md mdVar = new md(this, (byte) 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.y = animationSet;
        animationSet.setAnimationListener(mdVar);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.z = animationSet2;
        animationSet2.setAnimationListener(mdVar);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.w = lm4.a(relativeLayout, 150, new fm4(this, (byte) 0));
        this.x = lm4.a(relativeLayout, 0, new fm4(this, (byte) 1));
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
        hm4 hm4Var = this.h;
        int min = Math.min(4, Math.min(max, hm4Var.getCount()));
        int count = hm4Var.getCount();
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
        hm4 hm4Var = this.h;
        oob oobVar = this.g;
        gm4 gm4Var = this.r;
        Interpolator interpolator2 = this.s;
        FrameLayout frameLayout = this.i;
        RelativeLayout relativeLayout = this.f;
        em4 em4Var = this.k;
        if (z) {
            AnimatedVectorDrawable animatedVectorDrawable = this.p;
            em4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x = relativeLayout.getX();
            bm4 bm4Var = new bm4(this, width, width2, x, relativeLayout.getWidth() + x, (byte) 3);
            bm4 bm4Var2 = new bm4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), (byte) 0);
            float x2 = frameLayout.getX();
            cm4 cm4Var = new cm4(this, x2, (width2 + x2) - em4Var.getWidth(), width2, (byte) 0);
            bm4Var.setInterpolator(interpolator2);
            bm4Var.setDuration(c());
            bm4Var2.setInterpolator(gm4Var);
            bm4Var2.setDuration(c());
            cm4Var.setInterpolator(interpolator2);
            cm4Var.setDuration(c());
            AnimationSet animationSet = this.z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(bm4Var);
            animationSet.addAnimation(bm4Var2);
            animationSet.addAnimation(cm4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            oobVar.animate().alpha(1.0f).withLayer().setInterpolator(this.u).setDuration(100L).start();
            hm4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.o;
        em4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y = relativeLayout.getY();
        float x3 = relativeLayout.getX();
        bm4 bm4Var3 = new bm4(this, width3, width4, x3, x3 + relativeLayout.getWidth(), (byte) 1);
        bm4 bm4Var4 = new bm4(this, height, height2, y, (byte) 2);
        float x4 = frameLayout.getX();
        cm4 cm4Var2 = new cm4(this, x4, em4Var.getWidth() + (x4 - width3), width4, (byte) 1);
        bm4Var3.setInterpolator(gm4Var);
        bm4Var3.setDuration(c());
        bm4Var4.setInterpolator(interpolator2);
        bm4Var4.setDuration(c());
        cm4Var2.setInterpolator(interpolator2);
        cm4Var2.setDuration(c());
        AnimationSet animationSet2 = this.y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(bm4Var3);
        animationSet2.addAnimation(bm4Var4);
        animationSet2.addAnimation(cm4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        oobVar.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = hm4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        hm4Var.setAlpha(1.0f);
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
        hm4 hm4Var = this.h;
        hm4Var.awakenScrollBars();
        boolean z = this.N;
        PopupWindow popupWindow = this.c;
        em4 em4Var = this.k;
        int i = this.d;
        Size size = this.H;
        int i2 = this.e;
        RelativeLayout relativeLayout = this.f;
        oob oobVar = this.g;
        if (z) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            oobVar.setAlpha(0.0f);
            oobVar.setVisibility(4);
            hm4Var.setAlpha(1.0f);
            hm4Var.setVisibility(0);
            em4Var.setImageDrawable(this.m);
            frameLayout.setContentDescription(ob6.M0(2131754834, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i);
            oobVar.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            hm4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i2);
                oobVar.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                hm4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i2);
            oobVar.setY(0.0f);
            frameLayout.setY(0.0f);
            hm4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        oobVar.setAlpha(1.0f);
        oobVar.setVisibility(0);
        hm4Var.setAlpha(0.0f);
        hm4Var.setVisibility(4);
        em4Var.setImageDrawable(this.n);
        frameLayout.setContentDescription(ob6.M0(2131754834, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i);
            oobVar.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            hm4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i2) - size3.getHeight());
                oobVar.setY(0.0f);
                frameLayout.setY(0.0f);
                hm4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i2);
            oobVar.setY(0.0f);
            frameLayout.setY(0.0f);
            hm4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i);
        relativeLayout.setY(i2);
        oobVar.setX(0.0f);
        oobVar.setY(0.0f);
    }

    public final void n() {
        boolean z = this.N;
        em4 em4Var = this.k;
        FrameLayout frameLayout = this.i;
        if (z) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new zl4(this, (byte) 0));
            em4Var.setClickable(false);
            em4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        em4Var.setClickable(true);
        em4Var.setOnClickListener(new zl4(this, (byte) 1));
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
