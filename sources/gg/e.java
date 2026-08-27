package gg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;

public final class e extends FrameLayout {

    public final c6 f7086a;

    public final TextView f7087b;

    public e(Context context, c6 c6Var) {
        super(context);
        this.f7086a = c6Var;
        setBackgroundColor(g6.v0(g6.f23073e7, c6Var));
        TextView textView = new TextView(getContext());
        this.f7087b = textView;
        pa.m(14.0f, 1, textView);
        textView.setTextColor(g6.v0(g6.f23091f7, c6Var));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f7087b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f7087b.setTextColor(g6.v0(i10, this.f7086a));
    }
}
