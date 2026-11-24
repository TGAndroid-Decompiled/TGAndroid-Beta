package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class u9b extends ela {
    public final ai4 m0;
    public final ScaleGestureDetector n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public float r0;
    public float s0;
    public float t0;
    public final v9b u0;

    public u9b(v9b v9bVar, Activity activity) {
        super(activity, null);
        this.u0 = v9bVar;
        this.q0 = false;
        this.m0 = new ai4(activity, new s9b(this));
        this.n0 = new ScaleGestureDetector(activity, new t9b(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        v9b v9bVar = this.u0;
        float width = bitmap.getWidth() / v9bVar.n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = v9bVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = v9bVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(v9bVar.i0.getX() + v9bVar.r.getX(), v9bVar.i0.getY() + v9bVar.r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f), (int) (textureView.getHeight() / f));
                float f2 = 1.0f / width;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(v9bVar.r.getX(), v9bVar.r.getY());
        for (int i = 0; i < v9bVar.r.getChildCount(); i++) {
            View childAt = v9bVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == v9bVar.i0) {
                    for (int i2 = 0; i2 < v9bVar.i0.getChildCount(); i2++) {
                        View childAt2 = v9bVar.i0.getChildAt(i2);
                        if (childAt2 != v9bVar.Y0 && childAt2 != v9bVar.C0 && childAt2.getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            childAt2.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    childAt.draw(canvas);
                }
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9b.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.u0.K();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.o0 = false;
        v9b v9bVar = this.u0;
        wl2 wl2Var = v9bVar.J0;
        boolean z2 = true;
        if (wl2Var != null && wl2Var.e) {
            float y = v9bVar.J0.getY() + v9bVar.j0.getY() + v9bVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + v9bVar.J0.getHeight()) || this.p0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.p0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            v9bVar.J0.a(false, true);
            v9bVar.l0(true);
        }
        if (this.p0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.p0 = false;
        }
        this.n0.onTouchEvent(motionEvent);
        this.m0.I(motionEvent);
        if (motionEvent.getAction() == 1 && !this.o0) {
            if (v9bVar.r.getTranslationY() > 0.0f) {
                if (v9bVar.L > 0.4f) {
                    v9bVar.o(true);
                } else {
                    v9bVar.b();
                }
            } else {
                wt4 wt4Var = v9bVar.N0;
                if (wt4Var != null && wt4Var.getTranslationY() > 0.0f && !v9bVar.M0) {
                    if (v9bVar.R1 || v9bVar.N0.getTranslationY() >= v9bVar.N0.getPadding()) {
                        z2 = false;
                    }
                    v9bVar.c(z2);
                }
            }
            v9bVar.M0 = false;
            v9bVar.X = false;
            v9bVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        v9b v9bVar = this.u0;
        return (height - v9bVar.r.getBottom()) + v9bVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.u0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        v9b v9bVar = this.u0;
        return (height - v9bVar.c0) - v9bVar.r.getBottom();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        su suVar;
        e34 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        v9b v9bVar = this.u0;
        int i6 = v9bVar.a0;
        int measuredHeight2 = v9bVar.n0.getMeasuredHeight();
        if (v9bVar.W) {
            i6 = 0;
        }
        int i7 = v9bVar.T;
        int b = pqe.b((measuredWidth - i7) / 2, v9bVar.Z, (measuredWidth - v9bVar.b0) - i7);
        int i8 = v9bVar.T + b;
        if (v9bVar.W) {
            i5 = v9bVar.U;
        } else {
            int i9 = v9bVar.c0;
            int i10 = v9bVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (v9bVar.K) {
                float f = v9bVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = v9bVar.U;
                }
            }
            if (i11 - i6 >= gm.L(40.0f)) {
                i6 = i11;
            }
            i5 = v9bVar.U;
        }
        v9bVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        v9bVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        f9b f9bVar = v9bVar.D2;
        if (f9bVar != null) {
            f9bVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        wt4 wt4Var = v9bVar.N0;
        if (wt4Var != null) {
            wt4Var.layout((measuredWidth - wt4Var.getMeasuredWidth()) / 2, 0, (v9bVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        l9b l9bVar = v9bVar.d1;
        if (l9bVar != null && (emojiView = l9bVar.f.getEmojiView()) != null) {
            emojiView.layout(v9bVar.Z, (measuredHeight - v9bVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - v9bVar.b0, measuredHeight - v9bVar.c0);
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            e34 e34Var = z8bVar.j2;
            if (e34Var != null) {
                e34Var.layout(v9bVar.Z, (measuredHeight - v9bVar.c0) - e34Var.getMeasuredHeight(), measuredWidth - v9bVar.b0, measuredHeight - v9bVar.c0);
            }
            v29 v29Var = v9bVar.w1.P1;
            if (v29Var != null) {
                int i12 = v9bVar.Z;
                v29Var.layout(i12, v9bVar.a0, v29Var.getMeasuredWidth() + i12, v9bVar.w1.P1.getMeasuredHeight() + v9bVar.a0);
                if (v9bVar.w1.P1.getReactionsWindow() != null) {
                    suVar = v9bVar.w1.P1.getReactionsWindow().c;
                } else {
                    suVar = null;
                }
                if (suVar != null) {
                    int i13 = v9bVar.Z;
                    suVar.layout(i13, v9bVar.a0, suVar.getMeasuredWidth() + i13, suVar.getMeasuredHeight() + v9bVar.a0);
                }
            }
        }
        g9b g9bVar = v9bVar.s1;
        if (g9bVar != null) {
            g9bVar.e.setPadding(0, v9bVar.a0, 0, v9bVar.c0);
            v9bVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            v9bVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        h9b h9bVar = v9bVar.t1;
        if (h9bVar != null) {
            h9bVar.f.setPadding(0, v9bVar.a0, 0, v9bVar.c0);
            v9bVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            v9bVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof xq3) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof k21) {
                childAt.layout(0, i6, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i6);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int f;
        int i3;
        int i4;
        int i5;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        v9b v9bVar = this.u0;
        int i6 = (size - v9bVar.Z) - v9bVar.b0;
        int i7 = v9bVar.a0;
        int i8 = v9bVar.c0;
        int ceil = (int) Math.ceil((i6 / 9.0f) * 16.0f);
        int L = gm.L(48.0f);
        v9bVar.V = L;
        int i9 = ceil + L;
        int i10 = size2 - i8;
        if (i9 <= i10) {
            v9bVar.T = i6;
            v9bVar.U = ceil;
            if (i9 > i10 - i7) {
                z = true;
            } else {
                z = false;
            }
            v9bVar.W = z;
        } else {
            v9bVar.W = false;
            v9bVar.U = td4.f(size2, L, i8, i7);
            v9bVar.T = (int) Math.ceil((f * 9.0f) / 16.0f);
        }
        int i11 = size2 - v9bVar.U;
        if (v9bVar.W) {
            i3 = 0;
        } else {
            i3 = i7;
        }
        v9bVar.V = Utilities.j(i11 - i3, gm.L(68.0f), gm.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (v9bVar.W) {
            i4 = systemUiVisibility | 4;
        } else {
            i4 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i4);
        v9bVar.r.measure(View.MeasureSpec.makeMeasureSpec(v9bVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(v9bVar.U + v9bVar.V, 1073741824));
        v9bVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        f9b f9bVar = v9bVar.D2;
        if (f9bVar != null) {
            f9bVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        wt4 wt4Var = v9bVar.N0;
        if (wt4Var != null) {
            wt4Var.measure(View.MeasureSpec.makeMeasureSpec(v9bVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        l9b l9bVar = v9bVar.d1;
        if (l9bVar != null) {
            e34 emojiView = l9bVar.f.getEmojiView();
            Q();
            gm.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            e34 e34Var = z8bVar.j2;
            if (e34Var != null) {
                e34Var.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(v9bVar.w1.j2.getLayoutParams().height, 1073741824));
            }
            v29 v29Var = v9bVar.w1.P1;
            if (v29Var != null) {
                measureChild(v29Var, i, i2);
                if (v9bVar.w1.P1.getReactionsWindow() != null) {
                    measureChild(v9bVar.w1.P1.getReactionsWindow().c, i, i2);
                }
            }
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof xq3) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof k21) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                int L2 = gm.L(340.0f);
                if (v9bVar.W) {
                    i5 = 0;
                } else {
                    i5 = i7;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i5), 1073741824));
            }
        }
        g9b g9bVar = v9bVar.s1;
        if (g9bVar != null) {
            g9bVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            v9bVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        h9b h9bVar = v9bVar.t1;
        if (h9bVar != null) {
            h9bVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            v9bVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
