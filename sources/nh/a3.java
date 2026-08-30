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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ad0;
import org.telegram.ui.m50;
import org.telegram.ui.n50;
import org.telegram.ui.y60;
public final class a3 extends View {
    public final int f15049a = 4;
    public final Object f15050b;
    public Object f15051c;
    public Object d;

    public a3(org.telegram.ui.j8 j8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = j8Var;
        this.f15050b = strArr;
        this.f15051c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f15049a) {
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
                    org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f15050b;
                    d6Var.setColor(d6Var.f24174b.a(org.telegram.ui.ActionBar.j6.v0(r21Var.F, d6Var.f24173a), false));
                    textColor = r21Var.getTextColor();
                    d6Var.setColor(i0.a.d(r21Var.C, d6Var.getColor(), textColor));
                    d6Var.setAlpha((int) (d6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), d6Var);
                    j6Var.m(rectF);
                    j6Var.f25901w = (int) (g10 * 255.0f);
                    j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.f6) this.f15051c));
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
                int[] iArr = (int[]) this.f15050b;
                eg.h0 h0Var = (eg.h0) this.f15051c;
                m50 m50Var = (m50) this.d;
                if (m50Var.h > 0.0f && m50Var.d != null) {
                    m50Var.f36193f.reset();
                    float width = getWidth() / m50Var.f36192c.getWidth();
                    m50Var.f36193f.postScale(width, width);
                    m50Var.e.setLocalMatrix(m50Var.f36193f);
                    m50Var.d.setAlpha((int) (m50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), m50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (h0Var != null) {
                    if (h0Var.isAttachedToWindow() && h0Var.getAlpha() > 0.5f) {
                        h0Var.getLocationInWindow(iArr);
                    } else {
                        m50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - h0Var.getScaleX()) * h0Var.getMeasuredWidth()), iArr[1] - ((1.0f - h0Var.getScaleY()) * h0Var.getMeasuredHeight()));
                    if (((n50) h0Var.f5297b).a(canvas2, h0Var.getMeasuredWidth(), m50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                y60 y60Var = (y60) this.d;
                int i10 = dp + ((int) y60Var.f40413b.e);
                Paint paint = (Paint) this.f15051c;
                paint.setColor(y60Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20176s8));
                RectF rectF2 = (RectF) this.f15050b;
                kVar = ((org.telegram.ui.ActionBar.p2) y60Var).actionBar;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), kVar.getMeasuredHeight() + i10);
                y60.a0(y60Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        vf0 vf0Var;
        int dp;
        switch (this.f15049a) {
            case 0:
                i90 i90Var = (i90) this.f15050b;
                super.onDraw(canvas);
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f15051c;
                z5Var.f31239a = this;
                ((d4) this.d).getClass();
                z5Var.d(0.0f, false);
                float f11 = z5Var.f31241c;
                if (f11 != 0.0f) {
                    if (f11 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (z5Var.f31241c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    i90Var.d(rectF);
                    i90Var.j(24.0f);
                    i90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    i90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f15051c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f15050b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.j8) this.d).f35263f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                lg0 lg0Var = (lg0) this.d;
                if (!lg0Var.f26672n || ((vf0Var = lg0Var.f26673r) != null && vf0Var.f29456x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f12 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (lg0Var.W * f12));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f13 = lg0Var.X;
                    if (f13 != 0.0f) {
                        float f14 = dp2;
                        f10 = height;
                        canvas.drawLine(f14, f10, (f12 * f13) + f14, height, (Paint) this.f15051c);
                    } else {
                        f10 = height;
                    }
                    canvas.drawLine(dp2, f10, i11, f10, (Paint) this.f15050b);
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
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f15050b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + j6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                pg.b bVar = (pg.b) this.f15051c;
                if (bVar != null) {
                    bVar.setBounds(width2, 0, i12, getHeight());
                    ((pg.b) this.f15051c).draw(canvas);
                }
                j6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f15050b;
                ad0 ad0Var = (ad0) this.d;
                Drawable drawable2 = ad0Var.f32544s;
                Rect rect = (Rect) this.f15051c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                ad0Var.f32544s.draw(canvas);
                int i13 = ad0Var.D0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.f20185t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20185t0);
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
                Path path = (Path) this.f15051c;
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
                            canvas.drawRect(0.0f, 0.0f, f18, f18, (Paint) this.f15050b);
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
        switch (this.f15049a) {
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
        switch (this.f15049a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.j6) this.f15050b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f15049a) {
            case 8:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f31723d0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f15049a) {
            case 3:
                if (((r21) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.j6) this.f15050b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a3(y60 y60Var, Context context) {
        super(context);
        this.d = y60Var;
        this.f15050b = new RectF();
        this.f15051c = new Paint(1);
    }

    public a3(lg0 lg0Var, Context context) {
        super(context);
        this.d = lg0Var;
        Paint paint = new Paint();
        this.f15050b = paint;
        Paint paint2 = new Paint();
        this.f15051c = paint2;
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

    public a3(ad0 ad0Var, Context context, Rect rect) {
        super(context);
        this.d = ad0Var;
        this.f15051c = rect;
        this.f15050b = new RectF();
    }

    public a3(r21 r21Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = r21Var;
        this.f15051c = f6Var;
        this.f15050b = new org.telegram.ui.Components.d6(this, f6Var);
        r21Var.e.setCallback(this);
    }

    public a3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, false, false, false);
        this.f15050b = j6Var;
        j6Var.r(-1);
        j6Var.f25884b = 17;
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.setCallback(this);
    }

    public a3(d4 d4Var, Context context) {
        super(context);
        this.d = d4Var;
        this.f15050b = new i90();
        this.f15051c = new org.telegram.ui.Components.z5(250L, nr.f27346f);
    }

    public a3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f15050b = paint;
        this.f15051c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public a3(m50 m50Var, Context context, eg.h0 h0Var) {
        super(context);
        this.d = m50Var;
        this.f15051c = h0Var;
        this.f15050b = new int[2];
    }
}
