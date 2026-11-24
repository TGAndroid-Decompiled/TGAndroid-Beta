package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class s7b extends cja {
    public final z24 m0;
    public final ScaleGestureDetector n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public float r0;
    public float s0;
    public float t0;
    public final t7b u0;

    public s7b(t7b t7bVar, Context context) {
        super(context, null);
        this.u0 = t7bVar;
        this.q0 = false;
        this.m0 = new z24(context, new q7b(this));
        this.n0 = new ScaleGestureDetector(context, new r7b(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        t7b t7bVar = this.u0;
        float width = bitmap.getWidth() / t7bVar.n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = t7bVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = t7bVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(t7bVar.i0.getX() + t7bVar.r.getX(), t7bVar.i0.getY() + t7bVar.r.getY());
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
        canvas.translate(t7bVar.r.getX(), t7bVar.r.getY());
        for (int i = 0; i < t7bVar.r.getChildCount(); i++) {
            View childAt = t7bVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == t7bVar.i0) {
                    for (int i2 = 0; i2 < t7bVar.i0.getChildCount(); i2++) {
                        View childAt2 = t7bVar.i0.getChildAt(i2);
                        if (childAt2 != t7bVar.Y0 && childAt2 != t7bVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7b.dispatchDraw(android.graphics.Canvas):void");
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
        t7b t7bVar = this.u0;
        jk2 jk2Var = t7bVar.J0;
        boolean z2 = true;
        if (jk2Var != null && jk2Var.e) {
            float y = t7bVar.J0.getY() + t7bVar.j0.getY() + t7bVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + t7bVar.J0.getHeight()) || this.p0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.p0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            t7bVar.J0.a(false, true);
            t7bVar.l0(true);
        }
        if (this.p0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.p0 = false;
        }
        this.n0.onTouchEvent(motionEvent);
        this.m0.X(motionEvent);
        if (motionEvent.getAction() == 1 && !this.o0) {
            if (t7bVar.r.getTranslationY() > 0.0f) {
                if (t7bVar.L > 0.4f) {
                    t7bVar.o(true);
                } else {
                    t7bVar.b();
                }
            } else {
                vr4 vr4Var = t7bVar.N0;
                if (vr4Var != null && vr4Var.getTranslationY() > 0.0f && !t7bVar.M0) {
                    if (t7bVar.R1 || t7bVar.N0.getTranslationY() >= t7bVar.N0.getPadding()) {
                        z2 = false;
                    }
                    t7bVar.c(z2);
                }
            }
            t7bVar.M0 = false;
            t7bVar.X = false;
            t7bVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        t7b t7bVar = this.u0;
        return (height - t7bVar.r.getBottom()) + t7bVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.u0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        t7b t7bVar = this.u0;
        return (height - t7bVar.c0) - t7bVar.r.getBottom();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        st stVar;
        t14 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        t7b t7bVar = this.u0;
        int i6 = t7bVar.a0;
        int measuredHeight2 = t7bVar.n0.getMeasuredHeight();
        if (t7bVar.W) {
            i6 = 0;
        }
        int i7 = t7bVar.T;
        int b = moe.b((measuredWidth - i7) / 2, t7bVar.Z, (measuredWidth - t7bVar.b0) - i7);
        int i8 = t7bVar.T + b;
        if (t7bVar.W) {
            i5 = t7bVar.U;
        } else {
            int i9 = t7bVar.c0;
            int i10 = t7bVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (t7bVar.K) {
                float f = t7bVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = t7bVar.U;
                }
            }
            if (i11 - i6 >= gl.L(40.0f)) {
                i6 = i11;
            }
            i5 = t7bVar.U;
        }
        t7bVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        t7bVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        d7b d7bVar = t7bVar.D2;
        if (d7bVar != null) {
            d7bVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        vr4 vr4Var = t7bVar.N0;
        if (vr4Var != null) {
            vr4Var.layout((measuredWidth - vr4Var.getMeasuredWidth()) / 2, 0, (t7bVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        j7b j7bVar = t7bVar.d1;
        if (j7bVar != null && (emojiView = j7bVar.f.getEmojiView()) != null) {
            emojiView.layout(t7bVar.Z, (measuredHeight - t7bVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - t7bVar.b0, measuredHeight - t7bVar.c0);
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            t14 t14Var = x6bVar.j2;
            if (t14Var != null) {
                t14Var.layout(t7bVar.Z, (measuredHeight - t7bVar.c0) - t14Var.getMeasuredHeight(), measuredWidth - t7bVar.b0, measuredHeight - t7bVar.c0);
            }
            t09 t09Var = t7bVar.w1.P1;
            if (t09Var != null) {
                int i12 = t7bVar.Z;
                t09Var.layout(i12, t7bVar.a0, t09Var.getMeasuredWidth() + i12, t7bVar.w1.P1.getMeasuredHeight() + t7bVar.a0);
                if (t7bVar.w1.P1.getReactionsWindow() != null) {
                    stVar = t7bVar.w1.P1.getReactionsWindow().c;
                } else {
                    stVar = null;
                }
                if (stVar != null) {
                    int i13 = t7bVar.Z;
                    stVar.layout(i13, t7bVar.a0, stVar.getMeasuredWidth() + i13, stVar.getMeasuredHeight() + t7bVar.a0);
                }
            }
        }
        e7b e7bVar = t7bVar.s1;
        if (e7bVar != null) {
            e7bVar.e.setPadding(0, t7bVar.a0, 0, t7bVar.c0);
            t7bVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            t7bVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        f7b f7bVar = t7bVar.t1;
        if (f7bVar != null) {
            f7bVar.f.setPadding(0, t7bVar.a0, 0, t7bVar.c0);
            t7bVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            t7bVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof np3) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof c11) {
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
        t7b t7bVar = this.u0;
        int i6 = (size - t7bVar.Z) - t7bVar.b0;
        int i7 = t7bVar.a0;
        int i8 = t7bVar.c0;
        int ceil = (int) Math.ceil((i6 / 9.0f) * 16.0f);
        int L = gl.L(48.0f);
        t7bVar.V = L;
        int i9 = ceil + L;
        int i10 = size2 - i8;
        if (i9 <= i10) {
            t7bVar.T = i6;
            t7bVar.U = ceil;
            if (i9 > i10 - i7) {
                z = true;
            } else {
                z = false;
            }
            t7bVar.W = z;
        } else {
            t7bVar.W = false;
            t7bVar.U = tb4.f(size2, L, i8, i7);
            t7bVar.T = (int) Math.ceil((f * 9.0f) / 16.0f);
        }
        int i11 = size2 - t7bVar.U;
        if (t7bVar.W) {
            i3 = 0;
        } else {
            i3 = i7;
        }
        t7bVar.V = Utilities.j(i11 - i3, gl.L(68.0f), gl.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (t7bVar.W) {
            i4 = systemUiVisibility | 4;
        } else {
            i4 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i4);
        t7bVar.r.measure(View.MeasureSpec.makeMeasureSpec(t7bVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(t7bVar.U + t7bVar.V, 1073741824));
        t7bVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        d7b d7bVar = t7bVar.D2;
        if (d7bVar != null) {
            d7bVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        vr4 vr4Var = t7bVar.N0;
        if (vr4Var != null) {
            vr4Var.measure(View.MeasureSpec.makeMeasureSpec(t7bVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        j7b j7bVar = t7bVar.d1;
        if (j7bVar != null) {
            t14 emojiView = j7bVar.f.getEmojiView();
            Q();
            gl.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            t14 t14Var = x6bVar.j2;
            if (t14Var != null) {
                t14Var.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(t7bVar.w1.j2.getLayoutParams().height, 1073741824));
            }
            t09 t09Var = t7bVar.w1.P1;
            if (t09Var != null) {
                measureChild(t09Var, i, i2);
                if (t7bVar.w1.P1.getReactionsWindow() != null) {
                    measureChild(t7bVar.w1.P1.getReactionsWindow().c, i, i2);
                }
            }
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof np3) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof c11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                int L2 = gl.L(340.0f);
                if (t7bVar.W) {
                    i5 = 0;
                } else {
                    i5 = i7;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i5), 1073741824));
            }
        }
        e7b e7bVar = t7bVar.s1;
        if (e7bVar != null) {
            e7bVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            t7bVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        f7b f7bVar = t7bVar.t1;
        if (f7bVar != null) {
            f7bVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            t7bVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
