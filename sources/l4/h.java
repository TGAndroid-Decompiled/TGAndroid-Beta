package l4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final long f11323a;
    public final boolean f11324b;
    public final boolean f11325c;
    public final boolean d;
    public final long e;
    public final List f11326f;
    public final boolean f11327g;
    public final long h;
    public final int f11328i;
    public final int f11329j;
    public final int f11330k;

    public h(long j10, boolean z4, boolean z10, boolean z11, ArrayList arrayList, long j11, boolean z12, long j12, int i10, int i11, int i12) {
        this.f11323a = j10;
        this.f11324b = z4;
        this.f11325c = z10;
        this.d = z11;
        this.f11326f = DesugarCollections.unmodifiableList(arrayList);
        this.e = j11;
        this.f11327g = z12;
        this.h = j12;
        this.f11328i = i10;
        this.f11329j = i11;
        this.f11330k = i12;
    }

    public h(Parcel parcel) {
        this.f11323a = parcel.readLong();
        this.f11324b = parcel.readByte() == 1;
        this.f11325c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f11326f = DesugarCollections.unmodifiableList(arrayList);
        this.e = parcel.readLong();
        this.f11327g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.f11328i = parcel.readInt();
        this.f11329j = parcel.readInt();
        this.f11330k = parcel.readInt();
    }
}
