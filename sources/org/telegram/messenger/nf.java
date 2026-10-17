package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class nf implements Runnable {
    public final int f19095a = 0;
    public final int f19096b;
    public final int f19097c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f19098f;
    public final Object h;
    public final Cloneable f19099n;
    public final Object f19100r;
    public final Object f19101s;

    public nf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f19096b = i10;
        this.d = arrayList;
        this.f19097c = i11;
        this.f19099n = hVar;
        this.f19100r = hVar2;
        this.f19098f = arrayList2;
        this.h = arrayList3;
        this.f19101s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19095a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f19096b, this.d, this.f19097c, (a0.h) this.f19099n, (a0.h) this.f19100r, (ArrayList) this.f19098f, (ArrayList) this.h, (CountDownLatch) this.f19101s);
                return;
            default:
                zf.e eVar = (zf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19098f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f19096b;
                zf.z[] zVarArr = (zf.z[]) this.f19099n;
                int i11 = this.f19097c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f19100r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f19101s;
                if (!eVar.f51569o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f51566l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51637b;
                    try {
                        synchronized (eVar.h) {
                            zf.d dVar = new zf.d(i11);
                            dVar.f51553c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51636a, 0, i12);
                            dVar.f51552b = i12;
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

    public nf(zf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, zf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f19098f = atomicBoolean;
        this.h = bitmapArr;
        this.f19096b = i10;
        this.f19099n = zVarArr;
        this.f19097c = i11;
        this.f19100r = randomAccessFile;
        this.d = arrayList;
        this.f19101s = countDownLatchArr;
    }
}
