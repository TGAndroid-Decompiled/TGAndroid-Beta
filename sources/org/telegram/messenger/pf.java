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
    public final int f17326a = 0;
    public final int f17327b;
    public final int f17328c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17329f;
    public final Object h;
    public final Cloneable f17330n;
    public final Object f17331r;
    public final Object f17332s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17327b = i10;
        this.d = arrayList;
        this.f17328c = i11;
        this.f17330n = iVar;
        this.f17331r = iVar2;
        this.f17329f = arrayList2;
        this.h = arrayList3;
        this.f17332s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17326a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17327b, this.d, this.f17328c, (a0.i) this.f17330n, (a0.i) this.f17331r, (ArrayList) this.f17329f, (ArrayList) this.h, (CountDownLatch) this.f17332s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17329f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17327b;
                yf.z[] zVarArr = (yf.z[]) this.f17330n;
                int i11 = this.f17328c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17331r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17332s;
                if (!eVar.f47194o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47191l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f47263b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47178c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f47262a, 0, i12);
                            dVar.f47177b = i12;
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

    public pf(yf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, yf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f17329f = atomicBoolean;
        this.h = bitmapArr;
        this.f17327b = i10;
        this.f17330n = zVarArr;
        this.f17328c = i11;
        this.f17331r = randomAccessFile;
        this.d = arrayList;
        this.f17332s = countDownLatchArr;
    }
}
