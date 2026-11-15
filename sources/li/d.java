package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
public final class d extends FrameLayout implements z5 {
    public final i9 f19537a;
    public final e6 f19538b;
    public final TextView f19539c;
    public final TextView d;

    public d(Context context, e6 e6Var) {
        super(context);
        this.f19538b = e6Var;
        i9 i9Var = new i9(context);
        this.f19537a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(i9Var, ja.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f19539c = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, ja.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, ja.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.f29260z6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = j6.S0;
        i9 i9Var = this.f19537a;
        bg.s.a(canvas, drawable, (i9Var.getWidth() / 2.0f) + i9Var.getLeft(), (i9Var.getHeight() / 2.0f) + i9Var.getTop(), i9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(218.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f19539c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i7 = j6.G6;
        e6 e6Var = this.f19538b;
        this.f19539c.setTextColor(j6.w0(i7, e6Var));
        this.d.setTextColor(j6.w0(j6.f29260z6, e6Var));
    }
}
