package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.th;
public final class e extends FrameLayout {
    public final c6 f8976a;
    public final TextView f8977b;

    public e(Context context, c6 c6Var) {
        super(context);
        int i10;
        this.f8976a = c6Var;
        setBackgroundColor(g6.v0(g6.f23081e7, c6Var));
        TextView textView = new TextView(getContext());
        this.f8977b = textView;
        th.n(14.0f, 1, textView);
        textView.setTextColor(g6.v0(g6.f23100f7, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f8977b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f8977b.setTextColor(g6.v0(i10, this.f8976a));
    }
}
