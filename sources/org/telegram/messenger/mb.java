package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class mb extends AsyncTask {
    public final nb f24183a;
    public boolean f24184b = true;
    public HttpURLConnection f24185c;
    public final boolean d;
    public final zb f24186e;

    public mb(zb zbVar, nb nbVar) {
        this.f24186e = zbVar;
        this.f24183a = nbVar;
        this.d = Uri.parse(nbVar.f24346i.f21489g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f24186e.f26773s.c(new lb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        zb zbVar = this.f24186e;
        p5 p5Var = zbVar.f26773s;
        if (str != null) {
            p5Var.c(new y4(18, this, str));
        } else if (this.f24184b) {
            p5Var.c(new bb(zbVar, this.f24183a.f24343e, 0));
        }
        p5Var.c(new lb(this, 1));
    }
}
