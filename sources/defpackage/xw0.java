package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.SessionsActivity;
public final class xw0 extends TextView {
    public final byte a;
    public Object b;

    public xw0(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                super(context);
                this.b = new su2(this, (byte) 2);
                return;
            default:
                return;
        }
    }

    public final void a(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void b(int i) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        if (fragmentContextView.N != i) {
            nn4 nn4Var = fragmentContextView.d;
            nn4Var.setPadding(nn4Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.draw(canvas);
                int L = gl.L(1.0f);
                RectF rectF = gl.P;
                float f = L;
                rectF.set(f, f, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.b).O.a(gl.L(16.0f), canvas, rectF, this);
                return;
            case 5:
                super.draw(canvas);
                h7a h7aVar = (h7a) this.b;
                wd1 wd1Var = h7aVar.c;
                if (wd1Var.g <= 1.0f) {
                    SessionsActivity sessionsActivity = h7aVar.f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = gl.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        wd1Var.f = getMeasuredWidth();
                        wd1Var.a(gl.L(8.0f), canvas, rectF2, null);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 4:
                super.onAttachedToWindow();
                kk7.e().b((su2) this.b, 262);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 4:
                super.onDetachedFromWindow();
                kk7.e().n((su2) this.b, 262);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                wd1 wd1Var = (wd1) this.b;
                if (wd1Var == null) {
                    wd1Var = new wd1();
                    this.b = wd1Var;
                    wd1Var.k = false;
                    wd1Var.m = 2.0f;
                }
                wd1Var.f = getMeasuredWidth();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((wd1) this.b).a(gl.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 6:
                super.onDraw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = gl.P;
                rectF2.set(gl.L(1.0f), gl.L(1.0f), getMeasuredWidth() - gl.L(1.0f), getMeasuredHeight() - gl.L(1.0f));
                canvas.drawRoundRect(rectF2, gl.L(4.0f), gl.L(4.0f), paint);
                return;
            case 9:
                smc smcVar = (smc) this.b;
                float e = smcVar.h0.e(false, smcVar.f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                smcVar.c(e, new wb1(paint2, (byte) 2), new mhc(this, canvas, (byte) 14));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 8:
                super.onLayout(z, i, i2, i3, i4);
                if (z) {
                    ((hgc) this.b).y();
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                fx0 fx0Var = (fx0) this.b;
                if (fx0Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = fx0Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (fx0Var.b != null) {
                        for (int i3 = 1; i3 < fx0Var.b.getChildCount(); i3++) {
                            View childAt = fx0Var.b.getChildAt(i3);
                            if (childAt instanceof zw0) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = gl.L(48.0f) + measuredHeight;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                super.onMeasure(i, i2);
                b(getMeasuredWidth());
                return;
            case 7:
                super.onMeasure(i, i2);
                if (k96.a0) {
                    ((ozb) this.b).b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((qpc) this.b).Y));
                return;
            case 11:
                super.onMeasure(i, i2);
                ((ssc) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i, i2, i3, i4);
                ((FragmentContextView) this.b).O.f = getWidth();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                if (Math.abs(((h85) this.b).O.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 2:
                super.setVisibility(i);
                if (i != 0) {
                    b(0);
                    ((FragmentContextView) this.b).N = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public xw0(Activity activity, Paint paint) {
        super(activity);
        this.a = (byte) 6;
        this.b = paint;
    }

    public xw0(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
