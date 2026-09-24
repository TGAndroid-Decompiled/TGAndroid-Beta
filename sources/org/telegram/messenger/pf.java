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
    public final int f17291a = 0;
    public final int f17292b;
    public final int f17293c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17294f;
    public final Object h;
    public final Cloneable f17295n;
    public final Object f17296r;
    public final Object f17297s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17292b = i10;
        this.d = arrayList;
        this.f17293c = i11;
        this.f17295n = iVar;
        this.f17296r = iVar2;
        this.f17294f = arrayList2;
        this.h = arrayList3;
        this.f17297s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17291a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17292b, this.d, this.f17293c, (a0.i) this.f17295n, (a0.i) this.f17296r, (ArrayList) this.f17294f, (ArrayList) this.h, (CountDownLatch) this.f17297s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17294f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17292b;
                yf.z[] zVarArr = (yf.z[]) this.f17295n;
                int i11 = this.f17293c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17296r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17297s;
                if (!eVar.f47075o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47072l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f47144b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47059c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f47143a, 0, i12);
                            dVar.f47058b = i12;
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
        this.f17294f = atomicBoolean;
        this.h = bitmapArr;
        this.f17292b = i10;
        this.f17295n = zVarArr;
        this.f17293c = i11;
        this.f17296r = randomAccessFile;
        this.d = arrayList;
        this.f17297s = countDownLatchArr;
    }
}
