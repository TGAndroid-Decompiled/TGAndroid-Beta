package f6;

import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
public final class c0 implements Parcelable.Creator {
    public final int f11476a;

    public c0(int i3) {
        this.f11476a = i3;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: f6.c0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f11476a) {
            case 0:
                return new b0[i3];
            case 1:
                return new b[i3];
            case 2:
                return new g6.a[i3];
            case 3:
                return new g6.f[i3];
            case 4:
                return new g6.b[i3];
            case 5:
                return new g6.d[i3];
            case 6:
                return new g8.d[i3];
            case 7:
                return new g8.e[i3];
            case 8:
                return new g8.f[i3];
            case 9:
                return new g8.g[i3];
            case 10:
                return new g8.h[i3];
            case 11:
                return new UserAddress[i3];
            case 12:
                return new i6.x[i3];
            case 13:
                return new i6.d[i3];
            case 14:
                return new i6.c[i3];
            case 15:
                return new i7.a[i3];
            case 16:
                return new i7.b[i3];
            case 17:
                return new i7.c[i3];
            case 18:
                return new i7.d[i3];
            case 19:
                return new i7.e[i3];
            case 20:
                return new i7.f[i3];
            case 21:
                return new i7.g[i3];
            case 22:
                return new i7.h[i3];
            case 23:
                return new i7.i[i3];
            case 24:
                return new i7.j[i3];
            case 25:
                return new GetCredentialRequest[i3];
            case 26:
                return new i7.k[i3];
            case 27:
                return new i7.l[i3];
            case 28:
                return new i7.m[i3];
            default:
                return new i7.n[i3];
        }
    }
}
