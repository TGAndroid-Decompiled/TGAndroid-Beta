package ei;

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
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.u20;
public final class ub extends ow0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final vb E0;
    public final le.b f9931w0;
    public final ScaleGestureDetector f9932x0;
    public boolean f9933y0;
    public boolean f9934z0;

    public ub(vb vbVar, Activity activity) {
        super(activity, null);
        this.E0 = vbVar;
        this.A0 = false;
        this.f9931w0 = new le.b((Context) activity, (u20) new sb(this));
        this.f9932x0 = new ScaleGestureDetector(activity, new tb(this));
    }

    public final void Y(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        vb vbVar = this.E0;
        float width = bitmap.getWidth() / vbVar.f10004n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = vbVar.X0.getTextureView();
        if (textureView == null) {
            textureView = vbVar.X0.f9742r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(vbVar.f9988h0.getX() + vbVar.f10017r.getX(), vbVar.f9988h0.getY() + vbVar.f10017r.getY());
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
        canvas.translate(vbVar.f10017r.getX(), vbVar.f10017r.getY());
        for (int i10 = 0; i10 < vbVar.f10017r.getChildCount(); i10++) {
            View childAt = vbVar.f10017r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == vbVar.f9988h0) {
                    for (int i11 = 0; i11 < vbVar.f9988h0.getChildCount(); i11++) {
                        View childAt2 = vbVar.f9988h0.getChildAt(i11);
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
        this.f9933y0 = false;
        vb vbVar = this.E0;
        y yVar = vbVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.e) {
            float y3 = vbVar.I0.getY() + vbVar.f9991i0.getY() + vbVar.f10017r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + vbVar.I0.getHeight()) || this.f9934z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f9934z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            vbVar.I0.a(false, true);
            vbVar.l0(true);
        }
        if (this.f9934z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f9934z0 = false;
        }
        this.f9932x0.onTouchEvent(motionEvent);
        this.f9931w0.k(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f9933y0) {
            if (vbVar.f10017r.getTranslationY() > 0.0f) {
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
        return (height - vbVar.f10017r.getBottom()) + vbVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f10017r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        vb vbVar = this.E0;
        return (height - vbVar.f9968b0) - vbVar.f10017r.getBottom();
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
        int b10 = w7.r.b((measuredWidth - i16) / 2, vbVar.Y, (measuredWidth - vbVar.f9965a0) - i16);
        int i17 = vbVar.S + b10;
        if (vbVar.V) {
            i14 = vbVar.T;
        } else {
            int i18 = vbVar.f9968b0;
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
        vbVar.f10017r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        vbVar.f10021s.f9783b.layout(0, 0, measuredWidth, measuredHeight);
        db dbVar = vbVar.C2;
        if (dbVar != null) {
            dbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ua uaVar = vbVar.M0;
        if (uaVar != null) {
            uaVar.layout((measuredWidth - uaVar.getMeasuredWidth()) / 2, 0, (vbVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        lb lbVar = vbVar.f9973c1;
        if (lbVar != null && (emojiView = lbVar.f9410f.getEmojiView()) != null) {
            emojiView.layout(vbVar.Y, (measuredHeight - vbVar.f9968b0) - emojiView.getMeasuredHeight(), measuredWidth - vbVar.f9965a0, measuredHeight - vbVar.f9968b0);
        }
        xa xaVar = vbVar.f10032v1;
        if (xaVar != null) {
            tz tzVar = xaVar.f9039p2;
            if (tzVar != null) {
                tzVar.layout(vbVar.Y, (measuredHeight - vbVar.f9968b0) - tzVar.getMeasuredHeight(), measuredWidth - vbVar.f9965a0, measuredHeight - vbVar.f9968b0);
            }
            gl0 gl0Var = vbVar.f10032v1.Z1;
            if (gl0Var != null) {
                int i21 = vbVar.Y;
                gl0Var.layout(i21, vbVar.Z, gl0Var.getMeasuredWidth() + i21, vbVar.f10032v1.Z1.getMeasuredHeight() + vbVar.Z);
                if (vbVar.f10032v1.Z1.getReactionsWindow() != null) {
                    vVar = vbVar.f10032v1.Z1.getReactionsWindow().f871c;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    int i22 = vbVar.Y;
                    vVar.layout(i22, vbVar.Z, vVar.getMeasuredWidth() + i22, vVar.getMeasuredHeight() + vbVar.Z);
                }
            }
        }
        fb fbVar = vbVar.f10019r1;
        if (fbVar != null) {
            fbVar.e.setPadding(0, vbVar.Z, 0, vbVar.f9968b0);
            vbVar.f10019r1.layout(0, 0, measuredWidth, measuredHeight);
            vbVar.f10019r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        gb gbVar = vbVar.f10023s1;
        if (gbVar != null) {
            gbVar.f9440f.setPadding(0, vbVar.Z, 0, vbVar.f9968b0);
            vbVar.f10023s1.layout(0, 0, measuredWidth, measuredHeight);
            vbVar.f10023s1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        int i16 = (size - vbVar.Y) - vbVar.f9965a0;
        int i17 = vbVar.Z;
        int i18 = vbVar.f9968b0;
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
        vbVar.f10017r.measure(View.MeasureSpec.makeMeasureSpec(vbVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(vbVar.T + vbVar.U, 1073741824));
        vbVar.f10021s.f9783b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        db dbVar = vbVar.C2;
        if (dbVar != null) {
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ua uaVar = vbVar.M0;
        if (uaVar != null) {
            uaVar.measure(View.MeasureSpec.makeMeasureSpec(vbVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        lb lbVar = vbVar.f9973c1;
        if (lbVar != null) {
            tz emojiView = lbVar.f9410f.getEmojiView();
            Q();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        xa xaVar = vbVar.f10032v1;
        if (xaVar != null) {
            tz tzVar = xaVar.f9039p2;
            if (tzVar != null) {
                tzVar.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(vbVar.f10032v1.f9039p2.getLayoutParams().height, 1073741824));
            }
            gl0 gl0Var = vbVar.f10032v1.Z1;
            if (gl0Var != null) {
                measureChild(gl0Var, i10, i11);
                if (vbVar.f10032v1.Z1.getReactionsWindow() != null) {
                    measureChild(vbVar.f10032v1.Z1.getReactionsWindow().f871c, i10, i11);
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
        fb fbVar = vbVar.f10019r1;
        if (fbVar != null) {
            fbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vbVar.f10019r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        gb gbVar = vbVar.f10023s1;
        if (gbVar != null) {
            gbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vbVar.f10023s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
