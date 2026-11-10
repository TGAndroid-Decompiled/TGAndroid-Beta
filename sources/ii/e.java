package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
public final class e extends FrameLayout implements c6 {
    public final k9 f15518a;
    public final h6 f15519b;
    public final TextView f15520c;
    public final TextView d;

    public e(Context context, h6 h6Var) {
        super(context);
        this.f15519b = h6Var;
        k9 k9Var = new k9(context);
        this.f15518a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var, ha.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f15520c = textView;
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
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f28300z6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = m6.S0;
        k9 k9Var = this.f15518a;
        bg.s.a(canvas, drawable, (k9Var.getWidth() / 2.0f) + k9Var.getLeft(), (k9Var.getHeight() / 2.0f) + k9Var.getTop(), k9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15520c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.G6;
        h6 h6Var = this.f15519b;
        this.f15520c.setTextColor(m6.w0(i7, h6Var));
        this.d.setTextColor(m6.w0(m6.f28300z6, h6Var));
    }
}
