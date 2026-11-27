package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.xmlpull.v1.XmlSerializer;
public final class iqd implements Runnable {
    public final byte a;
    public Object b;
    public final Object c;

    public iqd(Object obj, Parcelable parcelable, Object obj2, byte b) {
        this.a = b;
        this.b = parcelable;
        this.c = obj2;
    }

    @Override
    public final void run() {
        Throwable d;
        Exception exc;
        FileOutputStream x0;
        int i;
        Set set;
        wi5 wi5Var;
        wi5 wi5Var2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        FileOutputStream fileOutputStream = null;
        int i2 = 0;
        boolean z8 = true;
        switch (this.a) {
            case 0:
                ux7 ux7Var = (ux7) this.c;
                prd prdVar = (prd) this.b;
                if ((prdVar instanceof rod) && (d = ((rod) prdVar).d()) != null) {
                    ux7Var.b(d);
                    return;
                }
                try {
                    if (prdVar.isDone()) {
                        boolean z9 = false;
                        while (true) {
                            try {
                                Object obj = prdVar.get();
                                if (z9) {
                                    Thread.currentThread().interrupt();
                                }
                                Integer num = (Integer) obj;
                                int intValue = num.intValue();
                                cnd cndVar = (cnd) ux7Var.d;
                                if (intValue > 0) {
                                    byte b = ux7Var.a;
                                    gi0 a = hod.a(num.intValue(), "Billing override value was set by a license tester.");
                                    cndVar.E(93, b, a);
                                    ((pt2) ux7Var.b).accept(a);
                                    return;
                                }
                                ((Runnable) ux7Var.c).run();
                                return;
                            } catch (InterruptedException unused) {
                                z9 = true;
                            } catch (Throwable th) {
                                if (z9) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                    } else {
                        throw new IllegalStateException(m4f.a("Future was expected to be done: %s", prdVar));
                    }
                } catch (ExecutionException e) {
                    ux7Var.b(e.getCause());
                    return;
                } catch (Throwable th2) {
                    ux7Var.b(th2);
                    return;
                }
                break;
            case 1:
                ((p9) this.b).a = this.c;
                return;
            case 2:
                Object obj2 = this.c;
                Object obj3 = this.b;
                try {
                    Method method = q9.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        q9.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 3:
                ((jq) ((ve9) this.b).b).h((Typeface) this.c);
                return;
            case 4:
                bb2 bb2Var = (bb2) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    bb2Var.B((xb3) obj4);
                }
                arrayList.clear();
                bb2Var.v.remove(arrayList);
                return;
            case 5:
                ((va1) this.b).C((le5) this.c);
                return;
            case 6:
                m46 m46Var = (m46) this.c;
                px2 px2Var = m46Var.d;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th4) {
                        sde.a(u24.a, th4);
                    }
                    Runnable f = m46Var.f();
                    if (f != null) {
                        this.b = f;
                        i2++;
                        if (i2 >= 16 && px2Var.d(m46Var)) {
                            px2Var.c(m46Var, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 7:
                ox oxVar = (ox) this.c;
                Object obj5 = this.b;
                boolean z10 = oxVar.c.get();
                m8d m8dVar = oxVar.e;
                if (z10) {
                    if (m8dVar.h == oxVar) {
                        SystemClock.uptimeMillis();
                        m8dVar.h = null;
                        m8dVar.a();
                    }
                } else if (m8dVar.g != oxVar) {
                    if (m8dVar.h == oxVar) {
                        SystemClock.uptimeMillis();
                        m8dVar.h = null;
                        m8dVar.a();
                    }
                } else if (!m8dVar.c) {
                    SystemClock.uptimeMillis();
                    m8dVar.g = null;
                    sa6 sa6Var = m8dVar.a;
                    if (sa6Var != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            sa6Var.i(obj5);
                        } else {
                            sa6Var.g(obj5);
                        }
                    }
                }
                oxVar.b = 3;
                return;
            case 8:
                ((va1) this.c).C((p54) this.b);
                return;
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                rx6 rx6Var = new rx6(file);
                File file2 = (File) rx6Var.c;
                try {
                    x0 = rx6Var.x0();
                } catch (Exception e3) {
                    exc = e3;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(x0);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj6 = arrayList2.get(i3);
                        i3++;
                        wye.e(newSerializer, (nka) obj6);
                        i2 = i2;
                    }
                    int i4 = i2;
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    x0.flush();
                    try {
                        x0.getFD().sync();
                        i = 1;
                    } catch (IOException unused2) {
                        i = i4;
                    }
                    if (i == 0) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        x0.close();
                    } catch (IOException e4) {
                        Log.e("AtomicFile", "Failed to close file output stream", e4);
                    }
                    rx6.m0(file2, file);
                    return;
                } catch (Exception e5) {
                    exc = e5;
                    fileOutputStream = x0;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            Log.e("AtomicFile", "Failed to close file output stream", e6);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    vr9.k("Failed to write to file ", file, exc);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                qs qsVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    qsVar.putAll(wye.b(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(qsVar.values()));
                    return;
                } catch (Exception e7) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e7);
                    return;
                }
            case 11:
                Bitmap bitmap = (Bitmap) this.b;
                String str = (String) this.c;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str));
                        try {
                            if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2)) {
                                fileOutputStream2.close();
                                return;
                            }
                            Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                            throw new RuntimeException("Unable to compress bitmap for saving " + str);
                        } catch (Throwable th5) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (IOException | OutOfMemoryError | RuntimeException e8) {
                        Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e8);
                        grb.j(c00.i("Unable to write bitmap to file ", str), e8);
                        return;
                    }
                }
                lq5.j("path is empty");
                return;
            case 12:
                ws2 ws2Var = (ws2) this.b;
                n6d n6dVar = (n6d) this.c;
                n05 n05Var = n6dVar.f;
                d05 d05Var = n6dVar.a;
                l6d l6dVar = (l6d) n05Var.s.get(n6dVar.b);
                if (l6dVar != null) {
                    if (ws2Var.c()) {
                        n6dVar.e = true;
                        if (!d05Var.w()) {
                            try {
                                if (d05Var.w()) {
                                    set = d05Var.E;
                                } else {
                                    set = Collections.EMPTY_SET;
                                }
                                d05Var.j(null, set);
                                return;
                            } catch (SecurityException e9) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e9);
                                d05Var.d("Failed to get service from broker.");
                                l6dVar.l(new ws2(10, null, null), null);
                                return;
                            }
                        } else if (n6dVar.e && (wi5Var = n6dVar.c) != null) {
                            d05Var.j(wi5Var, n6dVar.d);
                            return;
                        } else {
                            return;
                        }
                    }
                    l6dVar.l(ws2Var, null);
                    return;
                }
                return;
            case 13:
                z6d z6dVar = (z6d) this.c;
                t7d t7dVar = (t7d) this.b;
                ws2 ws2Var2 = t7dVar.b;
                if (ws2Var2.c()) {
                    c8d c8dVar = t7dVar.c;
                    xve.h(c8dVar);
                    ws2 ws2Var3 = c8dVar.c;
                    if (!ws2Var3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ws2Var3)), new Exception());
                        z6dVar.k.b(ws2Var3);
                        z6dVar.j.c();
                        return;
                    }
                    n6d n6dVar2 = z6dVar.k;
                    IBinder iBinder = c8dVar.b;
                    if (iBinder == null) {
                        wi5Var2 = 0;
                    } else {
                        int i5 = f5.b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof wi5) {
                            wi5Var2 = (wi5) queryLocalInterface;
                        } else {
                            wi5Var2 = new v3d(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                        }
                    }
                    Set set2 = z6dVar.f;
                    n6dVar2.getClass();
                    if (wi5Var2 != 0 && set2 != null) {
                        n6dVar2.c = wi5Var2;
                        n6dVar2.d = set2;
                        if (n6dVar2.e) {
                            n6dVar2.a.j(wi5Var2, set2);
                        }
                    } else {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        n6dVar2.b(new ws2(4, null, null));
                    }
                } else {
                    z6dVar.k.b(ws2Var2);
                }
                z6dVar.j.c();
                return;
            case 14:
                Future future = (Future) this.b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.c;
                    future.cancel(true);
                    old.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                gi0 gi0Var = hod.i;
                ((vh0) this.b).x(24, 7, gi0Var);
                jjd jjdVar = vjd.b;
                ((ci0) ((tg0) this.c).b).c(gi0Var, emd.e);
                return;
            case 16:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        zrd zrdVar = (zrd) referenceQueue.remove();
                        if (zrdVar.a.remove(zrdVar)) {
                            zrdVar.clear();
                            zrdVar.b.getClass();
                        }
                    } catch (InterruptedException unused4) {
                    }
                }
                return;
            case 17:
                rjd rjdVar = ((kjd) this.b).c;
                fad fadVar = (fad) this.c;
                he6 he6Var = rjd.H;
                xr xrVar = fadVar.d;
                ued uedVar = fadVar.f;
                xr xrVar2 = rjdVar.u;
                kmf kmfVar = rjdVar.E;
                if (!qd1.d(xrVar, xrVar2)) {
                    rjdVar.u = xrVar;
                    kmfVar.c();
                }
                double d2 = fadVar.a;
                if (!Double.isNaN(d2) && Math.abs(d2 - rjdVar.w) > 1.0E-7d) {
                    rjdVar.w = d2;
                    z = true;
                } else {
                    z = false;
                }
                boolean z11 = fadVar.b;
                if (z11 != rjdVar.x) {
                    rjdVar.x = z11;
                    z = true;
                }
                he6 he6Var2 = rjd.H;
                he6Var2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(rjdVar.n));
                if (kmfVar != null && (z || rjdVar.n)) {
                    kmfVar.f();
                }
                Double.isNaN(fadVar.h);
                int i6 = fadVar.c;
                if (i6 != rjdVar.y) {
                    rjdVar.y = i6;
                    z2 = true;
                } else {
                    z2 = false;
                }
                he6Var2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(rjdVar.n));
                if (kmfVar != null && (z2 || rjdVar.n)) {
                    kmfVar.a();
                }
                int i7 = fadVar.e;
                if (i7 != rjdVar.z) {
                    rjdVar.z = i7;
                    z3 = true;
                } else {
                    z3 = false;
                }
                he6Var2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(rjdVar.n));
                if (kmfVar != null && (z3 || rjdVar.n)) {
                    kmfVar.e();
                }
                if (!qd1.d(rjdVar.A, uedVar)) {
                    rjdVar.A = uedVar;
                }
                rjdVar.n = false;
                return;
            case 18:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (kg7 e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new kg7("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 19:
                sg7 sg7Var = (sg7) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = sg7Var.b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z8 = false;
                }
                xve.k(z8);
                if (decrementAndGet == 0) {
                    sg7Var.c();
                    sg7Var.c.set(false);
                }
                vgf.a.clear();
                rif.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 20:
                i2e i2eVar = (i2e) this.c;
                ((x9e) this.b).getClass();
                try {
                    i2eVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(i2eVar.c);
                    int i8 = sld.a;
                    obtain.writeInt(0);
                    obtain.writeByteArray(null);
                    i2eVar.b.transact(1, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e12) {
                    Log.e("WearableLS", "Failed to send a response back", e12);
                    return;
                }
            case 21:
                olf olfVar = (olf) this.b;
                fad fadVar2 = (fad) this.c;
                he6 he6Var3 = olf.X;
                xr xrVar3 = fadVar2.d;
                ued uedVar2 = fadVar2.f;
                xr xrVar4 = olfVar.F;
                kmf kmfVar2 = olfVar.H;
                if (!qd1.d(xrVar3, xrVar4)) {
                    olfVar.F = xrVar3;
                    kmfVar2.c();
                }
                double d3 = fadVar2.a;
                if (!Double.isNaN(d3) && Math.abs(d3 - olfVar.P) > 1.0E-7d) {
                    olfVar.P = d3;
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z12 = fadVar2.b;
                if (z12 != olfVar.M) {
                    olfVar.M = z12;
                    z4 = true;
                }
                Double.isNaN(fadVar2.h);
                he6 he6Var4 = olf.X;
                he6Var4.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(olfVar.O));
                if (kmfVar2 != null && (z4 || olfVar.O)) {
                    kmfVar2.f();
                }
                int i9 = fadVar2.c;
                if (i9 != olfVar.R) {
                    olfVar.R = i9;
                    z5 = true;
                } else {
                    z5 = false;
                }
                he6Var4.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(olfVar.O));
                if (kmfVar2 != null && (z5 || olfVar.O)) {
                    kmfVar2.a();
                }
                int i10 = fadVar2.e;
                if (i10 != olfVar.S) {
                    olfVar.S = i10;
                    z6 = true;
                } else {
                    z6 = false;
                }
                he6Var4.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z6), Boolean.valueOf(olfVar.O));
                if (kmfVar2 != null && (z6 || olfVar.O)) {
                    kmfVar2.e();
                }
                if (!qd1.d(olfVar.Q, uedVar2)) {
                    olfVar.Q = uedVar2;
                }
                olfVar.O = false;
                return;
            default:
                olf olfVar2 = (olf) this.b;
                he6 he6Var5 = olf.X;
                String str2 = ((t9d) this.c).a;
                if (!qd1.d(str2, olfVar2.L)) {
                    olfVar2.L = str2;
                    z7 = true;
                } else {
                    z7 = false;
                }
                olf.X.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z7), Boolean.valueOf(olfVar2.N));
                kmf kmfVar3 = olfVar2.H;
                if (kmfVar3 != null && (z7 || olfVar2.N)) {
                    kmfVar3.d();
                }
                olfVar2.N = false;
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                ko9 ko9Var = new ko9(iqd.class.getSimpleName(), (byte) 22);
                k7b k7bVar = new k7b((byte) 15, false);
                ((k7b) ko9Var.d).c = k7bVar;
                ko9Var.d = k7bVar;
                k7bVar.b = (ux7) this.c;
                return ko9Var.toString();
            default:
                return super.toString();
        }
    }

    public iqd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public iqd(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
