package ci;

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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qk0;
public final class nc extends bw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final oc E0;
    public final ka.c f5098w0;
    public final ScaleGestureDetector f5099x0;
    public boolean f5100y0;
    public boolean f5101z0;

    public nc(oc ocVar, Activity activity) {
        super(activity, null);
        this.E0 = ocVar;
        this.A0 = false;
        this.f5098w0 = new ka.c(activity, new lc(this));
        this.f5099x0 = new ScaleGestureDetector(activity, new mc(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        oc ocVar = this.E0;
        float width = bitmap.getWidth() / ocVar.f5244n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = ocVar.X0.getTextureView();
        if (textureView == null) {
            textureView = ocVar.X0.f4525r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(ocVar.f5228h0.getX() + ocVar.f5257r.getX(), ocVar.f5228h0.getY() + ocVar.f5257r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f7), (int) (textureView.getHeight() / f7));
                float f10 = 1.0f / width;
                canvas.scale(f10, f10);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(ocVar.f5257r.getX(), ocVar.f5257r.getY());
        for (int i10 = 0; i10 < ocVar.f5257r.getChildCount(); i10++) {
            View childAt = ocVar.f5257r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == ocVar.f5228h0) {
                    for (int i11 = 0; i11 < ocVar.f5228h0.getChildCount(); i11++) {
                        View childAt2 = ocVar.f5228h0.getChildAt(i11);
                        if (childAt2 != ocVar.X0 && childAt2 != ocVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: ci.nc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.E0.M();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f5100y0 = false;
        oc ocVar = this.E0;
        y yVar = ocVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.e) {
            float y3 = ocVar.I0.getY() + ocVar.f5231i0.getY() + ocVar.f5257r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ocVar.I0.getHeight()) || this.f5101z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f5101z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            ocVar.I0.a(false, true);
            ocVar.m0(true);
        }
        if (this.f5101z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f5101z0 = false;
        }
        this.f5099x0.onTouchEvent(motionEvent);
        this.f5098w0.g0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f5100y0) {
            if (ocVar.f5257r.getTranslationY() > 0.0f) {
                if (ocVar.K > 0.4f) {
                    ocVar.q(true);
                } else {
                    oc.c(ocVar);
                }
            } else {
                nb nbVar = ocVar.M0;
                if (nbVar != null && nbVar.getTranslationY() > 0.0f && !ocVar.L0) {
                    ocVar.f((ocVar.Q1 || ocVar.M0.getTranslationY() >= ((float) ocVar.M0.getPadding())) ? false : false);
                }
            }
            ocVar.L0 = false;
            ocVar.W = false;
            ocVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        oc ocVar = this.E0;
        return (height - ocVar.f5257r.getBottom()) + ocVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f5257r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        oc ocVar = this.E0;
        return (height - ocVar.f5208b0) - ocVar.f5257r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        yh.u3 u3Var;
        kz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        oc ocVar = this.E0;
        int i15 = ocVar.Z;
        int measuredHeight2 = ocVar.m0.getMeasuredHeight();
        if (ocVar.V) {
            i15 = 0;
        }
        int i16 = ocVar.S;
        int b10 = w7.q.b((measuredWidth - i16) / 2, ocVar.Y, (measuredWidth - ocVar.f5205a0) - i16);
        int i17 = ocVar.S + b10;
        if (ocVar.V) {
            i14 = ocVar.T;
        } else {
            int i18 = ocVar.f5208b0;
            int i19 = ocVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (ocVar.J == 1) {
                float f7 = ocVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = ocVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = ocVar.T;
        }
        ocVar.f5257r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        ocVar.f5261s.f5807b.layout(0, 0, measuredWidth, measuredHeight);
        wb wbVar = ocVar.C2;
        if (wbVar != null) {
            wbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        nb nbVar = ocVar.M0;
        if (nbVar != null) {
            nbVar.layout((measuredWidth - nbVar.getMeasuredWidth()) / 2, 0, (ocVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ec ecVar = ocVar.f5213c1;
        if (ecVar != null && (emojiView = ecVar.f4995f.getEmojiView()) != null) {
            emojiView.layout(ocVar.Y, (measuredHeight - ocVar.f5208b0) - emojiView.getMeasuredHeight(), measuredWidth - ocVar.f5205a0, measuredHeight - ocVar.f5208b0);
        }
        qb qbVar = ocVar.f5272v1;
        if (qbVar != null) {
            kz kzVar = qbVar.f5438p2;
            if (kzVar != null) {
                kzVar.layout(ocVar.Y, (measuredHeight - ocVar.f5208b0) - kzVar.getMeasuredHeight(), measuredWidth - ocVar.f5205a0, measuredHeight - ocVar.f5208b0);
            }
            qk0 qk0Var = ocVar.f5272v1.Z1;
            if (qk0Var != null) {
                int i21 = ocVar.Y;
                qk0Var.layout(i21, ocVar.Z, qk0Var.getMeasuredWidth() + i21, ocVar.f5272v1.Z1.getMeasuredHeight() + ocVar.Z);
                if (ocVar.f5272v1.Z1.getReactionsWindow() != null) {
                    u3Var = ocVar.f5272v1.Z1.getReactionsWindow().f49228c;
                } else {
                    u3Var = null;
                }
                if (u3Var != null) {
                    int i22 = ocVar.Y;
                    u3Var.layout(i22, ocVar.Z, u3Var.getMeasuredWidth() + i22, u3Var.getMeasuredHeight() + ocVar.Z);
                }
            }
        }
        yb ybVar = ocVar.f5259r1;
        if (ybVar != null) {
            ybVar.e.setPadding(0, ocVar.Z, 0, ocVar.f5208b0);
            ocVar.f5259r1.layout(0, 0, measuredWidth, measuredHeight);
            ocVar.f5259r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        zb zbVar = ocVar.f5263s1;
        if (zbVar != null) {
            zbVar.f5025f.setPadding(0, ocVar.Z, 0, ocVar.f5208b0);
            ocVar.f5263s1.layout(0, 0, measuredWidth, measuredHeight);
            ocVar.f5263s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
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
        oc ocVar = this.E0;
        int i15 = (size - ocVar.Y) - ocVar.f5205a0;
        int i16 = ocVar.Z;
        int i17 = ocVar.f5208b0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        ocVar.U = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            ocVar.S = i15;
            ocVar.T = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            ocVar.V = z10;
        } else {
            ocVar.V = false;
            int i20 = ((size2 - dp) - i17) - i16;
            ocVar.T = i20;
            ocVar.S = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - ocVar.T;
        if (ocVar.V) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        ocVar.U = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (ocVar.V) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        ocVar.f5257r.measure(View.MeasureSpec.makeMeasureSpec(ocVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(ocVar.T + ocVar.U, 1073741824));
        ocVar.f5261s.f5807b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        wb wbVar = ocVar.C2;
        if (wbVar != null) {
            wbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        nb nbVar = ocVar.M0;
        if (nbVar != null) {
            nbVar.measure(View.MeasureSpec.makeMeasureSpec(ocVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ec ecVar = ocVar.f5213c1;
        if (ecVar != null) {
            kz emojiView = ecVar.f4995f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        qb qbVar = ocVar.f5272v1;
        if (qbVar != null) {
            kz kzVar = qbVar.f5438p2;
            if (kzVar != null) {
                kzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(ocVar.f5272v1.f5438p2.getLayoutParams().height, 1073741824));
            }
            qk0 qk0Var = ocVar.f5272v1.Z1;
            if (qk0Var != null) {
                measureChild(qk0Var, i10, i11);
                if (ocVar.f5272v1.Z1.getReactionsWindow() != null) {
                    measureChild(ocVar.f5272v1.Z1.getReactionsWindow().f49228c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (ocVar.V) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        yb ybVar = ocVar.f5259r1;
        if (ybVar != null) {
            ybVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            ocVar.f5259r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        zb zbVar = ocVar.f5263s1;
        if (zbVar != null) {
            zbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            ocVar.f5263s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
