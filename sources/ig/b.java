package ig;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.nq;
public final class b extends FrameLayout {
    public final k5 f7491a;
    public final ImageView f7492b;

    public b(Context context, f6 f6Var) {
        super(context);
        int i10;
        k5 k5Var = new k5(context);
        this.f7491a = k5Var;
        k5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        int i11 = j6.L6;
        k5Var.setTextColor(j6.v0(i11, f6Var));
        k5Var.setTag(Integer.valueOf(i11));
        addView(k5Var);
        ImageView imageView = new ImageView(context);
        this.f7492b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        k5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = j6.v0(j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f20032k7, f6Var), mode));
        imageView.setImageDrawable(new nq(drawable, drawable2));
        setBackgroundColor(j6.v0(j6.f19977h5, f6Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        int i14 = i12 - i10;
        k5 k5Var = this.f7491a;
        int textHeight = ((i13 - i11) - k5Var.getTextHeight()) / 2;
        boolean z10 = LocaleController.isRTL;
        float f10 = 23.0f;
        ImageView imageView = this.f7492b;
        if (z10) {
            int measuredWidth2 = getMeasuredWidth() - k5Var.getMeasuredWidth();
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
        k5Var.layout(dp, textHeight, k5Var.getMeasuredWidth() + dp, k5Var.getMeasuredHeight() + textHeight);
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
        this.f7491a.measure(org.telegram.ui.b.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f7492b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
