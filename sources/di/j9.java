package di;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class j9 extends pg.a {
    public int f7123c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f7124f;
    public TLRPC.User f7125g;
    public TLRPC.Chat h;
    public int f7126i;
    public int f7127j;
    public boolean f7128k;
    public boolean f7129l;
    public boolean f7130m;
    public boolean f7131n;
    public int f7132o;
    public int f7133p;
    public int f7134q;

    public j9(int i10, boolean z10) {
        super(i10, z10);
        this.f7133p = -1;
    }

    public static j9 b(String str, CharSequence charSequence, int i10) {
        j9 j9Var = new j9(9, false);
        j9Var.e = str;
        j9Var.f7124f = charSequence;
        j9Var.f7134q = i10;
        return j9Var;
    }

    public static j9 c() {
        return new j9(0, false);
    }

    public static j9 d() {
        j9 j9Var = new j9(-1, false);
        j9Var.f7132o = -1;
        return j9Var;
    }

    public static j9 e() {
        return new j9(1, false);
    }

    public static j9 f() {
        return new j9(2, false);
    }

    public static j9 g(CharSequence charSequence) {
        j9 j9Var = new j9(6, false);
        j9Var.e = charSequence;
        return j9Var;
    }

    public static j9 h(int i10, int i11, boolean z10) {
        j9 j9Var = new j9(3, false);
        j9Var.f7126i = i10;
        j9Var.f7128k = z10;
        j9Var.f7127j = i11;
        return j9Var;
    }

    public static j9 i(TLRPC.User user, boolean z10, boolean z11) {
        j9 j9Var = new j9(3, true);
        j9Var.f7125g = user;
        j9Var.f7128k = z10;
        j9Var.f7129l = z11;
        return j9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j9.class == obj.getClass()) {
                j9 j9Var = (j9) obj;
                int i10 = this.f43203a;
                if (i10 == j9Var.f43203a) {
                    if (i10 != -1 || (this.f7132o == j9Var.f7132o && this.f7133p == j9Var.f7133p)) {
                        if (i10 != 3 || (this.f7125g == j9Var.f7125g && this.h == j9Var.h && this.f7126i == j9Var.f7126i && this.f7127j == j9Var.f7127j && this.f7128k == j9Var.f7128k && this.f7130m == j9Var.f7130m && this.f7131n == j9Var.f7131n)) {
                            if (i10 != 0 || this.f7123c == j9Var.f7123c) {
                                if (i10 != 2 || TextUtils.equals(this.e, j9Var.e)) {
                                    if (this.f43203a != 8 || TextUtils.equals(this.e, j9Var.e)) {
                                        int i11 = this.f43203a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f7124f, j9Var.f7124f))) {
                                            if (this.f43203a != 6 || (TextUtils.equals(this.e, j9Var.e) && this.f7123c == j9Var.f7123c)) {
                                                if (this.f43203a != 7 || (this.f7123c == j9Var.f7123c && TextUtils.equals(this.e, j9Var.e) && this.f7128k == j9Var.f7128k)) {
                                                    if (this.f43203a != 9 || (this.f7134q == j9Var.f7134q && this.d == j9Var.d && TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f7124f, j9Var.f7124f))) {
                                                        if (this.f43203a != 10 || this.f7134q == j9Var.f7134q) {
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
