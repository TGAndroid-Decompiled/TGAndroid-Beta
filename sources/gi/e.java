package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.z9;
import w7.z5;
public final class e extends FrameLayout implements x5 {
    public final z9 f10174a;
    public final c6 f10175b;
    public final TextView f10176c;
    public final TextView d;

    public e(Context context, c6 c6Var) {
        super(context);
        this.f10175b = c6Var;
        z9 z9Var = new z9(context);
        this.f10174a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(z9Var, z5.a(72.0f, 0.0f, 36.0f, 0.0f, 0.0f, 72, 49));
        TextView textView = new TextView(context);
        this.f10176c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, z5.a(-2.0f, 24.0f, 123.0f, 24.0f, 0.0f, -1, 49));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, z5.a(-2.0f, 32.0f, 157.0f, 32.0f, 0.0f, -1, 49));
        d();
    }

    @Override
    public final void d() {
        int i10 = g6.G6;
        c6 c6Var = this.f10175b;
        this.f10176c.setTextColor(g6.w0(i10, c6Var));
        this.d.setTextColor(g6.w0(g6.f20005z6, c6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = g6.S0;
        z9 z9Var = this.f10174a;
        zf.q.a(canvas, drawable, (z9Var.getWidth() / 2.0f) + z9Var.getLeft(), (z9Var.getHeight() / 2.0f) + z9Var.getTop(), z9Var.getHeight());
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
        this.f10176c.setText(charSequence);
    }
}
