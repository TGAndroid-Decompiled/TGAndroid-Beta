package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Location;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public class sae implements s99, y2c, mi0, l12, bl0, qhc, dc4, d23, j30, pj2 {
    public static sae E;
    public static final sae a = new Object();
    public static final sae b = new Object();
    public static final sae c = new Object();
    public static final sae d = new Object();
    public static final sae e = new Object();
    public static final sae f = new Object();
    public static final sae h = new Object();
    public static final sae n = new Object();
    public static final sae r = new Object();
    public static final sae s = new Object();
    public static final sae w = new Object();
    public static final sae x = new Object();
    public static final sae y = new Object();

    @Override
    public final float B0() {
        return -1.0f;
    }

    @Override
    public final float D0() {
        return -1.0f;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final int Q1() {
        return 0;
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        a94[] a94VarArr;
        hsd hsdVar = (hsd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        oz5 oz5Var = new oz5(Long.MAX_VALUE, 0, false, null, null);
        ore oreVar = hsdVar.B;
        a94 a94Var = null;
        if (oreVar == null) {
            a94VarArr = null;
        } else {
            a94VarArr = oreVar.b;
        }
        if (a94VarArr != null) {
            int length = a94VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                a94 a94Var2 = a94VarArr[i];
                if ("get_last_location_with_request".equals(a94Var2.a)) {
                    a94Var = a94Var2;
                    break;
                }
                i++;
            }
            if (a94Var != null && a94Var.b() >= 1) {
                q7f q7fVar = (q7f) hsdVar.k();
                yod yodVar = new yod(taskCompletionSource, (byte) 0);
                Parcel R = q7fVar.R();
                int i2 = ild.a;
                R.writeInt(1);
                oz5Var.writeToParcel(R, 0);
                ild.c(R, yodVar);
                q7fVar.V(R, 82);
                return;
            }
        }
        q7f q7fVar2 = (q7f) hsdVar.k();
        Parcel R2 = q7fVar2.R();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                q7fVar2.b.transact(7, R2, obtain, 0);
                obtain.readException();
                R2.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) ild.a(obtain, Location.CREATOR));
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } catch (Throwable th) {
            R2.recycle();
            throw th;
        }
    }

    @Override
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override
    public final String b() {
        return null;
    }

    public final boolean d(int i) {
        if (4 > i && !Log.isLoggable("FirebaseCrashlytics", i)) {
            return false;
        }
        return true;
    }

    @Override
    public final long e() {
        return System.currentTimeMillis();
    }

    public final void f(String str) {
        if (d(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override
    public final nhc g(Class cls, e23 e23Var) {
        e23Var.getClass();
        return new nq4(true);
    }

    public final java.lang.Object h(java.io.FileOutputStream r10, defpackage.zw2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sae.h(java.io.FileOutputStream, zw2):java.lang.Object");
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public final nhc j(ki2 ki2Var, e23 e23Var) {
        return xnb.a(this, ki2Var, e23Var);
    }

    public final void k(String str) {
        if (d(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public final void l(String str, Exception exc) {
        if (d(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final float m1() {
        return 0.0f;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final int o1() {
        return 0;
    }

    @Override
    public final void p0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i3 = 0; i3 < min; i3++) {
            short s2 = shortBuffer.get();
            shortBuffer2.put(s2);
            shortBuffer2.put(s2);
        }
    }

    @Override
    public final int s1(int i, int i2, int i3) {
        return i << 1;
    }

    @Override
    public final int x0() {
        return 0;
    }

    @Override
    public final int x1() {
        return 0;
    }

    @Override
    public final void R() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final long c(long j) {
        return j;
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
