package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.sa;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q9;
public final class v2 extends FrameLayout {
    public final int f4138a;

    public v2(Context context, int i7) {
        super(context);
        this.f4138a = i7;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4138a) {
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
        switch (this.f4138a) {
            case 16:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f4138a) {
            case 8:
                int intrinsicHeight = org.telegram.ui.ActionBar.m6.f29436i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.m6.f29436i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.m6.f29436i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29453j2);
                return;
            case 21:
                canvas.drawLine(0.0f, org.telegram.messenger.g0.L(40.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.m6.f29470k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f4138a) {
            case 22:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        switch (this.f4138a) {
            case 7:
                return;
            case 18:
                super.onLayout(z10, i7, i10, i11, i12);
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
            case 23:
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() != 8) {
                        if (getChildAt(i15).getMeasuredWidth() + i13 > getMeasuredWidth()) {
                            i14 = org.telegram.messenger.f3.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        getChildAt(i15).layout(i13, i14, getChildAt(i15).getMeasuredWidth() + i13, getChildAt(i15).getMeasuredHeight() + i14);
                        i13 = org.telegram.messenger.f3.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
                    }
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f4138a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824));
                return;
            case 1:
            case 2:
            case 3:
            case 8:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
            case 28:
            default:
                super.onMeasure(i7, i10);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
                return;
            case 6:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(60.0f)), View.MeasureSpec.getMode(i10)));
                return;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
                return;
            case 9:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                return;
            case 10:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(325.0f)), View.MeasureSpec.getMode(i7)), i10);
                return;
            case 12:
                super.onMeasure(i7, i10);
                return;
            case 13:
                super.onMeasure(i7, i10);
                return;
            case 14:
                super.onMeasure(i7, i10);
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(300.0f), View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(32.0f)), Integer.MIN_VALUE), i10);
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), o10.C(48.0f, 1, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                int childCount = getChildCount();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        if (getChildAt(i14).getMeasuredWidth() + i12 > View.MeasureSpec.getSize(i7)) {
                            i13 = org.telegram.messenger.f3.C(8.0f, getChildAt(i14).getMeasuredHeight(), i13);
                            i12 = 0;
                        }
                        i12 = org.telegram.messenger.f3.C(16.0f, getChildAt(i14).getMeasuredWidth(), i12);
                        i11 = getChildAt(i14).getMeasuredHeight() + i13;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i11);
                return;
            case 25:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 26:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
                measureChildren(makeMeasureSpec, i10);
                int i15 = 0;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    i15 = Math.max(i15, getChildAt(i16).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 27:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 29:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f4138a) {
            case 17:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public v2(Context context, int i7, String str, CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f4138a = 11;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        addView(imageView, na.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, na.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        m80 m80Var = new m80(context, null);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Xc;
        org.telegram.ui.ActionBar.t6.G(m80Var, i11, h6Var);
        m80Var.setText(str);
        linearLayout.addView(m80Var, na.t(-1, -2, 55, 0, 0, 0, 2));
        m80 m80Var2 = new m80(context, null);
        m80Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var2, org.telegram.ui.ActionBar.m6.f29739y6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i11, h6Var);
        m80Var2.setText(charSequence);
        linearLayout.addView(m80Var2, na.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public v2(Context context, x6 x6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f4138a = 1;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, na.e(-1, -2, 23));
        q9 q9Var = new q9(context);
        q9Var.setImageDrawable(new oh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        g10.addView(q9Var, na.r(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.N0(2131749994, null));
        g10.addView(textView, na.t(-2, -2, 17, 32, 12, 32, 9));
        m80 m80Var = new m80(context, null);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.A6, h6Var);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setGravity(17);
        m80Var.setText(hd.N0(2131749995, null));
        m80Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        g10.addView(m80Var, na.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, h6Var);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)), 6, 6);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i7);
        textView2.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(textView2, a02, null, K, h6Var);
        textView2.setGravity(17);
        textView2.setText(hd.N0(2131749996, null));
        textView2.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        sa.a(textView2);
        g10.addView(textView2, na.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(x6Var);
    }

    private final void a(boolean z10, int i7, int i10, int i11, int i12) {
    }
}
