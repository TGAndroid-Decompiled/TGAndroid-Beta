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
import c8.ja;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.z70;
public final class v1 extends FrameLayout {
    public final int f3930a;

    public v1(Context context, int i7) {
        super(context);
        this.f3930a = i7;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3930a) {
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
        switch (this.f3930a) {
            case 16:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3930a) {
            case 8:
                int intrinsicHeight = org.telegram.ui.ActionBar.j6.f28938i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.j6.f28938i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.j6.f28938i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f28955j2);
                return;
            case 21:
                canvas.drawLine(0.0f, org.telegram.messenger.g0.L(40.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.j6.f28972k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3930a) {
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
        switch (this.f3930a) {
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
                            i14 = org.telegram.messenger.k5.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        getChildAt(i15).layout(i13, i14, getChildAt(i15).getMeasuredWidth() + i13, getChildAt(i15).getMeasuredHeight() + i14);
                        i13 = org.telegram.messenger.k5.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
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
        switch (this.f3930a) {
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i20.B(48.0f, 1, 1073741824));
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
                            i13 = org.telegram.messenger.k5.C(8.0f, getChildAt(i14).getMeasuredHeight(), i13);
                            i12 = 0;
                        }
                        i12 = org.telegram.messenger.k5.C(16.0f, getChildAt(i14).getMeasuredWidth(), i12);
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
        switch (this.f3930a) {
            case 17:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public v1(Context context, k4 k4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f3930a = 1;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, ja.e(-1, -2, 23));
        i9 i9Var = new i9(context);
        i9Var.setImageDrawable(new ch0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        f10.addView(i9Var, ja.r(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131750011, null));
        f10.addView(textView, ja.t(-2, -2, 17, 32, 12, 32, 9));
        z70 z70Var = new z70(context, null);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.A6, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setGravity(17);
        z70Var.setText(hd.M0(2131750012, null));
        z70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        f10.addView(z70Var, ja.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(textView2, i7, e6Var);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)), 6, 6);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i7);
        textView2.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(textView2, a02, null, K, e6Var);
        textView2.setGravity(17);
        textView2.setText(hd.M0(2131750013, null));
        textView2.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        na.a(textView2);
        f10.addView(textView2, ja.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(k4Var);
    }

    public v1(Context context, int i7, String str, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f3930a = 11;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        addView(imageView, ja.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ja.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        z70 z70Var = new z70(context, null);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.q6.G(z70Var, i11, e6Var);
        z70Var.setText(str);
        linearLayout.addView(z70Var, ja.t(-1, -2, 55, 0, 0, 0, 2));
        z70 z70Var2 = new z70(context, null);
        z70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i11, e6Var);
        z70Var2.setText(charSequence);
        linearLayout.addView(z70Var2, ja.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private final void a(boolean z10, int i7, int i10, int i11, int i12) {
    }
}
