package lh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

public final class x8 extends xf.a {

    public int f17038c;
    public Drawable d;

    public CharSequence f17039e;

    public CharSequence f17040f;

    public TLRPC.User f17041g;
    public TLRPC.Chat h;

    public int f17042i;

    public int f17043j;

    public boolean f17044k;

    public boolean f17045l;

    public boolean f17046m;

    public boolean f17047n;

    public int f17048o;

    public int f17049p;

    public int f17050q;

    public x8(int i10, boolean z10) {
        super(i10, z10);
        this.f17049p = -1;
    }

    public static x8 b(String str, CharSequence charSequence, int i10) {
        x8 x8Var = new x8(9, false);
        x8Var.f17039e = str;
        x8Var.f17040f = charSequence;
        x8Var.f17050q = i10;
        return x8Var;
    }

    public static x8 c() {
        return new x8(0, false);
    }

    public static x8 d() {
        x8 x8Var = new x8(-1, false);
        x8Var.f17048o = -1;
        return x8Var;
    }

    public static x8 e() {
        return new x8(1, false);
    }

    public static x8 f() {
        return new x8(2, false);
    }

    public static x8 g(CharSequence charSequence) {
        x8 x8Var = new x8(6, false);
        x8Var.f17039e = charSequence;
        return x8Var;
    }

    public static x8 h(int i10, int i11, boolean z10) {
        x8 x8Var = new x8(3, false);
        x8Var.f17042i = i10;
        x8Var.f17044k = z10;
        x8Var.f17043j = i11;
        return x8Var;
    }

    public static x8 i(TLRPC.User user, boolean z10, boolean z11) {
        x8 x8Var = new x8(3, true);
        x8Var.f17041g = user;
        x8Var.f17044k = z10;
        x8Var.f17045l = z11;
        return x8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x8.class != obj.getClass()) {
            return false;
        }
        x8 x8Var = (x8) obj;
        int i10 = this.f49413a;
        if (i10 != x8Var.f49413a) {
            return false;
        }
        if (i10 == -1 && (this.f17048o != x8Var.f17048o || this.f17049p != x8Var.f17049p)) {
            return false;
        }
        if (i10 == 3 && (this.f17041g != x8Var.f17041g || this.h != x8Var.h || this.f17042i != x8Var.f17042i || this.f17043j != x8Var.f17043j || this.f17044k != x8Var.f17044k || this.f17046m != x8Var.f17046m || this.f17047n != x8Var.f17047n)) {
            return false;
        }
        if (i10 == 0 && this.f17038c != x8Var.f17038c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.f17039e, x8Var.f17039e)) {
            return false;
        }
        if (this.f49413a == 8 && !TextUtils.equals(this.f17039e, x8Var.f17039e)) {
            return false;
        }
        int i11 = this.f49413a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.f17039e, x8Var.f17039e) && TextUtils.equals(this.f17040f, x8Var.f17040f))) {
            return false;
        }
        if (this.f49413a == 6 && (!TextUtils.equals(this.f17039e, x8Var.f17039e) || this.f17038c != x8Var.f17038c)) {
            return false;
        }
        if (this.f49413a == 7 && (this.f17038c != x8Var.f17038c || !TextUtils.equals(this.f17039e, x8Var.f17039e) || this.f17044k != x8Var.f17044k)) {
            return false;
        }
        if (this.f49413a != 9 || (this.f17050q == x8Var.f17050q && this.d == x8Var.d && TextUtils.equals(this.f17039e, x8Var.f17039e) && TextUtils.equals(this.f17040f, x8Var.f17040f))) {
            return this.f49413a != 10 || this.f17050q == x8Var.f17050q;
        }
        return false;
    }
}
