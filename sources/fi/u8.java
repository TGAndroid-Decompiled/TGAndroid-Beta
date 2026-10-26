package fi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class u8 extends qg.a {
    public int f11752c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f11753f;
    public TLRPC.User f11754g;
    public TLRPC.Chat h;
    public int f11755i;
    public int f11756j;
    public boolean f11757k;
    public boolean f11758l;
    public boolean f11759m;
    public boolean f11760n;
    public int f11761o;
    public int f11762p;
    public int f11763q;

    public u8(int i10, boolean z10) {
        super(i10, z10);
        this.f11762p = -1;
    }

    public static u8 b(String str, CharSequence charSequence, int i10) {
        u8 u8Var = new u8(9, false);
        u8Var.e = str;
        u8Var.f11753f = charSequence;
        u8Var.f11763q = i10;
        return u8Var;
    }

    public static u8 c() {
        return new u8(0, false);
    }

    public static u8 d() {
        u8 u8Var = new u8(-1, false);
        u8Var.f11761o = -1;
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
        u8Var.f11755i = i10;
        u8Var.f11757k = z10;
        u8Var.f11756j = i11;
        return u8Var;
    }

    public static u8 i(TLRPC.User user, boolean z10, boolean z11) {
        u8 u8Var = new u8(3, true);
        u8Var.f11754g = user;
        u8Var.f11757k = z10;
        u8Var.f11758l = z11;
        return u8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u8.class == obj.getClass()) {
                u8 u8Var = (u8) obj;
                int i10 = this.f47040a;
                if (i10 == u8Var.f47040a) {
                    if (i10 != -1 || (this.f11761o == u8Var.f11761o && this.f11762p == u8Var.f11762p)) {
                        if (i10 != 3 || (this.f11754g == u8Var.f11754g && this.h == u8Var.h && this.f11755i == u8Var.f11755i && this.f11756j == u8Var.f11756j && this.f11757k == u8Var.f11757k && this.f11759m == u8Var.f11759m && this.f11760n == u8Var.f11760n)) {
                            if (i10 != 0 || this.f11752c == u8Var.f11752c) {
                                if (i10 != 2 || TextUtils.equals(this.e, u8Var.e)) {
                                    if (this.f47040a != 8 || TextUtils.equals(this.e, u8Var.e)) {
                                        int i11 = this.f47040a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, u8Var.e) && TextUtils.equals(this.f11753f, u8Var.f11753f))) {
                                            if (this.f47040a != 6 || (TextUtils.equals(this.e, u8Var.e) && this.f11752c == u8Var.f11752c)) {
                                                if (this.f47040a != 7 || (this.f11752c == u8Var.f11752c && TextUtils.equals(this.e, u8Var.e) && this.f11757k == u8Var.f11757k)) {
                                                    if (this.f47040a != 9 || (this.f11763q == u8Var.f11763q && this.d == u8Var.d && TextUtils.equals(this.e, u8Var.e) && TextUtils.equals(this.f11753f, u8Var.f11753f))) {
                                                        if (this.f47040a != 10 || this.f11763q == u8Var.f11763q) {
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
