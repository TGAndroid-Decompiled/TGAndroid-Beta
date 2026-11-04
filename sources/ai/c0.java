package ai;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.be;
import b8.ke;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.ca;
import org.telegram.messenger.ua;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bz0;
import org.telegram.ui.g11;
import org.telegram.ui.is;
import org.telegram.ui.iz0;
import org.telegram.ui.k01;
import org.telegram.ui.l01;
import org.telegram.ui.m01;
import org.telegram.ui.mp0;
import org.telegram.ui.o50;
import org.telegram.ui.pb;
import org.telegram.ui.pu0;
import org.telegram.ui.q01;
import org.telegram.ui.u10;
import org.telegram.ui.u90;
public final class c0 extends FrameLayout {
    public final int f535a;
    public Object f536b;
    public Object f537c;

    public c0(int i3, Context context, Object obj) {
        super(context);
        this.f535a = i3;
        this.f537c = obj;
    }

    public void d(Canvas canvas) {
        zb0 zb0Var = (zb0) this.f537c;
        Drawable drawable = zb0Var.f40998a;
        if (drawable != null) {
            if (!(drawable instanceof la0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                float max = Math.max(getMeasuredWidth() / zb0Var.f40998a.getIntrinsicWidth(), (getMeasuredHeight() + zb0Var.H) / zb0Var.f40998a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(zb0Var.f40998a.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(zb0Var.f40998a.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + zb0Var.H) / 2;
                zb0Var.f40998a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                zb0Var.f40998a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                zb0Var.f40998a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f536b);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        Paint paint;
        boolean d12;
        int o10;
        ?? r10;
        float f10;
        float f11;
        org.telegram.ui.Cells.y yVar;
        float f12;
        Paint paint2 = null;
        switch (this.f535a) {
            case 9:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f536b;
                int i3 = org.telegram.ui.ActionBar.k6.f27824a7;
                e6Var = ((org.telegram.ui.ActionBar.d2) ((org.telegram.ui.p5) this.f537c).d).resourceProvider;
                paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 10:
            case 16:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            default:
                super.dispatchDraw(canvas);
                return;
            case 11:
                RectF rectF = (RectF) this.f536b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f537c;
                int measuredWidth = w0Var.getMeasuredWidth();
                int i10 = w0Var.f30774e;
                float x10 = w0Var.getX();
                float f13 = w0Var.d;
                org.telegram.ui.ActionBar.e6 e6Var2 = w0Var.f30773c;
                if (e6Var2 != null) {
                    e6Var2.b(x10, f13, measuredWidth, i10);
                } else {
                    org.telegram.ui.ActionBar.k6.r(x10, f13, measuredWidth, i10);
                }
                float L = org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(18.0f);
                if (e6Var2 != null) {
                    paint = e6Var2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, L, L2, paint);
                if (e6Var2 != null) {
                    d12 = e6Var2.g();
                } else {
                    d12 = org.telegram.ui.ActionBar.k6.d1();
                }
                if (d12) {
                    float L3 = org.telegram.messenger.g0.L(18.0f);
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    if (e6Var2 != null) {
                        paint2 = e6Var2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, L3, L4, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f536b;
                paint4.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, ((pb) this.f537c).f48505f.f49178e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 13:
                float L5 = org.telegram.messenger.g0.L(20.0f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f536b;
                path.rewind();
                path.addRoundRect(rectF2, L5, L5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + getPaddingTop());
                k4.j jVar = (k4.j) this.f537c;
                jVar.w(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                jVar.w(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 14:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f536b;
                paint5.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27879d7, ((vo) this.f537c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 15:
                rx rxVar = (rx) this.f537c;
                if (!rxVar.H.f33584v0 && rxVar.f37834x > 0.0f) {
                    if (((Paint) this.f536b) == null) {
                        Paint paint6 = new Paint();
                        this.f536b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f536b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f536b).setAlpha((int) (rxVar.f37834x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f536b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 17:
                Paint paint7 = (Paint) this.f536b;
                li0 li0Var = (li0) this.f537c;
                int i11 = li0Var.N0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    o10 = i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, li0Var.f35759l0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, li0Var.f35759l0));
                } else {
                    o10 = i0.a.o(-1, 30);
                }
                paint7.setColor(o10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - org.telegram.messenger.g0.N(6.0f)) / 2.0f;
                float g7 = li0Var.g();
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g7, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g7);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint7);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g7);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 18:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f536b;
                u10 u10Var = (u10) this.f537c;
                x8 x8Var = u10Var.K;
                TextView textView = u10Var.L;
                float f14 = u10Var.P;
                if (f14 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    x8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - xq.f40452f.getInterpolation(f14);
                    float left = (u10Var.Q - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((u10Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    x8Var.setTranslationX(left);
                    textView.setTranslationX(-((u10Var.R - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 20:
                RectF rectF4 = (RectF) this.f537c;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f536b;
                x0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), x0Var.b());
                super.dispatchDraw(canvas);
                return;
            case 25:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f537c;
                if (profileActivity.X4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.f41838r.getX(), profileActivity.f41838r.getY());
                    r10 = 0;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.X4.getMeasuredWidth(), profileActivity.X4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.X4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    r10 = 0;
                    f10 = 0.0f;
                    f11 = 2.0f;
                }
                if (profileActivity.f41836q5 && profileActivity.f41844r6 != f10 && profileActivity.f41822o5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.f41838r.getMeasuredHeight() / f11) + profileActivity.f41838r.getY();
                    float L6 = org.telegram.messenger.g0.L(22.0f);
                    float x11 = ((profileActivity.f41838r.getX() + (org.telegram.messenger.g0.L(28.0f) - profileActivity.f41829p5)) - L6) - profileActivity.p4();
                    profileActivity.f41851s5.y0(x11, measuredHeight2 - (L6 / f11), L6, L6);
                    profileActivity.f41851s5.setAlpha(profileActivity.f41844r6);
                    canvas.save();
                    float f15 = profileActivity.f41844r6;
                    canvas.scale(f15, f15, profileActivity.f41851s5.r(), profileActivity.f41851s5.s());
                    profileActivity.f41851s5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.f41822o5 == f10) {
                        if (((nc) this.f536b) == null) {
                            nc ncVar = new nc(this);
                            this.f536b = ncVar;
                            ncVar.h = new pu0(this, r10);
                        }
                        float L7 = (1.0f - profileActivity.f41822o5) * org.telegram.messenger.g0.L(28.0f);
                        float textWidth = profileActivity.f41838r.getTextWidth();
                        if (profileActivity.T != null) {
                            f12 = (org.telegram.messenger.g0.L(24.0f) + textWidth + org.telegram.messenger.g0.L(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f12 = f10;
                        }
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        rectF5.set(x11 - org.telegram.messenger.g0.L(4.0f), measuredHeight2 - org.telegram.messenger.g0.L(14.0f), x11 + Math.max(textWidth, f12) + L7 + org.telegram.messenger.g0.L(4.0f), measuredHeight2 + org.telegram.messenger.g0.L(14.0f));
                        nc ncVar2 = (nc) this.f536b;
                        ncVar2.f36439i = r10;
                        ncVar2.f36435c = r10;
                        ncVar2.a(rectF5);
                        nc ncVar3 = (nc) this.f536b;
                        ncVar3.f36444n = true;
                        int o11 = i0.a.o(-1, 50);
                        ncVar3.f36438g.setColor((int) r10);
                        org.telegram.ui.Cells.y yVar2 = ncVar3.f36436e;
                        if (yVar2 != null) {
                            org.telegram.ui.ActionBar.k6.H1(yVar2, o11, true);
                        }
                        nc ncVar4 = (nc) this.f536b;
                        ncVar4.c(canvas, ncVar4.f36438g);
                        org.telegram.ui.Cells.y yVar3 = ncVar4.f36436e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    nc ncVar5 = (nc) this.f536b;
                    if (ncVar5 != null && (yVar = ncVar5.f36436e) != null) {
                        yVar.setState(StateSet.NOTHING);
                        yVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 29:
                ImageReceiver imageReceiver = (ImageReceiver) this.f536b;
                imageReceiver.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.h(canvas, null);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f535a) {
            case 4:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    dh.a0 a0Var = (dh.a0) this.f537c;
                    if (!a0Var.f8939k) {
                        return true;
                    }
                    a0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f535a) {
            case 4:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f10;
        int L;
        switch (this.f535a) {
            case 7:
                ua uaVar = (ua) ((ke) this.f537c).f2717c;
                if (uaVar != null) {
                    return uaVar.b(motionEvent, new ca(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            case 8:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f537c;
                t9 n4 = i4Var.R0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f536b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (i4Var.R0.x() && i4Var.R0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n4.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && i4Var.R0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!i4Var.R0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f537c;
                if (s0Var.K != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(s0Var.K.getX(), s0Var.K.getY());
                    boolean dispatchTouchEvent = s0Var.K.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        s0Var.K = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = s0Var.G.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!s0Var.G.isInProgress() && ((GestureDetector) s0Var.H.f40562a).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    s0Var.I = false;
                    s0Var.J = false;
                    q1.g gVar = s0Var.T;
                    if (!gVar.f53647f) {
                        float f11 = s0Var.R;
                        gVar.f53644b = f11;
                        gVar.f53645c = true;
                        q1.h hVar = gVar.f53653m;
                        int i3 = s0Var.N;
                        float f12 = (i3 / 2.0f) + f11;
                        int i10 = org.telegram.messenger.g0.f22608q.x;
                        if (f12 >= i10 / 2.0f) {
                            L = (i10 - i3) - org.telegram.messenger.g0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(16.0f);
                        }
                        hVar.f53661i = L;
                        s0Var.T.h();
                    }
                    q1.g gVar2 = s0Var.U;
                    if (!gVar2.f53647f) {
                        gVar2.f53644b = s0Var.S;
                        gVar2.f53645c = true;
                        gVar2.f53653m.f53661i = be.a(f10, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.f22608q.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f));
                        s0Var.U.h();
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
        float f10;
        Rect rect;
        switch (this.f535a) {
            case 5:
                Path path = (Path) this.f536b;
                gi.j5 j5Var = (gi.j5) this.f537c;
                if (j5Var.h != null && (((z10 = j5Var.f13012f) && view == j5Var.d) || (!z10 && view == j5Var.f13010c))) {
                    if (z10) {
                        f10 = j5Var.f13011e;
                    } else {
                        f10 = 1.0f - j5Var.f13011e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 22:
                if (view instanceof nb0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 26:
                if (view != ((SecretMediaViewer) this.f536b).f41976x && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 27:
                Path path2 = (Path) this.f536b;
                iz0 iz0Var = (iz0) this.f537c;
                RectF rectF = iz0Var.S;
                if (view != iz0Var.O && view != iz0Var.f46472y) {
                    if (view == iz0Var.Q) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + iz0Var.O.getX(), rectF.centerY() + iz0Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(iz0Var.U, 0.0f, iz0Var.f46469s), getWidth(), org.telegram.messenger.g0.T1(iz0Var.V, getHeight(), iz0Var.f46469s));
                        canvas.translate(-iz0Var.Q.getX(), -iz0Var.Q.getY());
                        canvas.translate(iz0Var.O.getX() + rectF.left, iz0Var.O.getY() + rectF.top);
                        canvas.scale(rectF.width() / iz0Var.Q.getMeasuredWidth(), rectF.height() / iz0Var.Q.getMeasuredHeight(), iz0Var.Q.getX(), iz0Var.Q.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(iz0Var.U, 0.0f, iz0Var.f46469s), getWidth(), org.telegram.messenger.g0.T1(iz0Var.V, getHeight(), iz0Var.f46469s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 28:
                if (view == ((g11) this.f537c).f45456i0 && dh.d0.f8983b && dh.d0.f8986f) {
                    for (int i3 = 0; i3 < ((g11) this.f537c).f45456i0.getChildCount(); i3++) {
                        View childAt = ((g11) this.f537c).f45456i0.getChildAt(i3);
                        if (childAt instanceof q01) {
                            q01 q01Var = (q01) childAt;
                            if (q01Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f536b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f536b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (q01Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f536b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f536b).set((int) (rect.centerX() - (q01Var.getAnimatedScale() * (((Rect) this.f536b).width() / 2.0f))), (int) (((Rect) this.f536b).centerY() - (q01Var.getAnimatedScale() * (((Rect) this.f536b).height() / 2.0f))), (int) ((q01Var.getAnimatedScale() * (((Rect) this.f536b).width() / 2.0f)) + ((Rect) this.f536b).centerX()), (int) ((q01Var.getAnimatedScale() * (((Rect) this.f536b).height() / 2.0f)) + ((Rect) this.f536b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f536b);
                                canvas.scale(q01Var.getAnimatedScale(), q01Var.getAnimatedScale(), ((Rect) this.f536b).centerX(), ((Rect) this.f536b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof l01) || (childAt instanceof k01) || (childAt instanceof m01)) {
                            ((Rect) this.f536b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f536b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e(int i3, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f536b;
        if (z10) {
            org.telegram.messenger.g0.R3(imageView, i3);
        } else {
            imageView.setImageResource(i3);
        }
        ((TextView) this.f537c).setText(charSequence);
        requestLayout();
    }

    public void f(float f10) {
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f536b;
        h6Var.a();
        h6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(be.a(f10, 0.0f, 1.0f) * 100.0f))), !bd.f21784a0, true);
        org.telegram.ui.s6 s6Var = (org.telegram.ui.s6) this.f537c;
        s6Var.f49373c = f10;
        s6Var.invalidate();
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f535a) {
            case 4:
                dh.a0 a0Var = (dh.a0) this.f537c;
                float f10 = a0Var.f8949u;
                float f11 = rect.bottom;
                if (f10 != f11 && a0Var.v) {
                    a0Var.f8949u = f11;
                    c0 c0Var = a0Var.f8933c;
                    dh.z zVar = a0Var.f8931a;
                    if (!a0Var.f8945q) {
                        float f12 = a0Var.f8948t;
                        int L = org.telegram.messenger.g0.L(32.0f);
                        int i3 = a0Var.f8952y;
                        if (i3 == 1 || i3 == 2) {
                            L = org.telegram.messenger.g0.L(24.0f);
                        }
                        float f13 = L;
                        if (zVar.getMeasuredHeight() + f12 > (c0Var.getMeasuredHeight() - a0Var.f8949u) - f13) {
                            f12 = ((c0Var.getMeasuredHeight() - a0Var.f8949u) - zVar.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        zVar.animate().translationY(f12).setDuration(250L).setUpdateListener(new dh.t(a0Var, 1)).setInterpolator(xq.f40452f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f535a) {
            case 3:
                super.onAttachedToWindow();
                ((dh.k) this.f536b).c();
                return;
            case 4:
                super.onAttachedToWindow();
                setTag(2131296351, (h1) this.f536b);
                return;
            case 22:
                super.onAttachedToWindow();
                is isVar = (is) this.f537c;
                isVar.A.P();
                isVar.B.P();
                return;
            case 25:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f537c).f41851s5.P();
                return;
            case 26:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f536b).h.P();
                return;
            case 29:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f536b).P();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f535a) {
            case 19:
                org.telegram.messenger.g0.v(getContext(), configuration);
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f537c;
                org.telegram.messenger.g0.y3(s0Var.f39592b, s0Var.d, s0Var.f39594c);
                s0Var.a(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f535a) {
            case 3:
                super.onDetachedFromWindow();
                ((dh.k) this.f536b).d();
                return;
            case 4:
                super.onDetachedFromWindow();
                setTag(2131296351, null);
                return;
            case 22:
                super.onDetachedFromWindow();
                is isVar = (is) this.f537c;
                isVar.A.R();
                isVar.B.R();
                return;
            case 25:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f537c).f41851s5.R();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f536b).h.R();
                return;
            case 29:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f536b).R();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: ai.c0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nc ncVar;
        switch (this.f535a) {
            case 7:
                ua uaVar = (ua) ((ke) this.f537c).d;
                if (uaVar != null) {
                    return uaVar.b(motionEvent, new ca(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                if ((((ProfileActivity) this.f537c).f41822o5 == 0.0f && (ncVar = (nc) this.f536b) != null && ncVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f535a) {
            case 7:
                super.onLayout(z10, i3, i10, i11, i12);
                u90 u90Var = (u90) ((ke) this.f537c).f2718e;
                if (u90Var != null) {
                    u90Var.run();
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i3, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int y9 = org.telegram.messenger.camera.q.y(275.0f, i14, 2);
                o50 o50Var = (o50) this.f537c;
                FrameLayout frameLayout = o50Var.f48194r;
                int i15 = 0;
                frameLayout.layout(0, y9, frameLayout.getMeasuredWidth(), o50Var.f48194r.getMeasuredHeight() + y9);
                int L = org.telegram.messenger.g0.L(139.0f) + org.telegram.messenger.g0.L(150.0f) + y9;
                int measuredWidth = (getMeasuredWidth() - o50Var.f48191e.getMeasuredWidth()) / 2;
                da daVar = o50Var.f48191e;
                daVar.layout(measuredWidth, L, daVar.getMeasuredWidth() + measuredWidth, o50Var.f48191e.getMeasuredHeight() + L);
                b5.l lVar = o50Var.d;
                lVar.layout(0, 0, lVar.getMeasuredWidth(), o50Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - o50Var.f48193n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - o50Var.f48193n.getMeasuredWidth()) / 2;
                fi.j jVar = o50Var.f48193n;
                jVar.layout(measuredWidth2, measuredHeight, jVar.getMeasuredWidth() + measuredWidth2, o50Var.f48193n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - org.telegram.messenger.g0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - o50Var.f48192f.getMeasuredWidth()) / 2;
                TextView textView = o50Var.f48192f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), o50Var.f48192f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.f536b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(4);
                if (!org.telegram.messenger.g0.Q1()) {
                    i15 = org.telegram.messenger.g0.f22602m;
                }
                int i16 = L3 + i15;
                if (marginLayoutParams.topMargin != i16) {
                    marginLayoutParams.topMargin = i16;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 24:
                int L4 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.camera.q.y(275.0f, ((i12 - i10) / 4) * 3, 2);
                int L5 = org.telegram.messenger.g0.L(18.0f);
                TextView textView2 = (TextView) this.f537c;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = org.telegram.messenger.g0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = org.telegram.messenger.g0.L(16.0f);
                TextView textView3 = (TextView) this.f536b;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 25:
                super.onLayout(z10, i3, i10, i11, i12);
                ((ProfileActivity) this.f537c).q5();
                return;
            case 26:
                super.onLayout(z10, i3, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f537c;
                if (secretMediaViewer.f41953n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f41953n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f22602m;
                    bz0 bz0Var = secretMediaViewer.f41953n;
                    bz0Var.layout(bz0Var.getLeft(), currentActionBarHeight, secretMediaViewer.f41953n.getRight(), secretMediaViewer.f41953n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f41962r != null && secretMediaViewer.f41953n != null) {
                    int measuredHeight2 = (secretMediaViewer.f41953n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f41953n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f22602m)) - org.telegram.messenger.g0.L(10.0f);
                    gi.l3 l3Var = secretMediaViewer.f41962r;
                    l3Var.layout(l3Var.getLeft(), measuredHeight2, secretMediaViewer.f41962r.getRight(), secretMediaViewer.f41962r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
                    mp0 mp0Var = secretMediaViewer.Z;
                    mp0Var.layout(mp0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f41939f;
                if (view != null) {
                    int i17 = i12 - i10;
                    view.layout(0, i17, i11 - i3, org.telegram.messenger.g0.f22603n + i17);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        boolean z10;
        int i12;
        float f10;
        boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        StaticLayout staticLayout;
        int L;
        int measuredHeight;
        switch (this.f535a) {
            case 2:
                float f15 = 8.0f;
                int size = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(8.0f);
                TextView textView = (TextView) this.f537c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f16 = size;
                    if (measureText > f16) {
                        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length) {
                                if (textPaint.measureText(split[i13]) > f16) {
                                    staticLayout = null;
                                    f13 = f16;
                                    f14 = 12.0f;
                                    i11 = 2;
                                    z10 = true;
                                } else {
                                    i13++;
                                }
                            } else {
                                f13 = f16;
                                f14 = 12.0f;
                                i11 = 2;
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                        }
                        if (staticLayout != null && staticLayout.getLineCount() <= i11) {
                            i12 = i11;
                            f10 = 11.0f;
                        } else {
                            f10 = Math.max(8.0f, (f13 * f14) / measureText);
                            i12 = z10 ? 1 : 0;
                        }
                    } else {
                        i11 = 2;
                        z10 = true;
                        i12 = 1;
                        f10 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f10);
                    textView.setMaxLines(i12);
                    if (i12 == z10) {
                        z11 = z10 ? 1 : 0;
                    } else {
                        z11 = false;
                    }
                    textView.setSingleLine(z11);
                    if (i12 == i11) {
                        f11 = 0.85f;
                    } else {
                        f11 = 1.0f;
                    }
                    textView.setLineSpacing(0.0f, f11);
                    if (i12 == i11) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    if (i12 == i11) {
                        f12 = 29.0f;
                    } else {
                        f12 = 35.0f;
                    }
                    layoutParams.topMargin = org.telegram.messenger.g0.L(f12);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.f536b).getLayoutParams();
                    if (i12 == i11) {
                        f15 = 4.0f;
                    }
                    layoutParams2.topMargin = org.telegram.messenger.g0.L(f15);
                }
                super.onMeasure(i3, i10);
                return;
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.f536b;
                kg.e eVar = (kg.e) this.f537c;
                if (eVar.L && eVar.K) {
                    super.onMeasure(i3, i10);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                if (size2 == 0) {
                    size2 = viewGroup.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22602m;
                }
                int L2 = org.telegram.messenger.g0.L(50.0f);
                int i14 = 0;
                if (eVar.f16953w != 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(30.0f) + L2;
                }
                if (!eVar.F && !eVar.f16954x) {
                    L += L2;
                }
                int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i14 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 8:
                super.onMeasure(i3, i10);
                super.onMeasure(i3, org.telegram.messenger.camera.q.B(8.0f, ((LinearLayout) this.f536b).getMeasuredHeight(), 1073741824));
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(350.0f), 1073741824));
                return;
            case 14:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            case 26:
                super.onMeasure(i3, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f537c;
                mp0 mp0Var = secretMediaViewer.Z;
                if (mp0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22602m;
                    if (secretMediaViewer.T.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.T.getMeasuredHeight();
                    }
                    mp0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f41939f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22603n, 1073741824));
                    return;
                }
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f535a) {
            case 16:
                zb0 zb0Var = (zb0) this.f537c;
                si.b bVar = zb0Var.I;
                super.onSizeChanged(i3, i10, i11, i12);
                if (i3 > 0 && i10 > 0) {
                    zb0Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i10 * 54) / i3)), Bitmap.Config.ARGB_8888);
                    zb0Var.L = new Canvas(zb0Var.K);
                    bVar.a(zb0Var.K);
                    bVar.b(i3, i10);
                    return;
                }
                return;
            case 19:
                super.onSizeChanged(i3, i10, i11, i12);
                Path path = (Path) this.f536b;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, i3, i10);
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: ai.c0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i3) {
        switch (this.f535a) {
            case 16:
                ((Paint) this.f536b).setColor(i3);
                return;
            default:
                super.setBackgroundColor(i3);
                return;
        }
    }

    public c0(int i3, Context context, boolean z10) {
        super(context);
        this.f535a = i3;
    }

    public c0(Object obj, Context context, Object obj2, int i3) {
        super(context);
        this.f535a = i3;
        this.f537c = obj;
        this.f536b = obj2;
    }

    public c0(org.telegram.ui.Cells.w0 w0Var, Context context) {
        super(context);
        this.f535a = 11;
        this.f537c = w0Var;
        this.f536b = new RectF();
    }

    public c0(dh.a0 a0Var, Context context) {
        super(context);
        this.f535a = 4;
        this.f537c = a0Var;
        this.f536b = new h1(this, 1);
    }

    public c0(pb pbVar, Context context) {
        super(context);
        this.f535a = 12;
        this.f537c = pbVar;
        this.f536b = new Paint(1);
    }

    public c0(iz0 iz0Var, Context context) {
        super(context);
        this.f535a = 27;
        this.f537c = iz0Var;
        this.f536b = new Path();
    }

    public c0(org.telegram.ui.p5 p5Var, Activity activity) {
        super(activity);
        this.f535a = 9;
        this.f537c = p5Var;
        this.f536b = new Paint(1);
    }

    public c0(dh.o oVar, Context context) {
        super(context);
        this.f535a = 3;
        this.f537c = oVar;
        this.f536b = new dh.k(this, this);
    }

    public c0(Context context, org.telegram.ui.Components.voip.x0 x0Var) {
        super(context);
        this.f535a = 20;
        this.f537c = new RectF();
        this.f536b = x0Var;
        x0Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131743264, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(bd.M0(2131743265, null));
        addView(textView, mf.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, mf.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    private final void c(boolean z10) {
    }

    public c0(org.telegram.ui.Components.voip.s0 s0Var, Context context) {
        super(context);
        this.f535a = 19;
        this.f537c = s0Var;
        this.f536b = new Path();
    }

    public c0(ke keVar, Context context) {
        super(context);
        this.f535a = 7;
        this.f537c = keVar;
        ?? obj = new Object();
        obj.d = new z6.c((Object) obj);
        obj.f18687g = new ArrayList();
        obj.f18685e = this;
        obj.f18682a = context;
        this.f536b = obj;
        setClickable(true);
    }

    public c0(zb0 zb0Var, Context context) {
        super(context);
        this.f535a = 16;
        this.f537c = zb0Var;
        this.f536b = new Paint();
    }

    public c0(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f535a = 24;
        this.f537c = textView;
        this.f536b = textView2;
    }

    public c0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f535a = 26;
        this.f537c = secretMediaViewer;
        this.f536b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public c0(g11 g11Var, Context context) {
        super(context);
        this.f535a = 28;
        this.f537c = g11Var;
        this.f536b = new Rect();
    }

    public c0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f535a = 0;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f536b = h6Var;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(h6Var, mf.r(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f537c = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, mf.r(-2, -2, 1));
        addView(f10, mf.e(-2, -2, 17));
    }

    public c0(vo voVar, Context context) {
        super(context);
        this.f535a = 14;
        this.f537c = voVar;
        this.f536b = new Paint();
    }

    public c0(is isVar, Activity activity) {
        super(activity);
        this.f535a = 22;
        this.f537c = isVar;
        this.f536b = isVar;
        setWillNotDraw(false);
    }

    public c0(Context context, int i3) {
        super(context);
        this.f535a = i3;
        switch (i3) {
            case 13:
                super(context);
                this.f536b = new Path();
                this.f537c = new k4.j(24);
                return;
            default:
                ImageView imageView = new ImageView(context);
                this.f536b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, mf.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f537c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, mf.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
        }
    }

    public c0(li0 li0Var, Context context) {
        super(context);
        this.f535a = 17;
        this.f537c = li0Var;
        this.f536b = new Paint(1);
    }

    public c0(gi.j5 j5Var, Context context) {
        super(context);
        this.f535a = 5;
        this.f537c = j5Var;
        this.f536b = new Path();
    }
}
