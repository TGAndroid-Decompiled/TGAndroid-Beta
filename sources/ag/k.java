package ag;

import a8.ng;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yj0;
public final class k {
    public static int A;
    public static ng B;
    public static boolean v;
    public static volatile boolean f1308x;
    public static ThreadPoolExecutor f1310z;
    public final BitmapDrawable f1311a;
    public final int f1312b;
    public final int f1313c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f1314f;
    public byte[] f1315g;
    public final Object h;
    public int f1316i;
    public boolean f1317j;
    public volatile boolean f1318k;
    public final int f1319l;
    public final File f1320m;
    public int f1321n;
    public final AtomicBoolean f1322o;
    public final a5.d f1323p;
    public volatile boolean f1324q;
    public volatile boolean f1325r;
    public RandomAccessFile f1326s;
    public BitmapFactory.Options f1327t;
    public Bitmap f1328u;
    public static final ConcurrentHashMap f1307w = new ConcurrentHashMap();
    public static final int f1309y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public k(File file, h hVar, g gVar, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f1322o = new AtomicBoolean(false);
        this.f1323p = new a5.d(this, 2);
        this.f1311a = (BitmapDrawable) hVar;
        this.f1312b = i10;
        this.f1313c = i11;
        this.f1319l = gVar.f1279a;
        String name = file.getName();
        if (f1310z == null) {
            int i13 = f1309y;
            f1310z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        boolean z11 = true;
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("_");
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i11);
        if (z10) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb2.append(str);
        if (i12 != 0) {
            str2 = ic.a.i(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.s(sb2, str2, ".pcache2"));
        this.f1320m = file3;
        this.f1314f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f1318k = file3.exists();
            try {
                if (this.f1318k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f1324q = randomAccessFile.readBoolean();
                            if (this.f1324q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f1324q = false;
                                    this.f1318k = false;
                                    file3.delete();
                                } else {
                                    if (this.f1326s != randomAccessFile) {
                                        a();
                                    }
                                    this.f1326s = randomAccessFile;
                                }
                            }
                            if (this.f1326s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f1320m.delete();
                                this.f1318k = false;
                                if (this.f1326s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f1326s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = null;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else {
            this.f1318k = false;
            this.f1324q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            yj0.T0.postRunnable(new c(0));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f1326s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ag.k.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                i iVar = new i(i11);
                iVar.f1300c = wrap.getInt();
                iVar.f1299b = wrap.getInt();
                this.e.add(iVar);
            }
        }
    }

    public final byte[] e(i iVar) {
        boolean z10;
        byte[] bArr;
        if (this.f1314f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f1307w.get(Thread.currentThread());
        } else {
            bArr = this.f1315g;
        }
        if (bArr != null && bArr.length >= iVar.f1299b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (iVar.f1299b * 1.3f)];
        if (z10) {
            f1307w.put(Thread.currentThread(), bArr2);
            if (!f1308x) {
                f1308x = true;
                AndroidUtilities.runOnUIThread(this.f1323p, 5000L);
            }
            return bArr2;
        }
        this.f1315g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ag.k.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f1324q && this.f1318k) {
            return false;
        }
        return true;
    }
}
