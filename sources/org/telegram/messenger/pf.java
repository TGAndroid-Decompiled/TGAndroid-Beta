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
    public final int f17306a = 0;
    public final int f17307b;
    public final int f17308c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17309f;
    public final Object h;
    public final Cloneable f17310n;
    public final Object f17311r;
    public final Object f17312s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17307b = i10;
        this.d = arrayList;
        this.f17308c = i11;
        this.f17310n = iVar;
        this.f17311r = iVar2;
        this.f17309f = arrayList2;
        this.h = arrayList3;
        this.f17312s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17306a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17307b, this.d, this.f17308c, (a0.i) this.f17310n, (a0.i) this.f17311r, (ArrayList) this.f17309f, (ArrayList) this.h, (CountDownLatch) this.f17312s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17309f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17307b;
                yf.z[] zVarArr = (yf.z[]) this.f17310n;
                int i11 = this.f17308c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17311r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17312s;
                if (!eVar.f47085o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47082l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f47154b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47069c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f47153a, 0, i12);
                            dVar.f47068b = i12;
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

    public pf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f17309f = atomicBoolean;
        this.h = bitmapArr;
        this.f17307b = i10;
        this.f17310n = zVarArr;
        this.f17308c = i11;
        this.f17311r = randomAccessFile;
        this.d = arrayList;
        this.f17312s = countDownLatchArr;
    }
}
