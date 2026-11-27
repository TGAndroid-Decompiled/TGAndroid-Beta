package defpackage;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class ot implements RequestDelegate {
    public final byte a = 1;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ot(l01 l01Var, id[] idVarArr, int i, Uri uri, Context context, boolean z) {
        this.d = l01Var;
        this.e = idVarArr;
        this.b = i;
        this.f = uri;
        this.g = context;
        this.c = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                hl.c3(new et((o) obj4, tLObject, this.b, (TLRPC.WebPage) obj3, (r47) obj2, this.c, (String) obj));
                return;
            default:
                hl.c3(new et((l01) obj4, (id[]) obj3, tLObject, this.b, (Uri) obj2, (Context) obj, this.c));
                return;
        }
    }

    public ot(o oVar, int i, TLRPC.WebPage webPage, r47 r47Var, boolean z, String str) {
        this.d = oVar;
        this.b = i;
        this.e = webPage;
        this.f = r47Var;
        this.c = z;
        this.g = str;
    }
}
