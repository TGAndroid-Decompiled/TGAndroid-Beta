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
import org.telegram.messenger.bb;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ja;
import org.telegram.messenger.z20;
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
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.n5;
import org.telegram.ui.a11;
import org.telegram.ui.cb0;
import org.telegram.ui.fr0;
import org.telegram.ui.h4;
import org.telegram.ui.i11;
import org.telegram.ui.i31;
import org.telegram.ui.lt;
import org.telegram.ui.m21;
import org.telegram.ui.m5;
import org.telegram.ui.m91;
import org.telegram.ui.n21;
import org.telegram.ui.o21;
import org.telegram.ui.r6;
import org.telegram.ui.s21;
import org.telegram.ui.s60;
import org.telegram.ui.wv0;
import org.telegram.ui.xb;
import org.telegram.ui.y20;
import rf.w;
import sg.e0;
import vh.p2;
import w7.u;
public final class i extends FrameLayout {
    public final int f7076a;
    public Object f7077b;
    public Object f7078c;

    public i(Context context, int i10) {
        super(context);
        this.f7076a = i10;
    }

    public void c(Canvas canvas) {
        zc0 zc0Var = (zc0) this.f7078c;
        Drawable drawable = zc0Var.f33006a;
        if (drawable != null) {
            if (!(drawable instanceof jb0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                float max = Math.max(getMeasuredWidth() / zc0Var.f33006a.getIntrinsicWidth(), (getMeasuredHeight() + zc0Var.G) / zc0Var.f33006a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(zc0Var.f33006a.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(zc0Var.f33006a.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + zc0Var.G) / 2;
                zc0Var.f33006a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                zc0Var.f33006a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                zc0Var.f33006a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f7077b);
    }

    public void d(float f7) {
        f6 f6Var = (f6) this.f7077b;
        f6Var.a();
        f6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(u.a(f7, 0.0f, 1.0f) * 100.0f))), !cd.X, true);
        r6 r6Var = (r6) this.f7078c;
        r6Var.f41138c = f7;
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
        switch (this.f7076a) {
            case 1:
                w wVar = (w) this.f7078c;
                wVar.b(t6.r1(0.65f, t6.w0(t6.f20929d6, (p6) this.f7077b)));
                wVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 3:
                ((k1) this.f7077b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = i0.P;
                rectF.set(0.0f, i0.L(2.0f), getMeasuredWidth(), i0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                k1 k1Var = (k1) this.f7077b;
                k1Var.f11142f.setAlpha(((i1) this.f7078c).B1);
                canvas.drawRoundRect(rectF, i0.L(24.0f) - 1, i0.L(24.0f) - 1, k1Var.f11142f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f7077b;
                int i10 = t6.f20872a7;
                p6Var = ((k2) ((m5) this.f7078c).d).resourceProvider;
                paint3.setColor(t6.w0(i10, p6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 8:
                RectF rectF2 = (RectF) this.f7077b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                v0 v0Var = (v0) this.f7078c;
                int measuredWidth = v0Var.getMeasuredWidth();
                int i11 = v0Var.e;
                float x10 = v0Var.getX();
                float f13 = v0Var.d;
                p6 p6Var2 = v0Var.f23169c;
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
                Paint paint4 = (Paint) this.f7077b;
                paint4.setColor(t6.w0(t6.f20872a7, ((xb) this.f7078c).f43529f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 10:
                float L5 = i0.L(20.0f);
                RectF rectF3 = i0.P;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f7077b;
                path.rewind();
                path.addRoundRect(rectF3, L5, L5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, 255, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), i0.L(6.0f) + getPaddingTop());
                li.k kVar = (li.k) this.f7078c;
                kVar.o(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - i0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                kVar.o(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f7077b;
                paint5.setColor(t6.w0(t6.f20930d7, ((dp) this.f7078c).I0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 12:
                iy iyVar = (iy) this.f7078c;
                if (!iyVar.G.f31920u0 && iyVar.f27130x > 0.0f) {
                    if (((Paint) this.f7077b) == null) {
                        Paint paint6 = new Paint();
                        this.f7077b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, i0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f7077b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f7077b).setAlpha((int) (iyVar.f27130x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, i0.L(18.0f), getMeasuredHeight(), (Paint) this.f7077b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                Paint paint7 = (Paint) this.f7077b;
                mj0 mj0Var = (mj0) this.f7078c;
                int i12 = mj0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    o10 = i0.b.f(0.7f, t6.w0(t6.F8, mj0Var.f28521k0), t6.w0(t6.f21001h5, mj0Var.f28521k0));
                } else {
                    o10 = i0.b.o(-1, 30);
                }
                paint7.setColor(o10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - i0.N(6.0f)) / 2.0f;
                float g10 = mj0Var.g();
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
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f7077b;
                y20 y20Var = (y20) this.f7078c;
                u8 u8Var = y20Var.J;
                TextView textView = y20Var.K;
                float f14 = y20Var.O;
                if (f14 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    u8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - gr.f26495f.getInterpolation(f14);
                    float left = (y20Var.P - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((y20Var.R - getRight()) * interpolation)), getMeasuredHeight());
                    u8Var.setTranslationX(left);
                    textView.setTranslationX(-((y20Var.Q - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 17:
                RectF rectF5 = (RectF) this.f7078c;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                x0 x0Var = (x0) this.f7077b;
                x0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF5, i0.L(28.0f), i0.L(28.0f), x0Var.b());
                super.dispatchDraw(canvas);
                return;
            case 22:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f7078c;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.f33890r.getX(), profileActivity.f33890r.getY());
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
                if (profileActivity.p5 && profileActivity.f33883p6 != 0.0f && profileActivity.f33869n5 != f7) {
                    float measuredHeight2 = (profileActivity.f33890r.getMeasuredHeight() / f11) + profileActivity.f33890r.getY();
                    float L6 = i0.L(22.0f);
                    float x11 = ((profileActivity.f33890r.getX() + (i0.L(f10) - profileActivity.f33876o5)) - L6) - profileActivity.o4();
                    profileActivity.f33896r5.y0(x11, measuredHeight2 - (L6 / f11), L6, L6);
                    profileActivity.f33896r5.setAlpha(profileActivity.f33883p6);
                    canvas.save();
                    float f15 = profileActivity.f33883p6;
                    canvas.scale(f15, f15, profileActivity.f33896r5.r(), profileActivity.f33896r5.s());
                    profileActivity.f33896r5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.f33869n5 == 0.0f) {
                        if (((jc) this.f7077b) == null) {
                            jc jcVar = new jc(this);
                            this.f7077b = jcVar;
                            jcVar.h = new wv0(this, 3);
                        }
                        float L7 = (f7 - profileActivity.f33869n5) * i0.L(f10);
                        float textWidth = profileActivity.f33890r.getTextWidth();
                        if (profileActivity.S != null) {
                            f12 = profileActivity.S.getVisibilityFactor() * (i0.L(24.0f) + textWidth + i0.L(4.0f));
                        }
                        float max = Math.max(textWidth, f12) + L7;
                        RectF rectF6 = i0.P;
                        rectF6.set(x11 - i0.L(4.0f), measuredHeight2 - i0.L(14.0f), x11 + max + i0.L(4.0f), measuredHeight2 + i0.L(14.0f));
                        jc jcVar2 = (jc) this.f7077b;
                        jcVar2.f27308i = r14;
                        jcVar2.f27305c = r14;
                        jcVar2.a(rectF6);
                        jc jcVar3 = (jc) this.f7077b;
                        jcVar3.f27313n = z10;
                        int o11 = i0.b.o(-1, 50);
                        jcVar3.f27307g.setColor((int) r14);
                        y yVar2 = jcVar3.e;
                        if (yVar2 != null) {
                            t6.H1(yVar2, o11, z10);
                        }
                        jc jcVar4 = (jc) this.f7077b;
                        jcVar4.c(canvas, jcVar4.f27307g);
                        y yVar3 = jcVar4.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    jc jcVar5 = (jc) this.f7077b;
                    if (jcVar5 != null && (yVar = jcVar5.e) != null) {
                        yVar.setState(StateSet.NOTHING);
                        yVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.f7077b;
                imageReceiver.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.h(canvas, null);
                super.dispatchDraw(canvas);
                return;
            case 29:
                super.dispatchDraw(canvas);
                ((b6) this.f7078c).getClass();
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
        switch (this.f7076a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                bb bbVar = (bb) ((bh.d) this.f7078c).f2778b;
                if (bbVar != null) {
                    return bbVar.c(motionEvent, new ja(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                h4 h4Var = (h4) this.f7078c;
                v9 n10 = h4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f7077b;
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
                s0 s0Var = (s0) this.f7078c;
                if (s0Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(s0Var.J.getX(), s0Var.J.getY());
                    boolean dispatchTouchEvent = s0Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        s0Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = s0Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!s0Var.F.isInProgress() && ((GestureDetector) s0Var.G.f12684b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    s0Var.H = false;
                    s0Var.I = false;
                    o1.j jVar = s0Var.S;
                    if (!jVar.f13951f) {
                        float f10 = s0Var.Q;
                        jVar.f13949b = f10;
                        jVar.f13950c = true;
                        o1.k kVar = jVar.f13957m;
                        int i10 = s0Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = i0.f16026q.x;
                        if (f11 >= i11 / 2.0f) {
                            L = (i11 - i10) - i0.L(16.0f);
                        } else {
                            L = i0.L(16.0f);
                        }
                        kVar.f13964i = L;
                        s0Var.S.h();
                    }
                    o1.j jVar2 = s0Var.T;
                    if (!jVar2.f13951f) {
                        jVar2.f13949b = s0Var.R;
                        jVar2.f13950c = true;
                        jVar2.f13957m.f13964i = u.a(f7, i0.L(16.0f), (i0.f16026q.y - s0Var.N) - i0.L(16.0f));
                        s0Var.T.h();
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
        switch (this.f7076a) {
            case 2:
                Path path = (Path) this.f7077b;
                p0 p0Var = (p0) this.f7078c;
                if (p0Var.h != null && (((z10 = p0Var.f10133f) && view == p0Var.d) || (!z10 && view == p0Var.f10132c))) {
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
                if (view != ((SecretMediaViewer) this.f7077b).f34026x && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 24:
                Path path2 = (Path) this.f7077b;
                i11 i11Var = (i11) this.f7078c;
                RectF rectF = i11Var.R;
                if (view != i11Var.N && view != i11Var.f38096y) {
                    if (view == i11Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + i11Var.N.getX(), rectF.centerY() + i11Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, i0.T1(i11Var.T, 0.0f, i11Var.f38093s), getWidth(), i0.T1(i11Var.U, getHeight(), i11Var.f38093s));
                        canvas.translate(-i11Var.P.getX(), -i11Var.P.getY());
                        canvas.translate(i11Var.N.getX() + rectF.left, i11Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / i11Var.P.getMeasuredWidth(), rectF.height() / i11Var.P.getMeasuredHeight(), i11Var.P.getX(), i11Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, i0.T1(i11Var.T, 0.0f, i11Var.f38093s), getWidth(), i0.T1(i11Var.U, getHeight(), i11Var.f38093s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view == ((i31) this.f7078c).f38129h0 && e0.f48320b && e0.f48322f) {
                    for (int i10 = 0; i10 < ((i31) this.f7078c).f38129h0.getChildCount(); i10++) {
                        View childAt = ((i31) this.f7078c).f38129h0.getChildAt(i10);
                        if (childAt instanceof s21) {
                            s21 s21Var = (s21) childAt;
                            if (s21Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f7077b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f7077b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (s21Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f7077b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f7077b).set((int) (rect.centerX() - (s21Var.getAnimatedScale() * (((Rect) this.f7077b).width() / 2.0f))), (int) (((Rect) this.f7077b).centerY() - (s21Var.getAnimatedScale() * (((Rect) this.f7077b).height() / 2.0f))), (int) ((s21Var.getAnimatedScale() * (((Rect) this.f7077b).width() / 2.0f)) + ((Rect) this.f7077b).centerX()), (int) ((s21Var.getAnimatedScale() * (((Rect) this.f7077b).height() / 2.0f)) + ((Rect) this.f7077b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f7077b);
                                canvas.scale(s21Var.getAnimatedScale(), s21Var.getAnimatedScale(), ((Rect) this.f7077b).centerX(), ((Rect) this.f7077b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof n21) || (childAt instanceof m21) || (childAt instanceof o21)) {
                            ((Rect) this.f7077b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f7077b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 29:
                b6 b6Var = (b6) this.f7078c;
                if (view == b6Var.f34262s0 && b6Var.F) {
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
        switch (this.f7076a) {
            case 0:
                super.invalidate();
                ((l) this.f7078c).invalidate();
                return;
            case 28:
                super.invalidate();
                m0 m0Var = ((m91) this.f7078c).f39592u0;
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
        switch (this.f7076a) {
            case 19:
                super.onAttachedToWindow();
                lt ltVar = (lt) this.f7078c;
                ltVar.A.P();
                ltVar.B.P();
                return;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f7078c).f33896r5.P();
                return;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f7077b).h.P();
                return;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f7077b).P();
                return;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((n5) this.f7077b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f7076a) {
            case 16:
                i0.v(getContext(), configuration);
                s0 s0Var = (s0) this.f7078c;
                i0.x3(s0Var.f31648b, s0Var.d, s0Var.f31649c);
                s0Var.a(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f7076a) {
            case 19:
                super.onDetachedFromWindow();
                lt ltVar = (lt) this.f7078c;
                ltVar.A.R();
                ltVar.B.R();
                return;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f7078c).f33896r5.R();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f7077b).h.R();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f7077b).R();
                return;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((n5) this.f7077b);
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
        switch (this.f7076a) {
            case 4:
                bb bbVar = (bb) ((bh.d) this.f7078c).f2779c;
                if (bbVar != null) {
                    return bbVar.c(motionEvent, new ja(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                if ((((ProfileActivity) this.f7078c).f33869n5 == 0.0f && (jcVar = (jc) this.f7077b) != null && jcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f7076a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                cb0 cb0Var = (cb0) ((bh.d) this.f7078c).d;
                if (cb0Var != null) {
                    cb0Var.run();
                    return;
                }
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int y3 = z20.y(275.0f, i15, 2);
                s60 s60Var = (s60) this.f7078c;
                FrameLayout frameLayout = s60Var.f41388r;
                int i16 = 0;
                frameLayout.layout(0, y3, frameLayout.getMeasuredWidth(), s60Var.f41388r.getMeasuredHeight() + y3);
                int L = i0.L(139.0f) + i0.L(150.0f) + y3;
                int measuredWidth = (getMeasuredWidth() - s60Var.e.getMeasuredWidth()) / 2;
                y9 y9Var = s60Var.e;
                y9Var.layout(measuredWidth, L, y9Var.getMeasuredWidth() + measuredWidth, s60Var.e.getMeasuredHeight() + L);
                z4.g gVar = s60Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), s60Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - s60Var.f41387n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - s60Var.f41387n.getMeasuredWidth()) / 2;
                j6 j6Var = s60Var.f41387n;
                j6Var.layout(measuredWidth2, measuredHeight, j6Var.getMeasuredWidth() + measuredWidth2, s60Var.f41387n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - i0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - s60Var.f41386f.getMeasuredWidth()) / 2;
                TextView textView = s60Var.f41386f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), s60Var.f41386f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.f7077b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = i0.L(4);
                if (!i0.Q1()) {
                    i16 = i0.f16020m;
                }
                int i17 = L3 + i16;
                if (marginLayoutParams.topMargin != i17) {
                    marginLayoutParams.topMargin = i17;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 21:
                int L4 = i0.L(25.0f) + i0.L(150.0f) + z20.y(275.0f, ((i13 - i11) / 4) * 3, 2);
                int L5 = i0.L(18.0f);
                TextView textView2 = (TextView) this.f7077b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = i0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = i0.L(16.0f);
                TextView textView3 = (TextView) this.f7078c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f7078c).p5();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f7078c;
                if (secretMediaViewer.f34004n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f34004n.getMeasuredHeight()) / 2) + i0.f16020m;
                    a11 a11Var = secretMediaViewer.f34004n;
                    a11Var.layout(a11Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34004n.getRight(), secretMediaViewer.f34004n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34013r != null && secretMediaViewer.f34004n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34004n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f34004n.getMeasuredHeight()) / 2) + i0.f16020m)) - i0.L(10.0f);
                    p2 p2Var = secretMediaViewer.f34013r;
                    p2Var.layout(p2Var.getLeft(), measuredHeight2, secretMediaViewer.f34013r.getRight(), secretMediaViewer.f34013r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Y != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i0.f16020m;
                    fr0 fr0Var = secretMediaViewer.Y;
                    fr0Var.layout(fr0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Y.getRight(), secretMediaViewer.Y.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f33989f;
                if (view != null) {
                    int i18 = i13 - i11;
                    view.layout(0, i18, i12 - i10, i0.f16021n + i18);
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
        switch (this.f7076a) {
            case 3:
                super.onMeasure(i10, z20.B(2.0f, ((i1) this.f7078c).f11117q1, 1073741824));
                return;
            case 5:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, z20.B(8.0f, ((LinearLayout) this.f7077b).getMeasuredHeight(), 1073741824));
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
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f7078c;
                fr0 fr0Var = secretMediaViewer.Y;
                if (fr0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - i0.f16020m;
                    if (secretMediaViewer.S.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.S.getMeasuredHeight();
                    }
                    fr0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f33989f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i0.f16021n, 1073741824));
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
        switch (this.f7076a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                w wVar = (w) this.f7078c;
                wVar.setBounds(0, 0, i10, i11);
                wVar.c(0, i0.L(24.0f) + getPaddingBottom());
                return;
            case 13:
                zc0 zc0Var = (zc0) this.f7078c;
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
                Path path = (Path) this.f7077b;
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
        switch (this.f7076a) {
            case 13:
                ((Paint) this.f7077b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f7076a) {
            case 0:
                super.setTranslationX(f7);
                ((l) this.f7078c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f7076a) {
            case 0:
                super.setTranslationY(f7);
                ((l) this.f7078c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public i(Object obj, Context context, int i10) {
        super(context);
        this.f7076a = i10;
        this.f7078c = obj;
    }

    public i(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f7076a = i10;
        this.f7078c = obj;
        this.f7077b = obj2;
    }

    public i(Context context, p6 p6Var) {
        super(context);
        this.f7076a = 1;
        this.f7078c = new w(8);
        this.f7077b = p6Var;
    }

    public i(v0 v0Var, Context context) {
        super(context);
        this.f7076a = 8;
        this.f7078c = v0Var;
        this.f7077b = new RectF();
    }

    public i(xb xbVar, Context context) {
        super(context);
        this.f7076a = 9;
        this.f7078c = xbVar;
        this.f7077b = new Paint(1);
    }

    public i(i11 i11Var, Context context) {
        super(context);
        this.f7076a = 24;
        this.f7078c = i11Var;
        this.f7077b = new Path();
    }

    public i(m5 m5Var, Activity activity) {
        super(activity);
        this.f7076a = 6;
        this.f7078c = m5Var;
        this.f7077b = new Paint(1);
    }

    public i(Context context, x0 x0Var) {
        super(context);
        this.f7076a = 17;
        this.f7078c = new RectF();
        this.f7077b = x0Var;
        x0Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131743280, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(i0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(cd.L0(2131743281, null));
        addView(textView, w7.b6.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, w7.b6.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    public i(s0 s0Var, Context context) {
        super(context);
        this.f7076a = 16;
        this.f7078c = s0Var;
        this.f7077b = new Path();
    }

    public i(bh.d dVar, Context context) {
        super(context);
        this.f7076a = 4;
        this.f7078c = dVar;
        ?? obj = new Object();
        obj.d = new s9.g(obj);
        obj.h = new ArrayList();
        obj.e = this;
        obj.f12518a = context;
        this.f7077b = obj;
        setClickable(true);
    }

    public i(zc0 zc0Var, Context context) {
        super(context);
        this.f7076a = 13;
        this.f7078c = zc0Var;
        this.f7077b = new Paint();
    }

    public i(b6 b6Var, Context context) {
        super(context);
        this.f7076a = 29;
        this.f7078c = b6Var;
        this.f7077b = new n5(0, this);
    }

    public i(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f7076a = 21;
        this.f7077b = textView;
        this.f7078c = textView2;
    }

    public i(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f7076a = 23;
        this.f7078c = secretMediaViewer;
        this.f7077b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public i(i31 i31Var, Context context) {
        super(context);
        this.f7076a = 25;
        this.f7078c = i31Var;
        this.f7077b = new Rect();
    }

    public i(dp dpVar, Context context) {
        super(context);
        this.f7076a = 11;
        this.f7078c = dpVar;
        this.f7077b = new Paint();
    }

    public i(lt ltVar, Activity activity) {
        super(activity);
        this.f7076a = 19;
        this.f7078c = ltVar;
        this.f7077b = ltVar;
        setWillNotDraw(false);
    }

    public i(m91 m91Var, Context context, int i10) {
        super(context);
        this.f7076a = i10;
        switch (i10) {
            case 28:
                this.f7078c = m91Var;
                super(context);
                this.f7077b = new int[2];
                return;
            default:
                this.f7078c = m91Var;
                this.f7077b = new Paint();
                return;
        }
    }

    public i(p0 p0Var, Context context) {
        super(context);
        this.f7076a = 2;
        this.f7078c = p0Var;
        this.f7077b = new Path();
    }

    public i(mj0 mj0Var, Context context) {
        super(context);
        this.f7076a = 14;
        this.f7078c = mj0Var;
        this.f7077b = new Paint(1);
    }

    public i(Context context) {
        super(context);
        this.f7076a = 10;
        this.f7077b = new Path();
        this.f7078c = new li.k(23);
    }
}
