package h7;

import android.os.Parcel;
import android.os.Parcelable;
public final class s5 implements Parcelable.Creator {
    public final int f10108a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10108a) {
            case 0:
                int z10 = g7.o8.z(parcel);
                String str = null;
                String str2 = null;
                float f10 = 0.0f;
                int i9 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    g7.o8.y(parcel, readInt);
                                } else {
                                    i9 = g7.o8.u(parcel, readInt);
                                }
                            } else {
                                str = g7.o8.h(parcel, readInt);
                            }
                        } else {
                            f10 = g7.o8.r(parcel, readInt);
                        }
                    } else {
                        str2 = g7.o8.h(parcel, readInt);
                    }
                }
                g7.o8.m(parcel, z10);
                return new r4(f10, i9, str, str2);
            case 1:
                int z11 = g7.o8.z(parcel);
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                float f11 = 0.0f;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                if (c11 != 5) {
                                    g7.o8.y(parcel, readInt2);
                                } else {
                                    i12 = g7.o8.u(parcel, readInt2);
                                }
                            } else {
                                f11 = g7.o8.r(parcel, readInt2);
                            }
                        } else {
                            i11 = g7.o8.u(parcel, readInt2);
                        }
                    } else {
                        i10 = g7.o8.u(parcel, readInt2);
                    }
                }
                g7.o8.m(parcel, z11);
                return new s6(i10, i11, f11, i12);
            case 2:
                int z12 = g7.o8.z(parcel);
                String str3 = null;
                String str4 = null;
                float f12 = 0.0f;
                int i13 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    g7.o8.y(parcel, readInt3);
                                } else {
                                    i13 = g7.o8.u(parcel, readInt3);
                                }
                            } else {
                                str4 = g7.o8.h(parcel, readInt3);
                            }
                        } else {
                            f12 = g7.o8.r(parcel, readInt3);
                        }
                    } else {
                        str3 = g7.o8.h(parcel, readInt3);
                    }
                }
                g7.o8.m(parcel, z12);
                return new sa(f12, i13, str3, str4);
            default:
                int z13 = g7.o8.z(parcel);
                float f13 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            g7.o8.y(parcel, readInt4);
                        } else {
                            i14 = g7.o8.u(parcel, readInt4);
                        }
                    } else {
                        f13 = g7.o8.r(parcel, readInt4);
                    }
                }
                g7.o8.m(parcel, z13);
                return new ta(f13, i14);
        }
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f10108a) {
            case 0:
                return new r4[i9];
            case 1:
                return new s6[i9];
            case 2:
                return new sa[i9];
            default:
                return new ta[i9];
        }
    }
}
