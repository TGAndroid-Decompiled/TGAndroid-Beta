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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s21;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.e70;
import org.telegram.ui.id0;
import org.telegram.ui.r50;
import org.telegram.ui.s50;
import org.telegram.ui.t50;
public final class n4 extends View {
    public final int f1280a = 0;
    public final Object f1281b;
    public Object f1282c;
    public Object d;

    public n4(Context context) {
        super(context);
        this.f1281b = new pe.b(true);
        this.f1282c = new tf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f1280a) {
            case 3:
                s21 s21Var = (s21) this.d;
                org.telegram.ui.Components.m6 m6Var = s21Var.e;
                float g10 = m6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), m6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f1281b;
                    g6Var.setColor(g6Var.f24205b.a(org.telegram.ui.ActionBar.i6.v0(s21Var.I, g6Var.f24204a), false));
                    g6Var.setColor(i0.a.d(s21Var.F, g6Var.getColor(), s21.a(s21Var)));
                    g6Var.setAlpha((int) (g6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), g6Var);
                    m6Var.m(rectF);
                    m6Var.f26103w = (int) (g10 * 255.0f);
                    m6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W8, (org.telegram.ui.ActionBar.e6) this.f1282c));
                    m6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f1281b;
                s50 s50Var = (s50) this.f1282c;
                r50 r50Var = (r50) this.d;
                if (r50Var.h > 0.0f && r50Var.d != null) {
                    r50Var.f37026f.reset();
                    float width = getWidth() / r50Var.f37025c.getWidth();
                    r50Var.f37026f.postScale(width, width);
                    r50Var.e.setLocalMatrix(r50Var.f37026f);
                    r50Var.d.setAlpha((int) (r50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), r50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (s50Var != null) {
                    if (s50Var.isAttachedToWindow() && s50Var.getAlpha() > 0.5f) {
                        s50Var.getLocationInWindow(iArr);
                    } else {
                        r50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - s50Var.getScaleX()) * s50Var.getMeasuredWidth()), iArr[1] - ((1.0f - s50Var.getScaleY()) * s50Var.getMeasuredHeight()));
                    if (((t50) s50Var.f37255b).a(canvas2, s50Var.getMeasuredWidth(), r50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                e70 e70Var = (e70) this.d;
                int i10 = dp + ((int) e70Var.f33233b.e);
                Paint paint = (Paint) this.f1282c;
                paint.setColor(e70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19113s8));
                RectF rectF2 = (RectF) this.f1281b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), e70.b0(e70Var).getMeasuredHeight() + i10);
                e70.a0(e70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1280a) {
            case 9:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((tf.a) this.f1282c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1280a) {
            case 9:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((tf.a) this.f1282c);
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
        switch (this.f1280a) {
            case 0:
                g90 g90Var = (g90) this.f1281b;
                super.onDraw(canvas);
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f1282c;
                c6Var.f22951a = this;
                ((f6) this.d).getClass();
                c6Var.d(0.0f, false);
                float f7 = c6Var.f22953c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (c6Var.f22953c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    g90Var.d(rectF);
                    g90Var.j(24.0f);
                    g90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    g90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f1282c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f1281b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.h8) this.d).f34195f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                eg0 eg0Var = (eg0) this.d;
                if (!eg0Var.f23655n || ((qf0Var = eg0Var.f23656r) != null && qf0Var.f27330x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (eg0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = eg0Var.f23640a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f1282c);
                    }
                    canvas.drawLine(dp2, height, i11, height, (Paint) this.f1281b);
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
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) this.f1281b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + m6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                ch.d dVar = (ch.d) this.f1282c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((ch.d) this.f1282c).draw(canvas);
                }
                m6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f1281b;
                id0 id0Var = (id0) this.d;
                Drawable drawable2 = id0Var.f34635s;
                Rect rect = (Rect) this.f1282c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                id0Var.f34635s.draw(canvas);
                int i13 = id0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.i6.f19124t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f19124t0);
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
                Path path = (Path) this.f1282c;
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
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f1281b);
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
                    Iterator it = ((pe.b) this.f1281b).iterator();
                    while (it.hasNext()) {
                        ((ki.b) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1280a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((s21) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1280a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.m6) this.f1281b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1280a) {
            case 8:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f30953g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1280a) {
            case 3:
                if (((s21) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.m6) this.f1281b)) {
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
        this.f1281b = strArr;
        this.f1282c = drawable;
    }

    public n4(e70 e70Var, Context context) {
        super(context);
        this.d = e70Var;
        this.f1281b = new RectF();
        this.f1282c = new Paint(1);
    }

    public n4(eg0 eg0Var, Context context) {
        super(context);
        this.d = eg0Var;
        Paint paint = new Paint();
        this.f1281b = paint;
        Paint paint2 = new Paint();
        this.f1282c = paint2;
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

    public n4(id0 id0Var, Context context, Rect rect) {
        super(context);
        this.d = id0Var;
        this.f1282c = rect;
        this.f1281b = new RectF();
    }

    public n4(s21 s21Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = s21Var;
        this.f1282c = e6Var;
        this.f1281b = new org.telegram.ui.Components.g6(this, e6Var);
        s21Var.e.setCallback(this);
    }

    public n4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, false, false, false);
        this.f1281b = m6Var;
        m6Var.r(-1);
        m6Var.f26086b = 17;
        m6Var.u(AndroidUtilities.bold());
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.setCallback(this);
    }

    public n4(f6 f6Var, Context context) {
        super(context);
        this.d = f6Var;
        this.f1281b = new g90();
        this.f1282c = new org.telegram.ui.Components.c6(250L, qr.f27423f);
    }

    public n4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f1281b = paint;
        this.f1282c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public n4(r50 r50Var, Context context, s50 s50Var) {
        super(context);
        this.d = r50Var;
        this.f1282c = s50Var;
        this.f1281b = new int[2];
    }
}
