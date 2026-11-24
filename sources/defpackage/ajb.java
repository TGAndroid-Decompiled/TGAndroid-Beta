package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
public class ajb extends ViewSwitcher {
    public final void a(CharSequence charSequence, boolean z, boolean z2) {
        if (z2 || !TextUtils.equals(charSequence, getCurrentView().getText())) {
            if (z) {
                getNextView().setText(charSequence);
                showNext();
                return;
            }
            getCurrentView().setText(charSequence);
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof TextView) {
            super.addView(view, i, layoutParams);
        } else {
            sc8.e();
        }
    }

    @Override
    public TextView getCurrentView() {
        return (TextView) super.getCurrentView();
    }

    @Override
    public TextView getNextView() {
        return (TextView) super.getNextView();
    }

    public void setText(CharSequence charSequence) {
        a(charSequence, true, false);
    }
}
