package fi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b8 extends rg.a {
    public int f11696c;
    public Drawable d;
    public CharSequence f11697e;
    public CharSequence f11698f;
    public TLRPC.User f11699g;
    public TLRPC.Chat h;
    public int f11700i;
    public int f11701j;
    public boolean f11702k;
    public boolean f11703l;
    public boolean f11704m;
    public boolean f11705n;
    public int f11706o;
    public int f11707p;
    public int f11708q;

    public b8(int i7, boolean z9) {
        super(i7, z9);
        this.f11707p = -1;
    }

    public static b8 b(String str, CharSequence charSequence, int i7) {
        b8 b8Var = new b8(9, false);
        b8Var.f11697e = str;
        b8Var.f11698f = charSequence;
        b8Var.f11708q = i7;
        return b8Var;
    }

    public static b8 c() {
        return new b8(0, false);
    }

    public static b8 d() {
        b8 b8Var = new b8(-1, false);
        b8Var.f11706o = -1;
        return b8Var;
    }

    public static b8 e() {
        return new b8(1, false);
    }

    public static b8 f() {
        return new b8(2, false);
    }

    public static b8 g(CharSequence charSequence) {
        b8 b8Var = new b8(6, false);
        b8Var.f11697e = charSequence;
        return b8Var;
    }

    public static b8 h(int i7, int i10, boolean z9) {
        b8 b8Var = new b8(3, false);
        b8Var.f11700i = i7;
        b8Var.f11702k = z9;
        b8Var.f11701j = i10;
        return b8Var;
    }

    public static b8 i(TLRPC.User user, boolean z9, boolean z10) {
        b8 b8Var = new b8(3, true);
        b8Var.f11699g = user;
        b8Var.f11702k = z9;
        b8Var.f11703l = z10;
        return b8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b8.class == obj.getClass()) {
                b8 b8Var = (b8) obj;
                int i7 = this.f54543a;
                if (i7 == b8Var.f54543a) {
                    if (i7 != -1 || (this.f11706o == b8Var.f11706o && this.f11707p == b8Var.f11707p)) {
                        if (i7 != 3 || (this.f11699g == b8Var.f11699g && this.h == b8Var.h && this.f11700i == b8Var.f11700i && this.f11701j == b8Var.f11701j && this.f11702k == b8Var.f11702k && this.f11704m == b8Var.f11704m && this.f11705n == b8Var.f11705n)) {
                            if (i7 != 0 || this.f11696c == b8Var.f11696c) {
                                if (i7 != 2 || TextUtils.equals(this.f11697e, b8Var.f11697e)) {
                                    if (this.f54543a != 8 || TextUtils.equals(this.f11697e, b8Var.f11697e)) {
                                        int i10 = this.f54543a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f11697e, b8Var.f11697e) && TextUtils.equals(this.f11698f, b8Var.f11698f))) {
                                            if (this.f54543a != 6 || (TextUtils.equals(this.f11697e, b8Var.f11697e) && this.f11696c == b8Var.f11696c)) {
                                                if (this.f54543a != 7 || (this.f11696c == b8Var.f11696c && TextUtils.equals(this.f11697e, b8Var.f11697e) && this.f11702k == b8Var.f11702k)) {
                                                    if (this.f54543a != 9 || (this.f11708q == b8Var.f11708q && this.d == b8Var.d && TextUtils.equals(this.f11697e, b8Var.f11697e) && TextUtils.equals(this.f11698f, b8Var.f11698f))) {
                                                        if (this.f54543a != 10 || this.f11708q == b8Var.f11708q) {
                                                            return true;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
