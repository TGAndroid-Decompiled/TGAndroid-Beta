package lg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.yh;
public final class e extends FrameLayout {
    public final g6 f12541a;
    public final TextView f12542b;

    public e(Context context, g6 g6Var) {
        super(context);
        int i10;
        this.f12541a = g6Var;
        setBackgroundColor(k6.v0(k6.f21678e7, g6Var));
        TextView textView = new TextView(getContext());
        this.f12542b = textView;
        yh.p(14.0f, 1, textView);
        textView.setTextColor(k6.v0(k6.f21697f7, g6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, c6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f12542b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f12542b.setTextColor(k6.v0(i10, this.f12541a));
    }
}
