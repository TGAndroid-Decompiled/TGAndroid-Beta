package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
public final class vk8 extends ImageView {
    public final byte a;
    public final yk8 b;

    public vk8(yk8 yk8Var, Context context, int i, int i2) {
        super(context);
        this.b = yk8Var;
        this.a = i;
        setBackground(cmb.f0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i2);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new hb(this, i, (byte) 5));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(40.0f), gm.L(40.0f));
    }
}
