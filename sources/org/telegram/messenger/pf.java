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
    public final int f18899a = 0;
    public final int f18900b;
    public final int f18901c;
    public final ArrayList d;
    public final Object f18902e;
    public final Serializable f18903f;
    public final Object h;
    public final Cloneable f18904n;
    public final Object f18905r;
    public final Object f18906s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18902e = messagesStorage;
        this.f18900b = i10;
        this.d = arrayList;
        this.f18901c = i11;
        this.f18904n = iVar;
        this.f18905r = iVar2;
        this.f18903f = arrayList2;
        this.h = arrayList3;
        this.f18906s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18899a) {
            case 0:
                ((MessagesStorage) this.f18902e).lambda$getWidgetDialogs$169(this.f18900b, this.d, this.f18901c, (a0.i) this.f18904n, (a0.i) this.f18905r, (ArrayList) this.f18903f, (ArrayList) this.h, (CountDownLatch) this.f18906s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18902e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18903f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18900b;
                yf.z[] zVarArr = (yf.z[]) this.f18904n;
                int i11 = this.f18901c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18905r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18906s;
                if (!eVar.f50964o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f50961l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51037b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f50945c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51036a, 0, i12);
                            dVar.f50944b = i12;
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
        this.f18902e = eVar;
        this.f18903f = atomicBoolean;
        this.h = bitmapArr;
        this.f18900b = i10;
        this.f18904n = zVarArr;
        this.f18901c = i11;
        this.f18905r = randomAccessFile;
        this.d = arrayList;
        this.f18906s = countDownLatchArr;
    }
}
