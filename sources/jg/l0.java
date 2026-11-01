package jg;

import android.content.Context;
import android.graphics.Bitmap;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h6;
import org.telegram.messenger.m5;
import org.telegram.messenger.od;
import org.telegram.messenger.ze;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yk;
import org.telegram.ui.Components.z60;
import org.telegram.ui.cr0;
import w7.b6;
public final class l0 extends FrameLayout {
    public final int f10084a;
    public Object f10085b;

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f10084a = i10;
        this.f10085b = obj;
    }

    public io a() {
        return ((io[]) this.f10085b)[0];
    }

    public void b() {
        io[] ioVarArr = (io[]) this.f10085b;
        io ioVar = ioVarArr[0];
        io ioVar2 = ioVarArr[1];
        ioVarArr[0] = ioVar2;
        ioVarArr[1] = ioVar;
        ioVar2.f27133n = true;
        ioVar2.setVisibility(0);
        ioVarArr[0].setScaleX(0.8f);
        ioVarArr[0].setScaleY(0.8f);
        ioVarArr[0].setAlpha(0.0f);
        ioVarArr[0].setTranslationY(org.telegram.messenger.i0.L(20.0f));
        ViewPropertyAnimator translationY = ioVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        a30.m(translationY, grVar, 320L);
        io ioVar3 = ioVarArr[1];
        ioVar3.f27133n = false;
        ioVar3.setVisibility(0);
        ioVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.i0.L(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new ho(ioVar3, 0)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        int size;
        boolean z11;
        float f11;
        int L;
        int i10;
        float f12;
        float f13;
        float f14;
        float L2;
        ArrayList arrayList;
        switch (this.f10084a) {
            case 3:
                d3 d3Var = (d3) this.f10085b;
                if (d3Var.D > 0.0f && d3Var.f9938s != null) {
                    d3Var.f9939w.reset();
                    float width = getWidth() / d3Var.f9936n.getWidth();
                    d3Var.f9939w.postScale(width, width);
                    d3Var.f9937r.setLocalMatrix(d3Var.f9939w);
                    d3Var.f9938s.setAlpha((int) (d3Var.D * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), d3Var.f9938s);
                }
                super.dispatchDraw(canvas);
                return;
            case 22:
                ol0 ol0Var = (ol0) this.f10085b;
                if (ol0Var.f29168r > 0.0f && ol0Var.e != null) {
                    ol0Var.f29166f.reset();
                    float width2 = getWidth() / ol0Var.f29165c.getWidth();
                    ol0Var.f29166f.postScale(width2, width2);
                    ol0Var.d.setLocalMatrix(ol0Var.f29166f);
                    ol0Var.e.setAlpha((int) (ol0Var.f29168r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ol0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ol0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (ol0Var.f29168r * 255.0f));
                    canvas.save();
                    float f15 = ol0Var.H;
                    float f16 = ol0Var.G;
                    float f17 = ol0Var.f29168r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + ol0Var.I);
                    float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(Math.min(ol0Var.J, ol0Var.K), Math.max(ol0Var.J, ol0Var.K), 0.75f), 1.0f, ol0Var.f29168r);
                    canvas.scale(T1, T1, ((ol0Var.E.getBounds().width() / 2.0f) * ol0Var.J) + (-ol0Var.H) + ol0Var.E.getBounds().left, ((ol0Var.E.getBounds().height() / 2.0f) * ol0Var.K) + (-ol0Var.I) + ol0Var.E.getBounds().top);
                    vg.f fVar = ol0Var.F;
                    if (fVar != null) {
                        fVar.setAlpha((int) (ol0Var.f29168r * 255.0f));
                        ol0Var.F.draw(canvas);
                    }
                    ol0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                tx0 tx0Var = (tx0) this.f10085b;
                rx0 rx0Var = tx0Var.f30732c;
                if (rx0Var != null && rx0Var.getEditField() != null) {
                    h6 h6Var = tx0Var.V;
                    if (h6Var != null && h6Var.h) {
                        float x10 = tx0Var.f30732c.getEditField().getX() + tx0Var.f30732c.getEditField().getPaddingLeft();
                        h6 h6Var2 = tx0Var.V;
                        tx0Var.f30733c0 = x10 + h6Var2.f16028n;
                        tx0Var.W = h6Var2.f16029r;
                    } else if (tx0Var.f30729a0 != null && tx0Var.f30731b0 != null) {
                        tx0Var.f30733c0 = tx0Var.f30732c.getEditField().getX() + tx0Var.f30732c.getEditField().getPaddingLeft() + org.telegram.messenger.i0.L(12.0f);
                    }
                }
                if (tx0Var.f30740s && !tx0Var.f30741w && (arrayList = tx0Var.f30742x) != null && !arrayList.isEmpty() && !tx0Var.f30743y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t5 t5Var = tx0Var.R;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float e = t5Var.e(false, f7);
                t5 t5Var2 = tx0Var.S;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e7 = t5Var2.e(false, f10);
                float e10 = tx0Var.f30734d0.e(false, tx0Var.f30733c0);
                if (e <= 0.0f && e7 <= 0.0f && !z10) {
                    tx0Var.d.setVisibility(8);
                }
                tx0Var.O.rewind();
                float left = tx0Var.e.getLeft();
                int left2 = tx0Var.e.getLeft();
                ArrayList arrayList2 = tx0Var.f30742x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = m5.D(44.0f, size, left2);
                t5 t5Var3 = tx0Var.f30737f0;
                float f18 = t5Var3.f30530c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = t5Var3.e(z11, f19);
                }
                float e11 = tx0Var.f30735e0.e(z11, (left + D) / 2.0f);
                rx0 rx0Var2 = tx0Var.f30732c;
                if (rx0Var2 != null && rx0Var2.getEditField() != null) {
                    int i11 = tx0Var.h;
                    if (i11 == 0) {
                        tx0Var.d.setTranslationY(((-tx0Var.f30732c.getEditField().getHeight()) - tx0Var.f30732c.getEditField().getScrollY()) + tx0Var.W + org.telegram.messenger.i0.L(5.0f));
                    } else if (i11 == 1) {
                        tx0Var.d.setTranslationY(((-tx0Var.getMeasuredHeight()) - tx0Var.f30732c.getEditField().getScrollY()) + tx0Var.W + org.telegram.messenger.i0.L(20.0f) + tx0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((tx0Var.f30733c0 - Math.max(f20, Math.min(f21, org.telegram.messenger.i0.L(66.0f)))) - tx0Var.e.getLeft(), 0.0f);
                if (tx0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    tx0Var.e.setPadding(max, 0, 0, 0);
                    tx0Var.e.scrollBy(tx0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                tx0Var.e.setTranslationX(((int) Math.max((e10 - Math.max(f20, Math.min(f21, org.telegram.messenger.i0.L(66.0f)))) - tx0Var.e.getLeft(), 0.0f)) - max);
                float translationX = tx0Var.e.getTranslationX() + (e11 - f21) + tx0Var.e.getPaddingLeft();
                float translationY = tx0Var.e.getTranslationY() + tx0Var.e.getTop() + tx0Var.e.getPaddingTop();
                if (tx0Var.h == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.i0.L(6.66f);
                }
                float f22 = translationY + L;
                float min = Math.min(tx0Var.e.getTranslationX() + e11 + f21 + tx0Var.e.getPaddingLeft(), tx0Var.getWidth() - tx0Var.d.getPaddingRight());
                float translationY2 = tx0Var.e.getTranslationY() + tx0Var.e.getBottom();
                if (tx0Var.h == 0) {
                    i10 = org.telegram.messenger.i0.L(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(org.telegram.messenger.i0.L(9.0f), f21) * 2.0f;
                int i12 = tx0Var.h;
                if (i12 == 0) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    tx0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    tx0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    tx0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    tx0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    tx0Var.O.lineTo(org.telegram.messenger.i0.L(8.66f) + e10, f23);
                    tx0Var.O.lineTo(e10, org.telegram.messenger.i0.L(6.66f) + f23);
                    tx0Var.O.lineTo(e10 - org.telegram.messenger.i0.L(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    tx0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    tx0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    tx0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    tx0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    tx0Var.O.lineTo(e10 - org.telegram.messenger.i0.L(8.66f), f22);
                    tx0Var.O.lineTo(e10, f22 - org.telegram.messenger.i0.L(6.66f));
                    tx0Var.O.lineTo(org.telegram.messenger.i0.L(8.66f) + e10, f22);
                }
                tx0Var.O.close();
                if (tx0Var.Q == null) {
                    Paint paint = new Paint(1);
                    tx0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(2.0f)));
                    tx0Var.Q.setShadowLayer(org.telegram.messenger.i0.L(4.33f), 0.0f, org.telegram.messenger.i0.L(0.33333334f), 855638016);
                    tx0Var.Q.setColor(t6.w0(t6.qf, tx0Var.f30730b));
                }
                if (e < f11) {
                    tx0Var.P.rewind();
                    if (tx0Var.h == 0) {
                        L2 = org.telegram.messenger.i0.L(6.66f) + f23;
                    } else {
                        L2 = f22 - org.telegram.messenger.i0.L(6.66f);
                    }
                    double d = e10 - translationX;
                    double d10 = L2 - f22;
                    f12 = 255.0f;
                    double d11 = e10 - min;
                    double d12 = L2 - f23;
                    tx0Var.P.addCircle(e10, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d10, 2.0d) + Math.pow(d, 2.0d), Math.pow(d10, 2.0d) + Math.pow(d11, 2.0d)), Math.max(Math.pow(d12, 2.0d) + Math.pow(d, 2.0d), Math.pow(d12, 2.0d) + Math.pow(d11, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(tx0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, tx0Var.getWidth(), tx0Var.getHeight(), (int) (e * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(tx0Var.O, tx0Var.Q);
                canvas.save();
                canvas.clipPath(tx0Var.O);
                super.dispatchDraw(canvas);
                float f32 = tx0Var.f30737f0.f30530c;
                float f33 = tx0Var.f30735e0.f30530c;
                float f34 = f32 / 2.0f;
                float translationX2 = tx0Var.e.getTranslationX() + (f33 - f34) + tx0Var.e.getPaddingLeft();
                float paddingTop = tx0Var.e.getPaddingTop() + tx0Var.e.getTop();
                float min3 = Math.min(tx0Var.e.getTranslationX() + f33 + f34 + tx0Var.e.getPaddingLeft(), tx0Var.getWidth() - tx0Var.d.getPaddingRight());
                float bottom = tx0Var.e.getBottom();
                t5 t5Var4 = tx0Var.T;
                if (tx0Var.e.canScrollHorizontally(-1)) {
                    f13 = f11;
                } else {
                    f13 = 0.0f;
                }
                float e12 = t5Var4.e(false, f13);
                if (e12 > 0.0f) {
                    int i13 = (int) translationX2;
                    t6.F4.setBounds(i13, (int) paddingTop, org.telegram.messenger.i0.L(32.0f) + i13, (int) bottom);
                    t6.F4.setAlpha((int) (e12 * f12));
                    t6.F4.draw(canvas);
                }
                t5 t5Var5 = tx0Var.U;
                if (tx0Var.e.canScrollHorizontally(1)) {
                    f14 = f11;
                } else {
                    f14 = 0.0f;
                }
                float e13 = t5Var5.e(false, f14);
                if (e13 > 0.0f) {
                    int i14 = (int) min3;
                    t6.E4.setBounds(i14 - org.telegram.messenger.i0.L(32.0f), (int) paddingTop, i14, (int) bottom);
                    t6.E4.setAlpha((int) (e13 * f12));
                    t6.E4.draw(canvas);
                }
                canvas.restore();
                if (tx0Var.R.f30530c < f11) {
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
        switch (this.f10084a) {
            case 23:
                ie ieVar = (ie) this.f10085b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ieVar.isShowing()) {
                    ieVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f10084a) {
            case 3:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((d3) this.f10085b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((ol0) this.f10085b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ts0[] ts0VarArr;
        ts0 ts0Var;
        switch (this.f10084a) {
            case 13:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.f10085b).f24879y0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                n90 n90Var = (n90) this.f10085b;
                m90 m90Var = n90Var.R;
                if (m90Var != null && (ts0Var = (ts0VarArr = m90Var.m0)[0]) != null && ts0Var.h.getFastScroll() != null && ts0VarArr[0].h.getFastScroll().f24427n) {
                    return n90Var.R.Y(motionEvent);
                }
                m90 m90Var2 = n90Var.R;
                if (m90Var2 != null && m90Var2.O(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 25:
                lu0 lu0Var = (lu0) this.f10085b;
                if (motionEvent.getActionMasked() == 0 && (lu0Var.f28275d0 || motionEvent.getY() >= lu0Var.f28270a0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f10084a) {
            case 28:
                float a2 = ((dc) this.f10085b).a(0.03f);
                canvas.save();
                canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: jg.l0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f10084a) {
            case 8:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10084a) {
            case 16:
                hu huVar = (hu) this.f10085b;
                n81 n81Var = huVar.f26921j1;
                cu cuVar = huVar.f26920i1;
                super.onDetachedFromWindow();
                try {
                    jf0 jf0Var = jf0.f27400p0;
                    if (jf0Var.P) {
                        if (cuVar.getVisibility() != 0) {
                        }
                        if (n81Var.f() && !jf0Var.P) {
                            if (hu.J1 == huVar) {
                                hu.J1 = null;
                            }
                            n81Var.b();
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
                    if (n81Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        l0 l0Var;
        ze zeVar;
        switch (this.f10084a) {
            case 0:
                super.onDraw(canvas);
                cr0 cr0Var = (cr0) this.f10085b;
                Paint paint = cr0Var.f10176k1;
                t1 t1Var = cr0Var.f10167d1;
                paint.setAlpha((int) ((1.0f - cr0Var.f10178m1) * t1Var.getAlpha() * 102.0f));
                RectF rectF = org.telegram.messenger.i0.P;
                t1Var.b(rectF);
                n0 n0Var = cr0Var.L0;
                int top = n0Var.getTop();
                float translationY = t1Var.getTranslationY() + n0Var.getTranslationY() + t1Var.getTop() + top;
                float f7 = rectF.left;
                a2 a2Var = cr0Var.f10168e1;
                rectF.set(org.telegram.messenger.i0.T1(f7, a2Var.getLeft(), cr0Var.f10178m1), org.telegram.messenger.i0.T1(rectF.top + translationY, a2Var.getTop() - a2Var.getTranslationY(), cr0Var.f10178m1), org.telegram.messenger.i0.T1(rectF.right, a2Var.getRight(), cr0Var.f10178m1), org.telegram.messenger.i0.T1(translationY + rectF.bottom, a2Var.getBottom() - a2Var.getTranslationY(), cr0Var.f10178m1));
                float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(cr0Var.f10178m1, 32, 16));
                Paint paint2 = cr0Var.l1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * cr0Var.f10178m1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            case 1:
                e2 e2Var = (e2) this.f10085b;
                Rect rect = e2Var.E0;
                Rect rect2 = e2Var.D0;
                Paint paint3 = e2Var.F0;
                qu0 qu0Var = e2Var.f9956v0;
                Bitmap bitmap = e2Var.A0;
                if (e2Var.f9960z0 != null) {
                    canvas.save();
                    float d = e2Var.f9955u0.d(e2Var.f9954t0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, qu0Var.f29808a / 2.0f, 0.0f);
                    canvas.skew(0.0f, m5.A(1.0f, d, 4.0f * d, 0.25f));
                    float d10 = e2Var.f9959y0.d(e2Var.f9958x0);
                    if (!e2Var.f9958x0) {
                        canvas.save();
                        paint3.setAlpha((int) ((1.0f - d10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(l0Var.getWidth() / 2.0f, l0Var.getHeight() / 2.0f);
                            canvas.rotate(e2Var.f9957w0);
                            float max = Math.max(qu0Var.f29808a / bitmap.getWidth(), qu0Var.f29809b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (e2Var.G0 != null) {
                                canvas.rotate(-e2Var.getOrientation());
                                int contentWidth = e2Var.getContentWidth();
                                int contentHeight = e2Var.getContentHeight();
                                if (((e2Var.getOrientation() + e2Var.G0.f19698k) / 90) % 2 == 1) {
                                    contentWidth = e2Var.getContentHeight();
                                    contentHeight = e2Var.getContentWidth();
                                }
                                ze zeVar2 = e2Var.G0;
                                float f10 = zeVar2.e;
                                float f11 = zeVar2.f19695f;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = e2Var.G0.f19694c;
                                canvas.scale(f14, f14);
                                ze zeVar3 = e2Var.G0;
                                canvas.translate(zeVar3.f19692a * f12, zeVar3.f19693b * f13);
                                canvas.rotate(e2Var.G0.d + zeVar.f19698k);
                                if (e2Var.G0.f19699l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(e2Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint3);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                w2 w2Var = (w2) this.f10085b;
                ImageReceiver imageReceiver = w2Var.f10351x0;
                qu0 qu0Var2 = w2Var.f10349v0;
                if (w2Var.f10350w0 != null) {
                    canvas.save();
                    float d11 = w2Var.f10348u0.d(w2Var.f10347t0);
                    canvas.scale(1.0f - (d11 * 2.0f), 1.0f, qu0Var2.f29808a / 2.0f, 0.0f);
                    canvas.skew(0.0f, m5.A(1.0f, d11, 4.0f * d11, 0.25f));
                    imageReceiver.y0(0.0f, 0.0f, (int) qu0Var2.f29808a, (int) qu0Var2.f29809b);
                    imageReceiver.h(canvas, null);
                    canvas.restore();
                    return;
                }
                return;
            case 11:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.g) this.f10085b) == null) {
                    org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                    this.f10085b = gVar;
                    gVar.f31498k = false;
                    gVar.f31500m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.g) this.f10085b).f31494f = getMeasuredWidth();
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.f10085b).a(org.telegram.messenger.i0.L(4.0f), canvas, rectF2, null);
                invalidate();
                return;
            case 12:
                ((o9) this.f10085b).e.a(canvas);
                return;
            case 13:
                bl blVar = (bl) this.f10085b;
                blVar.f24851b0.setColor(t6.w0(t6.f21002h5, blVar.f30963a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - blVar.f24879y0, blVar.f24851b0);
                return;
            case 24:
                eu0 eu0Var = (eu0) this.f10085b;
                eu0Var.f25930k1.setBounds(0, eu0Var.f25931m1 - eu0Var.f21615s0, getMeasuredWidth(), getMeasuredHeight());
                eu0Var.f25930k1.draw(canvas);
                return;
            case 29:
                b61 b61Var = (b61) this.f10085b;
                b61Var.f24665i1.setBounds(0, (int) ((b61Var.f24669n1 - b61Var.f21615s0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                b61Var.f24665i1.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        kg.w0 w0Var;
        kg.w0 w0Var2;
        switch (this.f10084a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                kg.x0 x0Var = (kg.x0) this.f10085b;
                if (x0Var.f11330r && (w0Var2 = x0Var.h) != null) {
                    charSequence = w0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (w0Var = x0Var.f11328f) != null) {
                    charSequence = w0Var.getText();
                }
                if (charSequence != null) {
                    accessibilityNodeInfo.setText(charSequence);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f10084a) {
            case 13:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.f10085b).f24879y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 24:
                eu0 eu0Var = (eu0) this.f10085b;
                if (motionEvent.getAction() == 0 && eu0Var.f25931m1 != 0 && motionEvent.getY() < eu0Var.f25931m1) {
                    eu0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 29:
                b61 b61Var = (b61) this.f10085b;
                if (motionEvent.getAction() == 0 && b61Var.f24669n1 != 0 && motionEvent.getY() < b61Var.f24669n1) {
                    b61Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int right;
        int left;
        int measuredWidth;
        int i16;
        int measuredWidth2;
        int measuredHeight;
        int L;
        int measuredHeight2;
        int i17;
        int i18;
        FrameLayout frameLayout;
        float f7;
        boolean z11;
        int i19;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float x10;
        switch (this.f10084a) {
            case 7:
                int childCount = getChildCount();
                int i20 = i12 - i10;
                int i21 = -1;
                if (((org.telegram.ui.ActionBar.x1) this.f10085b).M0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i20 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.i0.L(8.0f)) / 2);
                    boolean z12 = dd.X;
                    if (z12) {
                        i16 = paddingRight - max;
                    } else {
                        i16 = paddingLeft;
                    }
                    if (!z12) {
                        paddingLeft = paddingRight - max;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = org.telegram.messenger.i0.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i16, paddingTop, i16 + max, org.telegram.messenger.i0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, org.telegram.messenger.i0.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i16, L2, i16 + max, org.telegram.messenger.i0.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, org.telegram.messenger.i0.L(40.0f) + L2);
                        return;
                    }
                    return;
                }
                View view = null;
                int i22 = 0;
                while (i22 < childCount) {
                    View childAt = getChildAt(i22);
                    Integer num = (Integer) childAt.getTag();
                    if (num != null) {
                        if (num.intValue() == i21) {
                            if (dd.X) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i20 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i20 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (dd.X) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = m5.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i20 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = a30.w(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (dd.X) {
                                if (findViewWithTag5 == null) {
                                    left = i20 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag5.getLeft() - org.telegram.messenger.i0.L(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i23 = left - measuredWidth;
                                childAt.layout(i23, getPaddingTop(), childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                if (findViewWithTag5 == null) {
                                    right = getPaddingLeft();
                                } else {
                                    right = findViewWithTag5.getRight() + org.telegram.messenger.i0.L(8.0f);
                                }
                                childAt.layout(right, getPaddingTop(), childAt.getMeasuredWidth() + right, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (dd.X) {
                                childAt.layout((i20 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i20 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                    } else {
                        int measuredWidth3 = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        if (view != null) {
                            i15 = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                            i14 = ((view.getMeasuredHeight() - measuredHeight3) / 2) + view.getTop();
                        } else {
                            i14 = 0;
                            i15 = 0;
                        }
                        childAt.layout(i15, i14, measuredWidth3 + i15, measuredHeight3 + i14);
                    }
                    i22++;
                    i21 = -1;
                }
                return;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                m20 m20Var = (m20) this.f10085b;
                m20Var.setTranslationY((getMeasuredHeight() * 0.28f) - (m20Var.getMeasuredWidth() / 2.0f));
                m20Var.setTranslationX((getMeasuredWidth() * 0.82f) - (m20Var.getMeasuredWidth() / 2.0f));
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                int L3 = org.telegram.messenger.i0.L(36.0f);
                int i24 = ((i12 - i10) - L3) / 2;
                int i25 = ((i13 - i11) - L3) / 2;
                ((o9) this.f10085b).e.f(i24, i25, i24 + L3, L3 + i25);
                return;
            case 14:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f10085b;
                if (getMeasuredWidth() == org.telegram.messenger.i0.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i17 = getMeasuredWidth() / 2;
                    int i26 = measuredHeight / 2;
                    measuredHeight2 = org.telegram.messenger.i0.L(17.0f) + measuredHeight + i26;
                    i18 = i26 - org.telegram.messenger.i0.L(17.0f);
                    L = i17;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(13.0f);
                    int i27 = measuredWidth2 / 2;
                    int L4 = measuredWidth2 + i27 + org.telegram.messenger.i0.L(17.0f);
                    L = i27 - org.telegram.messenger.i0.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(13.0f);
                    i17 = L4;
                    i18 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f23882q0.getMeasuredHeight()) - org.telegram.messenger.i0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.i0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f23882q0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f23882q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f23882q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f23882q0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f23882q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f23882q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23871k0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f23871k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23871k0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f23871k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f23884r0;
                imageView.layout(i17 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f23884r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23884r0.getMeasuredWidth() / 2) + i17, (chatAttachAlertPhotoLayout.f23884r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i28 = 0; i28 < 2; i28++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i28];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i18 - (chatAttachAlertPhotoLayout.S[i28].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i28].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.S[i28].getMeasuredHeight() / 2) + i18);
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                g20 g20Var = (g20) this.f10085b;
                l0 l0Var = g20Var.f26300b;
                int[] iArr = g20Var.G;
                l0Var.getLocationOnScreen(iArr);
                g20Var.N = iArr[0];
                g20Var.M = iArr[1] - org.telegram.messenger.i0.L(25.0f);
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.f10085b;
                l0 l0Var2 = ol0Var.f29169s;
                vu0 vu0Var = ol0Var.f29170w;
                Drawable drawable = ol0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (ol0Var.f29172y != null) {
                        float f10 = ol0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = ol0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z13 = false;
                        if (!ol0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < org.telegram.messenger.i0.L(8.0f)) {
                                ol0Var.D.setPivotX(org.telegram.messenger.i0.L(6.0f));
                                ol0Var.f29172y.setX(Math.min(vu0Var.getWidth() - ol0Var.f29172y.getWidth(), f11 - org.telegram.messenger.i0.L(10.0f)) - vu0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ol0Var.D.setPivotX(viewGroup2.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f));
                                f7 = 4.0f;
                                ol0Var.f29172y.setX(Math.max(org.telegram.messenger.i0.L(8.0f), (org.telegram.messenger.i0.L(4.0f) + f12) - ol0Var.f29172y.getMeasuredWidth()) - vu0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((ol0Var.f29172y.getX() + ol0Var.f29172y.getWidth()) - org.telegram.messenger.i0.L(6.0f)) - f12;
                            } else {
                                x10 = (ol0Var.f29172y.getX() + org.telegram.messenger.i0.L(10.0f)) - f11;
                            }
                            ol0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (ol0Var.F != null) {
                            i19 = org.telegram.messenger.i0.L(21.0f);
                        } else {
                            i19 = 0;
                        }
                        float f16 = f15 + i19;
                        if (ol0Var.f29172y.getMeasuredHeight() + f16 > l0Var2.getMeasuredHeight() - org.telegram.messenger.i0.L(16.0f)) {
                            ol0Var.D.setPivotY(viewGroup.getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f));
                            ol0Var.f29172y.setY(((f14 - org.telegram.messenger.i0.L(f7)) - ol0Var.f29172y.getMeasuredHeight()) - vu0Var.getY());
                            z13 = true;
                        } else {
                            ol0Var.D.setPivotY(org.telegram.messenger.i0.L(6.0f));
                            ol0Var.f29172y.setY(Math.min((l0Var2.getHeight() - ol0Var.f29172y.getMeasuredHeight()) - org.telegram.messenger.i0.L(16.0f), f16) - vu0Var.getY());
                        }
                        z60 z60Var = ol0Var.f29171x;
                        z60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20127c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                eu0.I0((eu0) this.f10085b);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f7;
        float top;
        int measuredHeight;
        kg.g gVar;
        int i12;
        View view;
        int L;
        int i13;
        int L2;
        int L3;
        switch (this.f10084a) {
            case 5:
                kg.i1 i1Var = (kg.i1) this.f10085b;
                if (i1Var.J0) {
                    i1Var.f11118q1 = View.MeasureSpec.getSize(i10);
                } else {
                    i1Var.f11118q1 = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                super.onMeasure(i10, i11);
                kg.v1 v1Var = (kg.v1) ((kg.f) this.f10085b).d;
                kg.h hVar = v1Var.f11302j2;
                if (hVar != null) {
                    top = hVar.getTop();
                    measuredHeight = v1Var.f11302j2.getMeasuredHeight();
                } else {
                    View view2 = v1Var.f11312t2;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = v1Var.f11312t2.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        v1Var.f11301i2.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                v1Var.f11301i2.setTranslationY(f7 - (gVar.getMeasuredHeight() / 2.0f));
                return;
            case 7:
                super.onMeasure(i10, i11);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i14 = 0;
                if (((org.telegram.ui.ActionBar.x1) this.f10085b).M0) {
                    int max = Math.max(0, (measuredWidth - org.telegram.messenger.i0.L(8.0f)) / 2);
                    while (i14 < childCount) {
                        View childAt = getChildAt(i14);
                        if (childAt.getTag() != null) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
                        }
                        i14++;
                    }
                    return;
                }
                int i15 = 0;
                while (i14 < childCount) {
                    View childAt2 = getChildAt(i14);
                    if ((childAt2 instanceof TextView) && childAt2.getTag() != null) {
                        i15 = childAt2.getMeasuredWidth() + i15;
                    }
                    i14++;
                }
                if (i15 > measuredWidth) {
                    View findViewWithTag = findViewWithTag(-2);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-3);
                    if (findViewWithTag != null && findViewWithTag3 != null) {
                        if (findViewWithTag.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i15 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i15 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                        if (findViewWithTag2.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i15 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i15 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                if (View.MeasureSpec.getSize(i10) > org.telegram.messenger.i0.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 13:
                super.onMeasure(i10, i11);
                yk ykVar = ((bl) this.f10085b).D;
                if (ykVar != null) {
                    ykVar.a();
                    return;
                }
                return;
            case 16:
                int size = View.MeasureSpec.getSize(i10);
                hu huVar = (hu) this.f10085b;
                int min = (int) Math.min(huVar.f26935y1 / (huVar.f26934x1 / size), org.telegram.messenger.i0.f16172q.y / 2);
                if (huVar.A1) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i12 + 84) + min + 1, 1073741824));
                return;
            case 17:
                ux uxVar = (ux) this.f10085b;
                if (((View) uxVar.F.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - uxVar.F.getY());
                } else {
                    L = org.telegram.messenger.i0.L(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L - uxVar.F.f31939b1, 1073741824));
                return;
            case 18:
                vy vyVar = ((qy) this.f10085b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (a30.y(8.0f, vyVar.D0.getMeasuredHeight() - vyVar.f31939b1, 3) * 1.7f), 1073741824));
                return;
            case 24:
                eu0 eu0Var = (eu0) this.f10085b;
                ag.b1 b1Var = eu0Var.f25928i1;
                int size2 = View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.f16166m;
                getMeasuredWidth();
                int D = m5.D(54.0f, od.g(), m5.C(56.0f, org.telegram.messenger.i0.L(56.0f), 1));
                int i16 = size2 / 5;
                if (D < i16 * 3) {
                    i13 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    i13 = i16 * 2;
                    if (D < size2) {
                        i13 -= size2 - D;
                    }
                }
                if (b1Var.getPaddingTop() != i13) {
                    eu0Var.f25932n1 = true;
                    b1Var.setPadding(0, i13, 0, org.telegram.messenger.i0.L(8.0f));
                    eu0Var.f25932n1 = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 27:
                tx0 tx0Var = (tx0) this.f10085b;
                int i17 = tx0Var.f30738n;
                if (tx0Var.h == 0) {
                    L2 = org.telegram.messenger.i0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.i0.L(6.66f);
                }
                int i18 = tx0Var.f30738n;
                if (tx0Var.h == 0) {
                    L3 = org.telegram.messenger.i0.L(6.66f);
                } else {
                    L3 = org.telegram.messenger.i0.L(8.0f);
                }
                setPadding(i17, L2, i18, L3);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f10084a) {
            case 22:
                super.onSizeChanged(i10, i11, i12, i13);
                ol0 ol0Var = (ol0) this.f10085b;
                yg.d.c(ol0Var.h, ol0Var.f29169s);
                ViewGroup viewGroup = ol0Var.D;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f10084a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    cr0 cr0Var = (cr0) this.f10085b;
                    if (cr0Var.f10180n1) {
                        cr0Var.y0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            case 24:
                if (!((eu0) this.f10085b).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 29:
                if (!((b61) this.f10085b).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f10084a) {
            case 21:
                uk0 uk0Var = (uk0) this.f10085b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(uk0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(uk0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, uk0Var.f30984b1.getMeasuredWidth(), uk0Var.f30984b1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 24:
                if (!((eu0) this.f10085b).f25932n1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((dx0) this.f10085b).X1) {
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
    public void setPressed(boolean z10) {
        switch (this.f10084a) {
            case 28:
                super.setPressed(z10);
                ((dc) this.f10085b).c(z10);
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f10084a) {
            case 8:
                super.setTranslationY(f7);
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f10085b;
                FrameLayout frameLayout = z2Var.E;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(z2Var.f21590c.getHeight() - z2Var.f21587b.getY())) + z2Var.f21615s0);
                }
                z2Var.g0(f7);
                return;
            case 29:
                super.setTranslationY(f7);
                b61.I0((b61) this.f10085b);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f10084a) {
            case 19:
                super.setVisibility(i10);
                ((g20) this.f10085b).d.setVisibility(i10);
                return;
            case 27:
                tx0 tx0Var = (tx0) this.f10085b;
                if (getVisibility() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                super.setVisibility(i10);
                if (!z10) {
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (tx0Var.e != null) {
                        for (int i11 = 0; i11 < tx0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                sx0 sx0Var = (sx0) tx0Var.e.getChildAt(i11);
                                Drawable drawable = sx0Var.f30463b;
                                if (drawable instanceof f5) {
                                    ((f5) drawable).a(sx0Var);
                                }
                                sx0Var.f30464c = true;
                            } else {
                                sx0 sx0Var2 = (sx0) tx0Var.e.getChildAt(i11);
                                Drawable drawable2 = sx0Var2.f30463b;
                                if (drawable2 instanceof f5) {
                                    ((f5) drawable2).n(sx0Var2);
                                }
                                sx0Var2.f30464c = false;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public l0(w2 w2Var, Context context) {
        super(context);
        this.f10084a = 2;
        this.f10085b = w2Var;
        setWillNotDraw(false);
    }

    public l0(Context context, p6 p6Var) {
        super(context);
        this.f10084a = 15;
        this.f10085b = new io[2];
        int i10 = 0;
        while (true) {
            io[] ioVarArr = (io[]) this.f10085b;
            if (i10 < ioVarArr.length) {
                ioVarArr[i10] = new io(context, p6Var);
                addView(((io[]) this.f10085b)[i10], b6.e(-1, -1, 119));
                i10++;
            } else {
                ioVarArr[0].setVisibility(0);
                ((io[]) this.f10085b)[1].setVisibility(8);
                return;
            }
        }
    }

    public l0(e2 e2Var, Context context) {
        super(context);
        this.f10084a = 1;
        this.f10085b = e2Var;
        setWillNotDraw(false);
    }

    public l0(Context context, int i10) {
        super(context);
        this.f10084a = i10;
        switch (i10) {
            case 28:
                super(context);
                this.f10085b = new dc(this);
                return;
            default:
                return;
        }
    }

    public l0(cr0 cr0Var, Context context) {
        super(context);
        this.f10084a = 0;
        this.f10085b = cr0Var;
        setWillNotDraw(false);
    }

    public l0(lu0 lu0Var, Context context) {
        super(context);
        this.f10084a = 25;
        this.f10085b = lu0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    public l0(Context context, m20 m20Var) {
        super(context);
        this.f10084a = 10;
        this.f10085b = m20Var;
    }
}
