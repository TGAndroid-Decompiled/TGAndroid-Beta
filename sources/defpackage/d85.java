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
public final class d85 extends aic {
    public float h0;
    public final fc2 i0;
    public final l95 j0;
    public final TextPaint k0;
    public final StaticLayout l0;
    public final TextPaint m0;
    public final String n0;
    public final float o0;
    public final StaticLayout p0;
    public final h75 q0;
    public final String r0;
    public final float s0;
    public final h85 t0;

    public d85(h85 h85Var, Context context, fc2 fc2Var, l95 l95Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f, StaticLayout staticLayout2, h75 h75Var, String str2, float f2) {
        super(context, false, false, true, true);
        this.t0 = h85Var;
        this.i0 = fc2Var;
        this.j0 = l95Var;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f;
        this.p0 = staticLayout2;
        this.q0 = h75Var;
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
        gc2 gc2Var;
        invalidate();
        h85 h85Var = this.t0;
        boolean z = h85Var.s0;
        zhc zhcVar = this.d;
        if (!z && zhcVar.getAlpha() != 1.0f) {
            zhcVar.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = h85Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            int i2 = (h85Var.x0.getAlpha() > 1.0f ? 1 : (h85Var.x0.getAlpha() == 1.0f ? 0 : -1));
            ImageView imageView2 = h85Var.x0;
            if (i2 == 0) {
                imageView2.animate().alpha(0.0f).setDuration(300L).setListener(new im2(this, (byte) 29)).start();
            } else if (imageView2.getParent() != null) {
                h85Var.a.removeView(h85Var.x0);
            }
        }
        int i3 = zhcVar.rotatedFrameHeight;
        if (i3 != 0 && (i = zhcVar.rotatedFrameWidth) != 0 && (gc2Var = h85Var.x) != null) {
            gc2Var.a(i, i3, this.i0);
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
        h85 h85Var = this.t0;
        k33 k33Var = h85Var.u0;
        Drawable drawable = h85Var.v0;
        d85 d85Var = h85Var.a;
        ImageReceiver imageReceiver = h85Var.l0;
        xw0 xw0Var = h85Var.O;
        zhc zhcVar = this.d;
        boolean isFirstFrameRendered = zhcVar.isFirstFrameRendered();
        TextPaint textPaint = this.k0;
        fc2 fc2Var = this.i0;
        l95 l95Var = this.j0;
        if (isFirstFrameRendered && ((zhcVar.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) && !h85Var.s0)) {
            f = 255.0f;
        } else {
            float f13 = h85Var.k0;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.10666667f;
                h85Var.k0 = f14;
                if (f14 > 1.0f) {
                    h85Var.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (h85Var.q0 != null) {
                canvas.save();
                float f15 = this.a0;
                canvas.scale(f15, f15, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (h85Var.r0 == null) {
                    Paint paint = new Paint(1);
                    h85Var.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f = 255.0f;
                canvas.drawBitmap(h85Var.q0, (getMeasuredWidth() - h85Var.q0.getWidth()) / 2.0f, (getMeasuredHeight() - h85Var.q0.getHeight()) / 2.0f, h85Var.r0);
                canvas.restore();
                f2 = 0.0f;
            } else {
                f = 255.0f;
                f2 = 0.0f;
                imageReceiver.i0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(h85Var.k0);
                imageReceiver.h(canvas, null);
            }
            gc2 gc2Var = h85Var.x;
            if (gc2Var == fc2Var.z) {
                if (h85Var.b || !l95Var.b) {
                    float L = gl.L(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (gl.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + gl.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (xw0Var.getVisibility() != 4) {
                    xw0Var.setVisibility(4);
                }
            } else if (gc2Var.b && gc2Var.a.self) {
                if (xw0Var.getVisibility() != 0) {
                    xw0Var.setVisibility(0);
                    xw0Var.setScaleX(1.0f);
                    xw0Var.setScaleY(1.0f);
                }
                if (h85Var.y0) {
                    f3 = f2;
                } else {
                    f3 = l95Var.c;
                }
                int L2 = gl.L(33.0f);
                if (!h85Var.r && !h85Var.b) {
                    float f16 = L2;
                    float L3 = gl.L(10.0f);
                    float f17 = 1.0f - l95Var.c;
                    f4 = 400.0f;
                    if (!h85Var.h && !h85Var.f) {
                        f9 = f2;
                    } else {
                        f9 = l95Var.n;
                    }
                    i2 = (int) ((Math.max(f17, f9) * L3) + f16);
                } else {
                    f4 = 400.0f;
                    i2 = (int) ir2.i(gl.L(39.0f), l95Var.c, gl.L(10.0f), L2);
                }
                int measuredWidth = (getMeasuredWidth() - i2) / 2;
                boolean z = h85Var.h;
                if (!z && !h85Var.f) {
                    f5 = f2;
                } else {
                    f5 = l95Var.n;
                }
                if (h85Var.b) {
                    f6 = f3;
                } else {
                    if (h85Var.r) {
                        f3 = l95Var.c;
                    } else {
                        f3 = f5;
                    }
                    if (!z && !h85Var.f) {
                        f6 = l95Var.c;
                    } else {
                        f6 = l95Var.n;
                    }
                }
                float measuredHeight = ((getMeasuredHeight() - i2) / 2) - gl.L(28.0f);
                float f18 = f3;
                float L4 = gl.L(17.0f);
                float L5 = gl.L(74.0f);
                if (!h85Var.b && !h85Var.r) {
                    f7 = f2;
                } else {
                    f7 = l95Var.c;
                }
                int L6 = (int) ((gl.L(17.0f) * f6) + (measuredHeight - (((f7 * L5) + L4) * f18)));
                int i4 = L6 + i2;
                drawable.setBounds(measuredWidth, L6, measuredWidth + i2, i4);
                drawable.draw(canvas);
                float f19 = l95Var.c;
                if (f19 <= f2 && f5 <= f2) {
                    xw0Var.setAlpha(f2);
                    i3 = i4;
                } else {
                    float max = Math.max(f19, f5) * f18;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * f));
                    if (!h85Var.r && !h85Var.b) {
                        xw0Var.setAlpha(0.0f);
                    } else {
                        xw0Var.setAlpha((1.0f - f5) * max);
                    }
                    i3 = i4;
                    canvas.drawText(this.n0, (i2 / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), gl.L(32.0f) + i4, textPaint2);
                }
                xw0Var.setTranslationY(((gl.L(72.0f) + i3) + h85Var.p0) - this.O);
                xw0Var.setTranslationX(((getMeasuredWidth() - xw0Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (l95Var.c < 1.0f && f5 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(f8, f5)) * 255.0d));
                    canvas.save();
                    canvas.translate((i2 / 2.0f) + (measuredWidth - (gl.L(f4) / 2.0f)), gl.L(10.0f) + i3);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                if (xw0Var.getVisibility() != 4) {
                    xw0Var.setVisibility(4);
                }
                wd1 wd1Var = this.q0.j4;
                Paint paint2 = wd1Var.c;
                Matrix matrix = wd1Var.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j = wd1Var.h;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 10) {
                        float f20 = (((float) j2) / 500.0f) + wd1Var.g;
                        wd1Var.g = f20;
                        if (f20 > 4.0f) {
                            wd1Var.g = 0.0f;
                            w88 w88Var = wd1Var.p;
                            if (w88Var != null) {
                                w88Var.run();
                            }
                        }
                        wd1Var.h = currentTimeMillis;
                    }
                } else {
                    wd1Var.h = currentTimeMillis;
                }
                float f21 = wd1Var.g;
                if (f21 <= 1.0f) {
                    int i5 = wd1Var.f;
                    matrix.setTranslate((((i5 + (i << 1)) * f21) - wd1Var.e) - h85Var.getX(), 0.0f);
                    wd1Var.b.setLocalMatrix(matrix);
                    wd1Var.d.setLocalMatrix(matrix);
                    RectF rectF = gl.P;
                    rectF.set(d85Var.P, d85Var.O, d85Var.getMeasuredWidth() - d85Var.P, d85Var.getMeasuredHeight() - d85Var.O);
                    canvas.drawRect(rectF, wd1Var.a);
                    if (wd1Var.k) {
                        if (wd1Var.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f22 = d85Var.b;
                        canvas.drawRoundRect(rectF, f22, f22, paint2);
                    }
                }
            }
            invalidate();
        }
        ImageView imageView = h85Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            h85Var.x0.setScaleX(d85Var.d.getScaleX());
            h85Var.x0.setScaleY(d85Var.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight2 = (getMeasuredHeight() - this.O) - gl.L(80.0f);
        if (h85Var.x != fc2Var.z) {
            canvas.save();
            if ((h85Var.b || h85Var.r) && !h75.u5 && !h75.v5) {
                measuredHeight2 = ls6.B(1.0f, l95Var.a0, gl.L(90.0f) * l95Var.c, measuredHeight2);
            }
            f10 = 0.0f;
            canvas.translate(0.0f, measuredHeight2);
            canvas.drawPaint(h85Var.E);
            canvas.restore();
        } else {
            f10 = 0.0f;
        }
        boolean z2 = h85Var.s0;
        float f23 = h85Var.t0;
        if (!z2) {
            if (f23 != f10) {
                if (f23 != f10) {
                    float f24 = f23 - 0.064f;
                    h85Var.t0 = f24;
                    if (f24 < f10) {
                        h85Var.t0 = f10;
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
                h85Var.t0 = f25;
                if (f25 > 1.0f) {
                    h85Var.t0 = 1.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f26 = h85Var.t0;
        if (this.c0 != null) {
            float f27 = this.h0;
            float f28 = this.e0;
            f12 = (h85Var.w0 * f28) + ((f11 - f28) * f27);
        } else {
            f12 = h85Var.w0;
        }
        float f29 = f26 * f12;
        if (f29 > 0.0f) {
            float L7 = gl.L(48.0f);
            float measuredWidth2 = (getMeasuredWidth() - L7) / 2.0f;
            float measuredHeight3 = (getMeasuredHeight() - L7) / 2.0f;
            if (h85Var.x == fc2Var.z) {
                measuredHeight3 -= L7 / 2.5f;
            }
            RectF rectF2 = gl.P;
            float f30 = measuredHeight3 + L7;
            rectF2.set((int) measuredWidth2, (int) measuredHeight3, (int) (measuredWidth2 + L7), (int) f30);
            if (f29 != 1.0f) {
                canvas.saveLayerAlpha(rectF2, (int) (f29 * f), 31);
            } else {
                canvas.save();
            }
            k33Var.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            k33Var.draw(canvas);
            canvas.restore();
            float f31 = f29 * l95Var.c;
            if (f31 > 0.0f && h85Var.x != fc2Var.z) {
                textPaint.setAlpha((int) (f31 * f));
                canvas.drawText(this.r0, (L7 / 2.0f) + (measuredWidth2 - (this.s0 / 2.0f)), f30 + gl.L(16.0f), textPaint);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h85 h85Var = this.t0;
        if (h85Var.j0 && view == h85Var.a.d) {
            canvas.save();
            float f = h85Var.e0;
            canvas.scale(f, f, h85Var.f0, h85Var.g0);
            canvas.translate(h85Var.h0, h85Var.i0);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void e() {
        super.e();
        h85 h85Var = this.t0;
        d85 d85Var = h85Var.a;
        ImageView imageView = h85Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            h85Var.x0.getLayoutParams().width = d85Var.d.getMeasuredWidth();
            h85Var.x0.getLayoutParams().height = d85Var.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        h85 h85Var = this.t0;
        h85Var.Q = true;
        h85Var.invalidate();
        h85Var.Q = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        gc2 gc2Var;
        h85 h85Var = this.t0;
        d85 d85Var = h85Var.a;
        boolean z2 = h85Var.w;
        zhc zhcVar = this.d;
        if (z2 && h85Var.R && zhcVar.rotatedFrameHeight != 0 && zhcVar.rotatedFrameWidth != 0) {
            if (h85Var.h) {
                d85Var.b0 = (byte) 1;
            } else if (h85Var.b) {
                d85Var.b0 = (byte) 1;
            } else if (this.j0.b) {
                d85Var.b0 = (byte) 0;
            } else if (h85Var.x.b) {
                d85Var.b0 = (byte) 1;
            } else {
                d85Var.b0 = (byte) 2;
            }
            h85Var.R = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i6 = zhcVar.rotatedFrameHeight;
        if (i6 != 0 && (i5 = zhcVar.rotatedFrameWidth) != 0 && (gc2Var = h85Var.x) != null) {
            gc2Var.a(i5, i6, this.i0);
        }
    }

    @Override
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
