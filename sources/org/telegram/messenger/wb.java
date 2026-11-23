package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class wb extends AsyncTask {
    public final String f27672a;
    public final File f27673b;
    public final String f27674c;
    public int d;
    public RandomAccessFile f27675e = null;
    public boolean f27676f = true;
    public long f27677g;
    public final int h;
    public final fc f27678i;

    public wb(fc fcVar, String str, File file, String str2, int i7) {
        this.f27678i = fcVar;
        this.f27672a = str;
        this.f27673b = file;
        this.f27674c = str2;
        this.h = i7;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.f27677g;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f27677g = elapsedRealtime;
        Utilities.d.c(new vb(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f27678i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i7;
        if (((Boolean) obj).booleanValue()) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        this.f27678i.U(this, i7);
    }
}
