package o4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b8.zb;
import java.util.HashMap;
public class x {
    public static final Object f20893b = new Object();
    public static final HashMap f20894c = new HashMap();
    public final e0 f20895a;

    public x(Context context, String str, d2.e1 e1Var, g9.i0 i0Var, g9.i0 i0Var2, g9.i0 i0Var3, kb.a aVar, Bundle bundle, Bundle bundle2, g2.e eVar, boolean z10, boolean z11) {
        synchronized (f20893b) {
            HashMap hashMap = f20894c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.f20895a = new e0(this, context, str, e1Var, i0Var, i0Var2, i0Var3, aVar, bundle, bundle2, eVar, z10, z11);
    }

    public final void a(d2.e1 e1Var) {
        boolean z10;
        e1Var.getClass();
        zb.f(e1Var.N());
        Looper B0 = e1Var.B0();
        e0 e0Var = this.f20895a;
        boolean z11 = false;
        if (B0 == e0Var.f20636t.f20751a.B0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (e1Var.B0() == Looper.myLooper()) {
            z11 = true;
        }
        zb.p(z11);
        l1 l1Var = e0Var.f20636t;
        if (e1Var == l1Var.f20751a) {
            return;
        }
        e0Var.u(l1Var, new l1(e1Var));
    }
}
