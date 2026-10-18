package ig;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s1 implements TextWatcher {
    public final TextView f13012a;
    public final Runnable[] f13013b;

    public s1(TextView textView, Runnable[] runnableArr) {
        this.f13012a = textView;
        this.f13013b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f13012a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f13013b;
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
