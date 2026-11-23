package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class ac extends AsyncTask {
    public static final int f22858i = 0;
    public final tb f22859a;
    public RandomAccessFile f22860b;
    public long f22861c;
    public long d;
    public boolean f22862e;
    public final String f22863f;
    public HttpURLConnection f22864g;
    public final fc h;

    public ac(fc fcVar, tb tbVar, long j3) {
        this.h = fcVar;
        this.f22862e = true;
        this.f22859a = tbVar;
        this.f22861c = j3;
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
        this.h.f23865s.d(new xb(this, 0), this.f22859a.f26954a);
        Utilities.d.c(new xb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f22862e) {
            fc fcVar = this.h;
            fcVar.f23865s.c(new hb(fcVar, this.f22859a.f26957e, 4));
        } else {
            fc fcVar2 = this.h;
            tb tbVar = this.f22859a;
            fcVar2.f23865s.c(new eg(fcVar2, tbVar.f26957e, 0, tbVar.f26967p, 5));
        }
        Utilities.d.c(new yb(this, bool, 0));
        this.h.f23865s.d(new xb(this, 2), this.f22859a.f26954a);
    }

    public ac(fc fcVar, tb tbVar, String str) {
        this.h = fcVar;
        this.f22862e = true;
        this.f22859a = tbVar;
        this.f22861c = 0;
        this.f22863f = str;
    }
}
