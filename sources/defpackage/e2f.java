package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.wallet.MaskedWallet;
public final class e2f implements Parcelable.Creator {
    public final byte a;

    public e2f(byte b) {
        this.a = b;
    }

    public static void a(dv4 dv4Var, Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = dv4Var.a;
        mve.q(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = dv4Var.b;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = dv4Var.c;
        mve.q(parcel, 3, 4);
        parcel.writeInt(i4);
        mve.l(parcel, 4, dv4Var.d);
        mve.f(parcel, 5, dv4Var.e);
        mve.o(parcel, 6, dv4Var.f, i);
        mve.b(parcel, 7, dv4Var.h);
        mve.k(parcel, 8, dv4Var.n, i);
        mve.o(parcel, 10, dv4Var.r, i);
        mve.o(parcel, 11, dv4Var.s, i);
        boolean z = dv4Var.w;
        mve.q(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = dv4Var.x;
        mve.q(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = dv4Var.y;
        mve.q(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        mve.l(parcel, 15, dv4Var.E);
        mve.s(parcel, r);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new oye[i];
            case 1:
                return new dv4[i];
            case 2:
                return new d60[i];
            case 3:
                return new qye[i];
            case 4:
                return new c2f[i];
            case 5:
                return new vf0[i];
            case 6:
                return new y1f[i];
            case 7:
                return new le1[i];
            case 8:
                return new ar5[i];
            case 9:
                return new wqc[i];
            case 10:
                return new f8f[i];
            case 11:
                return new k8f[i];
            case 12:
                return new y6f[i];
            case 13:
                return new c7f[i];
            case 14:
                return new d7f[i];
            case 15:
                return new s61[i];
            case 16:
                return new mt5[i];
            case 17:
                return new hbf[i];
            case 18:
                return new ibf[i];
            case 19:
                return new nbf[i];
            case 20:
                return new ei6[i];
            case 21:
                return new CastDevice[i];
            case 22:
                return new gdf[i];
            case 23:
                return new MaskedWallet[i];
            case 24:
                return new yef[i];
            case 25:
                return new zef[i];
            case 26:
                return new sef[i];
            case 27:
                return new ghf[i];
            case 28:
                return new shf[i];
            default:
                return new uhf[i];
        }
    }
}
