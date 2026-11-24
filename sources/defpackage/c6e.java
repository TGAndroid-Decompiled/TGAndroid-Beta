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
public class c6e implements f69, yyb, li0, v02, al0, rdc, ga4, k13, i30 {
    public static c6e E;
    public static final c6e a = new Object();
    public static final c6e b = new Object();
    public static final c6e c = new Object();
    public static final c6e d = new Object();
    public static final c6e e = new Object();
    public static final c6e f = new Object();
    public static final c6e h = new Object();
    public static final c6e n = new Object();
    public static final c6e r = new Object();
    public static final c6e s = new Object();
    public static final c6e w = new Object();
    public static final c6e x = new Object();
    public static final c6e y = new Object();

    public static void j(bwc bwcVar, boolean z) {
        String str;
        zi9 zi9Var;
        svc g = vvc.g(bwcVar);
        StringBuilder sb = new StringBuilder("widget ");
        sb.append(bwcVar.a);
        sb.append(": engine process died");
        if (z) {
            str = ", restarting";
        } else {
            str = "";
        }
        de9.s(str, sb);
        if (z && g != null && (zi9Var = g.w) != null && zi9Var.f0 && zi9Var.Y != null) {
            zi9Var.s0();
            zi9Var.r0();
        }
    }

    @Override
    public final int K() {
        return 0;
    }

    @Override
    public final float U0() {
        return 0.0f;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final int Z0(int i, int i2, int i3) {
        return i << 1;
    }

    @Override
    public final void a0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i3 = 0; i3 < min; i3++) {
            short s2 = shortBuffer.get();
            shortBuffer2.put(s2);
            shortBuffer2.put(s2);
        }
    }

    @Override
    public final int a1() {
        return 0;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        f84[] f84VarArr;
        qnd qndVar = (qnd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        jx5 jx5Var = new jx5(Long.MAX_VALUE, 0, false, null, null);
        xme xmeVar = qndVar.B;
        f84 f84Var = null;
        if (xmeVar == null) {
            f84VarArr = null;
        } else {
            f84VarArr = xmeVar.b;
        }
        if (f84VarArr != null) {
            int length = f84VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                f84 f84Var2 = f84VarArr[i];
                if ("get_last_location_with_request".equals(f84Var2.a)) {
                    f84Var = f84Var2;
                    break;
                }
                i++;
            }
            if (f84Var != null && f84Var.b() >= 1) {
                z2f z2fVar = (z2f) qndVar.k();
                hkd hkdVar = new hkd(taskCompletionSource, (byte) 0);
                Parcel R = z2fVar.R();
                int i2 = rgd.a;
                R.writeInt(1);
                jx5Var.writeToParcel(R, 0);
                rgd.c(R, hkdVar);
                z2fVar.V(R, 82);
                return;
            }
        }
        z2f z2fVar2 = (z2f) qndVar.k();
        Parcel R2 = z2fVar2.R();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                z2fVar2.b.transact(7, R2, obtain, 0);
                obtain.readException();
                R2.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) rgd.a(obtain, Location.CREATOR));
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

    @Override
    public final int b0() {
        return 0;
    }

    public final boolean d(int i) {
        if (4 > i && !Log.isLoggable("FirebaseCrashlytics", i)) {
            return false;
        }
        return true;
    }

    @Override
    public final int d1() {
        return 0;
    }

    @Override
    public final odc e(Class cls, l13 l13Var) {
        l13Var.getClass();
        return new jo4(true);
    }

    @Override
    public final odc f(oh2 oh2Var, l13 l13Var) {
        return yjb.a(this, oh2Var, l13Var);
    }

    public final void g(String str) {
        if (d(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override
    public final boolean g0() {
        return false;
    }

    public final java.lang.Object h(java.io.FileOutputStream r10, defpackage.fw2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6e.h(java.io.FileOutputStream, fw2):java.lang.Object");
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public final void k(String str) {
        if (d(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    @Override
    public final int k0() {
        return 0;
    }

    public final void l(String str, Exception exc) {
        if (d(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override
    public final float p0() {
        return -1.0f;
    }

    @Override
    public final float q0() {
        return -1.0f;
    }

    @Override
    public final int t1() {
        return 0;
    }

    @Override
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final long c(long j) {
        return j;
    }

    @Override
    public final void g1(TLRPC.User user) {
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
