package defpackage;

import android.os.AsyncTask;
import java.util.Locale;
import org.telegram.ui.p;
public final class mdb extends AsyncTask {
    public final String a;
    public final zc1 b;
    public final aj3 c;
    public final pq8 d;

    public mdb(pq8 pq8Var, String str, zc1 zc1Var, aj3 aj3Var) {
        this.d = pq8Var;
        this.a = str;
        this.b = zc1Var;
        this.c = aj3Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        pq8 pq8Var = this.d;
        try {
            ko9 c = pdb.c(jze.a(this.b), new pq8(this.a, (byte) 6));
            Object obj = pq8Var.b;
            return new ndb(c, null);
        } catch (qdb e) {
            Object obj2 = pq8Var.b;
            return new ndb(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        ndb ndbVar = (ndb) obj;
        Object obj2 = this.d.b;
        ko9 ko9Var = ndbVar.a;
        aj3 aj3Var = this.c;
        if (ko9Var != null) {
            p pVar = (p) aj3Var.b;
            if (pVar.R0) {
                return;
            }
            pVar.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) ko9Var.c, (String) ko9Var.b);
            hl.c3(new ge7(aj3Var, (byte) 27));
            return;
        }
        qdb qdbVar = ndbVar.b;
        if (qdbVar != null) {
            aj3Var.Y(qdbVar);
        } else {
            aj3Var.Y(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
