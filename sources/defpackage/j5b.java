package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class j5b extends ja {
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

    public j5b(int i, boolean z) {
        super(i, z);
        this.p = -1;
    }

    public static j5b b(String str, CharSequence charSequence, int i) {
        j5b j5bVar = new j5b(9, false);
        j5bVar.e = str;
        j5bVar.f = charSequence;
        j5bVar.q = i;
        return j5bVar;
    }

    public static j5b c() {
        return new j5b(0, false);
    }

    public static j5b d() {
        j5b j5bVar = new j5b(-1, false);
        j5bVar.o = -1;
        return j5bVar;
    }

    public static j5b e() {
        return new j5b(1, false);
    }

    public static j5b f() {
        return new j5b(2, false);
    }

    public static j5b g(CharSequence charSequence) {
        j5b j5bVar = new j5b(6, false);
        j5bVar.e = charSequence;
        return j5bVar;
    }

    public static j5b h(int i, int i2, boolean z) {
        j5b j5bVar = new j5b(3, false);
        j5bVar.i = i;
        j5bVar.k = z;
        j5bVar.j = i2;
        return j5bVar;
    }

    public static j5b i(TLRPC.User user, boolean z, boolean z2) {
        j5b j5bVar = new j5b(3, true);
        j5bVar.g = user;
        j5bVar.k = z;
        j5bVar.l = z2;
        return j5bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j5b.class == obj.getClass()) {
                j5b j5bVar = (j5b) obj;
                int i = this.a;
                if (i == j5bVar.a) {
                    if (i != -1 || (this.o == j5bVar.o && this.p == j5bVar.p)) {
                        if (i != 3 || (this.g == j5bVar.g && this.h == j5bVar.h && this.i == j5bVar.i && this.j == j5bVar.j && this.k == j5bVar.k && this.m == j5bVar.m && this.n == j5bVar.n)) {
                            if (i != 0 || this.c == j5bVar.c) {
                                if (i != 2 || TextUtils.equals(this.e, j5bVar.e)) {
                                    if (this.a != 8 || TextUtils.equals(this.e, j5bVar.e)) {
                                        int i2 = this.a;
                                        if ((i2 != 4 && i2 != 11) || (TextUtils.equals(this.e, j5bVar.e) && TextUtils.equals(this.f, j5bVar.f))) {
                                            if (this.a != 6 || (TextUtils.equals(this.e, j5bVar.e) && this.c == j5bVar.c)) {
                                                if (this.a != 7 || (this.c == j5bVar.c && TextUtils.equals(this.e, j5bVar.e) && this.k == j5bVar.k)) {
                                                    if (this.a != 9 || (this.q == j5bVar.q && this.d == j5bVar.d && TextUtils.equals(this.e, j5bVar.e) && TextUtils.equals(this.f, j5bVar.f))) {
                                                        if (this.a != 10 || this.q == j5bVar.q) {
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
