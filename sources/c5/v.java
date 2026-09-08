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
    public final int f4464a;
    public Object f4465b;
    public Object f4466c;
    public Object d;

    public v() {
        this.f4464a = 8;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f4465b).X) {
            fVar = (c6.f) ((g6.v) this.f4465b).X.get((String) this.f4466c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f10459n0.b("Discarded message for unknown namespace '%s'", (String) this.f4466c);
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
        switch (this.f4464a) {
            case 0:
                h hVar = g0.f4416i;
                ((c) this.f4465b).y(24, 4, hVar);
                ((j) this.f4466c).a(hVar, ((i) this.d).f4430a);
                return;
            case 1:
                d0.I((d0) this.f4465b, (xa.c) this.f4466c, (org.telegram.messenger.c0) this.d);
                return;
            case 2:
                d0.H((d0) this.f4465b, (i) this.d, (j) this.f4466c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f4465b;
                HashMap hashMap = d0Var.f4513b.C;
                String str = (String) this.f4466c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f4513b.C.get(str);
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
                cVar.b((w9.b) this.f4465b, (TaskCompletionSource) this.f4466c);
                ((AtomicInteger) cVar.f4748i.f16731c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f4743b, cVar.a()) * (60000.0d / cVar.f4742a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f48405b;
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
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f4465b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f297b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f4466c);
                    }
                    lVar.onCreate(bundle);
                }
                if (aVar.f297b >= 2) {
                    lVar.onStart();
                }
                if (aVar.f297b >= 3) {
                    lVar.onResume();
                }
                if (aVar.f297b >= 4) {
                    lVar.onStop();
                }
                if (aVar.f297b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 6:
                g.f.b(((g.f) this.d).f10207e, (View) this.f4465b, (View) this.f4466c);
                return;
            case 7:
                a();
                return;
            case 8:
                try {
                    obj = ((o0.f) this.f4465b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new i9.s(20, (z) this.f4466c, obj));
                return;
            case 9:
                ((ng) this.d).n((File) this.f4466c, (ArrayList) this.f4465b);
                return;
            case 10:
                u4.f fVar2 = (u4.f) this.d;
                fVar2.d.f1932c.remove((String) this.f4465b);
                c0.l lVar2 = (c0.l) this.f4466c;
                if (!(lVar2.f4144a instanceof c0.a)) {
                    try {
                        lVar2.get();
                        return;
                    } catch (Exception e7) {
                        fVar2.f46972c.l(e7);
                        return;
                    }
                }
                return;
            case 11:
                Bitmap bitmap = (Bitmap) this.f4465b;
                String str3 = (String) this.f4466c;
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
                k0 k0Var = (k0) this.f4466c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f4465b).f49315c.onRequest(k0Var.d, k0Var.f49642b, k0Var.f49643c);
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
        this.f4464a = 2;
        this.f4465b = d0Var;
        this.d = iVar;
        this.f4466c = jVar;
    }

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f4464a = i10;
        this.f4465b = obj;
        this.f4466c = obj2;
        this.d = obj3;
    }

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4464a = i10;
        this.d = obj;
        this.f4465b = obj2;
        this.f4466c = obj3;
    }

    public v(la laVar, o0.a aVar, String str) {
        this.f4464a = 12;
        this.f4465b = laVar;
        this.f4466c = aVar;
        this.d = str;
    }
}
