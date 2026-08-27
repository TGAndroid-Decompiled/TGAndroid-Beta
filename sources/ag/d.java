package ag;

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
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.p80;
import org.telegram.ui.c31;
import org.telegram.ui.m31;

public final class d extends FrameLayout {

    public final int f327a;

    public d(Context context, int i10) {
        super(context);
        this.f327a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f327a) {
            case 23:
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f327a) {
            case 14:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f327a) {
            case 1:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f327a) {
            case 5:
                int intrinsicHeight = g6.f23141i3.getIntrinsicHeight();
                g6.f23141i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                g6.f23141i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), g6.f23158j2);
                break;
            case 7:
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.getShadowHeight(), g6.f23175k0);
                break;
            case 17:
                canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), g6.f23175k0);
                break;
            case 25:
                int intrinsicHeight2 = g6.f23141i3.getIntrinsicHeight();
                g6.f23141i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                g6.f23141i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), g6.f23158j2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f327a) {
            case 18:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f327a) {
            case 4:
                break;
            case 16:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof View) {
                    float fMin = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    setPivotY(((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17 ? getHeight() / 2.0f : 0.0f);
                    setScaleX(fMin);
                    setScaleY(fMin);
                }
                break;
            case 19:
                int childCount = getChildCount();
                int iC = 0;
                int iC2 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        if (getChildAt(i14).getMeasuredWidth() + iC > getMeasuredWidth()) {
                            iC2 = org.telegram.messenger.y1.C(8.0f, getChildAt(i14).getMeasuredHeight(), iC2);
                            iC = 0;
                        }
                        getChildAt(i14).layout(iC, iC2, getChildAt(i14).getMeasuredWidth() + iC, getChildAt(i14).getMeasuredHeight() + iC2);
                        iC = org.telegram.messenger.y1.C(16.0f, getChildAt(i14).getMeasuredWidth(), iC);
                    }
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f327a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
                break;
            case 4:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                break;
            case 6:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                break;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(325.0f)), View.MeasureSpec.getMode(i10)), i11);
                break;
            case 10:
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                break;
            case 12:
                super.onMeasure(i10, i11);
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), rl.B(48.0f, 1, 1073741824));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                int childCount = getChildCount();
                int measuredHeight = 0;
                int iC = 0;
                int iC2 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    if (getChildAt(i12).getVisibility() != 8) {
                        if (getChildAt(i12).getMeasuredWidth() + iC > View.MeasureSpec.getSize(i10)) {
                            iC2 = org.telegram.messenger.y1.C(8.0f, getChildAt(i12).getMeasuredHeight(), iC2);
                            iC = 0;
                        }
                        iC = org.telegram.messenger.y1.C(16.0f, getChildAt(i12).getMeasuredWidth(), iC);
                        measuredHeight = getChildAt(i12).getMeasuredHeight() + iC2;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                break;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                break;
            case 21:
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
                measureChildren(iMakeMeasureSpec, i11);
                int iMax = 0;
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    iMax = Math.max(iMax, getChildAt(i13).getMeasuredHeight());
                }
                super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
                break;
            case 24:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight());
                break;
            case 29:
                super.onMeasure(i10, rl.B(36.0f, View.MeasureSpec.getSize(i11), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f327a) {
            case 15:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    public d(m31 m31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f327a = 28;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable drawableMutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = g6.G6;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, ((org.telegram.ui.ActionBar.e3) m31Var).resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        addView(imageView, z5.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(g6.v0(i11, ((org.telegram.ui.ActionBar.e3) m31Var).resourcesProvider));
        pa.m(14.0f, 1, textView);
        addView(textView, z5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        p80 p80Var = new p80(getContext(), null);
        p80Var.setText(charSequence);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(g6.v0(g6.Pi, ((org.telegram.ui.ActionBar.e3) m31Var).resourcesProvider));
        p80Var.setLinkTextColor(g6.v0(g6.gc, ((org.telegram.ui.ActionBar.e3) m31Var).resourcesProvider));
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(p80Var, z5.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }

    public d(c31 c31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        this.f327a = 27;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable drawableMutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = g6.G6;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, ((org.telegram.ui.ActionBar.e3) c31Var).resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        addView(imageView, z5.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(g6.v0(i11, ((org.telegram.ui.ActionBar.e3) c31Var).resourcesProvider));
        pa.m(14.0f, 1, textView);
        addView(textView, z5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        p80 p80Var = new p80(getContext(), null);
        p80Var.setText(charSequence);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(g6.v0(g6.Pi, ((org.telegram.ui.ActionBar.e3) c31Var).resourcesProvider));
        p80Var.setLinkTextColor(g6.v0(g6.gc, ((org.telegram.ui.ActionBar.e3) c31Var).resourcesProvider));
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(p80Var, z5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 18.0f, z10 ? 68.0f : 27.0f, 0.0f));
    }

    public d(Context context, String str, int i10) {
        super(context);
        this.f327a = 22;
        setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = g6.f23161j5;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z10 = LocaleController.isRTL;
        addView(imageView, z5.d(24, 24.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 22.0f, 0.0f, z10 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTextColor(g6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(str);
        boolean z11 = LocaleController.isRTL;
        addView(textView, z5.d(-1, -2.0f, 23, z11 ? 0.0f : 61.0f, 0.0f, z11 ? 61.0f : 0.0f, 0.0f));
    }

    public d(Context context, int i10, String str, CharSequence charSequence, c6 c6Var) {
        super(context);
        this.f327a = 9;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        addView(imageView, z5.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        p80Var.setTypeface(AndroidUtilities.bold());
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(g6.v0(i11, c6Var));
        int i12 = g6.gc;
        p80Var.setLinkTextColor(g6.v0(i12, c6Var));
        p80Var.setText(str);
        linearLayout.addView(p80Var, z5.t(-1, -2, 55, 0, 0, 0, 2));
        p80 p80Var2 = new p80(context, null);
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setTextColor(g6.v0(g6.f23423y6, c6Var));
        p80Var2.setLinkTextColor(g6.v0(i12, c6Var));
        p80Var2.setText(charSequence);
        linearLayout.addView(p80Var2, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public d(Context context) {
        super(context);
        this.f327a = 26;
        setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
    }

    private final void a(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
