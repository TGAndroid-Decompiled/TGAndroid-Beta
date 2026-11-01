package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class vb extends AsyncTask {
    public final wb f18603a;
    public boolean f18604b = true;
    public HttpURLConnection f18605c;
    public final boolean d;
    public final ic e;

    public vb(ic icVar, wb wbVar) {
        this.e = icVar;
        this.f18603a = wbVar;
        this.d = Uri.parse(wbVar.f19014i.f16436g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.e.f16261s.c(new ub(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ic icVar = this.e;
        r5 r5Var = icVar.f16261s;
        if (str != null) {
            r5Var.c(new t6(16, this, str));
        } else if (this.f18604b) {
            r5Var.c(new jb(icVar, this.f18603a.e, 0));
        }
        r5Var.c(new ub(this, 1));
    }
}
