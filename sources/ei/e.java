package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.w9;
public final class e extends FrameLayout implements a6 {
    public final w9 f7539a;
    public final f6 f7540b;
    public final TextView f7541c;
    public final TextView d;

    public e(Context context, f6 f6Var) {
        super(context);
        this.f7540b = f6Var;
        w9 w9Var = new w9(context);
        this.f7539a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, w7.a6.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f7541c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, w7.a6.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.a6.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        w9 w9Var = this.f7539a;
        xf.p.a(canvas, drawable, (w9Var.getWidth() / 2.0f) + w9Var.getLeft(), (w9Var.getHeight() / 2.0f) + w9Var.getTop(), w9Var.getHeight());
    }

    @Override
    public final void e() {
        int i10 = j6.G6;
        f6 f6Var = this.f7540b;
        this.f7541c.setTextColor(j6.v0(i10, f6Var));
        this.d.setTextColor(j6.v0(j6.f18325z6, f6Var));
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
        this.f7541c.setText(charSequence);
    }
}
