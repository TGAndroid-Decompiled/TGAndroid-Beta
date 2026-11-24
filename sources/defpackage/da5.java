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
public final class da5 extends akc {
    public float h0;
    public final qd2 i0;
    public final jb5 j0;
    public final TextPaint k0;
    public final StaticLayout l0;
    public final TextPaint m0;
    public final String n0;
    public final float o0;
    public final StaticLayout p0;
    public final g95 q0;
    public final String r0;
    public final float s0;
    public final ha5 t0;

    public da5(ha5 ha5Var, Context context, qd2 qd2Var, jb5 jb5Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f, StaticLayout staticLayout2, g95 g95Var, String str2, float f2) {
        super(context, false, false, true, true);
        this.t0 = ha5Var;
        this.i0 = qd2Var;
        this.j0 = jb5Var;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f;
        this.p0 = staticLayout2;
        this.q0 = g95Var;
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
        rd2 rd2Var;
        invalidate();
        ha5 ha5Var = this.t0;
        boolean z = ha5Var.s0;
        zjc zjcVar = this.d;
        if (!z && zjcVar.getAlpha() != 1.0f) {
            zjcVar.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = ha5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            int i2 = (ha5Var.x0.getAlpha() > 1.0f ? 1 : (ha5Var.x0.getAlpha() == 1.0f ? 0 : -1));
            ImageView imageView2 = ha5Var.x0;
            if (i2 == 0) {
                imageView2.animate().alpha(0.0f).setDuration(300L).setListener(new v85(this, (byte) 1)).start();
            } else if (imageView2.getParent() != null) {
                ha5Var.a.removeView(ha5Var.x0);
            }
        }
        int i3 = zjcVar.rotatedFrameHeight;
        if (i3 != 0 && (i = zjcVar.rotatedFrameWidth) != 0 && (rd2Var = ha5Var.x) != null) {
            rd2Var.a(i, i3, this.i0);
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
        ha5 ha5Var = this.t0;
        v43 v43Var = ha5Var.u0;
        Drawable drawable = ha5Var.v0;
        da5 da5Var = ha5Var.a;
        ImageReceiver imageReceiver = ha5Var.l0;
        ey0 ey0Var = ha5Var.O;
        zjc zjcVar = this.d;
        boolean isFirstFrameRendered = zjcVar.isFirstFrameRendered();
        TextPaint textPaint = this.k0;
        qd2 qd2Var = this.i0;
        jb5 jb5Var = this.j0;
        if (isFirstFrameRendered && ((zjcVar.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) && !ha5Var.s0)) {
            f = 255.0f;
        } else {
            float f13 = ha5Var.k0;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.10666667f;
                ha5Var.k0 = f14;
                if (f14 > 1.0f) {
                    ha5Var.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (ha5Var.q0 != null) {
                canvas.save();
                float f15 = this.a0;
                canvas.scale(f15, f15, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (ha5Var.r0 == null) {
                    Paint paint = new Paint(1);
                    ha5Var.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f = 255.0f;
                canvas.drawBitmap(ha5Var.q0, (getMeasuredWidth() - ha5Var.q0.getWidth()) / 2.0f, (getMeasuredHeight() - ha5Var.q0.getHeight()) / 2.0f, ha5Var.r0);
                canvas.restore();
                f2 = 0.0f;
            } else {
                f = 255.0f;
                f2 = 0.0f;
                imageReceiver.i0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(ha5Var.k0);
                imageReceiver.h(canvas, null);
            }
            rd2 rd2Var = ha5Var.x;
            if (rd2Var == qd2Var.z) {
                if (ha5Var.b || !jb5Var.b) {
                    float L = gm.L(48.0f);
                    textPaint.setAlpha(255);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (gm.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + gm.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (ey0Var.getVisibility() != 4) {
                    ey0Var.setVisibility(4);
                }
            } else if (rd2Var.b && rd2Var.a.self) {
                if (ey0Var.getVisibility() != 0) {
                    ey0Var.setVisibility(0);
                    ey0Var.setScaleX(1.0f);
                    ey0Var.setScaleY(1.0f);
                }
                if (ha5Var.y0) {
                    f3 = f2;
                } else {
                    f3 = jb5Var.c;
                }
                int L2 = gm.L(33.0f);
                if (!ha5Var.r && !ha5Var.b) {
                    float f16 = L2;
                    float L3 = gm.L(10.0f);
                    float f17 = 1.0f - jb5Var.c;
                    f4 = 400.0f;
                    if (!ha5Var.h && !ha5Var.f) {
                        f9 = f2;
                    } else {
                        f9 = jb5Var.n;
                    }
                    i2 = (int) ((Math.max(f17, f9) * L3) + f16);
                } else {
                    f4 = 400.0f;
                    i2 = (int) ts2.i(gm.L(39.0f), jb5Var.c, gm.L(10.0f), L2);
                }
                int measuredWidth = (getMeasuredWidth() - i2) / 2;
                boolean z = ha5Var.h;
                if (!z && !ha5Var.f) {
                    f5 = f2;
                } else {
                    f5 = jb5Var.n;
                }
                if (ha5Var.b) {
                    f6 = f3;
                } else {
                    if (ha5Var.r) {
                        f3 = jb5Var.c;
                    } else {
                        f3 = f5;
                    }
                    if (!z && !ha5Var.f) {
                        f6 = jb5Var.c;
                    } else {
                        f6 = jb5Var.n;
                    }
                }
                float measuredHeight = ((getMeasuredHeight() - i2) / 2) - gm.L(28.0f);
                float f18 = f3;
                float L4 = gm.L(17.0f);
                float L5 = gm.L(74.0f);
                if (!ha5Var.b && !ha5Var.r) {
                    f7 = f2;
                } else {
                    f7 = jb5Var.c;
                }
                int L6 = (int) ((gm.L(17.0f) * f6) + (measuredHeight - (((f7 * L5) + L4) * f18)));
                int i4 = L6 + i2;
                drawable.setBounds(measuredWidth, L6, measuredWidth + i2, i4);
                drawable.draw(canvas);
                float f19 = jb5Var.c;
                if (f19 <= f2 && f5 <= f2) {
                    ey0Var.setAlpha(f2);
                    i3 = i4;
                } else {
                    float max = Math.max(f19, f5) * f18;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * f));
                    if (!ha5Var.r && !ha5Var.b) {
                        ey0Var.setAlpha(0.0f);
                    } else {
                        ey0Var.setAlpha((1.0f - f5) * max);
                    }
                    i3 = i4;
                    canvas.drawText(this.n0, (i2 / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), gm.L(32.0f) + i4, textPaint2);
                }
                ey0Var.setTranslationY(((gm.L(72.0f) + i3) + ha5Var.p0) - this.O);
                ey0Var.setTranslationX(((getMeasuredWidth() - ey0Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (jb5Var.c < 1.0f && f5 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(f8, f5)) * 255.0d));
                    canvas.save();
                    canvas.translate((i2 / 2.0f) + (measuredWidth - (gm.L(f4) / 2.0f)), gm.L(10.0f) + i3);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                if (ey0Var.getVisibility() != 4) {
                    ey0Var.setVisibility(4);
                }
                ef1 ef1Var = this.q0.j4;
                Paint paint2 = ef1Var.c;
                Matrix matrix = ef1Var.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j = ef1Var.h;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 10) {
                        float f20 = (((float) j2) / 500.0f) + ef1Var.g;
                        ef1Var.g = f20;
                        if (f20 > 4.0f) {
                            ef1Var.g = 0.0f;
                            q78 q78Var = ef1Var.p;
                            if (q78Var != null) {
                                q78Var.run();
                            }
                        }
                        ef1Var.h = currentTimeMillis;
                    }
                } else {
                    ef1Var.h = currentTimeMillis;
                }
                float f21 = ef1Var.g;
                if (f21 <= 1.0f) {
                    int i5 = ef1Var.f;
                    matrix.setTranslate((((i5 + (i << 1)) * f21) - ef1Var.e) - ha5Var.getX(), 0.0f);
                    ef1Var.b.setLocalMatrix(matrix);
                    ef1Var.d.setLocalMatrix(matrix);
                    RectF rectF = gm.P;
                    rectF.set(da5Var.P, da5Var.O, da5Var.getMeasuredWidth() - da5Var.P, da5Var.getMeasuredHeight() - da5Var.O);
                    canvas.drawRect(rectF, ef1Var.a);
                    if (ef1Var.k) {
                        if (ef1Var.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f22 = da5Var.b;
                        canvas.drawRoundRect(rectF, f22, f22, paint2);
                    }
                }
            }
            invalidate();
        }
        ImageView imageView = ha5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            ha5Var.x0.setScaleX(da5Var.d.getScaleX());
            ha5Var.x0.setScaleY(da5Var.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight2 = (getMeasuredHeight() - this.O) - gm.L(80.0f);
        if (ha5Var.x != qd2Var.z) {
            canvas.save();
            if ((ha5Var.b || ha5Var.r) && !g95.u5 && !g95.v5) {
                measuredHeight2 = kt6.B(1.0f, jb5Var.a0, gm.L(90.0f) * jb5Var.c, measuredHeight2);
            }
            f10 = 0.0f;
            canvas.translate(0.0f, measuredHeight2);
            canvas.drawPaint(ha5Var.E);
            canvas.restore();
        } else {
            f10 = 0.0f;
        }
        boolean z2 = ha5Var.s0;
        float f23 = ha5Var.t0;
        if (!z2) {
            if (f23 != f10) {
                if (f23 != f10) {
                    float f24 = f23 - 0.064f;
                    ha5Var.t0 = f24;
                    if (f24 < f10) {
                        ha5Var.t0 = f10;
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
                ha5Var.t0 = f25;
                if (f25 > 1.0f) {
                    ha5Var.t0 = 1.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f26 = ha5Var.t0;
        if (this.c0 != null) {
            float f27 = this.h0;
            float f28 = this.e0;
            f12 = (ha5Var.w0 * f28) + ((f11 - f28) * f27);
        } else {
            f12 = ha5Var.w0;
        }
        float f29 = f26 * f12;
        if (f29 > 0.0f) {
            float L7 = gm.L(48.0f);
            float measuredWidth2 = (getMeasuredWidth() - L7) / 2.0f;
            float measuredHeight3 = (getMeasuredHeight() - L7) / 2.0f;
            if (ha5Var.x == qd2Var.z) {
                measuredHeight3 -= L7 / 2.5f;
            }
            RectF rectF2 = gm.P;
            float f30 = measuredHeight3 + L7;
            rectF2.set((int) measuredWidth2, (int) measuredHeight3, (int) (measuredWidth2 + L7), (int) f30);
            if (f29 != 1.0f) {
                canvas.saveLayerAlpha(rectF2, (int) (f29 * f), 31);
            } else {
                canvas.save();
            }
            v43Var.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            v43Var.draw(canvas);
            canvas.restore();
            float f31 = f29 * jb5Var.c;
            if (f31 > 0.0f && ha5Var.x != qd2Var.z) {
                textPaint.setAlpha((int) (f31 * f));
                canvas.drawText(this.r0, (L7 / 2.0f) + (measuredWidth2 - (this.s0 / 2.0f)), f30 + gm.L(16.0f), textPaint);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ha5 ha5Var = this.t0;
        if (ha5Var.j0 && view == ha5Var.a.d) {
            canvas.save();
            float f = ha5Var.e0;
            canvas.scale(f, f, ha5Var.f0, ha5Var.g0);
            canvas.translate(ha5Var.h0, ha5Var.i0);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void e() {
        super.e();
        ha5 ha5Var = this.t0;
        da5 da5Var = ha5Var.a;
        ImageView imageView = ha5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            ha5Var.x0.getLayoutParams().width = da5Var.d.getMeasuredWidth();
            ha5Var.x0.getLayoutParams().height = da5Var.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ha5 ha5Var = this.t0;
        ha5Var.Q = true;
        ha5Var.invalidate();
        ha5Var.Q = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        rd2 rd2Var;
        ha5 ha5Var = this.t0;
        da5 da5Var = ha5Var.a;
        boolean z2 = ha5Var.w;
        zjc zjcVar = this.d;
        if (z2 && ha5Var.R && zjcVar.rotatedFrameHeight != 0 && zjcVar.rotatedFrameWidth != 0) {
            if (ha5Var.h) {
                da5Var.b0 = (byte) 1;
            } else if (ha5Var.b) {
                da5Var.b0 = (byte) 1;
            } else if (this.j0.b) {
                da5Var.b0 = (byte) 0;
            } else if (ha5Var.x.b) {
                da5Var.b0 = (byte) 1;
            } else {
                da5Var.b0 = (byte) 2;
            }
            ha5Var.R = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i6 = zjcVar.rotatedFrameHeight;
        if (i6 != 0 && (i5 = zjcVar.rotatedFrameWidth) != 0 && (rd2Var = ha5Var.x) != null) {
            rd2Var.a(i5, i6, this.i0);
        }
    }

    @Override
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
