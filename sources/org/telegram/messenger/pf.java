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
    public final int f18898a = 0;
    public final int f18899b;
    public final int f18900c;
    public final ArrayList d;
    public final Object f18901e;
    public final Serializable f18902f;
    public final Object h;
    public final Cloneable f18903n;
    public final Object f18904r;
    public final Object f18905s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18901e = messagesStorage;
        this.f18899b = i10;
        this.d = arrayList;
        this.f18900c = i11;
        this.f18903n = iVar;
        this.f18904r = iVar2;
        this.f18902f = arrayList2;
        this.h = arrayList3;
        this.f18905s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18898a) {
            case 0:
                ((MessagesStorage) this.f18901e).lambda$getWidgetDialogs$169(this.f18899b, this.d, this.f18900c, (a0.i) this.f18903n, (a0.i) this.f18904r, (ArrayList) this.f18902f, (ArrayList) this.h, (CountDownLatch) this.f18905s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18901e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18902f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18899b;
                yf.z[] zVarArr = (yf.z[]) this.f18903n;
                int i11 = this.f18900c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18904r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18905s;
                if (!eVar.f50963o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f50960l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51036b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f50944c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51035a, 0, i12);
                            dVar.f50943b = i12;
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
        this.f18901e = eVar;
        this.f18902f = atomicBoolean;
        this.h = bitmapArr;
        this.f18899b = i10;
        this.f18903n = zVarArr;
        this.f18900c = i11;
        this.f18904r = randomAccessFile;
        this.d = arrayList;
        this.f18905s = countDownLatchArr;
    }
}
