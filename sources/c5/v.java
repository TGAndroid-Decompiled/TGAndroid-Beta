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
import n7.z0;
import org.telegram.ui.Components.ng;
import v7.k0;
import w7.la;
public final class v implements Runnable {
    public final int f3925a;
    public Object f3926b;
    public Object f3927c;
    public Object d;

    public v() {
        this.f3925a = 8;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f3926b).X) {
            fVar = (c6.f) ((g6.v) this.f3926b).X.get((String) this.f3927c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f9458n0.b("Discarded message for unknown namespace '%s'", (String) this.f3927c);
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
        switch (this.f3925a) {
            case 0:
                h hVar = g0.f3880i;
                ((c) this.f3926b).y(24, 4, hVar);
                ((j) this.f3927c).a(hVar, ((i) this.d).f3894a);
                return;
            case 1:
                d0.I((d0) this.f3926b, (a4.m) this.f3927c, (org.telegram.messenger.c0) this.d);
                return;
            case 2:
                d0.H((d0) this.f3926b, (i) this.d, (j) this.f3927c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f3926b;
                HashMap hashMap = d0Var.f3970b.C;
                String str = (String) this.f3927c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f3970b.C.get(str);
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
                cVar.b((w9.b) this.f3926b, (TaskCompletionSource) this.f3927c);
                ((AtomicInteger) cVar.f4187i.f15520c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f4183b, cVar.a()) * (60000.0d / cVar.f4182a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f45238b;
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
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f3926b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f277b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f3927c);
                    }
                    lVar.onCreate(bundle);
                }
                if (aVar.f277b >= 2) {
                    lVar.onStart();
                }
                if (aVar.f277b >= 3) {
                    lVar.onResume();
                }
                if (aVar.f277b >= 4) {
                    lVar.onStop();
                }
                if (aVar.f277b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 6:
                g.f.b(((g.f) this.d).e, (View) this.f3926b, (View) this.f3927c);
                return;
            case 7:
                a();
                return;
            case 8:
                try {
                    obj = ((o0.g) this.f3926b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new i9.s(20, (z) this.f3927c, obj));
                return;
            case 9:
                ((ng) this.d).n((File) this.f3927c, (ArrayList) this.f3926b);
                return;
            case 10:
                u4.f fVar2 = (u4.f) this.d;
                fVar2.d.f2871c.remove((String) this.f3926b);
                c0.l lVar2 = (c0.l) this.f3927c;
                if (!(lVar2.f3630a instanceof c0.a)) {
                    try {
                        lVar2.get();
                        return;
                    } catch (Exception e) {
                        fVar2.f43945c.l(e);
                        return;
                    }
                }
                return;
            case 11:
                Bitmap bitmap = (Bitmap) this.f3926b;
                String str3 = (String) this.f3927c;
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
                            throw new RuntimeException(k0.g("Unable to write bitmap to file ", str3), e7);
                        }
                    }
                    throw new IllegalArgumentException("path is empty");
                }
                throw new IllegalArgumentException("bitmap is null");
            case 12:
                b();
                return;
            default:
                y8.k0 k0Var = (y8.k0) this.f3927c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f3926b).f46019c.onRequest(k0Var.d, k0Var.f46706b, k0Var.f46707c);
                if (onRequest == null) {
                    x8.m.M0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new l.d(e0Var));
                    return;
                }
        }
    }

    public v(d0 d0Var, i iVar, j jVar) {
        this.f3925a = 2;
        this.f3926b = d0Var;
        this.d = iVar;
        this.f3927c = jVar;
    }

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f3925a = i10;
        this.f3926b = obj;
        this.f3927c = obj2;
        this.d = obj3;
    }

    public v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f3925a = i10;
        this.d = obj;
        this.f3926b = obj2;
        this.f3927c = obj3;
    }

    public v(la laVar, z0 z0Var, String str) {
        this.f3925a = 12;
        this.f3926b = laVar;
        this.f3927c = z0Var;
        this.d = str;
    }
}
