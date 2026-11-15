package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import di.mb;
import hi.sa;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.rd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xt;
public final class g2 extends FrameLayout {
    public final int f3544a;
    public Object f3545b;

    public g2(int i7, Context context, Object obj) {
        super(context);
        this.f3544a = i7;
        this.f3545b = obj;
    }

    public jo a() {
        return ((jo[]) this.f3545b)[0];
    }

    @Override
    public void addView(View view, int i7, int i10) {
        switch (this.f3544a) {
            case 8:
                super.addView(view, i7, i10);
                ((jh.f) this.f3545b).e();
                return;
            default:
                super.addView(view, i7, i10);
                return;
        }
    }

    public void b(dh.c cVar, gh.e eVar) {
        lh.f fVar = (lh.f) this.f3545b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        jo[] joVarArr = (jo[]) this.f3545b;
        jo joVar = joVarArr[0];
        jo joVar2 = joVarArr[1];
        joVarArr[0] = joVar2;
        joVarArr[1] = joVar;
        joVar2.f36127n = true;
        joVar2.setVisibility(0);
        joVarArr[0].setScaleX(0.8f);
        joVarArr[0].setScaleY(0.8f);
        joVarArr[0].setAlpha(0.0f);
        joVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = joVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        er erVar = er.h;
        i20.n(translationY, erVar, 320L);
        jo joVar3 = joVarArr[1];
        joVar3.f36127n = false;
        joVar3.setVisibility(0);
        joVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(erVar).setDuration(320L).withEndAction(new fo(joVar3, 1)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        int size;
        boolean z11;
        float f12;
        int L;
        int i7;
        float f13;
        float f14;
        float f15;
        float L2;
        ArrayList arrayList;
        switch (this.f3544a) {
            case 24:
                ok0 ok0Var = (ok0) this.f3545b;
                if (ok0Var.f38013r > 0.0f && ok0Var.f38010e != null) {
                    ok0Var.f38011f.reset();
                    float width = getWidth() / ok0Var.f38009c.getWidth();
                    ok0Var.f38011f.postScale(width, width);
                    ok0Var.d.setLocalMatrix(ok0Var.f38011f);
                    ok0Var.f38010e.setAlpha((int) (ok0Var.f38013r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ok0Var.f38010e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ok0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (ok0Var.f38013r * 255.0f));
                    canvas.save();
                    float f16 = ok0Var.I;
                    float f17 = ok0Var.H;
                    float f18 = ok0Var.f38013r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + ok0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(ok0Var.K, ok0Var.L), Math.max(ok0Var.K, ok0Var.L), 0.75f), 1.0f, ok0Var.f38013r);
                    canvas.scale(T1, T1, ((ok0Var.F.getBounds().width() / 2.0f) * ok0Var.K) + (-ok0Var.I) + ok0Var.F.getBounds().left, ((ok0Var.F.getBounds().height() / 2.0f) * ok0Var.L) + (-ok0Var.J) + ok0Var.F.getBounds().top);
                    fh.g gVar = ok0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (ok0Var.f38013r * 255.0f));
                        ok0Var.G.draw(canvas);
                    }
                    ok0Var.F.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                rw0 rw0Var = (rw0) this.f3545b;
                pw0 pw0Var = rw0Var.f39076c;
                if (pw0Var != null && pw0Var.getEditField() != null) {
                    org.telegram.messenger.g6 g6Var = rw0Var.W;
                    if (g6Var != null && g6Var.h) {
                        float x10 = rw0Var.f39076c.getEditField().getX() + rw0Var.f39076c.getEditField().getPaddingLeft();
                        org.telegram.messenger.g6 g6Var2 = rw0Var.W;
                        rw0Var.f39078d0 = x10 + g6Var2.f23698n;
                        rw0Var.f39073a0 = g6Var2.f23699r;
                    } else if (rw0Var.f39075b0 != null && rw0Var.f39077c0 != null) {
                        rw0Var.f39078d0 = rw0Var.f39076c.getEditField().getX() + rw0Var.f39076c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                if (rw0Var.f39086s && !rw0Var.f39087w && (arrayList = rw0Var.f39088x) != null && !arrayList.isEmpty() && !rw0Var.f39089y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.u5 u5Var = rw0Var.S;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = u5Var.e(false, f10);
                org.telegram.ui.Components.u5 u5Var2 = rw0Var.T;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e11 = u5Var2.e(false, f11);
                float e12 = rw0Var.f39080e0.e(false, rw0Var.f39078d0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z10) {
                    rw0Var.d.setVisibility(8);
                }
                rw0Var.P.rewind();
                float left = rw0Var.f39079e.getLeft();
                int left2 = rw0Var.f39079e.getLeft();
                ArrayList arrayList2 = rw0Var.f39088x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.k5.D(44.0f, size, left2);
                org.telegram.ui.Components.u5 u5Var3 = rw0Var.f39083g0;
                float f19 = u5Var3.f39903c;
                if (f19 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = u5Var3.e(z11, f20);
                }
                float e13 = rw0Var.f39082f0.e(z11, (left + D) / 2.0f);
                pw0 pw0Var2 = rw0Var.f39076c;
                if (pw0Var2 != null && pw0Var2.getEditField() != null) {
                    int i10 = rw0Var.h;
                    if (i10 == 0) {
                        rw0Var.d.setTranslationY(((((-rw0Var.f39076c.getEditField().getHeight()) - rw0Var.f39076c.getEditField().getScrollY()) + rw0Var.f39073a0) + org.telegram.messenger.g0.L(5.0f)) - rw0Var.f39076c.getEditFieldBottomOffset());
                    } else if (i10 == 1) {
                        rw0Var.d.setTranslationY((((((-rw0Var.getMeasuredHeight()) - rw0Var.f39076c.getEditField().getScrollY()) + rw0Var.f39073a0) + org.telegram.messenger.g0.L(20.0f)) + rw0Var.d.getHeight()) - rw0Var.f39076c.getEditFieldBottomOffset());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((rw0Var.f39078d0 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - rw0Var.f39079e.getLeft(), 0.0f);
                if (rw0Var.f39079e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    rw0Var.f39079e.setPadding(max, 0, 0, 0);
                    rw0Var.f39079e.scrollBy(rw0Var.f39079e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                rw0Var.f39079e.setTranslationX(((int) Math.max((e12 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - rw0Var.f39079e.getLeft(), 0.0f)) - max);
                float translationX = rw0Var.f39079e.getTranslationX() + (e13 - f22) + rw0Var.f39079e.getPaddingLeft();
                float translationY = rw0Var.f39079e.getTranslationY() + rw0Var.f39079e.getTop() + rw0Var.f39079e.getPaddingTop();
                if (rw0Var.h == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(6.66f);
                }
                float f23 = translationY + L;
                float min = Math.min(rw0Var.f39079e.getTranslationX() + e13 + f22 + rw0Var.f39079e.getPaddingLeft(), rw0Var.getWidth() - rw0Var.d.getPaddingRight());
                float translationY2 = rw0Var.f39079e.getTranslationY() + rw0Var.f39079e.getBottom();
                if (rw0Var.h == 0) {
                    i7 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    i7 = 0;
                }
                float f24 = translationY2 - i7;
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f22) * 2.0f;
                int i11 = rw0Var.h;
                if (i11 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    rw0Var.P.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    rw0Var.P.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    rw0Var.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    rw0Var.P.arcTo(rectF, 0.0f, 90.0f);
                    rw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f24);
                    rw0Var.P.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + f24);
                    rw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f24);
                } else if (i11 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    rw0Var.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    rw0Var.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    rw0Var.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    rw0Var.P.arcTo(rectF2, -180.0f, 90.0f);
                    rw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f23);
                    rw0Var.P.lineTo(e12, f23 - org.telegram.messenger.g0.L(6.66f));
                    rw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f23);
                }
                rw0Var.P.close();
                if (rw0Var.R == null) {
                    Paint paint = new Paint(1);
                    rw0Var.R = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    rw0Var.R.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    rw0Var.R.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29154tf, rw0Var.f39074b));
                }
                if (e10 < f12) {
                    rw0Var.Q.rewind();
                    if (rw0Var.h == 0) {
                        L2 = org.telegram.messenger.g0.L(6.66f) + f24;
                    } else {
                        L2 = f23 - org.telegram.messenger.g0.L(6.66f);
                    }
                    double d = e12 - translationX;
                    double d2 = L2 - f23;
                    f13 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L2 - f24;
                    rw0Var.Q.addCircle(e12, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(rw0Var.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, rw0Var.getWidth(), rw0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(rw0Var.P, rw0Var.R);
                canvas.save();
                canvas.clipPath(rw0Var.P);
                super.dispatchDraw(canvas);
                float f33 = rw0Var.f39083g0.f39903c;
                float f34 = rw0Var.f39082f0.f39903c;
                float f35 = f33 / 2.0f;
                float translationX2 = rw0Var.f39079e.getTranslationX() + (f34 - f35) + rw0Var.f39079e.getPaddingLeft();
                float paddingTop = rw0Var.f39079e.getPaddingTop() + rw0Var.f39079e.getTop();
                float min3 = Math.min(rw0Var.f39079e.getTranslationX() + f34 + f35 + rw0Var.f39079e.getPaddingLeft(), rw0Var.getWidth() - rw0Var.d.getPaddingRight());
                float bottom = rw0Var.f39079e.getBottom();
                org.telegram.ui.Components.u5 u5Var4 = rw0Var.U;
                if (rw0Var.f39079e.canScrollHorizontally(-1)) {
                    f14 = f12;
                } else {
                    f14 = 0.0f;
                }
                float e14 = u5Var4.e(false, f14);
                if (e14 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.j6.F4.setBounds(i12, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.j6.F4.setAlpha((int) (e14 * f13));
                    org.telegram.ui.ActionBar.j6.F4.draw(canvas);
                }
                org.telegram.ui.Components.u5 u5Var5 = rw0Var.V;
                if (rw0Var.f39079e.canScrollHorizontally(1)) {
                    f15 = f12;
                } else {
                    f15 = 0.0f;
                }
                float e15 = u5Var5.e(false, f15);
                if (e15 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.j6.E4.setBounds(i13 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.j6.E4.setAlpha((int) (e15 * f13));
                    org.telegram.ui.ActionBar.j6.E4.draw(canvas);
                }
                canvas.restore();
                if (rw0Var.S.f39903c < f12) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f3544a) {
            case 25:
                oe oeVar = (oe) this.f3545b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && oeVar.isShowing()) {
                    oeVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f3544a) {
            case 24:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((ok0) this.f3545b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        tr0[] tr0VarArr;
        tr0 tr0Var;
        switch (this.f3544a) {
            case 3:
                if (((mb) this.f3545b).f9084u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((ii.f) this.f3545b).f15971t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                dl dlVar = (dl) this.f3545b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < dlVar.f34001x0 || motionEvent.getY() > dlVar.f34003y0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                x80 x80Var = (x80) this.f3545b;
                w80 w80Var = x80Var.S;
                if (w80Var != null && (tr0Var = (tr0VarArr = w80Var.f42117n0)[0]) != null && tr0Var.h.getFastScroll() != null && tr0VarArr[0].h.getFastScroll().f42385n) {
                    return x80Var.S.Z(motionEvent);
                }
                w80 w80Var2 = x80Var.S;
                if (w80Var2 != null && w80Var2.P(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 27:
                it0 it0Var = (it0) this.f3545b;
                if (motionEvent.getActionMasked() == 0 && (it0Var.f35724e0 || motionEvent.getY() >= it0Var.f35719b0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r11, android.view.View r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.g2.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f3544a) {
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3544a) {
            case 18:
                bu buVar = (bu) this.f3545b;
                m71 m71Var = buVar.n1;
                xt xtVar = buVar.f33376m1;
                super.onDetachedFromWindow();
                try {
                    if (buVar.M0()) {
                        if (xtVar.getVisibility() != 0) {
                        }
                        if (m71Var.f() && !buVar.M0()) {
                            if (bu.S1 == buVar) {
                                bu.S1 = null;
                            }
                            m71Var.b();
                            return;
                        }
                        return;
                    }
                    if (xtVar.getParent() != null) {
                        removeView(xtVar);
                        xtVar.stopLoading();
                        xtVar.loadUrl("about:blank");
                        xtVar.destroy();
                    }
                    if (m71Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3544a) {
            case 1:
                super.onDraw(canvas);
                ch.o oVar = (ch.o) this.f3545b;
                if (oVar.f5180y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.f5180y, getWidth(), getHeight(), oVar.E);
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f3545b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f3545b = nVar;
                    nVar.f40799k = false;
                    nVar.f40801m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f3545b).f40795f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f3545b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 14:
                ((q9) this.f3545b).f38582e.a(canvas);
                return;
            case 15:
                dl dlVar = (dl) this.f3545b;
                dlVar.f33974a0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, dlVar.f33606a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - dlVar.f34004z0, dlVar.f33974a0);
                return;
            case 26:
                bt0 bt0Var = (bt0) this.f3545b;
                bt0Var.f33370o1.setBounds(0, bt0Var.f33372q1 - bt0Var.f29716t0, getMeasuredWidth(), getMeasuredHeight());
                bt0Var.f33370o1.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3544a) {
            case 15:
                dl dlVar = (dl) this.f3545b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < dlVar.f34001x0 || motionEvent.getY() > dlVar.f34003y0)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                bt0 bt0Var = (bt0) this.f3545b;
                if (motionEvent.getAction() == 0 && bt0Var.f33372q1 != 0 && motionEvent.getY() < bt0Var.f33372q1) {
                    bt0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int right;
        int left;
        int measuredWidth;
        int i15;
        int measuredWidth2;
        int measuredHeight;
        int L;
        int measuredHeight2;
        int i16;
        int i17;
        FrameLayout frameLayout;
        float f10;
        boolean z11;
        int i18;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float x10;
        switch (this.f3544a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ch.o oVar = (ch.o) this.f3545b;
                if (oVar.P && z10) {
                    oVar.j0(oVar.R.f57081e);
                    return;
                }
                return;
            case 10:
                int childCount = getChildCount();
                int i19 = i11 - i7;
                int i20 = -1;
                if (((org.telegram.ui.ActionBar.t1) this.f3545b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i19 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z12 = hd.f24101a0;
                    if (z12) {
                        i15 = paddingRight - max;
                    } else {
                        i15 = paddingLeft;
                    }
                    if (!z12) {
                        paddingLeft = paddingRight - max;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = org.telegram.messenger.g0.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i15, paddingTop, i15 + max, org.telegram.messenger.g0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, org.telegram.messenger.g0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i15, L2, i15 + max, org.telegram.messenger.g0.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, org.telegram.messenger.g0.L(40.0f) + L2);
                        return;
                    }
                    return;
                }
                View view = null;
                int i21 = 0;
                while (i21 < childCount) {
                    View childAt = getChildAt(i21);
                    Integer num = (Integer) childAt.getTag();
                    if (num != null) {
                        if (num.intValue() == i20) {
                            if (hd.f24101a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i19 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i19 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (hd.f24101a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.k5.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i19 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = i20.w(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (hd.f24101a0) {
                                if (findViewWithTag5 == null) {
                                    left = i19 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag5.getLeft() - org.telegram.messenger.g0.L(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i22 = left - measuredWidth;
                                childAt.layout(i22, getPaddingTop(), childAt.getMeasuredWidth() + i22, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                if (findViewWithTag5 == null) {
                                    right = getPaddingLeft();
                                } else {
                                    right = findViewWithTag5.getRight() + org.telegram.messenger.g0.L(8.0f);
                                }
                                childAt.layout(right, getPaddingTop(), childAt.getMeasuredWidth() + right, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (hd.f24101a0) {
                                childAt.layout((i19 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i19 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                    } else {
                        int measuredWidth3 = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        if (view != null) {
                            i14 = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                            i13 = ((view.getMeasuredHeight() - measuredHeight3) / 2) + view.getTop();
                        } else {
                            i13 = 0;
                            i14 = 0;
                        }
                        childAt.layout(i14, i13, measuredWidth3 + i14, measuredHeight3 + i13);
                    }
                    i21++;
                    i20 = -1;
                }
                return;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                int L3 = org.telegram.messenger.g0.L(36.0f);
                int i23 = ((i11 - i7) - L3) / 2;
                int i24 = ((i12 - i10) - L3) / 2;
                ((q9) this.f3545b).f38582e.f(i23, i24, i23 + L3, L3 + i24);
                return;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f3545b;
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i16 = getMeasuredWidth() / 2;
                    int i25 = measuredHeight / 2;
                    measuredHeight2 = org.telegram.messenger.g0.L(17.0f) + measuredHeight + i25;
                    i17 = i25 - org.telegram.messenger.g0.L(17.0f);
                    L = i16;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(13.0f);
                    int i26 = measuredWidth2 / 2;
                    int L4 = measuredWidth2 + i26 + org.telegram.messenger.g0.L(17.0f);
                    L = i26 - org.telegram.messenger.g0.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(13.0f);
                    i16 = L4;
                    i17 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f32403r0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f32403r0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f32403r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f32403r0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f32403r0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f32403r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f32403r0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32392l0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f32392l0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f32392l0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f32392l0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f32405s0;
                imageView.layout(i16 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f32405s0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f32405s0.getMeasuredWidth() / 2) + i16, (chatAttachAlertPhotoLayout.f32405s0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i27 = 0; i27 < 2; i27++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.T[i27];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i17 - (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.T[i27].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2) + i17);
                }
                return;
            case 21:
                super.onLayout(z10, i7, i10, i11, i12);
                s10 s10Var = (s10) this.f3545b;
                g2 g2Var = s10Var.f39146b;
                int[] iArr = s10Var.I;
                g2Var.getLocationOnScreen(iArr);
                s10Var.P = iArr[0];
                s10Var.O = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                return;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                ok0 ok0Var = (ok0) this.f3545b;
                g2 g2Var2 = ok0Var.f38014s;
                st0 st0Var = ok0Var.f38015w;
                Drawable drawable = ok0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (ok0Var.f38017y != null) {
                        float f11 = ok0Var.I;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = ok0Var.J;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z13 = false;
                        if (!ok0Var.M) {
                            if (f13 - frameLayout.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                ok0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                ok0Var.f38017y.setX(Math.min(st0Var.getWidth() - ok0Var.f38017y.getWidth(), f12 - org.telegram.messenger.g0.L(10.0f)) - st0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                ok0Var.E.setPivotX(viewGroup2.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                ok0Var.f38017y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f13) - ok0Var.f38017y.getMeasuredWidth()) - st0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((ok0Var.f38017y.getX() + ok0Var.f38017y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f13;
                            } else {
                                x10 = (ok0Var.f38017y.getX() + org.telegram.messenger.g0.L(10.0f)) - f12;
                            }
                            ok0Var.H = x10;
                        } else {
                            f10 = 4.0f;
                            z11 = false;
                        }
                        if (ok0Var.G != null) {
                            i18 = org.telegram.messenger.g0.L(21.0f);
                        } else {
                            i18 = 0;
                        }
                        float f17 = f16 + i18;
                        if (ok0Var.f38017y.getMeasuredHeight() + f17 > g2Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            ok0Var.E.setPivotY(viewGroup.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            ok0Var.f38017y.setY(((f15 - org.telegram.messenger.g0.L(f10)) - ok0Var.f38017y.getMeasuredHeight()) - st0Var.getY());
                            z13 = true;
                        } else {
                            ok0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            ok0Var.f38017y.setY(Math.min((g2Var2.getHeight() - ok0Var.f38017y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), f17) - st0Var.getY());
                        }
                        m60 m60Var = ok0Var.f38016x;
                        m60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f28383c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                bt0.I0((bt0) this.f3545b);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        View view;
        int L;
        int i12;
        int L2;
        int L3;
        switch (this.f3544a) {
            case 0:
                super.onMeasure(i7, i10);
                ((i2) this.f3545b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 10:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i13 = 0;
                if (((org.telegram.ui.ActionBar.t1) this.f3545b).L0) {
                    int max = Math.max(0, (measuredWidth - org.telegram.messenger.g0.L(8.0f)) / 2);
                    while (i13 < childCount) {
                        View childAt = getChildAt(i13);
                        if (childAt.getTag() != null) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
                        }
                        i13++;
                    }
                    return;
                }
                int i14 = 0;
                while (i13 < childCount) {
                    View childAt2 = getChildAt(i13);
                    if ((childAt2 instanceof TextView) && childAt2.getTag() != null) {
                        i14 = childAt2.getMeasuredWidth() + i14;
                    }
                    i13++;
                }
                if (i14 > measuredWidth) {
                    View findViewWithTag = findViewWithTag(-2);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-3);
                    if (findViewWithTag != null && findViewWithTag3 != null) {
                        if (findViewWithTag.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i14 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i14 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                        if (findViewWithTag2.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i14 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i14 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                if (View.MeasureSpec.getSize(i7) > org.telegram.messenger.g0.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(320.0f), 1073741824), i10);
                    return;
                } else {
                    super.onMeasure(i7, i10);
                    return;
                }
            case 18:
                int size = View.MeasureSpec.getSize(i7);
                bu buVar = (bu) this.f3545b;
                int min = (int) Math.min(buVar.C1 / (buVar.B1 / size), org.telegram.messenger.g0.f23609q.y / 2);
                if (buVar.E1) {
                    i11 = 22;
                } else {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 84) + min + 1, 1073741824));
                return;
            case 19:
                lx lxVar = (lx) this.f3545b;
                if (((View) lxVar.G.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - lxVar.G.getY());
                } else {
                    L = org.telegram.messenger.g0.L(120.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L - lxVar.G.f36938c1, 1073741824));
                return;
            case 20:
                ly lyVar = ((gy) this.f3545b).R;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i20.y(8.0f, lyVar.E0.getMeasuredHeight() - lyVar.f36938c1, 3) * 1.7f), 1073741824));
                return;
            case 26:
                bt0 bt0Var = (bt0) this.f3545b;
                di.c1 c1Var = bt0Var.f33369m1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f23603m;
                getMeasuredWidth();
                int D = org.telegram.messenger.k5.D(54.0f, rd.g(), org.telegram.messenger.k5.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i15 = size2 / 5;
                if (D < i15 * 3) {
                    i12 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i12 = i15 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (c1Var.getPaddingTop() != i12) {
                    bt0Var.f33373r1 = true;
                    c1Var.setPadding(0, i12, 0, org.telegram.messenger.g0.L(8.0f));
                    bt0Var.f33373r1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 29:
                rw0 rw0Var = (rw0) this.f3545b;
                int i16 = rw0Var.f39084n;
                if (rw0Var.h == 0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(6.66f);
                }
                int i17 = rw0Var.f39084n;
                if (rw0Var.h == 0) {
                    L3 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    L3 = org.telegram.messenger.g0.L(8.0f);
                }
                setPadding(i16, L2, i17, L3);
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f3544a) {
            case 24:
                super.onSizeChanged(i7, i10, i11, i12);
                ok0 ok0Var = (ok0) this.f3545b;
                ih.d.c(ok0Var.h, ok0Var.f38014s);
                ViewGroup viewGroup = ok0Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3544a) {
            case 26:
                if (!((bt0) this.f3545b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f3544a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.f3545b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f3544a) {
            case 23:
                uj0 uj0Var = (uj0) this.f3545b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(uj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(uj0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, uj0Var.f40047c1.getMeasuredWidth(), uj0Var.f40047c1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                if (!((bt0) this.f3545b).f33373r1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 28:
                if (!((bw0) this.f3545b).f33397b2) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f3544a) {
            case 2:
                super.setTranslationY(f10);
                di.c6 c6Var = (di.c6) this.f3545b;
                di.h4 h4Var = c6Var.f8307a2;
                if (h4Var != null && h4Var.getVisibility() == 0) {
                    c6Var.f8307a2.invalidate();
                    return;
                }
                return;
            case 5:
                sa saVar = (sa) this.f3545b;
                if (getTranslationY() != f10 && saVar.f15048d1 != null) {
                    super.setTranslationY(f10);
                    saVar.f15048d1.y();
                    return;
                }
                return;
            case 11:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f3545b;
                FrameLayout frameLayout = u2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(u2Var.f29685c.getHeight() - u2Var.f29682b.getY())) + u2Var.f29716t0);
                }
                u2Var.g0(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.f3544a) {
            case 21:
                super.setVisibility(i7);
                ((s10) this.f3545b).d.setVisibility(i7);
                return;
            case 29:
                rw0 rw0Var = (rw0) this.f3545b;
                if (getVisibility() == i7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                super.setVisibility(i7);
                if (!z10) {
                    if (i7 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (rw0Var.f39079e != null) {
                        for (int i10 = 0; i10 < rw0Var.f39079e.getChildCount(); i10++) {
                            if (z11) {
                                qw0 qw0Var = (qw0) rw0Var.f39079e.getChildAt(i10);
                                Drawable drawable = qw0Var.f38778b;
                                if (drawable instanceof org.telegram.ui.Components.g5) {
                                    ((org.telegram.ui.Components.g5) drawable).a(qw0Var);
                                }
                                qw0Var.f38779c = true;
                            } else {
                                qw0 qw0Var2 = (qw0) rw0Var.f39079e.getChildAt(i10);
                                Drawable drawable2 = qw0Var2.f38778b;
                                if (drawable2 instanceof org.telegram.ui.Components.g5) {
                                    ((org.telegram.ui.Components.g5) drawable2).n(qw0Var2);
                                }
                                qw0Var2.f38779c = false;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public g2(Context context, int i7) {
        super(context);
        this.f3544a = i7;
    }

    public g2(Context context) {
        super(context);
        this.f3544a = 7;
        lh.f fVar = new lh.f(context);
        this.f3545b = fVar;
        addView(fVar, ja.g());
    }

    public g2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f3544a = 17;
        this.f3545b = new jo[2];
        int i7 = 0;
        while (true) {
            jo[] joVarArr = (jo[]) this.f3545b;
            if (i7 < joVarArr.length) {
                joVarArr[i7] = new jo(context, e6Var);
                addView(((jo[]) this.f3545b)[i7], ja.e(-1, -1, 119));
                i7++;
            } else {
                joVarArr[0].setVisibility(0);
                ((jo[]) this.f3545b)[1].setVisibility(8);
                return;
            }
        }
    }

    public g2(Context context, String str, fi.b bVar) {
        super(context);
        this.f3544a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(this, d02, K, null, bVar);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, ja.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f3545b = h6Var;
        h6Var.b(0.6f, 450L, er.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, bVar);
        h6Var.setScaleProperty(0.7f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setAllowCancel(true);
        f10.addView(h6Var, ja.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i7, bVar);
        textView.setGravity(17);
        f10.addView(textView, ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public g2(ch.o oVar, Context context) {
        super(context);
        this.f3544a = 1;
        this.f3545b = oVar;
        setWillNotDraw(false);
    }

    public g2(it0 it0Var, Context context) {
        super(context);
        this.f3544a = 27;
        this.f3545b = it0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
