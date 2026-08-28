package fh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.bb0;
import org.telegram.ui.fg0;
import org.telegram.ui.i9;
import org.telegram.ui.on;
import org.telegram.ui.s91;
import org.telegram.ui.z71;
public final class x4 extends xu0 {
    public final int f6866s0;
    public final Object f6867t0;

    public x4(Object obj, Context context, int i9) {
        super(context, null);
        this.f6866s0 = i9;
        this.f6867t0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        switch (this.f6866s0) {
            case 1:
                i9 i9Var = (i9) this.f6867t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && i9Var.V != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    i9Var.V.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f6867t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f35432q0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    contactsActivity.f35432q0.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                z71 z71Var = (z71) this.f6867t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && z71Var.S != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    z71Var.S.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                s91 s91Var = (s91) this.f6867t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && s91Var.f42641z0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    s91Var.f42641z0.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                super.J(canvas, f10, rect, paint, z10);
                return;
        }
    }

    @Override
    public boolean P() {
        switch (this.f6866s0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f6866s0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void d() {
        switch (this.f6866s0) {
            case 8:
                ((z71) this.f6867t0).o0();
                return;
            default:
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6866s0) {
            case 1:
                i9 i9Var = (i9) this.f6867t0;
                ng.d dVar = i9Var.W;
                ng.d dVar2 = i9Var.V;
                ig.e eVar = i9Var.U;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    i9Var.e0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f18606n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(i9Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.f18606n) {
                        RecordingCanvas a3 = dVar.a(measuredWidth, measuredHeight);
                        a3.drawColor(i9Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a3, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f6867t0;
                ng.d dVar3 = contactsActivity.f35434r0;
                ng.d dVar4 = contactsActivity.f35432q0;
                ig.e eVar2 = contactsActivity.f35431p0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f18606n) {
                        RecordingCanvas a10 = dVar4.a(measuredWidth2, measuredHeight2);
                        a10.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a10, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.f18606n) {
                        RecordingCanvas a11 = dVar3.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                z71 z71Var = (z71) this.f6867t0;
                ng.d dVar5 = z71Var.T;
                ng.d dVar6 = z71Var.S;
                ig.e eVar3 = z71Var.R;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    z71Var.h0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f18606n) {
                        RecordingCanvas a12 = dVar6.a(measuredWidth3, measuredHeight3);
                        a12.drawColor(z71Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a12, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.f18606n) {
                        RecordingCanvas a13 = dVar5.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(z71Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!z71Var.I) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, z71Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6), z71Var.O);
                    return;
                }
                return;
            case 9:
                s91 s91Var = (s91) this.f6867t0;
                ng.d dVar7 = s91Var.A0;
                ng.d dVar8 = s91Var.f42641z0;
                ig.e eVar4 = s91Var.f42640y0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    s91.V(s91Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f18606n) {
                        RecordingCanvas a14 = dVar8.a(measuredWidth4, measuredHeight4);
                        a14.drawColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a14, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.f18606n) {
                        RecordingCanvas a15 = dVar7.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -2);
                        }
                        dVar7.b();
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
        switch (this.f6866s0) {
            case 2:
                if (motionEvent.getY() < ((wa0) this.f6867t0).P) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f6866s0) {
            case 2:
                Drawable d = ((on) ((wa0) this.f6867t0).V.B).d();
                if (d == null) {
                    return super.getNewDrawable();
                }
                return d;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.b6 getResourceProvider() {
        switch (this.f6866s0) {
            case 3:
                return ((iz0) this.f6867t0).f29550c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: fh.x4.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int i14;
        int i15;
        switch (this.f6866s0) {
            case 0:
                g6 g6Var = (g6) this.f6867t0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g6Var.f6492y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i16 = 0;
                if (g6.Y(g6Var).getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i11;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g6Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (g6.Z(g6Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i12;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) g6Var.f6487n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (g6.a0(g6Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i13;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) g6Var.f6490w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (g6.b0(g6Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i16;
                super.onMeasure(i9, i10);
                return;
            case 1:
                i9 i9Var = (i9) this.f6867t0;
                measureChildWithMargins(i9.a0(i9Var), i9, 0, i10, 0);
                ((ViewGroup.MarginLayoutParams) i9Var.I.getLayoutParams()).topMargin = i9.b0(i9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) i9Var.f39070b.getLayoutParams()).topMargin = i9.c0(i9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) i9Var.f39076r.getLayoutParams()).topMargin = i9.Z(i9Var).getMeasuredHeight();
                i9Var.h0();
                super.onMeasure(i9, i10);
                return;
            case 2:
            default:
                super.onMeasure(i9, i10);
                return;
            case 3:
                super.onMeasure(i9, i10);
                setMeasuredDimension(View.MeasureSpec.getSize(i9), ((iz0) this.f6867t0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f6867t0;
                kVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                measureChildWithMargins(kVar, i9, 0, i10, 0);
                kVar2 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f35418e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.U.getLayoutParams()).topMargin = kVar3.getMeasuredHeight();
                contactsActivity.i0();
                super.onMeasure(i9, i10);
                return;
            case 5:
                bb0 bb0Var = (bb0) this.f6867t0;
                super.onMeasure(i9, i10);
                R();
                int i17 = this.f34780f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    bb0Var.B.clearFocus();
                    bb0Var.G.clearFocus();
                }
                FrameLayout frameLayout = bb0Var.D;
                if (this.f34780f > AndroidUtilities.dp(20.0f)) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                frameLayout.setVisibility(i14);
                return;
            case 6:
                fg0 fg0Var = (fg0) this.f6867t0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fg0Var.J.getLayoutParams();
                int i18 = 0;
                if (fg0Var.h1()) {
                    i15 = AndroidUtilities.dp(226.0f);
                } else {
                    i15 = 0;
                }
                if (fg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i15 -= R();
                }
                gc gcVar = gc.f28729w;
                if (gcVar != null && gcVar.f28739l) {
                    super.onMeasure(i9, i10);
                    marginLayoutParams.bottomMargin = ll.D(10.0f, gc.f28729w.f28733e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i15);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i15;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) fg0Var.Q.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) fg0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) fg0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = fg0Var.f38262b0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (R() > AndroidUtilities.dp(20.0f) && fg0Var.f38263c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !fg0Var.W) {
                    ValueAnimator valueAnimator = fg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fg0Var.f38263c.setVisibility(8);
                }
                super.onMeasure(i9, i10);
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f6867t0;
                View.MeasureSpec.getMode(i9);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f35829b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f35829b.t0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f35829b.I1) {
                            measureChildWithMargins(childAt, i9, 0, i10, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
        }
    }
}
