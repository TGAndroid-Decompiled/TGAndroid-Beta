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
import c8.ma;
import di.pb;
import hi.ta;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.qd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z10;
public final class a3 extends FrameLayout {
    public final int f3398a;
    public Object f3399b;

    public a3(int i7, Context context, Object obj) {
        super(context);
        this.f3398a = i7;
        this.f3399b = obj;
    }

    public qo a() {
        return ((qo[]) this.f3399b)[0];
    }

    @Override
    public void addView(View view, int i7, int i10) {
        switch (this.f3398a) {
            case 8:
                super.addView(view, i7, i10);
                ((jh.f) this.f3399b).e();
                return;
            default:
                super.addView(view, i7, i10);
                return;
        }
    }

    public void b(dh.c cVar, gh.e eVar) {
        lh.f fVar = (lh.f) this.f3399b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        qo[] qoVarArr = (qo[]) this.f3399b;
        qo qoVar = qoVarArr[0];
        qo qoVar2 = qoVarArr[1];
        qoVarArr[0] = qoVar2;
        qoVarArr[1] = qoVar;
        qoVar2.f38852n = true;
        qoVar2.setVisibility(0);
        qoVarArr[0].setScaleX(0.8f);
        qoVarArr[0].setScaleY(0.8f);
        qoVarArr[0].setAlpha(0.0f);
        qoVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = qoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        lr lrVar = lr.h;
        n10.o(translationY, lrVar, 320L);
        qo qoVar3 = qoVarArr[1];
        qoVar3.f38852n = false;
        qoVar3.setVisibility(0);
        qoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(lrVar).setDuration(320L).withEndAction(new mo(qoVar3, 1)).start();
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
        switch (this.f3398a) {
            case 24:
                wk0 wk0Var = (wk0) this.f3399b;
                if (wk0Var.f41730r > 0.0f && wk0Var.f41727e != null) {
                    wk0Var.f41728f.reset();
                    float width = getWidth() / wk0Var.f41726c.getWidth();
                    wk0Var.f41728f.postScale(width, width);
                    wk0Var.d.setLocalMatrix(wk0Var.f41728f);
                    wk0Var.f41727e.setAlpha((int) (wk0Var.f41730r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), wk0Var.f41727e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = wk0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (wk0Var.f41730r * 255.0f));
                    canvas.save();
                    float f16 = wk0Var.I;
                    float f17 = wk0Var.H;
                    float f18 = wk0Var.f41730r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + wk0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(wk0Var.K, wk0Var.L), Math.max(wk0Var.K, wk0Var.L), 0.75f), 1.0f, wk0Var.f41730r);
                    canvas.scale(T1, T1, ((wk0Var.F.getBounds().width() / 2.0f) * wk0Var.K) + (-wk0Var.I) + wk0Var.F.getBounds().left, ((wk0Var.F.getBounds().height() / 2.0f) * wk0Var.L) + (-wk0Var.J) + wk0Var.F.getBounds().top);
                    fh.g gVar = wk0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (wk0Var.f41730r * 255.0f));
                        wk0Var.G.draw(canvas);
                    }
                    wk0Var.F.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                yw0 yw0Var = (yw0) this.f3399b;
                ww0 ww0Var = yw0Var.f42647c;
                if (ww0Var != null && ww0Var.getEditField() != null) {
                    org.telegram.messenger.g6 g6Var = yw0Var.W;
                    if (g6Var != null && g6Var.h) {
                        float x10 = yw0Var.f42647c.getEditField().getX() + yw0Var.f42647c.getEditField().getPaddingLeft();
                        org.telegram.messenger.g6 g6Var2 = yw0Var.W;
                        yw0Var.f42649d0 = x10 + g6Var2.f24180n;
                        yw0Var.f42644a0 = g6Var2.f24181r;
                    } else if (yw0Var.f42646b0 != null && yw0Var.f42648c0 != null) {
                        yw0Var.f42649d0 = yw0Var.f42647c.getEditField().getX() + yw0Var.f42647c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                if (yw0Var.f42657s && !yw0Var.f42658w && (arrayList = yw0Var.f42659x) != null && !arrayList.isEmpty() && !yw0Var.f42660y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.c6 c6Var = yw0Var.S;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = c6Var.e(false, f10);
                org.telegram.ui.Components.c6 c6Var2 = yw0Var.T;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e11 = c6Var2.e(false, f11);
                float e12 = yw0Var.f42651e0.e(false, yw0Var.f42649d0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z10) {
                    yw0Var.d.setVisibility(8);
                }
                yw0Var.P.rewind();
                float left = yw0Var.f42650e.getLeft();
                int left2 = yw0Var.f42650e.getLeft();
                ArrayList arrayList2 = yw0Var.f42659x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.f3.D(44.0f, size, left2);
                org.telegram.ui.Components.c6 c6Var3 = yw0Var.f42654g0;
                float f19 = c6Var3.f33892c;
                if (f19 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = c6Var3.e(z11, f20);
                }
                float e13 = yw0Var.f42653f0.e(z11, (left + D) / 2.0f);
                ww0 ww0Var2 = yw0Var.f42647c;
                if (ww0Var2 != null && ww0Var2.getEditField() != null) {
                    int i10 = yw0Var.h;
                    if (i10 == 0) {
                        yw0Var.d.setTranslationY(((((-yw0Var.f42647c.getEditField().getHeight()) - yw0Var.f42647c.getEditField().getScrollY()) + yw0Var.f42644a0) + org.telegram.messenger.g0.L(5.0f)) - yw0Var.f42647c.getEditFieldBottomOffset());
                    } else if (i10 == 1) {
                        yw0Var.d.setTranslationY((((((-yw0Var.getMeasuredHeight()) - yw0Var.f42647c.getEditField().getScrollY()) + yw0Var.f42644a0) + org.telegram.messenger.g0.L(20.0f)) + yw0Var.d.getHeight()) - yw0Var.f42647c.getEditFieldBottomOffset());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((yw0Var.f42649d0 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - yw0Var.f42650e.getLeft(), 0.0f);
                if (yw0Var.f42650e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    yw0Var.f42650e.setPadding(max, 0, 0, 0);
                    yw0Var.f42650e.scrollBy(yw0Var.f42650e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                yw0Var.f42650e.setTranslationX(((int) Math.max((e12 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - yw0Var.f42650e.getLeft(), 0.0f)) - max);
                float translationX = yw0Var.f42650e.getTranslationX() + (e13 - f22) + yw0Var.f42650e.getPaddingLeft();
                float translationY = yw0Var.f42650e.getTranslationY() + yw0Var.f42650e.getTop() + yw0Var.f42650e.getPaddingTop();
                if (yw0Var.h == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(6.66f);
                }
                float f23 = translationY + L;
                float min = Math.min(yw0Var.f42650e.getTranslationX() + e13 + f22 + yw0Var.f42650e.getPaddingLeft(), yw0Var.getWidth() - yw0Var.d.getPaddingRight());
                float translationY2 = yw0Var.f42650e.getTranslationY() + yw0Var.f42650e.getBottom();
                if (yw0Var.h == 0) {
                    i7 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    i7 = 0;
                }
                float f24 = translationY2 - i7;
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f22) * 2.0f;
                int i11 = yw0Var.h;
                if (i11 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    yw0Var.P.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    yw0Var.P.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    yw0Var.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    yw0Var.P.arcTo(rectF, 0.0f, 90.0f);
                    yw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f24);
                    yw0Var.P.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + f24);
                    yw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f24);
                } else if (i11 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    yw0Var.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    yw0Var.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    yw0Var.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    yw0Var.P.arcTo(rectF2, -180.0f, 90.0f);
                    yw0Var.P.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f23);
                    yw0Var.P.lineTo(e12, f23 - org.telegram.messenger.g0.L(6.66f));
                    yw0Var.P.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f23);
                }
                yw0Var.P.close();
                if (yw0Var.R == null) {
                    Paint paint = new Paint(1);
                    yw0Var.R = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    yw0Var.R.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    yw0Var.R.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29701tf, yw0Var.f42645b));
                }
                if (e10 < f12) {
                    yw0Var.Q.rewind();
                    if (yw0Var.h == 0) {
                        L2 = org.telegram.messenger.g0.L(6.66f) + f24;
                    } else {
                        L2 = f23 - org.telegram.messenger.g0.L(6.66f);
                    }
                    double d = e12 - translationX;
                    double d2 = L2 - f23;
                    f13 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L2 - f24;
                    yw0Var.Q.addCircle(e12, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(yw0Var.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, yw0Var.getWidth(), yw0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(yw0Var.P, yw0Var.R);
                canvas.save();
                canvas.clipPath(yw0Var.P);
                super.dispatchDraw(canvas);
                float f33 = yw0Var.f42654g0.f33892c;
                float f34 = yw0Var.f42653f0.f33892c;
                float f35 = f33 / 2.0f;
                float translationX2 = yw0Var.f42650e.getTranslationX() + (f34 - f35) + yw0Var.f42650e.getPaddingLeft();
                float paddingTop = yw0Var.f42650e.getPaddingTop() + yw0Var.f42650e.getTop();
                float min3 = Math.min(yw0Var.f42650e.getTranslationX() + f34 + f35 + yw0Var.f42650e.getPaddingLeft(), yw0Var.getWidth() - yw0Var.d.getPaddingRight());
                float bottom = yw0Var.f42650e.getBottom();
                org.telegram.ui.Components.c6 c6Var4 = yw0Var.U;
                if (yw0Var.f42650e.canScrollHorizontally(-1)) {
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
                org.telegram.ui.Components.c6 c6Var5 = yw0Var.V;
                if (yw0Var.f42650e.canScrollHorizontally(1)) {
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
                if (yw0Var.S.f33892c < f12) {
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
        switch (this.f3398a) {
            case 25:
                xe xeVar = (xe) this.f3399b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && xeVar.isShowing()) {
                    xeVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f3398a) {
            case 24:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((wk0) this.f3399b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bs0[] bs0VarArr;
        bs0 bs0Var;
        switch (this.f3398a) {
            case 3:
                if (((pb) this.f3399b).f9550u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((ii.t) this.f3399b).f16355t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                kl klVar = (kl) this.f3399b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < klVar.f36820x0 || motionEvent.getY() > klVar.f36822y0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                i90 i90Var = (i90) this.f3399b;
                h90 h90Var = i90Var.S;
                if (h90Var != null && (bs0Var = (bs0VarArr = h90Var.f35609n0)[0]) != null && bs0Var.h.getFastScroll() != null && bs0VarArr[0].h.getFastScroll().f35909n) {
                    return i90Var.S.Z(motionEvent);
                }
                h90 h90Var2 = i90Var.S;
                if (h90Var2 != null && h90Var2.P(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 27:
                qt0 qt0Var = (qt0) this.f3399b;
                if (motionEvent.getActionMasked() == 0 && (qt0Var.f38904e0 || motionEvent.getY() >= qt0Var.f38899b0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r11, android.view.View r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a3.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f3398a) {
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3398a) {
            case 18:
                gu guVar = (gu) this.f3399b;
                w71 w71Var = guVar.n1;
                cu cuVar = guVar.f35645m1;
                super.onDetachedFromWindow();
                try {
                    if (guVar.N0()) {
                        if (cuVar.getVisibility() != 0) {
                        }
                        if (w71Var.f() && !guVar.N0()) {
                            if (gu.S1 == guVar) {
                                gu.S1 = null;
                            }
                            w71Var.b();
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
                    if (w71Var.f()) {
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
        switch (this.f3398a) {
            case 1:
                super.onDraw(canvas);
                ch.p pVar = (ch.p) this.f3399b;
                if (pVar.f5473y > 0) {
                    canvas.drawRect(0.0f, getHeight() - pVar.f5473y, getWidth(), getHeight(), pVar.E);
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f3399b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f3399b = nVar;
                    nVar.f41054k = false;
                    nVar.f41056m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f3399b).f41050f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f3399b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 14:
                ((y9) this.f3399b).f42414e.a(canvas);
                return;
            case 15:
                kl klVar = (kl) this.f3399b;
                klVar.f36793a0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, klVar.f36765a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - klVar.f36823z0, klVar.f36793a0);
                return;
            case 26:
                jt0 jt0Var = (jt0) this.f3399b;
                jt0Var.f36525o1.setBounds(0, jt0Var.f36527q1 - jt0Var.f30226t0, getMeasuredWidth(), getMeasuredHeight());
                jt0Var.f36525o1.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3398a) {
            case 15:
                kl klVar = (kl) this.f3399b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < klVar.f36820x0 || motionEvent.getY() > klVar.f36822y0)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                jt0 jt0Var = (jt0) this.f3399b;
                if (motionEvent.getAction() == 0 && jt0Var.f36527q1 != 0 && motionEvent.getY() < jt0Var.f36527q1) {
                    jt0Var.dismiss();
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
        switch (this.f3398a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ch.p pVar = (ch.p) this.f3399b;
                if (pVar.P && z10) {
                    pVar.j0(pVar.R.f57657e);
                    return;
                }
                return;
            case 10:
                int childCount = getChildCount();
                int i19 = i11 - i7;
                int i20 = -1;
                if (((org.telegram.ui.ActionBar.u1) this.f3399b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i19 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z12 = gd.f24216a0;
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
                            if (gd.f24216a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i19 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i19 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (gd.f24216a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.f3.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i19 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = n10.x(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (gd.f24216a0) {
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
                            if (gd.f24216a0) {
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
                ((y9) this.f3399b).f42414e.f(i23, i24, i23 + L3, L3 + i24);
                return;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f3399b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f32800r0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f32800r0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f32800r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f32800r0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f32800r0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f32800r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f32800r0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32789l0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f32789l0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f32789l0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f32789l0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f32802s0;
                imageView.layout(i16 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f32802s0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f32802s0.getMeasuredWidth() / 2) + i16, (chatAttachAlertPhotoLayout.f32802s0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i27 = 0; i27 < 2; i27++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.T[i27];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i17 - (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.T[i27].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2) + i17);
                }
                return;
            case 21:
                super.onLayout(z10, i7, i10, i11, i12);
                z10 z10Var = (z10) this.f3399b;
                a3 a3Var = z10Var.f42714b;
                int[] iArr = z10Var.I;
                a3Var.getLocationOnScreen(iArr);
                z10Var.P = iArr[0];
                z10Var.O = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                return;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                wk0 wk0Var = (wk0) this.f3399b;
                a3 a3Var2 = wk0Var.f41731s;
                au0 au0Var = wk0Var.f41732w;
                Drawable drawable = wk0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (wk0Var.f41734y != null) {
                        float f11 = wk0Var.I;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = wk0Var.J;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z13 = false;
                        if (!wk0Var.M) {
                            if (f13 - frameLayout.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                wk0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                wk0Var.f41734y.setX(Math.min(au0Var.getWidth() - wk0Var.f41734y.getWidth(), f12 - org.telegram.messenger.g0.L(10.0f)) - au0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                wk0Var.E.setPivotX(viewGroup2.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                wk0Var.f41734y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f13) - wk0Var.f41734y.getMeasuredWidth()) - au0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((wk0Var.f41734y.getX() + wk0Var.f41734y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f13;
                            } else {
                                x10 = (wk0Var.f41734y.getX() + org.telegram.messenger.g0.L(10.0f)) - f12;
                            }
                            wk0Var.H = x10;
                        } else {
                            f10 = 4.0f;
                            z11 = false;
                        }
                        if (wk0Var.G != null) {
                            i18 = org.telegram.messenger.g0.L(21.0f);
                        } else {
                            i18 = 0;
                        }
                        float f17 = f16 + i18;
                        if (wk0Var.f41734y.getMeasuredHeight() + f17 > a3Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            wk0Var.E.setPivotY(viewGroup.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            wk0Var.f41734y.setY(((f15 - org.telegram.messenger.g0.L(f10)) - wk0Var.f41734y.getMeasuredHeight()) - au0Var.getY());
                            z13 = true;
                        } else {
                            wk0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            wk0Var.f41734y.setY(Math.min((a3Var2.getHeight() - wk0Var.f41734y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), f17) - au0Var.getY());
                        }
                        y60 y60Var = wk0Var.f41733x;
                        y60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f28737c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                jt0.J0((jt0) this.f3399b);
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
        switch (this.f3398a) {
            case 0:
                super.onMeasure(i7, i10);
                ((c3) this.f3399b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 10:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i13 = 0;
                if (((org.telegram.ui.ActionBar.u1) this.f3399b).L0) {
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
                gu guVar = (gu) this.f3399b;
                int min = (int) Math.min(guVar.C1 / (guVar.B1 / size), org.telegram.messenger.g0.f24121q.y / 2);
                if (guVar.E1) {
                    i11 = 22;
                } else {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 84) + min + 1, 1073741824));
                return;
            case 19:
                qx qxVar = (qx) this.f3399b;
                if (((View) qxVar.G.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - qxVar.G.getY());
                } else {
                    L = org.telegram.messenger.g0.L(120.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L - qxVar.G.f39342c1, 1073741824));
                return;
            case 20:
                ry ryVar = ((my) this.f3399b).R;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (n10.z(8.0f, ryVar.E0.getMeasuredHeight() - ryVar.f39342c1, 3) * 1.7f), 1073741824));
                return;
            case 26:
                jt0 jt0Var = (jt0) this.f3399b;
                di.b1 b1Var = jt0Var.f36524m1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f24115m;
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
                    jt0Var.f36528r1 = true;
                    b1Var.setPadding(0, i12, 0, org.telegram.messenger.g0.L(8.0f));
                    jt0Var.f36528r1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 29:
                yw0 yw0Var = (yw0) this.f3399b;
                int i16 = yw0Var.f42655n;
                if (yw0Var.h == 0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(6.66f);
                }
                int i17 = yw0Var.f42655n;
                if (yw0Var.h == 0) {
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
        switch (this.f3398a) {
            case 24:
                super.onSizeChanged(i7, i10, i11, i12);
                wk0 wk0Var = (wk0) this.f3399b;
                ih.d.c(wk0Var.h, wk0Var.f41731s);
                ViewGroup viewGroup = wk0Var.E;
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
        switch (this.f3398a) {
            case 26:
                if (!((jt0) this.f3399b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f3398a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.f3399b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f3398a) {
            case 23:
                ck0 ck0Var = (ck0) this.f3399b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(ck0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ck0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, ck0Var.f34052c1.getMeasuredWidth(), ck0Var.f34052c1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 26:
                if (!((jt0) this.f3399b).f36528r1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 28:
                if (!((iw0) this.f3399b).f36234b2) {
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
        switch (this.f3398a) {
            case 2:
                super.setTranslationY(f10);
                di.f6 f6Var = (di.f6) this.f3399b;
                di.k4 k4Var = f6Var.f8771a2;
                if (k4Var != null && k4Var.getVisibility() == 0) {
                    f6Var.f8771a2.invalidate();
                    return;
                }
                return;
            case 5:
                ta taVar = (ta) this.f3399b;
                if (getTranslationY() != f10 && taVar.f15436d1 != null) {
                    super.setTranslationY(f10);
                    taVar.f15436d1.y();
                    return;
                }
                return;
            case 11:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f3399b;
                FrameLayout frameLayout = x2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(x2Var.f30195c.getHeight() - x2Var.f30192b.getY())) + x2Var.f30226t0);
                }
                x2Var.g0(f10);
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
        switch (this.f3398a) {
            case 21:
                super.setVisibility(i7);
                ((z10) this.f3399b).d.setVisibility(i7);
                return;
            case 29:
                yw0 yw0Var = (yw0) this.f3399b;
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
                    if (yw0Var.f42650e != null) {
                        for (int i10 = 0; i10 < yw0Var.f42650e.getChildCount(); i10++) {
                            if (z11) {
                                xw0 xw0Var = (xw0) yw0Var.f42650e.getChildAt(i10);
                                Drawable drawable = xw0Var.f42201b;
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).a(xw0Var);
                                }
                                xw0Var.f42202c = true;
                            } else {
                                xw0 xw0Var2 = (xw0) yw0Var.f42650e.getChildAt(i10);
                                Drawable drawable2 = xw0Var2.f42201b;
                                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable2).n(xw0Var2);
                                }
                                xw0Var2.f42202c = false;
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

    public a3(Context context, int i7) {
        super(context);
        this.f3398a = i7;
    }

    public a3(Context context) {
        super(context);
        this.f3398a = 7;
        lh.f fVar = new lh.f(context);
        this.f3399b = fVar;
        addView(fVar, ma.g());
    }

    public a3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f3398a = 17;
        this.f3399b = new qo[2];
        int i7 = 0;
        while (true) {
            qo[] qoVarArr = (qo[]) this.f3399b;
            if (i7 < qoVarArr.length) {
                qoVarArr[i7] = new qo(context, i6Var);
                addView(((qo[]) this.f3399b)[i7], ma.e(-1, -1, 119));
                i7++;
            } else {
                qoVarArr[0].setVisibility(0);
                ((qo[]) this.f3399b)[1].setVisibility(8);
                return;
            }
        }
    }

    public a3(Context context, String str, fi.b bVar) {
        super(context);
        this.f3398a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29504j5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, K, null, bVar);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, ma.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.f3399b = n6Var;
        n6Var.b(0.6f, 450L, lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, bVar);
        n6Var.setScaleProperty(0.7f);
        n6Var.setGravity(17);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setAllowCancel(true);
        g10.addView(n6Var, ma.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, bVar);
        textView.setGravity(17);
        g10.addView(textView, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public a3(ch.p pVar, Context context) {
        super(context);
        this.f3398a = 1;
        this.f3399b = pVar;
        setWillNotDraw(false);
    }

    public a3(qt0 qt0Var, Context context) {
        super(context);
        this.f3398a = 27;
        this.f3399b = qt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
