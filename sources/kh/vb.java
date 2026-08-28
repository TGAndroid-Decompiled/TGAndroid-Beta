package kh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xu0;
public final class vb extends xu0 {
    public final wb A0;
    public final n5.e0 f16213s0;
    public final ScaleGestureDetector f16214t0;
    public boolean f16215u0;
    public boolean f16216v0;
    public boolean f16217w0;
    public float f16218x0;
    public float f16219y0;
    public float f16220z0;

    public vb(wb wbVar, Activity activity) {
        super(activity, null);
        this.A0 = wbVar;
        this.f16217w0 = false;
        this.f16213s0 = new n5.e0(activity, new tb(this));
        this.f16214t0 = new ScaleGestureDetector(activity, new ub(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        wb wbVar = this.A0;
        float width = bitmap.getWidth() / wbVar.f16287n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = wbVar.T0.getTextureView();
        if (textureView == null) {
            textureView = wbVar.T0.f15951r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(wbVar.f16257d0.getX() + wbVar.f16300r.getX(), wbVar.f16257d0.getY() + wbVar.f16300r.getY());
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
        canvas.translate(wbVar.f16300r.getX(), wbVar.f16300r.getY());
        for (int i9 = 0; i9 < wbVar.f16300r.getChildCount(); i9++) {
            View childAt = wbVar.f16300r.getChildAt(i9);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == wbVar.f16257d0) {
                    for (int i10 = 0; i10 < wbVar.f16257d0.getChildCount(); i10++) {
                        View childAt2 = wbVar.f16257d0.getChildAt(i10);
                        if (childAt2 != wbVar.T0 && childAt2 != wbVar.f16322x0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: kh.vb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.A0.M();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f16215u0 = false;
        wb wbVar = this.A0;
        z zVar = wbVar.E0;
        boolean z11 = true;
        if (zVar != null && zVar.f16418e) {
            float y10 = wbVar.E0.getY() + wbVar.f16261e0.getY() + wbVar.f16300r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + wbVar.E0.getHeight()) || this.f16216v0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f16216v0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            wbVar.E0.a(false, true);
            wbVar.m0(true);
        }
        if (this.f16216v0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f16216v0 = false;
        }
        this.f16214t0.onTouchEvent(motionEvent);
        this.f16213s0.a1(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f16215u0) {
            if (wbVar.f16300r.getTranslationY() > 0.0f) {
                if (wbVar.G > 0.4f) {
                    wbVar.q(true);
                } else {
                    wb.c(wbVar);
                }
            } else {
                va vaVar = wbVar.I0;
                if (vaVar != null && vaVar.getTranslationY() > 0.0f && !wbVar.H0) {
                    wbVar.f((wbVar.M1 || wbVar.I0.getTranslationY() >= ((float) wbVar.I0.getPadding())) ? false : false);
                }
            }
            wbVar.H0 = false;
            wbVar.S = false;
            wbVar.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        wb wbVar = this.A0;
        return (height - wbVar.f16300r.getBottom()) + wbVar.Q;
    }

    public int getBottomPadding2() {
        return getHeight() - this.A0.f16300r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        wb wbVar = this.A0;
        return (height - wbVar.X) - wbVar.f16300r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        fh.v vVar;
        wy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        wb wbVar = this.A0;
        int i14 = wbVar.V;
        int measuredHeight2 = wbVar.f16274i0.getMeasuredHeight();
        if (wbVar.R) {
            i14 = 0;
        }
        int i15 = wbVar.O;
        int b10 = g7.n.b((measuredWidth - i15) / 2, wbVar.U, (measuredWidth - wbVar.W) - i15);
        int i16 = wbVar.O + b10;
        if (wbVar.R) {
            i13 = wbVar.P;
        } else {
            int i17 = wbVar.X;
            int i18 = wbVar.P;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (wbVar.F == 1) {
                float f10 = wbVar.D.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = wbVar.P;
                }
            }
            if (i19 - i14 >= AndroidUtilities.dp(40.0f)) {
                i14 = i19;
            }
            i13 = wbVar.P;
        }
        wbVar.f16300r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        wbVar.f16304s.f16010b.layout(0, 0, measuredWidth, measuredHeight);
        eb ebVar = wbVar.f16328y2;
        if (ebVar != null) {
            ebVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        va vaVar = wbVar.I0;
        if (vaVar != null) {
            vaVar.layout((measuredWidth - vaVar.getMeasuredWidth()) / 2, 0, (wbVar.I0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null && (emojiView = mbVar.f15632f.getEmojiView()) != null) {
            emojiView.layout(wbVar.U, (measuredHeight - wbVar.X) - emojiView.getMeasuredHeight(), measuredWidth - wbVar.W, measuredHeight - wbVar.X);
        }
        ya yaVar = wbVar.f16302r1;
        if (yaVar != null) {
            wy wyVar = yaVar.f15289l2;
            if (wyVar != null) {
                wyVar.layout(wbVar.U, (measuredHeight - wbVar.X) - wyVar.getMeasuredHeight(), measuredWidth - wbVar.W, measuredHeight - wbVar.X);
            }
            uj0 uj0Var = wbVar.f16302r1.V1;
            if (uj0Var != null) {
                int i20 = wbVar.U;
                uj0Var.layout(i20, wbVar.V, uj0Var.getMeasuredWidth() + i20, wbVar.f16302r1.V1.getMeasuredHeight() + wbVar.V);
                if (wbVar.f16302r1.V1.getReactionsWindow() != null) {
                    vVar = wbVar.f16302r1.V1.getReactionsWindow().f10576c;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    int i21 = wbVar.U;
                    vVar.layout(i21, wbVar.V, vVar.getMeasuredWidth() + i21, vVar.getMeasuredHeight() + wbVar.V);
                }
            }
        }
        gb gbVar = wbVar.f16289n1;
        if (gbVar != null) {
            gbVar.f15496e.setPadding(0, wbVar.V, 0, wbVar.X);
            wbVar.f16289n1.layout(0, 0, measuredWidth, measuredHeight);
            wbVar.f16289n1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        hb hbVar = wbVar.f16292o1;
        if (hbVar != null) {
            hbVar.f15724f.setPadding(0, wbVar.V, 0, wbVar.X);
            wbVar.f16292o1.layout(0, 0, measuredWidth, measuredHeight);
            wbVar.f16292o1.f15723e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof u0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.layout(0, i14, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i14);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        wb wbVar = this.A0;
        int i14 = (size - wbVar.U) - wbVar.W;
        int i15 = wbVar.V;
        int i16 = wbVar.X;
        int ceil = (int) Math.ceil((i14 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        wbVar.Q = dp;
        int i17 = ceil + dp;
        int i18 = size2 - i16;
        if (i17 <= i18) {
            wbVar.O = i14;
            wbVar.P = ceil;
            if (i17 > i18 - i15) {
                z10 = true;
            } else {
                z10 = false;
            }
            wbVar.R = z10;
        } else {
            wbVar.R = false;
            int i19 = ((size2 - dp) - i16) - i15;
            wbVar.P = i19;
            wbVar.O = (int) Math.ceil((i19 * 9.0f) / 16.0f);
        }
        int i20 = size2 - wbVar.P;
        if (wbVar.R) {
            i11 = 0;
        } else {
            i11 = i15;
        }
        wbVar.Q = Utilities.clamp(i20 - i11, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (wbVar.R) {
            i12 = systemUiVisibility | 4;
        } else {
            i12 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i12);
        wbVar.f16300r.measure(View.MeasureSpec.makeMeasureSpec(wbVar.O, 1073741824), View.MeasureSpec.makeMeasureSpec(wbVar.P + wbVar.Q, 1073741824));
        wbVar.f16304s.f16010b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        eb ebVar = wbVar.f16328y2;
        if (ebVar != null) {
            ebVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        va vaVar = wbVar.I0;
        if (vaVar != null) {
            vaVar.measure(View.MeasureSpec.makeMeasureSpec(wbVar.O, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null) {
            wy emojiView = mbVar.f15632f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        ya yaVar = wbVar.f16302r1;
        if (yaVar != null) {
            wy wyVar = yaVar.f15289l2;
            if (wyVar != null) {
                wyVar.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(wbVar.f16302r1.f15289l2.getLayoutParams().height, 1073741824));
            }
            uj0 uj0Var = wbVar.f16302r1.V1;
            if (uj0Var != null) {
                measureChild(uj0Var, i9, i10);
                if (wbVar.f16302r1.V1.getReactionsWindow() != null) {
                    measureChild(wbVar.f16302r1.V1.getReactionsWindow().f10576c, i9, i10);
                }
            }
        }
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt instanceof u0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (wbVar.R) {
                    i13 = 0;
                } else {
                    i13 = i15;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i13), 1073741824));
            }
        }
        gb gbVar = wbVar.f16289n1;
        if (gbVar != null) {
            gbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            wbVar.f16289n1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        hb hbVar = wbVar.f16292o1;
        if (hbVar != null) {
            hbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            wbVar.f16292o1.f15723e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
