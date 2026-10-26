package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class t extends LinearLayout {
    public final TextView f10012a;
    public final TextView f10013b;
    public boolean f10014c;

    public t(Context context) {
        super(context);
        int i10;
        setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f10012a = textView;
        textView.setTextSize(1, 16.0f);
        f7.V(textView, y6.f23464j5, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        addView(textView, gb1.x(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.f10013b = textView2;
        textView2.setTextSize(1, 13.0f);
        f7.V(textView2, y6.q5, null);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(textView2, gb1.x(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10014c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
