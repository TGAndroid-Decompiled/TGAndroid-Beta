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
import c8.na;
import di.pb;
import hi.nb;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.qd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.zw0;
public final class g3 extends FrameLayout {
    public final int f3603a;
    public Object f3604b;

    public g3(int i7, Context context, Object obj) {
        super(context);
        this.f3603a = i7;
        this.f3604b = obj;
    }

    public po a() {
        return ((po[]) this.f3604b)[0];
    }

    @Override
    public void addView(View view, int i7, int i10) {
        switch (this.f3603a) {
            case 8:
                super.addView(view, i7, i10);
                ((jh.f) this.f3604b).e();
                return;
            default:
                super.addView(view, i7, i10);
                return;
        }
    }

    public void b(dh.c cVar, gh.e eVar) {
        lh.f fVar = (lh.f) this.f3604b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        po[] poVarArr = (po[]) this.f3604b;
        po poVar = poVarArr[0];
        po poVar2 = poVarArr[1];
        poVarArr[0] = poVar2;
        poVarArr[1] = poVar;
        poVar2.f38531n = true;
        poVar2.setVisibility(0);
        poVarArr[0].setScaleX(0.8f);
        poVarArr[0].setScaleY(0.8f);
        poVarArr[0].setAlpha(0.0f);
        poVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = poVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        kr krVar = kr.h;
        m10.o(translationY, krVar, 320L);
        po poVar3 = poVarArr[1];
        poVar3.f38531n = false;
        poVar3.setVisibility(0);
        poVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(krVar).setDuration(320L).withEndAction(new lo(poVar3, 1)).start();
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
        switch (this.f3603a) {
            case 24:
                yk0 yk0Var = (yk0) this.f3604b;
                if (yk0Var.f42509r > 0.0f && yk0Var.f42506e != null) {
                    yk0Var.f42507f.reset();
                    float width = getWidth() / yk0Var.f42505c.getWidth();
                    yk0Var.f42507f.postScale(width, width);
                    yk0Var.d.setLocalMatrix(yk0Var.f42507f);
                    yk0Var.f42506e.setAlpha((int) (yk0Var.f42509r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yk0Var.f42506e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = yk0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (yk0Var.f42509r * 255.0f));
                    canvas.save();
                    float f16 = yk0Var.I;
                    float f17 = yk0Var.H;
                    float f18 = yk0Var.f42509r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + yk0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(yk0Var.K, yk0Var.L), Math.max(yk0Var.K, yk0Var.L), 0.75f), 1.0f, yk0Var.f42509r);
                    canvas.scale(T1, T1, ((yk0Var.F.getBounds().width() / 2.0f) * yk0Var.K) + (-yk0Var.I) + yk0Var.F.getBounds().left, ((yk0Var.F.getBounds().height() / 2.0f) * yk0Var.L) + (-yk0Var.J) + yk0Var.F.getBounds().top);
                    fh.g gVar = yk0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (yk0Var.f42509r * 255.0f));
                        yk0Var.G.draw(canvas);
                    }
                    yk0Var.F.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                zw0 zw0Var = (zw0) this.f3604b;
                xw0 xw0Var = zw0Var.f43058c;
                if (xw0Var != null && xw0Var.getEditField() != null) {
                    org.telegram.messenger.g6 g6Var = zw0Var.W;
                    if (g6Var != null && g6Var.h) {
                        float x10 = zw0Var.f43058c.getEditField().getX() + zw0Var.f43058c.getEditField().getPaddingLeft();
                        org.telegram.messenger.g6 g6Var2 = zw0Var.W;
                        zw0Var.f43060d0 = x10 + g6Var2.f24279n;
                        zw0Var.f43055a0 = g6Var2.f24280r;
                    } else if (zw0Var.f43057b0 != null && zw0Var.f43059c0 != null) {
                        zw0Var.f43060d0 = zw0Var.f43058c.getEditField().getX() + zw0Var.f43058c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                if (zw0Var.f43068s && !zw0Var.f43069w && (arrayList = zw0Var.f43070x) != null && !arrayList.isEmpty() && !zw0Var.f43071y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.c6 c6Var = zw0Var.S;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = c6Var.e(false, f10);
                org.telegram.ui.Components.c6 c6Var2 = zw0Var.T;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e11 = c6Var2.e(false, f11);
                float e12 = zw0Var.f43062e0.e(false, zw0Var.f43060d0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z10) {
                    zw0Var.d.setVisibility(8);
                }
                zw0Var.P.rewind();
                float left = zw0Var.f43061e.getLeft();
                int left2 = zw0Var.f43061e.getLeft();
                ArrayList arrayList2 = zw0Var.f43070x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.f3.D(44.0f, size, left2);
                org.telegram.ui.Components.c6 c6Var3 = zw0Var.f43065g0;
                float f19 = c6Var3.f33931c;
                if (f19 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = c6Var3.e(z11, f20);
                }
                float e13 = zw0Var.f43064f0.e(z11, (left + D) / 2.0f);
                xw0 xw0Var2 = zw0Var.f43058c;
                if (xw0Var2 != null && xw0Var2.getEditField() != null) {
                    int i10 = zw0Var.h;
                    if (i10 == 0) {
                        zw0Var.d.setTranslationY(((((-zw0Var.f43058c.getEditField().getHeight()) - zw0Var.f43058c.getEditField().getScrollY()) + zw0Var.f43055a0) + org.telegram.messenger.g0.L(5.0f)) - zw0Var.f43058c.getEditFieldBottomOffset());
                    } else if (i10 == 1) {
                        zw0Var.d.setTranslationY((((((-zw0Var.getMeasuredHeight()) - zw0Var.f43058c.getEditField().getScrollY()) + zw0Var.f43055a0) + org.telegram.messenger.g0.L(20.0f)) + zw0Var.d.getHeight()) - zw0Var.f43058c.getEditFieldBottomOffset());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((zw0Var.f43060d0 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - zw0Var.f43061e.getLeft(), 0.0f);
                if (zw0Var.f43061e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    zw0Var.f43061e.setPadding(max, 0, 0, 0);
                    zw0Var.f43061e.scrollBy(zw0Var.f43061e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                zw0Var.f43061e.setTranslationX(((int) Math.max((e12 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - zw0Var.f43061e.getLeft(), 0.0f)) - max);
                float translationX = zw0Var.f43061e.getTranslationX() + (e13 - f22) + zw0Var.f43061e.getPaddingLeft();
                float translationY = zw0Var.f43061e.getTranslationY() + zw0Var.f43061e.getTop() + zw0Var.f43061e.getPaddingTop();
                if (zw0Var.h == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(6.66f);
                }
                float f23 = translationY + L;
                float min = Math.min(zw0Var.f43061e.getTranslationX() + e13 + f22 + zw0Var.f43061e.getPaddingLeft(), zw0Var.getWidth() - zw0Var.d.getPaddingRight());
                float translationY2 = zw0Var.f43061e.getTranslationY() + zw0Var.f43061e.getBottom();
                if (zw0Var.h == 0) {
                    i7 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    i7 = 0;
                }
                float f24 = translationY2 - i7;
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f22) * 2.0f;
                int i11 = zw0Var.h;
                if (i11 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    zw0Var.P.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    zw0Var.P.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    zw0Var.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    zw0Var.P.arcTo(rectF, 0.0f, 90.0f);
                    zw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f24);
                    zw0Var.P.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + f24);
                    zw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f24);
                } else if (i11 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    zw0Var.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    zw0Var.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    zw0Var.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    zw0Var.P.arcTo(rectF2, -180.0f, 90.0f);
                    zw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f23);
                    zw0Var.P.lineTo(e12, f23 - org.telegram.messenger.g0.L(6.66f));
                    zw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f23);
                }
                zw0Var.P.close();
                if (zw0Var.R == null) {
                    Paint paint = new Paint(1);
                    zw0Var.R = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    zw0Var.R.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    zw0Var.R.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29756tf, zw0Var.f43056b));
                }
                if (e10 < f12) {
                    zw0Var.Q.rewind();
                    if (zw0Var.h == 0) {
                        L2 = org.telegram.messenger.g0.L(6.66f) + f24;
                    } else {
                        L2 = f23 - org.telegram.messenger.g0.L(6.66f);
                    }
                    double d = e12 - translationX;
                    double d2 = L2 - f23;
                    f13 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L2 - f24;
                    zw0Var.Q.addCircle(e12, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(zw0Var.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, zw0Var.getWidth(), zw0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(zw0Var.P, zw0Var.R);
                canvas.save();
                canvas.clipPath(zw0Var.P);
                super.dispatchDraw(canvas);
                float f33 = zw0Var.f43065g0.f33931c;
                float f34 = zw0Var.f43064f0.f33931c;
                float f35 = f33 / 2.0f;
                float translationX2 = zw0Var.f43061e.getTranslationX() + (f34 - f35) + zw0Var.f43061e.getPaddingLeft();
                float paddingTop = zw0Var.f43061e.getPaddingTop() + zw0Var.f43061e.getTop();
                float min3 = Math.min(zw0Var.f43061e.getTranslationX() + f34 + f35 + zw0Var.f43061e.getPaddingLeft(), zw0Var.getWidth() - zw0Var.d.getPaddingRight());
                float bottom = zw0Var.f43061e.getBottom();
                org.telegram.ui.Components.c6 c6Var4 = zw0Var.U;
                if (zw0Var.f43061e.canScrollHorizontally(-1)) {
                    f14 = f12;
                } else {
                    f14 = 0.0f;
                }
                float e14 = c6Var4.e(false, f14);
                if (e14 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.n6.F4.setBounds(i12, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.n6.F4.setAlpha((int) (e14 * f13));
                    org.telegram.ui.ActionBar.n6.F4.draw(canvas);
                }
                org.telegram.ui.Components.c6 c6Var5 = zw0Var.V;
                if (zw0Var.f43061e.canScrollHorizontally(1)) {
                    f15 = f12;
                } else {
                    f15 = 0.0f;
                }
                float e15 = c6Var5.e(false, f15);
                if (e15 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.n6.E4.setBounds(i13 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.n6.E4.setAlpha((int) (e15 * f13));
                    org.telegram.ui.ActionBar.n6.E4.draw(canvas);
                }
                canvas.restore();
                if (zw0Var.S.f33931c < f12) {
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
        switch (this.f3603a) {
            case 25:
                ye yeVar = (ye) this.f3604b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && yeVar.isShowing()) {
                    yeVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f3603a) {
            case 24:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((yk0) this.f3604b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ds0[] ds0VarArr;
        ds0 ds0Var;
        switch (this.f3603a) {
            case 3:
                if (((pb) this.f3604b).f9546u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((ii.t) this.f3604b).f16443t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                kl klVar = (kl) this.f3604b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < klVar.f36799x0 || motionEvent.getY() > klVar.f36801y0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                h90 h90Var = (h90) this.f3604b;
                g90 g90Var = h90Var.S;
                if (g90Var != null && (ds0Var = (ds0VarArr = g90Var.f36133n0)[0]) != null && ds0Var.h.getFastScroll() != null && ds0VarArr[0].h.getFastScroll().f36440n) {
                    return h90Var.S.Z(motionEvent);
                }
                g90 g90Var2 = h90Var.S;
                if (g90Var2 != null && g90Var2.P(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 27:
                st0 st0Var = (st0) this.f3604b;
                if (motionEvent.getActionMasked() == 0 && (st0Var.f39705e0 || motionEvent.getY() >= st0Var.f39700b0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r11, android.view.View r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.g3.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f3603a) {
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3603a) {
            case 18:
                gu guVar = (gu) this.f3604b;
                a81 a81Var = guVar.n1;
                cu cuVar = guVar.f35536m1;
                super.onDetachedFromWindow();
                try {
                    if (guVar.N0()) {
                        if (cuVar.getVisibility() != 0) {
                        }
                        if (a81Var.f() && !guVar.N0()) {
                            if (gu.S1 == guVar) {
                                gu.S1 = null;
                            }
                            a81Var.b();
                            return;
                        }
                        return;
                    }
                    if (cuVar.getParent() != null) {
                        removeView(cuVar);
                        cuVar.stopLoading();
                        cuVar.loadUrl("about:blank");
                        cuVar.destroy();
                    }
                    if (a81Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3603a) {
            case 1:
                super.onDraw(canvas);
                ch.p pVar = (ch.p) this.f3604b;
                if (pVar.f5465y > 0) {
                    canvas.drawRect(0.0f, getHeight() - pVar.f5465y, getWidth(), getHeight(), pVar.E);
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f3604b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f3604b = nVar;
                    nVar.f41078k = false;
                    nVar.f41080m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f3604b).f41074f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f3604b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 14:
                ((x9) this.f3604b).f41938e.a(canvas);
                return;
            case 15:
                kl klVar = (kl) this.f3604b;
                klVar.f36772a0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, klVar.f37134a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - klVar.f36802z0, klVar.f36772a0);
                return;
            case 26:
                lt0 lt0Var = (lt0) this.f3604b;
                lt0Var.f37214o1.setBounds(0, lt0Var.f37216q1 - lt0Var.f30260t0, getMeasuredWidth(), getMeasuredHeight());
                lt0Var.f37214o1.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3603a) {
            case 15:
                kl klVar = (kl) this.f3604b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < klVar.f36799x0 || motionEvent.getY() > klVar.f36801y0)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                lt0 lt0Var = (lt0) this.f3604b;
                if (motionEvent.getAction() == 0 && lt0Var.f37216q1 != 0 && motionEvent.getY() < lt0Var.f37216q1) {
                    lt0Var.dismiss();
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
        switch (this.f3603a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ch.p pVar = (ch.p) this.f3604b;
                if (pVar.P && z10) {
                    pVar.j0(pVar.R.f57779e);
                    return;
                }
                return;
            case 10:
                int childCount = getChildCount();
                int i19 = i11 - i7;
                int i20 = -1;
                if (((org.telegram.ui.ActionBar.t1) this.f3604b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i19 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z12 = gd.f24314a0;
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
                            if (gd.f24314a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i19 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i19 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (gd.f24314a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.f3.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i19 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = m10.x(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (gd.f24314a0) {
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
                            if (gd.f24314a0) {
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
                ((x9) this.f3604b).f41938e.f(i23, i24, i23 + L3, L3 + i24);
                return;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f3604b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f32900r0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f32900r0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f32900r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f32900r0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f32900r0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f32900r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f32900r0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32889l0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f32889l0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f32889l0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f32889l0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f32902s0;
                imageView.layout(i16 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f32902s0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f32902s0.getMeasuredWidth() / 2) + i16, (chatAttachAlertPhotoLayout.f32902s0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i27 = 0; i27 < 2; i27++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.T[i27];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i17 - (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.T[i27].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2) + i17);
                }
                return;
            case 21:
                super.onLayout(z10, i7, i10, i11, i12);
                a20 a20Var = (a20) this.f3604b;
                g3 g3Var = a20Var.f33327b;
                int[] iArr = a20Var.I;
                g3Var.getLocationOnScreen(iArr);
                a20Var.P = iArr[0];
                a20Var.O = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                return;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                yk0 yk0Var = (yk0) this.f3604b;
                g3 g3Var2 = yk0Var.f42510s;
                cu0 cu0Var = yk0Var.f42511w;
                Drawable drawable = yk0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (yk0Var.f42513y != null) {
                        float f11 = yk0Var.I;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = yk0Var.J;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z13 = false;
                        if (!yk0Var.M) {
                            if (f13 - frameLayout.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                yk0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                yk0Var.f42513y.setX(Math.min(cu0Var.getWidth() - yk0Var.f42513y.getWidth(), f12 - org.telegram.messenger.g0.L(10.0f)) - cu0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                yk0Var.E.setPivotX(viewGroup2.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                yk0Var.f42513y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f13) - yk0Var.f42513y.getMeasuredWidth()) - cu0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((yk0Var.f42513y.getX() + yk0Var.f42513y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f13;
                            } else {
                                x10 = (yk0Var.f42513y.getX() + org.telegram.messenger.g0.L(10.0f)) - f12;
                            }
                            yk0Var.H = x10;
                        } else {
                            f10 = 4.0f;
                            z11 = false;
                        }
                        if (yk0Var.G != null) {
                            i18 = org.telegram.messenger.g0.L(21.0f);
                        } else {
                            i18 = 0;
                        }
                        float f17 = f16 + i18;
                        if (yk0Var.f42513y.getMeasuredHeight() + f17 > g3Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            yk0Var.E.setPivotY(viewGroup.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            yk0Var.f42513y.setY(((f15 - org.telegram.messenger.g0.L(f10)) - yk0Var.f42513y.getMeasuredHeight()) - cu0Var.getY());
                            z13 = true;
                        } else {
                            yk0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            yk0Var.f42513y.setY(Math.min((g3Var2.getHeight() - yk0Var.f42513y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), f17) - cu0Var.getY());
                        }
                        x60 x60Var = yk0Var.f42512x;
                        x60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f28826c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                lt0.J0((lt0) this.f3604b);
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
        switch (this.f3603a) {
            case 0:
                super.onMeasure(i7, i10);
                ((i3) this.f3604b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 10:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i13 = 0;
                if (((org.telegram.ui.ActionBar.t1) this.f3604b).L0) {
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
                gu guVar = (gu) this.f3604b;
                int min = (int) Math.min(guVar.C1 / (guVar.B1 / size), org.telegram.messenger.g0.f24226q.y / 2);
                if (guVar.E1) {
                    i11 = 22;
                } else {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 84) + min + 1, 1073741824));
                return;
            case 19:
                px pxVar = (px) this.f3604b;
                if (((View) pxVar.G.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - pxVar.G.getY());
                } else {
                    L = org.telegram.messenger.g0.L(120.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L - pxVar.G.f39044c1, 1073741824));
                return;
            case 20:
                qy qyVar = ((ly) this.f3604b).R;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (m10.z(8.0f, qyVar.E0.getMeasuredHeight() - qyVar.f39044c1, 3) * 1.7f), 1073741824));
                return;
            case 26:
                lt0 lt0Var = (lt0) this.f3604b;
                di.b1 b1Var = lt0Var.f37213m1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f24220m;
                getMeasuredWidth();
                int D = org.telegram.messenger.f3.D(54.0f, qd.g(), org.telegram.messenger.f3.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i15 = size2 / 5;
                if (D < i15 * 3) {
                    i12 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i12 = i15 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (b1Var.getPaddingTop() != i12) {
                    lt0Var.f37217r1 = true;
                    b1Var.setPadding(0, i12, 0, org.telegram.messenger.g0.L(8.0f));
                    lt0Var.f37217r1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 29:
                zw0 zw0Var = (zw0) this.f3604b;
                int i16 = zw0Var.f43066n;
                if (zw0Var.h == 0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(6.66f);
                }
                int i17 = zw0Var.f43066n;
                if (zw0Var.h == 0) {
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
        switch (this.f3603a) {
            case 24:
                super.onSizeChanged(i7, i10, i11, i12);
                yk0 yk0Var = (yk0) this.f3604b;
                ih.d.c(yk0Var.h, yk0Var.f42510s);
                ViewGroup viewGroup = yk0Var.E;
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
        switch (this.f3603a) {
            case 26:
                if (!((lt0) this.f3604b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f3603a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.f3604b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f3603a) {
            case 23:
                ek0 ek0Var = (ek0) this.f3604b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(ek0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ek0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, ek0Var.f34745c1.getMeasuredWidth(), ek0Var.f34745c1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                if (!((lt0) this.f3604b).f37217r1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 28:
                if (!((jw0) this.f3604b).f36528b2) {
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
        switch (this.f3603a) {
            case 2:
                super.setTranslationY(f10);
                di.f6 f6Var = (di.f6) this.f3604b;
                di.k4 k4Var = f6Var.f8756a2;
                if (k4Var != null && k4Var.getVisibility() == 0) {
                    f6Var.f8756a2.invalidate();
                    return;
                }
                return;
            case 5:
                nb nbVar = (nb) this.f3604b;
                if (getTranslationY() != f10 && nbVar.f15067d1 != null) {
                    super.setTranslationY(f10);
                    nbVar.f15067d1.y();
                    return;
                }
                return;
            case 11:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f3604b;
                FrameLayout frameLayout = w2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(w2Var.f30229c.getHeight() - w2Var.f30226b.getY())) + w2Var.f30260t0);
                }
                w2Var.g0(f10);
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
        switch (this.f3603a) {
            case 21:
                super.setVisibility(i7);
                ((a20) this.f3604b).d.setVisibility(i7);
                return;
            case 29:
                zw0 zw0Var = (zw0) this.f3604b;
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
                    if (zw0Var.f43061e != null) {
                        for (int i10 = 0; i10 < zw0Var.f43061e.getChildCount(); i10++) {
                            if (z11) {
                                yw0 yw0Var = (yw0) zw0Var.f43061e.getChildAt(i10);
                                Drawable drawable = yw0Var.f42574b;
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).a(yw0Var);
                                }
                                yw0Var.f42575c = true;
                            } else {
                                yw0 yw0Var2 = (yw0) zw0Var.f43061e.getChildAt(i10);
                                Drawable drawable2 = yw0Var2.f42574b;
                                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable2).n(yw0Var2);
                                }
                                yw0Var2.f42575c = false;
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

    public g3(Context context, int i7) {
        super(context);
        this.f3603a = i7;
    }

    public g3(Context context) {
        super(context);
        this.f3603a = 7;
        lh.f fVar = new lh.f(context);
        this.f3604b = fVar;
        addView(fVar, na.g());
    }

    public g3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f3603a = 17;
        this.f3604b = new po[2];
        int i7 = 0;
        while (true) {
            po[] poVarArr = (po[]) this.f3604b;
            if (i7 < poVarArr.length) {
                poVarArr[i7] = new po(context, i6Var);
                addView(((po[]) this.f3604b)[i7], na.e(-1, -1, 119));
                i7++;
            } else {
                poVarArr[0].setVisibility(0);
                ((po[]) this.f3604b)[1].setVisibility(8);
                return;
            }
        }
    }

    public g3(Context context, String str, fi.b bVar) {
        super(context);
        this.f3603a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, K, null, bVar);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, na.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.f3604b = n6Var;
        n6Var.b(0.6f, 450L, kr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, bVar);
        n6Var.setScaleProperty(0.7f);
        n6Var.setGravity(17);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setAllowCancel(true);
        g10.addView(n6Var, na.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, bVar);
        textView.setGravity(17);
        g10.addView(textView, na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public g3(ch.p pVar, Context context) {
        super(context);
        this.f3603a = 1;
        this.f3604b = pVar;
        setWillNotDraw(false);
    }

    public g3(st0 st0Var, Context context) {
        super(context);
        this.f3603a = 27;
        this.f3604b = st0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
