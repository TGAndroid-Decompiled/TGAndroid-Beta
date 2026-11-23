package hi;

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
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xi0;
public final class mb extends cu0 {
    public final org.telegram.ui.Cells.aa f14919g0;
    public final ScaleGestureDetector f14920h0;
    public boolean f14921i0;
    public boolean f14922j0;
    public boolean f14923k0;
    public float f14924l0;
    public float m0;
    public float f14925n0;
    public final nb f14926o0;

    public mb(nb nbVar, Activity activity) {
        super(activity, null);
        this.f14926o0 = nbVar;
        this.f14923k0 = false;
        this.f14919g0 = new org.telegram.ui.Cells.aa(activity, new kb(this));
        this.f14920h0 = new ScaleGestureDetector(activity, new lb(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        nb nbVar = this.f14926o0;
        float width = bitmap.getWidth() / nbVar.f15095n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = nbVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = nbVar.Y0.f14466r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(nbVar.f15082i0.getX() + nbVar.f15107r.getX(), nbVar.f15082i0.getY() + nbVar.f15107r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f10), (int) (textureView.getHeight() / f10));
                float f11 = 1.0f / width;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(nbVar.f15107r.getX(), nbVar.f15107r.getY());
        for (int i7 = 0; i7 < nbVar.f15107r.getChildCount(); i7++) {
            View childAt = nbVar.f15107r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == nbVar.f15082i0) {
                    for (int i10 = 0; i10 < nbVar.f15082i0.getChildCount(); i10++) {
                        View childAt2 = nbVar.f15082i0.getChildAt(i10);
                        if (childAt2 != nbVar.Y0 && childAt2 != nbVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.mb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f14926o0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f14921i0 = false;
        nb nbVar = this.f14926o0;
        h0 h0Var = nbVar.J0;
        boolean z11 = true;
        if (h0Var != null && h0Var.f14570e) {
            float y10 = nbVar.J0.getY() + nbVar.f15085j0.getY() + nbVar.f15107r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + nbVar.J0.getHeight()) || this.f14922j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f14922j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            nbVar.J0.a(false, true);
            nbVar.l0(true);
        }
        if (this.f14922j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f14922j0 = false;
        }
        this.f14920h0.onTouchEvent(motionEvent);
        this.f14919g0.I2(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f14921i0) {
            if (nbVar.f15107r.getTranslationY() > 0.0f) {
                if (nbVar.L > 0.4f) {
                    nbVar.p(true);
                } else {
                    nb.b(nbVar);
                }
            } else {
                p3 p3Var = nbVar.N0;
                if (p3Var != null && p3Var.getTranslationY() > 0.0f && !nbVar.M0) {
                    if (nbVar.R1 || nbVar.N0.getTranslationY() >= nbVar.N0.getPadding()) {
                        z11 = false;
                    }
                    nbVar.e(z11);
                }
            }
            nbVar.M0 = false;
            nbVar.X = false;
            nbVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        nb nbVar = this.f14926o0;
        return (height - nbVar.f15107r.getBottom()) + nbVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f14926o0.f15107r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        nb nbVar = this.f14926o0;
        return (height - nbVar.f15063c0) - nbVar.f15107r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        ai.h0 h0Var;
        qy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        nb nbVar = this.f14926o0;
        int i14 = nbVar.f15055a0;
        int measuredHeight2 = nbVar.f15096n0.getMeasuredHeight();
        if (nbVar.W) {
            i14 = 0;
        }
        int i15 = nbVar.T;
        int b10 = c8.m9.b((measuredWidth - i15) / 2, nbVar.Z, (measuredWidth - nbVar.f15059b0) - i15);
        int i16 = nbVar.T + b10;
        if (nbVar.W) {
            i13 = nbVar.U;
        } else {
            int i17 = nbVar.f15063c0;
            int i18 = nbVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (nbVar.K == 1) {
                float f10 = nbVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = nbVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = nbVar.U;
        }
        nbVar.f15107r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        nbVar.f15111s.f15654b.layout(0, 0, measuredWidth, measuredHeight);
        va vaVar = nbVar.D2;
        if (vaVar != null) {
            vaVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        p3 p3Var = nbVar.N0;
        if (p3Var != null) {
            p3Var.layout((measuredWidth - p3Var.getMeasuredWidth()) / 2, 0, (nbVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        db dbVar = nbVar.f15067d1;
        if (dbVar != null && (emojiView = dbVar.f14936f.getEmojiView()) != null) {
            emojiView.layout(nbVar.Z, (measuredHeight - nbVar.f15063c0) - emojiView.getMeasuredHeight(), measuredWidth - nbVar.f15059b0, measuredHeight - nbVar.f15063c0);
        }
        pa paVar = nbVar.f15126w1;
        if (paVar != null) {
            qy qyVar = paVar.d2;
            if (qyVar != null) {
                qyVar.layout(nbVar.Z, (measuredHeight - nbVar.f15063c0) - qyVar.getMeasuredHeight(), measuredWidth - nbVar.f15059b0, measuredHeight - nbVar.f15063c0);
            }
            xi0 xi0Var = nbVar.f15126w1.J1;
            if (xi0Var != null) {
                int i20 = nbVar.Z;
                xi0Var.layout(i20, nbVar.f15055a0, xi0Var.getMeasuredWidth() + i20, nbVar.f15126w1.J1.getMeasuredHeight() + nbVar.f15055a0);
                if (nbVar.f15126w1.J1.getReactionsWindow() != null) {
                    h0Var = nbVar.f15126w1.J1.getReactionsWindow().f5291c;
                } else {
                    h0Var = null;
                }
                if (h0Var != null) {
                    int i21 = nbVar.Z;
                    h0Var.layout(i21, nbVar.f15055a0, h0Var.getMeasuredWidth() + i21, h0Var.getMeasuredHeight() + nbVar.f15055a0);
                }
            }
        }
        xa xaVar = nbVar.f15113s1;
        if (xaVar != null) {
            xaVar.f15355e.setPadding(0, nbVar.f15055a0, 0, nbVar.f15063c0);
            nbVar.f15113s1.layout(0, 0, measuredWidth, measuredHeight);
            nbVar.f15113s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ya yaVar = nbVar.f15116t1;
        if (yaVar != null) {
            yaVar.f15636f.setPadding(0, nbVar.f15055a0, 0, nbVar.f15063c0);
            nbVar.f15116t1.layout(0, 0, measuredWidth, measuredHeight);
            nbVar.f15116t1.f15635e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof c1) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.ya) {
                childAt.layout(0, i14, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i14);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        nb nbVar = this.f14926o0;
        int i15 = (size - nbVar.Z) - nbVar.f15059b0;
        int i16 = nbVar.f15055a0;
        int i17 = nbVar.f15063c0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        nbVar.V = L;
        int i18 = ceil + L;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            nbVar.T = i15;
            nbVar.U = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            nbVar.W = z10;
        } else {
            nbVar.W = false;
            nbVar.U = ((size2 - L) - i17) - i16;
            nbVar.T = (int) Math.ceil((i11 * 9.0f) / 16.0f);
        }
        int i20 = size2 - nbVar.U;
        if (nbVar.W) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        nbVar.V = Utilities.j(i20 - i12, org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (nbVar.W) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        nbVar.f15107r.measure(View.MeasureSpec.makeMeasureSpec(nbVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(nbVar.U + nbVar.V, 1073741824));
        nbVar.f15111s.f15654b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        va vaVar = nbVar.D2;
        if (vaVar != null) {
            vaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        p3 p3Var = nbVar.N0;
        if (p3Var != null) {
            p3Var.measure(View.MeasureSpec.makeMeasureSpec(nbVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        db dbVar = nbVar.f15067d1;
        if (dbVar != null) {
            qy emojiView = dbVar.f14936f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        pa paVar = nbVar.f15126w1;
        if (paVar != null) {
            qy qyVar = paVar.d2;
            if (qyVar != null) {
                qyVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(nbVar.f15126w1.d2.getLayoutParams().height, 1073741824));
            }
            xi0 xi0Var = nbVar.f15126w1.J1;
            if (xi0Var != null) {
                measureChild(xi0Var, i7, i10);
                if (nbVar.f15126w1.J1.getReactionsWindow() != null) {
                    measureChild(nbVar.f15126w1.J1.getReactionsWindow().f5291c, i7, i10);
                }
            }
        }
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt instanceof c1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.ya) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int L2 = org.telegram.messenger.g0.L(340.0f);
                if (nbVar.W) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i14), 1073741824));
            }
        }
        xa xaVar = nbVar.f15113s1;
        if (xaVar != null) {
            xaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            nbVar.f15113s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ya yaVar = nbVar.f15116t1;
        if (yaVar != null) {
            yaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            nbVar.f15116t1.f15635e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
