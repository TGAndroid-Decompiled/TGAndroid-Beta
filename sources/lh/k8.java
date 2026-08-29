package lh;

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
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.uc;
public class k8 extends View {
    public boolean A;
    public long B;
    public final Path C;
    public final m5 D;
    public final org.telegram.ui.Components.d6 f15856a;
    public final TL_stories.MediaArea f15857b;
    public final Paint f15858c;
    public final Paint d;
    public LinearGradient f15859e;
    public LinearGradient f15860f;
    public final Matrix h;
    public final org.telegram.ui.Cells.z f15861n;
    public final uc f15862r;
    public final boolean f15863s;
    public final boolean v;
    public final boolean f15864w;
    public final boolean f15865x;
    public final boolean f15866y;

    public k8(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z10;
        boolean z11;
        boolean z12 = true;
        this.f15858c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.g6.f0(1174405119, 2, -1);
        this.f15861n = f02;
        this.f15862r = new uc(this);
        this.f15863s = false;
        this.v = false;
        this.A = false;
        this.C = new Path();
        this.D = new m5(this, 10);
        this.f15857b = mediaArea;
        boolean z13 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && !(mediaArea instanceof TL_stories.TL_mediaAreaUrl)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f15863s = z10;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.v = z11;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z12 = false;
        }
        this.f15864w = z12;
        this.f15866y = z12;
        this.f15865x = z12;
        this.f15856a = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        f02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (!this.f15866y) {
            return;
        }
        float innerRadius = getInnerRadius();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.C;
        path.rewind();
        path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f15861n;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f15861n;
        uc ucVar = this.f15862r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                ucVar.f33191f = new eu(1, view);
            }
            ucVar.c(true);
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{16842919, 16842910});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ucVar.c(false);
            zVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        if ((getParent() instanceof View) && (mediaArea = this.f15857b) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
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
        if (this.v && this.A && this.f15859e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.B)) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.A = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.f15859e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.f15859e;
            Paint paint = this.f15858c;
            paint.setShader(linearGradient);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f15860f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f15860f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float dpf2 = AndroidUtilities.dpf2(1.5f);
            paint2.setStrokeWidth(dpf2);
            float f9 = dpf2 / 2.0f;
            rectF.inset(f9, f9);
            float f10 = innerRadius - f9;
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15861n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void a(Canvas canvas) {
    }
}
