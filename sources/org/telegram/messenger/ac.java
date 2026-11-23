package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class ac extends AsyncTask {
    public static final int f22894i = 0;
    public final tb f22895a;
    public RandomAccessFile f22896b;
    public long f22897c;
    public long d;
    public boolean f22898e;
    public final String f22899f;
    public HttpURLConnection f22900g;
    public final fc h;

    public ac(fc fcVar, tb tbVar, long j3) {
        this.h = fcVar;
        this.f22898e = true;
        this.f22895a = tbVar;
        this.f22897c = j3;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.d;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.d = elapsedRealtime;
        Utilities.d.c(new zb(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ac.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.f23901s.d(new xb(this, 0), this.f22895a.f26990a);
        Utilities.d.c(new xb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f22898e) {
            fc fcVar = this.h;
            fcVar.f23901s.c(new hb(fcVar, this.f22895a.f26993e, 4));
        } else {
            fc fcVar2 = this.h;
            tb tbVar = this.f22895a;
            fcVar2.f23901s.c(new eg(fcVar2, tbVar.f26993e, 0, tbVar.f27003p, 5));
        }
        Utilities.d.c(new yb(this, bool, 0));
        this.h.f23901s.d(new xb(this, 2), this.f22895a.f26990a);
    }

    public ac(fc fcVar, tb tbVar, String str) {
        this.h = fcVar;
        this.f22898e = true;
        this.f22895a = tbVar;
        this.f22897c = 0;
        this.f22899f = str;
    }
}
