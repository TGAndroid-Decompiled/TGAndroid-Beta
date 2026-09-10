package gg;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c2 implements TextWatcher {
    public final TextView f8835a;
    public final Runnable[] f8836b;

    public c2(TextView textView, Runnable[] runnableArr) {
        this.f8835a = textView;
        this.f8836b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f8835a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f8836b;
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
