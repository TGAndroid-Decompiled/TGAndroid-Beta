package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.l9;
public final class e extends FrameLayout implements b6 {
    public final l9 f15519a;
    public final g6 f15520b;
    public final TextView f15521c;
    public final TextView d;

    public e(Context context, g6 g6Var) {
        super(context);
        this.f15520b = g6Var;
        l9 l9Var = new l9(context);
        this.f15519a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(l9Var, ha.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f15521c = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, ha.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, ha.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.G6));
        hashSet.add(Integer.valueOf(l6.f28275z6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = l6.S0;
        l9 l9Var = this.f15519a;
        bg.s.a(canvas, drawable, (l9Var.getWidth() / 2.0f) + l9Var.getLeft(), (l9Var.getHeight() / 2.0f) + l9Var.getTop(), l9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15521c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = l6.G6;
        g6 g6Var = this.f15520b;
        this.f15521c.setTextColor(l6.w0(i7, g6Var));
        this.d.setTextColor(l6.w0(l6.f28275z6, g6Var));
    }
}
