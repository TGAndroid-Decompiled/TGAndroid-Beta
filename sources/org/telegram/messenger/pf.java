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
    public final int f17309a = 0;
    public final int f17310b;
    public final int f17311c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17312f;
    public final Object h;
    public final Cloneable f17313n;
    public final Object f17314r;
    public final Object f17315s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17310b = i10;
        this.d = arrayList;
        this.f17311c = i11;
        this.f17313n = iVar;
        this.f17314r = iVar2;
        this.f17312f = arrayList2;
        this.h = arrayList3;
        this.f17315s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17309a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17310b, this.d, this.f17311c, (a0.i) this.f17313n, (a0.i) this.f17314r, (ArrayList) this.f17312f, (ArrayList) this.h, (CountDownLatch) this.f17315s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17312f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17310b;
                yf.z[] zVarArr = (yf.z[]) this.f17313n;
                int i11 = this.f17311c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17314r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17315s;
                if (!eVar.f47086o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47083l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f47155b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47070c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f47154a, 0, i12);
                            dVar.f47069b = i12;
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
        this.f17312f = atomicBoolean;
        this.h = bitmapArr;
        this.f17310b = i10;
        this.f17313n = zVarArr;
        this.f17311c = i11;
        this.f17314r = randomAccessFile;
        this.d = arrayList;
        this.f17315s = countDownLatchArr;
    }
}
