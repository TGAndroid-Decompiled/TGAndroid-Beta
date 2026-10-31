package ih;

import android.text.TextUtils;
import org.telegram.messenger.b8;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f8515a;
    public final TLRPC.Document f8516b;
    public final String f8517c;
    public final jj d;
    public final String e;
    public boolean f8518f;
    public boolean f8519g;

    public a(int i10, jj jjVar, TLRPC.Document document, String str) {
        this.f8515a = i10;
        this.d = jjVar;
        this.f8516b = document;
        this.f8517c = str;
        this.e = TextUtils.isEmpty(str) ? b8.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f8517c;
        if (str != null) {
            z10 = sc.e.x(str);
        } else {
            z10 = false;
        }
        int i10 = this.f8515a;
        if (!z10) {
            b8.G(i10);
            z10 = b8.I(this.f8516b).exists();
        }
        this.f8518f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && b8.G(i10).T(str2)) {
            z11 = true;
        }
        this.f8519g = z11;
    }
}
