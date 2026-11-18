package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class vb extends AsyncTask {
    public final String f27341a;
    public final File f27342b;
    public final String f27343c;
    public int d;
    public RandomAccessFile f27344e = null;
    public boolean f27345f = true;
    public long f27346g;
    public final int h;
    public final ec f27347i;

    public vb(ec ecVar, String str, File file, String str2, int i7) {
        this.f27347i = ecVar;
        this.f27341a = str;
        this.f27342b = file;
        this.f27343c = str2;
        this.h = i7;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.f27346g;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f27346g = elapsedRealtime;
        Utilities.d.c(new ub(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f27347i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i7;
        if (((Boolean) obj).booleanValue()) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        this.f27347i.U(this, i7);
    }
}
