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
public final class ct8 extends FrameLayout {
    public final byte a;

    public ct8(Context context, sa9 sa9Var, ylb ylbVar) {
        super(context);
        this.a = (byte) 2;
        LinearLayout i = hg9.i(context, 1);
        addView(i, qoe.e(-1, -2, 23));
        bf0 bf0Var = new bf0(context);
        bf0Var.setImageDrawable(new p09(2131624315, gm.L(130.0f), gm.L(130.0f)));
        i.addView(bf0Var, qoe.r(130, 130, 17));
        TextView textView = new TextView(context);
        anb.X(textView, cmb.F6, ylbVar);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131749944, null));
        i.addView(textView, qoe.t(-2, -2, 17, 32, 12, 32, 9));
        l66 l66Var = new l66(context, null);
        anb.X(l66Var, cmb.z6, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(17);
        l66Var.setText(jb6.M0(2131749945, null));
        l66Var.setMaxWidth(gm.L(200.0f));
        i.addView(l66Var, qoe.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i2 = cmb.Ei;
        anb.X(textView2, i2, ylbVar);
        fg0 Y = cmb.Y(cmb.p1(0.1f, cmb.v0(i2, ylbVar)), 6, 6);
        wmb K = anb.K(0.1f, i2);
        textView2.setBackground(Y);
        anb.j(textView2, Y, null, K, ylbVar);
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131749946, null));
        textView2.setPadding(gm.L(13.0f), 0, gm.L(13.0f), 0);
        rve.a(textView2);
        i.addView(textView2, qoe.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(sa9Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 17:
                cmb.h3.setBounds(0, 0, getMeasuredWidth(), cmb.h3.getIntrinsicHeight());
                cmb.h3.draw(canvas);
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
                canvas.drawLine(0.0f, gm.L(40.0f), getMeasuredWidth(), gm.L(40.0f), cmb.j0);
                return;
            case 16:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, cmb.j0);
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
                            i9 = hg9.v(8.0f, getChildAt(i10).getMeasuredHeight(), i9);
                            i8 = 0;
                        }
                        getChildAt(i10).layout(i8, i9, getChildAt(i10).getMeasuredWidth() + i8, getChildAt(i10).getMeasuredHeight() + i9);
                        i8 = hg9.v(16.0f, getChildAt(i10).getMeasuredWidth(), i8);
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), gm.L(60.0f)), View.MeasureSpec.getMode(i2)));
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
                super.onMeasure(i, wi8.E(36.0f, View.MeasureSpec.getSize(i2), 1073741824));
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(300.0f), View.MeasureSpec.getSize(i) - gm.L(32.0f)), Integer.MIN_VALUE), i2);
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), wi8.E(48.0f, 1, 1073741824));
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
                    i4 = gm.L(16.0f) + i3 + i6;
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
                            i10 = hg9.v(8.0f, getChildAt(i11).getMeasuredHeight(), i10);
                            i9 = 0;
                        }
                        i9 = hg9.v(16.0f, getChildAt(i11).getMeasuredWidth(), i9);
                        i8 = getChildAt(i11).getMeasuredHeight() + i10;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i8);
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), 1073741824));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), 1073741824));
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(500.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(500.0f), 1073741824));
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

    public ct8(ud5 ud5Var, Activity activity, int i, String str, CharSequence charSequence) {
        super(activity);
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        this.a = (byte) 4;
        boolean z = jb6.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i6 = cmb.F6;
        anb.x(this, mutate, i6, ud5Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            f = 0.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, qoe.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        td4.x(textView, i6, ud5Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            f2 = 68.0f;
            i3 = 3;
        }
        addView(textView, qoe.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        l66 l66Var = new l66(getContext(), null);
        l66Var.setText(charSequence);
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, cmb.Fj, ud5Var.J0);
        anb.G(l66Var, cmb.Wc, ud5Var.J0);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        if (z) {
            i4 = 27;
            i5 = 5;
        } else {
            i4 = 68;
            i5 = 3;
        }
        addView(l66Var, qoe.d(-2, -2.0f, i5, i4 - 4, 18.0f, (z ? 68 : 27) - 4, 0.0f));
    }

    public ct8(cd9 cd9Var, Context context, int i, String str, CharSequence charSequence) {
        super(context);
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        this.a = (byte) 3;
        boolean z = jb6.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i5 = cmb.F6;
        anb.x(this, mutate, i5, cd9Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            f = 0.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, qoe.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        td4.x(textView, i5, cd9Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            i3 = 3;
            f2 = 68.0f;
        }
        addView(textView, qoe.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        l66 l66Var = new l66(getContext(), null);
        l66Var.setText(charSequence);
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, cmb.Fj, cd9Var.J0);
        anb.G(l66Var, cmb.Wc, cd9Var.J0);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        if (z) {
            i4 = 5;
            f3 = 27.0f;
        } else {
            i4 = 3;
            f3 = 68.0f;
        }
        addView(l66Var, qoe.d(-2, -2.0f, i4, f3, 18.0f, z ? 68.0f : 27.0f, 0.0f));
    }

    public ct8(Context context, byte b) {
        super(context);
        this.a = b;
    }
}
