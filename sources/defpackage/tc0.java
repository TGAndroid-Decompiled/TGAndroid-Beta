package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.RadialProgress2;
public final class tc0 extends FrameLayout {
    public final byte a = 0;
    public int b;
    public boolean c;
    public Object d;
    public final Object e;
    public Object f;
    public Object h;

    public tc0(Context context, ylb ylbVar) {
        super(context);
        this.b = gm.L(64.0f);
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.setAspectFit(true);
        bf0Var.setRoundRadius(gm.L(12.0f));
        addView(bf0Var, qoe.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wl6 wl6Var;
        byte b = this.a;
        float f = 1.0f;
        Object obj = this.e;
        switch (b) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.c) {
                    Drawable t = ((bf0) this.d).getImageReceiver().t();
                    if ((t instanceof kn) && ((kn) t).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.c) {
                                wl6Var = radialProgress2.j;
                            } else {
                                wl6Var = radialProgress2.i;
                            }
                            if (wl6Var.w < 1.0f) {
                                radialProgress2.o(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f = ofFloat;
                            ofFloat.addListener(new g0(this, (byte) 19));
                            ((ValueAnimator) this.f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final tc0 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    byte b2 = r2;
                                    tc0 tc0Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            tc0Var.invalidate();
                                            return;
                                        default:
                                            tc0Var.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f).setDuration(250L);
                            ((ValueAnimator) this.f).start();
                        } else {
                            this.c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final tc0 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                byte b2 = r2;
                                tc0 tc0Var = this.b;
                                switch (b2) {
                                    case 0:
                                        tc0Var.invalidate();
                                        return;
                                    default:
                                        tc0Var.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f;
                    if (valueAnimator2 != null) {
                        radialProgress2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        return;
                    }
                    ValueAnimator valueAnimator3 = (ValueAnimator) this.h;
                    if (valueAnimator3 != null) {
                        radialProgress2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            default:
                Paint paint = (Paint) obj;
                rob robVar = (rob) this.h;
                tnb tnbVar = robVar.a;
                if (this.c) {
                    RectF rectF = gm.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    cmb.s(this, robVar.z0, tnbVar);
                    Paint d = tnbVar.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f);
                    hob hobVar = robVar.z0;
                    if (hobVar != null && (hobVar.getBackground() instanceof ah7) && robVar.n1 < 0.0f) {
                        f = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (robVar.O1) {
                        float f2 = robVar.p1;
                        if (f2 > 0.0f) {
                            canvas.drawColor(on2.p(-16777216, (int) (f2 * 255.0f * robVar.q1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.b != getHeight()) {
                        int height = getHeight();
                        this.b = height;
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        this.d = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(rectF, paint);
                    canvas.restore();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i5 = this.b;
                ((RadialProgress2) this.e).p(width - i5, height - i5, width + i5, height + i5);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getMeasuredWidth() > gm.L(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(gm.L(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public tc0(rob robVar, Context context, boolean z) {
        super(context);
        this.h = robVar;
        this.c = z;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        gm.i(colorMatrix, 0.4f);
        gm.l2(colorMatrix, 0.65f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }
}
