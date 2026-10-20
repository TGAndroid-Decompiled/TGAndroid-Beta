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
    public final int f19265a = 0;
    public final int f19266b;
    public final int f19267c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f19268f;
    public final Object h;
    public final Cloneable f19269n;
    public final Object f19270r;
    public final Object f19271s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f19266b = i10;
        this.d = arrayList;
        this.f19267c = i11;
        this.f19269n = hVar;
        this.f19270r = hVar2;
        this.f19268f = arrayList2;
        this.h = arrayList3;
        this.f19271s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19265a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f19266b, this.d, this.f19267c, (a0.h) this.f19269n, (a0.h) this.f19270r, (ArrayList) this.f19268f, (ArrayList) this.h, (CountDownLatch) this.f19271s);
                return;
            default:
                zf.e eVar = (zf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19268f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f19266b;
                zf.z[] zVarArr = (zf.z[]) this.f19269n;
                int i11 = this.f19267c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f19270r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f19271s;
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
        this.f19268f = atomicBoolean;
        this.h = bitmapArr;
        this.f19266b = i10;
        this.f19269n = zVarArr;
        this.f19267c = i11;
        this.f19270r = randomAccessFile;
        this.d = arrayList;
        this.f19271s = countDownLatchArr;
    }
}
