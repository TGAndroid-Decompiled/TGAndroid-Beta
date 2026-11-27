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
import android.graphics.Typeface;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
public final class d26 extends FrameLayout {
    public final byte a;
    public final Object b;

    public d26(wka wkaVar, Context context) {
        super(context);
        this.a = (byte) 25;
        this.b = wkaVar;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                Typeface typeface = hl.a;
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    getChildAt(i).dispatchApplyWindowInsets(windowInsets);
                }
                return windowInsets;
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int[] iArr;
        float f;
        Canvas canvas2;
        wb2 wb2Var;
        ln5 ln5Var;
        ImageReceiver imageReceiver;
        float f2;
        float f3;
        float max;
        Canvas canvas3 = canvas;
        byte b = this.a;
        float f4 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                View view = launchActivity.F0;
                if (view != null && view.getBackground() != null) {
                    int[] iArr2 = launchActivity.y1;
                    if (iArr2 == null) {
                        iArr2 = new int[2];
                        launchActivity.y1 = iArr2;
                    }
                    launchActivity.F0.getLocationInWindow(iArr2);
                    int[] iArr3 = launchActivity.y1;
                    int i = iArr3[0];
                    int i2 = iArr3[1];
                    getLocationInWindow(iArr3);
                    int i3 = i2 - launchActivity.y1[1];
                    canvas3.save();
                    canvas3.translate(i - iArr[0], i3);
                    launchActivity.F0.getBackground().draw(canvas3);
                    canvas3.restore();
                    return;
                }
                return;
            case 2:
                fj6 fj6Var = (fj6) obj;
                int i4 = aob.a7;
                int themedColor = fj6Var.getThemedColor(i4);
                int i5 = aob.d6;
                int themedColor2 = fj6Var.getThemedColor(i5);
                hic hicVar = fj6Var.c;
                if (hicVar != null) {
                    f = hicVar.p(0);
                } else {
                    f = 1.0f;
                }
                int f5 = vm2.f(f, themedColor, themedColor2);
                int i6 = fj6Var.P;
                if (i6 != 0) {
                    canvas3.drawRect(0.0f, 0.0f, i6, getHeight(), aob.l0(f5));
                }
                if (fj6Var.Q != 0) {
                    canvas.drawRect(getWidth() - fj6Var.Q, 0.0f, getWidth(), getHeight(), aob.l0(f5));
                }
                super.dispatchDraw(canvas);
                fj6Var.c0();
                oz4 oz4Var = fj6Var.U;
                int themedColor3 = fj6Var.getThemedColor(i4);
                int themedColor4 = fj6Var.getThemedColor(i5);
                hic hicVar2 = fj6Var.c;
                if (hicVar2 != null) {
                    f4 = hicVar2.p(0);
                }
                oz4Var.a(vm2.f(f4, themedColor3, themedColor4));
                cj6 cj6Var = fj6Var.K;
                if (cj6Var != null) {
                    cj6Var.invalidate();
                    return;
                }
                return;
            case 18:
                mu9 mu9Var = (mu9) obj;
                if (mu9Var.r > 0.0f && mu9Var.e != null) {
                    mu9Var.f.reset();
                    float width = getWidth() / mu9Var.c.getWidth();
                    mu9Var.f.postScale(width, width);
                    mu9Var.d.setLocalMatrix(mu9Var.f);
                    mu9Var.e.setAlpha((int) (mu9Var.r * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mu9Var.e);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas);
                Drawable drawable = mu9Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (mu9Var.r * 255.0f));
                    canvas2.save();
                    float f6 = mu9Var.I;
                    float f7 = mu9Var.H;
                    float f8 = mu9Var.r;
                    canvas2.translate((f7 * f8) + f6, (0.0f * f8) + mu9Var.J);
                    float R1 = hl.R1(hl.R1(Math.min(mu9Var.K, mu9Var.L), Math.max(mu9Var.K, mu9Var.L), 0.75f), 1.0f, mu9Var.r);
                    canvas2.scale(R1, R1, ((mu9Var.F.getBounds().width() / 2.0f) * mu9Var.K) + (-mu9Var.I) + mu9Var.F.getBounds().left, ((mu9Var.F.getBounds().height() / 2.0f) * mu9Var.L) + (-mu9Var.J) + mu9Var.F.getBounds().top);
                    jl0 jl0Var = mu9Var.G;
                    if (jl0Var != null) {
                        jl0Var.setAlpha((int) (mu9Var.r * 255.0f));
                        mu9Var.G.draw(canvas2);
                    }
                    mu9Var.F.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            case 20:
                ky9 ky9Var = (ky9) obj;
                if (ky9Var.s > 0.0f && ky9Var.n != null) {
                    ky9Var.r.reset();
                    float width2 = getWidth() / ky9Var.f.getWidth();
                    ky9Var.r.postScale(width2, width2);
                    ky9Var.h.setLocalMatrix(ky9Var.r);
                    ky9Var.n.setAlpha((int) (ky9Var.s * 255.0f));
                    canvas3.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ky9Var.n);
                }
                if (ky9Var.X && (wb2Var = ky9Var.P) != null) {
                    wb2Var.setVisibility(4);
                    ky9Var.X = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 21:
                c0a c0aVar = (c0a) obj;
                ImageReceiver imageReceiver2 = c0aVar.b;
                Rect rect = c0aVar.e;
                n1a n1aVar = c0aVar.Q;
                w0a w0aVar = c0aVar.a;
                if (c0aVar.n != null && c0aVar.r != null) {
                    canvas3.save();
                    canvas3.scale(12.0f, 12.0f);
                    c0aVar.r.setAlpha((int) (c0aVar.J * 255.0f));
                    canvas3.drawBitmap(c0aVar.n, 0.0f, 0.0f, c0aVar.r);
                    canvas3.restore();
                }
                super.dispatchDraw(canvas);
                if (w0aVar != null) {
                    Drawable drawable2 = w0aVar.F;
                    if (drawable2 != null) {
                        if (c0aVar.y) {
                            f3 = 2.0f;
                            f2 = 255.0f;
                            drawable2.setColorFilter(new PorterDuffColorFilter(vm2.f(c0aVar.J, n1aVar.o1, n1aVar.g1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            f2 = 255.0f;
                            f3 = 2.0f;
                            drawable2.setColorFilter(n1aVar.l1);
                        }
                        drawable2.setAlpha((int) ((1.0f - c0aVar.J) * f2));
                        RectF rectF = hl.P;
                        rectF.set(rect);
                        float f9 = w0aVar.O;
                        if (f9 == 0.0f && w0aVar.T <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(w0aVar.T * 0.8f, f9)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = hl.Q;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / f3) * max)), (int) (rectF.centerY() - ((rectF.height() / f3) * max)), (int) (((rectF.width() / f3) * max) + rectF.centerX()), (int) (((rectF.height() / f3) * max) + rectF.centerY()));
                        float f10 = 1.0f - ((1.0f - c0aVar.J) * (1.0f - w0aVar.P));
                        canvas3.save();
                        if (f10 < 1.0f) {
                            canvas3.translate(rect2.left, rect2.top);
                            canvas3.scale(1.0f, f10, 0.0f, 0.0f);
                            canvas3.skew((1.0f - f10) * (1.0f - ((w0aVar.Q * f3) / 8.0f)), 0.0f);
                            canvas3.translate(-rect2.left, -rect2.top);
                        }
                        canvas3.clipRect(0.0f, 0.0f, getWidth(), (c0aVar.J * hl.L(45.0f)) + c0aVar.G);
                        drawable2.setBounds(rect2);
                        drawable2.draw(canvas3);
                        canvas3.restore();
                        int i7 = w0aVar.Q;
                        if (i7 == 0) {
                            rect2.offset(hl.L(f10 * 8.0f), 0);
                        } else if (i7 == 1) {
                            rect2.offset(hl.L(f10 * 4.0f), 0);
                        } else if (i7 == 6) {
                            rect2.offset(-hl.L(f10 * (-4.0f)), 0);
                        } else if (i7 == 7) {
                            rect2.offset(hl.L(f10 * (-8.0f)), 0);
                        }
                        ln5Var = null;
                        canvas3.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - c0aVar.J) * f2), 31);
                        canvas3 = canvas3;
                        canvas3.clipRect(rect2);
                        canvas3.translate((int) (n1aVar.b0.getX() + n1aVar.p0.getX() + c0aVar.E), n1aVar.b0.getY() + ((int) n1aVar.p0.getY()) + c0aVar.F);
                        n1aVar.p0.draw(canvas3);
                        canvas3.restore();
                    } else {
                        ln5Var = null;
                        if (w0aVar.s && (imageReceiver = w0aVar.h) != null) {
                            imageReceiver.setAlpha(1.0f - c0aVar.J);
                            w0aVar.h.j0(rect);
                            w0aVar.h.h(canvas3, null);
                        }
                    }
                } else {
                    ln5Var = null;
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(c0aVar.J);
                    imageReceiver2.j0(rect);
                    imageReceiver2.h(canvas3, ln5Var);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                if (motionEvent.getActionMasked() == 8) {
                    for (da4 da4Var : ((lm7) this.b).Y) {
                        da4Var.a.e();
                    }
                }
                return super.dispatchGenericMotionEvent(motionEvent);
            default:
                return super.dispatchGenericMotionEvent(motionEvent);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                for (da4 da4Var : ((lm7) obj).Y) {
                    da4Var.a.e();
                }
                return super.dispatchKeyEvent(keyEvent);
            case 22:
                ix1 ix1Var = (ix1) obj;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ix1Var.isShowing()) {
                    ix1Var.dismiss();
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
            case 18:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((mu9) obj).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 19:
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
            case 20:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((ky9) obj).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zha[] zhaVarArr;
        zha zhaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                em6 em6Var = (em6) obj;
                dm6 dm6Var = em6Var.S;
                if (dm6Var != null && (zhaVar = (zhaVarArr = dm6Var.n0)[0]) != null && zhaVar.h.getFastScroll() != null && zhaVarArr[0].h.getFastScroll().n) {
                    return em6Var.S.I(motionEvent);
                }
                dm6 dm6Var2 = em6Var.S;
                if (dm6Var2 != null && dm6Var2.A(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                lm7 lm7Var = (lm7) obj;
                for (da4 da4Var : lm7Var.Y) {
                    da4Var.a.e();
                }
                lm7Var.a0.d(motionEvent.getDownTime());
                return super.dispatchTouchEvent(motionEvent);
            case 25:
                wka wkaVar = (wka) obj;
                if (motionEvent.getActionMasked() == 0 && (wkaVar.e0 || motionEvent.getY() >= wkaVar.b0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 27:
                if (((nza) obj).u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d26.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onAttachedToWindow() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                super.onAttachedToWindow();
                hl.d3(((ck6) obj).r0, 500L);
                return;
            case 21:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((c0a) obj).b;
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
            case 21:
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
            case 3:
                super.onDetachedFromWindow();
                hl.r(((ck6) obj).r0);
                return;
            case 21:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((c0a) obj).b;
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
        d26 d26Var;
        fo6 fo6Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                v98 v98Var = (v98) obj;
                Rect rect = v98Var.G0;
                Rect rect2 = v98Var.F0;
                Paint paint = v98Var.H0;
                qma qmaVar = v98Var.x0;
                Bitmap bitmap = v98Var.C0;
                if (v98Var.B0 != null) {
                    canvas.save();
                    float d = v98Var.w0.d(v98Var.v0);
                    canvas.scale(1.0f - (d * 2.0f), 1.0f, qmaVar.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, qd4.z(1.0f, d, d * 4.0f, 0.25f));
                    float d2 = v98Var.A0.d(v98Var.z0);
                    if (!v98Var.z0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - d2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(d26Var.getWidth() / 2.0f, d26Var.getHeight() / 2.0f);
                            canvas.rotate(v98Var.y0);
                            float max = Math.max(qmaVar.a / bitmap.getWidth(), qmaVar.b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (v98Var.I0 != null) {
                                canvas.rotate(-v98Var.getOrientation());
                                int contentWidth = v98Var.getContentWidth();
                                int contentHeight = v98Var.getContentHeight();
                                if (((v98Var.getOrientation() + v98Var.I0.k) / 90) % 2 == 1) {
                                    contentWidth = v98Var.getContentHeight();
                                    contentHeight = v98Var.getContentWidth();
                                }
                                fo6 fo6Var2 = v98Var.I0;
                                float f = fo6Var2.e;
                                float f2 = fo6Var2.f;
                                float f3 = contentWidth;
                                float f4 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f) / 2.0f, ((-contentHeight) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
                                float f5 = v98Var.I0.c;
                                canvas.scale(f5, f5);
                                fo6 fo6Var3 = v98Var.I0;
                                canvas.translate(fo6Var3.a * f3, fo6Var3.b * f4);
                                canvas.rotate(v98Var.I0.d + fo6Var.k);
                                if (v98Var.I0.l) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(v98Var.getOrientation());
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
            case 24:
                dka dkaVar = (dka) obj;
                Drawable drawable = dkaVar.n1;
                drawable.setBounds(0, dkaVar.p1 - dkaVar.t0, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 28:
                v3b v3bVar = (v3b) obj;
                ImageReceiver imageReceiver = v3bVar.z0;
                qma qmaVar2 = v3bVar.x0;
                if (v3bVar.y0 != null) {
                    canvas.save();
                    float d3 = v3bVar.w0.d(v3bVar.v0);
                    canvas.scale(1.0f - (d3 * 2.0f), 1.0f, qmaVar2.a / 2.0f, 0.0f);
                    canvas.skew(0.0f, qd4.z(1.0f, d3, 4.0f * d3, 0.25f));
                    imageReceiver.i0(0.0f, 0.0f, (int) qmaVar2.a, (int) qmaVar2.b);
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
            case 7:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(ob6.G(((w78) obj).b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 8:
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
            case 9:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(ob6.G(((l98) obj).b.size(), "AccDescrSendPhotos", new Object[0]));
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
            case 12:
                if (((PopupNotificationActivity) obj).c() || ((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return true;
                }
                return false;
            case 24:
                dka dkaVar = (dka) obj;
                if (motionEvent.getAction() == 0 && dkaVar.p1 != 0 && motionEvent.getY() < dkaVar.p1) {
                    dkaVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cna[] cnaVarArr;
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
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                qh6 qh6Var = (qh6) obj;
                for (cna cnaVar : qh6Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cnaVar.getLayoutParams();
                    int L2 = hl.L(16.0f) + getHeight();
                    if (!cnaVar.a() && qh6Var.c.getVisibility() == 0) {
                        L2 += hl.L(230.0f);
                    }
                    cnaVar.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 2:
                super.onLayout(z, i, i2, i3, i4);
                fj6 fj6Var = (fj6) obj;
                fj6Var.k0();
                fj6Var.i0();
                fj6Var.e0();
                return;
            case 18:
                super.onLayout(z, i, i2, i3, i4);
                mu9 mu9Var = (mu9) obj;
                d26 d26Var = mu9Var.s;
                wma wmaVar = mu9Var.w;
                Drawable drawable = mu9Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (mu9Var.y != null) {
                        float f2 = mu9Var.I;
                        float f3 = bounds.left + f2;
                        float f4 = bounds.right + f2;
                        float f5 = mu9Var.J;
                        float f6 = bounds.top + f5;
                        float f7 = bounds.bottom + f5;
                        if (!mu9Var.M) {
                            int i7 = ((f4 - frameLayout.getMeasuredWidth()) > hl.L(8.0f) ? 1 : ((f4 - frameLayout.getMeasuredWidth()) == hl.L(8.0f) ? 0 : -1));
                            ViewGroup viewGroup = mu9Var.E;
                            if (i7 < 0) {
                                viewGroup.setPivotX(hl.L(6.0f));
                                mu9Var.y.setX(Math.min(wmaVar.getWidth() - mu9Var.y.getWidth(), f3 - hl.L(10.0f)) - wmaVar.getX());
                                z2 = false;
                                f = 16.0f;
                            } else {
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - hl.L(6.0f));
                                f = 16.0f;
                                mu9Var.y.setX(Math.max(hl.L(8.0f), (hl.L(4.0f) + f4) - mu9Var.y.getMeasuredWidth()) - wmaVar.getX());
                                z2 = true;
                            }
                            float x = mu9Var.y.getX();
                            if (z2) {
                                L = ((x + mu9Var.y.getWidth()) - hl.L(6.0f)) - f4;
                            } else {
                                L = (x + hl.L(10.0f)) - f3;
                            }
                            mu9Var.H = L;
                        } else {
                            f = 16.0f;
                            z2 = false;
                        }
                        if (mu9Var.G != null) {
                            i5 = hl.L(21.0f);
                        } else {
                            i5 = 0;
                        }
                        float f8 = f7 + i5;
                        int i8 = ((mu9Var.y.getMeasuredHeight() + f8) > (d26Var.getMeasuredHeight() - hl.L(f)) ? 1 : ((mu9Var.y.getMeasuredHeight() + f8) == (d26Var.getMeasuredHeight() - hl.L(f)) ? 0 : -1));
                        ViewGroup viewGroup2 = mu9Var.E;
                        if (i8 > 0) {
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - hl.L(6.0f));
                            mu9Var.y.setY(((f6 - hl.L(4.0f)) - mu9Var.y.getMeasuredHeight()) - wmaVar.getY());
                            z3 = true;
                        } else {
                            viewGroup2.setPivotY(hl.L(6.0f));
                            mu9Var.y.setY(Math.min((d26Var.getHeight() - mu9Var.y.getMeasuredHeight()) - hl.L(f), f8) - wmaVar.getY());
                        }
                        fu5 fu5Var = mu9Var.x;
                        fu5Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = fu5Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.c = z2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z3;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                WindowInsets windowInsets = secretMediaViewer.f0;
                if (windowInsets != null) {
                    i6 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i6 = 0;
                }
                tt ttVar = secretMediaViewer.e;
                ttVar.layout(i6, 0, ttVar.getMeasuredWidth() + i6, secretMediaViewer.e.getMeasuredHeight());
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
            case 20:
                super.onLayout(z, i, i2, i3, i4);
                ((ky9) obj).d();
                return;
            case 21:
                super.onLayout(z, i, i2, i3, i4);
                c0a c0aVar = (c0a) obj;
                Context context = c0aVar.getContext();
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
                    Bitmap bitmap = c0aVar.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || c0aVar.n.getHeight() != decorView.getMeasuredHeight()) {
                        c0aVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                super.onLayout(z, i, i2, i3, i4);
                ((dka) obj).F0();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        cna[] cnaVarArr;
        int p0;
        float f;
        float top;
        int measuredHeight;
        vb vbVar;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                qh6 qh6Var = (qh6) obj;
                for (cna cnaVar : qh6Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cnaVar.getLayoutParams();
                    int L = hl.L(16.0f) + (measuredHeight2 - marginLayoutParams.topMargin);
                    if (!cnaVar.a() && qh6Var.c.getVisibility() == 0) {
                        L += hl.L(230.0f);
                    }
                    cnaVar.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 5:
                lm7 lm7Var = (lm7) obj;
                int p02 = lm7Var.p0();
                int i4 = 0;
                while (true) {
                    jm7[] jm7VarArr = lm7Var.b;
                    if (i4 < jm7VarArr.length) {
                        jm7 jm7Var = jm7VarArr[i4];
                        if (i4 == 2) {
                            p0 = lm7Var.r0();
                        } else {
                            p0 = lm7Var.p0() - hl.L(9.0f);
                        }
                        int L2 = hl.L(48.0f) + p0;
                        im7 im7Var = jm7Var.f;
                        if (im7Var != null && im7Var.getPaddingTop() != L2) {
                            im7 im7Var2 = jm7Var.f;
                            im7Var2.setPadding(0, L2, 0, im7Var2.getPaddingBottom());
                        }
                        w94 w94Var = jm7Var.h;
                        if (w94Var != null) {
                            w94Var.setIndicatorTop(L2);
                        }
                        i4++;
                    } else {
                        lm7Var.P0();
                        dm7 dm7Var = lm7Var.K;
                        if (dm7Var != null && dm7Var.getLayoutParams().height != hl.L(8.0f) + p02) {
                            lm7Var.K.getLayoutParams().height = hl.L(8.0f) + p02;
                            lm7Var.K.requestLayout();
                        }
                        super.onMeasure(i, i2);
                        return;
                    }
                }
                break;
            case 6:
                h48 h48Var = (h48) obj;
                FrameLayout frameLayout = h48Var.M;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = a.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) h48Var.M.getLayoutParams()).topMargin = hl.m;
                }
                super.onMeasure(i, i2);
                return;
            case 13:
                xk8 xk8Var = (xk8) obj;
                if (xk8Var.K0) {
                    xk8Var.t1 = View.MeasureSpec.getSize(i);
                } else {
                    xk8Var.t1 = (int) (Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) * 0.8f);
                }
                super.onMeasure(i, i2);
                return;
            case 14:
                super.onMeasure(i, i2);
                kl8 kl8Var = (kl8) ((ox0) obj).d;
                i94 i94Var = kl8Var.m2;
                if (i94Var != null) {
                    top = i94Var.getTop();
                    measuredHeight = kl8Var.m2.getMeasuredHeight();
                } else {
                    View view = kl8Var.w2;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = kl8Var.w2.getMeasuredHeight();
                    } else {
                        f = 0.0f;
                        kl8Var.l2.setTranslationY(f - (vbVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f = (measuredHeight / 2.0f) + top;
                kl8Var.l2.setTranslationY(f - (vbVar.getMeasuredHeight() / 2.0f));
                return;
            case 16:
                super.onMeasure(i, i2);
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).R3();
                return;
            case 19:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                WindowInsets windowInsets = secretMediaViewer.f0;
                if (windowInsets != null) {
                    if (hl.y) {
                        int i5 = hl.q.y;
                        if (size2 > i5) {
                            size2 = i5;
                        }
                        size2 += hl.m;
                    }
                    size2 -= windowInsets.getSystemWindowInsetBottom();
                    size -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i6 = hl.q.y;
                    if (size2 > i6) {
                        size2 = i6;
                    }
                }
                setMeasuredDimension(size, size2);
                WindowInsets windowInsets2 = secretMediaViewer.f0;
                if (windowInsets2 != null) {
                    size -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
            case 24:
                dka dkaVar = (dka) obj;
                gw9 gw9Var = dkaVar.l1;
                int size3 = View.MeasureSpec.getSize(i2) - hl.m;
                getMeasuredWidth();
                int y = uh9.y(54.0f, id6.g(), uh9.w(56.0f, hl.L(56.0f), 1));
                int i7 = size3 / 5;
                if (y < i7 * 3) {
                    i3 = hl.L(8.0f);
                } else {
                    i3 = i7 << 1;
                    if (y < size3) {
                        i3 -= size3 - y;
                    }
                }
                if (gw9Var.getPaddingTop() != i3) {
                    dkaVar.q1 = true;
                    gw9Var.setPadding(0, i3, 0, hl.L(8.0f));
                    dkaVar.q1 = false;
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
            case 18:
                super.onSizeChanged(i, i2, i3, i4);
                mu9 mu9Var = (mu9) this.b;
                uk0.c(mu9Var.h, mu9Var.s);
                ViewGroup viewGroup = mu9Var.E;
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
            case 12:
                if (!((PopupNotificationActivity) obj).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            case 15:
                ((gkc) obj).U.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            case 24:
                if (((dka) obj).J || !super.onTouchEvent(motionEvent)) {
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
            case 12:
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
            case 17:
                d79 d79Var = (d79) obj;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(d79Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d79Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, d79Var.c1.getMeasuredWidth(), d79Var.c1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 24:
                if (!((dka) obj).q1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 29:
                if (!((s4b) obj).a2) {
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
            case 16:
                super.setScaleX(f);
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).R3();
                return;
            case 23:
                super.setScaleX(f);
                ((tba) obj).o0();
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
            case 11:
                super.setTranslationY(f);
                Drawable[] drawableArr = PhotoViewer.d9;
                ((PhotoViewer) obj).H0();
                return;
            case 26:
                super.setTranslationY(f);
                hta htaVar = ((wua) obj).Z1;
                if (htaVar != null && htaVar.getVisibility() == 0) {
                    htaVar.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public d26(v3b v3bVar, Context context) {
        super(context);
        this.a = (byte) 28;
        this.b = v3bVar;
        setWillNotDraw(false);
    }

    public d26(v98 v98Var, Context context) {
        super(context);
        this.a = (byte) 10;
        this.b = v98Var;
        setWillNotDraw(false);
    }

    public d26(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
