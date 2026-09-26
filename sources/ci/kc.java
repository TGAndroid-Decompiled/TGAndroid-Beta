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
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.rk0;
public final class kc extends bw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final lc E0;
    public final ka.c f4923w0;
    public final ScaleGestureDetector f4924x0;
    public boolean f4925y0;
    public boolean f4926z0;

    public kc(lc lcVar, Activity activity) {
        super(activity, null);
        this.E0 = lcVar;
        this.A0 = false;
        this.f4923w0 = new ka.c(activity, new ic(this));
        this.f4924x0 = new ScaleGestureDetector(activity, new jc(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        lc lcVar = this.E0;
        float width = bitmap.getWidth() / lcVar.f5066n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = lcVar.X0.getTextureView();
        if (textureView == null) {
            textureView = lcVar.X0.f4398r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(lcVar.f5050h0.getX() + lcVar.f5079r.getX(), lcVar.f5050h0.getY() + lcVar.f5079r.getY());
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
        canvas.translate(lcVar.f5079r.getX(), lcVar.f5079r.getY());
        for (int i10 = 0; i10 < lcVar.f5079r.getChildCount(); i10++) {
            View childAt = lcVar.f5079r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == lcVar.f5050h0) {
                    for (int i11 = 0; i11 < lcVar.f5050h0.getChildCount(); i11++) {
                        View childAt2 = lcVar.f5050h0.getChildAt(i11);
                        if (childAt2 != lcVar.X0 && childAt2 != lcVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: ci.kc.dispatchDraw(android.graphics.Canvas):void");
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
        this.f4925y0 = false;
        lc lcVar = this.E0;
        y yVar = lcVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.e) {
            float y3 = lcVar.I0.getY() + lcVar.f5053i0.getY() + lcVar.f5079r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + lcVar.I0.getHeight()) || this.f4926z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f4926z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            lcVar.I0.a(false, true);
            lcVar.m0(true);
        }
        if (this.f4926z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f4926z0 = false;
        }
        this.f4924x0.onTouchEvent(motionEvent);
        this.f4923w0.g0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f4925y0) {
            if (lcVar.f5079r.getTranslationY() > 0.0f) {
                if (lcVar.K > 0.4f) {
                    lcVar.q(true);
                } else {
                    lc.c(lcVar);
                }
            } else {
                kb kbVar = lcVar.M0;
                if (kbVar != null && kbVar.getTranslationY() > 0.0f && !lcVar.L0) {
                    lcVar.f((lcVar.Q1 || lcVar.M0.getTranslationY() >= ((float) lcVar.M0.getPadding())) ? false : false);
                }
            }
            lcVar.L0 = false;
            lcVar.W = false;
            lcVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        lc lcVar = this.E0;
        return (height - lcVar.f5079r.getBottom()) + lcVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f5079r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        lc lcVar = this.E0;
        return (height - lcVar.f5030b0) - lcVar.f5079r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        yh.t3 t3Var;
        mz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        lc lcVar = this.E0;
        int i15 = lcVar.Z;
        int measuredHeight2 = lcVar.m0.getMeasuredHeight();
        if (lcVar.V) {
            i15 = 0;
        }
        int i16 = lcVar.S;
        int b10 = w7.q.b((measuredWidth - i16) / 2, lcVar.Y, (measuredWidth - lcVar.f5027a0) - i16);
        int i17 = lcVar.S + b10;
        if (lcVar.V) {
            i14 = lcVar.T;
        } else {
            int i18 = lcVar.f5030b0;
            int i19 = lcVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (lcVar.J == 1) {
                float f7 = lcVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = lcVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = lcVar.T;
        }
        lcVar.f5079r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        lcVar.f5083s.f5808b.layout(0, 0, measuredWidth, measuredHeight);
        tb tbVar = lcVar.C2;
        if (tbVar != null) {
            tbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        kb kbVar = lcVar.M0;
        if (kbVar != null) {
            kbVar.layout((measuredWidth - kbVar.getMeasuredWidth()) / 2, 0, (lcVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        bc bcVar = lcVar.f5035c1;
        if (bcVar != null && (emojiView = bcVar.f5121f.getEmojiView()) != null) {
            emojiView.layout(lcVar.Y, (measuredHeight - lcVar.f5030b0) - emojiView.getMeasuredHeight(), measuredWidth - lcVar.f5027a0, measuredHeight - lcVar.f5030b0);
        }
        nb nbVar = lcVar.f5094v1;
        if (nbVar != null) {
            mz mzVar = nbVar.f5360p2;
            if (mzVar != null) {
                mzVar.layout(lcVar.Y, (measuredHeight - lcVar.f5030b0) - mzVar.getMeasuredHeight(), measuredWidth - lcVar.f5027a0, measuredHeight - lcVar.f5030b0);
            }
            rk0 rk0Var = lcVar.f5094v1.Z1;
            if (rk0Var != null) {
                int i21 = lcVar.Y;
                rk0Var.layout(i21, lcVar.Z, rk0Var.getMeasuredWidth() + i21, lcVar.f5094v1.Z1.getMeasuredHeight() + lcVar.Z);
                if (lcVar.f5094v1.Z1.getReactionsWindow() != null) {
                    t3Var = lcVar.f5094v1.Z1.getReactionsWindow().f49246c;
                } else {
                    t3Var = null;
                }
                if (t3Var != null) {
                    int i22 = lcVar.Y;
                    t3Var.layout(i22, lcVar.Z, t3Var.getMeasuredWidth() + i22, t3Var.getMeasuredHeight() + lcVar.Z);
                }
            }
        }
        vb vbVar = lcVar.f5081r1;
        if (vbVar != null) {
            vbVar.e.setPadding(0, lcVar.Z, 0, lcVar.f5030b0);
            lcVar.f5081r1.layout(0, 0, measuredWidth, measuredHeight);
            lcVar.f5081r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        wb wbVar = lcVar.f5085s1;
        if (wbVar != null) {
            wbVar.f5151f.setPadding(0, lcVar.Z, 0, lcVar.f5030b0);
            lcVar.f5085s1.layout(0, 0, measuredWidth, measuredHeight);
            lcVar.f5085s1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        lc lcVar = this.E0;
        int i15 = (size - lcVar.Y) - lcVar.f5027a0;
        int i16 = lcVar.Z;
        int i17 = lcVar.f5030b0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        lcVar.U = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            lcVar.S = i15;
            lcVar.T = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            lcVar.V = z10;
        } else {
            lcVar.V = false;
            int i20 = ((size2 - dp) - i17) - i16;
            lcVar.T = i20;
            lcVar.S = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - lcVar.T;
        if (lcVar.V) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        lcVar.U = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (lcVar.V) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        lcVar.f5079r.measure(View.MeasureSpec.makeMeasureSpec(lcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(lcVar.T + lcVar.U, 1073741824));
        lcVar.f5083s.f5808b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        tb tbVar = lcVar.C2;
        if (tbVar != null) {
            tbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        kb kbVar = lcVar.M0;
        if (kbVar != null) {
            kbVar.measure(View.MeasureSpec.makeMeasureSpec(lcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        bc bcVar = lcVar.f5035c1;
        if (bcVar != null) {
            mz emojiView = bcVar.f5121f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        nb nbVar = lcVar.f5094v1;
        if (nbVar != null) {
            mz mzVar = nbVar.f5360p2;
            if (mzVar != null) {
                mzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(lcVar.f5094v1.f5360p2.getLayoutParams().height, 1073741824));
            }
            rk0 rk0Var = lcVar.f5094v1.Z1;
            if (rk0Var != null) {
                measureChild(rk0Var, i10, i11);
                if (lcVar.f5094v1.Z1.getReactionsWindow() != null) {
                    measureChild(lcVar.f5094v1.Z1.getReactionsWindow().f49246c, i10, i11);
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
                if (lcVar.V) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        vb vbVar = lcVar.f5081r1;
        if (vbVar != null) {
            vbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            lcVar.f5081r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        wb wbVar = lcVar.f5085s1;
        if (wbVar != null) {
            wbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            lcVar.f5085s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
