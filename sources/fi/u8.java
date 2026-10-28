package fi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class u8 extends qg.a {
    public int f11751c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f11752f;
    public TLRPC.User f11753g;
    public TLRPC.Chat h;
    public int f11754i;
    public int f11755j;
    public boolean f11756k;
    public boolean f11757l;
    public boolean f11758m;
    public boolean f11759n;
    public int f11760o;
    public int f11761p;
    public int f11762q;

    public u8(int i10, boolean z10) {
        super(i10, z10);
        this.f11761p = -1;
    }

    public static u8 b(String str, CharSequence charSequence, int i10) {
        u8 u8Var = new u8(9, false);
        u8Var.e = str;
        u8Var.f11752f = charSequence;
        u8Var.f11762q = i10;
        return u8Var;
    }

    public static u8 c() {
        return new u8(0, false);
    }

    public static u8 d() {
        u8 u8Var = new u8(-1, false);
        u8Var.f11760o = -1;
        return u8Var;
    }

    public static u8 e() {
        return new u8(1, false);
    }

    public static u8 f() {
        return new u8(2, false);
    }

    public static u8 g(CharSequence charSequence) {
        u8 u8Var = new u8(6, false);
        u8Var.e = charSequence;
        return u8Var;
    }

    public static u8 h(int i10, int i11, boolean z10) {
        u8 u8Var = new u8(3, false);
        u8Var.f11754i = i10;
        u8Var.f11756k = z10;
        u8Var.f11755j = i11;
        return u8Var;
    }

    public static u8 i(TLRPC.User user, boolean z10, boolean z11) {
        u8 u8Var = new u8(3, true);
        u8Var.f11753g = user;
        u8Var.f11756k = z10;
        u8Var.f11757l = z11;
        return u8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u8.class == obj.getClass()) {
                u8 u8Var = (u8) obj;
                int i10 = this.f47075a;
                if (i10 == u8Var.f47075a) {
                    if (i10 != -1 || (this.f11760o == u8Var.f11760o && this.f11761p == u8Var.f11761p)) {
                        if (i10 != 3 || (this.f11753g == u8Var.f11753g && this.h == u8Var.h && this.f11754i == u8Var.f11754i && this.f11755j == u8Var.f11755j && this.f11756k == u8Var.f11756k && this.f11758m == u8Var.f11758m && this.f11759n == u8Var.f11759n)) {
                            if (i10 != 0 || this.f11751c == u8Var.f11751c) {
                                if (i10 != 2 || TextUtils.equals(this.e, u8Var.e)) {
                                    if (this.f47075a != 8 || TextUtils.equals(this.e, u8Var.e)) {
                                        int i11 = this.f47075a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, u8Var.e) && TextUtils.equals(this.f11752f, u8Var.f11752f))) {
                                            if (this.f47075a != 6 || (TextUtils.equals(this.e, u8Var.e) && this.f11751c == u8Var.f11751c)) {
                                                if (this.f47075a != 7 || (this.f11751c == u8Var.f11751c && TextUtils.equals(this.e, u8Var.e) && this.f11756k == u8Var.f11756k)) {
                                                    if (this.f47075a != 9 || (this.f11762q == u8Var.f11762q && this.d == u8Var.d && TextUtils.equals(this.e, u8Var.e) && TextUtils.equals(this.f11752f, u8Var.f11752f))) {
                                                        if (this.f47075a != 10 || this.f11762q == u8Var.f11762q) {
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
