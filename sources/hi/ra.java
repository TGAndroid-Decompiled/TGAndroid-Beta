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
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.st0;
public final class ra extends st0 {
    public final ff f15003g0;
    public final ScaleGestureDetector f15004h0;
    public boolean f15005i0;
    public boolean f15006j0;
    public boolean f15007k0;
    public float f15008l0;
    public float m0;
    public float f15009n0;
    public final sa f15010o0;

    public ra(sa saVar, Activity activity) {
        super(activity, null);
        this.f15010o0 = saVar;
        this.f15007k0 = false;
        this.f15003g0 = new ff(activity, new pa(this));
        this.f15004h0 = new ScaleGestureDetector(activity, new qa(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        sa saVar = this.f15010o0;
        float width = bitmap.getWidth() / saVar.f15076n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = saVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = saVar.Y0.f15360r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(saVar.f15063i0.getX() + saVar.f15088r.getX(), saVar.f15063i0.getY() + saVar.f15088r.getY());
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
        canvas.translate(saVar.f15088r.getX(), saVar.f15088r.getY());
        for (int i7 = 0; i7 < saVar.f15088r.getChildCount(); i7++) {
            View childAt = saVar.f15088r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == saVar.f15063i0) {
                    for (int i10 = 0; i10 < saVar.f15063i0.getChildCount(); i10++) {
                        View childAt2 = saVar.f15063i0.getChildAt(i10);
                        if (childAt2 != saVar.Y0 && childAt2 != saVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.ra.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f15010o0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f15005i0 = false;
        sa saVar = this.f15010o0;
        y yVar = saVar.J0;
        boolean z11 = true;
        if (yVar != null && yVar.f15403e) {
            float y10 = saVar.J0.getY() + saVar.f15066j0.getY() + saVar.f15088r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + saVar.J0.getHeight()) || this.f15006j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f15006j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            saVar.J0.a(false, true);
            saVar.l0(true);
        }
        if (this.f15006j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f15006j0 = false;
        }
        this.f15004h0.onTouchEvent(motionEvent);
        this.f15003g0.B0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f15005i0) {
            if (saVar.f15088r.getTranslationY() > 0.0f) {
                if (saVar.L > 0.4f) {
                    saVar.p(true);
                } else {
                    sa.b(saVar);
                }
            } else {
                g3 g3Var = saVar.N0;
                if (g3Var != null && g3Var.getTranslationY() > 0.0f && !saVar.M0) {
                    if (saVar.R1 || saVar.N0.getTranslationY() >= saVar.N0.getPadding()) {
                        z11 = false;
                    }
                    saVar.e(z11);
                }
            }
            saVar.M0 = false;
            saVar.X = false;
            saVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        sa saVar = this.f15010o0;
        return (height - saVar.f15088r.getBottom()) + saVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f15010o0.f15088r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sa saVar = this.f15010o0;
        return (height - saVar.f15044c0) - saVar.f15088r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        ai.j0 j0Var;
        ly emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sa saVar = this.f15010o0;
        int i14 = saVar.f15036a0;
        int measuredHeight2 = saVar.f15077n0.getMeasuredHeight();
        if (saVar.W) {
            i14 = 0;
        }
        int i15 = saVar.T;
        int b10 = c8.i9.b((measuredWidth - i15) / 2, saVar.Z, (measuredWidth - saVar.f15040b0) - i15);
        int i16 = saVar.T + b10;
        if (saVar.W) {
            i13 = saVar.U;
        } else {
            int i17 = saVar.f15044c0;
            int i18 = saVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (saVar.K == 1) {
                float f10 = saVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = saVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = saVar.U;
        }
        saVar.f15088r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        saVar.f15092s.f14740b.layout(0, 0, measuredWidth, measuredHeight);
        aa aaVar = saVar.D2;
        if (aaVar != null) {
            aaVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        g3 g3Var = saVar.N0;
        if (g3Var != null) {
            g3Var.layout((measuredWidth - g3Var.getMeasuredWidth()) / 2, 0, (saVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ia iaVar = saVar.f15048d1;
        if (iaVar != null && (emojiView = iaVar.f14623f.getEmojiView()) != null) {
            emojiView.layout(saVar.Z, (measuredHeight - saVar.f15044c0) - emojiView.getMeasuredHeight(), measuredWidth - saVar.f15040b0, measuredHeight - saVar.f15044c0);
        }
        u9 u9Var = saVar.f15107w1;
        if (u9Var != null) {
            ly lyVar = u9Var.Z1;
            if (lyVar != null) {
                lyVar.layout(saVar.Z, (measuredHeight - saVar.f15044c0) - lyVar.getMeasuredHeight(), measuredWidth - saVar.f15040b0, measuredHeight - saVar.f15044c0);
            }
            mi0 mi0Var = saVar.f15107w1.J1;
            if (mi0Var != null) {
                int i20 = saVar.Z;
                mi0Var.layout(i20, saVar.f15036a0, mi0Var.getMeasuredWidth() + i20, saVar.f15107w1.J1.getMeasuredHeight() + saVar.f15036a0);
                if (saVar.f15107w1.J1.getReactionsWindow() != null) {
                    j0Var = saVar.f15107w1.J1.getReactionsWindow().f5010c;
                } else {
                    j0Var = null;
                }
                if (j0Var != null) {
                    int i21 = saVar.Z;
                    j0Var.layout(i21, saVar.f15036a0, j0Var.getMeasuredWidth() + i21, j0Var.getMeasuredHeight() + saVar.f15036a0);
                }
            }
        }
        ca caVar = saVar.f15094s1;
        if (caVar != null) {
            caVar.f14444e.setPadding(0, saVar.f15036a0, 0, saVar.f15044c0);
            saVar.f15094s1.layout(0, 0, measuredWidth, measuredHeight);
            saVar.f15094s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        da daVar = saVar.f15097t1;
        if (daVar != null) {
            daVar.f14723f.setPadding(0, saVar.f15036a0, 0, saVar.f15044c0);
            saVar.f15097t1.layout(0, 0, measuredWidth, measuredHeight);
            saVar.f15097t1.f14722e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.qa) {
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
        sa saVar = this.f15010o0;
        int i15 = (size - saVar.Z) - saVar.f15040b0;
        int i16 = saVar.f15036a0;
        int i17 = saVar.f15044c0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        saVar.V = L;
        int i18 = ceil + L;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            saVar.T = i15;
            saVar.U = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            saVar.W = z10;
        } else {
            saVar.W = false;
            saVar.U = ((size2 - L) - i17) - i16;
            saVar.T = (int) Math.ceil((i11 * 9.0f) / 16.0f);
        }
        int i20 = size2 - saVar.U;
        if (saVar.W) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        saVar.V = Utilities.j(i20 - i12, org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (saVar.W) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        saVar.f15088r.measure(View.MeasureSpec.makeMeasureSpec(saVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(saVar.U + saVar.V, 1073741824));
        saVar.f15092s.f14740b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        aa aaVar = saVar.D2;
        if (aaVar != null) {
            aaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        g3 g3Var = saVar.N0;
        if (g3Var != null) {
            g3Var.measure(View.MeasureSpec.makeMeasureSpec(saVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ia iaVar = saVar.f15048d1;
        if (iaVar != null) {
            ly emojiView = iaVar.f14623f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        u9 u9Var = saVar.f15107w1;
        if (u9Var != null) {
            ly lyVar = u9Var.Z1;
            if (lyVar != null) {
                lyVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(saVar.f15107w1.Z1.getLayoutParams().height, 1073741824));
            }
            mi0 mi0Var = saVar.f15107w1.J1;
            if (mi0Var != null) {
                measureChild(mi0Var, i7, i10);
                if (saVar.f15107w1.J1.getReactionsWindow() != null) {
                    measureChild(saVar.f15107w1.J1.getReactionsWindow().f5010c, i7, i10);
                }
            }
        }
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.qa) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int L2 = org.telegram.messenger.g0.L(340.0f);
                if (saVar.W) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i14), 1073741824));
            }
        }
        ca caVar = saVar.f15094s1;
        if (caVar != null) {
            caVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            saVar.f15094s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        da daVar = saVar.f15097t1;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            saVar.f15097t1.f14722e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
