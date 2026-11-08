package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class bc extends AsyncTask {
    public static final int f21634i = 0;
    public final ub f21635a;
    public RandomAccessFile f21636b;
    public long f21637c;
    public long d;
    public boolean f21638e;
    public final String f21639f;
    public HttpURLConnection f21640g;
    public final gc h;

    public bc(gc gcVar, ub ubVar, long j3) {
        this.h = gcVar;
        this.f21638e = true;
        this.f21635a = ubVar;
        this.f21637c = j3;
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
        this.h.f22651s.d(new yb(this, 0), this.f21635a.f25747a);
        Utilities.d.c(new yb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f21638e) {
            gc gcVar = this.h;
            gcVar.f22651s.c(new ib(gcVar, this.f21635a.f25750e, 4));
        } else {
            gc gcVar2 = this.h;
            ub ubVar = this.f21635a;
            gcVar2.f22651s.c(new dg(gcVar2, ubVar.f25750e, 0, ubVar.f25760p, 5));
        }
        Utilities.d.c(new zb(this, bool, 0));
        this.h.f22651s.d(new yb(this, 2), this.f21635a.f25747a);
    }

    public bc(gc gcVar, ub ubVar, String str) {
        this.h = gcVar;
        this.f21638e = true;
        this.f21635a = ubVar;
        this.f21637c = 0;
        this.f21639f = str;
    }
}
