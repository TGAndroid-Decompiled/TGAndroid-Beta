package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s70;
public final class d2 extends FrameLayout {
    public final int f561a;

    public d2(Context context, int i3) {
        super(context);
        this.f561a = i3;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f561a) {
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
        switch (this.f561a) {
            case 16:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f561a) {
            case 8:
                int intrinsicHeight = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27985j2);
                return;
            case 21:
                canvas.drawLine(0.0f, org.telegram.messenger.g0.L(40.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f561a) {
            case 22:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float f10;
        switch (this.f561a) {
            case 7:
                return;
            case 18:
                super.onLayout(z10, i3, i10, i11, i12);
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
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f561a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824));
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
                super.onMeasure(i3, i10);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
                return;
            case 6:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(60.0f)), View.MeasureSpec.getMode(i10)));
                return;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
                return;
            case 9:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                return;
            case 10:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(325.0f)), View.MeasureSpec.getMode(i3)), i10);
                return;
            case 12:
                super.onMeasure(i3, i10);
                return;
            case 13:
                super.onMeasure(i3, i10);
                return;
            case 14:
                super.onMeasure(i3, i10);
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(300.0f), View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(32.0f)), Integer.MIN_VALUE), i10);
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), org.telegram.messenger.camera.q.B(48.0f, 1, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
                int childCount = getChildCount();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        if (getChildAt(i14).getMeasuredWidth() + i12 > View.MeasureSpec.getSize(i3)) {
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
                return;
            case 26:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
                measureChildren(makeMeasureSpec, i10);
                int i15 = 0;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    i15 = Math.max(i15, getChildAt(i16).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 27:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 29:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f561a) {
            case 17:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public d2(Context context, c5 c5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f561a = 1;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, mf.e(-1, -2, 23));
        k9 k9Var = new k9(context);
        k9Var.setImageDrawable(new ch0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        f10.addView(k9Var, mf.r(130, 130, 17));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131750019, null));
        f10.addView(textView, mf.t(-2, -2, 17, 32, 12, 32, 9));
        s70 s70Var = new s70(context, null);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.A6, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(17);
        s70Var.setText(bd.M0(2131750020, null));
        s70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        f10.addView(s70Var, mf.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView2, i3, e6Var);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)), 6, 6);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i3);
        textView2.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(textView2, a02, null, L, e6Var);
        textView2.setGravity(17);
        textView2.setText(bd.M0(2131750021, null));
        textView2.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        pf.a(textView2);
        f10.addView(textView2, mf.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(c5Var);
    }

    public d2(Context context, int i3, String str, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f561a = 11;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i3);
        addView(imageView, mf.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, mf.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        s70 s70Var = new s70(context, null);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.H(s70Var, i11, e6Var);
        s70Var.setText(str);
        linearLayout.addView(s70Var, mf.t(-1, -2, 55, 0, 0, 0, 2));
        s70 s70Var2 = new s70(context, null);
        s70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i11, e6Var);
        s70Var2.setText(charSequence);
        linearLayout.addView(s70Var2, mf.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private final void a(boolean z10, int i3, int i10, int i11, int i12) {
    }
}
