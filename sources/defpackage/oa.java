package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class oa extends FrameLayout {
    public final ema a;
    public final ImageView b;

    public oa(Context context, vnb vnbVar) {
        super(context);
        int i;
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setTextSize(16);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        emaVar.setGravity(i);
        int i2 = aob.L6;
        yob.W(emaVar, i2, vnbVar);
        emaVar.setTag(Integer.valueOf(i2));
        addView(emaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        emaVar.l(ob6.M0(2131753596, null), false);
        Drawable drawable = getResources().getDrawable(2131232575);
        Drawable drawable2 = getResources().getDrawable(2131232576);
        int i3 = aob.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(this, drawable, i3, vnbVar, mode);
        yob.x(this, drawable2, aob.k7, vnbVar, mode);
        imageView.setImageDrawable(new zm2(drawable, drawable2));
        yob.h(aob.h5, vnbVar, this);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int measuredWidth;
        int i5 = i3 - i;
        ema emaVar = this.a;
        int textHeight = ((i4 - i2) - emaVar.getTextHeight()) / 2;
        boolean z2 = ob6.a0;
        float f = 23.0f;
        ImageView imageView = this.b;
        if (z2) {
            int measuredWidth2 = getMeasuredWidth() - emaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f = 68.0f;
            }
            L = measuredWidth2 - hl.L(f);
        } else {
            if (imageView.getVisibility() == 0) {
                f = 68.0f;
            }
            L = hl.L(f);
        }
        emaVar.layout(L, textHeight, emaVar.getMeasuredWidth() + L, emaVar.getMeasuredHeight() + textHeight);
        if (!ob6.a0) {
            measuredWidth = hl.L(24.0f);
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - hl.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a.measure(ik8.f(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
        setMeasuredDimension(size, hl.L(50.0f));
    }
}
