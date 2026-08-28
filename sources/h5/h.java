package h5;

import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.wearable.ConnectionConfiguration;
import m.o0;
import m6.a0;
import m6.m0;
import m6.n0;
import m6.p0;
import m6.q0;
import m6.t;
import m6.u;
import m6.v;
import m6.w;
import m6.x;
import m6.y;
import m6.z0;
public final class h implements Parcelable.Creator {
    public final int f9857a;

    public h(int i9) {
        this.f9857a = i9;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r19) {
        throw new UnsupportedOperationException("Method not decompiled: h5.h.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f9857a) {
            case 0:
                return new e[i9];
            case 1:
                return new f[i9];
            case 2:
                return new a[i9];
            case 3:
                return new b[i9];
            case 4:
                return new c[i9];
            case 5:
                return new d[i9];
            case 6:
                return new g[i9];
            case 7:
                return new ConnectionConfiguration[i9];
            case 8:
                return new i4.b[i9];
            case 9:
                return new k5.a[i9];
            case 10:
                return new SignInConfiguration[i9];
            case 11:
                return new Transport[i9];
            case 12:
                return new ParcelImpl[i9];
            case 13:
                return new l3.c[i9];
            case 14:
                return new l3.b[i9];
            case 15:
                return new o0[i9];
            case 16:
                return new m6.c[i9];
            case 17:
                return new z0[i9];
            case 18:
                return new m0[i9];
            case 19:
                return new n0[i9];
            case 20:
                return new t[i9];
            case 21:
                return new m6.o0[i9];
            case 22:
                return new p0[i9];
            case 23:
                return new q0[i9];
            case 24:
                return new v[i9];
            case 25:
                return new u[i9];
            case 26:
                return new w[i9];
            case 27:
                return new x[i9];
            case 28:
                return new y[i9];
            default:
                return new a0[i9];
        }
    }
}
