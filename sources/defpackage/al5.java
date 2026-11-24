package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import org.telegram.messenger.Utilities;
public final class al5 extends AsyncTask {
    public final tk5 a;
    public RandomAccessFile b;
    public long c;
    public long d;
    public boolean e;
    public final String f;
    public HttpURLConnection g;
    public final fl5 h;

    public al5(fl5 fl5Var, tk5 tk5Var, String str) {
        this.h = fl5Var;
        this.e = true;
        this.a = tk5Var;
        this.c = 0L;
        this.f = str;
    }

    public final void a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j != j2) {
            long j3 = this.d;
            if (j3 != 0 && j3 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.d = elapsedRealtime;
        Utilities.d.c(new zk5(this, j, j2, (byte) 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.s.d(new xk5(this, (byte) 0), this.a.a ? 1L : 0L);
        Utilities.d.c(new xk5(this, (byte) 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.e) {
            fl5 fl5Var = this.h;
            String str = this.a.e;
            ThreadLocal threadLocal = fl5.I;
            fl5Var.s.c(new jk5(fl5Var, str, (byte) 4));
        } else {
            fl5 fl5Var2 = this.h;
            tk5 tk5Var = this.a;
            String str2 = tk5Var.e;
            File file = tk5Var.p;
            ThreadLocal threadLocal2 = fl5.I;
            fl5Var2.s.c(new hu2(fl5Var2, str2, 0, file, (byte) 1));
        }
        Utilities.d.c(new yk5(this, bool, (byte) 0));
        this.h.s.d(new xk5(this, (byte) 2), this.a.a ? 1L : 0L);
    }

    public al5(fl5 fl5Var, tk5 tk5Var, long j) {
        this.h = fl5Var;
        this.e = true;
        this.a = tk5Var;
        this.c = j;
    }
}
