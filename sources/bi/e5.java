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
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zn;
import org.telegram.ui.Components.zv0;
public final class e5 extends FrameLayout {
    public final int f3760a;
    public Object f3761b;

    public e5(int i7, Context context, Object obj) {
        super(context);
        this.f3760a = i7;
        this.f3761b = obj;
    }

    public zn a() {
        return ((zn[]) this.f3761b)[0];
    }

    @Override
    public void addView(View view, int i7, int i10) {
        switch (this.f3760a) {
            case 8:
                super.addView(view, i7, i10);
                ((jh.f) this.f3761b).e();
                return;
            default:
                super.addView(view, i7, i10);
                return;
        }
    }

    public void b(dh.c cVar, gh.e eVar) {
        lh.f fVar = (lh.f) this.f3761b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        zn[] znVarArr = (zn[]) this.f3761b;
        zn znVar = znVarArr[0];
        zn znVar2 = znVarArr[1];
        znVarArr[0] = znVar2;
        znVarArr[1] = znVar;
        znVar2.f41028n = true;
        znVar2.setVisibility(0);
        znVarArr[0].setScaleX(0.8f);
        znVarArr[0].setScaleY(0.8f);
        znVarArr[0].setAlpha(0.0f);
        znVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = znVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        xq xqVar = xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
        zn znVar3 = znVarArr[1];
        znVar3.f41028n = false;
        znVar3.setVisibility(0);
        znVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new xf(znVar3, 29)).start();
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
        switch (this.f3760a) {
            case 23:
                kk0 kk0Var = (kk0) this.f3761b;
                if (kk0Var.f35366r > 0.0f && kk0Var.f35363e != null) {
                    kk0Var.f35364f.reset();
                    float width = getWidth() / kk0Var.f35362c.getWidth();
                    kk0Var.f35364f.postScale(width, width);
                    kk0Var.d.setLocalMatrix(kk0Var.f35364f);
                    kk0Var.f35363e.setAlpha((int) (kk0Var.f35366r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), kk0Var.f35363e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = kk0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (kk0Var.f35366r * 255.0f));
                    canvas.save();
                    float f16 = kk0Var.H;
                    float f17 = kk0Var.G;
                    float f18 = kk0Var.f35366r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + kk0Var.I);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(kk0Var.J, kk0Var.K), Math.max(kk0Var.J, kk0Var.K), 0.75f), 1.0f, kk0Var.f35366r);
                    canvas.scale(T1, T1, ((kk0Var.E.getBounds().width() / 2.0f) * kk0Var.J) + (-kk0Var.H) + kk0Var.E.getBounds().left, ((kk0Var.E.getBounds().height() / 2.0f) * kk0Var.K) + (-kk0Var.I) + kk0Var.E.getBounds().top);
                    fh.g gVar = kk0Var.F;
                    if (gVar != null) {
                        gVar.setAlpha((int) (kk0Var.f35366r * 255.0f));
                        kk0Var.F.draw(canvas);
                    }
                    kk0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                pw0 pw0Var = (pw0) this.f3761b;
                nw0 nw0Var = pw0Var.f37106c;
                if (nw0Var != null && nw0Var.getEditField() != null) {
                    org.telegram.messenger.f6 f6Var = pw0Var.V;
                    if (f6Var != null && f6Var.h) {
                        float x10 = pw0Var.f37106c.getEditField().getX() + pw0Var.f37106c.getEditField().getPaddingLeft();
                        org.telegram.messenger.f6 f6Var2 = pw0Var.V;
                        pw0Var.f37107c0 = x10 + f6Var2.f22374n;
                        pw0Var.W = f6Var2.f22375r;
                    } else if (pw0Var.f37103a0 != null && pw0Var.f37105b0 != null) {
                        pw0Var.f37107c0 = pw0Var.f37106c.getEditField().getX() + pw0Var.f37106c.getEditField().getPaddingLeft() + org.telegram.messenger.g0.L(12.0f);
                    }
                }
                if (pw0Var.f37115s && !pw0Var.f37116w && (arrayList = pw0Var.f37117x) != null && !arrayList.isEmpty() && !pw0Var.f37118y) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Components.w5 w5Var = pw0Var.R;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = w5Var.e(false, f10);
                org.telegram.ui.Components.w5 w5Var2 = pw0Var.S;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float e11 = w5Var2.e(false, f11);
                float e12 = pw0Var.f37108d0.e(false, pw0Var.f37107c0);
                if (e10 <= 0.0f && e11 <= 0.0f && !z9) {
                    pw0Var.d.setVisibility(8);
                }
                pw0Var.O.rewind();
                float left = pw0Var.f37109e.getLeft();
                int left2 = pw0Var.f37109e.getLeft();
                ArrayList arrayList2 = pw0Var.f37117x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.k5.D(44.0f, size, left2);
                org.telegram.ui.Components.w5 w5Var3 = pw0Var.f37112f0;
                float f19 = w5Var3.f39910c;
                if (f19 <= 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = w5Var3.e(z10, f20);
                }
                float e13 = pw0Var.f37110e0.e(z10, (left + D) / 2.0f);
                nw0 nw0Var2 = pw0Var.f37106c;
                if (nw0Var2 != null && nw0Var2.getEditField() != null) {
                    int i10 = pw0Var.h;
                    if (i10 == 0) {
                        pw0Var.d.setTranslationY(((-pw0Var.f37106c.getEditField().getHeight()) - pw0Var.f37106c.getEditField().getScrollY()) + pw0Var.W + org.telegram.messenger.g0.L(5.0f));
                    } else if (i10 == 1) {
                        pw0Var.d.setTranslationY(((-pw0Var.getMeasuredHeight()) - pw0Var.f37106c.getEditField().getScrollY()) + pw0Var.W + org.telegram.messenger.g0.L(20.0f) + pw0Var.d.getHeight());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((pw0Var.f37107c0 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - pw0Var.f37109e.getLeft(), 0.0f);
                if (pw0Var.f37109e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    pw0Var.f37109e.setPadding(max, 0, 0, 0);
                    pw0Var.f37109e.scrollBy(pw0Var.f37109e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                pw0Var.f37109e.setTranslationX(((int) Math.max((e12 - Math.max(f21, Math.min(f22, org.telegram.messenger.g0.L(66.0f)))) - pw0Var.f37109e.getLeft(), 0.0f)) - max);
                float translationX = pw0Var.f37109e.getTranslationX() + (e13 - f22) + pw0Var.f37109e.getPaddingLeft();
                float translationY = pw0Var.f37109e.getTranslationY() + pw0Var.f37109e.getTop() + pw0Var.f37109e.getPaddingTop();
                if (pw0Var.h == 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(6.66f);
                }
                float f23 = translationY + L;
                float min = Math.min(pw0Var.f37109e.getTranslationX() + e13 + f22 + pw0Var.f37109e.getPaddingLeft(), pw0Var.getWidth() - pw0Var.d.getPaddingRight());
                float translationY2 = pw0Var.f37109e.getTranslationY() + pw0Var.f37109e.getBottom();
                if (pw0Var.h == 0) {
                    i7 = org.telegram.messenger.g0.L(6.66f);
                } else {
                    i7 = 0;
                }
                float f24 = translationY2 - i7;
                float min2 = Math.min(org.telegram.messenger.g0.L(9.0f), f22) * 2.0f;
                int i11 = pw0Var.h;
                if (i11 == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    pw0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    pw0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    pw0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    pw0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    pw0Var.O.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f24);
                    pw0Var.O.lineTo(e12, org.telegram.messenger.g0.L(6.66f) + f24);
                    pw0Var.O.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f24);
                } else if (i11 == 1) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    pw0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    pw0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    pw0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    pw0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    pw0Var.O.lineTo(e12 - org.telegram.messenger.g0.L(8.66f), f23);
                    pw0Var.O.lineTo(e12, f23 - org.telegram.messenger.g0.L(6.66f));
                    pw0Var.O.lineTo(org.telegram.messenger.g0.L(8.66f) + e12, f23);
                }
                pw0Var.O.close();
                if (pw0Var.Q == null) {
                    Paint paint = new Paint(1);
                    pw0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.0f)));
                    pw0Var.Q.setShadowLayer(org.telegram.messenger.g0.L(4.33f), 0.0f, org.telegram.messenger.g0.L(0.33333334f), 855638016);
                    pw0Var.Q.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qf, pw0Var.f37104b));
                }
                if (e10 < f12) {
                    pw0Var.P.rewind();
                    if (pw0Var.h == 0) {
                        L2 = org.telegram.messenger.g0.L(6.66f) + f24;
                    } else {
                        L2 = f23 - org.telegram.messenger.g0.L(6.66f);
                    }
                    double d = e12 - translationX;
                    double d2 = L2 - f23;
                    f13 = 255.0f;
                    double d10 = e12 - min;
                    double d11 = L2 - f24;
                    pw0Var.P.addCircle(e12, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d10, 2.0d)), Math.max(Math.pow(d11, 2.0d) + Math.pow(d, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d))))) * e10, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(pw0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, pw0Var.getWidth(), pw0Var.getHeight(), (int) (e10 * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(pw0Var.O, pw0Var.Q);
                canvas.save();
                canvas.clipPath(pw0Var.O);
                super.dispatchDraw(canvas);
                float f33 = pw0Var.f37112f0.f39910c;
                float f34 = pw0Var.f37110e0.f39910c;
                float f35 = f33 / 2.0f;
                float translationX2 = pw0Var.f37109e.getTranslationX() + (f34 - f35) + pw0Var.f37109e.getPaddingLeft();
                float paddingTop = pw0Var.f37109e.getPaddingTop() + pw0Var.f37109e.getTop();
                float min3 = Math.min(pw0Var.f37109e.getTranslationX() + f34 + f35 + pw0Var.f37109e.getPaddingLeft(), pw0Var.getWidth() - pw0Var.d.getPaddingRight());
                float bottom = pw0Var.f37109e.getBottom();
                org.telegram.ui.Components.w5 w5Var4 = pw0Var.T;
                if (pw0Var.f37109e.canScrollHorizontally(-1)) {
                    f14 = f12;
                } else {
                    f14 = 0.0f;
                }
                float e14 = w5Var4.e(false, f14);
                if (e14 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.l6.F4.setBounds(i12, (int) paddingTop, org.telegram.messenger.g0.L(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.l6.F4.setAlpha((int) (e14 * f13));
                    org.telegram.ui.ActionBar.l6.F4.draw(canvas);
                }
                org.telegram.ui.Components.w5 w5Var5 = pw0Var.U;
                if (pw0Var.f37109e.canScrollHorizontally(1)) {
                    f15 = f12;
                } else {
                    f15 = 0.0f;
                }
                float e15 = w5Var5.e(false, f15);
                if (e15 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.l6.E4.setBounds(i13 - org.telegram.messenger.g0.L(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.l6.E4.setAlpha((int) (e15 * f13));
                    org.telegram.ui.ActionBar.l6.E4.draw(canvas);
                }
                canvas.restore();
                if (pw0Var.R.f39910c < f12) {
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
        switch (this.f3760a) {
            case 24:
                ne neVar = (ne) this.f3761b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && neVar.isShowing()) {
                    neVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f3760a) {
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((kk0) this.f3761b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ur0[] ur0VarArr;
        ur0 ur0Var;
        switch (this.f3760a) {
            case 1:
                if (((dd) this.f3761b).f3726t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((gi.f) this.f3761b).f14001s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                wk wkVar = (wk) this.f3761b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < wkVar.f40090w0 || motionEvent.getY() > wkVar.f40092x0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 21:
                v80 v80Var = (v80) this.f3761b;
                u80 u80Var = v80Var.R;
                if (u80Var != null && (ur0Var = (ur0VarArr = u80Var.m0)[0]) != null && ur0Var.h.getFastScroll() != null && ur0VarArr[0].h.getFastScroll().f39096n) {
                    return v80Var.R.Z(motionEvent);
                }
                u80 u80Var2 = v80Var.R;
                if (u80Var2 != null && u80Var2.P(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 26:
                jt0 jt0Var = (jt0) this.f3761b;
                if (motionEvent.getActionMasked() == 0 && (jt0Var.f35137d0 || motionEvent.getY() >= jt0Var.f35132a0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3760a) {
            case 29:
                float a10 = ((org.telegram.ui.Components.ic) this.f3761b).a(0.03f);
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
        switch (this.f3760a) {
            case 10:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3760a) {
            case 17:
                wt wtVar = (wt) this.f3761b;
                m71 m71Var = wtVar.f40150j1;
                st stVar = wtVar.f40149i1;
                super.onDetachedFromWindow();
                try {
                    if (wtVar.M0()) {
                        if (stVar.getVisibility() != 0) {
                        }
                        if (m71Var.f() && !wtVar.M0()) {
                            if (wt.O1 == wtVar) {
                                wt.O1 = null;
                            }
                            m71Var.b();
                            return;
                        }
                        return;
                    }
                    if (stVar.getParent() != null) {
                        removeView(stVar);
                        stVar.stopLoading();
                        stVar.loadUrl("about:blank");
                        stVar.destroy();
                    }
                    if (m71Var.f()) {
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
        switch (this.f3760a) {
            case 2:
                super.onDraw(canvas);
                ch.o oVar = (ch.o) this.f3761b;
                if (oVar.f6349y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.f6349y, getWidth(), getHeight(), oVar.D);
                    return;
                }
                return;
            case 12:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f3761b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f3761b = nVar;
                    nVar.f39467k = false;
                    nVar.f39469m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f3761b).f39463f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f3761b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 13:
                ((org.telegram.ui.Components.u9) this.f3761b).f38649e.a(canvas);
                return;
            case 14:
                wk wkVar = (wk) this.f3761b;
                wkVar.W.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, wkVar.f39070a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - wkVar.f40094y0, wkVar.W);
                return;
            case 25:
                ct0 ct0Var = (ct0) this.f3761b;
                ct0Var.f32755k1.setBounds(0, ct0Var.f32756m1 - ct0Var.f28653s0, getMeasuredWidth(), getMeasuredHeight());
                ct0Var.f32755k1.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3760a) {
            case 14:
                wk wkVar = (wk) this.f3761b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < wkVar.f40090w0 || motionEvent.getY() > wkVar.f40092x0)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                ct0 ct0Var = (ct0) this.f3761b;
                if (motionEvent.getAction() == 0 && ct0Var.f32756m1 != 0 && motionEvent.getY() < ct0Var.f32756m1) {
                    ct0Var.dismiss();
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
        switch (this.f3760a) {
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ch.o oVar = (ch.o) this.f3761b;
                if (oVar.O && z9) {
                    oVar.j0(oVar.Q.f55499e);
                    return;
                }
                return;
            case 9:
                int childCount = getChildCount();
                int i19 = i11 - i7;
                int i20 = -1;
                if (((org.telegram.ui.ActionBar.u1) this.f3761b).K0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i19 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z11 = org.telegram.messenger.id.f23157a0;
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
                            if (org.telegram.messenger.id.f23157a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i19 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i19 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (org.telegram.messenger.id.f23157a0) {
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
                            if (org.telegram.messenger.id.f23157a0) {
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
                            if (org.telegram.messenger.id.f23157a0) {
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
                ((org.telegram.ui.Components.u9) this.f3761b).f38649e.f(i23, i24, i23 + L3, L3 + i24);
                return;
            case 15:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f3761b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f31228q0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f31228q0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f31228q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f31228q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f31228q0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f31228q0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f31228q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f31218k0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f31218k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f31218k0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f31218k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f31230r0;
                imageView.layout(i16 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f31230r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f31230r0.getMeasuredWidth() / 2) + i16, (chatAttachAlertPhotoLayout.f31230r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i27 = 0; i27 < 2; i27++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i27];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i17 - (chatAttachAlertPhotoLayout.S[i27].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i27].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.S[i27].getMeasuredHeight() / 2) + i17);
                }
                return;
            case 20:
                super.onLayout(z9, i7, i10, i11, i12);
                q10 q10Var = (q10) this.f3761b;
                e5 e5Var = q10Var.f37166b;
                int[] iArr = q10Var.H;
                e5Var.getLocationOnScreen(iArr);
                q10Var.O = iArr[0];
                q10Var.N = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                return;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                kk0 kk0Var = (kk0) this.f3761b;
                e5 e5Var2 = kk0Var.f35367s;
                tt0 tt0Var = kk0Var.f35368w;
                Drawable drawable = kk0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (kk0Var.f35370y != null) {
                        float f11 = kk0Var.H;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = kk0Var.I;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z12 = false;
                        if (!kk0Var.L) {
                            if (f13 - frameLayout.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                kk0Var.D.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                kk0Var.f35370y.setX(Math.min(tt0Var.getWidth() - kk0Var.f35370y.getWidth(), f12 - org.telegram.messenger.g0.L(10.0f)) - tt0Var.getX());
                                f10 = 4.0f;
                                z10 = false;
                            } else {
                                kk0Var.D.setPivotX(viewGroup2.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                kk0Var.f35370y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f13) - kk0Var.f35370y.getMeasuredWidth()) - tt0Var.getX());
                                z10 = true;
                            }
                            if (z10) {
                                x10 = ((kk0Var.f35370y.getX() + kk0Var.f35370y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f13;
                            } else {
                                x10 = (kk0Var.f35370y.getX() + org.telegram.messenger.g0.L(10.0f)) - f12;
                            }
                            kk0Var.G = x10;
                        } else {
                            f10 = 4.0f;
                            z10 = false;
                        }
                        if (kk0Var.F != null) {
                            i18 = org.telegram.messenger.g0.L(21.0f);
                        } else {
                            i18 = 0;
                        }
                        float f17 = f16 + i18;
                        if (kk0Var.f35370y.getMeasuredHeight() + f17 > e5Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            kk0Var.D.setPivotY(viewGroup.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            kk0Var.f35370y.setY(((f15 - org.telegram.messenger.g0.L(f10)) - kk0Var.f35370y.getMeasuredHeight()) - tt0Var.getY());
                            z12 = true;
                        } else {
                            kk0Var.D.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            kk0Var.f35370y.setY(Math.min((e5Var2.getHeight() - kk0Var.f35370y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), f17) - tt0Var.getY());
                        }
                        l60 l60Var = kk0Var.f35369x;
                        l60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = l60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f27287c = z10;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 25:
                super.onLayout(z9, i7, i10, i11, i12);
                ct0.I0((ct0) this.f3761b);
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
        switch (this.f3760a) {
            case 9:
                super.onMeasure(i7, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i13 = 0;
                if (((org.telegram.ui.ActionBar.u1) this.f3761b).K0) {
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
                wt wtVar = (wt) this.f3761b;
                int min = (int) Math.min(wtVar.f40163y1 / (wtVar.f40162x1 / size), org.telegram.messenger.g0.f22563q.y / 2);
                if (wtVar.A1) {
                    i11 = 22;
                } else {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 84) + min + 1, 1073741824));
                return;
            case 18:
                hx hxVar = (hx) this.f3761b;
                if (((View) hxVar.F.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - hxVar.F.getY());
                } else {
                    L = org.telegram.messenger.g0.L(120.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L - hxVar.F.f34411b1, 1073741824));
                return;
            case 19:
                hy hyVar = ((cy) this.f3761b).Q;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.camera.q.y(8.0f, hyVar.D0.getMeasuredHeight() - hyVar.f34411b1, 3) * 1.7f), 1073741824));
                return;
            case 25:
                ct0 ct0Var = (ct0) this.f3761b;
                q1 q1Var = ct0Var.f32753i1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f22557m;
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
                    ct0Var.n1 = true;
                    q1Var.setPadding(0, i12, 0, org.telegram.messenger.g0.L(8.0f));
                    ct0Var.n1 = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 28:
                pw0 pw0Var = (pw0) this.f3761b;
                int i16 = pw0Var.f37113n;
                if (pw0Var.h == 0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(6.66f);
                }
                int i17 = pw0Var.f37113n;
                if (pw0Var.h == 0) {
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
        switch (this.f3760a) {
            case 23:
                super.onSizeChanged(i7, i10, i11, i12);
                kk0 kk0Var = (kk0) this.f3761b;
                ih.d.c(kk0Var.h, kk0Var.f35367s);
                ViewGroup viewGroup = kk0Var.D;
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
        switch (this.f3760a) {
            case 25:
                if (!((ct0) this.f3761b).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f3760a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((lh.f) this.f3761b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f3760a) {
            case 22:
                qj0 qj0Var = (qj0) this.f3761b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(qj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(qj0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, qj0Var.f37359b1.getMeasuredWidth(), qj0Var.f37359b1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 25:
                if (!((ct0) this.f3761b).n1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((zv0) this.f3761b).X1) {
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
        switch (this.f3760a) {
            case 29:
                super.setPressed(z9);
                ((org.telegram.ui.Components.ic) this.f3761b).c(z9);
                return;
            default:
                super.setPressed(z9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f3760a) {
            case 0:
                super.setTranslationY(f10);
                k7 k7Var = (k7) this.f3761b;
                j5 j5Var = k7Var.W1;
                if (j5Var != null && j5Var.getVisibility() == 0) {
                    k7Var.W1.invalidate();
                    return;
                }
                return;
            case 4:
                fi.va vaVar = (fi.va) this.f3761b;
                if (getTranslationY() != f10 && vaVar.f12944c1 != null) {
                    super.setTranslationY(f10);
                    vaVar.f12944c1.y();
                    return;
                }
                return;
            case 10:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f3761b;
                FrameLayout frameLayout = v2Var.E;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(v2Var.f28627c.getHeight() - v2Var.f28624b.getY())) + v2Var.f28653s0);
                }
                v2Var.g0(f10);
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
        switch (this.f3760a) {
            case 20:
                super.setVisibility(i7);
                ((q10) this.f3761b).d.setVisibility(i7);
                return;
            case 28:
                pw0 pw0Var = (pw0) this.f3761b;
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
                    if (pw0Var.f37109e != null) {
                        for (int i10 = 0; i10 < pw0Var.f37109e.getChildCount(); i10++) {
                            if (z10) {
                                ow0 ow0Var = (ow0) pw0Var.f37109e.getChildAt(i10);
                                Drawable drawable = ow0Var.f36817b;
                                if (drawable instanceof org.telegram.ui.Components.i5) {
                                    ((org.telegram.ui.Components.i5) drawable).a(ow0Var);
                                }
                                ow0Var.f36818c = true;
                            } else {
                                ow0 ow0Var2 = (ow0) pw0Var.f37109e.getChildAt(i10);
                                Drawable drawable2 = ow0Var2.f36817b;
                                if (drawable2 instanceof org.telegram.ui.Components.i5) {
                                    ((org.telegram.ui.Components.i5) drawable2).n(ow0Var2);
                                }
                                ow0Var2.f36818c = false;
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
        this.f3760a = i7;
    }

    public e5(Context context, int i7) {
        super(context);
        this.f3760a = i7;
        switch (i7) {
            case 29:
                super(context);
                this.f3761b = new org.telegram.ui.Components.ic(this);
                return;
            default:
                lh.f fVar = new lh.f(context);
                this.f3761b = fVar;
                addView(fVar, c8.ha.g());
                return;
        }
    }

    public e5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f3760a = 16;
        this.f3761b = new zn[2];
        int i7 = 0;
        while (true) {
            zn[] znVarArr = (zn[]) this.f3761b;
            if (i7 < znVarArr.length) {
                znVarArr[i7] = new zn(context, g6Var);
                addView(((zn[]) this.f3761b)[i7], c8.ha.e(-1, -1, 119));
                i7++;
            } else {
                znVarArr[0].setVisibility(0);
                ((zn[]) this.f3761b)[1].setVisibility(8);
                return;
            }
        }
    }

    public e5(Context context, String str, di.b bVar) {
        super(context);
        this.f3760a = 3;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.l6.f27973j5;
        Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i7, bVar)));
        org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.06f, i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(this, d02, K, null, bVar);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f3761b = j6Var;
        j6Var.b(0.6f, 450L, xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.s6.Y(j6Var, i7, bVar);
        j6Var.setScaleProperty(0.7f);
        j6Var.setGravity(17);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setAllowCancel(true);
        f10.addView(j6Var, c8.ha.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.s6.U(textView, i7, bVar);
        textView.setGravity(17);
        f10.addView(textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public e5(ch.o oVar, Context context) {
        super(context);
        this.f3760a = 2;
        this.f3761b = oVar;
        setWillNotDraw(false);
    }

    public e5(jt0 jt0Var, Context context) {
        super(context);
        this.f3760a = 26;
        this.f3761b = jt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }
}
