package ih;

import android.text.TextUtils;
import org.telegram.messenger.b8;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f8516a;
    public final TLRPC.Document f8517b;
    public final String f8518c;
    public final kj d;
    public final String e;
    public boolean f8519f;
    public boolean f8520g;

    public a(int i10, kj kjVar, TLRPC.Document document, String str) {
        this.f8516a = i10;
        this.d = kjVar;
        this.f8517b = document;
        this.f8518c = str;
        this.e = TextUtils.isEmpty(str) ? b8.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f8518c;
        if (str != null) {
            z10 = sc.e.x(str);
        } else {
            z10 = false;
        }
        int i10 = this.f8516a;
        if (!z10) {
            b8.G(i10);
            z10 = b8.I(this.f8517b).exists();
        }
        this.f8519f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && b8.G(i10).T(str2)) {
            z11 = true;
        }
        this.f8520g = z11;
    }
}
