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
    public final int f19096a = 0;
    public final int f19097b;
    public final int f19098c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f19099f;
    public final Object h;
    public final Cloneable f19100n;
    public final Object f19101r;
    public final Object f19102s;

    public nf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f19097b = i10;
        this.d = arrayList;
        this.f19098c = i11;
        this.f19100n = hVar;
        this.f19101r = hVar2;
        this.f19099f = arrayList2;
        this.h = arrayList3;
        this.f19102s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19096a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f19097b, this.d, this.f19098c, (a0.h) this.f19100n, (a0.h) this.f19101r, (ArrayList) this.f19099f, (ArrayList) this.h, (CountDownLatch) this.f19102s);
                return;
            default:
                zf.e eVar = (zf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19099f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f19097b;
                zf.z[] zVarArr = (zf.z[]) this.f19100n;
                int i11 = this.f19098c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f19101r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f19102s;
                if (!eVar.f51549o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f51546l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f51617b;
                    try {
                        synchronized (eVar.h) {
                            zf.d dVar = new zf.d(i11);
                            dVar.f51533c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f51616a, 0, i12);
                            dVar.f51532b = i12;
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
        this.f19099f = atomicBoolean;
        this.h = bitmapArr;
        this.f19097b = i10;
        this.f19100n = zVarArr;
        this.f19098c = i11;
        this.f19101r = randomAccessFile;
        this.d = arrayList;
        this.f19102s = countDownLatchArr;
    }
}
