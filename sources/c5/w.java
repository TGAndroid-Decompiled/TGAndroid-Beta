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
import org.telegram.ui.Components.ng;
import si.o0;
import w7.la;
import y8.k0;
public final class w implements Runnable {
    public final int f4794a;
    public Object f4795b;
    public Object f4796c;
    public Object d;

    public w() {
        this.f4794a = 7;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.f4795b).X) {
            fVar = (c6.f) ((g6.v) this.f4795b).X.get((String) this.f4796c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.f10902n0.b("Discarded message for unknown namespace '%s'", (String) this.f4796c);
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
        switch (this.f4794a) {
            case 0:
                i iVar = h0.f4749i;
                ((c) this.f4795b).y(24, 4, iVar);
                ((k) this.f4796c).a(iVar, ((j) this.d).f4763a);
                return;
            case 1:
                e0.I((e0) this.f4795b, (a6.i) this.f4796c, (org.telegram.messenger.d0) this.d);
                return;
            case 2:
                e0.H((e0) this.f4795b, (j) this.d, (k) this.f4796c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.f4795b;
                HashMap hashMap = d0Var.f4837b.C;
                String str = (String) this.f4796c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.f4837b.C.get(str);
                }
                if (fVar != null) {
                    ((e6.h) fVar).o((String) this.d);
                    return;
                } else {
                    c6.e0.G.b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
            case 4:
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.f4795b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.f281b > 0) {
                    Bundle bundle2 = (Bundle) aVar.d;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f4796c);
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
                cVar.b((x9.b) this.f4795b, (TaskCompletionSource) this.f4796c);
                ((AtomicInteger) cVar.f7929i.f17103c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f7925b, cVar.a()) * (60000.0d / cVar.f7924a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f50117b;
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
                    obj = ((o0.e) this.f4795b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new j9.u(21, (a0) this.f4796c, obj));
                return;
            case 8:
                ((ng) this.d).n((File) this.f4796c, (ArrayList) this.f4795b);
                return;
            case 9:
                u4.e eVar = (u4.e) this.d;
                eVar.d.f3647c.remove((String) this.f4795b);
                c0.m mVar = (c0.m) this.f4796c;
                if (!(mVar.f4470a instanceof c0.a)) {
                    try {
                        mVar.get();
                        return;
                    } catch (Exception e) {
                        eVar.f48039c.l(e);
                        return;
                    }
                }
                return;
            case 10:
                Bitmap bitmap = (Bitmap) this.f4795b;
                String str3 = (String) this.f4796c;
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
                            throw new RuntimeException(o0.h("Unable to write bitmap to file ", str3), e7);
                        }
                    }
                    throw new IllegalArgumentException("path is empty");
                }
                throw new IllegalArgumentException("bitmap is null");
            case 11:
                b();
                return;
            default:
                k0 k0Var = (k0) this.f4796c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = ((x8.m) this.f4795b).f50103c.onRequest(k0Var.d, k0Var.f50462b, k0Var.f50463c);
                if (onRequest == null) {
                    x8.m.L0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new l2.f(e0Var, 25));
                    return;
                }
        }
    }

    public w(e0 e0Var, j jVar, k kVar) {
        this.f4794a = 2;
        this.f4795b = e0Var;
        this.d = jVar;
        this.f4796c = kVar;
    }

    public w(Object obj, Object obj2, Object obj3, int i10) {
        this.f4794a = i10;
        this.f4795b = obj;
        this.f4796c = obj2;
        this.d = obj3;
    }

    public w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f4794a = i10;
        this.f4795b = obj2;
        this.f4796c = obj3;
        this.d = obj;
    }

    public w(la laVar, n2.e eVar, String str) {
        this.f4794a = 11;
        this.f4795b = laVar;
        this.f4796c = eVar;
        this.d = str;
    }
}
