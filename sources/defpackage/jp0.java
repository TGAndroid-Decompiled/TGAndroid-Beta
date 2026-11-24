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
public final class jp0 extends FrameLayout {
    public final byte a = 10;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public jp0(ia1 ia1Var, Context context, tk4 tk4Var) {
        super(context);
        addView(tk4Var, qoe.c(-1.0f, -1));
        this.d = tk4Var;
        ?? imageView = new ImageView(context);
        this.e = imageView;
        imageView.f(2131624312, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, qoe.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new k81(this, (byte) 2));
        TextView textView = new TextView(context);
        this.b = textView;
        wi8.x(textView, cmb.F6, null, null, 2131748456);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        addView(textView, qoe.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        String a0 = jb6.a0(null, null, 2131748455, Integer.valueOf(ia1Var.getMessagesController().l4.w3.f()));
        if (gm.O1() && !gm.N1()) {
            a0 = a0.replace('\n', ' ');
        }
        textView2.setText(a0);
        anb.X(textView2, cmb.b7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView2, qoe.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        tk4Var.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new p8((byte) 20));
    }

    public final float a() {
        wsa wsaVar = (wsa) this.e;
        return (wsaVar.W2.a(3) * wsaVar.y2.getMeasuredHeight()) + (wsaVar.W2.a(2) * wsaVar.w2.getMeasuredHeight()) + (wsaVar.W2.a(1) * wsaVar.n2.getMeasuredHeight()) + (wsaVar.W2.a(0) * wsaVar.b2.getMeasuredHeight()) + wsaVar.a2.getRealHeight() + 0.0f;
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
        boolean z2 = jb6.a0;
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
        textView.setLayoutParams(qoe.d(-1, -2.0f, 55, f, 14.0f, f2, 12.0f));
    }

    public final void c(int i, String str) {
        ((TextView) this.b).setText(str);
        ((ImageView) this.c).setImageDrawable(getContext().getDrawable(i));
    }

    public final void d() {
        ((s09) this.e).animate().alpha(0.0f).setDuration(150L).start();
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
                ylb ylbVar = (ylb) this.d;
                Paint paint = (Paint) this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.Q) {
                    if (!limitPreviewView.d0 && !limitPreviewView.S) {
                        paint.setColor(cmb.v0(cmb.d7, ylbVar));
                    } else {
                        paint.setColor(cmb.v0(cmb.h6, ylbVar));
                    }
                } else {
                    paint.setColor(cmb.v0(cmb.Z6, ylbVar));
                }
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                if (limitPreviewView.e()) {
                    canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), ((lp0) ((xg0) limitPreviewView.f0).b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
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
                    e = oj8.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.E;
                if (viewGroup != null) {
                    nj8 nj8Var = limitPreviewView.F;
                    if (nj8Var != null) {
                        e = nj8Var.f;
                        nj8Var.a();
                        Matrix matrix = nj8Var.e;
                        matrix.reset();
                        matrix.postScale(1.0f, limitPreviewView.c / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, -limitPreviewView.G);
                        nj8Var.d.setLocalMatrix(matrix);
                    } else {
                        float f = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f += view.getY();
                        }
                        oj8 d = oj8.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f, measuredWidth, measuredHeight);
                    }
                } else {
                    oj8 d2 = oj8.d();
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
                        gm.P.set(0.0f, 0.0f, limitPreviewView.n, getMeasuredHeight());
                    } else {
                        gm.P.set(limitPreviewView.n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(gm.P, gm.L(6.0f), gm.L(6.0f), e);
                e.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.F == null && limitPreviewView.e0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(cmb.v0(cmb.yj, (ylb) this.d));
                lka lkaVar = ((d46) this.e).d;
                canvas.drawLine(gm.L(18.0f), getHeight() / 2.0f, lkaVar.getLeft() - gm.L(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(gm.L(20.0f) + lkaVar.getRight(), getHeight() / 2.0f, getWidth() - gm.L(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = gm.P;
                int top = lkaVar.getTop();
                rectF2.set(lkaVar.getLeft() - gm.L(15.0f), ((lkaVar.getBottom() + top) - gm.L(30.0f)) / 2.0f, gm.L(15.0f) + lkaVar.getRight(), (gm.L(30.0f) + (lkaVar.getBottom() + lkaVar.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                nj8 nj8Var2 = (nj8) this.c;
                nj8Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, gm.L(15.0f), gm.L(15.0f), nj8Var2.f);
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
                        i = getMeasuredHeight() - gm.L(48.0f);
                    }
                    int i2 = photoViewer.d2;
                    if (i2 != 0 && i2 != 2 && i2 != -1) {
                        paint3.setShader(null);
                        paint3.setColor(2130706432);
                    } else {
                        matrix2.reset();
                        matrix2.postTranslate(0.0f, i);
                        matrix2.postScale(1.0f, Math.min(gm.L(40.0f), getMeasuredHeight() - i) / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint3.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i, getMeasuredWidth(), getMeasuredHeight(), paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable = (Drawable) this.d;
                kj8 kj8Var = (kj8) this.e;
                kj8Var.s0.setBounds(0, b10.z(2.0f, kj8Var.G1 + kj8Var.t0, 1), getMeasuredWidth(), getMeasuredHeight());
                kj8Var.s0.draw(canvas);
                super.dispatchDraw(canvas);
                x20 x20Var = kj8Var.H1;
                if (x20Var != null && x20Var.getVisibility() == 0 && kj8Var.H1.getAlpha() != 0.0f) {
                    drawable.setBounds(0, kj8Var.H1.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + kj8Var.H1.getBottom());
                    drawable.setAlpha((int) (kj8Var.H1.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    return;
                }
                return;
            case 12:
                wsa wsaVar = (wsa) this.e;
                iz0 iz0Var = wsaVar.o1;
                FrameLayout frameLayout = wsaVar.g2;
                wsaVar.R0(canvas, this);
                canvas.save();
                float f2 = f();
                float L = gm.L(12.0f);
                RectF rectF3 = (RectF) this.d;
                rectF3.set(wsaVar.u0, f2, getWidth() - wsaVar.u0, getHeight() + L);
                Paint paint4 = (Paint) this.c;
                paint4.setColor(cmb.v0(cmb.g5, wsaVar.J0));
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF3, L, L, Path.Direction.CW);
                canvas.drawPath(path, paint4);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint4.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(wsaVar.u0, getHeight() - getPaddingBottom(), getWidth() - wsaVar.u0, getHeight(), paint4);
                    paint4.setAlpha(255);
                }
                h();
                canvas.restore();
                if (iz0Var != null && iz0Var.getVisibility() == 0 && iz0Var.getAlpha() > 0.0f) {
                    if (iz0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(iz0Var.getX(), iz0Var.getY(), iz0Var.getMeasuredWidth() + iz0Var.getX(), iz0Var.getMeasuredHeight() + iz0Var.getY(), (int) (iz0Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(iz0Var.getX(), iz0Var.getY(), iz0Var.getX() + iz0Var.getMeasuredWidth(), iz0Var.getY() + iz0Var.getMeasuredHeight());
                    }
                    canvas.translate(iz0Var.getX(), iz0Var.getY());
                    iz0Var.draw(canvas);
                    canvas.restore();
                }
                wsaVar.Q0(canvas, this);
                return;
            case 13:
                Paint paint5 = (Paint) this.d;
                Paint paint6 = (Paint) this.b;
                RectF rectF4 = gm.P;
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float L2 = gm.L(8.0f);
                Paint paint7 = (Paint) this.c;
                paint7.setColor(0);
                float N = gm.N(1.0f);
                float N2 = gm.N(0.33f);
                rob robVar = (rob) this.e;
                paint7.setShadowLayer(N, 0.0f, N2, on2.p(-16777216, (int) (robVar.T1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF4, L2, L2, paint7);
                hob hobVar = robVar.z0;
                tnb tnbVar = robVar.a;
                cmb.s(this, hobVar, tnbVar);
                Paint d3 = tnbVar.d("paintChatActionBackground");
                int alpha2 = d3.getAlpha();
                d3.setAlpha((int) (robVar.T1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF4, L2, L2, d3);
                d3.setAlpha(alpha2);
                if (robVar.O1) {
                    float f3 = robVar.p1;
                    if (f3 > 0.0f) {
                        paint5.setColor(on2.p(-16777216, (int) (f3 * 255.0f * robVar.q1)));
                        canvas.drawRoundRect(rectF4, L2, L2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (robVar.T1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF4, L2, L2, paint6);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 9:
                kj8 kj8Var = (kj8) this.e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < gm.L(2.0f) + (kj8Var.G1 - kj8Var.t0)) {
                        kj8Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                wsa wsaVar = (wsa) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < f() && wsaVar.b.isAttachedToWindow()) {
                    wsaVar.dismiss();
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
                canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), ((lp0) this.e).v0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
                ylb ylbVar = (ylb) this.d;
                i15 i15Var = (i15) this.b;
                i15 i15Var2 = (i15) this.c;
                boolean drawChild = super.drawChild(canvas, view, j);
                hz2 hz2Var = (hz2) this.e;
                int i2 = (int) hz2Var.S1.f;
                if (view == hz2Var.c2 && i2 > 0) {
                    i15Var2.setBounds(0, gm.L(40.0f), getWidth(), gm.L(48.0f));
                    int i3 = cmb.g5;
                    i15Var2.b(cmb.v0(i3, ylbVar));
                    i15Var2.draw(canvas);
                    int L = gm.L(48.0f) + i2;
                    i15Var.setBounds(0, L - gm.L(8.0f), getWidth(), L);
                    i15Var.b(cmb.v0(i3, ylbVar));
                    i15Var.draw(canvas);
                }
                return drawChild;
            case 6:
                float[] fArr = (float[]) this.b;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.c;
                pv7 pv7Var = (pv7) this.e;
                o37 o37Var = pv7Var.t0;
                if (view == pv7Var.y0) {
                    rc2 q = u37.q(pv7Var);
                    if (q == null || (photoImage = q.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.N0 / pv7Var.A0, photoImage.O0 / pv7Var.B0);
                    matrix.postScale((pv7Var.A0 / pv7Var.y0.getWidth()) * max, (pv7Var.B0 / pv7Var.y0.getHeight()) * max);
                    matrix.postTranslate((photoImage.r() + (q.getX() + o37Var.getX())) - ((pv7Var.A0 * max) / 2.0f), (photoImage.s() + (q.getY() + o37Var.getY())) - ((pv7Var.B0 * max) / 2.0f));
                    pv7Var.y0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    gm.P.set(q.getX() + o37Var.getX() + photoImage.L0, q.getY() + o37Var.getY() + photoImage.M0, photoImage.w() + q.getX() + o37Var.getX(), photoImage.x() + q.getY() + o37Var.getY());
                    while (true) {
                        int[] iArr = photoImage.X0;
                        if (i < iArr.length) {
                            int i4 = i << 1;
                            float f = iArr[i];
                            fArr[i4] = f;
                            fArr[i4 + 1] = f;
                            i++;
                        } else {
                            path.addRoundRect(gm.P, fArr, Path.Direction.CW);
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
                    RectF rectF = gm.P;
                    rectF.set(getPaddingLeft(), gm.L(18.0f) + ((kj8) this.e).G1, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, gm.L(18.0f), gm.L(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 12:
                wsa wsaVar = (wsa) this.e;
                if (view == wsaVar.o1) {
                    return false;
                }
                if (view != wsaVar.Z1) {
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
        s09 s09Var = (s09) this.e;
        s09Var.animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.b).animate().alpha(1.0f).setDuration(150L).start();
        ((TextView) this.c).animate().alpha(1.0f).setDuration(150L).start();
        ((tk4) this.d).animate().alpha(0.0f).setDuration(150L).start();
        s09Var.d();
    }

    public final float f() {
        xra xraVar;
        float max = Math.max(0.0f, getHeight() - a());
        wsa wsaVar = (wsa) this.e;
        r59 r59Var = wsaVar.n1;
        int childCount = r59Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = r59Var.getChildAt(childCount);
            r59Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - wsaVar.a2.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a = (wsaVar.W2.a(4) * wsaVar.O()) + max;
        Float f = wsaVar.V2;
        if (f != null && (xraVar = wsaVar.W2) != null && xraVar.c < 1.0f) {
            return gm.R1(f.floatValue(), a, wsaVar.W2.c);
        }
        return a;
    }

    public final void g() {
        int i = cmb.F6;
        ylb ylbVar = ((ig4) this.e).a;
        int v0 = cmb.v0(i, ylbVar);
        ((ImageView) this.c).setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        ((TextView) this.b).setTextColor(v0);
        ((TextView) this.d).setTextColor(cmb.v0(cmb.x6, ylbVar));
        setBackground(cmb.f0(cmb.v0(cmb.h6, ylbVar), 2, -1));
    }

    public final void h() {
        float f = f();
        wsa wsaVar = (wsa) this.e;
        hra hraVar = wsaVar.Z1;
        hraVar.setTranslationY(f - hraVar.getHeight());
        float l = Utilities.l(gm.x1(f - hraVar.getHeight(), 0.0f, gm.L(32.0f)));
        hraVar.setAlpha(wsaVar.W2.a(0) * l);
        hraVar.setScaleX(gm.R1(0.5f, 1.0f, l));
        hraVar.setScaleY(gm.R1(0.5f, 1.0f, l));
        ssa ssaVar = wsaVar.a2;
        ssaVar.setTranslationY(f);
        wsaVar.b2.setTranslationY(ssaVar.getRealHeight() + f);
        wsaVar.n2.setTranslationY(ssaVar.getRealHeight() + f);
        wsaVar.w2.setTranslationY(ssaVar.getRealHeight() + f);
        wsaVar.y2.setTranslationY(ssaVar.getRealHeight() + f);
        FrameLayout frameLayout = wsaVar.F;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - gm.n);
        }
        gm.R3(wsaVar.j2, wsaVar.n1.canScrollVertically(1));
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
                float L = gm.L(4.0f);
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
                pv7 pv7Var = (pv7) this.e;
                o37 o37Var = pv7Var.t0;
                int measuredWidth2 = o37Var.getMeasuredWidth();
                for (int i7 = 0; i7 < o37Var.getChildCount(); i7++) {
                    View childAt3 = o37Var.getChildAt(i7);
                    int left = childAt3.getLeft();
                    childAt3.getRight();
                    if (childAt3 instanceof rc2) {
                        rc2 rc2Var = (rc2) childAt3;
                        left = childAt3.getLeft() + rc2Var.getBoundsLeft();
                        childAt3.getLeft();
                        rc2Var.getBoundsRight();
                    } else if (childAt3 instanceof cm1) {
                        cm1 cm1Var = (cm1) childAt3;
                        left = childAt3.getLeft() + cm1Var.getBoundsLeft();
                        childAt3.getLeft();
                        cm1Var.getBoundsRight();
                    }
                    measuredWidth2 = Math.min(left, measuredWidth2);
                }
                o37Var.layout(-measuredWidth2, 0, o37Var.getMeasuredWidth() - measuredWidth2, o37Var.getMeasuredHeight());
                TextureView textureView = pv7Var.y0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), o37Var.getMeasuredHeight());
                    return;
                }
                return;
            case 8:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.I0.getVisibility() != 8) {
                    if (photoViewer.T0.getVisibility() == 0) {
                        i5 = gm.L(63.0f);
                    }
                    int measuredWidth3 = (((i3 - i) - i5) - photoViewer.I0.getMeasuredWidth()) / 2;
                    qmb qmbVar = photoViewer.I0;
                    qmbVar.layout(measuredWidth3, qmbVar.getTop(), photoViewer.I0.getMeasuredWidth() + measuredWidth3, photoViewer.I0.getMeasuredHeight() + photoViewer.I0.getTop());
                    return;
                }
                return;
            case 12:
                super.onLayout(z, i, i2, i3, i4);
                wsa wsaVar = (wsa) this.e;
                FrameLayout frameLayout = wsaVar.i2;
                ny0 ny0Var = wsaVar.O2;
                if (ny0Var != null) {
                    int finalHeight = wsaVar.a2.getFinalHeight();
                    int p1 = wsaVar.p1();
                    if (wsaVar.W2.d(1) && frameLayout.getVisibility() == 0) {
                        i5 = frameLayout.getMeasuredHeight();
                    }
                    ny0Var.H(finalHeight, p1 + i5);
                }
                wsaVar.O1();
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
                io ioVar = limitPreviewView.w;
                TextView textView = limitPreviewView.x;
                yj3 yj3Var = limitPreviewView.h0;
                yj3 yj3Var2 = limitPreviewView.g0;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    yj3Var2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth2 = yj3Var2.getMeasuredWidth();
                    int measuredWidth3 = limitPreviewView.O.getMeasuredWidth() + gm.L(24.0f);
                    if (textView.getVisibility() == 0) {
                        i3 = textView.getMeasuredWidth() + gm.L(24.0f);
                    } else {
                        i3 = 0;
                    }
                    int max = Math.max(measuredWidth2, measuredWidth3 + i3);
                    yj3Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
                                measuredWidth = yj3Var2.getMeasuredWidth() - gm.L(8.0f);
                            }
                            if (!limitPreviewView.M) {
                                f2 = yj3Var.getMeasuredWidth() - gm.L(8.0f);
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
                        int measuredWidth4 = yj3Var.getMeasuredWidth();
                        int measuredWidth5 = limitPreviewView.P.getMeasuredWidth() + gm.L(24.0f);
                        if (ioVar.getVisibility() == 0) {
                            i5 = ioVar.getMeasuredWidth() + gm.L(24.0f);
                        }
                        int i8 = (int) Utilities.i(size * limitPreviewView.a, size - Math.max(measuredWidth4, measuredWidth5 + i5), max);
                        limitPreviewView.n = i8;
                        yj3Var2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        yj3Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
                pv7 pv7Var = (pv7) this.e;
                o37 o37Var = pv7Var.t0;
                o37Var.measure(i, 0);
                TextureView textureView = pv7Var.y0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(o37Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(o37Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth6 = o37Var.getMeasuredWidth();
                int i9 = 0;
                for (int i10 = 0; i10 < o37Var.getChildCount(); i10++) {
                    View childAt = o37Var.getChildAt(i10);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof rc2) {
                        rc2 rc2Var = (rc2) childAt;
                        left2 = childAt.getLeft() + rc2Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = rc2Var.getBoundsRight();
                    } else if (childAt instanceof cm1) {
                        cm1 cm1Var = (cm1) childAt;
                        left2 = childAt.getLeft() + cm1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = cm1Var.getBoundsRight();
                    } else {
                        measuredWidth6 = Math.min(left2, measuredWidth6);
                        i9 = Math.max(right, i9);
                    }
                    right = boundsRight + left;
                    measuredWidth6 = Math.min(left2, measuredWidth6);
                    i9 = Math.max(right, i9);
                }
                setMeasuredDimension(i9 - measuredWidth6, o37Var.getMeasuredHeight());
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.I0.getLayoutParams();
                if (photoViewer.T0.getVisibility() == 0) {
                    i7 = gm.L(63.0f);
                }
                layoutParams.rightMargin = i7;
                super.onMeasure(i, i2);
                return;
            case 9:
                kj8 kj8Var = (kj8) this.e;
                kj8Var.F1 = 0;
                ScrollView scrollView = (ScrollView) this.b;
                scrollView.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE));
                kj8Var.F1 = (View.MeasureSpec.getSize(i2) - scrollView.getMeasuredHeight()) + kj8Var.t0;
                super.onMeasure(i, i2);
                kj8Var.D0();
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 12:
                wsa wsaVar = (wsa) this.e;
                FrameLayout frameLayout = wsaVar.i2;
                int O = wsaVar.O();
                setPadding(0, 0, 0, O);
                ssa ssaVar = wsaVar.a2;
                ssaVar.N.setPadding(0, 0, 0, O);
                int size3 = View.MeasureSpec.getSize(i2);
                wsaVar.q1 = size3;
                int size4 = View.MeasureSpec.getSize(i);
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2 instanceof hg5) {
                        childAt2.measure(i, View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), 1073741824));
                    } else if (childAt2 == wsaVar.n1) {
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
                ny0 ny0Var = wsaVar.O2;
                if (ny0Var != null) {
                    int finalHeight = ssaVar.getFinalHeight();
                    int p1 = wsaVar.p1();
                    if (wsaVar.W2.d(1) && frameLayout.getVisibility() == 0) {
                        i6 = frameLayout.getMeasuredHeight();
                    }
                    ny0Var.H(finalHeight, p1 + i6);
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
                aa8 aa8Var = photoViewer.V1;
                if (aa8Var != null && aa8Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(photoViewer.D7[0] * f);
                }
                ba8 ba8Var = photoViewer.W1;
                if (ba8Var != null && ba8Var.getVisibility() != 8) {
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
                    photoViewer.W7.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                }
                ne6 ne6Var = photoViewer.Y1;
                if (ne6Var != null) {
                    ne6Var.setTranslationY(f);
                }
                TextView textView = photoViewer.Y7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.Y7.setTranslationY(f);
                    return;
                }
                return;
            case 9:
                super.setTranslationY(f);
                ((kj8) this.e).d0(f);
                return;
            case 10:
            case 11:
            default:
                super.setTranslationY(f);
                return;
            case 12:
                super.setTranslationY(f);
                FrameLayout frameLayout2 = ((wsa) this.e).F;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationY((getTranslationY() - a()) - gm.n);
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

    public jp0(Activity activity, lhc lhcVar) {
        super(activity);
        this.d = new e19[5];
        setWillNotDraw(false);
        su suVar = new su(activity, lhcVar);
        this.c = suVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        suVar.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i = 0; i < 5; i++) {
            ((e19[]) this.d)[i] = new e19(activity);
            ((e19[]) this.d)[i].setAllStarsProvider(new h68(this, (byte) 22));
            e19 e19Var = ((e19[]) this.d)[i];
            e19Var.d = new xr8(this, activity, (byte) 5);
            e19Var.f = i;
            ((FrameLayout) this.b).addView(e19Var, qoe.d(-2, -2.0f, 51, i * 41, 0.0f, 0.0f, 0.0f));
        }
        addView((su) this.c, qoe.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView((FrameLayout) this.b, qoe.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }

    public jp0(pv7 pv7Var, Context context) {
        super(context);
        this.e = pv7Var;
        this.c = new Matrix();
        this.b = new float[8];
        this.d = new Path();
    }

    public jp0(Context context) {
        super(context);
    }

    public jp0(LimitPreviewView limitPreviewView, Context context, ylb ylbVar) {
        super(context);
        this.e = limitPreviewView;
        this.d = ylbVar;
        this.c = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1);
    }

    public jp0(hz2 hz2Var, ylb ylbVar, Context context) {
        super(context);
        this.e = hz2Var;
        this.d = ylbVar;
        this.c = new i15(2);
        this.b = new i15(8);
    }

    public jp0(kj8 kj8Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = kj8Var;
        this.b = scrollView;
        this.d = drawable;
        this.c = new Path();
    }

    public jp0(Context context, ylb ylbVar) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        wi8.v(textView, 1, 20.0f);
        textView.setGravity(jb6.a0 ? 5 : 3);
        anb.X(textView, cmb.i5, ylbVar);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ee0 ee0Var = new ee0(false);
        this.d = ee0Var;
        imageView.setImageDrawable(ee0Var);
        ee0Var.a(-1);
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new wk8(this, (byte) 9));
        b(true);
        setMinimumHeight(gm.L(56.0f));
    }

    public jp0(lp0 lp0Var, Context context) {
        super(context);
        this.e = lp0Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.c = imageView;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 12.0f);
        addView(imageView, qoe.e(-2, -2, 1));
        addView(textView, qoe.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        setMinimumWidth(gm.L(100.0f));
        int L = gm.L(10.0f);
        int p = on2.p(-16777216, 80);
        setBackground(cmb.i0(L, L, L, L, 0, p, p));
    }

    public jp0(ig4 ig4Var, Context context) {
        super(context);
        this.e = ig4Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232222);
        addView(imageView, qoe.d(48, 48.0f, 19, 6.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setText(jb6.M0(2131750638, null));
        linearLayout.addView(textView, qoe.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setText(jb6.M0(2131750631, null));
        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 0, 1, 0, 0));
        addView(linearLayout, qoe.d(-1, -2.0f, 17, 56.0f, 0.0f, 56.0f, 0.0f));
        setContentDescription(jb6.M0(2131750638, null) + ", " + jb6.M0(2131750631, null));
        setOnClickListener(new sf3(this, (byte) 16));
        g();
    }

    public jp0(rob robVar, Activity activity) {
        super(activity);
        this.e = robVar;
        this.c = new Paint(1);
        this.b = new Paint(1);
        this.d = new Paint(1);
    }

    public jp0(wsa wsaVar, Context context) {
        super(context);
        this.e = wsaVar;
        this.d = new RectF();
        this.c = new Paint(1);
        this.b = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public jp0(d46 d46Var, Context context, ylb ylbVar) {
        super(context);
        this.e = d46Var;
        this.d = ylbVar;
        this.c = new nj8(cmb.Bk, cmb.Ck, -1, -1, ylbVar);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public jp0(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.c = new Paint(3);
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
