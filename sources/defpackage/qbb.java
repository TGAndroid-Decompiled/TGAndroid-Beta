package defpackage;

import android.os.AsyncTask;
import java.util.Locale;
import org.telegram.ui.p;
public final class qbb extends AsyncTask {
    public final String a;
    public final zd1 b;
    public final ai4 c;
    public final et8 d;

    public qbb(et8 et8Var, String str, zd1 zd1Var, ai4 ai4Var) {
        this.d = et8Var;
        this.a = str;
        this.b = zd1Var;
        this.c = ai4Var;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        et8 et8Var = this.d;
        try {
            wm9 c = tbb.c(twe.a(this.b), new jw5(this.a, (byte) 1));
            Object obj = et8Var.b;
            return new rbb(c, null);
        } catch (ubb e) {
            Object obj2 = et8Var.b;
            return new rbb(null, e);
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        rbb rbbVar = (rbb) obj;
        Object obj2 = this.d.b;
        wm9 wm9Var = rbbVar.a;
        ai4 ai4Var = this.c;
        if (wm9Var != null) {
            p pVar = (p) ai4Var.b;
            if (pVar.R0) {
                return;
            }
            pVar.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) wm9Var.c, (String) wm9Var.b);
            gm.c3(new kl7(ai4Var, (byte) 19));
            return;
        }
        ubb ubbVar = rbbVar.b;
        if (ubbVar != null) {
            ai4Var.H(ubbVar);
        } else {
            ai4Var.H(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
