package defpackage;

import android.app.Activity;
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
public final class ar8 extends FrameLayout {
    public final byte a;

    public ar8(Context context, q89 q89Var, wjb wjbVar) {
        super(context);
        this.a = (byte) 2;
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.e(-1, -2, 23));
        be0 be0Var = new be0(context);
        be0Var.setImageDrawable(new oy8(2131624314, gl.L(130.0f), gl.L(130.0f)));
        j.addView(be0Var, nme.r(130, 130, 17));
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131749995, null));
        j.addView(textView, nme.t(-2, -2, 17, 32, 12, 32, 9));
        l46 l46Var = new l46(context, null);
        zkb.X(l46Var, bkb.z6, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(17);
        l46Var.setText(k96.M0(2131749996, null));
        l46Var.setMaxWidth(gl.L(200.0f));
        j.addView(l46Var, nme.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i = bkb.Ei;
        zkb.X(textView2, i, wjbVar);
        ff0 Y = bkb.Y(bkb.p1(0.1f, bkb.v0(i, wjbVar)), 6, 6);
        vkb K = zkb.K(0.1f, i);
        textView2.setBackground(Y);
        zkb.j(textView2, Y, null, K, wjbVar);
        textView2.setGravity(17);
        textView2.setText(k96.M0(2131749997, null));
        textView2.setPadding(gl.L(13.0f), 0, gl.L(13.0f), 0);
        ote.a(textView2);
        j.addView(textView2, nme.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(q89Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 17:
                bkb.h3.setBounds(0, 0, getMeasuredWidth(), bkb.h3.getIntrinsicHeight());
                bkb.h3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 18:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 22:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 9:
            case 22:
                return false;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                canvas.drawLine(0.0f, gl.L(40.0f), getMeasuredWidth(), gl.L(40.0f), bkb.j0);
                return;
            case 16:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, bkb.j0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 12:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 11:
                int childCount = getChildCount();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    if (getChildAt(i7).getMeasuredWidth() + i5 > getMeasuredWidth()) {
                        i6 += getChildAt(i7).getMeasuredHeight();
                        i5 = 0;
                    }
                    getChildAt(i7).layout(i5, i6, getChildAt(i7).getMeasuredWidth() + i5, getChildAt(i7).getMeasuredHeight() + i6);
                    i5 += getChildAt(i7).getMeasuredWidth();
                }
                return;
            case 12:
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 13:
                int childCount2 = getChildCount();
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < childCount2; i10++) {
                    if (getChildAt(i10).getVisibility() != 8) {
                        if (getChildAt(i10).getMeasuredWidth() + i8 > getMeasuredWidth()) {
                            i9 = de9.w(8.0f, getChildAt(i10).getMeasuredHeight(), i9);
                            i8 = 0;
                        }
                        getChildAt(i10).layout(i8, i9, getChildAt(i10).getMeasuredWidth() + i8, getChildAt(i10).getMeasuredHeight() + i9);
                        i8 = de9.w(16.0f, getChildAt(i10).getMeasuredWidth(), i8);
                    }
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), gl.L(60.0f)), View.MeasureSpec.getMode(i2)));
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 12:
            case 16:
            case 17:
            case 18:
            case 21:
            default:
                super.onMeasure(i, i2);
                return;
            case 5:
                super.onMeasure(i, ug8.E(36.0f, View.MeasureSpec.getSize(i2), 1073741824));
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(300.0f), View.MeasureSpec.getSize(i) - gl.L(32.0f)), Integer.MIN_VALUE), i2);
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ug8.E(48.0f, 1, 1073741824));
                return;
            case 8:
                super.onMeasure(i, i2);
                return;
            case 11:
                int size = View.MeasureSpec.getSize(i);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                int childCount = getChildCount();
                int i4 = 0;
                if (childCount > 0) {
                    i3 = getChildAt(0).getMeasuredHeight();
                } else {
                    i3 = 0;
                }
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    if (getChildAt(i7).getMeasuredWidth() + i5 > size) {
                        i6 += getChildAt(i7).getMeasuredHeight();
                        i5 = 0;
                    }
                    i5 += getChildAt(i7).getMeasuredWidth();
                }
                int measuredWidth = getMeasuredWidth();
                if (getChildCount() != 0) {
                    i4 = gl.L(16.0f) + i3 + i6;
                }
                setMeasuredDimension(measuredWidth, i4);
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                int childCount2 = getChildCount();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < childCount2; i11++) {
                    if (getChildAt(i11).getVisibility() != 8) {
                        if (getChildAt(i11).getMeasuredWidth() + i9 > View.MeasureSpec.getSize(i)) {
                            i10 = de9.w(8.0f, getChildAt(i11).getMeasuredHeight(), i10);
                            i9 = 0;
                        }
                        i9 = de9.w(16.0f, getChildAt(i11).getMeasuredWidth(), i9);
                        i8 = getChildAt(i11).getMeasuredHeight() + i10;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i8);
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), 1073741824));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 20:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
                measureChildren(makeMeasureSpec, i2);
                int i12 = 0;
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    i12 = Math.max(i12, getChildAt(i13).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(500.0f), 1073741824));
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 22:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ar8(wb5 wb5Var, Activity activity, int i, String str, CharSequence charSequence) {
        super(activity);
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        this.a = (byte) 4;
        boolean z = k96.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i6 = bkb.F6;
        zkb.x(this, mutate, i6, wb5Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            f = 0.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, nme.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        tb4.w(textView, i6, wb5Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            f2 = 68.0f;
            i3 = 3;
        }
        addView(textView, nme.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        l46 l46Var = new l46(getContext(), null);
        l46Var.setText(charSequence);
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, bkb.Fj, wb5Var.J0);
        zkb.G(l46Var, bkb.Wc, wb5Var.J0);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        if (z) {
            i4 = 27;
            i5 = 5;
        } else {
            i4 = 68;
            i5 = 3;
        }
        addView(l46Var, nme.d(-2, -2.0f, i5, i4 - 4, 18.0f, (z ? 68 : 27) - 4, 0.0f));
    }

    public ar8(cb9 cb9Var, Context context, int i, String str, CharSequence charSequence) {
        super(context);
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        this.a = (byte) 3;
        boolean z = k96.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i5 = bkb.F6;
        zkb.x(this, mutate, i5, cb9Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            f = 0.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, nme.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        tb4.w(textView, i5, cb9Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            i3 = 3;
            f2 = 68.0f;
        }
        addView(textView, nme.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        l46 l46Var = new l46(getContext(), null);
        l46Var.setText(charSequence);
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, bkb.Fj, cb9Var.J0);
        zkb.G(l46Var, bkb.Wc, cb9Var.J0);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        if (z) {
            i4 = 5;
            f3 = 27.0f;
        } else {
            i4 = 3;
            f3 = 68.0f;
        }
        addView(l46Var, nme.d(-2, -2.0f, i4, f3, 18.0f, z ? 68.0f : 27.0f, 0.0f));
    }

    public ar8(Context context, byte b) {
        super(context);
        this.a = b;
    }
}
