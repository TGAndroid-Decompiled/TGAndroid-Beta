package defpackage;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class rt implements RequestDelegate {
    public final byte a = 1;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public rt(c01 c01Var, hd[] hdVarArr, int i, Uri uri, Context context, boolean z) {
        this.d = c01Var;
        this.e = hdVarArr;
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
                gl.c3(new ft((o) obj4, tLObject, this.b, (TLRPC.WebPage) obj3, (k27) obj2, this.c, (String) obj));
                return;
            default:
                gl.c3(new ft((c01) obj4, (hd[]) obj3, tLObject, this.b, (Uri) obj2, (Context) obj, this.c));
                return;
        }
    }

    public rt(o oVar, int i, TLRPC.WebPage webPage, k27 k27Var, boolean z, String str) {
        this.d = oVar;
        this.b = i;
        this.e = webPage;
        this.f = k27Var;
        this.c = z;
        this.g = str;
    }
}
