package a7;

import android.os.Parcel;
public final class n extends b8.a {
    public final z6.a X0(z6.b bVar, String str, int i3, z6.b bVar2) {
        Parcel P0 = P0();
        o7.g.b(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i3);
        o7.g.b(P0, bVar2);
        Parcel N0 = N0(P0, 2);
        z6.a M0 = z6.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }

    public final z6.a Y0(z6.b bVar, String str, int i3, z6.b bVar2) {
        Parcel P0 = P0();
        o7.g.b(P0, bVar);
        P0.writeString(str);
        P0.writeInt(i3);
        o7.g.b(P0, bVar2);
        Parcel N0 = N0(P0, 3);
        z6.a M0 = z6.b.M0(N0.readStrongBinder());
        N0.recycle();
        return M0;
    }
}
