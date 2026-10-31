package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class cc extends AsyncTask {
    public static final int f14973i = 0;
    public final vb f14974a;
    public RandomAccessFile f14975b;
    public long f14976c;
    public long d;
    public boolean e;
    public final String f14977f;
    public HttpURLConnection f14978g;
    public final hc h;

    public cc(hc hcVar, vb vbVar, long j10) {
        this.h = hcVar;
        this.e = true;
        this.f14974a = vbVar;
        this.f14976c = j10;
    }

    public final void a(long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j10 != j11) {
            long j12 = this.d;
            if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.d = elapsedRealtime;
        Utilities.d.c(new bc(this, j10, j11, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cc.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.f15868s.d(new zb(this, 0), this.f14974a.f18487a);
        Utilities.d.c(new zb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.e) {
            hc hcVar = this.h;
            hcVar.f15868s.c(new ib(hcVar, this.f14974a.e, 4));
        } else {
            hc hcVar2 = this.h;
            vb vbVar = this.f14974a;
            hcVar2.f15868s.c(new cg(hcVar2, vbVar.e, 0, vbVar.f18499p, 5));
        }
        Utilities.d.c(new ac(this, bool, 0));
        this.h.f15868s.d(new zb(this, 2), this.f14974a.f18487a);
    }

    public cc(hc hcVar, vb vbVar, String str) {
        this.h = hcVar;
        this.e = true;
        this.f14974a = vbVar;
        this.f14976c = 0;
        this.f14977f = str;
    }
}
