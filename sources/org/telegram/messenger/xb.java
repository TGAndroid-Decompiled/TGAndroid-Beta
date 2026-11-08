package org.telegram.messenger;

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.RandomAccessFile;
public final class xb extends AsyncTask {
    public final String f26456a;
    public final File f26457b;
    public final String f26458c;
    public int d;
    public RandomAccessFile f26459e = null;
    public boolean f26460f = true;
    public long f26461g;
    public final int h;
    public final gc f26462i;

    public xb(gc gcVar, String str, File file, String str2, int i7) {
        this.f26462i = gcVar;
        this.f26456a = str;
        this.f26457b = file;
        this.f26458c = str2;
        this.h = i7;
    }

    public final void a(long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j3 != j10) {
            long j11 = this.f26461g;
            if (j11 != 0 && j11 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.f26461g = elapsedRealtime;
        Utilities.d.c(new wb(this, j3, j10, 0));
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xb.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onCancelled() {
        this.f26462i.U(this, 2);
    }

    @Override
    public final void onPostExecute(Object obj) {
        int i7;
        if (((Boolean) obj).booleanValue()) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        this.f26462i.U(this, i7);
    }
}
