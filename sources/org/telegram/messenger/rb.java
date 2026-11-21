package org.telegram.messenger;

import android.net.Uri;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
public final class rb extends AsyncTask {
    public final sb f26591a;
    public boolean f26592b = true;
    public HttpURLConnection f26593c;
    public final boolean d;
    public final ec f26594e;

    public rb(ec ecVar, sb sbVar) {
        this.f26594e = ecVar;
        this.f26591a = sbVar;
        this.d = Uri.parse(sbVar.f26796i.f23897g).getQueryParameter("s") != null;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f26594e.f23720s.c(new qb(this, 0));
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        ec ecVar = this.f26594e;
        q5 q5Var = ecVar.f23720s;
        if (str != null) {
            q5Var.c(new z4(18, this, str));
        } else if (this.f26592b) {
            q5Var.c(new gb(ecVar, this.f26591a.f26793e, 0));
        }
        q5Var.c(new qb(this, 1));
    }
}
