package g4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class h {

    public final long f6375a;

    public final boolean f6376b;

    public final boolean f6377c;
    public final boolean d;

    public final long f6378e;

    public final List f6379f;

    public final boolean f6380g;
    public final long h;

    public final int f6381i;

    public final int f6382j;

    public final int f6383k;

    public h(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f6375a = j10;
        this.f6376b = z10;
        this.f6377c = z11;
        this.d = z12;
        this.f6379f = DesugarCollections.unmodifiableList(arrayList);
        this.f6378e = j11;
        this.f6380g = z13;
        this.h = j12;
        this.f6381i = i10;
        this.f6382j = i11;
        this.f6383k = i12;
    }

    public h(Parcel parcel) {
        this.f6375a = parcel.readLong();
        this.f6376b = parcel.readByte() == 1;
        this.f6377c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f6379f = DesugarCollections.unmodifiableList(arrayList);
        this.f6378e = parcel.readLong();
        this.f6380g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.f6381i = parcel.readInt();
        this.f6382j = parcel.readInt();
        this.f6383k = parcel.readInt();
    }
}
