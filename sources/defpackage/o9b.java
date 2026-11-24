package defpackage;

import android.os.AsyncTask;
import java.util.Locale;
import org.telegram.ui.p;
public final class o9b extends AsyncTask {
    public final String a;
    public final rc1 b;
    public final z24 c;
    public final g29 d;

    public o9b(g29 g29Var, String str, rc1 rc1Var, z24 z24Var) {
        this.d = g29Var;
        this.a = str;
        this.b = rc1Var;
        this.c = z24Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        g29 g29Var = this.d;
        try {
            vk9 c = r9b.c(rue.a(this.b), new g29(this.a, (byte) 3));
            Object obj = g29Var.b;
            return new p9b(c, null);
        } catch (s9b e) {
            Object obj2 = g29Var.b;
            return new p9b(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        p9b p9bVar = (p9b) obj;
        Object obj2 = this.d.b;
        vk9 vk9Var = p9bVar.a;
        z24 z24Var = this.c;
        if (vk9Var != null) {
            p pVar = (p) z24Var.b;
            if (pVar.R0) {
                return;
            }
            pVar.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) vk9Var.c, (String) vk9Var.b);
            gl.d3(new oq7(z24Var, (byte) 12));
            return;
        }
        s9b s9bVar = p9bVar.b;
        if (s9bVar != null) {
            z24Var.V(s9bVar);
        } else {
            z24Var.V(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
