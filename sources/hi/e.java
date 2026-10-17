package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class e extends FrameLayout implements y5 {
    public final w9 f12139a;
    public final d6 f12140b;
    public final TextView f12141c;
    public final TextView d;

    public e(Context context, d6 d6Var) {
        super(context);
        this.f12140b = d6Var;
        w9 w9Var = new w9(context);
        this.f12139a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, z5.a(72.0f, 0.0f, 36.0f, 0.0f, 0.0f, 72, 49));
        TextView textView = new TextView(context);
        this.f12141c = textView;
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
        int i10 = h6.G6;
        d6 d6Var = this.f12140b;
        this.f12141c.setTextColor(h6.w0(i10, d6Var));
        this.d.setTextColor(h6.w0(h6.f21391z6, d6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = h6.S0;
        w9 w9Var = this.f12139a;
        zf.p.a(canvas, drawable, (w9Var.getWidth() / 2.0f) + w9Var.getLeft(), (w9Var.getHeight() / 2.0f) + w9Var.getTop(), w9Var.getHeight());
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
        this.f12141c.setText(charSequence);
    }
}
