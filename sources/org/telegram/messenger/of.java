package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class of implements Runnable {
    public final int f19175a = 0;
    public final int f19176b;
    public final int f19177c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f19178f;
    public final Object h;
    public final Cloneable f19179n;
    public final Object f19180r;
    public final Object f19181s;

    public of(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f19176b = i10;
        this.d = arrayList;
        this.f19177c = i11;
        this.f19179n = hVar;
        this.f19180r = hVar2;
        this.f19178f = arrayList2;
        this.h = arrayList3;
        this.f19181s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19175a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f19176b, this.d, this.f19177c, (a0.h) this.f19179n, (a0.h) this.f19180r, (ArrayList) this.f19178f, (ArrayList) this.h, (CountDownLatch) this.f19181s);
                return;
            default:
                zf.e eVar = (zf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19178f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f19176b;
                zf.z[] zVarArr = (zf.z[]) this.f19179n;
                int i11 = this.f19177c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f19180r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f19181s;
                if (!eVar.f51547o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f51544l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51615b;
                    try {
                        synchronized (eVar.h) {
                            zf.d dVar = new zf.d(i11);
                            dVar.f51531c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51614a, 0, i12);
                            dVar.f51530b = i12;
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

    public of(zf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, zf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f19178f = atomicBoolean;
        this.h = bitmapArr;
        this.f19176b = i10;
        this.f19179n = zVarArr;
        this.f19177c = i11;
        this.f19180r = randomAccessFile;
        this.d = arrayList;
        this.f19181s = countDownLatchArr;
    }
}
