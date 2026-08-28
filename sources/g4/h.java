package g4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class h {
    public final long f7097a;
    public final boolean f7098b;
    public final boolean f7099c;
    public final boolean d;
    public final long f7100e;
    public final List f7101f;
    public final boolean f7102g;
    public final long h;
    public final int f7103i;
    public final int f7104j;
    public final int f7105k;

    public h(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i9, int i10, int i11) {
        this.f7097a = j10;
        this.f7098b = z10;
        this.f7099c = z11;
        this.d = z12;
        this.f7101f = DesugarCollections.unmodifiableList(arrayList);
        this.f7100e = j11;
        this.f7102g = z13;
        this.h = j12;
        this.f7103i = i9;
        this.f7104j = i10;
        this.f7105k = i11;
    }

    public h(Parcel parcel) {
        this.f7097a = parcel.readLong();
        this.f7098b = parcel.readByte() == 1;
        this.f7099c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f7101f = DesugarCollections.unmodifiableList(arrayList);
        this.f7100e = parcel.readLong();
        this.f7102g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.f7103i = parcel.readInt();
        this.f7104j = parcel.readInt();
        this.f7105k = parcel.readInt();
    }
}
