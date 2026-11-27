package defpackage;

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
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.PhotoViewer;
public final class jo0 extends FrameLayout {
    public final byte a = 10;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public jo0(i91 i91Var, Context context, tk4 tk4Var) {
        super(context);
        addView(tk4Var, tre.c(-1.0f, -1));
        this.d = tk4Var;
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.f(2131624312, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, tre.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new r81(this, (byte) 1));
        TextView textView = new TextView(context);
        this.b = textView;
        ik8.x(textView, aob.G6, null, null, 2131748453);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        addView(textView, tre.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        String a0 = ob6.a0(null, null, 2131748452, Integer.valueOf(i91Var.getMessagesController().k4.E3.f()));
        if (hl.O1() && !hl.N1()) {
            a0 = a0.replace('\n', ' ');
        }
        textView2.setText(a0);
        yob.X(textView2, aob.c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView2, tre.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        tk4Var.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new q8((byte) 20));
    }

    public final float a() {
        wua wuaVar = (wua) this.e;
        return (wuaVar.W2.a(3) * wuaVar.y2.getMeasuredHeight()) + (wuaVar.W2.a(2) * wuaVar.w2.getMeasuredHeight()) + (wuaVar.W2.a(1) * wuaVar.n2.getMeasuredHeight()) + (wuaVar.W2.a(0) * wuaVar.b2.getMeasuredHeight()) + wuaVar.a2.getRealHeight() + 0.0f;
    }

    public final void b(boolean z) {
        int i;
        float f;
        float f2;
        ImageView imageView = (ImageView) this.c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        TextView textView = (TextView) this.b;
        boolean z2 = ob6.a0;
        if (!z2 && z) {
            f = 53.0f;
        } else {
            f = 22.0f;
        }
        if (z2 && z) {
            f2 = 53.0f;
        } else {
            f2 = 22.0f;
        }
        textView.setLayoutParams(tre.d(-1, -2.0f, 55, f, 14.0f, f2, 12.0f));
    }

    public final void c(int i, String str) {
        ((TextView) this.b).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i));
    }

    public final void d() {
        ((e29) this.e).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(0.0f).setDuration(150L).start();
        ((tk4) this.d).animate().alpha(1.0f).setDuration(150L).start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint e;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        int i = 0;
        switch (this.a) {
            case 4:
                vnb vnbVar = (vnb) this.d;
                Paint paint = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.d0 && !limitPreviewView.S) {
                        paint.setColor(aob.v0(aob.e7, vnbVar));
                    } else {
                        paint.setColor(aob.v0(aob.i6, vnbVar));
                    }
                } else {
                    paint.setColor(aob.v0(aob.a7, vnbVar));
                }
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                if (limitPreviewView.e()) {
                    canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), ((lo0) ((tg0) limitPreviewView.f0).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.Q) {
                    canvas.clipRect(limitPreviewView.n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.S) {
                    e = limitPreviewView.L;
                } else if (limitPreviewView.e()) {
                    e = (Paint) this.b;
                } else {
                    e = bl8.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    al8 al8Var = limitPreviewView.F;
                    if (al8Var != null) {
                        e = al8Var.f;
                        al8Var.a();
                        Matrix matrix = al8Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, limitPreviewView.c / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, -limitPreviewView.G);
                        al8Var.d.setLocalMatrix(matrix);
                    } else {
                        float f = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f += view.getY();
                        }
                        bl8 d = bl8.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f, measuredWidth, measuredHeight);
                    }
                } else {
                    bl8 d2 = bl8.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d2.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha = e.getAlpha();
                if (limitPreviewView.W && (valueAnimator2 = limitPreviewView.j0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.V && (valueAnimator = limitPreviewView.j0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.M && !limitPreviewView.N) {
                        hl.P.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    } else {
                        hl.P.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(hl.P, hl.L(6.0f), hl.L(6.0f), e);
                e.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.F == null && limitPreviewView.e0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(aob.v0(aob.zj, (vnb) this.d));
                ema emaVar = ((g46) this.e).d;
                canvas.drawLine(hl.L(18.0f), getHeight() / 2.0f, emaVar.getLeft() - hl.L(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(hl.L(20.0f) + emaVar.getRight(), getHeight() / 2.0f, getWidth() - hl.L(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = hl.P;
                int top = emaVar.getTop();
                rectF2.set(emaVar.getLeft() - hl.L(15.0f), ((emaVar.getBottom() + top) - hl.L(30.0f)) / 2.0f, hl.L(15.0f) + emaVar.getRight(), (hl.L(30.0f) + (emaVar.getBottom() + emaVar.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                al8 al8Var2 = (al8) this.c;
                al8Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, hl.L(15.0f), hl.L(15.0f), al8Var2.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 6:
            case 7:
            case 10:
            case 11:
            default:
                super.dispatchDraw(canvas);
                return;
            case 8:
                LinearGradient linearGradient = (LinearGradient) this.b;
                Matrix matrix2 = (Matrix) this.d;
                Paint paint3 = (Paint) this.c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.R4) {
                    if (photoViewer.o0.getVisibility() == 0) {
                        i = getMeasuredHeight() - hl.L(48.0f);
                    }
                    int i2 = photoViewer.d2;
                    if (i2 != 0 && i2 != 2 && i2 != -1) {
                        paint3.setShader(null);
                        paint3.setColor(2130706432);
                    } else {
                        matrix2.reset();
                        matrix2.postTranslate(0.0f, i);
                        matrix2.postScale(1.0f, Math.min(hl.L(40.0f), getMeasuredHeight() - i) / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint3.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i, getMeasuredWidth(), getMeasuredHeight(), paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable = (Drawable) this.d;
                xk8 xk8Var = (xk8) this.e;
                xk8Var.s0.setBounds(0, c00.A(2.0f, xk8Var.G1 + xk8Var.t0, 1), getMeasuredWidth(), getMeasuredHeight());
                xk8Var.s0.draw(canvas);
                super.dispatchDraw(canvas);
                y10 y10Var = xk8Var.H1;
                if (y10Var != null && y10Var.getVisibility() == 0 && xk8Var.H1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, xk8Var.H1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + xk8Var.H1.getBottom());
                    drawable.setAlpha((int) (xk8Var.H1.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    return;
                }
                return;
            case 12:
                wua wuaVar = (wua) this.e;
                jy0 jy0Var = wuaVar.o1;
                FrameLayout frameLayout = wuaVar.g2;
                wuaVar.S0(canvas, this);
                canvas.save();
                float f2 = f();
                float L = hl.L(12.0f);
                RectF rectF3 = (RectF) this.d;
                rectF3.set(wuaVar.u0, f2, getWidth() - wuaVar.u0, getHeight() + L);
                Paint paint4 = (Paint) this.c;
                paint4.setColor(aob.v0(aob.h5, wuaVar.J0));
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF3, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint4);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint4.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(wuaVar.u0, getHeight() - getPaddingBottom(), getWidth() - wuaVar.u0, getHeight(), paint4);
                    paint4.setAlpha(255);
                }
                h();
                canvas.restore();
                if (jy0Var != null && jy0Var.getVisibility() == 0 && jy0Var.getAlpha() > 0.0f) {
                    if (jy0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(jy0Var.getX(), jy0Var.getY(), jy0Var.getMeasuredWidth() + jy0Var.getX(), jy0Var.getMeasuredHeight() + jy0Var.getY(), (int) (jy0Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(jy0Var.getX(), jy0Var.getY(), jy0Var.getX() + jy0Var.getMeasuredWidth(), jy0Var.getY() + jy0Var.getMeasuredHeight());
                    }
                    canvas.translate(jy0Var.getX(), jy0Var.getY());
                    jy0Var.draw(canvas);
                    canvas.restore();
                }
                wuaVar.R0(canvas, this);
                return;
            case 13:
                Paint paint5 = (Paint) this.d;
                Paint paint6 = (Paint) this.b;
                RectF rectF4 = hl.P;
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = hl.L(8.0f);
                Paint paint7 = (Paint) this.c;
                paint7.setColor(0);
                float N = hl.N(1.0f);
                float N2 = hl.N(0.33f);
                pqb pqbVar = (pqb) this.e;
                paint7.setShadowLayer(N, 0.0f, N2, vm2.o(-16777216, (int) (pqbVar.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF4, L2, L2, paint7);
                fqb fqbVar = pqbVar.z0;
                rpb rpbVar = pqbVar.a;
                aob.s(this, fqbVar, rpbVar);
                Paint d3 = rpbVar.d("paintChatActionBackground");
                int alpha2 = d3.getAlpha();
                d3.setAlpha((int) (pqbVar.T1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF4, L2, L2, d3);
                d3.setAlpha(alpha2);
                if (pqbVar.O1) {
                    float f3 = pqbVar.p1;
                    if (f3 > 0.0f) {
                        paint5.setColor(vm2.o(-16777216, (int) (f3 * 255.0f * pqbVar.q1)));
                        canvas.drawRoundRect(rectF4, L2, L2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (pqbVar.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF4, L2, L2, paint6);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 9:
                xk8 xk8Var = (xk8) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < hl.L(2.0f) + (xk8Var.G1 - xk8Var.t0)) {
                        xk8Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                wua wuaVar = (wua) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < f() && wuaVar.b.isAttachedToWindow()) {
                    wuaVar.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), ((lo0) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ImageReceiver photoImage;
        int i = 0;
        switch (this.a) {
            case 2:
                vnb vnbVar = (vnb) this.d;
                n15 n15Var = (n15) this.b;
                n15 n15Var2 = (n15) this.c;
                boolean drawChild = super.drawChild(canvas, view, j);
                ry2 ry2Var = (ry2) this.e;
                int i2 = (int) ry2Var.S1.f;
                if (view == ry2Var.c2 && i2 > 0) {
                    n15Var2.setBounds(0, hl.L(40.0f), getWidth(), hl.L(48.0f));
                    int i3 = aob.h5;
                    n15Var2.b(aob.v0(i3, vnbVar));
                    n15Var2.draw(canvas);
                    int L = hl.L(48.0f) + i2;
                    n15Var.setBounds(0, L - hl.L(8.0f), getWidth(), L);
                    n15Var.b(aob.v0(i3, vnbVar));
                    n15Var.draw(canvas);
                }
                return drawChild;
            case 6:
                float[] fArr = (float[]) this.b;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.c;
                vw7 vw7Var = (vw7) this.e;
                v37 v37Var = vw7Var.t0;
                if (view == vw7Var.y0) {
                    wb2 q = b47.q(vw7Var);
                    if (q == null || (photoImage = q.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.N0 / vw7Var.A0, photoImage.O0 / vw7Var.B0);
                    matrix.postScale((vw7Var.A0 / vw7Var.y0.getWidth()) * max, (vw7Var.B0 / vw7Var.y0.getHeight()) * max);
                    matrix.postTranslate((photoImage.r() + (q.getX() + v37Var.getX())) - ((vw7Var.A0 * max) / 2.0f), (photoImage.s() + (q.getY() + v37Var.getY())) - ((vw7Var.B0 * max) / 2.0f));
                    vw7Var.y0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    hl.P.set(q.getX() + v37Var.getX() + photoImage.L0, q.getY() + v37Var.getY() + photoImage.M0, photoImage.w() + q.getX() + v37Var.getX(), photoImage.x() + q.getY() + v37Var.getY());
                    while (true) {
                        int[] iArr = photoImage.X0;
                        if (i < iArr.length) {
                            int i4 = i << 1;
                            float f = iArr[i];
                            fArr[i4] = f;
                            fArr[i4 + 1] = f;
                            i++;
                        } else {
                            path.addRoundRect(hl.P, fArr, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild2 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild2;
                        }
                    }
                } else {
                    return super.drawChild(canvas, view, j);
                }
                break;
            case 9:
                Path path2 = (Path) this.c;
                if (view == ((ScrollView) this.b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = hl.P;
                    rectF.set(getPaddingLeft(), hl.L(18.0f) + ((xk8) this.e).G1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, hl.L(18.0f), hl.L(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 12:
                wua wuaVar = (wua) this.e;
                if (view == wuaVar.o1) {
                    return false;
                }
                if (view != wuaVar.Z1) {
                    canvas.save();
                    canvas.clipPath((Path) this.b);
                    boolean drawChild3 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild3;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    public final void e() {
        e29 e29Var = (e29) this.e;
        e29Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(1.0f).setDuration(150L).start();
        ((tk4) this.d).animate().alpha(0.0f).setDuration(150L).start();
        e29Var.d();
    }

    public final float f() {
        yta ytaVar;
        float max = Math.max(0.0f, getHeight() - a());
        wua wuaVar = (wua) this.e;
        d79 d79Var = wuaVar.n1;
        int childCount = d79Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = d79Var.getChildAt(childCount);
            d79Var.getClass();
            int S = RecyclerView.S(childAt);
            if (S >= 0) {
                if (S == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (S == 1) {
                    max = childAt.getY();
                    break;
                } else if (S == 0) {
                    max = childAt.getY() - wuaVar.a2.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a = (wuaVar.W2.a(4) * wuaVar.O()) + max;
        Float f = wuaVar.V2;
        if (f != null && (ytaVar = wuaVar.W2) != null && ytaVar.c < 1.0f) {
            return hl.R1(f.floatValue(), a, wuaVar.W2.c);
        }
        return a;
    }

    public final void g() {
        int i = aob.G6;
        fg4 fg4Var = (fg4) this.e;
        int v0 = aob.v0(i, fg4Var.a);
        ((ImageView) this.c).setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        ((TextView) this.b).setTextColor(v0);
        int i2 = aob.y6;
        vnb vnbVar = fg4Var.a;
        ((TextView) this.d).setTextColor(aob.v0(i2, vnbVar));
        setBackground(aob.f0(aob.v0(aob.i6, vnbVar), 2, -1));
    }

    public final void h() {
        float f = f();
        wua wuaVar = (wua) this.e;
        hta htaVar = wuaVar.Z1;
        htaVar.setTranslationY(f - htaVar.getHeight());
        float l = Utilities.l(hl.x1(f - htaVar.getHeight(), 0.0f, hl.L(32.0f)));
        htaVar.setAlpha(wuaVar.W2.a(0) * l);
        htaVar.setScaleX(hl.R1(0.5f, 1.0f, l));
        htaVar.setScaleY(hl.R1(0.5f, 1.0f, l));
        sua suaVar = wuaVar.a2;
        suaVar.setTranslationY(f);
        wuaVar.b2.setTranslationY(suaVar.getRealHeight() + f);
        wuaVar.n2.setTranslationY(suaVar.getRealHeight() + f);
        wuaVar.w2.setTranslationY(suaVar.getRealHeight() + f);
        wuaVar.y2.setTranslationY(suaVar.getRealHeight() + f);
        FrameLayout frameLayout = wuaVar.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - hl.n);
        }
        hl.R3(wuaVar.j2, wuaVar.n1.canScrollVertically(1));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 1:
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.b;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float L = hl.L(4.0f);
                fArr[7] = L;
                fArr[6] = L;
                fArr[5] = L;
                fArr[4] = L;
                Path path = (Path) this.c;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        switch (this.a) {
            case 4:
                if (getChildCount() == 2) {
                    View childAt = getChildAt(0);
                    View childAt2 = getChildAt(1);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i6 = i4 - i2;
                    childAt.layout(0, 0, measuredWidth, i6);
                    childAt2.layout(measuredWidth, 0, i3 - i, i6);
                    return;
                }
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 6:
                vw7 vw7Var = (vw7) this.e;
                v37 v37Var = vw7Var.t0;
                int measuredWidth2 = v37Var.getMeasuredWidth();
                for (int i7 = 0; i7 < v37Var.getChildCount(); i7++) {
                    View childAt3 = v37Var.getChildAt(i7);
                    int left = childAt3.getLeft();
                    childAt3.getRight();
                    if (childAt3 instanceof wb2) {
                        wb2 wb2Var = (wb2) childAt3;
                        left = childAt3.getLeft() + wb2Var.getBoundsLeft();
                        childAt3.getLeft();
                        wb2Var.getBoundsRight();
                    } else if (childAt3 instanceof dl1) {
                        dl1 dl1Var = (dl1) childAt3;
                        left = childAt3.getLeft() + dl1Var.getBoundsLeft();
                        childAt3.getLeft();
                        dl1Var.getBoundsRight();
                    }
                    measuredWidth2 = Math.min(left, measuredWidth2);
                }
                v37Var.layout(-measuredWidth2, 0, v37Var.getMeasuredWidth() - measuredWidth2, v37Var.getMeasuredHeight());
                TextureView textureView = vw7Var.y0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), v37Var.getMeasuredHeight());
                    return;
                }
                return;
            case 8:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.I0.getVisibility() != 8) {
                    if (photoViewer.T0.getVisibility() == 0) {
                        i5 = hl.L(63.0f);
                    }
                    int measuredWidth3 = (((i3 - i) - i5) - photoViewer.I0.getMeasuredWidth()) / 2;
                    oob oobVar = photoViewer.I0;
                    oobVar.layout(measuredWidth3, oobVar.getTop(), photoViewer.I0.getMeasuredWidth() + measuredWidth3, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    return;
                }
                return;
            case 12:
                super.onLayout(z, i, i2, i3, i4);
                wua wuaVar = (wua) this.e;
                FrameLayout frameLayout = wuaVar.i2;
                ox0 ox0Var = wuaVar.O2;
                if (ox0Var != null) {
                    int finalHeight = wuaVar.a2.getFinalHeight();
                    int q1 = wuaVar.q1();
                    if (wuaVar.W2.d(1) && frameLayout.getVisibility() == 0) {
                        i5 = frameLayout.getMeasuredHeight();
                    }
                    ox0Var.H(finalHeight, q1 + i5);
                }
                wuaVar.P1();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float measuredWidth;
        boolean z;
        int left;
        int boundsRight;
        int i4;
        int i5 = 0;
        r4 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        switch (this.a) {
            case 4:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                in inVar = limitPreviewView.w;
                TextView textView = limitPreviewView.x;
                gj3 gj3Var = limitPreviewView.h0;
                gj3 gj3Var2 = limitPreviewView.g0;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    gj3Var2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth2 = gj3Var2.getMeasuredWidth();
                    int measuredWidth3 = limitPreviewView.O.getMeasuredWidth() + hl.L(24.0f);
                    if (textView.getVisibility() == 0) {
                        i3 = textView.getMeasuredWidth() + hl.L(24.0f);
                    } else {
                        i3 = 0;
                    }
                    int max = Math.max(measuredWidth2, measuredWidth3 + i3);
                    gj3Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.Q) {
                        float f = limitPreviewView.a;
                        float f2 = 0.0f;
                        if (f == 0.0f) {
                            limitPreviewView.n = 0;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                if (!limitPreviewView.M && !limitPreviewView.e()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                limitPreviewView.setPremiumCountColor(z);
                                if (limitPreviewView.e()) {
                                    limitPreviewView.setDefaultTextColor(true);
                                } else {
                                    limitPreviewView.setDefaultTextColor(false);
                                }
                            }
                        } else if (f < 1.0f) {
                            if (limitPreviewView.M) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = gj3Var2.getMeasuredWidth() - hl.L(8.0f);
                            }
                            if (!limitPreviewView.M) {
                                f2 = gj3Var.getMeasuredWidth() - hl.L(8.0f);
                            }
                            limitPreviewView.n = (int) ((((size - measuredWidth) - f2) * limitPreviewView.a) + measuredWidth);
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                limitPreviewView.setPremiumCountColor((limitPreviewView.M || limitPreviewView.e()) ? true : true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        } else {
                            limitPreviewView.n = size;
                            if (!limitPreviewView.V && !limitPreviewView.W) {
                                limitPreviewView.setPremiumCountColor(true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        }
                    } else {
                        int measuredWidth4 = gj3Var.getMeasuredWidth();
                        int measuredWidth5 = limitPreviewView.P.getMeasuredWidth() + hl.L(24.0f);
                        if (inVar.getVisibility() == 0) {
                            i5 = inVar.getMeasuredWidth() + hl.L(24.0f);
                        }
                        int i8 = (int) Utilities.i(size * limitPreviewView.a, size - Math.max(measuredWidth4, measuredWidth5 + i5), max);
                        limitPreviewView.n = i8;
                        gj3Var2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        gj3Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    return;
                }
                super.onMeasure(i, i2);
                return;
            case 5:
            case 7:
            case 10:
            default:
                super.onMeasure(i, i2);
                return;
            case 6:
                vw7 vw7Var = (vw7) this.e;
                v37 v37Var = vw7Var.t0;
                v37Var.measure(i, 0);
                TextureView textureView = vw7Var.y0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(v37Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(v37Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth6 = v37Var.getMeasuredWidth();
                int i9 = 0;
                for (int i10 = 0; i10 < v37Var.getChildCount(); i10++) {
                    View childAt = v37Var.getChildAt(i10);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof wb2) {
                        wb2 wb2Var = (wb2) childAt;
                        left2 = childAt.getLeft() + wb2Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = wb2Var.getBoundsRight();
                    } else if (childAt instanceof dl1) {
                        dl1 dl1Var = (dl1) childAt;
                        left2 = childAt.getLeft() + dl1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = dl1Var.getBoundsRight();
                    } else {
                        measuredWidth6 = Math.min(left2, measuredWidth6);
                        i9 = Math.max(right, i9);
                    }
                    right = boundsRight + left;
                    measuredWidth6 = Math.min(left2, measuredWidth6);
                    i9 = Math.max(right, i9);
                }
                setMeasuredDimension(i9 - measuredWidth6, v37Var.getMeasuredHeight());
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams();
                if (photoViewer.T0.getVisibility() == 0) {
                    i7 = hl.L(63.0f);
                }
                layoutParams.rightMargin = i7;
                super.onMeasure(i, i2);
                return;
            case 9:
                xk8 xk8Var = (xk8) this.e;
                xk8Var.F1 = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE));
                xk8Var.F1 = (View.MeasureSpec.getSize(i2) - scrollView.getMeasuredHeight()) + xk8Var.t0;
                super.onMeasure(i, i2);
                xk8Var.E0();
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 12:
                wua wuaVar = (wua) this.e;
                FrameLayout frameLayout = wuaVar.i2;
                int O = wuaVar.O();
                setPadding(0, 0, 0, O);
                sua suaVar = wuaVar.a2;
                suaVar.N.setPadding(0, 0, 0, O);
                int size3 = View.MeasureSpec.getSize(i2);
                wuaVar.q1 = size3;
                int size4 = View.MeasureSpec.getSize(i);
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2 instanceof kg5) {
                        childAt2.measure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), 1073741824));
                    } else if (childAt2 == wuaVar.n1) {
                        childAt2.measure(i, View.MeasureSpec.makeMeasureSpec(size3 - O, 1073741824));
                    } else {
                        if (childAt2.getLayoutParams() != null && childAt2.getLayoutParams().height == -1) {
                            i4 = size3;
                        } else {
                            i4 = 9999;
                        }
                        childAt2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size4, size3);
                ox0 ox0Var = wuaVar.O2;
                if (ox0Var != null) {
                    int finalHeight = suaVar.getFinalHeight();
                    int q1 = wuaVar.q1();
                    if (wuaVar.W2.d(1) && frameLayout.getVisibility() == 0) {
                        i6 = frameLayout.getMeasuredHeight();
                    }
                    ox0Var.H(finalHeight, q1 + i6);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 8:
                super.setAlpha(f);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.W7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.W7.setAlpha(f);
                }
                pb8 pb8Var = photoViewer.V1;
                if (pb8Var != null && pb8Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.D7[0] * f);
                }
                qb8 qb8Var = photoViewer.W1;
                if (qb8Var != null && qb8Var.getVisibility() != 8) {
                    photoViewer.W1.setAlpha(f * photoViewer.E7[0]);
                    return;
                }
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 8:
                super.setTranslationY(f);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.W7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.W7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                d26 d26Var = photoViewer.Y1;
                if (d26Var != null) {
                    d26Var.setTranslationY(f);
                }
                TextView textView = photoViewer.Y7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.Y7.setTranslationY(f);
                    return;
                }
                return;
            case 9:
                super.setTranslationY(f);
                ((xk8) this.e).d0(f);
                return;
            case 10:
            case 11:
            default:
                super.setTranslationY(f);
                return;
            case 12:
                super.setTranslationY(f);
                FrameLayout frameLayout2 = ((wua) this.e).F;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationY((getTranslationY() - a()) - hl.n);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        int i2;
        switch (this.a) {
            case 8:
                super.setVisibility(i);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.W7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.W7;
                    if (i == 0) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    frameLayout2.setVisibility(i2);
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public jo0(Activity activity, kjc kjcVar) {
        super(activity);
        this.d = new q29[5];
        setWillNotDraw(false);
        tt ttVar = new tt(activity, kjcVar);
        this.c = ttVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        ttVar.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i = 0; i < 5; i++) {
            ((q29[]) this.d)[i] = new q29(activity);
            ((q29[]) this.d)[i].setAllStarsProvider(new jz7(this, (byte) 25));
            q29 q29Var = ((q29[]) this.d)[i];
            q29Var.d = new m88(this, activity, (byte) 19);
            q29Var.f = i;
            ((FrameLayout) this.b).addView(q29Var, tre.d(-2, -2.0f, 51, i * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((tt) this.c, tre.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.b, tre.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    public jo0(vw7 vw7Var, Context context) {
        super(context);
        this.e = vw7Var;
        this.c = new Matrix();
        this.b = new float[8];
        this.d = new Path();
    }

    public jo0(LimitPreviewView limitPreviewView, Context context, vnb vnbVar) {
        super(context);
        this.e = limitPreviewView;
        this.d = vnbVar;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    public jo0(Context context) {
        super(context);
    }

    public jo0(ry2 ry2Var, vnb vnbVar, Context context) {
        super(context);
        this.e = ry2Var;
        this.d = vnbVar;
        this.c = new n15(2);
        this.b = new n15(8);
    }

    public jo0(xk8 xk8Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = xk8Var;
        this.b = scrollView;
        this.d = drawable;
        this.c = new Path();
    }

    public jo0(Context context, vnb vnbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        ik8.v(textView, 1, 20.0f);
        textView.setGravity(ob6.a0 ? 5 : 3);
        yob.X(textView, aob.j5, vnbVar);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        gd0 gd0Var = new gd0(false);
        this.d = gd0Var;
        imageView.setImageDrawable(gd0Var);
        gd0Var.a(-1);
        addView(imageView, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new jn8(this, (byte) 8));
        b(true);
        setMinimumHeight(hl.L(56.0f));
    }

    public jo0(lo0 lo0Var, Context context) {
        super(context);
        this.e = lo0Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, tre.e(-2, -2, 1));
        addView(textView, tre.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        setMinimumWidth(hl.L(100.0f));
        int L = hl.L(10.0f);
        int o = vm2.o(-16777216, 80);
        setBackground(aob.i0(L, L, L, L, 0, o, o));
    }

    public jo0(fg4 fg4Var, Context context) {
        super(context);
        this.e = fg4Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232221);
        addView(imageView, tre.d(48, 48.0f, 19, 6.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setText(ob6.M0(2131750666, null));
        linearLayout.addView(textView, tre.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setText(ob6.M0(2131750659, null));
        linearLayout.addView(textView2, tre.t(-2, -2, 1, 0, 1, 0, 0));
        addView(linearLayout, tre.d(-1, -2.0f, 17, 56.0f, 0.0f, 56.0f, 0.0f));
        setContentDescription(ob6.M0(2131750666, null) + ", " + ob6.M0(2131750659, null));
        setOnClickListener(new mh3(this, (byte) 15));
        g();
    }

    public jo0(pqb pqbVar, Activity activity) {
        super(activity);
        this.e = pqbVar;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    public jo0(wua wuaVar, Context context) {
        super(context);
        this.e = wuaVar;
        this.d = new RectF();
        this.c = new Paint(1);
        this.b = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public jo0(g46 g46Var, Context context, vnb vnbVar) {
        super(context);
        this.e = g46Var;
        this.d = vnbVar;
        this.c = new al8(aob.Ck, aob.Dk, -1, -1, vnbVar);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public jo0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
