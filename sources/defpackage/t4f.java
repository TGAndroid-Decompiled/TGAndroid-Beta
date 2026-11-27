package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.wallet.MaskedWallet;
public final class t4f implements Parcelable.Creator {
    public final byte a;

    public t4f(byte b) {
        this.a = b;
    }

    public static void a(gv4 gv4Var, Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = gv4Var.a;
        bye.q(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = gv4Var.b;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = gv4Var.c;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i4);
        bye.l(parcel, 4, gv4Var.d);
        bye.f(parcel, 5, gv4Var.e);
        bye.o(parcel, 6, gv4Var.f, i);
        bye.b(parcel, 7, gv4Var.h);
        bye.k(parcel, 8, gv4Var.n, i);
        bye.o(parcel, 10, gv4Var.r, i);
        bye.o(parcel, 11, gv4Var.s, i);
        boolean z = gv4Var.w;
        bye.q(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = gv4Var.x;
        bye.q(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = gv4Var.y;
        bye.q(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bye.l(parcel, 15, gv4Var.E);
        bye.s(parcel, r);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d1f[i];
            case 1:
                return new gv4[i];
            case 2:
                return new f50[i];
            case 3:
                return new f1f[i];
            case 4:
                return new r4f[i];
            case 5:
                return new xe0[i];
            case 6:
                return new n4f[i];
            case 7:
                return new ld1[i];
            case 8:
                return new dr5[i];
            case 9:
                return new htc[i];
            case 10:
                return new uaf[i];
            case 11:
                return new zaf[i];
            case 12:
                return new n9f[i];
            case 13:
                return new r9f[i];
            case 14:
                return new s9f[i];
            case 15:
                return new t51[i];
            case 16:
                return new pt5[i];
            case 17:
                return new wdf[i];
            case 18:
                return new xdf[i];
            case 19:
                return new cef[i];
            case 20:
                return new ii6[i];
            case 21:
                return new CastDevice[i];
            case 22:
                return new vff[i];
            case 23:
                return new MaskedWallet[i];
            case 24:
                return new nhf[i];
            case 25:
                return new ohf[i];
            case 26:
                return new hhf[i];
            case 27:
                return new vjf[i];
            case 28:
                return new hkf[i];
            default:
                return new jkf[i];
        }
    }
}
