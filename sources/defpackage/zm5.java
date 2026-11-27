package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
public final class zm5 extends AsyncTask {
    public final String a;
    public final File b;
    public final String c;
    public int d;
    public RandomAccessFile e = null;
    public boolean f = true;
    public long g;
    public final int h;
    public final in5 i;

    public zm5(in5 in5Var, String str, File file, String str2, int i) {
        this.i = in5Var;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.h = i;
    }

    public final void a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j != j2) {
            long j3 = this.g;
            if (j3 != 0 && j3 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.g = elapsedRealtime;
        Utilities.d.c(new ym5(this, j, j2, (byte) 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm5.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        hl.c3(new sb4(this.i, this, 2, (byte) 4));
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i;
        if (((Boolean) obj).booleanValue()) {
            i = 2;
        } else {
            i = 1;
        }
        hl.c3(new sb4(this.i, this, i, (byte) 4));
    }
}
