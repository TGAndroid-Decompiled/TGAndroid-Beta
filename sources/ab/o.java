package ab;

import ag.o1;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Xml;
import androidx.biometric.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.e0;
import f2.n1;
import f2.u0;
import f5.b0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import jd.y0;
import k8.d1;
import k8.m0;
import k8.x0;
import l3.g0;
import o5.d0;
import o5.x;
import org.xmlpull.v1.XmlSerializer;
public final class o implements Runnable {
    public final int f328a;
    public Object f329b;
    public final Object f330c;

    public o(int i10, Object obj, Object obj2) {
        this.f328a = i10;
        this.f329b = obj;
        this.f330c = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: ab.o.a():void");
    }

    @Override
    public final void run() {
        FileOutputStream fileOutputStream;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        int i10 = 0;
        switch (this.f328a) {
            case 0:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f329b;
                while (!((Set) this.f330c).isEmpty()) {
                    try {
                        p pVar = (p) referenceQueue.remove();
                        if (pVar.f331a.remove(pVar)) {
                            pVar.clear();
                            pVar.f332b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 1:
                Callable callable = (Callable) this.f329b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f330c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (wa.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new wa.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 2:
                j jVar = (j) this.f329b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f330c;
                int decrementAndGet = jVar.f316b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z15 = false;
                }
                z5.l.k(z15);
                if (decrementAndGet == 0) {
                    jVar.c();
                    jVar.f317c.set(false);
                }
                f7.n.f6672a.clear();
                f7.u.f6681a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 3:
                m mVar = (m) this.f329b;
                if (((Thread) ((AtomicReference) mVar.d).getAndSet(Thread.currentThread())) != null) {
                    z15 = false;
                }
                z5.l.k(z15);
                try {
                    ((Runnable) this.f330c).run();
                    ((AtomicReference) mVar.d).set(null);
                    mVar.v();
                    return;
                } catch (Throwable th2) {
                    try {
                        ((AtomicReference) mVar.d).set(null);
                        mVar.v();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 4:
                z zVar = ((androidx.biometric.q) this.f330c).f1052h0;
                if (zVar.f1062e == null) {
                    zVar.f1062e = new Object();
                }
                zVar.f1062e.c((androidx.biometric.u) this.f329b);
                return;
            case 5:
                try {
                    a();
                    return;
                } catch (Error e12) {
                    synchronized (((b9.l) this.f330c).f2019b) {
                        ((b9.l) this.f330c).f2020c = 1;
                        throw e12;
                    }
                }
            case 6:
                ((com.google.android.gms.internal.cast.q) this.f329b).L0((c2.w) this.f330c);
                return;
            case 7:
                ((e0.f) this.f329b).f5658a = this.f330c;
                return;
            case 8:
                ((Application) this.f329b).unregisterActivityLifecycleCallbacks((e0.f) this.f330c);
                return;
            case 9:
                Object obj = this.f330c;
                Object obj2 = this.f329b;
                try {
                    Method method = e0.g.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.g.f5666e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e13) {
                    if (e13.getClass() == RuntimeException.class && e13.getMessage() != null && e13.getMessage().startsWith("Unable to stop")) {
                        throw e13;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 10:
                f2.z zVar2 = (f2.z) this.f329b;
                n1 n1Var = zVar2.f6516e;
                e0 e0Var = (e0) this.f330c;
                RecyclerView recyclerView = e0Var.D;
                if (recyclerView != null && recyclerView.C && !zVar2.v && n1Var.b() != -1) {
                    u0 itemAnimator = e0Var.D.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList = e0Var.B;
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            if (((f2.z) arrayList.get(i11)).f6521w) {
                            }
                        }
                        e0Var.f6308x.q(n1Var);
                        return;
                    }
                    e0Var.D.post(this);
                    return;
                }
                return;
            case 11:
                g9.r.a((g9.r) this.f330c, (e3.f) this.f329b);
                return;
            case 12:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f330c;
                ArrayList arrayList2 = (ArrayList) this.f329b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f1869f;
                g0 g0Var = new g0(file);
                File file2 = (File) g0Var.f14097c;
                try {
                    fileOutputStream = g0Var.D();
                } catch (Exception e14) {
                    e = e14;
                    fileOutputStream = null;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj3 = arrayList2.get(i10);
                        i10++;
                        h2.d.h(newSerializer, (h2.f) obj3);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    fileOutputStream.flush();
                    try {
                        fileOutputStream.getFD().sync();
                        z10 = true;
                    } catch (IOException unused2) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e15) {
                        Log.e("AtomicFile", "Failed to close file output stream", e15);
                    }
                    g0.C(file2, file);
                    return;
                } catch (Exception e16) {
                    e = e16;
                    Exception exc = e;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e17) {
                            Log.e("AtomicFile", "Failed to close file output stream", e17);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 13:
                c0.l lVar = (c0.l) this.f330c;
                try {
                    ((c0.l) this.f329b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e18) {
                    lVar.l(e18);
                    return;
                }
            case 14:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f330c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f1866b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f329b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f1870g);
                    fVar.putAll(h2.d.c(shortcutInfoCompatSaverImpl2.f1869f, shortcutInfoCompatSaverImpl2.f1865a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e19) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e19);
                    return;
                }
            case 15:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f330c;
                shortcutInfoCompatSaverImpl3.f1866b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f1867c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((t8.a) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.f329b);
                return;
            case 16:
                if (!(((c0.l) this.f329b).f2738a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f330c).run();
                        ((c0.l) this.f329b).k(null);
                        return;
                    } catch (Exception e20) {
                        ((c0.l) this.f329b).l(e20);
                        return;
                    }
                }
                return;
            case 17:
                DataHolder dataHolder = (DataHolder) this.f329b;
                j8.e eVar = new j8.e(dataHolder);
                try {
                    ((j8.m) this.f330c).f11285c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    DataHolder dataHolder2 = eVar.f11278a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th5;
                }
            case 18:
                ((j8.m) this.f330c).f11285c.onMessageReceived((m0) this.f329b);
                return;
            case 19:
                ((j8.m) this.f330c).f11285c.onConnectedNodes((List) this.f329b);
                return;
            case 20:
                ((j8.m) this.f330c).f11285c.onCapabilityChanged((k8.b) this.f329b);
                return;
            case 21:
                ((j8.m) this.f330c).f11285c.onNotificationReceived((d1) this.f329b);
                return;
            case 22:
                ((j8.m) this.f330c).f11285c.onEntityUpdate((x0) this.f329b);
                return;
            case 23:
                k8.e eVar2 = (k8.e) this.f329b;
                j8.m mVar2 = (j8.m) this.f330c;
                eVar2.b(mVar2.f11285c);
                eVar2.b(j8.k.zzd(mVar2.f11285c));
                return;
            case 24:
                ((jd.m) this.f330c).D((y0) this.f329b);
                return;
            case 25:
                ((jd.m) this.f329b).D((kd.d) this.f330c);
                return;
            case 26:
                Typeface typeface = (Typeface) this.f330c;
                b0 b0Var = (b0) ((o1) this.f329b).f624b;
                if (b0Var != null) {
                    b0Var.d(typeface);
                    return;
                }
                return;
            case 27:
                ((o0.f) this.f329b).accept(this.f330c);
                return;
            case 28:
                o5.e0 e0Var2 = ((d0) this.f329b).f19248b;
                s5.d dVar = (s5.d) this.f330c;
                s5.b bVar = o5.e0.G;
                o5.d dVar2 = dVar.d;
                x xVar = dVar.f47588f;
                o5.d dVar3 = e0Var2.f19261t;
                p5.d0 d0Var = e0Var2.D;
                if (!s5.a.d(dVar2, dVar3)) {
                    e0Var2.f19261t = dVar2;
                    d0Var.c();
                }
                double d = dVar.f47584a;
                if (!Double.isNaN(d) && Math.abs(d - e0Var2.v) > 1.0E-7d) {
                    e0Var2.v = d;
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z16 = dVar.f47585b;
                if (z16 != e0Var2.f19263w) {
                    e0Var2.f19263w = z16;
                    z11 = true;
                }
                s5.b bVar2 = o5.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var2.f19254m));
                if (d0Var != null && (z11 || e0Var2.f19254m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.f47586c;
                if (i12 != e0Var2.f19264x) {
                    e0Var2.f19264x = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var2.f19254m));
                if (d0Var != null && (z12 || e0Var2.f19254m)) {
                    d0Var.a();
                }
                int i13 = dVar.f47587e;
                if (i13 != e0Var2.f19265y) {
                    e0Var2.f19265y = i13;
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.f19254m));
                if (d0Var != null && (z13 || e0Var2.f19254m)) {
                    d0Var.e();
                }
                if (!s5.a.d(e0Var2.f19266z, xVar)) {
                    e0Var2.f19266z = xVar;
                }
                e0Var2.f19254m = false;
                return;
            default:
                o5.e0 e0Var3 = ((d0) this.f329b).f19248b;
                s5.b bVar3 = o5.e0.G;
                String str = ((s5.c) this.f330c).f47583a;
                if (!s5.a.d(str, e0Var3.f19262u)) {
                    e0Var3.f19262u = str;
                    z14 = true;
                } else {
                    z14 = false;
                }
                o5.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(e0Var3.f19255n));
                p5.d0 d0Var2 = e0Var3.D;
                if (d0Var2 != null && (z14 || e0Var3.f19255n)) {
                    d0Var2.d();
                }
                e0Var3.f19255n = false;
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f328a) {
            case 5:
                Runnable runnable = (Runnable) this.f329b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((b9.l) this.f330c).f2020c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public o(Object obj, Object obj2, boolean z10, int i10) {
        this.f328a = i10;
        this.f330c = obj;
        this.f329b = obj2;
    }

    public o(b9.l lVar) {
        this.f328a = 5;
        this.f330c = lVar;
    }

    public o(e0 e0Var, f2.z zVar, int i10) {
        this.f328a = 10;
        this.f330c = e0Var;
        this.f329b = zVar;
    }
}
