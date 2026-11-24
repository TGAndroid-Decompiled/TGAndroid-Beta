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
public final class ek4 {
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
    public final gk4 Q;
    public final Context a;
    public final View b;
    public final PopupWindow c;
    public final int d;
    public final int e;
    public final RelativeLayout f;
    public final pkb g;
    public final ck4 h;
    public final FrameLayout i;
    public final View j;
    public final zj4 k;
    public final TextView l;
    public final Drawable m;
    public final Drawable n;
    public final AnimatedVectorDrawable o;
    public final AnimatedVectorDrawable p;
    public final dk4 q;
    public final bk4 r;
    public final Interpolator s;
    public final Interpolator t;
    public final Interpolator u;
    public final AnimatorSet v;
    public final AnimatorSet w;
    public final AnimatorSet x;
    public final AnimationSet y;
    public final AnimationSet z;

    public ek4(gk4 gk4Var, Context context, View view) {
        byte b;
        float f;
        int i;
        int i2;
        int v0;
        int i3;
        this.Q = gk4Var;
        new ez3(this, (byte) 5);
        this.F = true;
        this.L = new g6(this, (byte) 6);
        this.P = -4;
        this.b = view;
        this.a = context;
        wjb wjbVar = gk4Var.n;
        int i4 = gk4Var.i;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int L = gl.L(20.0f);
        marginLayoutParams.rightMargin = L;
        marginLayoutParams.topMargin = L;
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.bottomMargin = L;
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.setElevation(gl.L(1.0f));
        relativeLayout.setFocusable(true);
        relativeLayout.setFocusableInTouchMode(true);
        kl0 kl0Var = gk4Var.o;
        if (kl0Var != null) {
            il0 c = kl0Var.c(relativeLayout, null, true);
            nl0 nl0Var = new nl0(wjbVar);
            f = 1.0f;
            b = 6;
            nl0Var.e = new wz((byte) 17);
            nl0Var.f(687865855, 687865855);
            nl0Var.e(352321535, 352321535);
            float N = gl.N(0.6666667f);
            float N2 = gl.N(0.6666667f);
            nl0Var.f = N;
            nl0Var.h = N2;
            c.p(nl0Var);
            c.r(gl.L(12.0f));
            relativeLayout.setBackground(c);
        } else {
            b = 6;
            f = 1.0f;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float L2 = gl.L(12.0f);
            gradientDrawable.setCornerRadii(new float[]{L2, L2, L2, L2, L2, L2, L2, L2});
            if (i4 == 0) {
                i = bkb.g5;
            } else {
                if (i4 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i4 == 1) {
                    i = bkb.c6;
                }
                i = -1;
            }
            if (i >= 0) {
                gradientDrawable.setColor(-1);
            }
            relativeLayout.setBackground(gradientDrawable);
            if (i >= 0) {
                zkb.x(relativeLayout, gradientDrawable, i, wjbVar, PorterDuff.Mode.SRC_IN);
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
        this.d = gl.L(16.0f);
        this.e = gl.L(8.0f);
        this.E = gl.L(48.0f);
        int L3 = gl.L(8.0f);
        this.r = new bk4();
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
        zj4 zj4Var = new zj4(this, context);
        this.k = zj4Var;
        zj4Var.setLayoutParams(new ViewGroup.LayoutParams(gl.L(56.0f), gl.L(48.0f)));
        zj4Var.setPaddingRelative(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), gl.L(12.0f));
        zj4Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        zj4Var.setImageDrawable(mutate2);
        TextView textView = new TextView(context);
        this.l = textView;
        tb4.u(16.0f, 2131753753, 1, textView, null);
        textView.setAlpha(0.0f);
        View view2 = new View(context);
        this.j = view2;
        if (i4 == 0) {
            int i5 = bkb.i5;
            int v02 = bkb.v0(i5, wjbVar);
            int i6 = bkb.h6;
            i2 = L3;
            ff0 f0 = bkb.f0(bkb.v0(i6, wjbVar), 1, -1);
            vkb M = zkb.M(i6);
            zj4Var.setBackground(f0);
            zkb.j(zj4Var, f0, null, M, wjbVar);
            ff0 f02 = bkb.f0(bkb.v0(i6, wjbVar), 2, -1);
            vkb M2 = zkb.M(i6);
            frameLayout.setBackground(f02);
            zkb.j(frameLayout, f02, null, M2, wjbVar);
            zkb.i(view2, zkb.K(0.4f, i5), wjbVar);
            v0 = v02;
        } else {
            i2 = L3;
            if (i4 == 2) {
                zj4Var.setBackground(bkb.f0(553648127, 1, -1));
                frameLayout.setBackground(bkb.f0(553648127, 2, -1));
                view2.setBackgroundColor(553648127);
                v0 = -328966;
            } else {
                v0 = bkb.v0(bkb.F6, wjbVar);
                int i7 = bkb.h6;
                ff0 f03 = bkb.f0(bkb.v0(i7, wjbVar), 1, -1);
                vkb M3 = zkb.M(i7);
                zj4Var.setBackground(f03);
                zkb.j(zj4Var, f03, null, M3, wjbVar);
                ff0 f04 = bkb.f0(bkb.v0(i7, wjbVar), 2, -1);
                vkb M4 = zkb.M(i7);
                frameLayout.setBackground(f04);
                zkb.j(frameLayout, f04, null, M4, wjbVar);
                zkb.h(bkb.c7, wjbVar, view2);
            }
        }
        mutate2.setTint(v0);
        mutate.setTint(v0);
        animatedVectorDrawable.setTint(v0);
        animatedVectorDrawable2.setTint(v0);
        textView.setTextColor(v0);
        if (i4 != 2) {
            if (i4 == 0) {
                i3 = bkb.i5;
            } else {
                i3 = bkb.F6;
            }
            zkb.X(textView, i3, wjbVar);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            zkb.x(zj4Var, mutate2, i3, wjbVar, mode);
            zkb.x(zj4Var, mutate, i3, wjbVar, mode);
            zkb.x(zj4Var, animatedVectorDrawable, i3, wjbVar, mode);
            zkb.x(zj4Var, animatedVectorDrawable2, i3, wjbVar, mode);
        }
        zj4Var.setOnClickListener(new uj4(this, (byte) 2));
        frameLayout.addView(zj4Var, nme.e(-2, -2, 19));
        frameLayout.addView(textView, nme.d(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(view2, nme.a(-1.0f, f / gl.p, 55));
        zj4Var.measure(0, 0);
        this.H = new Size(zj4Var.getMeasuredWidth(), zj4Var.getMeasuredHeight());
        this.g = new pkb(b, context, this);
        this.q = new dk4(this, context, i2);
        final ck4 ck4Var = new ck4(this);
        ck4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ck4Var.setDivider(null);
        ck4Var.setDividerHeight(0);
        yj4 yj4Var = new yj4(this, context);
        ck4Var.setPadding(0, gl.L(4.0f), 0, gl.L(2.0f));
        ck4Var.setClipToPadding(false);
        ck4Var.setAdapter((ListAdapter) yj4Var);
        ck4Var.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view3, int i8, long j) {
                MenuItem menuItem = (MenuItem) ck4Var.getAdapter().getItem(i8);
                ek4 ek4Var = ek4.this;
                gk4 gk4Var2 = ek4Var.Q;
                if (gk4Var2.j != null && gk4.r.contains(Integer.valueOf(menuItem.getItemId()))) {
                    int i9 = -ek4Var.P;
                    ek4Var.P = i9;
                    gl.A3(i9, view3, null);
                    pw0.E.a();
                    gk4Var2.j.run();
                    return;
                }
                MenuItem.OnMenuItemClickListener onMenuItemClickListener = ek4Var.K;
                if (onMenuItemClickListener != null) {
                    onMenuItemClickListener.onMenuItemClick(menuItem);
                }
            }
        });
        this.h = ck4Var;
        ld ldVar = new ld(this, (byte) 1);
        AnimationSet animationSet = new AnimationSet(true);
        this.y = animationSet;
        animationSet.setAnimationListener(ldVar);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.z = animationSet2;
        animationSet2.setAnimationListener(ldVar);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.v = animatorSet;
        this.w = gk4.a(relativeLayout, 150, new ak4(this, (byte) 0));
        this.x = gk4.a(relativeLayout, 0, new ak4(this, (byte) 1));
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
        ck4 ck4Var = this.h;
        int min = Math.min(4, Math.min(max, ck4Var.getCount()));
        int count = ck4Var.getCount();
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
        ck4 ck4Var = this.h;
        pkb pkbVar = this.g;
        bk4 bk4Var = this.r;
        Interpolator interpolator2 = this.s;
        FrameLayout frameLayout = this.i;
        RelativeLayout relativeLayout = this.f;
        zj4 zj4Var = this.k;
        if (z) {
            AnimatedVectorDrawable animatedVectorDrawable = this.p;
            zj4Var.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = this.J.getWidth();
            int width2 = relativeLayout.getWidth();
            float x = relativeLayout.getX();
            wj4 wj4Var = new wj4(this, width, width2, x, relativeLayout.getWidth() + x, (byte) 3);
            wj4 wj4Var2 = new wj4(this, this.J.getHeight(), relativeLayout.getHeight(), relativeLayout.getY() + relativeLayout.getHeight(), (byte) 0);
            float x2 = frameLayout.getX();
            xj4 xj4Var = new xj4(this, x2, (width2 + x2) - zj4Var.getWidth(), width2, (byte) 0);
            wj4Var.setInterpolator(interpolator2);
            wj4Var.setDuration(c());
            wj4Var2.setInterpolator(bk4Var);
            wj4Var2.setDuration(c());
            xj4Var.setInterpolator(interpolator2);
            xj4Var.setDuration(c());
            AnimationSet animationSet = this.z;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(wj4Var);
            animationSet.addAnimation(wj4Var2);
            animationSet.addAnimation(xj4Var);
            relativeLayout.startAnimation(animationSet);
            this.N = false;
            n();
            pkbVar.animate().alpha(1.0f).withLayer().setInterpolator(this.u).setDuration(100L).start();
            ck4Var.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable2 = this.o;
        zj4Var.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = this.I.getWidth();
        int height = this.I.getHeight();
        int width4 = relativeLayout.getWidth();
        int height2 = relativeLayout.getHeight();
        float y = relativeLayout.getY();
        float x3 = relativeLayout.getX();
        wj4 wj4Var3 = new wj4(this, width3, width4, x3, x3 + relativeLayout.getWidth(), (byte) 1);
        wj4 wj4Var4 = new wj4(this, height, height2, y, (byte) 2);
        float x4 = frameLayout.getX();
        xj4 xj4Var2 = new xj4(this, x4, zj4Var.getWidth() + (x4 - width3), width4, (byte) 1);
        wj4Var3.setInterpolator(bk4Var);
        wj4Var3.setDuration(c());
        wj4Var4.setInterpolator(interpolator2);
        wj4Var4.setDuration(c());
        xj4Var2.setInterpolator(interpolator2);
        xj4Var2.setDuration(c());
        AnimationSet animationSet2 = this.y;
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(wj4Var3);
        animationSet2.addAnimation(wj4Var4);
        animationSet2.addAnimation(xj4Var2);
        relativeLayout.startAnimation(animationSet2);
        this.N = true;
        n();
        pkbVar.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = ck4Var.getWidth();
        frameLayout.setLayoutParams(layoutParams);
        ck4Var.setAlpha(1.0f);
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
        ck4 ck4Var = this.h;
        ck4Var.awakenScrollBars();
        boolean z = this.N;
        PopupWindow popupWindow = this.c;
        zj4 zj4Var = this.k;
        int i = this.d;
        Size size = this.H;
        int i2 = this.e;
        RelativeLayout relativeLayout = this.f;
        pkb pkbVar = this.g;
        if (z) {
            Size size2 = this.I;
            m(relativeLayout, size2);
            pkbVar.setAlpha(0.0f);
            pkbVar.setVisibility(4);
            ck4Var.setAlpha(1.0f);
            ck4Var.setVisibility(0);
            zj4Var.setImageDrawable(this.m);
            frameLayout.setContentDescription(k96.M0(2131754838, null));
            relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i);
            pkbVar.setX(-relativeLayout.getX());
            frameLayout.setX(0.0f);
            ck4Var.setX(0.0f);
            if (this.M) {
                relativeLayout.setY(i2);
                pkbVar.setY(size2.getHeight() - relativeLayout.getHeight());
                frameLayout.setY(size2.getHeight() - size.getHeight());
                ck4Var.setY(0.0f);
                return;
            }
            relativeLayout.setY(i2);
            pkbVar.setY(0.0f);
            frameLayout.setY(0.0f);
            ck4Var.setY(size.getHeight());
            return;
        }
        Size size3 = this.J;
        m(relativeLayout, size3);
        pkbVar.setAlpha(1.0f);
        pkbVar.setVisibility(0);
        ck4Var.setAlpha(0.0f);
        ck4Var.setVisibility(4);
        zj4Var.setImageDrawable(this.n);
        frameLayout.setContentDescription(k96.M0(2131754838, null));
        if (this.I != null) {
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i);
            pkbVar.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            ck4Var.setX(size3.getWidth() - this.I.getWidth());
            if (this.M) {
                relativeLayout.setY((this.I.getHeight() + i2) - size3.getHeight());
                pkbVar.setY(0.0f);
                frameLayout.setY(0.0f);
                ck4Var.setY(size3.getHeight() - this.I.getHeight());
                return;
            }
            relativeLayout.setY(i2);
            pkbVar.setY(0.0f);
            frameLayout.setY(0.0f);
            ck4Var.setY(size.getHeight());
            return;
        }
        relativeLayout.setX(i);
        relativeLayout.setY(i2);
        pkbVar.setX(0.0f);
        pkbVar.setY(0.0f);
    }

    public final void n() {
        boolean z = this.N;
        zj4 zj4Var = this.k;
        FrameLayout frameLayout = this.i;
        if (z) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new uj4(this, (byte) 0));
            zj4Var.setClickable(false);
            zj4Var.setOnClickListener(null);
            return;
        }
        frameLayout.setClickable(false);
        frameLayout.setOnClickListener(null);
        zj4Var.setClickable(true);
        zj4Var.setOnClickListener(new uj4(this, (byte) 1));
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
