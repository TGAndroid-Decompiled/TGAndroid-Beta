package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class e extends FrameLayout implements z5 {
    public final u9 f9090a;
    public final e6 f9091b;
    public final TextView f9092c;
    public final TextView d;

    public e(Context context, e6 e6Var) {
        super(context);
        this.f9091b = e6Var;
        u9 u9Var = new u9(context);
        this.f9090a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(u9Var, x5.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9092c = textView;
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
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = i6.S0;
        u9 u9Var = this.f9090a;
        yf.p.a(canvas, drawable, (u9Var.getWidth() / 2.0f) + u9Var.getLeft(), (u9Var.getHeight() / 2.0f) + u9Var.getTop(), u9Var.getHeight());
    }

    @Override
    public final void e() {
        int i10 = i6.G6;
        e6 e6Var = this.f9091b;
        this.f9092c.setTextColor(i6.v0(i10, e6Var));
        this.d.setTextColor(i6.v0(i6.f19237z6, e6Var));
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
        this.f9092c.setText(charSequence);
    }
}
