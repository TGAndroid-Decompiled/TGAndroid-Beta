package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class sb extends AsyncTask {
    public final tb f26777a;
    public boolean f26778b = true;
    public HttpURLConnection f26779c;
    public final boolean d;
    public final fc f26780e;

    public sb(fc fcVar, tb tbVar) {
        this.f26780e = fcVar;
        this.f26777a = tbVar;
        this.d = Uri.parse(tbVar.f26996i.f24117g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f26780e.f23901s.c(new rb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        fc fcVar = this.f26780e;
        q5 q5Var = fcVar.f23901s;
        if (str != null) {
            q5Var.c(new z4(18, this, str));
        } else if (this.f26778b) {
            q5Var.c(new hb(fcVar, this.f26777a.f26993e, 0));
        }
        q5Var.c(new rb(this, 1));
    }
}
