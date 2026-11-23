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
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xi0;
public final class sa extends du0 {
    public final pf f15341g0;
    public final ScaleGestureDetector f15342h0;
    public boolean f15343i0;
    public boolean f15344j0;
    public boolean f15345k0;
    public float f15346l0;
    public float m0;
    public float f15347n0;
    public final ta f15348o0;

    public sa(ta taVar, Activity activity) {
        super(activity, null);
        this.f15348o0 = taVar;
        this.f15345k0 = false;
        this.f15341g0 = new pf(activity, new qa(this));
        this.f15342h0 = new ScaleGestureDetector(activity, new ra(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        ta taVar = this.f15348o0;
        float width = bitmap.getWidth() / taVar.f15428n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = taVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = taVar.Y0.f15616r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(taVar.f15415i0.getX() + taVar.f15440r.getX(), taVar.f15415i0.getY() + taVar.f15440r.getY());
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
        canvas.translate(taVar.f15440r.getX(), taVar.f15440r.getY());
        for (int i7 = 0; i7 < taVar.f15440r.getChildCount(); i7++) {
            View childAt = taVar.f15440r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == taVar.f15415i0) {
                    for (int i10 = 0; i10 < taVar.f15415i0.getChildCount(); i10++) {
                        View childAt2 = taVar.f15415i0.getChildAt(i10);
                        if (childAt2 != taVar.Y0 && childAt2 != taVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.sa.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f15348o0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f15343i0 = false;
        ta taVar = this.f15348o0;
        y yVar = taVar.J0;
        boolean z11 = true;
        if (yVar != null && yVar.f15704e) {
            float y10 = taVar.J0.getY() + taVar.f15418j0.getY() + taVar.f15440r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + taVar.J0.getHeight()) || this.f15344j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f15344j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            taVar.J0.a(false, true);
            taVar.l0(true);
        }
        if (this.f15344j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f15344j0 = false;
        }
        this.f15342h0.onTouchEvent(motionEvent);
        this.f15341g0.w0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f15343i0) {
            if (taVar.f15440r.getTranslationY() > 0.0f) {
                if (taVar.L > 0.4f) {
                    taVar.p(true);
                } else {
                    ta.b(taVar);
                }
            } else {
                g3 g3Var = taVar.N0;
                if (g3Var != null && g3Var.getTranslationY() > 0.0f && !taVar.M0) {
                    if (taVar.R1 || taVar.N0.getTranslationY() >= taVar.N0.getPadding()) {
                        z11 = false;
                    }
                    taVar.e(z11);
                }
            }
            taVar.M0 = false;
            taVar.X = false;
            taVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        ta taVar = this.f15348o0;
        return (height - taVar.f15440r.getBottom()) + taVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f15348o0.f15440r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ta taVar = this.f15348o0;
        return (height - taVar.f15396c0) - taVar.f15440r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        ai.g0 g0Var;
        ty emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ta taVar = this.f15348o0;
        int i14 = taVar.f15388a0;
        int measuredHeight2 = taVar.f15429n0.getMeasuredHeight();
        if (taVar.W) {
            i14 = 0;
        }
        int i15 = taVar.T;
        int b10 = c8.m9.b((measuredWidth - i15) / 2, taVar.Z, (measuredWidth - taVar.f15392b0) - i15);
        int i16 = taVar.T + b10;
        if (taVar.W) {
            i13 = taVar.U;
        } else {
            int i17 = taVar.f15396c0;
            int i18 = taVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (taVar.K == 1) {
                float f10 = taVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = taVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = taVar.U;
        }
        taVar.f15440r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        taVar.f15444s.f15050b.layout(0, 0, measuredWidth, measuredHeight);
        ba baVar = taVar.D2;
        if (baVar != null) {
            baVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        g3 g3Var = taVar.N0;
        if (g3Var != null) {
            g3Var.layout((measuredWidth - g3Var.getMeasuredWidth()) / 2, 0, (taVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ja jaVar = taVar.f15400d1;
        if (jaVar != null && (emojiView = jaVar.f14971f.getEmojiView()) != null) {
            emojiView.layout(taVar.Z, (measuredHeight - taVar.f15396c0) - emojiView.getMeasuredHeight(), measuredWidth - taVar.f15392b0, measuredHeight - taVar.f15396c0);
        }
        v9 v9Var = taVar.f15459w1;
        if (v9Var != null) {
            ty tyVar = v9Var.Z1;
            if (tyVar != null) {
                tyVar.layout(taVar.Z, (measuredHeight - taVar.f15396c0) - tyVar.getMeasuredHeight(), measuredWidth - taVar.f15392b0, measuredHeight - taVar.f15396c0);
            }
            xi0 xi0Var = taVar.f15459w1.J1;
            if (xi0Var != null) {
                int i20 = taVar.Z;
                xi0Var.layout(i20, taVar.f15388a0, xi0Var.getMeasuredWidth() + i20, taVar.f15459w1.J1.getMeasuredHeight() + taVar.f15388a0);
                if (taVar.f15459w1.J1.getReactionsWindow() != null) {
                    g0Var = taVar.f15459w1.J1.getReactionsWindow().f5291c;
                } else {
                    g0Var = null;
                }
                if (g0Var != null) {
                    int i21 = taVar.Z;
                    g0Var.layout(i21, taVar.f15388a0, g0Var.getMeasuredWidth() + i21, g0Var.getMeasuredHeight() + taVar.f15388a0);
                }
            }
        }
        da daVar = taVar.f15446s1;
        if (daVar != null) {
            daVar.f14797e.setPadding(0, taVar.f15388a0, 0, taVar.f15396c0);
            taVar.f15446s1.layout(0, 0, measuredWidth, measuredHeight);
            taVar.f15446s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ea eaVar = taVar.f15449t1;
        if (eaVar != null) {
            eaVar.f15032f.setPadding(0, taVar.f15388a0, 0, taVar.f15396c0);
            taVar.f15449t1.layout(0, 0, measuredWidth, measuredHeight);
            taVar.f15449t1.f15031e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.za) {
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
        ta taVar = this.f15348o0;
        int i15 = (size - taVar.Z) - taVar.f15392b0;
        int i16 = taVar.f15388a0;
        int i17 = taVar.f15396c0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        taVar.V = L;
        int i18 = ceil + L;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            taVar.T = i15;
            taVar.U = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            taVar.W = z10;
        } else {
            taVar.W = false;
            taVar.U = ((size2 - L) - i17) - i16;
            taVar.T = (int) Math.ceil((i11 * 9.0f) / 16.0f);
        }
        int i20 = size2 - taVar.U;
        if (taVar.W) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        taVar.V = Utilities.j(i20 - i12, org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (taVar.W) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        taVar.f15440r.measure(View.MeasureSpec.makeMeasureSpec(taVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(taVar.U + taVar.V, 1073741824));
        taVar.f15444s.f15050b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ba baVar = taVar.D2;
        if (baVar != null) {
            baVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        g3 g3Var = taVar.N0;
        if (g3Var != null) {
            g3Var.measure(View.MeasureSpec.makeMeasureSpec(taVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ja jaVar = taVar.f15400d1;
        if (jaVar != null) {
            ty emojiView = jaVar.f14971f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        v9 v9Var = taVar.f15459w1;
        if (v9Var != null) {
            ty tyVar = v9Var.Z1;
            if (tyVar != null) {
                tyVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(taVar.f15459w1.Z1.getLayoutParams().height, 1073741824));
            }
            xi0 xi0Var = taVar.f15459w1.J1;
            if (xi0Var != null) {
                measureChild(xi0Var, i7, i10);
                if (taVar.f15459w1.J1.getReactionsWindow() != null) {
                    measureChild(taVar.f15459w1.J1.getReactionsWindow().f5291c, i7, i10);
                }
            }
        }
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int L2 = org.telegram.messenger.g0.L(340.0f);
                if (taVar.W) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i14), 1073741824));
            }
        }
        da daVar = taVar.f15446s1;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            taVar.f15446s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ea eaVar = taVar.f15449t1;
        if (eaVar != null) {
            eaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            taVar.f15449t1.f15031e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
