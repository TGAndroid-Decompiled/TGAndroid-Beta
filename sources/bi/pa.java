package bi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class pa extends ng.a {
    public int f3403c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f3404f;
    public TLRPC.User f3405g;
    public TLRPC.Chat h;
    public int f3406i;
    public int f3407j;
    public boolean f3408k;
    public boolean f3409l;
    public boolean f3410m;
    public boolean f3411n;
    public int f3412o;
    public int f3413p;
    public int f3414q;

    public pa(int i10, boolean z10) {
        super(i10, z10);
        this.f3413p = -1;
    }

    public static pa b(String str, CharSequence charSequence, int i10) {
        pa paVar = new pa(9, false);
        paVar.e = str;
        paVar.f3404f = charSequence;
        paVar.f3414q = i10;
        return paVar;
    }

    public static pa c() {
        return new pa(0, false);
    }

    public static pa d() {
        pa paVar = new pa(-1, false);
        paVar.f3412o = -1;
        return paVar;
    }

    public static pa e() {
        return new pa(1, false);
    }

    public static pa f() {
        return new pa(2, false);
    }

    public static pa g(CharSequence charSequence) {
        pa paVar = new pa(6, false);
        paVar.e = charSequence;
        return paVar;
    }

    public static pa h(int i10, int i11, boolean z10) {
        pa paVar = new pa(3, false);
        paVar.f3406i = i10;
        paVar.f3408k = z10;
        paVar.f3407j = i11;
        return paVar;
    }

    public static pa i(TLRPC.User user, boolean z10, boolean z11) {
        pa paVar = new pa(3, true);
        paVar.f3405g = user;
        paVar.f3408k = z10;
        paVar.f3409l = z11;
        return paVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pa.class == obj.getClass()) {
                pa paVar = (pa) obj;
                int i10 = this.f14046a;
                if (i10 == paVar.f14046a) {
                    if (i10 != -1 || (this.f3412o == paVar.f3412o && this.f3413p == paVar.f3413p)) {
                        if (i10 != 3 || (this.f3405g == paVar.f3405g && this.h == paVar.h && this.f3406i == paVar.f3406i && this.f3407j == paVar.f3407j && this.f3408k == paVar.f3408k && this.f3410m == paVar.f3410m && this.f3411n == paVar.f3411n)) {
                            if (i10 != 0 || this.f3403c == paVar.f3403c) {
                                if (i10 != 2 || TextUtils.equals(this.e, paVar.e)) {
                                    if (this.f14046a != 8 || TextUtils.equals(this.e, paVar.e)) {
                                        int i11 = this.f14046a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, paVar.e) && TextUtils.equals(this.f3404f, paVar.f3404f))) {
                                            if (this.f14046a != 6 || (TextUtils.equals(this.e, paVar.e) && this.f3403c == paVar.f3403c)) {
                                                if (this.f14046a != 7 || (this.f3403c == paVar.f3403c && TextUtils.equals(this.e, paVar.e) && this.f3408k == paVar.f3408k)) {
                                                    if (this.f14046a != 9 || (this.f3414q == paVar.f3414q && this.d == paVar.d && TextUtils.equals(this.e, paVar.e) && TextUtils.equals(this.f3404f, paVar.f3404f))) {
                                                        if (this.f14046a != 10 || this.f3414q == paVar.f3414q) {
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
