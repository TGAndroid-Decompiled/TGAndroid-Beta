package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class ub extends AsyncTask {
    public final vb f18274a;
    public boolean f18275b = true;
    public HttpURLConnection f18276c;
    public final boolean d;
    public final hc e;

    public ub(hc hcVar, vb vbVar) {
        this.e = hcVar;
        this.f18274a = vbVar;
        this.d = Uri.parse(vbVar.f18492i.f16101g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ub.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.e.f15868s.c(new tb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        hc hcVar = this.e;
        r5 r5Var = hcVar.f15868s;
        if (str != null) {
            r5Var.c(new t6(16, this, str));
        } else if (this.f18275b) {
            r5Var.c(new ib(hcVar, this.f18274a.e, 0));
        }
        r5Var.c(new tb(this, 1));
    }
}
