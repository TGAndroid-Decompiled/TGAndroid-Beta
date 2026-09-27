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
    public final int f17303a = 0;
    public final int f17304b;
    public final int f17305c;
    public final ArrayList d;
    public final Object e;
    public final Serializable f17306f;
    public final Object h;
    public final Cloneable f17307n;
    public final Object f17308r;
    public final Object f17309s;

    public pf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.i iVar, a0.i iVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f17304b = i10;
        this.d = arrayList;
        this.f17305c = i11;
        this.f17307n = iVar;
        this.f17308r = iVar2;
        this.f17306f = arrayList2;
        this.h = arrayList3;
        this.f17309s = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17303a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f17304b, this.d, this.f17305c, (a0.i) this.f17307n, (a0.i) this.f17308r, (ArrayList) this.f17306f, (ArrayList) this.h, (CountDownLatch) this.f17309s);
                return;
            default:
                yf.e eVar = (yf.e) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17306f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f17304b;
                yf.z[] zVarArr = (yf.z[]) this.f17307n;
                int i11 = this.f17305c;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f17308r;
                ArrayList arrayList = this.d;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f17309s;
                if (!eVar.f47131o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, eVar.f47128l, zVarArr[i10]);
                    int i12 = zVarArr[i10].f47203b;
                    try {
                        synchronized (eVar.h) {
                            yf.d dVar = new yf.d(i11);
                            dVar.f47115c = (int) randomAccessFile.length();
                            arrayList.add(dVar);
                            randomAccessFile.write(zVarArr[i10].f47202a, 0, i12);
                            dVar.f47114b = i12;
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
        this.f17306f = atomicBoolean;
        this.h = bitmapArr;
        this.f17304b = i10;
        this.f17307n = zVarArr;
        this.f17305c = i11;
        this.f17308r = randomAccessFile;
        this.d = arrayList;
        this.f17309s = countDownLatchArr;
    }
}
