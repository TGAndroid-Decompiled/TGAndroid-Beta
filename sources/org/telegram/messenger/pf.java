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
    public final int f19262a = 0;
    public final int f19263b;
    public final int f19264c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f19265f;
    public final Object h;
    public final Cloneable f19266n;
    public final Object f19267r;
    public final Object f19268s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f19263b = i10;
        this.d = arrayList;
        this.f19264c = i11;
        this.f19266n = hVar;
        this.f19267r = hVar2;
        this.f19265f = arrayList2;
        this.h = arrayList3;
        this.f19268s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19262a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f19263b, this.d, this.f19264c, (a0.h) this.f19266n, (a0.h) this.f19267r, (ArrayList) this.f19265f, (ArrayList) this.h, (CountDownLatch) this.f19268s);
                return;
            default:
                zf.e eVar = (zf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19265f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f19263b;
                zf.z[] zVarArr = (zf.z[]) this.f19266n;
                int i11 = this.f19264c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f19267r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f19268s;
                if (!eVar.f51554o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f51551l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51622b;
                    try {
                        synchronized (eVar.h) {
                            zf.d dVar = new zf.d(i11);
                            dVar.f51538c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51621a, 0, i12);
                            dVar.f51537b = i12;
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

    public pf(zf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, zf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f19265f = atomicBoolean;
        this.h = bitmapArr;
        this.f19263b = i10;
        this.f19266n = zVarArr;
        this.f19264c = i11;
        this.f19267r = randomAccessFile;
        this.d = arrayList;
        this.f19268s = countDownLatchArr;
    }
}
