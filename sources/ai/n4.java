package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.h31;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.c70;
import org.telegram.ui.fd0;
import org.telegram.ui.p50;
import org.telegram.ui.q50;
import org.telegram.ui.r50;
public final class n4 extends View {
    public final int f1294a = 0;
    public final Object f1295b;
    public Object f1296c;
    public Object d;

    public n4(Context context) {
        super(context);
        this.f1295b = new pe.b();
        this.f1296c = new tf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f1294a) {
            case 2:
                h31 h31Var = (h31) this.d;
                org.telegram.ui.Components.o6 o6Var = h31Var.e;
                float g10 = o6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), o6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f1295b;
                    i6Var.setColor(i6Var.f25027b.a(org.telegram.ui.ActionBar.i6.v0(h31Var.I, i6Var.f25026a), false));
                    i6Var.setColor(i0.a.d(h31Var.F, i6Var.getColor(), h31.a(h31Var)));
                    i6Var.setAlpha((int) (i6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), i6Var);
                    o6Var.m(rectF);
                    o6Var.f27000w = (int) (g10 * 255.0f);
                    o6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W8, (org.telegram.ui.ActionBar.e6) this.f1296c));
                    o6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                int[] iArr = (int[]) this.f1295b;
                q50 q50Var = (q50) this.f1296c;
                p50 p50Var = (p50) this.d;
                if (p50Var.h > 0.0f && p50Var.d != null) {
                    p50Var.f36331f.reset();
                    float width = getWidth() / p50Var.f36330c.getWidth();
                    p50Var.f36331f.postScale(width, width);
                    p50Var.e.setLocalMatrix(p50Var.f36331f);
                    p50Var.d.setAlpha((int) (p50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), p50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (q50Var != null) {
                    if (q50Var.isAttachedToWindow() && q50Var.getAlpha() > 0.5f) {
                        q50Var.getLocationInWindow(iArr);
                    } else {
                        p50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - q50Var.getScaleX()) * q50Var.getMeasuredWidth()), iArr[1] - ((1.0f - q50Var.getScaleY()) * q50Var.getMeasuredHeight()));
                    if (((r50) q50Var.f36618b).a(canvas2, q50Var.getMeasuredWidth(), p50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 5:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                c70 c70Var = (c70) this.d;
                int i10 = dp + ((int) c70Var.f32537b.e);
                Paint paint = (Paint) this.f1296c;
                paint.setColor(c70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19337s8));
                RectF rectF2 = (RectF) this.f1295b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), c70.b0(c70Var).getMeasuredHeight() + i10);
                c70.a0(c70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1294a) {
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((tf.a) this.f1296c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1294a) {
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((tf.a) this.f1296c);
                }
                this.d = null;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        bg0 bg0Var;
        int dp;
        switch (this.f1294a) {
            case 0:
                t90 t90Var = (t90) this.f1295b;
                super.onDraw(canvas);
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f1296c;
                e6Var.f23888a = this;
                ((e6) this.d).getClass();
                e6Var.d(0.0f, false);
                float f7 = e6Var.f23890c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (e6Var.f23890c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    t90Var.d(rectF);
                    t90Var.j(24.0f);
                    t90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    t90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                rg0 rg0Var = (rg0) this.d;
                if (!rg0Var.f27994n || ((bg0Var = rg0Var.f27995r) != null && bg0Var.f23018x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i10 = dp2 + ((int) (rg0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = rg0Var.f27979a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f1296c);
                    }
                    canvas.drawLine(dp2, height, i10, height, (Paint) this.f1295b);
                    return;
                }
                return;
            case 2:
            case 4:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f1295b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + o6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i11 = dpf2 + width2;
                ch.d dVar = (ch.d) this.f1296c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i11, getHeight());
                    ((ch.d) this.f1296c).draw(canvas);
                }
                o6Var.draw(canvas);
                return;
            case 6:
                RectF rectF2 = (RectF) this.f1295b;
                fd0 fd0Var = (fd0) this.d;
                Drawable drawable = fd0Var.f33509s;
                Rect rect = (Rect) this.f1296c;
                drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                fd0Var.f33509s.draw(canvas);
                int i12 = fd0Var.G0;
                if (i12 == 0 || i12 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.i6.f19348t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f19348t0);
                    return;
                }
                return;
            case 7:
                float dp4 = AndroidUtilities.dp(10.0f);
                float f13 = dp4 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f14 = dp4 + measuredWidth;
                rectF3.set(dp4, dp4, f14, f14);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f15 = measuredWidth / 7.0f;
                Path path = (Path) this.f1296c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp5;
                int width3 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i13 = 0; i13 < height2; i13++) {
                    canvas.save();
                    for (int i14 = 0; i14 < width3; i14++) {
                        int i15 = i14 % 2;
                        if ((i15 == 0 && i13 % 2 == 0) || (i15 != 0 && i13 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f1295b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((pe.b) this.f1295b).iterator();
                    while (it.hasNext()) {
                        ((li.e) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1294a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((h31) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1294a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.o6) this.f1295b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1294a) {
            case 7:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f31242g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1294a) {
            case 2:
                if (((h31) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 3:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.o6) this.f1295b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n4(c70 c70Var, Context context) {
        super(context);
        this.d = c70Var;
        this.f1295b = new RectF();
        this.f1296c = new Paint(1);
    }

    public n4(rg0 rg0Var, Context context) {
        super(context);
        this.d = rg0Var;
        Paint paint = new Paint();
        this.f1295b = paint;
        Paint paint2 = new Paint();
        this.f1296c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public n4(fd0 fd0Var, Context context, Rect rect) {
        super(context);
        this.d = fd0Var;
        this.f1296c = rect;
        this.f1295b = new RectF();
    }

    public n4(h31 h31Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = h31Var;
        this.f1296c = e6Var;
        this.f1295b = new org.telegram.ui.Components.i6(this, e6Var);
        h31Var.e.setCallback(this);
    }

    public n4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, false, false, false);
        this.f1295b = o6Var;
        o6Var.r(-1);
        o6Var.f26983b = 17;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.setCallback(this);
    }

    public n4(e6 e6Var, Context context) {
        super(context);
        this.d = e6Var;
        this.f1295b = new t90();
        this.f1296c = new org.telegram.ui.Components.e6(250L, sr.f28359f);
    }

    public n4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f1295b = paint;
        this.f1296c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public n4(p50 p50Var, Context context, q50 q50Var) {
        super(context);
        this.d = p50Var;
        this.f1296c = q50Var;
        this.f1295b = new int[2];
    }
}
