package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class z5 implements Parcelable.Creator {
    public final int f746a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f746a) {
            case 0:
                int z10 = xb.z(parcel);
                String str = null;
                int i7 = 0;
                float f10 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    xb.y(parcel, readInt);
                                } else {
                                    i7 = xb.u(parcel, readInt);
                                }
                            } else {
                                str = xb.h(parcel, readInt);
                            }
                        } else {
                            f10 = xb.r(parcel, readInt);
                        }
                    } else {
                        str2 = xb.h(parcel, readInt);
                    }
                }
                xb.m(parcel, z10);
                return new y4(f10, i7, str, str2);
            case 1:
                int z11 = xb.z(parcel);
                int i10 = 0;
                int i11 = 0;
                float f11 = 0.0f;
                int i12 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                if (c11 != 5) {
                                    xb.y(parcel, readInt2);
                                } else {
                                    i11 = xb.u(parcel, readInt2);
                                }
                            } else {
                                f11 = xb.r(parcel, readInt2);
                            }
                        } else {
                            i12 = xb.u(parcel, readInt2);
                        }
                    } else {
                        i10 = xb.u(parcel, readInt2);
                    }
                }
                xb.m(parcel, z11);
                return new y6(i10, i12, f11, i11);
            case 2:
                int z12 = xb.z(parcel);
                String str3 = null;
                int i13 = 0;
                float f12 = 0.0f;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    xb.y(parcel, readInt3);
                                } else {
                                    i13 = xb.u(parcel, readInt3);
                                }
                            } else {
                                str4 = xb.h(parcel, readInt3);
                            }
                        } else {
                            f12 = xb.r(parcel, readInt3);
                        }
                    } else {
                        str3 = xb.h(parcel, readInt3);
                    }
                }
                xb.m(parcel, z12);
                return new hb(f12, i13, str3, str4);
            default:
                int z13 = xb.z(parcel);
                float f13 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            xb.y(parcel, readInt4);
                        } else {
                            i14 = xb.u(parcel, readInt4);
                        }
                    } else {
                        f13 = xb.r(parcel, readInt4);
                    }
                }
                xb.m(parcel, z13);
                return new ib(f13, i14);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f746a) {
            case 0:
                return new y4[i7];
            case 1:
                return new y6[i7];
            case 2:
                return new hb[i7];
            default:
                return new ib[i7];
        }
    }
}
