package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class tb extends AsyncTask {
    public final ub f25607a;
    public boolean f25608b = true;
    public HttpURLConnection f25609c;
    public final boolean d;
    public final gc f25610e;

    public tb(gc gcVar, ub ubVar) {
        this.f25610e = gcVar;
        this.f25607a = ubVar;
        this.d = Uri.parse(ubVar.f25757i.f22874g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f25610e.f22655s.c(new sb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        gc gcVar = this.f25610e;
        p5 p5Var = gcVar.f22655s;
        if (str != null) {
            p5Var.c(new x4(18, this, str));
        } else if (this.f25608b) {
            p5Var.c(new ib(gcVar, this.f25607a.f25754e, 0));
        }
        p5Var.c(new sb(this, 1));
    }
}
