package dg;

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
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.fq;
public final class b extends FrameLayout {
    public final h5 f4495a;
    public final ImageView f4496b;

    public b(Context context, b6 b6Var) {
        super(context);
        int i9;
        h5 h5Var = new h5(context);
        this.f4495a = h5Var;
        h5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        h5Var.setGravity(i9);
        int i10 = f6.L6;
        h5Var.setTextColor(f6.v0(i10, b6Var));
        h5Var.setTag(Integer.valueOf(i10));
        addView(h5Var);
        ImageView imageView = new ImageView(context);
        this.f4496b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        h5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = f6.v0(f6.N6, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.f23128k7, b6Var), mode));
        imageView.setImageDrawable(new fq(drawable, drawable2));
        setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp;
        int measuredWidth;
        int i13 = i11 - i9;
        h5 h5Var = this.f4495a;
        int textHeight = ((i12 - i10) - h5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        float f10 = 23.0f;
        ImageView imageView = this.f4496b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - h5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f10 = 68.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f10);
        } else {
            if (imageView.getVisibility() == 0) {
                f10 = 68.0f;
            }
            dp = AndroidUtilities.dp(f10);
        }
        h5Var.layout(dp, textHeight, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight);
        if (!LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(24.0f);
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        this.f4495a.measure(ll.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f4496b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
