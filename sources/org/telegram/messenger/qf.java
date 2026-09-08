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
    public final int f18832a = 0;
    public final int f18833b;
    public final int f18834c;
    public final ArrayList d;
    public final Object f18835e;
    public final Serializable f18836f;
    public final Object h;
    public final Cloneable f18837n;
    public final Object f18838r;
    public final Object f18839s;

    public qf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18835e = messagesStorage;
        this.f18833b = i10;
        this.d = arrayList;
        this.f18834c = i11;
        this.f18837n = iVar;
        this.f18838r = iVar2;
        this.f18836f = arrayList2;
        this.h = arrayList3;
        this.f18839s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18832a) {
            case 0:
                ((MessagesStorage) this.f18835e).lambda$getWidgetDialogs$169(this.f18833b, this.d, this.f18834c, (a0.i) this.f18837n, (a0.i) this.f18838r, (ArrayList) this.f18836f, (ArrayList) this.h, (CountDownLatch) this.f18839s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18835e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18836f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18833b;
                yf.a0[] a0VarArr = (yf.a0[]) this.f18837n;
                int i11 = this.f18834c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18838r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18839s;
                if (!eVar.f50110o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f50107l, a0VarArr[i10]);
                    int i12 = a0VarArr[i10].f50079b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f50085c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(a0VarArr[i10].f50078a, 0, i12);
                            dVar.f50084b = i12;
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

    public qf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f18835e = eVar;
        this.f18836f = atomicBoolean;
        this.h = bitmapArr;
        this.f18833b = i10;
        this.f18837n = a0VarArr;
        this.f18834c = i11;
        this.f18838r = randomAccessFile;
        this.d = arrayList;
        this.f18839s = countDownLatchArr;
    }
}
