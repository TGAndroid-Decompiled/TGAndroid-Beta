package nh;

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
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.rc;
public class k8 extends View {
    public boolean B;
    public long C;
    public final Path D;
    public final n5 E;
    public final org.telegram.ui.Components.z5 f15548a;
    public final TL_stories.MediaArea f15549b;
    public final Paint f15550c;
    public final Paint d;
    public LinearGradient e;
    public LinearGradient f15551f;
    public final Matrix h;
    public final org.telegram.ui.Cells.z f15552n;
    public final rc f15553r;
    public final boolean f15554s;
    public final boolean v;
    public final boolean f15555w;
    public final boolean f15556x;
    public final boolean f15557y;

    public k8(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z4;
        boolean z10;
        boolean z11 = true;
        this.f15550c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(1174405119, 2, -1);
        this.f15552n = f02;
        this.f15553r = new rc(this);
        this.f15554s = false;
        this.v = false;
        this.B = false;
        this.D = new Path();
        this.E = new n5(this, 10);
        this.f15549b = mediaArea;
        boolean z12 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && !(mediaArea instanceof TL_stories.TL_mediaAreaUrl)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f15554s = z4;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.v = z10;
        if (!z12 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z11 = false;
        }
        this.f15555w = z11;
        this.f15557y = z11;
        this.f15556x = z11;
        this.f15548a = new org.telegram.ui.Components.z5(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        f02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (!this.f15557y) {
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
        org.telegram.ui.Cells.z zVar = this.f15552n;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f15552n;
        rc rcVar = this.f15553r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                rcVar.f28443f = new hu(1, view);
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
        if ((getParent() instanceof View) && (mediaArea = this.f15549b) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
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
        if (this.v && this.B && this.e != null) {
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
            this.e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.e;
            Paint paint = this.f15550c;
            paint.setShader(linearGradient);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f15551f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f15551f;
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
        if (drawable != this.f15552n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void a(Canvas canvas) {
    }
}
