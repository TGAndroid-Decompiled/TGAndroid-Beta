package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
public final class oc6 extends FrameLayout {
    public final byte a;
    public final Object b;

    public oc6(dha dhaVar, Context context) {
        super(context);
        this.a = (byte) 23;
        this.b = dhaVar;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        Canvas canvas2;
        gb2 gb2Var;
        il5 il5Var;
        ImageReceiver imageReceiver;
        float f2;
        float max;
        byte b = this.a;
        float f3 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 1:
                ah6 ah6Var = (ah6) obj;
                int i = bkb.Z6;
                int themedColor = ah6Var.getThemedColor(i);
                int i2 = bkb.c6;
                int themedColor2 = ah6Var.getThemedColor(i2);
                iec iecVar = ah6Var.c;
                if (iecVar != null) {
                    f = iecVar.q(0);
                } else {
                    f = 1.0f;
                }
                int f4 = bm2.f(f, themedColor, themedColor2);
                int i3 = ah6Var.N;
                if (i3 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i3, getHeight(), bkb.l0(f4));
                }
                if (ah6Var.O != 0) {
                    canvas.drawRect(getWidth() - ah6Var.O, 0.0f, getWidth(), getHeight(), bkb.l0(f4));
                }
                super.dispatchDraw(canvas);
                ah6Var.c0();
                ix4 ix4Var = ah6Var.S;
                int themedColor3 = ah6Var.getThemedColor(i);
                int themedColor4 = ah6Var.getThemedColor(i2);
                iec iecVar2 = ah6Var.c;
                if (iecVar2 != null) {
                    f3 = iecVar2.q(0);
                }
                ix4Var.a(bm2.f(f3, themedColor3, themedColor4));
                xg6 xg6Var = ah6Var.I;
                if (xg6Var != null) {
                    xg6Var.invalidate();
                    return;
                }
                return;
            case 16:
                tq9 tq9Var = (tq9) obj;
                if (tq9Var.r > 0.0f && tq9Var.e != null) {
                    tq9Var.f.reset();
                    float width = getWidth() / tq9Var.c.getWidth();
                    tq9Var.f.postScale(width, width);
                    tq9Var.d.setLocalMatrix(tq9Var.f);
                    tq9Var.e.setAlpha((int) (tq9Var.r * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), tq9Var.e);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas);
                Drawable drawable = tq9Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (tq9Var.r * 255.0f));
                    canvas2.save();
                    float f5 = tq9Var.I;
                    float f6 = tq9Var.H;
                    float f7 = tq9Var.r;
                    canvas2.translate((f6 * f7) + f5, (0.0f * f7) + tq9Var.J);
                    float R1 = gl.R1(gl.R1(Math.min(tq9Var.K, tq9Var.L), Math.max(tq9Var.K, tq9Var.L), 0.75f), 1.0f, tq9Var.r);
                    canvas2.scale(R1, R1, ((tq9Var.F.getBounds().width() / 2.0f) * tq9Var.K) + (-tq9Var.I) + tq9Var.F.getBounds().left, ((tq9Var.F.getBounds().height() / 2.0f) * tq9Var.L) + (-tq9Var.J) + tq9Var.F.getBounds().top);
                    il0 il0Var = tq9Var.G;
                    if (il0Var != null) {
                        il0Var.setAlpha((int) (tq9Var.r * 255.0f));
                        tq9Var.G.draw(canvas2);
                    }
                    tq9Var.F.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            case 18:
                qu9 qu9Var = (qu9) obj;
                if (qu9Var.s > 0.0f && qu9Var.n != null) {
                    qu9Var.r.reset();
                    float width2 = getWidth() / qu9Var.f.getWidth();
                    qu9Var.r.postScale(width2, width2);
                    qu9Var.h.setLocalMatrix(qu9Var.r);
                    qu9Var.n.setAlpha((int) (qu9Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), qu9Var.n);
                }
                if (qu9Var.X && (gb2Var = qu9Var.P) != null) {
                    gb2Var.setVisibility(4);
                    qu9Var.X = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 19:
                Canvas canvas3 = canvas;
                jw9 jw9Var = (jw9) obj;
                ImageReceiver imageReceiver2 = jw9Var.b;
                Rect rect = jw9Var.e;
                tx9 tx9Var = jw9Var.Q;
                dx9 dx9Var = jw9Var.a;
                if (jw9Var.n != null && jw9Var.r != null) {
                    canvas3.save();
                    canvas3.scale(12.0f, 12.0f);
                    jw9Var.r.setAlpha((int) (jw9Var.J * 255.0f));
                    canvas3.drawBitmap(jw9Var.n, 0.0f, 0.0f, jw9Var.r);
                    canvas3.restore();
                }
                super.dispatchDraw(canvas);
                if (dx9Var != null) {
                    Drawable drawable2 = dx9Var.F;
                    if (drawable2 != null) {
                        if (jw9Var.y) {
                            f2 = 2.0f;
                            drawable2.setColorFilter(new PorterDuffColorFilter(bm2.f(jw9Var.J, tx9Var.o1, tx9Var.g1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            f2 = 2.0f;
                            drawable2.setColorFilter(tx9Var.l1);
                        }
                        drawable2.setAlpha((int) ((1.0f - jw9Var.J) * 255.0f));
                        RectF rectF = gl.P;
                        rectF.set(rect);
                        float f8 = dx9Var.O;
                        if (f8 == 0.0f && dx9Var.T <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(dx9Var.T * 0.8f, f8)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = gl.Q;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / f2) * max)), (int) (rectF.centerY() - ((rectF.height() / f2) * max)), (int) (((rectF.width() / f2) * max) + rectF.centerX()), (int) (((rectF.height() / f2) * max) + rectF.centerY()));
                        float f9 = 1.0f - ((1.0f - jw9Var.J) * (1.0f - dx9Var.P));
                        canvas3.save();
                        if (f9 < 1.0f) {
                            canvas3.translate(rect2.left, rect2.top);
                            canvas3.scale(1.0f, f9, 0.0f, 0.0f);
                            canvas3.skew((1.0f - f9) * (1.0f - ((dx9Var.Q * f2) / 8.0f)), 0.0f);
                            canvas3.translate(-rect2.left, -rect2.top);
                        }
                        canvas3.clipRect(0.0f, 0.0f, getWidth(), (jw9Var.J * gl.L(45.0f)) + jw9Var.G);
                        drawable2.setBounds(rect2);
                        drawable2.draw(canvas3);
                        canvas3.restore();
                        int i4 = dx9Var.Q;
                        if (i4 == 0) {
                            rect2.offset(gl.L(f9 * 8.0f), 0);
                        } else if (i4 == 1) {
                            rect2.offset(gl.L(f9 * 4.0f), 0);
                        } else if (i4 == 6) {
                            rect2.offset(-gl.L(f9 * (-4.0f)), 0);
                        } else if (i4 == 7) {
                            rect2.offset(gl.L(f9 * (-8.0f)), 0);
                        }
                        il5Var = null;
                        canvas3.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - jw9Var.J) * 255.0f), 31);
                        canvas3 = canvas3;
                        canvas3.clipRect(rect2);
                        canvas3.translate((int) (tx9Var.b0.getX() + tx9Var.p0.getX() + jw9Var.E), tx9Var.b0.getY() + ((int) tx9Var.p0.getY()) + jw9Var.F);
                        tx9Var.p0.draw(canvas3);
                        canvas3.restore();
                    } else {
                        il5Var = null;
                        if (dx9Var.s && (imageReceiver = dx9Var.h) != null) {
                            imageReceiver.setAlpha(1.0f - jw9Var.J);
                            dx9Var.h.j0(rect);
                            dx9Var.h.h(canvas3, null);
                        }
                    }
                } else {
                    il5Var = null;
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(jw9Var.J);
                    imageReceiver2.j0(rect);
                    imageReceiver2.h(canvas3, il5Var);
                    return;
                }
                return;
            case 28:
                m4b m4bVar = (m4b) obj;
                if (m4bVar.E > 0.0f && m4bVar.s != null) {
                    m4bVar.w.reset();
                    float width3 = getWidth() / m4bVar.n.getWidth();
                    m4bVar.w.postScale(width3, width3);
                    m4bVar.r.setLocalMatrix(m4bVar.w);
                    m4bVar.s.setAlpha((int) (m4bVar.E * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), m4bVar.s);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 20:
                uw1 uw1Var = (uw1) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && uw1Var.isShowing()) {
                    uw1Var.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 16:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tq9) obj).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 18:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qu9) obj).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 28:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((m4b) obj).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iea[] ieaVarArr;
        iea ieaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                zj6 zj6Var = (zj6) obj;
                yj6 yj6Var = zj6Var.S;
                if (yj6Var != null && (ieaVar = (ieaVarArr = yj6Var.n0)[0]) != null && ieaVar.h.getFastScroll() != null && ieaVarArr[0].h.getFastScroll().n) {
                    return zj6Var.S.I(motionEvent);
                }
                yj6 yj6Var2 = zj6Var.S;
                if (yj6Var2 != null && yj6Var2.A(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 23:
                dha dhaVar = (dha) obj;
                if (motionEvent.getActionMasked() == 0 && (dhaVar.e0 || motionEvent.getY() >= dhaVar.b0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 25:
                if (((jva) obj).u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc6.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onAttachedToWindow() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                super.onAttachedToWindow();
                gl.e3(((yh6) obj).r0, 500L);
                return;
            case 19:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((jw9) obj).b;
                if (imageReceiver != null) {
                    imageReceiver.I();
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 19:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                super.onDetachedFromWindow();
                gl.r(((yh6) obj).r0);
                return;
            case 19:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((jw9) obj).b;
                if (imageReceiver != null) {
                    imageReceiver.K();
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        oc6 oc6Var;
        zl6 zl6Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                e68 e68Var = (e68) obj;
                Rect rect = e68Var.G0;
                Rect rect2 = e68Var.F0;
                Paint paint = e68Var.H0;
                via viaVar = e68Var.x0;
                Bitmap bitmap = e68Var.C0;
                if (e68Var.B0 != null) {
                    canvas.save();
                    float d = e68Var.w0.d(e68Var.v0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, viaVar.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, tb4.z(1.0f, d, d * 4.0f, 0.25f));
                    float d2 = e68Var.A0.d(e68Var.z0);
                    if (!e68Var.z0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(oc6Var.getWidth() / 2.0f, oc6Var.getHeight() / 2.0f);
                            canvas.rotate(e68Var.y0);
                            float max = Math.max(viaVar.a / bitmap.getWidth(), viaVar.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (e68Var.I0 != null) {
                                canvas.rotate(-e68Var.getOrientation());
                                int contentWidth = e68Var.getContentWidth();
                                int contentHeight = e68Var.getContentHeight();
                                if (((e68Var.getOrientation() + e68Var.I0.k) / 90) % 2 == 1) {
                                    contentWidth = e68Var.getContentHeight();
                                    contentHeight = e68Var.getContentWidth();
                                }
                                zl6 zl6Var2 = e68Var.I0;
                                float f = zl6Var2.e;
                                float f2 = zl6Var2.f;
                                float f3 = contentWidth;
                                float f4 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f) / 2.0f, ((-contentHeight) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
                                float f5 = e68Var.I0.c;
                                canvas.scale(f5, f5);
                                zl6 zl6Var3 = e68Var.I0;
                                canvas.translate(zl6Var3.a * f3, zl6Var3.b * f4);
                                canvas.rotate(e68Var.I0.d + zl6Var.k);
                                if (e68Var.I0.l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(e68Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 22:
                kga kgaVar = (kga) obj;
                Drawable drawable = kgaVar.n1;
                drawable.setBounds(0, kgaVar.p1 - kgaVar.t0, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 26:
                yza yzaVar = (yza) obj;
                ImageReceiver imageReceiver = yzaVar.z0;
                via viaVar2 = yzaVar.x0;
                if (yzaVar.y0 != null) {
                    canvas.save();
                    float d3 = yzaVar.w0.d(yzaVar.v0);
                    canvas.scale(1.0f - (d3 * 2.0f), 1.0f, viaVar2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, tb4.z(1.0f, d3, 4.0f * d3, 0.25f));
                    imageReceiver.i0(0.0f, 0.0f, (int) viaVar2.a, (int) viaVar2.b);
                    imageReceiver.h(canvas, null);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(k96.G(((g48) obj).b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 6:
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
            case 7:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(k96.G(((u58) obj).b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                if (((PopupNotificationActivity) obj).c() || ((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return true;
                }
                return false;
            case 22:
                kga kgaVar = (kga) obj;
                if (motionEvent.getAction() == 0 && kgaVar.p1 != 0 && motionEvent.getY() < kgaVar.p1) {
                    kgaVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jja[] jjaVarArr;
        FrameLayout frameLayout;
        float f;
        boolean z2;
        int i5;
        float L;
        int i6;
        Activity activity;
        byte b = this.a;
        boolean z3 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                mf6 mf6Var = (mf6) obj;
                for (jja jjaVar : mf6Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jjaVar.getLayoutParams();
                    int L2 = gl.L(16.0f) + getHeight();
                    if (!jjaVar.a() && mf6Var.c.getVisibility() == 0) {
                        L2 += gl.L(230.0f);
                    }
                    jjaVar.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                ah6 ah6Var = (ah6) obj;
                ah6Var.i0();
                ah6Var.h0();
                ah6Var.e0();
                return;
            case 16:
                super.onLayout(z, i, i2, i3, i4);
                tq9 tq9Var = (tq9) obj;
                oc6 oc6Var = tq9Var.s;
                cja cjaVar = tq9Var.w;
                Drawable drawable = tq9Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (tq9Var.y != null) {
                        float f2 = tq9Var.I;
                        float f3 = bounds.left + f2;
                        float f4 = bounds.right + f2;
                        float f5 = tq9Var.J;
                        float f6 = bounds.top + f5;
                        float f7 = bounds.bottom + f5;
                        if (!tq9Var.M) {
                            int i7 = ((f4 - frameLayout.getMeasuredWidth()) > gl.L(8.0f) ? 1 : ((f4 - frameLayout.getMeasuredWidth()) == gl.L(8.0f) ? 0 : -1));
                            ViewGroup viewGroup = tq9Var.E;
                            if (i7 < 0) {
                                viewGroup.setPivotX(gl.L(6.0f));
                                tq9Var.y.setX(Math.min(cjaVar.getWidth() - tq9Var.y.getWidth(), f3 - gl.L(10.0f)) - cjaVar.getX());
                                z2 = false;
                                f = 16.0f;
                            } else {
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - gl.L(6.0f));
                                f = 16.0f;
                                tq9Var.y.setX(Math.max(gl.L(8.0f), (gl.L(4.0f) + f4) - tq9Var.y.getMeasuredWidth()) - cjaVar.getX());
                                z2 = true;
                            }
                            float x = tq9Var.y.getX();
                            if (z2) {
                                L = ((x + tq9Var.y.getWidth()) - gl.L(6.0f)) - f4;
                            } else {
                                L = (x + gl.L(10.0f)) - f3;
                            }
                            tq9Var.H = L;
                        } else {
                            f = 16.0f;
                            z2 = false;
                        }
                        if (tq9Var.G != null) {
                            i5 = gl.L(21.0f);
                        } else {
                            i5 = 0;
                        }
                        float f8 = f7 + i5;
                        int i8 = ((tq9Var.y.getMeasuredHeight() + f8) > (oc6Var.getMeasuredHeight() - gl.L(f)) ? 1 : ((tq9Var.y.getMeasuredHeight() + f8) == (oc6Var.getMeasuredHeight() - gl.L(f)) ? 0 : -1));
                        ViewGroup viewGroup2 = tq9Var.E;
                        if (i8 > 0) {
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - gl.L(6.0f));
                            tq9Var.y.setY(((f6 - gl.L(4.0f)) - tq9Var.y.getMeasuredHeight()) - cjaVar.getY());
                            z3 = true;
                        } else {
                            viewGroup2.setPivotY(gl.L(6.0f));
                            tq9Var.y.setY(Math.min((oc6Var.getHeight() - tq9Var.y.getMeasuredHeight()) - gl.L(f), f8) - cjaVar.getY());
                        }
                        cs5 cs5Var = tq9Var.x;
                        cs5Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = cs5Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z3;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                WindowInsets windowInsets = secretMediaViewer.f0;
                if (windowInsets != null) {
                    i6 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i6 = 0;
                }
                st stVar = secretMediaViewer.e;
                stVar.layout(i6, 0, stVar.getMeasuredWidth() + i6, secretMediaViewer.e.getMeasuredHeight());
                if (z) {
                    if (secretMediaViewer.J0 == null) {
                        secretMediaViewer.x0 = 1.0f;
                        secretMediaViewer.v0 = 0.0f;
                        secretMediaViewer.w0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.x0);
                    return;
                }
                return;
            case 18:
                super.onLayout(z, i, i2, i3, i4);
                ((qu9) obj).d();
                return;
            case 19:
                super.onLayout(z, i, i2, i3, i4);
                jw9 jw9Var = (jw9) obj;
                Context context = jw9Var.getContext();
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        activity = null;
                    }
                }
                if (activity != null) {
                    View decorView = activity.getWindow().getDecorView();
                    Bitmap bitmap = jw9Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || jw9Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        jw9Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                super.onLayout(z, i, i2, i3, i4);
                ((kga) obj).E0();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        jja[] jjaVarArr;
        float f;
        float top;
        int measuredHeight;
        ub ubVar;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                mf6 mf6Var = (mf6) obj;
                for (jja jjaVar : mf6Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jjaVar.getLayoutParams();
                    int L = gl.L(16.0f) + (measuredHeight2 - marginLayoutParams.topMargin);
                    if (!jjaVar.a() && mf6Var.c.getVisibility() == 0) {
                        L += gl.L(230.0f);
                    }
                    jjaVar.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 4:
                a18 a18Var = (a18) obj;
                FrameLayout frameLayout = a18Var.M;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = a.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) a18Var.M.getLayoutParams()).topMargin = gl.m;
                }
                super.onMeasure(i, i2);
                return;
            case 11:
                jh8 jh8Var = (jh8) obj;
                if (jh8Var.K0) {
                    jh8Var.t1 = View.MeasureSpec.getSize(i);
                } else {
                    jh8Var.t1 = (int) (Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) * 0.8f);
                }
                super.onMeasure(i, i2);
                return;
            case 12:
                super.onMeasure(i, i2);
                xh8 xh8Var = (xh8) ((gx0) obj).d;
                n84 n84Var = xh8Var.m2;
                if (n84Var != null) {
                    top = n84Var.getTop();
                    measuredHeight = xh8Var.m2.getMeasuredHeight();
                } else {
                    View view = xh8Var.w2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = xh8Var.w2.getMeasuredHeight();
                    } else {
                        f = 0.0f;
                        xh8Var.l2.setTranslationY(f - (ubVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f = (measuredHeight / 2.0f) + top;
                xh8Var.l2.setTranslationY(f - (ubVar.getMeasuredHeight() / 2.0f));
                return;
            case 14:
                super.onMeasure(i, i2);
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).Q3();
                return;
            case 17:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                WindowInsets windowInsets = secretMediaViewer.f0;
                if (windowInsets != null) {
                    if (gl.y) {
                        int i4 = gl.q.y;
                        if (size2 > i4) {
                            size2 = i4;
                        }
                        size2 += gl.m;
                    }
                    size2 -= windowInsets.getSystemWindowInsetBottom();
                    size -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i5 = gl.q.y;
                    if (size2 > i5) {
                        size2 = i5;
                    }
                }
                setMeasuredDimension(size, size2);
                WindowInsets windowInsets2 = secretMediaViewer.f0;
                if (windowInsets2 != null) {
                    size -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
            case 22:
                kga kgaVar = (kga) obj;
                ns9 ns9Var = kgaVar.l1;
                int size3 = View.MeasureSpec.getSize(i2) - gl.m;
                getMeasuredWidth();
                int y = de9.y(54.0f, eb6.g(), de9.w(56.0f, gl.L(56.0f), 1));
                int i6 = size3 / 5;
                if (y < i6 * 3) {
                    i3 = gl.L(8.0f);
                } else {
                    i3 = i6 << 1;
                    if (y < size3) {
                        i3 -= size3 - y;
                    }
                }
                if (ns9Var.getPaddingTop() != i3) {
                    kgaVar.q1 = true;
                    ns9Var.setPadding(0, i3, 0, gl.L(8.0f));
                    kgaVar.q1 = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(y, size3), 1073741824));
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
                tq9 tq9Var = (tq9) this.b;
                tk0.c(tq9Var.h, tq9Var.s);
                ViewGroup viewGroup = tq9Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                if (!((PopupNotificationActivity) obj).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            case 13:
                ((bgc) obj).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 22:
                if (((kga) obj).J || !super.onTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        switch (this.a) {
            case 10:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z);
                return;
            default:
                super.requestDisallowInterceptTouchEvent(z);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                o39 o39Var = (o39) obj;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(o39Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(o39Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, o39Var.c1.getMeasuredWidth(), o39Var.c1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                if (!((kga) obj).q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((u0b) obj).a2) {
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
    public final void setScaleX(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                super.setScaleX(f);
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).Q3();
                return;
            case 21:
                super.setScaleX(f);
                ((d8a) obj).o0();
                return;
            default:
                super.setScaleX(f);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 9:
                super.setTranslationY(f);
                Drawable[] drawableArr = PhotoViewer.f9;
                ((PhotoViewer) obj).G0();
                return;
            case 24:
                super.setTranslationY(f);
                hpa hpaVar = ((vqa) obj).Z1;
                if (hpaVar != null && hpaVar.getVisibility() == 0) {
                    hpaVar.invalidate();
                    return;
                }
                return;
            case 29:
                t7b t7bVar = (t7b) obj;
                if (getTranslationY() != f && t7bVar.d1 != null) {
                    super.setTranslationY(f);
                    t7bVar.d1.y();
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public oc6(yza yzaVar, Context context) {
        super(context);
        this.a = (byte) 26;
        this.b = yzaVar;
        setWillNotDraw(false);
    }

    public oc6(e68 e68Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.b = e68Var;
        setWillNotDraw(false);
    }

    public oc6(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
