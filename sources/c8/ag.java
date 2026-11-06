package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class ag implements Parcelable.Creator {
    public final int f5380a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5380a) {
            case 0:
                int z9 = vb.z(parcel);
                long j3 = 0;
                int i7 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 != 5) {
                                        vb.y(parcel, readInt);
                                    } else {
                                        j3 = vb.w(parcel, readInt);
                                    }
                                } else {
                                    i12 = vb.u(parcel, readInt);
                                }
                            } else {
                                i11 = vb.u(parcel, readInt);
                            }
                        } else {
                            i10 = vb.u(parcel, readInt);
                        }
                    } else {
                        i7 = vb.u(parcel, readInt);
                    }
                }
                vb.m(parcel, z9);
                return new yf(i7, i10, i11, j3, i12);
            case 1:
                int z10 = vb.z(parcel);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                float[] fArr = null;
                Bitmap bitmap = null;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int x10 = vb.x(parcel, readInt2);
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
                            bitmap = (Bitmap) vb.g(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i13 = vb.u(parcel, readInt2);
                            break;
                        case 4:
                            i14 = vb.u(parcel, readInt2);
                            break;
                        case 5:
                            i15 = vb.u(parcel, readInt2);
                            break;
                        case 6:
                            i16 = vb.u(parcel, readInt2);
                            break;
                        case 7:
                            i17 = vb.u(parcel, readInt2);
                            break;
                        default:
                            vb.y(parcel, readInt2);
                            break;
                    }
                }
                vb.m(parcel, z10);
                return new fg(fArr, bitmap, i13, i14, i15, i16, i17);
            case 2:
                int z11 = vb.z(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    vb.y(parcel, readInt3);
                                } else {
                                    int x11 = vb.x(parcel, readInt3);
                                    int dataPosition2 = parcel.dataPosition();
                                    if (x11 == 0) {
                                        arrayList2 = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int readInt4 = parcel.readInt();
                                        for (int i18 = 0; i18 < readInt4; i18++) {
                                            arrayList3.add(Float.valueOf(parcel.readFloat()));
                                        }
                                        parcel.setDataPosition(dataPosition2 + x11);
                                        arrayList2 = arrayList3;
                                    }
                                }
                            } else {
                                bitmap2 = (Bitmap) vb.g(parcel, readInt3, Bitmap.CREATOR);
                            }
                        } else {
                            int x12 = vb.x(parcel, readInt3);
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
                        arrayList = vb.l(parcel, readInt3, fg.CREATOR);
                    }
                }
                vb.m(parcel, z11);
                return new gg(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int z12 = vb.z(parcel);
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    if (c12 != 5) {
                                        vb.y(parcel, readInt5);
                                    } else {
                                        z17 = vb.n(parcel, readInt5);
                                    }
                                } else {
                                    z16 = vb.n(parcel, readInt5);
                                }
                            } else {
                                z15 = vb.n(parcel, readInt5);
                            }
                        } else {
                            z14 = vb.n(parcel, readInt5);
                        }
                    } else {
                        z13 = vb.n(parcel, readInt5);
                    }
                }
                vb.m(parcel, z12);
                return new hg(z13, z14, z15, z16, z17);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f5380a) {
            case 0:
                return new yf[i7];
            case 1:
                return new fg[i7];
            case 2:
                return new gg[i7];
            default:
                return new hg[i7];
        }
    }
}
