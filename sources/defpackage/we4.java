package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class we4 extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public we4(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.q6, null);
        bs2.r(16.0f, 1, 2131751678, textView, null);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        if (ob6.a0) {
            i3 = 16;
            i2 = 0;
        } else {
            i2 = 16;
            i3 = 0;
        }
        textView.setPadding(i3, 0, i2, 0);
        boolean z = ob6.a0;
        if (z) {
            f = 0.0f;
        } else {
            f = 64.0f;
        }
        if (z) {
            f2 = 64.0f;
        } else {
            f2 = 0.0f;
        }
        addView(textView, tre.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        Drawable drawable = context.getResources().getDrawable(2131232575);
        Drawable drawable2 = context.getResources().getDrawable(2131232576);
        int i4 = aob.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(this, drawable, i4, null, mode);
        yob.x(this, drawable2, aob.k7, null, mode);
        imageView.setImageDrawable(new zm2(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z2 = ob6.a0;
        int i5 = (z2 ? 5 : 3) | 16;
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = 16.0f;
        }
        if (z2) {
            f4 = 16.0f;
        } else {
            f4 = 0.0f;
        }
        addView(imageView, tre.d(32, 32.0f, i5, f3, 0.0f, f4, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            TextView textView = this.a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(45.0f), 1073741824));
    }

    @Override
    public final void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        float f2 = 0.5f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        this.a.setAlpha(f);
        if (z) {
            f2 = 1.0f;
        }
        this.b.setAlpha(f2);
    }
}
