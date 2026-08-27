package a9;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Xml;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c2.u;
import com.google.android.gms.common.data.DataHolder;
import f2.a0;
import f2.f0;
import f2.o1;
import f2.v0;
import id.z0;
import j8.c1;
import j8.l0;
import j8.w0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import m5.e0;
import org.xmlpull.v1.XmlSerializer;

public final class o implements Runnable {

    public final int f187a;

    public Object f188b;

    public final Object f189c;

    public o(int i10, Object obj, Object obj2) {
        this.f187a = i10;
        this.f189c = obj;
        this.f188b = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: a9.o.a():void");
    }

    @Override
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Exception exc;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        FileOutputStream fileOutputStream = null;
        int i10 = 0;
        switch (this.f187a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e9) {
                    synchronized (((q) this.f189c).f192b) {
                        ((q) this.f189c).f193c = 1;
                        throw e9;
                    }
                }
            case 1:
                y yVar = ((androidx.biometric.p) this.f189c).f1062h0;
                if (yVar.f1072e == null) {
                    yVar.f1072e = new v();
                }
                yVar.f1072e.c((t) this.f188b);
                return;
            case 2:
                ((com.google.android.gms.internal.cast.p) this.f188b).L0((u) this.f189c);
                return;
            case 3:
                ((e0.f) this.f188b).f5045a = this.f189c;
                return;
            case 4:
                ((Application) this.f188b).unregisterActivityLifecycleCallbacks((e0.f) this.f189c);
                return;
            case 5:
                Object obj = this.f189c;
                Object obj2 = this.f188b;
                try {
                    Method method = e0.g.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.g.f5053e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 6:
                a0 a0Var = (a0) this.f188b;
                o1 o1Var = a0Var.f5617e;
                f0 f0Var = (f0) this.f189c;
                RecyclerView recyclerView = f0Var.D;
                if (recyclerView == null || !recyclerView.C || a0Var.v || o1Var.b() == -1) {
                    return;
                }
                v0 itemAnimator = f0Var.D.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList = f0Var.B;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (((a0) arrayList.get(i11)).f5622w) {
                        }
                    }
                    f0Var.f5665x.q(o1Var);
                    return;
                }
                f0Var.D.post(this);
                return;
            case 7:
                f9.q.a((f9.q) this.f189c, (c3.g) this.f188b);
                return;
            case 8:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f189c;
                ArrayList arrayList2 = (ArrayList) this.f188b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f1875f;
                j9.a aVar = new j9.a(file);
                File file2 = (File) aVar.f12864c;
                try {
                    FileOutputStream fileOutputStreamK = aVar.K();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStreamK);
                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                        xmlSerializerNewSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        xmlSerializerNewSerializer.startDocument(null, Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "share_targets");
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            h2.d.h(xmlSerializerNewSerializer, (h2.f) obj3);
                        }
                        xmlSerializerNewSerializer.endTag(null, "share_targets");
                        xmlSerializerNewSerializer.endDocument();
                        bufferedOutputStream.flush();
                        fileOutputStreamK.flush();
                        try {
                            fileOutputStreamK.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                            z10 = false;
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStreamK.close();
                            break;
                        } catch (IOException e11) {
                            Log.e("AtomicFile", "Failed to close file output stream", e11);
                        }
                        j9.a.J(file2, file);
                        return;
                    } catch (Exception e12) {
                        exc = e12;
                        fileOutputStream = fileOutputStreamK;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused2) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                Log.e("AtomicFile", "Failed to close file output stream", e13);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                            break;
                        }
                        throw new RuntimeException("Failed to write to file " + file, exc);
                    }
                } catch (Exception e14) {
                    exc = e14;
                }
                break;
            case 9:
                c0.l lVar = (c0.l) this.f189c;
                try {
                    ((c0.l) this.f188b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e15) {
                    lVar.l(e15);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f189c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f1872b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f188b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f1876g);
                    fVar.putAll(h2.d.c(shortcutInfoCompatSaverImpl2.f1875f, shortcutInfoCompatSaverImpl2.f1871a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e16) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e16);
                    return;
                }
            case 11:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f189c;
                shortcutInfoCompatSaverImpl3.f1872b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f1873c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((s8.a) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.f188b);
                return;
            case 12:
                if (((c0.l) this.f189c).f2208a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.f188b).run();
                    ((c0.l) this.f189c).k(null);
                    return;
                } catch (Exception e17) {
                    ((c0.l) this.f189c).l(e17);
                    return;
                }
            case 13:
                DataHolder dataHolder = (DataHolder) this.f188b;
                i8.e eVar = new i8.e(dataHolder);
                try {
                    ((i8.m) this.f189c).f10958c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f10951a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 14:
                ((i8.m) this.f189c).f10958c.onMessageReceived((l0) this.f188b);
                return;
            case 15:
                ((i8.m) this.f189c).f10958c.onConnectedNodes((List) this.f188b);
                return;
            case 16:
                ((i8.m) this.f189c).f10958c.onCapabilityChanged((j8.b) this.f188b);
                return;
            case 17:
                ((i8.m) this.f189c).f10958c.onNotificationReceived((c1) this.f188b);
                return;
            case 18:
                ((i8.m) this.f189c).f10958c.onEntityUpdate((w0) this.f188b);
                return;
            case 19:
                j8.e eVar2 = (j8.e) this.f188b;
                i8.m mVar = (i8.m) this.f189c;
                eVar2.b(mVar.f10958c);
                eVar2.b(mVar.f10958c.zzh);
                return;
            case 20:
                ((id.m) this.f189c).D((z0) this.f188b);
                return;
            case 21:
                ((id.m) this.f188b).D((jd.e) this.f189c);
                return;
            case 22:
                m5.f0 f0Var2 = ((e0) this.f188b).f17769b;
                r5.d dVar = (r5.d) this.f189c;
                r5.b bVar = m5.f0.G;
                m5.d dVar2 = dVar.d;
                m5.y yVar2 = dVar.f46776f;
                m5.d dVar3 = f0Var2.f17779t;
                n5.e0 e0Var = f0Var2.D;
                if (!r5.a.d(dVar2, dVar3)) {
                    f0Var2.f17779t = dVar2;
                    e0Var.c();
                }
                double d = dVar.f46772a;
                if (Double.isNaN(d) || Math.abs(d - f0Var2.v) <= 1.0E-7d) {
                    z11 = false;
                } else {
                    f0Var2.v = d;
                    z11 = true;
                }
                boolean z15 = dVar.f46773b;
                if (z15 != f0Var2.f17781w) {
                    f0Var2.f17781w = z15;
                    z11 = true;
                }
                r5.b bVar2 = m5.f0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(f0Var2.f17772m));
                if (e0Var != null && (z11 || f0Var2.f17772m)) {
                    e0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.f46774c;
                if (i12 != f0Var2.f17782x) {
                    f0Var2.f17782x = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(f0Var2.f17772m));
                if (e0Var != null && (z12 || f0Var2.f17772m)) {
                    e0Var.a();
                }
                int i13 = dVar.f46775e;
                if (i13 != f0Var2.f17783y) {
                    f0Var2.f17783y = i13;
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(f0Var2.f17772m));
                if (e0Var != null && (z13 || f0Var2.f17772m)) {
                    e0Var.e();
                }
                if (!r5.a.d(f0Var2.f17784z, yVar2)) {
                    f0Var2.f17784z = yVar2;
                }
                f0Var2.f17772m = false;
                return;
            case 23:
                m5.f0 f0Var3 = ((e0) this.f188b).f17769b;
                r5.c cVar = (r5.c) this.f189c;
                r5.b bVar3 = m5.f0.G;
                String str = cVar.f46771a;
                if (r5.a.d(str, f0Var3.f17780u)) {
                    z14 = false;
                } else {
                    f0Var3.f17780u = str;
                    z14 = true;
                }
                m5.f0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(f0Var3.f17773n));
                n5.e0 e0Var2 = f0Var3.D;
                if (e0Var2 != null && (z14 || f0Var3.f17773n)) {
                    e0Var2.d();
                }
                f0Var3.f17773n = false;
                return;
            case 24:
                n2.b bVar4 = (n2.b) this.f188b;
                n2.g gVar = (n2.g) this.f189c;
                if (((n2.n) bVar4.f18110f.f18144c) != null) {
                    ((n2.n) bVar4.f18110f.f18144c).onPurchasesUpdated(gVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 25:
                Future future = (Future) this.f189c;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f188b;
                future.cancel(true);
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                n2.b bVar5 = (n2.b) this.f188b;
                org.telegram.messenger.d dVar4 = (org.telegram.messenger.d) this.f189c;
                n2.g gVar2 = n2.a0.f18098i;
                bVar5.y(24, 7, gVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f4109b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f4136e;
                dVar4.a(gVar2, new n2.p(vVar, vVar));
                return;
            case 27:
                n2.b bVar6 = (n2.b) this.f188b;
                n2.m mVar2 = (n2.m) this.f189c;
                n2.g gVar3 = n2.a0.f18098i;
                bVar6.y(24, 9, gVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f4109b;
                mVar2.c(gVar3, com.google.android.gms.internal.play_billing.v.f4136e);
                return;
            case 28:
                nd.i iVar = (nd.i) this.f189c;
                id.a0 a0Var2 = iVar.f18490c;
                while (true) {
                    try {
                        ((Runnable) this.f188b).run();
                    } catch (Throwable th3) {
                        id.f0.m(th3, rc.i.f46899a);
                    }
                    Runnable runnableF = iVar.f();
                    if (runnableF == null) {
                        return;
                    }
                    this.f188b = runnableF;
                    i10++;
                    if (i10 >= 16 && a0Var2.e()) {
                        a0Var2.c(iVar, this);
                        return;
                    }
                    break;
                }
                break;
            default:
                i iVar2 = (i) this.f188b;
                Typeface typeface = (Typeface) this.f189c;
                d5.e0 e0Var3 = (d5.e0) iVar2.f181b;
                if (e0Var3 != null) {
                    e0Var3.d(typeface);
                    return;
                }
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f187a) {
            case 0:
                Runnable runnable = (Runnable) this.f188b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((q) this.f189c).f193c;
                if (i10 == 1) {
                    str = "IDLE";
                } else if (i10 == 2) {
                    str = "QUEUING";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public o(Object obj, Object obj2, boolean z10, int i10) {
        this.f187a = i10;
        this.f188b = obj;
        this.f189c = obj2;
    }

    public o(q qVar) {
        this.f187a = 0;
        this.f189c = qVar;
    }

    public o(f0 f0Var, a0 a0Var, int i10) {
        this.f187a = 6;
        this.f189c = f0Var;
        this.f188b = a0Var;
    }
}
