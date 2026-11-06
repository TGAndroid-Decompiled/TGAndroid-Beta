package b7;

import android.os.Parcel;
public final class m extends a8.a {
    public final a7.a X0(a7.b bVar, String str, int i7) {
        Parcel P0 = P0();
        p7.g.b(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i7);
        Parcel N0 = N0(P0, 2);
        a7.a M0 = a7.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }

    public final a7.a Y0(a7.b bVar, String str, int i7) {
        Parcel P0 = P0();
        p7.g.b(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i7);
        Parcel N0 = N0(P0, 4);
        a7.a M0 = a7.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }

    public final a7.a Z0(a7.b bVar, String str, boolean z9, long j3) {
        Parcel P0 = P0();
        p7.g.b(P0, bVar);
        P0.writeString(str);
        P0.writeInt(z9 ? 1 : 0);
        P0.writeLong(j3);
        Parcel N0 = N0(P0, 7);
        a7.a M0 = a7.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }

    public final a7.a a1(a7.b bVar, String str, int i7, a7.b bVar2) {
        Parcel P0 = P0();
        p7.g.b(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i7);
        p7.g.b(P0, bVar2);
        Parcel N0 = N0(P0, 8);
        a7.a M0 = a7.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }
}
