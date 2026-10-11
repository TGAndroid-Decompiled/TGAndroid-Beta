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
    public final int f18862a = 0;
    public final int f18863b;
    public final int f18864c;
    public final ArrayList d;
    public final Object f18865e;
    public final Serializable f18866f;
    public final Object h;
    public final Cloneable f18867n;
    public final Object f18868r;
    public final Object f18869s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18865e = messagesStorage;
        this.f18863b = i10;
        this.d = arrayList;
        this.f18864c = i11;
        this.f18867n = iVar;
        this.f18868r = iVar2;
        this.f18866f = arrayList2;
        this.h = arrayList3;
        this.f18869s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18862a) {
            case 0:
                ((MessagesStorage) this.f18865e).lambda$getWidgetDialogs$169(this.f18863b, this.d, this.f18864c, (a0.i) this.f18867n, (a0.i) this.f18868r, (ArrayList) this.f18866f, (ArrayList) this.h, (CountDownLatch) this.f18869s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18865e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18866f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18863b;
                yf.z[] zVarArr = (yf.z[]) this.f18867n;
                int i11 = this.f18864c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18868r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18869s;
                if (!eVar.f52232o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f52229l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f52307b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f52215c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f52306a, 0, i12);
                            dVar.f52214b = i12;
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
        this.f18865e = eVar;
        this.f18866f = atomicBoolean;
        this.h = bitmapArr;
        this.f18863b = i10;
        this.f18867n = zVarArr;
        this.f18864c = i11;
        this.f18868r = randomAccessFile;
        this.d = arrayList;
        this.f18869s = countDownLatchArr;
    }
}
