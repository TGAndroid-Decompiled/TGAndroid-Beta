package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class f extends FrameLayout {
    public final e6 f1070a;
    public final TextView f1071b;

    public f(Context context, e6 e6Var) {
        super(context);
        int i7;
        this.f1070a = e6Var;
        q6.h(j6.f28869e7, this, e6Var);
        TextView textView = new TextView(getContext());
        this.f1071b = textView;
        i5.c.v(textView, 1, 14.0f);
        q6.U(textView, j6.f28888f7, e6Var);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        addView(textView, ja.d(-1, -1.0f, (hd.f24104a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f1071b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        q6.U(this.f1071b, i7, this.f1070a);
    }
}
