package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.k60;
import org.telegram.ui.pc0;
import org.telegram.ui.y40;
import org.telegram.ui.z40;
public final class b3 extends View {
    public final int f11258a = 4;
    public final Object f11259b;
    public Object f11260c;
    public Object d;

    public b3(org.telegram.ui.g8 g8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = g8Var;
        this.f11259b = strArr;
        this.f11260c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f11258a) {
            case 3:
                v11 v11Var = (v11) this.d;
                org.telegram.ui.Components.i6 i6Var = v11Var.f33229e;
                float g10 = i6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), i6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f11259b;
                    c6Var.setColor(c6Var.f27372b.a(org.telegram.ui.ActionBar.f6.v0(v11Var.E, c6Var.f27371a), false));
                    textColor = v11Var.getTextColor();
                    c6Var.setColor(i0.a.d(v11Var.B, c6Var.getColor(), textColor));
                    c6Var.setAlpha((int) (c6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), c6Var);
                    i6Var.m(rectF);
                    i6Var.f29351w = (int) (g10 * 255.0f);
                    i6Var.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W8, (org.telegram.ui.ActionBar.b6) this.f11260c));
                    i6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f11259b;
                fh.l2 l2Var = (fh.l2) this.f11260c;
                y40 y40Var = (y40) this.d;
                if (y40Var.h > 0.0f && y40Var.d != null) {
                    y40Var.f44721f.reset();
                    float width = getWidth() / y40Var.f44719c.getWidth();
                    y40Var.f44721f.postScale(width, width);
                    y40Var.f44720e.setLocalMatrix(y40Var.f44721f);
                    y40Var.d.setAlpha((int) (y40Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), y40Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (l2Var != null) {
                    if (l2Var.isAttachedToWindow() && l2Var.getAlpha() > 0.5f) {
                        l2Var.getLocationInWindow(iArr);
                    } else {
                        y40Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - l2Var.getScaleX()) * l2Var.getMeasuredWidth()), iArr[1] - ((1.0f - l2Var.getScaleY()) * l2Var.getMeasuredHeight()));
                    if (((z40) l2Var.f6602b).a(canvas2, l2Var.getMeasuredWidth(), y40Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                k60 k60Var = (k60) this.d;
                int i9 = dp + ((int) k60Var.f39727b.f47780e);
                Paint paint = (Paint) this.f11260c;
                paint.setColor(k60Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8));
                RectF rectF2 = (RectF) this.f11259b;
                kVar = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), kVar.getMeasuredHeight() + i9);
                k60.Z(k60Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        ze0 ze0Var;
        int dp;
        switch (this.f11258a) {
            case 0:
                p80 p80Var = (p80) this.f11259b;
                super.onDraw(canvas);
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.f11260c;
                y5Var.f34852a = this;
                ((i4) this.d).getClass();
                y5Var.d(0.0f, false);
                float f11 = y5Var.f34854c;
                if (f11 != 0.0f) {
                    if (f11 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (y5Var.f34854c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    p80Var.d(rectF);
                    p80Var.j(24.0f);
                    p80Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    p80Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f11260c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i9 = 0; i9 < 7; i9++) {
                    canvas.drawText(((String[]) this.f11259b)[i9], (measuredWidth / 2.0f) + (i9 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.g8) this.d).f38455f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                pf0 pf0Var = (pf0) this.d;
                if (!pf0Var.f31637n || ((ze0Var = pf0Var.f31638r) != null && ze0Var.f35295x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f12 = (width - dp2) - dp2;
                    int i10 = dp2 + ((int) (pf0Var.V * f12));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f13 = pf0Var.W;
                    if (f13 != 0.0f) {
                        float f14 = dp2;
                        f10 = height;
                        canvas.drawLine(f14, f10, (f12 * f13) + f14, height, (Paint) this.f11260c);
                    } else {
                        f10 = height;
                    }
                    canvas.drawLine(dp2, f10, i10, f10, (Paint) this.f11259b);
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
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f11259b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + i6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i11 = dpf2 + width2;
                kg.d dVar = (kg.d) this.f11260c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i11, getHeight());
                    ((kg.d) this.f11260c).draw(canvas);
                }
                i6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f11259b;
                pc0 pc0Var = (pc0) this.d;
                Drawable drawable2 = pc0Var.f41465s;
                Rect rect = (Rect) this.f11260c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                pc0Var.f41465s.draw(canvas);
                int i12 = pc0Var.C0;
                if (i12 == 0 || i12 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.f6.f23279t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
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
                Path path = (Path) this.f11260c;
                path.rewind();
                path.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f18 = dp5;
                int width3 = ((int) (rectF3.width() / f18)) + 1;
                int height2 = ((int) (rectF3.height() / f18)) + 1;
                for (int i13 = 0; i13 < height2; i13++) {
                    canvas.save();
                    for (int i14 = 0; i14 < width3; i14++) {
                        int i15 = i14 % 2;
                        if ((i15 == 0 && i13 % 2 == 0) || (i15 != 0 && i13 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f18, f18, (Paint) this.f11259b);
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
    public void onMeasure(int i9, int i10) {
        switch (this.f11258a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((v11) this.d).f33229e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f11258a) {
            case 4:
                super.onSizeChanged(i9, i10, i11, i12);
                ((org.telegram.ui.Components.i6) this.f11259b).setBounds(0, 0, i9, i10);
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f11258a) {
            case 8:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f35598c0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f11258a) {
            case 3:
                if (((v11) this.d).f33229e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.i6) this.f11259b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public b3(k60 k60Var, Context context) {
        super(context);
        this.d = k60Var;
        this.f11259b = new RectF();
        this.f11260c = new Paint(1);
    }

    public b3(pf0 pf0Var, Context context) {
        super(context);
        this.d = pf0Var;
        Paint paint = new Paint();
        this.f11259b = paint;
        Paint paint2 = new Paint();
        this.f11260c = paint2;
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

    public b3(pc0 pc0Var, Context context, Rect rect) {
        super(context);
        this.d = pc0Var;
        this.f11260c = rect;
        this.f11259b = new RectF();
    }

    public b3(v11 v11Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = v11Var;
        this.f11260c = b6Var;
        this.f11259b = new org.telegram.ui.Components.c6(this, b6Var);
        v11Var.f33229e.setCallback(this);
    }

    public b3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, false, false, false);
        this.f11259b = i6Var;
        i6Var.r(-1);
        i6Var.f29333b = 17;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.setCallback(this);
    }

    public b3(i4 i4Var, Context context) {
        super(context);
        this.d = i4Var;
        this.f11259b = new p80();
        this.f11260c = new org.telegram.ui.Components.y5(250L, gr.f28844f);
    }

    public b3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f11259b = paint;
        this.f11260c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public b3(y40 y40Var, Context context, fh.l2 l2Var) {
        super(context);
        this.d = y40Var;
        this.f11260c = l2Var;
        this.f11259b = new int[2];
    }
}
