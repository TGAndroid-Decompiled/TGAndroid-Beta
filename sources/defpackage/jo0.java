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

    public jo0(z81 z81Var, Context context, pi4 pi4Var) {
        super(context);
        addView(pi4Var, nme.c(-1.0f, -1));
        this.d = pi4Var;
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.f(2131624312, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, nme.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new osc(this, (byte) 1));
        TextView textView = new TextView(context);
        this.b = textView;
        ug8.x(textView, bkb.F6, null, null, 2131748507);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        addView(textView, nme.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        String a0 = k96.a0(null, null, 2131748506, Integer.valueOf(z81Var.getMessagesController().k4.w3.f()));
        if (gl.O1() && !gl.N1()) {
            a0 = a0.replace('\n', ' ');
        }
        textView2.setText(a0);
        zkb.X(textView2, bkb.b7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView2, nme.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        pi4Var.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new p8((byte) 20));
    }

    public final float a() {
        vqa vqaVar = (vqa) this.e;
        return (vqaVar.W2.a(3) * vqaVar.y2.getMeasuredHeight()) + (vqaVar.W2.a(2) * vqaVar.w2.getMeasuredHeight()) + (vqaVar.W2.a(1) * vqaVar.n2.getMeasuredHeight()) + (vqaVar.W2.a(0) * vqaVar.b2.getMeasuredHeight()) + vqaVar.a2.getRealHeight() + 0.0f;
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
        boolean z2 = k96.a0;
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
        textView.setLayoutParams(nme.d(-1, -2.0f, 55, f, 14.0f, f2, 12.0f));
    }

    public final void c(int i, String str) {
        ((TextView) this.b).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i));
    }

    public final void d() {
        ((ry8) this.e).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(0.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(0.0f).setDuration(150L).start();
        ((pi4) this.d).animate().alpha(1.0f).setDuration(150L).start();
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
                wjb wjbVar = (wjb) this.d;
                Paint paint = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.d0 && !limitPreviewView.S) {
                        paint.setColor(bkb.v0(bkb.d7, wjbVar));
                    } else {
                        paint.setColor(bkb.v0(bkb.h6, wjbVar));
                    }
                } else {
                    paint.setColor(bkb.v0(bkb.Z6, wjbVar));
                }
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                if (limitPreviewView.e()) {
                    canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), ((lo0) ((sg0) limitPreviewView.f0).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
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
                    e = nh8.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    mh8 mh8Var = limitPreviewView.F;
                    if (mh8Var != null) {
                        e = mh8Var.f;
                        mh8Var.a();
                        Matrix matrix = mh8Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, limitPreviewView.c / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, -limitPreviewView.G);
                        mh8Var.d.setLocalMatrix(matrix);
                    } else {
                        float f = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f += view.getY();
                        }
                        nh8 d = nh8.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f, measuredWidth, measuredHeight);
                    }
                } else {
                    nh8 d2 = nh8.d();
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
                        gl.P.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    } else {
                        gl.P.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(gl.P, gl.L(6.0f), gl.L(6.0f), e);
                e.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.F == null && limitPreviewView.e0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(bkb.v0(bkb.yj, (wjb) this.d));
                jia jiaVar = ((c26) this.e).d;
                canvas.drawLine(gl.L(18.0f), getHeight() / 2.0f, jiaVar.getLeft() - gl.L(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(gl.L(20.0f) + jiaVar.getRight(), getHeight() / 2.0f, getWidth() - gl.L(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = gl.P;
                int top = jiaVar.getTop();
                rectF2.set(jiaVar.getLeft() - gl.L(15.0f), ((jiaVar.getBottom() + top) - gl.L(30.0f)) / 2.0f, gl.L(15.0f) + jiaVar.getRight(), (gl.L(30.0f) + (jiaVar.getBottom() + jiaVar.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                mh8 mh8Var2 = (mh8) this.c;
                mh8Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, gl.L(15.0f), gl.L(15.0f), mh8Var2.f);
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
                if (!photoViewer.S4) {
                    if (photoViewer.o0.getVisibility() == 0) {
                        i = getMeasuredHeight() - gl.L(48.0f);
                    }
                    int i2 = photoViewer.d2;
                    if (i2 != 0 && i2 != 2 && i2 != -1) {
                        paint3.setShader(null);
                        paint3.setColor(2130706432);
                    } else {
                        matrix2.reset();
                        matrix2.postTranslate(0.0f, i);
                        matrix2.postScale(1.0f, Math.min(gl.L(40.0f), getMeasuredHeight() - i) / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint3.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i, getMeasuredWidth(), getMeasuredHeight(), paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable = (Drawable) this.d;
                jh8 jh8Var = (jh8) this.e;
                jh8Var.s0.setBounds(0, b00.z(2.0f, jh8Var.G1 + jh8Var.t0, 1), getMeasuredWidth(), getMeasuredHeight());
                jh8Var.s0.draw(canvas);
                super.dispatchDraw(canvas);
                x10 x10Var = jh8Var.H1;
                if (x10Var != null && x10Var.getVisibility() == 0 && jh8Var.H1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, jh8Var.H1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + jh8Var.H1.getBottom());
                    drawable.setAlpha((int) (jh8Var.H1.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    return;
                }
                return;
            case 12:
                vqa vqaVar = (vqa) this.e;
                by0 by0Var = vqaVar.o1;
                FrameLayout frameLayout = vqaVar.g2;
                vqaVar.R0(canvas, this);
                canvas.save();
                float f2 = f();
                float L = gl.L(12.0f);
                RectF rectF3 = (RectF) this.d;
                rectF3.set(vqaVar.u0, f2, getWidth() - vqaVar.u0, getHeight() + L);
                Paint paint4 = (Paint) this.c;
                paint4.setColor(bkb.v0(bkb.g5, vqaVar.J0));
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF3, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint4);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint4.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(vqaVar.u0, getHeight() - getPaddingBottom(), getWidth() - vqaVar.u0, getHeight(), paint4);
                    paint4.setAlpha(255);
                }
                h();
                canvas.restore();
                if (by0Var != null && by0Var.getVisibility() == 0 && by0Var.getAlpha() > 0.0f) {
                    if (by0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(by0Var.getX(), by0Var.getY(), by0Var.getMeasuredWidth() + by0Var.getX(), by0Var.getMeasuredHeight() + by0Var.getY(), (int) (by0Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(by0Var.getX(), by0Var.getY(), by0Var.getX() + by0Var.getMeasuredWidth(), by0Var.getY() + by0Var.getMeasuredHeight());
                    }
                    canvas.translate(by0Var.getX(), by0Var.getY());
                    by0Var.draw(canvas);
                    canvas.restore();
                }
                vqaVar.Q0(canvas, this);
                return;
            case 13:
                Paint paint5 = (Paint) this.d;
                Paint paint6 = (Paint) this.b;
                RectF rectF4 = gl.P;
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = gl.L(8.0f);
                Paint paint7 = (Paint) this.c;
                paint7.setColor(0);
                float N = gl.N(1.0f);
                float N2 = gl.N(0.33f);
                qmb qmbVar = (qmb) this.e;
                paint7.setShadowLayer(N, 0.0f, N2, bm2.o(-16777216, (int) (qmbVar.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF4, L2, L2, paint7);
                gmb gmbVar = qmbVar.z0;
                slb slbVar = qmbVar.a;
                bkb.s(this, gmbVar, slbVar);
                Paint d3 = slbVar.d("paintChatActionBackground");
                int alpha2 = d3.getAlpha();
                d3.setAlpha((int) (qmbVar.T1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF4, L2, L2, d3);
                d3.setAlpha(alpha2);
                if (qmbVar.O1) {
                    float f3 = qmbVar.p1;
                    if (f3 > 0.0f) {
                        paint5.setColor(bm2.o(-16777216, (int) (f3 * 255.0f * qmbVar.q1)));
                        canvas.drawRoundRect(rectF4, L2, L2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (qmbVar.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF4, L2, L2, paint6);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 9:
                jh8 jh8Var = (jh8) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < gl.L(2.0f) + (jh8Var.G1 - jh8Var.t0)) {
                        jh8Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                vqa vqaVar = (vqa) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < f() && vqaVar.b.isAttachedToWindow()) {
                    vqaVar.dismiss();
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
                canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), ((lo0) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
                wjb wjbVar = (wjb) this.d;
                jz4 jz4Var = (jz4) this.b;
                jz4 jz4Var2 = (jz4) this.c;
                boolean drawChild = super.drawChild(canvas, view, j);
                xx2 xx2Var = (xx2) this.e;
                int i2 = (int) xx2Var.S1.f;
                if (view == xx2Var.c2 && i2 > 0) {
                    jz4Var2.setBounds(0, gl.L(40.0f), getWidth(), gl.L(48.0f));
                    int i3 = bkb.g5;
                    jz4Var2.b(bkb.v0(i3, wjbVar));
                    jz4Var2.draw(canvas);
                    int L = gl.L(48.0f) + i2;
                    jz4Var.setBounds(0, L - gl.L(8.0f), getWidth(), L);
                    jz4Var.b(bkb.v0(i3, wjbVar));
                    jz4Var.draw(canvas);
                }
                return drawChild;
            case 6:
                float[] fArr = (float[]) this.b;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.c;
                ot7 ot7Var = (ot7) this.e;
                o17 o17Var = ot7Var.t0;
                if (view == ot7Var.y0) {
                    gb2 q = u17.q(ot7Var);
                    if (q == null || (photoImage = q.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.N0 / ot7Var.A0, photoImage.O0 / ot7Var.B0);
                    matrix.postScale((ot7Var.A0 / ot7Var.y0.getWidth()) * max, (ot7Var.B0 / ot7Var.y0.getHeight()) * max);
                    matrix.postTranslate((photoImage.r() + (q.getX() + o17Var.getX())) - ((ot7Var.A0 * max) / 2.0f), (photoImage.s() + (q.getY() + o17Var.getY())) - ((ot7Var.B0 * max) / 2.0f));
                    ot7Var.y0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    gl.P.set(q.getX() + o17Var.getX() + photoImage.L0, q.getY() + o17Var.getY() + photoImage.M0, photoImage.w() + q.getX() + o17Var.getX(), photoImage.x() + q.getY() + o17Var.getY());
                    while (true) {
                        int[] iArr = photoImage.X0;
                        if (i < iArr.length) {
                            int i4 = i << 1;
                            float f = iArr[i];
                            fArr[i4] = f;
                            fArr[i4 + 1] = f;
                            i++;
                        } else {
                            path.addRoundRect(gl.P, fArr, Path.Direction.CW);
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
                    RectF rectF = gl.P;
                    rectF.set(getPaddingLeft(), gl.L(18.0f) + ((jh8) this.e).G1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 12:
                vqa vqaVar = (vqa) this.e;
                if (view == vqaVar.o1) {
                    return false;
                }
                if (view != vqaVar.Z1) {
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
        ry8 ry8Var = (ry8) this.e;
        ry8Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(1.0f).setDuration(150L).start();
        ((pi4) this.d).animate().alpha(0.0f).setDuration(150L).start();
        ry8Var.d();
    }

    public final float f() {
        xpa xpaVar;
        float max = Math.max(0.0f, getHeight() - a());
        vqa vqaVar = (vqa) this.e;
        o39 o39Var = vqaVar.n1;
        int childCount = o39Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = o39Var.getChildAt(childCount);
            o39Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - vqaVar.a2.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a = (vqaVar.W2.a(4) * vqaVar.P()) + max;
        Float f = vqaVar.V2;
        if (f != null && (xpaVar = vqaVar.W2) != null && xpaVar.c < 1.0f) {
            return gl.R1(f.floatValue(), a, vqaVar.W2.c);
        }
        return a;
    }

    public final void g() {
        int i = bkb.F6;
        wjb wjbVar = ((he4) this.e).a;
        int v0 = bkb.v0(i, wjbVar);
        ((ImageView) this.c).setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        ((TextView) this.b).setTextColor(v0);
        ((TextView) this.d).setTextColor(bkb.v0(bkb.x6, wjbVar));
        setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), 2, -1));
    }

    public final void h() {
        float f = f();
        vqa vqaVar = (vqa) this.e;
        hpa hpaVar = vqaVar.Z1;
        hpaVar.setTranslationY(f - hpaVar.getHeight());
        float l = Utilities.l(gl.x1(f - hpaVar.getHeight(), 0.0f, gl.L(32.0f)));
        hpaVar.setAlpha(vqaVar.W2.a(0) * l);
        hpaVar.setScaleX(gl.R1(0.5f, 1.0f, l));
        hpaVar.setScaleY(gl.R1(0.5f, 1.0f, l));
        rqa rqaVar = vqaVar.a2;
        rqaVar.setTranslationY(f);
        vqaVar.b2.setTranslationY(rqaVar.getRealHeight() + f);
        vqaVar.n2.setTranslationY(rqaVar.getRealHeight() + f);
        vqaVar.w2.setTranslationY(rqaVar.getRealHeight() + f);
        vqaVar.y2.setTranslationY(rqaVar.getRealHeight() + f);
        FrameLayout frameLayout = vqaVar.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - gl.n);
        }
        gl.S3(vqaVar.j2, vqaVar.n1.canScrollVertically(1));
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
                float L = gl.L(4.0f);
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
                ot7 ot7Var = (ot7) this.e;
                o17 o17Var = ot7Var.t0;
                int measuredWidth2 = o17Var.getMeasuredWidth();
                for (int i7 = 0; i7 < o17Var.getChildCount(); i7++) {
                    View childAt3 = o17Var.getChildAt(i7);
                    int left = childAt3.getLeft();
                    childAt3.getRight();
                    if (childAt3 instanceof gb2) {
                        gb2 gb2Var = (gb2) childAt3;
                        left = childAt3.getLeft() + gb2Var.getBoundsLeft();
                        childAt3.getLeft();
                        gb2Var.getBoundsRight();
                    } else if (childAt3 instanceof uk1) {
                        uk1 uk1Var = (uk1) childAt3;
                        left = childAt3.getLeft() + uk1Var.getBoundsLeft();
                        childAt3.getLeft();
                        uk1Var.getBoundsRight();
                    }
                    measuredWidth2 = Math.min(left, measuredWidth2);
                }
                o17Var.layout(-measuredWidth2, 0, o17Var.getMeasuredWidth() - measuredWidth2, o17Var.getMeasuredHeight());
                TextureView textureView = ot7Var.y0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), o17Var.getMeasuredHeight());
                    return;
                }
                return;
            case 8:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.I0.getVisibility() != 8) {
                    if (photoViewer.T0.getVisibility() == 0) {
                        i5 = gl.L(63.0f);
                    }
                    int measuredWidth3 = (((i3 - i) - i5) - photoViewer.I0.getMeasuredWidth()) / 2;
                    pkb pkbVar = photoViewer.I0;
                    pkbVar.layout(measuredWidth3, pkbVar.getTop(), photoViewer.I0.getMeasuredWidth() + measuredWidth3, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    return;
                }
                return;
            case 12:
                super.onLayout(z, i, i2, i3, i4);
                vqa vqaVar = (vqa) this.e;
                FrameLayout frameLayout = vqaVar.i2;
                gx0 gx0Var = vqaVar.O2;
                if (gx0Var != null) {
                    int finalHeight = vqaVar.a2.getFinalHeight();
                    int p1 = vqaVar.p1();
                    if (vqaVar.W2.d(1) && frameLayout.getVisibility() == 0) {
                        i5 = frameLayout.getMeasuredHeight();
                    }
                    gx0Var.H(finalHeight, p1 + i5);
                }
                vqaVar.O1();
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
                hn hnVar = limitPreviewView.w;
                TextView textView = limitPreviewView.x;
                oi3 oi3Var = limitPreviewView.h0;
                oi3 oi3Var2 = limitPreviewView.g0;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    oi3Var2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth2 = oi3Var2.getMeasuredWidth();
                    int measuredWidth3 = limitPreviewView.O.getMeasuredWidth() + gl.L(24.0f);
                    if (textView.getVisibility() == 0) {
                        i3 = textView.getMeasuredWidth() + gl.L(24.0f);
                    } else {
                        i3 = 0;
                    }
                    int max = Math.max(measuredWidth2, measuredWidth3 + i3);
                    oi3Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
                                measuredWidth = oi3Var2.getMeasuredWidth() - gl.L(8.0f);
                            }
                            if (!limitPreviewView.M) {
                                f2 = oi3Var.getMeasuredWidth() - gl.L(8.0f);
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
                        int measuredWidth4 = oi3Var.getMeasuredWidth();
                        int measuredWidth5 = limitPreviewView.P.getMeasuredWidth() + gl.L(24.0f);
                        if (hnVar.getVisibility() == 0) {
                            i5 = hnVar.getMeasuredWidth() + gl.L(24.0f);
                        }
                        int i8 = (int) Utilities.i(size * limitPreviewView.a, size - Math.max(measuredWidth4, measuredWidth5 + i5), max);
                        limitPreviewView.n = i8;
                        oi3Var2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        oi3Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
                ot7 ot7Var = (ot7) this.e;
                o17 o17Var = ot7Var.t0;
                o17Var.measure(i, 0);
                TextureView textureView = ot7Var.y0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(o17Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(o17Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth6 = o17Var.getMeasuredWidth();
                int i9 = 0;
                for (int i10 = 0; i10 < o17Var.getChildCount(); i10++) {
                    View childAt = o17Var.getChildAt(i10);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof gb2) {
                        gb2 gb2Var = (gb2) childAt;
                        left2 = childAt.getLeft() + gb2Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = gb2Var.getBoundsRight();
                    } else if (childAt instanceof uk1) {
                        uk1 uk1Var = (uk1) childAt;
                        left2 = childAt.getLeft() + uk1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = uk1Var.getBoundsRight();
                    } else {
                        measuredWidth6 = Math.min(left2, measuredWidth6);
                        i9 = Math.max(right, i9);
                    }
                    right = boundsRight + left;
                    measuredWidth6 = Math.min(left2, measuredWidth6);
                    i9 = Math.max(right, i9);
                }
                setMeasuredDimension(i9 - measuredWidth6, o17Var.getMeasuredHeight());
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams();
                if (photoViewer.T0.getVisibility() == 0) {
                    i7 = gl.L(63.0f);
                }
                layoutParams.rightMargin = i7;
                super.onMeasure(i, i2);
                return;
            case 9:
                jh8 jh8Var = (jh8) this.e;
                jh8Var.F1 = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE));
                jh8Var.F1 = (View.MeasureSpec.getSize(i2) - scrollView.getMeasuredHeight()) + jh8Var.t0;
                super.onMeasure(i, i2);
                jh8Var.D0();
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 12:
                vqa vqaVar = (vqa) this.e;
                FrameLayout frameLayout = vqaVar.i2;
                int P = vqaVar.P();
                setPadding(0, 0, 0, P);
                rqa rqaVar = vqaVar.a2;
                rqaVar.N.setPadding(0, 0, 0, P);
                int size3 = View.MeasureSpec.getSize(i2);
                vqaVar.q1 = size3;
                int size4 = View.MeasureSpec.getSize(i);
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2 instanceof je5) {
                        childAt2.measure(i, View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), 1073741824));
                    } else if (childAt2 == vqaVar.n1) {
                        childAt2.measure(i, View.MeasureSpec.makeMeasureSpec(size3 - P, 1073741824));
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
                gx0 gx0Var = vqaVar.O2;
                if (gx0Var != null) {
                    int finalHeight = rqaVar.getFinalHeight();
                    int p1 = vqaVar.p1();
                    if (vqaVar.W2.d(1) && frameLayout.getVisibility() == 0) {
                        i6 = frameLayout.getMeasuredHeight();
                    }
                    gx0Var.H(finalHeight, p1 + i6);
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
                FrameLayout frameLayout = photoViewer.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.X7.setAlpha(f);
                }
                y78 y78Var = photoViewer.V1;
                if (y78Var != null && y78Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.E7[0] * f);
                }
                z78 z78Var = photoViewer.W1;
                if (z78Var != null && z78Var.getVisibility() != 8) {
                    photoViewer.W1.setAlpha(f * photoViewer.F7[0]);
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
                FrameLayout frameLayout = photoViewer.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.X7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b00.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                oc6 oc6Var = photoViewer.Y1;
                if (oc6Var != null) {
                    oc6Var.setTranslationY(f);
                }
                TextView textView = photoViewer.Z7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.Z7.setTranslationY(f);
                    return;
                }
                return;
            case 9:
                super.setTranslationY(f);
                ((jh8) this.e).d0(f);
                return;
            case 10:
            case 11:
            default:
                super.setTranslationY(f);
                return;
            case 12:
                super.setTranslationY(f);
                FrameLayout frameLayout2 = ((vqa) this.e).F;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationY((getTranslationY() - a()) - gl.n);
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
                FrameLayout frameLayout = photoViewer.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.X7;
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

    public jo0(Activity activity, lfc lfcVar) {
        super(activity);
        this.d = new dz8[5];
        setWillNotDraw(false);
        st stVar = new st(activity, lfcVar);
        this.c = stVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        stVar.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i = 0; i < 5; i++) {
            ((dz8[]) this.d)[i] = new dz8(activity);
            ((dz8[]) this.d)[i].setAllStarsProvider(new k88(this, (byte) 18));
            dz8 dz8Var = ((dz8[]) this.d)[i];
            dz8Var.d = new kq8(this, activity, (byte) 4);
            dz8Var.f = i;
            ((FrameLayout) this.b).addView(dz8Var, nme.d(-2, -2.0f, 51, i * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((st) this.c, nme.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.b, nme.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    public jo0(ot7 ot7Var, Context context) {
        super(context);
        this.e = ot7Var;
        this.c = new Matrix();
        this.b = new float[8];
        this.d = new Path();
    }

    public jo0(Context context) {
        super(context);
    }

    public jo0(LimitPreviewView limitPreviewView, Context context, wjb wjbVar) {
        super(context);
        this.e = limitPreviewView;
        this.d = wjbVar;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    public jo0(xx2 xx2Var, wjb wjbVar, Context context) {
        super(context);
        this.e = xx2Var;
        this.d = wjbVar;
        this.c = new jz4(2);
        this.b = new jz4(8);
    }

    public jo0(jh8 jh8Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = jh8Var;
        this.b = scrollView;
        this.d = drawable;
        this.c = new Path();
    }

    public jo0(Context context, wjb wjbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        ug8.v(textView, 1, 20.0f);
        textView.setGravity(k96.a0 ? 5 : 3);
        zkb.X(textView, bkb.i5, wjbVar);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ed0 ed0Var = new ed0(false);
        this.d = ed0Var;
        imageView.setImageDrawable(ed0Var);
        ed0Var.a(-1);
        addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ik8(this, (byte) 6));
        b(true);
        setMinimumHeight(gl.L(56.0f));
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
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, nme.e(-2, -2, 1));
        addView(textView, nme.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        setMinimumWidth(gl.L(100.0f));
        int L = gl.L(10.0f);
        int o = bm2.o(-16777216, 80);
        setBackground(bkb.i0(L, L, L, L, 0, o, o));
    }

    public jo0(he4 he4Var, Context context) {
        super(context);
        this.e = he4Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232221);
        addView(imageView, nme.d(48, 48.0f, 19, 6.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setText(k96.M0(2131750689, null));
        linearLayout.addView(textView, nme.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setText(k96.M0(2131750682, null));
        linearLayout.addView(textView2, nme.t(-2, -2, 1, 0, 1, 0, 0));
        addView(linearLayout, nme.d(-1, -2.0f, 17, 56.0f, 0.0f, 56.0f, 0.0f));
        setContentDescription(k96.M0(2131750689, null) + ", " + k96.M0(2131750682, null));
        setOnClickListener(new yj3(this, (byte) 13));
        g();
    }

    public jo0(qmb qmbVar, Activity activity) {
        super(activity);
        this.e = qmbVar;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    public jo0(vqa vqaVar, Context context) {
        super(context);
        this.e = vqaVar;
        this.d = new RectF();
        this.c = new Paint(1);
        this.b = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public jo0(c26 c26Var, Context context, wjb wjbVar) {
        super(context);
        this.e = c26Var;
        this.d = wjbVar;
        this.c = new mh8(bkb.Bk, bkb.Ck, -1, -1, wjbVar);
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
