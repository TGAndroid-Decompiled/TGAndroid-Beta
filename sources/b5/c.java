package b5;

import a0.f;
import a0.l;
import a8.p0;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f2906e;
    public final int f2907f;
    public final int f2908g;
    public final String h;
    public int f2909i;
    public int f2910j;
    public int f2911k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f2906e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f2910j;
        if (i7 == this.f2907f) {
            i7 = this.f2908g;
        }
        return new c(parcel, dataPosition, i7, p0.s(new StringBuilder(), this.h, "  "), this.f2903a, this.f2904b, this.f2905c);
    }

    @Override
    public final boolean e(int i7) {
        while (this.f2910j < this.f2908g) {
            int i10 = this.f2911k;
            if (i10 != i7) {
                if (String.valueOf(i10).compareTo(String.valueOf(i7)) <= 0) {
                    int i11 = this.f2910j;
                    Parcel parcel = this.f2906e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f2911k = parcel.readInt();
                    this.f2910j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f2911k == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i7) {
        int i10 = this.f2909i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f2906e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f2909i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f2909i = -1;
        this.f2911k = -1;
        this.f2906e = parcel;
        this.f2907f = i7;
        this.f2908g = i10;
        this.f2910j = i7;
        this.h = str;
    }
}
