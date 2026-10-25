package jg;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u1 implements TextWatcher {
    public final TextView f15863a;
    public final Runnable[] f15864b;

    public u1(TextView textView, Runnable[] runnableArr) {
        this.f15863a = textView;
        this.f15864b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f15863a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f15864b;
            AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
            AndroidUtilities.runOnUIThread(runnableArr[0]);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
