package b5;

import a0.f;
import a0.l;
import a8.p0;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f2935e;
    public final int f2936f;
    public final int f2937g;
    public final String h;
    public int f2938i;
    public int f2939j;
    public int f2940k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f2935e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f2939j;
        if (i7 == this.f2936f) {
            i7 = this.f2937g;
        }
        return new c(parcel, dataPosition, i7, p0.s(new StringBuilder(), this.h, "  "), this.f2932a, this.f2933b, this.f2934c);
    }

    @Override
    public final boolean e(int i7) {
        while (this.f2939j < this.f2937g) {
            int i10 = this.f2940k;
            if (i10 != i7) {
                if (String.valueOf(i10).compareTo(String.valueOf(i7)) <= 0) {
                    int i11 = this.f2939j;
                    Parcel parcel = this.f2935e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f2940k = parcel.readInt();
                    this.f2939j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f2940k == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i7) {
        int i10 = this.f2938i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f2935e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f2938i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f2938i = -1;
        this.f2940k = -1;
        this.f2935e = parcel;
        this.f2936f = i7;
        this.f2937g = i10;
        this.f2939j = i7;
        this.h = str;
    }
}
