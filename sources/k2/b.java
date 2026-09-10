package k2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import e9.a1;
public final class b {
    public static final b f12073c = new b(e9.i0.z(a.d));
    public static final a1 d;
    public static final e9.k0 e;
    public final SparseArray f12074a = new SparseArray();
    public final int f12075b;

    static {
        Object[] objArr = {2, 5, 6};
        e9.q.d(3, objArr);
        d = e9.i0.t(3, objArr);
        a5.a aVar = new a5.a(4, 6);
        aVar.t(5, 6);
        aVar.t(17, 6);
        aVar.t(7, 6);
        aVar.t(30, 10);
        aVar.t(18, 6);
        aVar.t(6, 8);
        aVar.t(8, 8);
        aVar.t(14, 8);
        e = aVar.c();
    }

    public b(a1 a1Var) {
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            a aVar = (a) a1Var.get(i10);
            this.f12074a.put(aVar.f12067a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12074a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.f12074a.valueAt(i12)).f12068b);
        }
        this.f12075b = i11;
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

    public static k2.b b(android.content.Context r5, android.content.Intent r6, b2.e r7, a6.i r8) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.b(android.content.Context, android.content.Intent, b2.e, a6.i):k2.b");
    }

    public static b c(Context context, b2.e eVar, a6.i iVar) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, iVar);
    }

    public final android.util.Pair d(b2.e r14, b2.s r15) {
        throw new UnsupportedOperationException("Method not decompiled: k2.b.d(b2.e, b2.s):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (e2.d0.l(this.f12074a, bVar.f12074a) && this.f12075b == bVar.f12075b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (e2.d0.m(this.f12074a) * 31) + this.f12075b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f12075b + ", audioProfiles=" + this.f12074a + "]";
    }
}
