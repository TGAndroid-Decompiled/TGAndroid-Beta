package gf;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.h4;
public final class a implements RequestDelegate {
    public final int f7473a = 0;
    public final int f7474b;
    public final boolean f7475c;
    public final Object d;
    public final Object e;
    public final Object f7476f;
    public final Object f7477g;

    public a(e eVar, x1[] x1VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = x1VarArr;
        this.f7474b = i10;
        this.f7476f = uri;
        this.f7477g = context;
        this.f7475c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7473a) {
            case 0:
                i0.g3(new c((e) this.d, (x1[]) this.e, tLObject, this.f7474b, (Uri) this.f7476f, (Context) this.f7477g, this.f7475c));
                return;
            default:
                i0.g3(new c((h4) this.d, tLObject, this.f7474b, (TLRPC.WebPage) this.e, (jj) this.f7476f, this.f7475c, (String) this.f7477g));
                return;
        }
    }

    public a(h4 h4Var, int i10, TLRPC.WebPage webPage, jj jjVar, boolean z10, String str) {
        this.d = h4Var;
        this.f7474b = i10;
        this.e = webPage;
        this.f7476f = jjVar;
        this.f7475c = z10;
        this.f7477g = str;
    }
}
