package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;
public final class st extends FrameLayout {
    public final byte a;
    public Object b;
    public Object c;

    public st(Context context, wjb wjbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 15:
                super(context);
                this.c = new jz4(8);
                this.b = wjbVar;
                return;
            default:
                LinearLayout j = de9.j(context, 1);
                hn hnVar = new hn(context, false, false, false);
                this.b = hnVar;
                int i = bkb.F6;
                zkb.U(hnVar, i, wjbVar);
                hnVar.setTextSize(gl.L(17.0f));
                hnVar.setTypeface(gl.o());
                j.addView(hnVar, nme.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                zkb.X(textView, i, wjbVar);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                j.addView(textView, nme.r(-2, -2, 1));
                addView(j, nme.e(-2, -2, 17));
                return;
        }
    }

    public final void b(Canvas canvas) {
        yv7 yv7Var = (yv7) this.c;
        Drawable drawable = yv7Var.a;
        if (drawable != null) {
            if (!(drawable instanceof ye7) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                int max = Math.max(0, yv7Var.H);
                float max2 = Math.max(getMeasuredWidth() / yv7Var.a.getIntrinsicWidth(), (getMeasuredHeight() + max) / yv7Var.a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(yv7Var.a.getIntrinsicWidth() * max2);
                int ceil2 = (int) Math.ceil(yv7Var.a.getIntrinsicHeight() * max2);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
                yv7Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                yv7Var.a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                yv7Var.a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.b);
    }

    public final Boolean c(MotionEvent motionEvent) {
        return Boolean.valueOf(super.dispatchTouchEvent(motionEvent));
    }

    public final Boolean d(MotionEvent motionEvent) {
        return Boolean.valueOf(super.onInterceptTouchEvent(motionEvent));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wjb wjbVar;
        Paint paint;
        boolean b1;
        ?? r8;
        float f;
        float f2;
        float f3;
        boolean z;
        ff0 ff0Var;
        float f4;
        int o;
        Paint paint2 = null;
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                int i = bkb.Z6;
                wjbVar = ((d) ((eo0) this.c).d).resourceProvider;
                paint3.setColor(bkb.v0(i, wjbVar));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 4:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.b;
                paint4.setColor(bkb.v0(bkb.Z6, ((ig1) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 5:
                float L = gl.L(20.0f);
                RectF rectF = gl.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), gl.L(6.0f) + getPaddingTop());
                xl3 xl3Var = (xl3) this.c;
                xl3Var.s(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - gl.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                xl3Var.s(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 7:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                ma2 ma2Var = (ma2) this.c;
                int measuredWidth = ma2Var.getMeasuredWidth();
                int i2 = ma2Var.e;
                float x = ma2Var.getX();
                float f5 = ma2Var.d;
                wjb wjbVar2 = ma2Var.c;
                if (wjbVar2 != null) {
                    wjbVar2.b(x, f5, measuredWidth, i2);
                } else {
                    bkb.q(x, f5, measuredWidth, i2);
                }
                float L2 = gl.L(18.0f);
                float L3 = gl.L(18.0f);
                if (wjbVar2 != null) {
                    paint = wjbVar2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = bkb.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, L2, L3, paint);
                if (wjbVar2 != null) {
                    b1 = wjbVar2.g();
                } else {
                    b1 = bkb.b1();
                }
                if (b1) {
                    float L4 = gl.L(18.0f);
                    float L5 = gl.L(18.0f);
                    if (wjbVar2 != null) {
                        paint2 = wjbVar2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = bkb.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, L4, L5, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.b;
                paint5.setColor(bkb.v0(bkb.c7, ((xd2) this.c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 12:
                super.dispatchDraw(canvas);
                float L6 = gl.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L6, height, gl.N(9.2f), (Paint) this.b);
                for (int i3 = -1; i3 <= 1; i3++) {
                    canvas.drawCircle(oo1.e(4.0f, i3, L6), height, gl.N(1.35f), (Paint) this.c);
                }
                return;
            case 13:
                h14 h14Var = (h14) this.c;
                if (!h14Var.H.v0 && h14Var.x > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint6 = new Paint();
                        this.b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, gl.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (h14Var.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, gl.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 15:
                jz4 jz4Var = (jz4) this.c;
                jz4Var.b(bkb.p1(0.65f, bkb.v0(bkb.c6, (wjb) this.b)));
                jz4Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 18:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                e55 e55Var = (e55) this.c;
                hc0 hc0Var = e55Var.K;
                TextView textView = e55Var.L;
                float f6 = e55Var.P;
                if (f6 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    hc0Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - s33.f.getInterpolation(f6);
                    float left = (e55Var.Q - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((e55Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    hc0Var.setTranslationX(left);
                    textView.setTranslationX(-((e55Var.R - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 24:
                mh8 mh8Var = (mh8) this.b;
                mh8Var.d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF3 = gl.P;
                rectF3.set(0.0f, gl.L(2.0f), getMeasuredWidth(), gl.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Paint paint7 = mh8Var.f;
                paint7.setAlpha(((jh8) this.c).E1);
                canvas.drawRoundRect(rectF3, gl.L(24.0f) - 1, gl.L(24.0f) - 1, paint7);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 25:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.a5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX() + profileActivity.b5, profileActivity.r.getY());
                    f = 0.0f;
                    f2 = 28.0f;
                    z = true;
                    r8 = 0;
                    f3 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.a5.getMeasuredWidth(), profileActivity.a5.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.a5.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    r8 = 0;
                    f = 0.0f;
                    f2 = 28.0f;
                    f3 = 24.0f;
                    z = true;
                }
                if (profileActivity.v5 && profileActivity.x6 != f && profileActivity.t5 != 1.0f) {
                    float measuredHeight = (profileActivity.r.getMeasuredHeight() / 2.0f) + profileActivity.r.getY();
                    float L7 = gl.L(22.0f);
                    float x2 = ((profileActivity.r.getX() + (gl.L(f2) - profileActivity.u5)) - L7) - profileActivity.k2();
                    profileActivity.x5.i0(x2, measuredHeight - (L7 / 2.0f), L7, L7);
                    profileActivity.x5.setAlpha(profileActivity.x6);
                    canvas.save();
                    float f7 = profileActivity.x6;
                    canvas.scale(f7, f7, profileActivity.x5.r(), profileActivity.x5.s());
                    profileActivity.x5.h(canvas, null);
                    canvas.restore();
                    int i4 = (profileActivity.t5 > f ? 1 : (profileActivity.t5 == f ? 0 : -1));
                    ra1 ra1Var = (ra1) this.b;
                    if (i4 == 0) {
                        if (ra1Var == null) {
                            ra1 ra1Var2 = new ra1(this);
                            this.b = ra1Var2;
                            ra1Var2.h = new w88(this, (byte) 21);
                        }
                        float L8 = (1.0f - profileActivity.t5) * gl.L(f2);
                        float textWidth = profileActivity.r.getTextWidth();
                        if (profileActivity.T != null) {
                            f4 = profileActivity.T.getVisibilityFactor() * (gl.L(f3) + textWidth + gl.L(4.0f));
                        } else {
                            f4 = f;
                        }
                        RectF rectF4 = gl.P;
                        rectF4.set(x2 - gl.L(4.0f), measuredHeight - gl.L(14.0f), x2 + Math.max(textWidth, f4) + L8 + gl.L(4.0f), measuredHeight + gl.L(14.0f));
                        ra1 ra1Var3 = (ra1) this.b;
                        ra1Var3.i = r8;
                        ra1Var3.c = r8;
                        ra1Var3.a(rectF4);
                        ra1 ra1Var4 = (ra1) this.b;
                        ra1Var4.n = z;
                        int o2 = bm2.o(-1, 50);
                        ra1Var4.g.setColor((int) r8);
                        ff0 ff0Var2 = ra1Var4.e;
                        if (ff0Var2 != null) {
                            bkb.F1(ff0Var2, o2, z);
                        }
                        ra1 ra1Var5 = (ra1) this.b;
                        ra1Var5.c(canvas, ra1Var5.g);
                        ff0 ff0Var3 = ra1Var5.e;
                        if (ff0Var3 != null) {
                            ff0Var3.draw(canvas);
                            return;
                        }
                        return;
                    } else if (ra1Var != null && (ff0Var = ra1Var.e) != null) {
                        ff0Var.setState(StateSet.NOTHING);
                        ff0Var.jumpToCurrentState();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 26:
                RectF rectF5 = (RectF) this.c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                lfc lfcVar = (lfc) this.b;
                lfcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, gl.L(28.0f), gl.L(28.0f), lfcVar.b());
                super.dispatchDraw(canvas);
                return;
            case 27:
                Paint paint8 = (Paint) this.b;
                t09 t09Var = (t09) this.c;
                wjb wjbVar3 = t09Var.l0;
                byte b = t09Var.N0;
                if (b != 1 && b != 2 && b != 4) {
                    o = bm2.f(0.7f, bkb.v0(bkb.E8, wjbVar3), bkb.v0(bkb.g5, wjbVar3));
                } else {
                    o = bm2.o(-1, 30);
                }
                paint8.setColor(o);
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - gl.N(6.0f)) / 2.0f;
                float d = t09Var.d();
                RectF rectF6 = gl.P;
                rectF6.set(measuredWidth2 - measuredWidth3, (measuredHeight2 - measuredWidth3) - d, measuredWidth2 + measuredWidth3, measuredHeight2 + measuredWidth3 + d);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight2);
                canvas.drawRoundRect(rectF6, measuredWidth3, measuredWidth3, paint8);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, d);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 11:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    m43 m43Var = (m43) this.c;
                    if (!m43Var.k) {
                        return true;
                    }
                    m43Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
        switch (this.a) {
            case 11:
                return;
            default:
                super.dispatchSetPressed(z);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                o oVar = (o) this.c;
                qib m = oVar.R0.m(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (oVar.R0.w() && oVar.R0.m(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (m.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && oVar.R0.w() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!oVar.R0.m(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 17:
                xh5 xh5Var = (xh5) ((gl2) this.c).c;
                if (xh5Var != null) {
                    return xh5Var.a(motionEvent, new wy4(this, (byte) 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        float f2;
        switch (this.a) {
            case 10:
                if (view instanceof ju7) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            case 21:
                Path path = (Path) this.b;
                pw5 pw5Var = (pw5) this.c;
                if (pw5Var.h != null) {
                    if (pw5Var.f) {
                        if (view == pw5Var.d) {
                            f = pw5Var.e;
                            canvas.save();
                            path.rewind();
                            path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                    } else if (view == pw5Var.c) {
                        f = 1.0f - pw5Var.e;
                        canvas.save();
                        path.rewind();
                        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path);
                        boolean drawChild2 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild2;
                    }
                }
                return super.drawChild(canvas, view, j);
            case 22:
                Path path2 = (Path) this.b;
                ut7 ut7Var = (ut7) this.c;
                if (ut7Var.h != null) {
                    if (ut7Var.f) {
                        if (view == ut7Var.d) {
                            f2 = ut7Var.e;
                            canvas.save();
                            path2.rewind();
                            path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f2 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path2);
                            boolean drawChild3 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild3;
                        }
                    } else if (view == ut7Var.c) {
                        f2 = 1.0f - ut7Var.e;
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f2 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        boolean drawChild32 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild32;
                    }
                }
                return super.drawChild(canvas, view, j);
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                float f3 = profileActivity.R1;
                if (f3 < 1.0f && view != profileActivity.a0 && view != profileActivity.c0 && view != profileActivity.d0) {
                    if (f3 <= 0.0f) {
                        return false;
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (profileActivity.R1 * 255.0f), 31);
                    boolean drawChild4 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j);
            case 28:
                if (view == ((SecretMediaViewer) this.b).x || !super.drawChild(canvas, view, j)) {
                    return false;
                }
                return true;
            case 29:
                Path path3 = (Path) this.b;
                qu9 qu9Var = (qu9) this.c;
                RectF rectF = qu9Var.S;
                if (view != qu9Var.O && view != qu9Var.y) {
                    if (view == qu9Var.Q) {
                        canvas.save();
                        path3.rewind();
                        path3.addCircle(rectF.centerX() + qu9Var.O.getX(), rectF.centerY() + qu9Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path3);
                        canvas.clipRect(0.0f, gl.R1(qu9Var.U, 0.0f, qu9Var.s), getWidth(), gl.R1(qu9Var.V, getHeight(), qu9Var.s));
                        canvas.translate(-qu9Var.Q.getX(), -qu9Var.Q.getY());
                        canvas.translate(qu9Var.O.getX() + rectF.left, qu9Var.O.getY() + rectF.top);
                        canvas.scale(rectF.width() / qu9Var.Q.getMeasuredWidth(), rectF.height() / qu9Var.Q.getMeasuredHeight(), qu9Var.Q.getX(), qu9Var.Q.getY());
                        boolean drawChild5 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild5;
                    }
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, gl.R1(qu9Var.U, 0.0f, qu9Var.s), getWidth(), gl.R1(qu9Var.V, getHeight(), qu9Var.s));
                boolean drawChild6 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild6;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    public final void e(float f) {
        hn hnVar = (hn) this.b;
        hnVar.a();
        hnVar.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(moe.a(f, 0.0f, 1.0f) * 100.0f))), !k96.a0, true);
        k61 k61Var = (k61) this.c;
        k61Var.c = f;
        k61Var.invalidate();
    }

    @Override
    public final boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 11:
                m43 m43Var = (m43) this.c;
                float f = m43Var.u;
                float f2 = rect.bottom;
                if (f != f2 && m43Var.v) {
                    m43Var.u = f2;
                    st stVar = m43Var.c;
                    l43 l43Var = m43Var.a;
                    if (!m43Var.q) {
                        float f3 = m43Var.t;
                        int L = gl.L(32.0f);
                        byte b = m43Var.y;
                        if (b == 1 || b == 2) {
                            L = gl.L(24.0f);
                        }
                        float f4 = L;
                        if (l43Var.getMeasuredHeight() + f3 > (stVar.getMeasuredHeight() - m43Var.u) - f4) {
                            f3 = ((stVar.getMeasuredHeight() - m43Var.u) - l43Var.getMeasuredHeight()) - f4;
                        }
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        l43Var.animate().translationY(f3).setDuration(250L).setUpdateListener(new h43(m43Var, (byte) 1)).setInterpolator(s33.f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 14:
                super.invalidate();
                ((hj4) this.c).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 6:
                super.onAttachedToWindow();
                ((y72) this.b).c();
                return;
            case 10:
                super.onAttachedToWindow();
                xv2 xv2Var = (xv2) this.c;
                xv2Var.A.I();
                xv2Var.B.I();
                return;
            case 11:
                super.onAttachedToWindow();
                setTag(2131296353, (s10) this.b);
                return;
            case 25:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).x5.I();
                return;
            case 28:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.b).h.I();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                super.onDetachedFromWindow();
                ((y72) this.b).d();
                return;
            case 10:
                super.onDetachedFromWindow();
                xv2 xv2Var = (xv2) this.c;
                xv2Var.A.K();
                xv2Var.B.K();
                return;
            case 11:
                super.onDetachedFromWindow();
                setTag(2131296353, null);
                return;
            case 25:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).x5.K();
                return;
            case 28:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.b).h.K();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float min;
        int i;
        int i2;
        StaticLayout staticLayout;
        Drawable drawable;
        switch (this.a) {
            case 10:
                xv2 xv2Var = (xv2) this.b;
                Paint paint = xv2Var.N;
                ImageReceiver imageReceiver = xv2Var.B;
                ColorDrawable colorDrawable = xv2Var.u;
                ImageReceiver imageReceiver2 = xv2Var.A;
                if (xv2Var.z != null) {
                    if (xv2Var.K && xv2Var.v == null && xv2Var.w != null && !xv2Var.e0) {
                        xv2Var.e0 = true;
                        imageReceiver2.v0(false, false);
                        tq9.d(new w72(xv2Var, (byte) 11));
                    }
                    if (xv2Var.v != null) {
                        boolean z = xv2Var.K;
                        float f = xv2Var.M;
                        if (z) {
                            if (f != 1.0f) {
                                float f2 = f + 0.13333334f;
                                xv2Var.M = f2;
                                if (f2 > 1.0f) {
                                    xv2Var.M = 1.0f;
                                }
                                xv2Var.z.invalidate();
                            }
                        } else if (f != 0.0f) {
                            float f3 = f - 0.13333334f;
                            xv2Var.M = f3;
                            if (f3 < 0.0f) {
                                xv2Var.M = 0.0f;
                            }
                            xv2Var.z.invalidate();
                        }
                        float f4 = xv2Var.M;
                        if (f4 != 0.0f && xv2Var.v != null) {
                            paint.setAlpha((int) (f4 * 255.0f));
                            if (paint.getAlpha() != 255) {
                                canvas.drawColor(bkb.p1(xv2Var.M, bkb.v0(bkb.Z6, xv2Var.c0)));
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (xv2Var.F * 180.0f));
                    colorDrawable.setBounds(0, 0, xv2Var.z.getWidth(), xv2Var.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    io5 io5Var = xv2Var.q;
                    int i3 = io5Var.d;
                    int i4 = io5Var.b;
                    int i5 = i3 + i4;
                    if (xv2Var.V == 1) {
                        i = Math.min(xv2Var.z.getWidth(), xv2Var.z.getHeight() - i5) - gl.L(40.0f);
                    } else {
                        boolean z2 = xv2Var.S;
                        st stVar = xv2Var.z;
                        if (z2) {
                            min = Math.min(stVar.getWidth(), xv2Var.z.getHeight() - i5) - gl.N(40.0f);
                        } else {
                            min = Math.min(stVar.getWidth(), xv2Var.z.getHeight() - i5) / 1.8f;
                        }
                        i = (int) min;
                    }
                    int i6 = (i / 2) + i4;
                    if (xv2Var.G != null) {
                        i2 = gl.L(40.0f);
                    } else {
                        i2 = 0;
                    }
                    float max = Math.max(i6 + i2, ((xv2Var.z.getHeight() - i5) - xv2Var.I) / 2);
                    if (xv2Var.S) {
                        max += gl.L(40.0f);
                    }
                    canvas.translate(xv2Var.z.getWidth() / 2, xv2Var.e + max);
                    int i7 = (int) (i * ((xv2Var.F * 0.8f) / 0.8f));
                    if (xv2Var.V == 3) {
                        canvas.translate(0.0f, gl.L(70.0f));
                    }
                    boolean z3 = xv2Var.S;
                    float f5 = xv2Var.F;
                    if (z3) {
                        float f6 = i7;
                        float f7 = 0.6669f * f6;
                        imageReceiver2.setAlpha(f5);
                        float f8 = f6 - f7;
                        float f9 = f6 / 2.0f;
                        imageReceiver2.i0((f8 - f9) - (0.0546875f * f6), (f8 / 2.0f) - f9, f7, f7);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(xv2Var.F);
                        float f10 = (-i7) / 2.0f;
                        imageReceiver.i0(f10, f10, f6, f6);
                        imageReceiver.h(canvas, null);
                    } else {
                        imageReceiver2.setAlpha(f5);
                        float f11 = (-i7) / 2.0f;
                        float f12 = i7;
                        imageReceiver2.i0(f11, f11, f12, f12);
                        imageReceiver2.h(canvas, null);
                    }
                    if (xv2Var.C != null) {
                        canvas.save();
                        float f13 = (-i7) / 2.0f;
                        canvas.translate(f13, f13);
                        float f14 = i7;
                        canvas.scale(f14 / xv2Var.C.getWidth(), f14 / xv2Var.C.getHeight());
                        xv2Var.C.setAlpha(xv2Var.F);
                        Path path = xv2Var.D;
                        if (path == null) {
                            path = new Path();
                            xv2Var.D = path;
                        }
                        path.rewind();
                        RectF rectF = gl.P;
                        rectF.set(0.0f, 0.0f, xv2Var.C.getWidth(), xv2Var.C.getHeight());
                        float f15 = f14 / 8.0f;
                        xv2Var.D.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                        canvas.clipPath(xv2Var.D);
                        xv2Var.C.draw(canvas);
                        canvas.restore();
                    }
                    if (xv2Var.V == 1 && !xv2Var.m && (drawable = xv2Var.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = xv2Var.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.Q0.top - gl.L(((xv2Var.d / gl.L(60.0f)) * 6.0f) + 17.0f));
                        xv2Var.J.setAlpha((int) ((1.0f - xv2Var.g) * 255.0f));
                        xv2Var.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        xv2Var.J.draw(canvas);
                    }
                    if (xv2Var.G != null) {
                        if (xv2Var.S) {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver.O0) / 2.0f) - gl.L(30.0f));
                        } else {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver2.O0) / 2.0f) - gl.L(30.0f));
                        }
                        xv2.f0.setAlpha((int) (xv2Var.F * 255.0f));
                        xv2Var.G.draw(canvas);
                    }
                    canvas.restore();
                    boolean z4 = xv2Var.E;
                    float f16 = xv2Var.F;
                    if (z4) {
                        if (f16 != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - xv2Var.H;
                            xv2Var.H = currentTimeMillis;
                            xv2Var.F = (((float) j) / 120.0f) + xv2Var.F;
                            xv2Var.z.invalidate();
                            if (xv2Var.F > 1.0f) {
                                xv2Var.F = 1.0f;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (f16 != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j2 = currentTimeMillis2 - xv2Var.H;
                        xv2Var.H = currentTimeMillis2;
                        xv2Var.F -= ((float) j2) / 120.0f;
                        xv2Var.z.invalidate();
                        float f17 = xv2Var.F;
                        if (f17 < 0.0f) {
                            xv2Var.F = 0.0f;
                            f17 = 0.0f;
                        }
                        if (f17 == 0.0f) {
                            imageReceiver2.g0(null);
                            gl.K3(xv2Var.w);
                            gl.c3(new iv2(xv2Var, (byte) 1));
                            Bitmap bitmap = xv2Var.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                xv2Var.v = null;
                            }
                            gl.T3(xv2Var.O, false, 1.0f, true, false);
                            xv2Var.M = 0.0f;
                            try {
                                if (xv2Var.y.getParent() != null) {
                                    ((WindowManager) xv2Var.w.getSystemService("window")).removeView(xv2Var.y);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                fa4.g(e, true);
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 23:
                b(canvas);
                yv7 yv7Var = (yv7) this.c;
                if (yv7Var.K != null && yv7Var.L != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    yv7Var.K.eraseColor(0);
                    yv7Var.L.save();
                    yv7Var.L.scale(yv7Var.K.getWidth() / getMeasuredWidth(), yv7Var.K.getHeight() / getMeasuredHeight());
                    b(yv7Var.L);
                    yv7Var.L.restore();
                    yv7Var.J.d();
                    return;
                }
                return;
            case 28:
                ((SecretMediaViewer) this.b).g(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ra1 ra1Var;
        switch (this.a) {
            case 17:
                xh5 xh5Var = (xh5) ((gl2) this.c).d;
                if (xh5Var != null) {
                    return xh5Var.a(motionEvent, new wy4(this, (byte) 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                if ((((ProfileActivity) this.c).t5 == 0.0f && (ra1Var = (ra1) this.b) != null && ra1Var.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        switch (this.a) {
            case 17:
                super.onLayout(z, i, i2, i3, i4);
                t96 t96Var = (t96) ((gl2) this.c).e;
                if (t96Var != null) {
                    t96Var.run();
                    return;
                }
                return;
            case 19:
                super.onLayout(z, i, i2, i3, i4);
                int i6 = (i4 - i2) / 4;
                int i7 = i6 * 3;
                int D = ug8.D(275.0f, i7, 2);
                wp5 wp5Var = (wp5) this.c;
                FrameLayout frameLayout = wp5Var.r;
                frameLayout.layout(0, D, frameLayout.getMeasuredWidth(), wp5Var.r.getMeasuredHeight() + D);
                int L = gl.L(139.0f) + gl.L(150.0f) + D;
                int measuredWidth = (getMeasuredWidth() - wp5Var.e.getMeasuredWidth()) / 2;
                qw0 qw0Var = wp5Var.e;
                qw0Var.layout(measuredWidth, L, qw0Var.getMeasuredWidth() + measuredWidth, wp5Var.e.getMeasuredHeight() + L);
                gec gecVar = wp5Var.d;
                gecVar.layout(0, 0, gecVar.getMeasuredWidth(), wp5Var.d.getMeasuredHeight());
                int measuredHeight = ((i6 - wp5Var.n.getMeasuredHeight()) / 2) + i7;
                int measuredWidth2 = (getMeasuredWidth() - wp5Var.n.getMeasuredWidth()) / 2;
                t8 t8Var = wp5Var.n;
                t8Var.layout(measuredWidth2, measuredHeight, t8Var.getMeasuredWidth() + measuredWidth2, wp5Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - gl.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - wp5Var.f.getMeasuredWidth()) / 2;
                TextView textView = wp5Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), wp5Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = gl.L(4.0f);
                if (!gl.O1()) {
                    i5 = gl.m;
                }
                int i8 = L3 + i5;
                if (marginLayoutParams.topMargin != i8) {
                    marginLayoutParams.topMargin = i8;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 20:
                int L4 = gl.L(25.0f) + gl.L(150.0f) + ug8.D(275.0f, ((i4 - i2) / 4) * 3, 2);
                int L5 = gl.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = gl.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = gl.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 25:
                super.onLayout(z, i, i2, i3, i4);
                ((ProfileActivity) this.c).J3();
                return;
            case 28:
                super.onLayout(z, i, i2, i3, i4);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + gl.m;
                    iu9 iu9Var = secretMediaViewer.n;
                    iu9Var.layout(iu9Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + gl.m)) - gl.L(10.0f);
                    je5 je5Var = secretMediaViewer.r;
                    je5Var.layout(je5Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight() + gl.m;
                    r88 r88Var = secretMediaViewer.Z;
                    r88Var.layout(r88Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i9 = i4 - i2;
                    view.layout(0, i9, i3 - i, gl.n + i9);
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        int i3 = 0;
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                super.onMeasure(i, ug8.E(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), 1073741824));
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(350.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
                return;
            case 9:
                ViewGroup viewGroup = (ViewGroup) this.b;
                tt2 tt2Var = (tt2) this.c;
                if (tt2Var.L && tt2Var.K) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i2);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (gl.q.y - a.getCurrentActionBarHeight()) - gl.m;
                }
                int L2 = gl.L(50.0f);
                if (tt2Var.w != 0) {
                    L = 0;
                } else {
                    L = gl.L(30.0f) + L2;
                }
                if (!tt2Var.F && !tt2Var.x) {
                    L += L2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i3 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                return;
            case 16:
                tv4 tv4Var = (tv4) this.c;
                ArrayList arrayList = tv4Var.A2;
                TextPaint textPaint = (TextPaint) this.b;
                textPaint.setTextSize(gl.L(14.0f));
                textPaint.setTypeface(gl.o());
                int L3 = gl.L(14.0f);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    L3 = de9.w(24.0f, (int) Math.ceil(textPaint.measureText(((CharSequence) arrayList.get(i4)).toString())), L3);
                }
                int size2 = View.MeasureSpec.getSize(i);
                int min = Math.min(L3, Math.max(0, size2 - gl.L(32.0f)));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tv4Var.z2.getLayoutParams();
                layoutParams.width = min;
                layoutParams.leftMargin = (size2 - min) / 2;
                super.onMeasure(i, i2);
                return;
            case 24:
                super.onMeasure(i, ug8.E(2.0f, ((jh8) this.c).t1, 1073741824));
                return;
            case 28:
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                r88 r88Var = secretMediaViewer.Z;
                if (r88Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight - a.getCurrentActionBarHeight()) - gl.m;
                    if (secretMediaViewer.T.getVisibility() == 0) {
                        i3 = secretMediaViewer.T.getMeasuredHeight();
                    }
                    r88Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - i3, 1073741824));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.n, 1073741824));
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 15:
                super.onSizeChanged(i, i2, i3, i4);
                jz4 jz4Var = (jz4) this.c;
                jz4Var.setBounds(0, 0, i, i2);
                jz4Var.c(0, gl.L(24.0f) + getPaddingBottom());
                return;
            case 23:
                yv7 yv7Var = (yv7) this.c;
                hx4 hx4Var = yv7Var.I;
                super.onSizeChanged(i, i2, i3, i4);
                if (i > 0 && i2 > 0) {
                    yv7Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i2 * 54) / i)), Bitmap.Config.ARGB_8888);
                    yv7Var.L = new Canvas(yv7Var.K);
                    hx4Var.a(yv7Var.K);
                    hx4Var.b(i, i2);
                    return;
                }
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void setBackgroundColor(int i) {
        switch (this.a) {
            case 23:
                ((Paint) this.b).setColor(i);
                return;
            default:
                super.setBackgroundColor(i);
                return;
        }
    }

    @Override
    public final void setTranslationX(float f) {
        switch (this.a) {
            case 14:
                super.setTranslationX(f);
                ((hj4) this.c).invalidate();
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 14:
                super.setTranslationY(f);
                ((hj4) this.c).invalidate();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    private final void a(boolean z) {
    }

    public st(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public st(ma2 ma2Var, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = ma2Var;
        this.b = new RectF();
    }

    public st(m43 m43Var, Context context) {
        super(context);
        this.a = (byte) 11;
        this.c = m43Var;
        this.b = new s10(this, (byte) 8);
    }

    public st(ig1 ig1Var, Context context) {
        super(context);
        this.a = (byte) 4;
        this.c = ig1Var;
        this.b = new Paint(1);
    }

    public st(qu9 qu9Var, Activity activity) {
        super(activity);
        this.a = (byte) 29;
        this.c = qu9Var;
        this.b = new Path();
    }

    public st(eo0 eo0Var, Activity activity) {
        super(activity);
        this.a = (byte) 2;
        this.c = eo0Var;
        this.b = new Paint(1);
    }

    public st(c82 c82Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = c82Var;
        this.b = new y72(this, this);
    }

    public st(Activity activity, lfc lfcVar) {
        super(activity);
        this.a = (byte) 26;
        this.c = new RectF();
        this.b = lfcVar;
        lfcVar.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        textView.setTextColor(-1);
        tb4.u(15.0f, 2131743012, 1, textView, null);
        textView.setGravity(1);
        textView.setTypeface(gl.o());
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(k96.M0(2131743013, null));
        addView(textView, nme.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, nme.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    public st(gl2 gl2Var, Context context) {
        super(context);
        this.a = (byte) 17;
        this.c = gl2Var;
        ?? obj = new Object();
        obj.c = new ln8((Object) obj, (byte) 25);
        obj.h = new ArrayList();
        obj.d = this;
        obj.e = context;
        this.b = obj;
        setClickable(true);
    }

    public st(yv7 yv7Var, Context context) {
        super(context);
        this.a = (byte) 23;
        this.c = yv7Var;
        this.b = new Paint();
    }

    public st(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = (byte) 20;
        this.b = textView;
        this.c = textView2;
    }

    public st(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = (byte) 28;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public st(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }

    public st(Context context, int i, int i2) {
        super(context);
        this.a = (byte) 12;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        tb4.u(16.0f, 2131745074, 1, textView, null);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, nme.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(1.66f));
        paint.setColor(i2);
        paint2.setColor(i2);
    }

    public st(xd2 xd2Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = xd2Var;
        this.b = new Paint();
    }

    public st(xv2 xv2Var, Activity activity) {
        super(activity);
        this.a = (byte) 10;
        this.c = xv2Var;
        this.b = xv2Var;
        setWillNotDraw(false);
    }

    public st(t09 t09Var, Context context) {
        super(context);
        this.a = (byte) 27;
        this.c = t09Var;
        this.b = new Paint(1);
    }

    public st(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 5:
                super(context);
                this.b = new Path();
                this.c = new xl3((byte) 7);
                return;
            default:
                return;
        }
    }

    public st(pw5 pw5Var, Context context) {
        super(context);
        this.a = (byte) 21;
        this.c = pw5Var;
        this.b = new Path();
    }

    public st(ut7 ut7Var, Context context) {
        super(context);
        this.a = (byte) 22;
        this.c = ut7Var;
        this.b = new Path();
    }
}
