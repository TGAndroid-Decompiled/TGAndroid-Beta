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
    public final int f17392a = 0;
    public final int f17393b;
    public final int f17394c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17395f;
    public final Object h;
    public final Cloneable f17396n;
    public final Object f17397r;
    public final Object f17398s;

    public qf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17393b = i10;
        this.d = arrayList;
        this.f17394c = i11;
        this.f17396n = iVar;
        this.f17397r = iVar2;
        this.f17395f = arrayList2;
        this.h = arrayList3;
        this.f17398s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17392a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17393b, this.d, this.f17394c, (a0.i) this.f17396n, (a0.i) this.f17397r, (ArrayList) this.f17395f, (ArrayList) this.h, (CountDownLatch) this.f17398s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17395f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17393b;
                yf.z[] zVarArr = (yf.z[]) this.f17396n;
                int i11 = this.f17394c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17397r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17398s;
                if (!eVar.f47130o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47127l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f47202b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47114c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f47201a, 0, i12);
                            dVar.f47113b = i12;
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
        this.f17395f = atomicBoolean;
        this.h = bitmapArr;
        this.f17393b = i10;
        this.f17396n = zVarArr;
        this.f17394c = i11;
        this.f17397r = randomAccessFile;
        this.d = arrayList;
        this.f17398s = countDownLatchArr;
    }
}
