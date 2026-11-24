package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;
public final class a8d extends g6d {
    public final Object i;
    public String j;
    public gbe k;

    public a8d(vk9 vk9Var, String str, gbe gbeVar) {
        super(vk9Var, str, gbeVar);
        this.i = new Object();
    }

    @Override
    public final Object d(String str) {
        gbe gbeVar;
        try {
            synchronized (this.i) {
                if (!str.equals(this.j)) {
                    gbe g = gbe.g(Base64.decode(str, 3));
                    this.j = str;
                    this.k = g;
                }
                gbeVar = this.k;
            }
            return gbeVar;
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
