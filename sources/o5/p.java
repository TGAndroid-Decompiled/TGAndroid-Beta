package o5;

import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import q5.y;
public final class p implements Parcelable.Creator {
    public final int f19005a;

    public p(int i9) {
        this.f19005a = i9;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r20) {
        throw new UnsupportedOperationException("Method not decompiled: o5.p.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f19005a) {
            case 0:
                return new b[i9];
            case 1:
                return new d[i9];
            case 2:
                return new o7.d[i9];
            case 3:
                return new o7.e[i9];
            case 4:
                return new o7.f[i9];
            case 5:
                return new o7.g[i9];
            case 6:
                return new o7.h[i9];
            case 7:
                return new UserAddress[i9];
            case 8:
                return new y[i9];
            case 9:
                return new q5.d[i9];
            case 10:
                return new q5.c[i9];
            case 11:
                return new q6.a[i9];
            case 12:
                return new q6.b[i9];
            case 13:
                return new q6.c[i9];
            case 14:
                return new q6.d[i9];
            case 15:
                return new q6.e[i9];
            case 16:
                return new q6.f[i9];
            case 17:
                return new q6.g[i9];
            case 18:
                return new q6.h[i9];
            case 19:
                return new q6.i[i9];
            case 20:
                return new q6.j[i9];
            case 21:
                return new GetCredentialRequest[i9];
            case 22:
                return new q6.k[i9];
            case 23:
                return new q6.l[i9];
            case 24:
                return new q6.m[i9];
            case 25:
                return new q6.n[i9];
            case 26:
                return new q6.o[i9];
            case 27:
                return new q6.p[i9];
            case 28:
                return new q6.q[i9];
            default:
                return new q7.g[i9];
        }
    }
}
