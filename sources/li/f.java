package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.q9;
public final class f extends FrameLayout implements c6 {
    public final q9 f19921a;
    public final i6 f19922b;
    public final TextView f19923c;
    public final TextView d;

    public f(Context context, i6 i6Var) {
        super(context);
        this.f19922b = i6Var;
        q9 q9Var = new q9(context);
        this.f19921a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(q9Var, ma.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f19923c = textView;
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
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.f29805z6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = n6.S0;
        q9 q9Var = this.f19921a;
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
        this.f19923c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = n6.G6;
        i6 i6Var = this.f19922b;
        this.f19923c.setTextColor(n6.w0(i7, i6Var));
        this.d.setTextColor(n6.w0(n6.f29805z6, i6Var));
    }
}
