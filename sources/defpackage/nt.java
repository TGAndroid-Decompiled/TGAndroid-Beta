package defpackage;

import android.net.Uri;
import org.telegram.ui.o;
public final class nt implements h8c {
    public final o a;
    public final String b;
    public final boolean[] c;
    public final vt d;

    public nt(o oVar, String str, boolean[] zArr, vt vtVar) {
        this.a = oVar;
        this.b = str;
        this.c = zArr;
        this.d = vtVar;
    }

    @Override
    public final Object run() {
        String str = this.b;
        if (!d01.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        o oVar = this.a;
        vt vtVar = this.d;
        if (vtVar != null) {
            vtVar.c = new ee2(oVar, vtVar, (byte) 25);
        } else {
            sw swVar = oVar.L;
            if (swVar != null) {
                swVar.a(true);
            }
        }
        d01.s(oVar.M, Uri.parse(str), true, true, false, vtVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
