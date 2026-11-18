package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class f extends FrameLayout {
    public final i6 f1069a;
    public final TextView f1070b;

    public f(Context context, i6 i6Var) {
        super(context);
        int i7;
        this.f1069a = i6Var;
        u6.h(n6.f29416e7, this, i6Var);
        TextView textView = new TextView(getContext());
        this.f1070b = textView;
        i5.c.x(textView, 1, 14.0f);
        u6.U(textView, n6.f29435f7, i6Var);
        if (gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        addView(textView, ma.d(-1, -1.0f, (gd.f24216a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f1070b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        u6.U(this.f1070b, i7, this.f1069a);
    }
}
