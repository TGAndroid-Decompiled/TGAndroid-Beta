package c5;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.s1;
import org.telegram.ui.Components.rf;
import w7.ja;
import y8.i0;
public final class w implements Runnable {
    public final int f3823a;
    public Object f3824b;
    public Object f3825c;
    public Object d;

    public w() {
        this.f3823a = 6;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f3824b).X) {
            fVar = (c6.f) ((g6.v) this.f3824b).X.get((String) this.f3825c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f7409n0.b("Discarded message for unknown namespace '%s'", (String) this.f3825c);
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: c5.w.b():void");
    }

    @Override
    public final void run() {
        c6.f fVar;
        x9.b bVar;
        Bundle bundle = null;
        Object obj = null;
        switch (this.f3823a) {
            case 0:
                z.I((z) this.f3824b, (a4.l) this.f3825c, (s1) this.d);
                return;
            case 1:
                z.H((z) this.f3824b, (k6.h) this.f3825c, (h) this.d);
                return;
            case 2:
                c6.d0 d0Var = (c6.d0) this.f3824b;
                HashMap hashMap = d0Var.f3863b.C;
                String str = (String) this.f3825c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f3863b.C.get(str);
                }
                if (fVar != null) {
                    ((e6.h) fVar).o((String) this.d);
                    return;
                } else {
                    c6.e0.G.b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
            case 3:
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f3824b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f281b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f3825c);
                    }
                    lVar.onCreate(bundle);
                }
                if (aVar.f281b >= 2) {
                    lVar.onStart();
                }
                if (aVar.f281b >= 3) {
                    lVar.onResume();
                }
                if (aVar.f281b >= 4) {
                    lVar.onStop();
                }
                if (aVar.f281b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 4:
                da.b bVar2 = (da.b) this.d;
                bVar2.b((x9.b) this.f3824b, (TaskCompletionSource) this.f3825c);
                ((AtomicInteger) bVar2.f5827i.f53183c).set(0);
                double min = Math.min(3600000.0d, Math.pow(bVar2.f5823b, bVar2.a()) * (60000.0d / bVar2.f5822a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f53459b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 5:
                a();
                return;
            case 6:
                try {
                    obj = ((o0.e) this.f3824b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new j9.u(23, (v) this.f3825c, obj));
                return;
            case 7:
                ((rf) this.d).J((File) this.f3825c, (ArrayList) this.f3824b);
                return;
            case 8:
                u4.e eVar = (u4.e) this.d;
                eVar.d.f1931c.remove((String) this.f3824b);
                c0.m mVar = (c0.m) this.f3825c;
                if (!(mVar.f3505a instanceof c0.a)) {
                    try {
                        mVar.get();
                        return;
                    } catch (Exception e) {
                        eVar.f50176c.l(e);
                        return;
                    }
                }
                return;
            case 9:
                Bitmap bitmap = (Bitmap) this.f3824b;
                String str3 = (String) this.f3825c;
                ((ShortcutInfoCompatSaverImpl) this.d).getClass();
                if (bitmap != null) {
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
                            try {
                                if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                                    fileOutputStream.close();
                                    return;
                                }
                                Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                                throw new RuntimeException("Unable to compress bitmap for saving " + str3);
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (IOException | OutOfMemoryError | RuntimeException e7) {
                            Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e7);
                            throw new RuntimeException(sc.e.h("Unable to write bitmap to file ", str3), e7);
                        }
                    }
                    throw new IllegalArgumentException("path is empty");
                }
                throw new IllegalArgumentException("bitmap is null");
            case 10:
                b();
                return;
            default:
                y8.c0 c0Var = (y8.c0) this.d;
                WearAuthListenerService wearAuthListenerService = ((x8.d) this.f3824b).f53447c;
                ((i0) this.f3825c).getClass();
                try {
                    c0Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c0Var.f318c);
                    int i10 = f8.a.f6962a;
                    obtain.writeInt(0);
                    obtain.writeByteArray(null);
                    c0Var.f317b.transact(1, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e10) {
                    Log.e("WearableLS", "Failed to send a response back", e10);
                    return;
                }
        }
    }

    public w(Object obj, Object obj2, Object obj3, int i10) {
        this.f3823a = i10;
        this.f3824b = obj;
        this.f3825c = obj2;
        this.d = obj3;
    }

    public w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f3823a = i10;
        this.f3824b = obj2;
        this.f3825c = obj3;
        this.d = obj;
    }

    public w(ja jaVar, m5.e eVar, String str) {
        this.f3823a = 10;
        this.f3824b = jaVar;
        this.f3825c = eVar;
        this.d = str;
    }
}
