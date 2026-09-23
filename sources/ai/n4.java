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
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Components.rr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b70;
import org.telegram.ui.dd0;
import org.telegram.ui.o50;
import org.telegram.ui.p50;
import org.telegram.ui.q50;
public final class n4 extends View {
    public final int f1292a = 0;
    public final Object f1293b;
    public Object f1294c;
    public Object d;

    public n4(Context context) {
        super(context);
        this.f1293b = new pe.b(true);
        this.f1294c = new tf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f1292a) {
            case 3:
                r21 r21Var = (r21) this.d;
                org.telegram.ui.Components.o6 o6Var = r21Var.e;
                float g10 = o6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), o6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f1293b;
                    i6Var.setColor(i6Var.f24883b.a(org.telegram.ui.ActionBar.h6.v0(r21Var.I, i6Var.f24882a), false));
                    i6Var.setColor(i0.a.d(r21Var.F, i6Var.getColor(), r21.a(r21Var)));
                    i6Var.setAlpha((int) (i6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), i6Var);
                    o6Var.m(rectF);
                    o6Var.f26631w = (int) (g10 * 255.0f);
                    o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W8, (org.telegram.ui.ActionBar.d6) this.f1294c));
                    o6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f1293b;
                p50 p50Var = (p50) this.f1294c;
                o50 o50Var = (o50) this.d;
                if (o50Var.h > 0.0f && o50Var.d != null) {
                    o50Var.f35686f.reset();
                    float width = getWidth() / o50Var.f35685c.getWidth();
                    o50Var.f35686f.postScale(width, width);
                    o50Var.e.setLocalMatrix(o50Var.f35686f);
                    o50Var.d.setAlpha((int) (o50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), o50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (p50Var != null) {
                    if (p50Var.isAttachedToWindow() && p50Var.getAlpha() > 0.5f) {
                        p50Var.getLocationInWindow(iArr);
                    } else {
                        o50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - p50Var.getScaleX()) * p50Var.getMeasuredWidth()), iArr[1] - ((1.0f - p50Var.getScaleY()) * p50Var.getMeasuredHeight()));
                    if (((q50) p50Var.f36026b).a(canvas2, p50Var.getMeasuredWidth(), o50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                b70 b70Var = (b70) this.d;
                int i10 = dp + ((int) b70Var.f31985b.e);
                Paint paint = (Paint) this.f1294c;
                paint.setColor(b70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19065s8));
                RectF rectF2 = (RectF) this.f1293b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), b70.b0(b70Var).getMeasuredHeight() + i10);
                b70.a0(b70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1292a) {
            case 9:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((tf.a) this.f1294c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1292a) {
            case 9:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((tf.a) this.f1294c);
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
        qf0 qf0Var;
        int dp;
        switch (this.f1292a) {
            case 0:
                h90 h90Var = (h90) this.f1293b;
                super.onDraw(canvas);
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f1294c;
                e6Var.f23573a = this;
                ((e6) this.d).getClass();
                e6Var.d(0.0f, false);
                float f7 = e6Var.f23575c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (e6Var.f23575c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    h90Var.d(rectF);
                    h90Var.j(24.0f);
                    h90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    h90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f1294c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f1293b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.h8) this.d).f33758f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                eg0 eg0Var = (eg0) this.d;
                if (!eg0Var.f23678n || ((qf0Var = eg0Var.f23679r) != null && qf0Var.f27337x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (eg0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = eg0Var.f23663a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f1294c);
                    }
                    canvas.drawLine(dp2, height, i11, height, (Paint) this.f1293b);
                    return;
                }
                return;
            case 3:
            case 5:
            case 6:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f1293b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + o6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                ch.d dVar = (ch.d) this.f1294c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((ch.d) this.f1294c).draw(canvas);
                }
                o6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f1293b;
                dd0 dd0Var = (dd0) this.d;
                Drawable drawable2 = dd0Var.f32603s;
                Rect rect = (Rect) this.f1294c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                dd0Var.f32603s.draw(canvas);
                int i13 = dd0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.f19076t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19076t0);
                    return;
                }
                return;
            case 8:
                float dp4 = AndroidUtilities.dp(10.0f);
                float f13 = dp4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f14 = dp4 + measuredWidth2;
                rectF3.set(dp4, dp4, f14, f14);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f15 = measuredWidth2 / 7.0f;
                Path path = (Path) this.f1294c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp5;
                int width3 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f1293b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((pe.b) this.f1293b).iterator();
                    while (it.hasNext()) {
                        ((ki.a) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1292a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((r21) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1292a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.o6) this.f1293b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1292a) {
            case 8:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f30925g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1292a) {
            case 3:
                if (((r21) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.o6) this.f1293b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n4(org.telegram.ui.h8 h8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = h8Var;
        this.f1293b = strArr;
        this.f1294c = drawable;
    }

    public n4(b70 b70Var, Context context) {
        super(context);
        this.d = b70Var;
        this.f1293b = new RectF();
        this.f1294c = new Paint(1);
    }

    public n4(eg0 eg0Var, Context context) {
        super(context);
        this.d = eg0Var;
        Paint paint = new Paint();
        this.f1293b = paint;
        Paint paint2 = new Paint();
        this.f1294c = paint2;
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

    public n4(dd0 dd0Var, Context context, Rect rect) {
        super(context);
        this.d = dd0Var;
        this.f1294c = rect;
        this.f1293b = new RectF();
    }

    public n4(r21 r21Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = r21Var;
        this.f1294c = d6Var;
        this.f1293b = new org.telegram.ui.Components.i6(this, d6Var);
        r21Var.e.setCallback(this);
    }

    public n4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, false, false, false);
        this.f1293b = o6Var;
        o6Var.r(-1);
        o6Var.f26614b = 17;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.setCallback(this);
    }

    public n4(e6 e6Var, Context context) {
        super(context);
        this.d = e6Var;
        this.f1293b = new h90();
        this.f1294c = new org.telegram.ui.Components.e6(250L, rr.f27701f);
    }

    public n4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f1293b = paint;
        this.f1294c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public n4(o50 o50Var, Context context, p50 p50Var) {
        super(context);
        this.d = o50Var;
        this.f1294c = p50Var;
        this.f1293b = new int[2];
    }
}
