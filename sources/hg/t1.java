package hg;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t1 implements TextWatcher {
    public final TextView f10410a;
    public final Runnable[] f10411b;

    public t1(TextView textView, Runnable[] runnableArr) {
        this.f10410a = textView;
        this.f10411b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f10410a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f10411b;
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
