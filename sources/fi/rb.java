package fi;

import a8.ee;
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
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ww0;
public final class rb extends ww0 {
    public final jg.i f11560l0;
    public final ScaleGestureDetector m0;
    public boolean f11561n0;
    public boolean f11562o0;
    public boolean f11563p0;
    public float f11564q0;
    public float f11565r0;
    public float f11566s0;
    public final sb f11567t0;

    public rb(sb sbVar, Activity activity) {
        super(activity, null);
        this.f11567t0 = sbVar;
        this.f11563p0 = false;
        this.f11560l0 = new jg.i(activity, new pb(this));
        this.m0 = new ScaleGestureDetector(activity, new qb(this));
    }

    public final void X(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        sb sbVar = this.f11567t0;
        float width = bitmap.getWidth() / sbVar.f11644n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = sbVar.X0.getTextureView();
        if (textureView == null) {
            textureView = sbVar.X0.f11381r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(sbVar.f11628h0.getX() + sbVar.f11657r.getX(), sbVar.f11628h0.getY() + sbVar.f11657r.getY());
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
        canvas.translate(sbVar.f11657r.getX(), sbVar.f11657r.getY());
        for (int i10 = 0; i10 < sbVar.f11657r.getChildCount(); i10++) {
            View childAt = sbVar.f11657r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == sbVar.f11628h0) {
                    for (int i11 = 0; i11 < sbVar.f11628h0.getChildCount(); i11++) {
                        View childAt2 = sbVar.f11628h0.getChildAt(i11);
                        if (childAt2 != sbVar.X0 && childAt2 != sbVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: fi.rb.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f11567t0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f11561n0 = false;
        sb sbVar = this.f11567t0;
        y yVar = sbVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.e) {
            float y3 = sbVar.I0.getY() + sbVar.f11631i0.getY() + sbVar.f11657r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + sbVar.I0.getHeight()) || this.f11562o0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f11562o0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            sbVar.I0.a(false, true);
            sbVar.l0(true);
        }
        if (this.f11562o0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f11562o0 = false;
        }
        this.m0.onTouchEvent(motionEvent);
        this.f11560l0.g0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f11561n0) {
            if (sbVar.f11657r.getTranslationY() > 0.0f) {
                if (sbVar.K > 0.4f) {
                    sbVar.p(true);
                } else {
                    sb.b(sbVar);
                }
            } else {
                qa qaVar = sbVar.M0;
                if (qaVar != null && qaVar.getTranslationY() > 0.0f && !sbVar.L0) {
                    if (sbVar.Q1 || sbVar.M0.getTranslationY() >= sbVar.M0.getPadding()) {
                        z11 = false;
                    }
                    sbVar.e(z11);
                }
            }
            sbVar.L0 = false;
            sbVar.W = false;
            sbVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        sb sbVar = this.f11567t0;
        return (height - sbVar.f11657r.getBottom()) + sbVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f11567t0.f11657r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sb sbVar = this.f11567t0;
        return (height - sbVar.f11608b0) - sbVar.f11657r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        bh.p pVar;
        sz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sb sbVar = this.f11567t0;
        int i15 = sbVar.Z;
        int measuredHeight2 = sbVar.m0.getMeasuredHeight();
        if (sbVar.V) {
            i15 = 0;
        }
        int i16 = sbVar.S;
        int b10 = ee.b((measuredWidth - i16) / 2, sbVar.Y, (measuredWidth - sbVar.f11605a0) - i16);
        int i17 = sbVar.S + b10;
        if (sbVar.V) {
            i14 = sbVar.T;
        } else {
            int i18 = sbVar.f11608b0;
            int i19 = sbVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (sbVar.J == 1) {
                float f7 = sbVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = sbVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = sbVar.T;
        }
        sbVar.f11657r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        sbVar.f11661s.f11465b.layout(0, 0, measuredWidth, measuredHeight);
        ab abVar = sbVar.C2;
        if (abVar != null) {
            abVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        qa qaVar = sbVar.M0;
        if (qaVar != null) {
            qaVar.layout((measuredWidth - qaVar.getMeasuredWidth()) / 2, 0, (sbVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ib ibVar = sbVar.f11613c1;
        if (ibVar != null && (emojiView = ibVar.f11198f.getEmojiView()) != null) {
            emojiView.layout(sbVar.Y, (measuredHeight - sbVar.f11608b0) - emojiView.getMeasuredHeight(), measuredWidth - sbVar.f11605a0, measuredHeight - sbVar.f11608b0);
        }
        ta taVar = sbVar.f11672v1;
        if (taVar != null) {
            sz szVar = taVar.f10786e2;
            if (szVar != null) {
                szVar.layout(sbVar.Y, (measuredHeight - sbVar.f11608b0) - szVar.getMeasuredHeight(), measuredWidth - sbVar.f11605a0, measuredHeight - sbVar.f11608b0);
            }
            gl0 gl0Var = sbVar.f11672v1.O1;
            if (gl0Var != null) {
                int i21 = sbVar.Y;
                gl0Var.layout(i21, sbVar.Z, gl0Var.getMeasuredWidth() + i21, sbVar.f11672v1.O1.getMeasuredHeight() + sbVar.Z);
                if (sbVar.f11672v1.O1.getReactionsWindow() != null) {
                    pVar = sbVar.f11672v1.O1.getReactionsWindow().f4049c;
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    int i22 = sbVar.Y;
                    pVar.layout(i22, sbVar.Z, pVar.getMeasuredWidth() + i22, pVar.getMeasuredHeight() + sbVar.Z);
                }
            }
        }
        cb cbVar = sbVar.f11659r1;
        if (cbVar != null) {
            cbVar.e.setPadding(0, sbVar.Z, 0, sbVar.f11608b0);
            sbVar.f11659r1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.f11659r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        db dbVar = sbVar.f11663s1;
        if (dbVar != null) {
            dbVar.f11228f.setPadding(0, sbVar.Z, 0, sbVar.f11608b0);
            sbVar.f11663s1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.f11663s1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        sb sbVar = this.f11567t0;
        int i16 = (size - sbVar.Y) - sbVar.f11605a0;
        int i17 = sbVar.Z;
        int i18 = sbVar.f11608b0;
        int ceil = (int) Math.ceil((i16 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        sbVar.U = dp;
        int i19 = ceil + dp;
        int i20 = size2 - i18;
        if (i19 <= i20) {
            sbVar.S = i16;
            sbVar.T = ceil;
            if (i19 > i20 - i17) {
                z10 = true;
            } else {
                z10 = false;
            }
            sbVar.V = z10;
        } else {
            sbVar.V = false;
            sbVar.T = ((size2 - dp) - i18) - i17;
            sbVar.S = (int) Math.ceil((i12 * 9.0f) / 16.0f);
        }
        int i21 = size2 - sbVar.T;
        if (sbVar.V) {
            i13 = 0;
        } else {
            i13 = i17;
        }
        sbVar.U = Utilities.clamp(i21 - i13, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (sbVar.V) {
            i14 = systemUiVisibility | 4;
        } else {
            i14 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i14);
        sbVar.f11657r.measure(View.MeasureSpec.makeMeasureSpec(sbVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(sbVar.T + sbVar.U, 1073741824));
        sbVar.f11661s.f11465b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ab abVar = sbVar.C2;
        if (abVar != null) {
            abVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        qa qaVar = sbVar.M0;
        if (qaVar != null) {
            qaVar.measure(View.MeasureSpec.makeMeasureSpec(sbVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ib ibVar = sbVar.f11613c1;
        if (ibVar != null) {
            sz emojiView = ibVar.f11198f.getEmojiView();
            Q();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        ta taVar = sbVar.f11672v1;
        if (taVar != null) {
            sz szVar = taVar.f10786e2;
            if (szVar != null) {
                szVar.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(sbVar.f11672v1.f10786e2.getLayoutParams().height, 1073741824));
            }
            gl0 gl0Var = sbVar.f11672v1.O1;
            if (gl0Var != null) {
                measureChild(gl0Var, i10, i11);
                if (sbVar.f11672v1.O1.getReactionsWindow() != null) {
                    measureChild(sbVar.f11672v1.O1.getReactionsWindow().f4049c, i10, i11);
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
                if (sbVar.V) {
                    i15 = 0;
                } else {
                    i15 = i17;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i15), 1073741824));
            }
        }
        cb cbVar = sbVar.f11659r1;
        if (cbVar != null) {
            cbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            sbVar.f11659r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        db dbVar = sbVar.f11663s1;
        if (dbVar != null) {
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            sbVar.f11663s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
