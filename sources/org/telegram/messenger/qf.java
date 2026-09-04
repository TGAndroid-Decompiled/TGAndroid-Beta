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
    public final int f18805a = 0;
    public final int f18806b;
    public final int f18807c;
    public final ArrayList d;
    public final Object f18808e;
    public final Serializable f18809f;
    public final Object h;
    public final Cloneable f18810n;
    public final Object f18811r;
    public final Object f18812s;

    public qf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18808e = messagesStorage;
        this.f18806b = i10;
        this.d = arrayList;
        this.f18807c = i11;
        this.f18810n = iVar;
        this.f18811r = iVar2;
        this.f18809f = arrayList2;
        this.h = arrayList3;
        this.f18812s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18805a) {
            case 0:
                ((MessagesStorage) this.f18808e).lambda$getWidgetDialogs$169(this.f18806b, this.d, this.f18807c, (a0.i) this.f18810n, (a0.i) this.f18811r, (ArrayList) this.f18809f, (ArrayList) this.h, (CountDownLatch) this.f18812s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18808e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18809f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18806b;
                yf.a0[] a0VarArr = (yf.a0[]) this.f18810n;
                int i11 = this.f18807c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18811r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18812s;
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

    public qf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f18808e = eVar;
        this.f18809f = atomicBoolean;
        this.h = bitmapArr;
        this.f18806b = i10;
        this.f18810n = a0VarArr;
        this.f18807c = i11;
        this.f18811r = randomAccessFile;
        this.d = arrayList;
        this.f18812s = countDownLatchArr;
    }
}
