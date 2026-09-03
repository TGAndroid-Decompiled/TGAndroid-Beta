package j8;

import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class t implements Parcelable.Creator {
    public final int f9289a;

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        throw new UnsupportedOperationException("Method not decompiled: j8.t.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f9289a) {
            case 0:
                return new s[i10];
            case 1:
                return new q[i10];
            case 2:
                return new b[i10];
            case 3:
                return new c[i10];
            case 4:
                return new FullWallet[i10];
            case 5:
                return new d[i10];
            case 6:
                return new e[i10];
            case 7:
                return new f[i10];
            case 8:
                return new MaskedWallet[i10];
            case 9:
                return new g[i10];
            case 10:
                return new h[i10];
            case 11:
                return new k4.a[i10];
            case 12:
                return new k4.b[i10];
            case 13:
                return new k4.d[i10];
            case 14:
                return new k4.c[i10];
            case 15:
                return new k4.e[i10];
            case 16:
                return new CommonWalletObject[i10];
            case 17:
                return new k8.a[i10];
            case 18:
                return new k8.b[i10];
            case 19:
                return new k8.d[i10];
            case 20:
                return new k8.c[i10];
            case 21:
                return new k8.e[i10];
            case 22:
                return new k8.f[i10];
            case 23:
                return new k8.g[i10];
            case 24:
                return new k8.h[i10];
            case 25:
                return new ParcelImpl[i10];
            case 26:
                return new l4.a[i10];
            case 27:
                return new l4.e[i10];
            case 28:
                return new l4.f[i10];
            default:
                return new l4.i[i10];
        }
    }
}
