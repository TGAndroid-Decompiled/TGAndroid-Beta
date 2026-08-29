package g8;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import h8.h;
import h8.i;
import h8.j;
import h8.k;
import h8.l;
import h8.m;
import h8.n;
import h8.q;
import h8.r;
import h8.s;
public final class b implements Parcelable.Creator {
    public final int f7132a;

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        throw new UnsupportedOperationException("Method not decompiled: g8.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f7132a) {
            case 0:
                return new a[i10];
            case 1:
                return new FaceParcel[i10];
            case 2:
                return new c[i10];
            case 3:
                return new LandmarkParcel[i10];
            case 4:
                return new h4.a[i10];
            case 5:
                return new h4.b[i10];
            case 6:
                return new h4.d[i10];
            case 7:
                return new h4.c[i10];
            case 8:
                return new h4.e[i10];
            case 9:
                return new i[i10];
            case 10:
                return new j[i10];
            case 11:
                return new k[i10];
            case 12:
                return new l[i10];
            case 13:
                return new r[i10];
            case 14:
                return new m[i10];
            case 15:
                return new n[i10];
            case 16:
                return new s[i10];
            case 17:
                return new q[i10];
            case 18:
                return new h8.b[i10];
            case 19:
                return new h8.c[i10];
            case 20:
                return new FullWallet[i10];
            case 21:
                return new h8.d[i10];
            case 22:
                return new h8.e[i10];
            case 23:
                return new h8.f[i10];
            case 24:
                return new MaskedWallet[i10];
            case 25:
                return new h8.g[i10];
            case 26:
                return new h[i10];
            case 27:
                return new i4.a[i10];
            case 28:
                return new i4.e[i10];
            default:
                return new i4.f[i10];
        }
    }
}
