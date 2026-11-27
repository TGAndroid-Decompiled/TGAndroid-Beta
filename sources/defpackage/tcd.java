package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;
public final class tcd extends zad {
    public final Object i;
    public String j;
    public wfe k;

    public tcd(ko9 ko9Var, String str, wfe wfeVar) {
        super(ko9Var, str, wfeVar);
        this.i = new Object();
    }

    @Override
    public final Object d(String str) {
        wfe wfeVar;
        try {
            synchronized (this.i) {
                if (!str.equals(this.j)) {
                    wfe g = wfe.g(Base64.decode(str, 3));
                    this.j = str;
                    this.k = g;
                }
                wfeVar = this.k;
            }
            return wfeVar;
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
