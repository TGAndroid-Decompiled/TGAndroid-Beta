package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class h9b extends ka {
    public byte c;
    public BitmapDrawable d;
    public CharSequence e;
    public CharSequence f;
    public TLRPC.User g;
    public TLRPC.Chat h;
    public byte i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public byte q;

    public h9b(int i, boolean z) {
        super(i, z);
        this.p = -1;
    }

    public static h9b b(String str, CharSequence charSequence, int i) {
        h9b h9bVar = new h9b(9, false);
        h9bVar.e = str;
        h9bVar.f = charSequence;
        h9bVar.q = i;
        return h9bVar;
    }

    public static h9b c() {
        return new h9b(0, false);
    }

    public static h9b d() {
        h9b h9bVar = new h9b(-1, false);
        h9bVar.o = -1;
        return h9bVar;
    }

    public static h9b e() {
        return new h9b(1, false);
    }

    public static h9b f() {
        return new h9b(2, false);
    }

    public static h9b g(CharSequence charSequence) {
        h9b h9bVar = new h9b(6, false);
        h9bVar.e = charSequence;
        return h9bVar;
    }

    public static h9b h(int i, int i2, boolean z) {
        h9b h9bVar = new h9b(3, false);
        h9bVar.i = i;
        h9bVar.k = z;
        h9bVar.j = i2;
        return h9bVar;
    }

    public static h9b i(TLRPC.User user, boolean z, boolean z2) {
        h9b h9bVar = new h9b(3, true);
        h9bVar.g = user;
        h9bVar.k = z;
        h9bVar.l = z2;
        return h9bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h9b.class == obj.getClass()) {
                h9b h9bVar = (h9b) obj;
                int i = this.a;
                if (i == h9bVar.a) {
                    if (i != -1 || (this.o == h9bVar.o && this.p == h9bVar.p)) {
                        if (i != 3 || (this.g == h9bVar.g && this.h == h9bVar.h && this.i == h9bVar.i && this.j == h9bVar.j && this.k == h9bVar.k && this.m == h9bVar.m && this.n == h9bVar.n)) {
                            if (i != 0 || this.c == h9bVar.c) {
                                if (i != 2 || TextUtils.equals(this.e, h9bVar.e)) {
                                    if (this.a != 8 || TextUtils.equals(this.e, h9bVar.e)) {
                                        int i2 = this.a;
                                        if ((i2 != 4 && i2 != 11) || (TextUtils.equals(this.e, h9bVar.e) && TextUtils.equals(this.f, h9bVar.f))) {
                                            if (this.a != 6 || (TextUtils.equals(this.e, h9bVar.e) && this.c == h9bVar.c)) {
                                                if (this.a != 7 || (this.c == h9bVar.c && TextUtils.equals(this.e, h9bVar.e) && this.k == h9bVar.k)) {
                                                    if (this.a != 9 || (this.q == h9bVar.q && this.d == h9bVar.d && TextUtils.equals(this.e, h9bVar.e) && TextUtils.equals(this.f, h9bVar.f))) {
                                                        if (this.a != 10 || this.q == h9bVar.q) {
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
