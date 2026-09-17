package di;

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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ov0;
public final class oc extends ov0 {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public final pc E0;
    public final mg.n f7832w0;
    public final ScaleGestureDetector f7833x0;
    public boolean f7834y0;
    public boolean f7835z0;

    public oc(pc pcVar, Activity activity) {
        super(activity, null);
        this.E0 = pcVar;
        this.A0 = false;
        this.f7832w0 = new mg.n(activity, new mc(this));
        this.f7833x0 = new ScaleGestureDetector(activity, new nc(this));
    }

    public final void Z(Bitmap bitmap, float f7) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        pc pcVar = this.E0;
        float width = bitmap.getWidth() / pcVar.f7910n.getWidth();
        canvas.scale(width, width);
        TextureView textureView = pcVar.X0.getTextureView();
        if (textureView == null) {
            textureView = pcVar.X0.f7118r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(pcVar.f7894h0.getX() + pcVar.f7923r.getX(), pcVar.f7894h0.getY() + pcVar.f7923r.getY());
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
        canvas.translate(pcVar.f7923r.getX(), pcVar.f7923r.getY());
        for (int i10 = 0; i10 < pcVar.f7923r.getChildCount(); i10++) {
            View childAt = pcVar.f7923r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == pcVar.f7894h0) {
                    for (int i11 = 0; i11 < pcVar.f7894h0.getChildCount(); i11++) {
                        View childAt2 = pcVar.f7894h0.getChildAt(i11);
                        if (childAt2 != pcVar.X0 && childAt2 != pcVar.B0 && childAt2.getVisibility() == 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: di.oc.dispatchDraw(android.graphics.Canvas):void");
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
        this.f7834y0 = false;
        pc pcVar = this.E0;
        y yVar = pcVar.I0;
        boolean z11 = true;
        if (yVar != null && yVar.f8471e) {
            float y3 = pcVar.I0.getY() + pcVar.f7897i0.getY() + pcVar.f7923r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + pcVar.I0.getHeight()) || this.f7835z0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f7835z0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            pcVar.I0.a(false, true);
            pcVar.m0(true);
        }
        if (this.f7835z0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f7835z0 = false;
        }
        this.f7833x0.onTouchEvent(motionEvent);
        this.f7832w0.h(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f7834y0) {
            if (pcVar.f7923r.getTranslationY() > 0.0f) {
                if (pcVar.K > 0.4f) {
                    pcVar.q(true);
                } else {
                    pc.c(pcVar);
                }
            } else {
                ob obVar = pcVar.M0;
                if (obVar != null && obVar.getTranslationY() > 0.0f && !pcVar.L0) {
                    pcVar.f((pcVar.Q1 || pcVar.M0.getTranslationY() >= ((float) pcVar.M0.getPadding())) ? false : false);
                }
            }
            pcVar.L0 = false;
            pcVar.W = false;
            pcVar.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        pc pcVar = this.E0;
        return (height - pcVar.f7923r.getBottom()) + pcVar.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.E0.f7923r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        pc pcVar = this.E0;
        return (height - pcVar.f7873b0) - pcVar.f7923r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        ah.w wVar;
        kz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        pc pcVar = this.E0;
        int i15 = pcVar.Z;
        int measuredHeight2 = pcVar.m0.getMeasuredHeight();
        if (pcVar.V) {
            i15 = 0;
        }
        int i16 = pcVar.S;
        int b10 = w7.p.b((measuredWidth - i16) / 2, pcVar.Y, (measuredWidth - pcVar.f7870a0) - i16);
        int i17 = pcVar.S + b10;
        if (pcVar.V) {
            i14 = pcVar.T;
        } else {
            int i18 = pcVar.f7873b0;
            int i19 = pcVar.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (pcVar.J == 1) {
                float f7 = pcVar.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = pcVar.T;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = pcVar.T;
        }
        pcVar.f7923r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        pcVar.f7927s.f8477b.layout(0, 0, measuredWidth, measuredHeight);
        xb xbVar = pcVar.C2;
        if (xbVar != null) {
            xbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        ob obVar = pcVar.M0;
        if (obVar != null) {
            obVar.layout((measuredWidth - obVar.getMeasuredWidth()) / 2, 0, (pcVar.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        fc fcVar = pcVar.f7878c1;
        if (fcVar != null && (emojiView = fcVar.f7621f.getEmojiView()) != null) {
            emojiView.layout(pcVar.Y, (measuredHeight - pcVar.f7873b0) - emojiView.getMeasuredHeight(), measuredWidth - pcVar.f7870a0, measuredHeight - pcVar.f7873b0);
        }
        rb rbVar = pcVar.f7938v1;
        if (rbVar != null) {
            kz kzVar = rbVar.f8010p2;
            if (kzVar != null) {
                kzVar.layout(pcVar.Y, (measuredHeight - pcVar.f7873b0) - kzVar.getMeasuredHeight(), measuredWidth - pcVar.f7870a0, measuredHeight - pcVar.f7873b0);
            }
            fk0 fk0Var = pcVar.f7938v1.Z1;
            if (fk0Var != null) {
                int i21 = pcVar.Y;
                fk0Var.layout(i21, pcVar.Z, fk0Var.getMeasuredWidth() + i21, pcVar.f7938v1.Z1.getMeasuredHeight() + pcVar.Z);
                if (pcVar.f7938v1.Z1.getReactionsWindow() != null) {
                    wVar = pcVar.f7938v1.Z1.getReactionsWindow().f699c;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    int i22 = pcVar.Y;
                    wVar.layout(i22, pcVar.Z, wVar.getMeasuredWidth() + i22, wVar.getMeasuredHeight() + pcVar.Z);
                }
            }
        }
        zb zbVar = pcVar.f7925r1;
        if (zbVar != null) {
            zbVar.f7441e.setPadding(0, pcVar.Z, 0, pcVar.f7873b0);
            pcVar.f7925r1.layout(0, 0, measuredWidth, measuredHeight);
            pcVar.f7925r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ac acVar = pcVar.f7929s1;
        if (acVar != null) {
            acVar.f7652f.setPadding(0, pcVar.Z, 0, pcVar.f7873b0);
            pcVar.f7929s1.layout(0, 0, measuredWidth, measuredHeight);
            pcVar.f7929s1.f7651e.layout(0, 0, measuredWidth, measuredHeight);
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
        pc pcVar = this.E0;
        int i15 = (size - pcVar.Y) - pcVar.f7870a0;
        int i16 = pcVar.Z;
        int i17 = pcVar.f7873b0;
        int ceil = (int) Math.ceil((i15 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        pcVar.U = dp;
        int i18 = ceil + dp;
        int i19 = size2 - i17;
        if (i18 <= i19) {
            pcVar.S = i15;
            pcVar.T = ceil;
            if (i18 > i19 - i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            pcVar.V = z10;
        } else {
            pcVar.V = false;
            int i20 = ((size2 - dp) - i17) - i16;
            pcVar.T = i20;
            pcVar.S = (int) Math.ceil((i20 * 9.0f) / 16.0f);
        }
        int i21 = size2 - pcVar.T;
        if (pcVar.V) {
            i12 = 0;
        } else {
            i12 = i16;
        }
        pcVar.U = Utilities.clamp(i21 - i12, AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        if (pcVar.V) {
            i13 = systemUiVisibility | 4;
        } else {
            i13 = systemUiVisibility & (-5);
        }
        setSystemUiVisibility(i13);
        pcVar.f7923r.measure(View.MeasureSpec.makeMeasureSpec(pcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(pcVar.T + pcVar.U, 1073741824));
        pcVar.f7927s.f8477b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        xb xbVar = pcVar.C2;
        if (xbVar != null) {
            xbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ob obVar = pcVar.M0;
        if (obVar != null) {
            obVar.measure(View.MeasureSpec.makeMeasureSpec(pcVar.S, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        fc fcVar = pcVar.f7878c1;
        if (fcVar != null) {
            kz emojiView = fcVar.f7621f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        rb rbVar = pcVar.f7938v1;
        if (rbVar != null) {
            kz kzVar = rbVar.f8010p2;
            if (kzVar != null) {
                kzVar.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(pcVar.f7938v1.f8010p2.getLayoutParams().height, 1073741824));
            }
            fk0 fk0Var = pcVar.f7938v1.Z1;
            if (fk0Var != null) {
                measureChild(fk0Var, i10, i11);
                if (pcVar.f7938v1.Z1.getReactionsWindow() != null) {
                    measureChild(pcVar.f7938v1.Z1.getReactionsWindow().f699c, i10, i11);
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
                if (pcVar.V) {
                    i14 = 0;
                } else {
                    i14 = i16;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(dp2, size2 - i14), 1073741824));
            }
        }
        zb zbVar = pcVar.f7925r1;
        if (zbVar != null) {
            zbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            pcVar.f7925r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ac acVar = pcVar.f7929s1;
        if (acVar != null) {
            acVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            pcVar.f7929s1.f7651e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
