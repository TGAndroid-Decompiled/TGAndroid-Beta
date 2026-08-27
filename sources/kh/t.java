package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;

public final class t extends LinearLayout {

    public final TextView f15226a;

    public final TextView f15227b;

    public boolean f15228c;

    public t(Context context) {
        super(context);
        setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f15226a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.w0(null, g6.f23161j5, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(textView, z5.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.f15227b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(g6.w0(null, g6.f23283q5, false));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(textView2, z5.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15228c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
