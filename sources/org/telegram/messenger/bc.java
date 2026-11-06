package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
public final class bc extends AsyncTask {
    public static final int f21607i = 0;
    public final ub f21608a;
    public RandomAccessFile f21609b;
    public long f21610c;
    public long d;
    public boolean f21611e;
    public final String f21612f;
    public HttpURLConnection f21613g;
    public final gc h;

    public bc(gc gcVar, ub ubVar, long j3) {
        this.h = gcVar;
        this.f21611e = true;
        this.f21608a = ubVar;
        this.f21610c = j3;
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
        this.h.f22632s.d(new yb(this, 0), this.f21608a.f25741a);
        Utilities.d.c(new yb(this, 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.f21611e) {
            gc gcVar = this.h;
            gcVar.f22632s.c(new ib(gcVar, this.f21608a.f25744e, 4));
        } else {
            gc gcVar2 = this.h;
            ub ubVar = this.f21608a;
            gcVar2.f22632s.c(new dg(gcVar2, ubVar.f25744e, 0, ubVar.f25754p, 5));
        }
        Utilities.d.c(new zb(this, bool, 0));
        this.h.f22632s.d(new yb(this, 2), this.f21608a.f25741a);
    }

    public bc(gc gcVar, ub ubVar, String str) {
        this.h = gcVar;
        this.f21611e = true;
        this.f21608a = ubVar;
        this.f21610c = 0;
        this.f21612f = str;
    }
}
