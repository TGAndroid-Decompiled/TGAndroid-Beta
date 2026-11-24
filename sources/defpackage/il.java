package defpackage;

import android.text.util.Linkify;
public final class il implements Linkify.MatchFilter {
    @Override
    public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
        if (i == 0 || charSequence.charAt(i - 1) != '@') {
            return true;
        }
        return false;
    }
}
