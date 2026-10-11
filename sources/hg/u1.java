package hg;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u1 implements TextWatcher {
    public final TextView f11409a;
    public final Runnable[] f11410b;

    public u1(TextView textView, Runnable[] runnableArr) {
        this.f11409a = textView;
        this.f11410b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f11409a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f11410b;
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
