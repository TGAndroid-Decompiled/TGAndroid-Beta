package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.Components.w70;
public final class b4 extends FrameLayout {
    public final int f8842a;

    public b4(Context context, int i7) {
        super(context);
        this.f8842a = i7;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8842a) {
            case 22:
                super.dispatchDraw(canvas);
                return;
            case 29:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8842a) {
            case 14:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f8842a) {
            case 6:
                int intrinsicHeight = org.telegram.ui.ActionBar.m6.f27979i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.m6.f27979i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.m6.f27979i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f27996j2);
                return;
            case 19:
                canvas.drawLine(0.0f, org.telegram.messenger.g0.L(40.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.m6.f28013k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f8842a) {
            case 20:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        switch (this.f8842a) {
            case 5:
                return;
            case 16:
                super.onLayout(z9, i7, i10, i11, i12);
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
            case 21:
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
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f8842a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(60.0f)), View.MeasureSpec.getMode(i10)));
                return;
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
                return;
            case 6:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 26:
            default:
                super.onMeasure(i7, i10);
                return;
            case 7:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                return;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(325.0f)), View.MeasureSpec.getMode(i7)), i10);
                return;
            case 10:
                super.onMeasure(i7, i10);
                return;
            case 11:
                super.onMeasure(i7, i10);
                return;
            case 12:
                super.onMeasure(i7, i10);
                return;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(300.0f), View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(32.0f)), Integer.MIN_VALUE), i10);
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.camera.q.B(48.0f, 1, 1073741824));
                return;
            case 21:
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
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            case 24:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
                measureChildren(makeMeasureSpec, i10);
                int i15 = 0;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    i15 = Math.max(i15, getChildAt(i16).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 25:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 27:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f8842a) {
            case 15:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public b4(int i7, Context context, String str) {
        super(context);
        this.f8842a = 28;
        setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
        ImageView e10 = org.telegram.messenger.camera.q.e(context, i7);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.s(e10, i10, null, PorterDuff.Mode.MULTIPLY);
        boolean z9 = id.f23161a0;
        addView(e10, ha.d(24, 24.0f, (z9 ? 5 : 3) | 16, z9 ? 0.0f : 22.0f, 0.0f, z9 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, i10, null);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(id.f23161a0 ? 5 : 3);
        textView.setText(str);
        boolean z10 = id.f23161a0;
        addView(textView, ha.d(-1, -2.0f, 23, z10 ? 0.0f : 61.0f, 0.0f, z10 ? 61.0f : 0.0f, 0.0f));
    }

    public b4(Context context, int i7, String str, CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f8842a = 9;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        addView(imageView, ha.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        w70 w70Var = new w70(context, null);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Uc;
        org.telegram.ui.ActionBar.t6.G(w70Var, i11, h6Var);
        w70Var.setText(str);
        linearLayout.addView(w70Var, ha.t(-1, -2, 55, 0, 0, 0, 2));
        w70 w70Var2 = new w70(context, null);
        w70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var2, org.telegram.ui.ActionBar.m6.f28282y6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var2, i11, h6Var);
        w70Var2.setText(charSequence);
        linearLayout.addView(w70Var2, ha.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private final void a(boolean z9, int i7, int i10, int i11, int i12) {
    }
}
