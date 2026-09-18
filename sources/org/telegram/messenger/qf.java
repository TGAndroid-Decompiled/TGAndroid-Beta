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
    public final int f17332a = 0;
    public final int f17333b;
    public final int f17334c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17335f;
    public final Object h;
    public final Cloneable f17336n;
    public final Object f17337r;
    public final Object f17338s;

    public qf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17333b = i10;
        this.d = arrayList;
        this.f17334c = i11;
        this.f17336n = iVar;
        this.f17337r = iVar2;
        this.f17335f = arrayList2;
        this.h = arrayList3;
        this.f17338s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17332a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17333b, this.d, this.f17334c, (a0.i) this.f17336n, (a0.i) this.f17337r, (ArrayList) this.f17335f, (ArrayList) this.h, (CountDownLatch) this.f17338s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17335f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17333b;
                yf.a0[] a0VarArr = (yf.a0[]) this.f17336n;
                int i11 = this.f17334c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17337r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17338s;
                if (!eVar.f47064o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47061l, a0VarArr[i10]);
                    int i12 = a0VarArr[i10].f47035b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47041c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(a0VarArr[i10].f47034a, 0, i12);
                            dVar.f47040b = i12;
                            a0VarArr[i10].b();
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

    public qf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f17335f = atomicBoolean;
        this.h = bitmapArr;
        this.f17333b = i10;
        this.f17336n = a0VarArr;
        this.f17334c = i11;
        this.f17337r = randomAccessFile;
        this.d = arrayList;
        this.f17338s = countDownLatchArr;
    }
}
