package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class vb extends AsyncTask {
    public final String f27367a;
    public final File f27368b;
    public final String f27369c;
    public int d;
    public RandomAccessFile f27370e = null;
    public boolean f27371f = true;
    public long f27372g;
    public final int h;
    public final ec f27373i;

    public vb(ec ecVar, String str, File file, String str2, int i7) {
        this.f27373i = ecVar;
        this.f27367a = str;
        this.f27368b = file;
        this.f27369c = str2;
        this.h = i7;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.f27372g;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f27372g = elapsedRealtime;
        Utilities.d.c(new ub(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f27373i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i7;
        if (((Boolean) obj).booleanValue()) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        this.f27373i.U(this, i7);
    }
}
