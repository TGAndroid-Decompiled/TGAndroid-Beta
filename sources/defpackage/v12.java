package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.a;
public final class v12 extends ela {
    public int m0;
    public final RectF n0;
    public boolean o0;
    public float p0;
    public final u12 q0;
    public final i22 r0;

    public v12(i22 i22Var, Context context) {
        super(context, null);
        this.r0 = i22Var;
        this.n0 = new RectF();
        this.q0 = new u12(this, this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int L;
        int L2;
        float f4;
        float f5;
        int Y0;
        float f6;
        int v0;
        float alpha;
        float f7;
        int i;
        a22 a22Var;
        canvas.save();
        i22 i22Var = this.r0;
        a22 a22Var2 = i22Var.v2;
        x62 x62Var = i22Var.k2;
        if ((a22Var2 == x62Var || (a22Var = i22Var.w2) == x62Var || (a22Var2 == i22Var.d2 && a22Var == null)) && a22Var2 != null) {
            canvas.save();
            float f8 = i22Var.i4;
            boolean z = i22Var.a2;
            su suVar = i22Var.L2;
            h12 h12Var = i22Var.f3;
            canvas.translate(0.0f, f8);
            int alpha2 = (int) (a22Var2.getAlpha() * 255.0f);
            int j = a22Var2.j();
            int L3 = gm.L(13.0f);
            if (h12Var != null) {
                f = h12Var.getAlpha();
            } else {
                f = 0.0f;
            }
            int L4 = L3 + ((int) (f * gm.L(26.0f)));
            if (suVar != null) {
                f2 = suVar.getAlpha() * suVar.getMeasuredHeight();
            } else {
                f2 = 0.0f;
            }
            int i2 = L4 + ((int) f2);
            int X0 = (i22Var.X0(0) - i22Var.t0) - i2;
            if (i22Var.B0 == 1 || i22Var.q3 != null) {
                X0 = (int) (a22Var2.getTranslationY() + X0);
            }
            int L5 = gm.L(20.0f) + X0;
            getMeasuredHeight();
            int i3 = i22Var.t0;
            if (j != 0) {
                i3 = a.getCurrentActionBarHeight();
            }
            if (j == 2) {
                if (X0 < i3) {
                    f5 = aq1.x(i3 - X0, i22Var.t0, 1.0f, 0.0f);
                    f3 = 1.0f;
                } else {
                    f5 = 1.0f;
                    f3 = 1.0f;
                }
            } else {
                float f9 = i2;
                f3 = 1.0f;
                if (a22Var2 == i22Var.i2) {
                    L = gm.L(11.0f);
                } else {
                    if (a22Var2 == i22Var.g2) {
                        L2 = gm.L(3.0f);
                    } else if (a22Var2 == i22Var.h2) {
                        L2 = gm.L(3.0f);
                    } else {
                        L = gm.L(4.0f);
                    }
                    f4 = f9 - L2;
                    float alpha3 = i22Var.U2.getAlpha();
                    int i4 = (int) (((i3 - f4) + gm.m) * alpha3);
                    X0 -= i4;
                    L5 -= i4;
                    f5 = 1.0f - alpha3;
                }
                f4 = f9 + L;
                float alpha32 = i22Var.U2.getAlpha();
                int i42 = (int) (((i3 - f4) + gm.m) * alpha32);
                X0 -= i42;
                L5 -= i42;
                f5 = 1.0f - alpha32;
            }
            if (!z) {
                int i5 = gm.m;
                X0 += i5;
                L5 += i5;
            }
            if (i22Var.v2.h()) {
                Y0 = i22Var.v2.getCustomBackground();
            } else {
                Y0 = i22Var.Y0(true);
            }
            i22Var.s0.setAlpha(alpha2);
            i22Var.s0.setBounds(0, X0, getMeasuredWidth(), gm.L(45.0f) + getMeasuredHeight() + i22Var.t0);
            i22Var.s0.draw(canvas);
            RectF rectF = this.n0;
            if (j == 2) {
                cmb.s0.setColor(Y0);
                cmb.s0.setAlpha(alpha2);
                f6 = 24.0f;
                rectF.set(i22Var.u0, i22Var.t0 + X0, getMeasuredWidth() - i22Var.u0, gm.L(24.0f) + i22Var.t0 + X0);
            } else {
                f6 = 24.0f;
            }
            if ((f5 != f3 && j != 2) || i22Var.v2.g()) {
                Paint paint = cmb.s0;
                if (i22Var.v2.g()) {
                    Y0 = i22Var.v2.getCustomActionBarBackground();
                }
                paint.setColor(Y0);
                cmb.s0.setAlpha(alpha2);
                rectF.set(i22Var.u0, i22Var.t0 + X0, getMeasuredWidth() - i22Var.u0, gm.L(f6) + i22Var.t0 + X0);
            }
            if (i22Var.v2.g()) {
                cmb.s0.setColor(i22Var.v2.getCustomActionBarBackground());
                cmb.s0.setAlpha(alpha2);
                int X02 = i22Var.X0(0);
                if (!z) {
                    X02 += gm.m;
                }
                rectF.set(i22Var.u0, (gm.L(12.0f) + i22Var.t0 + X0) * f5, getMeasuredWidth() - i22Var.u0, gm.L(12.0f) + X02);
                canvas.save();
                canvas.drawRect(rectF, cmb.s0);
                canvas.restore();
            }
            if ((h12Var == null || h12Var.getAlpha() != f3) && f5 != 0.0f) {
                int L6 = gm.L(36.0f);
                rectF.set((getMeasuredWidth() - L6) / 2, L5, (getMeasuredWidth() + L6) / 2, gm.L(4.0f) + L5);
                if (j == 2) {
                    v0 = 536870912;
                    f7 = f5;
                } else if (i22Var.v2.g()) {
                    int customActionBarBackground = i22Var.v2.getCustomActionBarBackground();
                    if (on2.h(customActionBarBackground) < 0.5d) {
                        i = -1;
                    } else {
                        i = -16777216;
                    }
                    v0 = on2.f(0.5f, customActionBarBackground, i);
                    if (h12Var != null) {
                        alpha = h12Var.getAlpha();
                        f7 = f3 - alpha;
                    }
                    f7 = f3;
                } else {
                    v0 = cmb.v0(cmb.yj, i22Var.J0);
                    if (h12Var != null) {
                        alpha = h12Var.getAlpha();
                        f7 = f3 - alpha;
                    }
                    f7 = f3;
                }
                int alpha4 = Color.alpha(v0);
                cmb.s0.setColor(v0);
                cmb.s0.setAlpha((int) (a22Var2.getAlpha() * alpha4 * f7 * f5));
                canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        float f2;
        float f3;
        int i;
        int L;
        int L2;
        float f4;
        int i2;
        float f5;
        int i3;
        float f6;
        int L3;
        int L4;
        float f7;
        float f8;
        int Y0;
        boolean z;
        float f9;
        boolean drawChild;
        int v0;
        float alpha;
        a22 a22Var;
        i22 i22Var = this.r0;
        boolean z2 = i22Var.a2;
        su suVar = i22Var.L2;
        im0 im0Var = i22Var.x2;
        h12 h12Var = i22Var.f3;
        x20 x20Var = i22Var.U2;
        if ((view instanceof a22) && view.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(0.0f, i22Var.i4);
            int alpha2 = (int) (view.getAlpha() * 255.0f);
            a22 a22Var2 = (a22) view;
            int j2 = a22Var2.j();
            int L5 = gm.L(13.0f);
            if (h12Var != null) {
                i2 = gm.L(h12Var.getAlpha() * 26.0f);
            } else {
                i2 = 0;
            }
            int i4 = L5 + i2;
            if (suVar != null) {
                f5 = suVar.getAlpha() * suVar.getMeasuredHeight();
            } else {
                f5 = 0.0f;
            }
            int i5 = i4 + ((int) f5);
            if (a22Var2 == i22Var.v2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int X0 = (i22Var.X0(i3) - i22Var.t0) - i5;
            if (i22Var.B0 == 1 || i22Var.q3 != null) {
                X0 = (int) (view.getTranslationY() + X0);
            }
            int L6 = gm.L(20.0f) + X0;
            int measuredHeight = getMeasuredHeight();
            int i6 = i22Var.t0;
            int L7 = gm.L(45.0f) + measuredHeight + i6;
            if (j2 != 0) {
                i6 = a.getCurrentActionBarHeight();
            }
            if (j2 == 2) {
                if (X0 < i6) {
                    f8 = aq1.x(i6 - X0, i22Var.t0, 1.0f, 0.0f);
                    f6 = 0.0f;
                } else {
                    f6 = 0.0f;
                    f8 = 1.0f;
                }
            } else {
                f6 = 0.0f;
                if (i22Var.t0 + X0 < i6) {
                    float f10 = i5;
                    if (a22Var2 == i22Var.i2) {
                        L3 = gm.L(11.0f);
                    } else {
                        if (a22Var2 == i22Var.g2) {
                            L4 = gm.L(3.0f);
                        } else if (a22Var2 == i22Var.h2) {
                            L4 = gm.L(3.0f);
                        } else {
                            L3 = gm.L(4.0f);
                        }
                        f7 = f10 - L4;
                        float min = Math.min(1.0f, ((i6 - X0) - i22Var.t0) / f7);
                        int i7 = (int) ((i6 - f7) * min);
                        X0 -= i7;
                        L6 -= i7;
                        L7 += i7;
                        f8 = 1.0f - min;
                    }
                    f7 = f10 + L3;
                    float min2 = Math.min(1.0f, ((i6 - X0) - i22Var.t0) / f7);
                    int i72 = (int) ((i6 - f7) * min2);
                    X0 -= i72;
                    L6 -= i72;
                    L7 += i72;
                    f8 = 1.0f - min2;
                }
                f8 = 1.0f;
            }
            if (!z2) {
                int i8 = gm.m;
                X0 += i8;
                L6 += i8;
                L7 -= i8;
            }
            int i9 = L7;
            if (i22Var.v2.h()) {
                Y0 = i22Var.v2.getCustomBackground();
            } else {
                Y0 = i22Var.Y0(true);
            }
            a22 a22Var3 = i22Var.v2;
            x62 x62Var = i22Var.k2;
            if (a22Var3 != x62Var && (a22Var = i22Var.w2) != x62Var && (a22Var3 != i22Var.d2 || a22Var != null)) {
                z = true;
            } else {
                z = false;
            }
            RectF rectF = this.n0;
            if (z) {
                i22Var.s0.setAlpha(alpha2);
                f9 = 24.0f;
                i22Var.s0.setBounds(0, X0, getMeasuredWidth(), i9);
                i22Var.s0.draw(canvas);
                if (j2 == 2) {
                    cmb.s0.setColor(Y0);
                    cmb.s0.setAlpha(alpha2);
                    rectF.set(i22Var.u0, i22Var.t0 + X0, getMeasuredWidth() - i22Var.u0, gm.L(24.0f) + i22Var.t0 + X0);
                }
            } else {
                f9 = 24.0f;
            }
            a22Var2.F(((i22Var.t0 + X0) - view.getTop()) - view.getTranslationY(), f8);
            if (view != i22Var.e2 && view != i22Var.m2 && view != i22Var.f2) {
                canvas.save();
                drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
            } else {
                drawChild = super.drawChild(canvas, view, j);
            }
            if (z) {
                if (f8 != 1.0f && j2 != 2) {
                    cmb.s0.setColor(Y0);
                    cmb.s0.setAlpha(alpha2);
                    rectF.set(i22Var.u0, i22Var.t0 + X0, getMeasuredWidth() - i22Var.u0, gm.L(f9) + i22Var.t0 + X0);
                }
                if ((h12Var == null || h12Var.getAlpha() != 1.0f) && f8 != f6) {
                    int L8 = gm.L(36.0f);
                    rectF.set((getMeasuredWidth() - L8) / 2, L6, (getMeasuredWidth() + L8) / 2, gm.L(4.0f) + L6);
                    if (j2 == 2) {
                        v0 = 536870912;
                        alpha = f8;
                    } else {
                        v0 = cmb.v0(cmb.yj, i22Var.J0);
                        if (h12Var == null) {
                            alpha = 1.0f;
                        } else {
                            alpha = 1.0f - h12Var.getAlpha();
                        }
                    }
                    int alpha3 = Color.alpha(v0);
                    cmb.s0.setColor(v0);
                    cmb.s0.setAlpha((int) (view.getAlpha() * alpha3 * alpha * f8));
                    canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
                }
            }
            canvas.restore();
            return drawChild;
        } else if (view == x20Var) {
            float alpha4 = x20Var.getAlpha();
            if (alpha4 <= 0.0f) {
                return false;
            }
            if (alpha4 >= 1.0f) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float x = x20Var.getX();
            a22 a22Var4 = i22Var.v2;
            if (a22Var4 != null) {
                int j3 = a22Var4.j();
                int L9 = gm.L(13.0f);
                if (h12Var != null) {
                    f2 = h12Var.getAlpha();
                } else {
                    f2 = 0.0f;
                }
                int L10 = L9 + ((int) (f2 * gm.L(26.0f)));
                if (suVar != null) {
                    f3 = suVar.getAlpha() * suVar.getMeasuredHeight();
                } else {
                    f3 = 0.0f;
                }
                int i10 = L10 + ((int) f3);
                int X02 = (i22Var.X0(0) - i22Var.t0) - i10;
                if (i22Var.B0 == 1 || i22Var.q3 != null) {
                    X02 = (int) (a22Var4.getTranslationY() + X02);
                }
                int L11 = gm.L(20.0f) + X02;
                if (j3 != 0) {
                    i = a.getCurrentActionBarHeight();
                } else {
                    i = i22Var.t0;
                }
                if (j3 != 2 && X02 + i22Var.t0 < i) {
                    float f11 = i10;
                    if (a22Var4 == i22Var.i2) {
                        L = gm.L(11.0f);
                    } else {
                        if (a22Var4 == i22Var.g2) {
                            L2 = gm.L(3.0f);
                        } else if (a22Var4 == i22Var.h2) {
                            L2 = gm.L(3.0f);
                        } else {
                            L = gm.L(4.0f);
                        }
                        f4 = f11 - L2;
                        L11 -= (int) (x20Var.getAlpha() * ((i - f4) + gm.m));
                    }
                    f4 = f11 + L;
                    L11 -= (int) (x20Var.getAlpha() * ((i - f4) + gm.m));
                }
                if (!z2) {
                    L11 += gm.m;
                }
                f = L11;
            } else {
                f = 0.0f;
            }
            canvas.clipRect(x, f, x20Var.getX() + x20Var.getWidth(), x20Var.getY() + x20Var.getHeight());
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else if ((view instanceof e34) && im0Var != null) {
            canvas.save();
            im0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
            canvas.clipPath(im0Var.S.k);
            im0Var.draw(canvas);
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        } else {
            return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u12 u12Var = this.q0;
        u12Var.b = this;
        u12Var.c();
        i22 i22Var = this.r0;
        i22Var.B2.setAdjustPanLayoutHelper(u12Var);
        i22Var.M2.setAdjustPanLayoutHelper(u12Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q0.d();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        i22 i22Var = this.r0;
        int[] iArr = i22Var.Y3;
        if (i22Var.v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            int i = 0;
            if (iArr[0] != 0) {
                float y = motionEvent.getY();
                su suVar = i22Var.L2;
                int i2 = iArr[0] - (i22Var.t0 << 1);
                int L = gm.L(13.0f);
                h12 h12Var = i22Var.f3;
                if (h12Var != null) {
                    i = gm.L(h12Var.getAlpha() * 26.0f);
                }
                int i3 = i2 - (L + i);
                if (suVar != null) {
                    f = suVar.getAlpha() * suVar.getMeasuredHeight();
                } else {
                    f = 0.0f;
                }
                int L2 = gm.L(20.0f) + (i3 - ((int) f));
                if (!i22Var.a2) {
                    L2 += gm.m;
                }
                if (y < L2 && i22Var.U2.getAlpha() == 0.0f) {
                    i22Var.l0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        int i3;
        float f;
        v72 v72Var;
        v72 v72Var2;
        int W0;
        int i4;
        int i5;
        v12 v12Var = this;
        i22 i22Var = v12Var.r0;
        r7 r7Var = i22Var.X2;
        boolean z = i22Var.a2;
        if (v12Var.getLayoutParams().height > 0) {
            size = v12Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        if (!z) {
            v12Var.o0 = true;
            int i6 = i22Var.u0;
            v12Var.setPadding(i6, 0, i6, 0);
            v12Var.o0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i) - (i22Var.u0 << 1);
        if (gm.O1()) {
            r7Var.setAdditionalYOffset(-gm.L(3.0f));
        } else {
            Point point = gm.q;
            if (point.x > point.y) {
                r7Var.setAdditionalYOffset(0);
            } else {
                r7Var.setAdditionalYOffset(-gm.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) i22Var.c3.getLayoutParams()).height = a.getCurrentActionBarHeight();
        v12Var.o0 = true;
        int min = (int) (size2 / Math.min(4.5f, i22Var.x3.b()));
        if (i22Var.V3 != min) {
            i22Var.V3 = min;
            gm.c3(new fo1(v12Var, (byte) 18));
        }
        v12Var.o0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        v12Var.setMeasuredDimension(size3, size4);
        int i7 = i22Var.u0;
        m12 m12Var = i22Var.M2;
        k12 k12Var = i22Var.B2;
        int i8 = size3 - (i7 << 1);
        if (!k12Var.O && gm.L(20.0f) >= 0 && !k12Var.e && !k12Var.P) {
            v12Var.o0 = true;
            k12Var.j();
            v12Var.o0 = false;
        }
        if (!m12Var.O && gm.L(20.0f) >= 0 && !m12Var.e && !m12Var.P) {
            v12Var.o0 = true;
            m12Var.j();
            v12Var.o0 = false;
        }
        if (i22Var.g2 != null && gm.L(20.0f) >= 0) {
            v72 v72Var3 = i22Var.g2;
            if (!v72Var3.H && !v72Var3.b1 && !v72Var3.g1 && !v72Var3.i1) {
                v12Var.o0 = true;
                v72Var3.a0();
                v12Var.o0 = false;
            }
        }
        if (i22Var.h2 != null && gm.L(20.0f) >= 0) {
            v72 v72Var4 = i22Var.h2;
            if (!v72Var4.H && !v72Var4.b1 && !v72Var4.g1 && !v72Var4.i1) {
                v12Var.o0 = true;
                v72Var4.a0();
                v12Var.o0 = false;
            }
        }
        if (gm.L(20.0f) >= 0) {
            if (i22Var.d) {
                a22 a22Var = i22Var.v2;
                v72 v72Var5 = i22Var.g2;
                if (a22Var == v72Var5 && v72Var5.F != null && v72Var5.i1) {
                    W0 = gm.L(120.0f);
                } else {
                    v72 v72Var6 = i22Var.h2;
                    if (a22Var == v72Var6 && v72Var6.F != null && v72Var6.i1) {
                        W0 = gm.L(120.0f);
                    } else {
                        W0 = 0;
                    }
                }
            } else {
                W0 = i22Var.W0();
            }
            WeakHashMap weakHashMap = kfc.a;
            wzc a = dfc.a(v12Var);
            if (a != null) {
                i4 = a.a.f(8).d;
            } else {
                i4 = 0;
            }
            wzc a2 = dfc.a(v12Var);
            if (a2 != null) {
                int i9 = a2.a.f(527).d;
            }
            if (i4 > 0) {
                i5 = 0;
            } else {
                i5 = gm.n;
            }
            int max = Math.max(i5, W0);
            v12Var.o0 = true;
            a22 a22Var2 = i22Var.v2;
            if (a22Var2.f) {
                a22Var2.e = gm.L(62.0f) + max;
                i22Var.v2.B(i8, size4);
            } else {
                a22Var2.e = gm.n;
                a22Var2.B(i8, size4 - W0);
            }
            a22 a22Var3 = i22Var.w2;
            if (a22Var3 != null) {
                if (a22Var3.f) {
                    a22Var3.e = gm.L(62.0f) + max;
                    i22Var.w2.B(i8, size4);
                } else {
                    a22Var3.e = gm.n;
                    a22Var3.B(i8, size4 - W0);
                }
            }
            v12Var.o0 = false;
        }
        int childCount = v12Var.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            int i11 = i10;
            View childAt = v12Var.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt == i22Var.s3) {
                    i3 = i11;
                    v12Var.measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
                } else {
                    i3 = i11;
                    int i12 = gm.m;
                    int i13 = gm.n;
                    if (childAt instanceof a22) {
                        a22 a22Var4 = (a22) childAt;
                        if (a22Var4.h) {
                            i12 = 0;
                        }
                        if (a22Var4.f) {
                            i13 = 0;
                        }
                    }
                    if (!k12Var.l(childAt) && !m12Var.l(childAt) && (((v72Var = i22Var.g2) == null || childAt != v72Var.F) && ((v72Var2 = i22Var.h2) == null || childAt != v72Var2.F))) {
                        measureChildWithMargins(childAt, i, 0, makeMeasureSpec, i12 + i13);
                    } else if (z) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                    } else if (!gm.E && !gm.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (gm.O1()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        if (gm.O1()) {
                            f = 200.0f;
                        } else {
                            f = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(f), getPaddingTop() + (size4 - gm.m)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - gm.m), 1073741824));
                    }
                }
            } else {
                i3 = i11;
            }
            i10 = i3 + 1;
            v12Var = this;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i, i2, i3, i4);
        int i6 = 0;
        if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            if (roundedCorner == null) {
                i5 = 0;
            } else {
                i5 = roundedCorner.getRadius();
            }
            if (roundedCorner2 != null) {
                i6 = roundedCorner2.getRadius();
            }
        } else {
            i5 = 0;
        }
        im0 im0Var = this.r0.x2;
        if (im0Var != null) {
            im0Var.t(gm.L(29.0f), gm.L(29.0f), i6, i5, true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i22 i22Var = this.r0;
        if (!i22Var.v2.o(motionEvent)) {
            if (!i22Var.J && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f) {
        i22 i22Var = this.r0;
        h12 h12Var = i22Var.u3;
        float f2 = f + i22Var.i4;
        byte b = i22Var.B0;
        if (b == 0) {
            this.p0 = f2;
        }
        if (b == 1) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            a22 a22Var = i22Var.v2;
            if (i < 0) {
                a22Var.setTranslationY(f2);
                if (i22Var.N2 != 0 || i22Var.Q2) {
                    i22Var.f3.setTranslationY((i22Var.m3 + f2) - i22Var.i4);
                }
                h12Var.setTranslationY(0.0f);
                f2 = 0.0f;
            } else {
                a22Var.setTranslationY(0.0f);
                h12Var.setTranslationY(((f2 / this.p0) * h12Var.getMeasuredHeight()) + (-f2));
            }
            i22Var.b.invalidate();
        }
        super.setTranslationY((f2 - i22Var.i4) + i22Var.s2);
        if (i22Var.B0 != 1) {
            i22Var.v2.m(i22Var.i4);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }

    @Override
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
