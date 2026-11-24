package defpackage;

import android.os.Bundle;
import android.os.Parcel;
public abstract class n8d extends e1d {
    public final byte b;

    public n8d(byte b) {
        super("com.google.android.gms.cast.internal.IBundleCallback", (byte) 4);
        this.b = b;
        switch (b) {
            case 1:
                super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", (byte) 4);
                return;
            default:
                return;
        }
    }

    public abstract void T(ws wsVar, String str, String str2, boolean z);

    public abstract void U(Bundle bundle);

    public abstract void V(int i);

    public abstract void W(int i);

    public abstract void X(int i);

    public abstract void Y(c7d c7dVar);

    public abstract void Z(int i);

    public void a0(String str, byte[] bArr) {
        bhd.H.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    public abstract void c0(o7d o7dVar);

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (this.b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                kid.b(parcel);
                U((Bundle) kid.a(parcel, Bundle.CREATOR));
                return true;
            default:
                switch (i) {
                    case 1:
                        int readInt = parcel.readInt();
                        kid.b(parcel);
                        d0(readInt);
                        break;
                    case 2:
                        ws wsVar = (ws) kid.a(parcel, ws.CREATOR);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        kid.b(parcel);
                        T(wsVar, readString, readString2, z);
                        break;
                    case 3:
                        int readInt2 = parcel.readInt();
                        kid.b(parcel);
                        V(readInt2);
                        break;
                    case 4:
                        parcel.readString();
                        parcel.readDouble();
                        int i2 = kid.a;
                        parcel.readInt();
                        kid.b(parcel);
                        g0();
                        break;
                    case 5:
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        kid.b(parcel);
                        i0(readString3, readString4);
                        break;
                    case 6:
                        String readString5 = parcel.readString();
                        byte[] createByteArray = parcel.createByteArray();
                        kid.b(parcel);
                        a0(readString5, createByteArray);
                        break;
                    case 7:
                        int readInt3 = parcel.readInt();
                        kid.b(parcel);
                        X(readInt3);
                        break;
                    case 8:
                        int readInt4 = parcel.readInt();
                        kid.b(parcel);
                        Z(readInt4);
                        break;
                    case 9:
                        int readInt5 = parcel.readInt();
                        kid.b(parcel);
                        W(readInt5);
                        break;
                    case 10:
                        parcel.readString();
                        long readLong = parcel.readLong();
                        int readInt6 = parcel.readInt();
                        kid.b(parcel);
                        f0(readInt6, readLong);
                        break;
                    case 11:
                        parcel.readString();
                        long readLong2 = parcel.readLong();
                        kid.b(parcel);
                        e0(readLong2);
                        break;
                    case 12:
                        kid.b(parcel);
                        Y((c7d) kid.a(parcel, c7d.CREATOR));
                        break;
                    case 13:
                        kid.b(parcel);
                        c0((o7d) kid.a(parcel, o7d.CREATOR));
                        break;
                    case 14:
                        int readInt7 = parcel.readInt();
                        kid.b(parcel);
                        b0(readInt7);
                        break;
                    case 15:
                        int readInt8 = parcel.readInt();
                        kid.b(parcel);
                        h0(readInt8);
                        break;
                    default:
                        return false;
                }
                return true;
        }
    }

    public abstract void d0(int i);

    public abstract void e0(long j);

    public abstract void f0(int i, long j);

    public void g0() {
        bhd.H.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    public abstract void i0(String str, String str2);

    public void b0(int i) {
    }

    public void h0(int i) {
    }
}
