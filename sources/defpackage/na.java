package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class na extends FrameLayout {
    public final lka a;
    public final ImageView b;

    public na(Context context, ylb ylbVar) {
        super(context);
        int i;
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTextSize(16);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        lkaVar.setGravity(i);
        int i2 = cmb.K6;
        anb.W(lkaVar, i2, ylbVar);
        lkaVar.setTag(Integer.valueOf(i2));
        addView(lkaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        lkaVar.l(jb6.M0(2131753568, null), false);
        Drawable drawable = getResources().getDrawable(2131232576);
        Drawable drawable2 = getResources().getDrawable(2131232577);
        int i3 = cmb.M6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.x(this, drawable, i3, ylbVar, mode);
        anb.x(this, drawable2, cmb.j7, ylbVar, mode);
        imageView.setImageDrawable(new sn2(drawable, drawable2));
        anb.h(cmb.g5, ylbVar, this);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int measuredWidth;
        int i5 = i3 - i;
        lka lkaVar = this.a;
        int textHeight = ((i4 - i2) - lkaVar.getTextHeight()) / 2;
        boolean z2 = jb6.a0;
        float f = 23.0f;
        ImageView imageView = this.b;
        if (z2) {
            int measuredWidth2 = getMeasuredWidth() - lkaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f = 68.0f;
            }
            L = measuredWidth2 - gm.L(f);
        } else {
            if (imageView.getVisibility() == 0) {
                f = 68.0f;
            }
            L = gm.L(f);
        }
        lkaVar.layout(L, textHeight, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight);
        if (!jb6.a0) {
            measuredWidth = gm.L(24.0f);
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - gm.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.a.measure(wi8.f(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
        setMeasuredDimension(size, gm.L(50.0f));
    }
}
