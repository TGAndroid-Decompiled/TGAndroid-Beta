package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class bd4 {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final k47 d;
    public final String e;
    public boolean f;
    public boolean g;

    public bd4(int i, k47 k47Var, TLRPC.Document document, String str) {
        this.a = i;
        this.d = k47Var;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? bc4.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z;
        boolean z2 = false;
        String str = this.c;
        if (str != null) {
            z = aq1.t(str);
        } else {
            z = false;
        }
        int i = this.a;
        if (!z) {
            bc4.G(i);
            z = bc4.I(this.b).exists();
        }
        this.f = z;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && bc4.G(i).S(str2)) {
            z2 = true;
        }
        this.g = z2;
    }
}
