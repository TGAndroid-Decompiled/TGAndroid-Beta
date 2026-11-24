package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
public abstract class uy0 extends FrameLayout {
    public final byte a;
    public final ImageView b;
    public final ImageView c;
    public final ty0 d;

    public uy0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, nme.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        ty0 ty0Var = new ty0(context, true, null, (byte) 0);
        this.d = ty0Var;
        ty0Var.setReportChanges(true);
        ty0Var.setDelegate(new l69(this, (byte) 13));
        ty0Var.setImportantForAccessibility(2);
        addView(ty0Var, nme.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        addView(imageView2, nme.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(2131232080);
        imageView2.setImageResource(2131232079);
        this.a = (byte) 48;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = bkb.l6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(this.b, i, null, mode);
        zkb.s(this.c, i, null, mode);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(this.a), 1073741824));
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!super.performAccessibilityAction(i, bundle) && !this.d.getSeekBarAccessibilityDelegate().g(this, i, bundle)) {
            return false;
        }
        return true;
    }

    public void setProgress(float f) {
        this.d.setProgress(f);
    }
}
