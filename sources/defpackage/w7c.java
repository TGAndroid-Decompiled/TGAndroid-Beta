package defpackage;

import android.text.PrecomputedText;
public final class w7c extends kg7 {
    @Override
    public final boolean d(CharSequence charSequence) {
        if (!(charSequence instanceof PrecomputedText)) {
            return false;
        }
        return true;
    }
}
