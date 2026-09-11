package c5;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
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
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.ng;
import w7.la;
import y8.k0;
public final class v implements Runnable {
    public final int f4437a;
    public Object f4438b;
    public Object f4439c;
    public Object d;

    public v() {
        this.f4437a = 8;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f4438b).X) {
            fVar = (c6.f) ((g6.v) this.f4438b).X.get((String) this.f4439c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f10431n0.b("Discarded message for unknown namespace '%s'", (String) this.f4439c);
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
        switch (this.f4437a) {
            case 0:
                h hVar = g0.f4389i;
                ((c) this.f4438b).y(24, 4, hVar);
                ((j) this.f4439c).a(hVar, ((i) this.d).f4403a);
                return;
            case 1:
                d0.I((d0) this.f4438b, (xa.c) this.f4439c, (org.telegram.messenger.c0) this.d);
                return;
            case 2:
                d0.H((d0) this.f4438b, (i) this.d, (j) this.f4439c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f4438b;
                HashMap hashMap = d0Var.f4486b.C;
                String str = (String) this.f4439c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f4486b.C.get(str);
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
                cVar.b((w9.b) this.f4438b, (TaskCompletionSource) this.f4439c);
                ((AtomicInteger) cVar.f4721i.f16704c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f4716b, cVar.a()) * (60000.0d / cVar.f4715a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f48376b;
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
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f4438b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f285b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f4439c);
                    }
                    lVar.onCreate(bundle);
                }
                if (aVar.f285b >= 2) {
                    lVar.onStart();
                }
                if (aVar.f285b >= 3) {
                    lVar.onResume();
                }
                if (aVar.f285b >= 4) {
                    lVar.onStop();
                }
                if (aVar.f285b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 6:
                g.f.b(((g.f) this.d).f10179e, (View) this.f4438b, (View) this.f4439c);
                return;
            case 7:
                a();
                return;
            case 8:
                try {
                    obj = ((o0.f) this.f4438b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new i9.s(20, (z) this.f4439c, obj));
                return;
            case 9:
                ((ng) this.d).n((File) this.f4439c, (ArrayList) this.f4438b);
                return;
            case 10:
                u4.f fVar2 = (u4.f) this.d;
                fVar2.d.f1905c.remove((String) this.f4438b);
                c0.l lVar2 = (c0.l) this.f4439c;
                if (!(lVar2.f4117a instanceof c0.a)) {
                    try {
                        lVar2.get();
                        return;
                    } catch (Exception e7) {
                        fVar2.f46944c.l(e7);
                        return;
                    }
                }
                return;
            case 11:
                Bitmap bitmap = (Bitmap) this.f4438b;
                String str3 = (String) this.f4439c;
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
                            throw new RuntimeException(p6.i("Unable to write bitmap to file ", str3), e10);
                        }
                    }
                    throw new IllegalArgumentException("path is empty");
                }
                throw new IllegalArgumentException("bitmap is null");
            case 12:
                b();
                return;
            default:
                k0 k0Var = (k0) this.f4439c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f4438b).f49286c.onRequest(k0Var.d, k0Var.f49613b, k0Var.f49614c);
                if (onRequest == null) {
                    x8.m.M0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new k2.g0(e0Var, 25));
                    return;
                }
        }
    }

    public v(d0 d0Var, i iVar, j jVar) {
        this.f4437a = 2;
        this.f4438b = d0Var;
        this.d = iVar;
        this.f4439c = jVar;
    }

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f4437a = i10;
        this.f4438b = obj;
        this.f4439c = obj2;
        this.d = obj3;
    }

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4437a = i10;
        this.d = obj;
        this.f4438b = obj2;
        this.f4439c = obj3;
    }

    public v(la laVar, o0.a aVar, String str) {
        this.f4437a = 12;
        this.f4438b = laVar;
        this.f4439c = aVar;
        this.d = str;
    }
}
