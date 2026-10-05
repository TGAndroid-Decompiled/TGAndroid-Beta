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
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sk0;
public final class jc extends mw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final kc E0;
    public final ii.n4 f5275w0;
    public final ScaleGestureDetector f5276x0;
    public boolean f5277y0;
    public boolean f5278z0;

    public jc(kc kcVar, Activity activity) {
        super(activity, null);
        this.E0 = kcVar;
        this.A0 = false;
        this.f5275w0 = new ii.n4(activity, new hc(this));
        this.f5276x0 = new ScaleGestureDetector(activity, new ic(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        kc kcVar = this.E0;
        float width = bitmap.getWidth() / kcVar.f5415n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = kcVar.X0.getTextureView();
        if (textureView == null) {
            textureView = kcVar.X0.f4760r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(kcVar.f5399h0.getX() + kcVar.f5428r.getX(), kcVar.f5399h0.getY() + kcVar.f5428r.getY());
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
        canvas.translate(kcVar.f5428r.getX(), kcVar.f5428r.getY());
        for (int i10 = 0; i10 < kcVar.f5428r.getChildCount(); i10++) {
            View childAt = kcVar.f5428r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == kcVar.f5399h0) {
                    for (int i11 = 0; i11 < kcVar.f5399h0.getChildCount(); i11++) {
                        View childAt2 = kcVar.f5399h0.getChildAt(i11);
                        if (childAt2 != kcVar.X0 && childAt2 != kcVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: ci.jc.dispatchDraw(android.graphics.Canvas):void");
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
        this.f5277y0 = false;
        kc kcVar = this.E0;
        y yVar = kcVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.f6327e) {
            float y3 = kcVar.I0.getY() + kcVar.f5402i0.getY() + kcVar.f5428r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + kcVar.I0.getHeight()) || this.f5278z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f5278z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            kcVar.I0.a(false, true);
            kcVar.m0(true);
        }
        if (this.f5278z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f5278z0 = false;
        }
        this.f5276x0.onTouchEvent(motionEvent);
        this.f5275w0.G(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f5277y0) {
            if (kcVar.f5428r.getTranslationY() > 0.0f) {
                if (kcVar.K > 0.4f) {
                    kcVar.q(true);
                } else {
                    kc.c(kcVar);
                }
            } else {
                jb jbVar = kcVar.M0;
                if (jbVar != null && jbVar.getTranslationY() > 0.0f && !kcVar.L0) {
                    kcVar.f((kcVar.Q1 || kcVar.M0.getTranslationY() >= ((float) kcVar.M0.getPadding())) ? false : false);
                }
            }
            kcVar.L0 = false;
            kcVar.W = false;
            kcVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        kc kcVar = this.E0;
        return (height - kcVar.f5428r.getBottom()) + kcVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f5428r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        kc kcVar = this.E0;
        return (height - kcVar.f5378b0) - kcVar.f5428r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        yh.u3 u3Var;
        nz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        kc kcVar = this.E0;
        int i15 = kcVar.Z;
        int measuredHeight2 = kcVar.m0.getMeasuredHeight();
        if (kcVar.V) {
            i15 = 0;
        }
        int i16 = kcVar.S;
        int b10 = w7.q.b((measuredWidth - i16) / 2, kcVar.Y, (measuredWidth - kcVar.f5375a0) - i16);
        int i17 = kcVar.S + b10;
        if (kcVar.V) {
            i14 = kcVar.T;
        } else {
            int i18 = kcVar.f5378b0;
            int i19 = kcVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (kcVar.J == 1) {
                float f7 = kcVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = kcVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = kcVar.T;
        }
        kcVar.f5428r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        kcVar.f5432s.f6266b.layout(0, 0, measuredWidth, measuredHeight);
        sb sbVar = kcVar.C2;
        if (sbVar != null) {
            sbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        jb jbVar = kcVar.M0;
        if (jbVar != null) {
            jbVar.layout((measuredWidth - jbVar.getMeasuredWidth()) / 2, 0, (kcVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ac acVar = kcVar.f5383c1;
        if (acVar != null && (emojiView = acVar.f5518f.getEmojiView()) != null) {
            emojiView.layout(kcVar.Y, (measuredHeight - kcVar.f5378b0) - emojiView.getMeasuredHeight(), measuredWidth - kcVar.f5375a0, measuredHeight - kcVar.f5378b0);
        }
        mb mbVar = kcVar.f5443v1;
        if (mbVar != null) {
            nz nzVar = mbVar.f5775p2;
            if (nzVar != null) {
                nzVar.layout(kcVar.Y, (measuredHeight - kcVar.f5378b0) - nzVar.getMeasuredHeight(), measuredWidth - kcVar.f5375a0, measuredHeight - kcVar.f5378b0);
            }
            sk0 sk0Var = kcVar.f5443v1.Z1;
            if (sk0Var != null) {
                int i21 = kcVar.Y;
                sk0Var.layout(i21, kcVar.Z, sk0Var.getMeasuredWidth() + i21, kcVar.f5443v1.Z1.getMeasuredHeight() + kcVar.Z);
                if (kcVar.f5443v1.Z1.getReactionsWindow() != null) {
                    u3Var = kcVar.f5443v1.Z1.getReactionsWindow().f53552c;
                } else {
                    u3Var = null;
                }
                if (u3Var != null) {
                    int i22 = kcVar.Y;
                    u3Var.layout(i22, kcVar.Z, u3Var.getMeasuredWidth() + i22, u3Var.getMeasuredHeight() + kcVar.Z);
                }
            }
        }
        ub ubVar = kcVar.f5430r1;
        if (ubVar != null) {
            ubVar.f5192e.setPadding(0, kcVar.Z, 0, kcVar.f5378b0);
            kcVar.f5430r1.layout(0, 0, measuredWidth, measuredHeight);
            kcVar.f5430r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        vb vbVar = kcVar.f5434s1;
        if (vbVar != null) {
            vbVar.f5549f.setPadding(0, kcVar.Z, 0, kcVar.f5378b0);
            kcVar.f5434s1.layout(0, 0, measuredWidth, measuredHeight);
            kcVar.f5434s1.f5548e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.jb) {
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
        kc kcVar = this.E0;
        int i15 = (size - kcVar.Y) - kcVar.f5375a0;
        int i16 = kcVar.Z;
        int i17 = kcVar.f5378b0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        kcVar.U = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            kcVar.S = i15;
            kcVar.T = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            kcVar.V = z10;
        } else {
            kcVar.V = false;
            int i20 = ((size2 - dp) - i17) - i16;
            kcVar.T = i20;
            kcVar.S = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - kcVar.T;
        if (kcVar.V) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        kcVar.U = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (kcVar.V) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        kcVar.f5428r.measure(View.MeasureSpec.makeMeasureSpec(kcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(kcVar.T + kcVar.U, 1073741824));
        kcVar.f5432s.f6266b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        sb sbVar = kcVar.C2;
        if (sbVar != null) {
            sbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        jb jbVar = kcVar.M0;
        if (jbVar != null) {
            jbVar.measure(View.MeasureSpec.makeMeasureSpec(kcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ac acVar = kcVar.f5383c1;
        if (acVar != null) {
            nz emojiView = acVar.f5518f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        mb mbVar = kcVar.f5443v1;
        if (mbVar != null) {
            nz nzVar = mbVar.f5775p2;
            if (nzVar != null) {
                nzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(kcVar.f5443v1.f5775p2.getLayoutParams().height, 1073741824));
            }
            sk0 sk0Var = kcVar.f5443v1.Z1;
            if (sk0Var != null) {
                measureChild(sk0Var, i10, i11);
                if (kcVar.f5443v1.Z1.getReactionsWindow() != null) {
                    measureChild(kcVar.f5443v1.Z1.getReactionsWindow().f53552c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.jb) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (kcVar.V) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        ub ubVar = kcVar.f5430r1;
        if (ubVar != null) {
            ubVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            kcVar.f5430r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        vb vbVar = kcVar.f5434s1;
        if (vbVar != null) {
            vbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            kcVar.f5434s1.f5548e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
