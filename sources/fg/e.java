package fg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import j3.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class e extends FrameLayout {
    public final b6 f6286a;
    public final TextView f6287b;

    public e(Context context, b6 b6Var) {
        super(context);
        int i9;
        this.f6286a = b6Var;
        setBackgroundColor(f6.v0(f6.f23020e7, b6Var));
        TextView textView = new TextView(getContext());
        this.f6287b = textView;
        r0.u(14.0f, 1, textView);
        textView.setTextColor(f6.v0(f6.f23038f7, b6Var));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 16);
        addView(textView, e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f6287b.setText(charSequence);
    }

    public void setTextColor(int i9) {
        this.f6287b.setTextColor(f6.v0(i9, this.f6286a));
    }
}
