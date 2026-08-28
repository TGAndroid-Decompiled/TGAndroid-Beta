package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
public final class s extends LinearLayout {
    public final TextView f14375a;
    public final TextView f14376b;
    public boolean f14377c;

    public s(Context context) {
        super(context);
        int i9;
        setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f14375a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(f6.w0(null, f6.f23108j5, false));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9);
        addView(textView, e6.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.f14376b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(f6.w0(null, f6.f23228q5, false));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(textView2, e6.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f14377c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
