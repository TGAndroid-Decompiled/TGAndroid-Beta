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
public final class o4 extends View {
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
    public n4 R;
    public boolean S;
    public hf0 T;
    public final Paint U;
    public final b29 V;
    public final Drawable W;
    public final FabBackgroundDrawable a;
    public final ao5 a0;
    public final FabBackgroundDrawable b;
    public final Paint b0;
    public final Drawable c;
    public ValueAnimator c0;
    public final Drawable d;
    public final StaticLayout e;
    public final StaticLayout f;
    public final StaticLayout h;
    public final v41 n;
    public final v41 r;
    public l4 s;
    public final int w;
    public float x;
    public float y;

    public o4(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.n = new v41(this);
        this.r = new v41(this);
        this.E = true;
        this.F = true;
        this.N = new Rect();
        this.O = new Rect();
        this.U = new Paint(1);
        Paint paint2 = new Paint(1);
        this.b0 = paint2;
        ao5 ao5Var = new ao5(hl.L(45.0f), hl.L(50.0f), hl.L(8.0f), 4);
        this.a0 = ao5Var;
        ao5Var.h = true;
        ao5Var.i = 0.0f;
        ao5Var.d = 0.0f;
        ao5Var.b(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.J = ViewConfiguration.get(activity).getScaledTouchSlop();
        int L = hl.L(60.0f);
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
        textPaint.setTextSize(hl.L(11.0f));
        textPaint.setColor(-1);
        String M0 = ob6.M0(2131754711, null);
        String M02 = ob6.M0(2131751568, null);
        String M03 = ob6.M0(2131745778, null);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.e = new StaticLayout(M0, textPaint, (int) textPaint.measureText(M0), alignment, 1.0f, 0.0f, false);
        this.f = new StaticLayout(M02, textPaint, (int) textPaint.measureText(M02), alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(M03, textPaint, (int) textPaint.measureText(M03), alignment, 1.0f, 0.0f, false);
        this.c = activity.getDrawable(2131230918).mutate();
        Drawable mutate = activity.getDrawable(2131231272).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        b29 b29Var = new b29(2131623956, hl.L(48.0f), hl.L(48.0f), true, null);
        this.V = b29Var;
        b29Var.F(1);
        b29Var.K(90);
        b29Var.M(this);
        this.W = activity.getDrawable(2131230926).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        hf0 h0 = aob.h0(hl.L(52.0f), 0, vm2.o(-1, 76));
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
        l4 l4Var = this.s;
        if (l4Var == null) {
            l4 l4Var2 = new l4(this, this);
            this.s = l4Var2;
            return l4Var2;
        }
        return l4Var;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.T;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
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
                float L = (hl.L(2.0f) * 0.04f) + f2;
                this.x = L;
                if (L > hl.L(4.0f)) {
                    this.x = hl.L(4.0f);
                    this.E = false;
                }
            } else {
                float L2 = f2 - (hl.L(2.0f) * 0.04f);
                this.x = L2;
                if (L2 < 0.0f) {
                    this.x = 0.0f;
                    this.E = true;
                }
            }
            boolean z2 = this.F;
            float f3 = this.y;
            if (z2) {
                float L3 = (hl.L(4.0f) * 0.03f) + f3;
                this.y = L3;
                if (L3 > hl.L(10.0f)) {
                    this.y = hl.L(10.0f);
                    this.F = false;
                }
            } else {
                float L4 = f3 - (hl.L(5.0f) * 0.03f);
                this.y = L4;
                if (L4 < hl.L(5.0f)) {
                    this.y = hl.L(5.0f);
                    this.F = true;
                }
            }
            invalidate();
        }
        this.y = (hl.L(8.0f) * 0.005f) + this.y;
        int measuredWidth = getMeasuredWidth();
        int i = this.w;
        this.O.set(qu6.x(46.0f, measuredWidth, i), hl.L(40.0f), getMeasuredWidth() - hl.L(46.0f), hl.L(40.0f) + i);
        canvas.save();
        canvas.translate(0.0f, hl.L(40.0f));
        canvas.save();
        float a = this.r.a(0.1f);
        float f4 = i;
        float f5 = f4 / 2.0f;
        canvas.scale(a, a, rect.centerX(), rect.top + f5);
        canvas.translate(((this.L + getMeasuredWidth()) - hl.L(46.0f)) - f4, 0.0f);
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
        canvas.translate(f5 - (staticLayout.getWidth() / f), hl.L(4.0f) + i);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.H) {
            this.T.setBounds(hl.L(4.0f), hl.L(4.0f), i - hl.L(4.0f), i - hl.L(4.0f));
            this.T.draw(canvas);
        }
        canvas.restore();
        this.N.set(hl.L(46.0f), hl.L(40.0f), hl.L(46.0f) + i, hl.L(40.0f) + i);
        canvas.save();
        float a2 = this.n.a(0.1f);
        canvas.scale(a2, a2, rect2.centerX(), rect2.top + f5);
        canvas.translate(this.K + hl.L(46.0f), 0.0f);
        if (!this.S) {
            ao5 ao5Var = this.a0;
            ao5Var.c();
            float f6 = (int) f5;
            ao5Var.a(canvas, f6, f6, this);
        }
        this.a.draw(canvas);
        if (this.S) {
            canvas.save();
            StaticLayout staticLayout2 = this.h;
            canvas.translate(f5 - (staticLayout2.getWidth() / f), hl.L(4.0f) + i);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.e;
            canvas.translate(f5 - (staticLayout3.getWidth() / f), hl.L(4.0f) + i);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(hl.L(6.0f), hl.L(6.0f));
        this.V.draw(canvas);
        canvas.restore();
        if (!this.H) {
            this.T.setBounds(hl.L(4.0f), hl.L(4.0f), i - hl.L(4.0f), i - hl.L(4.0f));
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
        l4 l4Var = this.s;
        if (l4Var != null) {
            Rect rect = l4Var.c;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
                if (motionEvent.getAction() == 10 && l4Var.e != -1) {
                    l4Var.e = -1;
                    return true;
                }
            } else {
                for (int i = 0; i < l4Var.b; i++) {
                    o4 o4Var = l4Var.g;
                    if (i == 0) {
                        rect.set(o4Var.N);
                    } else if (i == 1) {
                        rect.set(o4Var.O);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x, y)) {
                        if (i != l4Var.e) {
                            l4Var.e = i;
                            l4Var.a(i);
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
        this.M = (getMeasuredWidth() / 2.0f) - ((i3 / 2.0f) + hl.L(46.0f));
        int D = ik8.D(28.0f, i3, 2);
        this.c.setBounds(D, D, hl.L(28.0f) + D, hl.L(28.0f) + D);
        this.d.setBounds(D, D, hl.L(28.0f) + D, hl.L(28.0f) + D);
        Paint paint = this.U;
        paint.setStrokeWidth(hl.L(3.0f));
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(n4 n4Var) {
        this.R = n4Var;
    }

    public void setRetryMod(boolean z) {
        this.S = z;
        FabBackgroundDrawable fabBackgroundDrawable = this.b;
        if (z) {
            fabBackgroundDrawable.setColor(-1);
            return;
        }
        this.V.start();
        ao5 ao5Var = this.a0;
        if (!ao5Var.e) {
            invalidate();
        }
        ao5Var.e = true;
        fabBackgroundDrawable.setColor(-1041108);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.c0 = ofInt;
        ofInt.addUpdateListener(new k4(this, (byte) 2));
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
