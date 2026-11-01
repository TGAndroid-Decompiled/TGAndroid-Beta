package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class dc extends AsyncTask {
    public static final int f15335i = 0;
    public final wb f15336a;
    public RandomAccessFile f15337b;
    public long f15338c;
    public long d;
    public boolean e;
    public final String f15339f;
    public HttpURLConnection f15340g;
    public final ic h;

    public dc(ic icVar, wb wbVar, long j10) {
        this.h = icVar;
        this.e = true;
        this.f15336a = wbVar;
        this.f15338c = j10;
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
        Utilities.d.c(new cc(this, j10, j11, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dc.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.f16261s.d(new ac(this, 0), this.f15336a.f19009a);
        Utilities.d.c(new ac(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.e) {
            ic icVar = this.h;
            icVar.f16261s.c(new jb(icVar, this.f15336a.e, 4));
        } else {
            ic icVar2 = this.h;
            wb wbVar = this.f15336a;
            icVar2.f16261s.c(new dg(icVar2, wbVar.e, 0, wbVar.f19021p, 5));
        }
        Utilities.d.c(new bc(this, bool, 0));
        this.h.f16261s.d(new ac(this, 2), this.f15336a.f19009a);
    }

    public dc(ic icVar, wb wbVar, String str) {
        this.h = icVar;
        this.e = true;
        this.f15336a = wbVar;
        this.f15338c = 0;
        this.f15339f = str;
    }
}
