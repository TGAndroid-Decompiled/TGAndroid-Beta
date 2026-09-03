package dg;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.z5;
public final class b3 extends j {
    public final int f4399n0;
    public boolean f4400o0;
    public final z5 f4401p0;
    public final jv0 f4402q0;
    public final TextureView f4403r0;
    public final Bitmap f4404s0;
    public final Rect f4405t0;
    public final Rect f4406u0;
    public float f4407v0;
    public final Path f4408w0;
    public boolean f4409x0;
    public boolean f4410y0;
    public final z5 f4411z0;

    public b3(Context context, PointF pointF, jv0 jv0Var, String str) {
        super(context, pointF);
        this.f4399n0 = -1;
        this.f4400o0 = false;
        Rect rect = new Rect();
        this.f4405t0 = rect;
        this.f4406u0 = new Rect();
        this.f4407v0 = 1.0f;
        this.f4408w0 = new Path();
        this.f4409x0 = true;
        this.f4410y0 = true;
        mr mrVar = mr.h;
        this.f4411z0 = new z5(this, 0L, 350L, mrVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f4402q0 = jv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f4404s0 = decodeFile;
        if (decodeFile != null) {
            this.f4407v0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f4403r0 = textureView;
        addView(textureView, b6.c(-1.0f, -1));
        this.f4401p0 = new z5(this, 0L, 500L, mrVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new z2(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.f4409x0) {
            return false;
        }
        if (view == this.f4403r0) {
            canvas.save();
            float e = this.f4401p0.e(this.f4400o0);
            canvas.scale(1.0f - (e * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e, 4.0f * e, 0.25f));
            float e6 = this.f4411z0.e(this.f4410y0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            Rect rect2 = this.f4405t0;
            Rect rect3 = this.f4406u0;
            Bitmap bitmap2 = this.f4404s0;
            Path path2 = this.f4408w0;
            if (e6 < 1.0f) {
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
            path.addCircle(width, height, min * e6, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f4445a) {
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
        return this.f4399n0;
    }

    public jv0 getBaseSize() {
        return this.f4402q0;
    }

    @Override
    public rk0 getSelectionBounds() {
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
        return new rk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public final void k() {
        jv0 jv0Var = this.f4402q0;
        setX(getPositionX() - (jv0Var.f26062a / 2.0f));
        setY(getPositionY() - (jv0Var.f26063b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f4403r0;
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
        jv0 jv0Var = this.f4402q0;
        int i14 = (int) jv0Var.f26062a;
        int i15 = (int) jv0Var.f26063b;
        TextureView textureView = this.f4403r0;
        if (textureView != null) {
            float f10 = this.f4407v0;
            if (f10 >= 1.0f) {
                i12 = (int) (f10 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f11 = this.f4407v0;
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
        if (this.f4409x0 != z4) {
            this.f4409x0 = z4;
            invalidate();
        }
    }
}
