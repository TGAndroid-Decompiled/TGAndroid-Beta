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
public final class rld implements Runnable {
    public final byte a;
    public Object b;
    public final Object c;

    public rld(Object obj, Parcelable parcelable, Object obj2, byte b) {
        this.a = b;
        this.b = parcelable;
        this.c = obj2;
    }

    @Override
    public final void run() {
        Throwable d;
        Exception exc;
        FileOutputStream s0;
        int i;
        Set set;
        ug5 ug5Var;
        ug5 ug5Var2;
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
                nu7 nu7Var = (nu7) this.c;
                ymd ymdVar = (ymd) this.b;
                if ((ymdVar instanceof akd) && (d = ((akd) ymdVar).d()) != null) {
                    nu7Var.b(d);
                    return;
                }
                try {
                    if (ymdVar.isDone()) {
                        boolean z9 = false;
                        while (true) {
                            try {
                                Object obj = ymdVar.get();
                                if (z9) {
                                    Thread.currentThread().interrupt();
                                }
                                Integer num = (Integer) obj;
                                int intValue = num.intValue();
                                lid lidVar = (lid) nu7Var.d;
                                if (intValue > 0) {
                                    byte b = nu7Var.a;
                                    fi0 a = qjd.a(num.intValue(), "Billing override value was set by a license tester.");
                                    lidVar.E(93, b, a);
                                    ((vs2) nu7Var.b).accept(a);
                                    return;
                                }
                                ((Runnable) nu7Var.c).run();
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
                        throw new IllegalStateException(tze.a("Future was expected to be done: %s", ymdVar));
                    }
                } catch (ExecutionException e) {
                    nu7Var.b(e.getCause());
                    return;
                } catch (Throwable th2) {
                    nu7Var.b(th2);
                    return;
                }
                break;
            case 1:
                ((o9) this.b).a = this.c;
                return;
            case 2:
                Object obj2 = this.c;
                Object obj3 = this.b;
                try {
                    Method method = p9.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        p9.e.invoke(obj3, obj2, Boolean.FALSE);
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
                ((iq) ((u39) this.b).b).h((Typeface) this.c);
                return;
            case 4:
                la2 la2Var = (la2) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    la2Var.B((eb3) obj4);
                }
                arrayList.clear();
                la2Var.v.remove(arrayList);
                return;
            case 5:
                ((na1) this.b).C((kc5) this.c);
                return;
            case 6:
                i26 i26Var = (i26) this.c;
                vw2 vw2Var = i26Var.d;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th4) {
                        c9e.a(z14.a, th4);
                    }
                    Runnable f = i26Var.f();
                    if (f != null) {
                        this.b = f;
                        i2++;
                        if (i2 >= 16 && vw2Var.d(i26Var)) {
                            vw2Var.c(i26Var, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 7:
                nx nxVar = (nx) this.c;
                Object obj5 = this.b;
                boolean z10 = nxVar.c.get();
                v3d v3dVar = nxVar.e;
                if (z10) {
                    if (v3dVar.h == nxVar) {
                        SystemClock.uptimeMillis();
                        v3dVar.h = null;
                        v3dVar.a();
                    }
                } else if (v3dVar.g != nxVar) {
                    if (v3dVar.h == nxVar) {
                        SystemClock.uptimeMillis();
                        v3dVar.h = null;
                        v3dVar.a();
                    }
                } else if (!v3dVar.c) {
                    SystemClock.uptimeMillis();
                    v3dVar.g = null;
                    o86 o86Var = v3dVar.a;
                    if (o86Var != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            o86Var.i(obj5);
                        } else {
                            o86Var.g(obj5);
                        }
                    }
                }
                nxVar.b = 3;
                return;
            case 8:
                ((na1) this.c).C((t44) this.b);
                return;
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                mv6 mv6Var = new mv6(file);
                File file2 = (File) mv6Var.c;
                try {
                    s0 = mv6Var.s0();
                } catch (Exception e3) {
                    exc = e3;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(s0);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj6 = arrayList2.get(i3);
                        i3++;
                        eue.e(newSerializer, (uga) obj6);
                        i2 = i2;
                    }
                    int i4 = i2;
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    s0.flush();
                    try {
                        s0.getFD().sync();
                        i = 1;
                    } catch (IOException unused2) {
                        i = i4;
                    }
                    if (i == 0) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        s0.close();
                    } catch (IOException e4) {
                        Log.e("AtomicFile", "Failed to close file output stream", e4);
                    }
                    mv6.h0(file2, file);
                    return;
                } catch (Exception e5) {
                    exc = e5;
                    fileOutputStream = s0;
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
                    ho9.l("Failed to write to file ", file, exc);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                ps psVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    psVar.putAll(eue.b(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(psVar.values()));
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
                        fyb.j(b00.h("Unable to write bitmap to file ", str), e8);
                        return;
                    }
                }
                w26.j("path is empty");
                return;
            case 12:
                ds2 ds2Var = (ds2) this.b;
                w1d w1dVar = (w1d) this.c;
                hy4 hy4Var = w1dVar.f;
                xx4 xx4Var = w1dVar.a;
                u1d u1dVar = (u1d) hy4Var.s.get(w1dVar.b);
                if (u1dVar != null) {
                    if (ds2Var.c()) {
                        w1dVar.e = true;
                        if (!xx4Var.w()) {
                            try {
                                if (xx4Var.w()) {
                                    set = xx4Var.E;
                                } else {
                                    set = Collections.EMPTY_SET;
                                }
                                xx4Var.j(null, set);
                                return;
                            } catch (SecurityException e9) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e9);
                                xx4Var.d("Failed to get service from broker.");
                                u1dVar.l(new ds2(10, null, null), null);
                                return;
                            }
                        } else if (w1dVar.e && (ug5Var = w1dVar.c) != null) {
                            xx4Var.j(ug5Var, w1dVar.d);
                            return;
                        } else {
                            return;
                        }
                    }
                    u1dVar.l(ds2Var, null);
                    return;
                }
                return;
            case 13:
                i2d i2dVar = (i2d) this.c;
                c3d c3dVar = (c3d) this.b;
                ds2 ds2Var2 = c3dVar.b;
                if (ds2Var2.c()) {
                    l3d l3dVar = c3dVar.c;
                    fre.h(l3dVar);
                    ds2 ds2Var3 = l3dVar.c;
                    if (!ds2Var3.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ds2Var3)), new Exception());
                        i2dVar.k.b(ds2Var3);
                        i2dVar.j.c();
                        return;
                    }
                    w1d w1dVar2 = i2dVar.k;
                    IBinder iBinder = l3dVar.b;
                    if (iBinder == null) {
                        ug5Var2 = 0;
                    } else {
                        int i5 = e5.b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof ug5) {
                            ug5Var2 = (ug5) queryLocalInterface;
                        } else {
                            ug5Var2 = new ezc(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                        }
                    }
                    Set set2 = i2dVar.f;
                    w1dVar2.getClass();
                    if (ug5Var2 != 0 && set2 != null) {
                        w1dVar2.c = ug5Var2;
                        w1dVar2.d = set2;
                        if (w1dVar2.e) {
                            w1dVar2.a.j(ug5Var2, set2);
                        }
                    } else {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        w1dVar2.b(new ds2(4, null, null));
                    }
                } else {
                    i2dVar.k.b(ds2Var2);
                }
                i2dVar.j.c();
                return;
            case 14:
                Future future = (Future) this.b;
                if (!future.isDone() && !future.isCancelled()) {
                    Runnable runnable = (Runnable) this.c;
                    future.cancel(true);
                    xgd.h("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                fi0 fi0Var = qjd.i;
                ((uh0) this.b).x(24, 7, fi0Var);
                sed sedVar = efd.b;
                ((bi0) ((sg0) this.c).b).b(fi0Var, nhd.e);
                return;
            case 16:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        ind indVar = (ind) referenceQueue.remove();
                        if (indVar.a.remove(indVar)) {
                            indVar.clear();
                            indVar.b.getClass();
                        }
                    } catch (InterruptedException unused4) {
                    }
                }
                return;
            case 17:
                afd afdVar = ((ted) this.b).c;
                m5d m5dVar = (m5d) this.c;
                dc6 dc6Var = afd.H;
                wr wrVar = m5dVar.d;
                bad badVar = m5dVar.f;
                wr wrVar2 = afdVar.u;
                uhf uhfVar = afdVar.E;
                if (!id1.d(wrVar, wrVar2)) {
                    afdVar.u = wrVar;
                    uhfVar.c();
                }
                double d2 = m5dVar.a;
                if (!Double.isNaN(d2) && Math.abs(d2 - afdVar.w) > 1.0E-7d) {
                    afdVar.w = d2;
                    z = true;
                } else {
                    z = false;
                }
                boolean z11 = m5dVar.b;
                if (z11 != afdVar.x) {
                    afdVar.x = z11;
                    z = true;
                }
                dc6 dc6Var2 = afd.H;
                dc6Var2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(afdVar.n));
                if (uhfVar != null && (z || afdVar.n)) {
                    uhfVar.f();
                }
                Double.isNaN(m5dVar.h);
                int i6 = m5dVar.c;
                if (i6 != afdVar.y) {
                    afdVar.y = i6;
                    z2 = true;
                } else {
                    z2 = false;
                }
                dc6Var2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(afdVar.n));
                if (uhfVar != null && (z2 || afdVar.n)) {
                    uhfVar.a();
                }
                int i7 = m5dVar.e;
                if (i7 != afdVar.z) {
                    afdVar.z = i7;
                    z3 = true;
                } else {
                    z3 = false;
                }
                dc6Var2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(afdVar.n));
                if (uhfVar != null && (z3 || afdVar.n)) {
                    uhfVar.e();
                }
                if (!id1.d(afdVar.A, badVar)) {
                    afdVar.A = badVar;
                }
                afdVar.n = false;
                return;
            case 18:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (be7 e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new be7("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 19:
                je7 je7Var = (je7) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = je7Var.b.decrementAndGet();
                if (decrementAndGet < 0) {
                    z8 = false;
                }
                fre.k(z8);
                if (decrementAndGet == 0) {
                    je7Var.c();
                    je7Var.c.set(false);
                }
                fcf.a.clear();
                bef.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 20:
                sxd sxdVar = (sxd) this.c;
                ((h5e) this.b).getClass();
                try {
                    sxdVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(sxdVar.c);
                    int i8 = bhd.a;
                    obtain.writeInt(0);
                    obtain.writeByteArray(null);
                    sxdVar.b.transact(1, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e12) {
                    Log.e("WearableLS", "Failed to send a response back", e12);
                    return;
                }
            case 21:
                ygf ygfVar = (ygf) this.b;
                m5d m5dVar2 = (m5d) this.c;
                dc6 dc6Var3 = ygf.X;
                wr wrVar3 = m5dVar2.d;
                bad badVar2 = m5dVar2.f;
                wr wrVar4 = ygfVar.F;
                uhf uhfVar2 = ygfVar.H;
                if (!id1.d(wrVar3, wrVar4)) {
                    ygfVar.F = wrVar3;
                    uhfVar2.c();
                }
                double d3 = m5dVar2.a;
                if (!Double.isNaN(d3) && Math.abs(d3 - ygfVar.P) > 1.0E-7d) {
                    ygfVar.P = d3;
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z12 = m5dVar2.b;
                if (z12 != ygfVar.M) {
                    ygfVar.M = z12;
                    z4 = true;
                }
                Double.isNaN(m5dVar2.h);
                dc6 dc6Var4 = ygf.X;
                dc6Var4.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(ygfVar.O));
                if (uhfVar2 != null && (z4 || ygfVar.O)) {
                    uhfVar2.f();
                }
                int i9 = m5dVar2.c;
                if (i9 != ygfVar.R) {
                    ygfVar.R = i9;
                    z5 = true;
                } else {
                    z5 = false;
                }
                dc6Var4.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z5), Boolean.valueOf(ygfVar.O));
                if (uhfVar2 != null && (z5 || ygfVar.O)) {
                    uhfVar2.a();
                }
                int i10 = m5dVar2.e;
                if (i10 != ygfVar.S) {
                    ygfVar.S = i10;
                    z6 = true;
                } else {
                    z6 = false;
                }
                dc6Var4.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z6), Boolean.valueOf(ygfVar.O));
                if (uhfVar2 != null && (z6 || ygfVar.O)) {
                    uhfVar2.e();
                }
                if (!id1.d(ygfVar.Q, badVar2)) {
                    ygfVar.Q = badVar2;
                }
                ygfVar.O = false;
                return;
            default:
                ygf ygfVar2 = (ygf) this.b;
                dc6 dc6Var5 = ygf.X;
                String str2 = ((a5d) this.c).a;
                if (!id1.d(str2, ygfVar2.L)) {
                    ygfVar2.L = str2;
                    z7 = true;
                } else {
                    z7 = false;
                }
                ygf.X.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z7), Boolean.valueOf(ygfVar2.N));
                uhf uhfVar3 = ygfVar2.H;
                if (uhfVar3 != null && (z7 || ygfVar2.N)) {
                    uhfVar3.d();
                }
                ygfVar2.N = false;
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                vk9 vk9Var = new vk9(rld.class.getSimpleName(), (byte) 22);
                v8b v8bVar = new v8b((byte) 14, false);
                ((v8b) vk9Var.d).c = v8bVar;
                vk9Var.d = v8bVar;
                v8bVar.b = (nu7) this.c;
                return vk9Var.toString();
            default:
                return super.toString();
        }
    }

    public rld(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public rld(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
