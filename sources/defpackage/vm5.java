package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class vm5 extends AsyncTask {
    public final wm5 a;
    public boolean b = true;
    public HttpURLConnection c;
    public final boolean d;
    public final in5 e;

    public vm5(in5 in5Var, wm5 wm5Var) {
        this.e = in5Var;
        this.a = wm5Var;
        this.d = Uri.parse(wm5Var.i.g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.e.s.c(new um5(this, (byte) 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        in5 in5Var = this.e;
        to3 to3Var = in5Var.s;
        if (str != null) {
            to3Var.c(new tg5(this, str, (byte) 6));
        } else if (this.b) {
            to3Var.c(new mm5(in5Var, this.a.e, (byte) 1));
        }
        to3Var.c(new um5(this, (byte) 1));
    }
}
