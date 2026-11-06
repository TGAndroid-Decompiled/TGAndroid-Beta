package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class z5 implements Parcelable.Creator {
    public final int f741a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f741a) {
            case 0:
                int z9 = wb.z(parcel);
                String str = null;
                int i7 = 0;
                float f10 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    wb.y(parcel, readInt);
                                } else {
                                    i7 = wb.u(parcel, readInt);
                                }
                            } else {
                                str = wb.h(parcel, readInt);
                            }
                        } else {
                            f10 = wb.r(parcel, readInt);
                        }
                    } else {
                        str2 = wb.h(parcel, readInt);
                    }
                }
                wb.m(parcel, z9);
                return new y4(f10, i7, str, str2);
            case 1:
                int z10 = wb.z(parcel);
                int i10 = 0;
                int i11 = 0;
                float f11 = 0.0f;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                if (c11 != 5) {
                                    wb.y(parcel, readInt2);
                                } else {
                                    i11 = wb.u(parcel, readInt2);
                                }
                            } else {
                                f11 = wb.r(parcel, readInt2);
                            }
                        } else {
                            i12 = wb.u(parcel, readInt2);
                        }
                    } else {
                        i10 = wb.u(parcel, readInt2);
                    }
                }
                wb.m(parcel, z10);
                return new y6(i10, i12, f11, i11);
            case 2:
                int z11 = wb.z(parcel);
                String str3 = null;
                int i13 = 0;
                float f12 = 0.0f;
                String str4 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    wb.y(parcel, readInt3);
                                } else {
                                    i13 = wb.u(parcel, readInt3);
                                }
                            } else {
                                str4 = wb.h(parcel, readInt3);
                            }
                        } else {
                            f12 = wb.r(parcel, readInt3);
                        }
                    } else {
                        str3 = wb.h(parcel, readInt3);
                    }
                }
                wb.m(parcel, z11);
                return new gb(f12, i13, str3, str4);
            default:
                int z12 = wb.z(parcel);
                float f13 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            wb.y(parcel, readInt4);
                        } else {
                            i14 = wb.u(parcel, readInt4);
                        }
                    } else {
                        f13 = wb.r(parcel, readInt4);
                    }
                }
                wb.m(parcel, z12);
                return new hb(f13, i14);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f741a) {
            case 0:
                return new y4[i7];
            case 1:
                return new y6[i7];
            case 2:
                return new gb[i7];
            default:
                return new hb[i7];
        }
    }
}
