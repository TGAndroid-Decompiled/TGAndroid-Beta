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
    public final int f18752a = 0;
    public final int f18753b;
    public final int f18754c;
    public final ArrayList d;
    public final Object f18755e;
    public final Serializable f18756f;
    public final Object h;
    public final Cloneable f18757n;
    public final Object f18758r;
    public final Object f18759s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18755e = messagesStorage;
        this.f18753b = i10;
        this.d = arrayList;
        this.f18754c = i11;
        this.f18757n = iVar;
        this.f18758r = iVar2;
        this.f18756f = arrayList2;
        this.h = arrayList3;
        this.f18759s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18752a) {
            case 0:
                ((MessagesStorage) this.f18755e).lambda$getWidgetDialogs$169(this.f18753b, this.d, this.f18754c, (a0.i) this.f18757n, (a0.i) this.f18758r, (ArrayList) this.f18756f, (ArrayList) this.h, (CountDownLatch) this.f18759s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18755e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18756f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18753b;
                yf.a0[] a0VarArr = (yf.a0[]) this.f18757n;
                int i11 = this.f18754c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18758r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18759s;
                if (!eVar.f50111o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f50108l, a0VarArr[i10]);
                    int i12 = a0VarArr[i10].f50080b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f50086c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(a0VarArr[i10].f50079a, 0, i12);
                            dVar.f50085b = i12;
                            a0VarArr[i10].b();
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

    public pf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f18755e = eVar;
        this.f18756f = atomicBoolean;
        this.h = bitmapArr;
        this.f18753b = i10;
        this.f18757n = a0VarArr;
        this.f18754c = i11;
        this.f18758r = randomAccessFile;
        this.d = arrayList;
        this.f18759s = countDownLatchArr;
    }
}
