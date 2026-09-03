package kh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.n9;
import org.telegram.ui.oa1;
import org.telegram.ui.pb0;
import org.telegram.ui.pg0;
import org.telegram.ui.w81;
import org.telegram.ui.xn;
public final class i4 extends qv0 {
    public final int f10778t0;
    public final Object f10779u0;

    public i4(Object obj, Context context, int i10) {
        super(context, null);
        this.f10778t0 = i10;
        this.f10779u0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        switch (this.f10778t0) {
            case 1:
                n9 n9Var = (n9) this.f10779u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && n9Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    n9Var.W.H(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f10779u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f31531r0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    contactsActivity.f31531r0.H(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                w81 w81Var = (w81) this.f10779u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && w81Var.T != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    w81Var.T.H(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                oa1 oa1Var = (oa1) this.f10779u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && oa1Var.A0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    oa1Var.A0.H(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
        switch (this.f10778t0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f10778t0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10778t0) {
            case 1:
                n9 n9Var = (n9) this.f10779u0;
                sg.d dVar = n9Var.X;
                sg.d dVar2 = n9Var.W;
                ng.e eVar = n9Var.V;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    n9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f44379n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(n9Var.getThemedColor(j6.f19827a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.f44379n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(n9Var.getThemedColor(j6.f19827a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f10779u0;
                sg.d dVar3 = contactsActivity.f31533s0;
                sg.d dVar4 = contactsActivity.f31531r0;
                ng.e eVar2 = contactsActivity.f31529q0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f44379n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(j6.f19881d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -3);
                        }
                        dVar4.c();
                    }
                    if (dVar3 != null && !dVar3.f44379n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(j6.f19881d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a12, -2);
                        }
                        dVar3.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                w81 w81Var = (w81) this.f10779u0;
                sg.d dVar5 = w81Var.U;
                sg.d dVar6 = w81Var.T;
                ng.e eVar3 = w81Var.S;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    w81Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f44379n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(w81Var.getThemedColor(j6.f19881d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -3);
                        }
                        dVar6.c();
                    }
                    if (dVar5 != null && !dVar5.f44379n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(w81Var.getThemedColor(j6.f19881d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a14, -2);
                        }
                        dVar5.c();
                    }
                }
                super.dispatchDraw(canvas);
                if (!w81Var.J) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, w81Var.getThemedColor(j6.f19881d6), w81Var.P);
                    return;
                }
                return;
            case 9:
                oa1 oa1Var = (oa1) this.f10779u0;
                sg.d dVar7 = oa1Var.B0;
                sg.d dVar8 = oa1Var.A0;
                ng.e eVar4 = oa1Var.f36745z0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    oa1.W(oa1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f44379n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(oa1Var.getThemedColor(j6.f19881d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -3);
                        }
                        dVar8.c();
                    }
                    if (dVar7 != null && !dVar7.f44379n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(oa1Var.getThemedColor(j6.f19881d6));
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
        switch (this.f10778t0) {
            case 2:
                if (motionEvent.getY() < ((rb0) this.f10779u0).Q) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f10778t0) {
            case 8:
                ((w81) this.f10779u0).p0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f10778t0) {
            case 2:
                Drawable d = ((xn) ((rb0) this.f10779u0).W.C).d();
                if (d == null) {
                    return super.getNewDrawable();
                }
                return d;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public f6 getResourceProvider() {
        switch (this.f10778t0) {
            case 3:
                return ((f01) this.f10779u0).f24756c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: kh.i4.onLayout(boolean, int, int, int, int):void");
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
        switch (this.f10778t0) {
            case 0:
                q5 q5Var = (q5) this.f10779u0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.f10884y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i17 = 0;
                if (q5.Z(q5Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q5Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (q5.a0(q5Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i13;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) q5Var.f10879n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (q5.b0(q5Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i14;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) q5Var.f10882w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (q5.c0(q5Var).getOccupyStatusBar()) {
                    i17 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i17;
                super.onMeasure(i10, i11);
                return;
            case 1:
                n9 n9Var = (n9) this.f10779u0;
                measureChildWithMargins(n9.b0(n9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) n9Var.J.getLayoutParams()).topMargin = n9.c0(n9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) n9Var.f36412b.getLayoutParams()).topMargin = n9.d0(n9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) n9Var.f36418r.getLayoutParams()).topMargin = n9.a0(n9Var).getMeasuredHeight();
                n9Var.i0();
                super.onMeasure(i10, i11);
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((f01) this.f10779u0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f10779u0;
                kVar = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.V.getLayoutParams()).topMargin = kVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 5:
                pb0 pb0Var = (pb0) this.f10779u0;
                super.onMeasure(i10, i11);
                R();
                int i18 = this.f28291f;
                if (i18 != 0 && i18 < AndroidUtilities.dp(20.0f)) {
                    pb0Var.C.clearFocus();
                    pb0Var.H.clearFocus();
                }
                FrameLayout frameLayout = pb0Var.E;
                if (this.f28291f > AndroidUtilities.dp(20.0f)) {
                    i15 = 8;
                } else {
                    i15 = 0;
                }
                frameLayout.setVisibility(i15);
                return;
            case 6:
                pg0 pg0Var = (pg0) this.f10779u0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pg0Var.K.getLayoutParams();
                int i19 = 0;
                if (pg0Var.h1()) {
                    i16 = AndroidUtilities.dp(226.0f);
                } else {
                    i16 = 0;
                }
                if (pg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i16 -= R();
                }
                ic icVar = ic.f25664w;
                if (icVar != null && icVar.f25673l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.ui.b.C(10.0f, ic.f25664w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i16);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i16;
                }
                if (!AndroidUtilities.isTablet()) {
                    i19 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) pg0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                ((ViewGroup.MarginLayoutParams) pg0Var.T.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                ((ViewGroup.MarginLayoutParams) pg0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                TextView textView = pg0Var.f37131c0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                }
                if (R() > AndroidUtilities.dp(20.0f) && pg0Var.f37130c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !pg0Var.X) {
                    ValueAnimator valueAnimator = pg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pg0Var.f37130c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f10779u0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f31916b.getEmojiPadding();
                }
                int i20 = size2;
                int childCount = getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = getChildAt(i21);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f31916b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f31916b.J1) {
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
