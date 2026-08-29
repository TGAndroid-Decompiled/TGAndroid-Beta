package nh;

import android.app.Activity;
import android.content.Context;
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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.hv0;
public final class fb extends hv0 {
    public final gb A0;
    public final o4.g f17682s0;
    public final ScaleGestureDetector f17683t0;
    public boolean f17684u0;
    public boolean f17685v0;
    public boolean f17686w0;
    public float f17687x0;
    public float f17688y0;
    public float f17689z0;

    public fb(gb gbVar, Activity activity) {
        super(activity, null);
        this.A0 = gbVar;
        this.f17686w0 = false;
        this.f17682s0 = new o4.g((Context) activity, (h20) new db(this));
        this.f17683t0 = new ScaleGestureDetector(activity, new eb(this));
    }

    public final void Z(Bitmap bitmap, float f9) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        gb gbVar = this.A0;
        float width = bitmap.getWidth() / gbVar.f17777n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = gbVar.T0.getTextureView();
        if (textureView == null) {
            textureView = gbVar.T0.f17666r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(gbVar.f17747d0.getX() + gbVar.f17790r.getX(), gbVar.f17747d0.getY() + gbVar.f17790r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f9), (int) (textureView.getHeight() / f9));
                float f10 = 1.0f / width;
                canvas.scale(f10, f10);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(gbVar.f17790r.getX(), gbVar.f17790r.getY());
        for (int i10 = 0; i10 < gbVar.f17790r.getChildCount(); i10++) {
            View childAt = gbVar.f17790r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == gbVar.f17747d0) {
                    for (int i11 = 0; i11 < gbVar.f17747d0.getChildCount(); i11++) {
                        View childAt2 = gbVar.f17747d0.getChildAt(i11);
                        if (childAt2 != gbVar.T0 && childAt2 != gbVar.f17812x0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: nh.fb.dispatchDraw(android.graphics.Canvas):void");
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
        this.f17684u0 = false;
        gb gbVar = this.A0;
        y yVar = gbVar.E0;
        boolean z11 = true;
        if (yVar != null && yVar.f18848e) {
            float y8 = gbVar.E0.getY() + gbVar.f17751e0.getY() + gbVar.f17790r.getY();
            if ((motionEvent.getY() >= y8 && motionEvent.getY() <= y8 + gbVar.E0.getHeight()) || this.f17685v0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f17685v0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            gbVar.E0.a(false, true);
            gbVar.m0(true);
        }
        if (this.f17685v0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f17685v0 = false;
        }
        this.f17683t0.onTouchEvent(motionEvent);
        this.f17682s0.r(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f17684u0) {
            if (gbVar.f17790r.getTranslationY() > 0.0f) {
                if (gbVar.G > 0.4f) {
                    gbVar.q(true);
                } else {
                    gb.c(gbVar);
                }
            } else {
                ga gaVar = gbVar.I0;
                if (gaVar != null && gaVar.getTranslationY() > 0.0f && !gbVar.H0) {
                    gbVar.f((gbVar.M1 || gbVar.I0.getTranslationY() >= ((float) gbVar.I0.getPadding())) ? false : false);
                }
            }
            gbVar.H0 = false;
            gbVar.S = false;
            gbVar.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        gb gbVar = this.A0;
        return (height - gbVar.f17790r.getBottom()) + gbVar.Q;
    }

    public int getBottomPadding2() {
        return getHeight() - this.A0.f17790r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        gb gbVar = this.A0;
        return (height - gbVar.X) - gbVar.f17790r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        bg.d1 d1Var;
        fz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        gb gbVar = this.A0;
        int i15 = gbVar.V;
        int measuredHeight2 = gbVar.f17764i0.getMeasuredHeight();
        if (gbVar.R) {
            i15 = 0;
        }
        int i16 = gbVar.O;
        int b10 = i7.w.b((measuredWidth - i16) / 2, gbVar.U, (measuredWidth - gbVar.W) - i16);
        int i17 = gbVar.O + b10;
        if (gbVar.R) {
            i14 = gbVar.P;
        } else {
            int i18 = gbVar.X;
            int i19 = gbVar.P;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (gbVar.F == 1) {
                float f9 = gbVar.D.top;
                if (i19 + f9 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f9;
                    i14 = gbVar.P;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = gbVar.P;
        }
        gbVar.f17790r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        gbVar.f17794s.f18331b.layout(0, 0, measuredWidth, measuredHeight);
        pa paVar = gbVar.f17818y2;
        if (paVar != null) {
            paVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ga gaVar = gbVar.I0;
        if (gaVar != null) {
            gaVar.layout((measuredWidth - gaVar.getMeasuredWidth()) / 2, 0, (gbVar.I0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        wa waVar = gbVar.Y0;
        if (waVar != null && (emojiView = waVar.f18076f.getEmojiView()) != null) {
            emojiView.layout(gbVar.U, (measuredHeight - gbVar.X) - emojiView.getMeasuredHeight(), measuredWidth - gbVar.W, measuredHeight - gbVar.X);
        }
        ja jaVar = gbVar.f17792r1;
        if (jaVar != null) {
            fz fzVar = jaVar.f18644l2;
            if (fzVar != null) {
                fzVar.layout(gbVar.U, (measuredHeight - gbVar.X) - fzVar.getMeasuredHeight(), measuredWidth - gbVar.W, measuredHeight - gbVar.X);
            }
            fk0 fk0Var = gbVar.f17792r1.V1;
            if (fk0Var != null) {
                int i21 = gbVar.U;
                fk0Var.layout(i21, gbVar.V, fk0Var.getMeasuredWidth() + i21, gbVar.f17792r1.V1.getMeasuredHeight() + gbVar.V);
                if (gbVar.f17792r1.V1.getReactionsWindow() != null) {
                    d1Var = gbVar.f17792r1.V1.getReactionsWindow().f13683c;
                } else {
                    d1Var = null;
                }
                if (d1Var != null) {
                    int i22 = gbVar.U;
                    d1Var.layout(i22, gbVar.V, d1Var.getMeasuredWidth() + i22, d1Var.getMeasuredHeight() + gbVar.V);
                }
            }
        }
        ra raVar = gbVar.f17779n1;
        if (raVar != null) {
            raVar.f17919e.setPadding(0, gbVar.V, 0, gbVar.X);
            gbVar.f17779n1.layout(0, 0, measuredWidth, measuredHeight);
            gbVar.f17779n1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        sa saVar = gbVar.f17782o1;
        if (saVar != null) {
            saVar.f18107f.setPadding(0, gbVar.V, 0, gbVar.X);
            gbVar.f17782o1.layout(0, 0, measuredWidth, measuredHeight);
            gbVar.f17782o1.f18106e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.eb) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        gb gbVar = this.A0;
        int i15 = (size - gbVar.U) - gbVar.W;
        int i16 = gbVar.V;
        int i17 = gbVar.X;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        gbVar.Q = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            gbVar.O = i15;
            gbVar.P = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            gbVar.R = z10;
        } else {
            gbVar.R = false;
            int i20 = ((size2 - dp) - i17) - i16;
            gbVar.P = i20;
            gbVar.O = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - gbVar.P;
        if (gbVar.R) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        gbVar.Q = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (gbVar.R) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        gbVar.f17790r.measure(View.MeasureSpec.makeMeasureSpec(gbVar.O, 1073741824), View.MeasureSpec.makeMeasureSpec(gbVar.P + gbVar.Q, 1073741824));
        gbVar.f17794s.f18331b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        pa paVar = gbVar.f17818y2;
        if (paVar != null) {
            paVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ga gaVar = gbVar.I0;
        if (gaVar != null) {
            gaVar.measure(View.MeasureSpec.makeMeasureSpec(gbVar.O, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        wa waVar = gbVar.Y0;
        if (waVar != null) {
            fz emojiView = waVar.f18076f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        ja jaVar = gbVar.f17792r1;
        if (jaVar != null) {
            fz fzVar = jaVar.f18644l2;
            if (fzVar != null) {
                fzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(gbVar.f17792r1.f18644l2.getLayoutParams().height, 1073741824));
            }
            fk0 fk0Var = gbVar.f17792r1.V1;
            if (fk0Var != null) {
                measureChild(fk0Var, i10, i11);
                if (gbVar.f17792r1.V1.getReactionsWindow() != null) {
                    measureChild(gbVar.f17792r1.V1.getReactionsWindow().f13683c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.eb) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (gbVar.R) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        ra raVar = gbVar.f17779n1;
        if (raVar != null) {
            raVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            gbVar.f17779n1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        sa saVar = gbVar.f17782o1;
        if (saVar != null) {
            saVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            gbVar.f17782o1.f18106e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
