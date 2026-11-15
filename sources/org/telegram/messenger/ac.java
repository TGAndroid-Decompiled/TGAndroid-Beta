package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class ac extends AsyncTask {
    public static final int f22485i = 0;
    public final tb f22486a;
    public RandomAccessFile f22487b;
    public long f22488c;
    public long d;
    public boolean f22489e;
    public final String f22490f;
    public HttpURLConnection f22491g;
    public final fc h;

    public ac(fc fcVar, tb tbVar, long j3) {
        this.h = fcVar;
        this.f22489e = true;
        this.f22486a = tbVar;
        this.f22488c = j3;
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
        this.h.f23476s.d(new xb(this, 0), this.f22486a.f26634a);
        Utilities.d.c(new xb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f22489e) {
            fc fcVar = this.h;
            fcVar.f23476s.c(new hb(fcVar, this.f22486a.f26637e, 4));
        } else {
            fc fcVar2 = this.h;
            tb tbVar = this.f22486a;
            fcVar2.f23476s.c(new cg(fcVar2, tbVar.f26637e, 0, tbVar.f26647p, 5));
        }
        Utilities.d.c(new yb(this, bool, 0));
        this.h.f23476s.d(new xb(this, 2), this.f22486a.f26634a);
    }

    public ac(fc fcVar, tb tbVar, String str) {
        this.h = fcVar;
        this.f22489e = true;
        this.f22486a = tbVar;
        this.f22488c = 0;
        this.f22490f = str;
    }
}
