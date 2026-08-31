package oh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.rc;
public class k8 extends View {
    public boolean B;
    public long C;
    public final Path D;
    public final t3 E;
    public final org.telegram.ui.Components.z5 f17372a;
    public final TL_stories.MediaArea f17373b;
    public final Paint f17374c;
    public final Paint d;
    public LinearGradient f17375e;
    public LinearGradient f17376f;
    public final Matrix h;
    public final org.telegram.ui.Cells.z f17377n;
    public final rc f17378r;
    public final boolean f17379s;
    public final boolean v;
    public final boolean f17380w;
    public final boolean f17381x;
    public final boolean f17382y;

    public k8(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z4;
        boolean z10;
        boolean z11 = true;
        this.f17374c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.k6.f0(1174405119, 2, -1);
        this.f17377n = f02;
        this.f17378r = new rc(this);
        this.f17379s = false;
        this.v = false;
        this.B = false;
        this.D = new Path();
        this.E = new t3(this, 13);
        this.f17373b = mediaArea;
        boolean z12 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && !(mediaArea instanceof TL_stories.TL_mediaAreaUrl)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f17379s = z4;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.v = z10;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z11 = false;
        }
        this.f17380w = z11;
        this.f17382y = z11;
        this.f17381x = z11;
        this.f17372a = new org.telegram.ui.Components.z5(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        f02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (!this.f17382y) {
            return;
        }
        float innerRadius = getInnerRadius();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.D;
        path.rewind();
        path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f17377n;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f17377n;
        rc rcVar = this.f17378r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                rcVar.f30677f = new ju(1, view);
            }
            rcVar.c(true);
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{16842919, 16842910});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            rcVar.c(false);
            zVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        if ((getParent() instanceof View) && (mediaArea = this.f17373b) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
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
        if (this.v && this.B && this.f17375e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.C)) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.B = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.f17375e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.f17375e;
            Paint paint = this.f17374c;
            paint.setShader(linearGradient);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f17376f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f17376f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float dpf2 = AndroidUtilities.dpf2(1.5f);
            paint2.setStrokeWidth(dpf2);
            float f10 = dpf2 / 2.0f;
            rectF.inset(f10, f10);
            float f11 = innerRadius - f10;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f17377n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void a(Canvas canvas) {
    }
}
