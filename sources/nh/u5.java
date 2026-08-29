package nh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class u5 extends ImageView {
    public final int f18720a;
    public final w5 f18721b;

    public u5(w5 w5Var, Context context, int i10, int i11) {
        super(context);
        this.f18721b = w5Var;
        this.f18720a = i10;
        setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i11);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new jh.y0(this, i10, 3));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
    }
}
