package eh;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.g41;
import org.telegram.ui.w31;
import org.telegram.ui.yh;
public final class d extends FrameLayout {
    public final int f5619a;

    public d(Context context, int i10) {
        super(context);
        this.f5619a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5619a) {
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
        switch (this.f5619a) {
            case 15:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f5619a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            case 2:
            default:
                return super.drawChild(canvas, view, j10);
            case 3:
                return false;
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f5619a) {
            case 0:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f5619a) {
            case 6:
                int intrinsicHeight = k6.f21749i3.getIntrinsicHeight();
                k6.f21749i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                k6.f21749i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), k6.f21765j2);
                return;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.getShadowHeight(), k6.f21781k0);
                return;
            case 18:
                canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), k6.f21781k0);
                return;
            case 26:
                int intrinsicHeight2 = k6.f21749i3.getIntrinsicHeight();
                k6.f21749i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                k6.f21749i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), k6.f21765j2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f5619a) {
            case 19:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        switch (this.f5619a) {
            case 5:
                return;
            case 17:
                super.onLayout(z4, i10, i11, i12, i13);
                if (getParent() instanceof View) {
                    float min = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    if (((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17) {
                        f10 = getHeight() / 2.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    setPivotY(f10);
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
                            i15 = y3.C(8.0f, getChildAt(i16).getMeasuredHeight(), i15);
                            i14 = 0;
                        }
                        getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                        i14 = y3.C(16.0f, getChildAt(i16).getMeasuredWidth(), i14);
                    }
                }
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5619a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
                return;
            case 3:
            case 4:
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
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.ui.b.B(48.0f, 1, 1073741824));
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
                            i14 = y3.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        i13 = y3.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
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
    public void setTranslationY(float f10) {
        switch (this.f5619a) {
            case 16:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public d(g41 g41Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f5619a = 29;
        boolean z4 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = k6.G6;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.v0(i11, g41.Q(g41Var)), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, c6.d(24, 24.0f, z4 ? 5 : 3, z4 ? 0.0f : 27.0f, 6.0f, z4 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(k6.v0(i11, g41.R(g41Var)));
        yh.p(14.0f, 1, textView);
        addView(textView, c6.d(-2, -2.0f, z4 ? 5 : 3, z4 ? 27.0f : 68.0f, 0.0f, z4 ? 68.0f : 27.0f, 0.0f));
        g90 g90Var = new g90(getContext(), null);
        g90Var.setText(charSequence);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(k6.Pi, g41.S(g41Var)));
        g90Var.setLinkTextColor(k6.v0(k6.f21722gc, g41.T(g41Var)));
        g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        g90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(g90Var, c6.d(-2, -2.0f, z4 ? 5 : 3, (z4 ? 27 : 68) - 4, 18.0f, (z4 ? 68 : 27) - 4, 0.0f));
    }

    public d(w31 w31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f5619a = 28;
        boolean z4 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = k6.G6;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.v0(i11, w31.P(w31Var)), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, c6.d(24, 24.0f, z4 ? 5 : 3, z4 ? 0.0f : 27.0f, 6.0f, z4 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(k6.v0(i11, w31.Q(w31Var)));
        yh.p(14.0f, 1, textView);
        addView(textView, c6.d(-2, -2.0f, z4 ? 5 : 3, z4 ? 27.0f : 68.0f, 0.0f, z4 ? 68.0f : 27.0f, 0.0f));
        g90 g90Var = new g90(getContext(), null);
        g90Var.setText(charSequence);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(k6.Pi, w31.R(w31Var)));
        g90Var.setLinkTextColor(k6.v0(k6.f21722gc, w31.S(w31Var)));
        g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(g90Var, c6.d(-2, -2.0f, z4 ? 5 : 3, z4 ? 27.0f : 68.0f, 18.0f, z4 ? 68.0f : 27.0f, 0.0f));
    }

    public d(Context context, String str, int i10) {
        super(context);
        this.f5619a = 23;
        setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = k6.f21768j5;
        imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z4 = LocaleController.isRTL;
        addView(imageView, c6.d(24, 24.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 22.0f, 0.0f, z4 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTextColor(k6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(str);
        boolean z10 = LocaleController.isRTL;
        addView(textView, c6.d(-1, -2.0f, 23, z10 ? 0.0f : 61.0f, 0.0f, z10 ? 61.0f : 0.0f, 0.0f));
    }

    public d(Context context, int i10, String str, CharSequence charSequence, g6 g6Var) {
        super(context);
        this.f5619a = 10;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = k6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(i11, g6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        addView(imageView, c6.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c6.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        g90 g90Var = new g90(context, null);
        g90Var.setTypeface(AndroidUtilities.bold());
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(i11, g6Var));
        int i12 = k6.f21722gc;
        g90Var.setLinkTextColor(k6.v0(i12, g6Var));
        g90Var.setText(str);
        linearLayout.addView(g90Var, c6.t(-1, -2, 55, 0, 0, 0, 2));
        g90 g90Var2 = new g90(context, null);
        g90Var2.setTextSize(1, 14.0f);
        g90Var2.setTextColor(k6.v0(k6.f22038y6, g6Var));
        g90Var2.setLinkTextColor(k6.v0(i12, g6Var));
        g90Var2.setText(charSequence);
        linearLayout.addView(g90Var2, c6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public d(Context context) {
        super(context);
        this.f5619a = 27;
        setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
    }

    private final void a(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
