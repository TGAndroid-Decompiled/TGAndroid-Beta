package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class sb extends AsyncTask {
    public final tb f26741a;
    public boolean f26742b = true;
    public HttpURLConnection f26743c;
    public final boolean d;
    public final fc f26744e;

    public sb(fc fcVar, tb tbVar) {
        this.f26744e = fcVar;
        this.f26741a = tbVar;
        this.d = Uri.parse(tbVar.f26960i.f24081g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f26744e.f23865s.c(new rb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        fc fcVar = this.f26744e;
        q5 q5Var = fcVar.f23865s;
        if (str != null) {
            q5Var.c(new z4(18, this, str));
        } else if (this.f26742b) {
            q5Var.c(new hb(fcVar, this.f26741a.f26957e, 0));
        }
        q5Var.c(new rb(this, 1));
    }
}
