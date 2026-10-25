package a8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class vg implements Parcelable.Creator {
    public final int f970a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f970a) {
            case 0:
                int z10 = bf.z(parcel);
                long j10 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 != 5) {
                                        bf.y(parcel, readInt);
                                    } else {
                                        j10 = bf.w(parcel, readInt);
                                    }
                                } else {
                                    i13 = bf.u(parcel, readInt);
                                }
                            } else {
                                i12 = bf.u(parcel, readInt);
                            }
                        } else {
                            i11 = bf.u(parcel, readInt);
                        }
                    } else {
                        i10 = bf.u(parcel, readInt);
                    }
                }
                bf.m(parcel, z10);
                return new tg(i10, i11, i12, j10, i13);
            case 1:
                int z11 = bf.z(parcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                float[] fArr = null;
                Bitmap bitmap = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int x9 = bf.x(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (x9 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + x9);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) bf.g(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i14 = bf.u(parcel, readInt2);
                            break;
                        case 4:
                            i15 = bf.u(parcel, readInt2);
                            break;
                        case 5:
                            i16 = bf.u(parcel, readInt2);
                            break;
                        case 6:
                            i17 = bf.u(parcel, readInt2);
                            break;
                        case 7:
                            i18 = bf.u(parcel, readInt2);
                            break;
                        default:
                            bf.y(parcel, readInt2);
                            break;
                    }
                }
                bf.m(parcel, z11);
                return new ah(fArr, bitmap, i14, i15, i16, i17, i18);
            case 2:
                int z12 = bf.z(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    bf.y(parcel, readInt3);
                                } else {
                                    int x10 = bf.x(parcel, readInt3);
                                    int dataPosition2 = parcel.dataPosition();
                                    if (x10 == 0) {
                                        arrayList2 = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int readInt4 = parcel.readInt();
                                        for (int i19 = 0; i19 < readInt4; i19++) {
                                            arrayList3.add(Float.valueOf(parcel.readFloat()));
                                        }
                                        parcel.setDataPosition(dataPosition2 + x10);
                                        arrayList2 = arrayList3;
                                    }
                                }
                            } else {
                                bitmap2 = (Bitmap) bf.g(parcel, readInt3, Bitmap.CREATOR);
                            }
                        } else {
                            int x11 = bf.x(parcel, readInt3);
                            int dataPosition3 = parcel.dataPosition();
                            if (x11 == 0) {
                                fArr2 = null;
                            } else {
                                float[] createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + x11);
                                fArr2 = createFloatArray;
                            }
                        }
                    } else {
                        arrayList = bf.l(parcel, readInt3, ah.CREATOR);
                    }
                }
                bf.m(parcel, z12);
                return new bh(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int z13 = bf.z(parcel);
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    if (c12 != 5) {
                                        bf.y(parcel, readInt5);
                                    } else {
                                        z18 = bf.n(parcel, readInt5);
                                    }
                                } else {
                                    z17 = bf.n(parcel, readInt5);
                                }
                            } else {
                                z16 = bf.n(parcel, readInt5);
                            }
                        } else {
                            z15 = bf.n(parcel, readInt5);
                        }
                    } else {
                        z14 = bf.n(parcel, readInt5);
                    }
                }
                bf.m(parcel, z13);
                return new ch(z14, z15, z16, z17, z18);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f970a) {
            case 0:
                return new tg[i10];
            case 1:
                return new ah[i10];
            case 2:
                return new bh[i10];
            default:
                return new ch[i10];
        }
    }
}
