package i7;

import android.os.Parcel;
import android.os.Parcelable;

public final class s5 implements Parcelable.Creator {

    public final int f10817a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10817a) {
            case 0:
                int iZ = h7.q8.z(parcel);
                String strH = null;
                String strH2 = null;
                float fR = 0.0f;
                int iU = 0;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 2) {
                        strH2 = h7.q8.h(parcel, i10);
                    } else if (c10 == 3) {
                        fR = h7.q8.r(parcel, i10);
                    } else if (c10 == 4) {
                        strH = h7.q8.h(parcel, i10);
                    } else if (c10 != 5) {
                        h7.q8.y(parcel, i10);
                    } else {
                        iU = h7.q8.u(parcel, i10);
                    }
                }
                h7.q8.m(parcel, iZ);
                return new r4(fR, iU, strH, strH2);
            case 1:
                int iZ2 = h7.q8.z(parcel);
                int iU2 = 0;
                int iU3 = 0;
                int iU4 = 0;
                float fR2 = 0.0f;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 2) {
                        iU2 = h7.q8.u(parcel, i11);
                    } else if (c11 == 3) {
                        iU3 = h7.q8.u(parcel, i11);
                    } else if (c11 == 4) {
                        fR2 = h7.q8.r(parcel, i11);
                    } else if (c11 != 5) {
                        h7.q8.y(parcel, i11);
                    } else {
                        iU4 = h7.q8.u(parcel, i11);
                    }
                }
                h7.q8.m(parcel, iZ2);
                return new s6(iU2, iU3, fR2, iU4);
            case 2:
                int iZ3 = h7.q8.z(parcel);
                String strH3 = null;
                String strH4 = null;
                float fR3 = 0.0f;
                int iU5 = 0;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        strH3 = h7.q8.h(parcel, i12);
                    } else if (c12 == 2) {
                        fR3 = h7.q8.r(parcel, i12);
                    } else if (c12 == 3) {
                        strH4 = h7.q8.h(parcel, i12);
                    } else if (c12 != 4) {
                        h7.q8.y(parcel, i12);
                    } else {
                        iU5 = h7.q8.u(parcel, i12);
                    }
                }
                h7.q8.m(parcel, iZ3);
                return new sa(fR3, iU5, strH3, strH4);
            default:
                int iZ4 = h7.q8.z(parcel);
                float fR4 = 0.0f;
                int iU6 = 0;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        fR4 = h7.q8.r(parcel, i13);
                    } else if (c13 != 2) {
                        h7.q8.y(parcel, i13);
                    } else {
                        iU6 = h7.q8.u(parcel, i13);
                    }
                }
                h7.q8.m(parcel, iZ4);
                return new ta(fR4, iU6);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f10817a) {
            case 0:
                return new r4[i10];
            case 1:
                return new s6[i10];
            case 2:
                return new sa[i10];
            default:
                return new ta[i10];
        }
    }
}
