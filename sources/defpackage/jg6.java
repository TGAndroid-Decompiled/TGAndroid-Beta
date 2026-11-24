package defpackage;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class jg6 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ig6(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        kg6 kg6Var = (kg6) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (kg6Var == null) {
            str = null;
        } else {
            str = kg6Var.a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        kg6 kg6Var2 = (kg6) hashMap.get("content-transfer-encoding");
        if (kg6Var2 != null) {
            str2 = kg6Var2.a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new lg6(bufferedInputStream, (byte) 0);
        }
        return bufferedInputStream;
    }
}
