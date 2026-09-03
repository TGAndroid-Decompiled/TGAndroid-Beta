package n7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class dg implements Parcelable.Creator {
    public final int f14321a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14321a) {
            case 0:
                int z4 = j7.l0.z(parcel);
                long j10 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 != 5) {
                                        j7.l0.y(parcel, readInt);
                                    } else {
                                        j10 = j7.l0.w(parcel, readInt);
                                    }
                                } else {
                                    i13 = j7.l0.u(parcel, readInt);
                                }
                            } else {
                                i12 = j7.l0.u(parcel, readInt);
                            }
                        } else {
                            i11 = j7.l0.u(parcel, readInt);
                        }
                    } else {
                        i10 = j7.l0.u(parcel, readInt);
                    }
                }
                j7.l0.m(parcel, z4);
                return new bg(i10, i11, i12, j10, i13);
            case 1:
                int z10 = j7.l0.z(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int x10 = j7.l0.x(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (x10 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + x10);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) j7.l0.g(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i14 = j7.l0.u(parcel, readInt2);
                            break;
                        case 4:
                            i15 = j7.l0.u(parcel, readInt2);
                            break;
                        case 5:
                            i16 = j7.l0.u(parcel, readInt2);
                            break;
                        case 6:
                            i17 = j7.l0.u(parcel, readInt2);
                            break;
                        case 7:
                            i18 = j7.l0.u(parcel, readInt2);
                            break;
                        default:
                            j7.l0.y(parcel, readInt2);
                            break;
                    }
                }
                j7.l0.m(parcel, z10);
                return new ig(fArr, bitmap, i14, i15, i16, i17, i18);
            case 2:
                int z11 = j7.l0.z(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    j7.l0.y(parcel, readInt3);
                                } else {
                                    int x11 = j7.l0.x(parcel, readInt3);
                                    int dataPosition2 = parcel.dataPosition();
                                    if (x11 == 0) {
                                        arrayList2 = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int readInt4 = parcel.readInt();
                                        for (int i19 = 0; i19 < readInt4; i19++) {
                                            arrayList3.add(Float.valueOf(parcel.readFloat()));
                                        }
                                        parcel.setDataPosition(dataPosition2 + x11);
                                        arrayList2 = arrayList3;
                                    }
                                }
                            } else {
                                bitmap2 = (Bitmap) j7.l0.g(parcel, readInt3, Bitmap.CREATOR);
                            }
                        } else {
                            int x12 = j7.l0.x(parcel, readInt3);
                            int dataPosition3 = parcel.dataPosition();
                            if (x12 == 0) {
                                fArr2 = null;
                            } else {
                                float[] createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + x12);
                                fArr2 = createFloatArray;
                            }
                        }
                    } else {
                        arrayList = j7.l0.l(parcel, readInt3, ig.CREATOR);
                    }
                }
                j7.l0.m(parcel, z11);
                return new jg(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int z12 = j7.l0.z(parcel);
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    if (c11 != 5) {
                                        j7.l0.y(parcel, readInt5);
                                    } else {
                                        z17 = j7.l0.n(parcel, readInt5);
                                    }
                                } else {
                                    z16 = j7.l0.n(parcel, readInt5);
                                }
                            } else {
                                z15 = j7.l0.n(parcel, readInt5);
                            }
                        } else {
                            z14 = j7.l0.n(parcel, readInt5);
                        }
                    } else {
                        z13 = j7.l0.n(parcel, readInt5);
                    }
                }
                j7.l0.m(parcel, z12);
                return new kg(z13, z14, z15, z16, z17);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f14321a) {
            case 0:
                return new bg[i10];
            case 1:
                return new ig[i10];
            case 2:
                return new jg[i10];
            default:
                return new kg[i10];
        }
    }
}
