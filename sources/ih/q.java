package ih;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.FileLog;
public final class q implements TextWatcher {
    public final View[] f9331a;
    public final t f9332b;

    public q(t tVar, View[] viewArr) {
        this.f9332b = tVar;
        this.f9331a = viewArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        float f9;
        View[] viewArr = this.f9331a;
        try {
            if (Integer.parseInt(editable.toString()) >= this.f9332b.f9385h0.getMinimumBid()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewPropertyAnimator animate = viewArr[0].animate();
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.6f;
            }
            animate.alpha(f9).setDuration(180L).start();
            viewArr[0].setEnabled(z10);
            viewArr[0].setClickable(z10);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
