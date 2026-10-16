package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import w7.z5;
public final class w extends LinearLayout {
    public final TextView f4796a;
    public final TextView f4797b;
    public boolean f4798c;

    public w(Context context) {
        super(context);
        int i10;
        setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f4796a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.x0(null, g6.f19707j5, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        addView(textView, z5.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.f4797b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(g6.x0(null, g6.f19838q5, false));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(textView2, z5.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4798c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), g6.f19722k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
