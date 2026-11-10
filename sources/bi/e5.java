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
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.yv0;
public final class e5 extends FrameLayout {
    public final int f3757a;
    public Object f3758b;

    public e5(int i7, Context context, Object obj) {
        super(context);
        this.f3757a = i7;
        this.f3758b = obj;
    }

    public yn a() {
        return ((yn[]) this.f3758b)[0];
    }

    @Override
    public void addView(View view, int i7, int i10) {
        switch (this.f3757a) {
            case 8:
                super.addView(view, i7, i10);
                ((jh.f) this.f3758b).e();
                return;
            default:
                super.addView(view, i7, i10);
                return;
        }
    }

    public void b(dh.c cVar, gh.e eVar) {
        lh.f fVar = (lh.f) this.f3758b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        yn[] ynVarArr = (yn[]) this.f3758b;
        yn ynVar = ynVarArr[0];
        yn ynVar2 = ynVarArr[1];
        ynVarArr[0] = ynVar2;
        ynVarArr[1] = ynVar;
        ynVar2.f40624n = true;
        ynVar2.setVisibility(0);
        ynVarArr[0].setScaleX(0.8f);
        ynVarArr[0].setScaleY(0.8f);
        ynVarArr[0].setAlpha(0.0f);
        ynVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = ynVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        wq wqVar = wq.h;
        org.telegram.messenger.camera.q.l(translationY, wqVar, 320L);
        yn ynVar3 = ynVarArr[1];
        ynVar3.f40624n = false;
        ynVar3.setVisibility(0);
        ynVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(wqVar).setDuration(320L).withEndAction(new wf(ynVar3, 29)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z9;
        float f10;
        float f11;
        int size;
        boolean z10;
        float f12;
        int L;
        int i7;
        float f13;
        float f14;
        float f15;
        float L2;
        ArrayList arrayList;
        switch (this.f3757a) {
            case 23:
                jk0 jk0Var = (jk0) this.f3758b;
                if (jk0Var.f34957r > 0.0f && jk0Var.f34954e != null) {
                    jk0Var.f34955f.reset();
                    float width = getWidth() / jk0Var.f34953c.getWidth();
                    jk0Var.f34955f.postScale(width, width);
                    jk0Var.d.setLocalMatrix(jk0Var.f34955f);
                    jk0Var.f34954e.setAlpha((int) (jk0Var.f34957r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), jk0Var.f34954e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = jk0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (jk0Var.f34957r * 255.0f));
                    canvas.save();
                    float f16 = jk0Var.H;
                    float f17 = jk0Var.G;
                    float f18 = jk0Var.f34957r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + jk0Var.I);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(jk0Var.J, jk0Var.K), Math.max(jk0Var.J, jk0Var.K), 0.75f), 1.0f, jk0Var.f34957r);
                    canvas.scale(T1, T1, ((jk0Var.E.getBounds().width() / 2.0f) * jk0Var.J) + (-jk0Var.H) + jk0Var.E.getBounds().left, ((jk0Var.E.getBounds().height() / 2.0f) * jk0Var.K) + (-jk0Var.I) + jk0Var.E.getBounds().top);
                    fh.g gVar = jk0Var.F;
                    if (gVar != null) {
                        gVar.setAlpha((int) (jk0Var.f34957r * 255.0f));
                        jk0Var.F.draw(canvas);
                    }
                    jk0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                ow0 ow0Var = (ow0) this.f3758b;
                mw0 mw0Var = ow0Var.f36705c;
                if (mw0Var != null && mw0Var.getEditField() != null) {
                    org.telegram.messenger.f6 f6Var = ow0Var.V;
                    if (f6Var != null && f6Var.h) {
                        float x10 = ow0Var.f36705c.getEditField().getX() + ow0Var.f36705c.getEditField().getPaddingLeft();
                        org.telegram.messenger.f6 f6Var2 = ow0Var.V;
                        ow0Var.f36706c0 = x10 + f6Var2.f22378n;
                        ow0Var.W = f6Var2.f22379r;
                    } else if (ow0Var.f36702a0 != null && ow0Var.f36704b0 != null) {
                        ow0Var.f36706c0 = ow0Var.f36705c.getEditField().getX() + ow0Var.f36705c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                if (ow0Var.f36714s && !ow0Var.f36715w && (arrayList = ow0Var.f36716x) != null && !arrayList.isEmpty() && !ow0Var.f36717y) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Components.v5 v5Var = ow0Var.R;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = v5Var.e(false, f10);
                org.telegram.ui.Components.v5 v5Var2 = ow0Var.S;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e11 = v5Var2.e(false, f11);
                float e12 = ow0Var.f36707d0.e(false, ow0Var.f36706c0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z9) {
                    ow0Var.d.setVisibility(8);
                }
                ow0Var.O.rewind();
                float left = ow0Var.f36708e.getLeft();
                int left2 = ow0Var.f36708e.getLeft();
                ArrayList arrayList2 = ow0Var.f36716x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.k5.D(44.0f, size, left2);
                org.telegram.ui.Components.v5 v5Var3 = ow0Var.f36711f0;
                float f19 = v5Var3.f38854c;
                if (f19 <= 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = v5Var3.e(z10, f20);
                }
                float e13 = ow0Var.f36709e0.e(z10, (left + D) / 2.0f);
                mw0 mw0Var2 = ow0Var.f36705c;
                if (mw0Var2 != null && mw0Var2.getEditField() != null) {
                    int i10 = ow0Var.h;
                    if (i10 == 0) {
                        ow0Var.d.setTranslationY(((-ow0Var.f36705c.getEditField().getHeight()) - ow0Var.f36705c.getEditField().getScrollY()) + ow0Var.W + org.telegram.messenger.g0.L(5.0f));
                    } else if (i10 == 1) {
                        ow0Var.d.setTranslationY(((-ow0Var.getMeasuredHeight()) - ow0Var.f36705c.getEditField().getScrollY()) + ow0Var.W + org.telegram.messenger.g0.L(20.0f) + ow0Var.d.getHeight());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((ow0Var.f36706c0 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - ow0Var.f36708e.getLeft(), 0.0f);
                if (ow0Var.f36708e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    ow0Var.f36708e.setPadding(max, 0, 0, 0);
                    ow0Var.f36708e.scrollBy(ow0Var.f36708e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                ow0Var.f36708e.setTranslationX(((int) Math.max((e12 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - ow0Var.f36708e.getLeft(), 0.0f)) - max);
                float translationX = ow0Var.f36708e.getTranslationX() + (e13 - f22) + ow0Var.f36708e.getPaddingLeft();
                float translationY = ow0Var.f36708e.getTranslationY() + ow0Var.f36708e.getTop() + ow0Var.f36708e.getPaddingTop();
                if (ow0Var.h == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(6.66f);
                }
                float f23 = translationY + L;
                float min = Math.min(ow0Var.f36708e.getTranslationX() + e13 + f22 + ow0Var.f36708e.getPaddingLeft(), ow0Var.getWidth() - ow0Var.d.getPaddingRight());
                float translationY2 = ow0Var.f36708e.getTranslationY() + ow0Var.f36708e.getBottom();
                if (ow0Var.h == 0) {
                    i7 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    i7 = 0;
                }
                float f24 = translationY2 - i7;
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f22) * 2.0f;
                int i11 = ow0Var.h;
                if (i11 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    ow0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    ow0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    ow0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    ow0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    ow0Var.O.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f24);
                    ow0Var.O.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + f24);
                    ow0Var.O.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f24);
                } else if (i11 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    ow0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    ow0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    ow0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    ow0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    ow0Var.O.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f23);
                    ow0Var.O.lineTo(e12, f23 - org.telegram.messenger.g0.L(6.66f));
                    ow0Var.O.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f23);
                }
                ow0Var.O.close();
                if (ow0Var.Q == null) {
                    Paint paint = new Paint(1);
                    ow0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    ow0Var.Q.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    ow0Var.Q.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qf, ow0Var.f36703b));
                }
                if (e10 < f12) {
                    ow0Var.P.rewind();
                    if (ow0Var.h == 0) {
                        L2 = org.telegram.messenger.g0.L(6.66f) + f24;
                    } else {
                        L2 = f23 - org.telegram.messenger.g0.L(6.66f);
                    }
                    double d = e12 - translationX;
                    double d2 = L2 - f23;
                    f13 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L2 - f24;
                    ow0Var.P.addCircle(e12, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(ow0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, ow0Var.getWidth(), ow0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(ow0Var.O, ow0Var.Q);
                canvas.save();
                canvas.clipPath(ow0Var.O);
                super.dispatchDraw(canvas);
                float f33 = ow0Var.f36711f0.f38854c;
                float f34 = ow0Var.f36709e0.f38854c;
                float f35 = f33 / 2.0f;
                float translationX2 = ow0Var.f36708e.getTranslationX() + (f34 - f35) + ow0Var.f36708e.getPaddingLeft();
                float paddingTop = ow0Var.f36708e.getPaddingTop() + ow0Var.f36708e.getTop();
                float min3 = Math.min(ow0Var.f36708e.getTranslationX() + f34 + f35 + ow0Var.f36708e.getPaddingLeft(), ow0Var.getWidth() - ow0Var.d.getPaddingRight());
                float bottom = ow0Var.f36708e.getBottom();
                org.telegram.ui.Components.v5 v5Var4 = ow0Var.T;
                if (ow0Var.f36708e.canScrollHorizontally(-1)) {
                    f14 = f12;
                } else {
                    f14 = 0.0f;
                }
                float e14 = v5Var4.e(false, f14);
                if (e14 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.m6.F4.setBounds(i12, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.m6.F4.setAlpha((int) (e14 * f13));
                    org.telegram.ui.ActionBar.m6.F4.draw(canvas);
                }
                org.telegram.ui.Components.v5 v5Var5 = ow0Var.U;
                if (ow0Var.f36708e.canScrollHorizontally(1)) {
                    f15 = f12;
                } else {
                    f15 = 0.0f;
                }
                float e15 = v5Var5.e(false, f15);
                if (e15 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.m6.E4.setBounds(i13 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.m6.E4.setAlpha((int) (e15 * f13));
                    org.telegram.ui.ActionBar.m6.E4.draw(canvas);
                }
                canvas.restore();
                if (ow0Var.R.f38854c < f12) {
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
        switch (this.f3757a) {
            case 24:
                me meVar = (me) this.f3758b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && meVar.isShowing()) {
                    meVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f3757a) {
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((jk0) this.f3758b).onBackPressed();
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
        switch (this.f3757a) {
            case 1:
                if (((dd) this.f3758b).f3726t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((gi.f) this.f3758b).f14003s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                vk vkVar = (vk) this.f3758b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < vkVar.f39041w0 || motionEvent.getY() > vkVar.f39043x0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 21:
                v80 v80Var = (v80) this.f3758b;
                u80 u80Var = v80Var.R;
                if (u80Var != null && (tr0Var = (tr0VarArr = u80Var.m0)[0]) != null && tr0Var.h.getFastScroll() != null && tr0VarArr[0].h.getFastScroll().f38681n) {
                    return v80Var.R.Z(motionEvent);
                }
                u80 u80Var2 = v80Var.R;
                if (u80Var2 != null && u80Var2.P(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 26:
                it0 it0Var = (it0) this.f3758b;
                if (motionEvent.getActionMasked() == 0 && (it0Var.f34744d0 || motionEvent.getY() >= it0Var.f34739a0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3757a) {
            case 29:
                float a10 = ((org.telegram.ui.Components.hc) this.f3758b).a(0.03f);
                canvas.save();
                canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r11, android.view.View r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e5.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f3757a) {
            case 10:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3757a) {
            case 17:
                vt vtVar = (vt) this.f3758b;
                l71 l71Var = vtVar.f39734m1;
                rt rtVar = vtVar.l1;
                super.onDetachedFromWindow();
                try {
                    if (vtVar.M0()) {
                        if (rtVar.getVisibility() != 0) {
                        }
                        if (l71Var.f() && !vtVar.M0()) {
                            if (vt.R1 == vtVar) {
                                vt.R1 = null;
                            }
                            l71Var.b();
                            return;
                        }
                        return;
                    }
                    if (rtVar.getParent() != null) {
                        removeView(rtVar);
                        rtVar.stopLoading();
                        rtVar.loadUrl("about:blank");
                        rtVar.destroy();
                    }
                    if (l71Var.f()) {
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
        switch (this.f3757a) {
            case 2:
                super.onDraw(canvas);
                ch.o oVar = (ch.o) this.f3758b;
                if (oVar.f6354y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.f6354y, getWidth(), getHeight(), oVar.D);
                    return;
                }
                return;
            case 12:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f3758b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f3758b = nVar;
                    nVar.f39387k = false;
                    nVar.f39389m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f3758b).f39383f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f3758b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 13:
                ((org.telegram.ui.Components.t9) this.f3758b).f38237e.a(canvas);
                return;
            case 14:
                vk vkVar = (vk) this.f3758b;
                vkVar.W.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, vkVar.f38655a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - vkVar.f39045y0, vkVar.W);
                return;
            case 25:
                bt0 bt0Var = (bt0) this.f3758b;
                bt0Var.n1.setBounds(0, bt0Var.f32355p1 - bt0Var.f28704s0, getMeasuredWidth(), getMeasuredHeight());
                bt0Var.n1.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3757a) {
            case 14:
                vk vkVar = (vk) this.f3758b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < vkVar.f39041w0 || motionEvent.getY() > vkVar.f39043x0)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                bt0 bt0Var = (bt0) this.f3758b;
                if (motionEvent.getAction() == 0 && bt0Var.f32355p1 != 0 && motionEvent.getY() < bt0Var.f32355p1) {
                    bt0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
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
        boolean z10;
        int i18;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float x10;
        switch (this.f3757a) {
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ch.o oVar = (ch.o) this.f3758b;
                if (oVar.O && z9) {
                    oVar.j0(oVar.Q.f55498e);
                    return;
                }
                return;
            case 9:
                int childCount = getChildCount();
                int i19 = i11 - i7;
                int i20 = -1;
                if (((org.telegram.ui.ActionBar.u1) this.f3758b).K0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i19 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z11 = org.telegram.messenger.id.f23161a0;
                    if (z11) {
                        i15 = paddingRight - max;
                    } else {
                        i15 = paddingLeft;
                    }
                    if (!z11) {
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
                            if (org.telegram.messenger.id.f23161a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i19 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i19 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (org.telegram.messenger.id.f23161a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.k5.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i19 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = org.telegram.messenger.camera.q.w(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (org.telegram.messenger.id.f23161a0) {
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
                            if (org.telegram.messenger.id.f23161a0) {
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
            case 13:
                super.onLayout(z9, i7, i10, i11, i12);
                int L3 = org.telegram.messenger.g0.L(36.0f);
                int i23 = ((i11 - i7) - L3) / 2;
                int i24 = ((i12 - i10) - L3) / 2;
                ((org.telegram.ui.Components.t9) this.f3758b).f38237e.f(i23, i24, i23 + L3, L3 + i24);
                return;
            case 15:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f3758b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f31239q0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f31239q0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f31239q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f31239q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f31239q0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f31239q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f31239q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f31229k0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f31229k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f31229k0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f31229k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f31241r0;
                imageView.layout(i16 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f31241r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f31241r0.getMeasuredWidth() / 2) + i16, (chatAttachAlertPhotoLayout.f31241r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i27 = 0; i27 < 2; i27++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i27];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i17 - (chatAttachAlertPhotoLayout.S[i27].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i27].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.S[i27].getMeasuredHeight() / 2) + i17);
                }
                return;
            case 20:
                super.onLayout(z9, i7, i10, i11, i12);
                p10 p10Var = (p10) this.f3758b;
                e5 e5Var = p10Var.f36765b;
                int[] iArr = p10Var.H;
                e5Var.getLocationOnScreen(iArr);
                p10Var.O = iArr[0];
                p10Var.N = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                return;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                jk0 jk0Var = (jk0) this.f3758b;
                e5 e5Var2 = jk0Var.f34958s;
                st0 st0Var = jk0Var.f34959w;
                Drawable drawable = jk0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (jk0Var.f34961y != null) {
                        float f11 = jk0Var.H;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = jk0Var.I;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z12 = false;
                        if (!jk0Var.L) {
                            if (f13 - frameLayout.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                jk0Var.D.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                jk0Var.f34961y.setX(Math.min(st0Var.getWidth() - jk0Var.f34961y.getWidth(), f12 - org.telegram.messenger.g0.L(10.0f)) - st0Var.getX());
                                f10 = 4.0f;
                                z10 = false;
                            } else {
                                jk0Var.D.setPivotX(viewGroup2.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                jk0Var.f34961y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f13) - jk0Var.f34961y.getMeasuredWidth()) - st0Var.getX());
                                z10 = true;
                            }
                            if (z10) {
                                x10 = ((jk0Var.f34961y.getX() + jk0Var.f34961y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f13;
                            } else {
                                x10 = (jk0Var.f34961y.getX() + org.telegram.messenger.g0.L(10.0f)) - f12;
                            }
                            jk0Var.G = x10;
                        } else {
                            f10 = 4.0f;
                            z10 = false;
                        }
                        if (jk0Var.F != null) {
                            i18 = org.telegram.messenger.g0.L(21.0f);
                        } else {
                            i18 = 0;
                        }
                        float f17 = f16 + i18;
                        if (jk0Var.f34961y.getMeasuredHeight() + f17 > e5Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            jk0Var.D.setPivotY(viewGroup.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            jk0Var.f34961y.setY(((f15 - org.telegram.messenger.g0.L(f10)) - jk0Var.f34961y.getMeasuredHeight()) - st0Var.getY());
                            z12 = true;
                        } else {
                            jk0Var.D.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            jk0Var.f34961y.setY(Math.min((e5Var2.getHeight() - jk0Var.f34961y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), f17) - st0Var.getY());
                        }
                        k60 k60Var = jk0Var.f34960x;
                        k60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = k60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f27291c = z10;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 25:
                super.onLayout(z9, i7, i10, i11, i12);
                bt0.I0((bt0) this.f3758b);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
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
        switch (this.f3757a) {
            case 9:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i13 = 0;
                if (((org.telegram.ui.ActionBar.u1) this.f3758b).K0) {
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
            case 12:
                if (View.MeasureSpec.getSize(i7) > org.telegram.messenger.g0.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(320.0f), 1073741824), i10);
                    return;
                } else {
                    super.onMeasure(i7, i10);
                    return;
                }
            case 17:
                int size = View.MeasureSpec.getSize(i7);
                vt vtVar = (vt) this.f3758b;
                int min = (int) Math.min(vtVar.B1 / (vtVar.A1 / size), org.telegram.messenger.g0.f22567q.y / 2);
                if (vtVar.D1) {
                    i11 = 22;
                } else {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 84) + min + 1, 1073741824));
                return;
            case 18:
                gx gxVar = (gx) this.f3758b;
                if (((View) gxVar.F.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - gxVar.F.getY());
                } else {
                    L = org.telegram.messenger.g0.L(120.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L - gxVar.F.f34012b1, 1073741824));
                return;
            case 19:
                gy gyVar = ((ay) this.f3758b).Q;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.camera.q.y(8.0f, gyVar.D0.getMeasuredHeight() - gyVar.f34012b1, 3) * 1.7f), 1073741824));
                return;
            case 25:
                bt0 bt0Var = (bt0) this.f3758b;
                q1 q1Var = bt0Var.l1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f22561m;
                getMeasuredWidth();
                int D = org.telegram.messenger.k5.D(54.0f, org.telegram.messenger.sd.g(), org.telegram.messenger.k5.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i15 = size2 / 5;
                if (D < i15 * 3) {
                    i12 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i12 = i15 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (q1Var.getPaddingTop() != i12) {
                    bt0Var.f32356q1 = true;
                    q1Var.setPadding(0, i12, 0, org.telegram.messenger.g0.L(8.0f));
                    bt0Var.f32356q1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 28:
                ow0 ow0Var = (ow0) this.f3758b;
                int i16 = ow0Var.f36712n;
                if (ow0Var.h == 0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(6.66f);
                }
                int i17 = ow0Var.f36712n;
                if (ow0Var.h == 0) {
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
        switch (this.f3757a) {
            case 23:
                super.onSizeChanged(i7, i10, i11, i12);
                jk0 jk0Var = (jk0) this.f3758b;
                ih.d.c(jk0Var.h, jk0Var.f34958s);
                ViewGroup viewGroup = jk0Var.D;
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
        switch (this.f3757a) {
            case 25:
                if (!((bt0) this.f3758b).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f3757a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.f3758b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f3757a) {
            case 22:
                pj0 pj0Var = (pj0) this.f3758b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(pj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(pj0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, pj0Var.f36958b1.getMeasuredWidth(), pj0Var.f36958b1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 25:
                if (!((bt0) this.f3758b).f32356q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((yv0) this.f3758b).f40736a2) {
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
    public void setPressed(boolean z9) {
        switch (this.f3757a) {
            case 29:
                super.setPressed(z9);
                ((org.telegram.ui.Components.hc) this.f3758b).c(z9);
                return;
            default:
                super.setPressed(z9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f3757a) {
            case 0:
                super.setTranslationY(f10);
                k7 k7Var = (k7) this.f3758b;
                j5 j5Var = k7Var.Z1;
                if (j5Var != null && j5Var.getVisibility() == 0) {
                    k7Var.Z1.invalidate();
                    return;
                }
                return;
            case 4:
                fi.va vaVar = (fi.va) this.f3758b;
                if (getTranslationY() != f10 && vaVar.f12946c1 != null) {
                    super.setTranslationY(f10);
                    vaVar.f12946c1.y();
                    return;
                }
                return;
            case 10:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f3758b;
                FrameLayout frameLayout = w2Var.E;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(w2Var.f28675c.getHeight() - w2Var.f28672b.getY())) + w2Var.f28704s0);
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
        boolean z9;
        boolean z10;
        switch (this.f3757a) {
            case 20:
                super.setVisibility(i7);
                ((p10) this.f3758b).d.setVisibility(i7);
                return;
            case 28:
                ow0 ow0Var = (ow0) this.f3758b;
                if (getVisibility() == i7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                super.setVisibility(i7);
                if (!z9) {
                    if (i7 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (ow0Var.f36708e != null) {
                        for (int i10 = 0; i10 < ow0Var.f36708e.getChildCount(); i10++) {
                            if (z10) {
                                nw0 nw0Var = (nw0) ow0Var.f36708e.getChildAt(i10);
                                Drawable drawable = nw0Var.f36408b;
                                if (drawable instanceof org.telegram.ui.Components.h5) {
                                    ((org.telegram.ui.Components.h5) drawable).a(nw0Var);
                                }
                                nw0Var.f36409c = true;
                            } else {
                                nw0 nw0Var2 = (nw0) ow0Var.f36708e.getChildAt(i10);
                                Drawable drawable2 = nw0Var2.f36408b;
                                if (drawable2 instanceof org.telegram.ui.Components.h5) {
                                    ((org.telegram.ui.Components.h5) drawable2).n(nw0Var2);
                                }
                                nw0Var2.f36409c = false;
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

    public e5(int i7, Context context, boolean z9) {
        super(context);
        this.f3757a = i7;
    }

    public e5(Context context, int i7) {
        super(context);
        this.f3757a = i7;
        switch (i7) {
            case 29:
                super(context);
                this.f3758b = new org.telegram.ui.Components.hc(this);
                return;
            default:
                lh.f fVar = new lh.f(context);
                this.f3758b = fVar;
                addView(fVar, c8.ha.g());
                return;
        }
    }

    public e5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f3757a = 16;
        this.f3758b = new yn[2];
        int i7 = 0;
        while (true) {
            yn[] ynVarArr = (yn[]) this.f3758b;
            if (i7 < ynVarArr.length) {
                ynVarArr[i7] = new yn(context, h6Var);
                addView(((yn[]) this.f3758b)[i7], c8.ha.e(-1, -1, 119));
                i7++;
            } else {
                ynVarArr[0].setVisibility(0);
                ((yn[]) this.f3758b)[1].setVisibility(8);
                return;
            }
        }
    }

    public e5(Context context, String str, di.b bVar) {
        super(context);
        this.f3757a = 3;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, K, null, bVar);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, true, true);
        this.f3758b = i6Var;
        i6Var.b(0.6f, 450L, wq.h);
        i6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.t6.Y(i6Var, i7, bVar);
        i6Var.setScaleProperty(0.7f);
        i6Var.setGravity(17);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setAllowCancel(true);
        f10.addView(i6Var, c8.ha.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i7, bVar);
        textView.setGravity(17);
        f10.addView(textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public e5(ch.o oVar, Context context) {
        super(context);
        this.f3757a = 2;
        this.f3758b = oVar;
        setWillNotDraw(false);
    }

    public e5(it0 it0Var, Context context) {
        super(context);
        this.f3757a = 26;
        this.f3758b = it0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
