package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class e extends FrameLayout implements x5 {
    public final w9 f9077a;
    public final d6 f9078b;
    public final TextView f9079c;
    public final TextView d;

    public e(Context context, d6 d6Var) {
        super(context);
        this.f9078b = d6Var;
        w9 w9Var = new w9(context);
        this.f9077a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, y5.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9079c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, y5.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, y5.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = h6.S0;
        w9 w9Var = this.f9077a;
        yf.p.a(canvas, drawable, (w9Var.getWidth() / 2.0f) + w9Var.getLeft(), (w9Var.getHeight() / 2.0f) + w9Var.getTop(), w9Var.getHeight());
    }

    @Override
    public final void e() {
        int i10 = h6.G6;
        d6 d6Var = this.f9078b;
        this.f9079c.setTextColor(h6.v0(i10, d6Var));
        this.d.setTextColor(h6.v0(h6.f19461z6, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9079c.setText(charSequence);
    }
}
