package ei;

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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.tz;
public final class ub extends jw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final vb E0;
    public final le.b f9918w0;
    public final ScaleGestureDetector f9919x0;
    public boolean f9920y0;
    public boolean f9921z0;

    public ub(vb vbVar, Activity activity) {
        super(activity, null);
        this.E0 = vbVar;
        this.A0 = false;
        this.f9918w0 = new le.b(activity, new sb(this));
        this.f9919x0 = new ScaleGestureDetector(activity, new tb(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        vb vbVar = this.E0;
        float width = bitmap.getWidth() / vbVar.f9990n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = vbVar.X0.getTextureView();
        if (textureView == null) {
            textureView = vbVar.X0.f9729r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(vbVar.f9974h0.getX() + vbVar.f10003r.getX(), vbVar.f9974h0.getY() + vbVar.f10003r.getY());
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
        canvas.translate(vbVar.f10003r.getX(), vbVar.f10003r.getY());
        for (int i10 = 0; i10 < vbVar.f10003r.getChildCount(); i10++) {
            View childAt = vbVar.f10003r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == vbVar.f9974h0) {
                    for (int i11 = 0; i11 < vbVar.f9974h0.getChildCount(); i11++) {
                        View childAt2 = vbVar.f9974h0.getChildAt(i11);
                        if (childAt2 != vbVar.X0 && childAt2 != vbVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: ei.ub.dispatchDraw(android.graphics.Canvas):void");
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
        this.f9920y0 = false;
        vb vbVar = this.E0;
        y yVar = vbVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.e) {
            float y3 = vbVar.I0.getY() + vbVar.f9977i0.getY() + vbVar.f10003r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + vbVar.I0.getHeight()) || this.f9921z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f9921z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            vbVar.I0.a(false, true);
            vbVar.l0(true);
        }
        if (this.f9921z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f9921z0 = false;
        }
        this.f9919x0.onTouchEvent(motionEvent);
        this.f9918w0.j0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f9920y0) {
            if (vbVar.f10003r.getTranslationY() > 0.0f) {
                if (vbVar.K > 0.4f) {
                    vbVar.p(true);
                } else {
                    vb.b(vbVar);
                }
            } else {
                ua uaVar = vbVar.M0;
                if (uaVar != null && uaVar.getTranslationY() > 0.0f && !vbVar.L0) {
                    if (vbVar.Q1 || vbVar.M0.getTranslationY() >= vbVar.M0.getPadding()) {
                        z11 = false;
                    }
                    vbVar.e(z11);
                }
            }
            vbVar.L0 = false;
            vbVar.W = false;
            vbVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        vb vbVar = this.E0;
        return (height - vbVar.f10003r.getBottom()) + vbVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f10003r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        vb vbVar = this.E0;
        return (height - vbVar.f9954b0) - vbVar.f10003r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ah.v vVar;
        tz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        vb vbVar = this.E0;
        int i15 = vbVar.Z;
        int measuredHeight2 = vbVar.m0.getMeasuredHeight();
        if (vbVar.V) {
            i15 = 0;
        }
        int i16 = vbVar.S;
        int b10 = w7.r.b((measuredWidth - i16) / 2, vbVar.Y, (measuredWidth - vbVar.f9951a0) - i16);
        int i17 = vbVar.S + b10;
        if (vbVar.V) {
            i14 = vbVar.T;
        } else {
            int i18 = vbVar.f9954b0;
            int i19 = vbVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (vbVar.J == 1) {
                float f7 = vbVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = vbVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = vbVar.T;
        }
        vbVar.f10003r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        vbVar.f10007s.f9770b.layout(0, 0, measuredWidth, measuredHeight);
        db dbVar = vbVar.C2;
        if (dbVar != null) {
            dbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ua uaVar = vbVar.M0;
        if (uaVar != null) {
            uaVar.layout((measuredWidth - uaVar.getMeasuredWidth()) / 2, 0, (vbVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        lb lbVar = vbVar.f9959c1;
        if (lbVar != null && (emojiView = lbVar.f9402f.getEmojiView()) != null) {
            emojiView.layout(vbVar.Y, (measuredHeight - vbVar.f9954b0) - emojiView.getMeasuredHeight(), measuredWidth - vbVar.f9951a0, measuredHeight - vbVar.f9954b0);
        }
        xa xaVar = vbVar.f10018v1;
        if (xaVar != null) {
            tz tzVar = xaVar.f9031p2;
            if (tzVar != null) {
                tzVar.layout(vbVar.Y, (measuredHeight - vbVar.f9954b0) - tzVar.getMeasuredHeight(), measuredWidth - vbVar.f9951a0, measuredHeight - vbVar.f9954b0);
            }
            cl0 cl0Var = vbVar.f10018v1.Z1;
            if (cl0Var != null) {
                int i21 = vbVar.Y;
                cl0Var.layout(i21, vbVar.Z, cl0Var.getMeasuredWidth() + i21, vbVar.f10018v1.Z1.getMeasuredHeight() + vbVar.Z);
                if (vbVar.f10018v1.Z1.getReactionsWindow() != null) {
                    vVar = vbVar.f10018v1.Z1.getReactionsWindow().f872c;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    int i22 = vbVar.Y;
                    vVar.layout(i22, vbVar.Z, vVar.getMeasuredWidth() + i22, vVar.getMeasuredHeight() + vbVar.Z);
                }
            }
        }
        fb fbVar = vbVar.f10005r1;
        if (fbVar != null) {
            fbVar.e.setPadding(0, vbVar.Z, 0, vbVar.f9954b0);
            vbVar.f10005r1.layout(0, 0, measuredWidth, measuredHeight);
            vbVar.f10005r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        gb gbVar = vbVar.f10009s1;
        if (gbVar != null) {
            gbVar.f9432f.setPadding(0, vbVar.Z, 0, vbVar.f9954b0);
            vbVar.f10009s1.layout(0, 0, measuredWidth, measuredHeight);
            vbVar.f10009s1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        int i15;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        vb vbVar = this.E0;
        int i16 = (size - vbVar.Y) - vbVar.f9951a0;
        int i17 = vbVar.Z;
        int i18 = vbVar.f9954b0;
        int ceil = (int) Math.ceil((i16 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        vbVar.U = dp;
        int i19 = ceil + dp;
        int i20 = size2 - i18;
        if (i19 <= i20) {
            vbVar.S = i16;
            vbVar.T = ceil;
            if (i19 > i20 - i17) {
                z10 = true;
            } else {
                z10 = false;
            }
            vbVar.V = z10;
        } else {
            vbVar.V = false;
            vbVar.T = ((size2 - dp) - i18) - i17;
            vbVar.S = (int) Math.ceil((i12 * 9.0f) / 16.0f);
        }
        int i21 = size2 - vbVar.T;
        if (vbVar.V) {
            i13 = 0;
        } else {
            i13 = i17;
        }
        vbVar.U = Utilities.clamp(i21 - i13, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (vbVar.V) {
            i14 = systemUiVisibility | 4;
        } else {
            i14 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i14);
        vbVar.f10003r.measure(View.MeasureSpec.makeMeasureSpec(vbVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(vbVar.T + vbVar.U, 1073741824));
        vbVar.f10007s.f9770b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        db dbVar = vbVar.C2;
        if (dbVar != null) {
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ua uaVar = vbVar.M0;
        if (uaVar != null) {
            uaVar.measure(View.MeasureSpec.makeMeasureSpec(vbVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        lb lbVar = vbVar.f9959c1;
        if (lbVar != null) {
            tz emojiView = lbVar.f9402f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        xa xaVar = vbVar.f10018v1;
        if (xaVar != null) {
            tz tzVar = xaVar.f9031p2;
            if (tzVar != null) {
                tzVar.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(vbVar.f10018v1.f9031p2.getLayoutParams().height, 1073741824));
            }
            cl0 cl0Var = vbVar.f10018v1.Z1;
            if (cl0Var != null) {
                measureChild(cl0Var, i10, i11);
                if (vbVar.f10018v1.Z1.getReactionsWindow() != null) {
                    measureChild(vbVar.f10018v1.Z1.getReactionsWindow().f872c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.ib) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (vbVar.V) {
                    i15 = 0;
                } else {
                    i15 = i17;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i15), 1073741824));
            }
        }
        fb fbVar = vbVar.f10005r1;
        if (fbVar != null) {
            fbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vbVar.f10005r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        gb gbVar = vbVar.f10009s1;
        if (gbVar != null) {
            gbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vbVar.f10009s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
