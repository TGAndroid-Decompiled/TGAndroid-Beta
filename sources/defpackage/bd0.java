package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgress2;
public abstract class bd0 extends FrameLayout implements jm7 {
    public static final int G = 0;
    public yc0 E;
    public boolean F;
    public final OvershootInterpolator a;
    public final yd b;
    public final tc0 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final uc0 e;
    public final ylb f;
    public final jz4 h;
    public AnimatorSet n;
    public boolean r;
    public cd0[] s;
    public final View w;
    public boolean x;
    public String y;

    public bd0(Context context, ylb ylbVar, uc0 uc0Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        jz4 jz4Var = new jz4();
        this.h = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.e = uc0Var;
        this.f = ylbVar;
        km0Var.h = new zgc(this);
        km0Var.i = this;
        View view = new View(context);
        this.w = view;
        view.setOnClickListener(new j1(this, (byte) 16));
        addView(view, qoe.c(-1.0f, -1));
        yd ydVar = new yd((byte) 2, context, this);
        this.b = ydVar;
        addView(ydVar, qoe.c(-1.0f, -1));
        tc0 tc0Var = new tc0(context, ylbVar);
        this.c = tc0Var;
        xj xjVar = agc.a;
        tc0Var.setOutlineProvider(new yfc(0, gm.L(12.0f)));
        tc0Var.setElevation(gm.L(4.0f));
        tc0Var.setClipToOutline(true);
        ydVar.addView(tc0Var, qoe.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            tc0Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            tc0Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232581, 0, ylbVar, context);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        im0 c = km0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c.p(qqd.k(ylbVar));
        c.q(gm.L(8.0f));
        c.S.e = true;
        c.r(gm.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        ydVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, qoe.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(wc0 wc0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        this.s = wc0Var.i;
        if (wc0Var.c != null) {
            z = true;
        } else {
            z = false;
        }
        tc0 tc0Var = this.c;
        tc0Var.c = z;
        tc0Var.invalidate();
        this.y = wc0Var.f;
        yc0 yc0Var = this.E;
        if (yc0Var != null) {
            if (yc0Var.g) {
                yc0Var.g = false;
                yc0Var.b.n(yc0Var.a, yc0Var.e);
            }
            this.E = null;
        }
        yc0 yc0Var2 = wc0Var.j;
        if (yc0Var2 != null) {
            this.E = yc0Var2;
            ad0 ad0Var = new ad0(this, wc0Var, (byte) 0);
            if (!yc0Var2.g) {
                yc0Var2.g = true;
                yc0Var2.f = ad0Var;
                yc0Var2.b.a(yc0Var2.a, yc0Var2.e);
                yc0Var2.a();
            }
        }
        int i = z8c.t0;
        gn5 gn5Var = wc0Var.c;
        String str = wc0Var.e;
        gn5 gn5Var2 = wc0Var.a;
        gn5 gn5Var3 = wc0Var.b;
        String str2 = wc0Var.d;
        BitmapDrawable bitmapDrawable = wc0Var.g;
        Object obj = wc0Var.h;
        bf0 bf0Var = (bf0) tc0Var.d;
        bf0Var.getImageReceiver().d = i;
        bf0Var.getImageReceiver().Y(gn5Var, str, gn5Var2, null, gn5Var3, str2, bitmapDrawable, 0L, null, obj, 1);
        bf0Var.e();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i2 = 0;
        while (true) {
            cd0[] cd0VarArr = this.s;
            if (i2 < cd0VarArr.length) {
                cd0 cd0Var = cd0VarArr[i2];
                String M0 = jb6.M0(cd0Var.b, cd0Var.a);
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i2 == this.s.length - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                a8 c = r7.c(z2, z3, actionBarPopupWindow$ActionBarPopupWindowLayout2, cd0Var.c, M0, false, this.f);
                c.setTag(Integer.valueOf(i2));
                c.setOnClickListener(new t(this, cd0Var, (byte) 23));
                i2++;
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            } else {
                b(true);
                return;
            }
        }
    }

    public final void b(final boolean z) {
        TimeInterpolator timeInterpolator;
        long j;
        if (this.r == z) {
            return;
        }
        this.r = z;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            timeInterpolator = this.a;
        } else {
            timeInterpolator = d53.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final bd0 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b = r3;
                boolean z2 = z;
                bd0 bd0Var = this.b;
                switch (b) {
                    case 0:
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bd0Var.d;
                        yd ydVar = bd0Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a = pqe.a(floatValue, 0.0f, 1.0f);
                        float f = (0.3f * floatValue) + 0.7f;
                        ydVar.setScaleX(f);
                        ydVar.setScaleY(f);
                        ydVar.setAlpha(a);
                        float f2 = 1.0f - floatValue;
                        bd0Var.c.setTranslationY(gm.L(40.0f) * f2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-gm.L(70.0f)) * f2);
                        float f3 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f3);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f3);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        bd0Var.w.setAlpha(floatValue2);
                        bd0Var.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final bd0 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b = r3;
                boolean z2 = z;
                bd0 bd0Var = this.b;
                switch (b) {
                    case 0:
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bd0Var.d;
                        yd ydVar = bd0Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a = pqe.a(floatValue, 0.0f, 1.0f);
                        float f = (0.3f * floatValue) + 0.7f;
                        ydVar.setScaleX(f);
                        ydVar.setScaleY(f);
                        ydVar.setAlpha(a);
                        float f2 = 1.0f - floatValue;
                        bd0Var.c.setTranslationY(gm.L(40.0f) * f2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-gm.L(70.0f)) * f2);
                        float f3 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f3);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f3);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        bd0Var.w.setAlpha(floatValue2);
                        bd0Var.invalidate();
                        return;
                }
            }
        });
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        if (z) {
            j = 190;
        } else {
            j = 150;
        }
        animatorSet2.setDuration(j);
        this.n.playTogether(ofFloat, ofFloat2);
        this.n.addListener(new y7((byte) 4, this, z));
        this.n.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        tc0 tc0Var = this.c;
        boolean z = tc0Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) tc0Var.e;
        if (z && !TextUtils.isEmpty(this.y)) {
            if (i == nm7.Y1) {
                if (TextUtils.equals((String) objArr[0], this.y)) {
                    radialProgress2.o(true, 1.0f);
                }
            } else if (i == nm7.X1 && TextUtils.equals((String) objArr[0], this.y)) {
                radialProgress2.o(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 111) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
            b(false);
            return true;
        } else {
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(z8c.t0).b(this, nm7.Y1);
        nm7.f(z8c.t0).b(this, nm7.X1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(z8c.t0).n(this, nm7.Y1);
        nm7.f(z8c.t0).n(this, nm7.X1);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != 0 && i2 != 0 && this.r) {
            this.w.setBackground(null);
            gm.c3(new f00(this, (byte) 7));
        }
        tl0.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
