package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
public final class f3 extends k {
    public final int m0;
    public boolean f2198n0;
    public final d6 f2199o0;
    public final bv0 f2200p0;
    public final TextureView f2201q0;
    public final Bitmap f2202r0;
    public final Rect f2203s0;
    public final Rect f2204t0;
    public float f2205u0;
    public final Path f2206v0;
    public boolean f2207w0;
    public boolean f2208x0;
    public final d6 f2209y0;

    public f3(Context context, PointF pointF, bv0 bv0Var, String str) {
        super(context, pointF);
        this.m0 = -1;
        this.f2198n0 = false;
        Rect rect = new Rect();
        this.f2203s0 = rect;
        this.f2204t0 = new Rect();
        this.f2205u0 = 1.0f;
        this.f2206v0 = new Path();
        this.f2207w0 = true;
        this.f2208x0 = true;
        jr jrVar = jr.h;
        this.f2209y0 = new d6(this, 0L, 350L, jrVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f2200p0 = bv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f2202r0 = decodeFile;
        if (decodeFile != null) {
            this.f2205u0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f2201q0 = textureView;
        addView(textureView, f6.c(-1.0f, -1));
        this.f2199o0 = new d6(this, 0L, 500L, jrVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final j a() {
        return new d3(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.f2207w0) {
            return false;
        }
        if (view == this.f2201q0) {
            canvas.save();
            float e10 = this.f2199o0.e(this.f2198n0);
            canvas.scale(1.0f - (e10 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.x3.y(1.0f, e10, 4.0f * e10, 0.25f));
            float e11 = this.f2209y0.e(this.f2208x0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            Rect rect2 = this.f2203s0;
            Rect rect3 = this.f2204t0;
            Bitmap bitmap2 = this.f2202r0;
            Path path2 = this.f2206v0;
            if (e11 < 1.0f) {
                rect = rect3;
                bitmap = bitmap2;
                canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), 128, 31);
                path2.rewind();
                path = path2;
                path.addCircle(width, height, min, Path.Direction.CW);
                canvas.clipPath(path);
                if (bitmap != null) {
                    rect.set(0, 0, view.getWidth(), view.getHeight());
                    canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
                }
                super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                rect = rect3;
                bitmap = bitmap2;
                path = path2;
            }
            canvas.save();
            path.rewind();
            path.addCircle(width, height, min * e11, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f2137a) {
                drawChild = true;
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getAnchor() {
        return this.m0;
    }

    public bv0 getBaseSize() {
        return this.f2200p0;
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public final void k() {
        bv0 bv0Var = this.f2200p0;
        setX(getPositionX() - (bv0Var.f27238a / 2.0f));
        setY(getPositionY() - (bv0Var.f27239b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f2201q0;
        if (textureView != null) {
            int measuredHeight = ((i13 - i11) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i12 - i10) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        bv0 bv0Var = this.f2200p0;
        int i14 = (int) bv0Var.f27238a;
        int i15 = (int) bv0Var.f27239b;
        TextureView textureView = this.f2201q0;
        if (textureView != null) {
            float f9 = this.f2205u0;
            if (f9 >= 1.0f) {
                i12 = (int) (f9 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f10 = this.f2205u0;
            if (f10 >= 1.0f) {
                i13 = i15;
            } else {
                i13 = (int) (i14 / f10);
            }
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }
        setMeasuredDimension(i14, i15);
    }

    public void setDraw(boolean z10) {
        if (this.f2207w0 != z10) {
            this.f2207w0 = z10;
            invalidate();
        }
    }
}
