package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.LaunchActivity;
public final class yc extends FrameLayout {
    public final byte a;
    public Object b;

    public yc(cd4 cd4Var, Context context) {
        super(context);
        String M0;
        this.a = (byte) 20;
        this.b = cd4Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232205);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gl.L(22.0f);
        int i = bkb.Ei;
        byte b = 0;
        ShapeDrawable b0 = bkb.b0(L, bkb.w0(null, i, false));
        vkb M = zkb.M(i);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, M, null, null);
        addView(imageView, nme.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        wla wlaVar = new wla(context);
        wlaVar.setTypeface(gl.o());
        wlaVar.setTextSize(1, 20.0f);
        int i2 = bkb.i5;
        zkb.X(wlaVar, i2, null);
        wlaVar.setGravity(1);
        wlaVar.setText(cd4Var.Z0(wlaVar));
        t97 t97Var = cd4Var.T1;
        if (t97Var != null && t97Var.n) {
            b = 26;
        }
        wlaVar.s = b;
        addView(wlaVar, nme.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (cd4Var.U1.isEmpty()) {
            M0 = k96.M0(2131750627, null);
        } else {
            M0 = k96.M0(2131750628, null);
        }
        textView.setText(M0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, i2, null);
        addView(textView, nme.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232101);
        zkb.s(imageView2, bkb.B6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new yj3(this, (byte) 10));
        addView(imageView2, nme.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    public final pc2 a() {
        return ((pc2[]) this.b)[0];
    }

    @Override
    public final void addView(View view, int i, int i2) {
        switch (this.a) {
            case 13:
                super.addView(view, i, i2);
                ((j92) this.b).e();
                return;
            default:
                super.addView(view, i, i2);
                return;
        }
    }

    public final void b(kl0 kl0Var, nl0 nl0Var) {
        ry1 ry1Var = (ry1) this.b;
        ry1Var.c(kl0Var, nl0Var);
        ry1Var.setIgnoreFastWay(true);
        ry1Var.setFadeHeightTop(gl.L(48.0f));
        ry1Var.setFadeHeightBottom(gl.L(48.0f));
    }

    public final void c() {
        pc2[] pc2VarArr = (pc2[]) this.b;
        pc2 pc2Var = pc2VarArr[0];
        pc2 pc2Var2 = pc2VarArr[1];
        pc2VarArr[0] = pc2Var2;
        pc2VarArr[1] = pc2Var;
        pc2Var2.n = true;
        pc2Var2.setVisibility(0);
        pc2VarArr[0].setScaleX(0.8f);
        pc2VarArr[0].setScaleY(0.8f);
        pc2VarArr[0].setAlpha(0.0f);
        pc2VarArr[0].setTranslationY(gl.L(20.0f));
        ViewPropertyAnimator translationY = pc2VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        s33 s33Var = s33.h;
        ug8.t(translationY, s33Var, 320L);
        pc2 pc2Var3 = pc2VarArr[1];
        pc2Var3.n = false;
        pc2Var3.setVisibility(0);
        pc2VarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-gl.L(20.0f)).setInterpolator(s33Var).setDuration(320L).withEndAction(new hq1(pc2Var3, (byte) 23)).start();
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 29:
                Typeface typeface = gl.a;
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
        switch (this.a) {
            case 6:
                int measuredWidth = getMeasuredWidth() - gl.L(8.0f);
                g61 g61Var = (g61) this.b;
                gn gnVar = g61Var.c;
                gn gnVar2 = g61Var.b;
                int c = ((measuredWidth - ((int) gnVar.c())) + ((int) gnVar2.c())) / 2;
                if (k96.a0) {
                    super.dispatchDraw(canvas);
                    return;
                }
                gnVar2.setBounds(0, 0, c, getHeight());
                gnVar2.draw(canvas);
                gnVar.setBounds(gl.L(8.0f) + c, 0, getWidth(), getHeight());
                gnVar.draw(canvas);
                return;
            case 24:
                qa5 qa5Var = (qa5) this.b;
                cq3 cq3Var = qa5Var.q0;
                lx4 lx4Var = qa5Var.r0;
                if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
                    qa5Var.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (lx4Var != null && !lx4Var.r && lx4Var.k(measuredWidth2, measuredHeight)) {
                        cq3Var.b(lx4Var.i(measuredWidth2, measuredHeight), -3);
                        lx4Var.j();
                    }
                }
                super.dispatchDraw(canvas);
                gl.O(canvas, this, qa5Var.getThemedColor(bkb.c6), qa5Var.n0, 1.0f);
                return;
            case 29:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                String str = LaunchActivity.C1;
                View view = launchActivity.F0;
                if (view != null && view.getBackground() != null) {
                    int[] iArr = launchActivity.y1;
                    if (iArr == null) {
                        iArr = new int[2];
                        launchActivity.y1 = iArr;
                    }
                    launchActivity.F0.getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.y1;
                    int i = iArr2[0];
                    int i2 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int[] iArr3 = launchActivity.y1;
                    int i3 = i2 - iArr3[1];
                    canvas.save();
                    canvas.translate(i - iArr3[0], i3);
                    launchActivity.F0.getBackground().draw(canvas);
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
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 16:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    xv2 xv2Var = (xv2) this.b;
                    if (!xv2Var.n && !xv2Var.K) {
                        xv2Var.b();
                        return true;
                    }
                    xv2Var.c();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View[] viewPages;
        switch (this.a) {
            case 8:
                vi1 vi1Var = (vi1) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    vi1Var.x.X0.D0();
                    for (View view : vi1Var.b.getViewPages()) {
                        if (view instanceof ti1) {
                            ((ti1) view).a.D0();
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                c42 c42Var = (c42) this.b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < c42Var.x0 || motionEvent.getY() > c42Var.y0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 10:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                c42 c42Var = (c42) this.b;
                boolean z = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - c42Var.z0);
                if (!c42Var.y) {
                    z = super.drawChild(canvas, view, j);
                }
                canvas.restore();
                return z;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 17:
                ou3 ou3Var = (ou3) this.b;
                stc stcVar = ou3Var.m1;
                ku3 ku3Var = ou3Var.l1;
                super.onDetachedFromWindow();
                try {
                    if ((!ou3Var.H0() || ku3Var.getVisibility() != 0) && ku3Var.getParent() != null) {
                        removeView(ku3Var);
                        ku3Var.stopLoading();
                        ku3Var.loadUrl("about:blank");
                        ku3Var.destroy();
                    }
                    if (!stcVar.f() && !ou3Var.H0()) {
                        if (ou3.R1 == ou3Var) {
                            ou3.R1 = null;
                        }
                        stcVar.b();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.onDraw(canvas);
                wd1 wd1Var = (wd1) this.b;
                if (wd1Var == null) {
                    wd1Var = new wd1();
                    this.b = wd1Var;
                    wd1Var.k = false;
                    wd1Var.m = 2.0f;
                }
                wd1Var.f = getMeasuredWidth();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((wd1) this.b).a(gl.L(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                ((rk0) this.b).e.a(canvas);
                return;
            case 10:
                c42 c42Var = (c42) this.b;
                Paint paint = c42Var.a0;
                paint.setColor(bkb.v0(bkb.g5, c42Var.a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - c42Var.z0, paint);
                return;
            case 12:
                super.onDraw(canvas);
                c82 c82Var = (c82) this.b;
                if (c82Var.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - c82Var.y, getWidth(), getHeight(), c82Var.E);
                    return;
                }
                return;
            case 28:
                super.onDraw(canvas);
                q88 q88Var = (q88) this.b;
                Paint paint2 = q88Var.r1;
                hs7 hs7Var = q88Var.k1;
                paint2.setAlpha((int) ((1.0f - q88Var.t1) * hs7Var.getAlpha() * 102.0f));
                RectF rectF2 = gl.P;
                hs7Var.b(rectF2);
                ow5 ow5Var = q88Var.S0;
                int top = ow5Var.getTop();
                float translationY = hs7Var.getTranslationY() + ow5Var.getTranslationY() + hs7Var.getTop() + top;
                float f = rectF2.left;
                ss7 ss7Var = q88Var.l1;
                rectF2.set(gl.R1(f, ss7Var.getLeft(), q88Var.t1), gl.R1(rectF2.top + translationY, ss7Var.getTop() - ss7Var.getTranslationY(), q88Var.t1), gl.R1(rectF2.right, ss7Var.getRight(), q88Var.t1), gl.R1(translationY + rectF2.bottom, ss7Var.getBottom() - ss7Var.getTranslationY(), q88Var.t1));
                float L = gl.L(gl.U1(q88Var.t1, 32, 16));
                Paint paint3 = q88Var.s1;
                int alpha = paint3.getAlpha();
                paint3.setAlpha((int) (alpha * q88Var.t1));
                canvas.drawRoundRect(rectF2, L, L, paint3);
                paint3.setAlpha(alpha);
                canvas.drawRoundRect(rectF2, L, L, paint2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.b).f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 6:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 10:
                c42 c42Var = (c42) this.b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < c42Var.x0 || motionEvent.getY() > c42Var.y0)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        char c;
        int i5;
        int i6;
        int right;
        int left;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight;
        int L;
        int measuredHeight2;
        int i7;
        int i8;
        char c2 = 2;
        switch (this.a) {
            case 0:
                int childCount = getChildCount();
                int i9 = i3 - i;
                if (((hd) this.b).L0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i9 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - gl.L(8.0f)) / 2);
                    int i10 = paddingRight - max;
                    if (!k96.a0) {
                        paddingLeft = i10;
                        i10 = paddingLeft;
                    }
                    int paddingTop = getPaddingTop();
                    int L2 = gl.L(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i10, paddingTop, i10 + max, gl.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, gl.L(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i10, L2, i10 + max, gl.L(40.0f) + L2);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, L2, max + paddingLeft, gl.L(40.0f) + L2);
                        return;
                    }
                    return;
                }
                View view = null;
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = getChildAt(i11);
                    Integer num = (Integer) childAt.getTag();
                    if (num != null) {
                        if (num.intValue() == -1) {
                            if (k96.a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i9 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i9 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            c = c2;
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (k96.a0) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = de9.w(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                c = c2;
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                c = c2;
                                int paddingRight2 = (i9 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = ug8.B(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else {
                            c = c2;
                            if (num.intValue() == -4) {
                                View findViewWithTag5 = findViewWithTag(-3);
                                if (k96.a0) {
                                    if (findViewWithTag5 == null) {
                                        left = i9 - getPaddingRight();
                                        measuredWidth = childAt.getMeasuredWidth();
                                    } else {
                                        left = findViewWithTag5.getLeft() - gl.L(8.0f);
                                        measuredWidth = childAt.getMeasuredWidth();
                                    }
                                    int i12 = left - measuredWidth;
                                    childAt.layout(i12, getPaddingTop(), childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    if (findViewWithTag5 == null) {
                                        right = getPaddingLeft();
                                    } else {
                                        right = findViewWithTag5.getRight() + gl.L(8.0f);
                                    }
                                    childAt.layout(right, getPaddingTop(), childAt.getMeasuredWidth() + right, childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            } else if (num.intValue() == -3) {
                                if (k96.a0) {
                                    childAt.layout((i9 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i9 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                                } else {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                                }
                            }
                        }
                    } else {
                        c = c2;
                        int measuredWidth3 = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        if (view != null) {
                            i6 = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                            i5 = ((view.getMeasuredHeight() - measuredHeight3) / 2) + view.getTop();
                        } else {
                            i5 = 0;
                            i6 = 0;
                        }
                        childAt.layout(i6, i5, measuredWidth3 + i6, measuredHeight3 + i5);
                    }
                    i11++;
                    c2 = c;
                }
                return;
            case 2:
                int paddingLeft3 = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
                int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft3, paddingTop2) - gl.L(24.0f);
                int min2 = Math.min(gl.L(60.0f), min);
                int L3 = (paddingTop2 - min2) - gl.L(48.0f);
                bc0 bc0Var = (bc0) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = bc0Var.d;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L3, Integer.MIN_VALUE));
                int b = moe.b((paddingTop2 - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()) - gl.L(48.0f), min2, min);
                tb0 tb0Var = bc0Var.c;
                tb0Var.measure(View.MeasureSpec.makeMeasureSpec(b, 1073741824), View.MeasureSpec.makeMeasureSpec(b, 1073741824));
                int D = ug8.D(48.0f, (paddingTop2 - b) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
                ((FrameLayout.LayoutParams) tb0Var.getLayoutParams()).topMargin = gl.L(8.0f) + D;
                layoutParams.topMargin = gl.L(4.0f) + de9.w(8.0f, D, b);
                layoutParams.leftMargin = gl.L(4.0f);
                layoutParams.rightMargin = gl.L(4.0f);
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                int L4 = gl.L(36.0f);
                int i13 = ((i3 - i) - L4) / 2;
                int i14 = ((i4 - i2) - L4) / 2;
                ((rk0) this.b).e.f(i13, i14, i13 + L4, L4 + i14);
                return;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.l0;
                TextView textView = chatAttachAlertPhotoLayout.r0;
                if (getMeasuredWidth() == gl.L(126.0f)) {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i7 = getMeasuredWidth() / 2;
                    int i15 = measuredHeight / 2;
                    measuredHeight2 = gl.L(17.0f) + measuredHeight + i15;
                    i8 = i15 - gl.L(17.0f);
                    L = i7;
                } else {
                    measuredWidth2 = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - gl.L(13.0f);
                    int i16 = measuredWidth2 / 2;
                    int L5 = measuredWidth2 + i16 + gl.L(17.0f);
                    L = i16 - gl.L(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - gl.L(13.0f);
                    i7 = L5;
                    i8 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - textView.getMeasuredHeight()) - gl.L(12.0f);
                if (getMeasuredWidth() == gl.L(126.0f)) {
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (textView.getMeasuredWidth() / 2) + measuredWidth2, textView.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), measuredHeight4, (textView.getMeasuredWidth() / 2) + measuredWidth2, textView.getMeasuredHeight() + measuredHeight4);
                }
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (shutterButton.getMeasuredHeight() / 2), (shutterButton.getMeasuredWidth() / 2) + measuredWidth2, (shutterButton.getMeasuredHeight() / 2) + measuredHeight);
                imageView.layout(i7 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (imageView.getMeasuredHeight() / 2), (imageView.getMeasuredWidth() / 2) + i7, (imageView.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i17 = 0; i17 < 2; i17++) {
                    ImageView imageView2 = imageViewArr[i17];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i8 - (imageViewArr[i17].getMeasuredHeight() / 2), (imageViewArr[i17].getMeasuredWidth() / 2) + L, (imageViewArr[i17].getMeasuredHeight() / 2) + i8);
                }
                return;
            case 12:
                super.onLayout(z, i, i2, i3, i4);
                c82 c82Var = (c82) this.b;
                if (c82Var.P && z) {
                    c82Var.i0(c82Var.R.e);
                    return;
                }
                return;
            case 23:
                super.onLayout(z, i, i2, i3, i4);
                o85 o85Var = (o85) this.b;
                yc ycVar = o85Var.b;
                int[] iArr = o85Var.I;
                ycVar.getLocationOnScreen(iArr);
                o85Var.P = iArr[0];
                o85Var.O = iArr[1] - gl.L(25.0f);
                return;
            case 24:
                super.onLayout(z, i, i2, i3, i4);
                qa5 qa5Var = (qa5) this.b;
                qa5Var.h0();
                qa5Var.i0();
                no4 no4Var = qa5Var.f;
                y74 y74Var = qa5Var.b;
                no4Var.setTranslationY(y74Var.f);
                qa5Var.j0();
                qa5Var.e.setTranslationY(gl.L(48.0f) + y74Var.f);
                return;
            case 26:
                super.onLayout(z, i, i2, i3, i4);
                xj5 xj5Var = (xj5) this.b;
                TextView textView2 = xj5Var.b;
                if (textView2 != null) {
                    int measuredWidth4 = ((xj5Var.b.getMeasuredWidth() / 2) + textView2.getLeft()) - (xj5Var.c.getMeasuredWidth() / 2);
                    int top = (xj5Var.e.getTop() + ((xj5Var.b.getMeasuredHeight() - xj5Var.c.getMeasuredHeight()) / 2)) - gl.L(16.0f);
                    TextView textView3 = xj5Var.c;
                    textView3.layout(measuredWidth4, top, textView3.getMeasuredWidth() + measuredWidth4, xj5Var.c.getMeasuredHeight() + top);
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view;
        int L;
        int L2;
        int i3 = 0;
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                if (((hd) this.b).L0) {
                    int max = Math.max(0, (measuredWidth - gl.L(8.0f)) / 2);
                    while (i3 < childCount) {
                        View childAt = getChildAt(i3);
                        if (childAt.getTag() != null) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), 1073741824));
                        }
                        i3++;
                    }
                    return;
                }
                int i4 = 0;
                while (i3 < childCount) {
                    View childAt2 = getChildAt(i3);
                    if ((childAt2 instanceof TextView) && childAt2.getTag() != null) {
                        i4 = childAt2.getMeasuredWidth() + i4;
                    }
                    i3++;
                }
                if (i4 > measuredWidth) {
                    View findViewWithTag = findViewWithTag(-2);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-3);
                    if (findViewWithTag != null && findViewWithTag3 != null) {
                        if (findViewWithTag.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i4 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i4 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                        if (findViewWithTag2.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i4 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i4 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            case 3:
                if (View.MeasureSpec.getSize(i) > gl.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(320.0f), 1073741824), i2);
                    return;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            case 17:
                int size = View.MeasureSpec.getSize(i);
                ou3 ou3Var = (ou3) this.b;
                int min = (int) Math.min(ou3Var.B1 / (ou3Var.A1 / size), gl.q.y / 2);
                if (ou3Var.D1) {
                    i3 = 22;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(i3 + 84) + min + 1, 1073741824));
                return;
            case 18:
                t14 t14Var = ((t04) this.b).G;
                if (((View) t14Var.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - t14Var.getY());
                } else {
                    L = gl.L(120.0f);
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L - t14Var.c1, 1073741824));
                return;
            case 19:
                t14 t14Var2 = ((o14) this.b).R;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (ug8.D(8.0f, t14Var2.E0.getMeasuredHeight() - t14Var2.c1, 3) * 1.7f), 1073741824));
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(171.0f), 1073741824));
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(156.0f), 1073741824));
                return;
            case 22:
                super.onMeasure(i, i2);
                ((nv4) this.b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 24:
                qa5 qa5Var = (qa5) this.b;
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                if (!gl.O1() && size3 <= size2) {
                    qa5Var.d0 = gl.L(56.0f);
                } else {
                    qa5Var.d0 = gl.L(144.0f);
                }
                measureChildWithMargins(qa5.d0(qa5Var), i, 0, i2, 0);
                ((ViewGroup.MarginLayoutParams) qa5Var.s.getLayoutParams()).topMargin = gl.L(48.0f) + qa5.e0(qa5Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) qa5Var.e.getLayoutParams()).topMargin = qa5.Y(qa5Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) qa5Var.f.getLayoutParams()).topMargin = qa5.Z(qa5Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) qa5Var.h.getLayoutParams()).topMargin = qa5.a0(qa5Var).getMeasuredHeight();
                qa5Var.h.getLayoutParams().height = qa5Var.d0;
                ((ViewGroup.MarginLayoutParams) qa5Var.d.getLayoutParams()).height = gl.L(53.0f) + qa5.b0(qa5Var).getMeasuredHeight() + qa5Var.d0;
                qa5Var.k0();
                super.onMeasure(i, i2);
                return;
            case 27:
                int size4 = View.MeasureSpec.getSize(i);
                int size5 = View.MeasureSpec.getSize(i2);
                gq5 gq5Var = (gq5) this.b;
                if (!gl.O1() && size5 <= size4) {
                    L2 = gl.L(78.0f);
                } else {
                    L2 = gl.L(144.0f);
                }
                gq5Var.x = L2;
                super.onMeasure(i, i2);
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
                xv2 xv2Var = (xv2) this.b;
                tk0.c(xv2Var.s, xv2Var.y);
                xv2Var.t.d();
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 28:
                if (motionEvent.getActionMasked() == 0) {
                    q88 q88Var = (q88) this.b;
                    if (q88Var.u1) {
                        q88Var.B0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onViewAdded(View view) {
        switch (this.a) {
            case 9:
                super.onViewAdded(view);
                bringChildToFront((ry1) this.b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f);
                fx0 fx0Var = (fx0) this.b;
                FrameLayout frameLayout = fx0Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(fx0Var.c.getHeight() - fx0Var.b.getY())) + fx0Var.t0);
                }
                fx0Var.d0(f);
                return;
            case 6:
            default:
                super.setTranslationY(f);
                return;
            case 7:
                super.setTranslationY(f);
                ((nf1) this.b).Y.invalidate();
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 23:
                super.setVisibility(i);
                ((o85) this.b).d.setVisibility(i);
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 6:
                g61 g61Var = (g61) this.b;
                if (drawable != g61Var.c && drawable != g61Var.b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public yc(Context context, byte b) {
        super(context);
        this.a = b;
    }

    public yc(Context context) {
        super(context);
        this.a = (byte) 9;
        ry1 ry1Var = new ry1(context);
        this.b = ry1Var;
        addView(ry1Var, nme.g());
    }

    public yc(Context context, wjb wjbVar) {
        super(context);
        this.a = (byte) 14;
        this.b = new pc2[2];
        int i = 0;
        while (true) {
            pc2[] pc2VarArr = (pc2[]) this.b;
            if (i < pc2VarArr.length) {
                pc2VarArr[i] = new pc2(context, wjbVar);
                addView(((pc2[]) this.b)[i], nme.e(-1, -1, 119));
                i++;
            } else {
                pc2VarArr[0].setVisibility(0);
                ((pc2[]) this.b)[1].setVisibility(8);
                return;
            }
        }
    }

    public yc(Context context, String str, f53 f53Var) {
        super(context);
        this.a = (byte) 25;
        int L = gl.L(12.0f);
        int i = bkb.i5;
        Drawable b0 = bkb.b0(L, bkb.p1(0.06f, bkb.v0(i, f53Var)));
        vkb K = zkb.K(0.06f, i);
        setBackground(b0);
        zkb.j(this, b0, K, null, f53Var);
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        hn hnVar = new hn(context, false, true, true);
        this.b = hnVar;
        hnVar.b(0.6f, 450L, s33.h);
        hnVar.setTextSize(gl.L(17.0f));
        zkb.U(hnVar, i, f53Var);
        hnVar.setScaleProperty(0.7f);
        hnVar.setGravity(17);
        hnVar.setTypeface(gl.o());
        hnVar.setAllowCancel(true);
        j.addView(hnVar, nme.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        zkb.X(textView, i, f53Var);
        textView.setGravity(17);
        j.addView(textView, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public yc(c82 c82Var, Context context) {
        super(context);
        this.a = (byte) 12;
        this.b = c82Var;
        setWillNotDraw(false);
    }

    public yc(q88 q88Var, Context context) {
        super(context);
        this.a = (byte) 28;
        this.b = q88Var;
        setWillNotDraw(false);
    }

    public yc(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
