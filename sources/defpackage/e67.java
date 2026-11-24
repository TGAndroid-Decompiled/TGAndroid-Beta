package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class e67 extends ela {
    public final int[] m0;
    public final int[] n0;
    public int o0;
    public final int[] p0;
    public final in3 q0;
    public final Paint r0;
    public final ylb s0;
    public final j67 t0;

    public e67(j67 j67Var, Context context, ylb ylbVar) {
        super(context, null);
        this.t0 = j67Var;
        this.s0 = ylbVar;
        this.m0 = new int[2];
        this.n0 = new int[2];
        this.o0 = 0;
        this.p0 = new int[2];
        this.q0 = new in3((byte) 7);
        d53 d53Var = d53.f;
        this.r0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        ?? r10;
        int[] iArr;
        char c;
        a67 a67Var;
        rc2 rc2Var;
        float textX;
        float textY;
        char c2;
        TextPaint textPaint;
        float f;
        float height;
        float f2;
        float f3;
        float f4;
        final float f5;
        int i;
        float f6;
        float f7;
        int i2;
        char c3;
        float f8;
        boolean z;
        j67 j67Var = this.t0;
        int[] iArr2 = j67Var.r0;
        Paint paint = j67Var.T;
        float[] fArr = j67Var.s0;
        Rect rect = j67Var.y0;
        f67 f67Var = j67Var.K;
        if (j67Var.w && (rc2Var = j67Var.Q) != null && rc2Var.getCurrentPosition() == null) {
            if (j67Var.x) {
                sy1 sy1Var = j67Var.S;
                if (sy1Var != null) {
                    sy1Var.setAlpha(0.0f);
                } else {
                    yh4 yh4Var = j67Var.m0;
                    if (yh4Var != null) {
                        yh4Var.I(true);
                    }
                }
                j67Var.x = false;
            }
            if (j67Var.Q.getMessageObject() != null && j67Var.Q.getMessageObject().D == 15) {
                textX = j67Var.Q.getPhotoImage().L0;
                textY = j67Var.Q.getPhotoImage().M0;
            } else {
                textX = j67Var.Q.getTextX();
                textY = j67Var.Q.getTextY();
            }
            float x = j67Var.Q.getX() + f67Var.getX() + textX;
            float y = j67Var.Q.getY() + f67Var.getY() + textY;
            float f9 = textX;
            if (j67Var.Q.getMessageObject() != null) {
                k47 messageObject = j67Var.Q.getMessageObject();
                c2 = 3;
                if (messageObject.P1 >= 1 && messageObject.k != null && !messageObject.u2()) {
                    int i3 = messageObject.P1;
                    int i4 = messageObject.Q1;
                    if (i3 == i4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    switch (Math.max(i3, i4)) {
                        case 0:
                        case 1:
                        case 2:
                            TextPaint[] textPaintArr = cmb.x2;
                            if (z) {
                                textPaint = textPaintArr[0];
                                break;
                            } else {
                                textPaint = textPaintArr[2];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = cmb.x2;
                            if (z) {
                                textPaint = textPaintArr2[1];
                                break;
                            } else {
                                textPaint = textPaintArr2[3];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = cmb.x2;
                            if (z) {
                                textPaint = textPaintArr3[2];
                                break;
                            } else {
                                textPaint = textPaintArr3[4];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = cmb.x2;
                            if (z) {
                                textPaint = textPaintArr4[3];
                                break;
                            } else {
                                textPaint = textPaintArr4[5];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = cmb.x2;
                            if (z) {
                                textPaint = textPaintArr5[4];
                                break;
                            } else {
                                textPaint = textPaintArr5[5];
                                break;
                            }
                        default:
                            textPaint = cmb.x2[5];
                            break;
                    }
                } else {
                    textPaint = cmb.n2;
                }
            } else {
                c2 = 3;
                textPaint = cmb.n2;
            }
            float textSize = textPaint.getTextSize();
            sy1 sy1Var2 = j67Var.S;
            if (sy1Var2 != null) {
                int[] iArr3 = this.m0;
                sy1Var2.getLocationOnScreen(iArr3);
                float paddingLeft = j67Var.S.getPaddingLeft() + iArr3[0];
                int i5 = iArr3[1];
                float textSize2 = j67Var.S.getTextSize();
                int i6 = iArr3[1];
                float f10 = i6;
                height = j67Var.S.getMeasuredHeight() + i6;
                float R1 = gm.R1(paddingLeft, x, j67Var.E);
                float R12 = gm.R1((j67Var.S.getPaddingTop() + i5) - j67Var.S.getScrollY(), y, j67Var.E);
                float R13 = gm.R1(textSize2, textSize, j67Var.E);
                f = textY;
                f3 = R12;
                f4 = f10;
                f5 = R13;
                f2 = R1;
            } else {
                yh4 yh4Var2 = j67Var.m0;
                if (yh4Var2 != null) {
                    float[] fArr2 = (float[]) yh4Var2.b;
                    if (((boolean[]) yh4Var2.c)[0] && yh4Var2.a) {
                        f = textY;
                        i = 4;
                    } else {
                        ykc ykcVar = (ykc) ((ry) yh4Var2.d).d;
                        ykcVar.getLocationOnScreen(ykcVar.r3);
                        int[] iArr4 = ykcVar.r3;
                        f = textY;
                        fArr2[0] = iArr4[0] + ykcVar.O2;
                        float f11 = iArr4[1];
                        fArr2[1] = ykcVar.P2 + f11;
                        RectF rectF = ykcVar.j0;
                        fArr2[2] = rectF.top + f11;
                        fArr2[c2] = f11 + rectF.bottom;
                        yh4Var2.a = true;
                        i = 4;
                    }
                    System.arraycopy(fArr2, 0, fArr, 0, i);
                    float textSize3 = ((ykc) ((ry) j67Var.m0.d).d).d.getTextSize();
                    f4 = fArr[2];
                    float f12 = fArr[c2];
                    float R14 = gm.R1(fArr[0], x, j67Var.E);
                    float R15 = gm.R1(fArr[1], y, j67Var.E);
                    height = f12;
                    f2 = R14;
                    f3 = R15;
                    f5 = gm.R1(textSize3, textSize, j67Var.E);
                } else {
                    f = textY;
                    height = getHeight();
                    f2 = x;
                    f3 = y;
                    f4 = 0.0f;
                    f5 = textSize;
                }
            }
            float f13 = j67Var.E;
            if (j67Var.v0 != null) {
                f4 = j67Var.w0;
            }
            float R16 = gm.R1(f4, ((1.0f - f67Var.getScaleY()) * f67Var.getHeight()) + f67Var.getY(), j67Var.E);
            if (f67Var.canScrollVertically(-1)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            float R17 = gm.R1(0.0f, f6, j67Var.E);
            if (j67Var.v0 != null) {
                height = j67Var.x0;
            }
            float R18 = gm.R1(height, f67Var.getY() + f67Var.getHeight(), j67Var.E);
            if (f67Var.canScrollVertically(1)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float R19 = gm.R1(0.0f, f7, j67Var.E);
            iArr = iArr2;
            float f14 = f;
            canvas.saveLayerAlpha(0.0f, R16 + 1.0f, getWidth(), R18 - 1.0f, 255, 31);
            if (j67Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f13) * 255.0f), 31);
                canvas2.translate(f2, f3);
                canvas2.translate((-j67Var.S.getX()) - j67Var.S.getPaddingLeft(), ((-j67Var.S.getY()) - j67Var.S.getPaddingTop()) + j67Var.S.getScrollY());
                float alpha = j67Var.S.getAlpha();
                j67Var.S.setAlpha(1.0f);
                if (j67Var.E < 0.001f) {
                    if (j67Var.V != null) {
                        canvas2.save();
                        canvas2.translate(0.0f, j67Var.S.getY());
                        f8 = alpha;
                        canvas2.saveLayerAlpha(j67Var.S.getX() + j67Var.S.getPaddingLeft(), 0.0f, ((j67Var.S.getX() + j67Var.S.getPaddingLeft()) + j67Var.S.getWidth()) - j67Var.S.getPaddingRight(), j67Var.S.getHeight(), (int) hg9.e(j67Var.E, 0.1f, 1.0f, 255.0f), 31);
                        j67Var.V.a(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        f8 = alpha;
                        paint.setColor(cmb.v0(cmb.Ie, this.s0));
                        paint.setAlpha((int) hg9.e(j67Var.E, 0.1f, 1.0f, paint.getAlpha()));
                        canvas2.drawRect(j67Var.S.getPaddingLeft(), j67Var.S.getY(), ((j67Var.S.getX() + j67Var.S.getPaddingLeft()) + j67Var.S.getWidth()) - j67Var.S.getPaddingRight(), j67Var.S.getY() + j67Var.S.getHeight(), paint);
                    }
                } else {
                    f8 = alpha;
                }
                f fVar = j67Var.U;
                if (fVar != null) {
                    fVar.a(canvas2, new iac() {
                        @Override
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            j67 j67Var2 = e67.this.t0;
                            canvas3.translate(j67Var2.S.getX(), j67Var2.S.getY() - j67Var2.S.getScrollY());
                            float textSize4 = f5 / j67Var2.S.getTextSize();
                            canvas3.scale(textSize4, textSize4, j67Var2.S.getPaddingLeft(), j67Var2.S.getPaddingTop());
                            j67Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                j67Var.S.setAlpha(f8);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                if (j67Var.m0 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f13) * 255.0f), 31);
                    canvas2.translate(f2, f3);
                    float textSize4 = f5 / ((ykc) ((ry) j67Var.m0.d).d).d.getTextSize();
                    canvas2.scale(textSize4, textSize4);
                    yh4 yh4Var3 = j67Var.m0;
                    if (!((boolean[]) yh4Var3.c)[0]) {
                        ykc ykcVar2 = (ykc) ((ry) yh4Var3.d).d;
                        StaticLayout staticLayout = ykcVar2.P0;
                        TextPaint textPaint2 = ykcVar2.d;
                        if (staticLayout != null) {
                            int alpha2 = textPaint2.getAlpha();
                            textPaint2.setAlpha(255);
                            ykcVar2.P0.draw(canvas2);
                            textPaint2.setAlpha(alpha2);
                        }
                    }
                    canvas2.restore();
                }
            }
            r10 = 1;
            j67Var.Q.getTransitionParams().y0 = true;
            rc2 rc2Var2 = j67Var.v0;
            if (rc2Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f13 * 255.0f), 31);
                canvas2.translate(f2, f3);
                canvas2.translate(-f9, -f14);
                float R110 = gm.R1(1.0f, f67Var.getScaleX(), j67Var.E);
                canvas2.scale(R110, R110, (-j67Var.Q.getX()) + f67Var.getWidth(), (-j67Var.Q.getY()) + f67Var.getHeight());
                float f15 = f5 / textSize;
                canvas2.scale(f15, f15, f9, f14);
                if (j67Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, j67Var.Q.getPaddingTop());
                    j67Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                }
                j67Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr5 = this.n0;
                rc2Var2.getLocationInWindow(iArr5);
                if (j67Var.v0.getParent() instanceof View) {
                    i2 = (int) ((View) j67Var.v0.getParent()).getTranslationY();
                } else {
                    i2 = 0;
                }
                int i7 = this.o0;
                int[] iArr6 = this.p0;
                if (i7 > i2 && iArr6[1] - iArr5[1] > i7) {
                    c3 = 0;
                } else {
                    c3 = 0;
                    iArr6[0] = iArr5[0];
                    iArr6[1] = iArr5[1];
                }
                this.o0 = i2;
                float R111 = gm.R1(j67Var.Q.getX() + f67Var.getX(), iArr6[c3], 1.0f - j67Var.E);
                float R112 = gm.R1(j67Var.Q.getY() + f67Var.getY(), iArr6[1], 1.0f - j67Var.E);
                canvas2.save();
                canvas2.translate(R111, R112);
                float R113 = gm.R1(1.0f, f67Var.getScaleX(), j67Var.E);
                canvas2.scale(R113, R113, (-j67Var.Q.getX()) + f67Var.getWidth(), (-j67Var.Q.getY()) + f67Var.getHeight());
                j67Var.Q.getTransitionParams().L1 = 1.0f - j67Var.E;
                j67Var.Q.getTransitionParams().h0 = rect.left * j67Var.E;
                j67Var.Q.getTransitionParams().k0 = rect.top * j67Var.E;
                j67Var.Q.getTransitionParams().i0 = rect.right * j67Var.E;
                yc2 transitionParams = j67Var.Q.getTransitionParams();
                float f16 = j67Var.E;
                transitionParams.j0 = rect.bottom * f16;
                j67Var.Q.setTimeAlpha(1.0f - f16);
                if (j67Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, j67Var.v0.getWidth(), j67Var.v0.getHeight(), (int) (j67Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, j67Var.Q.getPaddingTop());
                    j67Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, j67Var.v0.getWidth(), j67Var.v0.getHeight(), (int) ((1.0f - j67Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, j67Var.v0.getPaddingTop());
                    j67Var.v0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                j67Var.Q.draw(canvas2);
                if (j67Var.Q.getTransitionParams().x0) {
                    j67Var.Q.h1(canvas2, 1.0f);
                    j67Var.Q.A1(1.0f - j67Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF2 = gm.P;
            rectF2.set(0.0f, R16, getWidth(), gm.L(14.0f) + R16);
            in3 in3Var = this.q0;
            in3Var.r(canvas2, rectF2, 1, R17);
            rectF2.set(0.0f, R18 - gm.L(14.0f), getWidth(), R18);
            in3Var.r(canvas2, rectF2, 3, R19);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            r10 = 1;
            iArr = iArr2;
        }
        if (j67Var.w) {
            if (j67Var.y) {
                j67Var.o(r10, 1.0f);
                c = 0;
                j67Var.y = false;
            } else {
                c = 0;
            }
            canvas2.save();
            int i8 = iArr[c];
            int width = j67Var.X.getWidth();
            j67Var.X.getHeight();
            canvas2.translate(gm.R1(gm.L(6.0f) + (i8 - (width - a67Var.m())), j67Var.X.getX(), j67Var.E), gm.R1(iArr[r10], j67Var.X.getY(), j67Var.E));
            if (j67Var.s && j67Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, j67Var.X.getWidth(), j67Var.X.getHeight(), (int) (j67Var.E * 255.0f), 31);
            }
            j67Var.X.draw(canvas2);
            if (j67Var.s && j67Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (j67Var.l0 != null) {
            if (j67Var.J == null) {
                j67Var.J = new tm(gm.L(24.0f), 23, this, false);
            }
            Rect rect2 = gm.Q;
            rect2.set((int) ((j67Var.l0.right - gm.L(12.0f)) - gm.L(24.0f)), (int) ((j67Var.l0.bottom - gm.L(12.0f)) - gm.L(24.0f)), (int) (j67Var.l0.right - gm.L(12.0f)), (int) (j67Var.l0.bottom - gm.L(12.0f)));
            RectF rectF3 = gm.P;
            rectF3.set(rect2);
            rectF3.inset(-gm.L(12.0f), -gm.L(6.0f));
            float height2 = rectF3.height() / 2.0f;
            Paint paint2 = this.r0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (j67Var.J.e() * 30.0f * j67Var.E));
            canvas2.drawRoundRect(rectF3, height2, height2, paint2);
            j67Var.J.setBounds(rect2);
            tm tmVar = j67Var.J;
            tmVar.w = (int) (j67Var.E * 255.0f);
            tmVar.draw(canvas2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j67 j67Var = this.t0;
        if (j67Var.w) {
            if (view != j67Var.X) {
                rc2 rc2Var = j67Var.Q;
                if (view == rc2Var && rc2Var != null && rc2Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }
}
