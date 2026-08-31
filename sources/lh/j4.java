package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ha1;
import org.telegram.ui.l9;
import org.telegram.ui.ob0;
import org.telegram.ui.og0;
import org.telegram.ui.p81;
import org.telegram.ui.vn;
public final class j4 extends qv0 {
    public final int f12822t0;
    public final Object f12823u0;

    public j4(Object obj, Context context, int i10) {
        super(context, null);
        this.f12822t0 = i10;
        this.f12823u0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        switch (this.f12822t0) {
            case 1:
                l9 l9Var = (l9) this.f12823u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && l9Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    l9Var.W.I(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12823u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f34074r0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    contactsActivity.f34074r0.I(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha2 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha2);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            case 8:
                p81 p81Var = (p81) this.f12823u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && p81Var.T != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    p81Var.T.I(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha3 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha3);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            case 9:
                ha1 ha1Var = (ha1) this.f12823u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && ha1Var.A0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    ha1Var.A0.I(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha4 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha4);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            default:
                super.J(canvas, f10, rect, paint, z4);
                return;
        }
    }

    @Override
    public boolean P() {
        switch (this.f12822t0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f12822t0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f12822t0) {
            case 1:
                l9 l9Var = (l9) this.f12823u0;
                tg.d dVar = l9Var.X;
                tg.d dVar2 = l9Var.W;
                og.e eVar = l9Var.V;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    l9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f48092n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(l9Var.getThemedColor(k6.f21605a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.f48092n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(l9Var.getThemedColor(k6.f21605a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12823u0;
                tg.d dVar3 = contactsActivity.f34076s0;
                tg.d dVar4 = contactsActivity.f34074r0;
                og.e eVar2 = contactsActivity.f34072q0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f48092n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(k6.f21659d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -3);
                        }
                        dVar4.c();
                    }
                    if (dVar3 != null && !dVar3.f48092n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(k6.f21659d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a12, -2);
                        }
                        dVar3.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                p81 p81Var = (p81) this.f12823u0;
                tg.d dVar5 = p81Var.U;
                tg.d dVar6 = p81Var.T;
                og.e eVar3 = p81Var.S;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    p81Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f48092n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(p81Var.getThemedColor(k6.f21659d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -3);
                        }
                        dVar6.c();
                    }
                    if (dVar5 != null && !dVar5.f48092n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(p81Var.getThemedColor(k6.f21659d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a14, -2);
                        }
                        dVar5.c();
                    }
                }
                super.dispatchDraw(canvas);
                if (!p81Var.J) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, p81Var.getThemedColor(k6.f21659d6), p81Var.P);
                    return;
                }
                return;
            case 9:
                ha1 ha1Var = (ha1) this.f12823u0;
                tg.d dVar7 = ha1Var.B0;
                tg.d dVar8 = ha1Var.A0;
                og.e eVar4 = ha1Var.f37451z0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    ha1.W(ha1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f48092n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(ha1Var.getThemedColor(k6.f21659d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -3);
                        }
                        dVar8.c();
                    }
                    if (dVar7 != null && !dVar7.f48092n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(ha1Var.getThemedColor(k6.f21659d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a16, -2);
                        }
                        dVar7.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12822t0) {
            case 2:
                if (motionEvent.getY() < ((sb0) this.f12823u0).Q) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f12822t0) {
            case 8:
                ((p81) this.f12823u0).p0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f12822t0) {
            case 2:
                Drawable d = ((vn) ((sb0) this.f12823u0).W.C).d();
                if (d == null) {
                    return super.getNewDrawable();
                }
                return d;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public g6 getResourceProvider() {
        switch (this.f12822t0) {
            case 3:
                return ((g01) this.f12823u0).f27059c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: lh.j4.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int i15;
        int i16;
        switch (this.f12822t0) {
            case 0:
                r5 r5Var = (r5) this.f12823u0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r5Var.f12935y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i17 = 0;
                if (r5.Z(r5Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r5Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (r5.a0(r5Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i13;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r5Var.f12930n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (r5.b0(r5Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i14;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) r5Var.f12933w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (r5.c0(r5Var).getOccupyStatusBar()) {
                    i17 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i17;
                super.onMeasure(i10, i11);
                return;
            case 1:
                l9 l9Var = (l9) this.f12823u0;
                measureChildWithMargins(l9.b0(l9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) l9Var.J.getLayoutParams()).topMargin = l9.c0(l9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) l9Var.f38670b.getLayoutParams()).topMargin = l9.d0(l9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) l9Var.f38677r.getLayoutParams()).topMargin = l9.a0(l9Var).getMeasuredHeight();
                l9Var.i0();
                super.onMeasure(i10, i11);
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((g01) this.f12823u0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12823u0;
                kVar = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f34058e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.V.getLayoutParams()).topMargin = kVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 5:
                ob0 ob0Var = (ob0) this.f12823u0;
                super.onMeasure(i10, i11);
                R();
                int i18 = this.f30496f;
                if (i18 != 0 && i18 < AndroidUtilities.dp(20.0f)) {
                    ob0Var.C.clearFocus();
                    ob0Var.H.clearFocus();
                }
                FrameLayout frameLayout = ob0Var.E;
                if (this.f30496f > AndroidUtilities.dp(20.0f)) {
                    i15 = 8;
                } else {
                    i15 = 0;
                }
                frameLayout.setVisibility(i15);
                return;
            case 6:
                og0 og0Var = (og0) this.f12823u0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) og0Var.K.getLayoutParams();
                int i19 = 0;
                if (og0Var.h1()) {
                    i16 = AndroidUtilities.dp(226.0f);
                } else {
                    i16 = 0;
                }
                if (og0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i16 -= R();
                }
                ic icVar = ic.f27737w;
                if (icVar != null && icVar.f27747l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.ui.b.C(10.0f, ic.f27737w.f27741e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i16);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i16;
                }
                if (!AndroidUtilities.isTablet()) {
                    i19 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) og0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                ((ViewGroup.MarginLayoutParams) og0Var.T.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                ((ViewGroup.MarginLayoutParams) og0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                TextView textView = og0Var.f39755c0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                }
                if (R() > AndroidUtilities.dp(20.0f) && og0Var.f39754c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !og0Var.X) {
                    ValueAnimator valueAnimator = og0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    og0Var.f39754c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f12823u0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f34470b.getEmojiPadding();
                }
                int i20 = size2;
                int childCount = getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = getChildAt(i21);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f34470b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f34470b.J1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i20), 1073741824));
                        }
                    }
                }
                return;
        }
    }
}
