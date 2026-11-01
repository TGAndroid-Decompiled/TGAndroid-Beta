package jg;

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
import org.telegram.messenger.a30;
import org.telegram.messenger.m5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.t5;
import w7.b6;
public final class i2 extends j {
    public boolean A0;
    public boolean B0;
    public final t5 C0;
    public final int f10021q0;
    public boolean f10022r0;
    public final t5 f10023s0;
    public final qu0 f10024t0;
    public final TextureView f10025u0;
    public final Bitmap f10026v0;
    public final Rect f10027w0;
    public final Rect f10028x0;
    public float f10029y0;
    public final Path f10030z0;

    public i2(Context context, PointF pointF, qu0 qu0Var, String str) {
        super(context, pointF);
        this.f10021q0 = -1;
        this.f10022r0 = false;
        Rect rect = new Rect();
        this.f10027w0 = rect;
        this.f10028x0 = new Rect();
        this.f10029y0 = 1.0f;
        this.f10030z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        gr grVar = gr.h;
        this.C0 = new t5(this, 0L, 350L, grVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f10024t0 = qu0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f10026v0 = decodeFile;
        if (decodeFile != null) {
            this.f10029y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f10025u0 = textureView;
        addView(textureView, b6.c(-1.0f, -1));
        this.f10023s0 = new t5(this, 0L, 500L, grVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new g2(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.A0) {
            return false;
        }
        if (view == this.f10025u0) {
            canvas.save();
            float d = this.f10023s0.d(this.f10022r0);
            canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, m5.A(1.0f, d, 4.0f * d, 0.25f));
            float d10 = this.C0.d(this.B0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            int i10 = (d10 > 1.0f ? 1 : (d10 == 1.0f ? 0 : -1));
            Rect rect2 = this.f10027w0;
            Rect rect3 = this.f10028x0;
            Bitmap bitmap2 = this.f10026v0;
            Path path2 = this.f10030z0;
            if (i10 < 0) {
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
            path.addCircle(width, height, min * d10, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f9912a) {
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
        return this.f10021q0;
    }

    public qu0 getBaseSize() {
        return this.f10024t0;
    }

    @Override
    public pj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = a30.x(L, 2.0f, getPositionX(), scaleX);
        return new pj0(x10, a30.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public final void k() {
        qu0 qu0Var = this.f10024t0;
        setX(getPositionX() - (qu0Var.f29808a / 2.0f));
        setY(getPositionY() - (qu0Var.f29809b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f10025u0;
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
        qu0 qu0Var = this.f10024t0;
        int i14 = (int) qu0Var.f29808a;
        int i15 = (int) qu0Var.f29809b;
        TextureView textureView = this.f10025u0;
        if (textureView != null) {
            float f7 = this.f10029y0;
            if (f7 >= 1.0f) {
                i12 = (int) (f7 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f10 = this.f10029y0;
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
        if (this.A0 != z10) {
            this.A0 = z10;
            invalidate();
        }
    }
}
