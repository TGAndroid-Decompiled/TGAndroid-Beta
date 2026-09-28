package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class k9 extends og.a {
    public int f4904c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f4905f;
    public TLRPC.User f4906g;
    public TLRPC.Chat h;
    public int f4907i;
    public int f4908j;
    public boolean f4909k;
    public boolean f4910l;
    public boolean f4911m;
    public boolean f4912n;
    public int f4913o;
    public int f4914p;
    public int f4915q;

    public k9(int i10, boolean z10) {
        super(i10, z10);
        this.f4914p = -1;
    }

    public static k9 b(String str, CharSequence charSequence, int i10) {
        k9 k9Var = new k9(9, false);
        k9Var.e = str;
        k9Var.f4905f = charSequence;
        k9Var.f4915q = i10;
        return k9Var;
    }

    public static k9 c() {
        return new k9(0, false);
    }

    public static k9 d() {
        k9 k9Var = new k9(-1, false);
        k9Var.f4913o = -1;
        return k9Var;
    }

    public static k9 e() {
        return new k9(1, false);
    }

    public static k9 f() {
        return new k9(2, false);
    }

    public static k9 g(CharSequence charSequence) {
        k9 k9Var = new k9(6, false);
        k9Var.e = charSequence;
        return k9Var;
    }

    public static k9 h(int i10, int i11, boolean z10) {
        k9 k9Var = new k9(3, false);
        k9Var.f4907i = i10;
        k9Var.f4909k = z10;
        k9Var.f4908j = i11;
        return k9Var;
    }

    public static k9 i(TLRPC.User user, boolean z10, boolean z11) {
        k9 k9Var = new k9(3, true);
        k9Var.f4906g = user;
        k9Var.f4909k = z10;
        k9Var.f4910l = z11;
        return k9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k9.class == obj.getClass()) {
                k9 k9Var = (k9) obj;
                int i10 = this.f15715a;
                if (i10 == k9Var.f15715a) {
                    if (i10 != -1 || (this.f4913o == k9Var.f4913o && this.f4914p == k9Var.f4914p)) {
                        if (i10 != 3 || (this.f4906g == k9Var.f4906g && this.h == k9Var.h && this.f4907i == k9Var.f4907i && this.f4908j == k9Var.f4908j && this.f4909k == k9Var.f4909k && this.f4911m == k9Var.f4911m && this.f4912n == k9Var.f4912n)) {
                            if (i10 != 0 || this.f4904c == k9Var.f4904c) {
                                if (i10 != 2 || TextUtils.equals(this.e, k9Var.e)) {
                                    if (this.f15715a != 8 || TextUtils.equals(this.e, k9Var.e)) {
                                        int i11 = this.f15715a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, k9Var.e) && TextUtils.equals(this.f4905f, k9Var.f4905f))) {
                                            if (this.f15715a != 6 || (TextUtils.equals(this.e, k9Var.e) && this.f4904c == k9Var.f4904c)) {
                                                if (this.f15715a != 7 || (this.f4904c == k9Var.f4904c && TextUtils.equals(this.e, k9Var.e) && this.f4909k == k9Var.f4909k)) {
                                                    if (this.f15715a != 9 || (this.f4915q == k9Var.f4915q && this.d == k9Var.d && TextUtils.equals(this.e, k9Var.e) && TextUtils.equals(this.f4905f, k9Var.f4905f))) {
                                                        if (this.f15715a != 10 || this.f4915q == k9Var.f4915q) {
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
