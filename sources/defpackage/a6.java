package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class a6 extends FrameLayout {
    public final byte a;

    public a6(Context context, int i, String str, CharSequence charSequence, wjb wjbVar) {
        super(context);
        this.a = (byte) 4;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = bkb.F6;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i);
        addView(imageView, nme.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        l46 l46Var = new l46(context, null);
        l46Var.setTypeface(gl.o());
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, i2, wjbVar);
        int i3 = bkb.Wc;
        zkb.G(l46Var, i3, wjbVar);
        l46Var.setText(str);
        linearLayout.addView(l46Var, nme.t(-1, -2, 55, 0, 0, 0, 2));
        l46 l46Var2 = new l46(context, null);
        l46Var2.setTextSize(1, 14.0f);
        zkb.X(l46Var2, bkb.x6, wjbVar);
        zkb.G(l46Var2, i3, wjbVar);
        l46Var2.setText(charSequence);
        linearLayout.addView(l46Var2, nme.t(-1, -2, 55, 0, 0, 0, 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 23:
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
            case 13:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 27:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 26:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int intrinsicHeight = bkb.h3.getIntrinsicHeight();
                bkb.h3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                bkb.h3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), bkb.i2);
                return;
            case 28:
                int intrinsicHeight2 = bkb.h3.getIntrinsicHeight();
                bkb.h3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                bkb.h3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), bkb.i2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        switch (this.a) {
            case 0:
                return;
            case 21:
                super.onLayout(z, i, i2, i3, i4);
                if (getParent() instanceof View) {
                    float min = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    if (((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17) {
                        f = getHeight() / 2.0f;
                    } else {
                        f = 0.0f;
                    }
                    setPivotY(f);
                    setScaleX(min);
                    setScaleY(min);
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            case 1:
            case 5:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                super.onMeasure(i, i2);
                return;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), gl.L(325.0f)), View.MeasureSpec.getMode(i)), i2);
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), 1073741824));
                return;
            case 7:
                super.onMeasure(i, i2);
                return;
            case 8:
                super.onMeasure(i, i2);
                return;
            case 9:
                super.onMeasure(i, i2);
                return;
            case 10:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(12.0f), 1073741824));
                return;
            case 12:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(86.0f), 1073741824));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(120.0f), 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 24:
                super.onMeasure(i, i2);
                setPivotY(getMeasuredHeight());
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 17:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 16:
                super.setTranslationY(f);
                setPadding(0, 0, (int) f, 0);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public a6(int i, Context context, String str) {
        super(context);
        this.a = (byte) 20;
        setPadding(0, gl.L(7.0f), 0, gl.L(7.0f));
        ImageView k = tb4.k(context, i);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = bkb.i5;
        zkb.s(k, i2, null, PorterDuff.Mode.MULTIPLY);
        boolean z = k96.a0;
        addView(k, nme.d(24, 24.0f, (z ? 5 : 3) | 16, z ? 0.0f : 22.0f, 0.0f, z ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        zkb.X(textView, i2, null);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(k96.a0 ? 5 : 3);
        textView.setText(str);
        boolean z2 = k96.a0;
        addView(textView, nme.d(-1, -2.0f, 23, z2 ? 0.0f : 61.0f, 0.0f, z2 ? 61.0f : 0.0f, 0.0f));
    }

    public a6(Context context, byte b) {
        super(context);
        this.a = b;
    }

    public a6(Context context) {
        super(context);
        this.a = (byte) 29;
        setPadding(gl.L(11.0f), gl.L(11.0f), gl.L(11.0f), gl.L(11.0f));
    }

    private final void a(boolean z, int i, int i2, int i3, int i4) {
    }
}
