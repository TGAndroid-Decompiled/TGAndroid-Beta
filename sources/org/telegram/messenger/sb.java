package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class sb extends AsyncTask {
    public final tb f26424a;
    public boolean f26425b = true;
    public HttpURLConnection f26426c;
    public final boolean d;
    public final fc f26427e;

    public sb(fc fcVar, tb tbVar) {
        this.f26427e = fcVar;
        this.f26424a = tbVar;
        this.d = Uri.parse(tbVar.f26640i.f23716g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f26427e.f23476s.c(new rb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        fc fcVar = this.f26427e;
        p5 p5Var = fcVar.f23476s;
        if (str != null) {
            p5Var.c(new x4(18, this, str));
        } else if (this.f26425b) {
            p5Var.c(new hb(fcVar, this.f26424a.f26637e, 0));
        }
        p5Var.c(new rb(this, 1));
    }
}
