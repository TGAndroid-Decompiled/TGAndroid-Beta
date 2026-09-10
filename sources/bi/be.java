package bi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rz;
public final class be extends aw0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final ce E0;
    public final l2.g f2384w0;
    public final ScaleGestureDetector f2385x0;
    public boolean f2386y0;
    public boolean f2387z0;

    public be(ce ceVar, Activity activity) {
        super(activity, null);
        this.E0 = ceVar;
        this.A0 = false;
        this.f2384w0 = new l2.g(activity, new zd(this));
        this.f2385x0 = new ScaleGestureDetector(activity, new ae(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        ce ceVar = this.E0;
        float width = bitmap.getWidth() / ceVar.f2470n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = ceVar.X0.getTextureView();
        if (textureView == null) {
            textureView = ceVar.X0.f2652r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(ceVar.f2454h0.getX() + ceVar.f2483r.getX(), ceVar.f2454h0.getY() + ceVar.f2483r.getY());
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
        canvas.translate(ceVar.f2483r.getX(), ceVar.f2483r.getY());
        for (int i10 = 0; i10 < ceVar.f2483r.getChildCount(); i10++) {
            View childAt = ceVar.f2483r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == ceVar.f2454h0) {
                    for (int i11 = 0; i11 < ceVar.f2454h0.getChildCount(); i11++) {
                        View childAt2 = ceVar.f2454h0.getChildAt(i11);
                        if (childAt2 != ceVar.X0 && childAt2 != ceVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: bi.be.dispatchDraw(android.graphics.Canvas):void");
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
        this.f2386y0 = false;
        ce ceVar = this.E0;
        c0 c0Var = ceVar.I0;
        boolean z11 = true;
        if (c0Var != null && c0Var.e) {
            float y3 = ceVar.I0.getY() + ceVar.f2457i0.getY() + ceVar.f2483r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + ceVar.I0.getHeight()) || this.f2387z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f2387z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            ceVar.I0.a(false, true);
            ceVar.m0(true);
        }
        if (this.f2387z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f2387z0 = false;
        }
        this.f2385x0.onTouchEvent(motionEvent);
        this.f2384w0.B(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f2386y0) {
            if (ceVar.f2483r.getTranslationY() > 0.0f) {
                if (ceVar.K > 0.4f) {
                    ceVar.q(true);
                } else {
                    ce.c(ceVar);
                }
            } else {
                xc xcVar = ceVar.M0;
                if (xcVar != null && xcVar.getTranslationY() > 0.0f && !ceVar.L0) {
                    ceVar.f((ceVar.Q1 || ceVar.M0.getTranslationY() >= ((float) ceVar.M0.getPadding())) ? false : false);
                }
            }
            ceVar.L0 = false;
            ceVar.W = false;
            ceVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        ce ceVar = this.E0;
        return (height - ceVar.f2483r.getBottom()) + ceVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f2483r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ce ceVar = this.E0;
        return (height - ceVar.f2434b0) - ceVar.f2483r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        xh.t3 t3Var;
        rz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ce ceVar = this.E0;
        int i15 = ceVar.Z;
        int measuredHeight2 = ceVar.m0.getMeasuredHeight();
        if (ceVar.V) {
            i15 = 0;
        }
        int i16 = ceVar.S;
        int b10 = w7.q.b((measuredWidth - i16) / 2, ceVar.Y, (measuredWidth - ceVar.f2431a0) - i16);
        int i17 = ceVar.S + b10;
        if (ceVar.V) {
            i14 = ceVar.T;
        } else {
            int i18 = ceVar.f2434b0;
            int i19 = ceVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (ceVar.J == 1) {
                float f7 = ceVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = ceVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = ceVar.T;
        }
        ceVar.f2483r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        ceVar.f2487s.f3077b.layout(0, 0, measuredWidth, measuredHeight);
        gd gdVar = ceVar.C2;
        if (gdVar != null) {
            gdVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        xc xcVar = ceVar.M0;
        if (xcVar != null) {
            xcVar.layout((measuredWidth - xcVar.getMeasuredWidth()) / 2, 0, (ceVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        qd qdVar = ceVar.f2439c1;
        if (qdVar != null && (emojiView = qdVar.f3268f.getEmojiView()) != null) {
            emojiView.layout(ceVar.Y, (measuredHeight - ceVar.f2434b0) - emojiView.getMeasuredHeight(), measuredWidth - ceVar.f2431a0, measuredHeight - ceVar.f2434b0);
        }
        ad adVar = ceVar.f2498v1;
        if (adVar != null) {
            rz rzVar = adVar.f3529p2;
            if (rzVar != null) {
                rzVar.layout(ceVar.Y, (measuredHeight - ceVar.f2434b0) - rzVar.getMeasuredHeight(), measuredWidth - ceVar.f2431a0, measuredHeight - ceVar.f2434b0);
            }
            pk0 pk0Var = ceVar.f2498v1.Z1;
            if (pk0Var != null) {
                int i21 = ceVar.Y;
                pk0Var.layout(i21, ceVar.Z, pk0Var.getMeasuredWidth() + i21, ceVar.f2498v1.Z1.getMeasuredHeight() + ceVar.Z);
                if (ceVar.f2498v1.Z1.getReactionsWindow() != null) {
                    t3Var = ceVar.f2498v1.Z1.getReactionsWindow().f46952c;
                } else {
                    t3Var = null;
                }
                if (t3Var != null) {
                    int i22 = ceVar.Y;
                    t3Var.layout(i22, ceVar.Z, t3Var.getMeasuredWidth() + i22, t3Var.getMeasuredHeight() + ceVar.Z);
                }
            }
        }
        id idVar = ceVar.f2485r1;
        if (idVar != null) {
            idVar.e.setPadding(0, ceVar.Z, 0, ceVar.f2434b0);
            ceVar.f2485r1.layout(0, 0, measuredWidth, measuredHeight);
            ceVar.f2485r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        jd jdVar = ceVar.f2489s1;
        if (jdVar != null) {
            jdVar.f3432f.setPadding(0, ceVar.Z, 0, ceVar.f2434b0);
            ceVar.f2489s1.layout(0, 0, measuredWidth, measuredHeight);
            ceVar.f2489s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof x0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.hb) {
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
        ce ceVar = this.E0;
        int i15 = (size - ceVar.Y) - ceVar.f2431a0;
        int i16 = ceVar.Z;
        int i17 = ceVar.f2434b0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        ceVar.U = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            ceVar.S = i15;
            ceVar.T = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            ceVar.V = z10;
        } else {
            ceVar.V = false;
            int i20 = ((size2 - dp) - i17) - i16;
            ceVar.T = i20;
            ceVar.S = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - ceVar.T;
        if (ceVar.V) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        ceVar.U = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (ceVar.V) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        ceVar.f2483r.measure(View.MeasureSpec.makeMeasureSpec(ceVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(ceVar.T + ceVar.U, 1073741824));
        ceVar.f2487s.f3077b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        gd gdVar = ceVar.C2;
        if (gdVar != null) {
            gdVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        xc xcVar = ceVar.M0;
        if (xcVar != null) {
            xcVar.measure(View.MeasureSpec.makeMeasureSpec(ceVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        qd qdVar = ceVar.f2439c1;
        if (qdVar != null) {
            rz emojiView = qdVar.f3268f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        ad adVar = ceVar.f2498v1;
        if (adVar != null) {
            rz rzVar = adVar.f3529p2;
            if (rzVar != null) {
                rzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(ceVar.f2498v1.f3529p2.getLayoutParams().height, 1073741824));
            }
            pk0 pk0Var = ceVar.f2498v1.Z1;
            if (pk0Var != null) {
                measureChild(pk0Var, i10, i11);
                if (ceVar.f2498v1.Z1.getReactionsWindow() != null) {
                    measureChild(ceVar.f2498v1.Z1.getReactionsWindow().f46952c, i10, i11);
                }
            }
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof x0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.hb) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int dp2 = AndroidUtilities.dp(340.0f);
                if (ceVar.V) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        id idVar = ceVar.f2485r1;
        if (idVar != null) {
            idVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            ceVar.f2485r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        jd jdVar = ceVar.f2489s1;
        if (jdVar != null) {
            jdVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            ceVar.f2489s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
