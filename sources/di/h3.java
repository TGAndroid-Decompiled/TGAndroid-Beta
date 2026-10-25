package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.z31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.e50;
import org.telegram.ui.f50;
import org.telegram.ui.pc0;
import org.telegram.ui.r60;
import org.telegram.ui.z10;
public final class h3 extends View {
    public final int f8617a = 8;
    public final Object f8618b;
    public Object f8619c;
    public Object d;

    public h3(Context context) {
        super(context);
        this.f8618b = new se.b();
        this.f8619c = new ag.e0(1, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f8617a) {
            case 2:
                z31 z31Var = (z31) this.d;
                org.telegram.ui.Components.r6 r6Var = z31Var.e;
                float i10 = r6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), r6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.l6 l6Var = (org.telegram.ui.Components.l6) this.f8618b;
                    l6Var.setColor(l6Var.f30085b.a(org.telegram.ui.ActionBar.y6.w0(z31Var.I, l6Var.f30084a), false));
                    l6Var.setColor(i0.a.f(z31Var.F, l6Var.getColor(), z31.a(z31Var)));
                    l6Var.setAlpha((int) (l6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), l6Var);
                    r6Var.p(rectF);
                    r6Var.B = (int) (i10 * 255.0f);
                    r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W8, (org.telegram.ui.ActionBar.u6) this.f8619c));
                    r6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                int[] iArr = (int[]) this.f8618b;
                z10 z10Var = (z10) this.f8619c;
                e50 e50Var = (e50) this.d;
                if (e50Var.h > 0.0f && e50Var.d != null) {
                    e50Var.f38992f.reset();
                    float width = getWidth() / e50Var.f38991c.getWidth();
                    e50Var.f38992f.postScale(width, width);
                    e50Var.e.setLocalMatrix(e50Var.f38992f);
                    e50Var.d.setAlpha((int) (e50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), e50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (z10Var != null) {
                    if (z10Var.isAttachedToWindow() && z10Var.getAlpha() > 0.5f) {
                        z10Var.getLocationInWindow(iArr);
                    } else {
                        e50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - z10Var.getScaleX()) * z10Var.getMeasuredWidth()), iArr[1] - ((1.0f - z10Var.getScaleY()) * z10Var.getMeasuredHeight()));
                    if (((f50) z10Var.f46152b).a(canvas2, z10Var.getMeasuredWidth(), e50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 4:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                r60 r60Var = (r60) this.d;
                int i11 = dp + ((int) r60Var.f43011b.f19334f);
                Paint paint = (Paint) this.f8619c;
                paint.setColor(r60Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23634s8));
                RectF rectF2 = (RectF) this.f8618b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), r60.c0(r60Var).getMeasuredHeight() + i11);
                r60.b0(r60Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8617a) {
            case 7:
                super.onAttachedToWindow();
                if (((ai.g) this.f8619c) != null) {
                    postDelayed((org.telegram.ui.Wallet.m) this.d, 200L);
                    return;
                }
                return;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((ag.e0) this.f8619c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8617a) {
            case 7:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.d;
                removeCallbacks(mVar);
                mVar.run();
                return;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((ag.e0) this.f8619c);
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
        mg0 mg0Var;
        int dp;
        switch (this.f8617a) {
            case 0:
                da0 da0Var = (da0) this.f8618b;
                super.onDraw(canvas);
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f8619c;
                h6Var.f28807a = this;
                ((q4) this.d).getClass();
                h6Var.d(0.0f, false);
                float f7 = h6Var.f28809c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (h6Var.f28809c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    da0Var.e(rectF);
                    da0Var.k(24.0f);
                    da0Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    da0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                ch0 ch0Var = (ch0) this.d;
                if (!ch0Var.f27174n || ((mg0Var = ch0Var.f27175r) != null && mg0Var.f30580x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i10 = dp2 + ((int) (ch0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = ch0Var.f27159a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f8619c);
                    }
                    canvas.drawLine(dp2, height, i10, height, (Paint) this.f8618b);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                RectF rectF2 = (RectF) this.f8618b;
                pc0 pc0Var = (pc0) this.d;
                Drawable drawable = pc0Var.f42448s;
                Rect rect = (Rect) this.f8619c;
                drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                pc0Var.f42448s.draw(canvas);
                int i11 = pc0Var.F0;
                if (i11 == 0 || i11 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = pc0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.y6.f23646t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23646t0);
                    return;
                }
                return;
            case 6:
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
                Path path = (Path) this.f8619c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp5;
                int width2 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i12 = 0; i12 < height2; i12++) {
                    canvas.save();
                    for (int i13 = 0; i13 < width2; i13++) {
                        int i14 = i13 % 2;
                        if ((i14 == 0 && i12 % 2 == 0) || (i14 != 0 && i12 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f8618b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 7:
                ai.h hVar = (ai.h) this.f8618b;
                hVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (hVar.f1528o < 1.0f || hVar.f1525l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((se.b) this.f8618b).iterator();
                    while (it.hasNext()) {
                        ((oi.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8617a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((z31) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f8617a) {
            case 6:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f35661g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8617a) {
            case 2:
                if (((z31) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h3(r60 r60Var, Context context) {
        super(context);
        this.d = r60Var;
        this.f8618b = new RectF();
        this.f8619c = new Paint(1);
    }

    public h3(ch0 ch0Var, Context context) {
        super(context);
        this.d = ch0Var;
        Paint paint = new Paint();
        this.f8618b = paint;
        Paint paint2 = new Paint();
        this.f8619c = paint2;
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

    public h3(pc0 pc0Var, Context context, Rect rect) {
        super(context);
        this.d = pc0Var;
        this.f8619c = rect;
        this.f8618b = new RectF();
    }

    public h3(z31 z31Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = z31Var;
        this.f8619c = u6Var;
        this.f8618b = new org.telegram.ui.Components.l6(this, u6Var);
        z31Var.e.setCallback(this);
    }

    public h3(Context context, ai.g gVar) {
        super(context);
        ai.h hVar = new ai.h();
        this.f8618b = hVar;
        this.d = new org.telegram.ui.Wallet.m(this, 9);
        if (hVar.f1537y != -16777216 || hVar.f1538z == null) {
            hVar.f1537y = -16777216;
            hVar.f1538z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f8619c = gVar;
    }

    public h3(q4 q4Var, Context context) {
        super(context);
        this.d = q4Var;
        this.f8618b = new da0();
        this.f8619c = new org.telegram.ui.Components.h6(250L, ds.f27584f);
    }

    public h3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f8618b = paint;
        this.f8619c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public h3(e50 e50Var, Context context, z10 z10Var) {
        super(context);
        this.d = e50Var;
        this.f8619c = z10Var;
        this.f8618b = new int[2];
    }
}
