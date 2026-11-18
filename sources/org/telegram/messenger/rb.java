package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class rb extends AsyncTask {
    public final sb f26565a;
    public boolean f26566b = true;
    public HttpURLConnection f26567c;
    public final boolean d;
    public final ec f26568e;

    public rb(ec ecVar, sb sbVar) {
        this.f26568e = ecVar;
        this.f26565a = sbVar;
        this.d = Uri.parse(sbVar.f26770i.f23872g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f26568e.f23695s.c(new qb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ec ecVar = this.f26568e;
        q5 q5Var = ecVar.f23695s;
        if (str != null) {
            q5Var.c(new z4(18, this, str));
        } else if (this.f26566b) {
            q5Var.c(new gb(ecVar, this.f26565a.f26767e, 0));
        }
        q5Var.c(new qb(this, 1));
    }
}
