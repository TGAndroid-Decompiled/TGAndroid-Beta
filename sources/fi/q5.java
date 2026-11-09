package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
public final class q5 extends ImageView {
    public final int f12662a;
    public final s5 f12663b;

    public q5(s5 s5Var, Context context, int i7, int i10) {
        super(context);
        this.f12663b = s5Var;
        this.f12662a = i7;
        setBackground(org.telegram.ui.ActionBar.l6.h0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i10);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new ai.v(this, i7, 4));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
    }
}
