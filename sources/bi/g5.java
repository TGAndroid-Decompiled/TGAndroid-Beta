package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.d90;
import org.telegram.ui.k41;
import org.telegram.ui.u41;
public final class g5 extends FrameLayout {
    public final int f3022a;

    public g5(Context context, int i10) {
        super(context);
        this.f3022a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3022a) {
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
        switch (this.f3022a) {
            case 15:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3022a) {
            case 6:
                int intrinsicHeight = org.telegram.ui.ActionBar.j6.f20750i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.j6.f20750i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.j6.f20750i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20768j2);
                return;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.j6.f20785k0);
                return;
            case 18:
                canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.f20785k0);
                return;
            case 26:
                int intrinsicHeight2 = org.telegram.ui.ActionBar.j6.f20750i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.j6.f20750i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                org.telegram.ui.ActionBar.j6.f20750i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20768j2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3022a) {
            case 19:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        switch (this.f3022a) {
            case 5:
                return;
            case 17:
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
            case 20:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                            i15 = org.telegram.messenger.w1.C(8.0f, getChildAt(i16).getMeasuredHeight(), i15);
                            i14 = 0;
                        }
                        getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                        i14 = org.telegram.messenger.w1.C(16.0f, getChildAt(i16).getMeasuredWidth(), i14);
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
        switch (this.f3022a) {
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
            case 8:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 23:
            case 24:
            default:
                super.onMeasure(i10, i11);
                return;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(325.0f)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                return;
            case 12:
                super.onMeasure(i10, i11);
                return;
            case 13:
                super.onMeasure(i10, i11);
                return;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), vl.C(48.0f, 1, 1073741824));
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() != 8) {
                        if (getChildAt(i15).getMeasuredWidth() + i13 > View.MeasureSpec.getSize(i10)) {
                            i14 = org.telegram.messenger.w1.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        i13 = org.telegram.messenger.w1.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
                        i12 = getChildAt(i15).getMeasuredHeight() + i14;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i12);
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 22:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
                measureChildren(makeMeasureSpec, i11);
                int i16 = 0;
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    i16 = Math.max(i16, getChildAt(i17).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                return;
            case 25:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight());
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f3022a) {
            case 16:
                super.setTranslationY(f7);
                setPadding(0, 0, (int) f7, 0);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public g5(u41 u41Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f3022a = 29;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, u41.Q(u41Var)), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.x5.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, u41.R(u41Var)));
        com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
        addView(textView, w7.x5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        d90 d90Var = new d90(getContext(), null);
        d90Var.setText(charSequence);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, u41.S(u41Var)));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, u41.T(u41Var)));
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(d90Var, w7.x5.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }

    public g5(k41 k41Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f3022a = 28;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, k41.P(k41Var)), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.x5.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, k41.Q(k41Var)));
        com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
        addView(textView, w7.x5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        d90 d90Var = new d90(getContext(), null);
        d90Var.setText(charSequence);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, k41.R(k41Var)));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, k41.S(k41Var)));
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(d90Var, w7.x5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 18.0f, z10 ? 68.0f : 27.0f, 0.0f));
    }

    public g5(Context context, String str, int i10) {
        super(context);
        this.f3022a = 23;
        setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z10 = LocaleController.isRTL;
        addView(imageView, w7.x5.d(24, 24.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 22.0f, 0.0f, z10 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(str);
        boolean z11 = LocaleController.isRTL;
        addView(textView, w7.x5.d(-1, -2.0f, 23, z11 ? 0.0f : 61.0f, 0.0f, z11 ? 61.0f : 0.0f, 0.0f));
    }

    public g5(Context context, int i10, String str, CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3022a = 10;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        addView(imageView, w7.x5.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        d90 d90Var = new d90(context, null);
        d90Var.setTypeface(AndroidUtilities.bold());
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        d90Var.setText(str);
        linearLayout.addView(d90Var, w7.x5.t(-1, -2, 55, 0, 0, 0, 2));
        d90 d90Var2 = new d90(context, null);
        d90Var2.setTextSize(1, 14.0f);
        d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, f6Var));
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        d90Var2.setText(charSequence);
        linearLayout.addView(d90Var2, w7.x5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public g5(Context context) {
        super(context);
        this.f3022a = 27;
        setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
    }

    private final void a(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
