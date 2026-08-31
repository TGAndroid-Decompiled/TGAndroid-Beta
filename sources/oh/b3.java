package oh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.s21;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bd0;
import org.telegram.ui.n50;
import org.telegram.ui.o50;
import org.telegram.ui.z60;
public final class b3 extends View {
    public final int f16883a = 4;
    public final Object f16884b;
    public Object f16885c;
    public Object d;

    public b3(org.telegram.ui.j8 j8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = j8Var;
        this.f16884b = strArr;
        this.f16885c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f16883a) {
            case 3:
                s21 s21Var = (s21) this.d;
                org.telegram.ui.Components.j6 j6Var = s21Var.f30961e;
                float g10 = j6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), j6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f16884b;
                    d6Var.setColor(d6Var.f26195b.a(org.telegram.ui.ActionBar.k6.v0(s21Var.F, d6Var.f26194a), false));
                    textColor = s21Var.getTextColor();
                    d6Var.setColor(i0.a.d(s21Var.C, d6Var.getColor(), textColor));
                    d6Var.setAlpha((int) (d6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), d6Var);
                    j6Var.m(rectF);
                    j6Var.f28047w = (int) (g10 * 255.0f);
                    j6Var.r(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W8, (org.telegram.ui.ActionBar.g6) this.f16885c));
                    j6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f16884b;
                fg.h0 h0Var = (fg.h0) this.f16885c;
                n50 n50Var = (n50) this.d;
                if (n50Var.h > 0.0f && n50Var.d != null) {
                    n50Var.f39299f.reset();
                    float width = getWidth() / n50Var.f39297c.getWidth();
                    n50Var.f39299f.postScale(width, width);
                    n50Var.f39298e.setLocalMatrix(n50Var.f39299f);
                    n50Var.d.setAlpha((int) (n50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), n50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (h0Var != null) {
                    if (h0Var.isAttachedToWindow() && h0Var.getAlpha() > 0.5f) {
                        h0Var.getLocationInWindow(iArr);
                    } else {
                        n50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - h0Var.getScaleX()) * h0Var.getMeasuredWidth()), iArr[1] - ((1.0f - h0Var.getScaleY()) * h0Var.getMeasuredHeight()));
                    if (((o50) h0Var.f6322b).a(canvas2, h0Var.getMeasuredWidth(), n50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                z60 z60Var = (z60) this.d;
                int i10 = dp + ((int) z60Var.f43826b.f50509e);
                Paint paint = (Paint) this.f16885c;
                paint.setColor(z60Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21930s8));
                RectF rectF2 = (RectF) this.f16884b;
                kVar = ((org.telegram.ui.ActionBar.p2) z60Var).actionBar;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), kVar.getMeasuredHeight() + i10);
                z60.a0(z60Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        xf0 xf0Var;
        int dp;
        switch (this.f16883a) {
            case 0:
                k90 k90Var = (k90) this.f16884b;
                super.onDraw(canvas);
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f16885c;
                z5Var.f33723a = this;
                ((f4) this.d).getClass();
                z5Var.d(0.0f, false);
                float f11 = z5Var.f33725c;
                if (f11 != 0.0f) {
                    if (f11 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (z5Var.f33725c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    k90Var.d(rectF);
                    k90Var.j(24.0f);
                    k90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    k90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f16885c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f16884b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.j8) this.d).f38042f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                ng0 ng0Var = (ng0) this.d;
                if (!ng0Var.f29500n || ((xf0Var = ng0Var.f29501r) != null && xf0Var.f33068x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f12 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (ng0Var.W * f12));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f13 = ng0Var.X;
                    if (f13 != 0.0f) {
                        float f14 = dp2;
                        f10 = height;
                        canvas.drawLine(f14, f10, (f12 * f13) + f14, height, (Paint) this.f16885c);
                    } else {
                        f10 = height;
                    }
                    canvas.drawLine(dp2, f10, i11, f10, (Paint) this.f16884b);
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
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f16884b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + j6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                qg.b bVar = (qg.b) this.f16885c;
                if (bVar != null) {
                    bVar.setBounds(width2, 0, i12, getHeight());
                    ((qg.b) this.f16885c).draw(canvas);
                }
                j6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f16884b;
                bd0 bd0Var = (bd0) this.d;
                Drawable drawable2 = bd0Var.f35476s;
                Rect rect = (Rect) this.f16885c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                bd0Var.f35476s.draw(canvas);
                int i13 = bd0Var.D0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.k6.f21939t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21939t0);
                    return;
                }
                return;
            case 8:
                float dp4 = AndroidUtilities.dp(10.0f);
                float f15 = dp4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f15;
                float measuredHeight = getMeasuredHeight() - f15;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f16 = dp4 + measuredWidth2;
                rectF3.set(dp4, dp4, f16, f16);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f17 = measuredWidth2 / 7.0f;
                Path path = (Path) this.f16885c;
                path.rewind();
                path.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f18 = dp5;
                int width3 = ((int) (rectF3.width() / f18)) + 1;
                int height2 = ((int) (rectF3.height() / f18)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f18, f18, (Paint) this.f16884b);
                        }
                        canvas.translate(f18, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f18);
                }
                canvas.restore();
                canvas.restore();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f16883a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((s21) this.d).f30961e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f16883a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.j6) this.f16884b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f16883a) {
            case 8:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f34248d0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f16883a) {
            case 3:
                if (((s21) this.d).f30961e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.j6) this.f16884b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public b3(z60 z60Var, Context context) {
        super(context);
        this.d = z60Var;
        this.f16884b = new RectF();
        this.f16885c = new Paint(1);
    }

    public b3(ng0 ng0Var, Context context) {
        super(context);
        this.d = ng0Var;
        Paint paint = new Paint();
        this.f16884b = paint;
        Paint paint2 = new Paint();
        this.f16885c = paint2;
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

    public b3(bd0 bd0Var, Context context, Rect rect) {
        super(context);
        this.d = bd0Var;
        this.f16885c = rect;
        this.f16884b = new RectF();
    }

    public b3(s21 s21Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = s21Var;
        this.f16885c = g6Var;
        this.f16884b = new org.telegram.ui.Components.d6(this, g6Var);
        s21Var.f30961e.setCallback(this);
    }

    public b3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, false, false, false);
        this.f16884b = j6Var;
        j6Var.r(-1);
        j6Var.f28029b = 17;
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.setCallback(this);
    }

    public b3(f4 f4Var, Context context) {
        super(context);
        this.d = f4Var;
        this.f16884b = new k90();
        this.f16885c = new org.telegram.ui.Components.z5(250L, pr.f30183f);
    }

    public b3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f16884b = paint;
        this.f16885c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public b3(n50 n50Var, Context context, fg.h0 h0Var) {
        super(context);
        this.d = n50Var;
        this.f16885c = h0Var;
        this.f16884b = new int[2];
    }
}
