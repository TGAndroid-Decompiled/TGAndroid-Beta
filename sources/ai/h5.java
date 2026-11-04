package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.c31;
import org.telegram.ui.e90;
import org.telegram.ui.h9;
import org.telegram.ui.um;
import org.telegram.ui.xd0;
public final class h5 extends qt0 {
    public final int f680g0;
    public Object f681h0;

    public h5(int i3, Context context, Object obj) {
        super(context, null);
        this.f680g0 = i3;
        this.f681h0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f680g0) {
            case 3:
                return false;
            case 6:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public boolean P() {
        switch (this.f680g0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f680g0) {
            case 5:
                if (view instanceof ey) {
                    ViewGroup.LayoutParams layoutParams = ((ey) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                return;
            default:
                super.addView(view);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f680g0) {
            case 10:
                c31 c31Var = (c31) this.f681h0;
                c31Var.p0();
                super.dispatchDraw(canvas);
                c31.i0(c31Var).g();
                if (!c31Var.O) {
                    org.telegram.messenger.g0.O(canvas, this, c31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6), c31Var.f44220d0, 1.0f);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f680g0) {
            case 2:
                if (motionEvent.getY() < ((x90) this.f681h0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f680g0) {
            case 2:
                Drawable m10 = ((um) ((x90) this.f681h0).f40291d0.G).m();
                if (m10 == null) {
                    return super.getNewDrawable();
                }
                return m10;
            case 6:
                if (az.H0) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28200ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f681h0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f681h0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f681h0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f680g0) {
            case 6:
                if (!az.H0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.f680g0) {
            case 3:
                return ((dy0) this.f681h0).f33210c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        int i14;
        int i15;
        switch (this.f680g0) {
            case 0:
                i6 i6Var = (i6) this.f681h0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i6Var.E.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i16 = 0;
                if (i6.e0(i6Var).getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.g0.f22602m;
                } else {
                    i11 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i11;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i6Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (i6.f0(i6Var).getOccupyStatusBar()) {
                    i12 = org.telegram.messenger.g0.f22602m;
                } else {
                    i12 = 0;
                }
                layoutParams2.topMargin = org.telegram.messenger.g0.L(47.0f) + currentActionBarHeight2 + i12;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i6Var.f721n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (i6.g0(i6Var).getOccupyStatusBar()) {
                    i13 = org.telegram.messenger.g0.f22602m;
                } else {
                    i13 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i13;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) i6Var.f725x.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (i6.h0(i6Var).getOccupyStatusBar()) {
                    i16 = org.telegram.messenger.g0.f22602m;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i16;
                super.onMeasure(i3, i10);
                return;
            case 1:
                ((h9) this.f681h0).h0();
                super.onMeasure(i3, i10);
                return;
            case 2:
            case 5:
            case 6:
            default:
                super.onMeasure(i3, i10);
                return;
            case 3:
                super.onMeasure(i3, i10);
                setMeasuredDimension(View.MeasureSpec.getSize(i3), ((dy0) this.f681h0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                return;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.f681h0;
                y4Var = ((org.telegram.ui.ActionBar.d2) contactsActivity).simpleActionBar;
                measureChildWithMargins(y4Var, i3, 0, i10, 0);
                y4Var2 = ((org.telegram.ui.ActionBar.d2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f41211c.getLayoutParams()).topMargin = y4Var2.getMeasuredHeight();
                super.onMeasure(i3, i10);
                return;
            case 7:
                e90 e90Var = (e90) this.f681h0;
                super.onMeasure(i3, i10);
                Q();
                int i17 = this.f37535f;
                if (i17 != 0 && i17 < org.telegram.messenger.g0.L(20.0f)) {
                    e90Var.G.clearFocus();
                    e90Var.L.clearFocus();
                }
                FrameLayout frameLayout = e90Var.I;
                if (this.f37535f > org.telegram.messenger.g0.L(20.0f)) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                frameLayout.setVisibility(i14);
                return;
            case 8:
                xd0 xd0Var = (xd0) this.f681h0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xd0Var.O.getLayoutParams();
                int i18 = 0;
                if (xd0Var.q1()) {
                    i15 = org.telegram.messenger.g0.L(226.0f);
                } else {
                    i15 = 0;
                }
                if (xd0Var.q1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    i15 -= Q();
                }
                ac acVar = ac.f31784w;
                if (acVar != null && acVar.f31794l) {
                    super.onMeasure(i3, i10);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.camera.q.D(10.0f, ac.f31784w.f31788e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), i15);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f) + i15;
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    i18 = org.telegram.messenger.g0.f22602m;
                }
                ((ViewGroup.MarginLayoutParams) xd0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) xd0Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) xd0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i18;
                TextView textView = xd0Var.f51957g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i18;
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && xd0Var.f51950c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !xd0Var.f51949b0) {
                    ValueAnimator valueAnimator = xd0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    xd0Var.f51950c.setVisibility(8);
                }
                super.onMeasure(i3, i10);
                return;
            case 9:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f681h0;
                View.MeasureSpec.getMode(i3);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f41621b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f41621b.s0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f41621b.O1) {
                            measureChildWithMargins(childAt, i3, 0, i10, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
        }
    }

    @Override
    public void updateColors() {
        switch (this.f680g0) {
            case 10:
                try {
                    ((c31) this.f681h0).q0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                return;
        }
    }

    public h5(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.f680g0 = 6;
    }
}
