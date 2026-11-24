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
public final class n81 extends cja {
    public final byte m0;
    public Object n0;

    public n81(byte b, Context context, Object obj) {
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
                if (view instanceof t14) {
                    ViewGroup.LayoutParams layoutParams = ((t14) view).getLayoutParams();
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
        qw4 qw4Var;
        switch (this.m0) {
            case 8:
                d8a d8aVar = (d8a) this.n0;
                d8aVar.o0();
                super.dispatchDraw(canvas);
                qw4Var = ((d) d8aVar).glassEngine;
                qw4Var.g();
                if (!d8aVar.O) {
                    gl.O(canvas, this, d8aVar.getThemedColor(bkb.c6), d8aVar.d0, 1.0f);
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
                if (motionEvent.getY() < ((f37) this.n0).U) {
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
                if (gba.D0) {
                    int w0 = bkb.w0(null, bkb.ta, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.n0;
                    if (colorDrawable == null || colorDrawable.getColor() != w0) {
                        this.n0 = new ColorDrawable(w0);
                    }
                    return (ColorDrawable) this.n0;
                }
                return super.getNewDrawable();
            case 6:
                Drawable l = ((ku1) ((f37) this.n0).d0.G).l();
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
                if (!gba.D0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public final wjb getResourceProvider() {
        switch (this.m0) {
            case 9:
                return ((wfb) this.n0).c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n81.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 8;
        int i5 = 0;
        switch (this.m0) {
            case 0:
                ((z81) this.n0).b0();
                super.onMeasure(i, i2);
                return;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) this.n0;
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
                s36 s36Var = (s36) this.n0;
                super.onMeasure(i, i2);
                Q();
                int i6 = this.f;
                if (i6 != 0 && i6 < gl.L(20.0f)) {
                    s36Var.G.clearFocus();
                    s36Var.L.clearFocus();
                }
                FrameLayout frameLayout = s36Var.I;
                if (this.f <= gl.L(20.0f)) {
                    i4 = 0;
                }
                frameLayout.setVisibility(i4);
                return;
            case 5:
                mf6 mf6Var = (mf6) this.n0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mf6Var.O.getLayoutParams();
                if (mf6Var.r1()) {
                    i3 = gl.L(226.0f);
                } else {
                    i3 = 0;
                }
                if (mf6Var.r1() && Q() > gl.L(20.0f)) {
                    i3 -= Q();
                }
                m21 m21Var = m21.w;
                if (m21Var != null && m21Var.l) {
                    super.onMeasure(i, i2);
                    marginLayoutParams.bottomMargin = b00.z(10.0f, m21.w.e.getMeasuredHeight() + gl.L(14.0f), i3);
                } else {
                    marginLayoutParams.bottomMargin = gl.L(14.0f) + i3;
                }
                if (!gl.O1()) {
                    i5 = gl.m;
                }
                ((ViewGroup.MarginLayoutParams) mf6Var.V.getLayoutParams()).topMargin = gl.L(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) mf6Var.X.getLayoutParams()).topMargin = gl.L(16.0f) + i5;
                ((ViewGroup.MarginLayoutParams) mf6Var.W.getLayoutParams()).topMargin = gl.L(16.0f) + i5;
                TextView textView = mf6Var.g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = gl.L(16.0f) + i5;
                }
                if (mf6Var.n0.getMinimumHeight() != i5) {
                    mf6Var.n0.setMinimumHeight(i5);
                }
                if (Q() > gl.L(20.0f) && mf6Var.c.getVisibility() != 8 && !gl.A1() && !mf6Var.b0) {
                    ValueAnimator valueAnimator = mf6Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mf6Var.c.setVisibility(8);
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
                if (Q() <= gl.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i7 = size2;
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.R0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.b.D2) {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), gl.L(2.0f) + i7), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                super.onMeasure(i, i2);
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((wfb) this.n0).d.getMeasuredHeight() + gl.L(24.0f));
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.m0) {
            case 8:
                try {
                    ((d8a) this.n0).p0();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                return;
        }
    }

    public n81(Context context, ui5 ui5Var) {
        super(context, ui5Var);
        this.m0 = (byte) 3;
    }
}
