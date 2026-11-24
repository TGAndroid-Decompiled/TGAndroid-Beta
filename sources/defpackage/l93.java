package defpackage;

import android.text.TextUtils;
public final class l93 extends ja {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final String g;
    public final int h;

    public l93(int i, int i2, int i3, int i4, CharSequence charSequence, String str) {
        super(2, false);
        this.h = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = charSequence;
        this.g = str;
    }

    public static l93 b(CharSequence charSequence, String str) {
        return new l93(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l93)) {
            return false;
        }
        l93 l93Var = (l93) obj;
        CharSequence charSequence = l93Var.f;
        int i = l93Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i2 != 1 && i2 != 4 && i2 != 3 && i2 != 5) {
            if (i2 != 2) {
                return true;
            }
            if (l93Var.h != this.h || !TextUtils.equals(charSequence2, charSequence) || l93Var.d != this.d || l93Var.e != this.e || l93Var.c != this.c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public l93(int i, String str) {
        super(i, false);
        this.f = str;
    }
}
