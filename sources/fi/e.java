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
import org.telegram.ui.Components.y9;
public final class e extends FrameLayout implements x5 {
    public final y9 f9956a;
    public final d6 f9957b;
    public final TextView f9958c;
    public final TextView d;

    public e(Context context, d6 d6Var) {
        super(context);
        this.f9957b = d6Var;
        y9 y9Var = new y9(context);
        this.f9956a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var, w7.x5.a(72.0f, 0.0f, 36.0f, 0.0f, 0.0f, 72, 49));
        TextView textView = new TextView(context);
        this.f9958c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, w7.x5.a(-2.0f, 24.0f, 123.0f, 24.0f, 0.0f, -1, 49));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.x5.a(-2.0f, 32.0f, 157.0f, 32.0f, 0.0f, -1, 49));
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = h6.S0;
        y9 y9Var = this.f9956a;
        yf.p.a(canvas, drawable, (y9Var.getWidth() / 2.0f) + y9Var.getLeft(), (y9Var.getHeight() / 2.0f) + y9Var.getTop(), y9Var.getHeight());
    }

    @Override
    public final void e() {
        int i10 = h6.G6;
        d6 d6Var = this.f9957b;
        this.f9958c.setTextColor(h6.w0(i10, d6Var));
        this.d.setTextColor(h6.w0(h6.f21225z6, d6Var));
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
        this.f9958c.setText(charSequence);
    }
}
