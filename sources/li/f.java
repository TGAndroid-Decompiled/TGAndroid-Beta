package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.q9;
public final class f extends FrameLayout implements b6 {
    public final q9 f19952a;
    public final h6 f19953b;
    public final TextView f19954c;
    public final TextView d;

    public f(Context context, h6 h6Var) {
        super(context);
        this.f19953b = h6Var;
        q9 q9Var = new q9(context);
        this.f19952a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(q9Var, ma.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f19954c = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, ma.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, ma.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f29792z6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = m6.S0;
        q9 q9Var = this.f19952a;
        bg.t.a(canvas, drawable, (q9Var.getWidth() / 2.0f) + q9Var.getLeft(), (q9Var.getHeight() / 2.0f) + q9Var.getTop(), q9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f19954c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.G6;
        h6 h6Var = this.f19953b;
        this.f19954c.setTextColor(m6.w0(i7, h6Var));
        this.d.setTextColor(m6.w0(m6.f29792z6, h6Var));
    }
}
