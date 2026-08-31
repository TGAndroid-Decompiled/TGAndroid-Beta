package lh;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.FileLog;
public final class p implements TextWatcher {
    public final View[] f12885a;
    public final s f12886b;

    public p(s sVar, View[] viewArr) {
        this.f12886b = sVar;
        this.f12885a = viewArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        float f10;
        View[] viewArr = this.f12885a;
        try {
            if (Integer.parseInt(editable.toString()) >= this.f12886b.f12945i0.getMinimumBid()) {
                z4 = true;
            } else {
                z4 = false;
            }
            ViewPropertyAnimator animate = viewArr[0].animate();
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            animate.alpha(f10).setDuration(180L).start();
            viewArr[0].setEnabled(z4);
            viewArr[0].setClickable(z4);
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
