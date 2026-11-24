package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class na extends FrameLayout {
    public final jia a;
    public final ImageView b;

    public na(Context context, wjb wjbVar) {
        super(context);
        int i;
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTextSize(16);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        jiaVar.setGravity(i);
        int i2 = bkb.K6;
        zkb.W(jiaVar, i2, wjbVar);
        jiaVar.setTag(Integer.valueOf(i2));
        addView(jiaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        jiaVar.l(k96.M0(2131753600, null), false);
        Drawable drawable = getResources().getDrawable(2131232564);
        Drawable drawable2 = getResources().getDrawable(2131232565);
        int i3 = bkb.M6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(this, drawable, i3, wjbVar, mode);
        zkb.x(this, drawable2, bkb.j7, wjbVar, mode);
        imageView.setImageDrawable(new fm2(drawable, drawable2));
        zkb.h(bkb.g5, wjbVar, this);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int measuredWidth;
        int i5 = i3 - i;
        jia jiaVar = this.a;
        int textHeight = ((i4 - i2) - jiaVar.getTextHeight()) / 2;
        boolean z2 = k96.a0;
        float f = 23.0f;
        ImageView imageView = this.b;
        if (z2) {
            int measuredWidth2 = getMeasuredWidth() - jiaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f = 68.0f;
            }
            L = measuredWidth2 - gl.L(f);
        } else {
            if (imageView.getVisibility() == 0) {
                f = 68.0f;
            }
            L = gl.L(f);
        }
        jiaVar.layout(L, textHeight, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight);
        if (!k96.a0) {
            measuredWidth = gl.L(24.0f);
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - gl.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a.measure(ug8.f(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
        setMeasuredDimension(size, gl.L(50.0f));
    }
}
