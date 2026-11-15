package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class wb extends AsyncTask {
    public final String f27321a;
    public final File f27322b;
    public final String f27323c;
    public int d;
    public RandomAccessFile f27324e = null;
    public boolean f27325f = true;
    public long f27326g;
    public final int h;
    public final fc f27327i;

    public wb(fc fcVar, String str, File file, String str2, int i7) {
        this.f27327i = fcVar;
        this.f27321a = str;
        this.f27322b = file;
        this.f27323c = str2;
        this.h = i7;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.f27326g;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f27326g = elapsedRealtime;
        Utilities.d.c(new vb(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f27327i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i7;
        if (((Boolean) obj).booleanValue()) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        this.f27327i.U(this, i7);
    }
}
