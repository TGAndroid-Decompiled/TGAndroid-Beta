package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class o extends LinearLayout {
    public final TextView f13656a;
    public final TextView f13657b;
    public boolean f13658c;

    public o(Context context) {
        super(context);
        int i7;
        setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f13656a = textView;
        textView.setTextSize(1, 16.0f);
        t6.U(textView, m6.f29455j5, null);
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        addView(textView, na.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.f13657b = textView2;
        textView2.setTextSize(1, 13.0f);
        t6.U(textView2, m6.f29586q5, null);
        textView2.setGravity(hd.f24408a0 ? 5 : 3);
        addView(textView2, na.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13658c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), m6.f29470k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(56.0f), 1073741824));
    }
}
