package bi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ap0;
import org.telegram.ui.c61;
import org.telegram.ui.k71;
import org.telegram.ui.my0;
import org.telegram.ui.u71;
import org.telegram.ui.v61;
import org.telegram.ui.zo0;
public final class m5 extends FrameLayout {
    public static final int f4324f = 0;
    public final int f4325a = 4;
    public Object f4326b;
    public Object f4327c;
    public Object d;
    public Object f4328e;

    public m5(Context context) {
        super(context);
    }

    public float a() {
        k7 k7Var = (k7) this.f4328e;
        return (k7Var.T2.a(3) * k7Var.f4201v2.getMeasuredHeight()) + (k7Var.T2.a(2) * k7Var.f4199t2.getMeasuredHeight()) + (k7Var.T2.a(1) * k7Var.f4182k2.getMeasuredHeight()) + (k7Var.T2.a(0) * k7Var.Y1.getMeasuredHeight()) + k7Var.X1.getRealHeight() + 0.0f;
    }

    public void b(boolean z9) {
        int i7;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f4326b;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        TextView textView = (TextView) this.f4327c;
        boolean z10 = org.telegram.messenger.hd.f22871a0;
        if (!z10 && z9) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z10 && z9) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(c8.ha.d(-1, -2.0f, 55, f10, 14.0f, f11, 12.0f));
    }

    public void c(int i7, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f4327c).setImageDrawable(getContext().getDrawable(i7));
    }

    public void d() {
        ((ch0) this.f4328e).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f4326b).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f4327c).animate().alpha(0.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        Paint e10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        switch (this.f4325a) {
            case 0:
                k7 k7Var = (k7) this.f4328e;
                org.telegram.ui.Components.ja jaVar = k7Var.l1;
                FrameLayout frameLayout = k7Var.d2;
                k7Var.W0(canvas, this);
                canvas.save();
                float f10 = f();
                float L = org.telegram.messenger.g0.L(12.0f);
                RectF rectF = (RectF) this.f4326b;
                rectF.set(k7Var.f28645t0, f10, getWidth() - k7Var.f28645t0, getHeight() + L);
                Paint paint = (Paint) this.f4327c;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, k7Var.I0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(k7Var.f28645t0, getHeight() - getPaddingBottom(), getWidth() - k7Var.f28645t0, getHeight(), paint);
                    paint.setAlpha(255);
                }
                g();
                canvas.restore();
                if (jaVar != null && jaVar.getVisibility() == 0 && jaVar.getAlpha() > 0.0f) {
                    if (jaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(jaVar.getX(), jaVar.getY(), jaVar.getMeasuredWidth() + jaVar.getX(), jaVar.getMeasuredHeight() + jaVar.getY(), (int) (jaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(jaVar.getX(), jaVar.getY(), jaVar.getX() + jaVar.getMeasuredWidth(), jaVar.getY() + jaVar.getMeasuredHeight());
                    }
                    canvas.translate(jaVar.getX(), jaVar.getY());
                    jaVar.draw(canvas);
                    canvas.restore();
                }
                k7Var.V0(canvas, this);
                return;
            case 5:
                LinearGradient linearGradient = (LinearGradient) this.f4326b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.f4327c;
                PhotoViewer photoViewer = (PhotoViewer) this.f4328e;
                if (!photoViewer.R4) {
                    if (photoViewer.f41459n0.getVisibility() == 0) {
                        i7 = getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f);
                    } else {
                        i7 = 0;
                    }
                    int i10 = photoViewer.f41365c2;
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
            case 7:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.f4326b;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = org.telegram.messenger.g0.L(8.0f);
                Paint paint5 = (Paint) this.f4327c;
                paint5.setColor(0);
                float N = org.telegram.messenger.g0.N(1.0f);
                float N2 = org.telegram.messenger.g0.N(0.33f);
                u71 u71Var = (u71) this.f4328e;
                paint5.setShadowLayer(N, 0.0f, N2, i0.a.o(-16777216, (int) (u71Var.S1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, L2, L2, paint5);
                k71 k71Var = u71Var.f50332y0;
                v61 v61Var = u71Var.f50266a;
                org.telegram.ui.ActionBar.k6.t(this, k71Var, v61Var);
                Paint d = v61Var.d("paintChatActionBackground");
                int alpha = d.getAlpha();
                d.setAlpha((int) (u71Var.S1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, L2, L2, d);
                d.setAlpha(alpha);
                if (u71Var.N1) {
                    float f11 = u71Var.f50308o1;
                    if (f11 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f * u71Var.f50310p1)));
                        canvas.drawRoundRect(rectF2, L2, L2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (u71Var.S1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, L2, L2, paint4);
                super.dispatchDraw(canvas);
                return;
            case 9:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                Paint paint6 = (Paint) this.f4327c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f4328e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f31449c0 && !limitPreviewView.R) {
                        paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27868e7, f6Var));
                    } else {
                        paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, f6Var));
                    }
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, f6Var));
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ug.s sVar = limitPreviewView.f31452e0;
                if (sVar != null) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f50871b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f31461n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e10 = limitPreviewView.K;
                } else if (limitPreviewView.f31452e0 != null) {
                    e10 = (Paint) this.f4326b;
                } else {
                    e10 = ia.e.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.D;
                if (viewGroup != null) {
                    ug.y0 y0Var = limitPreviewView.E;
                    if (y0Var != null) {
                        e10 = y0Var.f56777f;
                        y0Var.a();
                        Matrix matrix2 = y0Var.f56776e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f31448c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.F);
                        y0Var.d.setLocalMatrix(matrix2);
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
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f31457i0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f31457i0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        org.telegram.messenger.g0.P.set(0.0f, 0.0f, limitPreviewView.f31461n, getMeasuredHeight());
                    } else {
                        org.telegram.messenger.g0.P.set(limitPreviewView.f31461n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), e10);
                e10.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f31450d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                Paint paint7 = (Paint) this.f4327c;
                paint7.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, (org.telegram.ui.ActionBar.f6) this.d));
                ug.e0 e0Var = (ug.e0) this.f4328e;
                canvas.drawLine(org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, e0Var.d.getLeft() - org.telegram.messenger.g0.L(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(org.telegram.messenger.g0.L(20.0f) + e0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = org.telegram.messenger.g0.P;
                int top = e0Var.d.getTop();
                rectF4.set(e0Var.d.getLeft() - org.telegram.messenger.g0.L(15.0f), ((e0Var.d.getBottom() + top) - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(15.0f) + e0Var.d.getRight(), (org.telegram.messenger.g0.L(30.0f) + (e0Var.d.getBottom() + e0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                ug.y0 y0Var2 = (ug.y0) this.f4326b;
                y0Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), y0Var2.f56777f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 11:
                Drawable drawable = (Drawable) this.f4327c;
                ug.w0 w0Var = (ug.w0) this.f4328e;
                w0Var.f28642r0.setBounds(0, org.telegram.messenger.camera.q.D(2.0f, w0Var.D1 + w0Var.f28644s0, 1), getMeasuredWidth(), getMeasuredHeight());
                w0Var.f28642r0.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.r7 r7Var = w0Var.E1;
                if (r7Var != null && r7Var.getVisibility() == 0 && w0Var.E1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, w0Var.E1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + w0Var.E1.getBottom());
                    drawable.setAlpha((int) (w0Var.E1.getAlpha() * 255.0f));
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
        switch (this.f4325a) {
            case 0:
                k7 k7Var = (k7) this.f4328e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < f() && k7Var.f28615b.isAttachedToWindow()) {
                    k7Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                ug.w0 w0Var = (ug.w0) this.f4328e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(2.0f) + (w0Var.D1 - w0Var.f28644s0)) {
                        w0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f4325a) {
            case 1:
                RectF rectF = (RectF) this.f4326b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ((org.telegram.ui.t5) this.f4328e).v0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f4325a) {
            case 0:
                k7 k7Var = (k7) this.f4328e;
                if (view == k7Var.l1) {
                    return false;
                }
                if (view != k7Var.W1) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 8:
                float[] fArr = (float[]) this.f4327c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f4326b;
                fi.e5 e5Var = (fi.e5) this.f4328e;
                tg.p0 p0Var = e5Var.f55871r0;
                if (view == e5Var.f55876w0) {
                    org.telegram.ui.Cells.q1 q10 = tg.u0.q(e5Var);
                    int i7 = 0;
                    if (q10 == null || (photoImage = q10.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.M0 / e5Var.f55878y0, photoImage.N0 / e5Var.f55879z0);
                    matrix.postScale((e5Var.f55878y0 / e5Var.f55876w0.getWidth()) * max, (e5Var.f55879z0 / e5Var.f55876w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.r() + (q10.getX() + p0Var.getX())) - ((e5Var.f55878y0 * max) / 2.0f), (photoImage.s() + (q10.getY() + p0Var.getY())) - ((e5Var.f55879z0 * max) / 2.0f));
                    e5Var.f55876w0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    org.telegram.messenger.g0.P.set(q10.getX() + p0Var.getX() + photoImage.K0, q10.getY() + p0Var.getY() + photoImage.L0, photoImage.y() + q10.getX() + p0Var.getX(), photoImage.A() + q10.getY() + p0Var.getY());
                    while (true) {
                        int[] iArr = photoImage.W0;
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
            case 11:
                Path path2 = (Path) this.d;
                if (view == ((ScrollView) this.f4326b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(getPaddingLeft(), org.telegram.messenger.g0.L(18.0f) + ((ug.w0) this.f4328e).D1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 12:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                bg.c0 c0Var = (bg.c0) this.f4327c;
                bg.c0 c0Var2 = (bg.c0) this.f4326b;
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                vh.g gVar = (vh.g) this.f4328e;
                int i11 = (int) gVar.P1.f55401f;
                if (view == gVar.Z1 && i11 > 0) {
                    c0Var2.setBounds(0, org.telegram.messenger.g0.L(40.0f), getWidth(), org.telegram.messenger.g0.L(48.0f));
                    int i12 = org.telegram.ui.ActionBar.k6.f27921h5;
                    c0Var2.b(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
                    c0Var2.draw(canvas);
                    int L = org.telegram.messenger.g0.L(48.0f) + i11;
                    c0Var.setBounds(0, L - org.telegram.messenger.g0.L(8.0f), getWidth(), L);
                    c0Var.b(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
                    c0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e() {
        ch0 ch0Var = (ch0) this.f4328e;
        ch0Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f4326b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f4327c).animate().alpha(1.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(0.0f).setDuration(150L).start();
        ch0Var.d();
    }

    public float f() {
        g6 g6Var;
        float max = Math.max(0.0f, getHeight() - a());
        k7 k7Var = (k7) this.f4328e;
        pj0 pj0Var = k7Var.f36222k1;
        int childCount = pj0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = pj0Var.getChildAt(childCount);
            pj0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - k7Var.X1.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a10 = (k7Var.T2.a(4) * k7Var.Q()) + max;
        Float f10 = k7Var.S2;
        if (f10 != null && (g6Var = k7Var.T2) != null && g6Var.f3942a < 1.0f) {
            return org.telegram.messenger.g0.T1(f10.floatValue(), a10, k7Var.T2.f3942a);
        }
        return a10;
    }

    public void g() {
        float f10 = f();
        k7 k7Var = (k7) this.f4328e;
        j5 j5Var = k7Var.W1;
        j5Var.setTranslationY(f10 - j5Var.getHeight());
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(f10 - j5Var.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f)));
        j5Var.setAlpha(k7Var.T2.a(0) * l10);
        j5Var.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        j5Var.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        e7 e7Var = k7Var.X1;
        e7Var.setTranslationY(f10);
        k7Var.Y1.setTranslationY(e7Var.getRealHeight() + f10);
        k7Var.f4182k2.setTranslationY(e7Var.getRealHeight() + f10);
        k7Var.f4199t2.setTranslationY(e7Var.getRealHeight() + f10);
        k7Var.f4201v2.setTranslationY(e7Var.getRealHeight() + f10);
        FrameLayout frameLayout = k7Var.E;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.f22532n);
        }
        org.telegram.messenger.g0.X3(k7Var.f4175g2, k7Var.f36222k1.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f4325a) {
            case 2:
                return false;
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f4325a) {
            case 3:
                RectF rectF = (RectF) this.f4326b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f4328e;
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
                Paint paint = (Paint) this.f4327c;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int left;
        int boundsRight;
        switch (this.f4325a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                k7 k7Var = (k7) this.f4328e;
                k5 k5Var = k7Var.L2;
                if (k5Var != null) {
                    int finalHeight = k7Var.X1.getFinalHeight();
                    int w12 = k7Var.w1();
                    if (k7Var.T2.d(1) && k7Var.f4173f2.getVisibility() == 0) {
                        i13 = k7Var.f4173f2.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    k5Var.H(finalHeight, w12 + i13);
                }
                k7Var.P1();
                return;
            case 5:
                super.onLayout(z9, i7, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.f4328e;
                if (photoViewer.H0.getVisibility() != 8) {
                    if (photoViewer.S0.getVisibility() == 0) {
                        i14 = org.telegram.messenger.g0.L(63.0f);
                    } else {
                        i14 = 0;
                    }
                    int measuredWidth = (((i11 - i7) - i14) - photoViewer.H0.getMeasuredWidth()) / 2;
                    c61 c61Var = photoViewer.H0;
                    c61Var.layout(measuredWidth, c61Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 8:
                fi.e5 e5Var = (fi.e5) this.f4328e;
                tg.p0 p0Var = e5Var.f55871r0;
                int measuredWidth2 = p0Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < p0Var.getChildCount(); i16++) {
                    View childAt = p0Var.getChildAt(i16);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        left2 = childAt.getLeft() + q1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        left2 = childAt.getLeft() + t0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i15 = Math.max(right, i15);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i15 = Math.max(right, i15);
                }
                p0Var.layout(-measuredWidth2, 0, p0Var.getMeasuredWidth() - measuredWidth2, p0Var.getMeasuredHeight());
                TextureView textureView = e5Var.f55876w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), p0Var.getMeasuredHeight());
                    return;
                }
                return;
            case 9:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int i17 = i12 - i10;
                    childAt2.layout(0, 0, measuredWidth3, i17);
                    childAt3.layout(measuredWidth3, 0, i11 - i7, i17);
                    return;
                }
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
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
        boolean z9;
        switch (this.f4325a) {
            case 0:
                k7 k7Var = (k7) this.f4328e;
                int Q = k7Var.Q();
                int i14 = 0;
                setPadding(0, 0, 0, Q);
                k7Var.X1.M.setPadding(0, 0, 0, Q);
                int size = View.MeasureSpec.getSize(i10);
                k7Var.n1 = size;
                int size2 = View.MeasureSpec.getSize(i7);
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt instanceof fi.m3) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
                    } else if (childAt == k7Var.f36222k1) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(size - Q, 1073741824));
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
                k5 k5Var = k7Var.L2;
                if (k5Var != null) {
                    int finalHeight = k7Var.X1.getFinalHeight();
                    int w12 = k7Var.w1();
                    if (k7Var.T2.d(1) && k7Var.f4173f2.getVisibility() == 0) {
                        i14 = k7Var.f4173f2.getMeasuredHeight();
                    }
                    k5Var.H(finalHeight, w12 + i14);
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f4328e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.H0.getLayoutParams();
                if (photoViewer.S0.getVisibility() == 0) {
                    i12 = org.telegram.messenger.g0.L(63.0f);
                } else {
                    i12 = 0;
                }
                layoutParams.rightMargin = i12;
                super.onMeasure(i7, i10);
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 8:
                fi.e5 e5Var = (fi.e5) this.f4328e;
                tg.p0 p0Var = e5Var.f55871r0;
                p0Var.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = e5Var.f55876w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(p0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(p0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = p0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < p0Var.getChildCount(); i17++) {
                    View childAt2 = p0Var.getChildAt(i17);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                        left2 = childAt2.getLeft() + q1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt2;
                        left2 = childAt2.getLeft() + t0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = t0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i16 = Math.max(right, i16);
                }
                setMeasuredDimension(i16 - measuredWidth2, p0Var.getMeasuredHeight());
                return;
            case 9:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f4328e;
                org.telegram.ui.Components.j6 j6Var = limitPreviewView.f31465w;
                TextView textView = limitPreviewView.f31466x;
                fi.r3 r3Var = limitPreviewView.f31455g0;
                fi.r3 r3Var2 = limitPreviewView.f31454f0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i7);
                    int size4 = View.MeasureSpec.getSize(i10);
                    r3Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    int measuredWidth3 = r3Var2.getMeasuredWidth();
                    int measuredWidth4 = limitPreviewView.N.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                    int i18 = 0;
                    boolean z10 = false;
                    if (textView.getVisibility() == 0) {
                        i13 = textView.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i13 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i13);
                    r3Var.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    if (limitPreviewView.P) {
                        float f10 = limitPreviewView.f31444a;
                        float f11 = 0.0f;
                        if (f10 == 0.0f) {
                            limitPreviewView.f31461n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (!limitPreviewView.L && limitPreviewView.f31452e0 == null) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                LimitPreviewView.c(limitPreviewView, z9);
                                if (limitPreviewView.f31452e0 != null) {
                                    LimitPreviewView.d(limitPreviewView, true);
                                } else {
                                    LimitPreviewView.d(limitPreviewView, false);
                                }
                            }
                        } else if (f10 < 1.0f) {
                            if (limitPreviewView.L) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = r3Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            }
                            if (!limitPreviewView.L) {
                                f11 = r3Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            }
                            limitPreviewView.f31461n = (int) ((((size3 - measuredWidth) - f11) * limitPreviewView.f31444a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                LimitPreviewView.c(limitPreviewView, (limitPreviewView.L || limitPreviewView.f31452e0 != null) ? true : true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        } else {
                            limitPreviewView.f31461n = size3;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                LimitPreviewView.c(limitPreviewView, true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        }
                    } else {
                        int measuredWidth5 = r3Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                        if (j6Var.getVisibility() == 0) {
                            i18 = j6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                        }
                        int i19 = (int) Utilities.i(size3 * limitPreviewView.f31444a, size3 - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f31461n = i19;
                        r3Var2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        r3Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.f31461n, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    return;
                }
                super.onMeasure(i7, i10);
                return;
            case 11:
                ug.w0 w0Var = (ug.w0) this.f4328e;
                w0Var.C1 = 0;
                ScrollView scrollView = (ScrollView) this.f4326b;
                scrollView.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE));
                w0Var.C1 = (View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight()) + w0Var.f28644s0;
                super.onMeasure(i7, i10);
                w0Var.I0();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f4325a) {
            case 5:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f4328e;
                FrameLayout frameLayout = photoViewer.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.Q7.setAlpha(f10);
                }
                zo0 zo0Var = photoViewer.U1;
                if (zo0Var != null && zo0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f41556x7[0] * f10);
                }
                ap0 ap0Var = photoViewer.V1;
                if (ap0Var != null && ap0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f10 * photoViewer.f41566y7[0]);
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
        switch (this.f4325a) {
            case 0:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((k7) this.f4328e).E;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.f22532n);
                    return;
                }
                return;
            case 5:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f4328e;
                FrameLayout frameLayout2 = photoViewer.Q7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.Q7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * jg.g.e(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.k0 k0Var = photoViewer.X1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.S7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.S7.setTranslationY(f10);
                    return;
                }
                return;
            case 11:
                super.setTranslationY(f10);
                ((ug.w0) this.f4328e).g0(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        int i10;
        switch (this.f4325a) {
            case 5:
                super.setVisibility(i7);
                PhotoViewer photoViewer = (PhotoViewer) this.f4328e;
                FrameLayout frameLayout = photoViewer.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.Q7;
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

    public m5(Activity activity, org.telegram.ui.Components.voip.i1 i1Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.c1[5];
        setWillNotDraw(false);
        x5 x5Var = new x5(activity, i1Var);
        this.f4326b = x5Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f4327c = frameLayout;
        x5Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i7 = 0; i7 < 5; i7++) {
            ((org.telegram.ui.Components.voip.c1[]) this.d)[i7] = new org.telegram.ui.Components.voip.c1(activity);
            ((org.telegram.ui.Components.voip.c1[]) this.d)[i7].setAllStarsProvider(new org.telegram.ui.ActionBar.m3(this, 2));
            org.telegram.ui.Components.voip.c1 c1Var = ((org.telegram.ui.Components.voip.c1[]) this.d)[i7];
            c1Var.d = new org.telegram.ui.Components.f2(22, this, activity);
            c1Var.f39072f = i7;
            ((FrameLayout) this.f4327c).addView(c1Var, c8.ha.d(-2, -2.0f, 51, i7 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((x5) this.f4326b, c8.ha.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.f4327c, c8.ha.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    public m5(fi.e5 e5Var, Context context) {
        super(context);
        this.f4328e = e5Var;
        this.f4326b = new Matrix();
        this.f4327c = new float[8];
        this.d = new Path();
    }

    public m5(org.telegram.ui.i9 i9Var, Context context, lz lzVar) {
        super(context);
        addView(lzVar, c8.ha.c(-1.0f, -1));
        this.d = lzVar;
        ?? imageView = new ImageView(context);
        this.f4328e = imageView;
        imageView.f(2131624316, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, c8.ha.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.f4326b = textView;
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, null, null, 2131748698);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        addView(textView, c8.ha.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f4327c = textView2;
        String a02 = org.telegram.messenger.hd.a0(null, null, 2131748697, Integer.valueOf(i9Var.getMessagesController().P6));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27831c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ha.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        lzVar.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new ei.b(4));
    }

    public m5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4328e = limitPreviewView;
        this.d = f6Var;
        this.f4327c = new Paint();
        Paint paint = new Paint();
        this.f4326b = paint;
        paint.setColor(-1);
    }

    public m5(Context context, org.telegram.ui.ActionBar.f6 f6Var, vh.g gVar) {
        super(context);
        this.f4328e = gVar;
        this.d = f6Var;
        this.f4326b = new bg.c0(2);
        this.f4327c = new bg.c0(8);
    }

    public m5(ug.w0 w0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f4328e = w0Var;
        this.f4326b = scrollView;
        this.f4327c = drawable;
        this.d = new Path();
    }

    public m5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f4327c = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        textView.setGravity(org.telegram.messenger.hd.f22871a0 ? 5 : 3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f4326b = imageView;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.d = y1Var;
        imageView.setImageDrawable(y1Var);
        y1Var.a(-1);
        addView(imageView, c8.ha.d(24, 24.0f, (org.telegram.messenger.hd.f22871a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new my0(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.g0.L(56.0f));
    }

    public m5(org.telegram.ui.t5 t5Var, Context context) {
        super(context);
        this.f4328e = t5Var;
        this.f4326b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f4327c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, c8.ha.e(-2, -2, 1));
        addView(textView, c8.ha.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.g0.L(100.0f));
        int L = org.telegram.messenger.g0.L(10.0f);
        int o4 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o4, o4));
    }

    public m5(u71 u71Var, Activity activity) {
        super(activity);
        this.f4328e = u71Var;
        this.f4327c = new Paint(1);
        this.f4326b = new Paint(1);
        this.d = new Paint(1);
    }

    public m5(k7 k7Var, Context context) {
        super(context);
        this.f4328e = k7Var;
        this.f4326b = new RectF();
        this.f4327c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public m5(ug.e0 e0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4328e = e0Var;
        this.d = f6Var;
        this.f4326b = new ug.y0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, f6Var);
        Paint paint = new Paint(1);
        this.f4327c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public m5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f4328e = photoViewer;
        this.f4327c = new Paint(3);
        this.f4326b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
