package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z5;
public final class z2 extends j {
    public final int f5586n0;
    public boolean f5587o0;
    public final z5 f5588p0;
    public final jv0 f5589q0;
    public final TextureView f5590r0;
    public final Bitmap f5591s0;
    public final Rect f5592t0;
    public final Rect f5593u0;
    public float f5594v0;
    public final Path f5595w0;
    public boolean f5596x0;
    public boolean f5597y0;
    public final z5 f5598z0;

    public z2(Context context, PointF pointF, jv0 jv0Var, String str) {
        super(context, pointF);
        this.f5586n0 = -1;
        this.f5587o0 = false;
        Rect rect = new Rect();
        this.f5592t0 = rect;
        this.f5593u0 = new Rect();
        this.f5594v0 = 1.0f;
        this.f5595w0 = new Path();
        this.f5596x0 = true;
        this.f5597y0 = true;
        pr prVar = pr.h;
        this.f5598z0 = new z5(this, 0L, 350L, prVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f5589q0 = jv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f5591s0 = decodeFile;
        if (decodeFile != null) {
            this.f5594v0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f5590r0 = textureView;
        addView(textureView, c6.c(-1.0f, -1));
        this.f5588p0 = new z5(this, 0L, 500L, prVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new x2(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.f5596x0) {
            return false;
        }
        if (view == this.f5590r0) {
            canvas.save();
            float e6 = this.f5588p0.e(this.f5587o0);
            canvas.scale(1.0f - (e6 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e6, 4.0f * e6, 0.25f));
            float e10 = this.f5598z0.e(this.f5597y0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            Rect rect2 = this.f5592t0;
            Rect rect3 = this.f5593u0;
            Bitmap bitmap2 = this.f5591s0;
            Path path2 = this.f5595w0;
            if (e10 < 1.0f) {
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
            path.addCircle(width, height, min * e10, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f5143a) {
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
        return this.f5586n0;
    }

    public jv0 getBaseSize() {
        return this.f5589q0;
    }

    @Override
    public sk0 getSelectionBounds() {
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
        return new sk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public final void k() {
        jv0 jv0Var = this.f5589q0;
        setX(getPositionX() - (jv0Var.f28201a / 2.0f));
        setY(getPositionY() - (jv0Var.f28202b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f5590r0;
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
        jv0 jv0Var = this.f5589q0;
        int i14 = (int) jv0Var.f28201a;
        int i15 = (int) jv0Var.f28202b;
        TextureView textureView = this.f5590r0;
        if (textureView != null) {
            float f10 = this.f5594v0;
            if (f10 >= 1.0f) {
                i12 = (int) (f10 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f11 = this.f5594v0;
            if (f11 >= 1.0f) {
                i13 = i15;
            } else {
                i13 = (int) (i14 / f11);
            }
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }
        setMeasuredDimension(i14, i15);
    }

    public void setDraw(boolean z4) {
        if (this.f5596x0 != z4) {
            this.f5596x0 = z4;
            invalidate();
        }
    }
}
