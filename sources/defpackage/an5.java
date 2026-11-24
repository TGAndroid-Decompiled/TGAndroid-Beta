package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import org.telegram.messenger.Utilities;
public final class an5 extends AsyncTask {
    public final tm5 a;
    public RandomAccessFile b;
    public long c;
    public long d;
    public boolean e;
    public final String f;
    public HttpURLConnection g;
    public final fn5 h;

    public an5(fn5 fn5Var, tm5 tm5Var, String str) {
        this.h = fn5Var;
        this.e = true;
        this.a = tm5Var;
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
        Utilities.d.c(new zm5(this, j, j2, (byte) 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.s.d(new xm5(this, (byte) 0), this.a.a ? 1L : 0L);
        Utilities.d.c(new xm5(this, (byte) 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.e) {
            fn5 fn5Var = this.h;
            String str = this.a.e;
            ThreadLocal threadLocal = fn5.I;
            fn5Var.s.c(new jm5(fn5Var, str, (byte) 4));
        } else {
            fn5 fn5Var2 = this.h;
            tm5 tm5Var = this.a;
            String str2 = tm5Var.e;
            File file = tm5Var.p;
            ThreadLocal threadLocal2 = fn5.I;
            fn5Var2.s.c(new sv2(fn5Var2, str2, 0, file, (byte) 1));
        }
        Utilities.d.c(new ym5(this, bool, (byte) 0));
        this.h.s.d(new xm5(this, (byte) 2), this.a.a ? 1L : 0L);
    }

    public an5(fn5 fn5Var, tm5 tm5Var, long j) {
        this.h = fn5Var;
        this.e = true;
        this.a = tm5Var;
        this.c = j;
    }
}
