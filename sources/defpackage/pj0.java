package defpackage;

import java.util.Arrays;
public final class pj0 {
    public final int a;
    public final CharSequence b;

    public pj0(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj instanceof pj0) {
            pj0 pj0Var = (pj0) obj;
            if (this.a == pj0Var.a) {
                CharSequence charSequence = pj0Var.b;
                String str2 = null;
                CharSequence charSequence2 = this.b;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                }
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                    return false;
                } else if (str.equals(str2)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        Integer valueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        return Arrays.hashCode(new Object[]{valueOf, str});
    }
}
