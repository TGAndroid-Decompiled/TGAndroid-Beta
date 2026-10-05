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
    public final int f18903a = 0;
    public final int f18904b;
    public final int f18905c;
    public final ArrayList d;
    public final Object f18906e;
    public final Serializable f18907f;
    public final Object h;
    public final Cloneable f18908n;
    public final Object f18909r;
    public final Object f18910s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18906e = messagesStorage;
        this.f18904b = i10;
        this.d = arrayList;
        this.f18905c = i11;
        this.f18908n = iVar;
        this.f18909r = iVar2;
        this.f18907f = arrayList2;
        this.h = arrayList3;
        this.f18910s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18903a) {
            case 0:
                ((MessagesStorage) this.f18906e).lambda$getWidgetDialogs$169(this.f18904b, this.d, this.f18905c, (a0.i) this.f18908n, (a0.i) this.f18909r, (ArrayList) this.f18907f, (ArrayList) this.h, (CountDownLatch) this.f18910s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18906e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18907f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18904b;
                yf.z[] zVarArr = (yf.z[]) this.f18908n;
                int i11 = this.f18905c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18909r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18910s;
                if (!eVar.f50979o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f50976l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51050b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f50960c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51049a, 0, i12);
                            dVar.f50959b = i12;
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
        this.f18906e = eVar;
        this.f18907f = atomicBoolean;
        this.h = bitmapArr;
        this.f18904b = i10;
        this.f18908n = zVarArr;
        this.f18905c = i11;
        this.f18909r = randomAccessFile;
        this.d = arrayList;
        this.f18910s = countDownLatchArr;
    }
}
