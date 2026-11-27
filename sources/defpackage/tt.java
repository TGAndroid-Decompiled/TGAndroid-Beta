package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;
public final class tt extends FrameLayout {
    public final byte a;
    public Object b;
    public Object c;

    public tt(Context context, vnb vnbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 16:
                super(context);
                this.c = new n15(8);
                this.b = vnbVar;
                return;
            default:
                LinearLayout j = uh9.j(context, 1);
                in inVar = new in(context, false, false, false);
                this.b = inVar;
                int i = aob.G6;
                yob.U(inVar, i, vnbVar);
                inVar.setTextSize(hl.L(17.0f));
                inVar.setTypeface(hl.o());
                j.addView(inVar, tre.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                yob.X(textView, i, vnbVar);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                j.addView(textView, tre.r(-2, -2, 1));
                addView(j, tre.e(-2, -2, 17));
                return;
        }
    }

    public final void b(Canvas canvas) {
        fz7 fz7Var = (fz7) this.c;
        Drawable drawable = fz7Var.a;
        if (drawable != null) {
            if (!(drawable instanceof hh7) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                int max = Math.max(0, fz7Var.H);
                float max2 = Math.max(getMeasuredWidth() / fz7Var.a.getIntrinsicWidth(), (getMeasuredHeight() + max) / fz7Var.a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(fz7Var.a.getIntrinsicWidth() * max2);
                int ceil2 = (int) Math.ceil(fz7Var.a.getIntrinsicHeight() * max2);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
                fz7Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                fz7Var.a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                fz7Var.a.draw(canvas);
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
        vnb vnbVar;
        Paint paint;
        boolean b1;
        boolean z;
        float f;
        float f2;
        float f3;
        ?? r13;
        hf0 hf0Var;
        float f4;
        int o;
        Paint paint2 = null;
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                int i = aob.a7;
                vnbVar = ((e) ((eo0) this.c).d).resourceProvider;
                paint3.setColor(aob.v0(i, vnbVar));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 3:
                rr0 rr0Var = (rr0) this.c;
                if (rr0Var.s != null && rr0Var.w) {
                    canvas.drawColor(Color.argb((int) (rr0Var.x * 56.0f), 0, 0, 0));
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            case 7:
            case 10:
            case 11:
            case 12:
            case 15:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.b;
                paint4.setColor(aob.v0(aob.a7, ((rg1) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 6:
                float L = hl.L(20.0f);
                RectF rectF = hl.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), hl.L(6.0f) + getPaddingTop());
                pm3 pm3Var = (pm3) this.c;
                pm3Var.r(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - hl.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                pm3Var.r(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 8:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                cb2 cb2Var = (cb2) this.c;
                int measuredWidth = cb2Var.getMeasuredWidth();
                int i2 = cb2Var.e;
                float x = cb2Var.getX();
                float f5 = cb2Var.d;
                vnb vnbVar2 = cb2Var.c;
                if (vnbVar2 != null) {
                    vnbVar2.b(x, f5, measuredWidth, i2);
                } else {
                    aob.q(x, f5, measuredWidth, i2);
                }
                float L2 = hl.L(18.0f);
                float L3 = hl.L(18.0f);
                if (vnbVar2 != null) {
                    paint = vnbVar2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = aob.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, L2, L3, paint);
                if (vnbVar2 != null) {
                    b1 = vnbVar2.g();
                } else {
                    b1 = aob.b1();
                }
                if (b1) {
                    float L4 = hl.L(18.0f);
                    float L5 = hl.L(18.0f);
                    if (vnbVar2 != null) {
                        paint2 = vnbVar2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = aob.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, L4, L5, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.b;
                paint5.setColor(aob.v0(aob.d7, ((oe2) this.c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 13:
                super.dispatchDraw(canvas);
                float L6 = hl.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L6, height, hl.N(9.2f), (Paint) this.b);
                for (int i3 = -1; i3 <= 1; i3++) {
                    canvas.drawCircle(bp1.e(4.0f, i3, L6), height, hl.N(1.35f), (Paint) this.c);
                }
                return;
            case 14:
                c24 c24Var = (c24) this.c;
                if (!c24Var.H.v0 && c24Var.x > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint6 = new Paint();
                        this.b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, hl.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (c24Var.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, hl.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 16:
                n15 n15Var = (n15) this.c;
                n15Var.b(aob.p1(0.65f, aob.v0(aob.d6, (vnb) this.b)));
                n15Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 19:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                g75 g75Var = (g75) this.c;
                jc0 jc0Var = g75Var.K;
                TextView textView = g75Var.L;
                float f6 = g75Var.P;
                if (f6 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    jc0Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - k43.f.getInterpolation(f6);
                    float left = (g75Var.Q - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((g75Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    jc0Var.setTranslationX(left);
                    textView.setTranslationX(-((g75Var.R - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 25:
                al8 al8Var = (al8) this.b;
                al8Var.d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF3 = hl.P;
                rectF3.set(0.0f, hl.L(2.0f), getMeasuredWidth(), hl.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Paint paint7 = al8Var.f;
                paint7.setAlpha(((xk8) this.c).E1);
                canvas.drawRoundRect(rectF3, hl.L(24.0f) - 1, hl.L(24.0f) - 1, paint7);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 26:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.a5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX() + profileActivity.b5, profileActivity.r.getY());
                    f = 0.0f;
                    f2 = 28.0f;
                    r13 = 0;
                    z = true;
                    f3 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.a5.getMeasuredWidth(), profileActivity.a5.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.a5.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    z = true;
                    f = 0.0f;
                    f2 = 28.0f;
                    f3 = 24.0f;
                    r13 = 0;
                }
                if (profileActivity.v5 && profileActivity.x6 != f && profileActivity.t5 != 1.0f) {
                    float measuredHeight = (profileActivity.r.getMeasuredHeight() / 2.0f) + profileActivity.r.getY();
                    float L7 = hl.L(22.0f);
                    float x2 = ((profileActivity.r.getX() + (hl.L(f2) - profileActivity.u5)) - L7) - profileActivity.l2();
                    profileActivity.x5.i0(x2, measuredHeight - (L7 / 2.0f), L7, L7);
                    profileActivity.x5.setAlpha(profileActivity.x6);
                    canvas.save();
                    float f7 = profileActivity.x6;
                    canvas.scale(f7, f7, profileActivity.x5.r(), profileActivity.x5.s());
                    profileActivity.x5.h(canvas, null);
                    canvas.restore();
                    int i4 = (profileActivity.t5 > f ? 1 : (profileActivity.t5 == f ? 0 : -1));
                    za1 za1Var = (za1) this.b;
                    if (i4 == 0) {
                        if (za1Var == null) {
                            za1 za1Var2 = new za1(this);
                            this.b = za1Var2;
                            za1Var2.h = new uk8(this, (byte) 7);
                        }
                        float L8 = (1.0f - profileActivity.t5) * hl.L(f2);
                        float textWidth = profileActivity.r.getTextWidth();
                        if (profileActivity.T != null) {
                            f4 = profileActivity.T.getVisibilityFactor() * (hl.L(f3) + textWidth + hl.L(4.0f));
                        } else {
                            f4 = f;
                        }
                        RectF rectF4 = hl.P;
                        rectF4.set(x2 - hl.L(4.0f), measuredHeight - hl.L(14.0f), x2 + Math.max(textWidth, f4) + L8 + hl.L(4.0f), measuredHeight + hl.L(14.0f));
                        za1 za1Var3 = (za1) this.b;
                        za1Var3.i = r13;
                        za1Var3.c = r13;
                        za1Var3.a(rectF4);
                        za1 za1Var4 = (za1) this.b;
                        za1Var4.n = z;
                        int o2 = vm2.o(-1, 50);
                        za1Var4.g.setColor((int) r13);
                        hf0 hf0Var2 = za1Var4.e;
                        if (hf0Var2 != null) {
                            aob.F1(hf0Var2, o2, z);
                        }
                        za1 za1Var5 = (za1) this.b;
                        za1Var5.c(canvas, za1Var5.g);
                        hf0 hf0Var3 = za1Var5.e;
                        if (hf0Var3 != null) {
                            hf0Var3.draw(canvas);
                            return;
                        }
                        return;
                    } else if (za1Var != null && (hf0Var = za1Var.e) != null) {
                        hf0Var.setState(StateSet.NOTHING);
                        hf0Var.jumpToCurrentState();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 27:
                RectF rectF5 = (RectF) this.c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                kjc kjcVar = (kjc) this.b;
                kjcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, hl.L(28.0f), hl.L(28.0f), kjcVar.b());
                super.dispatchDraw(canvas);
                return;
            case 28:
                Paint paint8 = (Paint) this.b;
                i49 i49Var = (i49) this.c;
                vnb vnbVar3 = i49Var.l0;
                byte b = i49Var.N0;
                if (b != 1 && b != 2 && b != 4) {
                    o = vm2.f(0.7f, aob.v0(aob.F8, vnbVar3), aob.v0(aob.h5, vnbVar3));
                } else {
                    o = vm2.o(-1, 30);
                }
                paint8.setColor(o);
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - hl.N(6.0f)) / 2.0f;
                float d = i49Var.d();
                RectF rectF6 = hl.P;
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
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 12:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    e53 e53Var = (e53) this.c;
                    if (!e53Var.k) {
                        return true;
                    }
                    e53Var.d();
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
            case 12:
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
                lmb m = oVar.R0.m(getContext());
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
            case 16:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 18:
                zj5 zj5Var = (zj5) ((am2) this.c).c;
                if (zj5Var != null) {
                    return zj5Var.a(motionEvent, new a15(this, (byte) 0));
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
            case 11:
                if (view instanceof qx7) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            case 22:
                Path path = (Path) this.b;
                uy5 uy5Var = (uy5) this.c;
                if (uy5Var.h != null) {
                    if (uy5Var.f) {
                        if (view == uy5Var.d) {
                            f = uy5Var.e;
                            canvas.save();
                            path.rewind();
                            path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                    } else if (view == uy5Var.c) {
                        f = 1.0f - uy5Var.e;
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
            case 23:
                Path path2 = (Path) this.b;
                bx7 bx7Var = (bx7) this.c;
                if (bx7Var.h != null) {
                    if (bx7Var.f) {
                        if (view == bx7Var.d) {
                            f2 = bx7Var.e;
                            canvas.save();
                            path2.rewind();
                            path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f2 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path2);
                            boolean drawChild3 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild3;
                        }
                    } else if (view == bx7Var.c) {
                        f2 = 1.0f - bx7Var.e;
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
            case 26:
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
            case 29:
                if (view == ((SecretMediaViewer) this.b).x || !super.drawChild(canvas, view, j)) {
                    return false;
                }
                return true;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    public final void e(float f) {
        in inVar = (in) this.b;
        inVar.a();
        inVar.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(ete.a(f, 0.0f, 1.0f) * 100.0f))), !ob6.a0, true);
        s61 s61Var = (s61) this.c;
        s61Var.c = f;
        s61Var.invalidate();
    }

    @Override
    public final boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 12:
                e53 e53Var = (e53) this.c;
                float f = e53Var.u;
                float f2 = rect.bottom;
                if (f != f2 && e53Var.v) {
                    e53Var.u = f2;
                    tt ttVar = e53Var.c;
                    d53 d53Var = e53Var.a;
                    if (!e53Var.q) {
                        float f3 = e53Var.t;
                        int L = hl.L(32.0f);
                        byte b = e53Var.y;
                        if (b == 1 || b == 2) {
                            L = hl.L(24.0f);
                        }
                        float f4 = L;
                        if (d53Var.getMeasuredHeight() + f3 > (ttVar.getMeasuredHeight() - e53Var.u) - f4) {
                            f3 = ((ttVar.getMeasuredHeight() - e53Var.u) - d53Var.getMeasuredHeight()) - f4;
                        }
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        d53Var.animate().translationY(f3).setDuration(250L).setUpdateListener(new z43(e53Var, (byte) 1)).setInterpolator(k43.f).start();
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
            case 15:
                super.invalidate();
                ((ll4) this.c).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                ((p82) this.b).c();
                return;
            case 11:
                super.onAttachedToWindow();
                rw2 rw2Var = (rw2) this.c;
                rw2Var.A.I();
                rw2Var.B.I();
                return;
            case 12:
                super.onAttachedToWindow();
                setTag(2131296353, (t10) this.b);
                return;
            case 26:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).x5.I();
                return;
            case 29:
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
            case 7:
                super.onDetachedFromWindow();
                ((p82) this.b).d();
                return;
            case 11:
                super.onDetachedFromWindow();
                rw2 rw2Var = (rw2) this.c;
                rw2Var.A.K();
                rw2Var.B.K();
                return;
            case 12:
                super.onDetachedFromWindow();
                setTag(2131296353, null);
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).x5.K();
                return;
            case 29:
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
            case 11:
                rw2 rw2Var = (rw2) this.b;
                Paint paint = rw2Var.N;
                ImageReceiver imageReceiver = rw2Var.B;
                ColorDrawable colorDrawable = rw2Var.u;
                ImageReceiver imageReceiver2 = rw2Var.A;
                if (rw2Var.z != null) {
                    if (rw2Var.K && rw2Var.v == null && rw2Var.w != null && !rw2Var.e0) {
                        rw2Var.e0 = true;
                        imageReceiver2.v0(false, false);
                        mu9.d(new n82(rw2Var, (byte) 11));
                    }
                    if (rw2Var.v != null) {
                        boolean z = rw2Var.K;
                        float f = rw2Var.M;
                        if (z) {
                            if (f != 1.0f) {
                                float f2 = f + 0.13333334f;
                                rw2Var.M = f2;
                                if (f2 > 1.0f) {
                                    rw2Var.M = 1.0f;
                                }
                                rw2Var.z.invalidate();
                            }
                        } else if (f != 0.0f) {
                            float f3 = f - 0.13333334f;
                            rw2Var.M = f3;
                            if (f3 < 0.0f) {
                                rw2Var.M = 0.0f;
                            }
                            rw2Var.z.invalidate();
                        }
                        float f4 = rw2Var.M;
                        if (f4 != 0.0f && rw2Var.v != null) {
                            paint.setAlpha((int) (f4 * 255.0f));
                            if (paint.getAlpha() != 255) {
                                canvas.drawColor(aob.p1(rw2Var.M, aob.v0(aob.a7, rw2Var.c0)));
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (rw2Var.F * 180.0f));
                    colorDrawable.setBounds(0, 0, rw2Var.z.getWidth(), rw2Var.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    mq5 mq5Var = rw2Var.q;
                    int i3 = mq5Var.d;
                    int i4 = mq5Var.b;
                    int i5 = i3 + i4;
                    if (rw2Var.V == 1) {
                        i = Math.min(rw2Var.z.getWidth(), rw2Var.z.getHeight() - i5) - hl.L(40.0f);
                    } else {
                        boolean z2 = rw2Var.S;
                        tt ttVar = rw2Var.z;
                        if (z2) {
                            min = Math.min(ttVar.getWidth(), rw2Var.z.getHeight() - i5) - hl.N(40.0f);
                        } else {
                            min = Math.min(ttVar.getWidth(), rw2Var.z.getHeight() - i5) / 1.8f;
                        }
                        i = (int) min;
                    }
                    int i6 = (i / 2) + i4;
                    if (rw2Var.G != null) {
                        i2 = hl.L(40.0f);
                    } else {
                        i2 = 0;
                    }
                    float max = Math.max(i6 + i2, ((rw2Var.z.getHeight() - i5) - rw2Var.I) / 2);
                    if (rw2Var.S) {
                        max += hl.L(40.0f);
                    }
                    canvas.translate(rw2Var.z.getWidth() / 2, rw2Var.e + max);
                    int i7 = (int) (i * ((rw2Var.F * 0.8f) / 0.8f));
                    if (rw2Var.V == 3) {
                        canvas.translate(0.0f, hl.L(70.0f));
                    }
                    boolean z3 = rw2Var.S;
                    float f5 = rw2Var.F;
                    if (z3) {
                        float f6 = i7;
                        float f7 = 0.6669f * f6;
                        imageReceiver2.setAlpha(f5);
                        float f8 = f6 - f7;
                        float f9 = f6 / 2.0f;
                        imageReceiver2.i0((f8 - f9) - (0.0546875f * f6), (f8 / 2.0f) - f9, f7, f7);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(rw2Var.F);
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
                    if (rw2Var.C != null) {
                        canvas.save();
                        float f13 = (-i7) / 2.0f;
                        canvas.translate(f13, f13);
                        float f14 = i7;
                        canvas.scale(f14 / rw2Var.C.getWidth(), f14 / rw2Var.C.getHeight());
                        rw2Var.C.setAlpha(rw2Var.F);
                        Path path = rw2Var.D;
                        if (path == null) {
                            path = new Path();
                            rw2Var.D = path;
                        }
                        path.rewind();
                        RectF rectF = hl.P;
                        rectF.set(0.0f, 0.0f, rw2Var.C.getWidth(), rw2Var.C.getHeight());
                        float f15 = f14 / 8.0f;
                        rw2Var.D.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                        canvas.clipPath(rw2Var.D);
                        rw2Var.C.draw(canvas);
                        canvas.restore();
                    }
                    if (rw2Var.V == 1 && !rw2Var.m && (drawable = rw2Var.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = rw2Var.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.Q0.top - hl.L(((rw2Var.d / hl.L(60.0f)) * 6.0f) + 17.0f));
                        rw2Var.J.setAlpha((int) ((1.0f - rw2Var.g) * 255.0f));
                        rw2Var.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        rw2Var.J.draw(canvas);
                    }
                    if (rw2Var.G != null) {
                        if (rw2Var.S) {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver.O0) / 2.0f) - hl.L(30.0f));
                        } else {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver2.O0) / 2.0f) - hl.L(30.0f));
                        }
                        rw2.f0.setAlpha((int) (rw2Var.F * 255.0f));
                        rw2Var.G.draw(canvas);
                    }
                    canvas.restore();
                    boolean z4 = rw2Var.E;
                    float f16 = rw2Var.F;
                    if (z4) {
                        if (f16 != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - rw2Var.H;
                            rw2Var.H = currentTimeMillis;
                            rw2Var.F = (((float) j) / 120.0f) + rw2Var.F;
                            rw2Var.z.invalidate();
                            if (rw2Var.F > 1.0f) {
                                rw2Var.F = 1.0f;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (f16 != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j2 = currentTimeMillis2 - rw2Var.H;
                        rw2Var.H = currentTimeMillis2;
                        rw2Var.F -= ((float) j2) / 120.0f;
                        rw2Var.z.invalidate();
                        float f17 = rw2Var.F;
                        if (f17 < 0.0f) {
                            rw2Var.F = 0.0f;
                            f17 = 0.0f;
                        }
                        if (f17 == 0.0f) {
                            imageReceiver2.g0(null);
                            hl.K3(rw2Var.w);
                            hl.c3(new cw2(rw2Var, (byte) 1));
                            Bitmap bitmap = rw2Var.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                rw2Var.v = null;
                            }
                            hl.T3(rw2Var.O, false, 1.0f, true, false);
                            rw2Var.M = 0.0f;
                            try {
                                if (rw2Var.y.getParent() != null) {
                                    ((WindowManager) rw2Var.w.getSystemService("window")).removeView(rw2Var.y);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                cc4.g(e, true);
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 24:
                b(canvas);
                fz7 fz7Var = (fz7) this.c;
                if (fz7Var.K != null && fz7Var.L != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    fz7Var.K.eraseColor(0);
                    fz7Var.L.save();
                    fz7Var.L.scale(fz7Var.K.getWidth() / getMeasuredWidth(), fz7Var.K.getHeight() / getMeasuredHeight());
                    b(fz7Var.L);
                    fz7Var.L.restore();
                    fz7Var.J.d();
                    return;
                }
                return;
            case 29:
                ((SecretMediaViewer) this.b).g(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        za1 za1Var;
        switch (this.a) {
            case 18:
                zj5 zj5Var = (zj5) ((am2) this.c).d;
                if (zj5Var != null) {
                    return zj5Var.a(motionEvent, new a15(this, (byte) 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                if ((((ProfileActivity) this.c).t5 == 0.0f && (za1Var = (za1) this.b) != null && za1Var.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
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
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                rr0 rr0Var = (rr0) this.c;
                sr0 sr0Var = rr0Var.d;
                if (sr0Var != null) {
                    sr0Var.setChromeTop(Math.max(0, rr0.Z(rr0Var).getBottom() - rr0Var.d.x.top));
                }
                qr0 qr0Var = rr0Var.e;
                if (qr0Var != null) {
                    qr0Var.b();
                    return;
                }
                return;
            case 18:
                super.onLayout(z, i, i2, i3, i4);
                dc6 dc6Var = (dc6) ((am2) this.c).e;
                if (dc6Var != null) {
                    dc6Var.run();
                    return;
                }
                return;
            case 20:
                super.onLayout(z, i, i2, i3, i4);
                int i6 = (i4 - i2) / 4;
                int i7 = i6 * 3;
                int D = ik8.D(275.0f, i7, 2);
                yr5 yr5Var = (yr5) this.c;
                FrameLayout frameLayout = yr5Var.r;
                frameLayout.layout(0, D, frameLayout.getMeasuredWidth(), yr5Var.r.getMeasuredHeight() + D);
                int L = hl.L(139.0f) + hl.L(150.0f) + D;
                int measuredWidth = (getMeasuredWidth() - yr5Var.e.getMeasuredWidth()) / 2;
                zw0 zw0Var = yr5Var.e;
                zw0Var.layout(measuredWidth, L, zw0Var.getMeasuredWidth() + measuredWidth, yr5Var.e.getMeasuredHeight() + L);
                fic ficVar = yr5Var.d;
                ficVar.layout(0, 0, ficVar.getMeasuredWidth(), yr5Var.d.getMeasuredHeight());
                int measuredHeight = ((i6 - yr5Var.n.getMeasuredHeight()) / 2) + i7;
                int measuredWidth2 = (getMeasuredWidth() - yr5Var.n.getMeasuredWidth()) / 2;
                u8 u8Var = yr5Var.n;
                u8Var.layout(measuredWidth2, measuredHeight, u8Var.getMeasuredWidth() + measuredWidth2, yr5Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - hl.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - yr5Var.f.getMeasuredWidth()) / 2;
                TextView textView = yr5Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), yr5Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = hl.L(4.0f);
                if (!hl.O1()) {
                    i5 = hl.m;
                }
                int i8 = L3 + i5;
                if (marginLayoutParams.topMargin != i8) {
                    marginLayoutParams.topMargin = i8;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 21:
                int L4 = hl.L(25.0f) + hl.L(150.0f) + ik8.D(275.0f, ((i4 - i2) / 4) * 3, 2);
                int L5 = hl.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = hl.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = hl.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 26:
                super.onLayout(z, i, i2, i3, i4);
                ((ProfileActivity) this.c).K3();
                return;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + hl.m;
                    dy9 dy9Var = secretMediaViewer.n;
                    dy9Var.layout(dy9Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + hl.m)) - hl.L(10.0f);
                    kg5 kg5Var = secretMediaViewer.r;
                    kg5Var.layout(kg5Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight() + hl.m;
                    ic8 ic8Var = secretMediaViewer.Z;
                    ic8Var.layout(ic8Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i9 = i4 - i2;
                    view.layout(0, i9, i3 - i, hl.n + i9);
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
                super.onMeasure(i, ik8.E(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), 1073741824));
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(350.0f), 1073741824));
                return;
            case 9:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                return;
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.b;
                nu2 nu2Var = (nu2) this.c;
                if (nu2Var.L && nu2Var.K) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i2);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (hl.q.y - a.getCurrentActionBarHeight()) - hl.m;
                }
                int L2 = hl.L(50.0f);
                if (nu2Var.w != 0) {
                    L = 0;
                } else {
                    L = hl.L(30.0f) + L2;
                }
                if (!nu2Var.F && !nu2Var.x) {
                    L += L2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i3 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                return;
            case 17:
                yx4 yx4Var = (yx4) this.c;
                ArrayList arrayList = yx4Var.A2;
                TextPaint textPaint = (TextPaint) this.b;
                textPaint.setTextSize(hl.L(14.0f));
                textPaint.setTypeface(hl.o());
                int L3 = hl.L(14.0f);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    L3 = uh9.w(24.0f, (int) Math.ceil(textPaint.measureText(((CharSequence) arrayList.get(i4)).toString())), L3);
                }
                int size2 = View.MeasureSpec.getSize(i);
                int min = Math.min(L3, Math.max(0, size2 - hl.L(32.0f)));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yx4Var.z2.getLayoutParams();
                layoutParams.width = min;
                layoutParams.leftMargin = (size2 - min) / 2;
                super.onMeasure(i, i2);
                return;
            case 25:
                super.onMeasure(i, ik8.E(2.0f, ((xk8) this.c).t1, 1073741824));
                return;
            case 29:
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                ic8 ic8Var = secretMediaViewer.Z;
                if (ic8Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight - a.getCurrentActionBarHeight()) - hl.m;
                    if (secretMediaViewer.T.getVisibility() == 0) {
                        i3 = secretMediaViewer.T.getMeasuredHeight();
                    }
                    ic8Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - i3, 1073741824));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.n, 1073741824));
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
            case 16:
                super.onSizeChanged(i, i2, i3, i4);
                n15 n15Var = (n15) this.c;
                n15Var.setBounds(0, 0, i, i2);
                n15Var.c(0, hl.L(24.0f) + getPaddingBottom());
                return;
            case 24:
                fz7 fz7Var = (fz7) this.c;
                nz4 nz4Var = fz7Var.I;
                super.onSizeChanged(i, i2, i3, i4);
                if (i > 0 && i2 > 0) {
                    fz7Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i2 * 54) / i)), Bitmap.Config.ARGB_8888);
                    fz7Var.L = new Canvas(fz7Var.K);
                    nz4Var.a(fz7Var.K);
                    nz4Var.b(i, i2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onViewAdded(View view) {
        switch (this.a) {
            case 3:
                super.onViewAdded(view);
                if (view instanceof sr0) {
                    view.setOutlineProvider(new dl0(this, (byte) 1));
                    view.setClipToOutline(true);
                    return;
                }
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public final void setBackgroundColor(int i) {
        switch (this.a) {
            case 24:
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
            case 15:
                super.setTranslationX(f);
                ((ll4) this.c).invalidate();
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 15:
                super.setTranslationY(f);
                ((ll4) this.c).invalidate();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    private final void a(boolean z) {
    }

    public tt(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public tt(cb2 cb2Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = cb2Var;
        this.b = new RectF();
    }

    public tt(e53 e53Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.c = e53Var;
        this.b = new t10(this, (byte) 8);
    }

    public tt(rg1 rg1Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = rg1Var;
        this.b = new Paint(1);
    }

    public tt(eo0 eo0Var, Activity activity) {
        super(activity);
        this.a = (byte) 2;
        this.c = eo0Var;
        this.b = new Paint(1);
    }

    public tt(t82 t82Var, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = t82Var;
        this.b = new p82(this, this);
    }

    public tt(Activity activity, kjc kjcVar) {
        super(activity);
        this.a = (byte) 27;
        this.c = new RectF();
        this.b = kjcVar;
        kjcVar.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        textView.setTextColor(-1);
        qd4.u(15.0f, 2131742906, 1, textView, null);
        textView.setGravity(1);
        textView.setTypeface(hl.o());
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(ob6.M0(2131742907, null));
        addView(textView, tre.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, tre.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    public tt(am2 am2Var, Context context) {
        super(context);
        this.a = (byte) 18;
        this.c = am2Var;
        ?? obj = new Object();
        obj.c = new i09((Object) obj, (byte) 24);
        obj.h = new ArrayList();
        obj.d = this;
        obj.e = context;
        this.b = obj;
        setClickable(true);
    }

    public tt(fz7 fz7Var, Context context) {
        super(context);
        this.a = (byte) 24;
        this.c = fz7Var;
        this.b = new Paint();
    }

    public tt(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = (byte) 21;
        this.b = textView;
        this.c = textView2;
    }

    public tt(rr0 rr0Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.c = rr0Var;
        this.b = new RectF();
        setClipChildren(false);
    }

    public tt(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = (byte) 29;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public tt(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }

    public tt(oe2 oe2Var, Context context) {
        super(context);
        this.a = (byte) 9;
        this.c = oe2Var;
        this.b = new Paint();
    }

    public tt(Context context, int i, int i2) {
        super(context);
        this.a = (byte) 13;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        qd4.u(16.0f, 2131744992, 1, textView, null);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, tre.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.66f));
        paint.setColor(i2);
        paint2.setColor(i2);
    }

    public tt(rw2 rw2Var, Activity activity) {
        super(activity);
        this.a = (byte) 11;
        this.c = rw2Var;
        this.b = rw2Var;
        setWillNotDraw(false);
    }

    public tt(i49 i49Var, Context context) {
        super(context);
        this.a = (byte) 28;
        this.c = i49Var;
        this.b = new Paint(1);
    }

    public tt(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 6:
                super(context);
                this.b = new Path();
                this.c = new pm3((byte) 7);
                return;
            default:
                return;
        }
    }

    public tt(uy5 uy5Var, Context context) {
        super(context);
        this.a = (byte) 22;
        this.c = uy5Var;
        this.b = new Path();
    }

    public tt(bx7 bx7Var, Context context) {
        super(context);
        this.a = (byte) 23;
        this.c = bx7Var;
        this.b = new Path();
    }
}
