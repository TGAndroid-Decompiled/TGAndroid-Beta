package i4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class i {
    public final long f8237a;
    public final boolean f8238b;
    public final boolean f8239c;
    public final boolean d;
    public final long f8240e;
    public final List f8241f;
    public final boolean f8242g;
    public final long h;
    public final int f8243i;
    public final int f8244j;
    public final int f8245k;

    public i(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f8237a = j10;
        this.f8238b = z10;
        this.f8239c = z11;
        this.d = z12;
        this.f8241f = DesugarCollections.unmodifiableList(arrayList);
        this.f8240e = j11;
        this.f8242g = z13;
        this.h = j12;
        this.f8243i = i10;
        this.f8244j = i11;
        this.f8245k = i12;
    }

    public i(Parcel parcel) {
        this.f8237a = parcel.readLong();
        this.f8238b = parcel.readByte() == 1;
        this.f8239c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel.readInt(), parcel.readLong()));
        }
        this.f8241f = DesugarCollections.unmodifiableList(arrayList);
        this.f8240e = parcel.readLong();
        this.f8242g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.f8243i = parcel.readInt();
        this.f8244j = parcel.readInt();
        this.f8245k = parcel.readInt();
    }
}
