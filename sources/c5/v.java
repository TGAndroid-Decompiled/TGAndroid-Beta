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
import org.telegram.ui.Components.rg;
import w7.la;
import y8.k0;
public final class v implements Runnable {
    public final int f4292a;
    public Object f4293b;
    public Object f4294c;
    public Object d;

    public v() {
        this.f4292a = 7;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f4293b).X) {
            fVar = (c6.f) ((g6.v) this.f4293b).X.get((String) this.f4294c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f10366n0.b("Discarded message for unknown namespace '%s'", (String) this.f4294c);
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: c5.v.b():void");
    }

    @Override
    public final void run() {
        c6.f fVar;
        w9.b bVar;
        Bundle bundle = null;
        Object obj = null;
        switch (this.f4292a) {
            case 0:
                h hVar = g0.f4244i;
                ((c) this.f4293b).y(24, 4, hVar);
                ((j) this.f4294c).a(hVar, ((i) this.d).f4258a);
                return;
            case 1:
                d0.I((d0) this.f4293b, (a4.l) this.f4294c, (org.telegram.messenger.e0) this.d);
                return;
            case 2:
                d0.H((d0) this.f4293b, (i) this.d, (j) this.f4294c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f4293b;
                HashMap hashMap = d0Var.f4341b.C;
                String str = (String) this.f4294c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f4341b.C.get(str);
                }
                if (fVar != null) {
                    ((e6.h) fVar).o((String) this.d);
                    return;
                } else {
                    c6.e0.G.b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
            case 4:
                ca.c cVar = (ca.c) this.d;
                cVar.b((w9.b) this.f4293b, (TaskCompletionSource) this.f4294c);
                ((AtomicInteger) cVar.f4576i.f16573c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f4571b, cVar.a()) * (60000.0d / cVar.f4570a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f50446b;
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
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f4293b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f299b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f4294c);
                    }
                    lVar.onCreate(bundle);
                }
                if (aVar.f299b >= 2) {
                    lVar.onStart();
                }
                if (aVar.f299b >= 3) {
                    lVar.onResume();
                }
                if (aVar.f299b >= 4) {
                    lVar.onStop();
                }
                if (aVar.f299b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                try {
                    obj = ((o0.e) this.f4293b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new i9.s(21, (z) this.f4294c, obj));
                return;
            case 8:
                ((rg) this.d).n((File) this.f4294c, (ArrayList) this.f4293b);
                return;
            case 9:
                u4.e eVar = (u4.e) this.d;
                eVar.d.f3176c.remove((String) this.f4293b);
                c0.l lVar2 = (c0.l) this.f4294c;
                if (!(lVar2.f3971a instanceof c0.a)) {
                    try {
                        lVar2.get();
                        return;
                    } catch (Exception e7) {
                        eVar.f49073c.l(e7);
                        return;
                    }
                }
                return;
            case 10:
                Bitmap bitmap = (Bitmap) this.f4293b;
                String str3 = (String) this.f4294c;
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
                        } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                            Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e10);
                            throw new RuntimeException(sc.v.i("Unable to write bitmap to file ", str3), e10);
                        }
                    }
                    throw new IllegalArgumentException("path is empty");
                }
                throw new IllegalArgumentException("bitmap is null");
            case 11:
                b();
                return;
            default:
                k0 k0Var = (k0) this.f4294c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f4293b).f51290c.onRequest(k0Var.d, k0Var.f52015b, k0Var.f52016c);
                if (onRequest == null) {
                    x8.m.L0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new n4.l(e0Var));
                    return;
                }
        }
    }

    public v(d0 d0Var, i iVar, j jVar) {
        this.f4292a = 2;
        this.f4293b = d0Var;
        this.d = iVar;
        this.f4294c = jVar;
    }

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f4292a = i10;
        this.f4293b = obj;
        this.f4294c = obj2;
        this.d = obj3;
    }

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4292a = i10;
        this.d = obj;
        this.f4293b = obj2;
        this.f4294c = obj3;
    }

    public v(la laVar, n6.k kVar, String str) {
        this.f4292a = 11;
        this.f4293b = laVar;
        this.f4294c = kVar;
        this.d = str;
    }
}
