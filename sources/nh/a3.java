package nh;

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
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a70;
import org.telegram.ui.cd0;
import org.telegram.ui.o50;
import org.telegram.ui.p50;
public final class a3 extends View {
    public final int f15029a = 4;
    public final Object f15030b;
    public Object f15031c;
    public Object d;

    public a3(org.telegram.ui.l8 l8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = l8Var;
        this.f15030b = strArr;
        this.f15031c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f15029a) {
            case 3:
                r21 r21Var = (r21) this.d;
                org.telegram.ui.Components.j6 j6Var = r21Var.e;
                float g10 = j6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), j6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f15030b;
                    d6Var.setColor(d6Var.f24180b.a(org.telegram.ui.ActionBar.j6.v0(r21Var.F, d6Var.f24179a), false));
                    textColor = r21Var.getTextColor();
                    d6Var.setColor(i0.a.d(r21Var.C, d6Var.getColor(), textColor));
                    d6Var.setAlpha((int) (d6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), d6Var);
                    j6Var.m(rectF);
                    j6Var.f25864w = (int) (g10 * 255.0f);
                    j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.f6) this.f15031c));
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
                int[] iArr = (int[]) this.f15030b;
                eg.h0 h0Var = (eg.h0) this.f15031c;
                o50 o50Var = (o50) this.d;
                if (o50Var.h > 0.0f && o50Var.d != null) {
                    o50Var.f36653f.reset();
                    float width = getWidth() / o50Var.f36652c.getWidth();
                    o50Var.f36653f.postScale(width, width);
                    o50Var.e.setLocalMatrix(o50Var.f36653f);
                    o50Var.d.setAlpha((int) (o50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), o50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (h0Var != null) {
                    if (h0Var.isAttachedToWindow() && h0Var.getAlpha() > 0.5f) {
                        h0Var.getLocationInWindow(iArr);
                    } else {
                        o50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - h0Var.getScaleX()) * h0Var.getMeasuredWidth()), iArr[1] - ((1.0f - h0Var.getScaleY()) * h0Var.getMeasuredHeight()));
                    if (((p50) h0Var.f5286b).a(canvas2, h0Var.getMeasuredWidth(), o50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                a70 a70Var = (a70) this.d;
                int i10 = dp + ((int) a70Var.f32485b.e);
                Paint paint = (Paint) this.f15031c;
                paint.setColor(a70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20151s8));
                RectF rectF2 = (RectF) this.f15030b;
                kVar = ((org.telegram.ui.ActionBar.p2) a70Var).actionBar;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), kVar.getMeasuredHeight() + i10);
                a70.a0(a70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        wf0 wf0Var;
        int dp;
        switch (this.f15029a) {
            case 0:
                j90 j90Var = (j90) this.f15030b;
                super.onDraw(canvas);
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f15031c;
                z5Var.f31251a = this;
                ((d4) this.d).getClass();
                z5Var.d(0.0f, false);
                float f11 = z5Var.f31253c;
                if (f11 != 0.0f) {
                    if (f11 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (z5Var.f31253c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    j90Var.d(rectF);
                    j90Var.j(24.0f);
                    j90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    j90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f15031c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f15030b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.l8) this.d).f35680f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                mg0 mg0Var = (mg0) this.d;
                if (!mg0Var.f27051n || ((wf0Var = mg0Var.f27052r) != null && wf0Var.f30245x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f12 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (mg0Var.W * f12));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f13 = mg0Var.X;
                    if (f13 != 0.0f) {
                        float f14 = dp2;
                        f10 = height;
                        canvas.drawLine(f14, f10, (f12 * f13) + f14, height, (Paint) this.f15031c);
                    } else {
                        f10 = height;
                    }
                    canvas.drawLine(dp2, f10, i11, f10, (Paint) this.f15030b);
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
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f15030b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + j6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                pg.b bVar = (pg.b) this.f15031c;
                if (bVar != null) {
                    bVar.setBounds(width2, 0, i12, getHeight());
                    ((pg.b) this.f15031c).draw(canvas);
                }
                j6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f15030b;
                cd0 cd0Var = (cd0) this.d;
                Drawable drawable2 = cd0Var.f33106s;
                Rect rect = (Rect) this.f15031c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                cd0Var.f33106s.draw(canvas);
                int i13 = cd0Var.D0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.f20160t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20160t0);
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
                Path path = (Path) this.f15031c;
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
                            canvas.drawRect(0.0f, 0.0f, f18, f18, (Paint) this.f15030b);
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
        switch (this.f15029a) {
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
        switch (this.f15029a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.j6) this.f15030b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f15029a) {
            case 8:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f31697d0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f15029a) {
            case 3:
                if (((r21) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.j6) this.f15030b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a3(a70 a70Var, Context context) {
        super(context);
        this.d = a70Var;
        this.f15030b = new RectF();
        this.f15031c = new Paint(1);
    }

    public a3(mg0 mg0Var, Context context) {
        super(context);
        this.d = mg0Var;
        Paint paint = new Paint();
        this.f15030b = paint;
        Paint paint2 = new Paint();
        this.f15031c = paint2;
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

    public a3(cd0 cd0Var, Context context, Rect rect) {
        super(context);
        this.d = cd0Var;
        this.f15031c = rect;
        this.f15030b = new RectF();
    }

    public a3(r21 r21Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = r21Var;
        this.f15031c = f6Var;
        this.f15030b = new org.telegram.ui.Components.d6(this, f6Var);
        r21Var.e.setCallback(this);
    }

    public a3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, false, false, false);
        this.f15030b = j6Var;
        j6Var.r(-1);
        j6Var.f25847b = 17;
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.setCallback(this);
    }

    public a3(d4 d4Var, Context context) {
        super(context);
        this.d = d4Var;
        this.f15030b = new j90();
        this.f15031c = new org.telegram.ui.Components.z5(250L, mr.f27122f);
    }

    public a3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f15030b = paint;
        this.f15031c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public a3(o50 o50Var, Context context, eg.h0 h0Var) {
        super(context);
        this.d = o50Var;
        this.f15031c = h0Var;
        this.f15030b = new int[2];
    }
}
