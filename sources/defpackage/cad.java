package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;
public final class cad extends i8d {
    public final Object i;
    public String j;
    public hde k;

    public cad(wm9 wm9Var, String str, hde hdeVar) {
        super(wm9Var, str, hdeVar);
        this.i = new Object();
    }

    @Override
    public final Object d(String str) {
        hde hdeVar;
        try {
            synchronized (this.i) {
                if (!str.equals(this.j)) {
                    hde g = hde.g(Base64.decode(str, 3));
                    this.j = str;
                    this.k = g;
                }
                hdeVar = this.k;
            }
            return hdeVar;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + str2.length() + 27);
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
