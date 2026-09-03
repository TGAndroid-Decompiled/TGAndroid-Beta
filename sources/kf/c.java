package kf;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;
public final class c implements Runnable {
    public final int f10405a = 0;
    public final int f10406b;
    public final ArrayList f10407c;
    public final int d;
    public final Object e;
    public final Object f10408f;
    public final Cloneable h;
    public final Object f10409n;
    public final Object f10410r;
    public final Object f10411s;

    public c(g gVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, c0[] c0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = gVar;
        this.f10408f = atomicBoolean;
        this.h = bitmapArr;
        this.f10406b = i10;
        this.f10409n = c0VarArr;
        this.d = i11;
        this.f10410r = randomAccessFile;
        this.f10407c = arrayList;
        this.f10411s = countDownLatchArr;
    }

    @Override
    public final void run() {
        switch (this.f10405a) {
            case 0:
                g gVar = (g) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f10408f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f10406b;
                c0[] c0VarArr = (c0[]) this.f10409n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f10410r;
                ArrayList arrayList = this.f10407c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f10411s;
                if (!gVar.f10440o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, gVar.f10437l, c0VarArr[i10]);
                    int i12 = c0VarArr[i10].f10413b;
                    try {
                        synchronized (gVar.h) {
                            f fVar = new f(i11);
                            fVar.f10420c = (int) randomAccessFile.length();
                            arrayList.add(fVar);
                            randomAccessFile.write(c0VarArr[i10].f10412a, 0, i12);
                            fVar.f10419b = i12;
                            c0VarArr[i10].b();
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
            default:
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f10406b, this.f10407c, this.d, (a0.h) this.f10408f, (a0.h) this.h, (ArrayList) this.f10409n, (ArrayList) this.f10410r, (CountDownLatch) this.f10411s);
                return;
        }
    }

    public c(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f10406b = i10;
        this.f10407c = arrayList;
        this.d = i11;
        this.f10408f = hVar;
        this.h = hVar2;
        this.f10409n = arrayList2;
        this.f10410r = arrayList3;
        this.f10411s = countDownLatch;
    }
}
