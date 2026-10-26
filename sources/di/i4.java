package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;
import org.telegram.ui.a31;
import org.telegram.ui.m31;
public final class i4 extends FrameLayout {
    public final int f8671a;

    public i4(Context context, int i10) {
        super(context);
        this.f8671a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8671a) {
            case 24:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8671a) {
            case 14:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f8671a) {
            case 6:
                int intrinsicHeight = org.telegram.ui.ActionBar.y6.f23445i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.y6.f23445i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.y6.f23445i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23461j2);
                return;
            case 17:
                canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.y6.f23478k0);
                return;
            case 26:
                int intrinsicHeight2 = org.telegram.ui.ActionBar.y6.f23445i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.y6.f23445i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                org.telegram.ui.ActionBar.y6.f23445i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23461j2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f8671a) {
            case 18:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        switch (this.f8671a) {
            case 5:
                return;
            case 16:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof View) {
                    float min = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    if (((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17) {
                        f7 = getHeight() / 2.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    setPivotY(f7);
                    setScaleX(min);
                    setScaleY(min);
                    return;
                }
                return;
            case 19:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                            i15 = org.telegram.messenger.t.D(8.0f, getChildAt(i16).getMeasuredHeight(), i15);
                            i14 = 0;
                        }
                        getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                        i14 = org.telegram.messenger.t.D(16.0f, getChildAt(i16).getMeasuredWidth(), i14);
                    }
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8671a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(60.0f)), View.MeasureSpec.getMode(i11)));
                return;
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 6:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 23:
            case 24:
            default:
                super.onMeasure(i10, i11);
                return;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                return;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(325.0f)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 10:
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                return;
            case 12:
                super.onMeasure(i10, i11);
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), vh.D(48.0f, 1, 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() != 8) {
                        if (getChildAt(i15).getMeasuredWidth() + i13 > View.MeasureSpec.getSize(i10)) {
                            i14 = org.telegram.messenger.t.D(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.t.D(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
                        i12 = getChildAt(i15).getMeasuredHeight() + i14;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i12);
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 21:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
                measureChildren(makeMeasureSpec, i11);
                int i16 = 0;
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    i16 = Math.max(i16, getChildAt(i17).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 25:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight());
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f8671a) {
            case 15:
                super.setTranslationY(f7);
                setPadding(0, 0, (int) f7, 0);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public i4(m31 m31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f8671a = 29;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.y(this, mutate, i11, m31.Q(m31Var), PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, gb1.h(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.ui.ActionBar.f7.V(textView, i11, m31.R(m31Var));
        ic.a.o(14.0f, 1, textView);
        addView(textView, gb1.h(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        z90 z90Var = new z90(getContext(), null);
        z90Var.setText(charSequence);
        z90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.Pi, m31.S(m31Var));
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, m31.T(m31Var));
        z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        z90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(z90Var, gb1.h(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }

    public i4(a31 a31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f8671a = 28;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.y(this, mutate, i11, a31.P(a31Var), PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        addView(imageView, gb1.h(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        org.telegram.ui.ActionBar.f7.V(textView, i11, a31.Q(a31Var));
        ic.a.o(14.0f, 1, textView);
        addView(textView, gb1.h(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        z90 z90Var = new z90(getContext(), null);
        z90Var.setText(charSequence);
        z90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.Pi, a31.R(a31Var));
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, a31.S(a31Var));
        z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(z90Var, gb1.h(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 18.0f, z10 ? 68.0f : 27.0f, 0.0f));
    }

    public i4(Context context, String str, int i10) {
        super(context);
        this.f8671a = 23;
        setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.y6.f23464j5;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
        boolean z10 = LocaleController.isRTL;
        addView(imageView, gb1.h(24, 24.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 22.0f, 0.0f, z10 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, i11, null);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(str);
        boolean z11 = LocaleController.isRTL;
        addView(textView, gb1.h(-1, -2.0f, 23, z11 ? 0.0f : 61.0f, 0.0f, z11 ? 61.0f : 0.0f, 0.0f));
    }

    public i4(Context context, int i10, String str, CharSequence charSequence, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f8671a = 9;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i10);
        addView(imageView, gb1.h(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.h(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        z90 z90Var = new z90(context, null);
        z90Var.setTypeface(AndroidUtilities.bold());
        z90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, i11, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.f7.H(z90Var, i12, u6Var);
        z90Var.setText(str);
        linearLayout.addView(z90Var, gb1.x(-1, -2, 55, 0, 0, 0, 2));
        z90 z90Var2 = new z90(context, null);
        z90Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var2, org.telegram.ui.ActionBar.y6.f23748y6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var2, i12, u6Var);
        z90Var2.setText(charSequence);
        linearLayout.addView(z90Var2, gb1.x(-1, -2, 55, 0, 0, 0, 0));
    }

    public i4(Context context) {
        super(context);
        this.f8671a = 27;
        setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
    }

    private final void a(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
