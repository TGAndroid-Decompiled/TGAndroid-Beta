package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class tb extends AsyncTask {
    public final ub f25593a;
    public boolean f25594b = true;
    public HttpURLConnection f25595c;
    public final boolean d;
    public final gc f25596e;

    public tb(gc gcVar, ub ubVar) {
        this.f25596e = gcVar;
        this.f25593a = ubVar;
        this.d = Uri.parse(ubVar.f25739i.f22857g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f25596e.f22625s.c(new sb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        gc gcVar = this.f25596e;
        p5 p5Var = gcVar.f22625s;
        if (str != null) {
            p5Var.c(new y4(18, this, str));
        } else if (this.f25594b) {
            p5Var.c(new ib(gcVar, this.f25593a.f25736e, 0));
        }
        p5Var.c(new sb(this, 1));
    }
}
