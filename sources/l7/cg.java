package l7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class cg implements Parcelable.Creator {
    public final int f14532a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14532a) {
            case 0:
                int A = ce.b.A(parcel);
                long j10 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 != 5) {
                                        ce.b.z(parcel, readInt);
                                    } else {
                                        j10 = ce.b.x(parcel, readInt);
                                    }
                                } else {
                                    i13 = ce.b.v(parcel, readInt);
                                }
                            } else {
                                i12 = ce.b.v(parcel, readInt);
                            }
                        } else {
                            i11 = ce.b.v(parcel, readInt);
                        }
                    } else {
                        i10 = ce.b.v(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new ag(i10, i11, i12, j10, i13);
            case 1:
                int A2 = ce.b.A(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int y8 = ce.b.y(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (y8 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + y8);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) ce.b.h(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i14 = ce.b.v(parcel, readInt2);
                            break;
                        case 4:
                            i15 = ce.b.v(parcel, readInt2);
                            break;
                        case 5:
                            i16 = ce.b.v(parcel, readInt2);
                            break;
                        case 6:
                            i17 = ce.b.v(parcel, readInt2);
                            break;
                        case 7:
                            i18 = ce.b.v(parcel, readInt2);
                            break;
                        default:
                            ce.b.z(parcel, readInt2);
                            break;
                    }
                }
                ce.b.n(parcel, A2);
                return new hg(fArr, bitmap, i14, i15, i16, i17, i18);
            case 2:
                int A3 = ce.b.A(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                if (c6 != 4) {
                                    ce.b.z(parcel, readInt3);
                                } else {
                                    int y10 = ce.b.y(parcel, readInt3);
                                    int dataPosition2 = parcel.dataPosition();
                                    if (y10 == 0) {
                                        arrayList2 = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int readInt4 = parcel.readInt();
                                        for (int i19 = 0; i19 < readInt4; i19++) {
                                            arrayList3.add(Float.valueOf(parcel.readFloat()));
                                        }
                                        parcel.setDataPosition(dataPosition2 + y10);
                                        arrayList2 = arrayList3;
                                    }
                                }
                            } else {
                                bitmap2 = (Bitmap) ce.b.h(parcel, readInt3, Bitmap.CREATOR);
                            }
                        } else {
                            int y11 = ce.b.y(parcel, readInt3);
                            int dataPosition3 = parcel.dataPosition();
                            if (y11 == 0) {
                                fArr2 = null;
                            } else {
                                float[] createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + y11);
                                fArr2 = createFloatArray;
                            }
                        }
                    } else {
                        arrayList = ce.b.m(parcel, readInt3, hg.CREATOR);
                    }
                }
                ce.b.n(parcel, A3);
                return new ig(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int A4 = ce.b.A(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < A4) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 != 5) {
                                        ce.b.z(parcel, readInt5);
                                    } else {
                                        z14 = ce.b.o(parcel, readInt5);
                                    }
                                } else {
                                    z13 = ce.b.o(parcel, readInt5);
                                }
                            } else {
                                z12 = ce.b.o(parcel, readInt5);
                            }
                        } else {
                            z11 = ce.b.o(parcel, readInt5);
                        }
                    } else {
                        z10 = ce.b.o(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A4);
                return new jg(z10, z11, z12, z13, z14);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f14532a) {
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
