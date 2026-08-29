package lh;

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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a50;
import org.telegram.ui.b50;
import org.telegram.ui.m60;
import org.telegram.ui.rc0;
public final class z2 extends View {
    public final int f16450a = 4;
    public final Object f16451b;
    public Object f16452c;
    public Object d;

    public z2(org.telegram.ui.f8 f8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = f8Var;
        this.f16451b = strArr;
        this.f16452c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f16450a) {
            case 3:
                h21 h21Var = (h21) this.d;
                org.telegram.ui.Components.n6 n6Var = h21Var.f29040e;
                float g10 = n6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), n6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f16451b;
                    h6Var.setColor(h6Var.f29072b.a(org.telegram.ui.ActionBar.g6.v0(h21Var.E, h6Var.f29071a), false));
                    textColor = h21Var.getTextColor();
                    h6Var.setColor(i0.a.d(h21Var.B, h6Var.getColor(), textColor));
                    h6Var.setAlpha((int) (h6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), h6Var);
                    n6Var.m(rectF);
                    n6Var.f30880w = (int) (g10 * 255.0f);
                    n6Var.r(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W8, (org.telegram.ui.ActionBar.c6) this.f16452c));
                    n6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f16451b;
                cg.h0 h0Var = (cg.h0) this.f16452c;
                a50 a50Var = (a50) this.d;
                if (a50Var.h > 0.0f && a50Var.d != null) {
                    a50Var.f36432f.reset();
                    float width = getWidth() / a50Var.f36430c.getWidth();
                    a50Var.f36432f.postScale(width, width);
                    a50Var.f36431e.setLocalMatrix(a50Var.f36432f);
                    a50Var.d.setAlpha((int) (a50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), a50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (h0Var != null) {
                    if (h0Var.isAttachedToWindow() && h0Var.getAlpha() > 0.5f) {
                        h0Var.getLocationInWindow(iArr);
                    } else {
                        a50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - h0Var.getScaleX()) * h0Var.getMeasuredWidth()), iArr[1] - ((1.0f - h0Var.getScaleY()) * h0Var.getMeasuredHeight()));
                    if (((b50) h0Var.f3154b).a(canvas2, h0Var.getMeasuredWidth(), a50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                m60 m60Var = (m60) this.d;
                int i10 = dp + ((int) m60Var.f40443b.f49510e);
                Paint paint = (Paint) this.f16452c;
                paint.setColor(m60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8));
                RectF rectF2 = (RectF) this.f16451b;
                lVar = ((org.telegram.ui.ActionBar.o2) m60Var).actionBar;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), lVar.getMeasuredHeight() + i10);
                m60.a0(m60Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f9;
        mf0 mf0Var;
        int dp;
        switch (this.f16450a) {
            case 0:
                c90 c90Var = (c90) this.f16451b;
                super.onDraw(canvas);
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f16452c;
                d6Var.f27664a = this;
                ((d4) this.d).getClass();
                d6Var.d(0.0f, false);
                float f10 = d6Var.f27666c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (d6Var.f27666c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    c90Var.d(rectF);
                    c90Var.j(24.0f);
                    c90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    c90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f16452c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f16451b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.f8) this.d).f38028f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                bg0 bg0Var = (bg0) this.d;
                if (!bg0Var.f27091n || ((mf0Var = bg0Var.f27092r) != null && mf0Var.f30680x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f11 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (bg0Var.V * f11));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f12 = bg0Var.W;
                    if (f12 != 0.0f) {
                        float f13 = dp2;
                        f9 = height;
                        canvas.drawLine(f13, f9, (f11 * f12) + f13, height, (Paint) this.f16452c);
                    } else {
                        f9 = height;
                    }
                    canvas.drawLine(dp2, f9, i11, f9, (Paint) this.f16451b);
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
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f16451b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + n6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                ng.d dVar = (ng.d) this.f16452c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((ng.d) this.f16452c).draw(canvas);
                }
                n6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f16451b;
                rc0 rc0Var = (rc0) this.d;
                Drawable drawable2 = rc0Var.f42056s;
                Rect rect = (Rect) this.f16452c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                rc0Var.f42056s.draw(canvas);
                int i13 = rc0Var.C0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.g6.f23340t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23340t0);
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
                Path path = (Path) this.f16452c;
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
                            canvas.drawRect(0.0f, 0.0f, f17, f17, (Paint) this.f16451b);
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
        switch (this.f16450a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((h21) this.d).f29040e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f16450a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.n6) this.f16451b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f16450a) {
            case 8:
                super.setAlpha(f9);
                ((PhotoViewer) this.d).f35666c0.invalidate();
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f16450a) {
            case 3:
                if (((h21) this.d).f29040e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.n6) this.f16451b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public z2(m60 m60Var, Context context) {
        super(context);
        this.d = m60Var;
        this.f16451b = new RectF();
        this.f16452c = new Paint(1);
    }

    public z2(bg0 bg0Var, Context context) {
        super(context);
        this.d = bg0Var;
        Paint paint = new Paint();
        this.f16451b = paint;
        Paint paint2 = new Paint();
        this.f16452c = paint2;
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

    public z2(rc0 rc0Var, Context context, Rect rect) {
        super(context);
        this.d = rc0Var;
        this.f16452c = rect;
        this.f16451b = new RectF();
    }

    public z2(h21 h21Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = h21Var;
        this.f16452c = c6Var;
        this.f16451b = new org.telegram.ui.Components.h6(this, c6Var);
        h21Var.f29040e.setCallback(this);
    }

    public z2(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, false, false, false);
        this.f16451b = n6Var;
        n6Var.r(-1);
        n6Var.f30862b = 17;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.setCallback(this);
    }

    public z2(d4 d4Var, Context context) {
        super(context);
        this.d = d4Var;
        this.f16451b = new c90();
        this.f16452c = new org.telegram.ui.Components.d6(250L, jr.f29800f);
    }

    public z2(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f16451b = paint;
        this.f16452c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public z2(a50 a50Var, Context context, cg.h0 h0Var) {
        super(context);
        this.d = a50Var;
        this.f16452c = h0Var;
        this.f16451b = new int[2];
    }
}
