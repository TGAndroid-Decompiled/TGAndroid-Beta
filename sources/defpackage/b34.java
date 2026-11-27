package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadialProgressView;
public final class b34 extends FrameLayout {
    public final vnb a;
    public final TextView b;
    public final RadialProgressView c;
    public final e29 d;
    public boolean e;
    public int f;

    public b34(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, tre.c(-2.0f, -2));
        this.c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImportantForAccessibility(2);
        imageView.setVisibility(8);
        linearLayout.addView((View) imageView, tre.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        yob.X(textView, aob.c7, vnbVar);
        uh9.q(textView, 1, null, 2131747898);
        linearLayout.addView(textView, tre.r(-2, -2, 17));
        addView(linearLayout, tre.c(-2.0f, -2));
        hl.T3(textView, false, 2.0f, true, false);
        hl.T3(radialProgressView, false, 1.0f, true, false);
        setOnTouchListener(new b02((byte) 9));
    }

    public final void a(int i, int i2, int i3) {
        int i4;
        if (i != 0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        e29 e29Var = this.d;
        e29Var.setVisibility(i4);
        if (i != 0) {
            e29Var.f(i, i2, i3, null);
            e29Var.d();
        }
    }

    public final void b() {
        hl.T3(this.b, false, 0.9f, true, true);
        hl.T3(this.c, true, 1.0f, true, true);
    }

    public final void c() {
        hl.T3(this.b, true, 0.9f, true, true);
        hl.T3(this.c, false, 1.0f, true, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int paddingTop;
        this.e = true;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i5 - childAt.getMeasuredWidth()) / 2;
                int i8 = this.f;
                if (i8 == 2) {
                    measuredHeight = (hl.L(100.0f) - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else if (i8 == 1) {
                    measuredHeight = ((i6 / 2) - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    measuredHeight = (i6 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                }
                int i9 = paddingTop + measuredHeight;
                childAt.layout(measuredWidth, i9, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i9);
            }
        }
        this.e = false;
    }

    @Override
    public final void requestLayout() {
        if (!this.e) {
            super.requestLayout();
        }
    }

    public void setProgressBarColor(int i) {
        RadialProgressView radialProgressView = this.c;
        if (ik8.A(radialProgressView)) {
            radialProgressView.setProgressColor(i);
        }
    }

    public void setShowAtCenter(boolean z) {
        this.f = z ? 1 : 0;
    }

    public void setShowAtTop(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f = i;
    }

    public void setText(String str) {
        this.b.setText(str);
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        yob.q(textView);
        textView.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.b.setTextSize(1, i);
    }

    public void setTopImage(int i) {
        TextView textView = this.b;
        if (i == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        if (mutate != null) {
            yob.x(this, mutate, aob.c7, this.a, PorterDuff.Mode.MULTIPLY);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(hl.L(1.0f));
    }
}
