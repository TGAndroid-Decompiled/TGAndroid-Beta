package fh;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.FileLog;
public final class t implements TextWatcher {
    public final View[] f6758a;
    public final x f6759b;

    public t(x xVar, View[] viewArr) {
        this.f6759b = xVar;
        this.f6758a = viewArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        float f10;
        View[] viewArr = this.f6758a;
        try {
            if (Integer.parseInt(editable.toString()) >= this.f6759b.f6847h0.getMinimumBid()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewPropertyAnimator animate = viewArr[0].animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            animate.alpha(f10).setDuration(180L).start();
            viewArr[0].setEnabled(z10);
            viewArr[0].setClickable(z10);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
