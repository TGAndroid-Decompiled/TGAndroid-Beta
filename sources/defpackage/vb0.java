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
public final class vb0 extends FrameLayout {
    public final byte a = 0;
    public int b;
    public boolean c;
    public Object d;
    public final Object e;
    public Object f;
    public Object h;

    public vb0(Context context, vnb vnbVar) {
        super(context);
        this.b = hl.L(64.0f);
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.setAspectFit(true);
        de0Var.setRoundRadius(hl.L(12.0f));
        addView(de0Var, tre.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yl6 yl6Var;
        byte b = this.a;
        float f = 1.0f;
        Object obj = this.e;
        switch (b) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.c) {
                    Drawable t = ((de0) this.d).getImageReceiver().t();
                    if ((t instanceof lm) && ((lm) t).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.c) {
                                yl6Var = radialProgress2.j;
                            } else {
                                yl6Var = radialProgress2.i;
                            }
                            if (yl6Var.w < 1.0f) {
                                radialProgress2.o(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f = ofFloat;
                            ofFloat.addListener(new h0(this, (byte) 17));
                            ((ValueAnimator) this.f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final vb0 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    byte b2 = r2;
                                    vb0 vb0Var = this.b;
                                    switch (b2) {
                                        case 0:
                                            vb0Var.invalidate();
                                            return;
                                        default:
                                            vb0Var.invalidate();
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
                            public final vb0 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                byte b2 = r2;
                                vb0 vb0Var = this.b;
                                switch (b2) {
                                    case 0:
                                        vb0Var.invalidate();
                                        return;
                                    default:
                                        vb0Var.invalidate();
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
                pqb pqbVar = (pqb) this.h;
                rpb rpbVar = pqbVar.a;
                if (this.c) {
                    RectF rectF = hl.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    aob.s(this, pqbVar.z0, rpbVar);
                    Paint d = rpbVar.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f);
                    fqb fqbVar = pqbVar.z0;
                    if (fqbVar != null && (fqbVar.getBackground() instanceof ih7) && pqbVar.n1 < 0.0f) {
                        f = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (pqbVar.O1) {
                        float f2 = pqbVar.p1;
                        if (f2 > 0.0f) {
                            canvas.drawColor(vm2.o(-16777216, (int) (f2 * 255.0f * pqbVar.q1)));
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
                    if (childAt.getMeasuredWidth() > hl.L(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(hl.L(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public vb0(pqb pqbVar, Context context, boolean z) {
        super(context);
        this.h = pqbVar;
        this.c = z;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        hl.i(colorMatrix, 0.4f);
        hl.l2(colorMatrix, 0.65f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }
}
