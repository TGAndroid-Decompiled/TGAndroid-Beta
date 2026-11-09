package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ot;
public class s8 extends View {
    public final boolean D;
    public boolean E;
    public long F;
    public final Path G;
    public final f8 H;
    public final org.telegram.ui.Components.w5 f9753a;
    public final TL_stories.MediaArea f9754b;
    public final Paint f9755c;
    public final Paint d;
    public LinearGradient f9756e;
    public LinearGradient f9757f;
    public final Matrix h;
    public final org.telegram.ui.Cells.y f9758n;
    public final ic f9759r;
    public final boolean f9760s;
    public final boolean f9761w;
    public final boolean f9762x;
    public final boolean f9763y;

    public s8(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z9;
        boolean z10;
        boolean z11 = true;
        this.f9755c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(1174405119, 2, -1);
        this.f9758n = h02;
        this.f9759r = new ic(this);
        this.f9760s = false;
        this.f9761w = false;
        this.E = false;
        this.G = new Path();
        this.H = new f8(this, 3);
        this.f9754b = mediaArea;
        boolean z12 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && !(mediaArea instanceof TL_stories.TL_mediaAreaUrl)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f9760s = z9;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f9761w = z10;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z11 = false;
        }
        this.f9762x = z11;
        this.D = z11;
        this.f9763y = z11;
        this.f9753a = new org.telegram.ui.Components.w5(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        h02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (!this.D) {
            return;
        }
        float innerRadius = getInnerRadius();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.G;
        path.rewind();
        path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f9758n;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f9758n;
        ic icVar = this.f9759r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                icVar.f34700f = new ot(1, view);
            }
            icVar.c(true);
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{16842919, 16842910});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            icVar.c(false);
            yVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        if ((getParent() instanceof View) && (mediaArea = this.f9754b) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
            if ((mediaAreaCoordinates.flags & 1) != 0) {
                return (float) (((mediaAreaCoordinates.radius / 100.0d) * getWidth()) / getScaleX());
            }
            return getMeasuredHeight() * 0.2f;
        }
        return getMeasuredHeight() * 0.2f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float innerRadius = getInnerRadius();
        b(canvas);
        if (this.f9761w && this.E && this.f9756e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.F)) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.E = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.f9756e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.f9756e;
            Paint paint = this.f9755c;
            paint.setShader(linearGradient);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f9757f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f9757f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float N = org.telegram.messenger.g0.N(1.5f);
            paint2.setStrokeWidth(N);
            float f10 = N / 2.0f;
            rectF.inset(f10, f10);
            float f11 = innerRadius - f10;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f9758n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void a(Canvas canvas) {
    }
}
