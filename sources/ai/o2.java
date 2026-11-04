package ai;

import android.content.Context;
import android.graphics.Canvas;
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
import b8.mf;
import ci.wb;
import gi.va;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.ld;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.zs0;
public final class o2 extends FrameLayout {
    public final int f851a;
    public Object f852b;

    public o2(int i3, Context context, Object obj) {
        super(context);
        this.f851a = i3;
        this.f852b = obj;
    }

    public yn a() {
        return ((yn[]) this.f852b)[0];
    }

    @Override
    public void addView(View view, int i3, int i10) {
        switch (this.f851a) {
            case 9:
                super.addView(view, i3, i10);
                ((kh.f) this.f852b).e();
                return;
            default:
                super.addView(view, i3, i10);
                return;
        }
    }

    public void b(eh.c cVar, hh.e eVar) {
        mh.f fVar = (mh.f) this.f852b;
        fVar.c(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(org.telegram.messenger.g0.L(48.0f));
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(48.0f));
    }

    public void c() {
        yn[] ynVarArr = (yn[]) this.f852b;
        yn ynVar = ynVarArr[0];
        yn ynVar2 = ynVarArr[1];
        ynVarArr[0] = ynVar2;
        ynVarArr[1] = ynVar;
        ynVar2.f40791n = true;
        ynVar2.setVisibility(0);
        ynVarArr[0].setScaleX(0.8f);
        ynVarArr[0].setScaleY(0.8f);
        ynVarArr[0].setAlpha(0.0f);
        ynVarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = ynVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        xq xqVar = xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
        yn ynVar3 = ynVarArr[1];
        ynVar3.f40791n = false;
        ynVar3.setVisibility(0);
        ynVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new vf(ynVar3, 29)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f851a) {
            case 25:
                nk0 nk0Var = (nk0) this.f852b;
                if (nk0Var.f36578r > 0.0f && nk0Var.f36575e != null) {
                    nk0Var.f36576f.reset();
                    float width = getWidth() / nk0Var.f36574c.getWidth();
                    nk0Var.f36576f.postScale(width, width);
                    nk0Var.d.setLocalMatrix(nk0Var.f36576f);
                    nk0Var.f36575e.setAlpha((int) (nk0Var.f36578r * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), nk0Var.f36575e);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                Drawable drawable = nk0Var.F;
                if (drawable != null) {
                    drawable.setAlpha((int) (nk0Var.f36578r * 255.0f));
                    canvas2.save();
                    float f10 = nk0Var.I;
                    float f11 = nk0Var.H;
                    float f12 = nk0Var.f36578r;
                    canvas2.translate((f11 * f12) + f10, (0.0f * f12) + nk0Var.J);
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(Math.min(nk0Var.K, nk0Var.L), Math.max(nk0Var.K, nk0Var.L), 0.75f), 1.0f, nk0Var.f36578r);
                    canvas2.scale(T1, T1, ((nk0Var.F.getBounds().width() / 2.0f) * nk0Var.K) + (-nk0Var.I) + nk0Var.F.getBounds().left, ((nk0Var.F.getBounds().height() / 2.0f) * nk0Var.L) + (-nk0Var.J) + nk0Var.F.getBounds().top);
                    gh.g gVar = nk0Var.G;
                    if (gVar != null) {
                        gVar.setAlpha((int) (nk0Var.f36578r * 255.0f));
                        nk0Var.G.draw(canvas2);
                    }
                    nk0Var.F.draw(canvas2);
                    canvas2.restore();
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
        switch (this.f851a) {
            case 26:
                le leVar = (le) this.f852b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && leVar.isShowing()) {
                    leVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f851a) {
            case 25:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((nk0) this.f852b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rr0[] rr0VarArr;
        rr0 rr0Var;
        switch (this.f851a) {
            case 2:
                if (((wb) this.f852b).f6295u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((hi.g) this.f852b).f14450t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                uk ukVar = (uk) this.f852b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < ukVar.f38807x0 || motionEvent.getY() > ukVar.f38809y0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 23:
                r80 r80Var = (r80) this.f852b;
                q80 q80Var = r80Var.S;
                if (q80Var != null && (rr0Var = (rr0VarArr = q80Var.f40108n0)[0]) != null && rr0Var.h.getFastScroll() != null && rr0VarArr[0].h.getFastScroll().f40745n) {
                    return r80Var.S.Z(motionEvent);
                }
                q80 q80Var2 = r80Var.S;
                if (q80Var2 != null && q80Var2.P(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 28:
                gt0 gt0Var = (gt0) this.f852b;
                if (motionEvent.getActionMasked() == 0 && (gt0Var.f34194e0 || motionEvent.getY() >= gt0Var.f34189b0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r11, android.view.View r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.o2.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f851a) {
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f851a) {
            case 19:
                ut utVar = (ut) this.f852b;
                d71 d71Var = utVar.k1;
                pt ptVar = utVar.f38862j1;
                super.onDetachedFromWindow();
                try {
                    ie0 ie0Var = ie0.f34683q0;
                    if (ie0Var.Q) {
                        if (ptVar.getVisibility() != 0) {
                        }
                        if (d71Var.f() && !ie0Var.Q) {
                            if (ut.K1 == utVar) {
                                ut.K1 = null;
                            }
                            d71Var.b();
                            return;
                        }
                        return;
                    }
                    if (ptVar.getParent() != null) {
                        removeView(ptVar);
                        ptVar.stopLoading();
                        ptVar.loadUrl("about:blank");
                        ptVar.destroy();
                    }
                    if (d71Var.f()) {
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
        switch (this.f851a) {
            case 3:
                super.onDraw(canvas);
                dh.o oVar = (dh.o) this.f852b;
                if (oVar.f9111y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.f9111y, getWidth(), getHeight(), oVar.E);
                    return;
                }
                return;
            case 14:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.g) this.f852b) == null) {
                    org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                    this.f852b = gVar;
                    gVar.f39353k = false;
                    gVar.f39355m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.g) this.f852b).f39349f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.f852b).a(org.telegram.messenger.g0.L(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 15:
                ((t9) this.f852b).f38356e.a(canvas);
                return;
            case 16:
                uk ukVar = (uk) this.f852b;
                ukVar.f38780a0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, ukVar.f38415a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - ukVar.f38810z0, ukVar.f38780a0);
                return;
            case 27:
                zs0 zs0Var = (zs0) this.f852b;
                zs0Var.f41098l1.setBounds(0, zs0Var.f41099n1 - zs0Var.f28617t0, getMeasuredWidth(), getMeasuredHeight());
                zs0Var.f41098l1.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f851a) {
            case 16:
                uk ukVar = (uk) this.f852b;
                if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() < ukVar.f38807x0 || motionEvent.getY() > ukVar.f38809y0)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 27:
                zs0 zs0Var = (zs0) this.f852b;
                if (motionEvent.getAction() == 0 && zs0Var.f41099n1 != 0 && motionEvent.getY() < zs0Var.f41099n1) {
                    zs0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
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
        switch (this.f851a) {
            case 3:
                super.onLayout(z10, i3, i10, i11, i12);
                dh.o oVar = (dh.o) this.f852b;
                if (oVar.P && z10) {
                    oVar.j0(oVar.R.f53840e);
                    return;
                }
                return;
            case 10:
                int childCount = getChildCount();
                int i19 = i11 - i3;
                int i20 = -1;
                if (((org.telegram.ui.ActionBar.s1) this.f852b).N0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i19 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - org.telegram.messenger.g0.L(8.0f)) / 2);
                    boolean z12 = bd.f21784a0;
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
                            if (bd.f21784a0) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i19 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i19 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (bd.f21784a0) {
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
                            if (bd.f21784a0) {
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
                            if (bd.f21784a0) {
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
                super.onLayout(z10, i3, i10, i11, i12);
                r10 r10Var = (r10) this.f852b;
                r10Var.setTranslationY((getMeasuredHeight() * 0.28f) - (r10Var.getMeasuredWidth() / 2.0f));
                r10Var.setTranslationX((getMeasuredWidth() * 0.82f) - (r10Var.getMeasuredWidth() / 2.0f));
                return;
            case 15:
                super.onLayout(z10, i3, i10, i11, i12);
                int L3 = org.telegram.messenger.g0.L(36.0f);
                int i23 = ((i11 - i3) - L3) / 2;
                int i24 = ((i12 - i10) - L3) / 2;
                ((t9) this.f852b).f38356e.f(i23, i24, i23 + L3, L3 + i24);
                return;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f852b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f31296r0.getMeasuredHeight()) - org.telegram.messenger.g0.L(12.0f);
                if (getMeasuredWidth() == org.telegram.messenger.g0.L(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f31296r0;
                    textView.layout(measuredWidth2 - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f31296r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f31296r0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f31296r0;
                    textView2.layout(measuredWidth2 - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f31296r0.getMeasuredWidth() / 2) + measuredWidth2, chatAttachAlertPhotoLayout.f31296r0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f31284l0;
                shutterButton.layout(measuredWidth2 - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f31284l0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f31284l0.getMeasuredWidth() / 2) + measuredWidth2, (chatAttachAlertPhotoLayout.f31284l0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f31298s0;
                imageView.layout(i16 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f31298s0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f31298s0.getMeasuredWidth() / 2) + i16, (chatAttachAlertPhotoLayout.f31298s0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i27 = 0; i27 < 2; i27++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.T[i27];
                    imageView2.layout(L - (imageView2.getMeasuredWidth() / 2), i17 - (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.T[i27].getMeasuredWidth() / 2) + L, (chatAttachAlertPhotoLayout.T[i27].getMeasuredHeight() / 2) + i17);
                }
                return;
            case 22:
                super.onLayout(z10, i3, i10, i11, i12);
                l10 l10Var = (l10) this.f852b;
                o2 o2Var = l10Var.f35549b;
                int[] iArr = l10Var.H;
                o2Var.getLocationOnScreen(iArr);
                l10Var.O = iArr[0];
                l10Var.N = iArr[1] - org.telegram.messenger.g0.L(25.0f);
                return;
            case 25:
                super.onLayout(z10, i3, i10, i11, i12);
                nk0 nk0Var = (nk0) this.f852b;
                o2 o2Var2 = nk0Var.f36579s;
                qt0 qt0Var = nk0Var.f36580w;
                Drawable drawable = nk0Var.F;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (nk0Var.f36582y != null) {
                        float f11 = nk0Var.I;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = nk0Var.J;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z13 = false;
                        if (!nk0Var.M) {
                            if (f13 - frameLayout.getMeasuredWidth() < org.telegram.messenger.g0.L(8.0f)) {
                                nk0Var.E.setPivotX(org.telegram.messenger.g0.L(6.0f));
                                nk0Var.f36582y.setX(Math.min(qt0Var.getWidth() - nk0Var.f36582y.getWidth(), f12 - org.telegram.messenger.g0.L(10.0f)) - qt0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                nk0Var.E.setPivotX(viewGroup2.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f));
                                f10 = 4.0f;
                                nk0Var.f36582y.setX(Math.max(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(4.0f) + f13) - nk0Var.f36582y.getMeasuredWidth()) - qt0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((nk0Var.f36582y.getX() + nk0Var.f36582y.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - f13;
                            } else {
                                x10 = (nk0Var.f36582y.getX() + org.telegram.messenger.g0.L(10.0f)) - f12;
                            }
                            nk0Var.H = x10;
                        } else {
                            f10 = 4.0f;
                            z11 = false;
                        }
                        if (nk0Var.G != null) {
                            i18 = org.telegram.messenger.g0.L(21.0f);
                        } else {
                            i18 = 0;
                        }
                        float f17 = f16 + i18;
                        if (nk0Var.f36582y.getMeasuredHeight() + f17 > o2Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(16.0f)) {
                            nk0Var.E.setPivotY(viewGroup.getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f));
                            nk0Var.f36582y.setY(((f15 - org.telegram.messenger.g0.L(f10)) - nk0Var.f36582y.getMeasuredHeight()) - qt0Var.getY());
                            z13 = true;
                        } else {
                            nk0Var.E.setPivotY(org.telegram.messenger.g0.L(6.0f));
                            nk0Var.f36582y.setY(Math.min((o2Var2.getHeight() - nk0Var.f36582y.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f), f17) - qt0Var.getY());
                        }
                        f60 f60Var = nk0Var.f36581x;
                        f60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f27334c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z13;
                        return;
                    }
                    return;
                }
                return;
            case 27:
                super.onLayout(z10, i3, i10, i11, i12);
                zs0.I0((zs0) this.f852b);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        View view;
        int L;
        int i12;
        switch (this.f851a) {
            case 0:
                super.onMeasure(i3, i10);
                ((q2) this.f852b).L.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 10:
                super.onMeasure(i3, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i13 = 0;
                if (((org.telegram.ui.ActionBar.s1) this.f852b).N0) {
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
            case 14:
                if (View.MeasureSpec.getSize(i3) > org.telegram.messenger.g0.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(320.0f), 1073741824), i10);
                    return;
                } else {
                    super.onMeasure(i3, i10);
                    return;
                }
            case 19:
                int size = View.MeasureSpec.getSize(i3);
                ut utVar = (ut) this.f852b;
                int min = (int) Math.min(utVar.f38876z1 / (utVar.f38875y1 / size), org.telegram.messenger.g0.f22608q.y / 2);
                if (utVar.B1) {
                    i11 = 22;
                } else {
                    i11 = 0;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11 + 84) + min + 1, 1073741824));
                return;
            case 20:
                ex exVar = (ex) this.f852b;
                if (((View) exVar.G.getParent()) != null) {
                    L = (int) (view.getMeasuredHeight() - exVar.G.getY());
                } else {
                    L = org.telegram.messenger.g0.L(120.0f);
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L - exVar.G.f33527c1, 1073741824));
                return;
            case 21:
                ey eyVar = ((yx) this.f852b).R;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.camera.q.y(8.0f, eyVar.E0.getMeasuredHeight() - eyVar.f33527c1, 3) * 1.7f), 1073741824));
                return;
            case 27:
                zs0 zs0Var = (zs0) this.f852b;
                ci.j1 j1Var = zs0Var.f41097j1;
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.f22602m;
                getMeasuredWidth();
                int D = org.telegram.messenger.k5.D(54.0f, ld.g(), org.telegram.messenger.k5.C(56.0f, org.telegram.messenger.g0.L(56.0f), 1));
                int i15 = size2 / 5;
                if (D < i15 * 3) {
                    i12 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    i12 = i15 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (j1Var.getPaddingTop() != i12) {
                    zs0Var.f41100o1 = true;
                    j1Var.setPadding(0, i12, 0, org.telegram.messenger.g0.L(8.0f));
                    zs0Var.f41100o1 = false;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f851a) {
            case 25:
                super.onSizeChanged(i3, i10, i11, i12);
                nk0 nk0Var = (nk0) this.f852b;
                jh.d.c(nk0Var.h, nk0Var.f36579s);
                ViewGroup viewGroup = nk0Var.E;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f851a) {
            case 27:
                if (!((zs0) this.f852b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f851a) {
            case 8:
                super.onViewAdded(view);
                bringChildToFront((mh.f) this.f852b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f851a) {
            case 24:
                tj0 tj0Var = (tj0) this.f852b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(tj0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tj0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, tj0Var.f38438c1.getMeasuredWidth(), tj0Var.f38438c1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                if (!((zs0) this.f852b).f41100o1) {
                    super.requestLayout();
                    return;
                }
                return;
            case 29:
                if (!((xv0) this.f852b).Y1) {
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
        switch (this.f851a) {
            case 1:
                super.setTranslationY(f10);
                ci.l6 l6Var = (ci.l6) this.f852b;
                ci.q4 q4Var = l6Var.X1;
                if (q4Var != null && q4Var.getVisibility() == 0) {
                    l6Var.X1.invalidate();
                    return;
                }
                return;
            case 5:
                va vaVar = (va) this.f852b;
                if (getTranslationY() != f10 && vaVar.f13710d1 != null) {
                    super.setTranslationY(f10);
                    vaVar.f13710d1.y();
                    return;
                }
                return;
            case 11:
                super.setTranslationY(f10);
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f852b;
                FrameLayout frameLayout = t2Var.F;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(t2Var.f28589c.getHeight() - t2Var.f28586b.getY())) + t2Var.f28617t0);
                }
                t2Var.g0(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f851a) {
            case 22:
                super.setVisibility(i3);
                ((l10) this.f852b).d.setVisibility(i3);
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    public o2(Context context, int i3) {
        super(context);
        this.f851a = i3;
    }

    public o2(Context context) {
        super(context);
        this.f851a = 8;
        mh.f fVar = new mh.f(context);
        this.f852b = fVar;
        addView(fVar, mf.g());
    }

    public o2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f851a = 18;
        this.f852b = new yn[2];
        int i3 = 0;
        while (true) {
            yn[] ynVarArr = (yn[]) this.f852b;
            if (i3 < ynVarArr.length) {
                ynVarArr[i3] = new yn(context, e6Var);
                addView(((yn[]) this.f852b)[i3], mf.e(-1, -1, 119));
                i3++;
            } else {
                ynVarArr[0].setVisibility(0);
                ((yn[]) this.f852b)[1].setVisibility(8);
                return;
            }
        }
    }

    public o2(Context context, String str, ei.b bVar) {
        super(context);
        this.f851a = 4;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, bVar)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.06f, i3);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, bVar);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, mf.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f852b = h6Var;
        h6Var.b(0.6f, 450L, xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, bVar);
        h6Var.setScaleProperty(0.7f);
        h6Var.setGravity(17);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setAllowCancel(true);
        f10.addView(h6Var, mf.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, bVar);
        textView.setGravity(17);
        f10.addView(textView, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public o2(dh.o oVar, Context context) {
        super(context);
        this.f851a = 3;
        this.f852b = oVar;
        setWillNotDraw(false);
    }

    public o2(gt0 gt0Var, Context context) {
        super(context);
        this.f851a = 28;
        this.f852b = gt0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    public o2(Context context, r10 r10Var) {
        super(context);
        this.f851a = 13;
        this.f852b = r10Var;
    }
}
