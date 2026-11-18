package fi;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.zt;
public class h8 extends View {
    public final boolean E;
    public boolean F;
    public long G;
    public final Path H;
    public final f2.a I;
    public final org.telegram.ui.Components.c6 f12067a;
    public final TL_stories.MediaArea f12068b;
    public final Paint f12069c;
    public final Paint d;
    public LinearGradient f12070e;
    public LinearGradient f12071f;
    public final Matrix h;
    public final org.telegram.ui.Cells.y f12072n;
    public final mc f12073r;
    public final boolean f12074s;
    public final boolean f12075w;
    public final boolean f12076x;
    public final boolean f12077y;

    public h8(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z10;
        boolean z11;
        boolean z12 = true;
        this.f12069c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(1174405119, 2, -1);
        this.f12072n = h02;
        this.f12073r = new mc(this);
        this.f12074s = false;
        this.f12075w = false;
        this.F = false;
        this.H = new Path();
        this.I = new f2.a(this, 21);
        this.f12068b = mediaArea;
        boolean z13 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && !(mediaArea instanceof TL_stories.TL_mediaAreaUrl)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12074s = z10;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f12075w = z11;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z12 = false;
        }
        this.f12076x = z12;
        this.E = z12;
        this.f12077y = z12;
        this.f12067a = new org.telegram.ui.Components.c6(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        h02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (!this.E) {
            return;
        }
        float innerRadius = getInnerRadius();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.H;
        path.rewind();
        path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f12072n;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.f12072n;
        mc mcVar = this.f12073r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                mcVar.f37432f = new zt(1, view);
            }
            mcVar.c(true);
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{16842919, 16842910});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            mcVar.c(false);
            yVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        if ((getParent() instanceof View) && (mediaArea = this.f12068b) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
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
        if (this.f12075w && this.F && this.f12070e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.G)) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.F = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.f12070e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.f12070e;
            Paint paint = this.f12069c;
            paint.setShader(linearGradient);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f12071f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f12071f;
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
        if (drawable != this.f12072n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void a(Canvas canvas) {
    }
}
