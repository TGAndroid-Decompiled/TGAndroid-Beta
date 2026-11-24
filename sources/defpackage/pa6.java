package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class pa6 extends FrameLayout {
    public final int a;

    public pa6(Context context, int i, int i2) {
        super(context);
        this.a = i2;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i);
        addView(radialProgressView, qoe.e(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.a, 1073741824));
    }

    public pa6(Context context) {
        this(context, gm.L(40.0f), gm.L(54.0f));
    }
}
