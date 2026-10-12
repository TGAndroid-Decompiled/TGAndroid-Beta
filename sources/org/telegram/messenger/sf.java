package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class sf implements Runnable {
    public final int f18409a = 0;
    public final int f18410b;
    public final int f18411c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f18412f;
    public final Object h;
    public final Cloneable f18413n;
    public final Object f18414r;
    public final Object f18415s;

    public sf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f18410b = i10;
        this.d = arrayList;
        this.f18411c = i11;
        this.f18413n = hVar;
        this.f18414r = hVar2;
        this.f18412f = arrayList2;
        this.h = arrayList3;
        this.f18415s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18409a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f18410b, this.d, this.f18411c, (a0.h) this.f18413n, (a0.h) this.f18414r, (ArrayList) this.f18412f, (ArrayList) this.h, (CountDownLatch) this.f18415s);
                return;
            default:
                zf.f fVar = (zf.f) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18412f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f18410b;
                zf.a0[] a0VarArr = (zf.a0[]) this.f18413n;
                int i11 = this.f18411c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f18414r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f18415s;
                if (!fVar.f50167o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, fVar.f50164l, a0VarArr[i10]);
                    int i12 = a0VarArr[i10].f50136b;
                    try {
                        synchronized (fVar.h) {
                            zf.e eVar = new zf.e(i11);
                            eVar.f50151c = (int) randomAccessFile.length();
                            arrayList.add(eVar);
                            randomAccessFile.write(a0VarArr[i10].f50135a, 0, i12);
                            eVar.f50150b = i12;
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

    public sf(zf.f fVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, zf.a0[] a0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = fVar;
        this.f18412f = atomicBoolean;
        this.h = bitmapArr;
        this.f18410b = i10;
        this.f18413n = a0VarArr;
        this.f18411c = i11;
        this.f18414r = randomAccessFile;
        this.d = arrayList;
        this.f18415s = countDownLatchArr;
    }
}
