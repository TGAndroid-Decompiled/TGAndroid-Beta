package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u9;
import w7.z5;
public final class e extends FrameLayout implements b6 {
    public final u9 f12168a;
    public final g6 f12169b;
    public final TextView f12170c;
    public final TextView d;

    public e(Context context, g6 g6Var) {
        super(context);
        this.f12169b = g6Var;
        u9 u9Var = new u9(context);
        this.f12168a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(u9Var, z5.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f12170c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, z5.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, z5.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f21589z6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = k6.S0;
        u9 u9Var = this.f12168a;
        zf.p.a(canvas, drawable, (u9Var.getWidth() / 2.0f) + u9Var.getLeft(), (u9Var.getHeight() / 2.0f) + u9Var.getTop(), u9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12170c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i10 = k6.G6;
        g6 g6Var = this.f12169b;
        this.f12170c.setTextColor(k6.w0(i10, g6Var));
        this.d.setTextColor(k6.w0(k6.f21589z6, g6Var));
    }
}
