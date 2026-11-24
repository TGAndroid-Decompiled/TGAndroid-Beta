package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class e47 extends cja {
    public final int[] m0;
    public final int[] n0;
    public int o0;
    public final int[] p0;
    public final xl3 q0;
    public final Paint r0;
    public final wjb s0;
    public final j47 t0;

    public e47(j47 j47Var, Context context, wjb wjbVar) {
        super(context, null);
        this.t0 = j47Var;
        this.s0 = wjbVar;
        this.m0 = new int[2];
        this.n0 = new int[2];
        this.o0 = 0;
        this.p0 = new int[2];
        this.q0 = new xl3((byte) 7);
        s33 s33Var = s33.f;
        this.r0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        ?? r10;
        int[] iArr;
        char c;
        a47 a47Var;
        gb2 gb2Var;
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
        j47 j47Var = this.t0;
        int[] iArr2 = j47Var.r0;
        Paint paint = j47Var.T;
        float[] fArr = j47Var.s0;
        Rect rect = j47Var.y0;
        f47 f47Var = j47Var.K;
        if (j47Var.w && (gb2Var = j47Var.Q) != null && gb2Var.getCurrentPosition() == null) {
            if (j47Var.x) {
                ex1 ex1Var = j47Var.S;
                if (ex1Var != null) {
                    ex1Var.setAlpha(0.0f);
                } else {
                    xf4 xf4Var = j47Var.m0;
                    if (xf4Var != null) {
                        xf4Var.I(true);
                    }
                }
                j47Var.x = false;
            }
            if (j47Var.Q.getMessageObject() != null && j47Var.Q.getMessageObject().D == 15) {
                textX = j47Var.Q.getPhotoImage().L0;
                textY = j47Var.Q.getPhotoImage().M0;
            } else {
                textX = j47Var.Q.getTextX();
                textY = j47Var.Q.getTextY();
            }
            float x = j47Var.Q.getX() + f47Var.getX() + textX;
            float y = j47Var.Q.getY() + f47Var.getY() + textY;
            float f9 = textX;
            if (j47Var.Q.getMessageObject() != null) {
                k27 messageObject = j47Var.Q.getMessageObject();
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
                            TextPaint[] textPaintArr = bkb.x2;
                            if (z) {
                                textPaint = textPaintArr[0];
                                break;
                            } else {
                                textPaint = textPaintArr[2];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = bkb.x2;
                            if (z) {
                                textPaint = textPaintArr2[1];
                                break;
                            } else {
                                textPaint = textPaintArr2[3];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = bkb.x2;
                            if (z) {
                                textPaint = textPaintArr3[2];
                                break;
                            } else {
                                textPaint = textPaintArr3[4];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = bkb.x2;
                            if (z) {
                                textPaint = textPaintArr4[3];
                                break;
                            } else {
                                textPaint = textPaintArr4[5];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = bkb.x2;
                            if (z) {
                                textPaint = textPaintArr5[4];
                                break;
                            } else {
                                textPaint = textPaintArr5[5];
                                break;
                            }
                        default:
                            textPaint = bkb.x2[5];
                            break;
                    }
                } else {
                    textPaint = bkb.n2;
                }
            } else {
                c2 = 3;
                textPaint = bkb.n2;
            }
            float textSize = textPaint.getTextSize();
            ex1 ex1Var2 = j47Var.S;
            if (ex1Var2 != null) {
                int[] iArr3 = this.m0;
                ex1Var2.getLocationOnScreen(iArr3);
                float paddingLeft = j47Var.S.getPaddingLeft() + iArr3[0];
                int i5 = iArr3[1];
                float textSize2 = j47Var.S.getTextSize();
                int i6 = iArr3[1];
                float f10 = i6;
                height = j47Var.S.getMeasuredHeight() + i6;
                float R1 = gl.R1(paddingLeft, x, j47Var.E);
                float R12 = gl.R1((j47Var.S.getPaddingTop() + i5) - j47Var.S.getScrollY(), y, j47Var.E);
                float R13 = gl.R1(textSize2, textSize, j47Var.E);
                f = textY;
                f3 = R12;
                f4 = f10;
                f5 = R13;
                f2 = R1;
            } else {
                xf4 xf4Var2 = j47Var.m0;
                if (xf4Var2 != null) {
                    float[] fArr2 = (float[]) xf4Var2.b;
                    if (((boolean[]) xf4Var2.c)[0] && xf4Var2.a) {
                        f = textY;
                        i = 4;
                    } else {
                        yic yicVar = (yic) ((qx) xf4Var2.d).d;
                        yicVar.getLocationOnScreen(yicVar.r3);
                        int[] iArr4 = yicVar.r3;
                        f = textY;
                        fArr2[0] = iArr4[0] + yicVar.O2;
                        float f11 = iArr4[1];
                        fArr2[1] = yicVar.P2 + f11;
                        RectF rectF = yicVar.j0;
                        fArr2[2] = rectF.top + f11;
                        fArr2[c2] = f11 + rectF.bottom;
                        xf4Var2.a = true;
                        i = 4;
                    }
                    System.arraycopy(fArr2, 0, fArr, 0, i);
                    float textSize3 = ((yic) ((qx) j47Var.m0.d).d).d.getTextSize();
                    f4 = fArr[2];
                    float f12 = fArr[c2];
                    float R14 = gl.R1(fArr[0], x, j47Var.E);
                    float R15 = gl.R1(fArr[1], y, j47Var.E);
                    height = f12;
                    f2 = R14;
                    f3 = R15;
                    f5 = gl.R1(textSize3, textSize, j47Var.E);
                } else {
                    f = textY;
                    height = getHeight();
                    f2 = x;
                    f3 = y;
                    f4 = 0.0f;
                    f5 = textSize;
                }
            }
            float f13 = j47Var.E;
            if (j47Var.v0 != null) {
                f4 = j47Var.w0;
            }
            float R16 = gl.R1(f4, ((1.0f - f47Var.getScaleY()) * f47Var.getHeight()) + f47Var.getY(), j47Var.E);
            if (f47Var.canScrollVertically(-1)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            float R17 = gl.R1(0.0f, f6, j47Var.E);
            if (j47Var.v0 != null) {
                height = j47Var.x0;
            }
            float R18 = gl.R1(height, f47Var.getY() + f47Var.getHeight(), j47Var.E);
            if (f47Var.canScrollVertically(1)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float R19 = gl.R1(0.0f, f7, j47Var.E);
            iArr = iArr2;
            float f14 = f;
            canvas.saveLayerAlpha(0.0f, R16 + 1.0f, getWidth(), R18 - 1.0f, 255, 31);
            if (j47Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f13) * 255.0f), 31);
                canvas2.translate(f2, f3);
                canvas2.translate((-j47Var.S.getX()) - j47Var.S.getPaddingLeft(), ((-j47Var.S.getY()) - j47Var.S.getPaddingTop()) + j47Var.S.getScrollY());
                float alpha = j47Var.S.getAlpha();
                j47Var.S.setAlpha(1.0f);
                if (j47Var.E < 0.001f) {
                    if (j47Var.V != null) {
                        canvas2.save();
                        canvas2.translate(0.0f, j47Var.S.getY());
                        f8 = alpha;
                        canvas2.saveLayerAlpha(j47Var.S.getX() + j47Var.S.getPaddingLeft(), 0.0f, ((j47Var.S.getX() + j47Var.S.getPaddingLeft()) + j47Var.S.getWidth()) - j47Var.S.getPaddingRight(), j47Var.S.getHeight(), (int) de9.e(j47Var.E, 0.1f, 1.0f, 255.0f), 31);
                        j47Var.V.a(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        f8 = alpha;
                        paint.setColor(bkb.v0(bkb.Ie, this.s0));
                        paint.setAlpha((int) de9.e(j47Var.E, 0.1f, 1.0f, paint.getAlpha()));
                        canvas2.drawRect(j47Var.S.getPaddingLeft(), j47Var.S.getY(), ((j47Var.S.getX() + j47Var.S.getPaddingLeft()) + j47Var.S.getWidth()) - j47Var.S.getPaddingRight(), j47Var.S.getY() + j47Var.S.getHeight(), paint);
                    }
                } else {
                    f8 = alpha;
                }
                f fVar = j47Var.U;
                if (fVar != null) {
                    fVar.a(canvas2, new h8c() {
                        @Override
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            j47 j47Var2 = e47.this.t0;
                            canvas3.translate(j47Var2.S.getX(), j47Var2.S.getY() - j47Var2.S.getScrollY());
                            float textSize4 = f5 / j47Var2.S.getTextSize();
                            canvas3.scale(textSize4, textSize4, j47Var2.S.getPaddingLeft(), j47Var2.S.getPaddingTop());
                            j47Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                j47Var.S.setAlpha(f8);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                if (j47Var.m0 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f13) * 255.0f), 31);
                    canvas2.translate(f2, f3);
                    float textSize4 = f5 / ((yic) ((qx) j47Var.m0.d).d).d.getTextSize();
                    canvas2.scale(textSize4, textSize4);
                    xf4 xf4Var3 = j47Var.m0;
                    if (!((boolean[]) xf4Var3.c)[0]) {
                        yic yicVar2 = (yic) ((qx) xf4Var3.d).d;
                        StaticLayout staticLayout = yicVar2.P0;
                        TextPaint textPaint2 = yicVar2.d;
                        if (staticLayout != null) {
                            int alpha2 = textPaint2.getAlpha();
                            textPaint2.setAlpha(255);
                            yicVar2.P0.draw(canvas2);
                            textPaint2.setAlpha(alpha2);
                        }
                    }
                    canvas2.restore();
                }
            }
            r10 = 1;
            j47Var.Q.getTransitionParams().y0 = true;
            gb2 gb2Var2 = j47Var.v0;
            if (gb2Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f13 * 255.0f), 31);
                canvas2.translate(f2, f3);
                canvas2.translate(-f9, -f14);
                float R110 = gl.R1(1.0f, f47Var.getScaleX(), j47Var.E);
                canvas2.scale(R110, R110, (-j47Var.Q.getX()) + f47Var.getWidth(), (-j47Var.Q.getY()) + f47Var.getHeight());
                float f15 = f5 / textSize;
                canvas2.scale(f15, f15, f9, f14);
                if (j47Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, j47Var.Q.getPaddingTop());
                    j47Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                }
                j47Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr5 = this.n0;
                gb2Var2.getLocationInWindow(iArr5);
                if (j47Var.v0.getParent() instanceof View) {
                    i2 = (int) ((View) j47Var.v0.getParent()).getTranslationY();
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
                float R111 = gl.R1(j47Var.Q.getX() + f47Var.getX(), iArr6[c3], 1.0f - j47Var.E);
                float R112 = gl.R1(j47Var.Q.getY() + f47Var.getY(), iArr6[1], 1.0f - j47Var.E);
                canvas2.save();
                canvas2.translate(R111, R112);
                float R113 = gl.R1(1.0f, f47Var.getScaleX(), j47Var.E);
                canvas2.scale(R113, R113, (-j47Var.Q.getX()) + f47Var.getWidth(), (-j47Var.Q.getY()) + f47Var.getHeight());
                j47Var.Q.getTransitionParams().L1 = 1.0f - j47Var.E;
                j47Var.Q.getTransitionParams().h0 = rect.left * j47Var.E;
                j47Var.Q.getTransitionParams().k0 = rect.top * j47Var.E;
                j47Var.Q.getTransitionParams().i0 = rect.right * j47Var.E;
                nb2 transitionParams = j47Var.Q.getTransitionParams();
                float f16 = j47Var.E;
                transitionParams.j0 = rect.bottom * f16;
                j47Var.Q.setTimeAlpha(1.0f - f16);
                if (j47Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, j47Var.v0.getWidth(), j47Var.v0.getHeight(), (int) (j47Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, j47Var.Q.getPaddingTop());
                    j47Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, j47Var.v0.getWidth(), j47Var.v0.getHeight(), (int) ((1.0f - j47Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, j47Var.v0.getPaddingTop());
                    j47Var.v0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                j47Var.Q.draw(canvas2);
                if (j47Var.Q.getTransitionParams().x0) {
                    j47Var.Q.h1(canvas2, 1.0f);
                    j47Var.Q.A1(1.0f - j47Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF2 = gl.P;
            rectF2.set(0.0f, R16, getWidth(), gl.L(14.0f) + R16);
            xl3 xl3Var = this.q0;
            xl3Var.s(canvas2, rectF2, 1, R17);
            rectF2.set(0.0f, R18 - gl.L(14.0f), getWidth(), R18);
            xl3Var.s(canvas2, rectF2, 3, R19);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            r10 = 1;
            iArr = iArr2;
        }
        if (j47Var.w) {
            if (j47Var.y) {
                j47Var.o(r10, 1.0f);
                c = 0;
                j47Var.y = false;
            } else {
                c = 0;
            }
            canvas2.save();
            int i8 = iArr[c];
            int width = j47Var.X.getWidth();
            j47Var.X.getHeight();
            canvas2.translate(gl.R1(gl.L(6.0f) + (i8 - (width - a47Var.m())), j47Var.X.getX(), j47Var.E), gl.R1(iArr[r10], j47Var.X.getY(), j47Var.E));
            if (j47Var.s && j47Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, j47Var.X.getWidth(), j47Var.X.getHeight(), (int) (j47Var.E * 255.0f), 31);
            }
            j47Var.X.draw(canvas2);
            if (j47Var.s && j47Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (j47Var.l0 != null) {
            if (j47Var.J == null) {
                j47Var.J = new tl(gl.L(24.0f), 23, this, false);
            }
            Rect rect2 = gl.Q;
            rect2.set((int) ((j47Var.l0.right - gl.L(12.0f)) - gl.L(24.0f)), (int) ((j47Var.l0.bottom - gl.L(12.0f)) - gl.L(24.0f)), (int) (j47Var.l0.right - gl.L(12.0f)), (int) (j47Var.l0.bottom - gl.L(12.0f)));
            RectF rectF3 = gl.P;
            rectF3.set(rect2);
            rectF3.inset(-gl.L(12.0f), -gl.L(6.0f));
            float height2 = rectF3.height() / 2.0f;
            Paint paint2 = this.r0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (j47Var.J.e() * 30.0f * j47Var.E));
            canvas2.drawRoundRect(rectF3, height2, height2, paint2);
            j47Var.J.setBounds(rect2);
            tl tlVar = j47Var.J;
            tlVar.w = (int) (j47Var.E * 255.0f);
            tlVar.draw(canvas2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j47 j47Var = this.t0;
        if (j47Var.w) {
            if (view != j47Var.X) {
                gb2 gb2Var = j47Var.Q;
                if (view == gb2Var && gb2Var != null && gb2Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }
}
