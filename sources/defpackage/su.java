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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;
public final class su extends FrameLayout {
    public final byte a;
    public Object b;
    public Object c;

    public su(Context context, ylb ylbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 16:
                super(context);
                this.c = new i15(8);
                this.b = ylbVar;
                return;
            default:
                LinearLayout i = hg9.i(context, 1);
                io ioVar = new io(context, false, false, false);
                this.b = ioVar;
                int i2 = cmb.F6;
                anb.U(ioVar, i2, ylbVar);
                ioVar.setTextSize(gm.L(17.0f));
                ioVar.setTypeface(gm.o());
                i.addView(ioVar, qoe.r(-2, 23, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTextSize(1, 11.0f);
                anb.X(textView, i2, ylbVar);
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                i.addView(textView, qoe.r(-2, -2, 1));
                addView(i, qoe.e(-2, -2, 17));
                return;
        }
    }

    public final void b(Canvas canvas) {
        by7 by7Var = (by7) this.c;
        Drawable drawable = by7Var.a;
        if (drawable != null) {
            if (!(drawable instanceof ah7) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                int max = Math.max(0, by7Var.H);
                float max2 = Math.max(getMeasuredWidth() / by7Var.a.getIntrinsicWidth(), (getMeasuredHeight() + max) / by7Var.a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(by7Var.a.getIntrinsicWidth() * max2);
                int ceil2 = (int) Math.ceil(by7Var.a.getIntrinsicHeight() * max2);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
                by7Var.a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                by7Var.a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                by7Var.a.draw(canvas);
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
        ylb ylbVar;
        Paint paint;
        boolean b1;
        boolean z;
        float f;
        float f2;
        float f3;
        ?? r13;
        fg0 fg0Var;
        float f4;
        int p;
        Paint paint2 = null;
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.b;
                int i = cmb.Z6;
                ylbVar = ((d) ((ep0) this.c).d).resourceProvider;
                paint3.setColor(cmb.v0(i, ylbVar));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 3:
                rs0 rs0Var = (rs0) this.c;
                if (rs0Var.s != null && rs0Var.w) {
                    canvas.drawColor(Color.argb((int) (rs0Var.x * 56.0f), 0, 0, 0));
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
                paint4.setColor(cmb.v0(cmb.Z6, ((qh1) this.c).f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 6:
                float L = gm.L(20.0f);
                RectF rectF = gm.P;
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), gm.L(6.0f) + getPaddingTop());
                in3 in3Var = (in3) this.c;
                in3Var.r(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - gm.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                in3Var.r(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 8:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                xb2 xb2Var = (xb2) this.c;
                int measuredWidth = xb2Var.getMeasuredWidth();
                int i2 = xb2Var.e;
                float x = xb2Var.getX();
                float f5 = xb2Var.d;
                ylb ylbVar2 = xb2Var.c;
                if (ylbVar2 != null) {
                    ylbVar2.b(x, f5, measuredWidth, i2);
                } else {
                    cmb.q(x, f5, measuredWidth, i2);
                }
                float L2 = gm.L(18.0f);
                float L3 = gm.L(18.0f);
                if (ylbVar2 != null) {
                    paint = ylbVar2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = cmb.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, L2, L3, paint);
                if (ylbVar2 != null) {
                    b1 = ylbVar2.g();
                } else {
                    b1 = cmb.b1();
                }
                if (b1) {
                    float L4 = gm.L(18.0f);
                    float L5 = gm.L(18.0f);
                    if (ylbVar2 != null) {
                        paint2 = ylbVar2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = cmb.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, L4, L5, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.b;
                paint5.setColor(cmb.v0(cmb.c7, ((if2) this.c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 13:
                super.dispatchDraw(canvas);
                float L6 = gm.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L6, height, gm.N(9.2f), (Paint) this.b);
                for (int i3 = -1; i3 <= 1; i3++) {
                    canvas.drawCircle(aq1.e(4.0f, i3, L6), height, gm.N(1.35f), (Paint) this.c);
                }
                return;
            case 14:
                s24 s24Var = (s24) this.c;
                if (!s24Var.H.v0 && s24Var.x > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint6 = new Paint();
                        this.b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, gm.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (s24Var.x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, gm.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 16:
                i15 i15Var = (i15) this.c;
                i15Var.b(cmb.p1(0.65f, cmb.v0(cmb.c6, (ylb) this.b)));
                i15Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 19:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.b;
                c75 c75Var = (c75) this.c;
                hd0 hd0Var = c75Var.K;
                TextView textView = c75Var.L;
                float f6 = c75Var.P;
                if (f6 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    hd0Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - d53.f.getInterpolation(f6);
                    float left = (c75Var.Q - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((c75Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    hd0Var.setTranslationX(left);
                    textView.setTranslationX(-((c75Var.R - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 25:
                nj8 nj8Var = (nj8) this.b;
                nj8Var.d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF3 = gm.P;
                rectF3.set(0.0f, gm.L(2.0f), getMeasuredWidth(), gm.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Paint paint7 = nj8Var.f;
                paint7.setAlpha(((kj8) this.c).E1);
                canvas.drawRoundRect(rectF3, gm.L(24.0f) - 1, gm.L(24.0f) - 1, paint7);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 26:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                if (profileActivity.f5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.r.getX() + profileActivity.g5, profileActivity.r.getY());
                    f = 0.0f;
                    f2 = 28.0f;
                    r13 = 0;
                    z = true;
                    f3 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.f5.getMeasuredWidth(), profileActivity.f5.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.f5.draw(canvas);
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
                if (profileActivity.A5 && profileActivity.C6 != f && profileActivity.y5 != 1.0f) {
                    float measuredHeight = (profileActivity.r.getMeasuredHeight() / 2.0f) + profileActivity.r.getY();
                    float L7 = gm.L(22.0f);
                    float x2 = ((profileActivity.r.getX() + (gm.L(f2) - profileActivity.z5)) - L7) - profileActivity.m2();
                    profileActivity.C5.i0(x2, measuredHeight - (L7 / 2.0f), L7, L7);
                    profileActivity.C5.setAlpha(profileActivity.C6);
                    canvas.save();
                    float f7 = profileActivity.C6;
                    canvas.scale(f7, f7, profileActivity.C5.r(), profileActivity.C5.s());
                    profileActivity.C5.h(canvas, null);
                    canvas.restore();
                    int i4 = (profileActivity.y5 > f ? 1 : (profileActivity.y5 == f ? 0 : -1));
                    zb1 zb1Var = (zb1) this.b;
                    if (i4 == 0) {
                        if (zb1Var == null) {
                            zb1 zb1Var2 = new zb1(this);
                            this.b = zb1Var2;
                            zb1Var2.h = new q78(this, (byte) 29);
                        }
                        float L8 = (1.0f - profileActivity.y5) * gm.L(f2);
                        float textWidth = profileActivity.r.getTextWidth();
                        if (profileActivity.T != null) {
                            f4 = profileActivity.T.getVisibilityFactor() * (gm.L(f3) + textWidth + gm.L(4.0f));
                        } else {
                            f4 = f;
                        }
                        RectF rectF4 = gm.P;
                        rectF4.set(x2 - gm.L(4.0f), measuredHeight - gm.L(14.0f), x2 + Math.max(textWidth, f4) + L8 + gm.L(4.0f), measuredHeight + gm.L(14.0f));
                        zb1 zb1Var3 = (zb1) this.b;
                        zb1Var3.i = r13;
                        zb1Var3.c = r13;
                        zb1Var3.a(rectF4);
                        zb1 zb1Var4 = (zb1) this.b;
                        zb1Var4.n = z;
                        int p2 = on2.p(-1, 50);
                        zb1Var4.g.setColor((int) r13);
                        fg0 fg0Var2 = zb1Var4.e;
                        if (fg0Var2 != null) {
                            cmb.F1(fg0Var2, p2, z);
                        }
                        zb1 zb1Var5 = (zb1) this.b;
                        zb1Var5.c(canvas, zb1Var5.g);
                        fg0 fg0Var3 = zb1Var5.e;
                        if (fg0Var3 != null) {
                            fg0Var3.draw(canvas);
                            return;
                        }
                        return;
                    } else if (zb1Var != null && (fg0Var = zb1Var.e) != null) {
                        fg0Var.setState(StateSet.NOTHING);
                        fg0Var.jumpToCurrentState();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 27:
                RectF rectF5 = (RectF) this.c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                lhc lhcVar = (lhc) this.b;
                lhcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, gm.L(28.0f), gm.L(28.0f), lhcVar.b());
                super.dispatchDraw(canvas);
                return;
            case 28:
                Paint paint8 = (Paint) this.b;
                v29 v29Var = (v29) this.c;
                ylb ylbVar3 = v29Var.l0;
                byte b = v29Var.N0;
                if (b != 1 && b != 2 && b != 4) {
                    p = on2.f(0.7f, cmb.v0(cmb.E8, ylbVar3), cmb.v0(cmb.g5, ylbVar3));
                } else {
                    p = on2.p(-1, 30);
                }
                paint8.setColor(p);
                float measuredHeight2 = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - gm.N(6.0f)) / 2.0f;
                float d = v29Var.d();
                RectF rectF6 = gm.P;
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
                    x53 x53Var = (x53) this.c;
                    if (!x53Var.k) {
                        return true;
                    }
                    x53Var.d();
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
                rkb m = oVar.R0.m(getContext());
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
                wj5 wj5Var = (wj5) ((sm2) this.c).c;
                if (wj5Var != null) {
                    return wj5Var.a(motionEvent, new v05(this, (byte) 0));
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
                if (view instanceof kw7) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            case 22:
                Path path = (Path) this.b;
                py5 py5Var = (py5) this.c;
                if (py5Var.h != null) {
                    if (py5Var.f) {
                        if (view == py5Var.d) {
                            f = py5Var.e;
                            canvas.save();
                            path.rewind();
                            path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                    } else if (view == py5Var.c) {
                        f = 1.0f - py5Var.e;
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
                vv7 vv7Var = (vv7) this.c;
                if (vv7Var.h != null) {
                    if (vv7Var.f) {
                        if (view == vv7Var.d) {
                            f2 = vv7Var.e;
                            canvas.save();
                            path2.rewind();
                            path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f2 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path2);
                            boolean drawChild3 = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild3;
                        }
                    } else if (view == vv7Var.c) {
                        f2 = 1.0f - vv7Var.e;
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
        io ioVar = (io) this.b;
        ioVar.a();
        ioVar.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(pqe.a(f, 0.0f, 1.0f) * 100.0f))), !jb6.a0, true);
        r71 r71Var = (r71) this.c;
        r71Var.c = f;
        r71Var.invalidate();
    }

    @Override
    public final boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 12:
                x53 x53Var = (x53) this.c;
                float f = x53Var.u;
                float f2 = rect.bottom;
                if (f != f2 && x53Var.v) {
                    x53Var.u = f2;
                    su suVar = x53Var.c;
                    w53 w53Var = x53Var.a;
                    if (!x53Var.q) {
                        float f3 = x53Var.t;
                        int L = gm.L(32.0f);
                        byte b = x53Var.y;
                        if (b == 1 || b == 2) {
                            L = gm.L(24.0f);
                        }
                        float f4 = L;
                        if (w53Var.getMeasuredHeight() + f3 > (suVar.getMeasuredHeight() - x53Var.u) - f4) {
                            f3 = ((suVar.getMeasuredHeight() - x53Var.u) - w53Var.getMeasuredHeight()) - f4;
                        }
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        w53Var.animate().translationY(f3).setDuration(250L).setUpdateListener(new s53(x53Var, (byte) 1)).setInterpolator(d53.f).start();
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
                ((j92) this.b).c();
                return;
            case 11:
                super.onAttachedToWindow();
                hx2 hx2Var = (hx2) this.c;
                hx2Var.A.I();
                hx2Var.B.I();
                return;
            case 12:
                super.onAttachedToWindow();
                setTag(2131296353, (s20) this.b);
                return;
            case 26:
                super.onAttachedToWindow();
                ((ProfileActivity) this.c).C5.I();
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
                ((j92) this.b).d();
                return;
            case 11:
                super.onDetachedFromWindow();
                hx2 hx2Var = (hx2) this.c;
                hx2Var.A.K();
                hx2Var.B.K();
                return;
            case 12:
                super.onDetachedFromWindow();
                setTag(2131296353, null);
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.c).C5.K();
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
                hx2 hx2Var = (hx2) this.b;
                Paint paint = hx2Var.N;
                ImageReceiver imageReceiver = hx2Var.B;
                ColorDrawable colorDrawable = hx2Var.u;
                ImageReceiver imageReceiver2 = hx2Var.A;
                if (hx2Var.z != null) {
                    if (hx2Var.K && hx2Var.v == null && hx2Var.w != null && !hx2Var.e0) {
                        hx2Var.e0 = true;
                        imageReceiver2.v0(false, false);
                        vs9.d(new h92(hx2Var, (byte) 11));
                    }
                    if (hx2Var.v != null) {
                        boolean z = hx2Var.K;
                        float f = hx2Var.M;
                        if (z) {
                            if (f != 1.0f) {
                                float f2 = f + 0.13333334f;
                                hx2Var.M = f2;
                                if (f2 > 1.0f) {
                                    hx2Var.M = 1.0f;
                                }
                                hx2Var.z.invalidate();
                            }
                        } else if (f != 0.0f) {
                            float f3 = f - 0.13333334f;
                            hx2Var.M = f3;
                            if (f3 < 0.0f) {
                                hx2Var.M = 0.0f;
                            }
                            hx2Var.z.invalidate();
                        }
                        float f4 = hx2Var.M;
                        if (f4 != 0.0f && hx2Var.v != null) {
                            paint.setAlpha((int) (f4 * 255.0f));
                            if (paint.getAlpha() != 255) {
                                canvas.drawColor(cmb.p1(hx2Var.M, cmb.v0(cmb.Z6, hx2Var.c0)));
                            }
                            canvas.drawPaint(paint);
                        }
                    }
                    colorDrawable.setAlpha((int) (hx2Var.F * 180.0f));
                    colorDrawable.setBounds(0, 0, hx2Var.z.getWidth(), hx2Var.z.getHeight());
                    colorDrawable.draw(canvas);
                    canvas.save();
                    iq5 iq5Var = hx2Var.q;
                    int i3 = iq5Var.d;
                    int i4 = iq5Var.b;
                    int i5 = i3 + i4;
                    if (hx2Var.V == 1) {
                        i = Math.min(hx2Var.z.getWidth(), hx2Var.z.getHeight() - i5) - gm.L(40.0f);
                    } else {
                        boolean z2 = hx2Var.S;
                        su suVar = hx2Var.z;
                        if (z2) {
                            min = Math.min(suVar.getWidth(), hx2Var.z.getHeight() - i5) - gm.N(40.0f);
                        } else {
                            min = Math.min(suVar.getWidth(), hx2Var.z.getHeight() - i5) / 1.8f;
                        }
                        i = (int) min;
                    }
                    int i6 = (i / 2) + i4;
                    if (hx2Var.G != null) {
                        i2 = gm.L(40.0f);
                    } else {
                        i2 = 0;
                    }
                    float max = Math.max(i6 + i2, ((hx2Var.z.getHeight() - i5) - hx2Var.I) / 2);
                    if (hx2Var.S) {
                        max += gm.L(40.0f);
                    }
                    canvas.translate(hx2Var.z.getWidth() / 2, hx2Var.e + max);
                    int i7 = (int) (i * ((hx2Var.F * 0.8f) / 0.8f));
                    if (hx2Var.V == 3) {
                        canvas.translate(0.0f, gm.L(70.0f));
                    }
                    boolean z3 = hx2Var.S;
                    float f5 = hx2Var.F;
                    if (z3) {
                        float f6 = i7;
                        float f7 = 0.6669f * f6;
                        imageReceiver2.setAlpha(f5);
                        float f8 = f6 - f7;
                        float f9 = f6 / 2.0f;
                        imageReceiver2.i0((f8 - f9) - (0.0546875f * f6), (f8 / 2.0f) - f9, f7, f7);
                        imageReceiver2.h(canvas, null);
                        imageReceiver.setAlpha(hx2Var.F);
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
                    if (hx2Var.C != null) {
                        canvas.save();
                        float f13 = (-i7) / 2.0f;
                        canvas.translate(f13, f13);
                        float f14 = i7;
                        canvas.scale(f14 / hx2Var.C.getWidth(), f14 / hx2Var.C.getHeight());
                        hx2Var.C.setAlpha(hx2Var.F);
                        Path path = hx2Var.D;
                        if (path == null) {
                            path = new Path();
                            hx2Var.D = path;
                        }
                        path.rewind();
                        RectF rectF = gm.P;
                        rectF.set(0.0f, 0.0f, hx2Var.C.getWidth(), hx2Var.C.getHeight());
                        float f15 = f14 / 8.0f;
                        hx2Var.D.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                        canvas.clipPath(hx2Var.D);
                        hx2Var.C.draw(canvas);
                        canvas.restore();
                    }
                    if (hx2Var.V == 1 && !hx2Var.m && (drawable = hx2Var.J) != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = hx2Var.J.getIntrinsicHeight();
                        int L = (int) (imageReceiver2.Q0.top - gm.L(((hx2Var.d / gm.L(60.0f)) * 6.0f) + 17.0f));
                        hx2Var.J.setAlpha((int) ((1.0f - hx2Var.g) * 255.0f));
                        hx2Var.J.setBounds((-intrinsicWidth) / 2, (-intrinsicHeight) + L, intrinsicWidth / 2, L);
                        hx2Var.J.draw(canvas);
                    }
                    if (hx2Var.G != null) {
                        if (hx2Var.S) {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver.O0) / 2.0f) - gm.L(30.0f));
                        } else {
                            canvas.translate((-staticLayout.getWidth()) / 2.0f, ((-imageReceiver2.O0) / 2.0f) - gm.L(30.0f));
                        }
                        hx2.f0.setAlpha((int) (hx2Var.F * 255.0f));
                        hx2Var.G.draw(canvas);
                    }
                    canvas.restore();
                    boolean z4 = hx2Var.E;
                    float f16 = hx2Var.F;
                    if (z4) {
                        if (f16 != 1.0f) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - hx2Var.H;
                            hx2Var.H = currentTimeMillis;
                            hx2Var.F = (((float) j) / 120.0f) + hx2Var.F;
                            hx2Var.z.invalidate();
                            if (hx2Var.F > 1.0f) {
                                hx2Var.F = 1.0f;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (f16 != 0.0f) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j2 = currentTimeMillis2 - hx2Var.H;
                        hx2Var.H = currentTimeMillis2;
                        hx2Var.F -= ((float) j2) / 120.0f;
                        hx2Var.z.invalidate();
                        float f17 = hx2Var.F;
                        if (f17 < 0.0f) {
                            hx2Var.F = 0.0f;
                            f17 = 0.0f;
                        }
                        if (f17 == 0.0f) {
                            imageReceiver2.g0(null);
                            gm.K3(hx2Var.w);
                            gm.c3(new sw2(hx2Var, (byte) 1));
                            Bitmap bitmap = hx2Var.v;
                            if (bitmap != null) {
                                bitmap.recycle();
                                hx2Var.v = null;
                            }
                            gm.T3(hx2Var.O, false, 1.0f, true, false);
                            hx2Var.M = 0.0f;
                            try {
                                if (hx2Var.y.getParent() != null) {
                                    ((WindowManager) hx2Var.w.getSystemService("window")).removeView(hx2Var.y);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                fc4.g(e, true);
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
                by7 by7Var = (by7) this.c;
                if (by7Var.K != null && by7Var.L != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                    by7Var.K.eraseColor(0);
                    by7Var.L.save();
                    by7Var.L.scale(by7Var.K.getWidth() / getMeasuredWidth(), by7Var.K.getHeight() / getMeasuredHeight());
                    b(by7Var.L);
                    by7Var.L.restore();
                    by7Var.J.d();
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
        zb1 zb1Var;
        switch (this.a) {
            case 18:
                wj5 wj5Var = (wj5) ((sm2) this.c).d;
                if (wj5Var != null) {
                    return wj5Var.a(motionEvent, new v05(this, (byte) 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                if ((((ProfileActivity) this.c).y5 == 0.0f && (zb1Var = (zb1) this.b) != null && zb1Var.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
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
                rs0 rs0Var = (rs0) this.c;
                ss0 ss0Var = rs0Var.d;
                if (ss0Var != null) {
                    ss0Var.setChromeTop(Math.max(0, rs0.Z(rs0Var).getBottom() - rs0Var.d.x.top));
                }
                qs0 qs0Var = rs0Var.e;
                if (qs0Var != null) {
                    qs0Var.b();
                    return;
                }
                return;
            case 18:
                super.onLayout(z, i, i2, i3, i4);
                sb6 sb6Var = (sb6) ((sm2) this.c).e;
                if (sb6Var != null) {
                    sb6Var.run();
                    return;
                }
                return;
            case 20:
                super.onLayout(z, i, i2, i3, i4);
                int i6 = (i4 - i2) / 4;
                int i7 = i6 * 3;
                int D = wi8.D(275.0f, i7, 2);
                vr5 vr5Var = (vr5) this.c;
                FrameLayout frameLayout = vr5Var.r;
                frameLayout.layout(0, D, frameLayout.getMeasuredWidth(), vr5Var.r.getMeasuredHeight() + D);
                int L = gm.L(139.0f) + gm.L(150.0f) + D;
                int measuredWidth = (getMeasuredWidth() - vr5Var.e.getMeasuredWidth()) / 2;
                yx0 yx0Var = vr5Var.e;
                yx0Var.layout(measuredWidth, L, yx0Var.getMeasuredWidth() + measuredWidth, vr5Var.e.getMeasuredHeight() + L);
                ggc ggcVar = vr5Var.d;
                ggcVar.layout(0, 0, ggcVar.getMeasuredWidth(), vr5Var.d.getMeasuredHeight());
                int measuredHeight = ((i6 - vr5Var.n.getMeasuredHeight()) / 2) + i7;
                int measuredWidth2 = (getMeasuredWidth() - vr5Var.n.getMeasuredWidth()) / 2;
                t8 t8Var = vr5Var.n;
                t8Var.layout(measuredWidth2, measuredHeight, t8Var.getMeasuredWidth() + measuredWidth2, vr5Var.n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - gm.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - vr5Var.f.getMeasuredWidth()) / 2;
                TextView textView = vr5Var.f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), vr5Var.f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = gm.L(4.0f);
                if (!gm.O1()) {
                    i5 = gm.m;
                }
                int i8 = L3 + i5;
                if (marginLayoutParams.topMargin != i8) {
                    marginLayoutParams.topMargin = i8;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 21:
                int L4 = gm.L(25.0f) + gm.L(150.0f) + wi8.D(275.0f, ((i4 - i2) / 4) * 3, 2);
                int L5 = gm.L(18.0f);
                TextView textView2 = (TextView) this.b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = gm.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = gm.L(16.0f);
                TextView textView3 = (TextView) this.c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 26:
                super.onLayout(z, i, i2, i3, i4);
                ((ProfileActivity) this.c).N3();
                return;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                if (secretMediaViewer.n != null) {
                    int currentActionBarHeight = ((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + gm.m;
                    lw9 lw9Var = secretMediaViewer.n;
                    lw9Var.layout(lw9Var.getLeft(), currentActionBarHeight, secretMediaViewer.n.getRight(), secretMediaViewer.n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.r != null && secretMediaViewer.n != null) {
                    int measuredHeight2 = (secretMediaViewer.n.getMeasuredHeight() + (((a.getCurrentActionBarHeight() - secretMediaViewer.n.getMeasuredHeight()) / 2) + gm.m)) - gm.L(10.0f);
                    hg5 hg5Var = secretMediaViewer.r;
                    hg5Var.layout(hg5Var.getLeft(), measuredHeight2, secretMediaViewer.r.getRight(), secretMediaViewer.r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = a.getCurrentActionBarHeight() + gm.m;
                    ta8 ta8Var = secretMediaViewer.Z;
                    ta8Var.layout(ta8Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    int i9 = i4 - i2;
                    view.layout(0, i9, i3 - i, gm.n + i9);
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
                super.onMeasure(i, wi8.E(8.0f, ((LinearLayout) this.b).getMeasuredHeight(), 1073741824));
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(350.0f), 1073741824));
                return;
            case 9:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
                return;
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.b;
                ev2 ev2Var = (ev2) this.c;
                if (ev2Var.L && ev2Var.K) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i2);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (gm.q.y - a.getCurrentActionBarHeight()) - gm.m;
                }
                int L2 = gm.L(50.0f);
                if (ev2Var.w != 0) {
                    L = 0;
                } else {
                    L = gm.L(30.0f) + L2;
                }
                if (!ev2Var.F && !ev2Var.x) {
                    L += L2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i3 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                return;
            case 17:
                ux4 ux4Var = (ux4) this.c;
                ArrayList arrayList = ux4Var.A2;
                TextPaint textPaint = (TextPaint) this.b;
                textPaint.setTextSize(gm.L(14.0f));
                textPaint.setTypeface(gm.o());
                int L3 = gm.L(14.0f);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    L3 = hg9.v(24.0f, (int) Math.ceil(textPaint.measureText(((CharSequence) arrayList.get(i4)).toString())), L3);
                }
                int size2 = View.MeasureSpec.getSize(i);
                int min = Math.min(L3, Math.max(0, size2 - gm.L(32.0f)));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ux4Var.z2.getLayoutParams();
                layoutParams.width = min;
                layoutParams.leftMargin = (size2 - min) / 2;
                super.onMeasure(i, i2);
                return;
            case 25:
                super.onMeasure(i, wi8.E(2.0f, ((kj8) this.c).t1, 1073741824));
                return;
            case 29:
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
                ta8 ta8Var = secretMediaViewer.Z;
                if (ta8Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight - a.getCurrentActionBarHeight()) - gm.m;
                    if (secretMediaViewer.T.getVisibility() == 0) {
                        i3 = secretMediaViewer.T.getMeasuredHeight();
                    }
                    ta8Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - i3, 1073741824));
                }
                View view = secretMediaViewer.f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.n, 1073741824));
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
                i15 i15Var = (i15) this.c;
                i15Var.setBounds(0, 0, i, i2);
                i15Var.c(0, gm.L(24.0f) + getPaddingBottom());
                return;
            case 24:
                by7 by7Var = (by7) this.c;
                jz4 jz4Var = by7Var.I;
                super.onSizeChanged(i, i2, i3, i4);
                if (i > 0 && i2 > 0) {
                    by7Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i2 * 54) / i)), Bitmap.Config.ARGB_8888);
                    by7Var.L = new Canvas(by7Var.K);
                    jz4Var.a(by7Var.K);
                    jz4Var.b(i, i2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onViewAdded(View view) {
        switch (this.a) {
            case 3:
                super.onViewAdded(view);
                if (view instanceof ss0) {
                    view.setOutlineProvider(new cm0(this, (byte) 1));
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

    public su(Object obj, Context context, Object obj2, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public su(xb2 xb2Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = xb2Var;
        this.b = new RectF();
    }

    public su(x53 x53Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.c = x53Var;
        this.b = new s20(this, (byte) 8);
    }

    public su(qh1 qh1Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = qh1Var;
        this.b = new Paint(1);
    }

    public su(ep0 ep0Var, Activity activity) {
        super(activity);
        this.a = (byte) 2;
        this.c = ep0Var;
        this.b = new Paint(1);
    }

    public su(n92 n92Var, Context context) {
        super(context);
        this.a = (byte) 7;
        this.c = n92Var;
        this.b = new j92(this, this);
    }

    public su(Activity activity, lhc lhcVar) {
        super(activity);
        this.a = (byte) 27;
        this.c = new RectF();
        this.b = lhcVar;
        lhcVar.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        textView.setTextColor(-1);
        td4.v(15.0f, 2131742938, 1, textView, null);
        textView.setGravity(1);
        textView.setTypeface(gm.o());
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(jb6.M0(2131742939, null));
        addView(textView, qoe.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, qoe.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    public su(sm2 sm2Var, Context context) {
        super(context);
        this.a = (byte) 18;
        this.c = sm2Var;
        ?? obj = new Object();
        obj.c = new cf9((Object) obj, (byte) 19);
        obj.h = new ArrayList();
        obj.d = this;
        obj.e = context;
        this.b = obj;
        setClickable(true);
    }

    public su(by7 by7Var, Context context) {
        super(context);
        this.a = (byte) 24;
        this.c = by7Var;
        this.b = new Paint();
    }

    public su(Context context, TextView textView, TextView textView2) {
        super(context);
        this.a = (byte) 21;
        this.b = textView;
        this.c = textView2;
    }

    public su(rs0 rs0Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.c = rs0Var;
        this.b = new RectF();
        setClipChildren(false);
    }

    public su(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.a = (byte) 29;
        this.c = secretMediaViewer;
        this.b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public su(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.c = obj;
    }

    public su(Context context, int i, int i2) {
        super(context);
        this.a = (byte) 13;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        td4.v(16.0f, 2131745000, 1, textView, null);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, qoe.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(1.66f));
        paint.setColor(i2);
        paint2.setColor(i2);
    }

    public su(if2 if2Var, Context context) {
        super(context);
        this.a = (byte) 9;
        this.c = if2Var;
        this.b = new Paint();
    }

    public su(hx2 hx2Var, Activity activity) {
        super(activity);
        this.a = (byte) 11;
        this.c = hx2Var;
        this.b = hx2Var;
        setWillNotDraw(false);
    }

    public su(v29 v29Var, Context context) {
        super(context);
        this.a = (byte) 28;
        this.c = v29Var;
        this.b = new Paint(1);
    }

    public su(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 6:
                super(context);
                this.b = new Path();
                this.c = new in3((byte) 7);
                return;
            default:
                return;
        }
    }

    public su(py5 py5Var, Context context) {
        super(context);
        this.a = (byte) 22;
        this.c = py5Var;
        this.b = new Path();
    }

    public su(vv7 vv7Var, Context context) {
        super(context);
        this.a = (byte) 23;
        this.c = vv7Var;
        this.b = new Path();
    }
}
