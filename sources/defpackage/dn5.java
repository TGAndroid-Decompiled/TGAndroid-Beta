package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import org.telegram.messenger.Utilities;
public final class dn5 extends AsyncTask {
    public final wm5 a;
    public RandomAccessFile b;
    public long c;
    public long d;
    public boolean e;
    public final String f;
    public HttpURLConnection g;
    public final in5 h;

    public dn5(in5 in5Var, wm5 wm5Var, String str) {
        this.h = in5Var;
        this.e = true;
        this.a = wm5Var;
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
        Utilities.d.c(new cn5(this, j, j2, (byte) 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.h.s.d(new an5(this, (byte) 0), this.a.a ? 1L : 0L);
        Utilities.d.c(new an5(this, (byte) 1));
    }

    @Override
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && this.e) {
            in5 in5Var = this.h;
            String str = this.a.e;
            ThreadLocal threadLocal = in5.I;
            in5Var.s.c(new mm5(in5Var, str, (byte) 0));
        } else {
            in5 in5Var2 = this.h;
            wm5 wm5Var = this.a;
            String str2 = wm5Var.e;
            File file = wm5Var.p;
            ThreadLocal threadLocal2 = in5.I;
            in5Var2.s.c(new av2(in5Var2, str2, 0, file, (byte) 1));
        }
        Utilities.d.c(new bn5(this, bool, (byte) 0));
        this.h.s.d(new an5(this, (byte) 2), this.a.a ? 1L : 0L);
    }

    public dn5(in5 in5Var, wm5 wm5Var, long j) {
        this.h = in5Var;
        this.e = true;
        this.a = wm5Var;
        this.c = j;
    }
}
