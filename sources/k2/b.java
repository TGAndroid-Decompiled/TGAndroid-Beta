package k2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import e9.a1;
public final class b {
    public static final b f14408c = new b(e9.i0.z(a.d));
    public static final a1 d;
    public static final e9.k0 f14409e;
    public final SparseArray f14410a = new SparseArray();
    public final int f14411b;

    static {
        Object[] objArr = {2, 5, 6};
        e9.q.d(3, objArr);
        d = e9.i0.t(3, objArr);
        a5.a aVar = new a5.a(4, 5);
        aVar.w(5, 6);
        aVar.w(17, 6);
        aVar.w(7, 6);
        aVar.w(30, 10);
        aVar.w(18, 6);
        aVar.w(6, 8);
        aVar.w(8, 8);
        aVar.w(14, 8);
        f14409e = aVar.f();
    }

    public b(a1 a1Var) {
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            a aVar = (a) a1Var.get(i10);
            this.f14410a.put(aVar.f14403a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14410a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.f14410a.valueAt(i12)).f14404b);
        }
        this.f14411b = i11;
    }

    public static a1 a(int i10, int[] iArr) {
        e9.f0 u10 = e9.i0.u();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            u10.b(new a(i11, i10));
        }
        return u10.i();
    }

    public static k2.b b(android.content.Context r11, android.content.Intent r12, b2.e r13, a4.l r14) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.b(android.content.Context, android.content.Intent, b2.e, a4.l):k2.b");
    }

    public static b c(Context context, b2.e eVar, a4.l lVar) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, lVar);
    }

    public final android.util.Pair d(b2.e r14, b2.s r15) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.d(b2.e, b2.s):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (e2.d0.l(this.f14410a, bVar.f14410a) && this.f14411b == bVar.f14411b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (e2.d0.m(this.f14410a) * 31) + this.f14411b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f14411b + ", audioProfiles=" + this.f14410a + "]";
    }
}
