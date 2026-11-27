package defpackage;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class ni6 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new mi6(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        oi6 oi6Var = (oi6) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (oi6Var == null) {
            str = null;
        } else {
            str = oi6Var.a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        oi6 oi6Var2 = (oi6) hashMap.get("content-transfer-encoding");
        if (oi6Var2 != null) {
            str2 = oi6Var2.a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new pi6(bufferedInputStream, (byte) 0);
        }
        return bufferedInputStream;
    }
}
