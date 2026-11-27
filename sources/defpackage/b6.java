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
public final class b6 extends FrameLayout {
    public final byte a;

    public b6(Context context, int i, String str, CharSequence charSequence, vnb vnbVar) {
        super(context);
        this.a = (byte) 4;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = aob.G6;
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i);
        addView(imageView, tre.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        p66 p66Var = new p66(context, null);
        p66Var.setTypeface(hl.o());
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, i2, vnbVar);
        int i3 = aob.Xc;
        yob.G(p66Var, i3, vnbVar);
        p66Var.setText(str);
        linearLayout.addView(p66Var, tre.t(-1, -2, 55, 0, 0, 0, 2));
        p66 p66Var2 = new p66(context, null);
        p66Var2.setTextSize(1, 14.0f);
        yob.X(p66Var2, aob.y6, vnbVar);
        yob.G(p66Var2, i3, vnbVar);
        p66Var2.setText(charSequence);
        linearLayout.addView(p66Var2, tre.t(-1, -2, 55, 0, 0, 0, 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 24:
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
            case 14:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 28:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 27:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int intrinsicHeight = aob.i3.getIntrinsicHeight();
                aob.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                aob.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), aob.j2);
                return;
            case 29:
                int intrinsicHeight2 = aob.i3.getIntrinsicHeight();
                aob.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                aob.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), aob.j2);
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
            case 13:
                return;
            case 22:
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
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                super.onMeasure(i, i2);
                return;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
                return;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), hl.L(325.0f)), View.MeasureSpec.getMode(i)), i2);
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824));
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(12.0f), 1073741824));
                return;
            case 12:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(86.0f), 1073741824));
                return;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(120.0f), 1073741824));
                return;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 25:
                super.onMeasure(i, i2);
                setPivotY(getMeasuredHeight());
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 18:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 17:
                super.setTranslationY(f);
                setPadding(0, 0, (int) f, 0);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public b6(int i, Context context, String str) {
        super(context);
        this.a = (byte) 21;
        setPadding(0, hl.L(7.0f), 0, hl.L(7.0f));
        ImageView k = qd4.k(context, i);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = aob.j5;
        yob.s(k, i2, null, PorterDuff.Mode.MULTIPLY);
        boolean z = ob6.a0;
        addView(k, tre.d(24, 24.0f, (z ? 5 : 3) | 16, z ? 0.0f : 22.0f, 0.0f, z ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yob.X(textView, i2, null);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(ob6.a0 ? 5 : 3);
        textView.setText(str);
        boolean z2 = ob6.a0;
        addView(textView, tre.d(-1, -2.0f, 23, z2 ? 0.0f : 61.0f, 0.0f, z2 ? 61.0f : 0.0f, 0.0f));
    }

    public b6(Context context, byte b) {
        super(context);
        this.a = b;
    }

    private final void a(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void b(boolean z, int i, int i2, int i3, int i4) {
    }
}
