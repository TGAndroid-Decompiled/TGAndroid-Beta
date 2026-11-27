package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class yc4 {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final r47 d;
    public final String e;
    public boolean f;
    public boolean g;

    public yc4(int i, r47 r47Var, TLRPC.Document document, String str) {
        this.a = i;
        this.d = r47Var;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? xb4.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z;
        boolean z2 = false;
        String str = this.c;
        if (str != null) {
            z = bp1.t(str);
        } else {
            z = false;
        }
        int i = this.a;
        if (!z) {
            xb4.G(i);
            z = xb4.I(this.b).exists();
        }
        this.f = z;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && xb4.G(i).S(str2)) {
            z2 = true;
        }
        this.g = z2;
    }
}
