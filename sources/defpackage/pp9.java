package defpackage;

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
public final class pp9 extends h44 {
    public float A0;
    public final Path B0;
    public boolean C0;
    public boolean D0;
    public final mm E0;
    public final int s0;
    public boolean t0;
    public final mm u0;
    public final qma v0;
    public final TextureView w0;
    public final Bitmap x0;
    public final Rect y0;
    public final Rect z0;

    public pp9(Context context, PointF pointF, qma qmaVar, String str) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        Rect rect = new Rect();
        this.y0 = rect;
        this.z0 = new Rect();
        this.A0 = 1.0f;
        this.B0 = new Path();
        this.C0 = true;
        this.D0 = true;
        k43 k43Var = k43.h;
        this.E0 = new mm(this, 0L, 350L, k43Var);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.v0 = qmaVar;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.x0 = decodeFile;
        if (decodeFile != null) {
            this.A0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.w0 = textureView;
        addView(textureView, tre.c(-1.0f, -1));
        this.u0 = new mm(this, 0L, 500L, k43Var);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final g44 a() {
        return new r39(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.C0) {
            return false;
        }
        if (view == this.w0) {
            canvas.save();
            float d = this.u0.d(this.t0);
            canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, qd4.z(1.0f, d, 4.0f * d, 0.25f));
            float d2 = this.E0.d(this.D0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            int i = (d2 > 1.0f ? 1 : (d2 == 1.0f ? 0 : -1));
            Rect rect2 = this.y0;
            Rect rect3 = this.z0;
            Bitmap bitmap2 = this.x0;
            Path path2 = this.B0;
            if (i < 0) {
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
                super.drawChild(canvas, view, j);
                canvas.restore();
            } else {
                rect = rect3;
                bitmap = bitmap2;
                path = path2;
            }
            canvas.save();
            path.rewind();
            path.addCircle(width, height, min * d2, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof a44) && ((a44) getParent()).a) {
                drawChild = true;
            } else {
                drawChild = super.drawChild(canvas, view, j);
            }
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public int getAnchor() {
        return this.s0;
    }

    public qma getBaseSize() {
        return this.v0;
    }

    @Override
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (hl.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (hl.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float e = uh9.e(L, 2.0f, getPositionX(), scaleX);
        return new a69(e, uh9.e(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + e) - e, L2 * scaleX);
    }

    @Override
    public final void k() {
        qma qmaVar = this.v0;
        setX(getPositionX() - (qmaVar.a / 2.0f));
        setY(getPositionY() - (qmaVar.b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextureView textureView = this.w0;
        if (textureView != null) {
            int measuredHeight = ((i4 - i2) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i3 - i) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        qma qmaVar = this.v0;
        int i5 = (int) qmaVar.a;
        int i6 = (int) qmaVar.b;
        TextureView textureView = this.w0;
        if (textureView != null) {
            float f = this.A0;
            if (f >= 1.0f) {
                i3 = (int) (f * i6);
            } else {
                i3 = i5;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            float f2 = this.A0;
            if (f2 >= 1.0f) {
                i4 = i6;
            } else {
                i4 = (int) (i5 / f2);
            }
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        setMeasuredDimension(i5, i6);
    }

    public void setDraw(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            invalidate();
        }
    }
}
