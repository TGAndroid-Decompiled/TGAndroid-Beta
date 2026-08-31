package l4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final long f11697a;
    public final boolean f11698b;
    public final boolean f11699c;
    public final boolean d;
    public final long f11700e;
    public final List f11701f;
    public final boolean f11702g;
    public final long h;
    public final int f11703i;
    public final int f11704j;
    public final int f11705k;

    public h(long j10, boolean z4, boolean z10, boolean z11, ArrayList arrayList, long j11, boolean z12, long j12, int i10, int i11, int i12) {
        this.f11697a = j10;
        this.f11698b = z4;
        this.f11699c = z10;
        this.d = z11;
        this.f11701f = DesugarCollections.unmodifiableList(arrayList);
        this.f11700e = j11;
        this.f11702g = z12;
        this.h = j12;
        this.f11703i = i10;
        this.f11704j = i11;
        this.f11705k = i12;
    }

    public h(Parcel parcel) {
        this.f11697a = parcel.readLong();
        this.f11698b = parcel.readByte() == 1;
        this.f11699c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f11701f = DesugarCollections.unmodifiableList(arrayList);
        this.f11700e = parcel.readLong();
        this.f11702g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.f11703i = parcel.readInt();
        this.f11704j = parcel.readInt();
        this.f11705k = parcel.readInt();
    }
}
