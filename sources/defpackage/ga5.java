package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
public final class ga5 extends hmc {
    public float h0;
    public final vc2 i0;
    public final mb5 j0;
    public final TextPaint k0;
    public final StaticLayout l0;
    public final TextPaint m0;
    public final String n0;
    public final float o0;
    public final StaticLayout p0;
    public final j95 q0;
    public final String r0;
    public final float s0;
    public final ka5 t0;

    public ga5(ka5 ka5Var, Context context, vc2 vc2Var, mb5 mb5Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f, StaticLayout staticLayout2, j95 j95Var, String str2, float f2) {
        super(context, false, false, true, true);
        this.t0 = ka5Var;
        this.i0 = vc2Var;
        this.j0 = mb5Var;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f;
        this.p0 = staticLayout2;
        this.q0 = j95Var;
        this.r0 = str2;
        this.s0 = f2;
    }

    @Override
    public final void a() {
        super.a();
        this.h0 = this.t0.w0;
    }

    @Override
    public final void b() {
        int i;
        wc2 wc2Var;
        invalidate();
        ka5 ka5Var = this.t0;
        boolean z = ka5Var.s0;
        gmc gmcVar = this.d;
        if (!z && gmcVar.getAlpha() != 1.0f) {
            gmcVar.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = ka5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            int i2 = (ka5Var.x0.getAlpha() > 1.0f ? 1 : (ka5Var.x0.getAlpha() == 1.0f ? 0 : -1));
            ImageView imageView2 = ka5Var.x0;
            if (i2 == 0) {
                imageView2.animate().alpha(0.0f).setDuration(300L).setListener(new cn2(this, (byte) 28)).start();
            } else if (imageView2.getParent() != null) {
                ka5Var.a.removeView(ka5Var.x0);
            }
        }
        int i3 = gmcVar.f;
        if (i3 != 0 && (i = gmcVar.e) != 0 && (wc2Var = ka5Var.x) != null) {
            wc2Var.a(i, i3, this.i0);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        int i2;
        float f5;
        float f6;
        float f7;
        int i3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        ka5 ka5Var = this.t0;
        c43 c43Var = ka5Var.u0;
        Drawable drawable = ka5Var.v0;
        ga5 ga5Var = ka5Var.a;
        ImageReceiver imageReceiver = ka5Var.l0;
        fx0 fx0Var = ka5Var.O;
        gmc gmcVar = this.d;
        boolean z = gmcVar.c.P;
        TextPaint textPaint = this.k0;
        vc2 vc2Var = this.i0;
        mb5 mb5Var = this.j0;
        if (z && ((gmcVar.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) && !ka5Var.s0)) {
            f = 255.0f;
        } else {
            float f13 = ka5Var.k0;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.10666667f;
                ka5Var.k0 = f14;
                if (f14 > 1.0f) {
                    ka5Var.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (ka5Var.q0 != null) {
                canvas.save();
                float f15 = this.a0;
                canvas.scale(f15, f15, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (ka5Var.r0 == null) {
                    Paint paint = new Paint(1);
                    ka5Var.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f = 255.0f;
                canvas.drawBitmap(ka5Var.q0, (getMeasuredWidth() - ka5Var.q0.getWidth()) / 2.0f, (getMeasuredHeight() - ka5Var.q0.getHeight()) / 2.0f, ka5Var.r0);
                canvas.restore();
                f2 = 0.0f;
            } else {
                f = 255.0f;
                f2 = 0.0f;
                imageReceiver.i0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(ka5Var.k0);
                imageReceiver.h(canvas, null);
            }
            wc2 wc2Var = ka5Var.x;
            if (wc2Var == vc2Var.z) {
                if (ka5Var.b || !mb5Var.b) {
                    float L = hl.L(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (hl.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + hl.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (fx0Var.getVisibility() != 4) {
                    fx0Var.setVisibility(4);
                }
            } else if (wc2Var.b && wc2Var.a.self) {
                if (fx0Var.getVisibility() != 0) {
                    fx0Var.setVisibility(0);
                    fx0Var.setScaleX(1.0f);
                    fx0Var.setScaleY(1.0f);
                }
                if (ka5Var.y0) {
                    f3 = f2;
                } else {
                    f3 = mb5Var.c;
                }
                int L2 = hl.L(33.0f);
                if (!ka5Var.r && !ka5Var.b) {
                    float f16 = L2;
                    float L3 = hl.L(10.0f);
                    float f17 = 1.0f - mb5Var.c;
                    f4 = 400.0f;
                    if (!ka5Var.h && !ka5Var.f) {
                        f9 = f2;
                    } else {
                        f9 = mb5Var.n;
                    }
                    i2 = (int) ((Math.max(f17, f9) * L3) + f16);
                } else {
                    f4 = 400.0f;
                    i2 = (int) bs2.i(hl.L(39.0f), mb5Var.c, hl.L(10.0f), L2);
                }
                int measuredWidth = (getMeasuredWidth() - i2) / 2;
                boolean z2 = ka5Var.h;
                if (!z2 && !ka5Var.f) {
                    f5 = f2;
                } else {
                    f5 = mb5Var.n;
                }
                if (ka5Var.b) {
                    f6 = f3;
                } else {
                    if (ka5Var.r) {
                        f3 = mb5Var.c;
                    } else {
                        f3 = f5;
                    }
                    if (!z2 && !ka5Var.f) {
                        f6 = mb5Var.c;
                    } else {
                        f6 = mb5Var.n;
                    }
                }
                float measuredHeight = ((getMeasuredHeight() - i2) / 2) - hl.L(28.0f);
                float f18 = f3;
                float L4 = hl.L(17.0f);
                float L5 = hl.L(74.0f);
                if (!ka5Var.b && !ka5Var.r) {
                    f7 = f2;
                } else {
                    f7 = mb5Var.c;
                }
                int L6 = (int) ((hl.L(17.0f) * f6) + (measuredHeight - (((f7 * L5) + L4) * f18)));
                int i4 = L6 + i2;
                drawable.setBounds(measuredWidth, L6, measuredWidth + i2, i4);
                drawable.draw(canvas);
                float f19 = mb5Var.c;
                if (f19 <= f2 && f5 <= f2) {
                    fx0Var.setAlpha(f2);
                    i3 = i4;
                } else {
                    float max = Math.max(f19, f5) * f18;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * f));
                    if (!ka5Var.r && !ka5Var.b) {
                        fx0Var.setAlpha(0.0f);
                    } else {
                        fx0Var.setAlpha((1.0f - f5) * max);
                    }
                    i3 = i4;
                    canvas.drawText(this.n0, (i2 / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), hl.L(32.0f) + i4, textPaint2);
                }
                fx0Var.setTranslationY(((hl.L(72.0f) + i3) + ka5Var.p0) - this.O);
                fx0Var.setTranslationX(((getMeasuredWidth() - fx0Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (mb5Var.c < 1.0f && f5 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(f8, f5)) * 255.0d));
                    canvas.save();
                    canvas.translate((i2 / 2.0f) + (measuredWidth - (hl.L(f4) / 2.0f)), hl.L(10.0f) + i3);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                if (fx0Var.getVisibility() != 4) {
                    fx0Var.setVisibility(4);
                }
                fe1 fe1Var = this.q0.j4;
                Paint paint2 = fe1Var.c;
                Matrix matrix = fe1Var.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j = fe1Var.h;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 10) {
                        float f20 = (((float) j2) / 500.0f) + fe1Var.g;
                        fe1Var.g = f20;
                        if (f20 > 4.0f) {
                            fe1Var.g = 0.0f;
                            x38 x38Var = fe1Var.p;
                            if (x38Var != null) {
                                x38Var.run();
                            }
                        }
                        fe1Var.h = currentTimeMillis;
                    }
                } else {
                    fe1Var.h = currentTimeMillis;
                }
                float f21 = fe1Var.g;
                if (f21 <= 1.0f) {
                    int i5 = fe1Var.f;
                    matrix.setTranslate((((i5 + (i << 1)) * f21) - fe1Var.e) - ka5Var.getX(), 0.0f);
                    fe1Var.b.setLocalMatrix(matrix);
                    fe1Var.d.setLocalMatrix(matrix);
                    RectF rectF = hl.P;
                    rectF.set(ga5Var.P, ga5Var.O, ga5Var.getMeasuredWidth() - ga5Var.P, ga5Var.getMeasuredHeight() - ga5Var.O);
                    canvas.drawRect(rectF, fe1Var.a);
                    if (fe1Var.k) {
                        if (fe1Var.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f22 = ga5Var.b;
                        canvas.drawRoundRect(rectF, f22, f22, paint2);
                    }
                }
            }
            invalidate();
        }
        ImageView imageView = ka5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            ka5Var.x0.setScaleX(ga5Var.d.getScaleX());
            ka5Var.x0.setScaleY(ga5Var.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight2 = (getMeasuredHeight() - this.O) - hl.L(80.0f);
        if (ka5Var.x != vc2Var.z) {
            canvas.save();
            if ((ka5Var.b || ka5Var.r) && !j95.u5 && !j95.v5) {
                measuredHeight2 = qu6.B(1.0f, mb5Var.a0, hl.L(90.0f) * mb5Var.c, measuredHeight2);
            }
            f10 = 0.0f;
            canvas.translate(0.0f, measuredHeight2);
            canvas.drawPaint(ka5Var.E);
            canvas.restore();
        } else {
            f10 = 0.0f;
        }
        boolean z3 = ka5Var.s0;
        float f23 = ka5Var.t0;
        if (!z3) {
            if (f23 != f10) {
                if (f23 != f10) {
                    float f24 = f23 - 0.064f;
                    ka5Var.t0 = f24;
                    if (f24 < f10) {
                        ka5Var.t0 = f10;
                    } else {
                        invalidate();
                    }
                }
                f11 = 1.0f;
            } else {
                return;
            }
        } else {
            f11 = 1.0f;
            if (f23 != 1.0f) {
                float f25 = f23 + 0.064f;
                ka5Var.t0 = f25;
                if (f25 > 1.0f) {
                    ka5Var.t0 = 1.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f26 = ka5Var.t0;
        if (this.c0 != null) {
            float f27 = this.h0;
            float f28 = this.e0;
            f12 = (ka5Var.w0 * f28) + ((f11 - f28) * f27);
        } else {
            f12 = ka5Var.w0;
        }
        float f29 = f26 * f12;
        if (f29 > 0.0f) {
            float L7 = hl.L(48.0f);
            float measuredWidth2 = (getMeasuredWidth() - L7) / 2.0f;
            float measuredHeight3 = (getMeasuredHeight() - L7) / 2.0f;
            if (ka5Var.x == vc2Var.z) {
                measuredHeight3 -= L7 / 2.5f;
            }
            RectF rectF2 = hl.P;
            float f30 = measuredHeight3 + L7;
            rectF2.set((int) measuredWidth2, (int) measuredHeight3, (int) (measuredWidth2 + L7), (int) f30);
            if (f29 != 1.0f) {
                canvas.saveLayerAlpha(rectF2, (int) (f29 * f), 31);
            } else {
                canvas.save();
            }
            c43Var.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            c43Var.draw(canvas);
            canvas.restore();
            float f31 = f29 * mb5Var.c;
            if (f31 > 0.0f && ka5Var.x != vc2Var.z) {
                textPaint.setAlpha((int) (f31 * f));
                canvas.drawText(this.r0, (L7 / 2.0f) + (measuredWidth2 - (this.s0 / 2.0f)), f30 + hl.L(16.0f), textPaint);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ka5 ka5Var = this.t0;
        if (ka5Var.j0 && view == ka5Var.a.d) {
            canvas.save();
            float f = ka5Var.e0;
            canvas.scale(f, f, ka5Var.f0, ka5Var.g0);
            canvas.translate(ka5Var.h0, ka5Var.i0);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void e() {
        super.e();
        ka5 ka5Var = this.t0;
        ga5 ga5Var = ka5Var.a;
        ImageView imageView = ka5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            ka5Var.x0.getLayoutParams().width = ga5Var.d.getMeasuredWidth();
            ka5Var.x0.getLayoutParams().height = ga5Var.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ka5 ka5Var = this.t0;
        ka5Var.Q = true;
        ka5Var.invalidate();
        ka5Var.Q = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        wc2 wc2Var;
        ka5 ka5Var = this.t0;
        ga5 ga5Var = ka5Var.a;
        boolean z2 = ka5Var.w;
        gmc gmcVar = this.d;
        if (z2 && ka5Var.R && gmcVar.f != 0 && gmcVar.e != 0) {
            if (ka5Var.h) {
                ga5Var.b0 = (byte) 1;
            } else if (ka5Var.b) {
                ga5Var.b0 = (byte) 1;
            } else if (this.j0.b) {
                ga5Var.b0 = (byte) 0;
            } else if (ka5Var.x.b) {
                ga5Var.b0 = (byte) 1;
            } else {
                ga5Var.b0 = (byte) 2;
            }
            ka5Var.R = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i6 = gmcVar.f;
        if (i6 != 0 && (i5 = gmcVar.e) != 0 && (wc2Var = ka5Var.x) != null) {
            wc2Var.a(i5, i6, this.i0);
        }
    }

    @Override
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
