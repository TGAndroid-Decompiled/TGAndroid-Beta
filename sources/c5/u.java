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
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.mg;
import v7.j0;
import w7.la;
import y8.k0;
public final class u implements Runnable {
    public final int f3928a;
    public Object f3929b;
    public Object f3930c;
    public Object d;

    public u() {
        this.f3928a = 8;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f3929b).X) {
            fVar = (c6.f) ((g6.v) this.f3929b).X.get((String) this.f3930c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f9471n0.b("Discarded message for unknown namespace '%s'", (String) this.f3930c);
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: c5.u.b():void");
    }

    @Override
    public final void run() {
        c6.f fVar;
        w9.b bVar;
        Bundle bundle = null;
        Object obj = null;
        switch (this.f3928a) {
            case 0:
                h hVar = f0.f3880i;
                ((c) this.f3929b).y(24, 4, hVar);
                ((j) this.f3930c).a(hVar, ((i) this.d).f3901a);
                return;
            case 1:
                c0.I((c0) this.f3929b, (android.support.v4.media.c) this.f3930c, (org.telegram.messenger.c0) this.d);
                return;
            case 2:
                c0.H((c0) this.f3929b, (i) this.d, (j) this.f3930c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f3929b;
                HashMap hashMap = d0Var.f3975b.C;
                String str = (String) this.f3930c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f3975b.C.get(str);
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
                cVar.b((w9.b) this.f3929b, (TaskCompletionSource) this.f3930c);
                ((AtomicInteger) cVar.f4192i.f14969c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f4188b, cVar.a()) * (60000.0d / cVar.f4187a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f45230b;
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
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f3929b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f276b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f3930c);
                    }
                    lVar.onCreate(bundle);
                }
                if (aVar.f276b >= 2) {
                    lVar.onStart();
                }
                if (aVar.f276b >= 3) {
                    lVar.onResume();
                }
                if (aVar.f276b >= 4) {
                    lVar.onStop();
                }
                if (aVar.f276b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 6:
                g.f.b(((g.f) this.d).e, (View) this.f3929b, (View) this.f3930c);
                return;
            case 7:
                a();
                return;
            case 8:
                try {
                    obj = ((o0.f) this.f3929b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new i9.s(20, (y) this.f3930c, obj));
                return;
            case 9:
                ((mg) this.d).n((File) this.f3930c, (ArrayList) this.f3929b);
                return;
            case 10:
                u4.f fVar2 = (u4.f) this.d;
                fVar2.d.f2876c.remove((String) this.f3929b);
                c0.l lVar2 = (c0.l) this.f3930c;
                if (!(lVar2.f3635a instanceof c0.a)) {
                    try {
                        lVar2.get();
                        return;
                    } catch (Exception e) {
                        fVar2.f43940c.l(e);
                        return;
                    }
                }
                return;
            case 11:
                Bitmap bitmap = (Bitmap) this.f3929b;
                String str3 = (String) this.f3930c;
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
                            throw new RuntimeException(j0.g("Unable to write bitmap to file ", str3), e7);
                        }
                    }
                    throw new IllegalArgumentException("path is empty");
                }
                throw new IllegalArgumentException("bitmap is null");
            case 12:
                b();
                return;
            default:
                k0 k0Var = (k0) this.f3930c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f3929b).f46014c.onRequest(k0Var.d, k0Var.f46705b, k0Var.f46706c);
                if (onRequest == null) {
                    x8.m.M0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new ki.e0(e0Var, 24));
                    return;
                }
        }
    }

    public u(c0 c0Var, i iVar, j jVar) {
        this.f3928a = 2;
        this.f3929b = c0Var;
        this.d = iVar;
        this.f3930c = jVar;
    }

    public u(Object obj, Object obj2, Object obj3, int i10) {
        this.f3928a = i10;
        this.f3929b = obj;
        this.f3930c = obj2;
        this.d = obj3;
    }

    public u(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f3928a = i10;
        this.d = obj;
        this.f3929b = obj2;
        this.f3930c = obj3;
    }

    public u(la laVar, f3 f3Var, String str) {
        this.f3928a = 12;
        this.f3929b = laVar;
        this.f3930c = f3Var;
        this.d = str;
    }
}
