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
public final class ne6 extends FrameLayout {
    public final byte a;
    public final Object b;

    public ne6(fja fjaVar, Context context) {
        super(context);
        this.a = (byte) 23;
        this.b = fjaVar;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        Canvas canvas2;
        rc2 rc2Var;
        in5 in5Var;
        ImageReceiver imageReceiver;
        float f2;
        float max;
        byte b = this.a;
        float f3 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 1:
                bj6 bj6Var = (bj6) obj;
                int i = cmb.Z6;
                int themedColor = bj6Var.getThemedColor(i);
                int i2 = cmb.c6;
                int themedColor2 = bj6Var.getThemedColor(i2);
                igc igcVar = bj6Var.c;
                if (igcVar != null) {
                    f = igcVar.p(0);
                } else {
                    f = 1.0f;
                }
                int f4 = on2.f(f, themedColor, themedColor2);
                int i3 = bj6Var.M;
                if (i3 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i3, getHeight(), cmb.l0(f4));
                }
                if (bj6Var.N != 0) {
                    canvas.drawRect(getWidth() - bj6Var.N, 0.0f, getWidth(), getHeight(), cmb.l0(f4));
                }
                super.dispatchDraw(canvas);
                bj6Var.c0();
                kz4 kz4Var = bj6Var.R;
                int themedColor3 = bj6Var.getThemedColor(i);
                int themedColor4 = bj6Var.getThemedColor(i2);
                igc igcVar2 = bj6Var.c;
                if (igcVar2 != null) {
                    f3 = igcVar2.p(0);
                }
                kz4Var.a(on2.f(f3, themedColor3, themedColor4));
                yi6 yi6Var = bj6Var.H;
                if (yi6Var != null) {
                    yi6Var.invalidate();
                    return;
                }
                return;
            case 16:
                vs9 vs9Var = (vs9) obj;
                if (vs9Var.r > 0.0f && vs9Var.e != null) {
                    vs9Var.f.reset();
                    float width = getWidth() / vs9Var.c.getWidth();
                    vs9Var.f.postScale(width, width);
                    vs9Var.d.setLocalMatrix(vs9Var.f);
                    vs9Var.e.setAlpha((int) (vs9Var.r * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), vs9Var.e);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas);
                Drawable drawable = vs9Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (vs9Var.r * 255.0f));
                    canvas2.save();
                    float f5 = vs9Var.I;
                    float f6 = vs9Var.H;
                    float f7 = vs9Var.r;
                    canvas2.translate((f6 * f7) + f5, (0.0f * f7) + vs9Var.J);
                    float R1 = gm.R1(gm.R1(Math.min(vs9Var.K, vs9Var.L), Math.max(vs9Var.K, vs9Var.L), 0.75f), 1.0f, vs9Var.r);
                    canvas2.scale(R1, R1, ((vs9Var.F.getBounds().width() / 2.0f) * vs9Var.K) + (-vs9Var.I) + vs9Var.F.getBounds().left, ((vs9Var.F.getBounds().height() / 2.0f) * vs9Var.L) + (-vs9Var.J) + vs9Var.F.getBounds().top);
                    im0 im0Var = vs9Var.G;
                    if (im0Var != null) {
                        im0Var.setAlpha((int) (vs9Var.r * 255.0f));
                        vs9Var.G.draw(canvas2);
                    }
                    vs9Var.F.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            case 18:
                tw9 tw9Var = (tw9) obj;
                if (tw9Var.s > 0.0f && tw9Var.n != null) {
                    tw9Var.r.reset();
                    float width2 = getWidth() / tw9Var.f.getWidth();
                    tw9Var.r.postScale(width2, width2);
                    tw9Var.h.setLocalMatrix(tw9Var.r);
                    tw9Var.n.setAlpha((int) (tw9Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), tw9Var.n);
                }
                if (tw9Var.X && (rc2Var = tw9Var.P) != null) {
                    rc2Var.setVisibility(4);
                    tw9Var.X = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 19:
                Canvas canvas3 = canvas;
                ly9 ly9Var = (ly9) obj;
                ImageReceiver imageReceiver2 = ly9Var.b;
                Rect rect = ly9Var.e;
                vz9 vz9Var = ly9Var.Q;
                fz9 fz9Var = ly9Var.a;
                if (ly9Var.n != null && ly9Var.r != null) {
                    canvas3.save();
                    canvas3.scale(12.0f, 12.0f);
                    ly9Var.r.setAlpha((int) (ly9Var.J * 255.0f));
                    canvas3.drawBitmap(ly9Var.n, 0.0f, 0.0f, ly9Var.r);
                    canvas3.restore();
                }
                super.dispatchDraw(canvas);
                if (fz9Var != null) {
                    Drawable drawable2 = fz9Var.F;
                    if (drawable2 != null) {
                        if (ly9Var.y) {
                            f2 = 2.0f;
                            drawable2.setColorFilter(new PorterDuffColorFilter(on2.f(ly9Var.J, vz9Var.o1, vz9Var.g1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            f2 = 2.0f;
                            drawable2.setColorFilter(vz9Var.l1);
                        }
                        drawable2.setAlpha((int) ((1.0f - ly9Var.J) * 255.0f));
                        RectF rectF = gm.P;
                        rectF.set(rect);
                        float f8 = fz9Var.O;
                        if (f8 == 0.0f && fz9Var.T <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(fz9Var.T * 0.8f, f8)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = gm.Q;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / f2) * max)), (int) (rectF.centerY() - ((rectF.height() / f2) * max)), (int) (((rectF.width() / f2) * max) + rectF.centerX()), (int) (((rectF.height() / f2) * max) + rectF.centerY()));
                        float f9 = 1.0f - ((1.0f - ly9Var.J) * (1.0f - fz9Var.P));
                        canvas3.save();
                        if (f9 < 1.0f) {
                            canvas3.translate(rect2.left, rect2.top);
                            canvas3.scale(1.0f, f9, 0.0f, 0.0f);
                            canvas3.skew((1.0f - f9) * (1.0f - ((fz9Var.Q * f2) / 8.0f)), 0.0f);
                            canvas3.translate(-rect2.left, -rect2.top);
                        }
                        canvas3.clipRect(0.0f, 0.0f, getWidth(), (ly9Var.J * gm.L(45.0f)) + ly9Var.G);
                        drawable2.setBounds(rect2);
                        drawable2.draw(canvas3);
                        canvas3.restore();
                        int i4 = fz9Var.Q;
                        if (i4 == 0) {
                            rect2.offset(gm.L(f9 * 8.0f), 0);
                        } else if (i4 == 1) {
                            rect2.offset(gm.L(f9 * 4.0f), 0);
                        } else if (i4 == 6) {
                            rect2.offset(-gm.L(f9 * (-4.0f)), 0);
                        } else if (i4 == 7) {
                            rect2.offset(gm.L(f9 * (-8.0f)), 0);
                        }
                        in5Var = null;
                        canvas3.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - ly9Var.J) * 255.0f), 31);
                        canvas3 = canvas3;
                        canvas3.clipRect(rect2);
                        canvas3.translate((int) (vz9Var.b0.getX() + vz9Var.p0.getX() + ly9Var.E), vz9Var.b0.getY() + ((int) vz9Var.p0.getY()) + ly9Var.F);
                        vz9Var.p0.draw(canvas3);
                        canvas3.restore();
                    } else {
                        in5Var = null;
                        if (fz9Var.s && (imageReceiver = fz9Var.h) != null) {
                            imageReceiver.setAlpha(1.0f - ly9Var.J);
                            fz9Var.h.j0(rect);
                            fz9Var.h.h(canvas3, null);
                        }
                    }
                } else {
                    in5Var = null;
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(ly9Var.J);
                    imageReceiver2.j0(rect);
                    imageReceiver2.h(canvas3, in5Var);
                    return;
                }
                return;
            case 28:
                n6b n6bVar = (n6b) obj;
                if (n6bVar.E > 0.0f && n6bVar.s != null) {
                    n6bVar.w.reset();
                    float width3 = getWidth() / n6bVar.n.getWidth();
                    n6bVar.w.postScale(width3, width3);
                    n6bVar.r.setLocalMatrix(n6bVar.w);
                    n6bVar.s.setAlpha((int) (n6bVar.E * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), n6bVar.s);
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
                hy1 hy1Var = (hy1) this.b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && hy1Var.isShowing()) {
                    hy1Var.dismiss();
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
                    ((vs9) obj).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 18:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tw9) obj).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 28:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((n6b) obj).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iga[] igaVarArr;
        iga igaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                cm6 cm6Var = (cm6) obj;
                bm6 bm6Var = cm6Var.S;
                if (bm6Var != null && (igaVar = (igaVarArr = bm6Var.n0)[0]) != null && igaVar.h.getFastScroll() != null && igaVarArr[0].h.getFastScroll().n) {
                    return cm6Var.S.I(motionEvent);
                }
                bm6 bm6Var2 = cm6Var.S;
                if (bm6Var2 != null && bm6Var2.A(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 23:
                fja fjaVar = (fja) obj;
                if (motionEvent.getActionMasked() == 0 && (fjaVar.e0 || motionEvent.getY() >= fjaVar.b0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 25:
                if (((nxa) obj).u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne6.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onAttachedToWindow() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                super.onAttachedToWindow();
                gm.d3(((ak6) obj).r0, 500L);
                return;
            case 19:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((ly9) obj).b;
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
                gm.r(((ak6) obj).r0);
                return;
            case 19:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((ly9) obj).b;
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
        ne6 ne6Var;
        ao6 ao6Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                g88 g88Var = (g88) obj;
                Rect rect = g88Var.G0;
                Rect rect2 = g88Var.F0;
                Paint paint = g88Var.H0;
                xka xkaVar = g88Var.x0;
                Bitmap bitmap = g88Var.C0;
                if (g88Var.B0 != null) {
                    canvas.save();
                    float d = g88Var.w0.d(g88Var.v0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, xkaVar.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, td4.z(1.0f, d, d * 4.0f, 0.25f));
                    float d2 = g88Var.A0.d(g88Var.z0);
                    if (!g88Var.z0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(ne6Var.getWidth() / 2.0f, ne6Var.getHeight() / 2.0f);
                            canvas.rotate(g88Var.y0);
                            float max = Math.max(xkaVar.a / bitmap.getWidth(), xkaVar.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (g88Var.I0 != null) {
                                canvas.rotate(-g88Var.getOrientation());
                                int contentWidth = g88Var.getContentWidth();
                                int contentHeight = g88Var.getContentHeight();
                                if (((g88Var.getOrientation() + g88Var.I0.k) / 90) % 2 == 1) {
                                    contentWidth = g88Var.getContentHeight();
                                    contentHeight = g88Var.getContentWidth();
                                }
                                ao6 ao6Var2 = g88Var.I0;
                                float f = ao6Var2.e;
                                float f2 = ao6Var2.f;
                                float f3 = contentWidth;
                                float f4 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f) / 2.0f, ((-contentHeight) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
                                float f5 = g88Var.I0.c;
                                canvas.scale(f5, f5);
                                ao6 ao6Var3 = g88Var.I0;
                                canvas.translate(ao6Var3.a * f3, ao6Var3.b * f4);
                                canvas.rotate(g88Var.I0.d + ao6Var.k);
                                if (g88Var.I0.l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(g88Var.getOrientation());
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
                mia miaVar = (mia) obj;
                Drawable drawable = miaVar.n1;
                drawable.setBounds(0, miaVar.p1 - miaVar.t0, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 26:
                z1b z1bVar = (z1b) obj;
                ImageReceiver imageReceiver = z1bVar.z0;
                xka xkaVar2 = z1bVar.x0;
                if (z1bVar.y0 != null) {
                    canvas.save();
                    float d3 = z1bVar.w0.d(z1bVar.v0);
                    canvas.scale(1.0f - (d3 * 2.0f), 1.0f, xkaVar2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, td4.z(1.0f, d3, 4.0f * d3, 0.25f));
                    imageReceiver.i0(0.0f, 0.0f, (int) xkaVar2.a, (int) xkaVar2.b);
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
                accessibilityNodeInfo.setText(jb6.G(((j68) obj).b.size(), "AccDescrSendPhotos", new Object[0]));
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
                accessibilityNodeInfo.setText(jb6.G(((w78) obj).b.size(), "AccDescrSendPhotos", new Object[0]));
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
                mia miaVar = (mia) obj;
                if (motionEvent.getAction() == 0 && miaVar.p1 != 0 && motionEvent.getY() < miaVar.p1) {
                    miaVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        kla[] klaVarArr;
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
                mh6 mh6Var = (mh6) obj;
                for (kla klaVar : mh6Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) klaVar.getLayoutParams();
                    int L2 = gm.L(16.0f) + getHeight();
                    if (!klaVar.a() && mh6Var.c.getVisibility() == 0) {
                        L2 += gm.L(230.0f);
                    }
                    klaVar.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                bj6 bj6Var = (bj6) obj;
                bj6Var.h0();
                bj6Var.g0();
                bj6Var.e0();
                return;
            case 16:
                super.onLayout(z, i, i2, i3, i4);
                vs9 vs9Var = (vs9) obj;
                ne6 ne6Var = vs9Var.s;
                ela elaVar = vs9Var.w;
                Drawable drawable = vs9Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (vs9Var.y != null) {
                        float f2 = vs9Var.I;
                        float f3 = bounds.left + f2;
                        float f4 = bounds.right + f2;
                        float f5 = vs9Var.J;
                        float f6 = bounds.top + f5;
                        float f7 = bounds.bottom + f5;
                        if (!vs9Var.M) {
                            int i7 = ((f4 - frameLayout.getMeasuredWidth()) > gm.L(8.0f) ? 1 : ((f4 - frameLayout.getMeasuredWidth()) == gm.L(8.0f) ? 0 : -1));
                            ViewGroup viewGroup = vs9Var.E;
                            if (i7 < 0) {
                                viewGroup.setPivotX(gm.L(6.0f));
                                vs9Var.y.setX(Math.min(elaVar.getWidth() - vs9Var.y.getWidth(), f3 - gm.L(10.0f)) - elaVar.getX());
                                z2 = false;
                                f = 16.0f;
                            } else {
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - gm.L(6.0f));
                                f = 16.0f;
                                vs9Var.y.setX(Math.max(gm.L(8.0f), (gm.L(4.0f) + f4) - vs9Var.y.getMeasuredWidth()) - elaVar.getX());
                                z2 = true;
                            }
                            float x = vs9Var.y.getX();
                            if (z2) {
                                L = ((x + vs9Var.y.getWidth()) - gm.L(6.0f)) - f4;
                            } else {
                                L = (x + gm.L(10.0f)) - f3;
                            }
                            vs9Var.H = L;
                        } else {
                            f = 16.0f;
                            z2 = false;
                        }
                        if (vs9Var.G != null) {
                            i5 = gm.L(21.0f);
                        } else {
                            i5 = 0;
                        }
                        float f8 = f7 + i5;
                        int i8 = ((vs9Var.y.getMeasuredHeight() + f8) > (ne6Var.getMeasuredHeight() - gm.L(f)) ? 1 : ((vs9Var.y.getMeasuredHeight() + f8) == (ne6Var.getMeasuredHeight() - gm.L(f)) ? 0 : -1));
                        ViewGroup viewGroup2 = vs9Var.E;
                        if (i8 > 0) {
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - gm.L(6.0f));
                            vs9Var.y.setY(((f6 - gm.L(4.0f)) - vs9Var.y.getMeasuredHeight()) - elaVar.getY());
                            z3 = true;
                        } else {
                            viewGroup2.setPivotY(gm.L(6.0f));
                            vs9Var.y.setY(Math.min((ne6Var.getHeight() - vs9Var.y.getMeasuredHeight()) - gm.L(f), f8) - elaVar.getY());
                        }
                        bu5 bu5Var = vs9Var.x;
                        bu5Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bu5Var.D;
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
                su suVar = secretMediaViewer.e;
                suVar.layout(i6, 0, suVar.getMeasuredWidth() + i6, secretMediaViewer.e.getMeasuredHeight());
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
                ((tw9) obj).d();
                return;
            case 19:
                super.onLayout(z, i, i2, i3, i4);
                ly9 ly9Var = (ly9) obj;
                Context context = ly9Var.getContext();
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
                    Bitmap bitmap = ly9Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || ly9Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        ly9Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                super.onLayout(z, i, i2, i3, i4);
                ((mia) obj).E0();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        kla[] klaVarArr;
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
                mh6 mh6Var = (mh6) obj;
                for (kla klaVar : mh6Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) klaVar.getLayoutParams();
                    int L = gm.L(16.0f) + (measuredHeight2 - marginLayoutParams.topMargin);
                    if (!klaVar.a() && mh6Var.c.getVisibility() == 0) {
                        L += gm.L(230.0f);
                    }
                    klaVar.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 4:
                d38 d38Var = (d38) obj;
                FrameLayout frameLayout = d38Var.M;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = a.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) d38Var.M.getLayoutParams()).topMargin = gm.m;
                }
                super.onMeasure(i, i2);
                return;
            case 11:
                kj8 kj8Var = (kj8) obj;
                if (kj8Var.K0) {
                    kj8Var.t1 = View.MeasureSpec.getSize(i);
                } else {
                    kj8Var.t1 = (int) (Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) * 0.8f);
                }
                super.onMeasure(i, i2);
                return;
            case 12:
                super.onMeasure(i, i2);
                yj8 yj8Var = (yj8) ((ny0) obj).d;
                w94 w94Var = yj8Var.m2;
                if (w94Var != null) {
                    top = w94Var.getTop();
                    measuredHeight = yj8Var.m2.getMeasuredHeight();
                } else {
                    View view = yj8Var.w2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = yj8Var.w2.getMeasuredHeight();
                    } else {
                        f = 0.0f;
                        yj8Var.l2.setTranslationY(f - (ubVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f = (measuredHeight / 2.0f) + top;
                yj8Var.l2.setTranslationY(f - (ubVar.getMeasuredHeight() / 2.0f));
                return;
            case 14:
                super.onMeasure(i, i2);
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj).U3();
                return;
            case 17:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                WindowInsets windowInsets = secretMediaViewer.f0;
                if (windowInsets != null) {
                    if (gm.y) {
                        int i4 = gm.q.y;
                        if (size2 > i4) {
                            size2 = i4;
                        }
                        size2 += gm.m;
                    }
                    size2 -= windowInsets.getSystemWindowInsetBottom();
                    size -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i5 = gm.q.y;
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
                mia miaVar = (mia) obj;
                pu9 pu9Var = miaVar.l1;
                int size3 = View.MeasureSpec.getSize(i2) - gm.m;
                getMeasuredWidth();
                int y = hg9.y(54.0f, dd6.g(), hg9.v(56.0f, gm.L(56.0f), 1));
                int i6 = size3 / 5;
                if (y < i6 * 3) {
                    i3 = gm.L(8.0f);
                } else {
                    i3 = i6 << 1;
                    if (y < size3) {
                        i3 -= size3 - y;
                    }
                }
                if (pu9Var.getPaddingTop() != i3) {
                    miaVar.q1 = true;
                    pu9Var.setPadding(0, i3, 0, gm.L(8.0f));
                    miaVar.q1 = false;
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
                vs9 vs9Var = (vs9) this.b;
                tl0.c(vs9Var.h, vs9Var.s);
                ViewGroup viewGroup = vs9Var.E;
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
                ((cic) obj).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 22:
                if (((mia) obj).J || !super.onTouchEvent(motionEvent)) {
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
                r59 r59Var = (r59) obj;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(r59Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r59Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, r59Var.c1.getMeasuredWidth(), r59Var.c1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                if (!((mia) obj).q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 27:
                if (!((x2b) obj).a2) {
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
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj).U3();
                return;
            case 21:
                super.setScaleX(f);
                ((daa) obj).p0();
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
                Drawable[] drawableArr = PhotoViewer.d9;
                ((PhotoViewer) obj).H0();
                return;
            case 24:
                super.setTranslationY(f);
                hra hraVar = ((wsa) obj).Z1;
                if (hraVar != null && hraVar.getVisibility() == 0) {
                    hraVar.invalidate();
                    return;
                }
                return;
            case 29:
                v9b v9bVar = (v9b) obj;
                if (getTranslationY() != f && v9bVar.d1 != null) {
                    super.setTranslationY(f);
                    v9bVar.d1.y();
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public ne6(z1b z1bVar, Context context) {
        super(context);
        this.a = (byte) 26;
        this.b = z1bVar;
        setWillNotDraw(false);
    }

    public ne6(g88 g88Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.b = g88Var;
        setWillNotDraw(false);
    }

    public ne6(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
