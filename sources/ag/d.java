package ag;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;
public final class d implements Runnable {
    public final int f1261a = 0;
    public final int f1262b;
    public final ArrayList f1263c;
    public final int d;
    public final Object e;
    public final Object f1264f;
    public final Cloneable h;
    public final Object f1265n;
    public final Object f1266r;
    public final Object f1267s;

    public d(k kVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, i0[] i0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = kVar;
        this.f1264f = atomicBoolean;
        this.h = bitmapArr;
        this.f1262b = i10;
        this.f1265n = i0VarArr;
        this.d = i11;
        this.f1266r = randomAccessFile;
        this.f1263c = arrayList;
        this.f1267s = countDownLatchArr;
    }

    @Override
    public final void run() {
        switch (this.f1261a) {
            case 0:
                k kVar = (k) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1264f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f1262b;
                i0[] i0VarArr = (i0[]) this.f1265n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f1266r;
                ArrayList arrayList = this.f1263c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f1267s;
                if (!kVar.f1322o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, kVar.f1319l, i0VarArr[i10]);
                    int i12 = i0VarArr[i10].f1302b;
                    try {
                        synchronized (kVar.h) {
                            i iVar = new i(i11);
                            iVar.f1300c = (int) randomAccessFile.length();
                            arrayList.add(iVar);
                            randomAccessFile.write(i0VarArr[i10].f1301a, 0, i12);
                            iVar.f1299b = i12;
                            i0VarArr[i10].b();
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
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$172(this.f1262b, this.f1263c, this.d, (a0.h) this.f1264f, (a0.h) this.h, (ArrayList) this.f1265n, (ArrayList) this.f1266r, (CountDownLatch) this.f1267s);
                return;
        }
    }

    public d(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f1262b = i10;
        this.f1263c = arrayList;
        this.d = i11;
        this.f1264f = hVar;
        this.h = hVar2;
        this.f1265n = arrayList2;
        this.f1266r = arrayList3;
        this.f1267s = countDownLatch;
    }
}
