package g6;

import android.os.Parcel;
public abstract class g extends b8.b implements h {
    public g() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 1);
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10 = false;
        switch (i10) {
            case 1:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                Q(readInt);
                return true;
            case 2:
                c6.d dVar = (c6.d) com.google.android.gms.internal.cast.u.a(parcel, c6.d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                com.google.android.gms.internal.cast.u.b(parcel);
                n(dVar, readString, readString2, z10);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                Y(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i11 = com.google.android.gms.internal.cast.u.f4789a;
                parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzn();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                U(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.cast.u.b(parcel);
                C0(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                d(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzg(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzd(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzm(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.u.b(parcel);
                Z(readLong2);
                return true;
            case 12:
                com.google.android.gms.internal.cast.u.b(parcel);
                A0((c) com.google.android.gms.internal.cast.u.a(parcel, c.CREATOR));
                return true;
            case 13:
                com.google.android.gms.internal.cast.u.b(parcel);
                v0((d) com.google.android.gms.internal.cast.u.a(parcel, d.CREATOR));
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                g(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                x0(readInt8);
                return true;
            default:
                return false;
        }
    }
}
