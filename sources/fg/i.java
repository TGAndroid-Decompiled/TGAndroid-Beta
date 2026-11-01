package fg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
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
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j6;
import java.util.ArrayList;
import jg.p0;
import kg.i1;
import kg.k1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.cb;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ka;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.voip.t0;
import org.telegram.ui.Components.voip.y0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.n5;
import org.telegram.ui.a11;
import org.telegram.ui.bb0;
import org.telegram.ui.dr0;
import org.telegram.ui.g31;
import org.telegram.ui.h11;
import org.telegram.ui.h4;
import org.telegram.ui.k21;
import org.telegram.ui.k91;
import org.telegram.ui.kt;
import org.telegram.ui.l21;
import org.telegram.ui.m21;
import org.telegram.ui.m5;
import org.telegram.ui.q21;
import org.telegram.ui.r6;
import org.telegram.ui.r60;
import org.telegram.ui.vv0;
import org.telegram.ui.x20;
import org.telegram.ui.xb;
import rf.w;
import sg.e0;
import vh.p2;
import w7.u;
public final class i extends FrameLayout {
    public final int f7077a;
    public Object f7078b;
    public Object f7079c;

    public i(Context context, int i10) {
        super(context);
        this.f7077a = i10;
    }

    public void c(Canvas canvas) {
        zc0 zc0Var = (zc0) this.f7079c;
        Drawable drawable = zc0Var.f33102a;
        if (drawable != null) {
            if (!(drawable instanceof jb0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                float max = Math.max(getMeasuredWidth() / zc0Var.f33102a.getIntrinsicWidth(), (getMeasuredHeight() + zc0Var.G) / zc0Var.f33102a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(zc0Var.f33102a.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(zc0Var.f33102a.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + zc0Var.G) / 2;
                zc0Var.f33102a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                zc0Var.f33102a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                zc0Var.f33102a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f7078b);
    }

    public void d(float f7) {
        f6 f6Var = (f6) this.f7078b;
        f6Var.a();
        f6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(u.a(f7, 0.0f, 1.0f) * 100.0f))), !dd.X, true);
        r6 r6Var = (r6) this.f7079c;
        r6Var.f40979c = f7;
        r6Var.invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        p6 p6Var;
        Paint paint;
        boolean d12;
        int o10;
        float f7;
        boolean z10;
        ?? r14;
        float f10;
        float f11;
        y yVar;
        Paint paint2 = null;
        float f12 = 0.0f;
        switch (this.f7077a) {
            case 1:
                w wVar = (w) this.f7079c;
                wVar.b(t6.r1(0.65f, t6.w0(t6.f20930d6, (p6) this.f7078b)));
                wVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 3:
                ((k1) this.f7078b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = i0.P;
                rectF.set(0.0f, i0.L(2.0f), getMeasuredWidth(), i0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                k1 k1Var = (k1) this.f7078b;
                k1Var.f11143f.setAlpha(((i1) this.f7079c).B1);
                canvas.drawRoundRect(rectF, i0.L(24.0f) - 1, i0.L(24.0f) - 1, k1Var.f11143f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f7078b;
                int i10 = t6.f20873a7;
                p6Var = ((k2) ((m5) this.f7079c).d).resourceProvider;
                paint3.setColor(t6.w0(i10, p6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 8:
                RectF rectF2 = (RectF) this.f7078b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                v0 v0Var = (v0) this.f7079c;
                int measuredWidth = v0Var.getMeasuredWidth();
                int i11 = v0Var.e;
                float x10 = v0Var.getX();
                float f13 = v0Var.d;
                p6 p6Var2 = v0Var.f23170c;
                if (p6Var2 != null) {
                    p6Var2.b(x10, f13, measuredWidth, i11);
                } else {
                    t6.r(x10, f13, measuredWidth, i11);
                }
                float L = i0.L(18.0f);
                float L2 = i0.L(18.0f);
                if (p6Var2 != null) {
                    paint = p6Var2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = t6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, L, L2, paint);
                if (p6Var2 != null) {
                    d12 = p6Var2.g();
                } else {
                    d12 = t6.d1();
                }
                if (d12) {
                    float L3 = i0.L(18.0f);
                    float L4 = i0.L(18.0f);
                    if (p6Var2 != null) {
                        paint2 = p6Var2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = t6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, L3, L4, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f7078b;
                paint4.setColor(t6.w0(t6.f20873a7, ((xb) this.f7079c).f43299f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 10:
                float L5 = i0.L(20.0f);
                RectF rectF3 = i0.P;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f7078b;
                path.rewind();
                path.addRoundRect(rectF3, L5, L5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, 255, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), i0.L(6.0f) + getPaddingTop());
                li.k kVar = (li.k) this.f7079c;
                kVar.o(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - i0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                kVar.o(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f7078b;
                paint5.setColor(t6.w0(t6.f20931d7, ((dp) this.f7079c).I0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 12:
                iy iyVar = (iy) this.f7079c;
                if (!iyVar.G.f31998u0 && iyVar.f27207x > 0.0f) {
                    if (((Paint) this.f7078b) == null) {
                        Paint paint6 = new Paint();
                        this.f7078b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, i0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f7078b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f7078b).setAlpha((int) (iyVar.f27207x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, i0.L(18.0f), getMeasuredHeight(), (Paint) this.f7078b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                Paint paint7 = (Paint) this.f7078b;
                nj0 nj0Var = (nj0) this.f7079c;
                int i12 = nj0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    o10 = i0.b.f(0.7f, t6.w0(t6.F8, nj0Var.f28882k0), t6.w0(t6.f21002h5, nj0Var.f28882k0));
                } else {
                    o10 = i0.b.o(-1, 30);
                }
                paint7.setColor(o10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - i0.N(6.0f)) / 2.0f;
                float g10 = nj0Var.g();
                RectF rectF4 = i0.P;
                rectF4.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g10, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g10);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF4, measuredWidth3, measuredWidth3, paint7);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g10);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 15:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f7078b;
                x20 x20Var = (x20) this.f7079c;
                u8 u8Var = x20Var.J;
                TextView textView = x20Var.K;
                float f14 = x20Var.O;
                if (f14 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    u8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - gr.f26523f.getInterpolation(f14);
                    float left = (x20Var.P - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((x20Var.R - getRight()) * interpolation)), getMeasuredHeight());
                    u8Var.setTranslationX(left);
                    textView.setTranslationX(-((x20Var.Q - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 17:
                RectF rectF5 = (RectF) this.f7079c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                y0 y0Var = (y0) this.f7078b;
                y0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, i0.L(28.0f), i0.L(28.0f), y0Var.b());
                super.dispatchDraw(canvas);
                return;
            case 22:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f7079c;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.f33897r.getX(), profileActivity.f33897r.getY());
                    r14 = 0;
                    f7 = 1.0f;
                    z10 = true;
                    f10 = 28.0f;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.R1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    f7 = 1.0f;
                    z10 = true;
                    r14 = 0;
                    f10 = 28.0f;
                    f11 = 2.0f;
                }
                if (profileActivity.p5 && profileActivity.q6 != 0.0f && profileActivity.f33876n5 != f7) {
                    float measuredHeight2 = (profileActivity.f33897r.getMeasuredHeight() / f11) + profileActivity.f33897r.getY();
                    float L6 = i0.L(22.0f);
                    float x11 = ((profileActivity.f33897r.getX() + (i0.L(f10) - profileActivity.f33883o5)) - L6) - profileActivity.p4();
                    profileActivity.f33903r5.y0(x11, measuredHeight2 - (L6 / f11), L6, L6);
                    profileActivity.f33903r5.setAlpha(profileActivity.q6);
                    canvas.save();
                    float f15 = profileActivity.q6;
                    canvas.scale(f15, f15, profileActivity.f33903r5.r(), profileActivity.f33903r5.s());
                    profileActivity.f33903r5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.f33876n5 == 0.0f) {
                        if (((jc) this.f7078b) == null) {
                            jc jcVar = new jc(this);
                            this.f7078b = jcVar;
                            jcVar.h = new vv0(this, 3);
                        }
                        float L7 = (f7 - profileActivity.f33876n5) * i0.L(f10);
                        float textWidth = profileActivity.f33897r.getTextWidth();
                        if (profileActivity.S != null) {
                            f12 = profileActivity.S.getVisibilityFactor() * (i0.L(24.0f) + textWidth + i0.L(4.0f));
                        }
                        float max = Math.max(textWidth, f12) + L7;
                        RectF rectF6 = i0.P;
                        rectF6.set(x11 - i0.L(4.0f), measuredHeight2 - i0.L(14.0f), x11 + max + i0.L(4.0f), measuredHeight2 + i0.L(14.0f));
                        jc jcVar2 = (jc) this.f7078b;
                        jcVar2.f27363i = r14;
                        jcVar2.f27360c = r14;
                        jcVar2.a(rectF6);
                        jc jcVar3 = (jc) this.f7078b;
                        jcVar3.f27368n = z10;
                        int o11 = i0.b.o(-1, 50);
                        jcVar3.f27362g.setColor((int) r14);
                        y yVar2 = jcVar3.e;
                        if (yVar2 != null) {
                            t6.H1(yVar2, o11, z10);
                        }
                        jc jcVar4 = (jc) this.f7078b;
                        jcVar4.c(canvas, jcVar4.f27362g);
                        y yVar3 = jcVar4.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    jc jcVar5 = (jc) this.f7078b;
                    if (jcVar5 != null && (yVar = jcVar5.e) != null) {
                        yVar.setState(StateSet.NOTHING);
                        yVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.f7078b;
                imageReceiver.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.h(canvas, null);
                super.dispatchDraw(canvas);
                return;
            case 29:
                super.dispatchDraw(canvas);
                ((b6) this.f7079c).getClass();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        int L;
        switch (this.f7077a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                cb cbVar = (cb) ((bh.d) this.f7079c).f2778b;
                if (cbVar != null) {
                    return cbVar.c(motionEvent, new ka(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                h4 h4Var = (h4) this.f7079c;
                v9 n10 = h4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f7078b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (h4Var.Q0.x() && h4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && h4Var.Q0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!h4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                int action = motionEvent.getAction();
                t0 t0Var = (t0) this.f7079c;
                if (t0Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(t0Var.J.getX(), t0Var.J.getY());
                    boolean dispatchTouchEvent = t0Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        t0Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = t0Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!t0Var.F.isInProgress() && ((GestureDetector) t0Var.G.f12685b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    t0Var.H = false;
                    t0Var.I = false;
                    o1.j jVar = t0Var.S;
                    if (!jVar.f13952f) {
                        float f10 = t0Var.Q;
                        jVar.f13950b = f10;
                        jVar.f13951c = true;
                        o1.k kVar = jVar.f13958m;
                        int i10 = t0Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = i0.f16172q.x;
                        if (f11 >= i11 / 2.0f) {
                            L = (i11 - i10) - i0.L(16.0f);
                        } else {
                            L = i0.L(16.0f);
                        }
                        kVar.f13965i = L;
                        t0Var.S.h();
                    }
                    o1.j jVar2 = t0Var.T;
                    if (!jVar2.f13952f) {
                        jVar2.f13950b = t0Var.R;
                        jVar2.f13951c = true;
                        jVar2.f13958m.f13965i = u.a(f7, i0.L(16.0f), (i0.f16172q.y - t0Var.N) - i0.L(16.0f));
                        t0Var.T.h();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f7;
        Rect rect;
        switch (this.f7077a) {
            case 2:
                Path path = (Path) this.f7078b;
                p0 p0Var = (p0) this.f7079c;
                if (p0Var.h != null && (((z10 = p0Var.f10134f) && view == p0Var.d) || (!z10 && view == p0Var.f10133c))) {
                    if (z10) {
                        f7 = p0Var.e;
                    } else {
                        f7 = 1.0f - p0Var.e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f7 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 19:
                if (view instanceof lc0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                if (view != ((SecretMediaViewer) this.f7078b).f34033x && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 24:
                Path path2 = (Path) this.f7078b;
                h11 h11Var = (h11) this.f7079c;
                RectF rectF = h11Var.R;
                if (view != h11Var.N && view != h11Var.f37629y) {
                    if (view == h11Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + h11Var.N.getX(), rectF.centerY() + h11Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, i0.T1(h11Var.T, 0.0f, h11Var.f37626s), getWidth(), i0.T1(h11Var.U, getHeight(), h11Var.f37626s));
                        canvas.translate(-h11Var.P.getX(), -h11Var.P.getY());
                        canvas.translate(h11Var.N.getX() + rectF.left, h11Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / h11Var.P.getMeasuredWidth(), rectF.height() / h11Var.P.getMeasuredHeight(), h11Var.P.getX(), h11Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, i0.T1(h11Var.T, 0.0f, h11Var.f37626s), getWidth(), i0.T1(h11Var.U, getHeight(), h11Var.f37626s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view == ((g31) this.f7079c).f37305h0 && e0.f48331b && e0.f48333f) {
                    for (int i10 = 0; i10 < ((g31) this.f7079c).f37305h0.getChildCount(); i10++) {
                        View childAt = ((g31) this.f7079c).f37305h0.getChildAt(i10);
                        if (childAt instanceof q21) {
                            q21 q21Var = (q21) childAt;
                            if (q21Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f7078b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f7078b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (q21Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f7078b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f7078b).set((int) (rect.centerX() - (q21Var.getAnimatedScale() * (((Rect) this.f7078b).width() / 2.0f))), (int) (((Rect) this.f7078b).centerY() - (q21Var.getAnimatedScale() * (((Rect) this.f7078b).height() / 2.0f))), (int) ((q21Var.getAnimatedScale() * (((Rect) this.f7078b).width() / 2.0f)) + ((Rect) this.f7078b).centerX()), (int) ((q21Var.getAnimatedScale() * (((Rect) this.f7078b).height() / 2.0f)) + ((Rect) this.f7078b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f7078b);
                                canvas.scale(q21Var.getAnimatedScale(), q21Var.getAnimatedScale(), ((Rect) this.f7078b).centerX(), ((Rect) this.f7078b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof l21) || (childAt instanceof k21) || (childAt instanceof m21)) {
                            ((Rect) this.f7078b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f7078b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 29:
                b6 b6Var = (b6) this.f7079c;
                if (view == b6Var.f34264s0 && b6Var.F) {
                    int save = canvas.save();
                    canvas.concat(b6Var.I);
                    boolean drawChild4 = super.drawChild(canvas, view, j10);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f7077a) {
            case 0:
                super.invalidate();
                ((l) this.f7079c).invalidate();
                return;
            case 28:
                super.invalidate();
                m0 m0Var = ((k91) this.f7079c).f38767u0;
                if (m0Var != null) {
                    m0Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f7077a) {
            case 19:
                super.onAttachedToWindow();
                kt ktVar = (kt) this.f7079c;
                ktVar.A.P();
                ktVar.B.P();
                return;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f7079c).f33903r5.P();
                return;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f7078b).h.P();
                return;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f7078b).P();
                return;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((n5) this.f7078b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f7077a) {
            case 16:
                i0.v(getContext(), configuration);
                t0 t0Var = (t0) this.f7079c;
                i0.x3(t0Var.f31727b, t0Var.d, t0Var.f31728c);
                t0Var.a(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f7077a) {
            case 19:
                super.onDetachedFromWindow();
                kt ktVar = (kt) this.f7079c;
                ktVar.A.R();
                ktVar.B.R();
                return;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f7079c).f33903r5.R();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f7078b).h.R();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f7078b).R();
                return;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((n5) this.f7078b);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: fg.i.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jc jcVar;
        switch (this.f7077a) {
            case 4:
                cb cbVar = (cb) ((bh.d) this.f7079c).f2779c;
                if (cbVar != null) {
                    return cbVar.c(motionEvent, new ka(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                if ((((ProfileActivity) this.f7079c).f33876n5 == 0.0f && (jcVar = (jc) this.f7078b) != null && jcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f7077a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                bb0 bb0Var = (bb0) ((bh.d) this.f7079c).d;
                if (bb0Var != null) {
                    bb0Var.run();
                    return;
                }
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int y3 = a30.y(275.0f, i15, 2);
                r60 r60Var = (r60) this.f7079c;
                FrameLayout frameLayout = r60Var.f40985r;
                int i16 = 0;
                frameLayout.layout(0, y3, frameLayout.getMeasuredWidth(), r60Var.f40985r.getMeasuredHeight() + y3);
                int L = i0.L(139.0f) + i0.L(150.0f) + y3;
                int measuredWidth = (getMeasuredWidth() - r60Var.e.getMeasuredWidth()) / 2;
                y9 y9Var = r60Var.e;
                y9Var.layout(measuredWidth, L, y9Var.getMeasuredWidth() + measuredWidth, r60Var.e.getMeasuredHeight() + L);
                z4.g gVar = r60Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), r60Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - r60Var.f40984n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - r60Var.f40984n.getMeasuredWidth()) / 2;
                j6 j6Var = r60Var.f40984n;
                j6Var.layout(measuredWidth2, measuredHeight, j6Var.getMeasuredWidth() + measuredWidth2, r60Var.f40984n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - i0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - r60Var.f40983f.getMeasuredWidth()) / 2;
                TextView textView = r60Var.f40983f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), r60Var.f40983f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.f7078b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = i0.L(4);
                if (!i0.Q1()) {
                    i16 = i0.f16166m;
                }
                int i17 = L3 + i16;
                if (marginLayoutParams.topMargin != i17) {
                    marginLayoutParams.topMargin = i17;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 21:
                int L4 = i0.L(25.0f) + i0.L(150.0f) + a30.y(275.0f, ((i13 - i11) / 4) * 3, 2);
                int L5 = i0.L(18.0f);
                TextView textView2 = (TextView) this.f7078b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = i0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = i0.L(16.0f);
                TextView textView3 = (TextView) this.f7079c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f7079c).q5();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f7079c;
                if (secretMediaViewer.f34011n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f34011n.getMeasuredHeight()) / 2) + i0.f16166m;
                    a11 a11Var = secretMediaViewer.f34011n;
                    a11Var.layout(a11Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34011n.getRight(), secretMediaViewer.f34011n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34020r != null && secretMediaViewer.f34011n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34011n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f34011n.getMeasuredHeight()) / 2) + i0.f16166m)) - i0.L(10.0f);
                    p2 p2Var = secretMediaViewer.f34020r;
                    p2Var.layout(p2Var.getLeft(), measuredHeight2, secretMediaViewer.f34020r.getRight(), secretMediaViewer.f34020r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Y != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i0.f16166m;
                    dr0 dr0Var = secretMediaViewer.Y;
                    dr0Var.layout(dr0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Y.getRight(), secretMediaViewer.Y.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f33996f;
                if (view != null) {
                    int i18 = i13 - i11;
                    view.layout(0, i18, i12 - i10, i0.f16167n + i18);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        switch (this.f7077a) {
            case 3:
                super.onMeasure(i10, a30.B(2.0f, ((i1) this.f7079c).f11118q1, 1073741824));
                return;
            case 5:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, a30.B(8.0f, ((LinearLayout) this.f7078b).getMeasuredHeight(), 1073741824));
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(350.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i0.L(48.0f), 1073741824));
                return;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f7079c;
                dr0 dr0Var = secretMediaViewer.Y;
                if (dr0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - i0.f16166m;
                    if (secretMediaViewer.S.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.S.getMeasuredHeight();
                    }
                    dr0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f33996f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i0.f16167n, 1073741824));
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f7077a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                w wVar = (w) this.f7079c;
                wVar.setBounds(0, 0, i10, i11);
                wVar.c(0, i0.L(24.0f) + getPaddingBottom());
                return;
            case 13:
                zc0 zc0Var = (zc0) this.f7079c;
                hi.b bVar = zc0Var.H;
                super.onSizeChanged(i10, i11, i12, i13);
                if (i10 > 0 && i11 > 0) {
                    zc0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i11 * 54) / i10)), Bitmap.Config.ARGB_8888);
                    zc0Var.K = new Canvas(zc0Var.J);
                    bVar.a(zc0Var.J);
                    bVar.b(i10, i11);
                    return;
                }
                return;
            case 16:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f7078b;
                path.rewind();
                RectF rectF = i0.P;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, i0.L(10.0f), i0.L(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: fg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f7077a) {
            case 13:
                ((Paint) this.f7078b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f7077a) {
            case 0:
                super.setTranslationX(f7);
                ((l) this.f7079c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f7077a) {
            case 0:
                super.setTranslationY(f7);
                ((l) this.f7079c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public i(Object obj, Context context, int i10) {
        super(context);
        this.f7077a = i10;
        this.f7079c = obj;
    }

    public i(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f7077a = i10;
        this.f7079c = obj;
        this.f7078b = obj2;
    }

    public i(Context context, p6 p6Var) {
        super(context);
        this.f7077a = 1;
        this.f7079c = new w(8);
        this.f7078b = p6Var;
    }

    public i(v0 v0Var, Context context) {
        super(context);
        this.f7077a = 8;
        this.f7079c = v0Var;
        this.f7078b = new RectF();
    }

    public i(xb xbVar, Context context) {
        super(context);
        this.f7077a = 9;
        this.f7079c = xbVar;
        this.f7078b = new Paint(1);
    }

    public i(h11 h11Var, Context context) {
        super(context);
        this.f7077a = 24;
        this.f7079c = h11Var;
        this.f7078b = new Path();
    }

    public i(m5 m5Var, Activity activity) {
        super(activity);
        this.f7077a = 6;
        this.f7079c = m5Var;
        this.f7078b = new Paint(1);
    }

    public i(Context context, y0 y0Var) {
        super(context);
        this.f7077a = 17;
        this.f7079c = new RectF();
        this.f7078b = y0Var;
        y0Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(dd.L0(2131743280, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(i0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(dd.L0(2131743281, null));
        addView(textView, w7.b6.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, w7.b6.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    public i(t0 t0Var, Context context) {
        super(context);
        this.f7077a = 16;
        this.f7079c = t0Var;
        this.f7078b = new Path();
    }

    public i(bh.d dVar, Context context) {
        super(context);
        this.f7077a = 4;
        this.f7079c = dVar;
        ?? obj = new Object();
        obj.d = new s9.g(obj);
        obj.h = new ArrayList();
        obj.e = this;
        obj.f12519a = context;
        this.f7078b = obj;
        setClickable(true);
    }

    public i(zc0 zc0Var, Context context) {
        super(context);
        this.f7077a = 13;
        this.f7079c = zc0Var;
        this.f7078b = new Paint();
    }

    public i(b6 b6Var, Context context) {
        super(context);
        this.f7077a = 29;
        this.f7079c = b6Var;
        this.f7078b = new n5(0, this);
    }

    public i(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f7077a = 21;
        this.f7078b = textView;
        this.f7079c = textView2;
    }

    public i(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f7077a = 23;
        this.f7079c = secretMediaViewer;
        this.f7078b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public i(g31 g31Var, Context context) {
        super(context);
        this.f7077a = 25;
        this.f7079c = g31Var;
        this.f7078b = new Rect();
    }

    public i(dp dpVar, Context context) {
        super(context);
        this.f7077a = 11;
        this.f7079c = dpVar;
        this.f7078b = new Paint();
    }

    public i(kt ktVar, Activity activity) {
        super(activity);
        this.f7077a = 19;
        this.f7079c = ktVar;
        this.f7078b = ktVar;
        setWillNotDraw(false);
    }

    public i(k91 k91Var, Context context, int i10) {
        super(context);
        this.f7077a = i10;
        switch (i10) {
            case 28:
                this.f7079c = k91Var;
                super(context);
                this.f7078b = new int[2];
                return;
            default:
                this.f7079c = k91Var;
                this.f7078b = new Paint();
                return;
        }
    }

    public i(p0 p0Var, Context context) {
        super(context);
        this.f7077a = 2;
        this.f7079c = p0Var;
        this.f7078b = new Path();
    }

    public i(nj0 nj0Var, Context context) {
        super(context);
        this.f7077a = 14;
        this.f7079c = nj0Var;
        this.f7078b = new Paint(1);
    }

    public i(Context context) {
        super(context);
        this.f7077a = 10;
        this.f7078b = new Path();
        this.f7079c = new li.k(23);
    }
}
