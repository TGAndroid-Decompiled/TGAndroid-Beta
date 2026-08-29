package ih;

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
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.b81;
import org.telegram.ui.eb0;
import org.telegram.ui.fg0;
import org.telegram.ui.h9;
import org.telegram.ui.rn;
import org.telegram.ui.t91;
public final class j4 extends hv0 {
    public final int f9253s0;
    public final Object f9254t0;

    public j4(Object obj, Context context, int i10) {
        super(context, null);
        this.f9253s0 = i10;
        this.f9254t0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
        switch (this.f9253s0) {
            case 1:
                h9 h9Var = (h9) this.f9254t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && h9Var.V != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f9);
                    h9Var.V.E0(canvas, rect.left, rect.top + f9, rect.right, rect.bottom + f9);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f9254t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f35499q0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f9);
                    contactsActivity.f35499q0.E0(canvas, rect.left, rect.top + f9, rect.right, rect.bottom + f9);
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
                b81 b81Var = (b81) this.f9254t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && b81Var.S != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f9);
                    b81Var.S.E0(canvas, rect.left, rect.top + f9, rect.right, rect.bottom + f9);
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
                t91 t91Var = (t91) this.f9254t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && t91Var.f42623z0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f9);
                    t91Var.f42623z0.E0(canvas, rect.left, rect.top + f9, rect.right, rect.bottom + f9);
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
                super.J(canvas, f9, rect, paint, z10);
                return;
        }
    }

    @Override
    public boolean P() {
        switch (this.f9253s0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f9253s0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9253s0) {
            case 1:
                h9 h9Var = (h9) this.f9254t0;
                qg.d dVar = h9Var.W;
                qg.d dVar2 = h9Var.V;
                lg.e eVar = h9Var.U;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    h9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f46673n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(h9Var.getThemedColor(g6.f23009a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.f46673n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(h9Var.getThemedColor(g6.f23009a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a10, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f9254t0;
                qg.d dVar3 = contactsActivity.f35501r0;
                qg.d dVar4 = contactsActivity.f35499q0;
                lg.e eVar2 = contactsActivity.f35498p0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f46673n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(g6.f23062d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.f46673n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(g6.f23062d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a12, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                b81 b81Var = (b81) this.f9254t0;
                qg.d dVar5 = b81Var.T;
                qg.d dVar6 = b81Var.S;
                lg.e eVar3 = b81Var.R;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    b81Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f46673n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(b81Var.getThemedColor(g6.f23062d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.f46673n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(b81Var.getThemedColor(g6.f23062d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a14, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!b81Var.I) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, b81Var.getThemedColor(g6.f23062d6), b81Var.O);
                    return;
                }
                return;
            case 9:
                t91 t91Var = (t91) this.f9254t0;
                qg.d dVar7 = t91Var.A0;
                qg.d dVar8 = t91Var.f42623z0;
                lg.e eVar4 = t91Var.f42622y0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    t91.W(t91Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f46673n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(t91Var.getThemedColor(g6.f23062d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.f46673n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(t91Var.getThemedColor(g6.f23062d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a16, -2);
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
        switch (this.f9253s0) {
            case 2:
                if (motionEvent.getY() < ((lb0) this.f9254t0).P) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f9253s0) {
            case 8:
                ((b81) this.f9254t0).p0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f9253s0) {
            case 2:
                Drawable d = ((rn) ((lb0) this.f9254t0).V.B).d();
                if (d == null) {
                    return super.getNewDrawable();
                }
                return d;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.f9253s0) {
            case 3:
                return ((uz0) this.f9254t0).f33399c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: ih.j4.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int i15;
        int i16;
        switch (this.f9253s0) {
            case 0:
                r5 r5Var = (r5) this.f9254t0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r5Var.f9364y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int i17 = 0;
                if (r5.Z(r5Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r5Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (r5.a0(r5Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i13;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r5Var.f9359n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (r5.b0(r5Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i14;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) r5Var.f9362w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (r5.c0(r5Var).getOccupyStatusBar()) {
                    i17 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i17;
                super.onMeasure(i10, i11);
                return;
            case 1:
                h9 h9Var = (h9) this.f9254t0;
                measureChildWithMargins(h9.b0(h9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) h9Var.I.getLayoutParams()).topMargin = h9.c0(h9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) h9Var.f38789b.getLayoutParams()).topMargin = h9.d0(h9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) h9Var.f38795r.getLayoutParams()).topMargin = h9.a0(h9Var).getMeasuredHeight();
                h9Var.i0();
                super.onMeasure(i10, i11);
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((uz0) this.f9254t0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f9254t0;
                lVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                lVar2 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f35485e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + lVar2.getMeasuredHeight();
                lVar3 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.U.getLayoutParams()).topMargin = lVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 5:
                eb0 eb0Var = (eb0) this.f9254t0;
                super.onMeasure(i10, i11);
                R();
                int i18 = this.f29245f;
                if (i18 != 0 && i18 < AndroidUtilities.dp(20.0f)) {
                    eb0Var.B.clearFocus();
                    eb0Var.G.clearFocus();
                }
                FrameLayout frameLayout = eb0Var.D;
                if (this.f29245f > AndroidUtilities.dp(20.0f)) {
                    i15 = 8;
                } else {
                    i15 = 0;
                }
                frameLayout.setVisibility(i15);
                return;
            case 6:
                fg0 fg0Var = (fg0) this.f9254t0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fg0Var.J.getLayoutParams();
                int i19 = 0;
                if (fg0Var.h1()) {
                    i16 = AndroidUtilities.dp(226.0f);
                } else {
                    i16 = 0;
                }
                if (fg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i16 -= R();
                }
                mc mcVar = mc.f30644w;
                if (mcVar != null && mcVar.f30654l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.ui.b.C(10.0f, mc.f30644w.f30648e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i16);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i16;
                }
                if (!AndroidUtilities.isTablet()) {
                    i19 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) fg0Var.Q.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                ((ViewGroup.MarginLayoutParams) fg0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                ((ViewGroup.MarginLayoutParams) fg0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                TextView textView = fg0Var.f38154b0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i19;
                }
                if (R() > AndroidUtilities.dp(20.0f) && fg0Var.f38155c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !fg0Var.W) {
                    ValueAnimator valueAnimator = fg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fg0Var.f38155c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f9254t0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f35895b.getEmojiPadding();
                }
                int i20 = size2;
                int childCount = getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = getChildAt(i21);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f35895b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f35895b.I1) {
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
