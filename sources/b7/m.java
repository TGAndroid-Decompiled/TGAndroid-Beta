package b7;

import android.os.Parcel;
public final class m extends a8.a {
    public final a7.a A1(a7.b bVar, String str, int i7, a7.b bVar2) {
        Parcel p12 = p1();
        p7.g.b(p12, bVar);
        p12.writeString(str);
        p12.writeInt(i7);
        p7.g.b(p12, bVar2);
        Parcel n1 = n1(p12, 8);
        a7.a m12 = a7.b.m1(n1.readStrongBinder());
        n1.recycle();
        return m12;
    }

    public final a7.a x1(a7.b bVar, String str, int i7) {
        Parcel p12 = p1();
        p7.g.b(p12, bVar);
        p12.writeString(str);
        p12.writeInt(i7);
        Parcel n1 = n1(p12, 2);
        a7.a m12 = a7.b.m1(n1.readStrongBinder());
        n1.recycle();
        return m12;
    }

    public final a7.a y1(a7.b bVar, String str, int i7) {
        Parcel p12 = p1();
        p7.g.b(p12, bVar);
        p12.writeString(str);
        p12.writeInt(i7);
        Parcel n1 = n1(p12, 4);
        a7.a m12 = a7.b.m1(n1.readStrongBinder());
        n1.recycle();
        return m12;
    }

    public final a7.a z1(a7.b bVar, String str, boolean z9, long j3) {
        Parcel p12 = p1();
        p7.g.b(p12, bVar);
        p12.writeString(str);
        p12.writeInt(z9 ? 1 : 0);
        p12.writeLong(j3);
        Parcel n1 = n1(p12, 7);
        a7.a m12 = a7.b.m1(n1.readStrongBinder());
        n1.recycle();
        return m12;
    }
}
