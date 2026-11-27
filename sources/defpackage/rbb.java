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
public final class rbb extends wma {
    public final xh4 g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final sbb o0;

    public rbb(sbb sbbVar, Activity activity) {
        super(activity, null);
        this.o0 = sbbVar;
        this.k0 = false;
        this.g0 = new xh4(activity, new pbb(this));
        this.h0 = new ScaleGestureDetector(activity, new qbb(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        sbb sbbVar = this.o0;
        float width = bitmap.getWidth() / sbbVar.n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = sbbVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = sbbVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(sbbVar.i0.getX() + sbbVar.r.getX(), sbbVar.i0.getY() + sbbVar.r.getY());
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
        canvas.translate(sbbVar.r.getX(), sbbVar.r.getY());
        for (int i = 0; i < sbbVar.r.getChildCount(); i++) {
            View childAt = sbbVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == sbbVar.i0) {
                    for (int i2 = 0; i2 < sbbVar.i0.getChildCount(); i2++) {
                        View childAt2 = sbbVar.i0.getChildAt(i2);
                        if (childAt2 != sbbVar.Y0 && childAt2 != sbbVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbb.dispatchDraw(android.graphics.Canvas):void");
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
        sbb sbbVar = this.o0;
        el2 el2Var = sbbVar.J0;
        boolean z2 = true;
        if (el2Var != null && el2Var.e) {
            float y = sbbVar.J0.getY() + sbbVar.j0.getY() + sbbVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + sbbVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.j0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            sbbVar.J0.a(false, true);
            sbbVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.E(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (sbbVar.r.getTranslationY() > 0.0f) {
                if (sbbVar.L > 0.4f) {
                    sbbVar.o(true);
                } else {
                    sbbVar.b();
                }
            } else {
                zt4 zt4Var = sbbVar.N0;
                if (zt4Var != null && zt4Var.getTranslationY() > 0.0f && !sbbVar.M0) {
                    if (sbbVar.R1 || sbbVar.N0.getTranslationY() >= sbbVar.N0.getPadding()) {
                        z2 = false;
                    }
                    sbbVar.c(z2);
                }
            }
            sbbVar.M0 = false;
            sbbVar.X = false;
            sbbVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        sbb sbbVar = this.o0;
        return (height - sbbVar.r.getBottom()) + sbbVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sbb sbbVar = this.o0;
        return (height - sbbVar.c0) - sbbVar.r.getBottom();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        tt ttVar;
        o24 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sbb sbbVar = this.o0;
        int i6 = sbbVar.a0;
        int measuredHeight2 = sbbVar.n0.getMeasuredHeight();
        if (sbbVar.W) {
            i6 = 0;
        }
        int i7 = sbbVar.T;
        int b = ete.b((measuredWidth - i7) / 2, sbbVar.Z, (measuredWidth - sbbVar.b0) - i7);
        int i8 = sbbVar.T + b;
        if (sbbVar.W) {
            i5 = sbbVar.U;
        } else {
            int i9 = sbbVar.c0;
            int i10 = sbbVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (sbbVar.K) {
                float f = sbbVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = sbbVar.U;
                }
            }
            if (i11 - i6 >= hl.L(40.0f)) {
                i6 = i11;
            }
            i5 = sbbVar.U;
        }
        sbbVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        sbbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        cbb cbbVar = sbbVar.D2;
        if (cbbVar != null) {
            cbbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        zt4 zt4Var = sbbVar.N0;
        if (zt4Var != null) {
            zt4Var.layout((measuredWidth - zt4Var.getMeasuredWidth()) / 2, 0, (sbbVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ibb ibbVar = sbbVar.d1;
        if (ibbVar != null && (emojiView = ibbVar.f.getEmojiView()) != null) {
            emojiView.layout(sbbVar.Z, (measuredHeight - sbbVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - sbbVar.b0, measuredHeight - sbbVar.c0);
        }
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            o24 o24Var = wabVar.d2;
            if (o24Var != null) {
                o24Var.layout(sbbVar.Z, (measuredHeight - sbbVar.c0) - o24Var.getMeasuredHeight(), measuredWidth - sbbVar.b0, measuredHeight - sbbVar.c0);
            }
            i49 i49Var = sbbVar.w1.J1;
            if (i49Var != null) {
                int i12 = sbbVar.Z;
                i49Var.layout(i12, sbbVar.a0, i49Var.getMeasuredWidth() + i12, sbbVar.w1.J1.getMeasuredHeight() + sbbVar.a0);
                if (sbbVar.w1.J1.getReactionsWindow() != null) {
                    ttVar = sbbVar.w1.J1.getReactionsWindow().c;
                } else {
                    ttVar = null;
                }
                if (ttVar != null) {
                    int i13 = sbbVar.Z;
                    ttVar.layout(i13, sbbVar.a0, ttVar.getMeasuredWidth() + i13, ttVar.getMeasuredHeight() + sbbVar.a0);
                }
            }
        }
        dbb dbbVar = sbbVar.s1;
        if (dbbVar != null) {
            dbbVar.e.setPadding(0, sbbVar.a0, 0, sbbVar.c0);
            sbbVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            sbbVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ebb ebbVar = sbbVar.t1;
        if (ebbVar != null) {
            ebbVar.f.setPadding(0, sbbVar.a0, 0, sbbVar.c0);
            sbbVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            sbbVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        sbb sbbVar = this.o0;
        int i6 = (size - sbbVar.Z) - sbbVar.b0;
        int i7 = sbbVar.a0;
        int i8 = sbbVar.c0;
        int ceil = (int) Math.ceil((i6 / 9.0f) * 16.0f);
        int L = hl.L(48.0f);
        sbbVar.V = L;
        int i9 = ceil + L;
        int i10 = size2 - i8;
        if (i9 <= i10) {
            sbbVar.T = i6;
            sbbVar.U = ceil;
            if (i9 > i10 - i7) {
                z = true;
            } else {
                z = false;
            }
            sbbVar.W = z;
        } else {
            sbbVar.W = false;
            sbbVar.U = qd4.f(size2, L, i8, i7);
            sbbVar.T = (int) Math.ceil((f * 9.0f) / 16.0f);
        }
        int i11 = size2 - sbbVar.U;
        if (sbbVar.W) {
            i3 = 0;
        } else {
            i3 = i7;
        }
        sbbVar.V = Utilities.j(i11 - i3, hl.L(68.0f), hl.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (sbbVar.W) {
            i4 = systemUiVisibility | 4;
        } else {
            i4 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i4);
        sbbVar.r.measure(View.MeasureSpec.makeMeasureSpec(sbbVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(sbbVar.U + sbbVar.V, 1073741824));
        sbbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        cbb cbbVar = sbbVar.D2;
        if (cbbVar != null) {
            cbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        zt4 zt4Var = sbbVar.N0;
        if (zt4Var != null) {
            zt4Var.measure(View.MeasureSpec.makeMeasureSpec(sbbVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ibb ibbVar = sbbVar.d1;
        if (ibbVar != null) {
            o24 emojiView = ibbVar.f.getEmojiView();
            Q();
            hl.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            o24 o24Var = wabVar.d2;
            if (o24Var != null) {
                o24Var.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(sbbVar.w1.d2.getLayoutParams().height, 1073741824));
            }
            i49 i49Var = sbbVar.w1.J1;
            if (i49Var != null) {
                measureChild(i49Var, i, i2);
                if (sbbVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(sbbVar.w1.J1.getReactionsWindow().c, i, i2);
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
                if (sbbVar.W) {
                    i5 = 0;
                } else {
                    i5 = i7;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i5), 1073741824));
            }
        }
        dbb dbbVar = sbbVar.s1;
        if (dbbVar != null) {
            dbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            sbbVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ebb ebbVar = sbbVar.t1;
        if (ebbVar != null) {
            ebbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            sbbVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
