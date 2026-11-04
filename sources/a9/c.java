package a9;

import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
public final class c implements Parcelable.Creator {
    public final int f177a;

    public c(int i3) {
        this.f177a = i3;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r10) {
        throw new UnsupportedOperationException("Method not decompiled: a9.c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f177a) {
            case 0:
                return new b[i3];
            case 1:
                return new e[i3];
            case 2:
                return new f[i3];
            case 3:
                return new g[i3];
            case 4:
                return new h[i3];
            case 5:
                return new i[i3];
            case 6:
                return new j[i3];
            case 7:
                return new DataItemAssetParcelable[i3];
            case 8:
                return new k[i3];
            case 9:
                return new l[i3];
            case 10:
                return new m[i3];
            case 11:
                return new n[i3];
            case 12:
                return new o[i3];
            case 13:
                return new p[i3];
            case 14:
                return new q[i3];
            case 15:
                return new r[i3];
            case 16:
                return new s[i3];
            case 17:
                return new t[i3];
            case 18:
                return new u[i3];
            case 19:
                return new v[i3];
            case 20:
                return new w[i3];
            case 21:
                return new x[i3];
            case 22:
                return new y[i3];
            case 23:
                return new z[i3];
            case 24:
                return new a0[i3];
            case 25:
                return new b0[i3];
            case 26:
                return new a1[i3];
            case 27:
                return new k0[i3];
            case 28:
                return new e0[i3];
            default:
                return new l0[i3];
        }
    }
}
