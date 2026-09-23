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
    public final int f17053a = 0;
    public final int f17054b;
    public final int f17055c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17056f;
    public final Object h;
    public final Cloneable f17057n;
    public final Object f17058r;
    public final Object f17059s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17054b = i10;
        this.d = arrayList;
        this.f17055c = i11;
        this.f17057n = iVar;
        this.f17058r = iVar2;
        this.f17056f = arrayList2;
        this.h = arrayList3;
        this.f17059s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17053a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17054b, this.d, this.f17055c, (a0.i) this.f17057n, (a0.i) this.f17058r, (ArrayList) this.f17056f, (ArrayList) this.h, (CountDownLatch) this.f17059s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17056f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17054b;
                yf.z[] zVarArr = (yf.z[]) this.f17057n;
                int i11 = this.f17055c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17058r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17059s;
                if (!eVar.f46761o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f46758l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f46830b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f46745c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f46829a, 0, i12);
                            dVar.f46744b = i12;
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
        this.f17056f = atomicBoolean;
        this.h = bitmapArr;
        this.f17054b = i10;
        this.f17057n = zVarArr;
        this.f17055c = i11;
        this.f17058r = randomAccessFile;
        this.d = arrayList;
        this.f17059s = countDownLatchArr;
    }
}
