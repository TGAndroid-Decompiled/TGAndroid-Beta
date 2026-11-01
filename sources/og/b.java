package og;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.eq;
public final class b extends FrameLayout {
    public final u5 f14169a;
    public final ImageView f14170b;

    public b(Context context, p6 p6Var) {
        super(context);
        int i10;
        u5 u5Var = new u5(context);
        this.f14169a = u5Var;
        u5Var.setTextSize(16);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u5Var.setGravity(i10);
        int i11 = t6.L6;
        a7.Y(u5Var, i11, p6Var);
        u5Var.setTag(Integer.valueOf(i11));
        addView(u5Var);
        ImageView imageView = new ImageView(context);
        this.f14170b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        u5Var.k(dd.L0(2131753603, null));
        Drawable drawable = getResources().getDrawable(2131232556);
        Drawable drawable2 = getResources().getDrawable(2131232557);
        int i12 = t6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        a7.y(this, drawable, i12, p6Var, mode);
        a7.y(this, drawable2, t6.f21060k7, p6Var, mode);
        imageView.setImageDrawable(new eq(drawable, drawable2));
        a7.i(t6.f21002h5, this, p6Var);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        int measuredWidth;
        int i14 = i12 - i10;
        u5 u5Var = this.f14169a;
        int textHeight = ((i13 - i11) - u5Var.getTextHeight()) / 2;
        boolean z11 = dd.X;
        float f7 = 23.0f;
        ImageView imageView = this.f14170b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - u5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f7 = 68.0f;
            }
            L = measuredWidth2 - i0.L(f7);
        } else {
            if (imageView.getVisibility() == 0) {
                f7 = 68.0f;
            }
            L = i0.L(f7);
        }
        u5Var.layout(L, textHeight, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight);
        if (!dd.X) {
            measuredWidth = i0.L(24.0f);
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - i0.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f14169a.measure(a30.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i0.L(20.0f), 1073741824));
        this.f14170b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i0.L(50.0f), 1073741824));
        setMeasuredDimension(size, i0.L(50.0f));
    }
}
