package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class tb extends AsyncTask {
    public final ub f25603a;
    public boolean f25604b = true;
    public HttpURLConnection f25605c;
    public final boolean d;
    public final gc f25606e;

    public tb(gc gcVar, ub ubVar) {
        this.f25606e = gcVar;
        this.f25603a = ubVar;
        this.d = Uri.parse(ubVar.f25753i.f22870g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f25606e.f22651s.c(new sb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        gc gcVar = this.f25606e;
        p5 p5Var = gcVar.f22651s;
        if (str != null) {
            p5Var.c(new x4(18, this, str));
        } else if (this.f25604b) {
            p5Var.c(new ib(gcVar, this.f25603a.f25750e, 0));
        }
        p5Var.c(new sb(this, 1));
    }
}
