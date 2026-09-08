package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class e extends FrameLayout implements z5 {
    public final x9 f10704a;
    public final f6 f10705b;
    public final TextView f10706c;
    public final TextView d;

    public e(Context context, f6 f6Var) {
        super(context);
        this.f10705b = f6Var;
        x9 x9Var = new x9(context);
        this.f10704a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(x9Var, x5.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f10706c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, x5.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, x5.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int i10 = j6.G6;
        f6 f6Var = this.f10705b;
        this.f10706c.setTextColor(j6.v0(i10, f6Var));
        this.d.setTextColor(j6.v0(j6.f21088z6, f6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        x9 x9Var = this.f10704a;
        yf.p.a(canvas, drawable, (x9Var.getWidth() / 2.0f) + x9Var.getLeft(), (x9Var.getHeight() / 2.0f) + x9Var.getTop(), x9Var.getHeight());
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
        this.f10706c.setText(charSequence);
    }
}
