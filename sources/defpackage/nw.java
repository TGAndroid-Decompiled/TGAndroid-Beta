package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.o;
public final class nw extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;
    public final boolean d;

    public nw(o oVar, Activity activity, boolean z) {
        super(activity);
        int i;
        this.d = z;
        setTag(90);
        TextView textView = new TextView(activity);
        this.a = textView;
        if (z) {
            i = 2131746645;
        } else {
            i = 2131746646;
        }
        qd4.u(12.0f, i, 1, textView, null);
        textView.setGravity(17);
        textView.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        addView(textView, tre.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        addView(textView2, tre.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), 1073741824));
    }
}
