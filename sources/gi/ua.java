package gi;

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
import b8.be;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.y00;
public final class ua extends qt0 {
    public final y00 f13667g0;
    public final ScaleGestureDetector f13668h0;
    public boolean f13669i0;
    public boolean f13670j0;
    public boolean f13671k0;
    public float f13672l0;
    public float m0;
    public float f13673n0;
    public final va f13674o0;

    public ua(va vaVar, Activity activity) {
        super(activity, null);
        this.f13674o0 = vaVar;
        this.f13671k0 = false;
        this.f13667g0 = new y00((Context) activity, (x00) new sa(this));
        this.f13668h0 = new ScaleGestureDetector(activity, new ta(this));
    }

    public final void X(float f10, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        va vaVar = this.f13674o0;
        float width = bitmap.getWidth() / vaVar.f13738n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = vaVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = vaVar.Y0.f13958r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(vaVar.f13726i0.getX() + vaVar.f13751r.getX(), vaVar.f13726i0.getY() + vaVar.f13751r.getY());
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
        canvas.translate(vaVar.f13751r.getX(), vaVar.f13751r.getY());
        for (int i3 = 0; i3 < vaVar.f13751r.getChildCount(); i3++) {
            View childAt = vaVar.f13751r.getChildAt(i3);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == vaVar.f13726i0) {
                    for (int i10 = 0; i10 < vaVar.f13726i0.getChildCount(); i10++) {
                        View childAt2 = vaVar.f13726i0.getChildAt(i10);
                        if (childAt2 != vaVar.Y0 && childAt2 != vaVar.C0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: gi.ua.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f13674o0.L();
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f13669i0 = false;
        va vaVar = this.f13674o0;
        y yVar = vaVar.J0;
        boolean z11 = true;
        if (yVar != null && yVar.f13878e) {
            float y9 = vaVar.J0.getY() + vaVar.f13729j0.getY() + vaVar.f13751r.getY();
            if ((motionEvent.getY() >= y9 && motionEvent.getY() <= y9 + vaVar.J0.getHeight()) || this.f13670j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f13670j0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            vaVar.J0.a(false, true);
            vaVar.l0(true);
        }
        if (this.f13670j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f13670j0 = false;
        }
        this.f13668h0.onTouchEvent(motionEvent);
        this.f13667g0.y(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f13669i0) {
            if (vaVar.f13751r.getTranslationY() > 0.0f) {
                if (vaVar.L > 0.4f) {
                    vaVar.p(true);
                } else {
                    va.b(vaVar);
                }
            } else {
                g3 g3Var = vaVar.N0;
                if (g3Var != null && g3Var.getTranslationY() > 0.0f && !vaVar.M0) {
                    if (vaVar.R1 || vaVar.N0.getTranslationY() >= vaVar.N0.getPadding()) {
                        z11 = false;
                    }
                    vaVar.e(z11);
                }
            }
            vaVar.M0 = false;
            vaVar.X = false;
            vaVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        va vaVar = this.f13674o0;
        return (height - vaVar.f13751r.getBottom()) + vaVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.f13674o0.f13751r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        va vaVar = this.f13674o0;
        return (height - vaVar.f13707c0) - vaVar.f13751r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        ai.c0 c0Var;
        ey emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        va vaVar = this.f13674o0;
        int i14 = vaVar.f13699a0;
        int measuredHeight2 = vaVar.f13739n0.getMeasuredHeight();
        if (vaVar.W) {
            i14 = 0;
        }
        int i15 = vaVar.T;
        int b10 = be.b((measuredWidth - i15) / 2, vaVar.Z, (measuredWidth - vaVar.f13703b0) - i15);
        int i16 = vaVar.T + b10;
        if (vaVar.W) {
            i13 = vaVar.U;
        } else {
            int i17 = vaVar.f13707c0;
            int i18 = vaVar.U;
            int i19 = (((((measuredHeight - i14) - i17) - i18) - measuredHeight2) / 2) + i14;
            if (vaVar.K == 1) {
                float f10 = vaVar.I.top;
                if (i18 + f10 + measuredHeight2 < measuredHeight - i17) {
                    i14 = (int) f10;
                    i13 = vaVar.U;
                }
            }
            if (i19 - i14 >= org.telegram.messenger.g0.L(40.0f)) {
                i14 = i19;
            }
            i13 = vaVar.U;
        }
        vaVar.f13751r.layout(b10, i14, i16, i13 + i14 + measuredHeight2);
        vaVar.f13755s.f13281b.layout(0, 0, measuredWidth, measuredHeight);
        da daVar = vaVar.D2;
        if (daVar != null) {
            daVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        g3 g3Var = vaVar.N0;
        if (g3Var != null) {
            g3Var.layout((measuredWidth - g3Var.getMeasuredWidth()) / 2, 0, (vaVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        la laVar = vaVar.f13710d1;
        if (laVar != null && (emojiView = laVar.f13144f.getEmojiView()) != null) {
            emojiView.layout(vaVar.Z, (measuredHeight - vaVar.f13707c0) - emojiView.getMeasuredHeight(), measuredWidth - vaVar.f13703b0, measuredHeight - vaVar.f13707c0);
        }
        x9 x9Var = vaVar.f13770w1;
        if (x9Var != null) {
            ey eyVar = x9Var.Z1;
            if (eyVar != null) {
                eyVar.layout(vaVar.Z, (measuredHeight - vaVar.f13707c0) - eyVar.getMeasuredHeight(), measuredWidth - vaVar.f13703b0, measuredHeight - vaVar.f13707c0);
            }
            li0 li0Var = vaVar.f13770w1.J1;
            if (li0Var != null) {
                int i20 = vaVar.Z;
                li0Var.layout(i20, vaVar.f13699a0, li0Var.getMeasuredWidth() + i20, vaVar.f13770w1.J1.getMeasuredHeight() + vaVar.f13699a0);
                if (vaVar.f13770w1.J1.getReactionsWindow() != null) {
                    c0Var = vaVar.f13770w1.J1.getReactionsWindow().f8933c;
                } else {
                    c0Var = null;
                }
                if (c0Var != null) {
                    int i21 = vaVar.Z;
                    c0Var.layout(i21, vaVar.f13699a0, c0Var.getMeasuredWidth() + i21, c0Var.getMeasuredHeight() + vaVar.f13699a0);
                }
            }
        }
        fa faVar = vaVar.f13757s1;
        if (faVar != null) {
            faVar.f12991e.setPadding(0, vaVar.f13699a0, 0, vaVar.f13707c0);
            vaVar.f13757s1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.f13757s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ga gaVar = vaVar.f13760t1;
        if (gaVar != null) {
            gaVar.f13175f.setPadding(0, vaVar.f13699a0, 0, vaVar.f13707c0);
            vaVar.f13760t1.layout(0, 0, measuredWidth, measuredHeight);
            vaVar.f13760t1.f13174e.layout(0, 0, measuredWidth, measuredHeight);
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        va vaVar = this.f13674o0;
        int i15 = (size - vaVar.Z) - vaVar.f13703b0;
        int i16 = vaVar.f13699a0;
        int i17 = vaVar.f13707c0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        vaVar.V = L;
        int i18 = ceil + L;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            vaVar.T = i15;
            vaVar.U = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            vaVar.W = z10;
        } else {
            vaVar.W = false;
            vaVar.U = ((size2 - L) - i17) - i16;
            vaVar.T = (int) Math.ceil((i11 * 9.0f) / 16.0f);
        }
        int i20 = size2 - vaVar.U;
        if (vaVar.W) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        vaVar.V = Utilities.j(i20 - i12, org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (vaVar.W) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        vaVar.f13751r.measure(View.MeasureSpec.makeMeasureSpec(vaVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(vaVar.U + vaVar.V, 1073741824));
        vaVar.f13755s.f13281b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        da daVar = vaVar.D2;
        if (daVar != null) {
            daVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        g3 g3Var = vaVar.N0;
        if (g3Var != null) {
            g3Var.measure(View.MeasureSpec.makeMeasureSpec(vaVar.T, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        la laVar = vaVar.f13710d1;
        if (laVar != null) {
            ey emojiView = laVar.f13144f.getEmojiView();
            Q();
            org.telegram.messenger.g0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        x9 x9Var = vaVar.f13770w1;
        if (x9Var != null) {
            ey eyVar = x9Var.Z1;
            if (eyVar != null) {
                eyVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(vaVar.f13770w1.Z1.getLayoutParams().height, 1073741824));
            }
            li0 li0Var = vaVar.f13770w1.J1;
            if (li0Var != null) {
                measureChild(li0Var, i3, i10);
                if (vaVar.f13770w1.J1.getReactionsWindow() != null) {
                    measureChild(vaVar.f13770w1.J1.getReactionsWindow().f8933c, i3, i10);
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
                if (vaVar.W) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(L2, size2 - i14), 1073741824));
            }
        }
        fa faVar = vaVar.f13757s1;
        if (faVar != null) {
            faVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vaVar.f13757s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ga gaVar = vaVar.f13760t1;
        if (gaVar != null) {
            gaVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            vaVar.f13760t1.f13174e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
