package defpackage;

import android.text.TextUtils;
public final class z73 extends ja {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final String g;
    public final int h;

    public z73(int i, int i2, int i3, int i4, CharSequence charSequence, String str) {
        super(2, false);
        this.h = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = charSequence;
        this.g = str;
    }

    public static z73 b(CharSequence charSequence, String str) {
        return new z73(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        CharSequence charSequence = z73Var.f;
        int i = z73Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i2 != 1 && i2 != 4 && i2 != 3 && i2 != 5) {
            if (i2 != 2) {
                return true;
            }
            if (z73Var.h != this.h || !TextUtils.equals(charSequence2, charSequence) || z73Var.d != this.d || z73Var.e != this.e || z73Var.c != this.c) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(charSequence2, charSequence);
    }

    public z73(int i, String str) {
        super(i, false);
        this.f = str;
    }
}
