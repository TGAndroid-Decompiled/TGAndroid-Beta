package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class bb4 {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final k27 d;
    public final String e;
    public boolean f;
    public boolean g;

    public bb4(int i, k27 k27Var, TLRPC.Document document, String str) {
        this.a = i;
        this.d = k27Var;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? ba4.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z;
        boolean z2 = false;
        String str = this.c;
        if (str != null) {
            z = oo1.t(str);
        } else {
            z = false;
        }
        int i = this.a;
        if (!z) {
            ba4.G(i);
            z = ba4.I(this.b).exists();
        }
        this.f = z;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && ba4.G(i).S(str2)) {
            z2 = true;
        }
        this.g = z2;
    }
}
