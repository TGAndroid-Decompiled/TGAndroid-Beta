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
public final class qbb extends wma {
    public final xh4 g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final rbb o0;

    public qbb(rbb rbbVar, Activity activity) {
        super(activity, null);
        this.o0 = rbbVar;
        this.k0 = false;
        this.g0 = new xh4(activity, new obb(this));
        this.h0 = new ScaleGestureDetector(activity, new pbb(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        rbb rbbVar = this.o0;
        float width = bitmap.getWidth() / rbbVar.n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = rbbVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = rbbVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(rbbVar.i0.getX() + rbbVar.r.getX(), rbbVar.i0.getY() + rbbVar.r.getY());
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
        canvas.translate(rbbVar.r.getX(), rbbVar.r.getY());
        for (int i = 0; i < rbbVar.r.getChildCount(); i++) {
            View childAt = rbbVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == rbbVar.i0) {
                    for (int i2 = 0; i2 < rbbVar.i0.getChildCount(); i2++) {
                        View childAt2 = rbbVar.i0.getChildAt(i2);
                        if (childAt2 != rbbVar.Y0 && childAt2 != rbbVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.o0.K();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.i0 = false;
        rbb rbbVar = this.o0;
        el2 el2Var = rbbVar.J0;
        boolean z2 = true;
        if (el2Var != null && el2Var.e) {
            float y = rbbVar.J0.getY() + rbbVar.j0.getY() + rbbVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + rbbVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.j0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            rbbVar.J0.a(false, true);
            rbbVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.E(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (rbbVar.r.getTranslationY() > 0.0f) {
                if (rbbVar.L > 0.4f) {
                    rbbVar.o(true);
                } else {
                    rbbVar.b();
                }
            } else {
                zt4 zt4Var = rbbVar.N0;
                if (zt4Var != null && zt4Var.getTranslationY() > 0.0f && !rbbVar.M0) {
                    if (rbbVar.R1 || rbbVar.N0.getTranslationY() >= rbbVar.N0.getPadding()) {
                        z2 = false;
                    }
                    rbbVar.c(z2);
                }
            }
            rbbVar.M0 = false;
            rbbVar.X = false;
            rbbVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        rbb rbbVar = this.o0;
        return (height - rbbVar.r.getBottom()) + rbbVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        rbb rbbVar = this.o0;
        return (height - rbbVar.c0) - rbbVar.r.getBottom();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        tt ttVar;
        o24 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        rbb rbbVar = this.o0;
        int i6 = rbbVar.a0;
        int measuredHeight2 = rbbVar.n0.getMeasuredHeight();
        if (rbbVar.W) {
            i6 = 0;
        }
        int i7 = rbbVar.T;
        int b = ete.b((measuredWidth - i7) / 2, rbbVar.Z, (measuredWidth - rbbVar.b0) - i7);
        int i8 = rbbVar.T + b;
        if (rbbVar.W) {
            i5 = rbbVar.U;
        } else {
            int i9 = rbbVar.c0;
            int i10 = rbbVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (rbbVar.K) {
                float f = rbbVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = rbbVar.U;
                }
            }
            if (i11 - i6 >= hl.L(40.0f)) {
                i6 = i11;
            }
            i5 = rbbVar.U;
        }
        rbbVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        rbbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        bbb bbbVar = rbbVar.D2;
        if (bbbVar != null) {
            bbbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        zt4 zt4Var = rbbVar.N0;
        if (zt4Var != null) {
            zt4Var.layout((measuredWidth - zt4Var.getMeasuredWidth()) / 2, 0, (rbbVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        hbb hbbVar = rbbVar.d1;
        if (hbbVar != null && (emojiView = hbbVar.f.getEmojiView()) != null) {
            emojiView.layout(rbbVar.Z, (measuredHeight - rbbVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - rbbVar.b0, measuredHeight - rbbVar.c0);
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            o24 o24Var = vabVar.d2;
            if (o24Var != null) {
                o24Var.layout(rbbVar.Z, (measuredHeight - rbbVar.c0) - o24Var.getMeasuredHeight(), measuredWidth - rbbVar.b0, measuredHeight - rbbVar.c0);
            }
            i49 i49Var = rbbVar.w1.J1;
            if (i49Var != null) {
                int i12 = rbbVar.Z;
                i49Var.layout(i12, rbbVar.a0, i49Var.getMeasuredWidth() + i12, rbbVar.w1.J1.getMeasuredHeight() + rbbVar.a0);
                if (rbbVar.w1.J1.getReactionsWindow() != null) {
                    ttVar = rbbVar.w1.J1.getReactionsWindow().c;
                } else {
                    ttVar = null;
                }
                if (ttVar != null) {
                    int i13 = rbbVar.Z;
                    ttVar.layout(i13, rbbVar.a0, ttVar.getMeasuredWidth() + i13, ttVar.getMeasuredHeight() + rbbVar.a0);
                }
            }
        }
        cbb cbbVar = rbbVar.s1;
        if (cbbVar != null) {
            cbbVar.e.setPadding(0, rbbVar.a0, 0, rbbVar.c0);
            rbbVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            rbbVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        dbb dbbVar = rbbVar.t1;
        if (dbbVar != null) {
            dbbVar.f.setPadding(0, rbbVar.a0, 0, rbbVar.c0);
            rbbVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            rbbVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof eq3) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof l11) {
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
        rbb rbbVar = this.o0;
        int i6 = (size - rbbVar.Z) - rbbVar.b0;
        int i7 = rbbVar.a0;
        int i8 = rbbVar.c0;
        int ceil = (int) Math.ceil((i6 / 9.0f) * 16.0f);
        int L = hl.L(48.0f);
        rbbVar.V = L;
        int i9 = ceil + L;
        int i10 = size2 - i8;
        if (i9 <= i10) {
            rbbVar.T = i6;
            rbbVar.U = ceil;
            if (i9 > i10 - i7) {
                z = true;
            } else {
                z = false;
            }
            rbbVar.W = z;
        } else {
            rbbVar.W = false;
            rbbVar.U = qd4.f(size2, L, i8, i7);
            rbbVar.T = (int) Math.ceil((f * 9.0f) / 16.0f);
        }
        int i11 = size2 - rbbVar.U;
        if (rbbVar.W) {
            i3 = 0;
        } else {
            i3 = i7;
        }
        rbbVar.V = Utilities.j(i11 - i3, hl.L(68.0f), hl.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (rbbVar.W) {
            i4 = systemUiVisibility | 4;
        } else {
            i4 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i4);
        rbbVar.r.measure(View.MeasureSpec.makeMeasureSpec(rbbVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(rbbVar.U + rbbVar.V, 1073741824));
        rbbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        bbb bbbVar = rbbVar.D2;
        if (bbbVar != null) {
            bbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        zt4 zt4Var = rbbVar.N0;
        if (zt4Var != null) {
            zt4Var.measure(View.MeasureSpec.makeMeasureSpec(rbbVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        hbb hbbVar = rbbVar.d1;
        if (hbbVar != null) {
            o24 emojiView = hbbVar.f.getEmojiView();
            Q();
            hl.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            o24 o24Var = vabVar.d2;
            if (o24Var != null) {
                o24Var.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(rbbVar.w1.d2.getLayoutParams().height, 1073741824));
            }
            i49 i49Var = rbbVar.w1.J1;
            if (i49Var != null) {
                measureChild(i49Var, i, i2);
                if (rbbVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(rbbVar.w1.J1.getReactionsWindow().c, i, i2);
                }
            }
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof eq3) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof l11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                int L2 = hl.L(340.0f);
                if (rbbVar.W) {
                    i5 = 0;
                } else {
                    i5 = i7;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i5), 1073741824));
            }
        }
        cbb cbbVar = rbbVar.s1;
        if (cbbVar != null) {
            cbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            rbbVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        dbb dbbVar = rbbVar.t1;
        if (dbbVar != null) {
            dbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            rbbVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
