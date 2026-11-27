package defpackage;

import android.net.Uri;
import org.telegram.ui.o;
public final class qt implements hcc {
    public final o a;
    public final String b;
    public final boolean[] c;
    public final wt d;

    public qt(o oVar, String str, boolean[] zArr, wt wtVar) {
        this.a = oVar;
        this.b = str;
        this.c = zArr;
        this.d = wtVar;
    }

    @Override
    public final Object run() {
        String str = this.b;
        if (!m01.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        o oVar = this.a;
        wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.c = new ve2(oVar, wtVar, (byte) 25);
        } else {
            tw twVar = oVar.L;
            if (twVar != null) {
                twVar.a(true);
            }
        }
        m01.t(oVar.M, Uri.parse(str), true, true, false, wtVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
