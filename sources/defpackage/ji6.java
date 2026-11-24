package defpackage;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class ji6 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ii6(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        ki6 ki6Var = (ki6) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (ki6Var == null) {
            str = null;
        } else {
            str = ki6Var.a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        ki6 ki6Var2 = (ki6) hashMap.get("content-transfer-encoding");
        if (ki6Var2 != null) {
            str2 = ki6Var2.a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new li6(bufferedInputStream, (byte) 0);
        }
        return bufferedInputStream;
    }
}
