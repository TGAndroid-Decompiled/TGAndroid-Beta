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
import m.f3;
import org.telegram.ui.Components.pg;
import w7.la;
import y8.k0;
public final class v implements Runnable {
    public final int f4294a;
    public Object f4295b;
    public Object f4296c;
    public Object d;

    public v() {
        this.f4294a = 7;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f4295b).X) {
            fVar = (c6.f) ((g6.v) this.f4295b).X.get((String) this.f4296c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f10368n0.b("Discarded message for unknown namespace '%s'", (String) this.f4296c);
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
        switch (this.f4294a) {
            case 0:
                h hVar = g0.f4246i;
                ((c) this.f4295b).y(24, 4, hVar);
                ((j) this.f4296c).a(hVar, ((i) this.d).f4260a);
                return;
            case 1:
                d0.I((d0) this.f4295b, (a4.l) this.f4296c, (org.telegram.messenger.d0) this.d);
                return;
            case 2:
                d0.H((d0) this.f4295b, (i) this.d, (j) this.f4296c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f4295b;
                HashMap hashMap = d0Var.f4343b.C;
                String str = (String) this.f4296c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f4343b.C.get(str);
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
                cVar.b((w9.b) this.f4295b, (TaskCompletionSource) this.f4296c);
                ((AtomicInteger) cVar.f4578i.f20462c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f4573b, cVar.a()) * (60000.0d / cVar.f4572a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f50217b;
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
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f4295b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f299b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f4296c);
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
                    obj = ((o0.e) this.f4295b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new i9.s(21, (z) this.f4296c, obj));
                return;
            case 8:
                ((pg) this.d).n((File) this.f4296c, (ArrayList) this.f4295b);
                return;
            case 9:
                u4.e eVar = (u4.e) this.d;
                eVar.d.f3178c.remove((String) this.f4295b);
                c0.l lVar2 = (c0.l) this.f4296c;
                if (!(lVar2.f3972a instanceof c0.a)) {
                    try {
                        lVar2.get();
                        return;
                    } catch (Exception e7) {
                        eVar.f48843c.l(e7);
                        return;
                    }
                }
                return;
            case 10:
                Bitmap bitmap = (Bitmap) this.f4295b;
                String str3 = (String) this.f4296c;
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
                k0 k0Var = (k0) this.f4296c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f4295b).f51059c.onRequest(k0Var.d, k0Var.f51789b, k0Var.f51790c);
                if (onRequest == null) {
                    x8.m.L0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new f3(e0Var, 24));
                    return;
                }
        }
    }

    public v(d0 d0Var, i iVar, j jVar) {
        this.f4294a = 2;
        this.f4295b = d0Var;
        this.d = iVar;
        this.f4296c = jVar;
    }

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f4294a = i10;
        this.f4295b = obj;
        this.f4296c = obj2;
        this.d = obj3;
    }

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4294a = i10;
        this.d = obj;
        this.f4295b = obj2;
        this.f4296c = obj3;
    }

    public v(la laVar, n6.t tVar, String str) {
        this.f4294a = 11;
        this.f4295b = laVar;
        this.f4296c = tVar;
        this.d = str;
    }
}
