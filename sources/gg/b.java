package gg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.jq;
public final class b extends FrameLayout {
    public final h5 f7280a;
    public final ImageView f7281b;

    public b(Context context, c6 c6Var) {
        super(context);
        int i10;
        h5 h5Var = new h5(context);
        this.f7280a = h5Var;
        h5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        int i11 = g6.L6;
        h5Var.setTextColor(g6.v0(i11, c6Var));
        h5Var.setTag(Integer.valueOf(i11));
        addView(h5Var);
        ImageView imageView = new ImageView(context);
        this.f7281b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        h5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = g6.v0(g6.N6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23190k7, c6Var), mode));
        imageView.setImageDrawable(new jq(drawable, drawable2));
        setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        int i14 = i12 - i10;
        h5 h5Var = this.f7280a;
        int textHeight = ((i13 - i11) - h5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        float f9 = 23.0f;
        ImageView imageView = this.f7281b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - h5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f9 = 68.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f9);
        } else {
            if (imageView.getVisibility() == 0) {
                f9 = 68.0f;
            }
            dp = AndroidUtilities.dp(f9);
        }
        h5Var.layout(dp, textHeight, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight);
        if (!LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(24.0f);
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f7280a.measure(org.telegram.ui.b.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f7281b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
