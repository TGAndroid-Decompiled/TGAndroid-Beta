package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
public final class rf implements Runnable {
    public final int f19444a = 0;
    public final int f19445b;
    public final int f19446c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f19447f;
    public final Object h;
    public final Cloneable f19448n;
    public final Object f19449r;
    public final Object f19450s;

    public rf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f19445b = i10;
        this.d = arrayList;
        this.f19446c = i11;
        this.f19448n = hVar;
        this.f19449r = hVar2;
        this.f19447f = arrayList2;
        this.h = arrayList3;
        this.f19450s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19444a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f19445b, this.d, this.f19446c, (a0.h) this.f19448n, (a0.h) this.f19449r, (ArrayList) this.f19447f, (ArrayList) this.h, (CountDownLatch) this.f19450s);
                return;
            default:
                zf.e eVar = (zf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19447f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f19445b;
                zf.z[] zVarArr = (zf.z[]) this.f19448n;
                int i11 = this.f19446c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f19449r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f19450s;
                if (!eVar.f51558o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f51555l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51626b;
                    try {
                        synchronized (eVar.h) {
                            zf.d dVar = new zf.d(i11);
                            dVar.f51542c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51625a, 0, i12);
                            dVar.f51541b = i12;
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

    public rf(zf.e eVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, zf.z[] zVarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = eVar;
        this.f19447f = atomicBoolean;
        this.h = bitmapArr;
        this.f19445b = i10;
        this.f19448n = zVarArr;
        this.f19446c = i11;
        this.f19449r = randomAccessFile;
        this.d = arrayList;
        this.f19450s = countDownLatchArr;
    }
}
