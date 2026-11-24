package defpackage;

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
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stories;
public class v6b extends View {
    public final boolean E;
    public boolean F;
    public long G;
    public final Path H;
    public final nsa I;
    public final ln a;
    public final TL_stories.MediaArea b;
    public final Paint c;
    public final Paint d;
    public LinearGradient e;
    public LinearGradient f;
    public final Matrix h;
    public final fg0 n;
    public final u51 r;
    public final boolean s;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public v6b(Context context, FrameLayout frameLayout, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z;
        boolean z2;
        boolean z3 = true;
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        fg0 f0 = cmb.f0(1174405119, 2, -1);
        this.n = f0;
        this.r = new u51(this);
        this.s = false;
        this.w = false;
        this.F = false;
        this.H = new Path();
        this.I = new nsa(this, (byte) 21);
        this.b = mediaArea;
        boolean z4 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        if (!z4 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && !(mediaArea instanceof TL_stories.TL_mediaAreaUrl)) {
            z = false;
        } else {
            z = true;
        }
        this.s = z;
        if (!z4 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.w = z2;
        if (!z4 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z3 = false;
        }
        this.x = z3;
        this.E = z3;
        this.y = z3;
        this.a = new ln(frameLayout, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        f0.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (!this.E) {
            return;
        }
        float innerRadius = getInnerRadius();
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.H;
        path.rewind();
        path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        int width = getWidth();
        int height = getHeight();
        fg0 fg0Var = this.n;
        fg0Var.setBounds(0, 0, width, height);
        fg0Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        fg0 fg0Var = this.n;
        u51 u51Var = this.r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                u51Var.f = new ud(view, (byte) 5);
            }
            u51Var.c(true);
            fg0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            fg0Var.setState(new int[]{16842919, 16842910});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            u51Var.c(false);
            fg0Var.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        if ((getParent() instanceof View) && (mediaArea = this.b) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
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
        if (this.w && this.F && this.e != null) {
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
            this.e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.e;
            Paint paint = this.c;
            paint.setShader(linearGradient);
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float N = gm.N(1.5f);
            paint2.setStrokeWidth(N);
            float f = N / 2.0f;
            rectF.inset(f, f);
            float f2 = innerRadius - f;
            canvas.drawRoundRect(rectF, f2, f2, paint2);
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void a(Canvas canvas) {
    }
}
