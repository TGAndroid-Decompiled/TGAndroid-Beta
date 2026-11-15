package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j71;
import org.telegram.ui.ky0;
import org.telegram.ui.s61;
import org.telegram.ui.t71;
import org.telegram.ui.xo0;
import org.telegram.ui.yo0;
import org.telegram.ui.z51;
public final class k4 extends FrameLayout {
    public static final int f8906f = 0;
    public final int f8907a = 4;
    public Object f8908b;
    public Object f8909c;
    public Object d;
    public Object f8910e;

    public k4(Context context) {
        super(context);
    }

    public float a() {
        c6 c6Var = (c6) this.f8910e;
        return (c6Var.X2.a(3) * c6Var.f8353z2.getMeasuredHeight()) + (c6Var.X2.a(2) * c6Var.f8351x2.getMeasuredHeight()) + (c6Var.X2.a(1) * c6Var.f8334o2.getMeasuredHeight()) + (c6Var.X2.a(0) * c6Var.f8312c2.getMeasuredHeight()) + c6Var.f8310b2.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i7;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f8908b;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        TextView textView = (TextView) this.f8909c;
        boolean z11 = hd.f24104a0;
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
        textView.setLayoutParams(c8.ja.d(-1, -2.0f, 55, f10, 14.0f, f11, 12.0f));
    }

    public void c(int i7, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f8909c).setImageDrawable(getContext().getDrawable(i7));
    }

    public void d() {
        ((fh0) this.f8910e).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f8908b).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f8909c).animate().alpha(0.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        Paint e10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        switch (this.f8907a) {
            case 0:
                c6 c6Var = (c6) this.f8910e;
                org.telegram.ui.Components.fa faVar = c6Var.f35932p1;
                FrameLayout frameLayout = c6Var.f8321h2;
                c6Var.W0(canvas, this);
                canvas.save();
                float f10 = f();
                float L = org.telegram.messenger.g0.L(12.0f);
                RectF rectF = (RectF) this.f8908b;
                rectF.set(c6Var.f29717u0, f10, getWidth() - c6Var.f29717u0, getHeight() + L);
                Paint paint = (Paint) this.f8909c;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, c6Var.J0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(c6Var.f29717u0, getHeight() - getPaddingBottom(), getWidth() - c6Var.f29717u0, getHeight(), paint);
                    paint.setAlpha(255);
                }
                g();
                canvas.restore();
                if (faVar != null && faVar.getVisibility() == 0 && faVar.getAlpha() > 0.0f) {
                    if (faVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(faVar.getX(), faVar.getY(), faVar.getMeasuredWidth() + faVar.getX(), faVar.getMeasuredHeight() + faVar.getY(), (int) (faVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(faVar.getX(), faVar.getY(), faVar.getX() + faVar.getMeasuredWidth(), faVar.getY() + faVar.getMeasuredHeight());
                    }
                    canvas.translate(faVar.getX(), faVar.getY());
                    faVar.draw(canvas);
                    canvas.restore();
                }
                c6Var.V0(canvas, this);
                return;
            case 5:
                LinearGradient linearGradient = (LinearGradient) this.f8908b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.f8909c;
                PhotoViewer photoViewer = (PhotoViewer) this.f8910e;
                if (!photoViewer.S4) {
                    if (photoViewer.f42839o0.getVisibility() == 0) {
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
            case 7:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.f8908b;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = org.telegram.messenger.g0.L(8.0f);
                Paint paint5 = (Paint) this.f8909c;
                paint5.setColor(0);
                float N = org.telegram.messenger.g0.N(1.0f);
                float N2 = org.telegram.messenger.g0.N(0.33f);
                t71 t71Var = (t71) this.f8910e;
                paint5.setShadowLayer(N, 0.0f, N2, i0.a.o(-16777216, (int) (t71Var.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, L2, L2, paint5);
                j71 j71Var = t71Var.f51478z0;
                s61 s61Var = t71Var.f51409a;
                org.telegram.ui.ActionBar.j6.t(this, j71Var, s61Var);
                Paint d = s61Var.d("paintChatActionBackground");
                int alpha = d.getAlpha();
                d.setAlpha((int) (t71Var.T1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, L2, L2, d);
                d.setAlpha(alpha);
                if (t71Var.O1) {
                    float f11 = t71Var.f51454p1;
                    if (f11 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f * t71Var.f51456q1)));
                        canvas.drawRoundRect(rectF2, L2, L2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (t71Var.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, L2, L2, paint4);
                super.dispatchDraw(canvas);
                return;
            case 9:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                Paint paint6 = (Paint) this.f8909c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f8910e;
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.f32633d0 && !limitPreviewView.S) {
                        paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28869e7, e6Var));
                    } else {
                        paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var));
                    }
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, e6Var));
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ug.s sVar = limitPreviewView.f32637f0;
                if (sVar != null) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f52343b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.Q) {
                    canvas.clipRect(limitPreviewView.f32644n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.S) {
                    e10 = limitPreviewView.L;
                } else if (limitPreviewView.f32637f0 != null) {
                    e10 = (Paint) this.f8908b;
                } else {
                    e10 = ia.f.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    ug.z0 z0Var = limitPreviewView.F;
                    if (z0Var != null) {
                        e10 = z0Var.f58392f;
                        z0Var.a();
                        Matrix matrix2 = z0Var.f58391e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f32631c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.G);
                        z0Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f12 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f12 += view.getY();
                        }
                        ia.f.d().f(LimitPreviewView.e(limitPreviewView) - getLeft(), -f12, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
                    }
                } else {
                    ia.f.d().f(LimitPreviewView.e(limitPreviewView) - getLeft(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
                }
                int alpha2 = e10.getAlpha();
                if (limitPreviewView.W && (valueAnimator2 = limitPreviewView.f32641j0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.V && (valueAnimator = limitPreviewView.f32641j0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.M && !limitPreviewView.N) {
                        org.telegram.messenger.g0.P.set(0.0f, 0.0f, limitPreviewView.f32644n, getMeasuredHeight());
                    } else {
                        org.telegram.messenger.g0.P.set(limitPreviewView.f32644n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), e10);
                e10.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.F == null && limitPreviewView.f32635e0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                Paint paint7 = (Paint) this.f8909c;
                paint7.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, (org.telegram.ui.ActionBar.e6) this.d));
                ug.f0 f0Var = (ug.f0) this.f8910e;
                canvas.drawLine(org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - org.telegram.messenger.g0.L(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(org.telegram.messenger.g0.L(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.g0.L(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = org.telegram.messenger.g0.P;
                int top = f0Var.d.getTop();
                rectF4.set(f0Var.d.getLeft() - org.telegram.messenger.g0.L(15.0f), ((f0Var.d.getBottom() + top) - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(15.0f) + f0Var.d.getRight(), (org.telegram.messenger.g0.L(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                ug.z0 z0Var2 = (ug.z0) this.f8908b;
                z0Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), z0Var2.f58392f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 11:
                Drawable drawable = (Drawable) this.f8909c;
                ug.x0 x0Var = (ug.x0) this.f8910e;
                x0Var.f29715s0.setBounds(0, i20.D(2.0f, x0Var.H1 + x0Var.f29716t0, 1), getMeasuredWidth(), getMeasuredHeight());
                x0Var.f29715s0.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.o7 o7Var = x0Var.I1;
                if (o7Var != null && o7Var.getVisibility() == 0 && x0Var.I1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, x0Var.I1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + x0Var.I1.getBottom());
                    drawable.setAlpha((int) (x0Var.I1.getAlpha() * 255.0f));
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
        switch (this.f8907a) {
            case 0:
                c6 c6Var = (c6) this.f8910e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < f() && c6Var.f29682b.isAttachedToWindow()) {
                    c6Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                ug.x0 x0Var = (ug.x0) this.f8910e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(2.0f) + (x0Var.H1 - x0Var.f29716t0)) {
                        x0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f8907a) {
            case 1:
                RectF rectF = (RectF) this.f8908b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ((org.telegram.ui.t5) this.f8910e).v0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f8907a) {
            case 0:
                c6 c6Var = (c6) this.f8910e;
                if (view == c6Var.f35932p1) {
                    return false;
                }
                if (view != c6Var.f8308a2) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 8:
                float[] fArr = (float[]) this.f8909c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f8908b;
                hi.c5 c5Var = (hi.c5) this.f8910e;
                tg.p0 p0Var = c5Var.f57573s0;
                if (view == c5Var.f57578x0) {
                    org.telegram.ui.Cells.q1 q10 = tg.u0.q(c5Var);
                    int i7 = 0;
                    if (q10 == null || (photoImage = q10.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.N0 / c5Var.f57580z0, photoImage.O0 / c5Var.A0);
                    matrix.postScale((c5Var.f57580z0 / c5Var.f57578x0.getWidth()) * max, (c5Var.A0 / c5Var.f57578x0.getHeight()) * max);
                    matrix.postTranslate((photoImage.r() + (q10.getX() + p0Var.getX())) - ((c5Var.f57580z0 * max) / 2.0f), (photoImage.s() + (q10.getY() + p0Var.getY())) - ((c5Var.A0 * max) / 2.0f));
                    c5Var.f57578x0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    org.telegram.messenger.g0.P.set(q10.getX() + p0Var.getX() + photoImage.L0, q10.getY() + p0Var.getY() + photoImage.M0, photoImage.y() + q10.getX() + p0Var.getX(), photoImage.A() + q10.getY() + p0Var.getY());
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
            case 11:
                Path path2 = (Path) this.d;
                if (view == ((ScrollView) this.f8908b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(getPaddingLeft(), org.telegram.messenger.g0.L(18.0f) + ((ug.x0) this.f8910e).H1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 12:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                bg.c0 c0Var = (bg.c0) this.f8909c;
                bg.c0 c0Var2 = (bg.c0) this.f8908b;
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                vh.h hVar = (vh.h) this.f8910e;
                int i11 = (int) hVar.T1.f57091f;
                if (view == hVar.d2 && i11 > 0) {
                    c0Var2.setBounds(0, org.telegram.messenger.g0.L(40.0f), getWidth(), org.telegram.messenger.g0.L(48.0f));
                    int i12 = org.telegram.ui.ActionBar.j6.f28922h5;
                    c0Var2.b(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
                    c0Var2.draw(canvas);
                    int L = org.telegram.messenger.g0.L(48.0f) + i11;
                    c0Var.setBounds(0, L - org.telegram.messenger.g0.L(8.0f), getWidth(), L);
                    c0Var.b(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
                    c0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e() {
        fh0 fh0Var = (fh0) this.f8910e;
        fh0Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f8908b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f8909c).animate().alpha(1.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(0.0f).setDuration(150L).start();
        fh0Var.d();
    }

    public float f() {
        b5 b5Var;
        float max = Math.max(0.0f, getHeight() - a());
        c6 c6Var = (c6) this.f8910e;
        uj0 uj0Var = c6Var.f35931o1;
        int childCount = uj0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = uj0Var.getChildAt(childCount);
            uj0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - c6Var.f8310b2.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a10 = (c6Var.X2.a(4) * c6Var.R()) + max;
        Float f10 = c6Var.W2;
        if (f10 != null && (b5Var = c6Var.X2) != null && b5Var.f8252a < 1.0f) {
            return org.telegram.messenger.g0.T1(f10.floatValue(), a10, c6Var.X2.f8252a);
        }
        return a10;
    }

    public void g() {
        float f10 = f();
        c6 c6Var = (c6) this.f8910e;
        h4 h4Var = c6Var.f8308a2;
        h4Var.setTranslationY(f10 - h4Var.getHeight());
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(f10 - h4Var.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f)));
        h4Var.setAlpha(c6Var.X2.a(0) * l10);
        h4Var.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        h4Var.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, l10));
        w5 w5Var = c6Var.f8310b2;
        w5Var.setTranslationY(f10);
        c6Var.f8312c2.setTranslationY(w5Var.getRealHeight() + f10);
        c6Var.f8334o2.setTranslationY(w5Var.getRealHeight() + f10);
        c6Var.f8351x2.setTranslationY(w5Var.getRealHeight() + f10);
        c6Var.f8353z2.setTranslationY(w5Var.getRealHeight() + f10);
        FrameLayout frameLayout = c6Var.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.f23606n);
        }
        org.telegram.messenger.g0.W3(c6Var.f8326k2, c6Var.f35931o1.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f8907a) {
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
        switch (this.f8907a) {
            case 3:
                RectF rectF = (RectF) this.f8908b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f8910e;
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
                Paint paint = (Paint) this.f8909c;
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
        switch (this.f8907a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                c6 c6Var = (c6) this.f8910e;
                i4 i4Var = c6Var.P2;
                if (i4Var != null) {
                    int finalHeight = c6Var.f8310b2.getFinalHeight();
                    int w12 = c6Var.w1();
                    if (c6Var.X2.d(1) && c6Var.f8325j2.getVisibility() == 0) {
                        i13 = c6Var.f8325j2.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    i4Var.H(finalHeight, w12 + i13);
                }
                c6Var.P1();
                return;
            case 5:
                super.onLayout(z10, i7, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.f8910e;
                if (photoViewer.I0.getVisibility() != 8) {
                    if (photoViewer.T0.getVisibility() == 0) {
                        i14 = org.telegram.messenger.g0.L(63.0f);
                    } else {
                        i14 = 0;
                    }
                    int measuredWidth = (((i11 - i7) - i14) - photoViewer.I0.getMeasuredWidth()) / 2;
                    z51 z51Var = photoViewer.I0;
                    z51Var.layout(measuredWidth, z51Var.getTop(), photoViewer.I0.getMeasuredWidth() + measuredWidth, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    return;
                }
                return;
            case 8:
                hi.c5 c5Var = (hi.c5) this.f8910e;
                tg.p0 p0Var = c5Var.f57573s0;
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
                TextureView textureView = c5Var.f57578x0;
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
        switch (this.f8907a) {
            case 0:
                c6 c6Var = (c6) this.f8910e;
                int R = c6Var.R();
                int i14 = 0;
                setPadding(0, 0, 0, R);
                c6Var.f8310b2.N.setPadding(0, 0, 0, R);
                int size = View.MeasureSpec.getSize(i10);
                c6Var.f35934r1 = size;
                int size2 = View.MeasureSpec.getSize(i7);
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt instanceof hi.l3) {
                        childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
                    } else if (childAt == c6Var.f35931o1) {
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
                i4 i4Var = c6Var.P2;
                if (i4Var != null) {
                    int finalHeight = c6Var.f8310b2.getFinalHeight();
                    int w12 = c6Var.w1();
                    if (c6Var.X2.d(1) && c6Var.f8325j2.getVisibility() == 0) {
                        i14 = c6Var.f8325j2.getMeasuredHeight();
                    }
                    i4Var.H(finalHeight, w12 + i14);
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f8910e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams();
                if (photoViewer.T0.getVisibility() == 0) {
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
                hi.c5 c5Var = (hi.c5) this.f8910e;
                tg.p0 p0Var = c5Var.f57573s0;
                p0Var.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = c5Var.f57578x0;
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
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f8910e;
                org.telegram.ui.Components.h6 h6Var = limitPreviewView.f32649w;
                TextView textView = limitPreviewView.f32650x;
                hi.q3 q3Var = limitPreviewView.f32639h0;
                hi.q3 q3Var2 = limitPreviewView.f32638g0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i7);
                    int size4 = View.MeasureSpec.getSize(i10);
                    q3Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    int measuredWidth3 = q3Var2.getMeasuredWidth();
                    int measuredWidth4 = limitPreviewView.O.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                    int i18 = 0;
                    boolean z11 = false;
                    if (textView.getVisibility() == 0) {
                        i13 = textView.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i13 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i13);
                    q3Var.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    if (limitPreviewView.Q) {
                        float f10 = limitPreviewView.f32627a;
                        float f11 = 0.0f;
                        if (f10 == 0.0f) {
                            limitPreviewView.f32644n = 0;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                if (!limitPreviewView.M && limitPreviewView.f32637f0 == null) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                LimitPreviewView.c(limitPreviewView, z10);
                                if (limitPreviewView.f32637f0 != null) {
                                    LimitPreviewView.d(limitPreviewView, true);
                                } else {
                                    LimitPreviewView.d(limitPreviewView, false);
                                }
                            }
                        } else if (f10 < 1.0f) {
                            if (limitPreviewView.M) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = q3Var2.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            }
                            if (!limitPreviewView.M) {
                                f11 = q3Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                            }
                            limitPreviewView.f32644n = (int) ((((size3 - measuredWidth) - f11) * limitPreviewView.f32627a) + measuredWidth);
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                LimitPreviewView.c(limitPreviewView, (limitPreviewView.M || limitPreviewView.f32637f0 != null) ? true : true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        } else {
                            limitPreviewView.f32644n = size3;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                LimitPreviewView.c(limitPreviewView, true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        }
                    } else {
                        int measuredWidth5 = q3Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.P.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                        if (h6Var.getVisibility() == 0) {
                            i18 = h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(24.0f);
                        }
                        int i19 = (int) Utilities.i(size3 * limitPreviewView.f32627a, size3 - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f32644n = i19;
                        q3Var2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        q3Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.f32644n, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    return;
                }
                super.onMeasure(i7, i10);
                return;
            case 11:
                ug.x0 x0Var = (ug.x0) this.f8910e;
                x0Var.G1 = 0;
                ScrollView scrollView = (ScrollView) this.f8908b;
                scrollView.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE));
                x0Var.G1 = (View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight()) + x0Var.f29716t0;
                super.onMeasure(i7, i10);
                x0Var.I0();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f8907a) {
            case 5:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f8910e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f10);
                }
                xo0 xo0Var = photoViewer.V1;
                if (xo0Var != null && xo0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.f42938y7[0] * f10);
                }
                yo0 yo0Var = photoViewer.W1;
                if (yo0Var != null && yo0Var.getVisibility() != 8) {
                    photoViewer.W1.setAlpha(f10 * photoViewer.f42947z7[0]);
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
        switch (this.f8907a) {
            case 0:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((c6) this.f8910e).F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.g0.f23606n);
                    return;
                }
                return;
            case 5:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f8910e;
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
            case 11:
                super.setTranslationY(f10);
                ((ug.x0) this.f8910e).g0(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        int i10;
        switch (this.f8907a) {
            case 5:
                super.setVisibility(i7);
                PhotoViewer photoViewer = (PhotoViewer) this.f8910e;
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

    public k4(Activity activity, org.telegram.ui.Components.voip.m1 m1Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.g1[5];
        setWillNotDraw(false);
        ai.k0 k0Var = new ai.k0(activity, m1Var);
        this.f8908b = k0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f8909c = frameLayout;
        k0Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i7 = 0; i7 < 5; i7++) {
            ((org.telegram.ui.Components.voip.g1[]) this.d)[i7] = new org.telegram.ui.Components.voip.g1(activity);
            ((org.telegram.ui.Components.voip.g1[]) this.d)[i7].setAllStarsProvider(new org.telegram.ui.ActionBar.z(this, 6));
            org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.g1[]) this.d)[i7];
            g1Var.d = new org.telegram.ui.Components.f1(26, this, activity);
            g1Var.f40624f = i7;
            ((FrameLayout) this.f8909c).addView(g1Var, c8.ja.d(-2, -2.0f, 51, i7 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((ai.k0) this.f8908b, c8.ja.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.f8909c, c8.ja.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    public k4(hi.c5 c5Var, Context context) {
        super(context);
        this.f8910e = c5Var;
        this.f8908b = new Matrix();
        this.f8909c = new float[8];
        this.d = new Path();
    }

    public k4(org.telegram.ui.i9 i9Var, Context context, pz pzVar) {
        super(context);
        addView(pzVar, c8.ja.c(-1.0f, -1));
        this.d = pzVar;
        ?? imageView = new ImageView(context);
        this.f8910e = imageView;
        imageView.f(2131624317, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, c8.ja.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.f8908b = textView;
        i20.q(textView, org.telegram.ui.ActionBar.j6.G6, null, null, 2131748699);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        addView(textView, c8.ja.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f8909c = textView2;
        String a02 = hd.a0(null, null, 2131748698, Integer.valueOf(i9Var.getMessagesController().Q6));
        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28832c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ja.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        pzVar.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new gi.a(4));
    }

    public k4(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f8910e = limitPreviewView;
        this.d = e6Var;
        this.f8909c = new Paint();
        Paint paint = new Paint();
        this.f8908b = paint;
        paint.setColor(-1);
    }

    public k4(Context context, org.telegram.ui.ActionBar.e6 e6Var, vh.h hVar) {
        super(context);
        this.f8910e = hVar;
        this.d = e6Var;
        this.f8908b = new bg.c0(2);
        this.f8909c = new bg.c0(8);
    }

    public k4(ug.x0 x0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f8910e = x0Var;
        this.f8908b = scrollView;
        this.f8909c = drawable;
        this.d = new Path();
    }

    public k4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f8909c = textView;
        i20.o(textView, 1, 20.0f);
        textView.setGravity(hd.f24104a0 ? 5 : 3);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f8908b = imageView;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.d = x1Var;
        imageView.setImageDrawable(x1Var);
        x1Var.a(-1);
        addView(imageView, c8.ja.d(24, 24.0f, (hd.f24104a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ky0(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.g0.L(56.0f));
    }

    public k4(org.telegram.ui.t5 t5Var, Context context) {
        super(context);
        this.f8910e = t5Var;
        this.f8908b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f8909c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, c8.ja.e(-2, -2, 1));
        addView(textView, c8.ja.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.g0.L(100.0f));
        int L = org.telegram.messenger.g0.L(10.0f);
        int o4 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4));
    }

    public k4(t71 t71Var, Activity activity) {
        super(activity);
        this.f8910e = t71Var;
        this.f8909c = new Paint(1);
        this.f8908b = new Paint(1);
        this.d = new Paint(1);
    }

    public k4(c6 c6Var, Context context) {
        super(context);
        this.f8910e = c6Var;
        this.f8908b = new RectF();
        this.f8909c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public k4(ug.f0 f0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f8910e = f0Var;
        this.d = e6Var;
        this.f8908b = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, e6Var);
        Paint paint = new Paint(1);
        this.f8909c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public k4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f8910e = photoViewer;
        this.f8909c = new Paint(3);
        this.f8908b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
