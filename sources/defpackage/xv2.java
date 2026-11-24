package defpackage;

import java.text.CollationKey;
import java.text.Collator;
public final class xv2 extends Collator {
    @Override
    public final int compare(String str, String str2) {
        if (str != null && str2 != null) {
            return str.compareTo(str2);
        }
        return 0;
    }

    @Override
    public final CollationKey getCollationKey(String str) {
        return null;
    }

    @Override
    public final int hashCode() {
        return 0;
    }
}
