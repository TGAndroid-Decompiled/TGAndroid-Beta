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
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.sw0;
public final class kc extends sw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final lc E0;
    public final k2.g0 f5346w0;
    public final ScaleGestureDetector f5347x0;
    public boolean f5348y0;
    public boolean f5349z0;

    public kc(lc lcVar, Activity activity) {
        super(activity, null);
        this.E0 = lcVar;
        this.A0 = false;
        this.f5346w0 = new k2.g0(activity, new ic(this));
        this.f5347x0 = new ScaleGestureDetector(activity, new jc(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        lc lcVar = this.E0;
        float width = bitmap.getWidth() / lcVar.f5499n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = lcVar.X0.getTextureView();
        if (textureView == null) {
            textureView = lcVar.X0.f4778r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(lcVar.f5483h0.getX() + lcVar.f5512r.getX(), lcVar.f5483h0.getY() + lcVar.f5512r.getY());
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
        canvas.translate(lcVar.f5512r.getX(), lcVar.f5512r.getY());
        for (int i10 = 0; i10 < lcVar.f5512r.getChildCount(); i10++) {
            View childAt = lcVar.f5512r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == lcVar.f5483h0) {
                    for (int i11 = 0; i11 < lcVar.f5483h0.getChildCount(); i11++) {
                        View childAt2 = lcVar.f5483h0.getChildAt(i11);
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
            this.E0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f5348y0 = false;
        lc lcVar = this.E0;
        y yVar = lcVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.f6336e) {
            float y3 = lcVar.I0.getY() + lcVar.f5486i0.getY() + lcVar.f5512r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + lcVar.I0.getHeight()) || this.f5349z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f5349z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            lcVar.I0.a(false, true);
            lcVar.l0(true);
        }
        if (this.f5349z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f5349z0 = false;
        }
        this.f5347x0.onTouchEvent(motionEvent);
        this.f5346w0.T0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f5348y0) {
            if (lcVar.f5512r.getTranslationY() > 0.0f) {
                if (lcVar.K > 0.4f) {
                    lcVar.p(true);
                } else {
                    lc.b(lcVar);
                }
            } else {
                kb kbVar = lcVar.M0;
                if (kbVar != null && kbVar.getTranslationY() > 0.0f && !lcVar.L0) {
                    if (lcVar.Q1 || lcVar.M0.getTranslationY() >= lcVar.M0.getPadding()) {
                        z11 = false;
                    }
                    lcVar.e(z11);
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
        return (height - lcVar.f5512r.getBottom()) + lcVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f5512r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        lc lcVar = this.E0;
        return (height - lcVar.f5462b0) - lcVar.f5512r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        xh.m mVar;
        a00 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        lc lcVar = this.E0;
        int i15 = lcVar.Z;
        int measuredHeight2 = lcVar.m0.getMeasuredHeight();
        if (lcVar.V) {
            i15 = 0;
        }
        int i16 = lcVar.S;
        int b10 = w7.o.b((measuredWidth - i16) / 2, lcVar.Y, (measuredWidth - lcVar.f5459a0) - i16);
        int i17 = lcVar.S + b10;
        if (lcVar.V) {
            i14 = lcVar.T;
        } else {
            int i18 = lcVar.f5462b0;
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
        lcVar.f5512r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        lcVar.f5516s.f6184b.layout(0, 0, measuredWidth, measuredHeight);
        tb tbVar = lcVar.C2;
        if (tbVar != null) {
            tbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        kb kbVar = lcVar.M0;
        if (kbVar != null) {
            kbVar.layout((measuredWidth - kbVar.getMeasuredWidth()) / 2, 0, (lcVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        bc bcVar = lcVar.f5467c1;
        if (bcVar != null && (emojiView = bcVar.f5555f.getEmojiView()) != null) {
            emojiView.layout(lcVar.Y, (measuredHeight - lcVar.f5462b0) - emojiView.getMeasuredHeight(), measuredWidth - lcVar.f5459a0, measuredHeight - lcVar.f5462b0);
        }
        nb nbVar = lcVar.f5527v1;
        if (nbVar != null) {
            a00 a00Var = nbVar.f5819p2;
            if (a00Var != null) {
                a00Var.layout(lcVar.Y, (measuredHeight - lcVar.f5462b0) - a00Var.getMeasuredHeight(), measuredWidth - lcVar.f5459a0, measuredHeight - lcVar.f5462b0);
            }
            kl0 kl0Var = lcVar.f5527v1.Z1;
            if (kl0Var != null) {
                int i21 = lcVar.Y;
                kl0Var.layout(i21, lcVar.Z, kl0Var.getMeasuredWidth() + i21, lcVar.f5527v1.Z1.getMeasuredHeight() + lcVar.Z);
                if (lcVar.f5527v1.Z1.getReactionsWindow() != null) {
                    mVar = lcVar.f5527v1.Z1.getReactionsWindow().f54449c;
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    int i22 = lcVar.Y;
                    mVar.layout(i22, lcVar.Z, mVar.getMeasuredWidth() + i22, mVar.getMeasuredHeight() + lcVar.Z);
                }
            }
        }
        vb vbVar = lcVar.f5514r1;
        if (vbVar != null) {
            vbVar.f5183e.setPadding(0, lcVar.Z, 0, lcVar.f5462b0);
            lcVar.f5514r1.layout(0, 0, measuredWidth, measuredHeight);
            lcVar.f5514r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        wb wbVar = lcVar.f5518s1;
        if (wbVar != null) {
            wbVar.f5370f.setPadding(0, lcVar.Z, 0, lcVar.f5462b0);
            lcVar.f5518s1.layout(0, 0, measuredWidth, measuredHeight);
            lcVar.f5518s1.f5369e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof s0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.lb) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        lc lcVar = this.E0;
        int i16 = (size - lcVar.Y) - lcVar.f5459a0;
        int i17 = lcVar.Z;
        int i18 = lcVar.f5462b0;
        int ceil = (int) Math.ceil((i16 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        lcVar.U = dp;
        int i19 = ceil + dp;
        int i20 = size2 - i18;
        if (i19 <= i20) {
            lcVar.S = i16;
            lcVar.T = ceil;
            if (i19 > i20 - i17) {
                z10 = true;
            } else {
                z10 = false;
            }
            lcVar.V = z10;
        } else {
            lcVar.V = false;
            lcVar.T = ((size2 - dp) - i18) - i17;
            lcVar.S = (int) Math.ceil((i12 * 9.0f) / 16.0f);
        }
        int i21 = size2 - lcVar.T;
        if (lcVar.V) {
            i13 = 0;
        } else {
            i13 = i17;
        }
        lcVar.U = Utilities.clamp(i21 - i13, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (lcVar.V) {
            i14 = systemUiVisibility | 4;
        } else {
            i14 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i14);
        lcVar.f5512r.measure(View.MeasureSpec.makeMeasureSpec(lcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(lcVar.T + lcVar.U, 1073741824));
        lcVar.f5516s.f6184b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        tb tbVar = lcVar.C2;
        if (tbVar != null) {
            tbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        kb kbVar = lcVar.M0;
        if (kbVar != null) {
            kbVar.measure(View.MeasureSpec.makeMeasureSpec(lcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        bc bcVar = lcVar.f5467c1;
        if (bcVar != null) {
            a00 emojiView = bcVar.f5555f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        nb nbVar = lcVar.f5527v1;
        if (nbVar != null) {
            a00 a00Var = nbVar.f5819p2;
            if (a00Var != null) {
                a00Var.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(lcVar.f5527v1.f5819p2.getLayoutParams().height, 1073741824));
            }
            kl0 kl0Var = lcVar.f5527v1.Z1;
            if (kl0Var != null) {
                measureChild(kl0Var, i10, i11);
                if (lcVar.f5527v1.Z1.getReactionsWindow() != null) {
                    measureChild(lcVar.f5527v1.Z1.getReactionsWindow().f54449c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof s0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.lb) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (lcVar.V) {
                    i15 = 0;
                } else {
                    i15 = i17;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i15), 1073741824));
            }
        }
        vb vbVar = lcVar.f5514r1;
        if (vbVar != null) {
            vbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            lcVar.f5514r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        wb wbVar = lcVar.f5518s1;
        if (wbVar != null) {
            wbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            lcVar.f5518s1.f5369e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
