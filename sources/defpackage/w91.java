package defpackage;

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
public final class w91 extends ela {
    public final byte m0;
    public Object n0;

    public w91(byte b, Context context, Object obj) {
        super(context, null);
        this.m0 = b;
        this.n0 = obj;
    }

    @Override
    public final boolean O() {
        switch (this.m0) {
            case 3:
            case 9:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public final boolean P() {
        switch (this.m0) {
            case 9:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public final void addView(View view) {
        switch (this.m0) {
            case 2:
                if (view instanceof e34) {
                    ViewGroup.LayoutParams layoutParams = ((e34) view).getLayoutParams();
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
    public final void dispatchDraw(Canvas canvas) {
        sy4 sy4Var;
        switch (this.m0) {
            case 8:
                daa daaVar = (daa) this.n0;
                daaVar.p0();
                super.dispatchDraw(canvas);
                sy4Var = ((d) daaVar).glassEngine;
                sy4Var.g();
                if (!daaVar.O) {
                    gm.O(canvas, this, daaVar.getThemedColor(cmb.c6), daaVar.d0, 1.0f);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 6:
                if (motionEvent.getY() < ((f57) this.n0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final Drawable getNewDrawable() {
        switch (this.m0) {
            case 3:
                if (gda.D0) {
                    int w0 = cmb.w0(null, cmb.ta, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.n0;
                    if (colorDrawable == null || colorDrawable.getColor() != w0) {
                        this.n0 = new ColorDrawable(w0);
                    }
                    return (ColorDrawable) this.n0;
                }
                return super.getNewDrawable();
            case 6:
                Drawable l = ((wv1) ((f57) this.n0).d0.G).l();
                if (l == null) {
                    return super.getNewDrawable();
                }
                return l;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public final boolean getNewDrawableMotion() {
        switch (this.m0) {
            case 3:
                if (!gda.D0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public final ylb getResourceProvider() {
        switch (this.m0) {
            case 9:
                return ((xhb) this.n0).c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w91.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 8;
        int i5 = 0;
        switch (this.m0) {
            case 0:
                ((ia1) this.n0).c0();
                super.onMeasure(i, i2);
                return;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) this.n0;
                measureChildWithMargins(ContactsActivity.a0(contactsActivity), i, 0, i2, 0);
                ((ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams()).topMargin = ContactsActivity.b0(contactsActivity).getMeasuredHeight();
                super.onMeasure(i, i2);
                return;
            case 2:
            case 3:
            case 6:
            case 8:
            default:
                super.onMeasure(i, i2);
                return;
            case 4:
                s56 s56Var = (s56) this.n0;
                super.onMeasure(i, i2);
                Q();
                int i6 = this.f;
                if (i6 != 0 && i6 < gm.L(20.0f)) {
                    s56Var.G.clearFocus();
                    s56Var.L.clearFocus();
                }
                FrameLayout frameLayout = s56Var.I;
                if (this.f <= gm.L(20.0f)) {
                    i4 = 0;
                }
                frameLayout.setVisibility(i4);
                return;
            case 5:
                mh6 mh6Var = (mh6) this.n0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mh6Var.O.getLayoutParams();
                if (mh6Var.s1()) {
                    i3 = gm.L(226.0f);
                } else {
                    i3 = 0;
                }
                if (mh6Var.s1() && Q() > gm.L(20.0f)) {
                    i3 -= Q();
                }
                u31 u31Var = u31.x;
                if (u31Var != null && u31Var.m) {
                    super.onMeasure(i, i2);
                    marginLayoutParams.bottomMargin = b10.z(10.0f, u31.x.e.getMeasuredHeight() + gm.L(14.0f), i3);
                } else {
                    marginLayoutParams.bottomMargin = gm.L(14.0f) + i3;
                }
                if (!gm.O1()) {
                    i5 = gm.m;
                }
                ((ViewGroup.MarginLayoutParams) mh6Var.V.getLayoutParams()).topMargin = gm.L(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) mh6Var.X.getLayoutParams()).topMargin = gm.L(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) mh6Var.W.getLayoutParams()).topMargin = gm.L(16.0f) + i5;
                TextView textView = mh6Var.g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = gm.L(16.0f) + i5;
                }
                if (mh6Var.n0.getMinimumHeight() != i5) {
                    mh6Var.n0.setMinimumHeight(i5);
                }
                if (Q() > gm.L(20.0f) && mh6Var.c.getVisibility() != 8 && !gm.A1() && !mh6Var.b0) {
                    ValueAnimator valueAnimator = mh6Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mh6Var.c.setVisibility(8);
                }
                super.onMeasure(i, i2);
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.n0;
                View.MeasureSpec.getMode(i);
                View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                if (Q() <= gm.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i7 = size2;
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.S0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.b.D2) {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), gm.L(2.0f) + i7), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                super.onMeasure(i, i2);
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((xhb) this.n0).d.getMeasuredHeight() + gm.L(24.0f));
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.m0) {
            case 8:
                try {
                    ((daa) this.n0).q0();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                return;
        }
    }

    public w91(Context context, tk5 tk5Var) {
        super(context, tk5Var);
        this.m0 = (byte) 3;
    }
}
