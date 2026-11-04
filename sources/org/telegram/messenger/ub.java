package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class ub extends AsyncTask {
    public static final int f25666i = 0;
    public final nb f25667a;
    public RandomAccessFile f25668b;
    public long f25669c;
    public long d;
    public boolean f25670e;
    public final String f25671f;
    public HttpURLConnection f25672g;
    public final zb h;

    public ub(zb zbVar, nb nbVar, long j10) {
        this.h = zbVar;
        this.f25670e = true;
        this.f25667a = nbVar;
        this.f25669c = j10;
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
        Utilities.d.c(new tb(this, j10, j11, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ub.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.f26773s.e(new rb(this, 0), this.f25667a.f24340a);
        Utilities.d.c(new rb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f25670e) {
            zb zbVar = this.h;
            zbVar.f26773s.c(new bb(zbVar, this.f25667a.f24343e, 4));
        } else {
            zb zbVar2 = this.h;
            nb nbVar = this.f25667a;
            zbVar2.f26773s.c(new vf(zbVar2, nbVar.f24343e, 0, nbVar.f24353p, 5));
        }
        Utilities.d.c(new sb(this, bool, 0));
        this.h.f26773s.e(new rb(this, 2), this.f25667a.f24340a);
    }

    public ub(zb zbVar, nb nbVar, String str) {
        this.h = zbVar;
        this.f25670e = true;
        this.f25667a = nbVar;
        this.f25669c = 0;
        this.f25671f = str;
    }
}
