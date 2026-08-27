package k7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class cg implements Parcelable.Creator {

    public final int f14527a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14527a) {
            case 0:
                int iZ = h7.q8.z(parcel);
                long jW = 0;
                int iU = 0;
                int iU2 = 0;
                int iU3 = 0;
                int iU4 = 0;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iU = h7.q8.u(parcel, i10);
                    } else if (c10 == 2) {
                        iU2 = h7.q8.u(parcel, i10);
                    } else if (c10 == 3) {
                        iU3 = h7.q8.u(parcel, i10);
                    } else if (c10 == 4) {
                        iU4 = h7.q8.u(parcel, i10);
                    } else if (c10 != 5) {
                        h7.q8.y(parcel, i10);
                    } else {
                        jW = h7.q8.w(parcel, i10);
                    }
                }
                h7.q8.m(parcel, iZ);
                return new ag(iU, iU2, iU3, jW, iU4);
            case 1:
                int iZ2 = h7.q8.z(parcel);
                float[] fArrCreateFloatArray = null;
                Bitmap bitmap = null;
                int iU5 = 0;
                int iU6 = 0;
                int iU7 = 0;
                int iU8 = 0;
                int iU9 = 0;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            int iX = h7.q8.x(parcel, i11);
                            int iDataPosition = parcel.dataPosition();
                            if (iX == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition + iX);
                            }
                            break;
                        case 2:
                            bitmap = (Bitmap) h7.q8.g(parcel, i11, Bitmap.CREATOR);
                            break;
                        case 3:
                            iU5 = h7.q8.u(parcel, i11);
                            break;
                        case 4:
                            iU6 = h7.q8.u(parcel, i11);
                            break;
                        case 5:
                            iU7 = h7.q8.u(parcel, i11);
                            break;
                        case 6:
                            iU8 = h7.q8.u(parcel, i11);
                            break;
                        case 7:
                            iU9 = h7.q8.u(parcel, i11);
                            break;
                        default:
                            h7.q8.y(parcel, i11);
                            break;
                    }
                }
                h7.q8.m(parcel, iZ2);
                return new hg(fArrCreateFloatArray, bitmap, iU5, iU6, iU7, iU8, iU9);
            case 2:
                int iZ3 = h7.q8.z(parcel);
                ArrayList arrayListL = null;
                float[] fArr = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        arrayListL = h7.q8.l(parcel, i12, hg.CREATOR);
                    } else if (c11 == 2) {
                        int iX2 = h7.q8.x(parcel, i12);
                        int iDataPosition2 = parcel.dataPosition();
                        if (iX2 == 0) {
                            fArr = null;
                        } else {
                            float[] fArrCreateFloatArray2 = parcel.createFloatArray();
                            parcel.setDataPosition(iDataPosition2 + iX2);
                            fArr = fArrCreateFloatArray2;
                        }
                    } else if (c11 == 3) {
                        bitmap2 = (Bitmap) h7.q8.g(parcel, i12, Bitmap.CREATOR);
                    } else if (c11 != 4) {
                        h7.q8.y(parcel, i12);
                    } else {
                        int iX3 = h7.q8.x(parcel, i12);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iX3 == 0) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i13 = parcel.readInt();
                            for (int i14 = 0; i14 < i13; i14++) {
                                arrayList2.add(Float.valueOf(parcel.readFloat()));
                            }
                            parcel.setDataPosition(iDataPosition3 + iX3);
                            arrayList = arrayList2;
                        }
                    }
                }
                h7.q8.m(parcel, iZ3);
                return new ig(arrayListL, fArr, bitmap2, arrayList);
            default:
                int iZ4 = h7.q8.z(parcel);
                boolean zN = false;
                boolean zN2 = false;
                boolean zN3 = false;
                boolean zN4 = false;
                boolean zN5 = false;
                while (parcel.dataPosition() < iZ4) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        zN = h7.q8.n(parcel, i15);
                    } else if (c12 == 2) {
                        zN2 = h7.q8.n(parcel, i15);
                    } else if (c12 == 3) {
                        zN3 = h7.q8.n(parcel, i15);
                    } else if (c12 == 4) {
                        zN4 = h7.q8.n(parcel, i15);
                    } else if (c12 != 5) {
                        h7.q8.y(parcel, i15);
                    } else {
                        zN5 = h7.q8.n(parcel, i15);
                    }
                }
                h7.q8.m(parcel, iZ4);
                return new jg(zN, zN2, zN3, zN4, zN5);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f14527a) {
            case 0:
                return new ag[i10];
            case 1:
                return new hg[i10];
            case 2:
                return new ig[i10];
            default:
                return new jg[i10];
        }
    }
}
