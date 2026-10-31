package jg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a01;
import org.telegram.ui.c91;
import org.telegram.ui.j9;
import org.telegram.ui.jq0;
import org.telegram.ui.kq0;
import org.telegram.ui.m91;
import org.telegram.ui.n81;
import org.telegram.ui.t5;
import org.telegram.ui.u71;
import rh.e4;
import rh.y3;
import vh.s3;
import w7.b6;
public final class b1 extends FrameLayout {
    public static final int f9893f = 0;
    public final int f9894a = 8;
    public Object f9895b;
    public Object f9896c;
    public Object d;
    public Object e;

    public b1(Context context) {
        super(context);
    }

    public float a() {
        e4 e4Var = (e4) this.e;
        return (e4Var.T2.a(3) * e4Var.f46836v2.getMeasuredHeight()) + (e4Var.T2.a(2) * e4Var.f46834t2.getMeasuredHeight()) + (e4Var.T2.a(1) * e4Var.f46817k2.getMeasuredHeight()) + (e4Var.T2.a(0) * e4Var.Y1.getMeasuredHeight()) + e4Var.X1.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f9895b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.f9896c;
        boolean z11 = cd.X;
        if (!z11 && z10) {
            f7 = 53.0f;
        } else {
            f7 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        textView.setLayoutParams(b6.d(-1, -2.0f, 55, f7, 14.0f, f10, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.f9896c).setText(str);
        ((ImageView) this.f9895b).setImageDrawable(getContext().getDrawable(i10));
    }

    public void d() {
        ((ei0) this.e).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f9895b).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.f9896c).animate().alpha(0.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint e;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int i10;
        switch (this.f9894a) {
            case 1:
                p6 p6Var = (p6) this.d;
                Paint paint = (Paint) this.f9895b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f24102c0 && !limitPreviewView.R) {
                        paint.setColor(t6.w0(t6.e7, p6Var));
                    } else {
                        paint.setColor(t6.w0(t6.f21020i6, p6Var));
                    }
                } else {
                    paint.setColor(t6.w0(t6.f20872a7, p6Var));
                }
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                kg.w wVar = limitPreviewView.f24104e0;
                if (wVar != null) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), ((t5) ((org.telegram.ui.y0) wVar).f43674b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f24113n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e = limitPreviewView.K;
                } else if (limitPreviewView.f24104e0 != null) {
                    e = (Paint) this.f9896c;
                } else {
                    e = ea.f.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.D;
                if (viewGroup != null) {
                    kg.k1 k1Var = limitPreviewView.E;
                    if (k1Var != null) {
                        e = k1Var.f11142f;
                        k1Var.a();
                        Matrix matrix = k1Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, limitPreviewView.f24101c / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, -limitPreviewView.F);
                        k1Var.d.setLocalMatrix(matrix);
                    } else {
                        float f7 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f7 += view.getY();
                        }
                        ea.f.d().f(LimitPreviewView.e(limitPreviewView) - getLeft(), -f7, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
                    }
                } else {
                    ea.f.d().f(LimitPreviewView.e(limitPreviewView) - getLeft(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
                }
                int alpha = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f24109i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f24109i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        org.telegram.messenger.i0.P.set(0.0f, 0.0f, limitPreviewView.f24113n, getMeasuredHeight());
                    } else {
                        org.telegram.messenger.i0.P.set(limitPreviewView.f24113n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(org.telegram.messenger.i0.P, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), e);
                e.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f24103d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f9896c;
                paint2.setColor(t6.w0(t6.wj, (p6) this.d));
                kg.m0 m0Var = (kg.m0) this.e;
                canvas.drawLine(org.telegram.messenger.i0.L(18.0f), getHeight() / 2.0f, m0Var.d.getLeft() - org.telegram.messenger.i0.L(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(org.telegram.messenger.i0.L(20.0f) + m0Var.d.getRight(), getHeight() / 2.0f, getWidth() - org.telegram.messenger.i0.L(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = org.telegram.messenger.i0.P;
                int top = m0Var.d.getTop();
                rectF2.set(m0Var.d.getLeft() - org.telegram.messenger.i0.L(15.0f), ((m0Var.d.getBottom() + top) - org.telegram.messenger.i0.L(30.0f)) / 2.0f, org.telegram.messenger.i0.L(15.0f) + m0Var.d.getRight(), (org.telegram.messenger.i0.L(30.0f) + (m0Var.d.getBottom() + m0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                kg.k1 k1Var2 = (kg.k1) this.f9895b;
                k1Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), k1Var2.f11142f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 3:
                Drawable drawable = (Drawable) this.f9896c;
                kg.i1 i1Var = (kg.i1) this.e;
                i1Var.f21612r0.setBounds(0, z20.D(2.0f, i1Var.D1 + i1Var.f21614s0, 1), getMeasuredWidth(), getMeasuredHeight());
                i1Var.f21612r0.draw(canvas);
                super.dispatchDraw(canvas);
                kg.g1 g1Var = i1Var.E1;
                if (g1Var != null && g1Var.getVisibility() == 0 && i1Var.E1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, i1Var.E1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + i1Var.E1.getBottom());
                    drawable.setAlpha((int) (i1Var.E1.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    return;
                }
                return;
            case 9:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix2 = (Matrix) this.f9895b;
                Paint paint3 = (Paint) this.f9896c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    if (photoViewer.f33548n0.getVisibility() == 0) {
                        i10 = getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f);
                    } else {
                        i10 = 0;
                    }
                    int i11 = photoViewer.f33454c2;
                    if (i11 != 0 && i11 != 2 && i11 != -1) {
                        paint3.setShader(null);
                        paint3.setColor(2130706432);
                    } else {
                        matrix2.reset();
                        matrix2.postTranslate(0.0f, i10);
                        matrix2.postScale(1.0f, Math.min(org.telegram.messenger.i0.L(40.0f), getMeasuredHeight() - i10) / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint3.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i10, getMeasuredWidth(), getMeasuredHeight(), paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                Paint paint4 = (Paint) this.d;
                Paint paint5 = (Paint) this.f9896c;
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L = org.telegram.messenger.i0.L(8.0f);
                Paint paint6 = (Paint) this.f9895b;
                paint6.setColor(0);
                float N = org.telegram.messenger.i0.N(1.0f);
                float N2 = org.telegram.messenger.i0.N(0.33f);
                m91 m91Var = (m91) this.e;
                paint6.setShadowLayer(N, 0.0f, N2, i0.b.o(-16777216, (int) (m91Var.S1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF3, L, L, paint6);
                c91 c91Var = m91Var.f39603y0;
                n81 n81Var = m91Var.f39537a;
                t6.t(this, c91Var, n81Var);
                Paint d = n81Var.d("paintChatActionBackground");
                int alpha2 = d.getAlpha();
                d.setAlpha((int) (m91Var.S1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF3, L, L, d);
                d.setAlpha(alpha2);
                if (m91Var.N1) {
                    float f10 = m91Var.f39579o1;
                    if (f10 > 0.0f) {
                        paint4.setColor(i0.b.o(-16777216, (int) (f10 * 255.0f * m91Var.f39581p1)));
                        canvas.drawRoundRect(rectF3, L, L, paint4);
                    }
                }
                paint5.setColor(520093695);
                paint5.setAlpha((int) (m91Var.S1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF3, L, L, paint5);
                super.dispatchDraw(canvas);
                return;
            case 12:
                e4 e4Var = (e4) this.e;
                da daVar = e4Var.l1;
                FrameLayout frameLayout = e4Var.f46803d2;
                e4Var.W0(canvas, this);
                canvas.save();
                float f11 = f();
                float L2 = org.telegram.messenger.i0.L(12.0f);
                RectF rectF4 = (RectF) this.f9895b;
                rectF4.set(e4Var.f21615t0, f11, getWidth() - e4Var.f21615t0, getHeight() + L2);
                Paint paint7 = (Paint) this.f9896c;
                paint7.setColor(t6.w0(t6.f21001h5, e4Var.I0));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF4, L2, L2, Path.Direction.CW);
                canvas.drawPath(path, paint7);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint7.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(e4Var.f21615t0, getHeight() - getPaddingBottom(), getWidth() - e4Var.f21615t0, getHeight(), paint7);
                    paint7.setAlpha(255);
                }
                g();
                canvas.restore();
                if (daVar != null && daVar.getVisibility() == 0 && daVar.getAlpha() > 0.0f) {
                    if (daVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(daVar.getX(), daVar.getY(), daVar.getMeasuredWidth() + daVar.getX(), daVar.getMeasuredHeight() + daVar.getY(), (int) (daVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(daVar.getX(), daVar.getY(), daVar.getX() + daVar.getMeasuredWidth(), daVar.getY() + daVar.getMeasuredHeight());
                    }
                    canvas.translate(daVar.getX(), daVar.getY());
                    daVar.draw(canvas);
                    canvas.restore();
                }
                e4Var.V0(canvas, this);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9894a) {
            case 3:
                kg.i1 i1Var = (kg.i1) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < org.telegram.messenger.i0.L(2.0f) + (i1Var.D1 - i1Var.f21614s0)) {
                        i1Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                e4 e4Var = (e4) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < f() && e4Var.f21586b.isAttachedToWindow()) {
                    e4Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f9894a) {
            case 5:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), ((t5) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ImageReceiver photoImage;
        switch (this.f9894a) {
            case 0:
                float[] fArr = (float[]) this.f9896c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f9895b;
                s3 s3Var = (s3) this.e;
                c1 c1Var = s3Var.f10056r0;
                if (view == s3Var.f10061w0) {
                    org.telegram.ui.Cells.q1 q6 = j1.q(s3Var);
                    int i10 = 0;
                    if (q6 == null || (photoImage = q6.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.M0 / s3Var.f10063y0, photoImage.N0 / s3Var.f10064z0);
                    matrix.postScale((s3Var.f10063y0 / s3Var.f10061w0.getWidth()) * max, (s3Var.f10064z0 / s3Var.f10061w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.r() + (q6.getX() + c1Var.getX())) - ((s3Var.f10063y0 * max) / 2.0f), (photoImage.s() + (q6.getY() + c1Var.getY())) - ((s3Var.f10064z0 * max) / 2.0f));
                    s3Var.f10061w0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    org.telegram.messenger.i0.P.set(q6.getX() + c1Var.getX() + photoImage.K0, q6.getY() + c1Var.getY() + photoImage.L0, photoImage.y() + q6.getX() + c1Var.getX(), photoImage.A() + q6.getY() + c1Var.getY());
                    while (true) {
                        int[] iArr = photoImage.W0;
                        if (i10 < iArr.length) {
                            int i11 = i10 * 2;
                            float f7 = iArr[i10];
                            fArr[i11] = f7;
                            fArr[i11 + 1] = f7;
                            i10++;
                        } else {
                            path.addRoundRect(org.telegram.messenger.i0.P, fArr, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild;
                        }
                    }
                } else {
                    return super.drawChild(canvas, view, j10);
                }
                break;
            case 3:
                Path path2 = (Path) this.d;
                if (view == ((ScrollView) this.f9895b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(getPaddingLeft(), org.telegram.messenger.i0.L(18.0f) + ((kg.i1) this.e).D1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                p6 p6Var = (p6) this.d;
                rf.w wVar = (rf.w) this.f9896c;
                rf.w wVar2 = (rf.w) this.f9895b;
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                lh.g gVar = (lh.g) this.e;
                int i12 = (int) gVar.P1.f7031f;
                if (view == gVar.Z1 && i12 > 0) {
                    wVar2.setBounds(0, org.telegram.messenger.i0.L(40.0f), getWidth(), org.telegram.messenger.i0.L(48.0f));
                    int i13 = t6.f21001h5;
                    wVar2.b(t6.w0(i13, p6Var));
                    wVar2.draw(canvas);
                    int L = org.telegram.messenger.i0.L(48.0f) + i12;
                    wVar.setBounds(0, L - org.telegram.messenger.i0.L(8.0f), getWidth(), L);
                    wVar.b(t6.w0(i13, p6Var));
                    wVar.draw(canvas);
                }
                return drawChild2;
            case 12:
                e4 e4Var = (e4) this.e;
                if (view == e4Var.l1) {
                    return false;
                }
                if (view != e4Var.W1) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild3 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild3;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        ei0 ei0Var = (ei0) this.e;
        ei0Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f9895b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.f9896c).animate().alpha(1.0f).setDuration(150L).start();
        ((View) this.d).animate().alpha(0.0f).setDuration(150L).start();
        ei0Var.d();
    }

    public float f() {
        f4.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        e4 e4Var = (e4) this.e;
        tk0 tk0Var = e4Var.f26666k1;
        int childCount = tk0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = tk0Var.getChildAt(childCount);
            tk0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - e4Var.X1.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (e4Var.T2.a(4) * e4Var.R()) + max;
        Float f7 = e4Var.S2;
        if (f7 != null && (dVar = e4Var.T2) != null && dVar.f6825c < 1.0f) {
            return org.telegram.messenger.i0.T1(f7.floatValue(), a2, e4Var.T2.f6825c);
        }
        return a2;
    }

    public void g() {
        float f7 = f();
        e4 e4Var = (e4) this.e;
        rh.n2 n2Var = e4Var.W1;
        n2Var.setTranslationY(f7 - n2Var.getHeight());
        float l4 = Utilities.l(org.telegram.messenger.i0.z1(f7 - n2Var.getHeight(), 0.0f, org.telegram.messenger.i0.L(32.0f)));
        n2Var.setAlpha(e4Var.T2.a(0) * l4);
        n2Var.setScaleX(org.telegram.messenger.i0.T1(0.5f, 1.0f, l4));
        n2Var.setScaleY(org.telegram.messenger.i0.T1(0.5f, 1.0f, l4));
        y3 y3Var = e4Var.X1;
        y3Var.setTranslationY(f7);
        e4Var.Y1.setTranslationY(y3Var.getRealHeight() + f7);
        e4Var.f46817k2.setTranslationY(y3Var.getRealHeight() + f7);
        e4Var.f46834t2.setTranslationY(y3Var.getRealHeight() + f7);
        e4Var.f46836v2.setTranslationY(y3Var.getRealHeight() + f7);
        FrameLayout frameLayout = e4Var.E;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.i0.f16021n);
        }
        org.telegram.messenger.i0.W3(e4Var.f46809g2, e4Var.f26666k1.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f9894a) {
            case 3:
                return false;
            case 6:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f9894a) {
            case 7:
                RectF rectF = (RectF) this.f9895b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f9896c;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float L = org.telegram.messenger.i0.L(4.0f);
                fArr[7] = L;
                fArr[6] = L;
                fArr[5] = L;
                fArr[4] = L;
                Path path = (Path) this.d;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.e;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int left;
        int boundsRight;
        int i14;
        int i15;
        switch (this.f9894a) {
            case 0:
                s3 s3Var = (s3) this.e;
                c1 c1Var = s3Var.f10056r0;
                int measuredWidth = c1Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < c1Var.getChildCount(); i17++) {
                    View childAt = c1Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        left2 = childAt.getLeft() + q1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                        left2 = childAt.getLeft() + s0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i16 = Math.max(right, i16);
                }
                c1Var.layout(-measuredWidth, 0, c1Var.getMeasuredWidth() - measuredWidth, c1Var.getMeasuredHeight());
                TextureView textureView = s3Var.f10061w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), c1Var.getMeasuredHeight());
                    return;
                }
                return;
            case 1:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int i18 = i13 - i11;
                    childAt2.layout(0, 0, measuredWidth2, i18);
                    childAt3.layout(measuredWidth2, 0, i12 - i10, i18);
                    return;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    if (photoViewer.S0.getVisibility() == 0) {
                        i14 = org.telegram.messenger.i0.L(63.0f);
                    } else {
                        i14 = 0;
                    }
                    int measuredWidth3 = (((i12 - i10) - i14) - photoViewer.H0.getMeasuredWidth()) / 2;
                    u71 u71Var = photoViewer.H0;
                    u71Var.layout(measuredWidth3, u71Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth3, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                e4 e4Var = (e4) this.e;
                kg.f fVar = e4Var.L2;
                if (fVar != null) {
                    int finalHeight = e4Var.X1.getFinalHeight();
                    int w12 = e4Var.w1();
                    if (e4Var.T2.d(1) && e4Var.f46807f2.getVisibility() == 0) {
                        i15 = e4Var.f46807f2.getMeasuredHeight();
                    } else {
                        i15 = 0;
                    }
                    fVar.H(finalHeight, w12 + i15);
                }
                e4Var.P1();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int left;
        int boundsRight;
        int i12;
        float measuredWidth;
        boolean z10;
        int i13;
        int i14;
        switch (this.f9894a) {
            case 0:
                s3 s3Var = (s3) this.e;
                c1 c1Var = s3Var.f10056r0;
                c1Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = s3Var.f10061w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(c1Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c1Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = c1Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < c1Var.getChildCount(); i16++) {
                    View childAt = c1Var.getChildAt(i16);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        left2 = childAt.getLeft() + q1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = q1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                        left2 = childAt.getLeft() + s0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i15 = Math.max(right, i15);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i15 = Math.max(right, i15);
                }
                setMeasuredDimension(i15 - measuredWidth2, c1Var.getMeasuredHeight());
                return;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                f6 f6Var = limitPreviewView.f24117w;
                TextView textView = limitPreviewView.f24118x;
                kg.x xVar = limitPreviewView.f24107g0;
                kg.x xVar2 = limitPreviewView.f24106f0;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    xVar2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth3 = xVar2.getMeasuredWidth();
                    int measuredWidth4 = limitPreviewView.N.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f);
                    int i17 = 0;
                    boolean z11 = false;
                    if (textView.getVisibility() == 0) {
                        i12 = textView.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f);
                    } else {
                        i12 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i12);
                    xVar.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.f24097a;
                        float f10 = 0.0f;
                        if (f7 == 0.0f) {
                            limitPreviewView.f24113n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (!limitPreviewView.L && limitPreviewView.f24104e0 == null) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                LimitPreviewView.c(limitPreviewView, z10);
                                if (limitPreviewView.f24104e0 != null) {
                                    LimitPreviewView.d(limitPreviewView, true);
                                } else {
                                    LimitPreviewView.d(limitPreviewView, false);
                                }
                            }
                        } else if (f7 < 1.0f) {
                            if (limitPreviewView.L) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = xVar2.getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f);
                            }
                            if (!limitPreviewView.L) {
                                f10 = xVar.getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f);
                            }
                            limitPreviewView.f24113n = (int) ((((size - measuredWidth) - f10) * limitPreviewView.f24097a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                LimitPreviewView.c(limitPreviewView, (limitPreviewView.L || limitPreviewView.f24104e0 != null) ? true : true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        } else {
                            limitPreviewView.f24113n = size;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                LimitPreviewView.c(limitPreviewView, true);
                                LimitPreviewView.d(limitPreviewView, true);
                            }
                        }
                    } else {
                        int measuredWidth5 = xVar.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f);
                        if (f6Var.getVisibility() == 0) {
                            i17 = f6Var.getMeasuredWidth() + org.telegram.messenger.i0.L(24.0f);
                        }
                        int i18 = (int) Utilities.i(size * limitPreviewView.f24097a, size - Math.max(measuredWidth5, measuredWidth6 + i17), max);
                        limitPreviewView.f24113n = i18;
                        xVar2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        xVar.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.f24113n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 3:
                kg.i1 i1Var = (kg.i1) this.e;
                i1Var.C1 = 0;
                ScrollView scrollView = (ScrollView) this.f9895b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                i1Var.C1 = (View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight()) + i1Var.f21614s0;
                super.onMeasure(i10, i11);
                i1Var.I0();
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.H0.getLayoutParams();
                if (photoViewer.S0.getVisibility() == 0) {
                    i13 = org.telegram.messenger.i0.L(63.0f);
                } else {
                    i13 = 0;
                }
                layoutParams.rightMargin = i13;
                super.onMeasure(i10, i11);
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 12:
                e4 e4Var = (e4) this.e;
                int R = e4Var.R();
                int i19 = 0;
                setPadding(0, 0, 0, R);
                e4Var.X1.M.setPadding(0, 0, 0, R);
                int size3 = View.MeasureSpec.getSize(i11);
                e4Var.f26668n1 = size3;
                int size4 = View.MeasureSpec.getSize(i10);
                for (int i20 = 0; i20 < getChildCount(); i20++) {
                    View childAt2 = getChildAt(i20);
                    if (childAt2 instanceof vh.p2) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), 1073741824));
                    } else if (childAt2 == e4Var.f26666k1) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size3 - R, 1073741824));
                    } else {
                        if (childAt2.getLayoutParams() != null && childAt2.getLayoutParams().height == -1) {
                            i14 = size3;
                        } else {
                            i14 = 9999;
                        }
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size4, size3);
                kg.f fVar = e4Var.L2;
                if (fVar != null) {
                    int finalHeight = e4Var.X1.getFinalHeight();
                    int w12 = e4Var.w1();
                    if (e4Var.T2.d(1) && e4Var.f46807f2.getVisibility() == 0) {
                        i19 = e4Var.f46807f2.getMeasuredHeight();
                    }
                    fVar.H(finalHeight, w12 + i19);
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f9894a) {
            case 9:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                jq0 jq0Var = photoViewer.U1;
                if (jq0Var != null && jq0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f33656y7[0] * f7);
                }
                kq0 kq0Var = photoViewer.V1;
                if (kq0Var != null && kq0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.f33665z7[0]);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f9894a) {
            case 3:
                super.setTranslationY(f7);
                ((kg.i1) this.e).g0(f7);
                return;
            case 9:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * i0.a.d(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.l0 l0Var = photoViewer.X1;
                if (l0Var != null) {
                    l0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    return;
                }
                return;
            case 12:
                super.setTranslationY(f7);
                FrameLayout frameLayout2 = ((e4) this.e).E;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationY((getTranslationY() - a()) - org.telegram.messenger.i0.f16021n);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        int i11;
        switch (this.f9894a) {
            case 9:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.R7;
                    if (i10 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    frameLayout2.setVisibility(i11);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public b1(Activity activity, org.telegram.ui.Components.voip.x0 x0Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.voip.v0[5];
        setWillNotDraw(false);
        fg.i iVar = new fg.i(activity, x0Var);
        this.f9895b = iVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f9896c = frameLayout;
        iVar.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            ((org.telegram.ui.Components.voip.v0[]) this.d)[i10] = new org.telegram.ui.Components.voip.v0(activity);
            ((org.telegram.ui.Components.voip.v0[]) this.d)[i10].setAllStarsProvider(new mg.l(this, 15));
            org.telegram.ui.Components.voip.v0 v0Var = ((org.telegram.ui.Components.voip.v0[]) this.d)[i10];
            v0Var.d = new org.telegram.ui.Components.f2(23, this, activity);
            v0Var.f31689f = i10;
            ((FrameLayout) this.f9896c).addView(v0Var, b6.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((fg.i) this.f9895b, b6.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.f9896c, b6.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    public b1(s3 s3Var, Context context) {
        super(context);
        this.e = s3Var;
        this.f9895b = new Matrix();
        this.f9896c = new float[8];
        this.d = new Path();
    }

    public b1(j9 j9Var, Context context, zz zzVar) {
        super(context);
        addView(zzVar, b6.c(-1.0f, -1));
        this.d = zzVar;
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.f(2131624314, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, b6.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new org.telegram.ui.a(this, 9));
        TextView textView = new TextView(context);
        this.f9895b = textView;
        z20.p(textView, t6.G6, null, null, 2131748714);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        addView(textView, b6.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9896c = textView2;
        String a02 = cd.a0(null, null, 2131748713, Integer.valueOf(j9Var.getMessagesController().Q6));
        if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.P1()) {
            a02 = a02.replace('\n', ' ');
        }
        textView2.setText(a02);
        a7.V(textView2, t6.f20911c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView2, b6.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        zzVar.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(3));
    }

    public b1(LimitPreviewView limitPreviewView, Context context, p6 p6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = p6Var;
        this.f9895b = new Paint();
        Paint paint = new Paint();
        this.f9896c = paint;
        paint.setColor(-1);
    }

    public b1(Context context, lh.g gVar, p6 p6Var) {
        super(context);
        this.e = gVar;
        this.d = p6Var;
        this.f9895b = new rf.w(2);
        this.f9896c = new rf.w(8);
    }

    public b1(kg.i1 i1Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = i1Var;
        this.f9895b = scrollView;
        this.f9896c = drawable;
        this.d = new Path();
    }

    public b1(Context context, p6 p6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f9896c = textView;
        z20.n(textView, 1, 20.0f);
        textView.setGravity(cd.X ? 5 : 3);
        a7.V(textView, t6.f21037j5, p6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f9895b = imageView;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.d = c2Var;
        imageView.setImageDrawable(c2Var);
        c2Var.a(-1);
        addView(imageView, b6.d(24, 24.0f, (cd.X ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new a01(this, 0));
        b(true);
        setMinimumHeight(org.telegram.messenger.i0.L(56.0f));
    }

    public b1(t5 t5Var, Context context) {
        super(context);
        this.e = t5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f9895b = imageView;
        TextView textView = new TextView(context);
        this.f9896c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, b6.e(-2, -2, 1));
        addView(textView, b6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        setMinimumWidth(org.telegram.messenger.i0.L(100.0f));
        int L = org.telegram.messenger.i0.L(10.0f);
        int o10 = i0.b.o(-16777216, 80);
        setBackground(t6.k0(L, L, L, L, 0, o10, o10));
    }

    public b1(m91 m91Var, Activity activity) {
        super(activity);
        this.e = m91Var;
        this.f9895b = new Paint(1);
        this.f9896c = new Paint(1);
        this.d = new Paint(1);
    }

    public b1(e4 e4Var, Context context) {
        super(context);
        this.e = e4Var;
        this.f9895b = new RectF();
        this.f9896c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public b1(kg.m0 m0Var, Context context, p6 p6Var) {
        super(context);
        this.e = m0Var;
        this.d = p6Var;
        this.f9895b = new kg.k1(t6.zk, t6.Ak, -1, -1, p6Var);
        Paint paint = new Paint(1);
        this.f9896c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public b1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.f9896c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f9895b = new Matrix();
    }
}
