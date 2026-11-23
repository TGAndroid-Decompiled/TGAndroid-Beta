package hi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xi0;
public final class ra extends du0 {
    public final qf f15346g0;
    public final ScaleGestureDetector f15347h0;
    public boolean f15348i0;
    public boolean f15349j0;
    public boolean f15350k0;
    public float f15351l0;
    public float m0;
    public float f15352n0;
    public final sa f15353o0;

    public ra(sa saVar, Activity activity) {
        super(activity, null);
        this.f15353o0 = saVar;
        this.f15350k0 = false;
        this.f15346g0 = new qf(activity, new pa(this));
        this.f15347h0 = new ScaleGestureDetector(activity, new qa(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        sa saVar = this.f15353o0;
        float width = bitmap.getWidth() / saVar.f15425n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = saVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = saVar.Y0.f15641r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(saVar.f15412i0.getX() + saVar.f15437r.getX(), saVar.f15412i0.getY() + saVar.f15437r.getY());
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
        canvas.translate(saVar.f15437r.getX(), saVar.f15437r.getY());
        for (int i7 = 0; i7 < saVar.f15437r.getChildCount(); i7++) {
            View childAt = saVar.f15437r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == saVar.f15412i0) {
                    for (int i10 = 0; i10 < saVar.f15412i0.getChildCount(); i10++) {
                        View childAt2 = saVar.f15412i0.getChildAt(i10);
                        if (childAt2 != saVar.Y0 && childAt2 != saVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.ra.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f15353o0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f15348i0 = false;
        sa saVar = this.f15353o0;
        a0 a0Var = saVar.J0;
        boolean z11 = true;
        if (a0Var != null && a0Var.f14208e) {
            float y10 = saVar.J0.getY() + saVar.f15415j0.getY() + saVar.f15437r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + saVar.J0.getHeight()) || this.f15349j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f15349j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            saVar.J0.a(false, true);
            saVar.l0(true);
        }
        if (this.f15349j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f15349j0 = false;
        }
        this.f15347h0.onTouchEvent(motionEvent);
        this.f15346g0.w0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f15348i0) {
            if (saVar.f15437r.getTranslationY() > 0.0f) {
                if (saVar.L > 0.4f) {
                    saVar.p(true);
                } else {
                    sa.b(saVar);
                }
            } else {
                g3 g3Var = saVar.N0;
                if (g3Var != null && g3Var.getTranslationY() > 0.0f && !saVar.M0) {
                    if (saVar.R1 || saVar.N0.getTranslationY() >= saVar.N0.getPadding()) {
                        z11 = false;
                    }
                    saVar.e(z11);
                }
            }
            saVar.M0 = false;
            saVar.X = false;
            saVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        sa saVar = this.f15353o0;
        return (height - saVar.f15437r.getBottom()) + saVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f15353o0.f15437r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sa saVar = this.f15353o0;
        return (height - saVar.f15393c0) - saVar.f15437r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        ai.l0 l0Var;
        ty emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sa saVar = this.f15353o0;
        int i14 = saVar.f15385a0;
        int measuredHeight2 = saVar.f15426n0.getMeasuredHeight();
        if (saVar.W) {
            i14 = 0;
        }
        int i15 = saVar.T;
        int b10 = c8.l9.b((measuredWidth - i15) / 2, saVar.Z, (measuredWidth - saVar.f15389b0) - i15);
        int i16 = saVar.T + b10;
        if (saVar.W) {
            i13 = saVar.U;
        } else {
            int i17 = saVar.f15393c0;
            int i18 = saVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (saVar.K == 1) {
                float f10 = saVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = saVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = saVar.U;
        }
        saVar.f15437r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        saVar.f15441s.f15074b.layout(0, 0, measuredWidth, measuredHeight);
        aa aaVar = saVar.D2;
        if (aaVar != null) {
            aaVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        g3 g3Var = saVar.N0;
        if (g3Var != null) {
            g3Var.layout((measuredWidth - g3Var.getMeasuredWidth()) / 2, 0, (saVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ia iaVar = saVar.f15397d1;
        if (iaVar != null && (emojiView = iaVar.f15151f.getEmojiView()) != null) {
            emojiView.layout(saVar.Z, (measuredHeight - saVar.f15393c0) - emojiView.getMeasuredHeight(), measuredWidth - saVar.f15389b0, measuredHeight - saVar.f15393c0);
        }
        u9 u9Var = saVar.f15456w1;
        if (u9Var != null) {
            ty tyVar = u9Var.Z1;
            if (tyVar != null) {
                tyVar.layout(saVar.Z, (measuredHeight - saVar.f15393c0) - tyVar.getMeasuredHeight(), measuredWidth - saVar.f15389b0, measuredHeight - saVar.f15393c0);
            }
            xi0 xi0Var = saVar.f15456w1.J1;
            if (xi0Var != null) {
                int i20 = saVar.Z;
                xi0Var.layout(i20, saVar.f15385a0, xi0Var.getMeasuredWidth() + i20, saVar.f15456w1.J1.getMeasuredHeight() + saVar.f15385a0);
                if (saVar.f15456w1.J1.getReactionsWindow() != null) {
                    l0Var = saVar.f15456w1.J1.getReactionsWindow().f5328c;
                } else {
                    l0Var = null;
                }
                if (l0Var != null) {
                    int i21 = saVar.Z;
                    l0Var.layout(i21, saVar.f15385a0, l0Var.getMeasuredWidth() + i21, l0Var.getMeasuredHeight() + saVar.f15385a0);
                }
            }
        }
        ca caVar = saVar.f15443s1;
        if (caVar != null) {
            caVar.f14955e.setPadding(0, saVar.f15385a0, 0, saVar.f15393c0);
            saVar.f15443s1.layout(0, 0, measuredWidth, measuredHeight);
            saVar.f15443s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        da daVar = saVar.f15446t1;
        if (daVar != null) {
            daVar.f15182f.setPadding(0, saVar.f15385a0, 0, saVar.f15393c0);
            saVar.f15446t1.layout(0, 0, measuredWidth, measuredHeight);
            saVar.f15446t1.f15181e.layout(0, 0, measuredWidth, measuredHeight);
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        sa saVar = this.f15353o0;
        int i15 = (size - saVar.Z) - saVar.f15389b0;
        int i16 = saVar.f15385a0;
        int i17 = saVar.f15393c0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        saVar.V = L;
        int i18 = ceil + L;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            saVar.T = i15;
            saVar.U = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            saVar.W = z10;
        } else {
            saVar.W = false;
            saVar.U = ((size2 - L) - i17) - i16;
            saVar.T = (int) Math.ceil((i11 * 9.0f) / 16.0f);
        }
        int i20 = size2 - saVar.U;
        if (saVar.W) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        saVar.V = Utilities.j(i20 - i12, org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (saVar.W) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        saVar.f15437r.measure(View.MeasureSpec.makeMeasureSpec(saVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(saVar.U + saVar.V, 1073741824));
        saVar.f15441s.f15074b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        aa aaVar = saVar.D2;
        if (aaVar != null) {
            aaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        g3 g3Var = saVar.N0;
        if (g3Var != null) {
            g3Var.measure(View.MeasureSpec.makeMeasureSpec(saVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ia iaVar = saVar.f15397d1;
        if (iaVar != null) {
            ty emojiView = iaVar.f15151f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        u9 u9Var = saVar.f15456w1;
        if (u9Var != null) {
            ty tyVar = u9Var.Z1;
            if (tyVar != null) {
                tyVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(saVar.f15456w1.Z1.getLayoutParams().height, 1073741824));
            }
            xi0 xi0Var = saVar.f15456w1.J1;
            if (xi0Var != null) {
                measureChild(xi0Var, i7, i10);
                if (saVar.f15456w1.J1.getReactionsWindow() != null) {
                    measureChild(saVar.f15456w1.J1.getReactionsWindow().f5328c, i7, i10);
                }
            }
        }
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt instanceof u0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int L2 = org.telegram.messenger.g0.L(340.0f);
                if (saVar.W) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i14), 1073741824));
            }
        }
        ca caVar = saVar.f15443s1;
        if (caVar != null) {
            caVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            saVar.f15443s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        da daVar = saVar.f15446t1;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            saVar.f15446t1.f15181e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
