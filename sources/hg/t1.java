package hg;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t1 implements TextWatcher {
    public final TextView f11327a;
    public final Runnable[] f11328b;

    public t1(TextView textView, Runnable[] runnableArr) {
        this.f11327a = textView;
        this.f11328b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f11327a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f11328b;
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
