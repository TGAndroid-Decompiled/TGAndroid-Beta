package bh;

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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.y80;
import org.telegram.ui.d31;
import org.telegram.ui.th;
public final class d extends FrameLayout {
    public final int f2650a;

    public d(Context context, int i10) {
        super(context);
        this.f2650a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f2650a) {
            case 25:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f2650a) {
            case 16:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f2650a) {
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
        switch (this.f2650a) {
            case 0:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f2650a) {
            case 7:
                int intrinsicHeight = g6.f23149i3.getIntrinsicHeight();
                g6.f23149i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                g6.f23149i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), g6.f23166j2);
                return;
            case 9:
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.getShadowHeight(), g6.f23183k0);
                return;
            case 19:
                canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), g6.f23183k0);
                return;
            case 27:
                int intrinsicHeight2 = g6.f23149i3.getIntrinsicHeight();
                g6.f23149i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                g6.f23149i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), g6.f23166j2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f2650a) {
            case 20:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f9;
        switch (this.f2650a) {
            case 6:
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof View) {
                    float min = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    if (((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17) {
                        f9 = getHeight() / 2.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    setPivotY(f9);
                    setScaleX(min);
                    setScaleY(min);
                    return;
                }
                return;
            case 21:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                            i15 = x3.C(8.0f, getChildAt(i16).getMeasuredHeight(), i15);
                            i14 = 0;
                        }
                        getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                        i14 = x3.C(16.0f, getChildAt(i16).getMeasuredWidth(), i14);
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
        switch (this.f2650a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
                return;
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 24:
            case 25:
            default:
                super.onMeasure(i10, i11);
                return;
            case 6:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                return;
            case 10:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(325.0f)), View.MeasureSpec.getMode(i10)), i11);
                return;
            case 12:
                super.onMeasure(i10, i11);
                return;
            case 13:
                super.onMeasure(i10, i11);
                return;
            case 14:
                super.onMeasure(i10, i11);
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.ui.b.B(48.0f, 1, 1073741824));
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() != 8) {
                        if (getChildAt(i15).getMeasuredWidth() + i13 > View.MeasureSpec.getSize(i10)) {
                            i14 = x3.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        i13 = x3.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
                        i12 = getChildAt(i15).getMeasuredHeight() + i14;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i12);
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 23:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
                measureChildren(makeMeasureSpec, i11);
                int i16 = 0;
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    i16 = Math.max(i16, getChildAt(i17).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                return;
            case 26:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight());
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f2650a) {
            case 17:
                super.setTranslationY(f9);
                setPadding(0, 0, (int) f9, 0);
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    public d(d31 d31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f2650a = 29;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = g6.G6;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, d31.P(d31Var)), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, f6.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(g6.v0(i11, d31.Q(d31Var)));
        th.n(14.0f, 1, textView);
        addView(textView, f6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        y80 y80Var = new y80(getContext(), null);
        y80Var.setText(charSequence);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(g6.v0(g6.Pi, d31.R(d31Var)));
        y80Var.setLinkTextColor(g6.v0(g6.gc, d31.S(d31Var)));
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(y80Var, f6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 18.0f, z10 ? 68.0f : 27.0f, 0.0f));
    }

    public d(Context context, String str, int i10) {
        super(context);
        this.f2650a = 24;
        setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = g6.f23169j5;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z10 = LocaleController.isRTL;
        addView(imageView, f6.d(24, 24.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 22.0f, 0.0f, z10 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTextColor(g6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(str);
        boolean z11 = LocaleController.isRTL;
        addView(textView, f6.d(-1, -2.0f, 23, z11 ? 0.0f : 61.0f, 0.0f, z11 ? 61.0f : 0.0f, 0.0f));
    }

    public d(Context context, int i10, String str, CharSequence charSequence, c6 c6Var) {
        super(context);
        this.f2650a = 11;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        addView(imageView, f6.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, f6.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        y80 y80Var = new y80(context, null);
        y80Var.setTypeface(AndroidUtilities.bold());
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(g6.v0(i11, c6Var));
        int i12 = g6.gc;
        y80Var.setLinkTextColor(g6.v0(i12, c6Var));
        y80Var.setText(str);
        linearLayout.addView(y80Var, f6.t(-1, -2, 55, 0, 0, 0, 2));
        y80 y80Var2 = new y80(context, null);
        y80Var2.setTextSize(1, 14.0f);
        y80Var2.setTextColor(g6.v0(g6.f23433y6, c6Var));
        y80Var2.setLinkTextColor(g6.v0(i12, c6Var));
        y80Var2.setText(charSequence);
        linearLayout.addView(y80Var2, f6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public d(Context context) {
        super(context);
        this.f2650a = 28;
        setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
    }

    private final void a(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
