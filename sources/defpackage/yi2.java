package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class yi2 extends FrameLayout {
    public final View a;
    public final TextView b;

    public yi2(Activity activity) {
        super(activity);
        View view = new View(activity);
        this.a = view;
        int L = hl.L(4.0f);
        int i = aob.Fi;
        int w0 = aob.w0(null, i, false);
        int i2 = aob.Hi;
        int w02 = aob.w0(null, i2, false);
        Drawable i0 = aob.i0(L, L, L, L, w0, w02, w02);
        uob M = yob.M(i);
        uob M2 = yob.M(i2);
        view.setBackground(i0);
        yob.j(view, i0, M, M2, null);
        addView(view, tre.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        qd4.w(textView, aob.Ji, null, 1, 14.0f);
        addView(textView, tre.e(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
