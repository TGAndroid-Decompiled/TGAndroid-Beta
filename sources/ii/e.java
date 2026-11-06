package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
public final class e extends FrameLayout implements a6 {
    public final l9 f15516a;
    public final f6 f15517b;
    public final TextView f15518c;
    public final TextView d;

    public e(Context context, f6 f6Var) {
        super(context);
        this.f15517b = f6Var;
        l9 l9Var = new l9(context);
        this.f15516a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(l9Var, ha.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f15518c = textView;
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
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f28258z6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = k6.S0;
        l9 l9Var = this.f15516a;
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
        this.f15518c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = k6.G6;
        f6 f6Var = this.f15517b;
        this.f15518c.setTextColor(k6.w0(i7, f6Var));
        this.d.setTextColor(k6.w0(k6.f28258z6, f6Var));
    }
}
