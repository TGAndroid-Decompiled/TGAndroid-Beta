package jh;

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
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.y11;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b50;
import org.telegram.ui.c50;
import org.telegram.ui.o60;
import org.telegram.ui.tc0;

public final class a3 extends View {

    public final int f13030a = 4;

    public final Object f13031b;

    public Object f13032c;
    public Object d;

    public a3(org.telegram.ui.h8 h8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = h8Var;
        this.f13031b = strArr;
        this.f13032c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f13030a) {
            case 3:
                y11 y11Var = (y11) this.d;
                org.telegram.ui.Components.i6 i6Var = y11Var.f34781e;
                float fG = i6Var.g();
                if (fG > 0.0f) {
                    float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, fG);
                    float fMax = Math.max(AndroidUtilities.dp(16.66f), i6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, fMax, getHeight());
                    canvas.save();
                    canvas.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
                    float fDp = AndroidUtilities.dp(8.33f);
                    float fDp2 = AndroidUtilities.dp(8.33f);
                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f13031b;
                    c6Var.setColor(c6Var.f27325b.a(org.telegram.ui.ActionBar.g6.v0(y11Var.E, c6Var.f27324a), false));
                    c6Var.setColor(i0.b.d(y11Var.B, c6Var.getColor(), y11Var.getTextColor()));
                    c6Var.setAlpha((int) (c6Var.getAlpha() * fG));
                    canvas.drawRoundRect(rectF, fDp, fDp2, c6Var);
                    i6Var.m(rectF);
                    i6Var.f29257w = (int) (fG * 255.0f);
                    i6Var.r(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W8, (org.telegram.ui.ActionBar.c6) this.f13032c));
                    i6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
            default:
                super.dispatchDraw(canvas);
                break;
            case 5:
                int[] iArr = (int[]) this.f13031b;
                ag.s0 s0Var = (ag.s0) this.f13032c;
                b50 b50Var = (b50) this.d;
                if (b50Var.h <= 0.0f || b50Var.d == null) {
                    canvas2 = canvas;
                } else {
                    b50Var.f36703f.reset();
                    float width = getWidth() / b50Var.f36701c.getWidth();
                    b50Var.f36703f.postScale(width, width);
                    b50Var.f36702e.setLocalMatrix(b50Var.f36703f);
                    b50Var.d.setAlpha((int) (b50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), b50Var.d);
                }
                if (s0Var != null) {
                    if (!s0Var.isAttachedToWindow() || s0Var.getAlpha() <= 0.5f) {
                        b50Var.dismiss();
                    } else {
                        s0Var.getLocationInWindow(iArr);
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - s0Var.getScaleX()) * s0Var.getMeasuredWidth()), iArr[1] - ((1.0f - s0Var.getScaleY()) * s0Var.getMeasuredHeight()));
                    if (((c50) s0Var.f640b).a(canvas2, s0Var.getMeasuredWidth(), b50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                int iDp = AndroidUtilities.dp(48.0f);
                o60 o60Var = (o60) this.d;
                int i10 = iDp + ((int) o60Var.f40995b.f48502e);
                Paint paint = (Paint) this.f13032c;
                paint.setColor(o60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8));
                RectF rectF2 = (RectF) this.f13031b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), ((org.telegram.ui.ActionBar.n2) o60Var).actionBar.getMeasuredHeight() + i10);
                o60.a0(o60Var, canvas, rectF2, paint);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        df0 df0Var;
        switch (this.f13030a) {
            case 0:
                t80 t80Var = (t80) this.f13031b;
                super.onDraw(canvas);
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.f13032c;
                y5Var.f34810a = this;
                ((e4) this.d).getClass();
                y5Var.d(0.0f, false);
                float f11 = y5Var.f34812c;
                if (f11 != 0.0f) {
                    if (f11 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (y5Var.f34812c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    t80Var.d(rectF);
                    t80Var.j(24.0f);
                    t80Var.f(i0.b.k(-1, 20), i0.b.k(-1, 50), i0.b.k(-1, 50), i0.b.k(-1, 70));
                    t80Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                }
                break;
            case 1:
                Drawable drawable = (Drawable) this.f13032c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f13031b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.h8) this.d).f38707f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            case 2:
                super.onDraw(canvas);
                sf0 sf0Var = (sf0) this.d;
                if (!sf0Var.f32430n || ((df0Var = sf0Var.f32431r) != null && df0Var.f27746x)) {
                    int width = getWidth();
                    int iDp = AndroidUtilities.dp(10.0f);
                    float f12 = (width - iDp) - iDp;
                    int i11 = iDp + ((int) (sf0Var.V * f12));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f13 = sf0Var.W;
                    if (f13 != 0.0f) {
                        float f14 = iDp;
                        f10 = height;
                        canvas.drawLine(f14, f10, (f12 * f13) + f14, height, (Paint) this.f13032c);
                    } else {
                        f10 = height;
                    }
                    canvas.drawLine(iDp, f10, i11, f10, (Paint) this.f13031b);
                }
                break;
            case 3:
            case 5:
            case 6:
            default:
                super.onDraw(canvas);
                break;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f13031b;
                int iDpf2 = (int) (AndroidUtilities.dpf2(30.0f) + i6Var.d());
                int width2 = (getWidth() - iDpf2) / 2;
                int i12 = iDpf2 + width2;
                lg.d dVar = (lg.d) this.f13032c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((lg.d) this.f13032c).draw(canvas);
                }
                i6Var.draw(canvas);
                break;
            case 7:
                RectF rectF2 = (RectF) this.f13031b;
                tc0 tc0Var = (tc0) this.d;
                Drawable drawable2 = tc0Var.f42879s;
                Rect rect = (Rect) this.f13032c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                tc0Var.f42879s.draw(canvas);
                int i13 = tc0Var.C0;
                if (i13 == 0 || i13 == 1) {
                    int iDp2 = AndroidUtilities.dp(36.0f);
                    int iDp3 = AndroidUtilities.dp(10.0f) + rect.top;
                    rectF2.set((getMeasuredWidth() - iDp2) / 2, iDp3, (getMeasuredWidth() + iDp2) / 2, AndroidUtilities.dp(4.0f) + iDp3);
                    int themedColor = tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.g6.f23333t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
                }
                break;
            case 8:
                float fDp = AndroidUtilities.dp(10.0f);
                float f15 = fDp * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f15;
                float measuredHeight = getMeasuredHeight() - f15;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f16 = fDp + measuredWidth2;
                rectF3.set(fDp, fDp, f16, f16);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f17 = measuredWidth2 / 7.0f;
                Path path = (Path) this.f13032c;
                path.rewind();
                path.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
                canvas.clipPath(path);
                int iDp4 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f18 = iDp4;
                int iWidth = ((int) (rectF3.width() / f18)) + 1;
                int iHeight = ((int) (rectF3.height() / f18)) + 1;
                for (int i14 = 0; i14 < iHeight; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < iWidth; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f18, f18, (Paint) this.f13031b);
                        }
                        canvas.translate(f18, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f18);
                }
                canvas.restore();
                canvas.restore();
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f13030a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((y11) this.d).f34781e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f13030a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.i6) this.f13031b).setBounds(0, 0, i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f13030a) {
            case 8:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f35601c0.invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f13030a) {
            case 3:
                return ((y11) this.d).f34781e == drawable || super.verifyDrawable(drawable);
            case 4:
                return super.verifyDrawable(drawable) || drawable == ((org.telegram.ui.Components.i6) this.f13031b);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a3(o60 o60Var, Context context) {
        super(context);
        this.d = o60Var;
        this.f13031b = new RectF();
        this.f13032c = new Paint(1);
    }

    public a3(sf0 sf0Var, Context context) {
        super(context);
        this.d = sf0Var;
        Paint paint = new Paint();
        this.f13031b = paint;
        Paint paint2 = new Paint();
        this.f13032c = paint2;
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

    public a3(tc0 tc0Var, Context context, Rect rect) {
        super(context);
        this.d = tc0Var;
        this.f13032c = rect;
        this.f13031b = new RectF();
    }

    public a3(y11 y11Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = y11Var;
        this.f13032c = c6Var;
        this.f13031b = new org.telegram.ui.Components.c6(this, c6Var);
        y11Var.f34781e.setCallback(this);
    }

    public a3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, false, false, false);
        this.f13031b = i6Var;
        i6Var.r(-1);
        i6Var.f29239b = 17;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.setCallback(this);
    }

    public a3(e4 e4Var, Context context) {
        super(context);
        this.d = e4Var;
        this.f13031b = new t80();
        this.f13032c = new org.telegram.ui.Components.y5(250L, er.f28122f);
    }

    public a3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f13031b = paint;
        this.f13032c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public a3(b50 b50Var, Context context, ag.s0 s0Var) {
        super(context);
        this.d = b50Var;
        this.f13032c = s0Var;
        this.f13031b = new int[2];
    }
}
