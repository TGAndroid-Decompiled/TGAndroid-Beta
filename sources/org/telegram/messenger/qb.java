package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class qb extends AsyncTask {
    public final String f24867a;
    public final File f24868b;
    public final String f24869c;
    public int d;
    public RandomAccessFile f24870e = null;
    public boolean f24871f = true;
    public long f24872g;
    public final int h;
    public final zb f24873i;

    public qb(zb zbVar, String str, File file, String str2, int i3) {
        this.f24873i = zbVar;
        this.f24867a = str;
        this.f24868b = file;
        this.f24869c = str2;
        this.h = i3;
    }

    public final void a(long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j10 != j11) {
            long j12 = this.f24872g;
            if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f24872g = elapsedRealtime;
        Utilities.d.c(new pb(this, j10, j11, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f24873i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i3;
        if (((Boolean) obj).booleanValue()) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        this.f24873i.U(this, i3);
    }
}
