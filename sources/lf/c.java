package lf;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MessagesStorage;
public final class c implements Runnable {
    public final int f11963a = 0;
    public final int f11964b;
    public final ArrayList f11965c;
    public final int d;
    public final Object e;
    public final Object f11966f;
    public final Cloneable h;
    public final Object f11967n;
    public final Object f11968r;
    public final Object f11969s;

    public c(g gVar, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i10, c0[] c0VarArr, int i11, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.e = gVar;
        this.f11966f = atomicBoolean;
        this.h = bitmapArr;
        this.f11964b = i10;
        this.f11967n = c0VarArr;
        this.d = i11;
        this.f11968r = randomAccessFile;
        this.f11965c = arrayList;
        this.f11969s = countDownLatchArr;
    }

    @Override
    public final void run() {
        switch (this.f11963a) {
            case 0:
                g gVar = (g) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11966f;
                Bitmap[] bitmapArr = (Bitmap[]) this.h;
                int i10 = this.f11964b;
                c0[] c0VarArr = (c0[]) this.f11967n;
                int i11 = this.d;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f11968r;
                ArrayList arrayList = this.f11965c;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f11969s;
                if (!gVar.f11998o.get() && !atomicBoolean.get()) {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    if (Build.VERSION.SDK_INT <= 28) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    }
                    bitmapArr[i10].compress(compressFormat, gVar.f11995l, c0VarArr[i10]);
                    int i12 = c0VarArr[i10].f11971b;
                    try {
                        synchronized (gVar.h) {
                            f fVar = new f(i11);
                            fVar.f11978c = (int) randomAccessFile.length();
                            arrayList.add(fVar);
                            randomAccessFile.write(c0VarArr[i10].f11970a, 0, i12);
                            fVar.f11977b = i12;
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
                ((MessagesStorage) this.e).lambda$getWidgetDialogs$169(this.f11964b, this.f11965c, this.d, (a0.h) this.f11966f, (a0.h) this.h, (ArrayList) this.f11967n, (ArrayList) this.f11968r, (CountDownLatch) this.f11969s);
                return;
        }
    }

    public c(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.e = messagesStorage;
        this.f11964b = i10;
        this.f11965c = arrayList;
        this.d = i11;
        this.f11966f = hVar;
        this.h = hVar2;
        this.f11967n = arrayList2;
        this.f11968r = arrayList3;
        this.f11969s = countDownLatch;
    }
}
