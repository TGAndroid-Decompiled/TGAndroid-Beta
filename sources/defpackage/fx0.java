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
public final class fx0 extends TextView {
    public final byte a;
    public Object b;

    public fx0(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 4:
                super(context);
                this.b = new nv2(this, (byte) 2);
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
            sp4 sp4Var = fragmentContextView.d;
            sp4Var.setPadding(sp4Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.draw(canvas);
                int L = hl.L(1.0f);
                RectF rectF = hl.P;
                float f = L;
                rectF.set(f, f, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.b).O.a(hl.L(16.0f), canvas, rectF, this);
                return;
            case 5:
                super.draw(canvas);
                yaa yaaVar = (yaa) this.b;
                fe1 fe1Var = yaaVar.c;
                if (fe1Var.g <= 1.0f) {
                    SessionsActivity sessionsActivity = yaaVar.f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = hl.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        fe1Var.f = getMeasuredWidth();
                        fe1Var.a(hl.L(8.0f), canvas, rectF2, null);
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
                jn7.e().b((nv2) this.b, 263);
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
                jn7.e().n((nv2) this.b, 263);
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
                fe1 fe1Var = (fe1) this.b;
                if (fe1Var == null) {
                    fe1Var = new fe1();
                    this.b = fe1Var;
                    fe1Var.k = false;
                    fe1Var.m = 2.0f;
                }
                fe1Var.f = getMeasuredWidth();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((fe1) this.b).a(hl.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 6:
                super.onDraw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = hl.P;
                rectF2.set(hl.L(1.0f), hl.L(1.0f), getMeasuredWidth() - hl.L(1.0f), getMeasuredHeight() - hl.L(1.0f));
                canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), paint);
                return;
            case 9:
                frc frcVar = (frc) this.b;
                float e = frcVar.h0.e(false, frcVar.f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                frcVar.c(e, new ec1(paint2, (byte) 2), new vlc(this, canvas, (byte) 13));
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
                    ((mkc) this.b).y();
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
                nx0 nx0Var = (nx0) this.b;
                if (nx0Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = nx0Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (nx0Var.b != null) {
                        for (int i3 = 1; i3 < nx0Var.b.getChildCount(); i3++) {
                            View childAt = nx0Var.b.getChildAt(i3);
                            if (childAt instanceof hx0) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = hl.L(48.0f) + measuredHeight;
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
                if (ob6.a0) {
                    ((o3c) this.b).b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((euc) this.b).Y));
                return;
            case 11:
                super.onMeasure(i, i2);
                ((hxc) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
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
                if (Math.abs(((ka5) this.b).O.getAlpha() - 1.0f) > 0.001f) {
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

    public fx0(Activity activity, Paint paint) {
        super(activity);
        this.a = (byte) 6;
        this.b = paint;
    }

    public fx0(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
