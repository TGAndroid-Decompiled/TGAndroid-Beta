package b5;

import a0.f;
import a0.l;
import a8.p0;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f2941e;
    public final int f2942f;
    public final int f2943g;
    public final String h;
    public int f2944i;
    public int f2945j;
    public int f2946k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f2941e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f2945j;
        if (i7 == this.f2942f) {
            i7 = this.f2943g;
        }
        return new c(parcel, dataPosition, i7, p0.s(new StringBuilder(), this.h, "  "), this.f2938a, this.f2939b, this.f2940c);
    }

    @Override
    public final boolean e(int i7) {
        while (this.f2945j < this.f2943g) {
            int i10 = this.f2946k;
            if (i10 != i7) {
                if (String.valueOf(i10).compareTo(String.valueOf(i7)) <= 0) {
                    int i11 = this.f2945j;
                    Parcel parcel = this.f2941e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f2946k = parcel.readInt();
                    this.f2945j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f2946k == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i7) {
        int i10 = this.f2944i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f2941e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f2944i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f2944i = -1;
        this.f2946k = -1;
        this.f2941e = parcel;
        this.f2942f = i7;
        this.f2943g = i10;
        this.f2945j = i7;
        this.h = str;
    }
}
