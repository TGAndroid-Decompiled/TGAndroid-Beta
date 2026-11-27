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
public final class ir8 extends FrameLayout {
    public final byte a;

    public ir8(Context context, ec9 ec9Var, vnb vnbVar) {
        super(context);
        this.a = (byte) 3;
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.e(-1, -2, 23));
        de0 de0Var = new de0(context);
        de0Var.setImageDrawable(new b29(2131624315, hl.L(130.0f), hl.L(130.0f)));
        j.addView(de0Var, tre.r(130, 130, 17));
        TextView textView = new TextView(context);
        yob.X(textView, aob.G6, vnbVar);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131749958, null));
        j.addView(textView, tre.t(-2, -2, 17, 32, 12, 32, 9));
        p66 p66Var = new p66(context, null);
        yob.X(p66Var, aob.A6, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setGravity(17);
        p66Var.setText(ob6.M0(2131749959, null));
        p66Var.setMaxWidth(hl.L(200.0f));
        j.addView(p66Var, tre.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i = aob.Fi;
        yob.X(textView2, i, vnbVar);
        hf0 Y = aob.Y(aob.p1(0.1f, aob.v0(i, vnbVar)), 6, 6);
        uob K = yob.K(0.1f, i);
        textView2.setBackground(Y);
        yob.j(textView2, Y, null, K, vnbVar);
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131749960, null));
        textView2.setPadding(hl.L(13.0f), 0, hl.L(13.0f), 0);
        iye.a(textView2);
        j.addView(textView2, tre.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(ec9Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 18:
                aob.i3.setBounds(0, 0, getMeasuredWidth(), aob.i3.getIntrinsicHeight());
                aob.i3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 19:
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
            case 23:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 10:
            case 23:
                return false;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 8:
                canvas.drawLine(0.0f, hl.L(40.0f), getMeasuredWidth(), hl.L(40.0f), aob.j0);
                return;
            case 17:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, aob.j0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 13:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 12:
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
            case 13:
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 14:
                int childCount2 = getChildCount();
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < childCount2; i10++) {
                    if (getChildAt(i10).getVisibility() != 8) {
                        if (getChildAt(i10).getMeasuredWidth() + i8 > getMeasuredWidth()) {
                            i9 = uh9.w(8.0f, getChildAt(i10).getMeasuredHeight(), i9);
                            i8 = 0;
                        }
                        getChildAt(i10).layout(i8, i9, getChildAt(i10).getMeasuredWidth() + i8, getChildAt(i10).getMeasuredHeight() + i9);
                        i8 = uh9.w(16.0f, getChildAt(i10).getMeasuredWidth(), i8);
                    }
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), hl.L(60.0f)), View.MeasureSpec.getMode(i2)));
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            case 13:
            case 17:
            case 18:
            case 19:
            case 22:
            default:
                super.onMeasure(i, i2);
                return;
            case 6:
                super.onMeasure(i, ik8.E(36.0f, View.MeasureSpec.getSize(i2), 1073741824));
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(300.0f), View.MeasureSpec.getSize(i) - hl.L(32.0f)), Integer.MIN_VALUE), i2);
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), ik8.E(48.0f, 1, 1073741824));
                return;
            case 9:
                super.onMeasure(i, i2);
                return;
            case 12:
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
                    i4 = hl.L(16.0f) + i3 + i6;
                }
                setMeasuredDimension(measuredWidth, i4);
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                int childCount2 = getChildCount();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < childCount2; i11++) {
                    if (getChildAt(i11).getVisibility() != 8) {
                        if (getChildAt(i11).getMeasuredWidth() + i9 > View.MeasureSpec.getSize(i)) {
                            i10 = uh9.w(8.0f, getChildAt(i11).getMeasuredHeight(), i10);
                            i9 = 0;
                        }
                        i9 = uh9.w(16.0f, getChildAt(i11).getMeasuredWidth(), i9);
                        i8 = getChildAt(i11).getMeasuredHeight() + i10;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i8);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), 1073741824));
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), 1073741824));
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 21:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
                measureChildren(makeMeasureSpec, i2);
                int i12 = 0;
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    i12 = Math.max(i12, getChildAt(i13).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(500.0f), 1073741824));
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 23:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ir8(xd5 xd5Var, Activity activity, int i, String str, CharSequence charSequence) {
        super(activity);
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        this.a = (byte) 5;
        boolean z = ob6.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i6 = aob.G6;
        yob.x(this, mutate, i6, xd5Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            i2 = 5;
            f = 0.0f;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, tre.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        qd4.w(textView, i6, xd5Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            f2 = 68.0f;
            i3 = 3;
        }
        addView(textView, tre.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        p66 p66Var = new p66(getContext(), null);
        p66Var.setText(charSequence);
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, aob.Gj, xd5Var.J0);
        yob.G(p66Var, aob.Xc, xd5Var.J0);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        if (z) {
            i5 = 5;
            i4 = 27;
        } else {
            i4 = 68;
            i5 = 3;
        }
        addView(p66Var, tre.d(-2, -2.0f, i5, i4 - 4, 18.0f, (z ? 68 : 27) - 4, 0.0f));
    }

    public ir8(qe9 qe9Var, Context context, int i, String str, CharSequence charSequence) {
        super(context);
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        this.a = (byte) 4;
        boolean z = ob6.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i5 = aob.G6;
        yob.x(this, mutate, i5, qe9Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            f = 0.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, tre.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        qd4.w(textView, i5, qe9Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            f2 = 68.0f;
            i3 = 3;
        }
        addView(textView, tre.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        p66 p66Var = new p66(getContext(), null);
        p66Var.setText(charSequence);
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, aob.Gj, qe9Var.J0);
        yob.G(p66Var, aob.Xc, qe9Var.J0);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        if (z) {
            i4 = 5;
            f3 = 27.0f;
        } else {
            f3 = 68.0f;
            i4 = 3;
        }
        addView(p66Var, tre.d(-2, -2.0f, i4, f3, 18.0f, z ? 68.0f : 27.0f, 0.0f));
    }

    public ir8(Context context, byte b) {
        super(context);
        this.a = b;
    }

    public ir8(Context context) {
        super(context);
        this.a = (byte) 0;
        setPadding(hl.L(11.0f), hl.L(11.0f), hl.L(11.0f), hl.L(11.0f));
    }
}
