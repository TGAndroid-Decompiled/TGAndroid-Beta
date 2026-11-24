package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class sk5 extends AsyncTask {
    public final tk5 a;
    public boolean b = true;
    public HttpURLConnection c;
    public final boolean d;
    public final fl5 e;

    public sk5(fl5 fl5Var, tk5 tk5Var) {
        this.e = fl5Var;
        this.a = tk5Var;
        this.d = Uri.parse(tk5Var.i.g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.e.s.c(new rk5(this, (byte) 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        fl5 fl5Var = this.e;
        co3 co3Var = fl5Var.s;
        if (str != null) {
            co3Var.c(new hb5(this, str, (byte) 9));
        } else if (this.b) {
            co3Var.c(new jk5(fl5Var, this.a.e, (byte) 0));
        }
        co3Var.c(new rk5(this, (byte) 1));
    }
}
