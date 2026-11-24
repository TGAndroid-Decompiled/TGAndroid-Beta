package defpackage;

import android.net.Uri;
import org.telegram.ui.o;
public final class nu implements iac {
    public final o a;
    public final String b;
    public final boolean[] c;
    public final vu d;

    public nu(o oVar, String str, boolean[] zArr, vu vuVar) {
        this.a = oVar;
        this.b = str;
        this.c = zArr;
        this.d = vuVar;
    }

    @Override
    public final Object run() {
        String str = this.b;
        if (!l11.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        o oVar = this.a;
        vu vuVar = this.d;
        if (vuVar != null) {
            vuVar.c = new pf2(oVar, vuVar, (byte) 26);
        } else {
            sx sxVar = oVar.L;
            if (sxVar != null) {
                sxVar.a(true);
            }
        }
        l11.t(oVar.M, Uri.parse(str), true, true, false, vuVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
