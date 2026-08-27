package gh;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.FileLog;

public final class s implements TextWatcher {

    public final View[] f7518a;

    public final v f7519b;

    public s(v vVar, View[] viewArr) {
        this.f7519b = vVar;
        this.f7518a = viewArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        View[] viewArr = this.f7518a;
        try {
            boolean z10 = ((long) Integer.parseInt(editable.toString())) >= this.f7519b.f7572h0.getMinimumBid();
            viewArr[0].animate().alpha(z10 ? 1.0f : 0.6f).setDuration(180L).start();
            viewArr[0].setEnabled(z10);
            viewArr[0].setClickable(z10);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
