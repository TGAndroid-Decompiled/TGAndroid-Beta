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
    public final int f18861a = 0;
    public final int f18862b;
    public final int f18863c;
    public final ArrayList d;
    public final Object f18864e;
    public final Serializable f18865f;
    public final Object h;
    public final Cloneable f18866n;
    public final Object f18867r;
    public final Object f18868s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f18864e = messagesStorage;
        this.f18862b = i10;
        this.d = arrayList;
        this.f18863c = i11;
        this.f18866n = iVar;
        this.f18867r = iVar2;
        this.f18865f = arrayList2;
        this.h = arrayList3;
        this.f18868s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18861a) {
            case 0:
                ((MessagesStorage) this.f18864e).lambda$getWidgetDialogs$169(this.f18862b, this.d, this.f18863c, (a0.i) this.f18866n, (a0.i) this.f18867r, (ArrayList) this.f18865f, (ArrayList) this.h, (CountDownLatch) this.f18868s);
                return;
            default:
                yf.e eVar = (yf.e) this.f18864e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18865f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18862b;
                yf.z[] zVarArr = (yf.z[]) this.f18866n;
                int i11 = this.f18863c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18867r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18868s;
                if (!eVar.f52189o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f52186l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f52264b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f52172c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f52263a, 0, i12);
                            dVar.f52171b = i12;
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
        this.f18864e = eVar;
        this.f18865f = atomicBoolean;
        this.h = bitmapArr;
        this.f18862b = i10;
        this.f18866n = zVarArr;
        this.f18863c = i11;
        this.f18867r = randomAccessFile;
        this.d = arrayList;
        this.f18868s = countDownLatchArr;
    }
}
