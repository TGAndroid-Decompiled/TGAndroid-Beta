package ig;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r1 implements TextWatcher {
    public final TextView f13036a;
    public final Runnable[] f13037b;

    public r1(TextView textView, Runnable[] runnableArr) {
        this.f13036a = textView;
        this.f13037b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f13036a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f13037b;
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
