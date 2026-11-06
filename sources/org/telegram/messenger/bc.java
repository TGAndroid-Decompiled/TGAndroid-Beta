package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class bc extends AsyncTask {
    public static final int f21606i = 0;
    public final ub f21607a;
    public RandomAccessFile f21608b;
    public long f21609c;
    public long d;
    public boolean f21610e;
    public final String f21611f;
    public HttpURLConnection f21612g;
    public final gc h;

    public bc(gc gcVar, ub ubVar, long j3) {
        this.h = gcVar;
        this.f21610e = true;
        this.f21607a = ubVar;
        this.f21609c = j3;
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
        Utilities.d.c(new ac(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bc.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.f22625s.d(new yb(this, 0), this.f21607a.f25733a);
        Utilities.d.c(new yb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f21610e) {
            gc gcVar = this.h;
            gcVar.f22625s.c(new ib(gcVar, this.f21607a.f25736e, 4));
        } else {
            gc gcVar2 = this.h;
            ub ubVar = this.f21607a;
            gcVar2.f22625s.c(new dg(gcVar2, ubVar.f25736e, 0, ubVar.f25746p, 5));
        }
        Utilities.d.c(new zb(this, bool, 0));
        this.h.f22625s.d(new yb(this, 2), this.f21607a.f25733a);
    }

    public bc(gc gcVar, ub ubVar, String str) {
        this.h = gcVar;
        this.f21610e = true;
        this.f21607a = ubVar;
        this.f21609c = 0;
        this.f21611f = str;
    }
}
