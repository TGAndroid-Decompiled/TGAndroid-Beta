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
    public final int f18725a = 0;
    public final int f18726b;
    public final int f18727c;
    public final ArrayList d;
    public final Object f18728e;
    public final Serializable f18729f;
    public final Object h;
    public final Cloneable f18730n;
    public final Object f18731r;
    public final Object f18732s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18728e = messagesStorage;
        this.f18726b = i10;
        this.d = arrayList;
        this.f18727c = i11;
        this.f18730n = iVar;
        this.f18731r = iVar2;
        this.f18729f = arrayList2;
        this.h = arrayList3;
        this.f18732s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18725a) {
            case 0:
                ((MessagesStorage) this.f18728e).lambda$getWidgetDialogs$169(this.f18726b, this.d, this.f18727c, (a0.i) this.f18730n, (a0.i) this.f18731r, (ArrayList) this.f18729f, (ArrayList) this.h, (CountDownLatch) this.f18732s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18728e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18729f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18726b;
                yf.a0[] a0VarArr = (yf.a0[]) this.f18730n;
                int i11 = this.f18727c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18731r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18732s;
                if (!eVar.f50081o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f50078l, a0VarArr[i10]);
                    int i12 = a0VarArr[i10].f50050b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f50056c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(a0VarArr[i10].f50049a, 0, i12);
                            dVar.f50055b = i12;
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
        this.f18728e = eVar;
        this.f18729f = atomicBoolean;
        this.h = bitmapArr;
        this.f18726b = i10;
        this.f18730n = a0VarArr;
        this.f18727c = i11;
        this.f18731r = randomAccessFile;
        this.d = arrayList;
        this.f18732s = countDownLatchArr;
    }
}
