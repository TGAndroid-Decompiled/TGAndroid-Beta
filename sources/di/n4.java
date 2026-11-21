package di;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.yz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ap0;
import org.telegram.ui.bp0;
import org.telegram.ui.d61;
import org.telegram.ui.n71;
import org.telegram.ui.oy0;
import org.telegram.ui.w61;
import org.telegram.ui.x71;
public final class n4 extends FrameLayout {
    public static final int f9390f = 0;
    public final int f9391a = 5;
    public Object f9392b;
    public Object f9393c;
    public Object d;
    public Object f9394e;

    public n4(Context context) {
        super(context);
    }

    public float a() {
        f6 f6Var = (f6) this.f9394e;
        return (f6Var.X2.a(3) * f6Var.f8840z2.getMeasuredHeight()) + (f6Var.X2.a(2) * f6Var.f8836x2.getMeasuredHeight()) + (f6Var.X2.a(1) * f6Var.f8818o2.getMeasuredHeight()) + (f6Var.X2.a(0) * f6Var.f8796c2.getMeasuredHeight()) + f6Var.f8794b2.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i7;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f9392b;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        TextView textView = (TextView) this.f9393c;
        boolean z11 = gd.f24241a0;
        if (!z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z11 && z10) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(c8.ma.d(-1, -2.0f, 55, f10, 14.0f, f11, 12.0f));
    }

    public void c(int i7, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f9393c).setImageDrawable(getContext().getDrawable(i7));
    }

    public void d() {
        ((rh0) this.f9394e).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f9392b).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f9393c).animate().alpha(0.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        Paint e10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        switch (this.f9391a) {
            case 0:
                f6 f6Var = (f6) this.f9394e;
                org.telegram.ui.Components.na naVar = f6Var.f39540p1;
                FrameLayout frameLayout = f6Var.f8805h2;
                f6Var.X0(canvas, this);
                canvas.save();
                float f10 = f();
                float L = org.telegram.messenger.g0.L(12.0f);
                RectF rectF = (RectF) this.f9392b;
                rectF.set(f6Var.f30208u0, f10, getWidth() - f6Var.f30208u0, getHeight() + L);
                Paint paint = (Paint) this.f9393c;
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, f6Var.J0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(f6Var.f30208u0, getHeight() - getPaddingBottom(), getWidth() - f6Var.f30208u0, getHeight(), paint);
                    paint.setAlpha(255);
                }
                h();
                canvas.restore();
                if (naVar != null && naVar.getVisibility() == 0 && naVar.getAlpha() > 0.0f) {
                    if (naVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(naVar.getX(), naVar.getY(), naVar.getMeasuredWidth() + naVar.getX(), naVar.getMeasuredHeight() + naVar.getY(), (int) (naVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(naVar.getX(), naVar.getY(), naVar.getX() + naVar.getMeasuredWidth(), naVar.getY() + naVar.getMeasuredHeight());
                    }
                    canvas.translate(naVar.getX(), naVar.getY());
                    naVar.draw(canvas);
                    canvas.restore();
                }
                f6Var.W0(canvas, this);
                return;
            case 6:
                LinearGradient linearGradient = (LinearGradient) this.f9392b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.f9393c;
                PhotoViewer photoViewer = (PhotoViewer) this.f9394e;
                if (!photoViewer.S4) {
                    if (photoViewer.f43325o0.getVisibility() == 0) {
                        i7 = getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f);
                    } else {
                        i7 = 0;
                    }
                    int i10 = photoViewer.d2;
                    if (i10 != 0 && i10 != 2 && i10 != -1) {
                        paint2.setShader(null);
                        paint2.setColor(2130706432);
                    } else {
                        matrix.reset();
                        matrix.postTranslate(0.0f, i7);
                        matrix.postScale(1.0f, Math.min(org.telegram.messenger.g0.L(40.0f), getMeasuredHeight() - i7) / 16.0f);
                        linearGradient.setLocalMatrix(matrix);
                        paint2.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i7, getMeasuredWidth(), getMeasuredHeight(), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.f9392b;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = org.telegram.messenger.g0.L(8.0f);
                Paint paint5 = (Paint) this.f9393c;
                paint5.setColor(0);
                float N = org.telegram.messenger.g0.N(1.0f);
                float N2 = org.telegram.messenger.g0.N(0.33f);
                x71 x71Var = (x71) this.f9394e;
                paint5.setShadowLayer(N, 0.0f, N2, i0.a.o(-16777216, (int) (x71Var.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, L2, L2, paint5);
                n71 n71Var = x71Var.f53780z0;
                w61 w61Var = x71Var.f53711a;
                org.telegram.ui.ActionBar.m6.t(this, n71Var, w61Var);
                Paint g10 = w61Var.g("paintChatActionBackground");
                int alpha = g10.getAlpha();
                g10.setAlpha((int) (x71Var.T1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, L2, L2, g10);
                g10.setAlpha(alpha);
                if (x71Var.O1) {
                    float f11 = x71Var.f53756p1;
                    if (f11 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f * x71Var.f53758q1)));
                        canvas.drawRoundRect(rectF2, L2, L2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (x71Var.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, L2, L2, paint4);
                super.dispatchDraw(canvas);
                return;
            case 10:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                Paint paint6 = (Paint) this.f9393c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f9394e;
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.f33063d0 && !limitPreviewView.S) {
                        paint6.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29398e7, h6Var));
                    } else {
                        paint6.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29470i6, h6Var));
                    }
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29321a7, h6Var));
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ug.s sVar = limitPreviewView.f33067f0;
                if (sVar != null) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f52925b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.Q) {
                    canvas.clipRect(limitPreviewView.f33074n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.S) {
                    e10 = limitPreviewView.L;
                } else if (limitPreviewView.f33067f0 != null) {
                    e10 = (Paint) this.f9392b;
                } else {
                    e10 = ia.e.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    ug.a1 a1Var = limitPreviewView.F;
                    if (a1Var != null) {
                        e10 = a1Var.f58643f;
                        a1Var.a();
                        Matrix matrix2 = a1Var.f58642e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f33061c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.G);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f12 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f12 += view.getY();
                        }
                        ia.e.d().f(LimitPreviewView.e(limitPreviewView) - getLeft(), -f12, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
                    }
                } else {
                    ia.e.d().f(LimitPreviewView.e(limitPreviewView) - getLeft(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
                }
                int alpha2 = e10.getAlpha();
                if (limitPreviewView.W && (valueAnimator2 = limitPreviewView.f33071j0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.V && (valueAnimator = limitPreviewView.f33071j0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.M && !limitPreviewView.N) {
                        org.telegram.messenger.g0.P.set(0.0f, 0.0f, limitPreviewView.f33074n, getMeasuredHeight());
                    } else {
                        org.telegram.messenger.g0.P.set(limitPreviewView.f33074n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), e10);
                e10.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.F == null && limitPreviewView.f33065e0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                Paint paint7 = (Paint) this.f9393c;
                paint7.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, (org.telegram.ui.ActionBar.h6) this.d));
                ug.g0 g0Var = (ug.g0) this.f9394e;
                canvas.drawLine(org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, g0Var.d.getLeft() - org.telegram.messenger.g0.L(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(org.telegram.messenger.g0.L(20.0f) + g0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = org.telegram.messenger.g0.P;
                int top = g0Var.d.getTop();
                rectF4.set(g0Var.d.getLeft() - org.telegram.messenger.g0.L(15.0f), ((g0Var.d.getBottom() + top) - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(15.0f) + g0Var.d.getRight(), (org.telegram.messenger.g0.L(30.0f) + (g0Var.d.getBottom() + g0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                ug.a1 a1Var2 = (ug.a1) this.f9392b;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), a1Var2.f58643f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 12:
                Drawable drawable = (Drawable) this.f9393c;
                ug.y0 y0Var = (ug.y0) this.f9394e;
                y0Var.f30206s0.setBounds(0, org.telegram.ui.Cells.c0.i(2.0f, y0Var.H1 + y0Var.f30207t0, 1), getMeasuredWidth(), getMeasuredHeight());
                y0Var.f30206s0.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.v7 v7Var = y0Var.I1;
                if (v7Var != null && v7Var.getVisibility() == 0 && y0Var.I1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, y0Var.I1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + y0Var.I1.getBottom());
                    drawable.setAlpha((int) (y0Var.I1.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9391a) {
            case 0:
                f6 f6Var = (f6) this.f9394e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < f() && f6Var.f30173b.isAttachedToWindow()) {
                    f6Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                ug.y0 y0Var = (ug.y0) this.f9394e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(2.0f) + (y0Var.H1 - y0Var.f30207t0)) {
                        y0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f9391a) {
            case 1:
                RectF rectF = (RectF) this.f9392b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ((org.telegram.ui.t5) this.f9394e).v0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        ImageReceiver photoImage;
        switch (this.f9391a) {
            case 0:
                f6 f6Var = (f6) this.f9394e;
                if (view == f6Var.f39540p1) {
                    return false;
                }
                if (view != f6Var.f8792a2) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 9:
                float[] fArr = (float[]) this.f9393c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f9392b;
                hi.a5 a5Var = (hi.a5) this.f9394e;
                tg.q0 q0Var = a5Var.f58197s0;
                if (view == a5Var.f58202x0) {
                    org.telegram.ui.Cells.r1 q10 = tg.v0.q(a5Var);
                    int i7 = 0;
                    if (q10 == null || (photoImage = q10.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.N0 / a5Var.f58204z0, photoImage.O0 / a5Var.A0);
                    matrix.postScale((a5Var.f58204z0 / a5Var.f58202x0.getWidth()) * max, (a5Var.A0 / a5Var.f58202x0.getHeight()) * max);
                    matrix.postTranslate((photoImage.r() + (q10.getX() + q0Var.getX())) - ((a5Var.f58204z0 * max) / 2.0f), (photoImage.s() + (q10.getY() + q0Var.getY())) - ((a5Var.A0 * max) / 2.0f));
                    a5Var.f58202x0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    org.telegram.messenger.g0.P.set(q10.getX() + q0Var.getX() + photoImage.L0, q10.getY() + q0Var.getY() + photoImage.M0, photoImage.y() + q10.getX() + q0Var.getX(), photoImage.A() + q10.getY() + q0Var.getY());
                    while (true) {
                        int[] iArr = photoImage.X0;
                        if (i7 < iArr.length) {
                            int i10 = i7 * 2;
                            float f10 = iArr[i7];
                            fArr[i10] = f10;
                            fArr[i10 + 1] = f10;
                            i7++;
                        } else {
                            path.addRoundRect(org.telegram.messenger.g0.P, fArr, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild2 = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild2;
                        }
                    }
                } else {
                    return super.drawChild(canvas, view, j3);
                }
                break;
            case 12:
                Path path2 = (Path) this.d;
                if (view == ((ScrollView) this.f9392b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(getPaddingLeft(), org.telegram.messenger.g0.L(18.0f) + ((ug.y0) this.f9394e).H1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 13:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                bg.d0 d0Var = (bg.d0) this.f9393c;
                bg.d0 d0Var2 = (bg.d0) this.f9392b;
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                vh.g gVar = (vh.g) this.f9394e;
                int i11 = (int) gVar.T1.f57702f;
                if (view == gVar.d2 && i11 > 0) {
                    d0Var2.setBounds(0, org.telegram.messenger.g0.L(40.0f), getWidth(), org.telegram.messenger.g0.L(48.0f));
                    int i12 = org.telegram.ui.ActionBar.m6.f29451h5;
                    d0Var2.b(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
                    d0Var2.draw(canvas);
                    int L = org.telegram.messenger.g0.L(48.0f) + i11;
                    d0Var.setBounds(0, L - org.telegram.messenger.g0.L(8.0f), getWidth(), L);
                    d0Var.b(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
                    d0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e() {
        rh0 rh0Var = (rh0) this.f9394e;
        rh0Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f9392b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f9393c).animate().alpha(1.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(0.0f).setDuration(150L).start();
        rh0Var.d();
    }

    public float f() {
        e5 e5Var;
        float max = Math.max(0.0f, getHeight() - a());
        f6 f6Var = (f6) this.f9394e;
        ek0 ek0Var = f6Var.f39539o1;
        int childCount = ek0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = ek0Var.getChildAt(childCount);
            ek0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - f6Var.f8794b2.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a10 = (f6Var.X2.a(4) * f6Var.R()) + max;
        Float f10 = f6Var.W2;
        if (f10 != null && (e5Var = f6Var.X2) != null && e5Var.f8736a < 1.0f) {
            return org.telegram.messenger.g0.T1(f10.floatValue(), a10, f6Var.X2.f8736a);
        }
        return a10;
    }

    public void g() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = ((rz) this.f9394e).f39381a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        ((ImageView) this.f9392b).setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        ((TextView) this.f9393c).setTextColor(w02);
        ((TextView) this.d).setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29770y6, h6Var));
        setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29470i6, h6Var), 2, -1));
    }

    public void h() {
        float f10 = f();
        f6 f6Var = (f6) this.f9394e;
        k4 k4Var = f6Var.f8792a2;
        k4Var.setTranslationY(f10 - k4Var.getHeight());
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(f10 - k4Var.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f)));
        k4Var.setAlpha(f6Var.X2.a(0) * l10);
        k4Var.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        k4Var.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        z5 z5Var = f6Var.f8794b2;
        z5Var.setTranslationY(f10);
        f6Var.f8796c2.setTranslationY(z5Var.getRealHeight() + f10);
        f6Var.f8818o2.setTranslationY(z5Var.getRealHeight() + f10);
        f6Var.f8836x2.setTranslationY(z5Var.getRealHeight() + f10);
        f6Var.f8840z2.setTranslationY(z5Var.getRealHeight() + f10);
        FrameLayout frameLayout = f6Var.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.f24141n);
        }
        org.telegram.messenger.g0.V3(f6Var.f8810k2, f6Var.f39539o1.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f9391a) {
            case 2:
                return false;
            case 12:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f9391a) {
            case 3:
                RectF rectF = (RectF) this.f9392b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f9394e;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float L = org.telegram.messenger.g0.L(4.0f);
                fArr[7] = L;
                fArr[6] = L;
                fArr[5] = L;
                fArr[4] = L;
                Path path = (Path) this.d;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.f9393c;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int left;
        int boundsRight;
        switch (this.f9391a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                f6 f6Var = (f6) this.f9394e;
                l4 l4Var = f6Var.P2;
                if (l4Var != null) {
                    int finalHeight = f6Var.f8794b2.getFinalHeight();
                    int B1 = f6Var.B1();
                    if (f6Var.X2.d(1) && f6Var.f8809j2.getVisibility() == 0) {
                        i13 = f6Var.f8809j2.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    l4Var.H(finalHeight, B1 + i13);
                }
                f6Var.X1();
                return;
            case 6:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.f9394e;
                if (photoViewer.I0.getVisibility() != 8) {
                    if (photoViewer.T0.getVisibility() == 0) {
                        i14 = org.telegram.messenger.g0.L(63.0f);
                    } else {
                        i14 = 0;
                    }
                    int measuredWidth = (((i11 - i7) - i14) - photoViewer.I0.getMeasuredWidth()) / 2;
                    d61 d61Var = photoViewer.I0;
                    d61Var.layout(measuredWidth, d61Var.getTop(), photoViewer.I0.getMeasuredWidth() + measuredWidth, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    return;
                }
                return;
            case 9:
                hi.a5 a5Var = (hi.a5) this.f9394e;
                tg.q0 q0Var = a5Var.f58197s0;
                int measuredWidth2 = q0Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < q0Var.getChildCount(); i16++) {
                    View childAt = q0Var.getChildAt(i16);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                        left2 = childAt.getLeft() + r1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = r1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        left2 = childAt.getLeft() + v0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i15 = Math.max(right, i15);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i15 = Math.max(right, i15);
                }
                q0Var.layout(-measuredWidth2, 0, q0Var.getMeasuredWidth() - measuredWidth2, q0Var.getMeasuredHeight());
                TextureView textureView = a5Var.f58202x0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), q0Var.getMeasuredHeight());
                    return;
                }
                return;
            case 10:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int i17 = i12 - i10;
                    childAt2.layout(0, 0, measuredWidth3, i17);
                    childAt3.layout(measuredWidth3, 0, i11 - i7, i17);
                    return;
                }
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int left;
        int boundsRight;
        int i13;
        float measuredWidth;
        boolean z10;
        switch (this.f9391a) {
            case 0:
                f6 f6Var = (f6) this.f9394e;
                int R = f6Var.R();
                int i14 = 0;
                setPadding(0, 0, 0, R);
                f6Var.f8794b2.N.setPadding(0, 0, 0, R);
                int size = View.MeasureSpec.getSize(i10);
                f6Var.f39542r1 = size;
                int size2 = View.MeasureSpec.getSize(i7);
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt instanceof hi.l3) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
                    } else if (childAt == f6Var.f39539o1) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(size - R, 1073741824));
                    } else {
                        if (childAt.getLayoutParams() != null && childAt.getLayoutParams().height == -1) {
                            i11 = size;
                        } else {
                            i11 = 9999;
                        }
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size2, size);
                l4 l4Var = f6Var.P2;
                if (l4Var != null) {
                    int finalHeight = f6Var.f8794b2.getFinalHeight();
                    int B1 = f6Var.B1();
                    if (f6Var.X2.d(1) && f6Var.f8809j2.getVisibility() == 0) {
                        i14 = f6Var.f8809j2.getMeasuredHeight();
                    }
                    l4Var.H(finalHeight, B1 + i14);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.f9394e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams();
                if (photoViewer.T0.getVisibility() == 0) {
                    i12 = org.telegram.messenger.g0.L(63.0f);
                } else {
                    i12 = 0;
                }
                layoutParams.rightMargin = i12;
                super.onMeasure(i7, i10);
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 9:
                hi.a5 a5Var = (hi.a5) this.f9394e;
                tg.q0 q0Var = a5Var.f58197s0;
                q0Var.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = a5Var.f58202x0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(q0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(q0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = q0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < q0Var.getChildCount(); i17++) {
                    View childAt2 = q0Var.getChildAt(i17);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt2;
                        left2 = childAt2.getLeft() + r1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = r1Var.getBoundsRight();
                    } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt2;
                        left2 = childAt2.getLeft() + v0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i16 = Math.max(right, i16);
                }
                setMeasuredDimension(i16 - measuredWidth2, q0Var.getMeasuredHeight());
                return;
            case 10:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f9394e;
                org.telegram.ui.Components.o6 o6Var = limitPreviewView.f33079w;
                TextView textView = limitPreviewView.f33080x;
                hi.p3 p3Var = limitPreviewView.f33069h0;
                hi.p3 p3Var2 = limitPreviewView.f33068g0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i7);
                    int size4 = View.MeasureSpec.getSize(i10);
                    p3Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    int measuredWidth3 = p3Var2.getMeasuredWidth();
                    int measuredWidth4 = limitPreviewView.O.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                    int i18 = 0;
                    boolean z11 = false;
                    if (textView.getVisibility() == 0) {
                        i13 = textView.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i13 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i13);
                    p3Var.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    if (limitPreviewView.Q) {
                        float f10 = limitPreviewView.f33057a;
                        float f11 = 0.0f;
                        if (f10 == 0.0f) {
                            limitPreviewView.f33074n = 0;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                if (!limitPreviewView.M && limitPreviewView.f33067f0 == null) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                LimitPreviewView.c(limitPreviewView, z10);
                                if (limitPreviewView.f33067f0 != null) {
                                    LimitPreviewView.d(limitPreviewView, true);
                                } else {
                                    LimitPreviewView.d(limitPreviewView, false);
                                }
                            }
                        } else if (f10 < 1.0f) {
                            if (limitPreviewView.M) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = p3Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            }
                            if (!limitPreviewView.M) {
                                f11 = p3Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            }
                            limitPreviewView.f33074n = (int) ((((size3 - measuredWidth) - f11) * limitPreviewView.f33057a) + measuredWidth);
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                LimitPreviewView.c(limitPreviewView, (limitPreviewView.M || limitPreviewView.f33067f0 != null) ? true : true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        } else {
                            limitPreviewView.f33074n = size3;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                LimitPreviewView.c(limitPreviewView, true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        }
                    } else {
                        int measuredWidth5 = p3Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.P.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                        if (o6Var.getVisibility() == 0) {
                            i18 = o6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                        }
                        int i19 = (int) Utilities.i(size3 * limitPreviewView.f33057a, size3 - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f33074n = i19;
                        p3Var2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        p3Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.f33074n, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    return;
                }
                super.onMeasure(i7, i10);
                return;
            case 12:
                ug.y0 y0Var = (ug.y0) this.f9394e;
                y0Var.G1 = 0;
                ScrollView scrollView = (ScrollView) this.f9392b;
                scrollView.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE));
                y0Var.G1 = (View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight()) + y0Var.f30207t0;
                super.onMeasure(i7, i10);
                y0Var.J0();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f9391a) {
            case 6:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f9394e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f10);
                }
                ap0 ap0Var = photoViewer.V1;
                if (ap0Var != null && ap0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.f43424y7[0] * f10);
                }
                bp0 bp0Var = photoViewer.W1;
                if (bp0Var != null && bp0Var.getVisibility() != 8) {
                    photoViewer.W1.setAlpha(f10 * photoViewer.f43433z7[0]);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f9391a) {
            case 0:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((f6) this.f9394e).F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.f24141n);
                    return;
                }
                return;
            case 6:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f9394e;
                FrameLayout frameLayout2 = photoViewer.R7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.k0 k0Var = photoViewer.Y1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f10);
                    return;
                }
                return;
            case 12:
                super.setTranslationY(f10);
                ((ug.y0) this.f9394e).g0(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        int i10;
        switch (this.f9391a) {
            case 6:
                super.setVisibility(i7);
                PhotoViewer photoViewer = (PhotoViewer) this.f9394e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.R7;
                    if (i7 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    frameLayout2.setVisibility(i10);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public n4(Activity activity, org.telegram.ui.Components.voip.l1 l1Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.f1[5];
        setWillNotDraw(false);
        ai.l0 l0Var = new ai.l0(activity, l1Var);
        this.f9392b = l0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f9393c = frameLayout;
        l0Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i7 = 0; i7 < 5; i7++) {
            ((org.telegram.ui.Components.voip.f1[]) this.d)[i7] = new org.telegram.ui.Components.voip.f1(activity);
            ((org.telegram.ui.Components.voip.f1[]) this.d)[i7].setAllStarsProvider(new org.telegram.tgnet.u(this, 8));
            org.telegram.ui.Components.voip.f1 f1Var = ((org.telegram.ui.Components.voip.f1[]) this.d)[i7];
            f1Var.d = new org.telegram.ui.Components.h2(25, this, activity);
            f1Var.f41005f = i7;
            ((FrameLayout) this.f9393c).addView(f1Var, c8.ma.d(-2, -2.0f, 51, i7 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((ai.l0) this.f9392b, c8.ma.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.f9393c, c8.ma.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    public n4(hi.a5 a5Var, Context context) {
        super(context);
        this.f9394e = a5Var;
        this.f9392b = new Matrix();
        this.f9393c = new float[8];
        this.d = new Path();
    }

    public n4(org.telegram.ui.j9 j9Var, Context context, yz yzVar) {
        super(context);
        addView(yzVar, c8.ma.c(-1.0f, -1));
        this.d = yzVar;
        ?? imageView = new ImageView(context);
        this.f9394e = imageView;
        imageView.f(2131624317, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, c8.ma.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.f9392b = textView;
        n10.r(textView, org.telegram.ui.ActionBar.m6.G6, null, null, 2131748506);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        addView(textView, c8.ma.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9393c = textView2;
        String a02 = gd.a0(null, null, 2131748505, Integer.valueOf(j9Var.getMessagesController().S6));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29361c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ma.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        yzVar.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new gi.a(4));
    }

    public n4(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f9394e = limitPreviewView;
        this.d = h6Var;
        this.f9393c = new Paint();
        Paint paint = new Paint();
        this.f9392b = paint;
        paint.setColor(-1);
    }

    public n4(Context context, org.telegram.ui.ActionBar.h6 h6Var, vh.g gVar) {
        super(context);
        this.f9394e = gVar;
        this.d = h6Var;
        this.f9392b = new bg.d0(2);
        this.f9393c = new bg.d0(8);
    }

    public n4(ug.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f9394e = y0Var;
        this.f9392b = scrollView;
        this.f9393c = drawable;
        this.d = new Path();
    }

    public n4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f9393c = textView;
        n10.p(textView, 1, 20.0f);
        textView.setGravity(gd.f24241a0 ? 5 : 3);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29486j5, h6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f9392b = imageView;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.d = x1Var;
        imageView.setImageDrawable(x1Var);
        x1Var.a(-1);
        addView(imageView, c8.ma.d(24, 24.0f, (gd.f24241a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new oy0(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.g0.L(56.0f));
    }

    public n4(org.telegram.ui.t5 t5Var, Context context) {
        super(context);
        this.f9394e = t5Var;
        this.f9392b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f9393c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, c8.ma.e(-2, -2, 1));
        addView(textView, c8.ma.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.g0.L(100.0f));
        int L = org.telegram.messenger.g0.L(10.0f);
        int o4 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
    }

    public n4(rz rzVar, Context context) {
        super(context);
        this.f9394e = rzVar;
        ImageView imageView = new ImageView(context);
        this.f9392b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232218);
        addView(imageView, c8.ma.d(48, 48.0f, 19, 6.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        this.f9393c = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setText(gd.N0(2131750689, null));
        linearLayout.addView(textView, c8.ma.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setText(gd.N0(2131750682, null));
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 1, 0, 1, 0, 0));
        addView(linearLayout, c8.ma.d(-1, -2.0f, 17, 56.0f, 0.0f, 56.0f, 0.0f));
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c0.u(null, 2131750689, sb2, ", ");
        sb2.append(gd.N0(2131750682, null));
        setContentDescription(sb2.toString());
        setOnClickListener(new org.telegram.ui.Components.o0(this, 16));
        g();
    }

    public n4(x71 x71Var, Activity activity) {
        super(activity);
        this.f9394e = x71Var;
        this.f9393c = new Paint(1);
        this.f9392b = new Paint(1);
        this.d = new Paint(1);
    }

    public n4(f6 f6Var, Context context) {
        super(context);
        this.f9394e = f6Var;
        this.f9392b = new RectF();
        this.f9393c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public n4(ug.g0 g0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f9394e = g0Var;
        this.d = h6Var;
        this.f9392b = new ug.a1(org.telegram.ui.ActionBar.m6.Ck, org.telegram.ui.ActionBar.m6.Dk, -1, -1, h6Var);
        Paint paint = new Paint(1);
        this.f9393c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public n4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f9394e = photoViewer;
        this.f9393c = new Paint(3);
        this.f9392b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
