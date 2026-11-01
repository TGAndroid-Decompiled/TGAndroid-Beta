package gf;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.h4;
public final class a implements RequestDelegate {
    public final int f7474a = 0;
    public final int f7475b;
    public final boolean f7476c;
    public final Object d;
    public final Object e;
    public final Object f7477f;
    public final Object f7478g;

    public a(e eVar, x1[] x1VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = x1VarArr;
        this.f7475b = i10;
        this.f7477f = uri;
        this.f7478g = context;
        this.f7476c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7474a) {
            case 0:
                i0.g3(new c((e) this.d, (x1[]) this.e, tLObject, this.f7475b, (Uri) this.f7477f, (Context) this.f7478g, this.f7476c));
                return;
            default:
                i0.g3(new c((h4) this.d, tLObject, this.f7475b, (TLRPC.WebPage) this.e, (kj) this.f7477f, this.f7476c, (String) this.f7478g));
                return;
        }
    }

    public a(h4 h4Var, int i10, TLRPC.WebPage webPage, kj kjVar, boolean z10, String str) {
        this.d = h4Var;
        this.f7475b = i10;
        this.e = webPage;
        this.f7477f = kjVar;
        this.f7476c = z10;
        this.f7478g = str;
    }
}
