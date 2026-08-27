package jh;

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
import hh.y9;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.xt;

public class k8 extends View {
    public boolean A;
    public long B;
    public final Path C;
    public final y9 D;

    public final org.telegram.ui.Components.y5 f13592a;

    public final TL_stories.MediaArea f13593b;

    public final Paint f13594c;
    public final Paint d;

    public LinearGradient f13595e;

    public LinearGradient f13596f;
    public final Matrix h;

    public final org.telegram.ui.Cells.z f13597n;

    public final nc f13598r;

    public final boolean f13599s;
    public final boolean v;

    public final boolean f13600w;

    public final boolean f13601x;

    public final boolean f13602y;

    public k8(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z10 = true;
        this.f13594c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.z zVarF0 = org.telegram.ui.ActionBar.g6.f0(1174405119, 2, -1);
        this.f13597n = zVarF0;
        this.f13598r = new nc(this);
        this.f13599s = false;
        this.v = false;
        this.A = false;
        this.C = new Path();
        this.D = new y9(this, 26);
        this.f13593b = mediaArea;
        boolean z11 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        this.f13599s = z11 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue) || (mediaArea instanceof TL_stories.TL_mediaAreaUrl);
        this.v = z11 || (mediaArea instanceof TL_stories.TL_mediaAreaVenue);
        if (!z11 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z10 = false;
        }
        this.f13600w = z10;
        this.f13602y = z10;
        this.f13601x = z10;
        this.f13592a = new org.telegram.ui.Components.y5(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        zVarF0.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (this.f13602y) {
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
            org.telegram.ui.Cells.z zVar = this.f13597n;
            zVar.setBounds(0, 0, width, height);
            zVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f13597n;
        nc ncVar = this.f13598r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                ncVar.f30948f = new xt(1, view);
            }
            ncVar.c(true);
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{16842919, 16842910});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ncVar.c(false);
            zVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        if (!(getParent() instanceof View) || (mediaArea = this.f13593b) == null || (mediaAreaCoordinates = mediaArea.coordinates) == null) {
            return getMeasuredHeight() * 0.2f;
        }
        return (mediaAreaCoordinates.flags & 1) != 0 ? (float) (((mediaAreaCoordinates.radius / 100.0d) * ((double) getWidth())) / ((double) getScaleX())) : getMeasuredHeight() * 0.2f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float innerRadius = getInnerRadius();
        b(canvas);
        if (this.v && this.A && this.f13595e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.B) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * fCurrentTimeMillis) - measuredWidth;
            if (fCurrentTimeMillis >= 1.0f) {
                this.A = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.f13595e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.f13595e;
            Paint paint = this.f13594c;
            paint.setShader(linearGradient);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f13596f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f13596f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float fDpf2 = AndroidUtilities.dpf2(1.5f);
            paint2.setStrokeWidth(fDpf2);
            float f10 = fDpf2 / 2.0f;
            rectF.inset(f10, f10);
            float f11 = innerRadius - f10;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f13597n || super.verifyDrawable(drawable);
    }

    public void a(Canvas canvas) {
    }
}
