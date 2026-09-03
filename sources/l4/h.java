package l4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final long f11433a;
    public final boolean f11434b;
    public final boolean f11435c;
    public final boolean d;
    public final long e;
    public final List f11436f;
    public final boolean f11437g;
    public final long h;
    public final int f11438i;
    public final int f11439j;
    public final int f11440k;

    public h(long j10, boolean z4, boolean z10, boolean z11, ArrayList arrayList, long j11, boolean z12, long j12, int i10, int i11, int i12) {
        this.f11433a = j10;
        this.f11434b = z4;
        this.f11435c = z10;
        this.d = z11;
        this.f11436f = DesugarCollections.unmodifiableList(arrayList);
        this.e = j11;
        this.f11437g = z12;
        this.h = j12;
        this.f11438i = i10;
        this.f11439j = i11;
        this.f11440k = i12;
    }

    public h(Parcel parcel) {
        this.f11433a = parcel.readLong();
        this.f11434b = parcel.readByte() == 1;
        this.f11435c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f11436f = DesugarCollections.unmodifiableList(arrayList);
        this.e = parcel.readLong();
        this.f11437g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.f11438i = parcel.readInt();
        this.f11439j = parcel.readInt();
        this.f11440k = parcel.readInt();
    }
}
