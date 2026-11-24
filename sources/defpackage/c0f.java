package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.wallet.MaskedWallet;
public final class c0f implements Parcelable.Creator {
    public final byte a;

    public c0f(byte b) {
        this.a = b;
    }

    public static void a(ct4 ct4Var, Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = ct4Var.a;
        jte.q(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = ct4Var.b;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = ct4Var.c;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i4);
        jte.l(parcel, 4, ct4Var.d);
        jte.f(parcel, 5, ct4Var.e);
        jte.o(parcel, 6, ct4Var.f, i);
        jte.b(parcel, 7, ct4Var.h);
        jte.k(parcel, 8, ct4Var.n, i);
        jte.o(parcel, 10, ct4Var.r, i);
        jte.o(parcel, 11, ct4Var.s, i);
        boolean z = ct4Var.w;
        jte.q(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = ct4Var.x;
        jte.q(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = ct4Var.y;
        jte.q(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jte.l(parcel, 15, ct4Var.E);
        jte.s(parcel, r);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mwe[i];
            case 1:
                return new ct4[i];
            case 2:
                return new d50[i];
            case 3:
                return new owe[i];
            case 4:
                return new a0f[i];
            case 5:
                return new ve0[i];
            case 6:
                return new wze[i];
            case 7:
                return new dd1[i];
            case 8:
                return new ap5[i];
            case 9:
                return new uoc[i];
            case 10:
                return new d6f[i];
            case 11:
                return new i6f[i];
            case 12:
                return new w4f[i];
            case 13:
                return new a5f[i];
            case 14:
                return new b5f[i];
            case 15:
                return new l51[i];
            case 16:
                return new nr5[i];
            case 17:
                return new f9f[i];
            case 18:
                return new g9f[i];
            case 19:
                return new l9f[i];
            case 20:
                return new eg6[i];
            case 21:
                return new CastDevice[i];
            case 22:
                return new fbf[i];
            case 23:
                return new MaskedWallet[i];
            case 24:
                return new xcf[i];
            case 25:
                return new ycf[i];
            case 26:
                return new rcf[i];
            case 27:
                return new fff[i];
            case 28:
                return new rff[i];
            default:
                return new tff[i];
        }
    }
}
