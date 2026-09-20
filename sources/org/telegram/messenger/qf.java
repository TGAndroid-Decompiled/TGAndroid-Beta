package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class qf implements Runnable {
    public final int f17377a = 0;
    public final int f17378b;
    public final int f17379c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17380f;
    public final Object h;
    public final Cloneable f17381n;
    public final Object f17382r;
    public final Object f17383s;

    public qf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17378b = i10;
        this.d = arrayList;
        this.f17379c = i11;
        this.f17381n = iVar;
        this.f17382r = iVar2;
        this.f17380f = arrayList2;
        this.h = arrayList3;
        this.f17383s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17378b, this.d, this.f17379c, (a0.i) this.f17381n, (a0.i) this.f17382r, (ArrayList) this.f17380f, (ArrayList) this.h, (CountDownLatch) this.f17383s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17380f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17378b;
                yf.z[] zVarArr = (yf.z[]) this.f17381n;
                int i11 = this.f17379c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17382r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17383s;
                if (!eVar.f47109o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47106l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f47181b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47093c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f47180a, 0, i12);
                            dVar.f47092b = i12;
                            zVarArr[i10].b();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
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

    public qf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f17380f = atomicBoolean;
        this.h = bitmapArr;
        this.f17378b = i10;
        this.f17381n = zVarArr;
        this.f17379c = i11;
        this.f17382r = randomAccessFile;
        this.d = arrayList;
        this.f17383s = countDownLatchArr;
    }
}
