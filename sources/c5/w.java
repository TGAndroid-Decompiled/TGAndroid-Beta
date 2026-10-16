package c5;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.Components.og;
import w7.la;
import y8.k0;
public final class w implements Runnable {
    public final int f4421a;
    public Object f4422b;
    public Object f4423c;
    public Object d;

    public w() {
        this.f4421a = 7;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f4422b).X) {
            fVar = (c6.f) ((g6.v) this.f4422b).X.get((String) this.f4423c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f9978n0.b("Discarded message for unknown namespace '%s'", (String) this.f4423c);
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
        switch (this.f4421a) {
            case 0:
                i iVar = h0.f4376i;
                ((c) this.f4422b).y(24, 4, iVar);
                ((k) this.f4423c).a(iVar, ((j) this.d).f4390a);
                return;
            case 1:
                e0.I((e0) this.f4422b, (a6.m) this.f4423c, (org.telegram.messenger.d0) this.d);
                return;
            case 2:
                e0.H((e0) this.f4422b, (j) this.d, (k) this.f4423c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f4422b;
                HashMap hashMap = d0Var.f4464b.C;
                String str = (String) this.f4423c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f4464b.C.get(str);
                }
                if (fVar != null) {
                    ((e6.h) fVar).o((String) this.d);
                    return;
                } else {
                    c6.e0.G.b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
            case 4:
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f4422b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f281b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f4423c);
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
            case 5:
                da.c cVar = (da.c) this.d;
                cVar.b((x9.b) this.f4422b, (TaskCompletionSource) this.f4423c);
                ((AtomicInteger) cVar.f6464i.f15704c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f6460b, cVar.a()) * (60000.0d / cVar.f6459a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f48278b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 6:
                a();
                return;
            case 7:
                try {
                    obj = ((o0.e) this.f4422b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new j9.u(21, (a0) this.f4423c, obj));
                return;
            case 8:
                ((og) this.d).n((File) this.f4423c, (ArrayList) this.f4422b);
                return;
            case 9:
                u4.e eVar = (u4.e) this.d;
                eVar.d.f2030c.remove((String) this.f4422b);
                c0.m mVar = (c0.m) this.f4423c;
                if (!(mVar.f4099a instanceof c0.a)) {
                    try {
                        mVar.get();
                        return;
                    } catch (Exception e) {
                        eVar.f46201c.l(e);
                        return;
                    }
                }
                return;
            case 10:
                Bitmap bitmap = (Bitmap) this.f4422b;
                String str3 = (String) this.f4423c;
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
                            throw new RuntimeException(t8.b.h("Unable to write bitmap to file ", str3), e7);
                        }
                    }
                    throw new IllegalArgumentException("path is empty");
                }
                throw new IllegalArgumentException("bitmap is null");
            case 11:
                b();
                return;
            default:
                k0 k0Var = (k0) this.f4423c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f4422b).f48264c.onRequest(k0Var.d, k0Var.f48629b, k0Var.f48630c);
                if (onRequest == null) {
                    x8.m.L0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new m.l(e0Var));
                    return;
                }
        }
    }

    public w(e0 e0Var, j jVar, k kVar) {
        this.f4421a = 2;
        this.f4422b = e0Var;
        this.d = jVar;
        this.f4423c = kVar;
    }

    public w(Object obj, Object obj2, Object obj3, int i10) {
        this.f4421a = i10;
        this.f4422b = obj;
        this.f4423c = obj2;
        this.d = obj3;
    }

    public w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4421a = i10;
        this.f4422b = obj2;
        this.f4423c = obj3;
        this.d = obj;
    }

    public w(la laVar, n3.b bVar, String str) {
        this.f4421a = 11;
        this.f4422b = laVar;
        this.f4423c = bVar;
        this.d = str;
    }
}
