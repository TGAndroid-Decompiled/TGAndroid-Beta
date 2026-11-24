package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.o;
public final class mw extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;

    public mw(o oVar, Activity activity, boolean z) {
        super(activity);
        int i;
        this.d = z;
        setTag(90);
        TextView textView = new TextView(activity);
        this.a = textView;
        if (z) {
            i = 2131746725;
        } else {
            i = 2131746726;
        }
        tb4.u(12.0f, i, 1, textView, null);
        textView.setGravity(17);
        textView.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        addView(textView, nme.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        addView(textView2, nme.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), 1073741824));
    }
}
