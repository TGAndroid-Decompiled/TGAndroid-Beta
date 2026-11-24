package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class sm5 extends AsyncTask {
    public final tm5 a;
    public boolean b = true;
    public HttpURLConnection c;
    public final boolean d;
    public final fn5 e;

    public sm5(fn5 fn5Var, tm5 tm5Var) {
        this.e = fn5Var;
        this.a = tm5Var;
        this.d = Uri.parse(tm5Var.i.g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.e.s.c(new rm5(this, (byte) 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        fn5 fn5Var = this.e;
        mp3 mp3Var = fn5Var.s;
        if (str != null) {
            mp3Var.c(new fd5(this, str, (byte) 10));
        } else if (this.b) {
            mp3Var.c(new jm5(fn5Var, this.a.e, (byte) 0));
        }
        mp3Var.c(new rm5(this, (byte) 1));
    }
}
