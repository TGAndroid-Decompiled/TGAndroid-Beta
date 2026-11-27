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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
public final class w81 extends wma {
    public final byte g0;
    public Object h0;

    public w81(byte b, Context context, Object obj) {
        super(context, null);
        this.g0 = b;
        this.h0 = obj;
    }

    @Override
    public final boolean O() {
        switch (this.g0) {
            case 3:
            case 9:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public final boolean P() {
        switch (this.g0) {
            case 9:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public final void addView(View view) {
        switch (this.g0) {
            case 2:
                if (view instanceof o24) {
                    ViewGroup.LayoutParams layoutParams = ((o24) view).getLayoutParams();
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
        vy4 vy4Var;
        switch (this.g0) {
            case 8:
                uba ubaVar = (uba) this.h0;
                ubaVar.o0();
                super.dispatchDraw(canvas);
                vy4Var = ((e) ubaVar).glassEngine;
                vy4Var.g();
                if (!ubaVar.O) {
                    hl.O(canvas, this, ubaVar.getThemedColor(aob.d6), ubaVar.d0, 1.0f);
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
        switch (this.g0) {
            case 6:
                if (motionEvent.getY() < ((m57) this.h0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final Drawable getNewDrawable() {
        switch (this.g0) {
            case 3:
                if (xea.D0) {
                    int w0 = aob.w0(null, aob.ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.h0;
                    if (colorDrawable == null || colorDrawable.getColor() != w0) {
                        this.h0 = new ColorDrawable(w0);
                    }
                    return (ColorDrawable) this.h0;
                }
                return super.getNewDrawable();
            case 6:
                Drawable l = ((xu1) ((m57) this.h0).d0.G).l();
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
        switch (this.g0) {
            case 3:
                if (!xea.D0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public final vnb getResourceProvider() {
        switch (this.g0) {
            case 9:
                return ((sjb) this.h0).c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w81.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 8;
        int i5 = 0;
        switch (this.g0) {
            case 0:
                ((i91) this.h0).b0();
                super.onMeasure(i, i2);
                return;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) this.h0;
                measureChildWithMargins(ContactsActivity.Z(contactsActivity), i, 0, i2, 0);
                ((ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams()).topMargin = ContactsActivity.a0(contactsActivity).getMeasuredHeight();
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
                v56 v56Var = (v56) this.h0;
                super.onMeasure(i, i2);
                Q();
                int i6 = this.f;
                if (i6 != 0 && i6 < hl.L(20.0f)) {
                    v56Var.G.clearFocus();
                    v56Var.L.clearFocus();
                }
                FrameLayout frameLayout = v56Var.I;
                if (this.f <= hl.L(20.0f)) {
                    i4 = 0;
                }
                frameLayout.setVisibility(i4);
                return;
            case 5:
                qh6 qh6Var = (qh6) this.h0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qh6Var.O.getLayoutParams();
                if (qh6Var.s1()) {
                    i3 = hl.L(226.0f);
                } else {
                    i3 = 0;
                }
                if (qh6Var.s1() && Q() > hl.L(20.0f)) {
                    i3 -= Q();
                }
                v21 v21Var = v21.x;
                if (v21Var != null && v21Var.m) {
                    super.onMeasure(i, i2);
                    marginLayoutParams.bottomMargin = c00.A(10.0f, v21.x.e.getMeasuredHeight() + hl.L(14.0f), i3);
                } else {
                    marginLayoutParams.bottomMargin = hl.L(14.0f) + i3;
                }
                if (!hl.O1()) {
                    i5 = hl.m;
                }
                ((ViewGroup.MarginLayoutParams) qh6Var.V.getLayoutParams()).topMargin = hl.L(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) qh6Var.X.getLayoutParams()).topMargin = hl.L(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) qh6Var.W.getLayoutParams()).topMargin = hl.L(16.0f) + i5;
                TextView textView = qh6Var.g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = hl.L(16.0f) + i5;
                }
                if (qh6Var.n0.getMinimumHeight() != i5) {
                    qh6Var.n0.setMinimumHeight(i5);
                }
                if (Q() > hl.L(20.0f) && qh6Var.c.getVisibility() != 8 && !hl.A1() && !qh6Var.b0) {
                    ValueAnimator valueAnimator = qh6Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qh6Var.c.setVisibility(8);
                }
                super.onMeasure(i, i2);
                return;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.h0;
                View.MeasureSpec.getMode(i);
                View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                if (Q() <= hl.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i7 = size2;
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.V0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.b.C2) {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), hl.L(2.0f) + i7), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                super.onMeasure(i, i2);
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((sjb) this.h0).d.getMeasuredHeight() + hl.L(24.0f));
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.g0) {
            case 8:
                try {
                    ((uba) this.h0).p0();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                return;
        }
    }

    public w81(Context context, wk5 wk5Var) {
        super(context, wk5Var);
        this.g0 = (byte) 3;
    }
}
