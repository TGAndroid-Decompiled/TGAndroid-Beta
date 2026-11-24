package defpackage;

import android.text.PrecomputedText;
public final class w5c extends ie7 {
    @Override
    public final boolean c(CharSequence charSequence) {
        if (!(charSequence instanceof PrecomputedText)) {
            return false;
        }
        return true;
    }
}
