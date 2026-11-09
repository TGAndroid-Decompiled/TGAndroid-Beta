package j6;

import android.os.Parcel;
public abstract class g extends a8.q implements h {
    public g() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 1);
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        boolean z9 = false;
        switch (i7) {
            case 1:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                W(readInt);
                return true;
            case 2:
                f6.d dVar = (f6.d) com.google.android.gms.internal.cast.t.a(parcel, f6.d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                com.google.android.gms.internal.cast.t.b(parcel);
                R0(dVar, readString, readString2, z9);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                c0(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i10 = com.google.android.gms.internal.cast.t.f6989a;
                parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzn();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                Z(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.cast.t.b(parcel);
                X0(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzg(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzd(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                zzm(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.t.b(parcel);
                f0(readLong2);
                return true;
            case 12:
                com.google.android.gms.internal.cast.t.b(parcel);
                N0((c) com.google.android.gms.internal.cast.t.a(parcel, c.CREATOR));
                return true;
            case 13:
                com.google.android.gms.internal.cast.t.b(parcel);
                K0((d) com.google.android.gms.internal.cast.t.a(parcel, d.CREATOR));
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                h(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                O0(readInt8);
                return true;
            default:
                return false;
        }
    }
}
