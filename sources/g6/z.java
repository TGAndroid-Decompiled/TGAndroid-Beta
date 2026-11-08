package g6;

import android.os.Parcel;
public final class z extends a8.q {
    public final h f13571b;
    public final Class f13572c;

    public z(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 1);
        this.f13571b = hVar;
        this.f13572c = c.class;
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        boolean z9 = false;
        Class cls = this.f13572c;
        h hVar = this.f13571b;
        switch (i7) {
            case 1:
                a7.b bVar = new a7.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                return true;
            case 2:
                a7.a m12 = a7.b.m1(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar = (f) a7.b.n1(m12);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.s((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                a7.a m13 = a7.b.m1(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar2 = (f) a7.b.n1(m13);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.i((f) cls.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                a7.a m14 = a7.b.m1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar3 = (f) a7.b.n1(m14);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.e((f) cls.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                a7.a m15 = a7.b.m1(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar4 = (f) a7.b.n1(m15);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.t((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                a7.a m16 = a7.b.m1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar5 = (f) a7.b.n1(m16);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.j((f) cls.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                a7.a m17 = a7.b.m1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar6 = (f) a7.b.n1(m17);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.p((f) cls.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                a7.a m18 = a7.b.m1(parcel.readStrongBinder());
                int i10 = com.google.android.gms.internal.cast.t.f6991a;
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar7 = (f) a7.b.n1(m18);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.b((f) cls.cast(fVar7), z9);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                a7.a m19 = a7.b.m1(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar8 = (f) a7.b.n1(m19);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.f((f) cls.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                a7.a m110 = a7.b.m1(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                f fVar9 = (f) a7.b.n1(m110);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.c((f) cls.cast(fVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
