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
public class f8e implements h89, z0c, lj0, g22, am0, sfc, gc4, w23, i40 {
    public static f8e E;
    public static final f8e a = new Object();
    public static final f8e b = new Object();
    public static final f8e c = new Object();
    public static final f8e d = new Object();
    public static final f8e e = new Object();
    public static final f8e f = new Object();
    public static final f8e h = new Object();
    public static final f8e n = new Object();
    public static final f8e r = new Object();
    public static final f8e s = new Object();
    public static final f8e w = new Object();
    public static final f8e x = new Object();
    public static final f8e y = new Object();

    public static void j(cyc cycVar, boolean z) {
        String str;
        ss0 ss0Var;
        al9 al9Var;
        txc g = wxc.g(cycVar);
        StringBuilder sb = new StringBuilder("widget ");
        sb.append(cycVar.a);
        sb.append(": engine process died");
        if (z) {
            str = ", restarting";
        } else {
            str = "";
        }
        hg9.r(str, sb);
        if (z && g != null && (al9Var = g.y) != null) {
            if (al9Var.f0 && al9Var.Y != null) {
                al9Var.r0();
                al9Var.q0();
            }
        } else if (z && g != null && (ss0Var = g.p) != null && ss0Var.G) {
            ss0Var.i();
            ss0Var.e();
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean K0() {
        return false;
    }

    @Override
    public final int K1() {
        return 0;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        o94[] o94VarArr;
        tpd tpdVar = (tpd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        jz5 jz5Var = new jz5(Long.MAX_VALUE, 0, false, null, null);
        ape apeVar = tpdVar.B;
        o94 o94Var = null;
        if (apeVar == null) {
            o94VarArr = null;
        } else {
            o94VarArr = apeVar.b;
        }
        if (o94VarArr != null) {
            int length = o94VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                o94 o94Var2 = o94VarArr[i];
                if ("get_last_location_with_request".equals(o94Var2.a)) {
                    o94Var = o94Var2;
                    break;
                }
                i++;
            }
            if (o94Var != null && o94Var.b() >= 1) {
                b5f b5fVar = (b5f) tpdVar.k();
                jmd jmdVar = new jmd(taskCompletionSource, (byte) 0);
                Parcel R = b5fVar.R();
                int i2 = sid.a;
                R.writeInt(1);
                jz5Var.writeToParcel(R, 0);
                sid.c(R, jmdVar);
                b5fVar.V(R, 82);
                return;
            }
        }
        b5f b5fVar2 = (b5f) tpdVar.k();
        Parcel R2 = b5fVar2.R();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                b5fVar2.b.transact(7, R2, obtain, 0);
                obtain.readException();
                R2.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) sid.a(obtain, Location.CREATOR));
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
    public final pfc d(Class cls, x23 x23Var) {
        x23Var.getClass();
        return new kq4(true);
    }

    public final boolean e(int i) {
        if (4 > i && !Log.isLoggable("FirebaseCrashlytics", i)) {
            return false;
        }
        return true;
    }

    public final void f(String str) {
        if (e(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override
    public final pfc g(cj2 cj2Var, x23 x23Var) {
        return mlb.a(this, cj2Var, x23Var);
    }

    @Override
    public final int g0() {
        return 0;
    }

    @Override
    public final float g1() {
        return 0.0f;
    }

    public final java.lang.Object h(java.io.FileOutputStream r10, defpackage.px2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8e.h(java.io.FileOutputStream, px2):java.lang.Object");
    }

    @Override
    public final int h1() {
        return 0;
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public final void j0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i3 = 0; i3 < min; i3++) {
            short s2 = shortBuffer.get();
            shortBuffer2.put(s2);
            shortBuffer2.put(s2);
        }
    }

    public final void k(String str) {
        if (e(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public final void l(String str, Exception exc) {
        if (e(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override
    public final int p1(int i, int i2, int i3) {
        return i << 1;
    }

    @Override
    public final int r1() {
        return 0;
    }

    @Override
    public final int u0() {
        return 0;
    }

    @Override
    public final float w0() {
        return -1.0f;
    }

    @Override
    public final float y0() {
        return -1.0f;
    }

    @Override
    public final void I() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final long c(long j) {
        return j;
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
