package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class t5 implements Parcelable.Creator {
    public final int f11196a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11196a) {
            case 0:
                int A = ce.b.A(parcel);
                String str = null;
                String str2 = null;
                float f9 = 0.0f;
                int i10 = 0;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 2) {
                        if (c3 != 3) {
                            if (c3 != 4) {
                                if (c3 != 5) {
                                    ce.b.z(parcel, readInt);
                                } else {
                                    i10 = ce.b.v(parcel, readInt);
                                }
                            } else {
                                str = ce.b.i(parcel, readInt);
                            }
                        } else {
                            f9 = ce.b.s(parcel, readInt);
                        }
                    } else {
                        str2 = ce.b.i(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new s4(f9, i10, str, str2);
            case 1:
                int A2 = ce.b.A(parcel);
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                float f10 = 0.0f;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 != 2) {
                        if (c6 != 3) {
                            if (c6 != 4) {
                                if (c6 != 5) {
                                    ce.b.z(parcel, readInt2);
                                } else {
                                    i13 = ce.b.v(parcel, readInt2);
                                }
                            } else {
                                f10 = ce.b.s(parcel, readInt2);
                            }
                        } else {
                            i12 = ce.b.v(parcel, readInt2);
                        }
                    } else {
                        i11 = ce.b.v(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new t6(i11, i12, f10, i13);
            case 2:
                int A3 = ce.b.A(parcel);
                String str3 = null;
                String str4 = null;
                float f11 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    ce.b.z(parcel, readInt3);
                                } else {
                                    i14 = ce.b.v(parcel, readInt3);
                                }
                            } else {
                                str4 = ce.b.i(parcel, readInt3);
                            }
                        } else {
                            f11 = ce.b.s(parcel, readInt3);
                        }
                    } else {
                        str3 = ce.b.i(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new ta(f11, i14, str3, str4);
            default:
                int A4 = ce.b.A(parcel);
                float f12 = 0.0f;
                int i15 = 0;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            ce.b.z(parcel, readInt4);
                        } else {
                            i15 = ce.b.v(parcel, readInt4);
                        }
                    } else {
                        f12 = ce.b.s(parcel, readInt4);
                    }
                }
                ce.b.n(parcel, A4);
                return new ua(f12, i15);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f11196a) {
            case 0:
                return new s4[i10];
            case 1:
                return new t6[i10];
            case 2:
                return new ta[i10];
            default:
                return new ua[i10];
        }
    }
}
