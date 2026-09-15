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
    public final int f17155a = 0;
    public final int f17156b;
    public final int f17157c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17158f;
    public final Object h;
    public final Cloneable f17159n;
    public final Object f17160r;
    public final Object f17161s;

    public qf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17156b = i10;
        this.d = arrayList;
        this.f17157c = i11;
        this.f17159n = iVar;
        this.f17160r = iVar2;
        this.f17158f = arrayList2;
        this.h = arrayList3;
        this.f17161s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17155a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17156b, this.d, this.f17157c, (a0.i) this.f17159n, (a0.i) this.f17160r, (ArrayList) this.f17158f, (ArrayList) this.h, (CountDownLatch) this.f17161s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17158f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17156b;
                yf.z[] zVarArr = (yf.z[]) this.f17159n;
                int i11 = this.f17157c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17160r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17161s;
                if (!eVar.f46807o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f46804l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f46879b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f46791c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f46878a, 0, i12);
                            dVar.f46790b = i12;
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
        this.f17158f = atomicBoolean;
        this.h = bitmapArr;
        this.f17156b = i10;
        this.f17159n = zVarArr;
        this.f17157c = i11;
        this.f17160r = randomAccessFile;
        this.d = arrayList;
        this.f17161s = countDownLatchArr;
    }
}
