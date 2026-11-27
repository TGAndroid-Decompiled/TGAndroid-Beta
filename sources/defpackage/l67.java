package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class l67 extends wma {
    public final int[] g0;
    public final int[] h0;
    public int i0;
    public final int[] j0;
    public final pm3 k0;
    public final Paint l0;
    public final vnb m0;
    public final q67 n0;

    public l67(q67 q67Var, Context context, vnb vnbVar) {
        super(context, null);
        this.n0 = q67Var;
        this.m0 = vnbVar;
        this.g0 = new int[2];
        this.h0 = new int[2];
        this.i0 = 0;
        this.j0 = new int[2];
        this.k0 = new pm3((byte) 7);
        k43 k43Var = k43.f;
        this.l0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        ?? r10;
        int[] iArr;
        char c;
        h67 h67Var;
        wb2 wb2Var;
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
        q67 q67Var = this.n0;
        int[] iArr2 = q67Var.r0;
        Paint paint = q67Var.T;
        float[] fArr = q67Var.s0;
        Rect rect = q67Var.y0;
        m67 m67Var = q67Var.K;
        if (q67Var.w && (wb2Var = q67Var.Q) != null && wb2Var.getCurrentPosition() == null) {
            if (q67Var.x) {
                tx1 tx1Var = q67Var.S;
                if (tx1Var != null) {
                    tx1Var.setAlpha(0.0f);
                } else {
                    vh4 vh4Var = q67Var.m0;
                    if (vh4Var != null) {
                        vh4Var.I(true);
                    }
                }
                q67Var.x = false;
            }
            if (q67Var.Q.getMessageObject() != null && q67Var.Q.getMessageObject().D == 15) {
                textX = q67Var.Q.getPhotoImage().L0;
                textY = q67Var.Q.getPhotoImage().M0;
            } else {
                textX = q67Var.Q.getTextX();
                textY = q67Var.Q.getTextY();
            }
            float x = q67Var.Q.getX() + m67Var.getX() + textX;
            float y = q67Var.Q.getY() + m67Var.getY() + textY;
            float f9 = textX;
            if (q67Var.Q.getMessageObject() != null) {
                r47 messageObject = q67Var.Q.getMessageObject();
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
                            TextPaint[] textPaintArr = aob.y2;
                            if (z) {
                                textPaint = textPaintArr[0];
                                break;
                            } else {
                                textPaint = textPaintArr[2];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = aob.y2;
                            if (z) {
                                textPaint = textPaintArr2[1];
                                break;
                            } else {
                                textPaint = textPaintArr2[3];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = aob.y2;
                            if (z) {
                                textPaint = textPaintArr3[2];
                                break;
                            } else {
                                textPaint = textPaintArr3[4];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = aob.y2;
                            if (z) {
                                textPaint = textPaintArr4[3];
                                break;
                            } else {
                                textPaint = textPaintArr4[5];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = aob.y2;
                            if (z) {
                                textPaint = textPaintArr5[4];
                                break;
                            } else {
                                textPaint = textPaintArr5[5];
                                break;
                            }
                        default:
                            textPaint = aob.y2[5];
                            break;
                    }
                } else {
                    textPaint = aob.o2;
                }
            } else {
                c2 = 3;
                textPaint = aob.o2;
            }
            float textSize = textPaint.getTextSize();
            tx1 tx1Var2 = q67Var.S;
            if (tx1Var2 != null) {
                int[] iArr3 = this.g0;
                tx1Var2.getLocationOnScreen(iArr3);
                float paddingLeft = q67Var.S.getPaddingLeft() + iArr3[0];
                int i5 = iArr3[1];
                float textSize2 = q67Var.S.getTextSize();
                int i6 = iArr3[1];
                float f10 = i6;
                height = q67Var.S.getMeasuredHeight() + i6;
                float R1 = hl.R1(paddingLeft, x, q67Var.E);
                float R12 = hl.R1((q67Var.S.getPaddingTop() + i5) - q67Var.S.getScrollY(), y, q67Var.E);
                float R13 = hl.R1(textSize2, textSize, q67Var.E);
                f = textY;
                f3 = R12;
                f4 = f10;
                f5 = R13;
                f2 = R1;
            } else {
                vh4 vh4Var2 = q67Var.m0;
                if (vh4Var2 != null) {
                    float[] fArr2 = (float[]) vh4Var2.b;
                    if (((boolean[]) vh4Var2.c)[0] && vh4Var2.a) {
                        f = textY;
                        i = 4;
                    } else {
                        knc kncVar = (knc) ((rx) vh4Var2.d).d;
                        kncVar.getLocationOnScreen(kncVar.I3);
                        int[] iArr4 = kncVar.I3;
                        f = textY;
                        fArr2[0] = iArr4[0] + kncVar.e3;
                        float f11 = iArr4[1];
                        fArr2[1] = kncVar.f3 + f11;
                        RectF rectF = kncVar.j0;
                        fArr2[2] = rectF.top + f11;
                        fArr2[c2] = f11 + rectF.bottom;
                        vh4Var2.a = true;
                        i = 4;
                    }
                    System.arraycopy(fArr2, 0, fArr, 0, i);
                    float textSize3 = ((knc) ((rx) q67Var.m0.d).d).d.getTextSize();
                    f4 = fArr[2];
                    float f12 = fArr[c2];
                    float R14 = hl.R1(fArr[0], x, q67Var.E);
                    float R15 = hl.R1(fArr[1], y, q67Var.E);
                    height = f12;
                    f2 = R14;
                    f3 = R15;
                    f5 = hl.R1(textSize3, textSize, q67Var.E);
                } else {
                    f = textY;
                    height = getHeight();
                    f2 = x;
                    f3 = y;
                    f4 = 0.0f;
                    f5 = textSize;
                }
            }
            float f13 = q67Var.E;
            if (q67Var.v0 != null) {
                f4 = q67Var.w0;
            }
            float R16 = hl.R1(f4, ((1.0f - m67Var.getScaleY()) * m67Var.getHeight()) + m67Var.getY(), q67Var.E);
            if (m67Var.canScrollVertically(-1)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            float R17 = hl.R1(0.0f, f6, q67Var.E);
            if (q67Var.v0 != null) {
                height = q67Var.x0;
            }
            float R18 = hl.R1(height, m67Var.getY() + m67Var.getHeight(), q67Var.E);
            if (m67Var.canScrollVertically(1)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float R19 = hl.R1(0.0f, f7, q67Var.E);
            iArr = iArr2;
            float f14 = f;
            canvas.saveLayerAlpha(0.0f, R16 + 1.0f, getWidth(), R18 - 1.0f, 255, 31);
            if (q67Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f13) * 255.0f), 31);
                canvas2.translate(f2, f3);
                canvas2.translate((-q67Var.S.getX()) - q67Var.S.getPaddingLeft(), ((-q67Var.S.getY()) - q67Var.S.getPaddingTop()) + q67Var.S.getScrollY());
                float alpha = q67Var.S.getAlpha();
                q67Var.S.setAlpha(1.0f);
                if (q67Var.E < 0.001f) {
                    if (q67Var.V != null) {
                        canvas2.save();
                        canvas2.translate(0.0f, q67Var.S.getY());
                        f8 = alpha;
                        canvas2.saveLayerAlpha(q67Var.S.getX() + q67Var.S.getPaddingLeft(), 0.0f, ((q67Var.S.getX() + q67Var.S.getPaddingLeft()) + q67Var.S.getWidth()) - q67Var.S.getPaddingRight(), q67Var.S.getHeight(), (int) uh9.e(q67Var.E, 0.1f, 1.0f, 255.0f), 31);
                        q67Var.V.a(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        f8 = alpha;
                        paint.setColor(aob.v0(aob.Je, this.m0));
                        paint.setAlpha((int) uh9.e(q67Var.E, 0.1f, 1.0f, paint.getAlpha()));
                        canvas2.drawRect(q67Var.S.getPaddingLeft(), q67Var.S.getY(), ((q67Var.S.getX() + q67Var.S.getPaddingLeft()) + q67Var.S.getWidth()) - q67Var.S.getPaddingRight(), q67Var.S.getY() + q67Var.S.getHeight(), paint);
                    }
                } else {
                    f8 = alpha;
                }
                c cVar = q67Var.U;
                if (cVar != null) {
                    cVar.a(canvas2, new hcc() {
                        @Override
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            q67 q67Var2 = l67.this.n0;
                            canvas3.translate(q67Var2.S.getX(), q67Var2.S.getY() - q67Var2.S.getScrollY());
                            float textSize4 = f5 / q67Var2.S.getTextSize();
                            canvas3.scale(textSize4, textSize4, q67Var2.S.getPaddingLeft(), q67Var2.S.getPaddingTop());
                            q67Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                q67Var.S.setAlpha(f8);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                if (q67Var.m0 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f13) * 255.0f), 31);
                    canvas2.translate(f2, f3);
                    float textSize4 = f5 / ((knc) ((rx) q67Var.m0.d).d).d.getTextSize();
                    canvas2.scale(textSize4, textSize4);
                    vh4 vh4Var3 = q67Var.m0;
                    if (!((boolean[]) vh4Var3.c)[0]) {
                        knc kncVar2 = (knc) ((rx) vh4Var3.d).d;
                        StaticLayout staticLayout = kncVar2.Q0;
                        TextPaint textPaint2 = kncVar2.d;
                        if (staticLayout != null) {
                            int alpha2 = textPaint2.getAlpha();
                            textPaint2.setAlpha(255);
                            kncVar2.Q0.draw(canvas2);
                            textPaint2.setAlpha(alpha2);
                        }
                    }
                    canvas2.restore();
                }
            }
            r10 = 1;
            q67Var.Q.getTransitionParams().y0 = true;
            wb2 wb2Var2 = q67Var.v0;
            if (wb2Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f13 * 255.0f), 31);
                canvas2.translate(f2, f3);
                canvas2.translate(-f9, -f14);
                float R110 = hl.R1(1.0f, m67Var.getScaleX(), q67Var.E);
                canvas2.scale(R110, R110, (-q67Var.Q.getX()) + m67Var.getWidth(), (-q67Var.Q.getY()) + m67Var.getHeight());
                float f15 = f5 / textSize;
                canvas2.scale(f15, f15, f9, f14);
                if (q67Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, q67Var.Q.getPaddingTop());
                    q67Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                }
                q67Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr5 = this.h0;
                wb2Var2.getLocationInWindow(iArr5);
                if (q67Var.v0.getParent() instanceof View) {
                    i2 = (int) ((View) q67Var.v0.getParent()).getTranslationY();
                } else {
                    i2 = 0;
                }
                int i7 = this.i0;
                int[] iArr6 = this.j0;
                if (i7 > i2 && iArr6[1] - iArr5[1] > i7) {
                    c3 = 0;
                } else {
                    c3 = 0;
                    iArr6[0] = iArr5[0];
                    iArr6[1] = iArr5[1];
                }
                this.i0 = i2;
                float R111 = hl.R1(q67Var.Q.getX() + m67Var.getX(), iArr6[c3], 1.0f - q67Var.E);
                float R112 = hl.R1(q67Var.Q.getY() + m67Var.getY(), iArr6[1], 1.0f - q67Var.E);
                canvas2.save();
                canvas2.translate(R111, R112);
                float R113 = hl.R1(1.0f, m67Var.getScaleX(), q67Var.E);
                canvas2.scale(R113, R113, (-q67Var.Q.getX()) + m67Var.getWidth(), (-q67Var.Q.getY()) + m67Var.getHeight());
                q67Var.Q.getTransitionParams().L1 = 1.0f - q67Var.E;
                q67Var.Q.getTransitionParams().h0 = rect.left * q67Var.E;
                q67Var.Q.getTransitionParams().k0 = rect.top * q67Var.E;
                q67Var.Q.getTransitionParams().i0 = rect.right * q67Var.E;
                dc2 transitionParams = q67Var.Q.getTransitionParams();
                float f16 = q67Var.E;
                transitionParams.j0 = rect.bottom * f16;
                q67Var.Q.setTimeAlpha(1.0f - f16);
                if (q67Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, q67Var.v0.getWidth(), q67Var.v0.getHeight(), (int) (q67Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, q67Var.Q.getPaddingTop());
                    q67Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, q67Var.v0.getWidth(), q67Var.v0.getHeight(), (int) ((1.0f - q67Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, q67Var.v0.getPaddingTop());
                    q67Var.v0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                q67Var.Q.draw(canvas2);
                if (q67Var.Q.getTransitionParams().x0) {
                    q67Var.Q.h1(canvas2, 1.0f);
                    q67Var.Q.A1(1.0f - q67Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, R16, getWidth(), hl.L(14.0f) + R16);
            pm3 pm3Var = this.k0;
            pm3Var.r(canvas2, rectF2, 1, R17);
            rectF2.set(0.0f, R18 - hl.L(14.0f), getWidth(), R18);
            pm3Var.r(canvas2, rectF2, 3, R19);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            r10 = 1;
            iArr = iArr2;
        }
        if (q67Var.w) {
            if (q67Var.y) {
                q67Var.o(r10, 1.0f);
                c = 0;
                q67Var.y = false;
            } else {
                c = 0;
            }
            canvas2.save();
            int i8 = iArr[c];
            int width = q67Var.X.getWidth();
            q67Var.X.getHeight();
            canvas2.translate(hl.R1(hl.L(6.0f) + (i8 - (width - h67Var.m())), q67Var.X.getX(), q67Var.E), hl.R1(iArr[r10], q67Var.X.getY(), q67Var.E));
            if (q67Var.s && q67Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, q67Var.X.getWidth(), q67Var.X.getHeight(), (int) (q67Var.E * 255.0f), 31);
            }
            q67Var.X.draw(canvas2);
            if (q67Var.s && q67Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (q67Var.l0 != null) {
            if (q67Var.J == null) {
                q67Var.J = new ul(hl.L(24.0f), 23, this, false);
            }
            Rect rect2 = hl.Q;
            rect2.set((int) ((q67Var.l0.right - hl.L(12.0f)) - hl.L(24.0f)), (int) ((q67Var.l0.bottom - hl.L(12.0f)) - hl.L(24.0f)), (int) (q67Var.l0.right - hl.L(12.0f)), (int) (q67Var.l0.bottom - hl.L(12.0f)));
            RectF rectF3 = hl.P;
            rectF3.set(rect2);
            rectF3.inset(-hl.L(12.0f), -hl.L(6.0f));
            float height2 = rectF3.height() / 2.0f;
            Paint paint2 = this.l0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (q67Var.J.e() * 30.0f * q67Var.E));
            canvas2.drawRoundRect(rectF3, height2, height2, paint2);
            q67Var.J.setBounds(rect2);
            ul ulVar = q67Var.J;
            ulVar.w = (int) (q67Var.E * 255.0f);
            ulVar.draw(canvas2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        q67 q67Var = this.n0;
        if (q67Var.w) {
            if (view != q67Var.X) {
                wb2 wb2Var = q67Var.Q;
                if (view == wb2Var && wb2Var != null && wb2Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }
}
