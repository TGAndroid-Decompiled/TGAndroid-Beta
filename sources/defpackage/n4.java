package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeProvider;
import org.telegram.ui.Components.voip.FabBackgroundDrawable;
public final class n4 extends View {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public final float J;
    public float K;
    public float L;
    public float M;
    public final Rect N;
    public final Rect O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public m4 R;
    public boolean S;
    public fg0 T;
    public final Paint U;
    public final p09 V;
    public final Drawable W;
    public final FabBackgroundDrawable a;
    public final xn5 a0;
    public final FabBackgroundDrawable b;
    public final Paint b0;
    public final Drawable c;
    public ValueAnimator c0;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f;
    public final StaticLayout h;
    public final u51 n;
    public final u51 r;
    public k4 s;
    public final int w;
    public float x;
    public float y;

    public n4(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.n = new u51(this);
        this.r = new u51(this);
        this.E = true;
        this.F = true;
        this.N = new Rect();
        this.O = new Rect();
        this.U = new Paint(1);
        Paint paint2 = new Paint(1);
        this.b0 = paint2;
        xn5 xn5Var = new xn5(gm.L(45.0f), gm.L(50.0f), gm.L(8.0f), 4);
        this.a0 = xn5Var;
        xn5Var.h = true;
        xn5Var.i = 0.0f;
        xn5Var.d = 0.0f;
        xn5Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.J = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = gm.L(60.0f);
        this.w = L;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.a = fabBackgroundDrawable;
        fabBackgroundDrawable.setColor(-12531895);
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.b = fabBackgroundDrawable2;
        fabBackgroundDrawable2.setColor(-1041108);
        fabBackgroundDrawable2.setBounds(0, 0, L, L);
        fabBackgroundDrawable.setBounds(0, 0, L, L);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(gm.L(11.0f));
        textPaint.setColor(-1);
        String M0 = jb6.M0(2131754715, null);
        String M02 = jb6.M0(2131751540, null);
        String M03 = jb6.M0(2131745784, null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.e = new StaticLayout(M0, textPaint, (int) textPaint.measureText(M0), alignment, 1.0f, 0.0f, false);
        this.f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.c = activity.getDrawable(2131230919).mutate();
        Drawable mutate = activity.getDrawable(2131231273).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        p09 p09Var = new p09(2131623956, gm.L(48.0f), gm.L(48.0f), true, null);
        this.V = p09Var;
        p09Var.F(1);
        p09Var.K(90);
        p09Var.M(this);
        this.W = activity.getDrawable(2131230927).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        fg0 h0 = cmb.h0(gm.L(52.0f), 0, on2.p(-1, 76));
        this.T = h0;
        h0.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.T.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        k4 k4Var = this.s;
        if (k4Var == null) {
            k4 k4Var2 = new k4(this, this);
            this.s = k4Var2;
            return k4Var2;
        }
        return k4Var;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        fg0 fg0Var = this.T;
        if (fg0Var != null) {
            fg0Var.jumpToCurrentState();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c0 = null;
            this.V.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        float f;
        Rect rect2;
        if (!this.S) {
            boolean z = this.E;
            float f2 = this.x;
            if (z) {
                float L = (gm.L(2.0f) * 0.04f) + f2;
                this.x = L;
                if (L > gm.L(4.0f)) {
                    this.x = gm.L(4.0f);
                    this.E = false;
                }
            } else {
                float L2 = f2 - (gm.L(2.0f) * 0.04f);
                this.x = L2;
                if (L2 < 0.0f) {
                    this.x = 0.0f;
                    this.E = true;
                }
            }
            boolean z2 = this.F;
            float f3 = this.y;
            if (z2) {
                float L3 = (gm.L(4.0f) * 0.03f) + f3;
                this.y = L3;
                if (L3 > gm.L(10.0f)) {
                    this.y = gm.L(10.0f);
                    this.F = false;
                }
            } else {
                float L4 = f3 - (gm.L(5.0f) * 0.03f);
                this.y = L4;
                if (L4 < gm.L(5.0f)) {
                    this.y = gm.L(5.0f);
                    this.F = true;
                }
            }
            invalidate();
        }
        this.y = (gm.L(8.0f) * 0.005f) + this.y;
        int measuredWidth = getMeasuredWidth();
        int i = this.w;
        this.O.set(kt6.y(46.0f, measuredWidth, i), gm.L(40.0f), getMeasuredWidth() - gm.L(46.0f), gm.L(40.0f) + i);
        canvas.save();
        canvas.translate(0.0f, gm.L(40.0f));
        canvas.save();
        float a = this.r.a(0.1f);
        float f4 = i;
        float f5 = f4 / 2.0f;
        canvas.scale(a, a, rect.centerX(), rect.top + f5);
        canvas.translate(((this.L + getMeasuredWidth()) - gm.L(46.0f)) - f4, 0.0f);
        boolean z3 = this.S;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z3) {
            f = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.d;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.b0);
                }
            }
            canvas.restore();
        } else {
            f = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.c.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.f;
        canvas.translate(f5 - (staticLayout.getWidth() / f), gm.L(4.0f) + i);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.H) {
            this.T.setBounds(gm.L(4.0f), gm.L(4.0f), i - gm.L(4.0f), i - gm.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        this.N.set(gm.L(46.0f), gm.L(40.0f), gm.L(46.0f) + i, gm.L(40.0f) + i);
        canvas.save();
        float a2 = this.n.a(0.1f);
        canvas.scale(a2, a2, rect2.centerX(), rect2.top + f5);
        canvas.translate(this.K + gm.L(46.0f), 0.0f);
        if (!this.S) {
            xn5 xn5Var = this.a0;
            xn5Var.c();
            float f6 = (int) f5;
            xn5Var.a(canvas, f6, f6, this);
        }
        this.a.draw(canvas);
        if (this.S) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f5 - (staticLayout2.getWidth() / f), gm.L(4.0f) + i);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f5 - (staticLayout3.getWidth() / f), gm.L(4.0f) + i);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(gm.L(6.0f), gm.L(6.0f));
        this.V.draw(canvas);
        canvas.restore();
        if (!this.H) {
            this.T.setBounds(gm.L(4.0f), gm.L(4.0f), i - gm.L(4.0f), i - gm.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.G) {
            invalidate();
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        k4 k4Var = this.s;
        if (k4Var != null) {
            Rect rect = k4Var.c;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && k4Var.e != -1) {
                    k4Var.e = -1;
                    return true;
                }
            } else {
                for (int i = 0; i < k4Var.b; i++) {
                    n4 n4Var = k4Var.g;
                    if (i == 0) {
                        rect.set(n4Var.N);
                    } else if (i == 1) {
                        rect.set(n4Var.O);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x, y)) {
                        if (i != k4Var.e) {
                            k4Var.e = i;
                            k4Var.a(i);
                        }
                        return true;
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.w;
        this.M = (getMeasuredWidth() / 2.0f) - ((i3 / 2.0f) + gm.L(46.0f));
        int D = wi8.D(28.0f, i3, 2);
        this.c.setBounds(D, D, gm.L(28.0f) + D, gm.L(28.0f) + D);
        this.d.setBounds(D, D, gm.L(28.0f) + D, gm.L(28.0f) + D);
        Paint paint = this.U;
        paint.setStrokeWidth(gm.L(3.0f));
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(m4 m4Var) {
        this.R = m4Var;
    }

    public void setRetryMod(boolean z) {
        this.S = z;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.V.start();
        xn5 xn5Var = this.a0;
        if (!xn5Var.e) {
            invalidate();
        }
        xn5Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.c0 = ofInt;
        ofInt.addUpdateListener(new j4(this, (byte) 2));
        this.c0.setDuration(1500L);
        this.c0.setRepeatMode(1);
        this.c0.setRepeatCount(-1);
        this.c0.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.T != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
