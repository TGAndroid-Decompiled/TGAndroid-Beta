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
public abstract class bc0 extends FrameLayout implements gk7 {
    public static final int G = 0;
    public yb0 E;
    public boolean F;
    public final OvershootInterpolator a;
    public final yc b;
    public final tb0 c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final ub0 e;
    public final wjb f;
    public final hx4 h;
    public AnimatorSet n;
    public boolean r;
    public cc0[] s;
    public final View w;
    public boolean x;
    public String y;

    public bc0(Context context, wjb wjbVar, ub0 ub0Var) {
        super(context);
        this.a = new OvershootInterpolator(1.02f);
        hx4 hx4Var = new hx4();
        this.h = hx4Var;
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.e = ub0Var;
        this.f = wjbVar;
        kl0Var.h = new zec(this);
        kl0Var.i = this;
        View view = new View(context);
        this.w = view;
        view.setOnClickListener(new j1(this, (byte) 15));
        addView(view, nme.c(-1.0f, -1));
        yc ycVar = new yc((byte) 2, context, this);
        this.b = ycVar;
        addView(ycVar, nme.c(-1.0f, -1));
        tb0 tb0Var = new tb0(context, wjbVar);
        this.c = tb0Var;
        xi xiVar = zdc.a;
        tb0Var.setOutlineProvider(new xdc(0, gl.L(12.0f)));
        tb0Var.setElevation(gl.L(4.0f));
        tb0Var.setClipToOutline(true);
        ycVar.addView(tb0Var, nme.e(0, 0, 1));
        if (Build.VERSION.SDK_INT >= 28) {
            tb0Var.setOutlineSpotShadowColor(Integer.MIN_VALUE);
            tb0Var.setOutlineAmbientShadowColor(Integer.MIN_VALUE);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 0, wjbVar, context);
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        il0 c = kl0Var.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c.p(nod.k(wjbVar));
        c.q(gl.L(8.0f));
        c.S.e = true;
        c.r(gl.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        ycVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.h(-2.0f, -2.0f, 8388611));
    }

    public final void a(wb0 wb0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        this.s = wb0Var.i;
        if (wb0Var.c != null) {
            z = true;
        } else {
            z = false;
        }
        tb0 tb0Var = this.c;
        tb0Var.c = z;
        tb0Var.invalidate();
        this.y = wb0Var.f;
        yb0 yb0Var = this.E;
        if (yb0Var != null) {
            if (yb0Var.g) {
                yb0Var.g = false;
                yb0Var.b.n(yb0Var.a, yb0Var.e);
            }
            this.E = null;
        }
        yb0 yb0Var2 = wb0Var.j;
        if (yb0Var2 != null) {
            this.E = yb0Var2;
            ac0 ac0Var = new ac0(this, wb0Var, (byte) 0);
            if (!yb0Var2.g) {
                yb0Var2.g = true;
                yb0Var2.f = ac0Var;
                yb0Var2.b.a(yb0Var2.a, yb0Var2.e);
                yb0Var2.a();
            }
        }
        int i = y6c.t0;
        gl5 gl5Var = wb0Var.c;
        String str = wb0Var.e;
        gl5 gl5Var2 = wb0Var.a;
        gl5 gl5Var3 = wb0Var.b;
        String str2 = wb0Var.d;
        BitmapDrawable bitmapDrawable = wb0Var.g;
        Object obj = wb0Var.h;
        be0 be0Var = (be0) tb0Var.d;
        be0Var.getImageReceiver().d = i;
        be0Var.getImageReceiver().Y(gl5Var, str, gl5Var2, null, gl5Var3, str2, bitmapDrawable, 0L, null, obj, 1);
        be0Var.e();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        int i2 = 0;
        while (true) {
            cc0[] cc0VarArr = this.s;
            if (i2 < cc0VarArr.length) {
                cc0 cc0Var = cc0VarArr[i2];
                String M0 = k96.M0(cc0Var.b, cc0Var.a);
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
                a8 c = r7.c(z2, z3, actionBarPopupWindow$ActionBarPopupWindowLayout2, cc0Var.c, M0, false, this.f);
                c.setTag(Integer.valueOf(i2));
                c.setOnClickListener(new t(this, cc0Var, (byte) 23));
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
            timeInterpolator = s33.h;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final bc0 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b = r3;
                boolean z2 = z;
                bc0 bc0Var = this.b;
                switch (b) {
                    case 0:
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bc0Var.d;
                        yc ycVar = bc0Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a = moe.a(floatValue, 0.0f, 1.0f);
                        float f = (0.3f * floatValue) + 0.7f;
                        ycVar.setScaleX(f);
                        ycVar.setScaleY(f);
                        ycVar.setAlpha(a);
                        float f2 = 1.0f - floatValue;
                        bc0Var.c.setTranslationY(gl.L(40.0f) * f2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-gl.L(70.0f)) * f2);
                        float f3 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f3);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f3);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        bc0Var.w.setAlpha(floatValue2);
                        bc0Var.invalidate();
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final bc0 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b = r3;
                boolean z2 = z;
                bc0 bc0Var = this.b;
                switch (b) {
                    case 0:
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bc0Var.d;
                        yc ycVar = bc0Var.b;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue = 1.0f - floatValue;
                        }
                        float a = moe.a(floatValue, 0.0f, 1.0f);
                        float f = (0.3f * floatValue) + 0.7f;
                        ycVar.setScaleX(f);
                        ycVar.setScaleY(f);
                        ycVar.setAlpha(a);
                        float f2 = 1.0f - floatValue;
                        bc0Var.c.setTranslationY(gl.L(40.0f) * f2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((-gl.L(70.0f)) * f2);
                        float f3 = (floatValue * 0.05f) + 0.95f;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleX(f3);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setScaleY(f3);
                        return;
                    default:
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (!z2) {
                            floatValue2 = 1.0f - floatValue2;
                        }
                        bc0Var.w.setAlpha(floatValue2);
                        bc0Var.invalidate();
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
        tb0 tb0Var = this.c;
        boolean z = tb0Var.c;
        RadialProgress2 radialProgress2 = (RadialProgress2) tb0Var.e;
        if (z && !TextUtils.isEmpty(this.y)) {
            if (i == kk7.X1) {
                if (TextUtils.equals((String) objArr[0], this.y)) {
                    radialProgress2.o(true, 1.0f);
                }
            } else if (i == kk7.W1 && TextUtils.equals((String) objArr[0], this.y)) {
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
        kk7.f(y6c.t0).b(this, kk7.X1);
        kk7.f(y6c.t0).b(this, kk7.W1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(y6c.t0).n(this, kk7.X1);
        kk7.f(y6c.t0).n(this, kk7.W1);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != 0 && i2 != 0 && this.r) {
            this.w.setBackground(null);
            gl.d3(new oz(this, (byte) 5));
        }
        tk0.c(this.h, this);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.d;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
        }
    }
}
