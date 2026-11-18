package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class vb extends AsyncTask {
    public final String f27339a;
    public final File f27340b;
    public final String f27341c;
    public int d;
    public RandomAccessFile f27342e = null;
    public boolean f27343f = true;
    public long f27344g;
    public final int h;
    public final ec f27345i;

    public vb(ec ecVar, String str, File file, String str2, int i7) {
        this.f27345i = ecVar;
        this.f27339a = str;
        this.f27340b = file;
        this.f27341c = str2;
        this.h = i7;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.f27344g;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f27344g = elapsedRealtime;
        Utilities.d.c(new ub(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f27345i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i7;
        if (((Boolean) obj).booleanValue()) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        this.f27345i.U(this, i7);
    }
}
