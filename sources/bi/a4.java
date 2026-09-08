package bi;

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
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.r21;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.f70;
import org.telegram.ui.id0;
import org.telegram.ui.s50;
import org.telegram.ui.t50;
import org.telegram.ui.u50;
public final class a4 extends View {
    public final int f2777a = 4;
    public final Object f2778b;
    public Object f2779c;
    public Object d;

    public a4(org.telegram.ui.h8 h8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = h8Var;
        this.f2778b = strArr;
        this.f2779c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f2777a) {
            case 3:
                r21 r21Var = (r21) this.d;
                org.telegram.ui.Components.p6 p6Var = r21Var.f29927e;
                float g10 = p6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), p6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f2778b;
                    i6Var.setColor(i6Var.f27002b.a(org.telegram.ui.ActionBar.j6.v0(r21Var.I, i6Var.f27001a), false));
                    textColor = r21Var.getTextColor();
                    i6Var.setColor(i0.a.d(r21Var.F, i6Var.getColor(), textColor));
                    i6Var.setAlpha((int) (i6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), i6Var);
                    p6Var.m(rectF);
                    p6Var.f29330w = (int) (g10 * 255.0f);
                    p6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.f6) this.f2779c));
                    p6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f2778b;
                t50 t50Var = (t50) this.f2779c;
                s50 s50Var = (s50) this.d;
                if (s50Var.h > 0.0f && s50Var.d != null) {
                    s50Var.f40333f.reset();
                    float width = getWidth() / s50Var.f40331c.getWidth();
                    s50Var.f40333f.postScale(width, width);
                    s50Var.f40332e.setLocalMatrix(s50Var.f40333f);
                    s50Var.d.setAlpha((int) (s50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), s50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (t50Var != null) {
                    if (t50Var.isAttachedToWindow() && t50Var.getAlpha() > 0.5f) {
                        t50Var.getLocationInWindow(iArr);
                    } else {
                        s50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - t50Var.getScaleX()) * t50Var.getMeasuredWidth()), iArr[1] - ((1.0f - t50Var.getScaleY()) * t50Var.getMeasuredHeight()));
                    if (((u50) t50Var.f40650b).a(canvas2, t50Var.getMeasuredWidth(), s50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                f70 f70Var = (f70) this.d;
                int i10 = dp + ((int) f70Var.f36307b.f15403e);
                Paint paint = (Paint) this.f2779c;
                paint.setColor(f70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20964s8));
                RectF rectF2 = (RectF) this.f2778b;
                kVar = ((org.telegram.ui.ActionBar.n2) f70Var).actionBar;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), kVar.getMeasuredHeight() + i10);
                f70.a0(f70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        qf0 qf0Var;
        int dp;
        switch (this.f2777a) {
            case 0:
                h90 h90Var = (h90) this.f2778b;
                super.onDraw(canvas);
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f2779c;
                e6Var.f25590a = this;
                ((o5) this.d).getClass();
                e6Var.d(0.0f, false);
                float f10 = e6Var.f25592c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (e6Var.f25592c * 255.0f), 31);
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
                Drawable drawable = (Drawable) this.f2779c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f2778b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.h8) this.d).f36932f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                eg0 eg0Var = (eg0) this.d;
                if (!eg0Var.f25720n || ((qf0Var = eg0Var.f25721r) != null && qf0Var.f29743x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f11 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (eg0Var.Z * f11));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f12 = eg0Var.f25704a0;
                    if (f12 != 0.0f) {
                        float f13 = dp2;
                        f7 = height;
                        canvas.drawLine(f13, f7, (f11 * f12) + f13, height, (Paint) this.f2779c);
                    } else {
                        f7 = height;
                    }
                    canvas.drawLine(dp2, f7, i11, f7, (Paint) this.f2778b);
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
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f2778b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + p6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                dh.d dVar = (dh.d) this.f2779c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((dh.d) this.f2779c).draw(canvas);
                }
                p6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f2778b;
                id0 id0Var = (id0) this.d;
                Drawable drawable2 = id0Var.f37354s;
                Rect rect = (Rect) this.f2779c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                id0Var.f37354s.draw(canvas);
                int i13 = id0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.f20975t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20975t0);
                    return;
                }
                return;
            case 8:
                float dp4 = AndroidUtilities.dp(10.0f);
                float f14 = dp4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f14;
                float measuredHeight = getMeasuredHeight() - f14;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f15 = dp4 + measuredWidth2;
                rectF3.set(dp4, dp4, f15, f15);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f16 = measuredWidth2 / 7.0f;
                Path path = (Path) this.f2779c;
                path.rewind();
                path.addRoundRect(rectF3, f16, f16, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f17 = dp5;
                int width3 = ((int) (rectF3.width() / f17)) + 1;
                int height2 = ((int) (rectF3.height() / f17)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f17, f17, (Paint) this.f2778b);
                        }
                        canvas.translate(f17, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f17);
                }
                canvas.restore();
                canvas.restore();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2777a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((r21) this.d).f29927e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f2777a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.p6) this.f2778b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f2777a) {
            case 8:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f33593g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f2777a) {
            case 3:
                if (((r21) this.d).f29927e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.p6) this.f2778b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a4(f70 f70Var, Context context) {
        super(context);
        this.d = f70Var;
        this.f2778b = new RectF();
        this.f2779c = new Paint(1);
    }

    public a4(eg0 eg0Var, Context context) {
        super(context);
        this.d = eg0Var;
        Paint paint = new Paint();
        this.f2778b = paint;
        Paint paint2 = new Paint();
        this.f2779c = paint2;
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

    public a4(id0 id0Var, Context context, Rect rect) {
        super(context);
        this.d = id0Var;
        this.f2779c = rect;
        this.f2778b = new RectF();
    }

    public a4(r21 r21Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = r21Var;
        this.f2779c = f6Var;
        this.f2778b = new org.telegram.ui.Components.i6(this, f6Var);
        r21Var.f29927e.setCallback(this);
    }

    public a4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, false, false, false);
        this.f2778b = p6Var;
        p6Var.r(-1);
        p6Var.f29312b = 17;
        p6Var.u(AndroidUtilities.bold());
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.setCallback(this);
    }

    public a4(o5 o5Var, Context context) {
        super(context);
        this.d = o5Var;
        this.f2778b = new h90();
        this.f2779c = new org.telegram.ui.Components.e6(250L, pr.f29493f);
    }

    public a4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f2778b = paint;
        this.f2779c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public a4(s50 s50Var, Context context, t50 t50Var) {
        super(context);
        this.d = s50Var;
        this.f2779c = t50Var;
        this.f2778b = new int[2];
    }
}
