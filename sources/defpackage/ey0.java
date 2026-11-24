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
public final class ey0 extends TextView {
    public final byte a;
    public Object b;

    public ey0(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                super(context);
                this.b = new dw2(this, (byte) 2);
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
            pp4 pp4Var = fragmentContextView.d;
            pp4Var.setPadding(pp4Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.draw(canvas);
                int L = gm.L(1.0f);
                RectF rectF = gm.P;
                float f = L;
                rectF.set(f, f, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.b).O.a(gm.L(16.0f), canvas, rectF, this);
                return;
            case 5:
                super.draw(canvas);
                i9a i9aVar = (i9a) this.b;
                ef1 ef1Var = i9aVar.c;
                if (ef1Var.g <= 1.0f) {
                    SessionsActivity sessionsActivity = i9aVar.f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = gm.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        ef1Var.f = getMeasuredWidth();
                        ef1Var.a(gm.L(8.0f), canvas, rectF2, null);
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
                nm7.e().b((dw2) this.b, 264);
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
                nm7.e().n((dw2) this.b, 264);
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
                ef1 ef1Var = (ef1) this.b;
                if (ef1Var == null) {
                    ef1Var = new ef1();
                    this.b = ef1Var;
                    ef1Var.k = false;
                    ef1Var.m = 2.0f;
                }
                ef1Var.f = getMeasuredWidth();
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((ef1) this.b).a(gm.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 6:
                super.onDraw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = gm.P;
                rectF2.set(gm.L(1.0f), gm.L(1.0f), getMeasuredWidth() - gm.L(1.0f), getMeasuredHeight() - gm.L(1.0f));
                canvas.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), paint);
                return;
            case 9:
                soc socVar = (soc) this.b;
                float e = socVar.h0.e(false, socVar.f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                socVar.c(e, new ed1(paint2, (byte) 2), new qhc(this, canvas, (byte) 16));
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
                    ((iic) this.b).y();
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
                my0 my0Var = (my0) this.b;
                if (my0Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = my0Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (my0Var.b != null) {
                        for (int i3 = 1; i3 < my0Var.b.getChildCount(); i3++) {
                            View childAt = my0Var.b.getChildAt(i3);
                            if (childAt instanceof gy0) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = gm.L(48.0f) + measuredHeight;
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
                if (jb6.a0) {
                    ((p1c) this.b).b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((rrc) this.b).Y));
                return;
            case 11:
                super.onMeasure(i, i2);
                ((tuc) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
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
                if (Math.abs(((ha5) this.b).O.getAlpha() - 1.0f) > 0.001f) {
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

    public ey0(Activity activity, Paint paint) {
        super(activity);
        this.a = (byte) 6;
        this.b = paint;
    }

    public ey0(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
