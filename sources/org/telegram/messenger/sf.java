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
    public final int f19587a = 0;
    public final int f19588b;
    public final int f19589c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f19590f;
    public final Object h;
    public final Cloneable f19591n;
    public final Object f19592r;
    public final Object f19593s;

    public sf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f19588b = i10;
        this.d = arrayList;
        this.f19589c = i11;
        this.f19591n = hVar;
        this.f19592r = hVar2;
        this.f19590f = arrayList2;
        this.h = arrayList3;
        this.f19593s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19587a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f19588b, this.d, this.f19589c, (a0.h) this.f19591n, (a0.h) this.f19592r, (ArrayList) this.f19590f, (ArrayList) this.h, (CountDownLatch) this.f19593s);
                return;
            default:
                zf.e eVar = (zf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19590f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f19588b;
                zf.z[] zVarArr = (zf.z[]) this.f19591n;
                int i11 = this.f19589c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f19592r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f19593s;
                if (!eVar.f52018o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f52015l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f52087b;
                    try {
                        synchronized (eVar.h) {
                            zf.d dVar = new zf.d(i11);
                            dVar.f52002c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f52086a, 0, i12);
                            dVar.f52001b = i12;
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

    public sf(zf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, zf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f19590f = atomicBoolean;
        this.h = bitmapArr;
        this.f19588b = i10;
        this.f19591n = zVarArr;
        this.f19589c = i11;
        this.f19592r = randomAccessFile;
        this.d = arrayList;
        this.f19593s = countDownLatchArr;
    }
}
