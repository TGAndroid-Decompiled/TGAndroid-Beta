package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class e0 extends LinearLayout {
    public final TextView f434a;
    public final TextView f435b;
    public boolean f436c;

    public e0(Context context) {
        super(context);
        int i10;
        setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f434a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.w0(null, j6.f18034j5, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        addView(textView, a6.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.f435b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(j6.w0(null, j6.f18161q5, false));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(textView2, a6.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f436c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), j6.f18049k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
