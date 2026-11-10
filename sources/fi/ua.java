package fi;

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
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.st0;
public final class ua extends st0 {
    public final qt f12903f0;
    public final ScaleGestureDetector f12904g0;
    public boolean f12905h0;
    public boolean f12906i0;
    public boolean f12907j0;
    public float f12908k0;
    public float f12909l0;
    public float m0;
    public final va f12910n0;

    public ua(va vaVar, Activity activity) {
        super(activity, null);
        this.f12910n0 = vaVar;
        this.f12907j0 = false;
        this.f12903f0 = new qt(activity, new sa(this));
        this.f12904g0 = new ScaleGestureDetector(activity, new ta(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        va vaVar = this.f12910n0;
        float width = bitmap.getWidth() / vaVar.f12977n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = vaVar.X0.getTextureView();
        if (textureView == null) {
            textureView = vaVar.X0.f13186r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(vaVar.f12961h0.getX() + vaVar.f12989r.getX(), vaVar.f12961h0.getY() + vaVar.f12989r.getY());
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
        canvas.translate(vaVar.f12989r.getX(), vaVar.f12989r.getY());
        for (int i7 = 0; i7 < vaVar.f12989r.getChildCount(); i7++) {
            View childAt = vaVar.f12989r.getChildAt(i7);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == vaVar.f12961h0) {
                    for (int i10 = 0; i10 < vaVar.f12961h0.getChildCount(); i10++) {
                        View childAt2 = vaVar.f12961h0.getChildAt(i10);
                        if (childAt2 != vaVar.X0 && childAt2 != vaVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: fi.ua.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f12910n0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9 = false;
        this.f12905h0 = false;
        va vaVar = this.f12910n0;
        y yVar = vaVar.I0;
        boolean z10 = true;
        if (yVar != null && yVar.f13110e) {
            float y10 = vaVar.I0.getY() + vaVar.f12964i0.getY() + vaVar.f12989r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + vaVar.I0.getHeight()) || this.f12906i0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z9 = true;
                }
                this.f12906i0 = z9;
                return super.dispatchTouchEvent(motionEvent);
            }
            vaVar.I0.a(false, true);
            vaVar.l0(true);
        }
        if (this.f12906i0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f12906i0 = false;
        }
        this.f12904g0.onTouchEvent(motionEvent);
        this.f12903f0.n0(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f12905h0) {
            if (vaVar.f12989r.getTranslationY() > 0.0f) {
                if (vaVar.K > 0.4f) {
                    vaVar.p(true);
                } else {
                    va.b(vaVar);
                }
            } else {
                i3 i3Var = vaVar.M0;
                if (i3Var != null && i3Var.getTranslationY() > 0.0f && !vaVar.L0) {
                    if (vaVar.Q1 || vaVar.M0.getTranslationY() >= vaVar.M0.getPadding()) {
                        z10 = false;
                    }
                    vaVar.e(z10);
                }
            }
            vaVar.L0 = false;
            vaVar.W = false;
            vaVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        va vaVar = this.f12910n0;
        return (height - vaVar.f12989r.getBottom()) + vaVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f12910n0.f12989r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        va vaVar = this.f12910n0;
        return (height - vaVar.f12941b0) - vaVar.f12989r.getBottom();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        bi.x5 x5Var;
        gy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        va vaVar = this.f12910n0;
        int i14 = vaVar.Z;
        int measuredHeight2 = vaVar.m0.getMeasuredHeight();
        if (vaVar.V) {
            i14 = 0;
        }
        int i15 = vaVar.S;
        int b10 = c8.j9.b((measuredWidth - i15) / 2, vaVar.Y, (measuredWidth - vaVar.f12937a0) - i15);
        int i16 = vaVar.S + b10;
        if (vaVar.V) {
            i13 = vaVar.T;
        } else {
            int i17 = vaVar.f12941b0;
            int i18 = vaVar.T;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (vaVar.J == 1) {
                float f10 = vaVar.H.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = vaVar.T;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = vaVar.T;
        }
        vaVar.f12989r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        vaVar.f12993s.f12577b.layout(0, 0, measuredWidth, measuredHeight);
        da daVar = vaVar.C2;
        if (daVar != null) {
            daVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        i3 i3Var = vaVar.M0;
        if (i3Var != null) {
            i3Var.layout((measuredWidth - i3Var.getMeasuredWidth()) / 2, 0, (vaVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        la laVar = vaVar.f12946c1;
        if (laVar != null && (emojiView = laVar.f12367f.getEmojiView()) != null) {
            emojiView.layout(vaVar.Y, (measuredHeight - vaVar.f12941b0) - emojiView.getMeasuredHeight(), measuredWidth - vaVar.f12937a0, measuredHeight - vaVar.f12941b0);
        }
        x9 x9Var = vaVar.f13004v1;
        if (x9Var != null) {
            gy gyVar = x9Var.Y1;
            if (gyVar != null) {
                gyVar.layout(vaVar.Y, (measuredHeight - vaVar.f12941b0) - gyVar.getMeasuredHeight(), measuredWidth - vaVar.f12937a0, measuredHeight - vaVar.f12941b0);
            }
            ii0 ii0Var = vaVar.f13004v1.I1;
            if (ii0Var != null) {
                int i20 = vaVar.Y;
                ii0Var.layout(i20, vaVar.Z, ii0Var.getMeasuredWidth() + i20, vaVar.f13004v1.I1.getMeasuredHeight() + vaVar.Z);
                if (vaVar.f13004v1.I1.getReactionsWindow() != null) {
                    x5Var = vaVar.f13004v1.I1.getReactionsWindow().f6188c;
                } else {
                    x5Var = null;
                }
                if (x5Var != null) {
                    int i21 = vaVar.Y;
                    x5Var.layout(i21, vaVar.Z, x5Var.getMeasuredWidth() + i21, x5Var.getMeasuredHeight() + vaVar.Z);
                }
            }
        }
        fa faVar = vaVar.f12991r1;
        if (faVar != null) {
            faVar.f12204e.setPadding(0, vaVar.Z, 0, vaVar.f12941b0);
            vaVar.f12991r1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.f12991r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ga gaVar = vaVar.f12995s1;
        if (gaVar != null) {
            gaVar.f12398f.setPadding(0, vaVar.Z, 0, vaVar.f12941b0);
            vaVar.f12995s1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.f12995s1.f12397e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt = getChildAt(i22);
            if (childAt instanceof s0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.ta) {
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
        boolean z9;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        va vaVar = this.f12910n0;
        int i15 = (size - vaVar.Y) - vaVar.f12937a0;
        int i16 = vaVar.Z;
        int i17 = vaVar.f12941b0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        vaVar.U = L;
        int i18 = ceil + L;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            vaVar.S = i15;
            vaVar.T = ceil;
            if (i18 > i19 - i16) {
                z9 = true;
            } else {
                z9 = false;
            }
            vaVar.V = z9;
        } else {
            vaVar.V = false;
            vaVar.T = ((size2 - L) - i17) - i16;
            vaVar.S = (int) Math.ceil((i11 * 9.0f) / 16.0f);
        }
        int i20 = size2 - vaVar.T;
        if (vaVar.V) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        vaVar.U = Utilities.j(i20 - i12, org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (vaVar.V) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        vaVar.f12989r.measure(View.MeasureSpec.makeMeasureSpec(vaVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(vaVar.T + vaVar.U, 1073741824));
        vaVar.f12993s.f12577b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        da daVar = vaVar.C2;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        i3 i3Var = vaVar.M0;
        if (i3Var != null) {
            i3Var.measure(View.MeasureSpec.makeMeasureSpec(vaVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        la laVar = vaVar.f12946c1;
        if (laVar != null) {
            gy emojiView = laVar.f12367f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        x9 x9Var = vaVar.f13004v1;
        if (x9Var != null) {
            gy gyVar = x9Var.Y1;
            if (gyVar != null) {
                gyVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(vaVar.f13004v1.Y1.getLayoutParams().height, 1073741824));
            }
            ii0 ii0Var = vaVar.f13004v1.I1;
            if (ii0Var != null) {
                measureChild(ii0Var, i7, i10);
                if (vaVar.f13004v1.I1.getReactionsWindow() != null) {
                    measureChild(vaVar.f13004v1.I1.getReactionsWindow().f6188c, i7, i10);
                }
            }
        }
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt instanceof s0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.ta) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                int L2 = org.telegram.messenger.g0.L(340.0f);
                if (vaVar.V) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i14), 1073741824));
            }
        }
        fa faVar = vaVar.f12991r1;
        if (faVar != null) {
            faVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vaVar.f12991r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ga gaVar = vaVar.f12995s1;
        if (gaVar != null) {
            gaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vaVar.f12995s1.f12397e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
