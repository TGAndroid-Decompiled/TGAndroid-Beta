package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class pf implements Runnable {
    public final int f18857a = 0;
    public final int f18858b;
    public final int f18859c;
    public final ArrayList d;
    public final Object f18860e;
    public final Serializable f18861f;
    public final Object h;
    public final Cloneable f18862n;
    public final Object f18863r;
    public final Object f18864s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18860e = messagesStorage;
        this.f18858b = i10;
        this.d = arrayList;
        this.f18859c = i11;
        this.f18862n = iVar;
        this.f18863r = iVar2;
        this.f18861f = arrayList2;
        this.h = arrayList3;
        this.f18864s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18857a) {
            case 0:
                ((MessagesStorage) this.f18860e).lambda$getWidgetDialogs$169(this.f18858b, this.d, this.f18859c, (a0.i) this.f18862n, (a0.i) this.f18863r, (ArrayList) this.f18861f, (ArrayList) this.h, (CountDownLatch) this.f18864s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18860e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18861f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18858b;
                yf.z[] zVarArr = (yf.z[]) this.f18862n;
                int i11 = this.f18859c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18863r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18864s;
                if (!eVar.f52145o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f52142l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f52220b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f52128c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f52219a, 0, i12);
                            dVar.f52127b = i12;
                            zVarArr[i10].b();
                        }
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            atomicBoolean.set(true);
                            throw th2;
                        }
                        atomicBoolean.set(true);
                    }
                    countDownLatchArr[i10].countDown();
                    return;
                }
                return;
        }
    }

    public pf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f18860e = eVar;
        this.f18861f = atomicBoolean;
        this.h = bitmapArr;
        this.f18858b = i10;
        this.f18862n = zVarArr;
        this.f18859c = i11;
        this.f18863r = randomAccessFile;
        this.d = arrayList;
        this.f18864s = countDownLatchArr;
    }
}
