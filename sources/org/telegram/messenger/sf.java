package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class sf implements Runnable {
    public final int f18897a = 0;
    public final int f18898b;
    public final int f18899c;
    public final ArrayList d;
    public final Object f18900e;
    public final Serializable f18901f;
    public final Object h;
    public final Cloneable f18902n;
    public final Object f18903r;
    public final Object f18904s;

    public sf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18900e = messagesStorage;
        this.f18898b = i10;
        this.d = arrayList;
        this.f18899c = i11;
        this.f18902n = iVar;
        this.f18903r = iVar2;
        this.f18901f = arrayList2;
        this.h = arrayList3;
        this.f18904s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18897a) {
            case 0:
                ((MessagesStorage) this.f18900e).lambda$getWidgetDialogs$169(this.f18898b, this.d, this.f18899c, (a0.i) this.f18902n, (a0.i) this.f18903r, (ArrayList) this.f18901f, (ArrayList) this.h, (CountDownLatch) this.f18904s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18900e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18901f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18898b;
                yf.z[] zVarArr = (yf.z[]) this.f18902n;
                int i11 = this.f18899c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18903r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18904s;
                if (!eVar.f52369o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f52366l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f52444b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f52352c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f52443a, 0, i12);
                            dVar.f52351b = i12;
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

    public sf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f18900e = eVar;
        this.f18901f = atomicBoolean;
        this.h = bitmapArr;
        this.f18898b = i10;
        this.f18902n = zVarArr;
        this.f18899c = i11;
        this.f18903r = randomAccessFile;
        this.d = arrayList;
        this.f18904s = countDownLatchArr;
    }
}
