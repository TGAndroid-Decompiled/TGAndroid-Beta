package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;

public final class i0 extends View {

    public final Paint f16087a;

    public final Path f16088b;

    public final RectF f16089c;
    public final Matrix d;

    public final Matrix f16090e;

    public final Matrix f16091f;
    public final Matrix h;

    public final Matrix f16092n;

    public final Matrix f16093r;

    public final j0 f16094s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f16094s = j0Var;
        this.f16087a = new Paint(1);
        this.f16088b = new Path();
        this.f16089c = new RectF();
        this.d = new Matrix();
        this.f16090e = new Matrix();
        this.f16091f = new Matrix();
        this.h = new Matrix();
        this.f16092n = new Matrix();
        this.f16093r = new Matrix();
    }

    private float getContainerHeight() {
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f)) - this.f16094s.f16153f.f48636y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(Matrix matrix, boolean z10) {
        float f10;
        float f11;
        MediaController.CropState cropState;
        j0 j0Var = this.f16094s;
        int currentWidth = j0Var.getCurrentWidth();
        int currentHeight = j0Var.getCurrentHeight();
        uf.f fVar = j0Var.f16157w;
        int i10 = fVar.f48590i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f12 = 1.0f;
        float f13 = 0.0f;
        float f14 = ((fVar.f48593l - 1.0f) * (z10 ? 1.0f : 0.0f)) + 1.0f;
        float f15 = currentWidth;
        float containerWidth = getContainerWidth() / f15;
        float f16 = currentHeight;
        if (containerWidth * f16 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f16;
        }
        boolean z11 = (j0Var.f16158x.Q / 90) % 2 == 1;
        matrix.preTranslate(fVar.d, fVar.f48587e);
        float f17 = (fVar.f48588f / f14) * containerWidth;
        z7 z7Var = j0Var.f16158x;
        if (z7Var == null || (cropState = z7Var.m0) == null) {
            if (!z10) {
                f12 = f17;
            }
        } else if (z10) {
            f12 = cropState.cropScale;
        } else {
            f12 = f17;
        }
        matrix.preScale(f12, f12);
        float f18 = fVar.f48585b;
        float f19 = fVar.f48586c;
        if (j0Var.f16159y && z10) {
            MediaController.CropState cropState2 = j0Var.f16158x.m0;
            if (cropState2 == null) {
                f10 = 0.0f;
            } else {
                f10 = !z11 ? cropState2.cropPx : cropState2.cropPy;
            }
            if (cropState2 == null) {
                f11 = 0.0f;
            } else {
                f11 = !z11 ? cropState2.cropPy : cropState2.cropPx;
            }
            f18 = f10;
            f19 = f11;
        }
        matrix.preTranslate(f18 * f15, f19 * f16);
        z7 z7Var2 = j0Var.f16158x;
        float f20 = z7Var2.Q + fVar.f48589g + i10;
        MediaController.CropState cropState3 = z7Var2.m0;
        if (cropState3 == null) {
            if (!z10) {
                f13 = f20;
            }
        } else if (z10) {
            f13 = cropState3.cropRotate + cropState3.transformRotation;
        } else {
            f13 = f20;
        }
        matrix.preRotate(f13);
    }

    public final void b(Canvas canvas, boolean z10) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        boolean z11;
        j0 j0Var = this.f16094s;
        int[] iArr = j0Var.f16156s;
        int[] iArr2 = j0Var.v;
        q6 q6Var = j0Var.f16149a;
        if (!z10) {
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
        } else {
            if (j0Var.f16155r >= 1.0f) {
                return;
            }
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, q6Var.getWidth(), q6Var.getHeight(), (int) (Math.min(1.0f, (1.0f - j0Var.f16155r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.f16087a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (j0Var.f16155r * f11));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (j0Var.f16155r < 1.0f && !z10) {
            Path path = this.f16088b;
            path.rewind();
            float width = q6Var.getWidth();
            float height = q6Var.getHeight();
            RectF rectF = this.f16089c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, j0Var.f16155r, rectF);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, j0Var.f16155r);
            path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f13 = j0Var.f16155r;
        Matrix matrix = this.f16091f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(q6Var.getWidth() / j0Var.f16158x.f17213i0, q6Var.getHeight() / j0Var.f16158x.f17215j0);
        matrix.preConcat(j0Var.f16158x.f17222n0);
        matrix.preTranslate(q6Var.getContentWidth() / f10, q6Var.getContentHeight() / f10);
        matrix2.preTranslate((getContainerWidth() / f10) + AndroidUtilities.dp(16.0f), i0.a.c(getContainerHeight(), AndroidUtilities.dp(32.0f), f10, !(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f));
        if (z10) {
            Matrix matrix3 = this.d;
            float f14 = j0Var.f16155r;
            Matrix matrix4 = this.f16092n;
            AndroidUtilities.lerp(matrix, matrix3, f14, matrix4);
            matrix4.preRotate(-j0Var.f16158x.Q);
            Matrix matrix5 = this.f16093r;
            if (matrix4.invert(matrix5)) {
                z7 z7Var = j0Var.f16158x;
                f12 = 2.0f;
                int i10 = z7Var.Q;
                MediaController.CropState cropState = z7Var.m0;
                boolean z12 = ((i10 + (cropState != null ? cropState.transformRotation : 0)) / 90) % 2 == 1;
                float contentWidth = q6Var.getContentWidth();
                float contentHeight = q6Var.getContentHeight();
                MediaController.CropState cropState2 = j0Var.f16158x.m0;
                float f15 = cropState2 != null ? cropState2.cropPw : 1.0f;
                float f16 = cropState2 != null ? cropState2.cropPh : 1.0f;
                float f17 = ((z12 ? contentHeight : contentWidth) * f15) / 2.0f;
                if (!z12) {
                    contentWidth = contentHeight;
                }
                float f18 = (contentWidth * f16) / 2.0f;
                float fLerp2 = AndroidUtilities.lerp(1.0f, 4.0f, f13);
                canvas2.concat(matrix4);
                canvas2.clipRect((-f17) * fLerp2, (-f18) * fLerp2, f17 * fLerp2, f18 * fLerp2);
                canvas2.concat(matrix5);
            } else {
                f12 = 2.0f;
            }
        } else {
            f12 = 2.0f;
        }
        a(matrix, true);
        a(matrix2, false);
        org.telegram.ui.Components.y5 y5Var = j0Var.f16150b;
        if (j0Var.f16159y) {
            MediaController.CropState cropState3 = j0Var.f16158x.m0;
            if (cropState3 == null || !cropState3.mirrored) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            uf.l lVar = j0Var.f16153f.H;
            if (lVar == null) {
                z11 = false;
            } else {
                z11 = lVar.f48623j;
            }
        }
        float fE = y5Var.e(z11);
        float f19 = 1.0f - (fE * f12);
        matrix2.preScale(f19, 1.0f);
        matrix.preScale(f19, 1.0f);
        float fZ = org.telegram.messenger.y1.z(1.0f, fE, 4.0f * fE, 0.25f);
        matrix2.preSkew(0.0f, fZ);
        matrix.preSkew(0.0f, fZ);
        matrix2.preTranslate((-q6Var.getContentWidth()) / f12, (-q6Var.getContentHeight()) / f12);
        matrix.preTranslate((-q6Var.getContentWidth()) / f12, (-q6Var.getContentHeight()) / f12);
        float f20 = j0Var.f16155r;
        Matrix matrix6 = this.f16090e;
        AndroidUtilities.lerp(matrix, matrix2, f20, matrix6);
        canvas2.concat(matrix6);
        Paint paint2 = q6Var.M;
        Matrix matrix7 = q6Var.S;
        if (q6Var.f16575n != null) {
            canvas2.save();
            canvas2.scale(q6Var.getContentWidth() / q6Var.getWidth(), q6Var.getContentHeight() / q6Var.getHeight());
            canvas2.concat(q6Var.f16568f0);
            q6Var.f16575n.draw(canvas2);
            canvas2.restore();
        } else if (q6Var.f16558a != null && q6Var.d != null) {
            matrix7.reset();
            matrix7.preScale(q6Var.d.f17217k0 / q6Var.f16558a.getWidth(), q6Var.d.f17219l0 / q6Var.f16558a.getHeight());
            paint2.setAlpha(255);
            canvas2.drawBitmap(q6Var.f16558a, matrix7, paint2);
        }
        canvas2.restore();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f16094s.f16158x == null) {
            return;
        }
        b(canvas, false);
    }
}
