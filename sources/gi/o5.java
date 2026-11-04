package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
public final class o5 extends ImageView {
    public final int f13332a;
    public final q5 f13333b;

    public o5(q5 q5Var, Context context, int i3, int i10) {
        super(context);
        this.f13333b = q5Var;
        this.f13332a = i3;
        setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i10);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new bi.q(this, i3, 4));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
    }
}
